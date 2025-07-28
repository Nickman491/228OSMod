package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bn")
public abstract class class49
extends class514 {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lbn;")
    class49 field326;
    @ObfuscatedName(value="al")
    int field323;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lcq;")
    class62 field324;
    @ObfuscatedName(value="ag")
    volatile boolean field325 = true;

    protected class49() {
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    protected abstract class49 vmethod6899();

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lbn;")
    protected abstract class49 vmethod6900();

    @ObfuscatedName(value="ax")
    protected abstract int vmethod6927();

    @ObfuscatedName(value="at")
    protected abstract void vmethod6908(int[] var1, int var2, int var3);

    @ObfuscatedName(value="au")
    protected abstract void vmethod6902(int var1);

    @ObfuscatedName(value="bk")
    int vmethod1079() {
        return 255;
    }

    @ObfuscatedName(value="gd")
    final void method1083(int[] nArray, int n, int n2) {
        if (this.field325) {
            this.vmethod6908(nArray, n, n2);
        } else {
            this.vmethod6902(n2);
        }
    }
}

