/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ri")
public class class461 {
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Ldi;")
    @Export(value="loginScreenRunesAnimation")
    static LoginScreenAnimation loginScreenRunesAnimation;
    @ObfuscatedName(value="ao")
    final Map field4949 = new HashMap();
    @ObfuscatedName(value="ad")
    final Map field4951 = new HashMap();
    @ObfuscatedName(value="an")
    final DecimalFormat field4950 = new DecimalFormat();

    public class461() {
        this.field4950.setMaximumFractionDigits(2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljavax/net/ssl/HttpsURLConnection;I)V", garbageValue="-1689943110")
    public void method8972(HttpsURLConnection httpsURLConnection) {
        Iterator iterator = this.field4949.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            httpsURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/Map;", garbageValue="-1327601977")
    public Map method8977() {
        return this.field4949;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="2117518336")
    public void method8974(String string, String string2) {
        if (string != null && !string.isEmpty()) {
            this.field4949.put(string, string2 != null ? string2 : "");
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-693629445")
    public void method8997(String string) {
        if (string != null && !string.isEmpty()) {
            this.field4949.remove(string);
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lrt;Ljava/lang/String;I)V", garbageValue="-1600766546")
    void method8976(class460 class4602, String string) {
        String string2 = String.format("%s %s", class4602.method8969(), string);
        this.method8974("Authorization", string2);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1997463583")
    public void method8975(String string) {
        this.method8976(class460.field4940, string);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="688799447")
    public void method8978(String string) {
        this.method8976(class460.field4941, string);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ltw;B)V", garbageValue="0")
    public void method8987(class502 class5022) {
        this.field4949.put("Content-Type", class5022.method9541());
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="52")
    public void method8980() {
        this.field4949.remove("Content-Type");
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ltw;I)V", garbageValue="162620677")
    public void method8981(class502 class5022) {
        this.method8982(class5022, 1.0f);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ltw;FB)V", garbageValue="58")
    void method8982(class502 class5022, float f) {
        this.field4951.put(class5022, Float.valueOf(Math.max(0.0f, Math.min(1.0f, f))));
        this.method8983();
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="126936831")
    void method8983() {
        this.field4949.remove("Accept");
        if (!this.field4951.isEmpty()) {
            this.field4949.put("Accept", this.method8984());
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="824234098")
    String method8984() {
        ArrayList arrayList = new ArrayList(this.field4951.entrySet());
        Collections.sort(arrayList, new class462(this));
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((class502)entry.getKey()).method9541());
            float f = ((Float)entry.getValue()).floatValue();
            if (!(f < 1.0f)) continue;
            String string = this.field4950.format(f);
            stringBuilder.append(";q=").append(string);
        }
        return stringBuilder.toString();
    }
}

