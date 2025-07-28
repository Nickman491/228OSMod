/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ws")
@Implements(value="GZipDecompressor")
public class GZipDecompressor {
    @ObfuscatedName(value="ay")
    @Export(value="inflater")
    Inflater inflater;

    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1000000")
    GZipDecompressor(int n, int n2, int n3) {
    }

    public GZipDecompressor() {
        this(-1, 1000000, 1000000);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;[BI)V", garbageValue="-3383708")
    @Export(value="decompress")
    public void decompress(Buffer buffer, byte[] byArray) {
        if (buffer.array[buffer.offset] != 31 || buffer.array[buffer.offset + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.inflater == null) {
            this.inflater = new Inflater(true);
        }
        try {
            this.inflater.setInput(buffer.array, buffer.offset + 10, buffer.array.length - (buffer.offset + 8 + 10));
            this.inflater.inflate(byArray);
        }
        catch (Exception exception) {
            this.inflater.reset();
            throw new RuntimeException("");
        }
        this.inflater.reset();
    }
}

