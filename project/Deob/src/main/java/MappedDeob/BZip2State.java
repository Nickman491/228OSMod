/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="va")
@Implements(value="BZip2State")
public final class BZip2State {
    @ObfuscatedName(value="ab")
    @Export(value="BZip2Decompressor_block")
    static int[] BZip2Decompressor_block;
    @ObfuscatedName(value="ay")
    final int field5514 = 4096;
    @ObfuscatedName(value="ah")
    final int field5481 = 16;
    @ObfuscatedName(value="az")
    final int field5479 = 258;
    @ObfuscatedName(value="ao")
    final int field5478 = 6;
    @ObfuscatedName(value="ad")
    final int field5490 = 50;
    @ObfuscatedName(value="an")
    final int field5495 = 18002;
    @ObfuscatedName(value="ae")
    @Export(value="inputArray")
    byte[] inputArray;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-668067143)
    @Export(value="nextByte")
    int nextByte = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1025267483)
    @Export(value="nextBit_unused")
    int nextBit_unused;
    @ObfuscatedName(value="ac")
    @Export(value="outputArray")
    byte[] outputArray;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1074383035)
    @Export(value="next_out")
    int next_out = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1139853263)
    @Export(value="outputLength")
    int outputLength;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-693670423)
    int field5489;
    @ObfuscatedName(value="af")
    @Export(value="out_char")
    byte out_char;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1474045503)
    @Export(value="su_rNToGo")
    int su_rNToGo;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1176679573)
    @Export(value="bsBuff")
    int bsBuff;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-1903625127)
    @Export(value="bsLive")
    int bsLive;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-945492992)
    @Export(value="blockSize100k")
    int blockSize100k;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=676582951)
    @Export(value="originalPointer")
    int originalPointer;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-1870435271)
    int field5496;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1295603033)
    @Export(value="su_ch2")
    int su_ch2;
    @ObfuscatedName(value="ar")
    @Export(value="unzftab")
    int[] unzftab = new int[256];
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=490755121)
    @Export(value="nblocks_used")
    int nblocks_used;
    @ObfuscatedName(value="ap")
    @Export(value="cftab")
    int[] cftab = new int[257];
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-294999815)
    @Export(value="nInUse")
    int nInUse;
    @ObfuscatedName(value="bu")
    @Export(value="inUse")
    boolean[] inUse = new boolean[256];
    @ObfuscatedName(value="bh")
    @Export(value="inUse16")
    boolean[] inUse16 = new boolean[16];
    @ObfuscatedName(value="bw")
    @Export(value="seqToUnseq")
    byte[] seqToUnseq = new byte[256];
    @ObfuscatedName(value="bb")
    @Export(value="ll8")
    byte[] ll8 = new byte[4096];
    @ObfuscatedName(value="bx")
    @Export(value="getAndMoveToFrontDecode_yy")
    int[] getAndMoveToFrontDecode_yy = new int[16];
    @ObfuscatedName(value="bd")
    @Export(value="selector")
    byte[] selector = new byte[18002];
    @ObfuscatedName(value="bi")
    @Export(value="selectorMtf")
    byte[] selectorMtf = new byte[18002];
    @ObfuscatedName(value="bz")
    @Export(value="temp_charArray2d")
    byte[][] temp_charArray2d = new byte[6][258];
    @ObfuscatedName(value="bt")
    @Export(value="limit")
    int[][] limit = new int[6][258];
    @ObfuscatedName(value="bf")
    @Export(value="base")
    int[][] base = new int[6][258];
    @ObfuscatedName(value="by")
    @Export(value="perm")
    int[][] perm = new int[6][258];
    @ObfuscatedName(value="bm")
    @Export(value="minLens")
    int[] minLens = new int[6];
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=2065114951)
    int field5493;

    BZip2State() {
    }
}

