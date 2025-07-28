package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="db")
public class class97
implements Iterable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ldz;")
    class103 field1178;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lue;")
    final class529 field1171 = new class529(16);
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1964738089)
    int field1176 = 0;
    @ObfuscatedName(value="ao")
    final HashMap field1173 = new HashMap(16);
    @ObfuscatedName(value="ad")
    final HashMap field1174 = new HashMap(16);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lsn;")
    class492 field1175 = class492.field5092;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lsl;")
    class491 field1170 = class491.field5087;

    class97() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIII)Ldz;", garbageValue="1069529031")
    class103 method2712(int n, int n2, int n3) {
        this.field1178 = this.method2713(-1, n, n2, n3, class175.field1837);
        return this.field1178;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIILgs;I)Ldz;", garbageValue="1552571679")
    class103 method2713(int n, int n2, int n3, int n4, class175 class1752) {
        class103 class1032 = new class103(n, n2, n3, n4, class1752);
        this.field1171.method9970(class1032, n);
        ++this.field1176;
        return class1032;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="-1414812928")
    void method2737(class103 class1032) {
        if (class1032 != null) {
            this.field1173.remove(class1032.field1320);
            this.field1174.remove(class1032.field1320);
            class1032.method9623();
            --this.field1176;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Ldz;", garbageValue="-421887075")
    public class103 method2726() {
        return this.field1178;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1850524275")
    int method2716() {
        return this.field1176;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lsn;Lsl;S)V", garbageValue="1540")
    void method2739(class492 class4922, class491 class4912) {
        this.field1175 = class4922;
        this.field1170 = class4912;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(ILsn;Lsl;B)V", garbageValue="-96")
    void method2718(int n, class492 class4922, class491 class4912) {
        this.field1173.put(n, class4922);
        this.field1174.put(n, class4912);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="104")
    void method2749(int n) {
        this.field1173.remove(n);
        this.field1174.remove(n);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IS)Lsn;", garbageValue="177")
    class492 method2720(int n) {
        class492 class4922 = (class492)this.field1173.get(n);
        return class4922 != null ? class4922 : this.field1175;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IB)Lsl;", garbageValue="-23")
    class491 method2740(int n) {
        class491 class4912 = (class491)this.field1174.get(n);
        return class4912 != null ? class4912 : this.field1170;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="2")
    void method2723() {
        this.field1171.method9968();
        this.field1176 = 0;
        this.field1173.clear();
        this.field1174.clear();
        this.field1175 = class492.field5092;
        this.field1170 = class491.field5087;
        if (this.field1178 != null) {
            this.field1178.method2991();
            this.field1171.method9970(this.field1178, -1L);
            this.field1176 = 1;
        }
    }

    public Iterator iterator() {
        return this.field1171.iterator();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/String;", garbageValue="29")
    static String method2752(int n) {
        return "<col=" + Integer.toHexString(n) + ">";
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="1")
    public static void method2751() {
        class256.field2730.method6581();
    }

    @ObfuscatedName(value="ke")
    @ObfuscatedSignature(descriptor="(Leq;B)V", garbageValue="20")
    static void method2736(class105 class1052) {
        class1052.field1268 = class1052.field1354.field2622 * 1387352433;
        class1052.field1200 = class1052.field1354.field2652;
        class1052.field1204 = class1052.field1354.field2628;
        class1052.field1223 = class1052.field1354.field2629;
        class1052.field1267 = class1052.field1354.field2630;
        class1052.field1207 = class1052.field1354.field2632;
        class1052.field1201 = class1052.field1354.field2627;
        class1052.field1202 = class1052.field1354.field2626;
        class1052.field1203 = class1052.field1354.field2644;
        class1052.field1257 = class1052.field1354.field2659;
        class1052.field1198 = class1052.field1354.field2633;
        class1052.field1210 = class1052.field1354.field2634;
        class1052.field1251 = class1052.field1354.field2623;
        class1052.field1212 = class1052.field1354.field2636;
        class1052.field1234 = class1052.field1354.field2649;
        class1052.field1214 = class1052.field1354.field2660;
        class1052.field1220 = class1052.field1354.field2639;
    }
}

