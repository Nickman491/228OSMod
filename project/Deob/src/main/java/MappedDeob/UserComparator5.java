/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ea")
@Implements(value="UserComparator5")
public class UserComparator5
extends AbstractUserComparator {
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Llo;")
    @Export(value="worldMapEvent")
    static WorldMapEvent worldMapEvent;
    @ObfuscatedName(value="bb")
    @Export(value="loginScreenFontMetrics")
    static FontMetrics loginScreenFontMetrics;
    @ObfuscatedName(value="ds")
    @ObfuscatedSignature(descriptor="[Lvf;")
    @Export(value="worldSelectBackSprites")
    static SpritePixels[] worldSelectBackSprites;
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public UserComparator5(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="-1570181773")
    @Export(value="compareBuddy")
    int compareBuddy(Buddy buddy, Buddy buddy2) {
        if (buddy.world == 0) {
            if (buddy2.world != 0) {
                return this.reversed ? 1 : -1;
            }
        } else if (buddy2.world == 0) {
            return this.reversed ? -1 : 1;
        }
        return this.compareUser(buddy, buddy2);
    }

    public int compare(Object object, Object object2) {
        return this.compareBuddy((Buddy)object, (Buddy)object2);
    }
}

