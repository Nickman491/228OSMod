/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  net.runelite.rs.Reflection
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName(value="se")
@Implements(value="BufferedNetSocket")
public class BufferedNetSocket
extends AbstractSocket {
    @ObfuscatedName(value="bp")
    protected static String field5063;
    @ObfuscatedName(value="ay")
    @Export(value="socket")
    Socket socket;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lsd;")
    @Export(value="source")
    BufferedSource source;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lsv;")
    @Export(value="sink")
    BufferedSink sink;

    BufferedNetSocket(Socket socket, int n, int n2) throws IOException {
        this.socket = socket;
        this.socket.setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.socket.setReceiveBufferSize(65536);
        this.socket.setSendBufferSize(65536);
        this.source = new BufferedSource(this.socket.getInputStream(), n);
        this.sink = new BufferedSink(this.socket.getOutputStream(), n2);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1264971006")
    @Export(value="isAvailable")
    public boolean isAvailable(int n) throws IOException {
        return this.source.isAvailable(n);
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2125512046")
    public int vmethod9408() throws IOException {
        return this.source.available();
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1363854656")
    public int vmethod9406() throws IOException {
        return this.source.readUnsignedByte();
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([BIIB)I", garbageValue="72")
    @Export(value="read")
    public int read(byte[] byArray, int n, int n2) throws IOException {
        return this.source.read(byArray, n, n2);
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="([BIIB)V", garbageValue="-105")
    @Export(value="write")
    public void write(byte[] byArray, int n, int n2) throws IOException {
        this.sink.write(byArray, n, n2);
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1821776179")
    @Export(value="close")
    public void close() {
        this.sink.close();
        try {
            this.socket.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.source.close();
    }

    protected void finalize() {
        this.close();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvv;B)V", garbageValue="8")
    @Export(value="performReflectionCheck")
    public static void performReflectionCheck(PacketBuffer packetBuffer) {
        ReflectionCheck reflectionCheck = (ReflectionCheck)class36.reflectionChecks.last();
        if (reflectionCheck == null) {
            return;
        }
        int n = packetBuffer.offset;
        packetBuffer.method10268(reflectionCheck.id);
        for (int i = 0; i < reflectionCheck.size; ++i) {
            if (reflectionCheck.creationErrors[i] != 0) {
                packetBuffer.writeByte(reflectionCheck.creationErrors[i]);
                continue;
            }
            try {
                int n2;
                AccessibleObject accessibleObject;
                int n3 = reflectionCheck.operations[i];
                if (n3 == 0) {
                    accessibleObject = reflectionCheck.fields[i];
                    n2 = Reflection.getInt((Field)accessibleObject, null);
                    packetBuffer.writeByte(0);
                    packetBuffer.method10268(n2);
                } else if (n3 == 1) {
                    accessibleObject = reflectionCheck.fields[i];
                    Reflection.setInt((Field)accessibleObject, null, (int)reflectionCheck.intReplaceValues[i]);
                    packetBuffer.writeByte(0);
                } else if (n3 == 2) {
                    accessibleObject = reflectionCheck.fields[i];
                    n2 = ((Field)accessibleObject).getModifiers();
                    packetBuffer.writeByte(0);
                    packetBuffer.method10268(n2);
                }
                if (n3 == 3) {
                    accessibleObject = reflectionCheck.methods[i];
                    byte[][] byArray = reflectionCheck.arguments[i];
                    Object[] objectArray = new Object[byArray.length];
                    for (int j = 0; j < byArray.length; ++j) {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byArray[j]));
                        objectArray[j] = objectInputStream.readObject();
                    }
                    Object object = Reflection.invoke((Method)accessibleObject, null, (Object[])objectArray);
                    if (object == null) {
                        packetBuffer.writeByte(0);
                        continue;
                    }
                    if (object instanceof Number) {
                        packetBuffer.writeByte(1);
                        packetBuffer.writeLong(((Number)object).longValue());
                        continue;
                    }
                    if (object instanceof String) {
                        packetBuffer.writeByte(2);
                        packetBuffer.writeStringCp1252NullTerminated((String)object);
                        continue;
                    }
                    packetBuffer.writeByte(4);
                    continue;
                }
                if (n3 != 4) continue;
                accessibleObject = reflectionCheck.methods[i];
                n2 = ((Method)accessibleObject).getModifiers();
                packetBuffer.writeByte(0);
                packetBuffer.method10268(n2);
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                packetBuffer.writeByte(-10);
                continue;
            }
            catch (InvalidClassException invalidClassException) {
                packetBuffer.writeByte(-11);
                continue;
            }
            catch (StreamCorruptedException streamCorruptedException) {
                packetBuffer.writeByte(-12);
                continue;
            }
            catch (OptionalDataException optionalDataException) {
                packetBuffer.writeByte(-13);
                continue;
            }
            catch (IllegalAccessException illegalAccessException) {
                packetBuffer.writeByte(-14);
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                packetBuffer.writeByte(-15);
                continue;
            }
            catch (InvocationTargetException invocationTargetException) {
                packetBuffer.writeByte(-16);
                continue;
            }
            catch (SecurityException securityException) {
                packetBuffer.writeByte(-17);
                continue;
            }
            catch (IOException iOException) {
                packetBuffer.writeByte(-18);
                continue;
            }
            catch (NullPointerException nullPointerException) {
                packetBuffer.writeByte(-19);
                continue;
            }
            catch (Exception exception) {
                packetBuffer.writeByte(-20);
                continue;
            }
            catch (Throwable throwable) {
                packetBuffer.writeByte(-21);
            }
        }
        packetBuffer.writeCrc(n);
        reflectionCheck.remove();
    }
}

