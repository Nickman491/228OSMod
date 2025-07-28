/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qs")
public class class418 {
    @ObfuscatedName(value="ay")
    static char[] field4713;
    @ObfuscatedName(value="ah")
    static char[] field4714;
    @ObfuscatedName(value="az")
    static char[] field4717;
    @ObfuscatedName(value="ao")
    static int[] field4716;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lvi;")
    static IndexedSprite field4715;
    @ObfuscatedName(value="dl")
    static boolean field4719;

    static {
        int n;
        field4713 = new char[64];
        for (n = 0; n < 26; ++n) {
            class418.field4713[n] = (char)(n + 65);
        }
        for (n = 26; n < 52; ++n) {
            class418.field4713[n] = (char)(n + 97 - 26);
        }
        for (n = 52; n < 62; ++n) {
            class418.field4713[n] = (char)(n + 48 - 52);
        }
        class418.field4713[62] = 43;
        class418.field4713[63] = 47;
        field4714 = new char[64];
        for (n = 0; n < 26; ++n) {
            class418.field4714[n] = (char)(n + 65);
        }
        for (n = 26; n < 52; ++n) {
            class418.field4714[n] = (char)(n + 97 - 26);
        }
        for (n = 52; n < 62; ++n) {
            class418.field4714[n] = (char)(n + 48 - 52);
        }
        class418.field4714[62] = 42;
        class418.field4714[63] = 45;
        field4717 = new char[64];
        for (n = 0; n < 26; ++n) {
            class418.field4717[n] = (char)(n + 65);
        }
        for (n = 26; n < 52; ++n) {
            class418.field4717[n] = (char)(n + 97 - 26);
        }
        for (n = 52; n < 62; ++n) {
            class418.field4717[n] = (char)(n + 48 - 52);
        }
        class418.field4717[62] = 45;
        class418.field4717[63] = 95;
        field4716 = new int[128];
        for (n = 0; n < field4716.length; ++n) {
            class418.field4716[n] = -1;
        }
        for (n = 65; n <= 90; ++n) {
            class418.field4716[n] = n - 65;
        }
        for (n = 97; n <= 122; ++n) {
            class418.field4716[n] = n - 97 + 26;
        }
        for (n = 48; n <= 57; ++n) {
            class418.field4716[n] = n - 48 + 52;
        }
        int[] nArray = field4716;
        class418.field4716[43] = 62;
        nArray[42] = 62;
        int[] nArray2 = field4716;
        class418.field4716[47] = 63;
        nArray2[45] = 63;
    }
}

