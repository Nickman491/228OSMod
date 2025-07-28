/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fh")
public class class151
extends class150 {
    @ObfuscatedName(value="ja")
    @ObfuscatedSignature(descriptor="Ldz;")
    static class103 field1683;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1733568859)
    int field1682 = -1;
    @ObfuscatedName(value="ah")
    boolean field1679;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class151(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        this.field1682 = buffer.readUnsignedShort();
        this.field1679 = buffer.readUnsignedByte() == 1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.method3687(this.field1682, this.field1679);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lod;", garbageValue="1838023813")
    @Export(value="PlayerType_values")
    public static PlayerType[] PlayerType_values() {
        return new PlayerType[]{PlayerType.field4505, PlayerType.field4515, PlayerType.field4511, PlayerType.PlayerType_normal, PlayerType.field4513, PlayerType.field4507, PlayerType.field4506, PlayerType.field4512, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4508, PlayerType.PlayerType_ultimateIronman, PlayerType.field4514, PlayerType.PlayerType_ironman, PlayerType.PlayerType_playerModerator, PlayerType.field4509, PlayerType.PlayerType_jagexModerator, PlayerType.field4510};
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="798078430")
    public static void method3608(AbstractArchive abstractArchive) {
        FloorOverlayDefinition.FloorOverlayDefinition_archive = abstractArchive;
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="jm")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIB)V", garbageValue="10")
    static final void method3599(class103 var0, int var1_1, int var2_2, int var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[UNCONDITIONALDOLOOP]], but top level block is 4[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

