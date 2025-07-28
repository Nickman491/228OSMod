package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="mt")
public class class314
extends class317 {
    @ObfuscatedName(value="ay")
    SoftReference field3294;

    class314(Object object, int n) {
        super(n);
        this.field3294 = new SoftReference<Object>(object);
    }

    @Override
    @ObfuscatedName(value="ay")
    Object vmethod6602() {
        return this.field3294.get();
    }

    @Override
    @ObfuscatedName(value="ah")
    boolean vmethod6603() {
        return true;
    }
}

