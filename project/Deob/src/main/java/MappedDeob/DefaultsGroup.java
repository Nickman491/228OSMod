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

@ObfuscatedName(value="sj")
@Implements(value="DefaultsGroup")
public class DefaultsGroup {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lsj;")
    static final DefaultsGroup field5098 = new DefaultsGroup(1);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lsj;")
    static final DefaultsGroup field5097 = new DefaultsGroup(3);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lbk;")
    @Export(value="soundSystem")
    static SoundSystem soundSystem;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1386616949)
    @Export(value="group")
    final int group;

    DefaultsGroup(int n) {
        this.group = n;
    }
}

