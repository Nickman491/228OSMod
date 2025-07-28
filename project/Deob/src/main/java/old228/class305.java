package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lv")
public class class305
extends class284 {
    @ObfuscatedName(value="tb")
    @ObfuscatedGetter(intValue=-1291871039)
    static int field3274;
    @ObfuscatedName(value="af")
    HashSet field3272;
    @ObfuscatedName(value="aa")
    HashSet field3273;
    @ObfuscatedName(value="ak")
    List field3271;

    class305() {
    }

    @ObfuscatedName(value="ck")
    @ObfuscatedSignature(descriptor="(Lvy;Lvy;IZI)V", garbageValue="-1315466009")
    void method6492(class556 class5562, class556 class5563, int n, boolean bl) {
        int n2;
        this.method6033(class5562, n);
        int n3 = class5563.method10307();
        this.field3272 = new HashSet(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            class279 class2792 = new class279();
            try {
                class2792.method5981(class5563);
            }
            catch (IllegalStateException illegalStateException) {
                continue;
            }
            this.field3272.add(class2792);
        }
        n2 = class5563.method10307();
        this.field3273 = new HashSet(n2);
        for (int i = 0; i < n2; ++i) {
            class287 class2872 = new class287();
            try {
                class2872.method6297(class5563);
            }
            catch (IllegalStateException illegalStateException) {
                continue;
            }
            this.field3273.add(class2872);
        }
        this.method6488(class5563, bl);
    }

    @ObfuscatedName(value="cs")
    @ObfuscatedSignature(descriptor="(Lvy;ZI)V", garbageValue="1912354326")
    void method6488(class556 class5562, boolean bl) {
        this.field3271 = new LinkedList();
        int n = class5562.method10307();
        int n2 = 0;
        while (n2 < n) {
            boolean bl2;
            int n3 = class5562.method10476();
            class350 class3502 = new class350(class5562.method10440());
            boolean bl3 = bl2 = class5562.method10282() == 1;
            if (bl || !bl2) {
                this.field3271.add(new class290(null, class3502, n3, null));
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="na")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="736875172")
    static final void method6494(int n, int n2) {
        class170 class1702;
        class170 class1703 = class1702 = n >= 0 ? client.field738[n] : class106.field1371;
        if (class1702 != null && n2 >= 0 && n2 < class1702.method3837()) {
            class152 class1522 = (class152)class1702.field1808.get(n2);
            if (class1522.field1686 != -1) {
                return;
            }
            String string = class1522.field1685.method10969();
            class324 class3242 = class90.method2629(class322.field3408, client.field564.field1446);
            class3242.field3442.method10300(3 + class91.method2631(string));
            class3242.field3442.method10300(n);
            class3242.field3442.method10266(n2);
            class3242.field3442.method10442(string);
            client.field564.method3257(class3242);
            return;
        }
    }
}

