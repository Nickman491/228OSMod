/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="by")
public class class36 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lps;")
    @Export(value="reflectionChecks")
    public static IterableNodeDeque reflectionChecks = new IterableNodeDeque();

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;Lks;I)Z", garbageValue="1407636165")
    public static boolean method722(Buffer buffer, class274 class2742) {
        byte by = buffer.readByte();
        if (by != 0) {
            int n = class9.method65(buffer, by, 0);
            int n2 = class9.method65(buffer, by, 2);
            int n3 = class9.method65(buffer, by, 4);
            int n4 = class9.method65(buffer, by, 6);
            class2742.method5921(n, n2, n3, n4);
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="554766994")
    static int method716(int n, int n2) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.get(n);
        if (itemContainer == null) {
            return -1;
        }
        if (n2 >= 0 && n2 < itemContainer.ids.length) {
            return itemContainer.ids[n2];
        }
        return -1;
    }

    @ObfuscatedName(value="ic")
    @ObfuscatedSignature(descriptor="(Ldz;B)V", garbageValue="0")
    static void method718(class103 class1032) {
        int n;
        int n2 = n = Client.field648.field5612 - 1;
        if (GameEngine.field189 == class1032 && n2 >= 0 && Client.field648.field5614[n2] == 60) {
            int n3 = Client.field648.field5615[n2] * 128;
            int n4 = 384;
            int n5 = Math.max(384, 2000 - Client.viewportZoom * 2);
            int n6 = class53.field339.vmethod9352() - (int)(GrandExchangeOffer.method7927(n3) * (double)n5);
            int n7 = class53.field339.vmethod9331() - (int)(class520.method9685(n3) * (double)n5);
            int n8 = Canvas.method337(class1032, class53.field339.vmethod9352(), class53.field339.vmethod9331(), class53.field339.vmethod9290());
            class1032.field1319.method4185(class1032.field1321, n6, n7, n8, 60, class53.field338, n3, 0L, false);
        }
    }

    @ObfuscatedName(value="ln")
    @ObfuscatedSignature(descriptor="(Lcr;IIS)V", garbageValue="512")
    static final void method721(MenuAction menuAction, int n, int n2) {
        if (menuAction != null) {
            class508.method9611(menuAction.field914, menuAction.field911, menuAction.field906, menuAction.field904, menuAction.field908, menuAction.field909, menuAction.field910, menuAction.field907, n, n2);
        }
    }
}

