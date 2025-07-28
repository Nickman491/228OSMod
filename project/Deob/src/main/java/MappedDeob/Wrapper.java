/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="my")
@Implements(value="Wrapper")
public abstract class Wrapper
extends DualNode {
    @ObfuscatedName(value="ah")
    @Export(value="size")
    final int size;

    Wrapper(int n) {
        this.size = n;
    }

    @ObfuscatedName(value="ay")
    @Export(value="get")
    abstract Object get();

    @ObfuscatedName(value="ah")
    @Export(value="isSoft")
    abstract boolean isSoft();
}

