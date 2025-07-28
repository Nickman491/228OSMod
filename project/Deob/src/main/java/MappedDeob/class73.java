/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cs")
public class class73 {
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1413723299)
    @Export(value="cacheGamebuild")
    static int cacheGamebuild;
    @ObfuscatedName(value="dr")
    @ObfuscatedSignature(descriptor="[Lvi;")
    @Export(value="worldSelectFlagSprites")
    static IndexedSprite[] worldSelectFlagSprites;
    @ObfuscatedName(value="ay")
    final ArrayList field880 = new ArrayList(1);
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1667597441)
    int field868 = -1;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=47291785)
    int field869 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lnz;")
    Coord field874 = new Coord();
    @ObfuscatedName(value="ad")
    byte field871;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-46035771)
    int field876 = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-829208437)
    int field873 = -1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1058101899)
    int field872 = -1;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lkq;")
    class275 field875;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lvy;")
    Buffer field870;
    @ObfuscatedName(value="au")
    String[] field877 = new String[3];

    class73(int n) {
        this.field868 = n;
        int n2 = 0;
        while (n2 < 3) {
            this.field877[n2] = "";
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1561621827")
    void method2271() {
        this.field870 = null;
        this.field880.clear();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-307331753")
    void method2272(int n) {
        this.field869 = n;
        this.field876 = 0;
        this.field873 = -1;
        this.field872 = -1;
        this.field871 = 0;
        this.field875 = class275.field3045;
        this.field870 = null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ldx;I)V", garbageValue="-631911090")
    void method2347(Player player) {
        this.field880.add(player);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ldx;I)V", garbageValue="1053752896")
    void method2291(Player player) {
        this.field880.remove(player);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(ILdz;I)Ldx;", garbageValue="-905733026")
    Player method2275(int n, class103 class1032) {
        Player player = new Player();
        player.field1145 = n;
        if (this.field870 != null) {
            player.read(this.field870);
        }
        player.field1262 = this.field876;
        player.field1230 = this.field872;
        player.field1264[0] = this.field875;
        player.plane = this.field874.plane;
        player.field1143 = class1032;
        player.field1125 = this.field877;
        player.resetPath(this.field874.x - class1032.field1324, this.field874.y - class1032.field1325);
        return player;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1150703408")
    boolean method2276() {
        return this.field869 == -1;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1481701847")
    void method2277() {
        this.field869 = this.field874.method6973();
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="76")
    void method2332(int n, int n2) {
        this.field874.method7009(this.field869, n, n2);
        this.field869 = -1;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-120")
    int method2328() {
        return this.field874.plane;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1837717129")
    void method2326(int n) {
        this.field874.plane = n;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lkq;I)V", garbageValue="-1396544331")
    void method2297(class275 class2752) {
        int n = 0;
        while (n < this.field880.size()) {
            Player player = (Player)this.field880.get(n);
            class103 class1032 = player.field1143;
            int n2 = this.field874.x - class1032.field1324;
            int n3 = this.field874.y - class1032.field1325;
            class275 class2753 = class2752;
            int n4 = 1536;
            int n5 = 11776;
            if (player == class53.field339 && (player.x < 1536 || player.field1196 < 1536 || player.x >= 11776 || player.field1196 >= 11776)) {
                class2753 = class275.field3048;
            }
            player.plane = this.field874.plane;
            if (class2753 != class275.field3048) {
                player.method2694(class1032, n2, n3, class2753);
            } else {
                player.resetPath(n2, n3);
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="123")
    void method2282(Buffer buffer) {
        this.field870 = buffer;
        int n = 0;
        while (n < this.field880.size()) {
            ((Player)this.field880.get(n)).read(this.field870);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1568605273")
    void method2283(int n, int n2) {
        int n3 = 0;
        while (n3 < this.field880.size()) {
            Decimator.method1171((Player)this.field880.get(n3), n, n2);
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1042863806")
    void method2284(int n) {
        this.field872 = n;
        int n2 = 0;
        while (n2 < this.field880.size()) {
            ((Actor)this.field880.get((int)n2)).field1230 = n;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1038905866")
    void method2285(String string) {
        boolean bl;
        boolean bl2 = bl = string.charAt(0) == '~';
        if (bl) {
            string = string.substring(1);
        }
        Username username = null;
        int n = 0;
        while (true) {
            if (n >= this.field880.size()) {
                if (username != null) {
                    if (bl || this.field868 == Client.field623) {
                        Interpreter.addGameMessage(2, username.getName(), string);
                    }
                    return;
                }
                return;
            }
            Player player = (Player)this.field880.get(n);
            player.field1217 = false;
            player.field1224 = 0;
            player.field1215 = 0;
            player.field1219 = 150;
            player.field1216 = string;
            username = player.username;
            ++n;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIIIIB)V", garbageValue="-35")
    void method2329(int n, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        while (n6 < this.field880.size()) {
            ((Actor)this.field880.get(n6)).addHitSplat(n, n2, n3, n4, Client.cycle, n5);
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIIIIB)V", garbageValue="2")
    void method2287(int n, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        while (n6 < this.field880.size()) {
            ((Actor)this.field880.get(n6)).addHealthBar(n, Client.cycle, n2, n3, n4, n5);
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="97")
    void method2314(int n) {
        int n2 = 0;
        while (n2 < this.field880.size()) {
            ((Actor)this.field880.get(n2)).removeHealthBar(n);
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-36")
    void method2288(int n) {
        this.field873 = n;
        int n2 = 0;
        while (n2 < this.field880.size()) {
            Player player = (Player)this.field880.get(n2);
            player.field1232 = this.field873;
            if (player.field1265 == 0) {
                player.field1262 = this.field873;
                player.method2782();
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(ILod;ZLjava/lang/String;[BB)V", garbageValue="-75")
    void method2289(int n, PlayerType playerType, boolean bl, String string, byte[] byArray) {
        boolean bl2 = false;
        String string2 = null;
        int n2 = 0;
        while (true) {
            if (n2 >= this.field880.size()) {
                if (bl2 && string2 != null) {
                    if (!playerType.isPrivileged) {
                        n2 = bl ? 90 : 2;
                    } else {
                        int n3 = n2 = bl ? 91 : 1;
                    }
                    if (playerType.modIcon == -1) {
                        Interpreter.addGameMessage(n2, string2, string);
                    } else {
                        Interpreter.addGameMessage(n2, WorldMapElement.method1919(playerType.modIcon) + string2, string);
                    }
                }
                return;
            }
            Player player = (Player)this.field880.get(n2);
            if (player.username != null && player.appearance != null) {
                boolean bl3 = false;
                if (playerType.isUser && class10.friendSystem.isIgnored(player.username)) {
                    bl3 = true;
                }
                if (!bl3 && Client.field625 == 0 && !player.field1138) {
                    int[] nArray;
                    block14: {
                        bl2 = true;
                        string2 = player.username.getName();
                        player.field1216 = string.trim();
                        player.field1224 = n >> 8;
                        player.field1215 = n & 0xFF;
                        player.field1219 = 150;
                        Player player2 = player;
                        byte[] byArray2 = byArray;
                        if (byArray2 != null && byArray2.length != 0 && byArray2.length <= 8) {
                            int[] nArray2 = new int[byArray2.length];
                            int n4 = 0;
                            while (true) {
                                if (n4 >= byArray2.length) {
                                    nArray = nArray2;
                                    break block14;
                                }
                                if (byArray2[n4] < 0 || byArray2[n4] >= class580.field5646.length) break;
                                nArray2[n4] = class580.field5646[byArray2[n4]];
                                ++n4;
                            }
                            nArray = null;
                        } else {
                            nArray = null;
                        }
                    }
                    player2.field1222 = nArray;
                    player.field1217 = bl;
                    player.field1218 = player != ModeWhere.localPlayer && playerType.isUser && !Client.field516.isEmpty() && string.toLowerCase().indexOf(Client.field516) == -1;
                }
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IIIIIIIZB)V", garbageValue="13")
    void method2290(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        int n8 = 0;
        while (n8 < this.field880.size()) {
            Player player = (Player)this.field880.get(n8);
            player.field1247 = n;
            player.field1249 = n2;
            player.field1248 = n3;
            player.field1250 = n4;
            player.field1263 = n5;
            player.field1199 = n6;
            player.field1253 = n7;
            if (!bl) {
                player.field1247 += player.field1266[0];
                player.field1249 += player.field1221[0];
                player.field1248 += player.field1266[0];
                player.field1250 += player.field1221[0];
                player.field1265 = 1;
            } else {
                class103 class1032 = player.field1143;
                int n9 = this.field874.x - class1032.field1324;
                int n10 = this.field874.y - class1032.field1325;
                player.field1247 += n9;
                player.field1249 += n10;
                player.field1248 += n9;
                player.field1250 += n10;
                player.field1265 = 0;
            }
            player.field1270 = 0;
            ++n8;
        }
        return;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="([Ljava/lang/String;B)V", garbageValue="59")
    void method2286(String[] stringArray) {
        this.field877 = Arrays.copyOf(stringArray, stringArray.length);
        int n = 0;
        while (n < this.field880.size()) {
            ((Player)this.field880.get((int)n)).field1125 = Arrays.copyOf(stringArray, stringArray.length);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IIBBBBI)V", garbageValue="781546064")
    void method2292(int n, int n2, byte by, byte by2, byte by3, byte by4) {
        int n3 = 0;
        while (n3 < this.field880.size()) {
            Player player = (Player)this.field880.get(n3);
            player.field1256 = n;
            player.field1252 = n2;
            player.field1258 = by;
            player.field1211 = by2;
            player.field1261 = by3;
            player.field1208 = by4;
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="-67")
    void method2311(int n, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < this.field880.size()) {
            ((Actor)this.field880.get(n5)).method2794(n, n2, n3, n4);
            ++n5;
        }
        return;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/Date;", garbageValue="1177085762")
    static Date method2338() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        simpleDateFormat.setLenient(false);
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = Login.field922;
        int n = 0;
        while (true) {
            if (n >= stringArray.length) {
                stringBuilder.append("12");
                return simpleDateFormat.parse(stringBuilder.toString());
            }
            String string = stringArray[n];
            if (string == null) break;
            stringBuilder.append(string);
            ++n;
        }
        Tiles.method2574("Date not valid.", "Please ensure all characters are populated.", "");
        return null;
    }
}

