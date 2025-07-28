package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName(value="se")
public class class487
extends class486 {
    @ObfuscatedName(value="bp")
    protected static String field5063;
    @ObfuscatedName(value="ay")
    Socket field5059;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lsd;")
    class488 field5060;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lsv;")
    class489 field5061;

    class487(Socket socket, int n, int n2) throws IOException {
        this.field5059 = socket;
        this.field5059.setSoTimeout(30000);
        this.field5059.setTcpNoDelay(true);
        this.field5059.setReceiveBufferSize(65536);
        this.field5059.setSendBufferSize(65536);
        this.field5060 = new class488(this.field5059.getInputStream(), n);
        this.field5061 = new class489(this.field5059.getOutputStream(), n2);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1264971006")
    public boolean vmethod9407(int n) throws IOException {
        return this.field5060.method9437(n);
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2125512046")
    public int vmethod9408() throws IOException {
        return this.field5060.method9438();
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1363854656")
    public int vmethod9406() throws IOException {
        return this.field5060.method9439();
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([BIIB)I", garbageValue="72")
    public int vmethod9410(byte[] byArray, int n, int n2) throws IOException {
        return this.field5060.method9440(byArray, n, n2);
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="([BIIB)V", garbageValue="-105")
    public void vmethod9411(byte[] byArray, int n, int n2) throws IOException {
        this.field5061.method9461(byArray, n, n2);
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1821776179")
    public void vmethod9416() {
        this.field5061.method9462();
        try {
            this.field5059.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.field5060.method9441();
    }

    protected void finalize() {
        this.vmethod9416();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvv;B)V", garbageValue="8")
    public static void method9412(class555 class5552) {
        class37 class372 = (class37)class36.field219.method8046();
        if (class372 == null) {
            return;
        }
        int n = class5552.field5471;
        class5552.method10268(class372.field220);
        for (int i = 0; i < class372.field221; ++i) {
            if (class372.field230[i] != 0) {
                class5552.method10300(class372.field230[i]);
                continue;
            }
            try {
                int n2;
                AccessibleObject accessibleObject;
                int n3 = class372.field222[i];
                if (n3 == 0) {
                    accessibleObject = class372.field224[i];
                    n2 = Reflection.getInt((Field)accessibleObject, null);
                    class5552.method10300(0);
                    class5552.method10268(n2);
                } else if (n3 == 1) {
                    accessibleObject = class372.field224[i];
                    Reflection.setInt((Field)accessibleObject, null, (int)class372.field229[i]);
                    class5552.method10300(0);
                } else if (n3 == 2) {
                    accessibleObject = class372.field224[i];
                    n2 = ((Field)accessibleObject).getModifiers();
                    class5552.method10300(0);
                    class5552.method10268(n2);
                }
                if (n3 == 3) {
                    accessibleObject = class372.field226[i];
                    byte[][] byArray = class372.field223[i];
                    Object[] objectArray = new Object[byArray.length];
                    for (int j = 0; j < byArray.length; ++j) {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byArray[j]));
                        objectArray[j] = objectInputStream.readObject();
                    }
                    Object object = Reflection.invoke((Method)accessibleObject, null, (Object[])objectArray);
                    if (object == null) {
                        class5552.method10300(0);
                        continue;
                    }
                    if (object instanceof Number) {
                        class5552.method10300(1);
                        class5552.method10466(((Number)object).longValue());
                        continue;
                    }
                    if (object instanceof String) {
                        class5552.method10300(2);
                        class5552.method10442((String)object);
                        continue;
                    }
                    class5552.method10300(4);
                    continue;
                }
                if (n3 != 4) continue;
                accessibleObject = class372.field226[i];
                n2 = ((Method)accessibleObject).getModifiers();
                class5552.method10300(0);
                class5552.method10268(n2);
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                class5552.method10300(-10);
                continue;
            }
            catch (InvalidClassException invalidClassException) {
                class5552.method10300(-11);
                continue;
            }
            catch (StreamCorruptedException streamCorruptedException) {
                class5552.method10300(-12);
                continue;
            }
            catch (OptionalDataException optionalDataException) {
                class5552.method10300(-13);
                continue;
            }
            catch (IllegalAccessException illegalAccessException) {
                class5552.method10300(-14);
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                class5552.method10300(-15);
                continue;
            }
            catch (InvocationTargetException invocationTargetException) {
                class5552.method10300(-16);
                continue;
            }
            catch (SecurityException securityException) {
                class5552.method10300(-17);
                continue;
            }
            catch (IOException iOException) {
                class5552.method10300(-18);
                continue;
            }
            catch (NullPointerException nullPointerException) {
                class5552.method10300(-19);
                continue;
            }
            catch (Exception exception) {
                class5552.method10300(-20);
                continue;
            }
            catch (Throwable throwable) {
                class5552.method10300(-21);
            }
        }
        class5552.method10474(n);
        class372.method9623();
    }
}

