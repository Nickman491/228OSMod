package old228;/*
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
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2501 = new class315(64);

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="12")
    static void method5134() {
        class480.field5036.trim();
        if (class480.field5036.length() == 6) {
            class326.field3592 = Integer.parseInt(class480.field5036);
            class480.field5036 = "";
            client.field629 = class78.field946 ? class146.field1662 : class146.field1664;
            class150.method3595("", "Connecting to server...", "");
            class360.method7405(20);
            return;
        }
        class150.method3595("", "Please enter a 6-digit PIN.", "");
    }
}

