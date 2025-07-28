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

@ObfuscatedName(value="ev")
@Implements(value="UserComparator8")
public class UserComparator8
extends AbstractUserComparator {
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public UserComparator8(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="724269610")
    @Export(value="compareBuddy")
    int compareBuddy(Buddy buddy, Buddy buddy2) {
        if (Client.worldId != buddy.world) {
            if (buddy2.world == Client.worldId) {
                return this.reversed ? 1 : -1;
            }
        } else if (buddy2.world != Client.worldId) {
            return this.reversed ? -1 : 1;
        }
        return this.compareUser(buddy, buddy2);
    }

    public int compare(Object object, Object object2) {
        return this.compareBuddy((Buddy)object, (Buddy)object2);
    }

    @ObfuscatedName(value="md")
    @ObfuscatedSignature(descriptor="(Lna;I)V", garbageValue="1034774525")
    @Export(value="invalidateWidget")
    public static void invalidateWidget(Widget widget) {
        if (widget != null && widget.cycle == Client.field619) {
            Client.field713[widget.rootIndex] = true;
        }
    }

    @ObfuscatedName(value="oo")
    @ObfuscatedSignature(descriptor="(B)Lpa;", garbageValue="100")
    static class392 method3320() {
        return HitSplatDefinition.field2760;
    }
}

