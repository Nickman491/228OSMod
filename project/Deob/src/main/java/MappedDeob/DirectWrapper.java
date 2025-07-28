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

@ObfuscatedName(value="mp")
@Implements(value="DirectWrapper")
public class DirectWrapper
extends Wrapper {
    @ObfuscatedName(value="ay")
    @Export(value="obj")
    Object obj;

    DirectWrapper(Object object, int n) {
        super(n);
        this.obj = object;
    }

    @Override
    @ObfuscatedName(value="ay")
    @Export(value="get")
    Object get() {
        return this.obj;
    }

    @Override
    @ObfuscatedName(value="ah")
    @Export(value="isSoft")
    boolean isSoft() {
        return false;
    }
}

