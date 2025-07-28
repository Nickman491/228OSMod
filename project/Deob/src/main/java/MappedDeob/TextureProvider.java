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

@ObfuscatedName(value="hy")
@Implements(value="TextureProvider")
public class TextureProvider
implements TextureLoader {
    @ObfuscatedName(value="je")
    static int[] field2157;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lgh;")
    @Export(value="textures")
    Texture[] textures;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpm;")
    @Export(value="deque")
    NodeDeque deque = new NodeDeque();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1827847465)
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1077343619)
    @Export(value="remaining")
    int remaining = 0;
    @ObfuscatedName(value="ad")
    @Export(value="brightness")
    double brightness = 1.0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1652188377)
    @Export(value="textureSize")
    int textureSize = 128;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="archive")
    AbstractArchive archive;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;IDI)V")
    public TextureProvider(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, int n, double d, int n2) {
        this.archive = abstractArchive2;
        this.remaining = this.capacity = n;
        this.brightness = d;
        this.textureSize = n2;
        int[] nArray = abstractArchive.getGroupFileIds(0);
        if (nArray == null) {
            this.textures = new Texture[0];
            return;
        }
        int n3 = nArray.length;
        this.textures = new Texture[abstractArchive.getGroupFileCount(0)];
        int n4 = 0;
        while (n4 < n3) {
            Buffer buffer = new Buffer(abstractArchive.takeFile(0, nArray[n4]));
            this.textures[nArray[n4]] = new Texture(buffer);
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-70")
    @Export(value="getLoadedPercentage")
    public int getLoadedPercentage() {
        if (this.textures.length == 0) {
            return 100;
        }
        int n = 0;
        int n2 = 0;
        Texture[] textureArray = this.textures;
        int n3 = 0;
        while (true) {
            if (n3 >= textureArray.length) {
                if (n == 0) {
                    return 0;
                }
                return n2 * 100 / n;
            }
            Texture texture = textureArray[n3];
            if (texture != null && texture.fileIds != null) {
                n = texture.fileIds.length + n;
                int[] nArray = texture.fileIds;
                for (int i = 0; i < nArray.length; ++i) {
                    int n4 = nArray[i];
                    if (!this.archive.method7731(n4)) continue;
                    ++n2;
                }
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    @Export(value="setBrightness")
    public void setBrightness(double d) {
        this.brightness = d;
        this.clear();
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)[I", garbageValue="-294472347")
    @Export(value="getTexturePixels")
    public int[] getTexturePixels(int n) {
        Texture texture;
        block6: {
            block7: {
                block5: {
                    texture = this.textures[n];
                    if (texture == null) break block5;
                    if (texture.pixels != null) break block6;
                    boolean bl = texture.load(this.brightness, this.textureSize, this.archive);
                    if (bl) break block7;
                }
                return null;
            }
            if (this.remaining != 0) {
                --this.remaining;
            } else {
                Texture texture2 = (Texture)this.deque.removeFirst();
                texture2.reset();
            }
            this.deque.addLast(texture);
            texture.isLoaded = true;
            return texture.pixels;
        }
        this.deque.addLast(texture);
        texture.isLoaded = true;
        return texture.pixels;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="667540605")
    @Export(value="getAverageTextureRGB")
    public int getAverageTextureRGB(int n) {
        if (this.textures[n] != null) {
            return this.textures[n].averageRGB;
        }
        return 0;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1748706073")
    public boolean vmethod4810(int n) {
        return this.textures[n].field1907;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="2020085258")
    @Export(value="isLowDetail")
    public boolean isLowDetail(int n) {
        return this.textureSize == 64;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="608282356")
    @Export(value="clear")
    public void clear() {
        int n = 0;
        while (true) {
            if (n >= this.textures.length) {
                this.deque = new NodeDeque();
                this.remaining = this.capacity;
                return;
            }
            if (this.textures[n] != null) {
                this.textures[n].reset();
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1451779619")
    @Export(value="animate")
    public void animate(int n) {
        int n2 = 0;
        while (n2 < this.textures.length) {
            Texture texture = this.textures[n2];
            if (texture != null && texture.animationDirection != 0 && texture.isLoaded) {
                texture.animate(n);
                texture.isLoaded = false;
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1398740013")
    public static void method4473() {
        NPCComposition.NpcDefinition_cached.clear();
        NPCComposition.NpcDefinition_cachedModels.clear();
    }

    @ObfuscatedName(value="in")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1509989655")
    @Export(value="getWindowedMode")
    static int getWindowedMode() {
        return Client.isResizable ? 2 : 1;
    }
}

