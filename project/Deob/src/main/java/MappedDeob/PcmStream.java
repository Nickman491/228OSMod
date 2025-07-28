/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bn")
@Implements(value="PcmStream")
public abstract class PcmStream
extends Node {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lbn;")
    @Export(value="after")
    PcmStream after;
    @ObfuscatedName(value="al")
    int field323;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lcq;")
    @Export(value="sound")
    AbstractSound sound;
    @ObfuscatedName(value="ag")
    @Export(value="active")
    volatile boolean active = true;

    protected PcmStream() {
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="firstSubStream")
    protected abstract PcmStream firstSubStream();

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="nextSubStream")
    protected abstract PcmStream nextSubStream();

    @ObfuscatedName(value="ax")
    protected abstract int vmethod6927();

    @ObfuscatedName(value="at")
    @Export(value="fill")
    protected abstract void fill(int[] var1, int var2, int var3);

    @ObfuscatedName(value="au")
    @Export(value="skip")
    protected abstract void skip(int var1);

    @ObfuscatedName(value="bk")
    int vmethod1079() {
        return 255;
    }

    @ObfuscatedName(value="gd")
    @Export(value="update")
    final void update(int[] nArray, int n, int n2) {
        if (this.active) {
            this.fill(nArray, n, n2);
        } else {
            this.skip(n2);
        }
    }
}

