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

@ObfuscatedName(value="sw")
@Implements(value="Usernamed")
public interface Usernamed {
    @ObfuscatedName(value="oe")
    @ObfuscatedSignature(descriptor="(B)Lwb;", garbageValue="-23")
    @Export(value="username")
    public Username username();
}

