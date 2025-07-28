/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="om")
@Implements(value="DirectByteArrayCopier")
public class DirectByteArrayCopier
extends AbstractByteArrayCopier {
    @ObfuscatedName(value="ay")
    @Export(value="directBuffer")
    ByteBuffer directBuffer;

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)[B", garbageValue="14")
    @Export(value="get")
    byte[] get() {
        byte[] byArray = new byte[this.directBuffer.capacity()];
        this.directBuffer.position(0);
        this.directBuffer.get(byArray);
        return byArray;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="1288883946")
    @Export(value="set")
    public void set(byte[] byArray) {
        this.directBuffer = ByteBuffer.allocateDirect(byArray.length);
        this.directBuffer.position(0);
        this.directBuffer.put(byArray);
    }

    @ObfuscatedName(value="mr")
    @ObfuscatedSignature(descriptor="(IIIIIIIB)V", garbageValue="-40")
    @Export(value="updateRootInterface")
    static final void updateRootInterface(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (!ClanChannel.field1807.method7024(n)) {
            return;
        }
        Player.updateInterface(ClanChannel.field1807.field3772[n], -1, n2, n3, n4, n5, n6, n7);
    }
}

