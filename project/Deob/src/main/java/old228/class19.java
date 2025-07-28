package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="aw")
public class class19
implements Callable {
    @ObfuscatedName(value="ml")
    @ObfuscatedSignature(descriptor="Lhy;")
    static class194 field82;
    @ObfuscatedName(value="qz")
    @ObfuscatedSignature(descriptor="Les;")
    static class114 field80;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lau;")
    final class10 field83;
    @ObfuscatedSignature(descriptor="Laa;")
    final /* synthetic */ class14 this$0;

    @ObfuscatedSignature(descriptor="(Laa;Lau;)V")
    class19(class14 class1410, class10 class1010) {
        this.this$0 = class1410;
        this.field83 = class1010;
    }

    public Object call() throws Exception {
        try {
            while (this.field83.method90()) {
                class174.method3881(10L);
            }
        }
        catch (IOException iOException) {
            return new class20("Error servicing REST query: " + iOException.getMessage());
        }
        return this.field83.method91();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Lmb;", garbageValue="1134121866")
    static class324 method288() {
        if (class324.field3439 == 0) {
            return new class324();
        }
        return class324.field3438[--class324.field3439];
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="32")
    static int method285(int n, class81 class812, boolean bl) {
        class361 class3612;
        int n2 = -1;
        if (n < 2000) {
            class3612 = bl ? class134.field1564 : class9.field45;
        } else {
            n -= 1000;
            n2 = class72.field865[--class63.field444];
            class3612 = class170.field1807.method7031(n2);
        }
        if (n != 1000) {
            if (n != 1001) {
                boolean bl2;
                if (n != 1003) {
                    if (n != 1005) {
                        if (n != 1006) {
                            return 2;
                        }
                        class3612.field4025 = class72.field865[--class63.field444] == 1;
                        return 1;
                    }
                    class3612.field3951 = class72.field865[--class63.field444] == 1;
                    return 1;
                }
                boolean bl3 = bl2 = class72.field865[--class63.field444] == 1;
                if (bl2 != class3612.field3891) {
                    class3612.field3891 = bl2;
                    class122.method3325(class3612);
                }
                return 1;
            }
            class3612.field3929 = class72.field865[class63.field444 -= 4];
            class3612.field3933 = class72.field865[class63.field444 + 1];
            class3612.field3878 = class72.field865[class63.field444 + 2];
            class3612.field3879 = class72.field865[class63.field444 + 3];
            class122.method3325(class3612);
            client.field521.method1318(class3612);
            if (n2 != -1 && class3612.field3873 == 0) {
                class244.method5286(class170.field1807.field3772[n2 >> 16], class3612, false);
            }
            return 1;
        }
        class3612.field3880 = class72.field865[class63.field444 -= 4];
        class3612.field3926 = class72.field865[class63.field444 + 1];
        class3612.field3876 = class72.field865[class63.field444 + 2];
        class3612.field3877 = class72.field865[class63.field444 + 3];
        class122.method3325(class3612);
        client.field521.method1318(class3612);
        if (n2 != -1 && class3612.field3873 == 0) {
            class244.method5286(class170.field1807.field3772[n2 >> 16], class3612, false);
        }
        return 1;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="116531498")
    static final void method287() {
        String string = "Your ignore list is full. Max of 100 for free users, and 400 for members";
        class72.method2153(30, "", string);
    }
}

