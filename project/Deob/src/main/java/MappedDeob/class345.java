/*
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

@ObfuscatedName(value="nh")
public class class345 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public AbstractArchive field3736;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1278731953)
    public int field3735 = -1;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-967350755)
    public int field3737 = -1;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=904938547)
    public int field3738 = 0;
    @ObfuscatedName(value="ad")
    public float field3739 = 0.0f;
    @ObfuscatedName(value="an")
    public boolean field3740 = false;
    @ObfuscatedName(value="ae")
    public boolean field3741;
    @ObfuscatedName(value="ax")
    public boolean field3742;
    @ObfuscatedName(value="at")
    public boolean field3745 = false;
    @ObfuscatedName(value="ac")
    boolean field3744 = false;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lma;")
    public MidiPcmStream field3743;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lbs;")
    public SoundCache field3746;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lnx;")
    public MusicTrack field3747;

    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;Ljava/lang/String;IZ)V")
    public class345(AbstractArchive abstractArchive, String string, String string2, int n, boolean bl) {
        this.field3735 = abstractArchive.getGroupId(string);
        this.field3737 = abstractArchive.getFileId(this.field3735, string2);
        this.method6946(abstractArchive, this.field3735, this.field3737, n, bl);
    }

    @ObfuscatedSignature(descriptor="(Lpq;IIIZ)V")
    public class345(AbstractArchive abstractArchive, int n, int n2, int n3, boolean bl) {
        this.method6946(abstractArchive, n, n2, n3, bl);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;IIIZI)V", garbageValue="-205075161")
    void method6946(AbstractArchive abstractArchive, int n, int n2, int n3, boolean bl) {
        this.field3736 = abstractArchive;
        this.field3735 = n;
        this.field3737 = n2;
        this.field3738 = n3;
        this.field3740 = bl;
    }

    @ObfuscatedName(value="hz")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="114")
    static final int method6949(int n) {
        return Math.min(Math.max(n, 128), 383);
    }
}

