/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hh")
@Implements(value="ModelData0")
public class ModelData0 {
    ModelData0() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Lja;", garbageValue="7")
    public static VarbitComposition method4806(int n) {
        VarbitComposition varbitComposition = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get(n);
        if (varbitComposition != null) {
            return varbitComposition;
        }
        byte[] byArray = class431.VarbitDefinition_archive.takeFile(14, n);
        varbitComposition = new VarbitComposition();
        if (byArray != null) {
            varbitComposition.decode(new Buffer(byArray));
        }
        VarbitComposition.VarbitDefinition_cached.put(varbitComposition, n);
        return varbitComposition;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(II)Lhb;", garbageValue="-1674690556")
    @Export(value="getFrames")
    static Frames getFrames(int n) {
        Frames frames;
        Frames frames2 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get(n);
        if (frames2 != null) {
            return frames2;
        }
        AbstractArchive abstractArchive = SequenceDefinition.SequenceDefinition_animationsArchive;
        AbstractArchive abstractArchive2 = class466.SequenceDefinition_skeletonsArchive;
        boolean bl = true;
        int[] nArray = abstractArchive.getGroupFileIds(n);
        for (int i = 0; i < nArray.length; ++i) {
            byte[] byArray = abstractArchive.getFile(n, nArray[i]);
            if (byArray == null) {
                bl = false;
                continue;
            }
            int n2 = (byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF;
            byte[] byArray2 = abstractArchive2.getFile(n2, 0);
            if (byArray2 != null) continue;
            bl = false;
        }
        if (!bl) {
            frames = null;
        } else {
            try {
                frames = new Frames(abstractArchive, abstractArchive2, n, false);
            }
            catch (Exception exception) {
                frames = null;
            }
        }
        frames2 = frames;
        if (frames2 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(frames2, n);
        }
        return frames2;
    }

    @ObfuscatedName(value="gq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2138033295")
    static void method4808() {
        Client.field512 = true;
        if (class19.varcs != null && class19.varcs.method3199()) {
            class19.varcs.write();
        }
        class92.method2637();
        ScriptFrame.method1230();
        if (class168.field1794 != null) {
            class168.field1794.isRunning = false;
        }
        class168.field1794 = null;
        Client.packetWriter.close();
        if (GameEngine.taskHandler != null) {
            try {
                GameEngine.taskHandler.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        GameEngine.taskHandler = null;
        class4.method20();
        class240.method5249();
        Client.field508.method2723();
        class420.worldMap = null;
        UserComparator3.method3347(0, 0);
        class153.method3619();
        Client.playingJingle = false;
        World.method1957();
        if (class328.pcmPlayer1 != null) {
            class328.pcmPlayer1.shutdown();
        }
        HitSplatDefinition.field2760.method7855();
        TaskHandler.method4916();
        if (class280.urlRequester != null) {
            class280.urlRequester.close();
        }
        class150.method3592();
        JagexCache.JagexCache_dat2File = null;
        JagexCache.JagexCache_idx255File = null;
        UserComparator4.JagexCache_idxFiles = null;
        class93.method2651();
        ReflectionCheck.field227 = null;
        Client.archiveLoaders.clear();
        Client.field692 = 0;
        HitSplatDefinition.field2760 = new class392();
        class280.urlRequester = new class119(Client.client.field547, 228);
        try {
            class30.method483("oldschool", class255.field2724, class438.field4820.name, 0, 23);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        ReflectionCheck.field227 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
        GameEngine.taskHandler = new TaskHandler();
        Client.client.method544();
        Clock.method5078(class95.field1157);
        class360.updateGameState(0);
    }
}

