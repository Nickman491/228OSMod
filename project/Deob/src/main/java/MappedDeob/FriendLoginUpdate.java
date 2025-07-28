/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ss")
@Implements(value="FriendLoginUpdate")
public class FriendLoginUpdate
extends Link {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lvi;")
    static IndexedSprite field4992;
    @ObfuscatedName(value="gu")
    static String field4996;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=932590219)
    public int field4997 = (int)(ReflectionCheck.method724() / 1000L);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lwb;")
    @Export(value="username")
    public Username username;
    @ObfuscatedName(value="az")
    @Export(value="world")
    public short world;

    @ObfuscatedSignature(descriptor="(Lwb;I)V")
    FriendLoginUpdate(Username username, int n) {
        this.username = username;
        this.world = (short)n;
    }
}

