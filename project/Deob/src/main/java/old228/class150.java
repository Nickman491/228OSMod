package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fp")
public abstract class class150
extends class514 {
    class150() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    abstract void vmethod3879(class556 var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    abstract void vmethod3882(class161 var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ldf;III)V", garbageValue="-2022231235")
    static void method3597(class90 class902, int n, int n2) {
        class81 class812;
        Object[] objectArray = class902.field1086;
        if (!class229.method5123(class902.field1087)) {
            int n3 = (Integer)objectArray[0];
            class812 = class34.method657(n3);
        } else {
            class124.field1499 = (class307)objectArray[0];
            class236 class2362 = class31.method498(class124.field1499.field3284);
            class812 = class544.method10135(class902.field1087, class2362.field2522, class2362.field2529);
        }
        if (class812 != null) {
            class427.method8367(class902, class812, n, n2);
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2034697086")
    public static void method3592() {
        try {
            class216.field2393.method10049();
            for (int i = 0; i < class438.field4823; ++i) {
                class121.field1484[i].method10049();
            }
            class216.field2394.method10049();
            class216.field2392.method10049();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue="1")
    static void method3595(String string, String string2, String string3) {
        class78.field936 = string;
        class78.field930 = string2;
        class78.field949 = string3;
    }

    @ObfuscatedName(value="mx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1872432444")
    static void method3598() {
        class89 class892 = (class89)client.field664.method9988();
        while (true) {
            block6: {
                if (class892 == null) {
                    return;
                }
                int n = class892.field1073;
                if (!class170.field1807.method7024(n)) break block6;
                boolean bl = true;
                class361[] class361Array = class170.field1807.field3772[n];
                int n2 = 0;
                while (true) {
                    block8: {
                        class361 class3612;
                        block7: {
                            if (n2 >= class361Array.length) break block7;
                            if (class361Array[n2] == null) break block8;
                            bl = class361Array[n2].field3991;
                        }
                        if (bl || (class3612 = class170.field1807.method7031(n2 = (int)class892.field5174)) == null) break;
                        class122.method3325(class3612);
                        break;
                    }
                    ++n2;
                }
            }
            class892 = (class89)client.field664.method9996();
        }
    }
}

