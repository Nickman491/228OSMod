/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ib")
public class class233
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static EvictingDualNodeHashTable field2501 = new EvictingDualNodeHashTable(64);

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="12")
    static void method5134() {
        class480.otp.trim();
        if (class480.otp.length() == 6) {
            class326.field3592 = Integer.parseInt(class480.otp);
            class480.otp = "";
            Client.field629 = Login.field946 ? class146.field1662 : class146.field1664;
            class150.setLoginResponseString("", "Connecting to server...", "");
            class360.updateGameState(20);
            return;
        }
        class150.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
    }
}

