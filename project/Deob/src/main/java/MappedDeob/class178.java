/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gi")
public final class class178 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-621260543)
    int field1898;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1226303429)
    int field1895;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1829198528)
    int field1893;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lhs;")
    public Renderable field1896;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(longValue=-2688195952529453661L)
    public long field1894;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-2030050993)
    int field1897;

    class178() {
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-118")
    static final void method3989(String string) {
        String string2 = string + " is already on your friend list";
        Interpreter.addGameMessage(30, "", string2);
    }
}

