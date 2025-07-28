/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fe")
public class class145
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1652 = new class145("runelite", 0, 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1658 = new class145("runelite", 1, 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1649 = new class145("runelite", 2, 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1650 = new class145("runelite", 3, 3, 3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1651 = new class145("runelite", 4, 4, 4);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1647 = new class145("runelite", 5, 5, 5);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1648 = new class145("runelite", 6, 6, 6);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1653 = new class145("runelite", 7, 7, 7);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lfe;")
    static final /* enum */ class145 field1655 = new class145("runelite", 8, 8, 8);
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=950168225)
    final int field1654;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=855199151)
    final int field1657;

    /*
     * WARNING - void declaration
     */
    class145() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field1654 = var3_1;
        this.field1657 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field1657;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;", garbageValue="2060354283")
    static File method3556(String string, String string2, int n) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        String string3 = n == 0 ? "" : "" + n;
        JagexCache.field2389 = new File(class502.userHomeDirectory, "jagex_cl_" + string + "_" + string2 + string3 + ".dat");
        String string4 = null;
        String string5 = null;
        boolean bl = false;
        if (JagexCache.field2389.exists()) {
            object4 = null;
            try {
                int n2;
                object4 = new AccessFile(JagexCache.field2389, "rw", 10000L);
                object3 = new Buffer((int)((AccessFile)object4).length());
                while (((Buffer)object3).offset < ((Buffer)object3).array.length) {
                    n2 = ((AccessFile)object4).read(((Buffer)object3).array, ((Buffer)object3).offset, ((Buffer)object3).array.length - ((Buffer)object3).offset);
                    if (n2 == -1) {
                        throw new IOException();
                    }
                    ((Buffer)object3).offset += n2;
                }
                ((Buffer)object3).offset = 0;
                n2 = ((Buffer)object3).readUnsignedByte();
                if (n2 < 1 || n2 > 3) {
                    throw new IOException("" + n2);
                }
                int n3 = 0;
                if (n2 > 1) {
                    n3 = ((Buffer)object3).readUnsignedByte();
                }
                if (n2 <= 2) {
                    string4 = ((Buffer)object3).readStringCp1252NullCircumfixed();
                    if (n3 == 1) {
                        string5 = ((Buffer)object3).readStringCp1252NullCircumfixed();
                    }
                } else {
                    string4 = ((Buffer)object3).readCESU8();
                    if (n3 == 1) {
                        string5 = ((Buffer)object3).readCESU8();
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            finally {
                try {
                    if (object4 != null) {
                        ((AccessFile)object4).close();
                    }
                }
                catch (IOException iOException) {}
            }
            if (string4 != null && !((File)(object3 = new File(string4))).exists()) {
                string4 = null;
            }
            if (string4 != null && !HealthBar.method3008((File)(object3 = new File(string4, "test.dat")), true)) {
                string4 = null;
            }
        }
        if (string4 == null && n == 0) {
            block16: for (int i = 0; i < BuddyRankComparator.field1522.length; ++i) {
                for (int j = 0; j < class355.field3789.length; ++j) {
                    object2 = new File(class355.field3789[j] + BuddyRankComparator.field1522[i] + File.separatorChar + string + File.separatorChar);
                    if (!((File)object2).exists() || !HealthBar.method3008(new File((File)object2, "test.dat"), true)) continue;
                    string4 = ((File)object2).toString();
                    bl = true;
                    break block16;
                }
            }
        }
        if (string4 == null) {
            string4 = class502.userHomeDirectory + File.separatorChar + "jagexcache" + string3 + File.separatorChar + string + File.separatorChar + string2 + File.separatorChar;
            bl = true;
        }
        if (string5 != null) {
            object4 = new File(string5);
            object3 = new File(string4);
            try {
                object = object2 = ((File)object4).listFiles();
                for (int i = 0; i < ((File[])object).length; ++i) {
                    Object object5 = object[i];
                    File file = new File((File)object3, ((File)object5).getName());
                    boolean bl2 = ((File)object5).renameTo(file);
                    if (bl2) continue;
                    throw new IOException();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            bl = true;
        }
        if (bl) {
            object4 = new File(string4);
            object3 = null;
            try {
                object2 = new AccessFile(JagexCache.field2389, "rw", 10000L);
                object = new Buffer(500);
                ((Buffer)object).writeByte(3);
                ((Buffer)object).writeByte(object3 != null ? 1 : 0);
                ((Buffer)object).writeCESU8(((File)object4).getPath());
                if (object3 != null) {
                    ((Buffer)object).writeCESU8("");
                }
                ((AccessFile)object2).write(((Buffer)object).array, 0, ((Buffer)object).offset);
                ((AccessFile)object2).close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return new File(string4);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([F[II)V", garbageValue="162405776")
    public static void method3557(float[] fArray, int[] nArray) {
        class14.method187(fArray, nArray, 0, fArray.length - 1);
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="-1477331175")
    static boolean method3558(char c) {
        int n = 0;
        while (n < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length()) {
            if (c == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(n)) {
                return true;
            }
            ++n;
        }
        return false;
    }

    @ObfuscatedName(value="ha")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="1280")
    static final void method3555() {
        int n;
        int n2;
        int n3;
        if (Client.field669) {
            if (Client.field657 != null) {
                Buddy.cameraX = Client.field657.vmethod9687();
                class31.cameraZ = Client.field657.vmethod9688();
                Message.cameraY = !Client.field758 ? Canvas.method337(GameEngine.field189, Buddy.cameraX, class31.cameraZ, GameEngine.field189.field1321) - Client.field657.vmethod9689() : Client.field657.vmethod9689();
                Client.field657.method9700();
            }
        } else {
            n3 = Coord.method6980(LoginScreenAnimation.field1293);
            n2 = Coord.method6980(WorldMapAreaData.field3274);
            n = Canvas.method337(GameEngine.field189, n3, n2, GameEngine.field189.field1321) - class95.field1167;
            class374.method7623(n3, n, n2);
        }
        if (Client.field757) {
            if (Client.field761 != null) {
                class159.cameraPitch = Client.field761.method9684();
                class159.cameraPitch = Math.min(Math.max(class159.cameraPitch, 128), 383);
                Client.field761.method9700();
            }
            if (Client.field725 != null) {
                class183.cameraYaw = Client.field725.method9684() & 0x7FF;
                Client.field725.method9700();
            }
        } else {
            n3 = Coord.method6980(class280.field3067);
            n2 = Coord.method6980(Client.field801);
            n = Canvas.method337(GameEngine.field189, n3, n2, GameEngine.field189.field1321) - class416.field4710;
            int n4 = n3 - Buddy.cameraX;
            int n5 = n - Message.cameraY;
            int n6 = n2 - class31.cameraZ;
            int n7 = (int)Math.sqrt(n6 * n6 + n4 * n4);
            int n8 = (int)(Math.atan2(n5, n7) * (double)325.949f) & 0x7FF;
            int n9 = (int)(Math.atan2(n4, n6) * (double)-325.949f) & 0x7FF;
            GraphicsObject.method2358(n8, n9);
        }
    }
}

