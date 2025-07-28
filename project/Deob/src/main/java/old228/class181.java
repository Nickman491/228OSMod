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

@ObfuscatedName(value="gu")
public final class class181
extends class514 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-774877491)
    int field1944;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=619029883)
    int field1929;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1814724795)
    int field1939;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1118517245)
    int field1931;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lhz;")
    class201 field1932;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lho;")
    class196 field1942;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lha;")
    class206 field1934;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lie;")
    class208 field1935;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lgi;")
    class178 field1936;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lgj;")
    class176 field1930;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=593224731)
    int field1938;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="[Lik;")
    class209[] field1943 = new class209[5];
    @ObfuscatedName(value="af")
    int[] field1940 = new int[5];
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-858281711)
    int field1941 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-885550693)
    int field1937;
    @ObfuscatedName(value="al")
    boolean field1928;
    @ObfuscatedName(value="av")
    boolean field1948;
    @ObfuscatedName(value="ag")
    boolean field1945;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1214984083)
    int field1950;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=243927097)
    int field1947;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1869939313)
    int field1946;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-64519713)
    int field1949;
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="Lgu;")
    class181 field1933;

    class181(int n, int n2, int n3) {
        this.field1931 = this.field1944 = n;
        this.field1929 = n2;
        this.field1939 = n3;
    }

    @ObfuscatedName(value="hc")
    @ObfuscatedSignature(descriptor="(Lna;IIB)V", garbageValue="119")
    static final void method4000(class361 class3612, int n, int n2) {
        if (client.field746 != 0 && client.field746 != 3) {
            return;
        }
        if (!client.field647 && (class35.field200 == 1 || !class25.field109 && class35.field200 == 4)) {
            class348 class3482 = class3612.method7446(class170.field1807, true);
            if (class3482 == null) {
                return;
            }
            int n3 = class35.field209 - n;
            int n4 = class35.field211 - n2;
            if (class3482.method6951(n3, n4)) {
                int n5 = client.field503 & 0x7FF;
                int n6 = class182.field1954[n5];
                int n7 = class182.field1955[n5];
                int n8 = n6 * (n4 -= class3482.field3753 / 2) + n7 * (n3 -= class3482.field3754 / 2) >> 11;
                int n9 = n7 * n4 - n6 * n3 >> 11;
                int n10 = class53.field339.vmethod9352() + n8 >> 7;
                int n11 = class53.field339.vmethod9331() - n9 >> 7;
                class324 class3242 = class90.method2629(class322.field3336, client.field564.field1446);
                class3242.field3442.method10300(18);
                class3242.field3442.method10300(client.field731.method5776(82) ? (client.field731.method5776(81) ? 2 : 1) : 0);
                class3242.field3442.method10266(n11 + class34.field189.field1325);
                class3242.field3442.method10319(n10 + class34.field189.field1324);
                class3242.field3442.method10300(n3);
                class3242.field3442.method10300(n4);
                class3242.field3442.method10266(client.field503);
                class3242.field3442.method10300(57);
                class3242.field3442.method10300(0);
                class3242.field3442.method10300(0);
                class3242.field3442.method10300(89);
                class3242.field3442.method10266(class407.field4693.field1213);
                class3242.field3442.method10266(class407.field4693.field1196);
                class3242.field3442.method10300(63);
                client.field564.method3257(class3242);
                client.field744 = n10;
                client.field745 = n11;
            }
        }
    }
}

