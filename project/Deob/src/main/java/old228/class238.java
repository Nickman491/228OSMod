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

@ObfuscatedName(value="jx")
public class class238
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static class391 field2562;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static class391 field2554;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-596329219)
    public static int field2550;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2548;
    @ObfuscatedName(value="ag")
    static int[] field2563;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-2047161983)
    int field2552 = -1;
    @ObfuscatedName(value="an")
    int[] field2553;
    @ObfuscatedName(value="ae")
    short[] field2559;
    @ObfuscatedName(value="ax")
    short[] field2555;
    @ObfuscatedName(value="at")
    short[] field2556;
    @ObfuscatedName(value="ac")
    short[] field2557;
    @ObfuscatedName(value="au")
    int[] field2558 = new int[]{-1, -1, -1, -1, -1};
    @ObfuscatedName(value="as")
    public boolean field2549 = false;

    static {
        field2548 = new class315(64);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1489503012")
    public void method5206(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5225(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="2046111270")
    void method5225(class556 class5562, int n) {
        block4: {
            block5: {
                block7: {
                    block8: {
                        block6: {
                            block3: {
                                if (n != 1) break block3;
                                this.field2552 = class5562.method10282();
                                break block4;
                            }
                            if (n == 2) break block5;
                            if (n != 3) break block6;
                            this.field2549 = true;
                            break block4;
                        }
                        if (n == 40) break block7;
                        if (n == 41) break block8;
                        if (n < 60 || n >= 70) break block4;
                        this.field2558[n - 60] = class5562.method10307();
                        break block4;
                    }
                    int n2 = class5562.method10282();
                    this.field2556 = new short[n2];
                    this.field2557 = new short[n2];
                    for (int i = 0; i < n2; ++i) {
                        this.field2556[i] = (short)class5562.method10307();
                        this.field2557[i] = (short)class5562.method10307();
                    }
                    break block4;
                }
                int n3 = class5562.method10282();
                this.field2559 = new short[n3];
                this.field2555 = new short[n3];
                for (int i = 0; i < n3; ++i) {
                    this.field2559[i] = (short)class5562.method10307();
                    this.field2555[i] = (short)class5562.method10307();
                }
                break block4;
            }
            int n4 = class5562.method10282();
            this.field2553 = new int[n4];
            for (int i = 0; i < n4; ++i) {
                this.field2553[i] = class5562.method10307();
            }
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="1606136182")
    public boolean method5207(int n, int n2) {
        if (n2 != 1) {
            return this.field2552 == n;
        }
        return n + 7 == this.field2552;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="182221784")
    public boolean method5208() {
        if (this.field2553 == null) {
            return true;
        }
        boolean bl = true;
        for (int i = 0; i < this.field2553.length; ++i) {
            if (field2554.method7730(this.field2553[i], 0)) continue;
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Lgx;", garbageValue="-364982580")
    public class177 method5209() {
        int n;
        if (this.field2553 == null) {
            return null;
        }
        class177[] class177Array = new class177[this.field2553.length];
        for (int i = 0; i < this.field2553.length; ++i) {
            class177Array[i] = class177.method3919(field2554, this.field2553[i], 0);
        }
        class177 class1772 = class177Array.length == 1 ? class177Array[0] : new class177(class177Array, class177Array.length);
        if (this.field2559 != null) {
            for (n = 0; n < this.field2559.length; ++n) {
                class1772.method3909(this.field2559[n], this.field2555[n]);
            }
        }
        if (this.field2556 != null) {
            for (n = 0; n < this.field2556.length; ++n) {
                class1772.method3961(this.field2556[n], this.field2557[n]);
            }
        }
        return class1772;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-115")
    public boolean method5210() {
        boolean bl = true;
        int n = 0;
        while (n < 5) {
            if (this.field2558[n] != -1 && !field2554.method7730(this.field2558[n], 0)) {
                bl = false;
            }
            ++n;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lgx;", garbageValue="-1755493310")
    public class177 method5211() {
        class177[] class177Array = new class177[5];
        int n = 0;
        int n2 = 0;
        while (true) {
            block6: {
                block7: {
                    int n3;
                    block5: {
                        if (n2 >= 5) break block5;
                        if (this.field2558[n2] == -1) break block6;
                        break block7;
                    }
                    class177 class1772 = new class177(class177Array, n);
                    if (this.field2559 != null) {
                        for (n3 = 0; n3 < this.field2559.length; ++n3) {
                            class1772.method3909(this.field2559[n3], this.field2555[n3]);
                        }
                    }
                    if (this.field2556 != null) {
                        for (n3 = 0; n3 < this.field2556.length; ++n3) {
                            class1772.method3961(this.field2556[n3], this.field2557[n3]);
                        }
                    }
                    return class1772;
                }
                class177Array[n++] = class177.method3919(field2554, this.field2558[n2], 0);
            }
            ++n2;
        }
    }
}

