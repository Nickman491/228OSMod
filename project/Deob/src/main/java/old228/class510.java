package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="tm")
public class class510
extends class514 {
    @ObfuscatedName(value="ei")
    public long field5167;
    @ObfuscatedName(value="ej")
    @ObfuscatedSignature(descriptor="Ltm;")
    public class510 field5168;
    @ObfuscatedName(value="eg")
    @ObfuscatedSignature(descriptor="Ltm;")
    public class510 field5169;

    @ObfuscatedName(value="kt")
    public void method9621() {
        if (this.field5169 == null) {
            return;
        }
        this.field5169.field5168 = this.field5168;
        this.field5168.field5169 = this.field5169;
        this.field5168 = null;
        this.field5169 = null;
    }
}

