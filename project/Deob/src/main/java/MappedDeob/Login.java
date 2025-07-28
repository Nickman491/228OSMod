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
import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dh")
@Implements(value="Login")
public class Login {
    @ObfuscatedName(value="ah")
    @Export(value="clearLoginScreen")
    static boolean clearLoginScreen;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=842190767)
    @Export(value="xPadding")
    static int xPadding;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lvi;")
    @Export(value="titleboxSprite")
    static IndexedSprite titleboxSprite;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lvi;")
    static IndexedSprite field953;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lvi;")
    @Export(value="logoSprite")
    static IndexedSprite logoSprite;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lvi;")
    static IndexedSprite field920;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-1302722243)
    @Export(value="loginBoxX")
    static int loginBoxX;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=1956762505)
    @Export(value="Login_loadingPercent")
    static int Login_loadingPercent;
    @ObfuscatedName(value="ab")
    @Export(value="Login_loadingText")
    static String Login_loadingText;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=1208359389)
    @Export(value="Login_banType")
    static int Login_banType;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=-530189941)
    static int field933;
    @ObfuscatedName(value="cn")
    @ObfuscatedGetter(intValue=-1665646229)
    @Export(value="loginIndex")
    static int loginIndex;
    @ObfuscatedName(value="cc")
    @Export(value="Login_response0")
    static String Login_response0;
    @ObfuscatedName(value="co")
    @Export(value="Login_response1")
    static String Login_response1;
    @ObfuscatedName(value="ca")
    @Export(value="Login_response2")
    static String Login_response2;
    @ObfuscatedName(value="cg")
    @Export(value="Login_response3")
    static String Login_response3;
    @ObfuscatedName(value="cp")
    @Export(value="Login_username")
    static String Login_username;
    @ObfuscatedName(value="cz")
    @Export(value="Login_password")
    static String Login_password;
    @ObfuscatedName(value="cu")
    @ObfuscatedGetter(intValue=-1569124111)
    static int field941;
    @ObfuscatedName(value="cq")
    static String[] field922;
    @ObfuscatedName(value="cw")
    static String field943;
    @ObfuscatedName(value="cm")
    static boolean field944;
    @ObfuscatedName(value="ce")
    static boolean field945;
    @ObfuscatedName(value="dh")
    static boolean field946;
    @ObfuscatedName(value="dn")
    @ObfuscatedGetter(intValue=-2132296769)
    @Export(value="currentLoginField")
    static int currentLoginField;
    @ObfuscatedName(value="dk")
    @Export(value="worldSelectOpen")
    static boolean worldSelectOpen;
    @ObfuscatedName(value="de")
    @ObfuscatedGetter(intValue=-379107653)
    @Export(value="hoveredWorldIndex")
    static int hoveredWorldIndex;
    @ObfuscatedName(value="dw")
    @ObfuscatedGetter(intValue=1580884855)
    @Export(value="worldSelectPage")
    static int worldSelectPage;
    @ObfuscatedName(value="dv")
    @ObfuscatedGetter(intValue=-677325775)
    @Export(value="worldSelectPagesCount")
    static int worldSelectPagesCount;
    @ObfuscatedName(value="dd")
    @ObfuscatedGetter(longValue=1896037882520525433L)
    static long field954;
    @ObfuscatedName(value="dy")
    @ObfuscatedGetter(longValue=7759505693981960565L)
    static long field927;
    @ObfuscatedName(value="db")
    static String[] field956;
    @ObfuscatedName(value="du")
    static String[] field960;
    @ObfuscatedName(value="da")
    static String[] field958;

    static {
        xPadding = 0;
        loginBoxX = xPadding + 202;
        Login_loadingPercent = 10;
        Login_loadingText = "";
        Login_banType = -1;
        field933 = 1;
        loginIndex = 0;
        Login_response0 = "";
        Login_response1 = "";
        Login_response2 = "";
        Login_response3 = "";
        Login_username = "";
        Login_password = "";
        field941 = 0;
        field922 = new String[8];
        field943 = "";
        field944 = false;
        field945 = false;
        field946 = true;
        currentLoginField = 0;
        worldSelectOpen = false;
        hoveredWorldIndex = -1;
        worldSelectPage = 0;
        worldSelectPagesCount = 0;
        new DecimalFormat("##0.00");
        new class140();
        field954 = -1L;
        field927 = -1L;
        field956 = new String[]{"title.jpg"};
        field960 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
        field958 = new String[]{"logo_speedrunning"};
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Ldw;", garbageValue="520429248")
    static class92[] method2388() {
        return new class92[]{class92.field1102, class92.field1108, class92.field1097, class92.field1100, class92.field1099};
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="905060007")
    static final boolean method2449() {
        return ViewportMouse.ViewportMouse_isInViewport;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="jl")
    @ObfuscatedSignature(descriptor="(IIIIIII)V", garbageValue="2034434558")
    static void method2450(int n, int n2, int n3, int n4, int n5, int n6) {
        NodeDeque nodeDeque = class30.field131.field1327[n][n2][n3];
        if (nodeDeque == null) return;
        TileItem tileItem = (TileItem)nodeDeque.last();
        while (true) {
            block4: {
                block3: {
                    if (tileItem == null) break block3;
                    if ((n4 & Short.MAX_VALUE) != tileItem.id || n5 != tileItem.field1385) break block4;
                    tileItem.field1385 = n6;
                }
                ByteArrayPool.method8927(n, n2, n3);
                return;
            }
            tileItem = (TileItem)nodeDeque.previous();
        }
    }
}

