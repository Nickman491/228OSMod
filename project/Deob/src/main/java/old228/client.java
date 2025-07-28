package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  netscape.javascript.JSObject
 */
import old228.com.jagex.oldscape.pub.OAuthApi;
import old228.com.jagex.oldscape.pub.OtlTokenRequester;
import old228.com.jagex.oldscape.pub.OtlTokenResponse;
import old228.com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import old228.com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.applet.Applet;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import old228.org.json.JSONException;
import old228.org.json.JSONObject;

public final class client
extends class34
implements class468,
OAuthApi,
class339 {
    @ObfuscatedName(value="wq")
    @ObfuscatedSignature(descriptor="Lkk;")
    static final class277 field793;
    @ObfuscatedName(value="wu")
    @ObfuscatedSignature(descriptor="Lci;")
    static final class65 field798;
    @ObfuscatedName(value="xj")
    static int[] field799;
    @ObfuscatedName(value="xd")
    static int[] field800;
    @ObfuscatedName(value="wy")
    static ArrayList field795;
    @ObfuscatedName(value="wa")
    @ObfuscatedGetter(intValue=1988557135)
    static int field542;
    @ObfuscatedName(value="wp")
    @ObfuscatedGetter(intValue=1265137461)
    static int field692;
    @ObfuscatedName(value="wf")
    @ObfuscatedGetter(intValue=-260278961)
    static int field794;
    @ObfuscatedName(value="wo")
    static List field792;
    @ObfuscatedName(value="br")
    static client field521;
    @ObfuscatedName(value="bl")
    static boolean field497;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=-981379219)
    public static int field689;
    @ObfuscatedName(value="cn")
    @ObfuscatedGetter(intValue=731808139)
    static int field569;
    @ObfuscatedName(value="co")
    @ObfuscatedGetter(intValue=913157539)
    static int field500;
    @ObfuscatedName(value="cp")
    public static boolean field796;
    @ObfuscatedName(value="cz")
    static boolean field502;
    @ObfuscatedName(value="ct")
    @ObfuscatedGetter(intValue=-848356977)
    static int field766;
    @ObfuscatedName(value="ci")
    @ObfuscatedGetter(intValue=204884787)
    static int field504;
    @ObfuscatedName(value="cl")
    @ObfuscatedGetter(intValue=-65984007)
    static int field498;
    @ObfuscatedName(value="cw")
    static boolean field506;
    @ObfuscatedName(value="dn")
    static boolean field723;
    @ObfuscatedName(value="dc")
    static boolean field509;
    @ObfuscatedName(value="dm")
    @ObfuscatedGetter(intValue=-599201185)
    static int field510;
    @ObfuscatedName(value="dj")
    static boolean field511;
    @ObfuscatedName(value="dk")
    static boolean field512;
    @ObfuscatedName(value="dt")
    static boolean field513;
    @ObfuscatedName(value="df")
    @ObfuscatedGetter(intValue=-449024203)
    public static int field514;
    @ObfuscatedName(value="de")
    @ObfuscatedGetter(intValue=-974439007)
    static int field693;
    @ObfuscatedName(value="dw")
    @ObfuscatedGetter(longValue=7453357615461186043L)
    static long field787;
    @ObfuscatedName(value="dx")
    @ObfuscatedGetter(intValue=1900697591)
    static int field517;
    @ObfuscatedName(value="dd")
    @ObfuscatedGetter(intValue=-13547589)
    static int field518;
    @ObfuscatedName(value="dy")
    @ObfuscatedGetter(longValue=-3258060289522238341L)
    static long field557;
    @ObfuscatedName(value="db")
    static boolean field520;
    @ObfuscatedName(value="du")
    @ObfuscatedGetter(intValue=-529860643)
    static int field769;
    @ObfuscatedName(value="da")
    @ObfuscatedGetter(intValue=-1519497359)
    static int field565;
    @ObfuscatedName(value="dp")
    @ObfuscatedGetter(intValue=-1428275919)
    static int field530;
    @ObfuscatedName(value="di")
    @ObfuscatedGetter(intValue=1526007779)
    static int field524;
    @ObfuscatedName(value="dq")
    @ObfuscatedGetter(intValue=1175894921)
    static int field525;
    @ObfuscatedName(value="dz")
    @ObfuscatedGetter(intValue=222290645)
    static int field526;
    @ObfuscatedName(value="ex")
    @ObfuscatedGetter(intValue=1980301462)
    static int field527;
    @ObfuscatedName(value="eq")
    @ObfuscatedGetter(intValue=824611008)
    static int field528;
    @ObfuscatedName(value="ef")
    @ObfuscatedGetter(intValue=-2112979999)
    static int field529;
    @ObfuscatedName(value="ej")
    @ObfuscatedSignature(descriptor="Lej;")
    static class108 field759;
    @ObfuscatedName(value="eg")
    @ObfuscatedSignature(descriptor="Lej;")
    static class108 field728;
    @ObfuscatedName(value="et")
    static boolean field532;
    @ObfuscatedName(value="en")
    @ObfuscatedSignature(descriptor="Ldd;")
    static class95 field533;
    @ObfuscatedName(value="el")
    @ObfuscatedGetter(intValue=-489561335)
    static int field534;
    @ObfuscatedName(value="ea")
    @ObfuscatedGetter(intValue=1587484709)
    static int field535;
    @ObfuscatedName(value="fk")
    @ObfuscatedGetter(intValue=-1918509341)
    static int field536;
    @ObfuscatedName(value="fp")
    static boolean field765;
    @ObfuscatedName(value="fw")
    @ObfuscatedGetter(intValue=-1693499695)
    static int field501;
    @ObfuscatedName(value="fv")
    @ObfuscatedGetter(intValue=315387193)
    static int field743;
    @ObfuscatedName(value="fj")
    @ObfuscatedGetter(intValue=-1356889721)
    static int field613;
    @ObfuscatedName(value="fy")
    @ObfuscatedSignature(descriptor="Lft;")
    static class146 field629;
    @ObfuscatedName(value="gg")
    @ObfuscatedSignature(descriptor="Lvx;")
    static class561 field741;
    @ObfuscatedName(value="gh")
    static final String field552;
    @ObfuscatedName(value="gf")
    static final String field684;
    @ObfuscatedName(value="hy")
    static boolean field555;
    @ObfuscatedName(value="ht")
    @ObfuscatedSignature(descriptor="Ldc;")
    static class80 field556;
    @ObfuscatedName(value="hw")
    static int[] field563;
    @ObfuscatedName(value="hz")
    static byte[] field782;
    @ObfuscatedName(value="hh")
    @ObfuscatedGetter(intValue=2005175169)
    static int field562;
    @ObfuscatedName(value="ha")
    static int[] field567;
    @ObfuscatedName(value="ii")
    @ObfuscatedSignature(descriptor="Lep;")
    public static final class116 field564;
    @ObfuscatedName(value="iy")
    @ObfuscatedGetter(intValue=-753899573)
    static int field627;
    @ObfuscatedName(value="in")
    static boolean field566;
    @ObfuscatedName(value="is")
    @ObfuscatedSignature(descriptor="Lrb;")
    static class455 field763;
    @ObfuscatedName(value="ic")
    static HashMap field568;
    @ObfuscatedName(value="it")
    static String field570;
    @ObfuscatedName(value="ip")
    @ObfuscatedGetter(intValue=1985139729)
    static int field760;
    @ObfuscatedName(value="iw")
    @ObfuscatedGetter(intValue=1320032181)
    static int field615;
    @ObfuscatedName(value="if")
    @ObfuscatedGetter(intValue=-845440981)
    static int field561;
    @ObfuscatedName(value="iv")
    @ObfuscatedGetter(intValue=947213209)
    static int field572;
    @ObfuscatedName(value="ib")
    @ObfuscatedGetter(intValue=-1520132459)
    static int field573;
    @ObfuscatedName(value="js")
    static int[][][] field574;
    @ObfuscatedName(value="jz")
    @ObfuscatedSignature(descriptor="Ldb;")
    static class97 field508;
    @ObfuscatedName(value="jk")
    static boolean field531;
    @ObfuscatedName(value="jv")
    static int[][][] field577;
    @ObfuscatedName(value="jg")
    static final int[] field578;
    @ObfuscatedName(value="jo")
    @ObfuscatedGetter(intValue=8442019)
    static int field767;
    @ObfuscatedName(value="jd")
    @ObfuscatedSignature(descriptor="Lec;")
    static class112 field673;
    @ObfuscatedName(value="jf")
    @ObfuscatedGetter(intValue=903298571)
    static int field581;
    @ObfuscatedName(value="kn")
    @ObfuscatedGetter(intValue=-1304757713)
    static int field582;
    @ObfuscatedName(value="kv")
    @ObfuscatedGetter(intValue=-792412525)
    static int field583;
    @ObfuscatedName(value="ky")
    @ObfuscatedGetter(intValue=-1837613567)
    static int field584;
    @ObfuscatedName(value="ks")
    @ObfuscatedGetter(intValue=-1169670661)
    static int field550;
    @ObfuscatedName(value="kq")
    static boolean field519;
    @ObfuscatedName(value="ke")
    @ObfuscatedGetter(intValue=1035169597)
    static int field587;
    @ObfuscatedName(value="kg")
    @ObfuscatedGetter(intValue=921200069)
    static int field588;
    @ObfuscatedName(value="ki")
    @ObfuscatedGetter(intValue=-975398401)
    static int field503;
    @ObfuscatedName(value="ln")
    @ObfuscatedGetter(intValue=-710504759)
    static int field590;
    @ObfuscatedName(value="lz")
    @ObfuscatedGetter(intValue=-1749269039)
    static int field591;
    @ObfuscatedName(value="lt")
    @ObfuscatedGetter(intValue=-1747956069)
    static int field592;
    @ObfuscatedName(value="lp")
    @ObfuscatedGetter(intValue=982672521)
    static int field593;
    @ObfuscatedName(value="lj")
    @ObfuscatedGetter(intValue=26324039)
    static int field594;
    @ObfuscatedName(value="lm")
    @ObfuscatedGetter(intValue=149837393)
    static int field595;
    @ObfuscatedName(value="lx")
    @ObfuscatedGetter(intValue=1592670747)
    static int field596;
    @ObfuscatedName(value="ld")
    @ObfuscatedGetter(intValue=-1913121689)
    static int field539;
    @ObfuscatedName(value="li")
    @ObfuscatedGetter(intValue=-845810053)
    static int field626;
    @ObfuscatedName(value="lw")
    @ObfuscatedGetter(intValue=-1176492027)
    static int field599;
    @ObfuscatedName(value="lc")
    @ObfuscatedGetter(intValue=2007883423)
    static int field600;
    @ObfuscatedName(value="lq")
    @ObfuscatedGetter(intValue=1382683315)
    public static int field601;
    @ObfuscatedName(value="ly")
    static boolean field602;
    @ObfuscatedName(value="le")
    @ObfuscatedGetter(intValue=831365017)
    static int field618;
    @ObfuscatedName(value="lb")
    static boolean field604;
    @ObfuscatedName(value="lv")
    @ObfuscatedGetter(intValue=1550103637)
    static int field679;
    @ObfuscatedName(value="lr")
    @ObfuscatedGetter(intValue=445822055)
    static int field606;
    @ObfuscatedName(value="lo")
    @ObfuscatedGetter(intValue=-742333809)
    static int field724;
    @ObfuscatedName(value="lh")
    static int[] field608;
    @ObfuscatedName(value="lg")
    static int[] field674;
    @ObfuscatedName(value="ll")
    static int[] field610;
    @ObfuscatedName(value="ls")
    static int[] field515;
    @ObfuscatedName(value="mk")
    static int[] field612;
    @ObfuscatedName(value="mf")
    static int[] field576;
    @ObfuscatedName(value="mt")
    static int[][] field651;
    @ObfuscatedName(value="mi")
    static int[] field624;
    @ObfuscatedName(value="mp")
    static String[] field616;
    @ObfuscatedName(value="my")
    @ObfuscatedGetter(intValue=706602237)
    static int field617;
    @ObfuscatedName(value="mc")
    @ObfuscatedGetter(intValue=1166640163)
    static int field802;
    @ObfuscatedName(value="mw")
    @ObfuscatedGetter(intValue=-980117309)
    static int field538;
    @ObfuscatedName(value="mv")
    @ObfuscatedGetter(intValue=1061273181)
    static int field620;
    @ObfuscatedName(value="mo")
    @ObfuscatedGetter(intValue=-2049494319)
    static int field717;
    @ObfuscatedName(value="mm")
    @ObfuscatedGetter(intValue=1149165949)
    static int field622;
    @ObfuscatedName(value="mr")
    @ObfuscatedGetter(intValue=681871339)
    static int field603;
    @ObfuscatedName(value="mn")
    static boolean field703;
    @ObfuscatedName(value="me")
    @ObfuscatedGetter(intValue=-726804691)
    static int field625;
    @ObfuscatedName(value="mq")
    static boolean field560;
    @ObfuscatedName(value="mg")
    @ObfuscatedGetter(intValue=-574230191)
    static int field623;
    @ObfuscatedName(value="md")
    @ObfuscatedGetter(intValue=-1787460219)
    static int field628;
    @ObfuscatedName(value="mx")
    @ObfuscatedGetter(longValue=-936586484931709069L)
    static long field736;
    @ObfuscatedName(value="mh")
    @ObfuscatedGetter(longValue=-8661975140875297179L)
    static long field630;
    @ObfuscatedName(value="ma")
    static String field631;
    @ObfuscatedName(value="nb")
    @ObfuscatedGetter(intValue=1592852041)
    static int field781;
    @ObfuscatedName(value="nv")
    static boolean field633;
    @ObfuscatedName(value="ns")
    @ObfuscatedGetter(intValue=-845287713)
    static int field634;
    @ObfuscatedName(value="np")
    @ObfuscatedGetter(intValue=171921937)
    static int field635;
    @ObfuscatedName(value="nf")
    static int[] field537;
    @ObfuscatedName(value="nz")
    static final int[] field637;
    @ObfuscatedName(value="nd")
    static String[] field638;
    @ObfuscatedName(value="nq")
    static boolean[] field639;
    @ObfuscatedName(value="nl")
    static int[] field640;
    @ObfuscatedName(value="nc")
    @ObfuscatedGetter(intValue=-242142319)
    static int field641;
    @ObfuscatedName(value="ng")
    static int[] field642;
    @ObfuscatedName(value="nm")
    static int[] field643;
    @ObfuscatedName(value="nk")
    static int[] field644;
    @ObfuscatedName(value="ny")
    static int[] field645;
    @ObfuscatedName(value="nn")
    static boolean field646;
    @ObfuscatedName(value="nr")
    static boolean field647;
    @ObfuscatedName(value="na")
    @ObfuscatedSignature(descriptor="Lwl;")
    static class575 field648;
    @ObfuscatedName(value="nj")
    static boolean field649;
    @ObfuscatedName(value="op")
    static boolean field734;
    @ObfuscatedName(value="oi")
    static boolean field598;
    @ObfuscatedName(value="oy")
    @ObfuscatedGetter(intValue=-474804625)
    static int field652;
    @ObfuscatedName(value="om")
    @ObfuscatedGetter(intValue=1658084859)
    static int field653;
    @ObfuscatedName(value="oq")
    @ObfuscatedGetter(intValue=-1646391571)
    static int field654;
    @ObfuscatedName(value="ov")
    @ObfuscatedGetter(intValue=-1569373373)
    static int field655;
    @ObfuscatedName(value="of")
    @ObfuscatedGetter(intValue=-1064135721)
    static int field496;
    @ObfuscatedName(value="oe")
    static boolean field522;
    @ObfuscatedName(value="ol")
    @ObfuscatedGetter(intValue=-1656983683)
    static int field659;
    @ObfuscatedName(value="ob")
    @ObfuscatedGetter(intValue=-992202243)
    static int field660;
    @ObfuscatedName(value="ou")
    static String field661;
    @ObfuscatedName(value="oa")
    static String field662;
    @ObfuscatedName(value="ox")
    @ObfuscatedGetter(intValue=313611491)
    static int field663;
    @ObfuscatedName(value="oz")
    @ObfuscatedSignature(descriptor="Lub;")
    static class530 field664;
    @ObfuscatedName(value="ok")
    @ObfuscatedGetter(intValue=1520275521)
    static int field665;
    @ObfuscatedName(value="oo")
    @ObfuscatedGetter(intValue=1041490587)
    static int field707;
    @ObfuscatedName(value="pc")
    @ObfuscatedGetter(intValue=-1742606525)
    static int field667;
    @ObfuscatedName(value="pq")
    @ObfuscatedSignature(descriptor="Lna;")
    static class361 field668;
    @ObfuscatedName(value="pa")
    @ObfuscatedGetter(intValue=1873060579)
    static int field774;
    @ObfuscatedName(value="pl")
    @ObfuscatedGetter(intValue=448837437)
    static int field670;
    @ObfuscatedName(value="pt")
    @ObfuscatedGetter(intValue=262182137)
    static int field671;
    @ObfuscatedName(value="pk")
    @ObfuscatedGetter(intValue=248491471)
    static int field672;
    @ObfuscatedName(value="pb")
    static boolean field677;
    @ObfuscatedName(value="pp")
    @ObfuscatedSignature(descriptor="Lna;")
    static class361 field687;
    @ObfuscatedName(value="py")
    @ObfuscatedSignature(descriptor="Lna;")
    public static class361 field675;
    @ObfuscatedName(value="pj")
    @ObfuscatedSignature(descriptor="Lna;")
    static class361 field676;
    @ObfuscatedName(value="pu")
    @ObfuscatedGetter(intValue=-717618303)
    static int field715;
    @ObfuscatedName(value="pe")
    @ObfuscatedGetter(intValue=2041394719)
    static int field678;
    @ObfuscatedName(value="pw")
    @ObfuscatedSignature(descriptor="Lna;")
    static class361 field607;
    @ObfuscatedName(value="po")
    static boolean field523;
    @ObfuscatedName(value="pd")
    @ObfuscatedGetter(intValue=-427170013)
    static int field681;
    @ObfuscatedName(value="pv")
    @ObfuscatedGetter(intValue=-191643001)
    static int field682;
    @ObfuscatedName(value="ph")
    static boolean field683;
    @ObfuscatedName(value="pg")
    @ObfuscatedGetter(intValue=639543253)
    static int field721;
    @ObfuscatedName(value="px")
    @ObfuscatedGetter(intValue=1586560535)
    static int field685;
    @ObfuscatedName(value="pn")
    static boolean field585;
    @ObfuscatedName(value="pf")
    @ObfuscatedGetter(intValue=-809719349)
    static int field549;
    @ObfuscatedName(value="qu")
    static int[] field688;
    @ObfuscatedName(value="qs")
    @ObfuscatedGetter(intValue=770842345)
    static int field586;
    @ObfuscatedName(value="qg")
    static int[] field544;
    @ObfuscatedName(value="qm")
    @ObfuscatedGetter(intValue=1013996033)
    static int field749;
    @ObfuscatedName(value="qj")
    static int[] field780;
    @ObfuscatedName(value="qf")
    @ObfuscatedGetter(intValue=-1336364091)
    static int field505;
    @ObfuscatedName(value="ql")
    static int[] field694;
    @ObfuscatedName(value="qb")
    @ObfuscatedGetter(intValue=1745268863)
    static int field579;
    @ObfuscatedName(value="qr")
    @ObfuscatedGetter(intValue=-1089100315)
    static int field696;
    @ObfuscatedName(value="qh")
    @ObfuscatedGetter(intValue=224198131)
    static int field697;
    @ObfuscatedName(value="qa")
    @ObfuscatedGetter(intValue=-477095393)
    static int field770;
    @ObfuscatedName(value="qe")
    @ObfuscatedGetter(intValue=762527647)
    static int field699;
    @ObfuscatedName(value="qp")
    @ObfuscatedGetter(intValue=-160645847)
    static int field700;
    @ObfuscatedName(value="qd")
    @ObfuscatedGetter(intValue=-1646084199)
    static int field701;
    @ObfuscatedName(value="qv")
    @ObfuscatedGetter(intValue=-1620123837)
    static int field714;
    @ObfuscatedName(value="qq")
    @ObfuscatedGetter(intValue=2013497213)
    static int field499;
    @ObfuscatedName(value="qi")
    @ObfuscatedSignature(descriptor="Lty;")
    static class496 field803;
    @ObfuscatedName(value="qo")
    @ObfuscatedGetter(intValue=-619627907)
    static int field704;
    @ObfuscatedName(value="qc")
    @ObfuscatedSignature(descriptor="Lww;")
    static class574 field755;
    @ObfuscatedName(value="qk")
    @ObfuscatedSignature(descriptor="Lpm;")
    static class410 field706;
    @ObfuscatedName(value="qt")
    @ObfuscatedSignature(descriptor="Lpm;")
    static class410 field666;
    @ObfuscatedName(value="rp")
    @ObfuscatedSignature(descriptor="Lpm;")
    static class410 field708;
    @ObfuscatedName(value="re")
    @ObfuscatedSignature(descriptor="Lpm;")
    static class410 field709;
    @ObfuscatedName(value="rg")
    @ObfuscatedSignature(descriptor="Lub;")
    static class530 field710;
    @ObfuscatedName(value="rc")
    @ObfuscatedGetter(intValue=-1206320977)
    public static int field711;
    @ObfuscatedName(value="rj")
    @ObfuscatedGetter(intValue=-1211154273)
    static int field619;
    @ObfuscatedName(value="rh")
    public static boolean[] field713;
    @ObfuscatedName(value="rv")
    static boolean[] field732;
    @ObfuscatedName(value="rw")
    static boolean[] field580;
    @ObfuscatedName(value="rr")
    public static int[] field716;
    @ObfuscatedName(value="rl")
    public static int[] field611;
    @ObfuscatedName(value="ry")
    public static int[] field718;
    @ObfuscatedName(value="rm")
    public static int[] field605;
    @ObfuscatedName(value="rb")
    @ObfuscatedGetter(intValue=-92662397)
    static int field720;
    @ObfuscatedName(value="rk")
    @ObfuscatedGetter(longValue=-4040198743471200231L)
    static long field541;
    @ObfuscatedName(value="rn")
    static boolean field722;
    @ObfuscatedName(value="rf")
    @ObfuscatedGetter(intValue=-92434711)
    static int field632;
    @ObfuscatedName(value="ro")
    @ObfuscatedGetter(intValue=-1501535167)
    public static int field695;
    @ObfuscatedName(value="rs")
    static int[] field712;
    @ObfuscatedName(value="ru")
    @ObfuscatedGetter(intValue=854034963)
    static int field726;
    @ObfuscatedName(value="si")
    @ObfuscatedGetter(intValue=-318548323)
    static int field727;
    @ObfuscatedName(value="sa")
    static String field516;
    @ObfuscatedName(value="ss")
    static long[] field729;
    @ObfuscatedName(value="sc")
    @ObfuscatedGetter(intValue=-1085990789)
    static int field730;
    @ObfuscatedName(value="so")
    @ObfuscatedSignature(descriptor="Lkc;")
    static class269 field731;
    @ObfuscatedName(value="sx")
    @ObfuscatedSignature(descriptor="Lkt;")
    static class267 field575;
    @ObfuscatedName(value="sy")
    @ObfuscatedGetter(intValue=-2066543529)
    static int field733;
    @ObfuscatedName(value="su")
    static int[] field589;
    @ObfuscatedName(value="sb")
    static int[] field735;
    @ObfuscatedName(value="sg")
    @ObfuscatedGetter(longValue=-946525446215822103L)
    static long field740;
    @ObfuscatedName(value="sz")
    @ObfuscatedSignature(descriptor="[Lgq;")
    static class161[] field737;
    @ObfuscatedName(value="sq")
    @ObfuscatedSignature(descriptor="[Lgk;")
    static class170[] field738;
    @ObfuscatedName(value="sd")
    @ObfuscatedGetter(intValue=1301726103)
    static int field739;
    @ObfuscatedName(value="sv")
    @ObfuscatedGetter(intValue=1472706269)
    static int field756;
    @ObfuscatedName(value="sh")
    static int[] field658;
    @ObfuscatedName(value="sl")
    static int[] field742;
    @ObfuscatedName(value="sn")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static class570[] field719;
    @ObfuscatedName(value="sj")
    @ObfuscatedGetter(intValue=-494910763)
    static int field744;
    @ObfuscatedName(value="th")
    @ObfuscatedGetter(intValue=920071481)
    static int field745;
    @ObfuscatedName(value="ta")
    @ObfuscatedGetter(intValue=-1326480137)
    static int field746;
    @ObfuscatedName(value="tw")
    static boolean field540;
    @ObfuscatedName(value="tt")
    @ObfuscatedGetter(intValue=744192101)
    static int field748;
    @ObfuscatedName(value="tu")
    static int[] field698;
    @ObfuscatedName(value="tg")
    static int[] field750;
    @ObfuscatedName(value="tm")
    static int[] field751;
    @ObfuscatedName(value="te")
    static int[] field752;
    @ObfuscatedName(value="tv")
    static int[] field753;
    @ObfuscatedName(value="tj")
    @ObfuscatedSignature(descriptor="[Lbg;")
    static class39[] field754;
    @ObfuscatedName(value="tz")
    static boolean field797;
    @ObfuscatedName(value="uq")
    static boolean field669;
    @ObfuscatedName(value="um")
    static boolean field757;
    @ObfuscatedName(value="ui")
    static boolean field758;
    @ObfuscatedName(value="us")
    @ObfuscatedGetter(intValue=88628409)
    static int field801;
    @ObfuscatedName(value="ue")
    @ObfuscatedSignature(descriptor="Luq;")
    static class521 field657;
    @ObfuscatedName(value="ub")
    @ObfuscatedSignature(descriptor="Luh;")
    static class520 field725;
    @ObfuscatedName(value="ut")
    @ObfuscatedSignature(descriptor="Luh;")
    static class520 field761;
    @ObfuscatedName(value="up")
    static boolean field762;
    @ObfuscatedName(value="uj")
    static boolean[] field571;
    @ObfuscatedName(value="uy")
    static int[] field764;
    @ObfuscatedName(value="ur")
    static int[] field690;
    @ObfuscatedName(value="uu")
    static int[] field768;
    @ObfuscatedName(value="ud")
    static int[] field705;
    @ObfuscatedName(value="ul")
    static short field609;
    @ObfuscatedName(value="vj")
    static short field656;
    @ObfuscatedName(value="vh")
    static short field614;
    @ObfuscatedName(value="vr")
    static short field771;
    @ObfuscatedName(value="ve")
    static short field772;
    @ObfuscatedName(value="vd")
    static short field773;
    @ObfuscatedName(value="vo")
    static short field702;
    @ObfuscatedName(value="vk")
    static short field775;
    @ObfuscatedName(value="vw")
    @ObfuscatedGetter(intValue=319242269)
    static int field776;
    @ObfuscatedName(value="vt")
    @ObfuscatedGetter(intValue=-1835546011)
    static int field777;
    @ObfuscatedName(value="vv")
    @ObfuscatedGetter(intValue=-1034761467)
    static int field778;
    @ObfuscatedName(value="vy")
    @ObfuscatedGetter(intValue=2037360197)
    static int field779;
    @ObfuscatedName(value="vn")
    @ObfuscatedGetter(intValue=-1463071545)
    static int field553;
    @ObfuscatedName(value="vl")
    @ObfuscatedSignature(descriptor="Lny;")
    static final class358 field680;
    @ObfuscatedName(value="vu")
    @ObfuscatedGetter(intValue=853411881)
    static int field621;
    @ObfuscatedName(value="vx")
    @ObfuscatedGetter(intValue=1201978701)
    static int field783;
    @ObfuscatedName(value="vs")
    @ObfuscatedSignature(descriptor="Ltb;")
    static class517 field686;
    @ObfuscatedName(value="vm")
    @ObfuscatedSignature(descriptor="[Lpu;")
    static class400[] field785;
    @ObfuscatedName(value="vb")
    @ObfuscatedSignature(descriptor="Lcl;")
    static class66 field786;
    @ObfuscatedName(value="vf")
    @ObfuscatedSignature(descriptor="Lro;")
    static class465 field636;
    @ObfuscatedName(value="wc")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field788;
    @ObfuscatedName(value="wr")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field789;
    @ObfuscatedName(value="wk")
    @ObfuscatedGetter(intValue=918583365)
    static int field790;
    @ObfuscatedName(value="wg")
    @ObfuscatedGetter(intValue=1979575967)
    public static int field791;
    @ObfuscatedName(value="gm")
    String field597;
    @ObfuscatedName(value="gk")
    @ObfuscatedSignature(descriptor="Laa;")
    class14 field543;
    @ObfuscatedName(value="gd")
    @ObfuscatedSignature(descriptor="Lag;")
    class18 field650;
    @ObfuscatedName(value="go")
    OtlTokenRequester field545;
    @ObfuscatedName(value="gz")
    Future field546;
    @ObfuscatedName(value="ge")
    boolean field547 = false;
    @ObfuscatedName(value="gs")
    @ObfuscatedGetter(intValue=1470855235)
    int field548 = 0;
    @ObfuscatedName(value="gj")
    @ObfuscatedSignature(descriptor="Lag;")
    class18 field784;
    @ObfuscatedName(value="gx")
    RefreshAccessTokenRequester field747;
    @ObfuscatedName(value="gi")
    Future field551;
    @ObfuscatedName(value="hv")
    @ObfuscatedSignature(descriptor="Lvy;")
    class556 field558;
    @ObfuscatedName(value="hc")
    @ObfuscatedSignature(descriptor="Lax;")
    class7 field559;
    @ObfuscatedName(value="hd")
    @ObfuscatedGetter(longValue=2255117434739773081L)
    long field691 = -1L;

    static {
        field497 = true;
        field689 = 1;
        field569 = 0;
        field500 = 0;
        field796 = false;
        field502 = false;
        field766 = -1;
        field504 = -1;
        field498 = -1;
        field506 = false;
        field723 = false;
        field509 = false;
        field510 = 0;
        field511 = false;
        field512 = false;
        field513 = true;
        field514 = 0;
        field693 = 0;
        field787 = 1L;
        field517 = -1;
        field518 = -1;
        field557 = -1L;
        field520 = true;
        field769 = 0;
        field565 = 0;
        field530 = 0;
        field524 = 0;
        field525 = 0;
        field526 = 0;
        field527 = 0;
        field528 = 0;
        field529 = 0;
        field759 = class108.field1380;
        field728 = class108.field1380;
        field532 = false;
        field533 = class95.field1157;
        field534 = 0;
        field535 = 0;
        field536 = 0;
        field501 = 0;
        field743 = 0;
        field613 = 0;
        field629 = class146.field1661;
        field741 = class561.field5530;
        field552 = class270.method5830(client.method1772("com_jagex_auth_desktop_osrs:public"));
        field684 = class270.method5830(client.method1772("com_jagex_auth_desktop_runelite:public"));
        field555 = false;
        field556 = new class80();
        field563 = new int[4];
        field782 = null;
        field562 = 0;
        field567 = new int[250];
        field564 = new class116();
        field627 = 0;
        field566 = false;
        field763 = new class455();
        field568 = new HashMap();
        field760 = 0;
        field615 = 1;
        field561 = 0;
        field572 = 1;
        field573 = 0;
        field574 = new int[4][13][13];
        field508 = new class97();
        field531 = false;
        field577 = new int[4][13][13];
        field578 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        field767 = -1;
        field673 = new class112();
        field581 = 0;
        field582 = 2301979;
        field583 = 5063219;
        field584 = 3353893;
        field550 = 7759444;
        field519 = false;
        field587 = 0;
        field588 = 128;
        field503 = 0;
        field590 = 0;
        field591 = 0;
        field592 = 0;
        field593 = 0;
        field594 = 0;
        field595 = 50;
        field596 = 0;
        field539 = 0;
        field626 = 0;
        field599 = 12;
        field600 = 6;
        field601 = 0;
        field602 = false;
        field618 = 0;
        field604 = false;
        field679 = 0;
        field606 = 0;
        field724 = 50;
        field608 = new int[field724];
        field674 = new int[field724];
        field610 = new int[field724];
        field515 = new int[field724];
        field612 = new int[field724];
        field576 = new int[field724];
        field651 = new int[field724][];
        field624 = new int[field724];
        field616 = new String[field724];
        field617 = 0;
        field802 = -1;
        field538 = -1;
        field620 = 0;
        field717 = 0;
        field622 = 0;
        field603 = 0;
        field703 = true;
        field625 = 0;
        field560 = true;
        field623 = -1;
        field628 = 0;
        field736 = -1L;
        field630 = -1L;
        field631 = "";
        field781 = -1;
        field633 = true;
        field634 = 0;
        field635 = 0;
        field537 = new int[1000];
        field637 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
        field638 = new String[8];
        field639 = new boolean[8];
        field640 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        field641 = -1;
        field642 = new int[25];
        field643 = new int[25];
        field644 = new int[25];
        field645 = new int[25];
        field646 = false;
        field647 = false;
        field648 = new class575(true);
        field649 = false;
        field734 = false;
        field598 = true;
        field652 = -1;
        field653 = -1;
        field654 = 0;
        field655 = 50;
        field496 = 0;
        field570 = null;
        field522 = false;
        field659 = -1;
        field660 = -1;
        field661 = null;
        field662 = null;
        field663 = -1;
        field664 = new class530(8);
        field665 = 0;
        field707 = -1;
        field667 = 0;
        field668 = null;
        field774 = 0;
        field670 = 0;
        field671 = 0;
        field672 = -1;
        field677 = false;
        field687 = null;
        field675 = null;
        field676 = null;
        field715 = 0;
        field678 = 0;
        field607 = null;
        field523 = false;
        field681 = -1;
        field682 = -1;
        field683 = false;
        field721 = -1;
        field685 = -1;
        field585 = false;
        field549 = 1;
        field688 = new int[32];
        field586 = 0;
        field544 = new int[32];
        field749 = 0;
        field780 = new int[32];
        field505 = 0;
        field694 = new int[32];
        field579 = 0;
        field696 = 0;
        field697 = 0;
        field770 = 0;
        field699 = 0;
        field700 = 0;
        field701 = 0;
        field714 = 0;
        field499 = 0;
        field704 = 0;
        field755 = new class574();
        field706 = new class410();
        field666 = new class410();
        field708 = new class410();
        field709 = new class410();
        field710 = new class530(512);
        field711 = 0;
        field619 = -2;
        field713 = new boolean[100];
        field732 = new boolean[100];
        field580 = new boolean[100];
        field716 = new int[100];
        field611 = new int[100];
        field718 = new int[100];
        field605 = new int[100];
        field720 = 0;
        field541 = 0L;
        field722 = true;
        field632 = 600;
        field695 = field632 / class34.field161;
        field712 = new int[]{0xFFFF00, 0xFF0000, 65280, 65535, 0xFF00FF, 0xFFFFFF};
        field726 = 0;
        field727 = 0;
        field516 = "";
        field729 = new long[100];
        field730 = 0;
        field731 = new class269();
        field575 = new class267();
        field733 = 0;
        field589 = new int[128];
        field735 = new int[128];
        field740 = -1L;
        field737 = new class161[4];
        field738 = new class170[4];
        field739 = -1;
        field756 = 0;
        field658 = new int[1000];
        field742 = new int[1000];
        field719 = new class570[1000];
        field744 = 0;
        field745 = 0;
        field746 = 0;
        field540 = false;
        field748 = 0;
        field698 = new int[50];
        field750 = new int[50];
        field751 = new int[50];
        field752 = new int[50];
        field753 = new int[50];
        field754 = new class39[50];
        field797 = false;
        field669 = false;
        field757 = false;
        field758 = false;
        field657 = null;
        field725 = null;
        field761 = null;
        field762 = false;
        field571 = new boolean[5];
        field764 = new int[5];
        field690 = new int[5];
        field768 = new int[5];
        field705 = new int[5];
        field609 = (short)256;
        field656 = (short)205;
        field614 = (short)256;
        field771 = (short)320;
        field772 = 1;
        field773 = Short.MAX_VALUE;
        field702 = 1;
        field775 = Short.MAX_VALUE;
        field776 = 0;
        field777 = 0;
        field778 = 0;
        field779 = 0;
        field553 = 0;
        field680 = new class358();
        field621 = -1;
        field783 = -1;
        field686 = new class515();
        field785 = new class400[8];
        field786 = new class66();
        field636 = new class465(8, class463.field4954);
        field788 = new class315(64);
        field789 = new class315(64);
        field790 = -1;
        field791 = -1;
        field792 = new ArrayList();
        field793 = new class277();
        field794 = 30;
        field795 = new ArrayList(10);
        field542 = 0;
        field692 = 0;
        field798 = new class65();
        field799 = new int[50];
        field800 = new int[50];
    }

    @Override
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1848806273")
    protected final void vmethod1631() {
        field541 = class37.method724() + 500L;
        this.method1671();
        if (field663 != -1) {
            this.method1317(true);
        }
    }

    @Override
    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-494623143")
    protected final void vmethod1297() {
        class102 class1022;
        boolean bl;
        class163.method3778(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
        int n = field569;
        class552 class5522 = class552.field5442;
        class273.field3035 = bl = (n & class5522.vmethod10703()) != 0;
        class358.field3822 = field500 == 0 ? 43594 : field689 + 40000;
        class173.field1829 = field500 == 0 ? 443 : field689 + 50000;
        class340.field3702 = class358.field3822;
        class526.field5323 = class360.field3860;
        class358.field3816 = class360.field3858;
        class169.field1805 = class360.field3856;
        class7.field30 = class360.field3855;
        class280.field3069 = new URLConnection(this.field547, 228);
        this.method565();
        this.method534();
        class161.field1750 = this.method553();
        this.method533(field575, 0);
        this.method533(field731, 1);
        this.method620();
        class37.field227 = new class490(255, class216.field2393, class216.field2394, 500000);
        Object object = null;
        class102 class1023 = new class102();
        try {
            int n2;
            object = class31.method493("", class259.field2749.field4125, false);
            byte[] byArray = new byte[(int)((class536)object).method10031()];
            for (int i = 0; i < byArray.length; i += n2) {
                n2 = ((class536)object).method10044(byArray, i, byArray.length - i);
                if (n2 != -1) continue;
                throw new IOException();
            }
            class1023 = new class102(new class556(byArray));
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            if (object != null) {
                ((class536)object).method10037();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        class544.field5403 = class1022 = class1023;
        class74.method2356(this, class487.field5063);
        class555.method10255(class544.field5403.method2906());
        class10.field54 = new class70(class383.field4489);
        this.field543 = new class14("tokenRequest", 1, 1);
        class7.method50(this);
        field793.method5940();
        object = new class177(3, 1, 0);
        ((class177)object).method3942(-64, -8, 64);
        ((class177)object).method3942(64, -8, 64);
        ((class177)object).method3942(0, -8, -24);
        ((class177)object).method3954(0, 2, 1, (byte)1, (byte)-1, (short)-1, (short)-1);
        class53.field338 = ((class177)object).method3917(128, 256, 0, -128, 0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1077900572")
    protected final void vmethod1501() {
        ++client.field514;
        this.method1301();
        class287.method6298();
        var2_1 = 0;
        var3_2 = 0;
        if (!class333.field3629.isEmpty()) {
            var4_3 = (class448)class333.field3629.get(0);
            if (var4_3 != null) {
                if (!var4_3.vmethod8883()) {
                    var3_2 = var4_3.method8858();
                } else {
                    if (!var4_3.method8855()) {
                        if (var4_3.method8860() != null) {
                            class333.field3629.add(1, var4_3.method8860());
                        }
                        var3_2 = (int)var4_3.method8858();
                    } else {
                        System.out.println("Error in midimanager.service: " + var4_3.method8870());
                        var2_1 = 1;
                    }
                    class333.field3629.remove(0);
                }
            } else {
                class333.field3629.remove(0);
            }
        }
        if (var2_1 == 0) ** GOTO lbl30
        class333.field3629.clear();
        var4_3 = class333.field3623.iterator();
        block0: while (true) {
            block32: {
                if (var4_3.hasNext()) break block32;
                class333.field3623.clear();
lbl30:
                // 2 sources

                if ((var2_1 = (var1_9 = var3_2)) != 0 && client.field540 && class328.field3606 != null) {
                    class328.field3606.method808();
                }
                class113.method3178();
                client.field731.method5763();
                this.method532();
                class214.method4914();
                if (class161.field1750 != null) {
                    client.field704 = var3_2 = class161.field1750.vmethod4941();
                }
                if (client.field510 != 0) {
                    if (client.field510 != 5) {
                        if (client.field510 != 10 && client.field510 != 11) {
                            if (client.field510 != 20) {
                                if (client.field510 != 50) {
                                    if (client.field510 == 25) {
                                        if (client.field723) {
                                            class213.method4907();
                                        }
                                        if (client.field509) {
                                            class393.method7859(class151.field1683);
                                        }
                                        if (!client.field509 && !client.field723) {
                                            class360.method7405(30);
                                        }
                                    }
                                } else {
                                    class4.method19(this, class526.field5319, class100.field1278);
                                    this.method1304();
                                }
                            } else {
                                class4.method19(this, class526.field5319, class100.field1278);
                                this.method1304();
                            }
                        } else {
                            class4.method19(this, class526.field5319, class100.field1278);
                        }
                    } else {
                        class4.method19(this, class526.field5319, class100.field1278);
                        class86.method2581();
                        class398.method7902();
                    }
                } else {
                    class86.method2581();
                    class398.method7902();
                }
                if (client.field510 != 30) {
                    if (client.field510 == 40 || client.field510 == 45) {
                        this.method1304();
                    }
                } else {
                    this.method1305();
                }
                return;
            }
            var5_4 = (class345)var4_3.next();
            if (var5_4 == null) continue;
            var5_4.field3743.method6721();
            var5_4.field3743.method6714();
            var5_4.field3743.method6709(0);
            var5_4.field3743.field3668 = 0;
            var6_5 = var5_4.field3735;
            var7_6 = var5_4.field3737;
            var8_7 = class333.field3627.iterator();
            while (true) {
                if (var8_7.hasNext()) ** break;
                continue block0;
                var9_8 = (class339)var8_7.next();
                var9_8.vmethod6894(var6_5, var7_6);
            }
            break;
        }
    }

    @Override
    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-861113109")
    protected final void vmethod1299(boolean bl) {
        block29: {
            int n;
            block28: {
                if ((field510 == 10 || field510 == 20 || field510 == 30) && 0L != field541 && class37.method724() > field541) {
                    class555.method10255(class194.method4501());
                }
                if (bl) {
                    for (n = 0; n < 100; ++n) {
                        client.field713[n] = true;
                    }
                }
                if (field510 != 0) {
                    if (field510 == 5) {
                        class128.method3364(class74.field892, class526.field5319, class100.field1278);
                    } else if (field510 != 10 && field510 != 11) {
                        if (field510 == 20) {
                            class128.method3364(class74.field892, class526.field5319, class100.field1278);
                        } else if (field510 == 50) {
                            class128.method3364(class74.field892, class526.field5319, class100.field1278);
                        } else if (field510 != 25) {
                            if (field510 == 30) {
                                this.method1608();
                            } else if (field510 == 40) {
                                class328.method6641("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
                            } else if (field510 == 45) {
                                class328.method6641("Please wait...", false);
                            }
                        } else if (field573 != 1) {
                            if (field573 != 2) {
                                class328.method6641("Loading - please wait.", false);
                            } else {
                                if (field561 > field572) {
                                    field572 = field561;
                                }
                                n = (field572 * 50 - field561 * 50) / field572 + 50;
                                class328.method6641("Loading - please wait." + "<br>" + " (" + n + "%" + ")", false);
                            }
                        } else {
                            if (field760 > field615) {
                                field615 = field760;
                            }
                            n = (field615 * 50 - field760 * 50) / field615;
                            class328.method6641("Loading - please wait." + "<br>" + " (" + n + "%" + ")", false);
                        }
                    } else {
                        class128.method3364(class74.field892, class526.field5319, class100.field1278);
                    }
                } else {
                    this.method556(class78.field935, class78.field934, bl, field765);
                }
                if (field510 != 30 || field720 != 0 || bl || field722) break block28;
                for (n = 0; n < field711; ++n) {
                    if (!field732[n]) continue;
                    class6.field14.vmethod10698(field716[n], field611[n], field718[n], field605[n]);
                    client.field732[n] = false;
                }
                break block29;
            }
            if (field510 <= 0) break block29;
            class6.field14.vmethod10689(0, 0);
            for (n = 0; n < field711; ++n) {
                client.field732[n] = false;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-12")
    protected final void vmethod1300() {
        if (class19.field80 != null && class19.field80.method3199()) {
            class19.field80.method3186();
        }
        if (class168.field1794 != null) {
            class168.field1794.field1094 = false;
        }
        class168.field1794 = null;
        field564.method3247();
        if (class35.field194 != null) {
            class35 class354 = class35.field194;
            synchronized (class354) {
                class35.field194 = null;
            }
        }
        class161.field1750 = null;
        if (class328.field3606 != null) {
            class328.field3606.method809();
        }
        HitSplatDef.field2760.method7855();
        class214.method4916();
        if (class280.field3069 != null) {
            class280.field3069.method3281();
            class280.field3069 = null;
        }
        class150.method3592();
        this.field543.method184();
    }

    @Override
    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="26444")
    protected final void vmethod1282() {
    }

    @ObfuscatedName(value="fv")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1866254902")
    boolean method1286() {
        return this.field548 == 1;
    }

    @ObfuscatedName(value="fj")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="167724786")
    boolean method1441() {
        return class431.field4782 != null && !class431.field4782.trim().isEmpty() && class165.field1782 != null && !class165.field1782.trim().isEmpty();
    }

    @ObfuscatedName(value="fy")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="26")
    boolean method1418() {
        return class18.field77 != null && !class18.field77.trim().isEmpty() && class22.field94 != null && !class22.field94.trim().isEmpty();
    }

    @ObfuscatedName(value="gg")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1810219588")
    boolean method1293() {
        return this.field545 != null;
    }

    @ObfuscatedName(value="gn")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="497391787")
    void method1294(String string) throws IOException {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("grant_type", "refresh_token");
        hashMap.put("scope", "gamesso.token.create");
        hashMap.put("refresh_token", string);
        URL uRL = new URL(class472.field4996 + "shield/oauth/token" + new class505(hashMap).method9574());
        class461 class4612 = new class461();
        if (!this.method1286()) {
            class4612.method8975(field552);
        } else {
            class4612.method8975(field684);
        }
        class4612.method8974("Host", new URL(class472.field4996).getHost());
        class4612.method8981(class502.field5137);
        class9 class910 = class9.field43;
        RefreshAccessTokenRequester refreshAccessTokenRequester = this.field747;
        if (refreshAccessTokenRequester == null) {
            class10 class1010 = new class10(uRL, class910, class4612, this.field547);
            this.field784 = this.field543.method183(class1010);
            return;
        }
        this.field551 = refreshAccessTokenRequester.request(class910.method67(), uRL, class4612.method8977(), "");
    }

    @ObfuscatedName(value="gw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="3")
    void method1295(String string) throws IOException {
        URL uRL = new URL(class472.field4996 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class461 class4612 = new class461();
        class4612.method8978(string);
        class9 class910 = class9.field34;
        OtlTokenRequester otlTokenRequester = this.field545;
        if (otlTokenRequester == null) {
            class10 class1010 = new class10(uRL, class910, class4612, this.field547);
            this.field650 = this.field543.method183(class1010);
            return;
        }
        this.field546 = otlTokenRequester.request(class910.method67(), uRL, class4612.method8977(), "");
    }

    @ObfuscatedName(value="gc")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;S)V", garbageValue="-9953")
    void method1296(String string, String string2) throws IOException, JSONException {
        URL uRL = new URL(class272.field3024 + "game-session/v1/tokens");
        class10 class1010 = new class10(uRL, class9.field43, this.field547);
        class1010.method114().method8978(string);
        class1010.method114().method8981(class502.field5137);
        JSONObject jSONObject = new JSONObject();
        jSONObject.method11016("accountId", string2);
        class1010.method108(new class504(jSONObject));
        this.field650 = this.field543.method183(class1010);
    }

    @ObfuscatedName(value="gp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1900073120")
    void method1301() {
        if (field510 == 1000) {
            return;
        }
        boolean bl = HitSplatDef.field2760.method7822();
        if (!bl) {
            this.method1302();
        }
    }

    @ObfuscatedName(value="gy")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1705512742")
    void method1302() {
        if (HitSplatDef.field2760.field4617 >= 4) {
            this.method536("js5crc");
            class360.method7405(1000);
            return;
        }
        if (HitSplatDef.field2760.field4622 >= 4) {
            if (field510 <= 5) {
                this.method536("js5io");
                class360.method7405(1000);
                return;
            }
            field535 = 3000;
            HitSplatDef.field2760.field4622 = 3;
        }
        if (--field535 + 1 > 0) {
            return;
        }
        try {
            if (field534 == 0) {
                class466.field4968 = class34.field156.method4911(class526.field5324, class340.field3702);
                ++field534;
            }
            if (field534 == 1) {
                if (class466.field4968.field2433 == 2) {
                    this.method1519(-1);
                    return;
                }
                if (class466.field4968.field2433 == 1) {
                    ++field534;
                }
            }
            if (field534 == 2) {
                class369.field4058 = class371.method7618((Socket)class466.field4968.field2436, 40000, 5000);
                class556 class5562 = new class556(class326.field3583.field3591 + 1);
                class5562.method10300(class326.field3583.field3590);
                class5562.method10268(228);
                class5562.method10268(field563[0]);
                class5562.method10268(field563[1]);
                class5562.method10268(field563[2]);
                class5562.method10268(field563[3]);
                class369.field4058.vmethod9411(class5562.field5470, 0, class326.field3583.field3591 + 1);
                ++field534;
                class133.field1548 = class37.method724();
            }
            if (field534 == 3) {
                if (class369.field4058.vmethod9408() > 0) {
                    int n = class369.field4058.vmethod9406();
                    if (n != 0) {
                        this.method1519(n);
                        return;
                    }
                    ++field534;
                } else if (class37.method724() - class133.field1548 > 30000L) {
                    this.method1519(-2);
                    return;
                }
            }
            if (field534 == 4) {
                HitSplatDef.field2760.method7835(class369.field4058, field510 > 20);
                class466.field4968 = null;
                class369.field4058 = null;
                field534 = 0;
                field536 = 0;
            }
        }
        catch (IOException iOException) {
            this.method1519(-3);
        }
    }

    @ObfuscatedName(value="gt")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-97")
    void method1519(int n) {
        class466.field4968 = null;
        class369.field4058 = null;
        field534 = 0;
        class340.field3702 = class358.field3822 == class340.field3702 ? class173.field1829 : class358.field3822;
        if (++field536 >= 2 && (n == 7 || n == 9)) {
            if (field510 > 5) {
                field535 = 3000;
            } else {
                this.method536("js5connect_full");
                class360.method7405(1000);
            }
        } else if (field536 >= 2 && n == 6) {
            this.method536("js5connect_outofdate");
            class360.method7405(1000);
        } else if (field536 >= 4) {
            if (field510 > 5) {
                field535 = 3000;
            } else {
                this.method536("js5connect");
                class360.method7405(1000);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="gj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1419144711")
    final void method1304() {
        class486 class4862 = field564.method3249();
        class555 class5552 = client.field564.field1450;
        try {
            int n;
            int n2;
            Object object;
            Object object2;
            if (class68.field479 == class234.field2510) {
                if (class37.field228 == null && (field556.method2465() || field501 > 250)) {
                    class37.field228 = field556.method2467();
                    field556.method2466();
                    field556 = null;
                }
                if (class37.field228 != null) {
                    if (class4862 != null) {
                        class4862.vmethod9416();
                        class4862 = null;
                    }
                    class136.field1587 = null;
                    field566 = false;
                    field501 = 0;
                    if (field741.method10576()) {
                        if (this.method1441()) {
                            try {
                                this.method1294(class165.field1782);
                                class22.method327(class68.field472);
                            }
                            catch (Throwable throwable) {
                                class255.method5410(null, throwable);
                                class91.method2634(65);
                                return;
                            }
                        } else {
                            if (!this.method1418()) {
                                class91.method2634(65);
                                return;
                            }
                            try {
                                this.method1296(class18.field77, class22.field94);
                                class22.method327(class68.field490);
                            }
                            catch (Exception exception) {
                                class255.method5410(null, exception);
                                class91.method2634(65);
                                return;
                            }
                        }
                    } else {
                        class22.method327(class68.field470);
                    }
                }
            }
            if (class234.field2510 == class68.field472) {
                if (this.field551 != null) {
                    if (!this.field551.isDone()) {
                        return;
                    }
                    if (this.field551.isCancelled()) {
                        class91.method2634(65);
                        this.field551 = null;
                        return;
                    }
                    try {
                        object2 = (RefreshAccessTokenResponse)this.field551.get();
                        if (!object2.isSuccess()) {
                            class91.method2634(65);
                            this.field551 = null;
                            return;
                        }
                        class431.field4782 = object2.getAccessToken();
                        class165.field1782 = object2.getRefreshToken();
                        this.field551 = null;
                    }
                    catch (Exception exception) {
                        class255.method5410(null, exception);
                        class91.method2634(65);
                        this.field551 = null;
                        return;
                    }
                }
                if (this.field784 == null) {
                    class91.method2634(65);
                    return;
                }
                if (!this.field784.method267()) {
                    return;
                }
                if (this.field784.method266()) {
                    class255.method5410(this.field784.method283(), null);
                    class91.method2634(65);
                    this.field784 = null;
                    return;
                }
                object2 = this.field784.method273();
                if (((class20)object2).method291() != 200) {
                    class91.method2634(65);
                    this.field784 = null;
                    return;
                }
                field501 = 0;
                class504 class5042 = new class504(((class20)object2).method294());
                try {
                    class431.field4782 = class5042.method9559().getString("access_token");
                    class165.field1782 = class5042.method9559().getString("refresh_token");
                }
                catch (Exception exception) {
                    class255.method5410("Error parsing tokens", exception);
                    class91.method2634(65);
                    this.field784 = null;
                    return;
                }
                this.method1295(class431.field4782);
                class22.method327(class68.field490);
            }
            if (class234.field2510 == class68.field490) {
                if (this.field546 != null) {
                    if (!this.field546.isDone()) {
                        return;
                    }
                    if (this.field546.isCancelled()) {
                        class91.method2634(65);
                        this.field546 = null;
                        return;
                    }
                    try {
                        object2 = (OtlTokenResponse)this.field546.get();
                        if (!object2.isSuccess()) {
                            class91.method2634(65);
                            this.field546 = null;
                            return;
                        }
                        this.field597 = object2.getToken();
                        this.field546 = null;
                    }
                    catch (Exception exception) {
                        class255.method5410(null, exception);
                        class91.method2634(65);
                        this.field546 = null;
                        return;
                    }
                } else {
                    if (this.field650 == null) {
                        class91.method2634(65);
                        return;
                    }
                    if (!this.field650.method267()) {
                        return;
                    }
                    if (this.field650.method266()) {
                        class255.method5410(this.field650.method283(), null);
                        class91.method2634(65);
                        this.field650 = null;
                        return;
                    }
                    object2 = this.field650.method273();
                    if (((class20)object2).method291() != 200) {
                        class255.method5410("Login authentication error. Response code: " + ((class20)object2).method291() + " " + ((class20)object2).method301() + " Response body: " + ((class20)object2).method294(), null);
                        class91.method2634(65);
                        this.field650 = null;
                        return;
                    }
                    List list = (List)((class20)object2).method293().get("Content-Type");
                    if (list != null && list.contains(class502.field5137.method9541())) {
                        try {
                            object = new JSONObject(((class20)object2).method294());
                            this.field597 = ((JSONObject)object).getString("token");
                        }
                        catch (JSONException jSONException) {
                            class255.method5410(null, jSONException);
                            class91.method2634(65);
                            this.field650 = null;
                            return;
                        }
                    } else {
                        this.field597 = ((class20)object2).method294();
                    }
                    this.field650 = null;
                }
                field501 = 0;
                class22.method327(class68.field470);
            }
            if (class234.field2510 == class68.field470) {
                if (class136.field1587 == null) {
                    class136.field1587 = class34.field156.method4911(class526.field5324, class340.field3702);
                }
                if (class136.field1587.field2433 == 2) {
                    throw new IOException();
                }
                if (class136.field1587.field2433 == 1) {
                    class4862 = class371.method7618((Socket)class136.field1587.field2436, 40000, 5000);
                    field564.method3263(class4862);
                    class136.field1587 = null;
                    class22.method327(class68.field471);
                }
            }
            if (class68.field471 == class234.field2510) {
                field564.method3243();
                object2 = class288.method6320();
                ((class324)object2).field3442.method10300(class326.field3593.field3590);
                field564.method3257((class324)object2);
                field564.method3246();
                class5552.field5471 = 0;
                class22.method327(class68.field478);
            }
            if (class68.field478 == class234.field2510) {
                if (class328.field3606 != null) {
                    class328.field3606.method807();
                }
                if (class4862.vmethod9407(1)) {
                    n2 = class4862.vmethod9406();
                    if (class328.field3606 != null) {
                        class328.field3606.method807();
                    }
                    if (n2 != 0) {
                        class91.method2634(n2);
                        return;
                    }
                    class5552.field5471 = 0;
                    class22.method327(class68.field491);
                }
            }
            if (class68.field491 == class234.field2510) {
                if (class5552.field5471 < 8) {
                    n2 = class4862.vmethod9408();
                    if (n2 > 8 - class5552.field5471) {
                        n2 = 8 - class5552.field5471;
                    }
                    if (n2 > 0) {
                        class4862.vmethod9410(class5552.field5470, class5552.field5471, n2);
                        class5552.field5471 += n2;
                    }
                }
                if (class5552.field5471 == 8) {
                    class5552.field5471 = 0;
                    class285.field3124 = class5552.method10273();
                    class22.method327(class68.field473);
                }
            }
            if (class68.field473 == class234.field2510) {
                int n3;
                client.field564.field1450.field5471 = 0;
                field564.method3243();
                object2 = new class555(500);
                int[] nArray = new int[]{class37.field228.nextInt(), class37.field228.nextInt(), class37.field228.nextInt(), class37.field228.nextInt()};
                ((class556)object2).field5471 = 0;
                ((class556)object2).method10300(1);
                ((class556)object2).method10268(nArray[0]);
                ((class556)object2).method10268(nArray[1]);
                ((class556)object2).method10268(nArray[2]);
                ((class556)object2).method10268(nArray[3]);
                ((class556)object2).method10466(class285.field3124);
                if (field510 == 40) {
                    ((class556)object2).method10268(field563[0]);
                    ((class556)object2).method10268(field563[1]);
                    ((class556)object2).method10268(field563[2]);
                    ((class556)object2).method10268(field563[3]);
                } else {
                    if (field510 == 50) {
                        ((class556)object2).method10300(class146.field1663.vmethod10703());
                        ((class556)object2).method10268(class121.field1481);
                    } else {
                        ((class556)object2).method10300(field629.vmethod10703());
                        switch (client.field629.field1665) {
                            case 1: {
                                ((class556)object2).method10268(class544.field5403.method2909(class78.field955));
                                break;
                            }
                            case 2: 
                            case 4: {
                                ((class556)object2).method10267(class326.field3592);
                                ++((class556)object2).field5471;
                                break;
                            }
                            case 3: {
                                ((class556)object2).field5471 += 4;
                                break;
                            }
                        }
                    }
                    if (field741.method10576()) {
                        ((class556)object2).method10300(class561.field5525.vmethod10703());
                        ((class556)object2).method10442(this.field597);
                    } else {
                        ((class556)object2).method10300(class561.field5530.vmethod10703());
                        ((class556)object2).method10442(class78.field940);
                    }
                }
                ((class556)object2).method10306(class77.field916, class77.field917);
                field563 = nArray;
                object = class288.method6320();
                ((class324)object).field3442.field5471 = 0;
                if (field510 == 40) {
                    ((class324)object).field3442.method10300(class326.field3582.field3590);
                } else {
                    ((class324)object).field3442.method10300(class326.field3584.field3590);
                }
                ((class324)object).field3442.method10266(0);
                int n4 = ((class324)object).field3442.field5471;
                ((class324)object).field3442.method10268(228);
                ((class324)object).field3442.method10268(1);
                ((class324)object).field3442.method10300(field504);
                ((class324)object).field3442.method10300(field498);
                int n5 = 0;
                ((class324)object).field3442.method10300(n5);
                ((class324)object).field3442.method10275(((class556)object2).field5470, 0, ((class556)object2).field5471);
                int n6 = ((class324)object).field3442.field5471;
                ((class324)object).field3442.method10442(class78.field955);
                ((class324)object).field3442.method10300((field722 ? 1 : 0) << 1 | (field502 ? 1 : 0));
                ((class324)object).field3442.method10266(class128.field1521);
                ((class324)object).field3442.method10266(class363.field4038);
                class555 class5553 = ((class324)object).field3442;
                if (field782 != null) {
                    class5553.method10275(field782, 0, field782.length);
                } else {
                    byte[] byArray;
                    byte[] byArray2 = new byte[24];
                    try {
                        class216.field2392.method10050(0L);
                        class216.field2392.method10052(byArray2);
                        for (n3 = 0; n3 < 24 && byArray2[n3] == 0; ++n3) {
                        }
                        if (n3 >= 24) {
                            throw new IOException();
                        }
                    }
                    catch (Exception exception) {
                        for (int i = 0; i < 24; ++i) {
                            byArray2[i] = -1;
                        }
                    }
                    byte[] byArray3 = byArray = byArray2;
                    class5553.method10275(byArray3, 0, byArray3.length);
                }
                ((class324)object).field3442.method10442(class406.field4674);
                ((class324)object).field3442.method10268(class483.field5046);
                ((class324)object).field3442.method10300(0);
                class556 class5562 = new class556(class437.field4816.method9654());
                class437.field4816.method9653(class5562);
                ((class324)object).field3442.method10275(class5562.field5470, 0, class5562.field5470.length);
                ((class324)object).field3442.method10300(field504);
                ((class324)object).field3442.method10268(0);
                if (class273.field3035) {
                    class382.method7645((class324)object);
                } else {
                    ((class324)object).field3442.method10268(class494.field5117.field4590);
                    ((class324)object).field3442.method10331(class188.field2104.field4590);
                    ((class324)object).field3442.method10333(class45.field291.field4590);
                    ((class324)object).field3442.method10268(class59.field398.field4590);
                    ((class324)object).field3442.method10268(class42.field276.field4590);
                    ((class324)object).field3442.method10333(class220.field2408.field4590);
                    ((class324)object).field3442.method10333(class167.field1793.field4590);
                    ((class324)object).field3442.method10268(class252.field2704.field4590);
                    ((class324)object).field3442.method10332(class157.field1718.field4590);
                    ((class324)object).field3442.method10332(class259.field2746.field4590);
                    ((class324)object).field3442.method10333(class268.field2973.field4590);
                    ((class324)object).field3442.method10333(class283.field3102.field4590);
                    ((class324)object).field3442.method10268(0);
                    ((class324)object).field3442.method10332(class166.field1785.field4590);
                    ((class324)object).field3442.method10268(class137.field1603.field4590);
                    ((class324)object).field3442.method10333(class544.field5399.field4590);
                    ((class324)object).field3442.method10268(class69.field815.field4590);
                    ((class324)object).field3442.method10268(class161.field1762.field4590);
                    ((class324)object).field3442.method10333(class221.field2421.field4590);
                    ((class324)object).field3442.method10332(class191.field2120.field4590);
                    ((class324)object).field3442.method10268(class68.field494.field4590);
                }
                ((class324)object).field3442.method10492(nArray, n6, ((class324)object).field3442.field5471);
                ((class324)object).field3442.method10278(((class324)object).field3442.field5471 - n4);
                field564.method3257((class324)object);
                field564.method3246();
                client.field564.field1446 = new class573(nArray);
                int[] nArray2 = new int[4];
                for (n3 = 0; n3 < 4; ++n3) {
                    nArray2[n3] = nArray[n3] + 50;
                }
                class5552.method10223(nArray2);
                class22.method327(class68.field469);
            }
            if (class234.field2510 == class68.field469 && class4862.vmethod9408() > 0) {
                n2 = class4862.vmethod9406();
                if (n2 == 61) {
                    n = class4862.vmethod9408();
                    class380.field4145 = n == 1 && class4862.vmethod9406() == 1;
                    class22.method327(class68.field473);
                }
                if (n2 == 21 && field510 == 20) {
                    class22.method327(class68.field481);
                } else if (n2 == 2) {
                    if (class273.field3035) {
                        class22.method327(class68.field492);
                    } else {
                        class22.method327(class68.field483);
                    }
                } else if (n2 == 15 && field510 == 40) {
                    client.field564.field1452 = -1;
                    class22.method327(class68.field475);
                } else if (n2 == 64) {
                    class22.method327(class68.field487);
                } else if (n2 == 23 && field743 < 1) {
                    ++field743;
                    class22.method327(class68.field479);
                } else if (n2 == 29) {
                    class22.method327(class68.field495);
                } else {
                    if (n2 != 69) {
                        class91.method2634(n2);
                        return;
                    }
                    class22.method327(class68.field476);
                }
            }
            if (class68.field492 == class234.field2510) {
                field765 = true;
                class227.method5078(class95.field1153);
                class360.method7405(0);
            }
            if (class234.field2510 == class68.field476 && class4862.vmethod9408() >= 2) {
                class4862.vmethod9410(class5552.field5470, 0, 2);
                class5552.field5471 = 0;
                class18.field79 = class5552.method10307();
                class22.method327(class68.field477);
            }
            if (class234.field2510 == class68.field477 && class4862.vmethod9408() >= class18.field79) {
                class5552.field5471 = 0;
                class4862.vmethod9410(class5552.field5470, class5552.field5471, class18.field79);
                object2 = class396.method7886()[class5552.method10282()];
                try {
                    class3 class347 = class111.method3126((class6)object2);
                    this.field559 = new class7(class5552, class347);
                    class22.method327(class68.field489);
                }
                catch (Exception exception) {
                    class91.method2634(22);
                    return;
                }
            }
            if (class234.field2510 == class68.field489 && this.field559.method46()) {
                this.field558 = this.field559.method57();
                this.field559.method47();
                this.field559 = null;
                if (this.field558 == null) {
                    class91.method2634(22);
                    return;
                }
                field564.method3243();
                object2 = class288.method6320();
                ((class324)object2).field3442.method10300(class326.field3586.field3590);
                ((class324)object2).field3442.method10266(this.field558.field5471);
                ((class324)object2).field3442.method10478(this.field558);
                field564.method3257((class324)object2);
                field564.method3246();
                this.field558 = null;
                class22.method327(class68.field469);
            }
            if (class68.field487 == class234.field2510 && class4862.vmethod9408() > 0) {
                class30.field134 = class4862.vmethod9406();
                class22.method327(class68.field480);
            }
            if (class68.field480 == class234.field2510 && class4862.vmethod9408() >= class30.field134) {
                class4862.vmethod9410(class5552.field5470, 0, class30.field134);
                class5552.field5471 = 0;
                class22.method327(class68.field469);
            }
            if (class68.field481 == class234.field2510 && class4862.vmethod9408() > 0) {
                field613 = (class4862.vmethod9406() + 3) * 60;
                class22.method327(class68.field482);
            }
            if (class68.field482 == class234.field2510) {
                field501 = 0;
                class150.method3595("You have only just left another world.", "Your profile will be transferred in:", field613 / 60 + " seconds.");
                if (--field613 > 0) return;
                class22.method327(class68.field479);
                return;
            }
            if (class68.field474 == class234.field2510) {
                object2 = class288.method6320();
                ((class324)object2).field3442.method10300(class326.field3587.field3590);
                ((class324)object2).field3442.method10266(class326.field3587.field3591);
                Calender.method7597((class324)object2);
                field564.method3257((class324)object2);
                field564.method3246();
                class22.method327(class68.field483);
                return;
            }
            if (class234.field2510 == class68.field483 && class4862.vmethod9408() >= 1) {
                class125.field1506 = class4862.vmethod9406();
                if (class125.field1506 != class326.field3588.field3591) {
                    class91.method2634(class125.field1506);
                    return;
                }
                class22.method327(class68.field484);
            }
            if (class68.field484 == class234.field2510 && class4862.vmethod9408() >= class125.field1506) {
                n2 = class4862.vmethod9406() == 1 ? 1 : 0;
                class4862.vmethod9410(class5552.field5470, 0, 4);
                class5552.field5471 = 0;
                n = 0;
                if (n2 != 0) {
                    n = class5552.method10222() << 24;
                    n |= class5552.method10222() << 16;
                    n |= class5552.method10222() << 8;
                    class544.field5403.method2907(class78.field955, n |= class5552.method10222());
                }
                if (field555) {
                    class544.field5403.method2901(class78.field955);
                } else {
                    class544.field5403.method2901(null);
                }
                class79.method2456();
                field671 = class4862.vmethod9406();
                field677 = class4862.vmethod9406() == 1;
                field623 = class4862.vmethod9406();
                field623 <<= 8;
                field623 += class4862.vmethod9406();
                field628 = class4862.vmethod9406();
                class4862.vmethod9410(class5552.field5470, 0, 8);
                class5552.field5471 = 0;
                this.field691 = class5552.method10273();
                class4862.vmethod9410(class5552.field5470, 0, 8);
                class5552.field5471 = 0;
                field736 = class5552.method10273();
                class4862.vmethod9410(class5552.field5470, 0, 8);
                class5552.field5471 = 0;
                field630 = class5552.method10273();
                class143.method3517().method4977(this.field547);
                class22.method327(class68.field493);
            }
            if (class68.field493 == class234.field2510 && class4862.vmethod9408() >= client.field564.field1452) {
                class4862.vmethod9410(class5552.field5470, 0, 1);
                class5552.field5471 = 0;
                if (class5552.method10224()) {
                    class4862.vmethod9410(class5552.field5470, 1, 1);
                    class5552.field5471 = 0;
                }
                object2 = class279.method5975();
                n = class5552.method10253();
                if (n < 0) throw new IOException("Invalid ServerProt: " + n + " at " + class5552.field5471);
                if (n >= ((class325[])object2).length) {
                    throw new IOException("Invalid ServerProt: " + n + " at " + class5552.field5471);
                }
                client.field564.field1451 = object2[n];
                client.field564.field1452 = client.field564.field1451.field3581;
                class4862.vmethod9410(class5552.field5470, 0, 2);
                class5552.field5471 = 0;
                client.field564.field1452 = class5552.method10307();
                try {
                    object = field521;
                    JSObject.getWindow((Applet)object).call("zap", null);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                class22.method327(class68.field486);
            }
            if (class68.field486 == class234.field2510) {
                if (class4862.vmethod9408() < client.field564.field1452) return;
                class5552.field5471 = 0;
                class4862.vmethod9410(class5552.field5470, 0, client.field564.field1452);
                field763.method8940();
                class63.method1230();
                field673.method3131(class5552);
                class53.field339 = class407.field4693;
                class14.field62 = -1;
                class70.method2091(false, class5552);
                client.field564.field1451 = null;
                field511 = false;
                return;
            }
            if (class68.field495 == class234.field2510 && class4862.vmethod9408() >= 2) {
                class5552.field5471 = 0;
                class4862.vmethod9410(class5552.field5470, 0, 2);
                class5552.field5471 = 0;
                class298.field3239 = class5552.method10307();
                class22.method327(class68.field488);
            }
            if (class68.field488 == class234.field2510 && class4862.vmethod9408() >= class298.field3239) {
                class5552.field5471 = 0;
                class4862.vmethod9410(class5552.field5470, 0, class298.field3239);
                class5552.field5471 = 0;
                object2 = class5552.method10290();
                String string = class5552.method10290();
                object = class5552.method10290();
                class150.method3595((String)object2, string, (String)object);
                class360.method7405(10);
                if (field741.method10576()) {
                    class114.method3212(9);
                }
            }
            if (class234.field2510 == class68.field475) {
                if (client.field564.field1452 == -1) {
                    if (class4862.vmethod9408() < 2) {
                        return;
                    }
                    class4862.vmethod9410(class5552.field5470, 0, 2);
                    class5552.field5471 = 0;
                    client.field564.field1452 = class5552.method10307();
                }
                if (class4862.vmethod9408() < client.field564.field1452) {
                    return;
                }
                class4862.vmethod9410(class5552.field5470, 0, client.field564.field1452);
                class5552.field5471 = 0;
                n2 = client.field564.field1452;
                field763.method8942();
                class391.method7820();
                field673.method3131(class5552);
                if (n2 == class5552.field5471) return;
                throw new RuntimeException();
            }
            if (++field501 <= 2000) return;
            if (field743 >= 1) {
                class91.method2634(-3);
                return;
            }
            class340.field3702 = class340.field3702 == class358.field3822 ? class173.field1829 : class358.field3822;
            ++field743;
            class22.method327(class68.field479);
            return;
        }
        catch (IOException iOException) {
            if (field743 >= 1) {
                class91.method2634(-2);
                return;
            }
            class340.field3702 = class358.field3822 == class340.field3702 ? class173.field1829 : class358.field3822;
            ++field743;
            class22.method327(class68.field479);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="hr")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1454298274")
    final void method1305() {
        Object object;
        Object object22;
        class514 class5142;
        Object object32;
        class514 class5143;
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        Object object4;
        int n7;
        Object object52;
        boolean bl;
        if (field769 > 1) {
            --field769;
        }
        if (field627 > 0) {
            --field627;
        }
        if (field566) {
            field566 = false;
            class76.method2363();
            return;
        }
        if (!field647) {
            class102.method2990();
        }
        this.method1312();
        if (field510 != 30) {
            return;
        }
        while (bl = (object52 = (class37)class36.field219.method8046()) != null) {
            object52 = class90.method2629(class322.field3328, client.field564.field1446);
            ((class324)object52).field3442.method10300(0);
            n7 = ((class324)object52).field3442.field5471;
            class487.method9412(((class324)object52).field3442);
            ((class324)object52).field3442.method10279(((class324)object52).field3442.field5471 - n7);
            field564.method3257((class324)object52);
        }
        if (client.field763.field4907) {
            object4 = class90.method2629(class322.field3319, client.field564.field1446);
            ((class324)object4).field3442.method10300(0);
            n6 = ((class324)object4).field3442.field5471;
            field763.method8949(((class324)object4).field3442);
            ((class324)object4).field3442.method10279(((class324)object4).field3442.field5471 - n6);
            field564.method3257((class324)object4);
            field763.method8964();
        }
        object4 = class168.field1794.field1096;
        synchronized (object4) {
            if (field497) {
                if (class35.field200 != 0 || class168.field1794.field1091 >= 40) {
                    object52 = null;
                    n7 = 0;
                    n5 = 0;
                    n4 = 0;
                    n3 = 0;
                    for (n2 = 0; n2 < class168.field1794.field1091 && (object52 == null || ((class324)object52).field3442.field5471 - n7 < 246); ++n2) {
                        int n8;
                        int n9;
                        int n10;
                        n5 = n2;
                        n = class168.field1794.field1093[n2];
                        if (n < -1) {
                            n = -1;
                        } else if (n > 65534) {
                            n = 65534;
                        }
                        int n11 = class168.field1794.field1092[n2];
                        if (n11 < -1) {
                            n11 = -1;
                        } else if (n11 > 65534) {
                            n11 = 65534;
                        }
                        if (n11 == field517 && n == field518) continue;
                        if (object52 == null) {
                            object52 = class90.method2629(class322.field3320, client.field564.field1446);
                            ((class324)object52).field3442.method10300(0);
                            n7 = ((class324)object52).field3442.field5471;
                            ((class324)object52).field3442.field5471 += 2;
                            n4 = 0;
                            n3 = 0;
                        }
                        if (-1L != field557) {
                            n10 = n11 - field517;
                            n9 = n - field518;
                            n8 = (int)((class168.field1794.field1089[n2] - field557) / 20L);
                            n4 = (int)((long)n4 + (class168.field1794.field1089[n2] - field557) % 20L);
                        } else {
                            n10 = n11;
                            n9 = n;
                            n8 = Integer.MAX_VALUE;
                        }
                        field517 = n11;
                        field518 = n;
                        if (n8 < 8 && n10 >= -32 && n10 <= 31 && n9 >= -32 && n9 <= 31) {
                            ((class324)object52).field3442.method10266((n8 << 12) + (n9 += 32) + ((n10 += 32) << 6));
                        } else if (n8 < 32 && n10 >= -128 && n10 <= 127 && n9 >= -128 && n9 <= 127) {
                            ((class324)object52).field3442.method10300(n8 + 128);
                            ((class324)object52).field3442.method10266((n9 += 128) + ((n10 += 128) << 8));
                        } else if (n8 < 32) {
                            ((class324)object52).field3442.method10300(n8 + 192);
                            if (n11 == -1 || n == -1) {
                                ((class324)object52).field3442.method10268(Integer.MIN_VALUE);
                            } else {
                                ((class324)object52).field3442.method10268(n11 | n << 16);
                            }
                        } else {
                            ((class324)object52).field3442.method10266((n8 & 0x1FFF) + 57344);
                            if (n11 == -1 || n == -1) {
                                ((class324)object52).field3442.method10268(Integer.MIN_VALUE);
                            } else {
                                ((class324)object52).field3442.method10268(n11 | n << 16);
                            }
                        }
                        ++n3;
                        field557 = class168.field1794.field1089[n2];
                    }
                    if (object52 != null) {
                        ((class324)object52).field3442.method10279(((class324)object52).field3442.field5471 - n7);
                        n2 = ((class324)object52).field3442.field5471;
                        ((class324)object52).field3442.field5471 = n7;
                        ((class324)object52).field3442.method10300(n4 / n3);
                        ((class324)object52).field3442.method10300(n4 % n3);
                        ((class324)object52).field3442.field5471 = n2;
                        field564.method3257((class324)object52);
                    }
                    if (n5 >= class168.field1794.field1091) {
                        class168.field1794.field1091 = 0;
                    } else {
                        class168.field1794.field1091 -= n5;
                        System.arraycopy(class168.field1794.field1092, n5, class168.field1794.field1092, 0, class168.field1794.field1091);
                        System.arraycopy(class168.field1794.field1093, n5, class168.field1794.field1093, 0, class168.field1794.field1091);
                        System.arraycopy(class168.field1794.field1089, n5, class168.field1794.field1089, 0, class168.field1794.field1091);
                    }
                }
            } else {
                class168.field1794.field1091 = 0;
            }
        }
        if (class35.field200 == 1 || !class25.field109 && class35.field200 == 4 || class35.field200 == 2) {
            long l = class35.field191 - field787 * -1L;
            if (l > 32767L) {
                l = 32767L;
            }
            field787 = class35.field191 * -1L;
            n7 = class35.field211;
            if (n7 < 0) {
                n7 = 0;
            } else if (n7 > class363.field4038) {
                n7 = class363.field4038;
            }
            n5 = class35.field209;
            if (n5 < 0) {
                n5 = 0;
            } else if (n5 > class128.field1521) {
                n5 = class128.field1521;
            }
            n4 = (int)l;
            class5143 = class90.method2629(class322.field3414, client.field564.field1446);
            ((class324)class5143).field3442.method10266((class35.field200 == 2 ? 1 : 0) + (n4 << 1));
            ((class324)class5143).field3442.method10266(n5);
            ((class324)class5143).field3442.method10266(n7);
            field564.method3257((class324)class5143);
        }
        if (field704 != 0) {
            object4 = class90.method2629(class322.field3388, client.field564.field1446);
            ((class324)object4).field3442.method10266(field704);
            field564.method3257((class324)object4);
        }
        if (client.field731.field2979 > 0) {
            object4 = class90.method2629(class322.field3354, client.field564.field1446);
            ((class324)object4).field3442.method10266(0);
            n6 = ((class324)object4).field3442.field5471;
            long l = class37.method724();
            for (n4 = 0; n4 < client.field731.field2979; ++n4) {
                long l2 = l - field740;
                if (l2 > 0xFFFFFFL) {
                    l2 = 0xFFFFFFL;
                }
                field740 = l;
                ((class324)object4).field3442.method10310(client.field731.field2984[n4]);
                ((class324)object4).field3442.method10327((int)l2);
            }
            ((class324)object4).field3442.method10278(((class324)object4).field3442.field5471 - n6);
            field564.method3257((class324)object4);
        }
        if (field618 > 0) {
            --field618;
        }
        if (field731.method5776(96) || field731.method5776(97) || field731.method5776(98) || field731.method5776(99)) {
            field604 = true;
        }
        if (field604 && field618 <= 0) {
            field618 = 20;
            field604 = false;
            object4 = class90.method2629(class322.field3367, client.field564.field1446);
            ((class324)object4).field3442.method10319(field503);
            ((class324)object4).field3442.method10319(field588);
            field564.method3257((class324)object4);
        }
        if (class80.field998 && !field520) {
            field520 = true;
            object4 = class90.method2629(class322.field3418, client.field564.field1446);
            ((class324)object4).field3442.method10300(1);
            field564.method3257((class324)object4);
        }
        if (!class80.field998 && field520) {
            field520 = false;
            object4 = class90.method2629(class322.field3418, client.field564.field1446);
            ((class324)object4).field3442.method10300(0);
            field564.method3257((class324)object4);
        }
        if (class420.field4722 != null) {
            class420.field4722.method9720();
        }
        class346.method6950();
        if (class20.field91) {
            class450.method8884();
            class20.field91 = false;
        }
        if (field739 != class34.field189.field1321) {
            field739 = class34.field189.field1321;
            class388.method7701(class34.field189.field1321);
        }
        if (field510 != 30) {
            return;
        }
        for (Object object52 : field508) {
            object32 = (class98)((class103)object52).field1333.method7996();
            while (object32 != null) {
                block122: {
                    block123: {
                        block120: {
                            block121: {
                                if (((class98)object32).field1186 > 0) {
                                    --((class98)object32).field1186;
                                }
                                if (((class98)object32).field1186 != 0) break block120;
                                if (((class98)object32).field1181 < 0) break block121;
                                n4 = ((class98)object32).field1181;
                                n3 = ((class98)object32).field1179;
                                class5142 = class142.method3512(n4);
                                if (n3 == 11) {
                                    n3 = 10;
                                }
                                if (n3 >= 5 && n3 <= 8) {
                                    n3 = 4;
                                }
                                if ((n5 = (int)(class5142.method5510(n3) ? 1 : 0)) == 0) break block122;
                            }
                            class168.method3819((class103)object52, ((class98)object32).field1188, ((class98)object32).field1180, ((class98)object32).field1187, ((class98)object32).field1182, ((class98)object32).field1181, ((class98)object32).field1184, ((class98)object32).field1179, ((class98)object32).field1189);
                            ((class514)object32).method9623();
                            break block122;
                        }
                        if (((class98)object32).field1183 > 0) {
                            --((class98)object32).field1183;
                        }
                        if (((class98)object32).field1183 != 0 || ((class98)object32).field1187 < 1 || ((class98)object32).field1182 < 1 || ((class98)object32).field1187 > 102 || ((class98)object32).field1182 > 102) break block122;
                        if (((class98)object32).field1192 < 0) break block123;
                        n4 = ((class98)object32).field1192;
                        n3 = ((class98)object32).field1194;
                        class5142 = class142.method3512(n4);
                        if (n3 == 11) {
                            n3 = 10;
                        }
                        if (n3 >= 5 && n3 <= 8) {
                            n3 = 4;
                        }
                        if ((n5 = (int)(class5142.method5510(n3) ? 1 : 0)) == 0) break block122;
                    }
                    class168.method3819((class103)object52, ((class98)object32).field1188, ((class98)object32).field1180, ((class98)object32).field1187, ((class98)object32).field1182, ((class98)object32).field1192, ((class98)object32).field1185, ((class98)object32).field1194, ((class98)object32).field1189);
                    ((class98)object32).field1183 = -1;
                    if (((class98)object32).field1192 == ((class98)object32).field1181 && ((class98)object32).field1181 == -1) {
                        ((class514)object32).method9623();
                    } else if (((class98)object32).field1181 == ((class98)object32).field1192 && ((class98)object32).field1184 == ((class98)object32).field1185 && ((class98)object32).field1179 == ((class98)object32).field1194) {
                        ((class514)object32).method9623();
                    }
                }
                object32 = (class98)((class103)object52).field1333.method8005();
            }
        }
        class481.method9355();
        ++client.field564.field1454;
        if (client.field564.field1454 > 750) {
            class76.method2363();
            return;
        }
        class257.method5425();
        class82.method2491();
        for (Object object52 : field508) {
            for (n7 = 0; n7 < ((class103)object52).field1334; ++n7) {
                n5 = ((class103)object52).field1335[n7];
                object22 = ((class103)object52).field1318[n5];
                if (object22 == null) continue;
                ((class480)object22).method9301(field514);
            }
        }
        object4 = client.field673.field1412;
        for (Object object32 : field508) {
            for (n5 = 0; n5 < client.field673.field1406; ++n5) {
                object22 = ((class103)object32).field1329[object4[n5]];
                if (object22 == null || ((class99)object22).field1219 <= 0) continue;
                --((class99)object22).field1219;
                if (((class99)object22).field1219 != 0) continue;
                ((class99)object22).field1216 = null;
            }
            for (n5 = 0; n5 < ((class103)object32).field1331; ++n5) {
                n4 = ((class103)object32).field1332[n5];
                class5143 = ((class103)object32).field1330[n4];
                if (class5143 == null || ((class99)class5143).field1219 <= 0) continue;
                --((class99)class5143).field1219;
                if (((class99)class5143).field1219 != 0) continue;
                ((class99)class5143).field1216 = null;
            }
        }
        ++field581;
        if (field603 != 0 && (field622 = field622 * 400 + 20) * 400 >= 400) {
            field603 = 0;
        }
        object4 = class424.field4739;
        object52 = class104.field1346;
        class424.field4739 = null;
        class104.field1346 = null;
        field607 = null;
        field683 = false;
        field523 = false;
        field733 = 0;
        while (field731.method5772() && field733 < 128) {
            if (field671 >= 2 && field731.method5776(82) && client.field731.field2989 == 66) {
                object = new StringBuilder();
                object22 = class115.field1443.iterator();
                while (object22.hasNext()) {
                    class5143 = (class64)object22.next();
                    if (((class64)class5143).field451 != null && !((class64)class5143).field451.isEmpty()) {
                        ((StringBuilder)object).append(((class64)class5143).field451).append(':');
                    }
                    ((StringBuilder)object).append(((class64)class5143).field454).append('\n');
                }
                object = object32 = ((StringBuilder)object).toString();
                field521.method529((String)object);
                continue;
            }
            if (field594 == 1 && client.field731.field2975 > '\u0000') continue;
            client.field735[client.field733] = client.field731.field2989;
            client.field589[client.field733] = client.field731.field2975;
            ++field733;
        }
        if (class30.method480() && field731.method5776(82) && field731.method5776(81) && field704 != 0) {
            n7 = class407.field4693.field1137 - field704;
            if (n7 < 0) {
                n7 = 0;
            } else if (n7 > 3) {
                n7 = 3;
            }
            if (n7 != class407.field4693.field1137) {
                n5 = class407.field4693.field1266[0] + class34.field189.field1324;
                n4 = class407.field4693.field1221[0] + class34.field189.field1325;
                class5143 = class90.method2629(class322.field3368, client.field564.field1446);
                ((class324)class5143).field3442.method10319(n5);
                ((class324)class5143).field3442.method10320(n4);
                ((class324)class5143).field3442.method10332(0);
                ((class324)class5143).field3442.method10310(n7);
                field564.method3257((class324)class5143);
            }
            field704 = 0;
        }
        if (field663 != -1) {
            class367.method7605(field663, 0, 0, class128.field1521, class363.field4038, 0, 0);
        }
        ++field549;
        while ((object32 = (class90)field666.method8016()) != null) {
            object = ((class90)object32).field1077;
            if (((class361)object).field3863 >= 0 && ((object22 = class170.field1807.method7031(((class361)object).field4026)) == null || ((class361)object22).field4014 == null || ((class361)object).field3863 >= ((class361)object22).field4014.length || object != ((class361)object22).field4014[((class361)object).field3863])) continue;
            class471.method9136((class90)object32);
        }
        while ((object32 = (class90)field708.method8016()) != null) {
            object = ((class90)object32).field1077;
            if (((class361)object).field3863 >= 0 && ((object22 = class170.field1807.method7031(((class361)object).field4026)) == null || ((class361)object22).field4014 == null || ((class361)object).field3863 >= ((class361)object22).field4014.length || object != ((class361)object22).field4014[((class361)object).field3863])) continue;
            class471.method9136((class90)object32);
        }
        while ((object32 = (class90)field706.method8016()) != null) {
            object = ((class90)object32).field1077;
            if (((class361)object).field3863 >= 0 && ((object22 = class170.field1807.method7031(((class361)object).field4026)) == null || ((class361)object22).field4014 == null || ((class361)object).field3863 >= ((class361)object22).field4014.length || object != ((class361)object22).field4014[((class361)object).field3863])) continue;
            class471.method9136((class90)object32);
        }
        n7 = 0;
        while ((object = (class268)field709.method8016()) != null) {
            if (((class268)object).field2971.field3873 == 12) {
                n7 = 1;
            }
            class307.method6537((class268)object);
        }
        if (n7 == 0 && class35.field200 == 1) {
            field575.method5738();
        }
        this.method1363();
        if (class420.field4722 != null) {
            class420.field4722.method9730(class34.field189.field1321, (class53.field339.vmethod9352() >> 7) + class34.field189.field1324, (class53.field339.vmethod9331() >> 7) + class34.field189.field1325, false);
            class420.field4722.method9747();
        }
        if (field675 != null) {
            this.method1561();
        }
        for (Object object22 : field508) {
            class5143 = ((class103)object22).field1319;
            if (!((class187)class5143).method4423()) continue;
            n2 = ((class187)class5143).field2053;
            n = ((class187)class5143).field2054;
            class324 class3242 = class90.method2629(class322.field3398, client.field564.field1446);
            class3242.field3442.method10300(5);
            class3242.field3442.method10300(field731.method5776(82) ? (field731.method5776(81) ? 2 : 1) : 0);
            class3242.field3442.method10266(n + ((class103)object22).field1325);
            class3242.field3442.method10319(n2 + ((class103)object22).field1324);
            field564.method3257(class3242);
            field620 = class35.field209;
            field717 = class35.field211;
            field603 = 1;
            field622 = 0;
            field744 = n2;
            field745 = n;
            ((class187)class5143).method4411();
        }
        if (object4 != class424.field4739) {
            if (object4 != null) {
                class122.method3325((class361)object4);
            }
            if (class424.field4739 != null) {
                class122.method3325(class424.field4739);
            }
        }
        if (object52 != class104.field1346 && field654 == field655) {
            if (object52 != null) {
                class122.method3325((class361)object52);
            }
            if (class104.field1346 != null) {
                class122.method3325(class104.field1346);
            }
        }
        if (class104.field1346 != null) {
            if (field654 < field655 && field655 == ++field654) {
                class122.method3325(class104.field1346);
            }
        } else if (field654 > 0) {
            --field654;
        }
        class23.method335();
        if (field762) {
            class92.method2645();
        } else if (field797) {
            class145.method3555();
        }
        n5 = 0;
        while (n5 < 5) {
            int n12 = n5++;
            field705[n12] = field705[n12] + 1;
        }
        class19.field80.method3188();
        n5 = class201.method4708();
        n3 = n4 = class34.field186.method362();
        if (n5 > 15000 && n3 > 15000) {
            field627 = 250;
            class35.field192 = 14500;
            class5142 = class90.method2629(class322.field3401, client.field564.field1446);
            field564.method3257((class324)class5142);
        }
        class10.field54.method2022();
        for (n2 = 0; n2 < field792.size(); ++n2) {
            if (class166.method3808((Integer)field792.get(n2)) == 2) continue;
            field792.remove(n2);
            --n2;
        }
        ++client.field564.field1455;
        if (client.field564.field1455 > 50) {
            class5142 = class90.method2629(class322.field3382, client.field564.field1446);
            field564.method3257((class324)class5142);
        }
        try {
            field564.method3246();
        }
        catch (IOException iOException) {
            class76.method2363();
        }
        class143.method3517().method4982();
    }

    @Override
    @ObfuscatedName(value="hw")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="-81")
    public void vmethod6894(int n, int n2) {
        if (field564 != null && client.field564.field1446 != null) {
            if (n > -1 && class544.field5403.method2896() > 0 && !field540) {
                class324 class3242 = class90.method2629(class322.field3381, client.field564.field1446);
                class3242.field3442.method10268(n);
                field564.method3257(class3242);
            }
            return;
        }
    }

    @ObfuscatedName(value="id")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-15")
    void method1671() {
        int n = class128.field1521;
        int n2 = class363.field4038;
        if (this.field182 < n) {
            n = this.field182;
        }
        if (this.field178 < n2) {
            n2 = this.field178;
        }
        if (class544.field5403 != null) {
            try {
                class26.method402(field521, "resize", new Object[]{class194.method4501()});
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="io")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1877548934")
    final void method1608() {
        Object object;
        int n;
        int n2;
        int n3;
        int n4;
        block25: {
            if (field663 != -1) {
                class9.method83(field663);
            }
            n4 = 0;
            while (true) {
                block27: {
                    block28: {
                        block30: {
                            block31: {
                                block29: {
                                    block26: {
                                        if (n4 >= field711) break block26;
                                        if (!field713[n4]) break block27;
                                        break block28;
                                    }
                                    field619 = field514;
                                    field652 = -1;
                                    field653 = -1;
                                    if (field663 != -1) {
                                        field711 = 0;
                                        class190.method4459(field663, 0, 0, class128.field1521, class363.field4038, 0, 0, -1);
                                    }
                                    class566.method10640();
                                    if (field703) {
                                        if (field603 == 1) {
                                            class86.field1054[field622 * 400 / 100].method10774(field620 - 8, field717 - 8);
                                        }
                                        if (field603 == 2) {
                                            class86.field1054[field622 * 400 / 100 + 4].method10774(field620 - 8, field717 - 8);
                                        }
                                    }
                                    if (field647) break block29;
                                    if (field652 == -1) break block30;
                                    break block31;
                                }
                                field648.method10928();
                                break block30;
                            }
                            n4 = field652;
                            n3 = field653;
                            if ((client.field648.field5612 >= 2 || field496 != 0 || field522) && field598) {
                                n = n2 = client.field648.field5612 - 1;
                                object = field496 == 1 && client.field648.field5612 < 2 ? "Use" + " " + field570 + " " + "->" : (field522 && client.field648.field5612 < 2 ? field661 + " " + field662 + " " + "->" : field648.method10916(n));
                                if (client.field648.field5612 > 2) {
                                    object = (String)object + class97.method2752(0xFFFFFF) + " " + '/' + " " + (client.field648.field5612 - 2) + " more options";
                                }
                                class74.field892.method8697((String)object, n4 + 4, n3 + 15, 0xFFFFFF, 0, field514 / 1000);
                            }
                        }
                        if (field720 == 3) {
                            break;
                        }
                        break block25;
                    }
                    client.field732[n4] = true;
                }
                client.field580[n4] = field713[n4];
                client.field713[n4] = false;
                ++n4;
            }
            for (n4 = 0; n4 < field711; ++n4) {
                if (field580[n4]) {
                    class566.method10680(field716[n4], field611[n4], field718[n4], field605[n4], 0xFF00FF, 128);
                    continue;
                }
                if (!field732[n4]) continue;
                class566.method10680(field716[n4], field611[n4], field718[n4], field605[n4], 0xFF0000, 128);
            }
        }
        n4 = class34.field189.field1321;
        n3 = class407.field4693.field1213;
        n2 = class407.field4693.field1196;
        n = field581;
        object = (class71)class71.field846.method7996();
        while (true) {
            block32: {
                block33: {
                    Object object2;
                    int n5;
                    block38: {
                        block37: {
                            block35: {
                                block36: {
                                    block34: {
                                        if (object == null) {
                                            field581 = 0;
                                            return;
                                        }
                                        if (((class71)object).field842 == -1 && ((class71)object).field849 == null) break block32;
                                        int n6 = 0;
                                        if (n3 > ((class71)object).field838 * 16384) {
                                            n6 += n3 - ((class71)object).field838 * 16384;
                                        } else if (n3 < ((class71)object).field837 * 16384) {
                                            n6 += ((class71)object).field837 * 16384 - n3;
                                        }
                                        if (n2 > ((class71)object).field839 * 16384) {
                                            n6 += n2 - ((class71)object).field839 * 16384;
                                        } else if (n2 < ((class71)object).field834 * 16384) {
                                            n6 += ((class71)object).field834 * 16384 - n2;
                                        }
                                        n6 = Math.max(n6 - 64, 0);
                                        if (n6 >= ((class71)object).field840 || class544.field5403.method2900() == 0 || n4 != ((class71)object).field835) break block33;
                                        float f = ((class71)object).field841 < ((class71)object).field840 ? Math.min(Math.max((float)(((class71)object).field840 - n6) / (float)(((class71)object).field840 - ((class71)object).field841), 0.0f), 1.0f) : 1.0f;
                                        n5 = (int)(f * (float)class544.field5403.method2900());
                                        if (((class71)object).field843 != null) break block34;
                                        if (((class71)object).field842 < 0) break block35;
                                        break block36;
                                    }
                                    ((class71)object).field843.method914(n5);
                                    break block35;
                                }
                                class39 class3910 = class39.method775(class69.field815, ((class71)object).field842, 0);
                                if (class3910 != null) {
                                    object2 = class3910.method772().method782(class64.field457);
                                    class48 class4810 = class48.method971((class40)object2, 100, n5);
                                    class4810.method913(-1);
                                    class476.field5014.method741(class4810);
                                    ((class71)object).field843 = class4810;
                                }
                            }
                            if (((class71)object).field836 != null) break block37;
                            if (((class71)object).field849 == null) break block32;
                            break block38;
                        }
                        ((class71)object).field836.method914(n5);
                        if (!((class71)object).field836.method9627()) {
                            ((class71)object).field836 = null;
                        }
                        break block32;
                    }
                    if ((((class71)object).field847 -= n) <= 0) {
                        int n7 = (int)(Math.random() * (double)((class71)object).field849.length);
                        object2 = class39.method775(class69.field815, ((class71)object).field849[n7], 0);
                        if (object2 != null) {
                            class40 class408 = ((class39)object2).method772().method782(class64.field457);
                            class48 class4811 = class48.method971(class408, 100, n5);
                            class4811.method913(0);
                            class476.field5014.method741(class4811);
                            ((class71)object).field836 = class4811;
                            ((class71)object).field847 = ((class71)object).field844 + (int)(Math.random() * (double)(((class71)object).field845 - ((class71)object).field844));
                        }
                    }
                    break block32;
                }
                if (((class71)object).field843 != null) {
                    class476.field5014.method745(((class71)object).field843);
                    ((class71)object).field843 = null;
                }
                if (((class71)object).field836 != null) {
                    class476.field5014.method745(((class71)object).field836);
                    ((class71)object).field836 = null;
                }
            }
            object = (class71)class71.field846.method8005();
        }
    }

    @ObfuscatedName(value="jj")
    @ObfuscatedSignature(descriptor="(Lep;I)Z", garbageValue="-1864848438")
    boolean method1310(class116 class1162) {
        if (class1162.field1452 != 0) {
            if (class281.field3080 == null) {
                class281.field3080 = new class470(class383.field4489, field521);
            }
            class281.field3080.method9126(class1162.field1450);
        } else {
            class281.field3080 = null;
        }
        field770 = field549;
        class424.field4740 = true;
        class1162.field1451 = null;
        return true;
    }

    @ObfuscatedName(value="jk")
    @ObfuscatedSignature(descriptor="(Lep;I)Z", garbageValue="-1023516953")
    boolean method1311(class116 class1162) {
        if (class281.field3080 != null) {
            class281.field3080.method9108(class1162.field1450);
        }
        field770 = field549;
        class424.field4740 = true;
        class1162.field1451 = null;
        return true;
    }

    @ObfuscatedName(value="jv")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1611945377")
    void method1312() {
        boolean bl = client.field564.field1456 > 0;
        int n = client.field564.field1445;
        for (int i = 0; i < 100 || bl; ++i) {
            boolean bl2 = this.method1313(field564);
            if (bl) {
                int n2 = client.field564.field1445 - n;
                client.field564.field1456 -= n2;
            }
            if (!bl2) break;
            n = client.field564.field1445;
            bl = client.field564.field1456 > 0;
        }
    }

    @ObfuscatedName(value="jg")
    @ObfuscatedSignature(descriptor="(Lep;I)Z", garbageValue="-49175667")
    final boolean method1313(class116 class1162) {
        class486 class4862 = class1162.method3249();
        class555 class5552 = class1162.field1450;
        if (class4862 == null) {
            return false;
        }
        try {
            int n;
            Object object;
            if (class1162.field1456 > 0 && !class4862.vmethod9407(class1162.field1456)) {
                return false;
            }
            if (class1162.field1451 == null) {
                if (class1162.field1457) {
                    if (!class4862.vmethod9407(1)) {
                        return false;
                    }
                    class1162.field1445 += class4862.vmethod9410(class1162.field1450.field5470, 0, 1);
                    class1162.field1454 = 0;
                    class1162.field1457 = false;
                }
                class5552.field5471 = 0;
                if (class5552.method10224()) {
                    if (!class4862.vmethod9407(1)) {
                        return false;
                    }
                    class1162.field1445 += class4862.vmethod9410(class1162.field1450.field5470, 1, 1);
                    class1162.field1454 = 0;
                }
                class1162.field1457 = true;
                object = class279.method5975();
                n = class5552.method10253();
                if (n < 0 || n >= ((class325[])object).length) {
                    throw new IOException(n + " " + class5552.field5471);
                }
                class1162.field1451 = object[n];
                class1162.field1452 = class1162.field1451.field3581;
            }
            if (class1162.field1452 == -1) {
                if (!class4862.vmethod9407(1)) {
                    return false;
                }
                class1162.field1445 += class4862.vmethod9410(class5552.field5470, 0, 1);
                class1162.field1452 = class5552.field5470[0] & 0xFF;
            }
            if (class1162.field1452 == -2) {
                if (!class4862.vmethod9407(2)) {
                    return false;
                }
                class1162.field1445 += class4862.vmethod9410(class5552.field5470, 0, 2);
                class5552.field5471 = 0;
                class1162.field1452 = class5552.method10307();
            }
            if (!class4862.vmethod9407(class1162.field1452)) {
                return false;
            }
            class5552.field5471 = 0;
            class1162.field1445 += class4862.vmethod9410(class5552.field5470, 0, class1162.field1452);
            class1162.field1454 = 0;
            field763.method8937();
            class1162.field1460 = class1162.field1447;
            class1162.field1447 = class1162.field1458;
            class1162.field1458 = class1162.field1451;
            if (class325.field3499 == class1162.field1451) {
                int n2 = class5552.method10407();
                n = class5552.method10282() == 1 ? 1 : 0;
                String string = "";
                boolean bl = false;
                if (n != 0 && class10.field54.method2025(new class579(string = class5552.method10290(), class383.field4489))) {
                    bl = true;
                }
                String string2 = class5552.method10290();
                if (!bl) {
                    class72.method2153(n2, string, string2);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3468 == class1162.field1451) {
                int n3 = class5552.method10282();
                String string = class5552.method10290();
                int n4 = class5552.method10312();
                if (n4 >= 1 && n4 <= 8) {
                    if (string.equalsIgnoreCase("null")) {
                        string = null;
                    }
                    client.field638[n4 - 1] = string;
                    client.field639[n4 - 1] = n3 == 0;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3550 == class1162.field1451) {
                int n5 = class5552.method10440();
                n = class5552.method10378();
                class361 class3612 = class170.field1807.method7031(n);
                class3612.field3924.method7080(n5);
                class122.method3325(class3612);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3491 == class1162.field1451) {
                class10.field54.method2021(class5552, class1162.field1452);
                field697 = field549;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3470 == class1162.field1451) {
                byte by = class5552.method10315();
                n = class5552.method10323();
                class349.field3762[n] = by;
                if (class349.field3763[n] != by) {
                    class349.field3763[n] = by;
                }
                class272.method5848(n);
                client.field688[++client.field586 - 1 & 0x1F] = n;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3540 == class1162.field1451) {
                n = class5552.method10458();
                int n6 = class5552.method10458();
                int n7 = class5552.method10307();
                int n8 = class5552.method10307();
                class309.method6539(n8, n, n7, n6);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3475 == class1162.field1451) {
                int n9 = class5552.method10440();
                class361 class3613 = class170.field1807.method7031(n9);
                for (int i = 0; i < class3613.field3903.length; ++i) {
                    class3613.field3903[i] = -1;
                    class3613.field3903[i] = 0;
                }
                class122.method3325(class3613);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3520 == class1162.field1451) {
                int n10;
                int n11;
                int n12;
                int n13 = class5552.field5471 + class1162.field1452;
                n = class5552.method10307();
                if (n == 65535) {
                    n = -1;
                }
                int n14 = class5552.method10307();
                if (n != field663) {
                    field663 = n;
                    this.method1317(false);
                    class16.method211(field663);
                    class290.method6334(field663);
                    for (n12 = 0; n12 < 100; ++n12) {
                        client.field713[n12] = true;
                    }
                }
                while (n14-- > 0) {
                    n12 = class5552.method10440();
                    n11 = class5552.method10307();
                    n10 = class5552.method10282();
                    class89 class892 = (class89)field664.method9985(n12);
                    if (class892 != null && n11 != class892.field1073) {
                        class247.method5349(class892, true);
                        class892 = null;
                    }
                    if (class892 == null) {
                        class892 = class6.method41(n12, n11, n10);
                    }
                    class892.field1071 = true;
                }
                class89 class893 = (class89)field664.method9988();
                while (class893 != null) {
                    if (class893.field1071) {
                        class893.field1071 = false;
                    } else {
                        class247.method5349(class893, true);
                    }
                    class893 = (class89)field664.method9996();
                }
                field710 = new class530(512);
                while (class5552.field5471 < n13) {
                    n12 = class5552.method10440();
                    n11 = class5552.method10307();
                    n10 = class5552.method10307();
                    int n15 = class5552.method10440();
                    for (int i = n11; i <= n10; ++i) {
                        long l = (long)i + ((long)n12 << 32);
                        field710.method9984(new class513(n15), l);
                    }
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3542 == class1162.field1451) {
                field797 = true;
                field762 = false;
                field757 = false;
                class280.field3067 = class5552.method10282();
                field801 = class5552.method10282();
                class416.field4710 = class5552.method10307();
                class383.field4491 = class5552.method10282();
                class505.field5142 = class5552.method10282();
                if (class505.field5142 >= 100) {
                    int n16 = class350.method6980(class280.field3067);
                    n = class350.method6980(field801);
                    int n17 = class23.method337(class34.field189, n16, n, class34.field189.field1321) - class416.field4710;
                    int n18 = n16 - class478.field5017;
                    int n19 = n17 - class64.field459;
                    int n20 = n - class31.field140;
                    int n21 = (int)Math.sqrt(n20 * n20 + n18 * n18);
                    class159.field1730 = (int)(Math.atan2(n19, n21) * (double)325.949f) & 0x7FF;
                    class183.field1972 = (int)(Math.atan2(n18, n20) * (double)-325.949f) & 0x7FF;
                    if (class159.field1730 < 128) {
                        class159.field1730 = 128;
                    }
                    if (class159.field1730 > 383) {
                        class159.field1730 = 383;
                    }
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3447 == class1162.field1451) {
                int n22 = class5552.method10387();
                int n23 = class5552.method10334();
                class94 class942 = n23 == field623 ? class407.field4693 : class30.field131.field1329[n23];
                n = class5552.method10458();
                int n24 = class5552.method10314();
                if (class942 != null) {
                    class942.method2794(n24, n, n22 >> 16, n22 & 0xFFFF);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3525 == class1162.field1451) {
                boolean bl;
                boolean bl2 = bl = class5552.method10282() == 1;
                if (bl) {
                    class361.field3909 = class37.method724() - class5552.method10273();
                    class328.field3597 = new class393(class5552, true);
                } else {
                    class328.field3597 = null;
                }
                field714 = field549;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3567 == class1162.field1451) {
                class418.field4719 = class5552.method10410();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3509 == class1162.field1451) {
                class5552.field5471 += 28;
                if (class5552.method10308()) {
                    class157.method3657(class5552, class5552.field5471 - 28);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3484 == class1162.field1451) {
                class224.method5046(class323.field3433);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3463 == class1162.field1451) {
                class224.method5046(class323.field3420);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3476 == class1162.field1451) {
                int n25 = class5552.method10440();
                n = class5552.method10440();
                int n26 = class369.method7610();
                class324 class3242 = class90.method2629(class322.field3372, client.field564.field1446);
                class3242.field3442.method10477(n26);
                class3242.field3442.method10477(class34.field163);
                class3242.field3442.method10268(n25);
                class3242.field3442.method10268(n);
                field564.method3257(class3242);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3538 == class1162.field1451) {
                int n27 = class5552.method10440();
                class89 class894 = (class89)field664.method9985(n27);
                if (class894 != null) {
                    class247.method5349(class894, true);
                }
                if (field668 != null) {
                    class122.method3325(field668);
                    field668 = null;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3490 == class1162.field1451) {
                field769 = class5552.method10334() * 30;
                field499 = field549;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3502 == class1162.field1451) {
                int n28 = class5552.method10335();
                class361 class3614 = class170.field1807.method7031(n28);
                class3614.field3915 = 3;
                class3614.field3916 = class407.field4693.field1121.method7060();
                class122.method3325(class3614);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3571 == class1162.field1451) {
                class406.method7972(class30.field131, class5552, 4);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3552 == class1162.field1451) {
                int n29 = class5552.method10307();
                n = class5552.method10307();
                int n30 = class5552.method10307();
                int n31 = class5552.method10323();
                int n32 = class5552.method10334();
                if (n32 == 65535) {
                    n32 = -1;
                }
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                arrayList.add(n32);
                class420.method8237(arrayList, n, n29, n31, n30);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3451 == class1162.field1451) {
                class224.method5046(class323.field3427);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3496 == class1162.field1451) {
                field631 = class5552.method10290();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3456 == class1162.field1451) {
                int n33 = class5552.method10314();
                n = class5552.method10378();
                int n34 = class5552.method10312();
                class361 class3615 = class170.field1807.method7031(n);
                class3615.field3924.method7064(n34, n33);
                class122.method3325(class3615);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3454 == class1162.field1451) {
                int n35 = class5552.method10282();
                class107.method3094(n35);
                class1162.field1451 = null;
                return false;
            }
            if (class325.field3465 == class1162.field1451) {
                object = new byte[class1162.field1452];
                class5552.method10225((byte[])object, 0, ((class325[])object).length);
                class556 class5562 = new class556((byte[])object);
                String string = class5562.method10290();
                class294.method6390(string, true, false);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3531 == class1162.field1451) {
                client.method1954();
                class1162.field1451 = null;
                return false;
            }
            if (class325.field3464 == class1162.field1451) {
                class170.method3857(class34.field189, class5552);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3544 == class1162.field1451) {
                class293.field3215 = class5552.method10314();
                class360.field3857 = class5552.method10341();
                field767 = class5552.method10282();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3495 == class1162.field1451) {
                class105 class1052;
                n = class5552.method10458();
                int n36 = class5552.method10323();
                int n37 = class5552.method10312();
                if (n == 65535) {
                    n = -1;
                }
                if ((class1052 = class30.field131.field1330[n36]) != null) {
                    if (n == class1052.field1240 && n != -1) {
                        int n38 = class33.method520((int)n).field2943;
                        if (n38 == 1) {
                            class1052.field1241 = 0;
                            class1052.field1242 = 0;
                            class1052.field1271 = n37;
                            class1052.field1244 = 0;
                        } else if (n38 == 2) {
                            class1052.field1244 = 0;
                        }
                    } else if (n == -1 || class1052.field1240 == -1 || class33.method520((int)n).field2930 >= class33.method520((int)class1052.field1240).field2930) {
                        class1052.field1240 = n;
                        class1052.field1241 = 0;
                        class1052.field1242 = 0;
                        class1052.field1271 = n37;
                        class1052.field1244 = 0;
                        class1052.field1270 = class1052.field1265;
                    }
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3458 == class1162.field1451) {
                class277.field3055 = class5552.method10282();
                class221.field2426 = class5552.method10282();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3517 == class1162.field1451) {
                field797 = true;
                field762 = false;
                field669 = true;
                class101.field1293 = class5552.method10282();
                class305.field3274 = class5552.method10282();
                int n39 = class5552.method10307();
                n = class5552.method10307();
                field758 = class5552.method10410();
                int n40 = class5552.method10282();
                int n41 = class350.method6980(class101.field1293);
                int n42 = class350.method6980(class305.field3274);
                int n43 = 0;
                int n44 = 0;
                if (field758) {
                    n43 = class64.field459;
                    n44 = class23.method337(class34.field189, n41, n42, class34.field189.field1321) - n39;
                } else {
                    n43 = class23.method337(class34.field189, class478.field5017, class31.field140, class34.field189.field1321) - class64.field459;
                    n44 = n39;
                }
                field657 = new class519(class478.field5017, class31.field140, n43, n41, n42, n44, n, n40);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3462 == class1162.field1451) {
                int n45 = class5552.method10307();
                n = class5552.method10341();
                if (n45 == 65535) {
                    n45 = -1;
                }
                class57.method1171(class407.field4693, n45, n);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3522 == class1162.field1451) {
                int n46 = class5552.method10440();
                n = class5552.method10458();
                int n47 = class5552.method10458();
                class361 class3616 = class170.field1807.method7031(n46);
                class3616.field3928 = n47 + (n << 16);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3565 == class1162.field1451) {
                object = class5552.method10290();
                long l = class5552.method10307();
                long l2 = class5552.method10285();
                class385 class3852 = (class385)class259.method5457(class151.method3607(), class5552.method10282());
                long l3 = l2 + (l << 32);
                boolean bl = false;
                for (int i = 0; i < 100; ++i) {
                    if (l3 != field729[i]) continue;
                    bl = true;
                    break;
                }
                if (class10.field54.method2025(new class579((String)object, class383.field4489))) {
                    bl = true;
                }
                if (!bl && field625 == 0) {
                    client.field729[client.field730] = l3;
                    field730 = (field730 + 1) % 100;
                    String string = class439.method8700(class371.method7619(class261.method5505(class5552)));
                    int n48 = class3852.field4499 ? 7 : 3;
                    if (class3852.field4517 != -1) {
                        class72.method2153(n48, class236.method5195(class3852.field4517) + (String)object, string);
                    } else {
                        class72.method2153(n48, (String)object, string);
                    }
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3577 == class1162.field1451) {
                int n49 = class5552.method10334();
                int n50 = class5552.method10285();
                int n51 = n50 >> 16;
                n = n50 >> 8 & 0xFF;
                int n52 = n51 + (n50 >> 4 & 7);
                int n53 = n + (n50 & 7);
                int n54 = class5552.method10334();
                int n55 = class5552.method10316();
                int n56 = class5552.method10458();
                int n57 = class5552.method10312() * 4;
                int n58 = class5552.method10316();
                int n59 = class5552.method10307();
                int n60 = class5552.method10312();
                int n61 = class5552.method10330();
                int n62 = class5552.method10341() * 4;
                int n63 = class5552.method10330();
                if (0 <= n52 && n52 < 104 && 0 <= n53 && n53 < 104 && 0 <= (n55 += n52) && n55 < 104 && 0 <= (n58 += n53) && n58 < 104 && n49 != 65535) {
                    n52 = class350.method6980(n52);
                    n53 = class350.method6980(n53);
                    n55 = class350.method6980(n55);
                    n58 = class350.method6980(n58);
                    class79 class792 = new class79(n49, class30.field131.field1321, n52, n53, class23.method337(class30.field131, n52, n53, class30.field131.field1321) - n62, n54 + field514, n59 + field514, n60, n56, n63, n61, n57);
                    class792.method2453(n55, n58, class23.method337(class30.field131, n55, n58, class30.field131.field1321) - n57, n54 + field514);
                    class30.field131.field1338.method7998(class792);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3510 == class1162.field1451) {
                n = class5552.method10307();
                int n64 = class5552.method10458();
                class125.method3347(n64, n);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3501 == class1162.field1451) {
                class224.method5046(class323.field3421);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3555 == class1162.field1451) {
                int n65 = class5552.method10440();
                n = (short)class5552.method10324();
                int n66 = class5552.method10282();
                int n67 = class5552.method10307();
                class105 class1053 = class30.field131.field1330[n67];
                if (class1053 != null) {
                    class1053.method3068(n66, n65, (short)n);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3485 == class1162.field1451) {
                class224.method5046(class323.field3419);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3487 == class1162.field1451) {
                int n68 = class5552.method10325();
                n = class5552.method10378();
                class361 class3617 = class170.field1807.method7031(n);
                if (n68 != class3617.field3919 || n68 == -1) {
                    class3617.field3919 = n68;
                    class3617.field4012 = 0;
                    class3617.field4013 = 0;
                    class122.method3325(class3617);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3572 == class1162.field1451) {
                class111.method3125(class30.field131, true, class5552);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3560 == class1162.field1451) {
                int n69 = class5552.method10440();
                n = class5552.method10307();
                if (n69 < -70000) {
                    n += 32768;
                }
                class361 class3618 = n69 >= 0 ? class170.field1807.method7031(n69) : null;
                while (class5552.field5471 < class1162.field1452) {
                    int n70 = class5552.method10407();
                    int n71 = class5552.method10307();
                    int n72 = 0;
                    if (n71 != 0 && (n72 = class5552.method10282()) == 255) {
                        n72 = class5552.method10440();
                    }
                    if (class3618 != null && n70 >= 0 && n70 < class3618.field3903.length) {
                        class3618.field3903[n70] = n71;
                        class3618.field4009[n70] = n72;
                    }
                    class131.method3380(n, n70, n71 - 1, n72);
                }
                if (class3618 != null) {
                    class122.method3325(class3618);
                }
                class150.method3598();
                client.field544[++client.field749 - 1 & 0x1F] = n & Short.MAX_VALUE;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3545 == class1162.field1451) {
                return this.method1310(class1162);
            }
            if (class325.field3483 == class1162.field1451) {
                int n73 = class5552.method10307();
                n = class5552.method10282();
                int n74 = class5552.method10307();
                class378.method7635(n73, n, n74);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3543 == class1162.field1451) {
                field726 = class5552.method10341();
                field727 = class5552.method10314();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3446 == class1162.field1451) {
                int n75;
                int n76 = class5552.method10387();
                n = class5552.method10387();
                int n77 = class5552.method10323();
                if (n77 == 65535) {
                    n77 = -1;
                }
                if ((n75 = class5552.method10307()) == 65535) {
                    n75 = -1;
                }
                for (int i = n75; i <= n77; ++i) {
                    long l = ((long)n << 32) + (long)i;
                    class514 class5142 = field710.method9985(l);
                    if (class5142 != null) {
                        class5142.method9623();
                    }
                    field710.method9984(new class513(n76), l);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3477 == class1162.field1451) {
                int n78 = class5552.method10440();
                n = class5552.method10323();
                class361 class3619 = class170.field1807.method7031(n78);
                if (class3619.field3915 != 1 || n != class3619.field3916) {
                    class3619.field3915 = 1;
                    class3619.field3916 = n;
                    class122.method3325(class3619);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3457 == class1162.field1451) {
                field797 = true;
                field762 = false;
                field757 = true;
                int n79 = class5552.method10284();
                n = class5552.method10284();
                int n80 = class345.method6949(n + class159.field1730 & 0x7EB);
                int n81 = n79 + class183.field1972;
                int n82 = class5552.method10307();
                int n83 = class5552.method10282();
                field761 = new class520(class159.field1730, n80, n82, n83);
                field725 = new class520(class183.field1972, n81, n82, n83);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3529 == class1162.field1451) {
                ++field693;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3574 == class1162.field1451) {
                class224.method5046(class323.field3424);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3452 == class1162.field1451) {
                int n84 = class5552.method10387();
                n = class5552.method10323();
                int n85 = class5552.method10458();
                int n86 = class5552.method10323();
                class361 class36110 = class170.field1807.method7031(n84);
                if (n86 != class36110.field3923 || n != class36110.field3994 || n85 != class36110.field4020) {
                    class36110.field3923 = n86;
                    class36110.field3994 = n;
                    class36110.field4020 = n85;
                    class122.method3325(class36110);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3561 == class1162.field1451) {
                class467.method9075(class5552, class1162.field1452);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3563 == class1162.field1451) {
                int n87;
                class361 class36111;
                int n88 = class5552.method10440();
                n = class5552.method10307();
                if (n88 < -70000) {
                    n += 32768;
                }
                if ((class36111 = n88 >= 0 ? class170.field1807.method7031(n88) : null) != null) {
                    for (n87 = 0; n87 < class36111.field3903.length; ++n87) {
                        class36111.field3903[n87] = 0;
                        class36111.field4009[n87] = 0;
                    }
                }
                class303.method6468(n);
                n87 = class5552.method10307();
                for (int i = 0; i < n87; ++i) {
                    int n89 = class5552.method10323();
                    int n90 = class5552.method10312();
                    if (n90 == 255) {
                        n90 = class5552.method10387();
                    }
                    if (class36111 != null && i < class36111.field3903.length) {
                        class36111.field3903[i] = n89;
                        class36111.field4009[i] = n90;
                    }
                    class131.method3380(n, i, n89 - 1, n90);
                }
                if (class36111 != null) {
                    class122.method3325(class36111);
                }
                class150.method3598();
                client.field544[++client.field749 - 1 & 0x1F] = n & Short.MAX_VALUE;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3466 == class1162.field1451) {
                int n91 = class5552.method10440();
                if (n91 != field601) {
                    field601 = n91;
                    class142.method3514();
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3467 == class1162.field1451) {
                boolean bl = class5552.method10410();
                if (bl) {
                    if (class184.field1975 == null) {
                        class184.field1975 = new class402();
                    }
                } else {
                    class184.field1975 = null;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3482 == class1162.field1451) {
                int n92 = class5552.method10282();
                n = class5552.method10307();
                int n93 = class5552.method10284();
                if (n92 == 0) {
                    class53.field339 = class34.field189.field1329[n];
                    field781 = -1;
                } else if (n92 == 1) {
                    field781 = -1;
                    class53.field339 = class34.field189.field1330[n];
                } else if (n92 == 2) {
                    field781 = n93;
                    class53.field339 = class34.field189.field1318[n];
                    this.method541(true);
                }
                if (class53.field339 == null) {
                    field781 = -1;
                    class53.field339 = class407.field4693;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3578 == class1162.field1451) {
                class224.method5046(class323.field3431);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3503 == class1162.field1451) {
                field700 = field549;
                byte by = class5552.method10524();
                if (class1162.field1452 == 1) {
                    if (by >= 0) {
                        client.field738[by] = null;
                    } else {
                        class106.field1371 = null;
                    }
                    class1162.field1451 = null;
                    return true;
                }
                if (by >= 0) {
                    client.field738[by] = new class170(class5552);
                } else {
                    class106.field1371 = new class170(class5552);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3548 == class1162.field1451) {
                object = class5552.method10290();
                String string = class439.method8700(class371.method7619(class261.method5505(class5552)));
                class72.method2153(6, (String)object, string);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3443 == class1162.field1451) {
                field797 = true;
                field762 = false;
                field669 = false;
                class101.field1293 = class5552.method10282();
                class305.field3274 = class5552.method10282();
                class95.field1167 = class5552.method10307();
                class292.field3187 = class5552.method10282();
                class544.field5398 = class5552.method10282();
                if (class544.field5398 >= 100) {
                    class478.field5017 = class350.method6980(class101.field1293);
                    class31.field140 = class350.method6980(class305.field3274);
                    class64.field459 = class23.method337(class34.field189, class478.field5017, class31.field140, class34.field189.field1321) - class95.field1167;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3479 == class1162.field1451) {
                object = new class69();
                ((class69)object).field807 = class5552.method10290();
                ((class69)object).field812 = class5552.method10307();
                ((class69)object).field813 = n = class5552.method10440();
                if (((class69)object).method1959()) {
                    ((class69)object).field819 = "beta";
                    class273.field3035 = true;
                } else {
                    class273.field3035 = false;
                }
                class360.method7405(45);
                class4862.vmethod9416();
                class4862 = null;
                class406.method7981((class69)object);
                class1162.field1451 = null;
                return false;
            }
            if (class325.field3536 == class1162.field1451) {
                int n94 = class5552.method10458();
                class216.method4938(n94);
                client.field544[++client.field749 - 1 & 0x1F] = n94 & Short.MAX_VALUE;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3568 == class1162.field1451) {
                class436.field4815 = class5552.method10410();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3547 == class1162.field1451) {
                for (int i = 0; i < class234.field2505; ++i) {
                    class234 class2342 = class254.method5404(i);
                    if (class2342 == null) continue;
                    class349.field3762[i] = 0;
                    class349.field3763[i] = 0;
                }
                class150.method3598();
                field586 += 32;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3444 == class1162.field1451) {
                field797 = true;
                field762 = false;
                field757 = true;
                int n95 = URLConnection.method3301(class5552.method10284() & 0x7EB);
                n = class345.method6949(class5552.method10284() & 0x7EB);
                int n96 = class5552.method10307();
                int n97 = class5552.method10282();
                field761 = new class520(class159.field1730, n, n96, n97);
                field725 = new class520(class183.field1972, n95, n96, n97);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3539 == class1162.field1451) {
                field673.method3144(class5552, class1162.field1452);
                class475.method9190();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3570 == class1162.field1451) {
                int n98;
                class30.field131.field1331 = 0;
                class30.field131.field1334 = 0;
                for (n98 = 0; n98 < 65536; ++n98) {
                    class30.field131.field1330[n98] = null;
                }
                for (n98 = 0; n98 < 2048; ++n98) {
                    class30.field131.field1318[n98] = null;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3505 == class1162.field1451) {
                class406.method7972(class30.field131, class5552, 3);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3553 == class1162.field1451) {
                field700 = field549;
                byte by = class5552.method10524();
                class167 class1672 = new class167(class5552);
                class170 class1702 = by >= 0 ? field738[by] : class106.field1371;
                if (class1702 == null) {
                    this.method1321(by);
                    class1162.field1451 = null;
                    return true;
                }
                if (class1672.field1791 > class1702.field1810) {
                    this.method1321(by);
                    class1162.field1451 = null;
                    return true;
                }
                if (class1672.field1791 < class1702.field1810) {
                    class1162.field1451 = null;
                    return true;
                }
                class1672.method3817(class1702);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3528 == class1162.field1451) {
                class253.method5403();
                byte by = class5552.method10524();
                class153 class1532 = new class153(class5552);
                class161 class1612 = by >= 0 ? field737[by] : class229.field2488;
                if (class1612 == null) {
                    this.method1322(by);
                    class1162.field1451 = null;
                    return true;
                }
                if (class1532.field1695 > class1612.field1738) {
                    this.method1322(by);
                    class1162.field1451 = null;
                    return true;
                }
                if (class1532.field1695 < class1612.field1738) {
                    class1162.field1451 = null;
                    return true;
                }
                class1532.method3612(class1612);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3579 == class1162.field1451) {
                for (int i = 0; i < class349.field3763.length; ++i) {
                    if (class349.field3762[i] == class349.field3763[i]) continue;
                    class349.field3763[i] = class349.field3762[i];
                    class272.method5848(i);
                    client.field688[++client.field586 - 1 & 0x1F] = i;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3523 == class1162.field1451) {
                int n99 = class5552.method10284();
                field508.method2749(n99);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3556 == class1162.field1451) {
                field746 = class5552.method10282();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3518 == class1162.field1451) {
                class224.method5046(class323.field3432);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3492 == class1162.field1451) {
                class150.method3598();
                field670 = class5552.method10284();
                field499 = field549;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3494 == class1162.field1451) {
                int n100 = class5552.method10440();
                n = class5552.method10323();
                class361 class36112 = class170.field1807.method7031(n100);
                if (class36112 != null && class36112.field3873 == 0) {
                    if (n > class36112.field3895 - class36112.field3887 * -1528330031) {
                        n = class36112.field3895 - class36112.field3887 * -1528330031;
                    }
                    if (n < 0) {
                        n = 0;
                    }
                    if (n != class36112.field3899) {
                        class36112.field3899 = n;
                        class122.method3325(class36112);
                    }
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3559 == class1162.field1451) {
                class360.field3857 = class5552.method10312();
                field767 = class5552.method10312();
                for (int i = class293.field3215 = class5552.method10312(); i < class293.field3215 + 8; ++i) {
                    for (n = class360.field3857; n < class360.field3857 + 8; ++n) {
                        if (class30.field131.field1327[field767][i][n] == null) continue;
                        class30.field131.field1327[client.field767][i][n] = null;
                        class453.method8927(field767, i, n);
                    }
                }
                object = (class98)class30.field131.field1333.method7996();
                while (object != null) {
                    if (((class98)object).field1187 >= class293.field3215 && ((class98)object).field1187 < class293.field3215 + 8 && ((class98)object).field1182 >= class360.field3857 && ((class98)object).field1182 < class360.field3857 + 8 && ((class98)object).field1188 == field767) {
                        ((class98)object).field1186 = 0;
                    }
                    object = (class98)class30.field131.field1333.method8005();
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3460 == class1162.field1451) {
                int n101 = class5552.method10282();
                int n102 = n101 >> 2;
                int n103 = n101 & 3;
                int n104 = field578[n102];
                int n105 = class5552.method10307();
                int n106 = class5552.method10354();
                int n107 = n106 >> 16;
                n = n106 >> 8 & 0xFF;
                int n108 = n107 + (n106 >> 4 & 7);
                int n109 = n + (n106 & 7);
                if (0 <= n108 && n108 < 103 && 0 <= n109 && n109 < 103) {
                    class154.method3621(n108, n109, n102, n103, n104, n105);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3449 == class1162.field1451) {
                class360.field3857 = class5552.method10312();
                class293.field3215 = class5552.method10312();
                field767 = class5552.method10312();
                while (class5552.field5471 < class1162.field1452) {
                    int n110 = class5552.method10282();
                    class323 class3232 = class292.method6360()[n110];
                    class224.method5046(class3232);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3535 == class1162.field1451) {
                int n111 = class5552.method10434();
                int n112 = n111 >> 16;
                n = n111 >> 8 & 0xFF;
                int n113 = n112 + (n111 >> 4 & 7);
                int n114 = n + (n111 & 7);
                int n115 = class5552.method10307();
                int n116 = class5552.method10314();
                int n117 = class5552.method10307();
                if (n113 >= 0 && n114 >= 0 && n113 < class30.field131.field1322 && n114 < class30.field131.field1323) {
                    n113 = class350.method6980(n113);
                    n114 = class350.method6980(n114);
                    class74 class742 = new class74(n117, class30.field131.field1321, n113, n114, class23.method337(class30.field131, n113, n114, class30.field131.field1321) - n116, n115, field514);
                    class30.field131.field1339.method7998(class742);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3480 == class1162.field1451) {
                class224.method5046(class323.field3422);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3514 == class1162.field1451) {
                if (field663 != -1) {
                    client.method1709(field663, 0);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3504 == class1162.field1451) {
                boolean bl = class5552.method10341() == 1;
                n = class5552.method10387();
                class361 class36113 = class170.field1807.method7031(n);
                if (bl != class36113.field3891) {
                    class36113.field3891 = bl;
                    class122.method3325(class36113);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3527 == class1162.field1451 && field797) {
                field762 = true;
                field757 = false;
                field669 = false;
                for (int i = 0; i < 5; ++i) {
                    client.field571[i] = false;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3453 == class1162.field1451) {
                class1162.field1456 = class5552.method10284();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3562 == class1162.field1451) {
                class70.method2091(true, class1162.field1450);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3515 == class1162.field1451) {
                class65.method1254(class5552.method10290());
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3576 == class1162.field1451) {
                class111.method3125(class30.field131, false, class5552);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3549 == class1162.field1451) {
                class93.field1111 = class5552.method10410();
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3488 == class1162.field1451) {
                field762 = false;
                field797 = false;
                field669 = false;
                field757 = false;
                class280.field3067 = 0;
                field801 = 0;
                class416.field4710 = 0;
                field758 = false;
                class383.field4491 = 0;
                class505.field5142 = 0;
                class544.field5398 = 0;
                class292.field3187 = 0;
                class101.field1293 = 0;
                class305.field3274 = 0;
                class95.field1167 = 0;
                field657 = null;
                field761 = null;
                field725 = null;
                for (int i = 0; i < 5; ++i) {
                    client.field571[i] = false;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3478 == class1162.field1451) {
                int n118 = class5552.method10323();
                n = class5552.method10323();
                if (n == 65535) {
                    n = -1;
                }
                int n119 = class5552.method10323();
                int n120 = class5552.method10323();
                int n121 = class5552.method10323();
                int n122 = class5552.method10458();
                if (n122 == 65535) {
                    n122 = -1;
                }
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                arrayList.add(n122);
                arrayList.add(n);
                class420.method8237(arrayList, n119, n118, n120, n121);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3512 == class1162.field1451) {
                int n123 = class5552.method10458();
                n = class5552.method10335();
                int n124 = n123 >> 10 & 0x1F;
                int n125 = n123 >> 5 & 0x1F;
                int n126 = n123 & 0x1F;
                int n127 = (n125 << 11) + (n124 << 19) + (n126 << 3);
                class361 class36114 = class170.field1807.method7031(n);
                if (n127 != class36114.field3896) {
                    class36114.field3896 = n127;
                    class122.method3325(class36114);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3493 == class1162.field1451) {
                field797 = true;
                field762 = false;
                field669 = true;
                class101.field1293 = class5552.method10282();
                class305.field3274 = class5552.method10282();
                int n128 = class5552.method10307();
                n = class350.method6980(class5552.method10282());
                int n129 = class350.method6980(class5552.method10282());
                int n130 = class5552.method10307();
                field758 = class5552.method10410();
                int n131 = class5552.method10282();
                int n132 = class350.method6980(class101.field1293);
                int n133 = class350.method6980(class305.field3274);
                int n134 = 0;
                int n135 = 0;
                if (field758) {
                    n134 = class64.field459;
                    n135 = class23.method337(class34.field189, n132, n133, class34.field189.field1321) - n128;
                } else {
                    n134 = class23.method337(class34.field189, class478.field5017, class31.field140, class34.field189.field1321) - class64.field459;
                    n135 = n128;
                }
                field657 = new class518(class478.field5017, class31.field140, n134, n132, n133, n135, n, n129, n130, n131);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3459 == class1162.field1451) {
                field803 = null;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3575 == class1162.field1451) {
                class170 class1703;
                byte by = class5552.method10524();
                long l = class5552.method10307();
                long l4 = class5552.method10285();
                long l5 = (l << 32) + l4;
                boolean bl = false;
                class170 class1704 = class1703 = by >= 0 ? field738[by] : class106.field1371;
                if (class1703 == null) {
                    bl = true;
                } else {
                    for (int i = 0; i < 100; ++i) {
                        if (l5 != field729[i]) continue;
                        bl = true;
                        break;
                    }
                }
                if (!bl) {
                    client.field729[client.field730] = l5;
                    field730 = (field730 + 1) % 100;
                    String string = class261.method5505(class5552);
                    int n136 = by >= 0 ? 43 : 46;
                    class81.method2488(n136, "", string, class1703.field1811);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3500 == class1162.field1451) {
                int n137 = class5552.method10282();
                class215.method4925(n137);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3486 == class1162.field1451) {
                class361 class36115;
                int n138 = class5552.method10387();
                n = class5552.method10387();
                class89 class895 = (class89)field664.method9985(n138);
                class89 class896 = (class89)field664.method9985(n);
                if (class896 != null) {
                    class247.method5349(class896, class895 == null || class896.field1073 != class895.field1073);
                }
                if (class895 != null) {
                    class895.method9623();
                    field664.method9984(class895, n);
                }
                if ((class36115 = class170.field1807.method7031(n138)) != null) {
                    class122.method3325(class36115);
                }
                if ((class36115 = class170.field1807.method7031(n)) != null) {
                    class122.method3325(class36115);
                    class244.method5286(class170.field1807.field3772[class36115.field3910 >>> 16], class36115, true);
                }
                if (field663 != -1) {
                    client.method1709(field663, 1);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3481 == class1162.field1451) {
                int n139 = class5552.method10378();
                n = class5552.method10458();
                if (n == 65535) {
                    n = -1;
                }
                int n140 = class5552.method10387();
                class361 class36116 = class170.field1807.method7031(n140);
                if (!class36116.field3991) {
                    if (n == -1) {
                        class36116.field3915 = 0;
                        class1162.field1451 = null;
                        return true;
                    }
                    ItemDef class2632 = class191.method4462(n).method5570(n139);
                    class36116.field3915 = 4;
                    class36116.field3916 = n;
                    class36116.field3923 = class2632.field2859;
                    class36116.field3994 = class2632.field2860;
                    class36116.field4020 = class2632.field2858 * 100 / n139;
                    class122.method3325(class36116);
                } else {
                    class36116.field4010 = n;
                    class36116.field4011 = n139;
                    ItemDef class2633 = class191.method4462(n).method5570(n139);
                    class36116.field3923 = class2633.field2859;
                    class36116.field3994 = class2633.field2860;
                    class36116.field3925 = class2633.field2861;
                    class36116.field3955 = class2633.field2890;
                    class36116.field3922 = class2633.field2863;
                    class36116.field4020 = class2633.field2858;
                    class36116.field3932 = class2633.field2844 == 1 ? 1 : 2;
                    if (class36116.field3927 > 0) {
                        class36116.field4020 = class36116.field4020 * 32 / class36116.field3927;
                    } else if (class36116.field3929 > 0) {
                        class36116.field4020 = class36116.field4020 * 32 / class36116.field3929;
                    }
                    class122.method3325(class36116);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3474 == class1162.field1451) {
                int n141 = class5552.method10335();
                n = class5552.method10324();
                int n142 = class5552.method10324();
                class361 class36117 = class170.field1807.method7031(n141);
                if (n142 != class36117.field3880 || n != class36117.field3926 || class36117.field3876 != 0 || class36117.field3877 != 0) {
                    class36117.field3880 = n142;
                    class36117.field3926 = n;
                    class36117.field3876 = 0;
                    class36117.field3877 = 0;
                    class122.method3325(class36117);
                    this.method1318(class36117);
                    if (class36117.field3873 == 0) {
                        class244.method5286(class170.field1807.field3772[n141 >> 16], class36117, false);
                    }
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3530 == class1162.field1451) {
                int n143 = class5552.method10378();
                n = class5552.method10314();
                int n144 = class5552.method10334();
                class89 class897 = (class89)field664.method9985(n143);
                if (class897 != null) {
                    class247.method5349(class897, n144 != class897.field1073);
                }
                class6.method41(n143, n144, n);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3554 == class1162.field1451) {
                class10.field54.field828.method9084(class5552, class1162.field1452);
                class328.method6640();
                field697 = field549;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3558 == class1162.field1451) {
                object = class5552.method10290();
                long l = class5552.method10273();
                long l6 = class5552.method10307();
                long l7 = class5552.method10285();
                class385 class3853 = (class385)class259.method5457(class151.method3607(), class5552.method10282());
                long l8 = l7 + (l6 << 32);
                boolean bl = false;
                for (int i = 0; i < 100; ++i) {
                    if (field729[i] != l8) continue;
                    bl = true;
                    break;
                }
                if (class3853.field4519 && class10.field54.method2025(new class579((String)object, class383.field4489))) {
                    bl = true;
                }
                if (!bl && field625 == 0) {
                    client.field729[client.field730] = l8;
                    field730 = (field730 + 1) % 100;
                    String string = class439.method8700(class371.method7619(class261.method5505(class5552)));
                    if (class3853.field4517 != -1) {
                        class81.method2488(9, class236.method5195(class3853.field4517) + (String)object, string, class294.method6392(l));
                    } else {
                        class81.method2488(9, (String)object, string, class294.method6392(l));
                    }
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3551 == class1162.field1451) {
                return this.method1311(class1162);
            }
            if (class325.field3469 == class1162.field1451) {
                int n145 = class5552.method10323();
                class105 class1054 = class30.field131.field1330[n145];
                int n146 = class5552.method10323();
                int n147 = class5552.method10312();
                n = class5552.method10335();
                if (class1054 != null) {
                    class1054.method2794(n147, n146, n >> 16, n & 0xFFFF);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3471 == class1162.field1451) {
                class224.method5046(class323.field3428);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3511 == class1162.field1451) {
                class253.method5403();
                byte by = class5552.method10524();
                if (class1162.field1452 == 1) {
                    if (by >= 0) {
                        client.field737[by] = null;
                    } else {
                        class229.field2488 = null;
                    }
                    class1162.field1451 = null;
                    return true;
                }
                if (by >= 0) {
                    client.field737[by] = new class161(class5552);
                } else {
                    class229.field2488 = new class161(class5552);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3489 == class1162.field1451) {
                class150.method3598();
                int n148 = class5552.method10341();
                n = class5552.method10341();
                int n149 = class5552.method10440();
                int n150 = class5552.method10282();
                client.field644[n] = n149;
                client.field642[n] = n150;
                client.field643[n] = 1;
                client.field645[n] = n148;
                for (int i = 0; i < 98; ++i) {
                    if (n149 < class371.field4093[i]) continue;
                    client.field643[n] = i + 2;
                }
                client.field780[++client.field505 - 1 & 0x1F] = n;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3508 == class1162.field1451) {
                int n151 = class5552.method10307();
                class349.field3762[n151] = n = class5552.method10440();
                if (class349.field3763[n151] != n) {
                    class349.field3763[n151] = n;
                }
                class272.method5848(n151);
                client.field688[++client.field586 - 1 & 0x1F] = n151;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3497 == class1162.field1451) {
                int n152 = class5552.method10354();
                n = class5552.method10307();
                if (n == 65535) {
                    n = -1;
                }
                class82.method2494(n, n152);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3513 == class1162.field1451) {
                int n153 = class5552.method10335();
                n = class5552.method10312();
                class361 class36118 = class170.field1807.method7031(n153);
                class36118.field3924.method7062(class407.field4693.field1121.field3813, n);
                class122.method3325(class36118);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3526 == class1162.field1451) {
                class224.method5046(class323.field3425);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3450 == class1162.field1451) {
                class224.method5046(class323.field3423);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3557 == class1162.field1451) {
                class170 class1705;
                boolean bl;
                long l;
                class385 class3854;
                String string;
                byte by;
                block331: {
                    by = class5552.method10524();
                    string = class5552.method10290();
                    long l9 = class5552.method10307();
                    long l10 = class5552.method10285();
                    class3854 = (class385)class259.method5457(class151.method3607(), class5552.method10282());
                    l = l10 + (l9 << 32);
                    bl = false;
                    class1705 = null;
                    class170 class1706 = class1705 = by >= 0 ? field738[by] : class106.field1371;
                    if (class1705 == null) {
                        bl = true;
                    } else {
                        for (int i = 0; i < 100; ++i) {
                            if (field729[i] != l) continue;
                            bl = true;
                            break block331;
                        }
                        if (class3854.field4519 && class10.field54.method2025(new class579(string, class383.field4489))) {
                            bl = true;
                        }
                    }
                }
                if (!bl) {
                    int n154;
                    client.field729[client.field730] = l;
                    field730 = (field730 + 1) % 100;
                    String string3 = class439.method8700(class261.method5505(class5552));
                    int n155 = n154 = by >= 0 ? 41 : 44;
                    if (class3854.field4517 != -1) {
                        class81.method2488(n154, class236.method5195(class3854.field4517) + string, string3, class1705.field1811);
                    } else {
                        class81.method2488(n154, string, string3, class1705.field1811);
                    }
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3534 == class1162.field1451) {
                int n156;
                for (n156 = 0; n156 < class30.field131.field1329.length; ++n156) {
                    if (class30.field131.field1329[n156] == null) continue;
                    class30.field131.field1329[n156].field1240 = -1;
                }
                for (n156 = 0; n156 < class30.field131.field1330.length; ++n156) {
                    if (class30.field131.field1330[n156] == null) continue;
                    class30.field131.field1330[n156].field1240 = -1;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3573 == class1162.field1451) {
                int n157 = class5552.method10284();
                class492 class4922 = (class492)class259.method5457(class358.method7114(), class5552.method10282());
                class491 class4912 = (class491)class259.method5457(class395.method7881(), class5552.method10282());
                if (n157 == -2) {
                    field508.method2739(class4922, class4912);
                } else {
                    field508.method2718(n157, class4922, class4912);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3519 == class1162.field1451) {
                class224.method5046(class323.field3430);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3566 == class1162.field1451) {
                int n158 = class5552.method10387();
                String string = class5552.method10290();
                class361 class36119 = class170.field1807.method7031(n158);
                if (!string.equals(class36119.field3911)) {
                    class36119.field3911 = string;
                    class122.method3325(class36119);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3546 == class1162.field1451) {
                class281.field3074 = class463.method9025(class5552.method10282());
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3564 == class1162.field1451) {
                field797 = true;
                field762 = false;
                field757 = true;
                class280.field3067 = class5552.method10282();
                field801 = class5552.method10282();
                class416.field4710 = class5552.method10307();
                int n159 = class5552.method10307();
                n = class5552.method10282();
                int n160 = class350.method6980(class280.field3067);
                int n161 = class350.method6980(field801);
                int n162 = class23.method337(class34.field189, n160, n161, class34.field189.field1321) - class416.field4710;
                int n163 = n160 - class478.field5017;
                int n164 = n162 - class64.field459;
                int n165 = n161 - class31.field140;
                double d = Math.sqrt(n165 * n165 + n163 * n163);
                int n166 = class345.method6949((int)(Math.atan2(n164, d) * (double)325.949f) & 0x7FF);
                int n167 = URLConnection.method3301((int)(Math.atan2(n163, n165) * (double)-325.949f) & 0x7FF);
                field761 = new class520(class159.field1730, n166, n159, n);
                field725 = new class520(class183.field1972, n167, n159, n);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3516 == class1162.field1451) {
                class150.method3598();
                field774 = class5552.method10307();
                field499 = field549;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3569 == class1162.field1451) {
                int n168 = class5552.method10323();
                n = class5552.method10378();
                class361 class36120 = class170.field1807.method7031(n);
                if (class36120.field3915 != 6 || n168 != class36120.field3916) {
                    class36120.field3915 = 6;
                    class36120.field3916 = n168;
                    class122.method3325(class36120);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3473 == class1162.field1451) {
                int n169 = class5552.method10282();
                n = class5552.method10282();
                int n170 = class5552.method10282();
                int n171 = class5552.method10282();
                client.field571[n169] = true;
                client.field764[n169] = n;
                client.field690[n169] = n170;
                client.field768[n169] = n171;
                client.field705[n169] = 0;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3507 == class1162.field1451) {
                int n172 = class5552.method10282();
                if (class5552.method10282() == 0) {
                    client.field785[n172] = new class400();
                    class5552.field5471 += 18;
                } else {
                    --class5552.field5471;
                    client.field785[n172] = new class400(class5552, false);
                }
                field701 = field549;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3532 == class1162.field1451) {
                int n173;
                int n174 = class5552.method10282();
                n = class5552.method10307();
                class183.field1966 = n173 = class5552.method10282();
                if (n174 == 0) {
                    class34.field189.field1321 = n173;
                    class30.field131 = class34.field189;
                } else if (n174 == 1) {
                    class480 class4802 = class34.field189.field1318[n];
                    class4802.field5035.field1321 = n173;
                    class30.field131 = class4802.field5035;
                } else {
                    throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3537 == class1162.field1451) {
                class10.field54.method2066();
                field697 = field549;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3524 == class1162.field1451) {
                field565 = class5552.method10282();
                if (field565 == 1) {
                    field530 = class5552.method10307();
                }
                if (field565 >= 2 && field565 <= 6) {
                    if (field565 == 2) {
                        field528 = 4096;
                        field529 = 64;
                    }
                    if (field565 == 3) {
                        field528 = 0;
                        field529 = 64;
                    }
                    if (field565 == 4) {
                        field528 = 8192;
                        field529 = 64;
                    }
                    if (field565 == 5) {
                        field528 = 4096;
                        field529 = 0;
                    }
                    if (field565 == 6) {
                        field528 = 4096;
                        field529 = 128;
                    }
                    field565 = 2;
                    field525 = class5552.method10307();
                    field526 = class5552.method10307();
                    field527 = class5552.method10282() * 2;
                }
                if (field565 == 10) {
                    field524 = class5552.method10307();
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3541 == class1162.field1451) {
                field803 = new class496(class126.field1513);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3472 == class1162.field1451) {
                object = class5552.method10290();
                Object[] objectArray = new Object[((String)object).length() + 1];
                for (int i = ((String)object).length() - 1; i >= 0; --i) {
                    objectArray[i + 1] = ((String)object).charAt(i) == 's' ? class5552.method10290() : new Integer(class5552.method10440());
                }
                objectArray[0] = new Integer(class5552.method10440());
                class90 class902 = new class90();
                class902.field1086 = objectArray;
                class471.method9136(class902);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3448 == class1162.field1451) {
                boolean bl = class5552.method10314() == 1;
                n = class5552.method10335();
                class361 class36121 = class170.field1807.method7031(n);
                class36121.method7542(class407.field4693.field1121, bl);
                class122.method3325(class36121);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3498 == class1162.field1451) {
                class70.method2091(false, class1162.field1450);
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3461 == class1162.field1451) {
                int n175 = class5552.method10334();
                if (n175 == 65535) {
                    n175 = -1;
                }
                field663 = n175;
                this.method1317(false);
                class16.method211(n175);
                class290.method6334(field663);
                for (n = 0; n < 100; ++n) {
                    client.field713[n] = true;
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3445 == class1162.field1451) {
                int n176 = class5552.method10323();
                n = class5552.method10387();
                class361 class36122 = class170.field1807.method7031(n);
                if (class36122.field3915 != 2 || n176 != class36122.field3916) {
                    class36122.field3915 = 2;
                    class36122.field3916 = n176;
                    class122.method3325(class36122);
                }
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3521 == class1162.field1451) {
                if (field803 == null) {
                    field803 = new class496(class126.field1513);
                }
                object = class126.field1513.method9513(class5552);
                client.field803.field5127.vmethod10011(((class565)object).field5538, ((class565)object).field5539);
                client.field694[++client.field579 - 1 & 0x1F] = ((class565)object).field5538;
                class1162.field1451 = null;
                return true;
            }
            if (class325.field3455 == class1162.field1451) {
                field744 = class5552.method10282();
                if (field744 == 255) {
                    field744 = 0;
                }
                if ((field745 = class5552.method10282()) == 255) {
                    field745 = 0;
                }
                class1162.field1451 = null;
                return true;
            }
            class255.method5410("" + (class1162.field1451 != null ? class1162.field1451.field3580 : -1) + "," + (class1162.field1447 != null ? class1162.field1447.field3580 : -1) + "," + (class1162.field1460 != null ? class1162.field1460.field3580 : -1) + "," + class1162.field1452, null);
            client.method1954();
        }
        catch (IOException iOException) {
            class76.method2363();
        }
        catch (Exception exception) {
            String string = "" + (class1162.field1451 != null ? class1162.field1451.field3580 : -1) + "," + (class1162.field1447 != null ? class1162.field1447.field3580 : -1) + "," + (class1162.field1460 != null ? class1162.field1460.field3580 : -1) + "," + class1162.field1452 + "," + (class407.field4693.field1266[0] + class34.field189.field1324) + "," + (class407.field4693.field1221[0] + class34.field189.field1325) + ",";
            for (int i = 0; i < class1162.field1452 && i < 50; ++i) {
                string = string + class5552.field5470[i] + ",";
            }
            class255.method5410(string, exception);
            client.method1954();
        }
        return true;
    }

    @ObfuscatedName(value="kp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1984807253")
    final void method1363() {
        class575 class5752 = field648;
        int n = 0;
        block0: while (true) {
            int n2;
            if (n != 0) {
                if (field675 != null) {
                    return;
                }
                n = class35.field200;
                if (!field647) {
                    if (client.field648.field5612 > 0) {
                        int n3 = n2 = client.field648.field5612 - 1;
                        if ((n == 1 || !class25.field109 && n == 4) && this.method1315(client.field648.field5614[n3], client.field648.field5628[n3])) {
                            n = 2;
                        }
                        if (n == 1 || !class25.field109 && n == 4) {
                            field648.method10921(n3);
                        }
                        if (n == 2) {
                            this.method1316(class35.field209, class35.field211);
                        }
                    }
                } else {
                    if (n != 1 && (class25.field109 || n != 4) && !field648.method10922(class35.field201, class35.field202)) {
                        field647 = false;
                        field648.method10932();
                    }
                    if (n == 1 || !class25.field109 && n == 4) {
                        field648.method10923(class35.field209, class35.field211);
                        field647 = false;
                        field648.method10932();
                    }
                }
                return;
            }
            n = 1;
            n2 = 0;
            while (true) {
                if (n2 >= class5752.field5612 - 1) continue block0;
                if (class5752.field5614[n2] < 1000 && class5752.field5614[n2 + 1] > 1000) {
                    String string = class5752.field5619[n2];
                    class5752.field5619[n2] = class5752.field5619[n2 + 1];
                    class5752.field5619[n2 + 1] = string;
                    String string2 = class5752.field5618[n2];
                    class5752.field5618[n2] = class5752.field5618[n2 + 1];
                    class5752.field5618[n2 + 1] = string2;
                    class575 class5753 = class5752.field5623[n2];
                    class5752.field5623[n2] = class5752.field5623[n2 + 1];
                    class5752.field5623[n2 + 1] = class5753;
                    int n4 = class5752.field5614[n2];
                    class5752.field5614[n2] = class5752.field5614[n2 + 1];
                    class5752.field5614[n2 + 1] = n4;
                    n4 = class5752.field5622[n2];
                    class5752.field5622[n2] = class5752.field5622[n2 + 1];
                    class5752.field5622[n2 + 1] = n4;
                    n4 = class5752.field5613[n2];
                    class5752.field5613[n2] = class5752.field5613[n2 + 1];
                    class5752.field5613[n2 + 1] = n4;
                    n4 = class5752.field5615[n2];
                    class5752.field5615[n2] = class5752.field5615[n2 + 1];
                    class5752.field5615[n2 + 1] = n4;
                    n4 = class5752.field5616[n2];
                    class5752.field5616[n2] = class5752.field5616[n2 + 1];
                    class5752.field5616[n2 + 1] = n4;
                    n4 = class5752.field5617[n2];
                    class5752.field5617[n2] = class5752.field5617[n2 + 1];
                    class5752.field5617[n2 + 1] = n4;
                    boolean bl = class5752.field5628[n2];
                    class5752.field5628[n2] = class5752.field5628[n2 + 1];
                    class5752.field5628[n2 + 1] = bl;
                    n = 0;
                }
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="kg")
    @ObfuscatedSignature(descriptor="(IZI)Z", garbageValue="-228881169")
    final boolean method1315(int n, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = field646 && client.field648.field5612 > 2;
        if (!bl2) {
            boolean bl4;
            int n2 = n;
            if (n2 >= 2000) {
                n2 -= 2000;
            }
            bl2 = bl4 = n2 == 1007;
        }
        return bl2 && !bl;
    }

    @ObfuscatedName(value="ki")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1310288417")
    final void method1316(int n, int n2) {
        field648.method10920(n, n2);
        Iterator iterator = field508.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                field647 = true;
                field648.method10924();
                return;
            }
            class103 class1032 = (class103)iterator.next();
            class1032.field1319.method4235(false);
        }
    }

    @ObfuscatedName(value="lg")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="126")
    final void method1317(boolean bl) {
        int n = field663;
        int n2 = class128.field1521;
        int n3 = class363.field4038;
        if (class170.field1807.method7024(n)) {
            class86.method2588(class170.field1807.field3772[n], -1, n2, n3, bl);
        }
    }

    @ObfuscatedName(value="ll")
    @ObfuscatedSignature(descriptor="(Lna;I)V", garbageValue="2133359849")
    void method1318(class361 class3612) {
        int n;
        int n2;
        class361 class3613;
        class361 class3614 = class3613 = class3612.field4026 == -1 ? null : class170.field1807.method7031(class3612.field4026);
        if (class3613 != null) {
            n2 = class3613.field3886;
            n = class3613.field3887 * -1528330031;
        } else {
            n2 = class128.field1521;
            n = class363.field4038;
        }
        class394.method7872(class3612, n2, n, false);
        class86.method2585(class3612, n2, n);
    }

    @ObfuscatedName(value="ms")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-6921")
    final void method1561() {
        class122.method3325(field675);
        ++class243.field2596;
        if (field683 && field523) {
            class514 class5142;
            int n = class35.field201;
            int n2 = class35.field202;
            n2 -= field678;
            if ((n -= field715) < field681) {
                n = field681;
            }
            if (n + client.field675.field3886 > field681 + client.field676.field3886) {
                n = field681 + client.field676.field3886 - client.field675.field3886;
            }
            if (n2 < field682) {
                n2 = field682;
            }
            if (n2 + client.field675.field3887 * -1528330031 > client.field676.field3887 * -1528330031 + field682) {
                n2 = field682 + client.field676.field3887 * -1528330031 - client.field675.field3887 * -1528330031;
            }
            int n3 = n - field721;
            int n4 = n2 - field685;
            int n5 = client.field675.field3960;
            if (class243.field2596 > client.field675.field3961 && (n3 > n5 || n3 < -n5 || n4 > n5 || n4 < -n5)) {
                field585 = true;
            }
            int n6 = n - field681 + client.field676.field3987;
            int n7 = n2 - field682 + client.field676.field3899;
            if (client.field675.field3973 != null && field585) {
                class5142 = new class90();
                class5142.field1077 = field675;
                class5142.field1078 = n6;
                class5142.field1079 = n7;
                class5142.field1086 = client.field675.field3973;
                class471.method9136(class5142);
            }
            if (class35.field206 == 0) {
                if (!field585) {
                    if (class318.field3302 != null && !this.method1315(class318.field3302.field906, class318.field3302.field912)) {
                        if (client.field648.field5612 > 0) {
                            int n8 = field721 + field715;
                            int n9 = field685 + field678;
                            class36.method721(class318.field3302, n8, n9);
                            class318.field3302 = null;
                        }
                    } else {
                        this.method1316(field721 + field715, field678 + field685);
                    }
                } else {
                    if (client.field675.field3974 != null) {
                        class5142 = new class90();
                        class5142.field1077 = field675;
                        class5142.field1078 = n6;
                        class5142.field1079 = n7;
                        class5142.field1082 = field607;
                        class5142.field1086 = client.field675.field3974;
                        class471.method9136(class5142);
                    }
                    if (field607 != null && class211.method4832(field675) != null) {
                        class5142 = class90.method2629(class322.field3317, client.field564.field1446);
                        ((class324)class5142).field3442.method10266(client.field675.field4010);
                        ((class324)class5142).field3442.method10319(client.field607.field3863);
                        ((class324)class5142).field3442.method10319(client.field675.field3863);
                        ((class324)class5142).field3442.method10268(client.field607.field3910);
                        ((class324)class5142).field3442.method10266(client.field607.field4010);
                        ((class324)class5142).field3442.method10268(client.field675.field3910);
                        field564.method3257((class324)class5142);
                    }
                }
                field675 = null;
            }
            return;
        }
        if (class243.field2596 > 1) {
            if (!field585 && client.field648.field5612 > 0) {
                int n = field721 + field715;
                int n10 = field685 + field678;
                class36.method721(class318.field3302, n, n10);
                class318.field3302 = null;
            }
            field675 = null;
        }
    }

    @Override
    @ObfuscatedName(value="oe")
    @ObfuscatedSignature(descriptor="(B)Lwb;", garbageValue="-23")
    public class579 vmethod9086() {
        return class407.field4693 != null ? class407.field4693.field1147 : null;
    }

    @ObfuscatedName(value="pc")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1543488022")
    void method1321(int n) {
        class324 class3242 = class90.method2629(class322.field3342, client.field564.field1446);
        class3242.field3442.method10300(n);
        field564.method3257(class3242);
    }

    @ObfuscatedName(value="pq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1324183200")
    void method1322(int n) {
        class324 class3242 = class90.method2629(class322.field3371, client.field564.field1446);
        class3242.field3442.method10300(n);
        field564.method3257(class3242);
    }

    @Override
    public void setClient(int n) {
        this.field548 = n;
    }

    protected void finalize() throws Throwable {
        class440.method8814(this);
        super.finalize();
    }

    @Override
    public long getAccountHash() {
        return this.field691;
    }

    @Override
    public final void init() {
        try {
            if (!this.method542()) {
                return;
            }
            block22: for (int i = 0; i <= 28; ++i) {
                String string = this.getParameter(Integer.toString(i));
                if (string == null) continue;
                switch (i) {
                    case 14: {
                        class483.field5046 = Integer.parseInt(string);
                        continue block22;
                    }
                    case 25: {
                        int n = string.indexOf(".");
                        if (n == -1) {
                            Integer.parseInt(string);
                            continue block22;
                        }
                        Integer.parseInt(string.substring(0, n));
                        Integer.parseInt(string.substring(n + 1));
                        continue block22;
                    }
                    case 17: {
                        class28.field121 = string;
                        continue block22;
                    }
                    case 6: {
                        int n = Integer.parseInt(string);
                        MouseWheel[] mouseWheelArray = n < 0 || n >= class406.field4664.length ? null : class406.field4664[n];
                        class63.field446 = mouseWheelArray;
                        continue block22;
                    }
                    case 3: {
                        if (string.equalsIgnoreCase("true")) {
                            field796 = true;
                            continue block22;
                        }
                        field796 = false;
                        continue block22;
                    }
                    case 11: {
                        class472.field4996 = string;
                        continue block22;
                    }
                    case 15: {
                        field500 = Integer.parseInt(string);
                        continue block22;
                    }
                    case 9: {
                        class406.field4674 = string;
                        continue block22;
                    }
                    case 21: {
                        field766 = Integer.parseInt(string);
                        continue block22;
                    }
                    case 22: {
                        class272.field3024 = string;
                        continue block22;
                    }
                    case 10: {
                        MouseWheel[] mouseWheelArray = new class377[]{class377.field4126, class377.field4129, class377.field4132, class377.field4124, class377.field4127, class377.field4128};
                        class259.field2749 = (class377)class259.method5457(mouseWheelArray, Integer.parseInt(string));
                        if (class259.field2749 == class377.field4129) {
                            class383.field4489 = class534.field5352;
                            continue block22;
                        }
                        class383.field4489 = class534.field5358;
                        continue block22;
                    }
                    case 8: {
                        if (!string.equalsIgnoreCase("true")) continue block22;
                        continue block22;
                    }
                    case 12: {
                        field689 = Integer.parseInt(string);
                        continue block22;
                    }
                    case 5: {
                        field569 = Integer.parseInt(string);
                        continue block22;
                    }
                    case 4: {
                        if (field504 != -1) continue block22;
                        field504 = Integer.parseInt(string);
                        continue block22;
                    }
                    case 7: {
                        class438.field4820 = class83.method2508(Integer.parseInt(string));
                    }
                }
            }
            class187.field2092 = false;
            field502 = false;
            class526.field5324 = this.getCodeBase().getHost();
            HitSplatDef.field2760 = new class392();
            String string = class438.field4820.field4119;
            int n = 0;
            if ((field569 & class552.field5442.vmethod10703()) != 0) {
                class255.field2724 = "beta";
            }
            try {
                class30.method483("oldschool", class255.field2724, string, n, 23);
            }
            catch (Exception exception) {
                class255.method5410(null, exception);
            }
            field521 = this;
            class226.field2468 = field504;
            class431.field4782 = System.getenv("JX_ACCESS_TOKEN");
            class165.field1782 = System.getenv("JX_REFRESH_TOKEN");
            class18.field77 = System.getenv("JX_SESSION_ID");
            class22.field94 = System.getenv("JX_CHARACTER_ID");
            class174.method3886(System.getenv("JX_DISPLAY_NAME"));
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
                this.field547 = true;
            }
            if (field498 == -1) {
                field498 = this.method1441() || this.method1418() ? 5 : 0;
            }
            this.method539(765, 503, 228, 1);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw class506.method9592(runtimeException, "old228.client.init(" + ')');
        }
    }

    @Override
    public void setOtlTokenRequester(OtlTokenRequester otlTokenRequester) {
        if (otlTokenRequester != null) {
            this.field545 = otlTokenRequester;
            class114.method3212(10);
            return;
        }
    }

    @Override
    public boolean isOnLoginScreen() {
        return field510 == 10;
    }

    @Override
    public void setRefreshTokenRequester(RefreshAccessTokenRequester refreshAccessTokenRequester) {
        if (refreshAccessTokenRequester != null) {
            this.field747 = refreshAccessTokenRequester;
            return;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)[B", garbageValue="567852072")
    public static byte[] method1772(CharSequence charSequence) {
        int n = charSequence.length();
        byte[] byArray = new byte[n];
        int n2 = 0;
        while (n2 < n) {
            char c = charSequence.charAt(n2);
            byArray[n2] = c > '\u007f' ? 63 : (byte)c;
            ++n2;
        }
        return byArray;
    }

    @ObfuscatedName(value="hq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="8")
    static final void method1954() {
        field564.method3247();
        class4.method20();
        field508.method2723();
        field673.method3139();
        field575.method5738();
        System.gc();
        class125.method3347(0, 0);
        class153.method3619();
        field540 = false;
        class69.method1957();
        class360.method7405(10);
        field693 = 0;
        class143.method3517().method4979();
        class143.method3517().method4980();
    }

    @ObfuscatedName(value="me")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-2001451968")
    static final void method1709(int n, int n2) {
        if (!class170.field1807.method7024(n)) {
            return;
        }
        class128.method3367(class170.field1807.field3772[n], n2);
    }
}

