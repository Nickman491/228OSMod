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

@ObfuscatedName(value="mj")
public class class337 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=381161101)
    int field3689;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lcn;")
    class53 field3688;

    @ObfuscatedSignature(descriptor="(ILcn;)V")
    class337(int n, class53 class533) {
        this.field3689 = n;
        this.field3688 = class533;
    }

    @ObfuscatedName(value="nz")
    @ObfuscatedSignature(descriptor="(Lna;IIII)V", garbageValue="1197017701")
    static final void method6885(class361 class3612, int n, int n2, int n3) {
        class348 class3482 = class3612.method7446(class170.field1807, false);
        if (class3482 == null) {
            return;
        }
        if (client.field746 < 3) {
            class348.field3758.method10760(n, n2, class3482.field3754, class3482.field3753, 25, 25, client.field503, 256, class3482.field3755, class3482.field3752);
        } else {
            class566.method10625(n, n2, 0, class3482.field3755, class3482.field3752);
        }
    }
}

