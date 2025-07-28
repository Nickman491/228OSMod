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

@ObfuscatedName(value="ui")
@Implements(value="WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
    @ObfuscatedName(value="ad")
    @Export(value="cacheName")
    String cacheName;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="archive")
    AbstractArchive archive;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1318039913)
    @Export(value="percentLoaded")
    int percentLoaded = 0;
    @ObfuscatedName(value="ax")
    @Export(value="loaded")
    boolean loaded = false;

    @ObfuscatedSignature(descriptor="(Lpq;)V")
    WorldMapArchiveLoader(AbstractArchive abstractArchive) {
        this.archive = abstractArchive;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-536495632")
    @Export(value="reset")
    void reset(String string) {
        if (string != null && !string.isEmpty()) {
            if (string != this.cacheName) {
                this.cacheName = string;
                this.percentLoaded = 0;
                this.loaded = false;
                this.load();
                return;
            }
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1237303035")
    @Export(value="load")
    int load() {
        if (this.cacheName != null) {
            if (this.percentLoaded < 33) {
                if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3269.name, this.cacheName)) return this.percentLoaded;
                this.percentLoaded = 33;
            }
            if (this.percentLoaded == 33) {
                if (this.archive.isValidFileName(WorldMapCacheName.field3265.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3265.name, this.cacheName)) return this.percentLoaded;
                this.percentLoaded = 66;
            }
            if (this.percentLoaded != 66) return this.percentLoaded;
            if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3267.name)) return this.percentLoaded;
            this.percentLoaded = 100;
            this.loaded = true;
            return this.percentLoaded;
        } else {
            this.percentLoaded = 100;
            this.loaded = true;
        }
        return this.percentLoaded;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-915181834")
    @Export(value="isLoaded")
    boolean isLoaded() {
        return this.loaded;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-923373061")
    @Export(value="getPercentLoaded")
    int getPercentLoaded() {
        return this.percentLoaded;
    }
}

