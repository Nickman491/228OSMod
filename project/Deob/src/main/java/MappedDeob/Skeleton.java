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

@ObfuscatedName(value="hu")
@Implements(value="Skeleton")
public class Skeleton
extends Node {
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-986149625)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=771980369)
    @Export(value="count")
    int count;
    @ObfuscatedName(value="ax")
    @Export(value="transformTypes")
    int[] transformTypes;
    @ObfuscatedName(value="at")
    @Export(value="labels")
    int[][] labels;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lhn;")
    class184 field1991;

    public Skeleton(int n, byte[] byArray) {
        int n2;
        this.id = n;
        Buffer buffer = new Buffer(byArray);
        this.count = buffer.readUnsignedByte();
        this.transformTypes = new int[this.count];
        this.labels = new int[this.count][];
        for (n2 = 0; n2 < this.count; ++n2) {
            this.transformTypes[n2] = buffer.readUnsignedByte();
        }
        for (n2 = 0; n2 < this.count; ++n2) {
            this.labels[n2] = new int[buffer.readUnsignedByte()];
        }
        n2 = 0;
        while (true) {
            if (n2 >= this.count) {
                if (buffer.offset < buffer.array.length && (n2 = buffer.readUnsignedShort()) > 0) {
                    this.field1991 = new class184(buffer, n2);
                }
                return;
            }
            for (int i = 0; i < this.labels[n2].length; ++i) {
                this.labels[n2][i] = buffer.readUnsignedByte();
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1958480408")
    public int method4164() {
        return this.count;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)Lhn;", garbageValue="11")
    public class184 method4168() {
        return this.field1991;
    }

    @ObfuscatedName(value="kz")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="21389")
    static final boolean method4171() {
        return Client.isMenuOpen;
    }

    @ObfuscatedName(value="ov")
    @ObfuscatedSignature(descriptor="([BII)V", garbageValue="904018870")
    @Export(value="VorbisSample_setData")
    static void VorbisSample_setData(byte[] byArray, int n) {
        if (Client.randomDatData == null) {
            Client.randomDatData = new byte[24];
        }
        class451.writeRandomDat(byArray, n, Client.randomDatData, 0, 24);
    }
}

