package old228;/*
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

@ObfuscatedName(value="dp")
public class class100
extends class514 {
    @ObfuscatedName(value="im")
    @ObfuscatedSignature(descriptor="Lqw;")
    static class435 field1278;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1310527883)
    int field1274;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1870888501)
    int field1273;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1572125551)
    int field1272;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1766608137)
    int field1275;

    class100(int n, int n2, int n3, int n4) {
        this.field1274 = n;
        this.field1273 = n2;
        this.field1272 = n3;
        this.field1275 = n4;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="-16")
    void method2834(int n, int n2, int n3, int n4) {
        this.field1274 = n;
        this.field1273 = n2;
        this.field1272 = n3;
        this.field1275 = n4;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1035165513")
    public static boolean method2833(int n) {
        return n >= class370.field4074.field4087 && n <= class370.field4068.field4087 || n == class370.field4066.field4087;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(CLph;I)C", garbageValue="-2022951409")
    static char method2829(char c, class406 class4062) {
        if (c >= '\u00c0' && c <= '\u00ff') {
            if (c >= '\u00c0' && c <= '\u00c6') {
                return 'A';
            }
            if (c == '\u00c7') {
                return 'C';
            }
            if (c >= '\u00c8' && c <= '\u00cb') {
                return 'E';
            }
            if (c >= '\u00cc' && c <= '\u00cf') {
                return 'I';
            }
            if (c == '\u00d1' && class4062 != class406.field4672) {
                return 'N';
            }
            if (c >= '\u00d2' && c <= '\u00d6') {
                return 'O';
            }
            if (c >= '\u00d9' && c <= '\u00dc') {
                return 'U';
            }
            if (c == '\u00dd') {
                return 'Y';
            }
            if (c == '\u00df') {
                return 's';
            }
            if (c >= '\u00e0' && c <= '\u00e6') {
                return 'a';
            }
            if (c == '\u00e7') {
                return 'c';
            }
            if (c >= '\u00e8' && c <= '\u00eb') {
                return 'e';
            }
            if (c >= '\u00ec' && c <= '\u00ef') {
                return 'i';
            }
            if (c == '\u00f1' && class4062 != class406.field4672) {
                return 'n';
            }
            if (c >= '\u00f2' && c <= '\u00f6') {
                return 'o';
            }
            if (c >= '\u00f9' && c <= '\u00fc') {
                return 'u';
            }
            if (c == '\u00fd' || c == '\u00ff') {
                return 'y';
            }
        }
        if (c == '\u0152') {
            return 'O';
        }
        if (c == '\u0153') {
            return 'o';
        }
        if (c == '\u0178') {
            return 'Y';
        }
        return c;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="56")
    static void method2832() {
        class78.field947 = client.field555 && class78.field955 != null && class78.field955.length() > 0 ? 1 : 0;
    }
}

