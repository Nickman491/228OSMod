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

@ObfuscatedName(value="sk")
@Implements(value="Friend")
public class Friend
extends Buddy {
    @ObfuscatedName(value="ay")
    boolean field4990;
    @ObfuscatedName(value="ah")
    boolean field4991;

    Friend() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsk;S)I", garbageValue="-18687")
    @Export(value="compareToFriend")
    int compareToFriend(Friend friend) {
        if (this.world == Client.worldId && Client.worldId != friend.world) {
            return -1;
        }
        if (Client.worldId == friend.world && this.world != Client.worldId) {
            return 1;
        }
        if (this.world != 0 && friend.world == 0) {
            return -1;
        }
        if (friend.world != 0 && this.world == 0) {
            return 1;
        }
        if (this.field4990 && !friend.field4990) {
            return -1;
        }
        if (!this.field4990 && friend.field4990) {
            return 1;
        }
        if (this.field4991 && !friend.field4991) {
            return -1;
        }
        if (!this.field4991 && friend.field4991) {
            return 1;
        }
        if (this.world == 0) {
            return friend.int2 - this.int2;
        }
        return this.int2 - friend.int2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lso;I)I", garbageValue="1212702091")
    @Export(value="compareTo_user")
    public int compareTo_user(User user) {
        return this.compareToFriend((Friend)user);
    }

    @Override
    public int compareTo(Object object) {
        return this.compareToFriend((Friend)object);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ldf;I)V", garbageValue="-236997524")
    @Export(value="runScriptEvent")
    public static void runScriptEvent(ScriptEvent scriptEvent) {
        class150.runScript(scriptEvent, 500000, 475000);
    }
}

