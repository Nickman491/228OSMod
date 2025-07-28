package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="rl")
public class class452 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1412212293)
    int field4878;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-2081520757)
    int field4877;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=538544891)
    int field4876;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-224863995)
    int field4879;

    public String toString() {
        int n = 10;
        int n2 = 10 - Integer.toString(this.field4878).length();
        int n3 = 10 - Integer.toString(this.field4876).length();
        int n4 = 10 - Integer.toString(this.field4877).length();
        String string = "          ".substring(10 - n2);
        String string2 = "          ".substring(10 - n3);
        String string3 = "          ".substring(10 - n4);
        return "    Size: " + this.field4878 + string + "Created: " + this.field4877 + string3 + "Total used: " + this.field4876 + string2 + "Max-In-Use: " + this.field4879;
    }
}

