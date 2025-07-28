package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dq")
public class class102 {
    @ObfuscatedName(value="ad")
    boolean field1304;
    @ObfuscatedName(value="an")
    boolean field1317 = false;
    @ObfuscatedName(value="ae")
    boolean field1306;
    @ObfuscatedName(value="ax")
    boolean field1307 = false;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=360808631)
    int field1308;
    @ObfuscatedName(value="ac")
    double field1309 = 0.8;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=171288421)
    int field1313 = 127;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1833607591)
    int field1303 = 127;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-990493507)
    int field1312 = 127;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1053727429)
    int field1311 = -1;
    @ObfuscatedName(value="aa")
    String field1314 = null;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1867215081)
    int field1315 = 1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-971491863)
    int field1305 = 25;
    @ObfuscatedName(value="av")
    final Map field1302 = new LinkedHashMap();

    class102() {
        this.method2958(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedSignature(descriptor="(Lvy;)V")
    class102(class556 class5562) {
        if (class5562 != null && class5562.field5470 != null) {
            int n = class5562.method10282();
            if (n >= 0 && n <= 11) {
                if (class5562.method10282() == 1) {
                    this.field1304 = true;
                }
                if (n > 1) {
                    boolean bl = this.field1306 = class5562.method10282() == 1;
                }
                if (n > 3) {
                    this.field1315 = class5562.method10282();
                }
                if (n > 2) {
                    int n2 = class5562.method10282();
                    for (int i = 0; i < n2; ++i) {
                        int n3 = class5562.method10440();
                        int n4 = class5562.method10440();
                        this.field1302.put(n3, n4);
                    }
                }
                if (n > 4) {
                    this.field1314 = class5562.method10360();
                }
                if (n > 5) {
                    this.field1317 = class5562.method10410();
                }
                if (n > 6) {
                    this.field1309 = (double)class5562.method10282() / 100.0;
                    this.field1313 = class5562.method10282();
                    this.field1303 = class5562.method10282();
                    this.field1312 = class5562.method10282();
                }
                if (n > 7) {
                    this.field1311 = class5562.method10282();
                }
                if (n > 8) {
                    boolean bl = this.field1307 = class5562.method10282() == 1;
                }
                if (n > 9) {
                    this.field1308 = class5562.method10440();
                }
                if (n <= 10) return;
                this.field1305 = class5562.method10282();
                return;
            }
            this.method2958(true);
            return;
        }
        this.method2958(true);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-2087838146")
    void method2958(boolean bl) {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Lvy;", garbageValue="1462724230")
    class556 method2881() {
        class556 class5562 = new class556(418, true);
        class5562.method10300(11);
        class5562.method10300(this.field1304 ? 1 : 0);
        class5562.method10300(this.field1306 ? 1 : 0);
        class5562.method10300(this.field1315);
        class5562.method10300(this.field1302.size());
        Iterator iterator = this.field1302.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                class5562.method10442(this.field1314 != null ? this.field1314 : "");
                class5562.method10329(this.field1317);
                class5562.method10300((int)(100.0 * this.field1309));
                class5562.method10300(this.field1313);
                class5562.method10300(this.field1303);
                class5562.method10300(this.field1312);
                class5562.method10300(this.field1311);
                class5562.method10300(this.field1307 ? 1 : 0);
                class5562.method10268(this.field1308);
                class5562.method10300(this.field1305);
                return class5562;
            }
            Map.Entry entry = iterator.next();
            class5562.method10268((Integer)entry.getKey());
            class5562.method10268((Integer)entry.getValue());
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-65")
    void method2921(boolean bl) {
        this.field1304 = bl;
        class79.method2456();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1009742491")
    boolean method2890() {
        return this.field1304;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-417120502")
    void method2884(boolean bl) {
        this.field1317 = bl;
        class79.method2456();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-46")
    boolean method2974() {
        return this.field1317;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="60")
    void method2978(boolean bl) {
        this.field1306 = bl;
        class79.method2456();
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="1")
    boolean method2887() {
        return this.field1306;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1833834664")
    void method2899(boolean bl) {
        this.field1307 = bl;
        class79.method2456();
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-87")
    void method2889() {
        this.method2899(!this.field1307);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1426224813")
    boolean method2983() {
        return this.field1307;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1572518213")
    void method2891(int n) {
        this.field1308 = n;
        class79.method2456();
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="653163305")
    int method2892() {
        return this.field1308;
    }

    @ObfuscatedName(value="aa")
    void method2893(double d) {
        this.field1309 = d;
        class79.method2456();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)D", garbageValue="-92")
    double method2941() {
        return this.field1309;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1119003790")
    void method2888(int n) {
        this.field1313 = n;
        class79.method2456();
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="86")
    int method2896() {
        return this.field1313;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-87")
    void method2897(int n) {
        this.field1303 = n;
        class79.method2456();
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1475397758")
    int method2898() {
        return this.field1303;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1972871382")
    void method2967(int n) {
        this.field1312 = n;
        class79.method2456();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1048848")
    int method2900() {
        return this.field1312;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="18")
    void method2901(String string) {
        this.field1314 = string;
        class79.method2456();
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1521571253")
    String method2944() {
        return this.field1314;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1193428060")
    void method2903(int n) {
        this.field1311 = n;
        class79.method2456();
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-971303773")
    int method2904() {
        return this.field1311;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1679225530")
    void method2905(int n) {
        this.field1315 = n;
        class79.method2456();
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="120")
    int method2906() {
        return this.field1315;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)V", garbageValue="-992090634")
    void method2907(String string, int n) {
        int n2 = this.method2879(string);
        if (this.field1302.size() >= 10 && !this.field1302.containsKey(n2)) {
            Iterator iterator = this.field1302.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
        this.field1302.put(n2, n);
        class79.method2456();
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="-673907911")
    boolean method2894(String string) {
        int n = this.method2879(string);
        return this.field1302.containsKey(n);
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="-6")
    int method2909(String string) {
        int n = this.method2879(string);
        if (this.field1302.containsKey(n)) {
            return (Integer)this.field1302.get(n);
        }
        return 0;
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)I", garbageValue="370313994")
    int method2879(String string) {
        return class419.method8220(string.toLowerCase());
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-480240068")
    void method2911(int n) {
        this.field1305 = n;
        class230.method5124();
        class79.method2456();
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1062681713")
    int method2902() {
        return this.field1305;
    }

    @ObfuscatedName(value="ao")
    public static int method2988(long l) {
        return (int)(l >>> 0 & 0x7FL);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1874840281")
    static void method2989() {
        if ((class78.field955 = class78.field955.trim()).length() != 0) {
            if (class78.field940.length() != 0) {
                class150.method3595("", "Connecting to server...", "");
                client.field629 = class544.field5403.method2894(class78.field955) ? class146.field1659 : class146.field1661;
                class360.method7405(20);
                return;
            }
            class150.method3595("", "Please enter your password.", "");
            return;
        }
        class150.method3595("", "Please enter your username/email address.", "");
    }

    @ObfuscatedName(value="kw")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="1")
    static void method2990() {
        class188.method4443();
        client.field648.field5617[0] = -1;
        client.field648.field5618[0] = "Cancel";
        client.field648.field5619[0] = "";
        client.field648.field5614[0] = 1006;
        client.field648.field5628[0] = false;
        client.field648.field5623[0] = null;
        client.field648.field5612 = 1;
    }
}

