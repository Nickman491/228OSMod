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

@ObfuscatedName(value="mw")
public class class319 {
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=504080126095839219L)
    static long field3313;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1501922780")
    public static int method6609() {
        return ViewportMouse.ViewportMouse_entityCount;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;Ljava/lang/String;I)[Lvi;", garbageValue="-1850059826")
    public static IndexedSprite[] method6611(AbstractArchive abstractArchive, String string, String string2) {
        if (!abstractArchive.isValidFileName(string, string2)) {
            return null;
        }
        int n = abstractArchive.getGroupId(string);
        int n2 = abstractArchive.getFileId(n, string2);
        return class16.method213(abstractArchive, n, n2);
    }

    @ObfuscatedName(value="gl")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1037305055")
    static boolean method6610() {
        if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
            while (true) {
                if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
                    return true;
                }
                ArchiveLoader archiveLoader = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
                if (!archiveLoader.isLoaded()) {
                    return false;
                }
                ++Client.archiveLoadersDone;
            }
        }
        return true;
    }
}

