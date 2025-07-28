package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cs")
public class class73 {
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1413723299)
    static int field879;
    @ObfuscatedName(value="dr")
    @ObfuscatedSignature(descriptor="[Lvi;")
    static class569[] field878;
    @ObfuscatedName(value="ay")
    final ArrayList field880 = new ArrayList(1);
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1667597441)
    int field868 = -1;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=47291785)
    int field869 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lnz;")
    class350 field874 = new class350();
    @ObfuscatedName(value="ad")
    byte field871;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-46035771)
    int field876 = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-829208437)
    int field873 = -1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1058101899)
    int field872 = -1;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lkq;")
    class275 field875;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lvy;")
    class556 field870;
    @ObfuscatedName(value="au")
    String[] field877 = new String[3];

    class73(int n) {
        this.field868 = n;
        int n2 = 0;
        while (n2 < 3) {
            this.field877[n2] = "";
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1561621827")
    void method2271() {
        this.field870 = null;
        this.field880.clear();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-307331753")
    void method2272(int n) {
        this.field869 = n;
        this.field876 = 0;
        this.field873 = -1;
        this.field872 = -1;
        this.field871 = 0;
        this.field875 = class275.field3045;
        this.field870 = null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ldx;I)V", garbageValue="-631911090")
    void method2347(class94 class942) {
        this.field880.add(class942);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ldx;I)V", garbageValue="1053752896")
    void method2291(class94 class942) {
        this.field880.remove(class942);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(ILdz;I)Ldx;", garbageValue="-905733026")
    class94 method2275(int n, class103 class1032) {
        class94 class942 = new class94();
        class942.field1145 = n;
        if (this.field870 != null) {
            class942.method2654(this.field870);
        }
        class942.field1262 = this.field876;
        class942.field1230 = this.field872;
        class942.field1264[0] = this.field875;
        class942.field1137 = this.field874.field3766;
        class942.field1143 = class1032;
        class942.field1125 = this.field877;
        class942.method2667(this.field874.field3764 - class1032.field1324, this.field874.field3765 - class1032.field1325);
        return class942;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1150703408")
    boolean method2276() {
        return this.field869 == -1;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1481701847")
    void method2277() {
        this.field869 = this.field874.method6973();
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="76")
    void method2332(int n, int n2) {
        this.field874.method7009(this.field869, n, n2);
        this.field869 = -1;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-120")
    int method2328() {
        return this.field874.field3766;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1837717129")
    void method2326(int n) {
        this.field874.field3766 = n;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lkq;I)V", garbageValue="-1396544331")
    void method2297(class275 class2752) {
        int n = 0;
        while (n < this.field880.size()) {
            class94 class942 = (class94)this.field880.get(n);
            class103 class1032 = class942.field1143;
            int n2 = this.field874.field3764 - class1032.field1324;
            int n3 = this.field874.field3765 - class1032.field1325;
            class275 class2753 = class2752;
            int n4 = 1536;
            int n5 = 11776;
            if (class942 == class53.field339 && (class942.field1213 < 1536 || class942.field1196 < 1536 || class942.field1213 >= 11776 || class942.field1196 >= 11776)) {
                class2753 = class275.field3048;
            }
            class942.field1137 = this.field874.field3766;
            if (class2753 != class275.field3048) {
                class942.method2694(class1032, n2, n3, class2753);
            } else {
                class942.method2667(n2, n3);
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="123")
    void method2282(class556 class5562) {
        this.field870 = class5562;
        int n = 0;
        while (n < this.field880.size()) {
            ((class94)this.field880.get(n)).method2654(this.field870);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1568605273")
    void method2283(int n, int n2) {
        int n3 = 0;
        while (n3 < this.field880.size()) {
            class57.method1171((class94)this.field880.get(n3), n, n2);
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1042863806")
    void method2284(int n) {
        this.field872 = n;
        int n2 = 0;
        while (n2 < this.field880.size()) {
            ((class99)this.field880.get((int)n2)).field1230 = n;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1038905866")
    void method2285(String string) {
        boolean bl;
        boolean bl2 = bl = string.charAt(0) == '~';
        if (bl) {
            string = string.substring(1);
        }
        class579 class5792 = null;
        int n = 0;
        while (true) {
            if (n >= this.field880.size()) {
                if (class5792 != null) {
                    if (bl || this.field868 == client.field623) {
                        class72.method2153(2, class5792.method10969(), string);
                    }
                    return;
                }
                return;
            }
            class94 class942 = (class94)this.field880.get(n);
            class942.field1217 = false;
            class942.field1224 = 0;
            class942.field1215 = 0;
            class942.field1219 = 150;
            class942.field1216 = string;
            class5792 = class942.field1147;
            ++n;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIIIIB)V", garbageValue="-35")
    void method2329(int n, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        while (n6 < this.field880.size()) {
            ((class99)this.field880.get(n6)).method2776(n, n2, n3, n4, client.field514, n5);
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIIIIB)V", garbageValue="2")
    void method2287(int n, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        while (n6 < this.field880.size()) {
            ((class99)this.field880.get(n6)).method2789(n, client.field514, n2, n3, n4, n5);
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="97")
    void method2314(int n) {
        int n2 = 0;
        while (n2 < this.field880.size()) {
            ((class99)this.field880.get(n2)).method2778(n);
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-36")
    void method2288(int n) {
        this.field873 = n;
        int n2 = 0;
        while (n2 < this.field880.size()) {
            class94 class942 = (class94)this.field880.get(n2);
            class942.field1232 = this.field873;
            if (class942.field1265 == 0) {
                class942.field1262 = this.field873;
                class942.method2782();
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(ILod;ZLjava/lang/String;[BB)V", garbageValue="-75")
    void method2289(int n, class385 class3852, boolean bl, String string, byte[] byArray) {
        boolean bl2 = false;
        String string2 = null;
        int n2 = 0;
        while (true) {
            if (n2 >= this.field880.size()) {
                if (bl2 && string2 != null) {
                    if (!class3852.field4499) {
                        n2 = bl ? 90 : 2;
                    } else {
                        int n3 = n2 = bl ? 91 : 1;
                    }
                    if (class3852.field4517 == -1) {
                        class72.method2153(n2, string2, string);
                    } else {
                        class72.method2153(n2, class236.method5195(class3852.field4517) + string2, string);
                    }
                }
                return;
            }
            class94 class942 = (class94)this.field880.get(n2);
            if (class942.field1147 != null && class942.field1121 != null) {
                boolean bl3 = false;
                if (class3852.field4519 && class10.field54.method2025(class942.field1147)) {
                    bl3 = true;
                }
                if (!bl3 && client.field625 == 0 && !class942.field1138) {
                    int[] nArray;
                    block14: {
                        bl2 = true;
                        string2 = class942.field1147.method10969();
                        class942.field1216 = string.trim();
                        class942.field1224 = n >> 8;
                        class942.field1215 = n & 0xFF;
                        class942.field1219 = 150;
                        class94 class943 = class942;
                        byte[] byArray2 = byArray;
                        if (byArray2 != null && byArray2.length != 0 && byArray2.length <= 8) {
                            int[] nArray2 = new int[byArray2.length];
                            int n4 = 0;
                            while (true) {
                                if (n4 >= byArray2.length) {
                                    nArray = nArray2;
                                    break block14;
                                }
                                if (byArray2[n4] < 0 || byArray2[n4] >= class580.field5646.length) break;
                                nArray2[n4] = class580.field5646[byArray2[n4]];
                                ++n4;
                            }
                            nArray = null;
                        } else {
                            nArray = null;
                        }
                    }
                    class943.field1222 = nArray;
                    class942.field1217 = bl;
                    class942.field1218 = class942 != class407.field4693 && class3852.field4519 && !client.field516.isEmpty() && string.toLowerCase().indexOf(client.field516) == -1;
                }
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IIIIIIIZB)V", garbageValue="13")
    void method2290(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        int n8 = 0;
        while (n8 < this.field880.size()) {
            class94 class942 = (class94)this.field880.get(n8);
            class942.field1247 = n;
            class942.field1249 = n2;
            class942.field1248 = n3;
            class942.field1250 = n4;
            class942.field1263 = n5;
            class942.field1199 = n6;
            class942.field1253 = n7;
            if (!bl) {
                class942.field1247 += class942.field1266[0];
                class942.field1249 += class942.field1221[0];
                class942.field1248 += class942.field1266[0];
                class942.field1250 += class942.field1221[0];
                class942.field1265 = 1;
            } else {
                class103 class1032 = class942.field1143;
                int n9 = this.field874.field3764 - class1032.field1324;
                int n10 = this.field874.field3765 - class1032.field1325;
                class942.field1247 += n9;
                class942.field1249 += n10;
                class942.field1248 += n9;
                class942.field1250 += n10;
                class942.field1265 = 0;
            }
            class942.field1270 = 0;
            ++n8;
        }
        return;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="([Ljava/lang/String;B)V", garbageValue="59")
    void method2286(String[] stringArray) {
        this.field877 = Arrays.copyOf(stringArray, stringArray.length);
        int n = 0;
        while (n < this.field880.size()) {
            ((class94)this.field880.get((int)n)).field1125 = Arrays.copyOf(stringArray, stringArray.length);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IIBBBBI)V", garbageValue="781546064")
    void method2292(int n, int n2, byte by, byte by2, byte by3, byte by4) {
        int n3 = 0;
        while (n3 < this.field880.size()) {
            class94 class942 = (class94)this.field880.get(n3);
            class942.field1256 = n;
            class942.field1252 = n2;
            class942.field1258 = by;
            class942.field1211 = by2;
            class942.field1261 = by3;
            class942.field1208 = by4;
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="-67")
    void method2311(int n, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < this.field880.size()) {
            ((class99)this.field880.get(n5)).method2794(n, n2, n3, n4);
            ++n5;
        }
        return;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/Date;", garbageValue="1177085762")
    static Date method2338() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        simpleDateFormat.setLenient(false);
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = class78.field922;
        int n = 0;
        while (true) {
            if (n >= stringArray.length) {
                stringBuilder.append("12");
                return simpleDateFormat.parse(stringBuilder.toString());
            }
            String string = stringArray[n];
            if (string == null) break;
            stringBuilder.append(string);
            ++n;
        }
        class84.method2574("Date not valid.", "Please ensure all characters are populated.", "");
        return null;
    }
}

