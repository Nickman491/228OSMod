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

@ObfuscatedName(value="ae")
public class class6
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lae;")
    static final /* enum */ class6 field20 = new class6("runelite", 0, 0, 0);
    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="Lvg;")
    public static class567 field14;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1595182735)
    final int field15;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1657914651)
    final int field16;

    /*
     * WARNING - void declaration
     */
    class6() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field15 = var3_1;
        this.field16 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field16;
    }

    @ObfuscatedName(value="la")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;IIIII)I", garbageValue="-873550757")
    public static final int method44(String string, String string2, int n, int n2, int n3, int n4) {
        return class231.method5128(string, string2, n, n2, n3, n4, -1, false, -1);
    }

    @ObfuscatedName(value="ns")
    @ObfuscatedSignature(descriptor="(IIII)Ldt;", garbageValue="-1302722243")
    static final class89 method41(int n, int n2, int n3) {
        class89 class892 = new class89();
        class892.field1073 = n2;
        class892.field1072 = n3;
        client.field664.method9984(class892, n);
        class16.method211(n2);
        class361 class3612 = class170.field1807.method7031(n);
        class122.method3325(class3612);
        if (client.field668 != null) {
            class122.method3325(client.field668);
            client.field668 = null;
        }
        class244.method5286(class170.field1807.field3772[n >> 16], class3612, false);
        class290.method6334(n2);
        if (client.field663 != -1) {
            client.method1709(client.field663, 1);
        }
        return class892;
    }
}

