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

@ObfuscatedName(value="ie")
public final class class208 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=747575319)
    int field2331;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-2059859337)
    int field2323;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=73317568)
    int field2325;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-191954525)
    int field2326;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-110708295)
    int field2327;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1357881535)
    int field2330;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1936879603)
    int field2324;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lhs;")
    public class190 field2329;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lhs;")
    public class190 field2328;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(longValue=-1715493241959163543L)
    public long field2332 = 0L;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=682103303)
    int field2333 = 0;

    class208() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1147398537")
    public static int method4819(int n) {
        return (n & class550.field5423) - 1;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-323063316")
    static int method4820(int n, class81 class812, boolean bl) {
        class361 class3612;
        class361 class3613 = class3612 = bl ? class134.field1564 : class9.field45;
        if (n != 1800) {
            if (n != 1801) {
                if (n != 1802) {
                    return 2;
                }
                class72.field855[++class104.field1343 - 1] = class3612.field4024 == null ? "" : class3612.field4024;
                return 1;
            }
            int n2 = class72.field865[--class63.field444];
            class72.field855[++class104.field1343 - 1] = class3612.field3956 != null && --n2 < class3612.field3956.length && class3612.field3956[n2] != null ? class3612.field3956[n2] : "";
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class298.method6401(class232.method5133(class3612));
        return 1;
    }
}

