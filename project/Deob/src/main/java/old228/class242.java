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

@ObfuscatedName(value="jr")
public class class242
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2588;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2590;
    @ObfuscatedName(value="az")
    public char field2587;
    @ObfuscatedName(value="ao")
    public char field2589;
    @ObfuscatedName(value="ad")
    public String field2591 = "null";
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-592889597)
    public int field2586;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-176546561)
    public int field2592 = 0;
    @ObfuscatedName(value="ax")
    public int[] field2593;
    @ObfuscatedName(value="at")
    public int[] field2594;
    @ObfuscatedName(value="ac")
    public String[] field2595;

    static {
        field2590 = new class315(64);
    }

    class242() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="687907281")
    void method5275(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5271(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-94680643")
    void method5271(class556 class5562, int n) {
        block3: {
            block7: {
                block6: {
                    block5: {
                        block4: {
                            block2: {
                                if (n != 1) break block2;
                                this.field2587 = (char)class5562.method10282();
                                break block3;
                            }
                            if (n != 2) break block4;
                            this.field2589 = (char)class5562.method10282();
                            break block3;
                        }
                        if (n != 3) break block5;
                        this.field2591 = class5562.method10290();
                        break block3;
                    }
                    if (n != 4) break block6;
                    this.field2586 = class5562.method10440();
                    break block3;
                }
                if (n == 5) break block7;
                if (n != 6) break block3;
                this.field2592 = class5562.method10307();
                this.field2593 = new int[this.field2592];
                this.field2594 = new int[this.field2592];
                for (int i = 0; i < this.field2592; ++i) {
                    this.field2593[i] = class5562.method10440();
                    this.field2594[i] = class5562.method10440();
                }
                break block3;
            }
            this.field2592 = class5562.method10307();
            this.field2593 = new int[this.field2592];
            this.field2595 = new String[this.field2592];
            for (int i = 0; i < this.field2592; ++i) {
                this.field2593[i] = class5562.method10440();
                this.field2595[i] = class5562.method10290();
            }
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2052156765")
    public int method5266() {
        return this.field2592;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lud;", garbageValue="-1958777495")
    public static class544 method5280(int n) {
        int n2 = class542.field5387[n];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return null;
                }
                return class544.field5395;
            }
            return class544.field5393;
        }
        return class544.field5392;
    }

    @ObfuscatedName(value="hx")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="-1013211388")
    static long method5279() {
        return client.field630;
    }
}

