/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  netscape.javascript.JSObject
 */
import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import java.applet.Applet;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements(value="Client")
@ObfuscatedName(value="client")
public final class Client
extends GameEngine
implements Usernamed,
OAuthApi,
class339 {
    @ObfuscatedName(value="wq")
    @ObfuscatedSignature(descriptor="Lkk;")
    static final class277 field793;
    @ObfuscatedName(value="wu")
    @ObfuscatedSignature(descriptor="Lci;")
    static final ApproximateRouteStrategy field798;
    @ObfuscatedName(value="xj")
    static int[] field799;
    @ObfuscatedName(value="xd")
    static int[] field800;
    @ObfuscatedName(value="wy")
    @Export(value="archiveLoaders")
    static ArrayList archiveLoaders;
    @ObfuscatedName(value="wa")
    @ObfuscatedGetter(intValue=1988557135)
    @Export(value="archiveLoadersDone")
    static int archiveLoadersDone;
    @ObfuscatedName(value="wp")
    @ObfuscatedGetter(intValue=1265137461)
    static int field692;
    @ObfuscatedName(value="wf")
    @ObfuscatedGetter(intValue=-260278961)
    static int field794;
    @ObfuscatedName(value="wo")
    static List field792;
    @ObfuscatedName(value="br")
    @Export(value="client")
    @ObfuscatedSignature(descriptor="Lclient;")
    static Client client;
    @ObfuscatedName(value="bl")
    static boolean field497;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=-981379219)
    @Export(value="worldId")
    public static int worldId;
    @ObfuscatedName(value="cn")
    @ObfuscatedGetter(intValue=731808139)
    @Export(value="worldProperties")
    static int worldProperties;
    @ObfuscatedName(value="co")
    @ObfuscatedGetter(intValue=913157539)
    @Export(value="gameBuild")
    static int gameBuild;
    @ObfuscatedName(value="cp")
    @Export(value="isMembersWorld")
    public static boolean isMembersWorld;
    @ObfuscatedName(value="cz")
    @Export(value="isLowDetail")
    static boolean isLowDetail;
    @ObfuscatedName(value="ct")
    @ObfuscatedGetter(intValue=-848356977)
    static int field766;
    @ObfuscatedName(value="ci")
    @ObfuscatedGetter(intValue=204884787)
    @Export(value="clientType")
    static int clientType;
    @ObfuscatedName(value="cl")
    @ObfuscatedGetter(intValue=-65984007)
    static int field498;
    @ObfuscatedName(value="cw")
    @Export(value="onMobile")
    static boolean onMobile;
    @ObfuscatedName(value="dn")
    static boolean field723;
    @ObfuscatedName(value="dc")
    static boolean field509;
    @ObfuscatedName(value="dm")
    @ObfuscatedGetter(intValue=-599201185)
    @Export(value="gameState")
    static int gameState;
    @ObfuscatedName(value="dj")
    static boolean field511;
    @ObfuscatedName(value="dk")
    static boolean field512;
    @ObfuscatedName(value="dt")
    static boolean field513;
    @ObfuscatedName(value="df")
    @ObfuscatedGetter(intValue=-449024203)
    @Export(value="cycle")
    public static int cycle;
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
    @Export(value="rebootTimer")
    static int rebootTimer;
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
    @ObfuscatedGetter(intValue=-2086733760)
    static int field529;
    @ObfuscatedName(value="ej")
    @ObfuscatedSignature(descriptor="Lej;")
    @Export(value="playerAttackOption")
    static AttackOption playerAttackOption;
    @ObfuscatedName(value="eg")
    @ObfuscatedSignature(descriptor="Lej;")
    @Export(value="npcAttackOption")
    static AttackOption npcAttackOption;
    @ObfuscatedName(value="et")
    @Export(value="renderSelf")
    static boolean renderSelf;
    @ObfuscatedName(value="en")
    @ObfuscatedSignature(descriptor="Ldd;")
    static class95 field533;
    @ObfuscatedName(value="el")
    @ObfuscatedGetter(intValue=-489561335)
    @Export(value="js5ConnectState")
    static int js5ConnectState;
    @ObfuscatedName(value="ea")
    @ObfuscatedGetter(intValue=1587484709)
    static int field535;
    @ObfuscatedName(value="fk")
    @ObfuscatedGetter(intValue=-1918509341)
    @Export(value="js5Errors")
    static int js5Errors;
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
    @Export(value="Login_isUsernameRemembered")
    static boolean Login_isUsernameRemembered;
    @ObfuscatedName(value="ht")
    @ObfuscatedSignature(descriptor="Ldc;")
    static SecureRandomFuture field556;
    @ObfuscatedName(value="hw")
    static int[] field563;
    @ObfuscatedName(value="hz")
    @Export(value="randomDatData")
    static byte[] randomDatData;
    @ObfuscatedName(value="hh")
    @ObfuscatedGetter(intValue=2005175169)
    static int field562;
    @ObfuscatedName(value="ha")
    static int[] field567;
    @ObfuscatedName(value="ii")
    @ObfuscatedSignature(descriptor="Lep;")
    @Export(value="packetWriter")
    public static final PacketWriter packetWriter;
    @ObfuscatedName(value="iy")
    @ObfuscatedGetter(intValue=-753899573)
    @Export(value="logoutTimer")
    static int logoutTimer;
    @ObfuscatedName(value="in")
    @Export(value="hadNetworkError")
    static boolean hadNetworkError;
    @ObfuscatedName(value="is")
    @ObfuscatedSignature(descriptor="Lrb;")
    @Export(value="timer")
    static Timer timer;
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
    @Export(value="isInInstance")
    static boolean isInInstance;
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
    @Export(value="alternativeScrollbarWidth")
    static int alternativeScrollbarWidth;
    @ObfuscatedName(value="kg")
    @ObfuscatedGetter(intValue=921200069)
    @Export(value="camAngleX")
    static int camAngleX;
    @ObfuscatedName(value="ki")
    @ObfuscatedGetter(intValue=-975398401)
    @Export(value="camAngleY")
    static int camAngleY;
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
    @Export(value="titleLoadingStage")
    static int titleLoadingStage;
    @ObfuscatedName(value="lm")
    @ObfuscatedGetter(intValue=149837393)
    @Export(value="camFollowHeight")
    static int camFollowHeight;
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
    @Export(value="oculusOrbNormalSpeed")
    static int oculusOrbNormalSpeed;
    @ObfuscatedName(value="lc")
    @ObfuscatedGetter(intValue=2007883423)
    @Export(value="oculusOrbSlowedSpeed")
    static int oculusOrbSlowedSpeed;
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
    @Export(value="viewportDrawCount")
    static int viewportDrawCount;
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
    @Export(value="showMouseCross")
    static boolean showMouseCross;
    @ObfuscatedName(value="me")
    @ObfuscatedGetter(intValue=-726804691)
    static int field625;
    @ObfuscatedName(value="mq")
    @Export(value="showLoadingMessages")
    static boolean showLoadingMessages;
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
    @Export(value="drawPlayerNames")
    static int drawPlayerNames;
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
    @Export(value="combatTargetPlayerIndex")
    static int combatTargetPlayerIndex;
    @ObfuscatedName(value="ng")
    @Export(value="currentLevels")
    static int[] currentLevels;
    @ObfuscatedName(value="nm")
    @Export(value="levels")
    static int[] levels;
    @ObfuscatedName(value="nk")
    @Export(value="experience")
    static int[] experience;
    @ObfuscatedName(value="ny")
    static int[] field645;
    @ObfuscatedName(value="nn")
    @Export(value="leftClickOpensMenu")
    static boolean leftClickOpensMenu;
    @ObfuscatedName(value="nr")
    @Export(value="isMenuOpen")
    static boolean isMenuOpen;
    @ObfuscatedName(value="na")
    @ObfuscatedSignature(descriptor="Lwl;")
    static class575 field648;
    @ObfuscatedName(value="nj")
    @Export(value="followerOpsLowPriority")
    static boolean followerOpsLowPriority;
    @ObfuscatedName(value="op")
    @Export(value="tapToDrop")
    static boolean tapToDrop;
    @ObfuscatedName(value="oi")
    @Export(value="showMouseOverText")
    static boolean showMouseOverText;
    @ObfuscatedName(value="oy")
    @ObfuscatedGetter(intValue=-474804625)
    @Export(value="viewportX")
    static int viewportX;
    @ObfuscatedName(value="om")
    @ObfuscatedGetter(intValue=1658084859)
    @Export(value="viewportY")
    static int viewportY;
    @ObfuscatedName(value="oq")
    @ObfuscatedGetter(intValue=-1646391571)
    static int field654;
    @ObfuscatedName(value="ov")
    @ObfuscatedGetter(intValue=-1569373373)
    static int field655;
    @ObfuscatedName(value="of")
    @ObfuscatedGetter(intValue=-1064135721)
    @Export(value="isItemSelected")
    static int isItemSelected;
    @ObfuscatedName(value="oe")
    @Export(value="isSpellSelected")
    static boolean isSpellSelected;
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
    @Export(value="rootInterface")
    static int rootInterface;
    @ObfuscatedName(value="oz")
    @ObfuscatedSignature(descriptor="Lub;")
    @Export(value="interfaceParents")
    static NodeHashTable interfaceParents;
    @ObfuscatedName(value="ok")
    @ObfuscatedGetter(intValue=1520275521)
    static int field665;
    @ObfuscatedName(value="oo")
    @ObfuscatedGetter(intValue=1041490587)
    static int field707;
    @ObfuscatedName(value="pc")
    @ObfuscatedGetter(intValue=-1742606525)
    @Export(value="chatEffects")
    static int chatEffects;
    @ObfuscatedName(value="pq")
    @ObfuscatedSignature(descriptor="Lna;")
    @Export(value="meslayerContinueWidget")
    static Widget meslayerContinueWidget;
    @ObfuscatedName(value="pa")
    @ObfuscatedGetter(intValue=1873060579)
    @Export(value="runEnergy")
    static int runEnergy;
    @ObfuscatedName(value="pl")
    @ObfuscatedGetter(intValue=448837437)
    @Export(value="weight")
    static int weight;
    @ObfuscatedName(value="pt")
    @ObfuscatedGetter(intValue=262182137)
    @Export(value="staffModLevel")
    static int staffModLevel;
    @ObfuscatedName(value="pk")
    @ObfuscatedGetter(intValue=248491471)
    @Export(value="followerIndex")
    static int followerIndex;
    @ObfuscatedName(value="pb")
    @Export(value="playerMod")
    static boolean playerMod;
    @ObfuscatedName(value="pp")
    @ObfuscatedSignature(descriptor="Lna;")
    @Export(value="viewportWidget")
    static Widget viewportWidget;
    @ObfuscatedName(value="py")
    @ObfuscatedSignature(descriptor="Lna;")
    @Export(value="clickedWidget")
    public static Widget clickedWidget;
    @ObfuscatedName(value="pj")
    @ObfuscatedSignature(descriptor="Lna;")
    @Export(value="clickedWidgetParent")
    static Widget clickedWidgetParent;
    @ObfuscatedName(value="pu")
    @ObfuscatedGetter(intValue=-717618303)
    @Export(value="widgetClickX")
    static int widgetClickX;
    @ObfuscatedName(value="pe")
    @ObfuscatedGetter(intValue=2041394719)
    @Export(value="widgetClickY")
    static int widgetClickY;
    @ObfuscatedName(value="pw")
    @ObfuscatedSignature(descriptor="Lna;")
    @Export(value="draggedOnWidget")
    static Widget draggedOnWidget;
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
    @Export(value="isDraggingWidget")
    static boolean isDraggingWidget;
    @ObfuscatedName(value="pf")
    @ObfuscatedGetter(intValue=-809719349)
    @Export(value="cycleCntr")
    static int cycleCntr;
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
    @Export(value="chatCycle")
    static int chatCycle;
    @ObfuscatedName(value="qh")
    @ObfuscatedGetter(intValue=224198131)
    static int field697;
    @ObfuscatedName(value="qa")
    @ObfuscatedGetter(intValue=-477095393)
    static int field770;
    @ObfuscatedName(value="qe")
    @ObfuscatedGetter(intValue=762527647)
    @Export(value="menuOptionsCount")
    static int menuOptionsCount;
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
    @Export(value="mouseWheelRotation")
    static int mouseWheelRotation;
    @ObfuscatedName(value="qc")
    @ObfuscatedSignature(descriptor="Lww;")
    static class574 field755;
    @ObfuscatedName(value="qk")
    @ObfuscatedSignature(descriptor="Lpm;")
    @Export(value="scriptEvents")
    static NodeDeque scriptEvents;
    @ObfuscatedName(value="qt")
    @ObfuscatedSignature(descriptor="Lpm;")
    static NodeDeque field666;
    @ObfuscatedName(value="rp")
    @ObfuscatedSignature(descriptor="Lpm;")
    static NodeDeque field708;
    @ObfuscatedName(value="re")
    @ObfuscatedSignature(descriptor="Lpm;")
    static NodeDeque field709;
    @ObfuscatedName(value="rg")
    @ObfuscatedSignature(descriptor="Lub;")
    @Export(value="widgetFlags")
    static NodeHashTable widgetFlags;
    @ObfuscatedName(value="rc")
    @ObfuscatedGetter(intValue=-1206320977)
    @Export(value="rootWidgetCount")
    public static int rootWidgetCount;
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
    @Export(value="rootWidgetXs")
    public static int[] rootWidgetXs;
    @ObfuscatedName(value="rl")
    @Export(value="rootWidgetYs")
    public static int[] rootWidgetYs;
    @ObfuscatedName(value="ry")
    @Export(value="rootWidgetWidths")
    public static int[] rootWidgetWidths;
    @ObfuscatedName(value="rm")
    @Export(value="rootWidgetHeights")
    public static int[] rootWidgetHeights;
    @ObfuscatedName(value="rb")
    @ObfuscatedGetter(intValue=-92662397)
    static int field720;
    @ObfuscatedName(value="rk")
    @ObfuscatedGetter(longValue=-4040198743471200231L)
    static long field541;
    @ObfuscatedName(value="rn")
    @Export(value="isResizable")
    static boolean isResizable;
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
    @Export(value="publicChatMode")
    static int publicChatMode;
    @ObfuscatedName(value="si")
    @ObfuscatedGetter(intValue=-318548323)
    @Export(value="tradeChatMode")
    static int tradeChatMode;
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
    @Export(value="currentClanSettings")
    static ClanSettings[] currentClanSettings;
    @ObfuscatedName(value="sq")
    @ObfuscatedSignature(descriptor="[Lgk;")
    @Export(value="currentClanChannels")
    static ClanChannel[] currentClanChannels;
    @ObfuscatedName(value="sd")
    @ObfuscatedGetter(intValue=1301726103)
    static int field739;
    @ObfuscatedName(value="sv")
    @ObfuscatedGetter(intValue=1472706269)
    @Export(value="mapIconCount")
    static int mapIconCount;
    @ObfuscatedName(value="sh")
    static int[] field658;
    @ObfuscatedName(value="sl")
    static int[] field742;
    @ObfuscatedName(value="sn")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static SpritePixels[] field719;
    @ObfuscatedName(value="sj")
    @ObfuscatedGetter(intValue=-494910763)
    static int field744;
    @ObfuscatedName(value="th")
    @ObfuscatedGetter(intValue=920071481)
    static int field745;
    @ObfuscatedName(value="ta")
    @ObfuscatedGetter(intValue=-1326480137)
    @Export(value="minimapState")
    static int minimapState;
    @ObfuscatedName(value="tw")
    @Export(value="playingJingle")
    static boolean playingJingle;
    @ObfuscatedName(value="tt")
    @ObfuscatedGetter(intValue=744192101)
    @Export(value="soundEffectCount")
    static int soundEffectCount;
    @ObfuscatedName(value="tu")
    @Export(value="soundEffectIds")
    static int[] soundEffectIds;
    @ObfuscatedName(value="tg")
    @Export(value="queuedSoundEffectLoops")
    static int[] queuedSoundEffectLoops;
    @ObfuscatedName(value="tm")
    @Export(value="queuedSoundEffectDelays")
    static int[] queuedSoundEffectDelays;
    @ObfuscatedName(value="te")
    @Export(value="soundLocations")
    static int[] soundLocations;
    @ObfuscatedName(value="tv")
    static int[] field753;
    @ObfuscatedName(value="tj")
    @ObfuscatedSignature(descriptor="[Lbg;")
    @Export(value="soundEffects")
    static SoundEffect[] soundEffects;
    @ObfuscatedName(value="tz")
    @Export(value="isCameraLocked")
    static boolean isCameraLocked;
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
    @Export(value="zoomHeight")
    static short zoomHeight;
    @ObfuscatedName(value="vr")
    @Export(value="zoomWidth")
    static short zoomWidth;
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
    @Export(value="viewportOffsetX")
    static int viewportOffsetX;
    @ObfuscatedName(value="vt")
    @ObfuscatedGetter(intValue=-1835546011)
    @Export(value="viewportOffsetY")
    static int viewportOffsetY;
    @ObfuscatedName(value="vv")
    @ObfuscatedGetter(intValue=-1034761467)
    @Export(value="viewportWidth")
    static int viewportWidth;
    @ObfuscatedName(value="vy")
    @ObfuscatedGetter(intValue=2037360197)
    @Export(value="viewportHeight")
    static int viewportHeight;
    @ObfuscatedName(value="vn")
    @ObfuscatedGetter(intValue=-1463071545)
    @Export(value="viewportZoom")
    static int viewportZoom;
    @ObfuscatedName(value="vl")
    @ObfuscatedSignature(descriptor="Lny;")
    @Export(value="playerAppearance")
    static final PlayerComposition playerAppearance;
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
    @Export(value="grandExchangeOffers")
    static GrandExchangeOffer[] grandExchangeOffers;
    @ObfuscatedName(value="vb")
    @ObfuscatedSignature(descriptor="Lcl;")
    @Export(value="GrandExchangeEvents_worldComparator")
    static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
    @ObfuscatedName(value="vf")
    @ObfuscatedSignature(descriptor="Lro;")
    static class465 field636;
    @ObfuscatedName(value="wc")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="DBTableIndex_cache")
    static EvictingDualNodeHashTable DBTableIndex_cache;
    @ObfuscatedName(value="wr")
    @ObfuscatedSignature(descriptor="Lmi;")
    static EvictingDualNodeHashTable field789;
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
    @ObfuscatedSignature(descriptor="Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;")
    RefreshAccessTokenRequester field747;
    @ObfuscatedName(value="gi")
    Future field551;
    @ObfuscatedName(value="hv")
    @ObfuscatedSignature(descriptor="Lvy;")
    Buffer field558;
    @ObfuscatedName(value="hc")
    @ObfuscatedSignature(descriptor="Lax;")
    class7 field559;
    @ObfuscatedName(value="hd")
    @ObfuscatedGetter(longValue=2255117434739773081L)
    long field691 = -1L;

    static {
        field497 = true;
        worldId = 1;
        worldProperties = 0;
        gameBuild = 0;
        isMembersWorld = false;
        isLowDetail = false;
        field766 = -1;
        clientType = -1;
        field498 = -1;
        onMobile = false;
        field723 = false;
        field509 = false;
        gameState = 0;
        field511 = false;
        field512 = false;
        field513 = true;
        cycle = 0;
        field693 = 0;
        field787 = 1L;
        field517 = -1;
        field518 = -1;
        field557 = -1L;
        field520 = true;
        rebootTimer = 0;
        field565 = 0;
        field530 = 0;
        field524 = 0;
        field525 = 0;
        field526 = 0;
        field527 = 0;
        field528 = 0;
        field529 = 0;
        playerAttackOption = AttackOption.field1380;
        npcAttackOption = AttackOption.field1380;
        renderSelf = false;
        field533 = class95.field1157;
        js5ConnectState = 0;
        field535 = 0;
        js5Errors = 0;
        field501 = 0;
        field743 = 0;
        field613 = 0;
        field629 = class146.field1661;
        field741 = class561.field5530;
        field552 = CollisionMap.method5830(Client.method1772("com_jagex_auth_desktop_osrs:public"));
        field684 = CollisionMap.method5830(Client.method1772("com_jagex_auth_desktop_runelite:public"));
        Login_isUsernameRemembered = false;
        field556 = new SecureRandomFuture();
        field563 = new int[4];
        randomDatData = null;
        field562 = 0;
        field567 = new int[250];
        packetWriter = new PacketWriter();
        logoutTimer = 0;
        hadNetworkError = false;
        timer = new Timer();
        field568 = new HashMap();
        field760 = 0;
        field615 = 1;
        field561 = 0;
        field572 = 1;
        field573 = 0;
        field574 = new int[4][13][13];
        field508 = new class97();
        isInInstance = false;
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
        alternativeScrollbarWidth = 0;
        camAngleX = 128;
        camAngleY = 0;
        field590 = 0;
        field591 = 0;
        field592 = 0;
        field593 = 0;
        titleLoadingStage = 0;
        camFollowHeight = 50;
        field596 = 0;
        field539 = 0;
        field626 = 0;
        oculusOrbNormalSpeed = 12;
        oculusOrbSlowedSpeed = 6;
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
        viewportDrawCount = 0;
        field802 = -1;
        field538 = -1;
        field620 = 0;
        field717 = 0;
        field622 = 0;
        field603 = 0;
        showMouseCross = true;
        field625 = 0;
        showLoadingMessages = true;
        field623 = -1;
        field628 = 0;
        field736 = -1L;
        field630 = -1L;
        field631 = "";
        field781 = -1;
        field633 = true;
        drawPlayerNames = 0;
        field635 = 0;
        field537 = new int[1000];
        field637 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
        field638 = new String[8];
        field639 = new boolean[8];
        field640 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        combatTargetPlayerIndex = -1;
        currentLevels = new int[25];
        levels = new int[25];
        experience = new int[25];
        field645 = new int[25];
        leftClickOpensMenu = false;
        isMenuOpen = false;
        field648 = new class575(true);
        followerOpsLowPriority = false;
        tapToDrop = false;
        showMouseOverText = true;
        viewportX = -1;
        viewportY = -1;
        field654 = 0;
        field655 = 50;
        isItemSelected = 0;
        field570 = null;
        isSpellSelected = false;
        field659 = -1;
        field660 = -1;
        field661 = null;
        field662 = null;
        rootInterface = -1;
        interfaceParents = new NodeHashTable(8);
        field665 = 0;
        field707 = -1;
        chatEffects = 0;
        meslayerContinueWidget = null;
        runEnergy = 0;
        weight = 0;
        staffModLevel = 0;
        followerIndex = -1;
        playerMod = false;
        viewportWidget = null;
        clickedWidget = null;
        clickedWidgetParent = null;
        widgetClickX = 0;
        widgetClickY = 0;
        draggedOnWidget = null;
        field523 = false;
        field681 = -1;
        field682 = -1;
        field683 = false;
        field721 = -1;
        field685 = -1;
        isDraggingWidget = false;
        cycleCntr = 1;
        field688 = new int[32];
        field586 = 0;
        field544 = new int[32];
        field749 = 0;
        field780 = new int[32];
        field505 = 0;
        field694 = new int[32];
        field579 = 0;
        chatCycle = 0;
        field697 = 0;
        field770 = 0;
        menuOptionsCount = 0;
        field700 = 0;
        field701 = 0;
        field714 = 0;
        field499 = 0;
        mouseWheelRotation = 0;
        field755 = new class574();
        scriptEvents = new NodeDeque();
        field666 = new NodeDeque();
        field708 = new NodeDeque();
        field709 = new NodeDeque();
        widgetFlags = new NodeHashTable(512);
        rootWidgetCount = 0;
        field619 = -2;
        field713 = new boolean[100];
        field732 = new boolean[100];
        field580 = new boolean[100];
        rootWidgetXs = new int[100];
        rootWidgetYs = new int[100];
        rootWidgetWidths = new int[100];
        rootWidgetHeights = new int[100];
        field720 = 0;
        field541 = 0L;
        isResizable = true;
        field632 = 600;
        field695 = field632 / GameEngine.cycleDurationMillis;
        field712 = new int[]{0xFFFF00, 0xFF0000, 65280, 65535, 0xFF00FF, 0xFFFFFF};
        publicChatMode = 0;
        tradeChatMode = 0;
        field516 = "";
        field729 = new long[100];
        field730 = 0;
        field731 = new class269();
        field575 = new class267();
        field733 = 0;
        field589 = new int[128];
        field735 = new int[128];
        field740 = -1L;
        currentClanSettings = new ClanSettings[4];
        currentClanChannels = new ClanChannel[4];
        field739 = -1;
        mapIconCount = 0;
        field658 = new int[1000];
        field742 = new int[1000];
        field719 = new SpritePixels[1000];
        field744 = 0;
        field745 = 0;
        minimapState = 0;
        playingJingle = false;
        soundEffectCount = 0;
        soundEffectIds = new int[50];
        queuedSoundEffectLoops = new int[50];
        queuedSoundEffectDelays = new int[50];
        soundLocations = new int[50];
        field753 = new int[50];
        soundEffects = new SoundEffect[50];
        isCameraLocked = false;
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
        zoomHeight = (short)256;
        zoomWidth = (short)320;
        field772 = 1;
        field773 = Short.MAX_VALUE;
        field702 = 1;
        field775 = Short.MAX_VALUE;
        viewportOffsetX = 0;
        viewportOffsetY = 0;
        viewportWidth = 0;
        viewportHeight = 0;
        viewportZoom = 0;
        playerAppearance = new PlayerComposition();
        field621 = -1;
        field783 = -1;
        field686 = new DesktopPlatformInfoProvider();
        grandExchangeOffers = new GrandExchangeOffer[8];
        GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
        field636 = new class465(8, class463.field4954);
        DBTableIndex_cache = new EvictingDualNodeHashTable(64);
        field789 = new EvictingDualNodeHashTable(64);
        field790 = -1;
        field791 = -1;
        field792 = new ArrayList();
        field793 = new class277();
        field794 = 30;
        archiveLoaders = new ArrayList(10);
        archiveLoadersDone = 0;
        field692 = 0;
        field798 = new ApproximateRouteStrategy();
        field799 = new int[50];
        field800 = new int[50];
    }

    @Override
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1848806273")
    @Export(value="resizeGame")
    protected final void resizeGame() {
        field541 = ReflectionCheck.method724() + 500L;
        this.resizeJS();
        if (rootInterface != -1) {
            this.resizeRoot(true);
        }
    }

    @Override
    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-494623143")
    @Export(value="setUp")
    protected final void setUp() {
        ClientPreferences clientPreferences;
        boolean bl;
        class163.method3778(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
        int n = worldProperties;
        class552 class5522 = class552.field5442;
        class273.field3035 = bl = (n & class5522.rsOrdinal()) != 0;
        PlayerComposition.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
        class173.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
        class340.currentPort = PlayerComposition.worldPort;
        FontName.field5323 = class360.field3860;
        PlayerComposition.field3816 = class360.field3858;
        class169.field1805 = class360.field3856;
        class7.field30 = class360.field3855;
        class280.urlRequester = new class119(this.field547, 228);
        this.setUpKeyboard();
        this.method534();
        ClanSettings.field1750 = this.mouseWheel();
        this.method533(field575, 0);
        this.method533(field731, 1);
        this.setUpClipboard();
        ReflectionCheck.field227 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
        Object object = null;
        ClientPreferences clientPreferences2 = new ClientPreferences();
        try {
            int n2;
            object = class31.getPreferencesFile("", StructComposition.field2749.name, false);
            byte[] byArray = new byte[(int)((AccessFile)object).length()];
            for (int i = 0; i < byArray.length; i += n2) {
                n2 = ((AccessFile)object).read(byArray, i, byArray.length - i);
                if (n2 != -1) continue;
                throw new IOException();
            }
            clientPreferences2 = new ClientPreferences(new Buffer(byArray));
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            if (object != null) {
                ((AccessFile)object).close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        class544.clientPreferences = clientPreferences = clientPreferences2;
        GraphicsObject.method2356(this, BufferedNetSocket.field5063);
        PacketBuffer.setWindowedMode(class544.clientPreferences.method2906());
        class10.friendSystem = new FriendSystem(class383.loginType);
        this.field543 = new class14("tokenRequest", 1, 1);
        class7.method50(this);
        field793.method5940();
        object = new ModelData(3, 1, 0);
        ((ModelData)object).method3942(-64, -8, 64);
        ((ModelData)object).method3942(64, -8, 64);
        ((ModelData)object).method3942(0, -8, -24);
        ((ModelData)object).method3954(0, 2, 1, (byte)1, (byte)-1, (short)-1, (short)-1);
        class53.field338 = ((ModelData)object).toModel(128, 256, 0, -128, 0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1077900572")
    @Export(value="doCycle")
    protected final void doCycle() {
        ++Client.cycle;
        this.doCycleJs5();
        WorldMapData_1.method6298();
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

                if ((var2_1 = (var1_9 = var3_2)) != 0 && Client.playingJingle && class328.pcmPlayer1 != null) {
                    class328.pcmPlayer1.tryDiscard();
                }
                class113.method3178();
                Client.field731.method5763();
                this.method532();
                TaskHandler.method4914();
                if (ClanSettings.field1750 != null) {
                    Client.mouseWheelRotation = var3_2 = ClanSettings.field1750.useRotation();
                }
                if (Client.gameState != 0) {
                    if (Client.gameState != 5) {
                        if (Client.gameState != 10 && Client.gameState != 11) {
                            if (Client.gameState != 20) {
                                if (Client.gameState != 50) {
                                    if (Client.gameState == 25) {
                                        if (Client.field723) {
                                            class213.method4907();
                                        }
                                        if (Client.field509) {
                                            GrandExchangeEvents.method7859(class151.field1683);
                                        }
                                        if (!Client.field509 && !Client.field723) {
                                            class360.updateGameState(30);
                                        }
                                    }
                                } else {
                                    class4.method19(this, FontName.field5319, HealthBarUpdate.fontPlain12);
                                    this.doCycleLoggedOut();
                                }
                            } else {
                                class4.method19(this, FontName.field5319, HealthBarUpdate.fontPlain12);
                                this.doCycleLoggedOut();
                            }
                        } else {
                            class4.method19(this, FontName.field5319, HealthBarUpdate.fontPlain12);
                        }
                    } else {
                        class4.method19(this, FontName.field5319, HealthBarUpdate.fontPlain12);
                        ArchiveLoader.method2581();
                        GrandExchangeOfferWorldComparator.method7902();
                    }
                } else {
                    ArchiveLoader.method2581();
                    GrandExchangeOfferWorldComparator.method7902();
                }
                if (Client.gameState != 30) {
                    if (Client.gameState == 40 || Client.gameState == 45) {
                        this.doCycleLoggedOut();
                    }
                } else {
                    this.doCycleLoggedIn();
                }
                return;
            }
            var5_4 = (class345)var4_3.next();
            if (var5_4 == null) continue;
            var5_4.field3743.clear();
            var5_4.field3743.method6714();
            var5_4.field3743.setPcmStreamVolume(0);
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
    @Export(value="draw")
    protected final void draw(boolean bl) {
        block29: {
            int n;
            block28: {
                if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field541 && ReflectionCheck.method724() > field541) {
                    PacketBuffer.setWindowedMode(TextureProvider.getWindowedMode());
                }
                if (bl) {
                    for (n = 0; n < 100; ++n) {
                        Client.field713[n] = true;
                    }
                }
                if (gameState != 0) {
                    if (gameState == 5) {
                        BuddyRankComparator.drawTitle(GraphicsObject.field892, FontName.field5319, HealthBarUpdate.fontPlain12);
                    } else if (gameState != 10 && gameState != 11) {
                        if (gameState == 20) {
                            BuddyRankComparator.drawTitle(GraphicsObject.field892, FontName.field5319, HealthBarUpdate.fontPlain12);
                        } else if (gameState == 50) {
                            BuddyRankComparator.drawTitle(GraphicsObject.field892, FontName.field5319, HealthBarUpdate.fontPlain12);
                        } else if (gameState != 25) {
                            if (gameState == 30) {
                                this.drawLoggedIn();
                            } else if (gameState == 40) {
                                class328.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
                            } else if (gameState == 45) {
                                class328.drawLoadingMessage("Please wait...", false);
                            }
                        } else if (field573 != 1) {
                            if (field573 != 2) {
                                class328.drawLoadingMessage("Loading - please wait.", false);
                            } else {
                                if (field561 > field572) {
                                    field572 = field561;
                                }
                                n = (field572 * 50 - field561 * 50) / field572 + 50;
                                class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + n + "%" + ")", false);
                            }
                        } else {
                            if (field760 > field615) {
                                field615 = field760;
                            }
                            n = (field615 * 50 - field760 * 50) / field615;
                            class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + n + "%" + ")", false);
                        }
                    } else {
                        BuddyRankComparator.drawTitle(GraphicsObject.field892, FontName.field5319, HealthBarUpdate.fontPlain12);
                    }
                } else {
                    this.method556(Login.Login_loadingPercent, Login.Login_loadingText, bl, field765);
                }
                if (gameState != 30 || field720 != 0 || bl || isResizable) break block28;
                for (n = 0; n < rootWidgetCount; ++n) {
                    if (!field732[n]) continue;
                    class6.rasterProvider.draw(rootWidgetXs[n], rootWidgetYs[n], rootWidgetWidths[n], rootWidgetHeights[n]);
                    Client.field732[n] = false;
                }
                break block29;
            }
            if (gameState <= 0) break block29;
            class6.rasterProvider.drawFull(0, 0);
            for (n = 0; n < rootWidgetCount; ++n) {
                Client.field732[n] = false;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-12")
    @Export(value="kill0")
    protected final void kill0() {
        if (class19.varcs != null && class19.varcs.method3199()) {
            class19.varcs.write();
        }
        if (class168.field1794 != null) {
            class168.field1794.isRunning = false;
        }
        class168.field1794 = null;
        packetWriter.close();
        if (MouseHandler.MouseHandler_instance != null) {
            MouseHandler mouseHandler = MouseHandler.MouseHandler_instance;
            synchronized (mouseHandler) {
                MouseHandler.MouseHandler_instance = null;
            }
        }
        ClanSettings.field1750 = null;
        if (class328.pcmPlayer1 != null) {
            class328.pcmPlayer1.shutdown();
        }
        HitSplatDefinition.field2760.method7855();
        TaskHandler.method4916();
        if (class280.urlRequester != null) {
            class280.urlRequester.close();
            class280.urlRequester = null;
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
        return class18.field77 != null && !class18.field77.trim().isEmpty() && DevicePcmPlayerProvider.field94 != null && !DevicePcmPlayerProvider.field94.trim().isEmpty();
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
        URL uRL = new URL(FriendLoginUpdate.field4996 + "shield/oauth/token" + new class505(hashMap).method9574());
        class461 class4612 = new class461();
        if (!this.method1286()) {
            class4612.method8975(field552);
        } else {
            class4612.method8975(field684);
        }
        class4612.method8974("Host", new URL(FriendLoginUpdate.field4996).getHost());
        class4612.method8981(class502.field5137);
        class9 class94 = class9.field43;
        RefreshAccessTokenRequester refreshAccessTokenRequester = this.field747;
        if (refreshAccessTokenRequester == null) {
            class10 class102 = new class10(uRL, class94, class4612, this.field547);
            this.field784 = this.field543.method183(class102);
            return;
        }
        this.field551 = refreshAccessTokenRequester.request(class94.method67(), uRL, class4612.method8977(), "");
    }

    @ObfuscatedName(value="gw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="3")
    void method1295(String string) throws IOException {
        URL uRL = new URL(FriendLoginUpdate.field4996 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class461 class4612 = new class461();
        class4612.method8978(string);
        class9 class94 = class9.field34;
        OtlTokenRequester otlTokenRequester = this.field545;
        if (otlTokenRequester == null) {
            class10 class102 = new class10(uRL, class94, class4612, this.field547);
            this.field650 = this.field543.method183(class102);
            return;
        }
        this.field546 = otlTokenRequester.request(class94.method67(), uRL, class4612.method8977(), "");
    }

    @ObfuscatedName(value="gc")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;S)V", garbageValue="-9953")
    void method1296(String string, String string2) throws IOException, JSONException {
        URL uRL = new URL(RouteStrategy.field3024 + "game-session/v1/tokens");
        class10 class102 = new class10(uRL, class9.field43, this.field547);
        class102.method114().method8978(string);
        class102.method114().method8981(class502.field5137);
        JSONObject jSONObject = new JSONObject();
        jSONObject.method11016("accountId", string2);
        class102.method108(new class504(jSONObject));
        this.field650 = this.field543.method183(class102);
    }

    @ObfuscatedName(value="gp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1900073120")
    @Export(value="doCycleJs5")
    void doCycleJs5() {
        if (gameState == 1000) {
            return;
        }
        boolean bl = HitSplatDefinition.field2760.method7822();
        if (!bl) {
            this.method1302();
        }
    }

    @ObfuscatedName(value="gy")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1705512742")
    void method1302() {
        if (HitSplatDefinition.field2760.field4617 >= 4) {
            this.error("js5crc");
            class360.updateGameState(1000);
            return;
        }
        if (HitSplatDefinition.field2760.field4622 >= 4) {
            if (gameState <= 5) {
                this.error("js5io");
                class360.updateGameState(1000);
                return;
            }
            field535 = 3000;
            HitSplatDefinition.field2760.field4622 = 3;
        }
        if (--field535 + 1 > 0) {
            return;
        }
        try {
            if (js5ConnectState == 0) {
                class466.js5SocketTask = GameEngine.taskHandler.method4911(FontName.worldHost, class340.currentPort);
                ++js5ConnectState;
            }
            if (js5ConnectState == 1) {
                if (class466.js5SocketTask.status == 2) {
                    this.js5Error(-1);
                    return;
                }
                if (class466.js5SocketTask.status == 1) {
                    ++js5ConnectState;
                }
            }
            if (js5ConnectState == 2) {
                class369.js5Socket = Skills.method7618((Socket)class466.js5SocketTask.result, 40000, 5000);
                Buffer buffer = new Buffer(class326.field3583.field3591 + 1);
                buffer.writeByte(class326.field3583.field3590);
                buffer.method10268(228);
                buffer.method10268(field563[0]);
                buffer.method10268(field563[1]);
                buffer.method10268(field563[2]);
                buffer.method10268(field563[3]);
                class369.js5Socket.write(buffer.array, 0, class326.field3583.field3591 + 1);
                ++js5ConnectState;
                class133.field1548 = ReflectionCheck.method724();
            }
            if (js5ConnectState == 3) {
                if (class369.js5Socket.vmethod9408() > 0) {
                    int n = class369.js5Socket.vmethod9406();
                    if (n != 0) {
                        this.js5Error(n);
                        return;
                    }
                    ++js5ConnectState;
                } else if (ReflectionCheck.method724() - class133.field1548 > 30000L) {
                    this.js5Error(-2);
                    return;
                }
            }
            if (js5ConnectState == 4) {
                HitSplatDefinition.field2760.method7835(class369.js5Socket, gameState > 20);
                class466.js5SocketTask = null;
                class369.js5Socket = null;
                js5ConnectState = 0;
                js5Errors = 0;
            }
        }
        catch (IOException iOException) {
            this.js5Error(-3);
        }
    }

    @ObfuscatedName(value="gt")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-97")
    @Export(value="js5Error")
    void js5Error(int n) {
        class466.js5SocketTask = null;
        class369.js5Socket = null;
        js5ConnectState = 0;
        class340.currentPort = PlayerComposition.worldPort == class340.currentPort ? class173.js5Port : PlayerComposition.worldPort;
        if (++js5Errors >= 2 && (n == 7 || n == 9)) {
            if (gameState > 5) {
                field535 = 3000;
            } else {
                this.error("js5connect_full");
                class360.updateGameState(1000);
            }
        } else if (js5Errors >= 2 && n == 6) {
            this.error("js5connect_outofdate");
            class360.updateGameState(1000);
        } else if (js5Errors >= 4) {
            if (gameState > 5) {
                field535 = 3000;
            } else {
                this.error("js5connect");
                class360.updateGameState(1000);
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
    @Export(value="doCycleLoggedOut")
    final void doCycleLoggedOut() {
        AbstractSocket abstractSocket = packetWriter.getSocket();
        PacketBuffer packetBuffer = Client.packetWriter.packetBuffer;
        try {
            int n;
            int n2;
            Object object;
            Object object2;
            if (class68.field479 == VarpDefinition.field2510) {
                if (ReflectionCheck.field228 == null && (field556.isDone() || field501 > 250)) {
                    ReflectionCheck.field228 = field556.get();
                    field556.shutdown();
                    field556 = null;
                }
                if (ReflectionCheck.field228 != null) {
                    if (abstractSocket != null) {
                        abstractSocket.close();
                        abstractSocket = null;
                    }
                    class136.field1587 = null;
                    hadNetworkError = false;
                    field501 = 0;
                    if (field741.method10576()) {
                        if (this.method1441()) {
                            try {
                                this.method1294(class165.field1782);
                                DevicePcmPlayerProvider.method327(class68.field472);
                            }
                            catch (Throwable throwable) {
                                class255.RunException_sendStackTrace(null, throwable);
                                MouseRecorder.getLoginError(65);
                                return;
                            }
                        } else {
                            if (!this.method1418()) {
                                MouseRecorder.getLoginError(65);
                                return;
                            }
                            try {
                                this.method1296(class18.field77, DevicePcmPlayerProvider.field94);
                                DevicePcmPlayerProvider.method327(class68.field490);
                            }
                            catch (Exception exception) {
                                class255.RunException_sendStackTrace(null, exception);
                                MouseRecorder.getLoginError(65);
                                return;
                            }
                        }
                    } else {
                        DevicePcmPlayerProvider.method327(class68.field470);
                    }
                }
            }
            if (VarpDefinition.field2510 == class68.field472) {
                if (this.field551 != null) {
                    if (!this.field551.isDone()) {
                        return;
                    }
                    if (this.field551.isCancelled()) {
                        MouseRecorder.getLoginError(65);
                        this.field551 = null;
                        return;
                    }
                    try {
                        object2 = (RefreshAccessTokenResponse)this.field551.get();
                        if (!object2.isSuccess()) {
                            MouseRecorder.getLoginError(65);
                            this.field551 = null;
                            return;
                        }
                        class431.field4782 = object2.getAccessToken();
                        class165.field1782 = object2.getRefreshToken();
                        this.field551 = null;
                    }
                    catch (Exception exception) {
                        class255.RunException_sendStackTrace(null, exception);
                        MouseRecorder.getLoginError(65);
                        this.field551 = null;
                        return;
                    }
                }
                if (this.field784 == null) {
                    MouseRecorder.getLoginError(65);
                    return;
                }
                if (!this.field784.method267()) {
                    return;
                }
                if (this.field784.method266()) {
                    class255.RunException_sendStackTrace(this.field784.method283(), null);
                    MouseRecorder.getLoginError(65);
                    this.field784 = null;
                    return;
                }
                object2 = this.field784.method273();
                if (((class20)object2).method291() != 200) {
                    MouseRecorder.getLoginError(65);
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
                    class255.RunException_sendStackTrace("Error parsing tokens", exception);
                    MouseRecorder.getLoginError(65);
                    this.field784 = null;
                    return;
                }
                this.method1295(class431.field4782);
                DevicePcmPlayerProvider.method327(class68.field490);
            }
            if (VarpDefinition.field2510 == class68.field490) {
                if (this.field546 != null) {
                    if (!this.field546.isDone()) {
                        return;
                    }
                    if (this.field546.isCancelled()) {
                        MouseRecorder.getLoginError(65);
                        this.field546 = null;
                        return;
                    }
                    try {
                        object2 = (OtlTokenResponse)this.field546.get();
                        if (!object2.isSuccess()) {
                            MouseRecorder.getLoginError(65);
                            this.field546 = null;
                            return;
                        }
                        this.field597 = object2.getToken();
                        this.field546 = null;
                    }
                    catch (Exception exception) {
                        class255.RunException_sendStackTrace(null, exception);
                        MouseRecorder.getLoginError(65);
                        this.field546 = null;
                        return;
                    }
                } else {
                    if (this.field650 == null) {
                        MouseRecorder.getLoginError(65);
                        return;
                    }
                    if (!this.field650.method267()) {
                        return;
                    }
                    if (this.field650.method266()) {
                        class255.RunException_sendStackTrace(this.field650.method283(), null);
                        MouseRecorder.getLoginError(65);
                        this.field650 = null;
                        return;
                    }
                    object2 = this.field650.method273();
                    if (((class20)object2).method291() != 200) {
                        class255.RunException_sendStackTrace("Login authentication error. Response code: " + ((class20)object2).method291() + " " + ((class20)object2).method301() + " Response body: " + ((class20)object2).method294(), null);
                        MouseRecorder.getLoginError(65);
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
                            class255.RunException_sendStackTrace(null, jSONException);
                            MouseRecorder.getLoginError(65);
                            this.field650 = null;
                            return;
                        }
                    } else {
                        this.field597 = ((class20)object2).method294();
                    }
                    this.field650 = null;
                }
                field501 = 0;
                DevicePcmPlayerProvider.method327(class68.field470);
            }
            if (VarpDefinition.field2510 == class68.field470) {
                if (class136.field1587 == null) {
                    class136.field1587 = GameEngine.taskHandler.method4911(FontName.worldHost, class340.currentPort);
                }
                if (class136.field1587.status == 2) {
                    throw new IOException();
                }
                if (class136.field1587.status == 1) {
                    abstractSocket = Skills.method7618((Socket)class136.field1587.result, 40000, 5000);
                    packetWriter.setSocket(abstractSocket);
                    class136.field1587 = null;
                    DevicePcmPlayerProvider.method327(class68.field471);
                }
            }
            if (class68.field471 == VarpDefinition.field2510) {
                packetWriter.clearBuffer();
                object2 = class288.method6320();
                ((PacketBufferNode)object2).packetBuffer.writeByte(class326.field3593.field3590);
                packetWriter.addNode((PacketBufferNode)object2);
                packetWriter.flush();
                packetBuffer.offset = 0;
                DevicePcmPlayerProvider.method327(class68.field478);
            }
            if (class68.field478 == VarpDefinition.field2510) {
                if (class328.pcmPlayer1 != null) {
                    class328.pcmPlayer1.method807();
                }
                if (abstractSocket.isAvailable(1)) {
                    n2 = abstractSocket.vmethod9406();
                    if (class328.pcmPlayer1 != null) {
                        class328.pcmPlayer1.method807();
                    }
                    if (n2 != 0) {
                        MouseRecorder.getLoginError(n2);
                        return;
                    }
                    packetBuffer.offset = 0;
                    DevicePcmPlayerProvider.method327(class68.field491);
                }
            }
            if (class68.field491 == VarpDefinition.field2510) {
                if (packetBuffer.offset < 8) {
                    n2 = abstractSocket.vmethod9408();
                    if (n2 > 8 - packetBuffer.offset) {
                        n2 = 8 - packetBuffer.offset;
                    }
                    if (n2 > 0) {
                        abstractSocket.read(packetBuffer.array, packetBuffer.offset, n2);
                        packetBuffer.offset += n2;
                    }
                }
                if (packetBuffer.offset == 8) {
                    packetBuffer.offset = 0;
                    WorldMapRegion.field3124 = packetBuffer.readLong();
                    DevicePcmPlayerProvider.method327(class68.field473);
                }
            }
            if (class68.field473 == VarpDefinition.field2510) {
                int n3;
                Client.packetWriter.packetBuffer.offset = 0;
                packetWriter.clearBuffer();
                object2 = new PacketBuffer(500);
                int[] nArray = new int[]{ReflectionCheck.field228.nextInt(), ReflectionCheck.field228.nextInt(), ReflectionCheck.field228.nextInt(), ReflectionCheck.field228.nextInt()};
                ((Buffer)object2).offset = 0;
                ((Buffer)object2).writeByte(1);
                ((Buffer)object2).method10268(nArray[0]);
                ((Buffer)object2).method10268(nArray[1]);
                ((Buffer)object2).method10268(nArray[2]);
                ((Buffer)object2).method10268(nArray[3]);
                ((Buffer)object2).writeLong(WorldMapRegion.field3124);
                if (gameState == 40) {
                    ((Buffer)object2).method10268(field563[0]);
                    ((Buffer)object2).method10268(field563[1]);
                    ((Buffer)object2).method10268(field563[2]);
                    ((Buffer)object2).method10268(field563[3]);
                } else {
                    if (gameState == 50) {
                        ((Buffer)object2).writeByte(class146.field1663.rsOrdinal());
                        ((Buffer)object2).method10268(UserComparator4.field1481);
                    } else {
                        ((Buffer)object2).writeByte(field629.rsOrdinal());
                        switch (Client.field629.field1665) {
                            case 1: {
                                ((Buffer)object2).method10268(class544.clientPreferences.method2909(Login.Login_username));
                                break;
                            }
                            case 2: 
                            case 4: {
                                ((Buffer)object2).method10267(class326.field3592);
                                ++((Buffer)object2).offset;
                                break;
                            }
                            case 3: {
                                ((Buffer)object2).offset += 4;
                                break;
                            }
                        }
                    }
                    if (field741.method10576()) {
                        ((Buffer)object2).writeByte(class561.field5525.rsOrdinal());
                        ((Buffer)object2).writeStringCp1252NullTerminated(this.field597);
                    } else {
                        ((Buffer)object2).writeByte(class561.field5530.rsOrdinal());
                        ((Buffer)object2).writeStringCp1252NullTerminated(Login.Login_password);
                    }
                }
                ((Buffer)object2).encryptRsa(class77.field916, class77.field917);
                field563 = nArray;
                object = class288.method6320();
                ((PacketBufferNode)object).packetBuffer.offset = 0;
                if (gameState == 40) {
                    ((PacketBufferNode)object).packetBuffer.writeByte(class326.field3582.field3590);
                } else {
                    ((PacketBufferNode)object).packetBuffer.writeByte(class326.field3584.field3590);
                }
                ((PacketBufferNode)object).packetBuffer.writeShort(0);
                int n4 = ((PacketBufferNode)object).packetBuffer.offset;
                ((PacketBufferNode)object).packetBuffer.method10268(228);
                ((PacketBufferNode)object).packetBuffer.method10268(1);
                ((PacketBufferNode)object).packetBuffer.writeByte(clientType);
                ((PacketBufferNode)object).packetBuffer.writeByte(field498);
                int n5 = 0;
                ((PacketBufferNode)object).packetBuffer.writeByte(n5);
                ((PacketBufferNode)object).packetBuffer.writeBytes(((Buffer)object2).array, 0, ((Buffer)object2).offset);
                int n6 = ((PacketBufferNode)object).packetBuffer.offset;
                ((PacketBufferNode)object).packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
                ((PacketBufferNode)object).packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
                ((PacketBufferNode)object).packetBuffer.writeShort(BuddyRankComparator.canvasWidth);
                ((PacketBufferNode)object).packetBuffer.writeShort(Huffman.canvasHeight);
                PacketBuffer packetBuffer2 = ((PacketBufferNode)object).packetBuffer;
                if (randomDatData != null) {
                    packetBuffer2.writeBytes(randomDatData, 0, randomDatData.length);
                } else {
                    byte[] byArray;
                    byte[] byArray2 = new byte[24];
                    try {
                        JagexCache.JagexCache_randomDat.seek(0L);
                        JagexCache.JagexCache_randomDat.readFully(byArray2);
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
                    packetBuffer2.writeBytes(byArray3, 0, byArray3.length);
                }
                ((PacketBufferNode)object).packetBuffer.writeStringCp1252NullTerminated(Language.field4674);
                ((PacketBufferNode)object).packetBuffer.method10268(class483.field5046);
                ((PacketBufferNode)object).packetBuffer.writeByte(0);
                Buffer buffer = new Buffer(class437.field4816.method9654());
                class437.field4816.method9653(buffer);
                ((PacketBufferNode)object).packetBuffer.writeBytes(buffer.array, 0, buffer.array.length);
                ((PacketBufferNode)object).packetBuffer.writeByte(clientType);
                ((PacketBufferNode)object).packetBuffer.method10268(0);
                if (class273.field3035) {
                    Strings.method7645((PacketBufferNode)object);
                } else {
                    ((PacketBufferNode)object).packetBuffer.method10268(GraphicsDefaults.field5117.hash);
                    ((PacketBufferNode)object).packetBuffer.method10331(class188.field2104.hash);
                    ((PacketBufferNode)object).packetBuffer.method10333(SoundCache.field291.hash);
                    ((PacketBufferNode)object).packetBuffer.method10268(class59.field398.hash);
                    ((PacketBufferNode)object).packetBuffer.method10268(PcmPlayer.field276.hash);
                    ((PacketBufferNode)object).packetBuffer.method10333(class220.archive13.hash);
                    ((PacketBufferNode)object).packetBuffer.method10333(class167.archive12.hash);
                    ((PacketBufferNode)object).packetBuffer.method10268(SpotAnimationDefinition.field2704.hash);
                    ((PacketBufferNode)object).packetBuffer.method10332(class157.field1718.hash);
                    ((PacketBufferNode)object).packetBuffer.method10332(StructComposition.field2746.hash);
                    ((PacketBufferNode)object).packetBuffer.method10333(class268.archive2.hash);
                    ((PacketBufferNode)object).packetBuffer.method10333(WorldMapSection2.field3102.hash);
                    ((PacketBufferNode)object).packetBuffer.method10268(0);
                    ((PacketBufferNode)object).packetBuffer.method10332(class166.archive10.hash);
                    ((PacketBufferNode)object).packetBuffer.method10268(class137.field1603.hash);
                    ((PacketBufferNode)object).packetBuffer.method10333(class544.field5399.hash);
                    ((PacketBufferNode)object).packetBuffer.method10268(World.field815.hash);
                    ((PacketBufferNode)object).packetBuffer.method10268(ClanSettings.field1762.hash);
                    ((PacketBufferNode)object).packetBuffer.method10333(class221.field2421.hash);
                    ((PacketBufferNode)object).packetBuffer.method10332(FaceNormal.field2120.hash);
                    ((PacketBufferNode)object).packetBuffer.method10268(class68.field494.hash);
                }
                ((PacketBufferNode)object).packetBuffer.xteaEncrypt(nArray, n6, ((PacketBufferNode)object).packetBuffer.offset);
                ((PacketBufferNode)object).packetBuffer.writeLengthShort(((PacketBufferNode)object).packetBuffer.offset - n4);
                packetWriter.addNode((PacketBufferNode)object);
                packetWriter.flush();
                Client.packetWriter.isaacCipher = new IsaacCipher(nArray);
                int[] nArray2 = new int[4];
                for (n3 = 0; n3 < 4; ++n3) {
                    nArray2[n3] = nArray[n3] + 50;
                }
                packetBuffer.newIsaacCipher(nArray2);
                DevicePcmPlayerProvider.method327(class68.field469);
            }
            if (VarpDefinition.field2510 == class68.field469 && abstractSocket.vmethod9408() > 0) {
                n2 = abstractSocket.vmethod9406();
                if (n2 == 61) {
                    n = abstractSocket.vmethod9408();
                    class380.field4145 = n == 1 && abstractSocket.vmethod9406() == 1;
                    DevicePcmPlayerProvider.method327(class68.field473);
                }
                if (n2 == 21 && gameState == 20) {
                    DevicePcmPlayerProvider.method327(class68.field481);
                } else if (n2 == 2) {
                    if (class273.field3035) {
                        DevicePcmPlayerProvider.method327(class68.field492);
                    } else {
                        DevicePcmPlayerProvider.method327(class68.field483);
                    }
                } else if (n2 == 15 && gameState == 40) {
                    Client.packetWriter.field1452 = -1;
                    DevicePcmPlayerProvider.method327(class68.field475);
                } else if (n2 == 64) {
                    DevicePcmPlayerProvider.method327(class68.field487);
                } else if (n2 == 23 && field743 < 1) {
                    ++field743;
                    DevicePcmPlayerProvider.method327(class68.field479);
                } else if (n2 == 29) {
                    DevicePcmPlayerProvider.method327(class68.field495);
                } else {
                    if (n2 != 69) {
                        MouseRecorder.getLoginError(n2);
                        return;
                    }
                    DevicePcmPlayerProvider.method327(class68.field476);
                }
            }
            if (class68.field492 == VarpDefinition.field2510) {
                field765 = true;
                Clock.method5078(class95.field1153);
                class360.updateGameState(0);
            }
            if (VarpDefinition.field2510 == class68.field476 && abstractSocket.vmethod9408() >= 2) {
                abstractSocket.read(packetBuffer.array, 0, 2);
                packetBuffer.offset = 0;
                class18.field79 = packetBuffer.readUnsignedShort();
                DevicePcmPlayerProvider.method327(class68.field477);
            }
            if (VarpDefinition.field2510 == class68.field477 && abstractSocket.vmethod9408() >= class18.field79) {
                packetBuffer.offset = 0;
                abstractSocket.read(packetBuffer.array, packetBuffer.offset, class18.field79);
                object2 = GrandExchangeOfferAgeComparator.method7886()[packetBuffer.readUnsignedByte()];
                try {
                    class3 class32 = class111.method3126((class6)object2);
                    this.field559 = new class7(packetBuffer, class32);
                    DevicePcmPlayerProvider.method327(class68.field489);
                }
                catch (Exception exception) {
                    MouseRecorder.getLoginError(22);
                    return;
                }
            }
            if (VarpDefinition.field2510 == class68.field489 && this.field559.method46()) {
                this.field558 = this.field559.method57();
                this.field559.method47();
                this.field559 = null;
                if (this.field558 == null) {
                    MouseRecorder.getLoginError(22);
                    return;
                }
                packetWriter.clearBuffer();
                object2 = class288.method6320();
                ((PacketBufferNode)object2).packetBuffer.writeByte(class326.field3586.field3590);
                ((PacketBufferNode)object2).packetBuffer.writeShort(this.field558.offset);
                ((PacketBufferNode)object2).packetBuffer.method10478(this.field558);
                packetWriter.addNode((PacketBufferNode)object2);
                packetWriter.flush();
                this.field558 = null;
                DevicePcmPlayerProvider.method327(class68.field469);
            }
            if (class68.field487 == VarpDefinition.field2510 && abstractSocket.vmethod9408() > 0) {
                class30.field134 = abstractSocket.vmethod9406();
                DevicePcmPlayerProvider.method327(class68.field480);
            }
            if (class68.field480 == VarpDefinition.field2510 && abstractSocket.vmethod9408() >= class30.field134) {
                abstractSocket.read(packetBuffer.array, 0, class30.field134);
                packetBuffer.offset = 0;
                DevicePcmPlayerProvider.method327(class68.field469);
            }
            if (class68.field481 == VarpDefinition.field2510 && abstractSocket.vmethod9408() > 0) {
                field613 = (abstractSocket.vmethod9406() + 3) * 60;
                DevicePcmPlayerProvider.method327(class68.field482);
            }
            if (class68.field482 == VarpDefinition.field2510) {
                field501 = 0;
                class150.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field613 / 60 + " seconds.");
                if (--field613 > 0) return;
                DevicePcmPlayerProvider.method327(class68.field479);
                return;
            }
            if (class68.field474 == VarpDefinition.field2510) {
                object2 = class288.method6320();
                ((PacketBufferNode)object2).packetBuffer.writeByte(class326.field3587.field3590);
                ((PacketBufferNode)object2).packetBuffer.writeShort(class326.field3587.field3591);
                Calendar.method7597((PacketBufferNode)object2);
                packetWriter.addNode((PacketBufferNode)object2);
                packetWriter.flush();
                DevicePcmPlayerProvider.method327(class68.field483);
                return;
            }
            if (VarpDefinition.field2510 == class68.field483 && abstractSocket.vmethod9408() >= 1) {
                UserComparator3.field1506 = abstractSocket.vmethod9406();
                if (UserComparator3.field1506 != class326.field3588.field3591) {
                    MouseRecorder.getLoginError(UserComparator3.field1506);
                    return;
                }
                DevicePcmPlayerProvider.method327(class68.field484);
            }
            if (class68.field484 == VarpDefinition.field2510 && abstractSocket.vmethod9408() >= UserComparator3.field1506) {
                n2 = abstractSocket.vmethod9406() == 1 ? 1 : 0;
                abstractSocket.read(packetBuffer.array, 0, 4);
                packetBuffer.offset = 0;
                n = 0;
                if (n2 != 0) {
                    n = packetBuffer.readByteIsaac() << 24;
                    n |= packetBuffer.readByteIsaac() << 16;
                    n |= packetBuffer.readByteIsaac() << 8;
                    class544.clientPreferences.method2907(Login.Login_username, n |= packetBuffer.readByteIsaac());
                }
                if (Login_isUsernameRemembered) {
                    class544.clientPreferences.method2901(Login.Login_username);
                } else {
                    class544.clientPreferences.method2901(null);
                }
                Projectile.savePreferences();
                staffModLevel = abstractSocket.vmethod9406();
                playerMod = abstractSocket.vmethod9406() == 1;
                field623 = abstractSocket.vmethod9406();
                field623 <<= 8;
                field623 += abstractSocket.vmethod9406();
                field628 = abstractSocket.vmethod9406();
                abstractSocket.read(packetBuffer.array, 0, 8);
                packetBuffer.offset = 0;
                this.field691 = packetBuffer.readLong();
                abstractSocket.read(packetBuffer.array, 0, 8);
                packetBuffer.offset = 0;
                field736 = packetBuffer.readLong();
                abstractSocket.read(packetBuffer.array, 0, 8);
                packetBuffer.offset = 0;
                field630 = packetBuffer.readLong();
                class143.method3517().method4977(this.field547);
                DevicePcmPlayerProvider.method327(class68.field493);
            }
            if (class68.field493 == VarpDefinition.field2510 && abstractSocket.vmethod9408() >= Client.packetWriter.field1452) {
                abstractSocket.read(packetBuffer.array, 0, 1);
                packetBuffer.offset = 0;
                if (packetBuffer.method10224()) {
                    abstractSocket.read(packetBuffer.array, 1, 1);
                    packetBuffer.offset = 0;
                }
                object2 = WorldMapData_0.method5975();
                n = packetBuffer.readSmartByteShortIsaac();
                if (n < 0) throw new IOException("Invalid ServerProt: " + n + " at " + packetBuffer.offset);
                if (n >= ((ServerPacket[])object2).length) {
                    throw new IOException("Invalid ServerProt: " + n + " at " + packetBuffer.offset);
                }
                Client.packetWriter.serverPacket = object2[n];
                Client.packetWriter.field1452 = Client.packetWriter.serverPacket.length;
                abstractSocket.read(packetBuffer.array, 0, 2);
                packetBuffer.offset = 0;
                Client.packetWriter.field1452 = packetBuffer.readUnsignedShort();
                try {
                    object = client;
                    JSObject.getWindow((Applet)object).call("zap", null);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                DevicePcmPlayerProvider.method327(class68.field486);
            }
            if (class68.field486 == VarpDefinition.field2510) {
                if (abstractSocket.vmethod9408() < Client.packetWriter.field1452) return;
                packetBuffer.offset = 0;
                abstractSocket.read(packetBuffer.array, 0, Client.packetWriter.field1452);
                timer.method8940();
                ScriptFrame.method1230();
                field673.method3131(packetBuffer);
                class53.field339 = ModeWhere.localPlayer;
                class14.field62 = -1;
                FriendSystem.loadRegions(false, packetBuffer);
                Client.packetWriter.serverPacket = null;
                field511 = false;
                return;
            }
            if (class68.field495 == VarpDefinition.field2510 && abstractSocket.vmethod9408() >= 2) {
                packetBuffer.offset = 0;
                abstractSocket.read(packetBuffer.array, 0, 2);
                packetBuffer.offset = 0;
                class298.field3239 = packetBuffer.readUnsignedShort();
                DevicePcmPlayerProvider.method327(class68.field488);
            }
            if (class68.field488 == VarpDefinition.field2510 && abstractSocket.vmethod9408() >= class298.field3239) {
                packetBuffer.offset = 0;
                abstractSocket.read(packetBuffer.array, 0, class298.field3239);
                packetBuffer.offset = 0;
                object2 = packetBuffer.readStringCp1252NullTerminated();
                String string = packetBuffer.readStringCp1252NullTerminated();
                object = packetBuffer.readStringCp1252NullTerminated();
                class150.setLoginResponseString((String)object2, string, (String)object);
                class360.updateGameState(10);
                if (field741.method10576()) {
                    Varcs.method3212(9);
                }
            }
            if (VarpDefinition.field2510 == class68.field475) {
                if (Client.packetWriter.field1452 == -1) {
                    if (abstractSocket.vmethod9408() < 2) {
                        return;
                    }
                    abstractSocket.read(packetBuffer.array, 0, 2);
                    packetBuffer.offset = 0;
                    Client.packetWriter.field1452 = packetBuffer.readUnsignedShort();
                }
                if (abstractSocket.vmethod9408() < Client.packetWriter.field1452) {
                    return;
                }
                abstractSocket.read(packetBuffer.array, 0, Client.packetWriter.field1452);
                packetBuffer.offset = 0;
                n2 = Client.packetWriter.field1452;
                timer.method8942();
                AbstractArchive.method7820();
                field673.method3131(packetBuffer);
                if (n2 == packetBuffer.offset) return;
                throw new RuntimeException();
            }
            if (++field501 <= 2000) return;
            if (field743 >= 1) {
                MouseRecorder.getLoginError(-3);
                return;
            }
            class340.currentPort = class340.currentPort == PlayerComposition.worldPort ? class173.js5Port : PlayerComposition.worldPort;
            ++field743;
            DevicePcmPlayerProvider.method327(class68.field479);
            return;
        }
        catch (IOException iOException) {
            if (field743 >= 1) {
                MouseRecorder.getLoginError(-2);
                return;
            }
            class340.currentPort = PlayerComposition.worldPort == class340.currentPort ? class173.js5Port : PlayerComposition.worldPort;
            ++field743;
            DevicePcmPlayerProvider.method327(class68.field479);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="hr")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1454298274")
    @Export(value="doCycleLoggedIn")
    final void doCycleLoggedIn() {
        Object object;
        Object object22;
        Node node;
        Object object32;
        Node node2;
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
        if (rebootTimer > 1) {
            --rebootTimer;
        }
        if (logoutTimer > 0) {
            --logoutTimer;
        }
        if (hadNetworkError) {
            hadNetworkError = false;
            MenuAction.method2363();
            return;
        }
        if (!isMenuOpen) {
            ClientPreferences.method2990();
        }
        this.method1312();
        if (gameState != 30) {
            return;
        }
        while (bl = (object52 = (ReflectionCheck)class36.reflectionChecks.last()) != null) {
            object52 = ScriptEvent.getPacketBufferNode(ClientPacket.field3328, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)object52).packetBuffer.writeByte(0);
            n7 = ((PacketBufferNode)object52).packetBuffer.offset;
            BufferedNetSocket.performReflectionCheck(((PacketBufferNode)object52).packetBuffer);
            ((PacketBufferNode)object52).packetBuffer.method10279(((PacketBufferNode)object52).packetBuffer.offset - n7);
            packetWriter.addNode((PacketBufferNode)object52);
        }
        if (Client.timer.field4907) {
            object4 = ScriptEvent.getPacketBufferNode(ClientPacket.field3319, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)object4).packetBuffer.writeByte(0);
            n6 = ((PacketBufferNode)object4).packetBuffer.offset;
            timer.write(((PacketBufferNode)object4).packetBuffer);
            ((PacketBufferNode)object4).packetBuffer.method10279(((PacketBufferNode)object4).packetBuffer.offset - n6);
            packetWriter.addNode((PacketBufferNode)object4);
            timer.method8964();
        }
        object4 = class168.field1794.lock;
        synchronized (object4) {
            if (field497) {
                if (MouseHandler.MouseHandler_lastButton != 0 || class168.field1794.index >= 40) {
                    object52 = null;
                    n7 = 0;
                    n5 = 0;
                    n4 = 0;
                    n3 = 0;
                    for (n2 = 0; n2 < class168.field1794.index && (object52 == null || ((PacketBufferNode)object52).packetBuffer.offset - n7 < 246); ++n2) {
                        int n8;
                        int n9;
                        int n10;
                        n5 = n2;
                        n = class168.field1794.ys[n2];
                        if (n < -1) {
                            n = -1;
                        } else if (n > 65534) {
                            n = 65534;
                        }
                        int n11 = class168.field1794.xs[n2];
                        if (n11 < -1) {
                            n11 = -1;
                        } else if (n11 > 65534) {
                            n11 = 65534;
                        }
                        if (n11 == field517 && n == field518) continue;
                        if (object52 == null) {
                            object52 = ScriptEvent.getPacketBufferNode(ClientPacket.field3320, Client.packetWriter.isaacCipher);
                            ((PacketBufferNode)object52).packetBuffer.writeByte(0);
                            n7 = ((PacketBufferNode)object52).packetBuffer.offset;
                            ((PacketBufferNode)object52).packetBuffer.offset += 2;
                            n4 = 0;
                            n3 = 0;
                        }
                        if (-1L != field557) {
                            n10 = n11 - field517;
                            n9 = n - field518;
                            n8 = (int)((class168.field1794.millis[n2] - field557) / 20L);
                            n4 = (int)((long)n4 + (class168.field1794.millis[n2] - field557) % 20L);
                        } else {
                            n10 = n11;
                            n9 = n;
                            n8 = Integer.MAX_VALUE;
                        }
                        field517 = n11;
                        field518 = n;
                        if (n8 < 8 && n10 >= -32 && n10 <= 31 && n9 >= -32 && n9 <= 31) {
                            ((PacketBufferNode)object52).packetBuffer.writeShort((n8 << 12) + (n9 += 32) + ((n10 += 32) << 6));
                        } else if (n8 < 32 && n10 >= -128 && n10 <= 127 && n9 >= -128 && n9 <= 127) {
                            ((PacketBufferNode)object52).packetBuffer.writeByte(n8 + 128);
                            ((PacketBufferNode)object52).packetBuffer.writeShort((n9 += 128) + ((n10 += 128) << 8));
                        } else if (n8 < 32) {
                            ((PacketBufferNode)object52).packetBuffer.writeByte(n8 + 192);
                            if (n11 == -1 || n == -1) {
                                ((PacketBufferNode)object52).packetBuffer.method10268(Integer.MIN_VALUE);
                            } else {
                                ((PacketBufferNode)object52).packetBuffer.method10268(n11 | n << 16);
                            }
                        } else {
                            ((PacketBufferNode)object52).packetBuffer.writeShort((n8 & 0x1FFF) + 57344);
                            if (n11 == -1 || n == -1) {
                                ((PacketBufferNode)object52).packetBuffer.method10268(Integer.MIN_VALUE);
                            } else {
                                ((PacketBufferNode)object52).packetBuffer.method10268(n11 | n << 16);
                            }
                        }
                        ++n3;
                        field557 = class168.field1794.millis[n2];
                    }
                    if (object52 != null) {
                        ((PacketBufferNode)object52).packetBuffer.method10279(((PacketBufferNode)object52).packetBuffer.offset - n7);
                        n2 = ((PacketBufferNode)object52).packetBuffer.offset;
                        ((PacketBufferNode)object52).packetBuffer.offset = n7;
                        ((PacketBufferNode)object52).packetBuffer.writeByte(n4 / n3);
                        ((PacketBufferNode)object52).packetBuffer.writeByte(n4 % n3);
                        ((PacketBufferNode)object52).packetBuffer.offset = n2;
                        packetWriter.addNode((PacketBufferNode)object52);
                    }
                    if (n5 >= class168.field1794.index) {
                        class168.field1794.index = 0;
                    } else {
                        class168.field1794.index -= n5;
                        System.arraycopy(class168.field1794.xs, n5, class168.field1794.xs, 0, class168.field1794.index);
                        System.arraycopy(class168.field1794.ys, n5, class168.field1794.ys, 0, class168.field1794.index);
                        System.arraycopy(class168.field1794.millis, n5, class168.field1794.millis, 0, class168.field1794.index);
                    }
                }
            } else {
                class168.field1794.index = 0;
            }
        }
        if (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
            long l = MouseHandler.MouseHandler_lastPressedTimeMillis - field787 * -1L;
            if (l > 32767L) {
                l = 32767L;
            }
            field787 = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
            n7 = MouseHandler.MouseHandler_lastPressedY;
            if (n7 < 0) {
                n7 = 0;
            } else if (n7 > Huffman.canvasHeight) {
                n7 = Huffman.canvasHeight;
            }
            n5 = MouseHandler.MouseHandler_lastPressedX;
            if (n5 < 0) {
                n5 = 0;
            } else if (n5 > BuddyRankComparator.canvasWidth) {
                n5 = BuddyRankComparator.canvasWidth;
            }
            n4 = (int)l;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3414, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (n4 << 1));
            ((PacketBufferNode)node2).packetBuffer.writeShort(n5);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n7);
            packetWriter.addNode((PacketBufferNode)node2);
        }
        if (mouseWheelRotation != 0) {
            object4 = ScriptEvent.getPacketBufferNode(ClientPacket.field3388, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)object4).packetBuffer.writeShort(mouseWheelRotation);
            packetWriter.addNode((PacketBufferNode)object4);
        }
        if (Client.field731.field2979 > 0) {
            object4 = ScriptEvent.getPacketBufferNode(ClientPacket.field3354, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)object4).packetBuffer.writeShort(0);
            n6 = ((PacketBufferNode)object4).packetBuffer.offset;
            long l = ReflectionCheck.method724();
            for (n4 = 0; n4 < Client.field731.field2979; ++n4) {
                long l2 = l - field740;
                if (l2 > 0xFFFFFFL) {
                    l2 = 0xFFFFFFL;
                }
                field740 = l;
                ((PacketBufferNode)object4).packetBuffer.method10310(Client.field731.field2984[n4]);
                ((PacketBufferNode)object4).packetBuffer.method10327((int)l2);
            }
            ((PacketBufferNode)object4).packetBuffer.writeLengthShort(((PacketBufferNode)object4).packetBuffer.offset - n6);
            packetWriter.addNode((PacketBufferNode)object4);
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
            object4 = ScriptEvent.getPacketBufferNode(ClientPacket.field3367, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)object4).packetBuffer.writeInt(camAngleY);
            ((PacketBufferNode)object4).packetBuffer.writeInt(camAngleX);
            packetWriter.addNode((PacketBufferNode)object4);
        }
        if (SecureRandomFuture.hasFocus && !field520) {
            field520 = true;
            object4 = ScriptEvent.getPacketBufferNode(ClientPacket.field3418, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)object4).packetBuffer.writeByte(1);
            packetWriter.addNode((PacketBufferNode)object4);
        }
        if (!SecureRandomFuture.hasFocus && field520) {
            field520 = false;
            object4 = ScriptEvent.getPacketBufferNode(ClientPacket.field3418, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)object4).packetBuffer.writeByte(0);
            packetWriter.addNode((PacketBufferNode)object4);
        }
        if (class420.worldMap != null) {
            class420.worldMap.method9720();
        }
        class346.method6950();
        if (class20.field91) {
            class450.method8884();
            class20.field91 = false;
        }
        if (field739 != GameEngine.field189.field1321) {
            field739 = GameEngine.field189.field1321;
            Archive.method7701(GameEngine.field189.field1321);
        }
        if (gameState != 30) {
            return;
        }
        for (Object object52 : field508) {
            object32 = (PendingSpawn)((class103)object52).field1333.last();
            while (object32 != null) {
                block122: {
                    block123: {
                        block120: {
                            block121: {
                                if (((PendingSpawn)object32).field1186 > 0) {
                                    --((PendingSpawn)object32).field1186;
                                }
                                if (((PendingSpawn)object32).field1186 != 0) break block120;
                                if (((PendingSpawn)object32).field1181 < 0) break block121;
                                n4 = ((PendingSpawn)object32).field1181;
                                n3 = ((PendingSpawn)object32).field1179;
                                node = class142.getObjectDefinition(n4);
                                if (n3 == 11) {
                                    n3 = 10;
                                }
                                if (n3 >= 5 && n3 <= 8) {
                                    n3 = 4;
                                }
                                if ((n5 = (int)(node.method5510(n3) ? 1 : 0)) == 0) break block122;
                            }
                            class168.method3819((class103)object52, ((PendingSpawn)object32).field1188, ((PendingSpawn)object32).field1180, ((PendingSpawn)object32).field1187, ((PendingSpawn)object32).field1182, ((PendingSpawn)object32).field1181, ((PendingSpawn)object32).field1184, ((PendingSpawn)object32).field1179, ((PendingSpawn)object32).field1189);
                            ((Node)object32).remove();
                            break block122;
                        }
                        if (((PendingSpawn)object32).field1183 > 0) {
                            --((PendingSpawn)object32).field1183;
                        }
                        if (((PendingSpawn)object32).field1183 != 0 || ((PendingSpawn)object32).field1187 < 1 || ((PendingSpawn)object32).field1182 < 1 || ((PendingSpawn)object32).field1187 > 102 || ((PendingSpawn)object32).field1182 > 102) break block122;
                        if (((PendingSpawn)object32).field1192 < 0) break block123;
                        n4 = ((PendingSpawn)object32).field1192;
                        n3 = ((PendingSpawn)object32).field1194;
                        node = class142.getObjectDefinition(n4);
                        if (n3 == 11) {
                            n3 = 10;
                        }
                        if (n3 >= 5 && n3 <= 8) {
                            n3 = 4;
                        }
                        if ((n5 = (int)(node.method5510(n3) ? 1 : 0)) == 0) break block122;
                    }
                    class168.method3819((class103)object52, ((PendingSpawn)object32).field1188, ((PendingSpawn)object32).field1180, ((PendingSpawn)object32).field1187, ((PendingSpawn)object32).field1182, ((PendingSpawn)object32).field1192, ((PendingSpawn)object32).field1185, ((PendingSpawn)object32).field1194, ((PendingSpawn)object32).field1189);
                    ((PendingSpawn)object32).field1183 = -1;
                    if (((PendingSpawn)object32).field1192 == ((PendingSpawn)object32).field1181 && ((PendingSpawn)object32).field1181 == -1) {
                        ((Node)object32).remove();
                    } else if (((PendingSpawn)object32).field1181 == ((PendingSpawn)object32).field1192 && ((PendingSpawn)object32).field1184 == ((PendingSpawn)object32).field1185 && ((PendingSpawn)object32).field1179 == ((PendingSpawn)object32).field1194) {
                        ((Node)object32).remove();
                    }
                }
                object32 = (PendingSpawn)((class103)object52).field1333.previous();
            }
        }
        class481.method9355();
        ++Client.packetWriter.field1454;
        if (Client.packetWriter.field1454 > 750) {
            MenuAction.method2363();
            return;
        }
        class257.method5425();
        class82.method2491();
        for (Object object52 : field508) {
            for (n7 = 0; n7 < ((class103)object52).field1334; ++n7) {
                n5 = ((class103)object52).field1335[n7];
                object22 = ((class103)object52).field1318[n5];
                if (object22 == null) continue;
                ((class480)object22).method9301(cycle);
            }
        }
        object4 = Client.field673.field1412;
        for (Object object32 : field508) {
            for (n5 = 0; n5 < Client.field673.field1406; ++n5) {
                object22 = ((class103)object32).field1329[object4[n5]];
                if (object22 == null || ((Actor)object22).field1219 <= 0) continue;
                --((Actor)object22).field1219;
                if (((Actor)object22).field1219 != 0) continue;
                ((Actor)object22).field1216 = null;
            }
            for (n5 = 0; n5 < ((class103)object32).field1331; ++n5) {
                n4 = ((class103)object32).field1332[n5];
                node2 = ((class103)object32).field1330[n4];
                if (node2 == null || ((Actor)node2).field1219 <= 0) continue;
                --((Actor)node2).field1219;
                if (((Actor)node2).field1219 != 0) continue;
                ((Actor)node2).field1216 = null;
            }
        }
        ++field581;
        if (field603 != 0 && (field622 = field622 * 400 + 20) * 400 >= 400) {
            field603 = 0;
        }
        object4 = class424.mousedOverWidgetIf1;
        object52 = HealthBar.field1346;
        class424.mousedOverWidgetIf1 = null;
        HealthBar.field1346 = null;
        draggedOnWidget = null;
        field683 = false;
        field523 = false;
        field733 = 0;
        while (field731.method5772() && field733 < 128) {
            if (staffModLevel >= 2 && field731.method5776(82) && Client.field731.field2989 == 66) {
                object = new StringBuilder();
                object22 = Messages.Messages_hashTable.iterator();
                while (object22.hasNext()) {
                    node2 = (Message)object22.next();
                    if (((Message)node2).sender != null && !((Message)node2).sender.isEmpty()) {
                        ((StringBuilder)object).append(((Message)node2).sender).append(':');
                    }
                    ((StringBuilder)object).append(((Message)node2).text).append('\n');
                }
                object = object32 = ((StringBuilder)object).toString();
                client.method529((String)object);
                continue;
            }
            if (titleLoadingStage == 1 && Client.field731.field2975 > '\u0000') continue;
            Client.field735[Client.field733] = Client.field731.field2989;
            Client.field589[Client.field733] = Client.field731.field2975;
            ++field733;
        }
        if (class30.method480() && field731.method5776(82) && field731.method5776(81) && mouseWheelRotation != 0) {
            n7 = ModeWhere.localPlayer.plane - mouseWheelRotation;
            if (n7 < 0) {
                n7 = 0;
            } else if (n7 > 3) {
                n7 = 3;
            }
            if (n7 != ModeWhere.localPlayer.plane) {
                n5 = ModeWhere.localPlayer.field1266[0] + GameEngine.field189.field1324;
                n4 = ModeWhere.localPlayer.field1221[0] + GameEngine.field189.field1325;
                node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3368, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node2).packetBuffer.writeInt(n5);
                ((PacketBufferNode)node2).packetBuffer.method10320(n4);
                ((PacketBufferNode)node2).packetBuffer.method10332(0);
                ((PacketBufferNode)node2).packetBuffer.method10310(n7);
                packetWriter.addNode((PacketBufferNode)node2);
            }
            mouseWheelRotation = 0;
        }
        if (rootInterface != -1) {
            DirectByteArrayCopier.updateRootInterface(rootInterface, 0, 0, BuddyRankComparator.canvasWidth, Huffman.canvasHeight, 0, 0);
        }
        ++cycleCntr;
        while ((object32 = (ScriptEvent)field666.removeLast()) != null) {
            object = ((ScriptEvent)object32).widget;
            if (((Widget)object).childIndex >= 0 && ((object22 = ClanChannel.field1807.method7031(((Widget)object).parentId)) == null || ((Widget)object22).children == null || ((Widget)object).childIndex >= ((Widget)object22).children.length || object != ((Widget)object22).children[((Widget)object).childIndex])) continue;
            Friend.runScriptEvent((ScriptEvent)object32);
        }
        while ((object32 = (ScriptEvent)field708.removeLast()) != null) {
            object = ((ScriptEvent)object32).widget;
            if (((Widget)object).childIndex >= 0 && ((object22 = ClanChannel.field1807.method7031(((Widget)object).parentId)) == null || ((Widget)object22).children == null || ((Widget)object).childIndex >= ((Widget)object22).children.length || object != ((Widget)object22).children[((Widget)object).childIndex])) continue;
            Friend.runScriptEvent((ScriptEvent)object32);
        }
        while ((object32 = (ScriptEvent)scriptEvents.removeLast()) != null) {
            object = ((ScriptEvent)object32).widget;
            if (((Widget)object).childIndex >= 0 && ((object22 = ClanChannel.field1807.method7031(((Widget)object).parentId)) == null || ((Widget)object22).children == null || ((Widget)object).childIndex >= ((Widget)object22).children.length || object != ((Widget)object22).children[((Widget)object).childIndex])) continue;
            Friend.runScriptEvent((ScriptEvent)object32);
        }
        n7 = 0;
        while ((object = (class268)field709.removeLast()) != null) {
            if (((class268)object).field2971.type == 12) {
                n7 = 1;
            }
            WorldMapEvent.method6537((class268)object);
        }
        if (n7 == 0 && MouseHandler.MouseHandler_lastButton == 1) {
            field575.method5738();
        }
        this.menu();
        if (class420.worldMap != null) {
            class420.worldMap.method9730(GameEngine.field189.field1321, (class53.field339.vmethod9352() >> 7) + GameEngine.field189.field1324, (class53.field339.vmethod9331() >> 7) + GameEngine.field189.field1325, false);
            class420.worldMap.loadCache();
        }
        if (clickedWidget != null) {
            this.method1561();
        }
        for (Object object22 : field508) {
            node2 = ((class103)object22).field1319;
            if (!((class187)node2).method4423()) continue;
            n2 = ((class187)node2).field2053;
            n = ((class187)node2).field2054;
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3398, Client.packetWriter.isaacCipher);
            packetBufferNode.packetBuffer.writeByte(5);
            packetBufferNode.packetBuffer.writeByte(field731.method5776(82) ? (field731.method5776(81) ? 2 : 1) : 0);
            packetBufferNode.packetBuffer.writeShort(n + ((class103)object22).field1325);
            packetBufferNode.packetBuffer.writeInt(n2 + ((class103)object22).field1324);
            packetWriter.addNode(packetBufferNode);
            field620 = MouseHandler.MouseHandler_lastPressedX;
            field717 = MouseHandler.MouseHandler_lastPressedY;
            field603 = 1;
            field622 = 0;
            field744 = n2;
            field745 = n;
            ((class187)node2).method4411();
        }
        if (object4 != class424.mousedOverWidgetIf1) {
            if (object4 != null) {
                UserComparator8.invalidateWidget((Widget)object4);
            }
            if (class424.mousedOverWidgetIf1 != null) {
                UserComparator8.invalidateWidget(class424.mousedOverWidgetIf1);
            }
        }
        if (object52 != HealthBar.field1346 && field654 == field655) {
            if (object52 != null) {
                UserComparator8.invalidateWidget((Widget)object52);
            }
            if (HealthBar.field1346 != null) {
                UserComparator8.invalidateWidget(HealthBar.field1346);
            }
        }
        if (HealthBar.field1346 != null) {
            if (field654 < field655 && field655 == ++field654) {
                UserComparator8.invalidateWidget(HealthBar.field1346);
            }
        } else if (field654 > 0) {
            --field654;
        }
        Canvas.load();
        if (field762) {
            class92.method2645();
        } else if (isCameraLocked) {
            class145.method3555();
        }
        n5 = 0;
        while (n5 < 5) {
            int n12 = n5++;
            field705[n12] = field705[n12] + 1;
        }
        class19.varcs.tryWrite();
        n5 = SceneTilePaint.method4708();
        n3 = n4 = GameEngine.keyHandler.method362();
        if (n5 > 15000 && n3 > 15000) {
            logoutTimer = 250;
            MouseHandler.MouseHandler_idleCycles = 14500;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3401, Client.packetWriter.isaacCipher);
            packetWriter.addNode((PacketBufferNode)node);
        }
        class10.friendSystem.processFriendUpdates();
        for (n2 = 0; n2 < field792.size(); ++n2) {
            if (class166.method3808((Integer)field792.get(n2)) == 2) continue;
            field792.remove(n2);
            --n2;
        }
        ++Client.packetWriter.pendingWrites;
        if (Client.packetWriter.pendingWrites > 50) {
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3382, Client.packetWriter.isaacCipher);
            packetWriter.addNode((PacketBufferNode)node);
        }
        try {
            packetWriter.flush();
        }
        catch (IOException iOException) {
            MenuAction.method2363();
        }
        class143.method3517().method4982();
    }

    @Override
    @ObfuscatedName(value="hw")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="-81")
    public void vmethod6894(int n, int n2) {
        if (packetWriter != null && Client.packetWriter.isaacCipher != null) {
            if (n > -1 && class544.clientPreferences.method2896() > 0 && !playingJingle) {
                PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3381, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n);
                packetWriter.addNode(packetBufferNode);
            }
            return;
        }
    }

    @ObfuscatedName(value="id")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-15")
    @Export(value="resizeJS")
    void resizeJS() {
        int n = BuddyRankComparator.canvasWidth;
        int n2 = Huffman.canvasHeight;
        if (this.contentWidth < n) {
            n = this.contentWidth;
        }
        if (this.contentHeight < n2) {
            n2 = this.contentHeight;
        }
        if (class544.clientPreferences != null) {
            try {
                class26.method402(client, "resize", new Object[]{TextureProvider.getWindowedMode()});
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
    @Export(value="drawLoggedIn")
    final void drawLoggedIn() {
        Object object;
        int n;
        int n2;
        int n3;
        int n4;
        block25: {
            if (rootInterface != -1) {
                class9.method83(rootInterface);
            }
            n4 = 0;
            while (true) {
                block27: {
                    block28: {
                        block30: {
                            block31: {
                                block29: {
                                    block26: {
                                        if (n4 >= rootWidgetCount) break block26;
                                        if (!field713[n4]) break block27;
                                        break block28;
                                    }
                                    field619 = cycle;
                                    viewportX = -1;
                                    viewportY = -1;
                                    if (rootInterface != -1) {
                                        rootWidgetCount = 0;
                                        Renderable.method4459(rootInterface, 0, 0, BuddyRankComparator.canvasWidth, Huffman.canvasHeight, 0, 0, -1);
                                    }
                                    Rasterizer2D.Rasterizer2D_resetClip();
                                    if (showMouseCross) {
                                        if (field603 == 1) {
                                            ArchiveLoader.field1054[field622 * 400 / 100].drawTransBgAt(field620 - 8, field717 - 8);
                                        }
                                        if (field603 == 2) {
                                            ArchiveLoader.field1054[field622 * 400 / 100 + 4].drawTransBgAt(field620 - 8, field717 - 8);
                                        }
                                    }
                                    if (isMenuOpen) break block29;
                                    if (viewportX == -1) break block30;
                                    break block31;
                                }
                                field648.method10928();
                                break block30;
                            }
                            n4 = viewportX;
                            n3 = viewportY;
                            if ((Client.field648.field5612 >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
                                n = n2 = Client.field648.field5612 - 1;
                                object = isItemSelected == 1 && Client.field648.field5612 < 2 ? "Use" + " " + field570 + " " + "->" : (isSpellSelected && Client.field648.field5612 < 2 ? field661 + " " + field662 + " " + "->" : field648.method10916(n));
                                if (Client.field648.field5612 > 2) {
                                    object = (String)object + class97.colorStartTag(0xFFFFFF) + " " + '/' + " " + (Client.field648.field5612 - 2) + " more options";
                                }
                                GraphicsObject.field892.drawRandomAlphaAndSpacing((String)object, n4 + 4, n3 + 15, 0xFFFFFF, 0, cycle / 1000);
                            }
                        }
                        if (field720 == 3) {
                            break;
                        }
                        break block25;
                    }
                    Client.field732[n4] = true;
                }
                Client.field580[n4] = field713[n4];
                Client.field713[n4] = false;
                ++n4;
            }
            for (n4 = 0; n4 < rootWidgetCount; ++n4) {
                if (field580[n4]) {
                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[n4], rootWidgetYs[n4], rootWidgetWidths[n4], rootWidgetHeights[n4], 0xFF00FF, 128);
                    continue;
                }
                if (!field732[n4]) continue;
                Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[n4], rootWidgetYs[n4], rootWidgetWidths[n4], rootWidgetHeights[n4], 0xFF0000, 128);
            }
        }
        n4 = GameEngine.field189.field1321;
        n3 = ModeWhere.localPlayer.x;
        n2 = ModeWhere.localPlayer.field1196;
        n = field581;
        object = (ObjectSound)ObjectSound.objectSounds.last();
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
                                        if (((ObjectSound)object).soundEffectId == -1 && ((ObjectSound)object).field849 == null) break block32;
                                        int n6 = 0;
                                        if (n3 > ((ObjectSound)object).field838 * 16384) {
                                            n6 += n3 - ((ObjectSound)object).field838 * 16384;
                                        } else if (n3 < ((ObjectSound)object).field837 * 16384) {
                                            n6 += ((ObjectSound)object).field837 * 16384 - n3;
                                        }
                                        if (n2 > ((ObjectSound)object).field839 * 16384) {
                                            n6 += n2 - ((ObjectSound)object).field839 * 16384;
                                        } else if (n2 < ((ObjectSound)object).field834 * 16384) {
                                            n6 += ((ObjectSound)object).field834 * 16384 - n2;
                                        }
                                        n6 = Math.max(n6 - 64, 0);
                                        if (n6 >= ((ObjectSound)object).field840 || class544.clientPreferences.method2900() == 0 || n4 != ((ObjectSound)object).field835) break block33;
                                        float f = ((ObjectSound)object).field841 < ((ObjectSound)object).field840 ? Math.min(Math.max((float)(((ObjectSound)object).field840 - n6) / (float)(((ObjectSound)object).field840 - ((ObjectSound)object).field841), 0.0f), 1.0f) : 1.0f;
                                        n5 = (int)(f * (float)class544.clientPreferences.method2900());
                                        if (((ObjectSound)object).stream1 != null) break block34;
                                        if (((ObjectSound)object).soundEffectId < 0) break block35;
                                        break block36;
                                    }
                                    ((ObjectSound)object).stream1.method914(n5);
                                    break block35;
                                }
                                SoundEffect soundEffect = SoundEffect.readSoundEffect(World.field815, ((ObjectSound)object).soundEffectId, 0);
                                if (soundEffect != null) {
                                    object2 = soundEffect.toRawSound().resample(Message.decimator);
                                    RawPcmStream rawPcmStream = RawPcmStream.createRawPcmStream((RawSound)object2, 100, n5);
                                    rawPcmStream.setNumLoops(-1);
                                    UserList.pcmStreamMixer.addSubStream(rawPcmStream);
                                    ((ObjectSound)object).stream1 = rawPcmStream;
                                }
                            }
                            if (((ObjectSound)object).stream2 != null) break block37;
                            if (((ObjectSound)object).field849 == null) break block32;
                            break block38;
                        }
                        ((ObjectSound)object).stream2.method914(n5);
                        if (!((ObjectSound)object).stream2.hasNext()) {
                            ((ObjectSound)object).stream2 = null;
                        }
                        break block32;
                    }
                    if ((((ObjectSound)object).field847 -= n) <= 0) {
                        int n7 = (int)(Math.random() * (double)((ObjectSound)object).field849.length);
                        object2 = SoundEffect.readSoundEffect(World.field815, ((ObjectSound)object).field849[n7], 0);
                        if (object2 != null) {
                            RawSound rawSound = ((SoundEffect)object2).toRawSound().resample(Message.decimator);
                            RawPcmStream rawPcmStream = RawPcmStream.createRawPcmStream(rawSound, 100, n5);
                            rawPcmStream.setNumLoops(0);
                            UserList.pcmStreamMixer.addSubStream(rawPcmStream);
                            ((ObjectSound)object).stream2 = rawPcmStream;
                            ((ObjectSound)object).field847 = ((ObjectSound)object).field844 + (int)(Math.random() * (double)(((ObjectSound)object).field845 - ((ObjectSound)object).field844));
                        }
                    }
                    break block32;
                }
                if (((ObjectSound)object).stream1 != null) {
                    UserList.pcmStreamMixer.removeSubStream(((ObjectSound)object).stream1);
                    ((ObjectSound)object).stream1 = null;
                }
                if (((ObjectSound)object).stream2 != null) {
                    UserList.pcmStreamMixer.removeSubStream(((ObjectSound)object).stream2);
                    ((ObjectSound)object).stream2 = null;
                }
            }
            object = (ObjectSound)ObjectSound.objectSounds.previous();
        }
    }

    @ObfuscatedName(value="jj")
    @ObfuscatedSignature(descriptor="(Lep;I)Z", garbageValue="-1864848438")
    boolean method1310(PacketWriter packetWriter) {
        if (packetWriter.field1452 != 0) {
            if (WorldMapLabelSize.friendsChat == null) {
                WorldMapLabelSize.friendsChat = new FriendsChat(class383.loginType, client);
            }
            WorldMapLabelSize.friendsChat.method9126(packetWriter.packetBuffer);
        } else {
            WorldMapLabelSize.friendsChat = null;
        }
        field770 = cycleCntr;
        class424.ClanChat_inClanChat = true;
        packetWriter.serverPacket = null;
        return true;
    }

    @ObfuscatedName(value="jk")
    @ObfuscatedSignature(descriptor="(Lep;I)Z", garbageValue="-1023516953")
    boolean method1311(PacketWriter packetWriter) {
        if (WorldMapLabelSize.friendsChat != null) {
            WorldMapLabelSize.friendsChat.method9108(packetWriter.packetBuffer);
        }
        field770 = cycleCntr;
        class424.ClanChat_inClanChat = true;
        packetWriter.serverPacket = null;
        return true;
    }

    @ObfuscatedName(value="jv")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1611945377")
    void method1312() {
        boolean bl = Client.packetWriter.field1456 > 0;
        int n = Client.packetWriter.field1445;
        for (int i = 0; i < 100 || bl; ++i) {
            boolean bl2 = this.method1313(packetWriter);
            if (bl) {
                int n2 = Client.packetWriter.field1445 - n;
                Client.packetWriter.field1456 -= n2;
            }
            if (!bl2) break;
            n = Client.packetWriter.field1445;
            bl = Client.packetWriter.field1456 > 0;
        }
    }

    @ObfuscatedName(value="jg")
    @ObfuscatedSignature(descriptor="(Lep;I)Z", garbageValue="-49175667")
    final boolean method1313(PacketWriter packetWriter) {
        AbstractSocket abstractSocket = packetWriter.getSocket();
        PacketBuffer packetBuffer = packetWriter.packetBuffer;
        if (abstractSocket == null) {
            return false;
        }
        try {
            int n;
            Object object;
            if (packetWriter.field1456 > 0 && !abstractSocket.isAvailable(packetWriter.field1456)) {
                return false;
            }
            if (packetWriter.serverPacket == null) {
                if (packetWriter.field1457) {
                    if (!abstractSocket.isAvailable(1)) {
                        return false;
                    }
                    packetWriter.field1445 += abstractSocket.read(packetWriter.packetBuffer.array, 0, 1);
                    packetWriter.field1454 = 0;
                    packetWriter.field1457 = false;
                }
                packetBuffer.offset = 0;
                if (packetBuffer.method10224()) {
                    if (!abstractSocket.isAvailable(1)) {
                        return false;
                    }
                    packetWriter.field1445 += abstractSocket.read(packetWriter.packetBuffer.array, 1, 1);
                    packetWriter.field1454 = 0;
                }
                packetWriter.field1457 = true;
                object = WorldMapData_0.method5975();
                n = packetBuffer.readSmartByteShortIsaac();
                if (n < 0 || n >= ((ServerPacket[])object).length) {
                    throw new IOException(n + " " + packetBuffer.offset);
                }
                packetWriter.serverPacket = object[n];
                packetWriter.field1452 = packetWriter.serverPacket.length;
            }
            if (packetWriter.field1452 == -1) {
                if (!abstractSocket.isAvailable(1)) {
                    return false;
                }
                packetWriter.field1445 += abstractSocket.read(packetBuffer.array, 0, 1);
                packetWriter.field1452 = packetBuffer.array[0] & 0xFF;
            }
            if (packetWriter.field1452 == -2) {
                if (!abstractSocket.isAvailable(2)) {
                    return false;
                }
                packetWriter.field1445 += abstractSocket.read(packetBuffer.array, 0, 2);
                packetBuffer.offset = 0;
                packetWriter.field1452 = packetBuffer.readUnsignedShort();
            }
            if (!abstractSocket.isAvailable(packetWriter.field1452)) {
                return false;
            }
            packetBuffer.offset = 0;
            packetWriter.field1445 += abstractSocket.read(packetBuffer.array, 0, packetWriter.field1452);
            packetWriter.field1454 = 0;
            timer.method8937();
            packetWriter.field1460 = packetWriter.field1447;
            packetWriter.field1447 = packetWriter.field1458;
            packetWriter.field1458 = packetWriter.serverPacket;
            if (ServerPacket.field3499 == packetWriter.serverPacket) {
                int n2 = packetBuffer.readUShortSmart();
                n = packetBuffer.readUnsignedByte() == 1 ? 1 : 0;
                String string = "";
                boolean bl = false;
                if (n != 0 && class10.friendSystem.isIgnored(new Username(string = packetBuffer.readStringCp1252NullTerminated(), class383.loginType))) {
                    bl = true;
                }
                String string2 = packetBuffer.readStringCp1252NullTerminated();
                if (!bl) {
                    Interpreter.addGameMessage(n2, string, string2);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3468 == packetWriter.serverPacket) {
                int n3 = packetBuffer.readUnsignedByte();
                String string = packetBuffer.readStringCp1252NullTerminated();
                int n4 = packetBuffer.method10312();
                if (n4 >= 1 && n4 <= 8) {
                    if (string.equalsIgnoreCase("null")) {
                        string = null;
                    }
                    Client.field638[n4 - 1] = string;
                    Client.field639[n4 - 1] = n3 == 0;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3550 == packetWriter.serverPacket) {
                int n5 = packetBuffer.readInt();
                n = packetBuffer.method10378();
                Widget widget = ClanChannel.field1807.method7031(n);
                widget.field3924.method7080(n5);
                UserComparator8.invalidateWidget(widget);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3491 == packetWriter.serverPacket) {
                class10.friendSystem.readUpdate(packetBuffer, packetWriter.field1452);
                field697 = cycleCntr;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3470 == packetWriter.serverPacket) {
                byte by = packetBuffer.method10315();
                n = packetBuffer.method10323();
                Varps.Varps_temp[n] = by;
                if (Varps.Varps_main[n] != by) {
                    Varps.Varps_main[n] = by;
                }
                RouteStrategy.changeGameOptions(n);
                Client.field688[++Client.field586 - 1 & 0x1F] = n;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3540 == packetWriter.serverPacket) {
                n = packetBuffer.method10458();
                int n6 = packetBuffer.method10458();
                int n7 = packetBuffer.readUnsignedShort();
                int n8 = packetBuffer.readUnsignedShort();
                class309.method6539(n8, n, n7, n6);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3475 == packetWriter.serverPacket) {
                int n9 = packetBuffer.readInt();
                Widget widget = ClanChannel.field1807.method7031(n9);
                for (int i = 0; i < widget.field3903.length; ++i) {
                    widget.field3903[i] = -1;
                    widget.field3903[i] = 0;
                }
                UserComparator8.invalidateWidget(widget);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3520 == packetWriter.serverPacket) {
                int n10;
                int n11;
                int n12;
                int n13 = packetBuffer.offset + packetWriter.field1452;
                n = packetBuffer.readUnsignedShort();
                if (n == 65535) {
                    n = -1;
                }
                int n14 = packetBuffer.readUnsignedShort();
                if (n != rootInterface) {
                    rootInterface = n;
                    this.resizeRoot(false);
                    class16.method211(rootInterface);
                    WorldMapIcon_0.method6334(rootInterface);
                    for (n12 = 0; n12 < 100; ++n12) {
                        Client.field713[n12] = true;
                    }
                }
                while (n14-- > 0) {
                    n12 = packetBuffer.readInt();
                    n11 = packetBuffer.readUnsignedShort();
                    n10 = packetBuffer.readUnsignedByte();
                    InterfaceParent interfaceParent = (InterfaceParent)interfaceParents.get(n12);
                    if (interfaceParent != null && n11 != interfaceParent.group) {
                        NPCComposition.closeInterface(interfaceParent, true);
                        interfaceParent = null;
                    }
                    if (interfaceParent == null) {
                        interfaceParent = class6.method41(n12, n11, n10);
                    }
                    interfaceParent.field1071 = true;
                }
                InterfaceParent interfaceParent = (InterfaceParent)interfaceParents.first();
                while (interfaceParent != null) {
                    if (interfaceParent.field1071) {
                        interfaceParent.field1071 = false;
                    } else {
                        NPCComposition.closeInterface(interfaceParent, true);
                    }
                    interfaceParent = (InterfaceParent)interfaceParents.next();
                }
                widgetFlags = new NodeHashTable(512);
                while (packetBuffer.offset < n13) {
                    n12 = packetBuffer.readInt();
                    n11 = packetBuffer.readUnsignedShort();
                    n10 = packetBuffer.readUnsignedShort();
                    int n15 = packetBuffer.readInt();
                    for (int i = n11; i <= n10; ++i) {
                        long l = (long)i + ((long)n12 << 32);
                        widgetFlags.put(new IntegerNode(n15), l);
                    }
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3542 == packetWriter.serverPacket) {
                isCameraLocked = true;
                field762 = false;
                field757 = false;
                class280.field3067 = packetBuffer.readUnsignedByte();
                field801 = packetBuffer.readUnsignedByte();
                class416.field4710 = packetBuffer.readUnsignedShort();
                class383.field4491 = packetBuffer.readUnsignedByte();
                class505.field5142 = packetBuffer.readUnsignedByte();
                if (class505.field5142 >= 100) {
                    int n16 = Coord.method6980(class280.field3067);
                    n = Coord.method6980(field801);
                    int n17 = Canvas.method337(GameEngine.field189, n16, n, GameEngine.field189.field1321) - class416.field4710;
                    int n18 = n16 - Buddy.cameraX;
                    int n19 = n17 - Message.cameraY;
                    int n20 = n - class31.cameraZ;
                    int n21 = (int)Math.sqrt(n20 * n20 + n18 * n18);
                    class159.cameraPitch = (int)(Math.atan2(n19, n21) * (double)325.949f) & 0x7FF;
                    class183.cameraYaw = (int)(Math.atan2(n18, n20) * (double)-325.949f) & 0x7FF;
                    if (class159.cameraPitch < 128) {
                        class159.cameraPitch = 128;
                    }
                    if (class159.cameraPitch > 383) {
                        class159.cameraPitch = 383;
                    }
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3447 == packetWriter.serverPacket) {
                int n22 = packetBuffer.method10387();
                int n23 = packetBuffer.method10334();
                Player player = n23 == field623 ? ModeWhere.localPlayer : class30.field131.field1329[n23];
                n = packetBuffer.method10458();
                int n24 = packetBuffer.method10314();
                if (player != null) {
                    player.method2794(n24, n, n22 >> 16, n22 & 0xFFFF);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3525 == packetWriter.serverPacket) {
                boolean bl;
                boolean bl2 = bl = packetBuffer.readUnsignedByte() == 1;
                if (bl) {
                    Widget.field3909 = ReflectionCheck.method724() - packetBuffer.readLong();
                    class328.grandExchangeEvents = new GrandExchangeEvents(packetBuffer, true);
                } else {
                    class328.grandExchangeEvents = null;
                }
                field714 = cycleCntr;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3567 == packetWriter.serverPacket) {
                class418.field4719 = packetBuffer.readBoolean();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3509 == packetWriter.serverPacket) {
                packetBuffer.offset += 28;
                if (packetBuffer.checkCrc()) {
                    class157.method3657(packetBuffer, packetBuffer.offset - 28);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3484 == packetWriter.serverPacket) {
                class224.method5046(class323.field3433);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3463 == packetWriter.serverPacket) {
                class224.method5046(class323.field3420);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3476 == packetWriter.serverPacket) {
                int n25 = packetBuffer.readInt();
                n = packetBuffer.readInt();
                int n26 = class369.getGcDuration();
                PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3372, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10477(n26);
                packetBufferNode.packetBuffer.method10477(GameEngine.fps);
                packetBufferNode.packetBuffer.method10268(n25);
                packetBufferNode.packetBuffer.method10268(n);
                Client.packetWriter.addNode(packetBufferNode);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3538 == packetWriter.serverPacket) {
                int n27 = packetBuffer.readInt();
                InterfaceParent interfaceParent = (InterfaceParent)interfaceParents.get(n27);
                if (interfaceParent != null) {
                    NPCComposition.closeInterface(interfaceParent, true);
                }
                if (meslayerContinueWidget != null) {
                    UserComparator8.invalidateWidget(meslayerContinueWidget);
                    meslayerContinueWidget = null;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3490 == packetWriter.serverPacket) {
                rebootTimer = packetBuffer.method10334() * 30;
                field499 = cycleCntr;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3502 == packetWriter.serverPacket) {
                int n28 = packetBuffer.method10335();
                Widget widget = ClanChannel.field1807.method7031(n28);
                widget.modelType = 3;
                widget.modelId = ModeWhere.localPlayer.appearance.getChatHeadId();
                UserComparator8.invalidateWidget(widget);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3571 == packetWriter.serverPacket) {
                Language.method7972(class30.field131, packetBuffer, 4);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3552 == packetWriter.serverPacket) {
                int n29 = packetBuffer.readUnsignedShort();
                n = packetBuffer.readUnsignedShort();
                int n30 = packetBuffer.readUnsignedShort();
                int n31 = packetBuffer.method10323();
                int n32 = packetBuffer.method10334();
                if (n32 == 65535) {
                    n32 = -1;
                }
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                arrayList.add(n32);
                class420.method8237(arrayList, n, n29, n31, n30);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3451 == packetWriter.serverPacket) {
                class224.method5046(class323.field3427);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3496 == packetWriter.serverPacket) {
                field631 = packetBuffer.readStringCp1252NullTerminated();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3456 == packetWriter.serverPacket) {
                int n33 = packetBuffer.method10314();
                n = packetBuffer.method10378();
                int n34 = packetBuffer.method10312();
                Widget widget = ClanChannel.field1807.method7031(n);
                widget.field3924.method7064(n34, n33);
                UserComparator8.invalidateWidget(widget);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3454 == packetWriter.serverPacket) {
                int n35 = packetBuffer.readUnsignedByte();
                class107.forceDisconnect(n35);
                packetWriter.serverPacket = null;
                return false;
            }
            if (ServerPacket.field3465 == packetWriter.serverPacket) {
                object = new byte[packetWriter.field1452];
                packetBuffer.method10225((byte[])object, 0, ((ServerPacket[])object).length);
                Buffer buffer = new Buffer((byte[])object);
                String string = buffer.readStringCp1252NullTerminated();
                WorldMapRectangle.openURL(string, true, false);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3531 == packetWriter.serverPacket) {
                Client.logOut();
                packetWriter.serverPacket = null;
                return false;
            }
            if (ServerPacket.field3464 == packetWriter.serverPacket) {
                ClanChannel.method3857(GameEngine.field189, packetBuffer);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3544 == packetWriter.serverPacket) {
                AbstractWorldMapData.field3215 = packetBuffer.method10314();
                class360.field3857 = packetBuffer.method10341();
                field767 = packetBuffer.readUnsignedByte();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3495 == packetWriter.serverPacket) {
                class105 class1052;
                n = packetBuffer.method10458();
                int n36 = packetBuffer.method10323();
                int n37 = packetBuffer.method10312();
                if (n == 65535) {
                    n = -1;
                }
                if ((class1052 = class30.field131.field1330[n36]) != null) {
                    if (n == class1052.field1240 && n != -1) {
                        int n38 = class33.SequenceDefinition_get((int)n).field2943;
                        if (n38 == 1) {
                            class1052.field1241 = 0;
                            class1052.field1242 = 0;
                            class1052.field1271 = n37;
                            class1052.field1244 = 0;
                        } else if (n38 == 2) {
                            class1052.field1244 = 0;
                        }
                    } else if (n == -1 || class1052.field1240 == -1 || class33.SequenceDefinition_get((int)n).field2930 >= class33.SequenceDefinition_get((int)class1052.field1240).field2930) {
                        class1052.field1240 = n;
                        class1052.field1241 = 0;
                        class1052.field1242 = 0;
                        class1052.field1271 = n37;
                        class1052.field1244 = 0;
                        class1052.field1270 = class1052.field1265;
                    }
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3458 == packetWriter.serverPacket) {
                class277.field3055 = packetBuffer.readUnsignedByte();
                class221.field2426 = packetBuffer.readUnsignedByte();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3517 == packetWriter.serverPacket) {
                isCameraLocked = true;
                field762 = false;
                field669 = true;
                LoginScreenAnimation.field1293 = packetBuffer.readUnsignedByte();
                WorldMapAreaData.field3274 = packetBuffer.readUnsignedByte();
                int n39 = packetBuffer.readUnsignedShort();
                n = packetBuffer.readUnsignedShort();
                field758 = packetBuffer.readBoolean();
                int n40 = packetBuffer.readUnsignedByte();
                int n41 = Coord.method6980(LoginScreenAnimation.field1293);
                int n42 = Coord.method6980(WorldMapAreaData.field3274);
                int n43 = 0;
                int n44 = 0;
                if (field758) {
                    n43 = Message.cameraY;
                    n44 = Canvas.method337(GameEngine.field189, n41, n42, GameEngine.field189.field1321) - n39;
                } else {
                    n43 = Canvas.method337(GameEngine.field189, Buddy.cameraX, class31.cameraZ, GameEngine.field189.field1321) - Message.cameraY;
                    n44 = n39;
                }
                field657 = new class519(Buddy.cameraX, class31.cameraZ, n43, n41, n42, n44, n, n40);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3462 == packetWriter.serverPacket) {
                int n45 = packetBuffer.readUnsignedShort();
                n = packetBuffer.method10341();
                if (n45 == 65535) {
                    n45 = -1;
                }
                Decimator.method1171(ModeWhere.localPlayer, n45, n);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3522 == packetWriter.serverPacket) {
                int n46 = packetBuffer.readInt();
                n = packetBuffer.method10458();
                int n47 = packetBuffer.method10458();
                Widget widget = ClanChannel.field1807.method7031(n46);
                widget.field3928 = n47 + (n << 16);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3565 == packetWriter.serverPacket) {
                object = packetBuffer.readStringCp1252NullTerminated();
                long l = packetBuffer.readUnsignedShort();
                long l2 = packetBuffer.readMedium();
                PlayerType playerType = (PlayerType)StructComposition.findEnumerated(class151.PlayerType_values(), packetBuffer.readUnsignedByte());
                long l3 = l2 + (l << 32);
                boolean bl = false;
                for (int i = 0; i < 100; ++i) {
                    if (l3 != field729[i]) continue;
                    bl = true;
                    break;
                }
                if (class10.friendSystem.isIgnored(new Username((String)object, class383.loginType))) {
                    bl = true;
                }
                if (!bl && field625 == 0) {
                    Client.field729[Client.field730] = l3;
                    field730 = (field730 + 1) % 100;
                    String string = AbstractFont.escapeBrackets(Skills.method7619(class261.method5505(packetBuffer)));
                    int n48 = playerType.isPrivileged ? 7 : 3;
                    if (playerType.modIcon != -1) {
                        Interpreter.addGameMessage(n48, WorldMapElement.method1919(playerType.modIcon) + (String)object, string);
                    } else {
                        Interpreter.addGameMessage(n48, (String)object, string);
                    }
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3577 == packetWriter.serverPacket) {
                int n49 = packetBuffer.method10334();
                int n50 = packetBuffer.readMedium();
                int n51 = n50 >> 16;
                n = n50 >> 8 & 0xFF;
                int n52 = n51 + (n50 >> 4 & 7);
                int n53 = n + (n50 & 7);
                int n54 = packetBuffer.method10334();
                int n55 = packetBuffer.method10316();
                int n56 = packetBuffer.method10458();
                int n57 = packetBuffer.method10312() * 4;
                int n58 = packetBuffer.method10316();
                int n59 = packetBuffer.readUnsignedShort();
                int n60 = packetBuffer.method10312();
                int n61 = packetBuffer.method10330();
                int n62 = packetBuffer.method10341() * 4;
                int n63 = packetBuffer.method10330();
                if (0 <= n52 && n52 < 104 && 0 <= n53 && n53 < 104 && 0 <= (n55 += n52) && n55 < 104 && 0 <= (n58 += n53) && n58 < 104 && n49 != 65535) {
                    n52 = Coord.method6980(n52);
                    n53 = Coord.method6980(n53);
                    n55 = Coord.method6980(n55);
                    n58 = Coord.method6980(n58);
                    Projectile projectile = new Projectile(n49, class30.field131.field1321, n52, n53, Canvas.method337(class30.field131, n52, n53, class30.field131.field1321) - n62, n54 + cycle, n59 + cycle, n60, n56, n63, n61, n57);
                    projectile.setDestination(n55, n58, Canvas.method337(class30.field131, n55, n58, class30.field131.field1321) - n57, n54 + cycle);
                    class30.field131.field1338.addFirst(projectile);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3510 == packetWriter.serverPacket) {
                n = packetBuffer.readUnsignedShort();
                int n64 = packetBuffer.method10458();
                UserComparator3.method3347(n64, n);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3501 == packetWriter.serverPacket) {
                class224.method5046(class323.field3421);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3555 == packetWriter.serverPacket) {
                int n65 = packetBuffer.readInt();
                n = (short)packetBuffer.method10324();
                int n66 = packetBuffer.readUnsignedByte();
                int n67 = packetBuffer.readUnsignedShort();
                class105 class1053 = class30.field131.field1330[n67];
                if (class1053 != null) {
                    class1053.method3068(n66, n65, (short)n);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3485 == packetWriter.serverPacket) {
                class224.method5046(class323.field3419);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3487 == packetWriter.serverPacket) {
                int n68 = packetBuffer.method10325();
                n = packetBuffer.method10378();
                Widget widget = ClanChannel.field1807.method7031(n);
                if (n68 != widget.sequenceId || n68 == -1) {
                    widget.sequenceId = n68;
                    widget.modelFrame = 0;
                    widget.modelFrameCycle = 0;
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3572 == packetWriter.serverPacket) {
                class111.method3125(class30.field131, true, packetBuffer);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3560 == packetWriter.serverPacket) {
                int n69 = packetBuffer.readInt();
                n = packetBuffer.readUnsignedShort();
                if (n69 < -70000) {
                    n += 32768;
                }
                Widget widget = n69 >= 0 ? ClanChannel.field1807.method7031(n69) : null;
                while (packetBuffer.offset < packetWriter.field1452) {
                    int n70 = packetBuffer.readUShortSmart();
                    int n71 = packetBuffer.readUnsignedShort();
                    int n72 = 0;
                    if (n71 != 0 && (n72 = packetBuffer.readUnsignedByte()) == 255) {
                        n72 = packetBuffer.readInt();
                    }
                    if (widget != null && n70 >= 0 && n70 < widget.field3903.length) {
                        widget.field3903[n70] = n71;
                        widget.field4009[n70] = n72;
                    }
                    class131.itemContainerSetItem(n, n70, n71 - 1, n72);
                }
                if (widget != null) {
                    UserComparator8.invalidateWidget(widget);
                }
                class150.method3598();
                Client.field544[++Client.field749 - 1 & 0x1F] = n & Short.MAX_VALUE;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3545 == packetWriter.serverPacket) {
                return this.method1310(packetWriter);
            }
            if (ServerPacket.field3483 == packetWriter.serverPacket) {
                int n73 = packetBuffer.readUnsignedShort();
                n = packetBuffer.readUnsignedByte();
                int n74 = packetBuffer.readUnsignedShort();
                class378.queueSoundEffect(n73, n, n74);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3543 == packetWriter.serverPacket) {
                publicChatMode = packetBuffer.method10341();
                tradeChatMode = packetBuffer.method10314();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3446 == packetWriter.serverPacket) {
                int n75;
                int n76 = packetBuffer.method10387();
                n = packetBuffer.method10387();
                int n77 = packetBuffer.method10323();
                if (n77 == 65535) {
                    n77 = -1;
                }
                if ((n75 = packetBuffer.readUnsignedShort()) == 65535) {
                    n75 = -1;
                }
                for (int i = n75; i <= n77; ++i) {
                    long l = ((long)n << 32) + (long)i;
                    Node node = widgetFlags.get(l);
                    if (node != null) {
                        node.remove();
                    }
                    widgetFlags.put(new IntegerNode(n76), l);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3477 == packetWriter.serverPacket) {
                int n78 = packetBuffer.readInt();
                n = packetBuffer.method10323();
                Widget widget = ClanChannel.field1807.method7031(n78);
                if (widget.modelType != 1 || n != widget.modelId) {
                    widget.modelType = 1;
                    widget.modelId = n;
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3457 == packetWriter.serverPacket) {
                isCameraLocked = true;
                field762 = false;
                field757 = true;
                int n79 = packetBuffer.readShort();
                n = packetBuffer.readShort();
                int n80 = class345.method6949(n + class159.cameraPitch & 0x7EB);
                int n81 = n79 + class183.cameraYaw;
                int n82 = packetBuffer.readUnsignedShort();
                int n83 = packetBuffer.readUnsignedByte();
                field761 = new class520(class159.cameraPitch, n80, n82, n83);
                field725 = new class520(class183.cameraYaw, n81, n82, n83);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3529 == packetWriter.serverPacket) {
                ++field693;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3574 == packetWriter.serverPacket) {
                class224.method5046(class323.field3424);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3452 == packetWriter.serverPacket) {
                int n84 = packetBuffer.method10387();
                n = packetBuffer.method10323();
                int n85 = packetBuffer.method10458();
                int n86 = packetBuffer.method10323();
                Widget widget = ClanChannel.field1807.method7031(n84);
                if (n86 != widget.modelAngleX || n != widget.modelAngleY || n85 != widget.modelZoom) {
                    widget.modelAngleX = n86;
                    widget.modelAngleY = n;
                    widget.modelZoom = n85;
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3561 == packetWriter.serverPacket) {
                IgnoreList.readReflectionCheck(packetBuffer, packetWriter.field1452);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3563 == packetWriter.serverPacket) {
                int n87;
                Widget widget;
                int n88 = packetBuffer.readInt();
                n = packetBuffer.readUnsignedShort();
                if (n88 < -70000) {
                    n += 32768;
                }
                if ((widget = n88 >= 0 ? ClanChannel.field1807.method7031(n88) : null) != null) {
                    for (n87 = 0; n87 < widget.field3903.length; ++n87) {
                        widget.field3903[n87] = 0;
                        widget.field4009[n87] = 0;
                    }
                }
                WorldMapCacheName.clearItemContainer(n);
                n87 = packetBuffer.readUnsignedShort();
                for (int i = 0; i < n87; ++i) {
                    int n89 = packetBuffer.method10323();
                    int n90 = packetBuffer.method10312();
                    if (n90 == 255) {
                        n90 = packetBuffer.method10387();
                    }
                    if (widget != null && i < widget.field3903.length) {
                        widget.field3903[i] = n89;
                        widget.field4009[i] = n90;
                    }
                    class131.itemContainerSetItem(n, i, n89 - 1, n90);
                }
                if (widget != null) {
                    UserComparator8.invalidateWidget(widget);
                }
                class150.method3598();
                Client.field544[++Client.field749 - 1 & 0x1F] = n & Short.MAX_VALUE;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3466 == packetWriter.serverPacket) {
                int n91 = packetBuffer.readInt();
                if (n91 != field601) {
                    field601 = n91;
                    class142.method3514();
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3467 == packetWriter.serverPacket) {
                boolean bl = packetBuffer.readBoolean();
                if (bl) {
                    if (class184.field1975 == null) {
                        class184.field1975 = new class402();
                    }
                } else {
                    class184.field1975 = null;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3482 == packetWriter.serverPacket) {
                int n92 = packetBuffer.readUnsignedByte();
                n = packetBuffer.readUnsignedShort();
                int n93 = packetBuffer.readShort();
                if (n92 == 0) {
                    class53.field339 = GameEngine.field189.field1329[n];
                    field781 = -1;
                } else if (n92 == 1) {
                    field781 = -1;
                    class53.field339 = GameEngine.field189.field1330[n];
                } else if (n92 == 2) {
                    field781 = n93;
                    class53.field339 = GameEngine.field189.field1318[n];
                    this.method541(true);
                }
                if (class53.field339 == null) {
                    field781 = -1;
                    class53.field339 = ModeWhere.localPlayer;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3578 == packetWriter.serverPacket) {
                class224.method5046(class323.field3431);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3503 == packetWriter.serverPacket) {
                field700 = cycleCntr;
                byte by = packetBuffer.readByte();
                if (packetWriter.field1452 == 1) {
                    if (by >= 0) {
                        Client.currentClanChannels[by] = null;
                    } else {
                        class106.guestClanChannel = null;
                    }
                    packetWriter.serverPacket = null;
                    return true;
                }
                if (by >= 0) {
                    Client.currentClanChannels[by] = new ClanChannel(packetBuffer);
                } else {
                    class106.guestClanChannel = new ClanChannel(packetBuffer);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3548 == packetWriter.serverPacket) {
                object = packetBuffer.readStringCp1252NullTerminated();
                String string = AbstractFont.escapeBrackets(Skills.method7619(class261.method5505(packetBuffer)));
                Interpreter.addGameMessage(6, (String)object, string);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3443 == packetWriter.serverPacket) {
                isCameraLocked = true;
                field762 = false;
                field669 = false;
                LoginScreenAnimation.field1293 = packetBuffer.readUnsignedByte();
                WorldMapAreaData.field3274 = packetBuffer.readUnsignedByte();
                class95.field1167 = packetBuffer.readUnsignedShort();
                WorldMapSectionType.field3187 = packetBuffer.readUnsignedByte();
                class544.field5398 = packetBuffer.readUnsignedByte();
                if (class544.field5398 >= 100) {
                    Buddy.cameraX = Coord.method6980(LoginScreenAnimation.field1293);
                    class31.cameraZ = Coord.method6980(WorldMapAreaData.field3274);
                    Message.cameraY = Canvas.method337(GameEngine.field189, Buddy.cameraX, class31.cameraZ, GameEngine.field189.field1321) - class95.field1167;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3479 == packetWriter.serverPacket) {
                object = new World();
                ((World)object).host = packetBuffer.readStringCp1252NullTerminated();
                ((World)object).id = packetBuffer.readUnsignedShort();
                ((World)object).properties = n = packetBuffer.readInt();
                if (((World)object).isDeadman()) {
                    ((World)object).field819 = "beta";
                    class273.field3035 = true;
                } else {
                    class273.field3035 = false;
                }
                class360.updateGameState(45);
                abstractSocket.close();
                abstractSocket = null;
                Language.changeWorld((World)object);
                packetWriter.serverPacket = null;
                return false;
            }
            if (ServerPacket.field3536 == packetWriter.serverPacket) {
                int n94 = packetBuffer.method10458();
                JagexCache.method4938(n94);
                Client.field544[++Client.field749 - 1 & 0x1F] = n94 & Short.MAX_VALUE;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3568 == packetWriter.serverPacket) {
                class436.field4815 = packetBuffer.readBoolean();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3547 == packetWriter.serverPacket) {
                for (int i = 0; i < VarpDefinition.field2505; ++i) {
                    VarpDefinition varpDefinition = class254.VarpDefinition_get(i);
                    if (varpDefinition == null) continue;
                    Varps.Varps_temp[i] = 0;
                    Varps.Varps_main[i] = 0;
                }
                class150.method3598();
                field586 += 32;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3444 == packetWriter.serverPacket) {
                isCameraLocked = true;
                field762 = false;
                field757 = true;
                int n95 = class119.method3301(packetBuffer.readShort() & 0x7EB);
                n = class345.method6949(packetBuffer.readShort() & 0x7EB);
                int n96 = packetBuffer.readUnsignedShort();
                int n97 = packetBuffer.readUnsignedByte();
                field761 = new class520(class159.cameraPitch, n, n96, n97);
                field725 = new class520(class183.cameraYaw, n95, n96, n97);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3539 == packetWriter.serverPacket) {
                field673.method3144(packetBuffer, packetWriter.field1452);
                AbstractUserComparator.method9190();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3570 == packetWriter.serverPacket) {
                int n98;
                class30.field131.field1331 = 0;
                class30.field131.field1334 = 0;
                for (n98 = 0; n98 < 65536; ++n98) {
                    class30.field131.field1330[n98] = null;
                }
                for (n98 = 0; n98 < 2048; ++n98) {
                    class30.field131.field1318[n98] = null;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3505 == packetWriter.serverPacket) {
                Language.method7972(class30.field131, packetBuffer, 3);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3553 == packetWriter.serverPacket) {
                field700 = cycleCntr;
                byte by = packetBuffer.readByte();
                class167 class1672 = new class167(packetBuffer);
                ClanChannel clanChannel = by >= 0 ? currentClanChannels[by] : class106.guestClanChannel;
                if (clanChannel == null) {
                    this.method1321(by);
                    packetWriter.serverPacket = null;
                    return true;
                }
                if (class1672.field1791 > clanChannel.field1810) {
                    this.method1321(by);
                    packetWriter.serverPacket = null;
                    return true;
                }
                if (class1672.field1791 < clanChannel.field1810) {
                    packetWriter.serverPacket = null;
                    return true;
                }
                class1672.method3817(clanChannel);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3528 == packetWriter.serverPacket) {
                FloorUnderlayDefinition.addCancelMenuEntry();
                byte by = packetBuffer.readByte();
                class153 class1532 = new class153(packetBuffer);
                ClanSettings clanSettings = by >= 0 ? currentClanSettings[by] : InvDefinition.guestClanSettings;
                if (clanSettings == null) {
                    this.method1322(by);
                    packetWriter.serverPacket = null;
                    return true;
                }
                if (class1532.field1695 > clanSettings.field1738) {
                    this.method1322(by);
                    packetWriter.serverPacket = null;
                    return true;
                }
                if (class1532.field1695 < clanSettings.field1738) {
                    packetWriter.serverPacket = null;
                    return true;
                }
                class1532.method3612(clanSettings);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3579 == packetWriter.serverPacket) {
                for (int i = 0; i < Varps.Varps_main.length; ++i) {
                    if (Varps.Varps_temp[i] == Varps.Varps_main[i]) continue;
                    Varps.Varps_main[i] = Varps.Varps_temp[i];
                    RouteStrategy.changeGameOptions(i);
                    Client.field688[++Client.field586 - 1 & 0x1F] = i;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3523 == packetWriter.serverPacket) {
                int n99 = packetBuffer.readShort();
                field508.method2749(n99);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3556 == packetWriter.serverPacket) {
                minimapState = packetBuffer.readUnsignedByte();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3518 == packetWriter.serverPacket) {
                class224.method5046(class323.field3432);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3492 == packetWriter.serverPacket) {
                class150.method3598();
                weight = packetBuffer.readShort();
                field499 = cycleCntr;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3494 == packetWriter.serverPacket) {
                int n100 = packetBuffer.readInt();
                n = packetBuffer.method10323();
                Widget widget = ClanChannel.field1807.method7031(n100);
                if (widget != null && widget.type == 0) {
                    if (n > widget.scrollHeight - widget.height * -1528330031) {
                        n = widget.scrollHeight - widget.height * -1528330031;
                    }
                    if (n < 0) {
                        n = 0;
                    }
                    if (n != widget.scrollY) {
                        widget.scrollY = n;
                        UserComparator8.invalidateWidget(widget);
                    }
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3559 == packetWriter.serverPacket) {
                class360.field3857 = packetBuffer.method10312();
                field767 = packetBuffer.method10312();
                for (int i = AbstractWorldMapData.field3215 = packetBuffer.method10312(); i < AbstractWorldMapData.field3215 + 8; ++i) {
                    for (n = class360.field3857; n < class360.field3857 + 8; ++n) {
                        if (class30.field131.field1327[field767][i][n] == null) continue;
                        class30.field131.field1327[Client.field767][i][n] = null;
                        ByteArrayPool.method8927(field767, i, n);
                    }
                }
                object = (PendingSpawn)class30.field131.field1333.last();
                while (object != null) {
                    if (((PendingSpawn)object).field1187 >= AbstractWorldMapData.field3215 && ((PendingSpawn)object).field1187 < AbstractWorldMapData.field3215 + 8 && ((PendingSpawn)object).field1182 >= class360.field3857 && ((PendingSpawn)object).field1182 < class360.field3857 + 8 && ((PendingSpawn)object).field1188 == field767) {
                        ((PendingSpawn)object).field1186 = 0;
                    }
                    object = (PendingSpawn)class30.field131.field1333.previous();
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3460 == packetWriter.serverPacket) {
                int n101 = packetBuffer.readUnsignedByte();
                int n102 = n101 >> 2;
                int n103 = n101 & 3;
                int n104 = field578[n102];
                int n105 = packetBuffer.readUnsignedShort();
                int n106 = packetBuffer.method10354();
                int n107 = n106 >> 16;
                n = n106 >> 8 & 0xFF;
                int n108 = n107 + (n106 >> 4 & 7);
                int n109 = n + (n106 & 7);
                if (0 <= n108 && n108 < 103 && 0 <= n109 && n109 < 103) {
                    class154.method3621(n108, n109, n102, n103, n104, n105);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3449 == packetWriter.serverPacket) {
                class360.field3857 = packetBuffer.method10312();
                AbstractWorldMapData.field3215 = packetBuffer.method10312();
                field767 = packetBuffer.method10312();
                while (packetBuffer.offset < packetWriter.field1452) {
                    int n110 = packetBuffer.readUnsignedByte();
                    class323 class3232 = WorldMapSectionType.method6360()[n110];
                    class224.method5046(class3232);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3535 == packetWriter.serverPacket) {
                int n111 = packetBuffer.method10434();
                int n112 = n111 >> 16;
                n = n111 >> 8 & 0xFF;
                int n113 = n112 + (n111 >> 4 & 7);
                int n114 = n + (n111 & 7);
                int n115 = packetBuffer.readUnsignedShort();
                int n116 = packetBuffer.method10314();
                int n117 = packetBuffer.readUnsignedShort();
                if (n113 >= 0 && n114 >= 0 && n113 < class30.field131.field1322 && n114 < class30.field131.field1323) {
                    n113 = Coord.method6980(n113);
                    n114 = Coord.method6980(n114);
                    GraphicsObject graphicsObject = new GraphicsObject(n117, class30.field131.field1321, n113, n114, Canvas.method337(class30.field131, n113, n114, class30.field131.field1321) - n116, n115, cycle);
                    class30.field131.field1339.addFirst(graphicsObject);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3480 == packetWriter.serverPacket) {
                class224.method5046(class323.field3422);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3514 == packetWriter.serverPacket) {
                if (rootInterface != -1) {
                    Client.method1709(rootInterface, 0);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3504 == packetWriter.serverPacket) {
                boolean bl = packetBuffer.method10341() == 1;
                n = packetBuffer.method10387();
                Widget widget = ClanChannel.field1807.method7031(n);
                if (bl != widget.isHidden) {
                    widget.isHidden = bl;
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3527 == packetWriter.serverPacket && isCameraLocked) {
                field762 = true;
                field757 = false;
                field669 = false;
                for (int i = 0; i < 5; ++i) {
                    Client.field571[i] = false;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3453 == packetWriter.serverPacket) {
                packetWriter.field1456 = packetBuffer.readShort();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3562 == packetWriter.serverPacket) {
                FriendSystem.loadRegions(true, packetWriter.packetBuffer);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3515 == packetWriter.serverPacket) {
                ApproximateRouteStrategy.method1254(packetBuffer.readStringCp1252NullTerminated());
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3576 == packetWriter.serverPacket) {
                class111.method3125(class30.field131, false, packetBuffer);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3549 == packetWriter.serverPacket) {
                class93.field1111 = packetBuffer.readBoolean();
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3488 == packetWriter.serverPacket) {
                field762 = false;
                isCameraLocked = false;
                field669 = false;
                field757 = false;
                class280.field3067 = 0;
                field801 = 0;
                class416.field4710 = 0;
                field758 = false;
                class383.field4491 = 0;
                class505.field5142 = 0;
                class544.field5398 = 0;
                WorldMapSectionType.field3187 = 0;
                LoginScreenAnimation.field1293 = 0;
                WorldMapAreaData.field3274 = 0;
                class95.field1167 = 0;
                field657 = null;
                field761 = null;
                field725 = null;
                for (int i = 0; i < 5; ++i) {
                    Client.field571[i] = false;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3478 == packetWriter.serverPacket) {
                int n118 = packetBuffer.method10323();
                n = packetBuffer.method10323();
                if (n == 65535) {
                    n = -1;
                }
                int n119 = packetBuffer.method10323();
                int n120 = packetBuffer.method10323();
                int n121 = packetBuffer.method10323();
                int n122 = packetBuffer.method10458();
                if (n122 == 65535) {
                    n122 = -1;
                }
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                arrayList.add(n122);
                arrayList.add(n);
                class420.method8237(arrayList, n119, n118, n120, n121);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3512 == packetWriter.serverPacket) {
                int n123 = packetBuffer.method10458();
                n = packetBuffer.method10335();
                int n124 = n123 >> 10 & 0x1F;
                int n125 = n123 >> 5 & 0x1F;
                int n126 = n123 & 0x1F;
                int n127 = (n125 << 11) + (n124 << 19) + (n126 << 3);
                Widget widget = ClanChannel.field1807.method7031(n);
                if (n127 != widget.color) {
                    widget.color = n127;
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3493 == packetWriter.serverPacket) {
                isCameraLocked = true;
                field762 = false;
                field669 = true;
                LoginScreenAnimation.field1293 = packetBuffer.readUnsignedByte();
                WorldMapAreaData.field3274 = packetBuffer.readUnsignedByte();
                int n128 = packetBuffer.readUnsignedShort();
                n = Coord.method6980(packetBuffer.readUnsignedByte());
                int n129 = Coord.method6980(packetBuffer.readUnsignedByte());
                int n130 = packetBuffer.readUnsignedShort();
                field758 = packetBuffer.readBoolean();
                int n131 = packetBuffer.readUnsignedByte();
                int n132 = Coord.method6980(LoginScreenAnimation.field1293);
                int n133 = Coord.method6980(WorldMapAreaData.field3274);
                int n134 = 0;
                int n135 = 0;
                if (field758) {
                    n134 = Message.cameraY;
                    n135 = Canvas.method337(GameEngine.field189, n132, n133, GameEngine.field189.field1321) - n128;
                } else {
                    n134 = Canvas.method337(GameEngine.field189, Buddy.cameraX, class31.cameraZ, GameEngine.field189.field1321) - Message.cameraY;
                    n135 = n128;
                }
                field657 = new class518(Buddy.cameraX, class31.cameraZ, n134, n132, n133, n135, n, n129, n130, n131);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3459 == packetWriter.serverPacket) {
                field803 = null;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3575 == packetWriter.serverPacket) {
                ClanChannel clanChannel;
                byte by = packetBuffer.readByte();
                long l = packetBuffer.readUnsignedShort();
                long l4 = packetBuffer.readMedium();
                long l5 = (l << 32) + l4;
                boolean bl = false;
                ClanChannel clanChannel2 = clanChannel = by >= 0 ? currentClanChannels[by] : class106.guestClanChannel;
                if (clanChannel == null) {
                    bl = true;
                } else {
                    for (int i = 0; i < 100; ++i) {
                        if (l5 != field729[i]) continue;
                        bl = true;
                        break;
                    }
                }
                if (!bl) {
                    Client.field729[Client.field730] = l5;
                    field730 = (field730 + 1) % 100;
                    String string = class261.method5505(packetBuffer);
                    int n136 = by >= 0 ? 43 : 46;
                    Script.addChatMessage(n136, "", string, clanChannel.name);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3500 == packetWriter.serverPacket) {
                int n137 = packetBuffer.readUnsignedByte();
                class215.method4925(n137);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3486 == packetWriter.serverPacket) {
                Widget widget;
                int n138 = packetBuffer.method10387();
                n = packetBuffer.method10387();
                InterfaceParent interfaceParent = (InterfaceParent)interfaceParents.get(n138);
                InterfaceParent interfaceParent2 = (InterfaceParent)interfaceParents.get(n);
                if (interfaceParent2 != null) {
                    NPCComposition.closeInterface(interfaceParent2, interfaceParent == null || interfaceParent2.group != interfaceParent.group);
                }
                if (interfaceParent != null) {
                    interfaceParent.remove();
                    interfaceParents.put(interfaceParent, n);
                }
                if ((widget = ClanChannel.field1807.method7031(n138)) != null) {
                    UserComparator8.invalidateWidget(widget);
                }
                if ((widget = ClanChannel.field1807.method7031(n)) != null) {
                    UserComparator8.invalidateWidget(widget);
                    class244.revalidateWidgetScroll(ClanChannel.field1807.field3772[widget.id >>> 16], widget, true);
                }
                if (rootInterface != -1) {
                    Client.method1709(rootInterface, 1);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3481 == packetWriter.serverPacket) {
                int n139 = packetBuffer.method10378();
                n = packetBuffer.method10458();
                if (n == 65535) {
                    n = -1;
                }
                int n140 = packetBuffer.method10387();
                Widget widget = ClanChannel.field1807.method7031(n140);
                if (!widget.isIf3) {
                    if (n == -1) {
                        widget.modelType = 0;
                        packetWriter.serverPacket = null;
                        return true;
                    }
                    ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n).getCountObj(n139);
                    widget.modelType = 4;
                    widget.modelId = n;
                    widget.modelAngleX = itemComposition.xan2d;
                    widget.modelAngleY = itemComposition.yan2d;
                    widget.modelZoom = itemComposition.zoom2d * 100 / n139;
                    UserComparator8.invalidateWidget(widget);
                } else {
                    widget.itemId = n;
                    widget.itemQuantity = n139;
                    ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n).getCountObj(n139);
                    widget.modelAngleX = itemComposition.xan2d;
                    widget.modelAngleY = itemComposition.yan2d;
                    widget.modelAngleZ = itemComposition.zan2d;
                    widget.modelOffsetX = itemComposition.offsetX2d;
                    widget.modelOffsetY = itemComposition.offsetY2d;
                    widget.modelZoom = itemComposition.zoom2d;
                    widget.itemQuantityMode = itemComposition.isStackable == 1 ? 1 : 2;
                    if (widget.field3927 > 0) {
                        widget.modelZoom = widget.modelZoom * 32 / widget.field3927;
                    } else if (widget.rawWidth > 0) {
                        widget.modelZoom = widget.modelZoom * 32 / widget.rawWidth;
                    }
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3474 == packetWriter.serverPacket) {
                int n141 = packetBuffer.method10335();
                n = packetBuffer.method10324();
                int n142 = packetBuffer.method10324();
                Widget widget = ClanChannel.field1807.method7031(n141);
                if (n142 != widget.rawX || n != widget.rawY || widget.xAlignment != 0 || widget.yAlignment != 0) {
                    widget.rawX = n142;
                    widget.rawY = n;
                    widget.xAlignment = 0;
                    widget.yAlignment = 0;
                    UserComparator8.invalidateWidget(widget);
                    this.alignWidget(widget);
                    if (widget.type == 0) {
                        class244.revalidateWidgetScroll(ClanChannel.field1807.field3772[n141 >> 16], widget, false);
                    }
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3530 == packetWriter.serverPacket) {
                int n143 = packetBuffer.method10378();
                n = packetBuffer.method10314();
                int n144 = packetBuffer.method10334();
                InterfaceParent interfaceParent = (InterfaceParent)interfaceParents.get(n143);
                if (interfaceParent != null) {
                    NPCComposition.closeInterface(interfaceParent, n144 != interfaceParent.group);
                }
                class6.method41(n143, n144, n);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3554 == packetWriter.serverPacket) {
                class10.friendSystem.ignoreList.read(packetBuffer, packetWriter.field1452);
                class328.FriendSystem_invalidateIgnoreds();
                field697 = cycleCntr;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3558 == packetWriter.serverPacket) {
                object = packetBuffer.readStringCp1252NullTerminated();
                long l = packetBuffer.readLong();
                long l6 = packetBuffer.readUnsignedShort();
                long l7 = packetBuffer.readMedium();
                PlayerType playerType = (PlayerType)StructComposition.findEnumerated(class151.PlayerType_values(), packetBuffer.readUnsignedByte());
                long l8 = l7 + (l6 << 32);
                boolean bl = false;
                for (int i = 0; i < 100; ++i) {
                    if (field729[i] != l8) continue;
                    bl = true;
                    break;
                }
                if (playerType.isUser && class10.friendSystem.isIgnored(new Username((String)object, class383.loginType))) {
                    bl = true;
                }
                if (!bl && field625 == 0) {
                    Client.field729[Client.field730] = l8;
                    field730 = (field730 + 1) % 100;
                    String string = AbstractFont.escapeBrackets(Skills.method7619(class261.method5505(packetBuffer)));
                    if (playerType.modIcon != -1) {
                        Script.addChatMessage(9, WorldMapElement.method1919(playerType.modIcon) + (String)object, string, WorldMapRectangle.base37DecodeLong(l));
                    } else {
                        Script.addChatMessage(9, (String)object, string, WorldMapRectangle.base37DecodeLong(l));
                    }
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3551 == packetWriter.serverPacket) {
                return this.method1311(packetWriter);
            }
            if (ServerPacket.field3469 == packetWriter.serverPacket) {
                int n145 = packetBuffer.method10323();
                class105 class1054 = class30.field131.field1330[n145];
                int n146 = packetBuffer.method10323();
                int n147 = packetBuffer.method10312();
                n = packetBuffer.method10335();
                if (class1054 != null) {
                    class1054.method2794(n147, n146, n >> 16, n & 0xFFFF);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3471 == packetWriter.serverPacket) {
                class224.method5046(class323.field3428);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3511 == packetWriter.serverPacket) {
                FloorUnderlayDefinition.addCancelMenuEntry();
                byte by = packetBuffer.readByte();
                if (packetWriter.field1452 == 1) {
                    if (by >= 0) {
                        Client.currentClanSettings[by] = null;
                    } else {
                        InvDefinition.guestClanSettings = null;
                    }
                    packetWriter.serverPacket = null;
                    return true;
                }
                if (by >= 0) {
                    Client.currentClanSettings[by] = new ClanSettings(packetBuffer);
                } else {
                    InvDefinition.guestClanSettings = new ClanSettings(packetBuffer);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3489 == packetWriter.serverPacket) {
                class150.method3598();
                int n148 = packetBuffer.method10341();
                n = packetBuffer.method10341();
                int n149 = packetBuffer.readInt();
                int n150 = packetBuffer.readUnsignedByte();
                Client.experience[n] = n149;
                Client.currentLevels[n] = n150;
                Client.levels[n] = 1;
                Client.field645[n] = n148;
                for (int i = 0; i < 98; ++i) {
                    if (n149 < Skills.Skills_experienceTable[i]) continue;
                    Client.levels[n] = i + 2;
                }
                Client.field780[++Client.field505 - 1 & 0x1F] = n;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3508 == packetWriter.serverPacket) {
                int n151 = packetBuffer.readUnsignedShort();
                Varps.Varps_temp[n151] = n = packetBuffer.readInt();
                if (Varps.Varps_main[n151] != n) {
                    Varps.Varps_main[n151] = n;
                }
                RouteStrategy.changeGameOptions(n151);
                Client.field688[++Client.field586 - 1 & 0x1F] = n151;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3497 == packetWriter.serverPacket) {
                int n152 = packetBuffer.method10354();
                n = packetBuffer.readUnsignedShort();
                if (n == 65535) {
                    n = -1;
                }
                class82.method2494(n, n152);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3513 == packetWriter.serverPacket) {
                int n153 = packetBuffer.method10335();
                n = packetBuffer.method10312();
                Widget widget = ClanChannel.field1807.method7031(n153);
                widget.field3924.method7062(ModeWhere.localPlayer.appearance.gender, n);
                UserComparator8.invalidateWidget(widget);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3526 == packetWriter.serverPacket) {
                class224.method5046(class323.field3425);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3450 == packetWriter.serverPacket) {
                class224.method5046(class323.field3423);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3557 == packetWriter.serverPacket) {
                ClanChannel clanChannel;
                boolean bl;
                long l;
                PlayerType playerType;
                String string;
                byte by;
                block331: {
                    by = packetBuffer.readByte();
                    string = packetBuffer.readStringCp1252NullTerminated();
                    long l9 = packetBuffer.readUnsignedShort();
                    long l10 = packetBuffer.readMedium();
                    playerType = (PlayerType)StructComposition.findEnumerated(class151.PlayerType_values(), packetBuffer.readUnsignedByte());
                    l = l10 + (l9 << 32);
                    bl = false;
                    clanChannel = null;
                    ClanChannel clanChannel3 = clanChannel = by >= 0 ? currentClanChannels[by] : class106.guestClanChannel;
                    if (clanChannel == null) {
                        bl = true;
                    } else {
                        for (int i = 0; i < 100; ++i) {
                            if (field729[i] != l) continue;
                            bl = true;
                            break block331;
                        }
                        if (playerType.isUser && class10.friendSystem.isIgnored(new Username(string, class383.loginType))) {
                            bl = true;
                        }
                    }
                }
                if (!bl) {
                    int n154;
                    Client.field729[Client.field730] = l;
                    field730 = (field730 + 1) % 100;
                    String string3 = AbstractFont.escapeBrackets(class261.method5505(packetBuffer));
                    int n155 = n154 = by >= 0 ? 41 : 44;
                    if (playerType.modIcon != -1) {
                        Script.addChatMessage(n154, WorldMapElement.method1919(playerType.modIcon) + string, string3, clanChannel.name);
                    } else {
                        Script.addChatMessage(n154, string, string3, clanChannel.name);
                    }
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3534 == packetWriter.serverPacket) {
                int n156;
                for (n156 = 0; n156 < class30.field131.field1329.length; ++n156) {
                    if (class30.field131.field1329[n156] == null) continue;
                    class30.field131.field1329[n156].field1240 = -1;
                }
                for (n156 = 0; n156 < class30.field131.field1330.length; ++n156) {
                    if (class30.field131.field1330[n156] == null) continue;
                    class30.field131.field1330[n156].field1240 = -1;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3573 == packetWriter.serverPacket) {
                int n157 = packetBuffer.readShort();
                class492 class4922 = (class492)StructComposition.findEnumerated(PlayerComposition.method7114(), packetBuffer.readUnsignedByte());
                class491 class4912 = (class491)StructComposition.findEnumerated(GrandExchangeOfferNameComparator.method7881(), packetBuffer.readUnsignedByte());
                if (n157 == -2) {
                    field508.method2739(class4922, class4912);
                } else {
                    field508.method2718(n157, class4922, class4912);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3519 == packetWriter.serverPacket) {
                class224.method5046(class323.field3430);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3566 == packetWriter.serverPacket) {
                int n158 = packetBuffer.method10387();
                String string = packetBuffer.readStringCp1252NullTerminated();
                Widget widget = ClanChannel.field1807.method7031(n158);
                if (!string.equals(widget.text)) {
                    widget.text = string;
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3546 == packetWriter.serverPacket) {
                WorldMapLabelSize.privateChatMode = class463.method9025(packetBuffer.readUnsignedByte());
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3564 == packetWriter.serverPacket) {
                isCameraLocked = true;
                field762 = false;
                field757 = true;
                class280.field3067 = packetBuffer.readUnsignedByte();
                field801 = packetBuffer.readUnsignedByte();
                class416.field4710 = packetBuffer.readUnsignedShort();
                int n159 = packetBuffer.readUnsignedShort();
                n = packetBuffer.readUnsignedByte();
                int n160 = Coord.method6980(class280.field3067);
                int n161 = Coord.method6980(field801);
                int n162 = Canvas.method337(GameEngine.field189, n160, n161, GameEngine.field189.field1321) - class416.field4710;
                int n163 = n160 - Buddy.cameraX;
                int n164 = n162 - Message.cameraY;
                int n165 = n161 - class31.cameraZ;
                double d = Math.sqrt(n165 * n165 + n163 * n163);
                int n166 = class345.method6949((int)(Math.atan2(n164, d) * (double)325.949f) & 0x7FF);
                int n167 = class119.method3301((int)(Math.atan2(n163, n165) * (double)-325.949f) & 0x7FF);
                field761 = new class520(class159.cameraPitch, n166, n159, n);
                field725 = new class520(class183.cameraYaw, n167, n159, n);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3516 == packetWriter.serverPacket) {
                class150.method3598();
                runEnergy = packetBuffer.readUnsignedShort();
                field499 = cycleCntr;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3569 == packetWriter.serverPacket) {
                int n168 = packetBuffer.method10323();
                n = packetBuffer.method10378();
                Widget widget = ClanChannel.field1807.method7031(n);
                if (widget.modelType != 6 || n168 != widget.modelId) {
                    widget.modelType = 6;
                    widget.modelId = n168;
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3473 == packetWriter.serverPacket) {
                int n169 = packetBuffer.readUnsignedByte();
                n = packetBuffer.readUnsignedByte();
                int n170 = packetBuffer.readUnsignedByte();
                int n171 = packetBuffer.readUnsignedByte();
                Client.field571[n169] = true;
                Client.field764[n169] = n;
                Client.field690[n169] = n170;
                Client.field768[n169] = n171;
                Client.field705[n169] = 0;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3507 == packetWriter.serverPacket) {
                int n172 = packetBuffer.readUnsignedByte();
                if (packetBuffer.readUnsignedByte() == 0) {
                    Client.grandExchangeOffers[n172] = new GrandExchangeOffer();
                    packetBuffer.offset += 18;
                } else {
                    --packetBuffer.offset;
                    Client.grandExchangeOffers[n172] = new GrandExchangeOffer(packetBuffer, false);
                }
                field701 = cycleCntr;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3532 == packetWriter.serverPacket) {
                int n173;
                int n174 = packetBuffer.readUnsignedByte();
                n = packetBuffer.readUnsignedShort();
                class183.field1966 = n173 = packetBuffer.readUnsignedByte();
                if (n174 == 0) {
                    GameEngine.field189.field1321 = n173;
                    class30.field131 = GameEngine.field189;
                } else if (n174 == 1) {
                    class480 class4802 = GameEngine.field189.field1318[n];
                    class4802.field5035.field1321 = n173;
                    class30.field131 = class4802.field5035;
                } else {
                    throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3537 == packetWriter.serverPacket) {
                class10.friendSystem.method2066();
                field697 = cycleCntr;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3524 == packetWriter.serverPacket) {
                field565 = packetBuffer.readUnsignedByte();
                if (field565 == 1) {
                    field530 = packetBuffer.readUnsignedShort();
                }
                if (field565 >= 2 && field565 <= 6) {
                    if (field565 == 2) {
                        field528 = 4096;
                        field529 = 4096;
                    }
                    if (field565 == 3) {
                        field528 = 0;
                        field529 = 4096;
                    }
                    if (field565 == 4) {
                        field528 = 8192;
                        field529 = 4096;
                    }
                    if (field565 == 5) {
                        field528 = 4096;
                        field529 = 0;
                    }
                    if (field565 == 6) {
                        field528 = 4096;
                        field529 = 8192;
                    }
                    field565 = 2;
                    field525 = packetBuffer.readUnsignedShort();
                    field526 = packetBuffer.readUnsignedShort();
                    field527 = packetBuffer.readUnsignedByte() * 2;
                }
                if (field565 == 10) {
                    field524 = packetBuffer.readUnsignedShort();
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3541 == packetWriter.serverPacket) {
                field803 = new class496(UserComparator9.field1513);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3472 == packetWriter.serverPacket) {
                object = packetBuffer.readStringCp1252NullTerminated();
                Object[] objectArray = new Object[((String)object).length() + 1];
                for (int i = ((String)object).length() - 1; i >= 0; --i) {
                    objectArray[i + 1] = ((String)object).charAt(i) == 's' ? packetBuffer.readStringCp1252NullTerminated() : new Integer(packetBuffer.readInt());
                }
                objectArray[0] = new Integer(packetBuffer.readInt());
                ScriptEvent scriptEvent = new ScriptEvent();
                scriptEvent.args = objectArray;
                Friend.runScriptEvent(scriptEvent);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3448 == packetWriter.serverPacket) {
                boolean bl = packetBuffer.method10314() == 1;
                n = packetBuffer.method10335();
                Widget widget = ClanChannel.field1807.method7031(n);
                widget.method7542(ModeWhere.localPlayer.appearance, bl);
                UserComparator8.invalidateWidget(widget);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3498 == packetWriter.serverPacket) {
                FriendSystem.loadRegions(false, packetWriter.packetBuffer);
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3461 == packetWriter.serverPacket) {
                int n175 = packetBuffer.method10334();
                if (n175 == 65535) {
                    n175 = -1;
                }
                rootInterface = n175;
                this.resizeRoot(false);
                class16.method211(n175);
                WorldMapIcon_0.method6334(rootInterface);
                for (n = 0; n < 100; ++n) {
                    Client.field713[n] = true;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3445 == packetWriter.serverPacket) {
                int n176 = packetBuffer.method10323();
                n = packetBuffer.method10387();
                Widget widget = ClanChannel.field1807.method7031(n);
                if (widget.modelType != 2 || n176 != widget.modelId) {
                    widget.modelType = 2;
                    widget.modelId = n176;
                    UserComparator8.invalidateWidget(widget);
                }
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3521 == packetWriter.serverPacket) {
                if (field803 == null) {
                    field803 = new class496(UserComparator9.field1513);
                }
                object = UserComparator9.field1513.method9513(packetBuffer);
                Client.field803.field5127.vmethod10011(((class565)object).field5538, ((class565)object).field5539);
                Client.field694[++Client.field579 - 1 & 0x1F] = ((class565)object).field5538;
                packetWriter.serverPacket = null;
                return true;
            }
            if (ServerPacket.field3455 == packetWriter.serverPacket) {
                field744 = packetBuffer.readUnsignedByte();
                if (field744 == 255) {
                    field744 = 0;
                }
                if ((field745 = packetBuffer.readUnsignedByte()) == 255) {
                    field745 = 0;
                }
                packetWriter.serverPacket = null;
                return true;
            }
            class255.RunException_sendStackTrace("" + (packetWriter.serverPacket != null ? packetWriter.serverPacket.id : -1) + "," + (packetWriter.field1447 != null ? packetWriter.field1447.id : -1) + "," + (packetWriter.field1460 != null ? packetWriter.field1460.id : -1) + "," + packetWriter.field1452, null);
            Client.logOut();
        }
        catch (IOException iOException) {
            MenuAction.method2363();
        }
        catch (Exception exception) {
            String string = "" + (packetWriter.serverPacket != null ? packetWriter.serverPacket.id : -1) + "," + (packetWriter.field1447 != null ? packetWriter.field1447.id : -1) + "," + (packetWriter.field1460 != null ? packetWriter.field1460.id : -1) + "," + packetWriter.field1452 + "," + (ModeWhere.localPlayer.field1266[0] + GameEngine.field189.field1324) + "," + (ModeWhere.localPlayer.field1221[0] + GameEngine.field189.field1325) + ",";
            for (int i = 0; i < packetWriter.field1452 && i < 50; ++i) {
                string = string + packetBuffer.array[i] + ",";
            }
            class255.RunException_sendStackTrace(string, exception);
            Client.logOut();
        }
        return true;
    }

    @ObfuscatedName(value="kp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1984807253")
    @Export(value="menu")
    final void menu() {
        class575 class5752 = field648;
        int n = 0;
        block0: while (true) {
            int n2;
            if (n != 0) {
                if (clickedWidget != null) {
                    return;
                }
                n = MouseHandler.MouseHandler_lastButton;
                if (!isMenuOpen) {
                    if (Client.field648.field5612 > 0) {
                        int n3 = n2 = Client.field648.field5612 - 1;
                        if ((n == 1 || !KeyHandler.mouseCam && n == 4) && this.method1315(Client.field648.field5614[n3], Client.field648.field5628[n3])) {
                            n = 2;
                        }
                        if (n == 1 || !KeyHandler.mouseCam && n == 4) {
                            field648.method10921(n3);
                        }
                        if (n == 2) {
                            this.method1316(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                        }
                    }
                } else {
                    if (n != 1 && (KeyHandler.mouseCam || n != 4) && !field648.method10922(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
                        isMenuOpen = false;
                        field648.method10932();
                    }
                    if (n == 1 || !KeyHandler.mouseCam && n == 4) {
                        field648.method10923(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                        isMenuOpen = false;
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
        boolean bl3 = bl2 = leftClickOpensMenu && Client.field648.field5612 > 2;
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
                isMenuOpen = true;
                field648.method10924();
                return;
            }
            class103 class1032 = (class103)iterator.next();
            class1032.field1319.method4235(false);
        }
    }

    @ObfuscatedName(value="lg")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="126")
    @Export(value="resizeRoot")
    final void resizeRoot(boolean bl) {
        int n = rootInterface;
        int n2 = BuddyRankComparator.canvasWidth;
        int n3 = Huffman.canvasHeight;
        if (ClanChannel.field1807.method7024(n)) {
            ArchiveLoader.resizeInterface(ClanChannel.field1807.field3772[n], -1, n2, n3, bl);
        }
    }

    @ObfuscatedName(value="ll")
    @ObfuscatedSignature(descriptor="(Lna;I)V", garbageValue="2133359849")
    @Export(value="alignWidget")
    void alignWidget(Widget widget) {
        int n;
        int n2;
        Widget widget2;
        Widget widget3 = widget2 = widget.parentId == -1 ? null : ClanChannel.field1807.method7031(widget.parentId);
        if (widget2 != null) {
            n2 = widget2.width;
            n = widget2.height * -1528330031;
        } else {
            n2 = BuddyRankComparator.canvasWidth;
            n = Huffman.canvasHeight;
        }
        GrandExchangeOfferTotalQuantityComparator.alignWidgetSize(widget, n2, n, false);
        ArchiveLoader.alignWidgetPosition(widget, n2, n);
    }

    @ObfuscatedName(value="ms")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-6921")
    final void method1561() {
        UserComparator8.invalidateWidget(clickedWidget);
        ++class243.widgetDragDuration;
        if (field683 && field523) {
            Node node;
            int n = MouseHandler.MouseHandler_x;
            int n2 = MouseHandler.MouseHandler_y;
            n2 -= widgetClickY;
            if ((n -= widgetClickX) < field681) {
                n = field681;
            }
            if (n + Client.clickedWidget.width > field681 + Client.clickedWidgetParent.width) {
                n = field681 + Client.clickedWidgetParent.width - Client.clickedWidget.width;
            }
            if (n2 < field682) {
                n2 = field682;
            }
            if (n2 + Client.clickedWidget.height * -1528330031 > Client.clickedWidgetParent.height * -1528330031 + field682) {
                n2 = field682 + Client.clickedWidgetParent.height * -1528330031 - Client.clickedWidget.height * -1528330031;
            }
            int n3 = n - field721;
            int n4 = n2 - field685;
            int n5 = Client.clickedWidget.dragZoneSize;
            if (class243.widgetDragDuration > Client.clickedWidget.dragThreshold && (n3 > n5 || n3 < -n5 || n4 > n5 || n4 < -n5)) {
                isDraggingWidget = true;
            }
            int n6 = n - field681 + Client.clickedWidgetParent.scrollX;
            int n7 = n2 - field682 + Client.clickedWidgetParent.scrollY;
            if (Client.clickedWidget.onDrag != null && isDraggingWidget) {
                node = new ScriptEvent();
                node.widget = clickedWidget;
                node.mouseX = n6;
                node.mouseY = n7;
                node.args = Client.clickedWidget.onDrag;
                Friend.runScriptEvent(node);
            }
            if (MouseHandler.MouseHandler_currentButton == 0) {
                if (!isDraggingWidget) {
                    if (class318.tempMenuAction != null && !this.method1315(class318.tempMenuAction.field906, class318.tempMenuAction.field912)) {
                        if (Client.field648.field5612 > 0) {
                            int n8 = field721 + widgetClickX;
                            int n9 = field685 + widgetClickY;
                            class36.method721(class318.tempMenuAction, n8, n9);
                            class318.tempMenuAction = null;
                        }
                    } else {
                        this.method1316(field721 + widgetClickX, widgetClickY + field685);
                    }
                } else {
                    if (Client.clickedWidget.onDragComplete != null) {
                        node = new ScriptEvent();
                        node.widget = clickedWidget;
                        node.mouseX = n6;
                        node.mouseY = n7;
                        node.dragTarget = draggedOnWidget;
                        node.args = Client.clickedWidget.onDragComplete;
                        Friend.runScriptEvent(node);
                    }
                    if (draggedOnWidget != null && class211.method4832(clickedWidget) != null) {
                        node = ScriptEvent.getPacketBufferNode(ClientPacket.field3317, Client.packetWriter.isaacCipher);
                        ((PacketBufferNode)node).packetBuffer.writeShort(Client.clickedWidget.itemId);
                        ((PacketBufferNode)node).packetBuffer.writeInt(Client.draggedOnWidget.childIndex);
                        ((PacketBufferNode)node).packetBuffer.writeInt(Client.clickedWidget.childIndex);
                        ((PacketBufferNode)node).packetBuffer.method10268(Client.draggedOnWidget.id);
                        ((PacketBufferNode)node).packetBuffer.writeShort(Client.draggedOnWidget.itemId);
                        ((PacketBufferNode)node).packetBuffer.method10268(Client.clickedWidget.id);
                        packetWriter.addNode((PacketBufferNode)node);
                    }
                }
                clickedWidget = null;
            }
            return;
        }
        if (class243.widgetDragDuration > 1) {
            if (!isDraggingWidget && Client.field648.field5612 > 0) {
                int n = field721 + widgetClickX;
                int n10 = field685 + widgetClickY;
                class36.method721(class318.tempMenuAction, n, n10);
                class318.tempMenuAction = null;
            }
            clickedWidget = null;
        }
    }

    @Override
    @ObfuscatedName(value="oe")
    @ObfuscatedSignature(descriptor="(B)Lwb;", garbageValue="-23")
    @Export(value="username")
    public Username username() {
        return ModeWhere.localPlayer != null ? ModeWhere.localPlayer.username : null;
    }

    @ObfuscatedName(value="pc")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1543488022")
    void method1321(int n) {
        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3342, Client.packetWriter.isaacCipher);
        packetBufferNode.packetBuffer.writeByte(n);
        packetWriter.addNode(packetBufferNode);
    }

    @ObfuscatedName(value="pq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1324183200")
    void method1322(int n) {
        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3371, Client.packetWriter.isaacCipher);
        packetBufferNode.packetBuffer.writeByte(n);
        packetWriter.addNode(packetBufferNode);
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
    @Export(value="kill0")
    @ObfuscatedName(value="init")
    public final void kill0() {
        try {
            if (!this.checkHost()) {
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
                        class404[] class404Array = n < 0 || n >= Language.Language_valuesOrdered.length ? null : Language.Language_valuesOrdered[n];
                        ScriptFrame.clientLanguage = class404Array;
                        continue block22;
                    }
                    case 3: {
                        if (string.equalsIgnoreCase("true")) {
                            isMembersWorld = true;
                            continue block22;
                        }
                        isMembersWorld = false;
                        continue block22;
                    }
                    case 11: {
                        FriendLoginUpdate.field4996 = string;
                        continue block22;
                    }
                    case 15: {
                        gameBuild = Integer.parseInt(string);
                        continue block22;
                    }
                    case 9: {
                        Language.field4674 = string;
                        continue block22;
                    }
                    case 21: {
                        field766 = Integer.parseInt(string);
                        continue block22;
                    }
                    case 22: {
                        RouteStrategy.field3024 = string;
                        continue block22;
                    }
                    case 10: {
                        class404[] class404Array = new StudioGame[]{StudioGame.game3, StudioGame.oldscape, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game4, StudioGame.game5};
                        StructComposition.field2749 = (StudioGame)StructComposition.findEnumerated(class404Array, Integer.parseInt(string));
                        if (StructComposition.field2749 == StudioGame.oldscape) {
                            class383.loginType = LoginType.oldscape;
                            continue block22;
                        }
                        class383.loginType = LoginType.field5358;
                        continue block22;
                    }
                    case 8: {
                        if (!string.equalsIgnoreCase("true")) continue block22;
                        continue block22;
                    }
                    case 12: {
                        worldId = Integer.parseInt(string);
                        continue block22;
                    }
                    case 5: {
                        worldProperties = Integer.parseInt(string);
                        continue block22;
                    }
                    case 4: {
                        if (clientType != -1) continue block22;
                        clientType = Integer.parseInt(string);
                        continue block22;
                    }
                    case 7: {
                        class438.field4820 = ChatChannel.method2508(Integer.parseInt(string));
                    }
                }
            }
            class187.Scene_isLowDetail = false;
            isLowDetail = false;
            FontName.worldHost = this.getCodeBase().getHost();
            HitSplatDefinition.field2760 = new class392();
            String string = class438.field4820.name;
            int n = 0;
            if ((worldProperties & class552.field5442.rsOrdinal()) != 0) {
                class255.field2724 = "beta";
            }
            try {
                class30.method483("oldschool", class255.field2724, string, n, 23);
            }
            catch (Exception exception) {
                class255.RunException_sendStackTrace(null, exception);
            }
            client = this;
            class226.field2468 = clientType;
            class431.field4782 = System.getenv("JX_ACCESS_TOKEN");
            class165.field1782 = System.getenv("JX_REFRESH_TOKEN");
            class18.field77 = System.getenv("JX_SESSION_ID");
            DevicePcmPlayerProvider.field94 = System.getenv("JX_CHARACTER_ID");
            class174.method3886(System.getenv("JX_DISPLAY_NAME"));
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
                this.field547 = true;
            }
            if (field498 == -1) {
                field498 = this.method1441() || this.method1418() ? 5 : 0;
            }
            this.startThread(765, 503, 228, 1);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw class506.newRunException(runtimeException, "client.init(" + ')');
        }
    }

    @Override
    public void setOtlTokenRequester(OtlTokenRequester otlTokenRequester) {
        if (otlTokenRequester != null) {
            this.field545 = otlTokenRequester;
            Varcs.method3212(10);
            return;
        }
    }

    @Override
    public boolean isOnLoginScreen() {
        return gameState == 10;
    }

    @Override
    @ObfuscatedSignature(descriptor="(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
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
    @Export(value="logOut")
    static final void logOut() {
        packetWriter.close();
        class4.method20();
        field508.method2723();
        field673.method3139();
        field575.method5738();
        System.gc();
        UserComparator3.method3347(0, 0);
        class153.method3619();
        playingJingle = false;
        World.method1957();
        class360.updateGameState(10);
        field693 = 0;
        class143.method3517().method4979();
        class143.method3517().method4980();
    }

    @ObfuscatedName(value="me")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-2001451968")
    static final void method1709(int n, int n2) {
        if (!ClanChannel.field1807.method7024(n)) {
            return;
        }
        BuddyRankComparator.runComponentCloseListeners(ClanChannel.field1807.field3772[n], n2);
    }
}

