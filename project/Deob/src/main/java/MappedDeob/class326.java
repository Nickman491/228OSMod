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

@ObfuscatedName(value="me")
public class class326
implements class321 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lme;")
    public static final class326 field3593 = new class326(14, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lme;")
    public static final class326 field3583 = new class326(15, 20);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lme;")
    public static final class326 field3584 = new class326(16, -2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lme;")
    public static final class326 field3582 = new class326(18, -2);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lme;")
    public static final class326 field3586 = new class326(19, -2);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lme;")
    public static final class326 field3587 = new class326(20, 58);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lme;")
    public static final class326 field3588 = new class326(21, 37);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lme;")
    static final class326 field3589 = new class326(27, 0);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lme;")
    static final class326[] field3585 = new class326[32];
    @ObfuscatedName(value="cr")
    @ObfuscatedGetter(intValue=-1437997089)
    static int field3592;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1117211653)
    public final int field3590;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=748387373)
    public final int field3591;

    static {
        class326[] class326Array = Clock.method5073();
        int n = 0;
        while (n < class326Array.length) {
            class326.field3585[class326Array[n].field3590] = class326Array[n];
            ++n;
        }
        return;
    }

    class326(int n, int n2) {
        this.field3590 = n;
        this.field3591 = n2;
    }
}

