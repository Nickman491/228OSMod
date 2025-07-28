/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pg")
@Implements(value="ModeWhere")
public class ModeWhere
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4684 = new ModeWhere("runelite", 0, "", 0, new class403[]{class403.field4660, class403.field4658});
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4680 = new ModeWhere("runelite", 1, "", 1, new class403[]{class403.field4659, class403.field4660, class403.field4658});
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4685 = new ModeWhere("runelite", 2, "", 2, new class403[]{class403.field4659, class403.field4661, class403.field4660});
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4681 = new ModeWhere("runelite", 3, "", 3, new class403[]{class403.field4659});
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4678 = new ModeWhere("runelite", 4, "", 4);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4683 = new ModeWhere("runelite", 5, "", 5, new class403[]{class403.field4659, class403.field4660});
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4688 = new ModeWhere("runelite", 6, "", 6, new class403[]{class403.field4660});
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4682 = new ModeWhere("runelite", 7, "", 8, new class403[]{class403.field4659, class403.field4660});
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4686 = new ModeWhere("runelite", 8, "", 9, new class403[]{class403.field4659, class403.field4661});
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4687 = new ModeWhere("runelite", 9, "", 10, new class403[]{class403.field4659});
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4679 = new ModeWhere("runelite", 10, "", 11, new class403[]{class403.field4659});
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4689 = new ModeWhere("runelite", 11, "", 12, new class403[]{class403.field4659, class403.field4660});
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lpg;")
    static final /* enum */ ModeWhere field4690 = new ModeWhere("runelite", 12, "", 13, new class403[]{class403.field4659});
    @ObfuscatedName(value="mu")
    @ObfuscatedSignature(descriptor="Ldx;")
    @Export(value="localPlayer")
    static Player localPlayer;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-398111645)
    @Export(value="id")
    final int id;
    @ObfuscatedName(value="aa")
    final Set field4692 = new HashSet();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I[Lpo;)V")
    ModeWhere(class403[] class403Array) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.id = var4_2;
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
    ModeWhere() {
        void var4_-1;
        void var1_-1;
        this.id = var4_-1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }
}

