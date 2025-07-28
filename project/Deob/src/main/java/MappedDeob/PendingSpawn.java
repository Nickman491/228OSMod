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

@ObfuscatedName(value="du")
@Implements(value="PendingSpawn")
public final class PendingSpawn
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1826074693)
    int field1188;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1092815759)
    int field1180;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1338651515)
    int field1187;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=826749675)
    int field1182;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-394823857)
    int field1181;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=256387703)
    int field1184;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=747731375)
    int field1179;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1755676369)
    int field1192;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1335351009)
    int field1185;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1025770941)
    int field1194;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1300377589)
    int field1189;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1299297955)
    int field1191 = 31;
    @ObfuscatedName(value="af")
    String[] field1193;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-2013521187)
    int field1183 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1548016443)
    int field1186 = -1;

    PendingSpawn() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-605399033")
    void method2754(int n) {
        this.field1191 = n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([Ljava/lang/String;I)V", garbageValue="-2023751041")
    void method2757(String[] stringArray) {
        this.field1193 = stringArray;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-294999815")
    boolean method2756(int n) {
        if (n >= 0 && n <= 4) {
            return (this.field1191 & 1 << n) != 0;
        }
        return true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1765665857")
    boolean method2753(int n) {
        return this.field1193 != null && n >= 0 && n < this.field1193.length && this.field1193[n] != null;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="-1743349630")
    String method2766(int n) {
        if (this.field1193 != null && n >= 0 && n < this.field1193.length) {
            return this.field1193[n];
        }
        return null;
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="2111659122")
    static int method2755(int n, Script script, boolean bl) {
        if (n != 6754) {
            if (n != 6764) {
                if (n != 6765) {
                    return 2;
                }
                NPCComposition nPCComposition = class446.getNpcDefinition(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = nPCComposition != null ? nPCComposition.combatLevel : 0;
                return 1;
            }
            NPCComposition nPCComposition = class446.getNpcDefinition(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2]);
            int n2 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = nPCComposition.method5330(n2);
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = nPCComposition.method5309(n2);
            return 1;
        }
        int n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        NPCComposition nPCComposition = class446.getNpcDefinition(n3);
        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = nPCComposition != null ? nPCComposition.name : "";
        return 1;
    }
}

