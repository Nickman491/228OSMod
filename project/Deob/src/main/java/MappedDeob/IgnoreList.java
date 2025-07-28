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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName(value="ru")
@Implements(value="IgnoreList")
public class IgnoreList
extends UserList {
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Luo;")
    final LoginType field4975;

    @ObfuscatedSignature(descriptor="(Luo;)V")
    public IgnoreList(LoginType loginType) {
        super(400);
        this.field4975 = loginType;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lso;", garbageValue="35")
    @Export(value="newInstance")
    User newInstance() {
        return new Ignored();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)[Lso;", garbageValue="-1808909632")
    @Export(value="newTypedArray")
    User[] newTypedArray(int n) {
        return new Ignored[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="815722454")
    @Export(value="read")
    public void read(Buffer buffer, int n) {
        while (buffer.offset < n) {
            int n2 = buffer.readUnsignedByte();
            if (n2 != 4) {
                Ignored ignored;
                boolean bl = (n2 & 1) != 0;
                Username username = new Username(buffer.readStringCp1252NullTerminated(), this.field4975);
                Username username2 = new Username(buffer.readStringCp1252NullTerminated(), this.field4975);
                buffer.readStringCp1252NullTerminated();
                if (!username.hasCleanName()) {
                    throw new IllegalStateException();
                }
                Ignored ignored2 = (Ignored)this.getByCurrentUsername(username);
                if (bl && (ignored = (Ignored)this.getByCurrentUsername(username2)) != null && ignored2 != ignored) {
                    if (ignored2 == null) {
                        ignored2 = ignored;
                    } else {
                        this.remove(ignored);
                    }
                }
                if (ignored2 == null) {
                    if (this.getSize() >= 400) continue;
                    int n3 = this.getSize();
                    ignored2 = (Ignored)this.addLast(username, username2);
                    ignored2.id = n3;
                    continue;
                }
                this.changeName(ignored2, username, username2);
                continue;
            }
            Username username = new Username(buffer.readStringCp1252NullTerminated(), this.field4975);
            if (!username.hasCleanName()) {
                throw new IllegalStateException();
            }
            boolean bl = false;
            class10.friendSystem.method2031(username.getName(), bl);
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1528495712")
    @Export(value="readReflectionCheck")
    public static void readReflectionCheck(Buffer buffer, int n) {
        ReflectionCheck reflectionCheck = new ReflectionCheck();
        reflectionCheck.size = buffer.readUnsignedByte();
        reflectionCheck.id = buffer.readInt();
        reflectionCheck.operations = new int[reflectionCheck.size];
        reflectionCheck.creationErrors = new int[reflectionCheck.size];
        reflectionCheck.fields = new Field[reflectionCheck.size];
        reflectionCheck.intReplaceValues = new int[reflectionCheck.size];
        reflectionCheck.methods = new Method[reflectionCheck.size];
        reflectionCheck.arguments = new byte[reflectionCheck.size][][];
        for (int i = 0; i < reflectionCheck.size; ++i) {
            try {
                Method[] methodArray;
                int n2;
                int n3;
                String string;
                String string2;
                int n4 = buffer.readUnsignedByte();
                if (n4 == 0 || n4 == 1 || n4 == 2) {
                    string2 = buffer.readStringCp1252NullTerminated();
                    string = buffer.readStringCp1252NullTerminated();
                    n3 = 0;
                    if (n4 == 1) {
                        n3 = buffer.readInt();
                    }
                    reflectionCheck.operations[i] = n4;
                    reflectionCheck.intReplaceValues[i] = n3;
                    if (class504.loadClassFromDescriptor(string2).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    reflectionCheck.fields[i] = Reflection.findField((Class)class504.loadClassFromDescriptor(string2), (String)string);
                    continue;
                }
                if (n4 != 3 && n4 != 4) continue;
                string2 = buffer.readStringCp1252NullTerminated();
                string = buffer.readStringCp1252NullTerminated();
                n3 = buffer.readUnsignedByte();
                String[] stringArray = new String[n3];
                for (int j = 0; j < n3; ++j) {
                    stringArray[j] = buffer.readStringCp1252NullTerminated();
                }
                String string3 = buffer.readStringCp1252NullTerminated();
                byte[][] byArrayArray = new byte[n3][];
                if (n4 == 3) {
                    for (int j = 0; j < n3; ++j) {
                        n2 = buffer.readInt();
                        byArrayArray[j] = new byte[n2];
                        buffer.readBytes(byArrayArray[j], 0, n2);
                    }
                }
                reflectionCheck.operations[i] = n4;
                Class[] classArray = new Class[n3];
                for (n2 = 0; n2 < n3; ++n2) {
                    classArray[n2] = class504.loadClassFromDescriptor(stringArray[n2]);
                }
                Class clazz = class504.loadClassFromDescriptor(string3);
                if (class504.loadClassFromDescriptor(string2).getClassLoader() == null) {
                    throw new SecurityException();
                }
                Method[] methodArray2 = methodArray = class504.loadClassFromDescriptor(string2).getDeclaredMethods();
                for (int j = 0; j < methodArray2.length; ++j) {
                    Class[] classArray2;
                    Method method = methodArray2[j];
                    if (!Reflection.getMethodName((Method)method).equals(string) || classArray.length != (classArray2 = Reflection.getParameterTypes((Method)method)).length) continue;
                    boolean bl = true;
                    for (int k = 0; k < classArray.length; ++k) {
                        if (classArray[k] == classArray2[k]) continue;
                        bl = false;
                        break;
                    }
                    if (!bl || clazz != method.getReturnType()) continue;
                    reflectionCheck.methods[i] = method;
                }
                reflectionCheck.arguments[i] = byArrayArray;
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                reflectionCheck.creationErrors[i] = -1;
                continue;
            }
            catch (SecurityException securityException) {
                reflectionCheck.creationErrors[i] = -2;
                continue;
            }
            catch (NullPointerException nullPointerException) {
                reflectionCheck.creationErrors[i] = -3;
                continue;
            }
            catch (Exception exception) {
                reflectionCheck.creationErrors[i] = -4;
                continue;
            }
            catch (Throwable throwable) {
                reflectionCheck.creationErrors[i] = -5;
            }
        }
        class36.reflectionChecks.addFirst(reflectionCheck);
    }
}

