package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="om")
public class class367
extends class365 {
    @ObfuscatedName(value="ay")
    ByteBuffer field4055;

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)[B", garbageValue="14")
    byte[] vmethod7601() {
        byte[] byArray = new byte[this.field4055.capacity()];
        this.field4055.position(0);
        this.field4055.get(byArray);
        return byArray;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="1288883946")
    public void vmethod7600(byte[] byArray) {
        this.field4055 = ByteBuffer.allocateDirect(byArray.length);
        this.field4055.position(0);
        this.field4055.put(byArray);
    }

    @ObfuscatedName(value="mr")
    @ObfuscatedSignature(descriptor="(IIIIIIIB)V", garbageValue="-40")
    static final void method7605(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (!class170.field1807.method7024(n)) {
            return;
        }
        class94.method2706(class170.field1807.field3772[n], -1, n2, n3, n4, n5, n6, n7);
    }
}

