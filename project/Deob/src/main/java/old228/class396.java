package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pb")
final class class396
implements Comparator {
    class396() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="-379028214")
    int method7884(class399 class3992, class399 class3993) {
        return class3992.field4638 < class3993.field4638 ? -1 : (class3993.field4638 == class3992.field4638 ? 0 : 1);
    }

    public int compare(Object object, Object object2) {
        return this.method7884((class399)object, (class399)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lae;", garbageValue="-787562554")
    public static class6[] method7886() {
        return new class6[]{class6.field20};
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BB)Ldm;", garbageValue="67")
    static class81 method7891(byte[] byArray) {
        int n;
        int n2;
        int n3;
        class81 class812 = new class81();
        class556 class5562 = new class556(byArray);
        class5562.field5471 = class5562.field5470.length - 2;
        int n4 = class5562.method10307();
        class5562.field5471 = n3 = class5562.field5470.length - 2 - n4 - 12;
        int n5 = class5562.method10440();
        class812.field1005 = class5562.method10307();
        class812.field1000 = class5562.method10307();
        class812.field1006 = class5562.method10307();
        class812.field1007 = class5562.method10307();
        int n6 = class5562.method10282();
        if (n6 > 0) {
            class812.field1008 = class812.method2477(n6);
            for (n2 = 0; n2 < n6; ++n2) {
                class529 class5292;
                n = class5562.method10307();
                class812.field1008[n2] = class5292 = new class529(n > 0 ? class357.method7049(n) : 1);
                while (n-- > 0) {
                    int n7 = class5562.method10440();
                    int n8 = class5562.method10440();
                    class5292.method9970(new class513(n8), n7);
                }
            }
        }
        class5562.field5471 = 0;
        class812.field1004 = class5562.method10360();
        class812.field1001 = new int[n5];
        class812.field1002 = new int[n5];
        class812.field1003 = new String[n5];
        n2 = 0;
        while (class5562.field5471 < n3) {
            n = class5562.method10307();
            if (n == 3) {
                class812.field1003[n2] = class5562.method10290();
            } else {
                class812.field1002[n2] = n < 100 && n != 21 && n != 38 && n != 39 ? class5562.method10440() : class5562.method10282();
            }
            class812.field1001[n2++] = n;
        }
        return class812;
    }
}

