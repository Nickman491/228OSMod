package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oc")
public class class387
implements Runnable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpm;")
    static final class410 field4527 = new class410();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpm;")
    static class410 field4528 = new class410();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-900251729)
    static int field4526 = 0;
    @ObfuscatedName(value="ao")
    static final Object field4530 = new Object();
    @ObfuscatedName(value="ad")
    static Thread field4529;

    class387() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (true) {
            try {
                class386 class3862;
                Object object = field4527;
                synchronized (object) {
                    class3862 = (class386)field4527.method7996();
                }
                if (class3862 != null) {
                    if (class3862.field4522 == 0) {
                        class3862.field4521.method9469((int)class3862.field5174, class3862.field4523, class3862.field4523.length);
                        object = field4527;
                        synchronized (object) {
                            class3862.method9623();
                        }
                    }
                    if (class3862.field4522 == 1) {
                        class3862.field4523 = class3862.field4521.method9468((int)class3862.field5174);
                        object = field4527;
                        synchronized (object) {
                            field4528.method7998(class3862);
                        }
                    }
                    object = field4530;
                    synchronized (object) {
                        if (field4526 <= 1) {
                            field4526 = 0;
                            field4530.notifyAll();
                            return;
                        }
                        field4526 = 600;
                        continue;
                    }
                }
                class174.method3881(100L);
                object = field4530;
                synchronized (object) {
                    if (field4526 <= 1) {
                        field4526 = 0;
                        field4530.notifyAll();
                        return;
                    }
                    --field4526;
                }
            }
            catch (Exception exception) {
                class255.method5410(null, exception);
                return;
            }
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Ljava/lang/CharSequence;III)Ljava/lang/String;", garbageValue="-1902639880")
    public static String method7668(CharSequence[] charSequenceArray, int n, int n2) {
        if (n2 == 0) {
            return "";
        }
        if (n2 != 1) {
            int n3 = n2 + n;
            int n4 = 0;
            int n5 = n;
            while (true) {
                if (n5 >= n3) {
                    StringBuilder stringBuilder = new StringBuilder(n4);
                    int n6 = n;
                    while (true) {
                        if (n6 >= n3) {
                            return stringBuilder.toString();
                        }
                        CharSequence charSequence = charSequenceArray[n6];
                        if (charSequence == null) {
                            stringBuilder.append("null");
                        } else {
                            stringBuilder.append(charSequence);
                        }
                        ++n6;
                    }
                }
                CharSequence charSequence = charSequenceArray[n5];
                n4 = charSequence == null ? (n4 += 4) : (n4 += charSequence.length());
                ++n5;
            }
        }
        CharSequence charSequence = charSequenceArray[n];
        if (charSequence == null) {
            return "null";
        }
        return charSequence.toString();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lvh;", garbageValue="-1558697005")
    public static class547 method7671(int n) {
        class547 class5472 = (class547)class547.field5409.method6578(n);
        if (class5472 != null) {
            return class5472;
        }
        byte[] byArray = class547.field5408.method7790(39, n);
        class5472 = new class547();
        if (byArray != null) {
            class5472.method10151(new class556(byArray));
        }
        class5472.method10159();
        class547.field5409.method6590(class5472, n);
        return class5472;
    }
}

