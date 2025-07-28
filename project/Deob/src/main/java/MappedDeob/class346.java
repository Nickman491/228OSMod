/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ns")
public class class346
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1313234445)
    int field3751;
    @ObfuscatedName(value="ah")
    BitSet field3748;

    class346(int n) {
        this.field3751 = n;
        this.field3748 = new BitSet(128);
    }

    @ObfuscatedName(value="hv")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="49")
    static final void method6950() {
        if (class424.ClanChat_inClanChat) {
            if (WorldMapLabelSize.friendsChat != null) {
                WorldMapLabelSize.friendsChat.sort();
            }
            class397.method7892();
            class424.ClanChat_inClanChat = false;
        }
    }
}

