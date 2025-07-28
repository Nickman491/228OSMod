/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName(value="cg")
@Implements(value="Decimator")
public class Decimator {
    @ObfuscatedName(value="ai")
    public static String field379;
    @ObfuscatedName(value="df")
    @ObfuscatedSignature(descriptor="Lvi;")
    @Export(value="worldSelectRightSprite")
    static IndexedSprite worldSelectRightSprite;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=801369339)
    @Export(value="inputRate")
    int inputRate;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=2125733325)
    @Export(value="outputRate")
    int outputRate;
    @ObfuscatedName(value="an")
    @Export(value="table")
    int[][] table;

    public Decimator(int n, int n2) {
        int n3;
        if (n2 == n) {
            return;
        }
        int n4 = n2;
        int n5 = n;
        if (n4 > n5) {
            n3 = n5;
            n5 = n4;
            n4 = n3;
        }
        while (true) {
            if (n4 == 0) {
                int n6;
                n3 = n6 = n5;
                this.inputRate = n /= n3;
                this.outputRate = n2 /= n3;
                this.table = new int[n][14];
                int n7 = 0;
                block1: while (true) {
                    int n8;
                    if (n7 >= n) {
                        return;
                    }
                    int[] nArray = this.table[n7];
                    double d = (double)n7 / (double)n + 6.0;
                    int n9 = (int)Math.floor(1.0 + (d - 7.0));
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if ((n8 = (int)Math.ceil(7.0 + d)) > 14) {
                        n8 = 14;
                    }
                    double d2 = (double)n2 / (double)n;
                    while (true) {
                        if (n9 >= n8) {
                            ++n7;
                            continue block1;
                        }
                        double d3 = ((double)n9 - d) * Math.PI;
                        double d4 = d2;
                        if (d3 < -1.0E-4 || d3 > 1.0E-4) {
                            d4 *= Math.sin(d3) / d3;
                        }
                        nArray[n9] = (int)Math.floor(65536.0 * (d4 *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * ((double)n9 - d))) + 0.5);
                        ++n9;
                    }
                    break;
                }
            }
            n3 = n5 % n4;
            n5 = n4;
            n4 = n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([BB)[B", garbageValue="1")
    @Export(value="resample")
    byte[] resample(byte[] byArray) {
        if (this.table == null) return byArray;
        int n = (int)((long)this.outputRate * (long)byArray.length / (long)this.inputRate) + 14;
        int[] nArray = new int[n];
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5;
            int n6;
            if (n4 >= byArray.length) {
                byArray = new byte[n];
                n4 = 0;
                while (true) {
                    if (n4 >= n) {
                        return byArray;
                    }
                    n6 = nArray[n4] + 32768 >> 16;
                    byArray[n4] = n6 < -128 ? -128 : (n6 > 127 ? 127 : (byte)n6);
                    ++n4;
                }
            }
            n6 = byArray[n4];
            int[] nArray2 = this.table[n3];
            for (n5 = 0; n5 < 14; ++n5) {
                int n7 = n5 + n2;
                nArray[n7] = nArray[n7] + n6 * nArray2[n5];
            }
            n5 = (n3 += this.outputRate) / this.inputRate;
            n2 += n5;
            n3 -= n5 * this.inputRate;
            ++n4;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-2139017699")
    @Export(value="scaleRate")
    int scaleRate(int n) {
        if (this.table != null) {
            n = (int)((long)this.outputRate * (long)n / (long)this.inputRate);
        }
        return n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1868959261")
    @Export(value="scalePosition")
    int scalePosition(int n) {
        if (this.table != null) {
            n = (int)((long)n * (long)this.outputRate / (long)this.inputRate) + 6;
        }
        return n;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONObject;Ljava/lang/String;I)[F", garbageValue="459813264")
    static float[] method1176(JSONObject jSONObject, String string) throws JSONException {
        float[] fArray = new float[4];
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(string);
            fArray[0] = (float)jSONArray.optDouble(0, 0.0);
            fArray[1] = (float)jSONArray.optDouble(1, 0.0);
            fArray[2] = (float)jSONArray.optDouble(2, 1.0);
            fArray[3] = (float)jSONArray.optDouble(3, 1.0);
        }
        catch (JSONException jSONException) {
            fArray[0] = 0.0f;
            fArray[1] = 0.0f;
            fArray[2] = 1.0f;
            fArray[3] = 1.0f;
        }
        return fArray;
    }

    @ObfuscatedName(value="iy")
    @ObfuscatedSignature(descriptor="(Ldx;III)V", garbageValue="1611710142")
    static void method1171(Player player, int n, int n2) {
        if (player.field1240 == n && n != -1) {
            int n3 = class33.SequenceDefinition_get((int)n).field2943;
            if (n3 == 1) {
                player.field1241 = 0;
                player.field1242 = 0;
                player.field1271 = n2;
                player.field1244 = 0;
            }
            if (n3 == 2) {
                player.field1244 = 0;
            }
        } else if (n == -1 || player.field1240 == -1 || class33.SequenceDefinition_get((int)n).field2930 >= class33.SequenceDefinition_get((int)player.field1240).field2930) {
            player.field1240 = n;
            player.field1241 = 0;
            player.field1242 = 0;
            player.field1271 = n2;
            player.field1244 = 0;
            player.field1270 = player.field1265;
        }
    }
}

