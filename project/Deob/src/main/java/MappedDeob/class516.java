/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="tp")
public class class516
extends Node
implements class117 {
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=1393082803)
    public int field5209;
    @ObfuscatedName(value="bz")
    boolean field5191;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=1206120469)
    int field5192;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=545960241)
    int field5193;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=-1150279831)
    int field5214;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=759208093)
    int field5190;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=301269065)
    int field5196;
    @ObfuscatedName(value="bg")
    boolean field5197;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=1329796515)
    int field5195;
    @ObfuscatedName(value="bv")
    @ObfuscatedGetter(intValue=-1217104391)
    int field5199;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=1259023201)
    int field5200;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=1140546083)
    int field5201;
    @ObfuscatedName(value="bs")
    String field5202;
    @ObfuscatedName(value="bj")
    String field5215;
    @ObfuscatedName(value="bo")
    String field5203;
    @ObfuscatedName(value="be")
    String field5205;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=1323601925)
    int field5206;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=-2084912565)
    int field5207;
    @ObfuscatedName(value="bl")
    @ObfuscatedGetter(intValue=-148663737)
    int field5204;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=528559759)
    int field5194;
    @ObfuscatedName(value="cn")
    String field5210;
    @ObfuscatedName(value="cc")
    String field5183;
    @ObfuscatedName(value="co")
    int[] field5212 = new int[3];
    @ObfuscatedName(value="ca")
    @ObfuscatedGetter(intValue=600061171)
    int field5213;
    @ObfuscatedName(value="cg")
    String field5198;
    @ObfuscatedName(value="cp")
    String field5184;

    class516(int n, boolean bl, int n2, int n3, int n4, int n5, int n6, boolean bl2, int n7, int n8, int n9, int n10, String string, String string2, String string3, String string4, int n11, int n12, int n13, int n14, String string5, String string6, int[] nArray, int n15, String string7, String string8, String string9) {
        this.field5209 = n;
        this.field5191 = bl;
        this.field5192 = n2;
        this.field5193 = n3;
        this.field5214 = n4;
        this.field5190 = n5;
        this.field5196 = n6;
        this.field5197 = bl2;
        this.field5195 = n7;
        this.field5199 = n8;
        this.field5200 = n9;
        this.field5201 = n10;
        this.field5202 = string;
        this.field5215 = string2;
        this.field5203 = string3;
        this.field5205 = string4;
        this.field5206 = n11;
        this.field5207 = n12;
        this.field5204 = n13;
        this.field5194 = n14;
        this.field5210 = string5;
        this.field5183 = string6;
        this.field5212 = nArray;
        this.field5213 = n15;
        this.field5198 = string7;
        this.field5184 = string8;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-2001120490")
    public void method9653(Buffer buffer) {
        buffer.writeByte(9);
        buffer.writeByte(this.field5209);
        buffer.writeByte(this.field5191 ? 1 : 0);
        buffer.writeShort(this.field5192);
        buffer.writeByte(this.field5193);
        buffer.writeByte(this.field5214);
        buffer.writeByte(this.field5190);
        buffer.writeByte(this.field5196);
        buffer.writeByte(this.field5197 ? 1 : 0);
        buffer.writeShort(this.field5195);
        buffer.writeByte(this.field5199);
        buffer.method10267(this.field5200);
        buffer.writeShort(this.field5201);
        buffer.writeStringCp1252NullCircumfixed(this.field5202);
        buffer.writeStringCp1252NullCircumfixed(this.field5215);
        buffer.writeStringCp1252NullCircumfixed(this.field5203);
        buffer.writeStringCp1252NullCircumfixed(this.field5205);
        buffer.writeByte(this.field5207);
        buffer.writeShort(this.field5206);
        buffer.writeStringCp1252NullCircumfixed(this.field5210);
        buffer.writeStringCp1252NullCircumfixed(this.field5183);
        buffer.writeByte(this.field5204);
        buffer.writeByte(this.field5194);
        for (int i = 0; i < this.field5212.length; ++i) {
            buffer.method10268(this.field5212[i]);
        }
        buffer.method10268(this.field5213);
        buffer.writeStringCp1252NullCircumfixed(this.field5198);
        buffer.writeStringCp1252NullCircumfixed(this.field5184);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-44816718")
    public int method9654() {
        int n;
        int n2 = n = 39;
        String string = this.field5202;
        int n3 = string.length() + 2;
        int n4 = n = n3 + n2;
        String string2 = this.field5215;
        int n5 = string2.length() + 2;
        int n6 = n = n5 + n4;
        String string3 = this.field5203;
        int n7 = string3.length() + 2;
        int n8 = n = n7 + n6;
        String string4 = this.field5205;
        int n9 = string4.length() + 2;
        int n10 = n = n8 + n9;
        String string5 = this.field5210;
        int n11 = string5.length() + 2;
        int n12 = n = n10 + n11;
        String string6 = this.field5183;
        int n13 = string6.length() + 2;
        int n14 = n = n12 + n13;
        String string7 = this.field5198;
        int n15 = string7.length() + 2;
        int n16 = n = n14 + n15;
        String string8 = this.field5184;
        int n17 = string8.length() + 2;
        n = n17 + n16;
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/String;", garbageValue="-31")
    public String method9655(int n) {
        String string = "";
        String string2 = "12345678-0000-0000-0000-123456789012";
        switch (n) {
            default: {
                return "Unknown";
            }
            case 3: {
                string = "cat /etc/machine-id";
                break;
            }
            case 1: {
                string = "wmic csproduct get UUID";
                break;
            }
            case 2: {
                string = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
            }
        }
        BufferedReader bufferedReader = null;
        try {
            String string3;
            Process process = Runtime.getRuntime().exec(string);
            bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            while ((string3 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string3 + "\n");
            }
            if (n == 1) {
                string2 = stringBuilder.substring(stringBuilder.indexOf("\n"), stringBuilder.length()).trim();
            } else if (n == 2) {
                int n2 = stringBuilder.indexOf("UUID: ") + 36;
                string2 = stringBuilder.substring(stringBuilder.indexOf("UUID: "), n2).replace("UUID: ", "");
            } else if (n == 3) {
                if (stringBuilder.length() == 33) {
                    stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - 1));
                }
                if (stringBuilder.length() == 32) {
                    stringBuilder.insert(20, "-");
                    stringBuilder.insert(16, "-");
                    stringBuilder.insert(12, "-");
                    stringBuilder.insert(8, "-");
                    string2 = stringBuilder.toString();
                } else {
                    string2 = "12345678-0000-0000-0000-123456789012";
                }
            }
        }
        catch (Exception exception) {
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (IOException iOException) {}
        }
        return string2;
    }
}

