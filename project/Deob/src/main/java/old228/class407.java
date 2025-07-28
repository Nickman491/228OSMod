package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pg")
public class class407
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4684 = new class407("runelite", 0, "", 0, new class403[]{class403.field4660, class403.field4658});
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4680 = new class407("runelite", 1, "", 1, new class403[]{class403.field4659, class403.field4660, class403.field4658});
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4685 = new class407("runelite", 2, "", 2, new class403[]{class403.field4659, class403.field4661, class403.field4660});
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4681 = new class407("runelite", 3, "", 3, new class403[]{class403.field4659});
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4678 = new class407("runelite", 4, "", 4);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4683 = new class407("runelite", 5, "", 5, new class403[]{class403.field4659, class403.field4660});
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4688 = new class407("runelite", 6, "", 6, new class403[]{class403.field4660});
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4682 = new class407("runelite", 7, "", 8, new class403[]{class403.field4659, class403.field4660});
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4686 = new class407("runelite", 8, "", 9, new class403[]{class403.field4659, class403.field4661});
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4687 = new class407("runelite", 9, "", 10, new class403[]{class403.field4659});
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4679 = new class407("runelite", 10, "", 11, new class403[]{class403.field4659});
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4689 = new class407("runelite", 11, "", 12, new class403[]{class403.field4659, class403.field4660});
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ class407 field4690 = new class407("runelite", 12, "", 13, new class403[]{class403.field4659});
    @ObfuscatedName(value="mu")
    @ObfuscatedSignature(descriptor="Ldx;")
    static class94 field4693;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-398111645)
    final int field4691;
    @ObfuscatedName(value="aa")
    final Set field4692 = new HashSet();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I[Lpo;)V")
    class407(class403[] class403Array) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.field4691 = var4_2;
        void var6_4 = var5_3;
        int n = 0;
        while (n < ((void)var6_4).length) {
            void var8_6 = var6_4[n];
            this.field4692.add(var8_6);
            ++n;
        }
        return;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    class407() {
        void var4_-1;
        void var1_-1;
        this.field4691 = var4_-1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field4691;
    }
}

