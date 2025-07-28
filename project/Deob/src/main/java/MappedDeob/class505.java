/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="tk")
public class class505
implements class503 {
    @ObfuscatedName(value="ux")
    @ObfuscatedGetter(intValue=-171839523)
    static int field5142;
    @ObfuscatedName(value="ay")
    final Map field5143;

    public class505(Map map) {
        this.field5143 = map;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ltw;", garbageValue="-546778474")
    public class502 vmethod9572() {
        return null;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)[B", garbageValue="613600609")
    public byte[] vmethod9573() throws UnsupportedEncodingException {
        return this.method9574().getBytes("UTF-8");
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="43")
    public String method9574() throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.field5143.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (stringBuilder.length() == 0) {
                    return "";
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                stringBuilder.insert(0, "?");
                return stringBuilder.toString();
            }
            Map.Entry entry = iterator.next();
            String string = URLEncoder.encode((String)entry.getKey(), "UTF-8");
            String string2 = URLEncoder.encode((String)entry.getValue(), "UTF-8");
            stringBuilder.append(string).append("=").append(string2).append("&");
        }
    }
}

