/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="wk")
@Implements(value="PrivateChatMode")
public class PrivateChatMode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lwk;")
    static final PrivateChatMode field5632 = new PrivateChatMode(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lwk;")
    public static final PrivateChatMode field5630 = new PrivateChatMode(1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lwk;")
    static final PrivateChatMode field5631 = new PrivateChatMode(2);
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1741787281)
    public final int field5629;

    PrivateChatMode(int n) {
        this.field5629 = n;
    }
}

