package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="tf")
public class class514 {
    @ObfuscatedName(value="hs")
    public long field5174;
    @ObfuscatedName(value="hb")
    @ObfuscatedSignature(descriptor="Ltf;")
    public class514 field5173;
    @ObfuscatedName(value="he")
    @ObfuscatedSignature(descriptor="Ltf;")
    public class514 field5175;

    @ObfuscatedName(value="ku")
    public void method9623() {
        if (this.field5175 == null) {
            return;
        }
        this.field5175.field5173 = this.field5173;
        this.field5173.field5175 = this.field5175;
        this.field5173 = null;
        this.field5175 = null;
    }

    @ObfuscatedName(value="kn")
    public boolean method9627() {
        return this.field5175 != null;
    }
}

