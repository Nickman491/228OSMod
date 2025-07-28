package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  net.runelite.rs.Reflection
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName(value="ru")
public class class467
extends class476 {
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Luo;")
    final class534 field4975;

    @ObfuscatedSignature(descriptor="(Luo;)V")
    public class467(class534 class5342) {
        super(400);
        this.field4975 = class5342;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lso;", garbageValue="35")
    class474 vmethod9210() {
        return new class477();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)[Lso;", garbageValue="-1808909632")
    class474[] vmethod9200(int n) {
        return new class477[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="815722454")
    public void method9084(class556 class5562, int n) {
        while (class5562.field5471 < n) {
            int n2 = class5562.method10282();
            if (n2 != 4) {
                class477 class4772;
                boolean bl = (n2 & 1) != 0;
                class579 class5792 = new class579(class5562.method10290(), this.field4975);
                class579 class5793 = new class579(class5562.method10290(), this.field4975);
                class5562.method10290();
                if (!class5792.method10980()) {
                    throw new IllegalStateException();
                }
                class477 class4773 = (class477)this.method9196(class5792);
                if (bl && (class4772 = (class477)this.method9196(class5793)) != null && class4773 != class4772) {
                    if (class4773 == null) {
                        class4773 = class4772;
                    } else {
                        this.method9241(class4772);
                    }
                }
                if (class4773 == null) {
                    if (this.method9192() >= 400) continue;
                    int n3 = this.method9192();
                    class4773 = (class477)this.method9201(class5792, class5793);
                    class4773.field5016 = n3;
                    continue;
                }
                this.method9204(class4773, class5792, class5793);
                continue;
            }
            class579 class5794 = new class579(class5562.method10290(), this.field4975);
            if (!class5794.method10980()) {
                throw new IllegalStateException();
            }
            boolean bl = false;
            class10.field54.method2031(class5794.method10969(), bl);
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1528495712")
    public static void method9075(class556 class5562, int n) {
        class37 class372 = new class37();
        class372.field221 = class5562.method10282();
        class372.field220 = class5562.method10440();
        class372.field222 = new int[class372.field221];
        class372.field230 = new int[class372.field221];
        class372.field224 = new Field[class372.field221];
        class372.field229 = new int[class372.field221];
        class372.field226 = new Method[class372.field221];
        class372.field223 = new byte[class372.field221][][];
        for (int i = 0; i < class372.field221; ++i) {
            try {
                Method[] methodArray;
                int n2;
                int n3;
                String string;
                String string2;
                int n4 = class5562.method10282();
                if (n4 == 0 || n4 == 1 || n4 == 2) {
                    string2 = class5562.method10290();
                    string = class5562.method10290();
                    n3 = 0;
                    if (n4 == 1) {
                        n3 = class5562.method10440();
                    }
                    class372.field222[i] = n4;
                    class372.field229[i] = n3;
                    if (class504.method9568(string2).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    class372.field224[i] = Reflection.findField((Class)class504.method9568(string2), (String)string);
                    continue;
                }
                if (n4 != 3 && n4 != 4) continue;
                string2 = class5562.method10290();
                string = class5562.method10290();
                n3 = class5562.method10282();
                String[] stringArray = new String[n3];
                for (int j = 0; j < n3; ++j) {
                    stringArray[j] = class5562.method10290();
                }
                String string3 = class5562.method10290();
                byte[][] byArrayArray = new byte[n3][];
                if (n4 == 3) {
                    for (int j = 0; j < n3; ++j) {
                        n2 = class5562.method10440();
                        byArrayArray[j] = new byte[n2];
                        class5562.method10293(byArrayArray[j], 0, n2);
                    }
                }
                class372.field222[i] = n4;
                Class[] classArray = new Class[n3];
                for (n2 = 0; n2 < n3; ++n2) {
                    classArray[n2] = class504.method9568(stringArray[n2]);
                }
                Class clazz = class504.method9568(string3);
                if (class504.method9568(string2).getClassLoader() == null) {
                    throw new SecurityException();
                }
                Method[] methodArray2 = methodArray = class504.method9568(string2).getDeclaredMethods();
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
                    class372.field226[i] = method;
                }
                class372.field223[i] = byArrayArray;
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                class372.field230[i] = -1;
                continue;
            }
            catch (SecurityException securityException) {
                class372.field230[i] = -2;
                continue;
            }
            catch (NullPointerException nullPointerException) {
                class372.field230[i] = -3;
                continue;
            }
            catch (Exception exception) {
                class372.field230[i] = -4;
                continue;
            }
            catch (Throwable throwable) {
                class372.field230[i] = -5;
            }
        }
        class36.field219.method8043(class372);
    }
}

