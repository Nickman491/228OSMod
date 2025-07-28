package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ef")
public class class106 {
    @ObfuscatedName(value="ot")
    @ObfuscatedGetter(intValue=1925365391)
    static int field1365;
    @ObfuscatedName(value="st")
    @ObfuscatedSignature(descriptor="Lgk;")
    static class170 field1371;

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)Ljava/lang/String;", garbageValue="609674269")
    public static String method3069(CharSequence charSequence) {
        int n = charSequence.length();
        char[] cArray = new char[n];
        for (int i = 0; i < n; ++i) {
            cArray[i] = 42;
        }
        String string = new String(cArray);
        return string;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-29")
    static void method3078() {
        if (class544.field5403.method2887()) {
            class125.method3347(0, 0);
        } else {
            ArrayList<class345> arrayList = new ArrayList<class345>();
            arrayList.add(new class345((class391)class544.field5399, "scape main", "", 255, false));
            class1.method9(arrayList, 0, 0, 0, 100, false);
        }
    }

    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="(Lna;S)V", garbageValue="-32485")
    static void method3077(class361 class3612) {
        class3612.method7411();
        class3612.method7444().method7176(new class110(class3612));
        class3612.method7444().method7175(new class111(class3612));
    }
}

