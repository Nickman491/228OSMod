/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ga")
public class class163
extends class166 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1594708939)
    int field1772 = -1;
    @ObfuscatedName(value="ah")
    byte field1769;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=789016747)
    int field1770;
    @ObfuscatedName(value="ao")
    String field1771;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class163(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(Buffer buffer) {
        buffer.readUnsignedByte();
        this.field1772 = buffer.readUnsignedShort();
        this.field1769 = buffer.readByte();
        this.field1770 = buffer.readUnsignedShort();
        buffer.readLong();
        this.field1771 = buffer.readStringCp1252NullTerminated();
        buffer.readUnsignedByte();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(ClanChannel clanChannel) {
        ClanChannelMember clanChannelMember = (ClanChannelMember)clanChannel.members.get(this.field1772);
        clanChannelMember.rank = this.field1769;
        clanChannelMember.world = this.field1770;
        clanChannelMember.username = new Username(this.field1771);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([I[II)V", garbageValue="-1302635542")
    public static void method3778(int[] nArray, int[] nArray2) {
        if (nArray != null && nArray2 != null) {
            class580.ByteArrayPool_alternativeSizes = nArray;
            KitDefinition.ByteArrayPool_altSizeArrayCounts = new int[nArray.length];
            class225.ByteArrayPool_arrays = new byte[nArray.length][][];
            int n = 0;
            while (true) {
                if (n >= class580.ByteArrayPool_alternativeSizes.length) {
                    Collections.sort(ByteArrayPool.field4887);
                    return;
                }
                class225.ByteArrayPool_arrays[n] = new byte[nArray2[n]][];
                ByteArrayPool.field4887.add(nArray[n]);
                ++n;
            }
        }
        class580.ByteArrayPool_alternativeSizes = null;
        KitDefinition.ByteArrayPool_altSizeArrayCounts = null;
        class225.ByteArrayPool_arrays = null;
        ByteArrayPool.field4887.clear();
        ByteArrayPool.field4887.add(100);
        ByteArrayPool.field4887.add(5000);
        ByteArrayPool.field4887.add(10000);
        ByteArrayPool.field4887.add(30000);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)Z", garbageValue="1669839859")
    static boolean method3775(String string, int n) {
        return class440.method8813(string, n, "openjs");
    }

    @ObfuscatedName(value="om")
    @ObfuscatedSignature(descriptor="(Lna;I)Z", garbageValue="-812239853")
    @Export(value="isComponentHidden")
    static boolean isComponentHidden(Widget widget) {
        return widget.isHidden;
    }
}

