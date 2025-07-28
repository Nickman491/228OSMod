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

@ObfuscatedName(value="dp")
@Implements(value="HealthBarUpdate")
public class HealthBarUpdate
extends Node {
    @ObfuscatedName(value="im")
    @ObfuscatedSignature(descriptor="Lqw;")
    @Export(value="fontPlain12")
    static Font fontPlain12;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1310527883)
    @Export(value="cycle")
    int cycle;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1870888501)
    @Export(value="health")
    int health;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1572125551)
    @Export(value="health2")
    int health2;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1766608137)
    @Export(value="cycleOffset")
    int cycleOffset;

    HealthBarUpdate(int n, int n2, int n3, int n4) {
        this.cycle = n;
        this.health = n2;
        this.health2 = n3;
        this.cycleOffset = n4;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="-16")
    @Export(value="set")
    void set(int n, int n2, int n3, int n4) {
        this.cycle = n;
        this.health = n2;
        this.health2 = n3;
        this.cycleOffset = n4;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1035165513")
    public static boolean method2833(int n) {
        return n >= WorldMapDecorationType.field4074.id && n <= WorldMapDecorationType.field4068.id || n == WorldMapDecorationType.field4066.id;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(CLph;I)C", garbageValue="-2022951409")
    @Export(value="standardizeChar")
    static char standardizeChar(char c, Language language) {
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
            if (c == '\u00d1' && language != Language.Language_ES) {
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
            if (c == '\u00f1' && language != Language.Language_ES) {
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
        Login.currentLoginField = Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0 ? 1 : 0;
    }
}

