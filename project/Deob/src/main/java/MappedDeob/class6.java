/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ae")
public class class6
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lae;")
    static final /* enum */ class6 field20 = new class6("runelite", 0, 0, 0);
    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="Lvg;")
    @Export(value="rasterProvider")
    public static AbstractRasterProvider rasterProvider;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1595182735)
    final int field15;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1657914651)
    final int field16;

    /*
     * WARNING - void declaration
     */
    class6() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field15 = var3_1;
        this.field16 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field16;
    }

    @ObfuscatedName(value="la")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;IIIII)I", garbageValue="-873550757")
    public static final int method44(String string, String string2, int n, int n2, int n3, int n4) {
        return class231.method5128(string, string2, n, n2, n3, n4, -1, false, -1);
    }

    @ObfuscatedName(value="ns")
    @ObfuscatedSignature(descriptor="(IIII)Ldt;", garbageValue="-1302722243")
    static final InterfaceParent method41(int n, int n2, int n3) {
        InterfaceParent interfaceParent = new InterfaceParent();
        interfaceParent.group = n2;
        interfaceParent.type = n3;
        Client.interfaceParents.put(interfaceParent, n);
        class16.method211(n2);
        Widget widget = ClanChannel.field1807.method7031(n);
        UserComparator8.invalidateWidget(widget);
        if (Client.meslayerContinueWidget != null) {
            UserComparator8.invalidateWidget(Client.meslayerContinueWidget);
            Client.meslayerContinueWidget = null;
        }
        class244.revalidateWidgetScroll(ClanChannel.field1807.field3772[n >> 16], widget, false);
        WorldMapIcon_0.method6334(n2);
        if (Client.rootInterface != -1) {
            Client.method1709(Client.rootInterface, 1);
        }
        return interfaceParent;
    }
}

