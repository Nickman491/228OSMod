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

@ObfuscatedName(value="jd")
@Implements(value="ParamComposition")
public class ParamComposition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="ParamDefinition_archive")
    static AbstractArchive ParamDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="ParamDefinition_cached")
    static EvictingDualNodeHashTable ParamDefinition_cached;
    @ObfuscatedName(value="az")
    @Export(value="type")
    char type;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1211806913)
    @Export(value="defaultInt")
    public int defaultInt;
    @ObfuscatedName(value="ad")
    @Export(value="defaultStr")
    public String defaultStr;
    @ObfuscatedName(value="an")
    @Export(value="autoDisable")
    boolean autoDisable = true;

    static {
        ParamDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    ParamComposition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1097931173")
    @Export(value="postDecode")
    void postDecode() {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="6")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="355757749")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n != 1) {
            if (n == 2) {
                this.defaultInt = buffer.readInt();
            } else if (n == 4) {
                this.autoDisable = false;
            } else if (n == 5) {
                this.defaultStr = buffer.readStringCp1252NullTerminated();
            }
        } else {
            char c;
            byte by = buffer.readByte();
            int n2 = by & 0xFF;
            if (n2 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(n2, 16));
            }
            if (n2 >= 128 && n2 < 160) {
                int n3 = class417.cp1252AsciiExtension[n2 - 128];
                if (n3 == 0) {
                    n3 = 63;
                }
                n2 = n3;
            }
            this.type = c = (char)n2;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-218803820")
    @Export(value="isString")
    public boolean isString() {
        return this.type == 's';
    }
}

