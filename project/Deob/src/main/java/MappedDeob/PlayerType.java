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

@ObfuscatedName(value="od")
@Implements(value="PlayerType")
public class PlayerType
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lod;")
    @Export(value="PlayerType_normal")
    static final /* enum */ PlayerType PlayerType_normal = new PlayerType("runelite", 0, 0, -1, true, false, true);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lod;")
    @Export(value="PlayerType_playerModerator")
    static final /* enum */ PlayerType PlayerType_playerModerator = new PlayerType("runelite", 1, 1, 0, true, true, true);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lod;")
    @Export(value="PlayerType_jagexModerator")
    static final /* enum */ PlayerType PlayerType_jagexModerator = new PlayerType("runelite", 2, 2, 1, true, true, false);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lod;")
    @Export(value="PlayerType_ironman")
    static final /* enum */ PlayerType PlayerType_ironman = new PlayerType("runelite", 3, 3, 2, false, false, true);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lod;")
    @Export(value="PlayerType_ultimateIronman")
    static final /* enum */ PlayerType PlayerType_ultimateIronman = new PlayerType("runelite", 4, 4, 3, false, false, true);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lod;")
    @Export(value="PlayerType_hardcoreIronman")
    static final /* enum */ PlayerType PlayerType_hardcoreIronman = new PlayerType("runelite", 5, 5, 10, false, false, true);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4514 = new PlayerType("runelite", 6, 6, 22, false, false, true);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4506 = new PlayerType("runelite", 7, 7, 41, false, false, true);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4507 = new PlayerType("runelite", 8, 8, 42, false, false, true);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4508 = new PlayerType("runelite", 9, 9, 43, false, false, true);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4511 = new PlayerType("runelite", 10, 10, 44, false, false, true);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4510 = new PlayerType("runelite", 11, 11, 45, false, false, true);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4509 = new PlayerType("runelite", 12, 12, 46, false, false, true);
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4512 = new PlayerType("runelite", 13, 13, 47, false, false, true);
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4505 = new PlayerType("runelite", 14, 14, 48, false, false, true);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4513 = new PlayerType("runelite", 15, 15, 49, false, false, true);
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ PlayerType field4515 = new PlayerType("runelite", 16, 16, 52, false, false, true);
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-143799401)
    @Export(value="id")
    final int id;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-579646627)
    @Export(value="modIcon")
    public final int modIcon;
    @ObfuscatedName(value="aw")
    @Export(value="isPrivileged")
    public final boolean isPrivileged;
    @ObfuscatedName(value="ai")
    @Export(value="isUser")
    public final boolean isUser;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    PlayerType(boolean bl, boolean bl2, boolean bl3) {
        void var7_5;
        void var6_4;
        void var2_-1;
        void var1_-1;
        this.id = bl ? 1 : 0;
        this.modIcon = bl2 ? 1 : 0;
        this.isPrivileged = var6_4;
        this.isUser = var7_5;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IZI)Ljava/lang/String;", garbageValue="656906203")
    @Export(value="intToString")
    public static String intToString(int n, boolean bl) {
        if (bl && n >= 0) {
            String string;
            block6: {
                int n2 = n;
                if (bl && n2 >= 0) {
                    int n3 = 2;
                    int n4 = n2 / 10;
                    while (true) {
                        if (n4 == 0) {
                            char[] cArray = new char[n3];
                            cArray[0] = 43;
                            int n5 = n3 - 1;
                            while (true) {
                                if (n5 <= 0) {
                                    string = new String(cArray);
                                    break block6;
                                }
                                int n6 = n2;
                                int n7 = n6 - (n2 /= 10) * 10;
                                cArray[n5] = n7 >= 10 ? (char)(n7 + 87) : (char)(n7 + 48);
                                --n5;
                            }
                        }
                        n4 /= 10;
                        ++n3;
                    }
                }
                string = Integer.toString(n2, 10);
            }
            return string;
        }
        return Integer.toString(n);
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(ILna;IIIII[FI)Lna;", garbageValue="821685708")
    static Widget method7660(int n, Widget widget, int n2, int n3, int n4, int n5, int n6, float[] fArray) {
        Widget widget2 = new Widget();
        widget2.type = n;
        widget2.parentId = widget.id;
        widget2.childIndex = n2;
        widget2.isIf3 = true;
        widget2.xAlignment = n3;
        widget2.yAlignment = n4;
        widget2.widthAlignment = n5;
        widget2.heightAlignment = n6;
        widget2.rawX = (int)(fArray[0] * (float)widget.width);
        widget2.rawY = (int)((float)(widget.height * -1528330031) * fArray[1]);
        widget2.rawWidth = (int)(fArray[2] * (float)widget.width);
        widget2.rawHeight = (int)((float)(widget.height * -1528330031) * fArray[3]);
        return widget2;
    }
}

