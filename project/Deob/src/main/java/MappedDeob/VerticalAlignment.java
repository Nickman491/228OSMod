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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jk")
@Implements(value="VerticalAlignment")
public class VerticalAlignment
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ljk;")
    static final /* enum */ VerticalAlignment field2673 = new VerticalAlignment("runelite", 0, 2, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ljk;")
    @Export(value="VerticalAlignment_centered")
    static final /* enum */ VerticalAlignment VerticalAlignment_centered = new VerticalAlignment("runelite", 1, 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ljk;")
    static final /* enum */ VerticalAlignment field2670 = new VerticalAlignment("runelite", 2, 0, 2);
    @ObfuscatedName(value="io")
    @ObfuscatedSignature(descriptor="Lus;")
    static Fonts field2674;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-761626247)
    @Export(value="value")
    public final int value;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1236815397)
    @Export(value="id")
    final int id;

    /*
     * WARNING - void declaration
     */
    VerticalAlignment() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.value = var3_1;
        this.id = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Ljd;", garbageValue="801639333")
    @Export(value="getParamDefinition")
    public static ParamComposition getParamDefinition(int n) {
        ParamComposition paramComposition = (ParamComposition)ParamComposition.ParamDefinition_cached.get(n);
        if (paramComposition != null) {
            return paramComposition;
        }
        byte[] byArray = ParamComposition.ParamDefinition_archive.takeFile(11, n);
        paramComposition = new ParamComposition();
        if (byArray != null) {
            paramComposition.decode(new Buffer(byArray));
        }
        paramComposition.postDecode();
        ParamComposition.ParamDefinition_cached.put(paramComposition, n);
        return paramComposition;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-445996510")
    static int method5355(int n, Script script, boolean bl) {
        return 2;
    }
}

