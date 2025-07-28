package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ce")
public class RSAModule {
    @ObfuscatedName(value="ad")
    static final BigInteger field897 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
    @ObfuscatedName(value="an")
    static final BigInteger field900 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIS)I", garbageValue="4804")
    static int method2360(int n, int n2) {
        class87 class872 = (class87)class87.field1057.method9985(n);
        if (class872 == null) {
            return 0;
        }
        if (n2 == -1) {
            return 0;
        }
        int n3 = 0;
        int n4 = 0;
        while (n4 < class872.field1059.length) {
            if (class872.field1058[n4] == n2) {
                n3 += class872.field1059[n4];
            }
            ++n4;
        }
        return n3;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(IIII)I", garbageValue="1630366833")
    static final int method2359(int n, int n2, int n3) {
        int n4 = n / n3;
        int n5 = n & n3 - 1;
        int n6 = n2 / n3;
        int n7 = n2 & n3 - 1;
        int n8 = class374.method7622(n4, n6);
        int n9 = class374.method7622(n4 + 1, n6);
        int n10 = class374.method7622(n4, n6 + 1);
        int n11 = class374.method7622(n4 + 1, n6 + 1);
        int n12 = ObjectDef.method5559(n8, n9, n5, n3);
        int n13 = ObjectDef.method5559(n10, n11, n5, n3);
        return ObjectDef.method5559(n12, n13, n7, n3);
    }

    @ObfuscatedName(value="nn")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1194165105")
    static final void method2361(String string) {
        if (string.equals("")) {
            return;
        }
        class324 class3242 = class90.method2629(class322.field3405, client.field564.field1446);
        class3242.field3442.method10300(class91.method2631(string));
        class3242.field3442.method10442(string);
        client.field564.method3257(class3242);
    }
}

