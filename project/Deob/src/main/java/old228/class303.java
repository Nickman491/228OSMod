package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="le")
public class class303 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lle;")
    public static final class303 field3264 = new class303("details");
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lle;")
    public static final class303 field3269 = new class303("compositemap");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lle;")
    public static final class303 field3265 = new class303("compositetexture");
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lle;")
    static final class303 field3263 = new class303("area");
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lle;")
    public static final class303 field3267 = new class303("labels");
    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="Lql;")
    static class423 field3266;
    @ObfuscatedName(value="jc")
    static byte[][] field3270;
    @ObfuscatedName(value="an")
    public final String field3268;

    class303(String string) {
        this.field3268 = string;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-34")
    static void method6468(int n) {
        class87 class872 = (class87)class87.field1057.method9985(n);
        if (class872 == null) {
            return;
        }
        int n2 = 0;
        while (n2 < class872.field1058.length) {
            class872.field1058[n2] = -1;
            class872.field1059[n2] = 0;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lna;B)I", garbageValue="8")
    static int method6467(class361 class3612) {
        if (class3612.field3873 == 11) {
            String string = class72.field855[--class104.field1343];
            class72.field855[++class104.field1343 - 1] = class3612.method7548(string);
            return 1;
        }
        class72.field855[class104.field1343 - 1] = "";
        return 1;
    }
}

