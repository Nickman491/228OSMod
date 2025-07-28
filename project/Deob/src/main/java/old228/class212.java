package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import old228.org.json.JSONObject;

@ObfuscatedName(value="ii")
public class class212 {
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lim;")
    class221 field2361;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lic;")
    class223 field2369;
    @ObfuscatedName(value="as")
    int field2368 = 1436922261;
    @ObfuscatedName(value="aq")
    String field2359;
    @ObfuscatedName(value="af")
    String field2365;
    @ObfuscatedName(value="aa")
    String field2363;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Len;")
    class120 field2367;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=771654159)
    int field2354 = 0;

    public class212() {
    }

    @ObfuscatedSignature(descriptor="(Lii;)V")
    public class212(class212 class2122) {
        if (class2122 == null) {
            return;
        }
        this.field2361 = class2122.field2361;
        this.field2369 = class2122.field2369;
        this.field2368 = class2122.field2368;
        this.field2359 = class2122.field2359;
        this.field2365 = class2122.field2365;
        this.field2363 = class2122.field2363;
        this.field2367 = null;
        this.field2354 = class2122.field2354;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Lim;", garbageValue="1449451292")
    public class221 method4873() {
        return this.field2361;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Lez;I)Z", garbageValue="-545197436")
    public boolean method4862(String string, String string2, URLLoader class1182) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (class1182 == null) {
            return false;
        }
        this.method4854();
        try {
            this.field2359 = string;
            this.field2367 = class1182.method3275(new URL(this.field2359));
            this.field2368 = 0;
        }
        catch (MalformedURLException malformedURLException) {
            this.method4854();
            this.field2368 = -1452721748;
            return false;
        }
        if (!string2.isEmpty()) {
            this.field2363 = string2;
        }
        return true;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="437756040")
    public void method4842(String string, String string2, String string3) {
        this.field2361 = class143.method3517();
        this.field2365 = string;
        this.field2361.method4975(this.field2365, string2, string3);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lez;B)V", garbageValue="-49")
    public void method4843(URLLoader class1182) {
        switch (this.field2368 * 1910697539) {
            case 0: {
                this.method4855(class1182);
                break;
            }
            default: {
                return;
            }
            case 1: {
                this.method4872();
            }
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="3")
    public int method4903() {
        return this.field2368 * 1910697539;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-106981991")
    public boolean method4845() {
        return this.field2369 != null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="89")
    public int method4846(String string) {
        return this.field2369.field2441.containsKey(string) ? (Integer)this.field2369.field2441.get(string) : -1;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/lang/String;", garbageValue="1417697798")
    public String method4848(String string) {
        return this.field2369.field2446.containsKey(string) ? this.field2369.field2446.get(string) : null;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/ArrayList;", garbageValue="-1990120736")
    public ArrayList method4902() {
        return this.field2369.field2444;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/ArrayList;", garbageValue="-2070590612")
    public ArrayList method4840() {
        return this.field2369.field2442;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)Ljava/util/ArrayList;", garbageValue="5")
    public ArrayList method4850() {
        return this.field2369.field2440;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1997297098")
    public String method4856() {
        return this.field2369.field2443;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(B)[F", garbageValue="-31")
    public float[] method4852() {
        return this.field2369.field2439;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="96")
    public String method4853() {
        return this.field2369.method5006();
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="275632040")
    void method4854() {
        this.field2367 = null;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lez;I)V", garbageValue="-1659335661")
    void method4855(URLLoader class1182) {
        if (this.field2367 == null || !this.field2367.method3302()) {
            return;
        }
        byte[] byArray = this.field2367.method3310();
        if (byArray == null) {
            this.method4854();
            this.field2368 = -1452721748;
            return;
        }
        try {
            class504 class5042 = new class504(byArray);
            JSONObject jSONObject = class5042.method9559();
            if (jSONObject == null) {
                return;
            }
            try {
                this.field2354 = jSONObject.getInt("version");
            }
            catch (Exception exception) {
                this.method4854();
                this.field2368 = -31598974;
                return;
            }
            if (this.field2354 < 2) {
                if (!this.field2369.method5007(jSONObject, this.field2354, class1182)) {
                    this.field2368 = -31598974;
                }
            } else if (this.field2354 == 2) {
                class225 class2252;
                class225 class2253 = class2252 = class225.field2458;
                class2253.method5051(jSONObject, this.field2354, class1182);
                this.field2369 = class2253.method5047(this.field2363);
                if (this.field2369 != null) {
                    this.method4872();
                    this.field2368 = -1436922261;
                } else {
                    this.field2368 = -1468521235;
                }
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            this.method4854();
            this.field2368 = -31598974;
            return;
        }
        if (this.field2369 != null) {
            this.field2368 = (this.field2369.field2444.size() > 0 ? 1 : 2) * -1436922261;
        }
        this.field2367 = null;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1762713959")
    void method4872() {
        class213 class2132;
        Iterator iterator = this.field2369.field2444.iterator();
        do {
            if (!iterator.hasNext()) {
                byte[] byArray;
                iterator = this.field2369.field2444.iterator();
                do {
                    if (!iterator.hasNext()) {
                        this.method4854();
                        this.field2368 = 1405323287;
                        return;
                    }
                    class2132 = (class213)iterator.next();
                } while (class2132.field2373 == null || (byArray = class2132.field2373.method3310()) == null || byArray.length <= 0);
                this.field2368 = 1421122774;
                return;
            }
            class2132 = (class213)iterator.next();
        } while (class2132.field2373 == null || class2132.field2373.method3302());
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lez;I)Z", garbageValue="2043188933")
    public boolean method4857(String string, URLLoader class1182) {
        try {
            JSONObject jSONObject = new class504(string.getBytes()).method9559();
            try {
                this.field2354 = jSONObject.getInt("version");
            }
            catch (Exception exception) {
                this.method4854();
                this.field2368 = -31598974;
                return false;
            }
            if (!this.field2369.method5007(jSONObject, this.field2354, class1182)) {
                this.field2368 = -31598974;
            }
            this.field2368 = (this.field2369.field2444.size() > 0 ? 1 : 2) * -1436922261;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            this.field2368 = -31598974;
        }
        return this.field2368 * 1910697539 < 3;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1891123145")
    static final boolean method4905(int n) {
        return n == 1 || n == 2 || n >= 3 && n <= 6 || n == 1001;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="1684634399")
    static final String method4858(int n) {
        if (n < 100000) {
            return "<col=ffff00>" + n + "</col>";
        }
        if (n < 10000000) {
            return "<col=ffffff>" + n / 1000 + "K" + "</col>";
        }
        return "<col=00ff80>" + n / 1000000 + "M" + "</col>";
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2113223016")
    static void method4849() {
        if (class280.method5990()) {
            class78.field950 = true;
            class78.field952 = 0;
            class78.field928 = 0;
        }
    }

    @ObfuscatedName(value="lm")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-309856839")
    static void method4861(int n, int n2) {
        class324 class3242 = class90.method2629(class322.field3335, client.field564.field1446);
        class3242.field3442.method10333(n);
        class3242.field3442.method10319(n2);
        client.field564.method3257(class3242);
    }
}

