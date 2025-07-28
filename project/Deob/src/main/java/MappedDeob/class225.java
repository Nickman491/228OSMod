/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName(value="ij")
public class class225 {
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lij;")
    static final class225 field2458 = new class225();
    @ObfuscatedName(value="aw")
    @Export(value="ByteArrayPool_arrays")
    static byte[][][] ByteArrayPool_arrays;
    @ObfuscatedName(value="ah")
    Map field2462 = new HashMap();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=903243181)
    int field2456 = 0;

    class225() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONObject;ILez;I)V", garbageValue="325593091")
    void method5051(JSONObject jSONObject, int n, UrlRequester urlRequester) {
        JSONObject jSONObject2;
        this.field2462.clear();
        try {
            jSONObject2 = jSONObject;
            this.field2456 = n;
            jSONObject2.getLong("lastfullsyncat");
            jSONObject2.getLong("lastcardupdatedat");
        }
        catch (Exception exception) {
            return;
        }
        try {
            this.method5050(jSONObject2.getJSONArray("crmcomponents"), this.field2456, urlRequester);
        }
        catch (Exception exception) {
            return;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONArray;ILez;I)V", garbageValue="-531552182")
    void method5050(JSONArray jSONArray, int n, UrlRequester urlRequester) throws JSONException {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); ++i) {
            String string;
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (!jSONObject.getString("game").equals("osrs") || jSONObject.getBoolean("removed") || (string = jSONObject.getString("platform")).equals("mobile") || string.equals("android") || string.equals("ios")) continue;
            class223 class2232 = new class223();
            try {
                class2232.method5007(jSONObject, n, urlRequester);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (class2232.field2443.isEmpty()) continue;
            String string2 = jSONObject.getString("location");
            this.field2462.put(string2, class2232);
        }
        this.field2462 = this.method5049();
        ReflectionCheck.method724();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Ljava/util/Map;", garbageValue="18")
    Map method5049() {
        HashMap hashMap = new HashMap();
        ArrayList<Map.Entry> arrayList = new ArrayList<Map.Entry>();
        arrayList.addAll(this.field2462.entrySet());
        boolean bl = false;
        block0: while (true) {
            if (bl) {
                Iterator iterator = arrayList.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return hashMap;
                    }
                    Map.Entry entry = (Map.Entry)iterator.next();
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            bl = true;
            int n = 0;
            while (true) {
                if (n >= arrayList.size() - 1) continue block0;
                if (((class223)((Map.Entry)arrayList.get(n)).getValue()).method5016() > ((class223)((Map.Entry)arrayList.get(n + 1)).getValue()).method5016()) {
                    Map.Entry entry = (Map.Entry)arrayList.get(n);
                    arrayList.set(n, (Map.Entry)arrayList.get(n + 1));
                    arrayList.set(n + 1, entry);
                    bl = false;
                }
                ++n;
            }
            break;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Lic;", garbageValue="42")
    class223 method5047(String string) {
        return (class223)this.field2462.get(string);
    }

    @ObfuscatedName(value="fp")
    @ObfuscatedSignature(descriptor="(I)Ltp;", garbageValue="-919439345")
    static class516 method5057() {
        return class437.field4816;
    }
}

