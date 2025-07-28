package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.text.DecimalFormat;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dh")
public class class78 {
    @ObfuscatedName(value="ah")
    static boolean field937;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=842190767)
    static int field918;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lvi;")
    static class569 field921;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lvi;")
    static class569 field953;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lvi;")
    static class569 field923;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lvi;")
    static class569 field920;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-1302722243)
    static int field925;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=1956762505)
    static int field935;
    @ObfuscatedName(value="ab")
    static String field934;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=1208359389)
    static int field932;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=-530189941)
    static int field933;
    @ObfuscatedName(value="cn")
    @ObfuscatedGetter(intValue=-1665646229)
    static int field926;
    @ObfuscatedName(value="cc")
    static String field961;
    @ObfuscatedName(value="co")
    static String field936;
    @ObfuscatedName(value="ca")
    static String field930;
    @ObfuscatedName(value="cg")
    static String field949;
    @ObfuscatedName(value="cp")
    static String field955;
    @ObfuscatedName(value="cz")
    static String field940;
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
    static int field947;
    @ObfuscatedName(value="dk")
    static boolean field950;
    @ObfuscatedName(value="de")
    @ObfuscatedGetter(intValue=-379107653)
    static int field951;
    @ObfuscatedName(value="dw")
    @ObfuscatedGetter(intValue=1580884855)
    static int field952;
    @ObfuscatedName(value="dv")
    @ObfuscatedGetter(intValue=-677325775)
    static int field928;
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
        field918 = 0;
        field925 = field918 + 202;
        field935 = 10;
        field934 = "";
        field932 = -1;
        field933 = 1;
        field926 = 0;
        field961 = "";
        field936 = "";
        field930 = "";
        field949 = "";
        field955 = "";
        field940 = "";
        field941 = 0;
        field922 = new String[8];
        field943 = "";
        field944 = false;
        field945 = false;
        field946 = true;
        field947 = 0;
        field950 = false;
        field951 = -1;
        field952 = 0;
        field928 = 0;
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
        return class199.field2265;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="jl")
    @ObfuscatedSignature(descriptor="(IIIIIII)V", garbageValue="2034434558")
    static void method2450(int n, int n2, int n3, int n4, int n5, int n6) {
        class410 class4102 = class30.field131.field1327[n][n2][n3];
        if (class4102 == null) return;
        class109 class1092 = (class109)class4102.method7996();
        while (true) {
            block4: {
                block3: {
                    if (class1092 == null) break block3;
                    if ((n4 & Short.MAX_VALUE) != class1092.field1389 || n5 != class1092.field1385) break block4;
                    class1092.field1385 = n6;
                }
                class453.method8927(n, n2, n3);
                return;
            }
            class1092 = (class109)class4102.method8005();
        }
    }
}

