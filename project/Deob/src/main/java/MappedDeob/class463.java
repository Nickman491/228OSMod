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

@ObfuscatedName(value="rq")
public class class463 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lrq;")
    public static final class463 field4954 = new class463(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lrq;")
    static final class463 field4953 = new class463(1);
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2066207141)
    final int field4952;

    class463(int n) {
        this.field4952 = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lwk;", garbageValue="1773166265")
    public static PrivateChatMode method9025(int n) {
        PrivateChatMode[] privateChatModeArray;
        PrivateChatMode[] privateChatModeArray2 = privateChatModeArray = new PrivateChatMode[]{PrivateChatMode.field5632, PrivateChatMode.field5631, PrivateChatMode.field5630};
        int n2 = 0;
        while (n2 < privateChatModeArray2.length) {
            PrivateChatMode privateChatMode = privateChatModeArray2[n2];
            if (n == privateChatMode.field5629) {
                return privateChatMode;
            }
            ++n2;
        }
        return null;
    }
}

