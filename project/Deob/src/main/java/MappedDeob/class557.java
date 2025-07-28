/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vn")
public class class557 {
    @ObfuscatedName(value="as")
    static int[] field5476;
    @ObfuscatedName(value="ay")
    int[] field5474 = new int[8];
    @ObfuscatedName(value="ah")
    short[] field5475 = new short[8];

    @ObfuscatedSignature(descriptor="(Ljz;)V")
    public class557(NPCComposition nPCComposition) {
        int n = 0;
        if (nPCComposition.method5306()) {
            n = nPCComposition.method5338().length;
            System.arraycopy(nPCComposition.method5338(), 0, this.field5474, 0, n);
            System.arraycopy(nPCComposition.method5308(), 0, this.field5475, 0, n);
        }
        int n2 = n;
        while (n2 < 8) {
            this.field5474[n2] = -1;
            this.field5475[n2] = -1;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="2094086716")
    public int[] method10527() {
        return this.field5474;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)[S", garbageValue="47")
    public short[] method10528() {
        return this.field5475;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IISI)V", garbageValue="-1698545184")
    public void method10531(int n, int n2, short s) {
        this.field5474[n] = n2;
        this.field5475[n] = s;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([I[SI)V", garbageValue="-1619580615")
    public void method10530(int[] nArray, short[] sArray) {
        this.field5474 = nArray;
        this.field5475 = sArray;
    }
}

