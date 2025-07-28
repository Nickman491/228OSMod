package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kx")
public class class261 {
    @ObfuscatedName(value="wl")
    static Iterator field2784;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=565345345)
    public int field2785 = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=940153151)
    public int field2780 = 1;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1837690773)
    public int field2781 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1384611761)
    public int field2782 = 0;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1467658147)
    public int field2783 = 0;

    class261(int n, int n2, int n3, int n4, int n5) {
        this.field2785 = n;
        this.field2780 = n2;
        this.field2781 = n3;
        this.field2782 = n4;
        this.field2783 = n5;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)Ljava/lang/String;", garbageValue="2012062527")
    public static String method5505(class556 class5562) {
        String string;
        try {
            String string2;
            int n = class5562.method10407();
            if (n > Short.MAX_VALUE) {
                n = Short.MAX_VALUE;
            }
            byte[] byArray = new byte[n];
            class5562.field5471 += class364.field4040.method7573(class5562.field5470, class5562.field5471, byArray, 0, n);
            string = string2 = class394.method7867(byArray, 0, n);
        }
        catch (Exception exception) {
            string = "Cabbage";
        }
        return string;
    }
}

