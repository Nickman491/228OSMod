/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="mt")
@Implements(value="SoftWrapper")
public class SoftWrapper
extends Wrapper {
    @ObfuscatedName(value="ay")
    @Export(value="ref")
    SoftReference ref;

    SoftWrapper(Object object, int n) {
        super(n);
        this.ref = new SoftReference<Object>(object);
    }

    @Override
    @ObfuscatedName(value="ay")
    @Export(value="get")
    Object get() {
        return this.ref.get();
    }

    @Override
    @ObfuscatedName(value="ah")
    @Export(value="isSoft")
    boolean isSoft() {
        return true;
    }
}

