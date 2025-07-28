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

@ObfuscatedName(value="sc")
@Implements(value="ClanMate")
public class ClanMate
extends Buddy {
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=706986527)
    static int field5001;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lsb;")
    @Export(value="friend")
    TriBool friend = TriBool.TriBool_unknown;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lsb;")
    @Export(value="ignored")
    TriBool ignored = TriBool.TriBool_unknown;

    ClanMate() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1646421790")
    void method9143() {
        this.friend = TriBool.TriBool_unknown;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-274373997")
    @Export(value="isFriend")
    public final boolean isFriend() {
        if (this.friend == TriBool.TriBool_unknown) {
            this.fillIsFriend();
        }
        return this.friend == TriBool.TriBool_true;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1913873145")
    @Export(value="fillIsFriend")
    void fillIsFriend() {
        this.friend = class10.friendSystem.friendsList.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2126139789")
    @Export(value="clearIsIgnored")
    void clearIsIgnored() {
        this.ignored = TriBool.TriBool_unknown;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="4")
    @Export(value="isIgnored")
    public final boolean isIgnored() {
        if (this.ignored == TriBool.TriBool_unknown) {
            this.fillIsIgnored();
        }
        return this.ignored == TriBool.TriBool_true;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1748003540")
    @Export(value="fillIsIgnored")
    void fillIsIgnored() {
        this.ignored = class10.friendSystem.ignoreList.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
    }
}

