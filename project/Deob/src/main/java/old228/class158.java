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

@ObfuscatedName(value="gw")
public class class158
extends class166 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=965396529)
    int field1726 = -1;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class158(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(class556 class5562) {
        this.field1726 = class5562.method10307();
        class5562.method10282();
        if (class5562.method10282() != 255) {
            --class5562.field5471;
            class5562.method10273();
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(class170 class1702) {
        class1702.method3836(this.field1726);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Ldm;", garbageValue="642980328")
    static class81 method3668(int n, int n2) {
        class81 class812;
        block2: {
            block3: {
                block5: {
                    block6: {
                        block4: {
                            class812 = (class81)class81.field1009.method6578(n << 16);
                            if (class812 != null) break block2;
                            String string = String.valueOf(n);
                            int n3 = class167.field1793.method7743(string);
                            if (n3 == -1) break block3;
                            byte[] byArray = class167.field1793.method7735(n3);
                            if (byArray == null) break block4;
                            if (byArray.length <= 1) break block5;
                            class812 = class396.method7891(byArray);
                            if (class812 != null) break block6;
                        }
                        return null;
                    }
                    class81.field1009.method6590(class812, n << 16);
                    return class812;
                }
                return null;
            }
            return null;
        }
        return class812;
    }
}

