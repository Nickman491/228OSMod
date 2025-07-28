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

@ObfuscatedName(value="uo")
@Implements(value="LoginType")
public class LoginType {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Luo;")
    @Export(value="oldscape")
    public static final LoginType oldscape = new LoginType(6, 0, "", "");
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Luo;")
    static final LoginType field5349 = new LoginType(3, 1, "", "");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Luo;")
    static final LoginType field5350 = new LoginType(0, 2, "", "");
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Luo;")
    static final LoginType field5348 = new LoginType(2, 3, "", "");
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Luo;")
    static final LoginType field5351 = new LoginType(5, 4, "", "");
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Luo;")
    static final LoginType field5353 = new LoginType(7, 5, "", "");
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Luo;")
    static final LoginType field5354 = new LoginType(1, 6, "", "");
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Luo;")
    static final LoginType field5355 = new LoginType(8, 7, "", "");
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Luo;")
    public static final LoginType field5358 = new LoginType(4, -1, "", "", true, new LoginType[]{oldscape, field5349, field5350, field5351, field5348});
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1619872421)
    final int field5357;
    @ObfuscatedName(value="au")
    final String field5356;

    LoginType(int n, int n2, String string, String string2) {
        this.field5357 = n;
        this.field5356 = string2;
    }

    @ObfuscatedSignature(descriptor="(IILjava/lang/String;Ljava/lang/String;Z[Luo;)V")
    LoginType(int n, int n2, String string, String string2, boolean bl, LoginType[] loginTypeArray) {
        this.field5357 = n;
        this.field5356 = string2;
    }

    public String toString() {
        return this.field5356;
    }
}

