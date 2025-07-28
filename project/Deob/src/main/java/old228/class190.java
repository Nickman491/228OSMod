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

@ObfuscatedName(value="hs")
public abstract class class190
extends class510 {
    @ObfuscatedName(value="ef")
    @ObfuscatedGetter(intValue=-1363658001)
    public int field2116 = 1000;

    protected class190() {
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    protected class198 vmethod4447() {
        return null;
    }

    @ObfuscatedName(value="eq")
    void vmethod4616(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l, int n10, int n11, boolean bl) {
        class198 class1982 = this.vmethod4447();
        if (class1982 != null) {
            this.field2116 = class1982.field2116;
            int n12 = class182.field1954[n2];
            int n13 = class182.field1955[n2];
            int n14 = class182.field1954[n3];
            int n15 = class182.field1955[n3];
            class1982.method4570(n, n12, n13, n14, n15, n4 - n7, n5 - n8, n6 - n9, l);
        }
    }

    @ObfuscatedName(value="kl")
    @ObfuscatedSignature(descriptor="(ILqe;IIIJ)V")
    void vmethod4565(int n, class428 class4282, int n2, int n3, int n4, long l) {
        class198 class1982 = this.vmethod4447();
        if (class1982 != null) {
            this.field2116 = class1982.field2116;
            class1982.vmethod4565(n, class4282, n2, n3, n4, l);
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="81507739")
    static void method4460() {
        class84.field1035 = 99;
        class85.field1047 = new short[4][104][104];
        class80.field992 = new short[4][104][104];
        class84.field1027 = new byte[4][104][104];
        class84.field1026 = new byte[4][104][104];
        class538.field5380 = new int[4][105][105];
        class84.field1029 = new byte[4][105][105];
        class299.field3244 = new int[105][105];
        class229.field2487 = new int[104];
        class84.field1030 = new int[104];
        class84.field1042 = new int[104];
        class4.field6 = new int[104];
        class557.field5476 = new int[104];
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([Ljava/lang/String;[IB)V", garbageValue="-20")
    public static void method4461(String[] stringArray, int[] nArray) {
        class250.method5356(stringArray, nArray, 0, stringArray.length - 1);
    }

    @ObfuscatedName(value="lb")
    @ObfuscatedSignature(descriptor="(IIIIIIIIB)V", garbageValue="1")
    static final void method4459(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (class170.field1807.method7024(n)) {
            class10.field53 = null;
            class134.method3438(class170.field1807.field3772[n], -1, n2, n3, n4, n5, n6, n7, n8);
            if (class10.field53 != null) {
                class134.method3438(class10.field53, -1412584499, n2, n3, n4, n5, class433.field4786, class236.field2543, n8);
                class10.field53 = null;
            }
            return;
        }
        if (n8 != -1) {
            client.field713[n8] = true;
        } else {
            for (int i = 0; i < 100; ++i) {
                client.field713[i] = true;
            }
        }
    }
}

