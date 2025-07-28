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

@ObfuscatedName(value="sy")
@Implements(value="Ignored")
public class Ignored
extends User {
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1811218597)
    static int field5015;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1452578339)
    @Export(value="id")
    int id;

    Ignored() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsy;I)I", garbageValue="-1005954819")
    @Export(value="compareTo_ignored")
    int compareTo_ignored(Ignored ignored) {
        return this.id - ignored.id;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lso;I)I", garbageValue="1212702091")
    @Export(value="compareTo_user")
    public int compareTo_user(User user) {
        return this.compareTo_ignored((Ignored)user);
    }

    @Override
    public int compareTo(Object object) {
        return this.compareTo_ignored((Ignored)object);
    }
}

