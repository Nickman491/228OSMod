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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="na")
@Implements(value="Widget")
public class Widget
extends Node {
    @ObfuscatedName(value="aj")
    public static boolean field3868 = false;
    @ObfuscatedName(value="vg")
    @ObfuscatedGetter(longValue=-8429515795117627941L)
    static long field3909;
    @ObfuscatedName(value="bu")
    @Export(value="isIf3")
    public boolean isIf3 = false;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=2074413731)
    @Export(value="id")
    public int id = -1;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=-1554046541)
    @Export(value="childIndex")
    public int childIndex = -1;
    @ObfuscatedName(value="bb")
    String field3872;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=-307708893)
    @Export(value="type")
    public int type;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=1695334863)
    @Export(value="buttonType")
    public int buttonType = 0;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=-1863322819)
    @Export(value="contentType")
    public int contentType = 0;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=-1878831771)
    @Export(value="xAlignment")
    public int xAlignment = 0;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-827055987)
    @Export(value="yAlignment")
    public int yAlignment = 0;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=-1295695081)
    @Export(value="widthAlignment")
    public int widthAlignment = 0;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=1815658371)
    @Export(value="heightAlignment")
    public int heightAlignment = 0;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=-238891885)
    @Export(value="rawX")
    public int rawX = 0;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=737569405)
    @Export(value="rawY")
    public int rawY = 0;
    @ObfuscatedName(value="bg")
    @ObfuscatedGetter(intValue=-279349307)
    @Export(value="rawWidth")
    public int rawWidth = 0;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=1486081197)
    @Export(value="rawHeight")
    public int rawHeight = 0;
    @ObfuscatedName(value="bv")
    @ObfuscatedGetter(intValue=-448464889)
    @Export(value="x")
    public int x = 0;
    @ObfuscatedName(value="bq")
    @ObfuscatedGetter(intValue=424966339)
    @Export(value="y")
    public int y = 0;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=238570419)
    @Export(value="width")
    public int width = 0;
    @ObfuscatedName(value="bk")
    @Export(value="height")
    public int height = 0;
    @ObfuscatedName(value="bs")
    @ObfuscatedGetter(intValue=1610367691)
    public int field3888 = 1;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=298923057)
    public int field4008 = 1;
    @ObfuscatedName(value="bo")
    @ObfuscatedGetter(intValue=2112209473)
    @Export(value="parentId")
    public int parentId = -1;
    @ObfuscatedName(value="be")
    @Export(value="isHidden")
    public boolean isHidden = false;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=1838023813)
    @Export(value="scrollX")
    public int scrollX = 0;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=850529927)
    @Export(value="scrollY")
    public int scrollY = 0;
    @ObfuscatedName(value="bl")
    @ObfuscatedGetter(intValue=575245429)
    @Export(value="scrollWidth")
    public int scrollWidth = 0;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=-1895978207)
    @Export(value="scrollHeight")
    public int scrollHeight = 0;
    @ObfuscatedName(value="cn")
    @ObfuscatedGetter(intValue=94778339)
    @Export(value="color")
    public int color = 0;
    @ObfuscatedName(value="cc")
    @ObfuscatedGetter(intValue=877544811)
    @Export(value="color2")
    public int color2 = 0;
    @ObfuscatedName(value="co")
    @ObfuscatedGetter(intValue=516625493)
    public int field3892 = 0;
    @ObfuscatedName(value="ca")
    @ObfuscatedGetter(intValue=-120009361)
    public int field3900 = 0;
    @ObfuscatedName(value="cg")
    @Export(value="fill")
    public boolean fill = false;
    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="Lvb;")
    @Export(value="fillMode")
    public class568 fillMode = class568.SOLID;
    @ObfuscatedName(value="cz")
    @ObfuscatedGetter(intValue=671833981)
    @Export(value="transparencyTop")
    public int transparencyTop = 0;
    @ObfuscatedName(value="cy")
    @ObfuscatedGetter(intValue=2072081719)
    @Export(value="transparencyBot")
    public int transparencyBot = 0;
    @ObfuscatedName(value="cu")
    @ObfuscatedGetter(intValue=-491137507)
    @Export(value="lineWid")
    public int lineWid = 1;
    @ObfuscatedName(value="cq")
    public boolean field3907 = false;
    @ObfuscatedName(value="cf")
    @ObfuscatedGetter(intValue=-1095969399)
    @Export(value="spriteId2")
    public int spriteId2 = -1;
    @ObfuscatedName(value="ct")
    @ObfuscatedGetter(intValue=1889296109)
    @Export(value="spriteId")
    public int spriteId = -1;
    @ObfuscatedName(value="ci")
    public String field3908;
    @ObfuscatedName(value="cl")
    @ObfuscatedGetter(intValue=1641091165)
    @Export(value="spriteAngle")
    public int spriteAngle = 0;
    @ObfuscatedName(value="cw")
    @Export(value="spriteTiling")
    public boolean spriteTiling = false;
    @ObfuscatedName(value="cj")
    @ObfuscatedGetter(intValue=-593563737)
    @Export(value="outline")
    public int outline = 0;
    @ObfuscatedName(value="cx")
    @ObfuscatedGetter(intValue=-1287757995)
    @Export(value="spriteShadow")
    public int spriteShadow = 0;
    @ObfuscatedName(value="cd")
    @Export(value="spriteFlipV")
    public boolean spriteFlipV;
    @ObfuscatedName(value="cv")
    @Export(value="spriteFlipH")
    public boolean spriteFlipH;
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=32495203)
    @Export(value="modelType")
    public int modelType = 1;
    @ObfuscatedName(value="cs")
    @ObfuscatedGetter(intValue=-893425207)
    @Export(value="modelId")
    public int modelId = -1;
    @ObfuscatedName(value="cm")
    @ObfuscatedGetter(intValue=1183330481)
    int field3917 = 1;
    @ObfuscatedName(value="ce")
    @ObfuscatedGetter(intValue=-243063387)
    int field3918 = -1;
    @ObfuscatedName(value="cr")
    @ObfuscatedGetter(intValue=-992365821)
    @Export(value="sequenceId")
    public int sequenceId = -1;
    @ObfuscatedName(value="ch")
    @ObfuscatedGetter(intValue=612527205)
    @Export(value="sequenceId2")
    public int sequenceId2 = -1;
    @ObfuscatedName(value="dh")
    @ObfuscatedGetter(intValue=-834651595)
    @Export(value="modelOffsetX")
    public int modelOffsetX = 0;
    @ObfuscatedName(value="dn")
    @ObfuscatedGetter(intValue=802276655)
    @Export(value="modelOffsetY")
    public int modelOffsetY = 0;
    @ObfuscatedName(value="dc")
    @ObfuscatedGetter(intValue=862496725)
    @Export(value="modelAngleX")
    public int modelAngleX = 0;
    @ObfuscatedName(value="dm")
    @ObfuscatedGetter(intValue=421491339)
    @Export(value="modelAngleY")
    public int modelAngleY = 0;
    @ObfuscatedName(value="dj")
    @ObfuscatedGetter(intValue=-752612347)
    @Export(value="modelAngleZ")
    public int modelAngleZ = 0;
    @ObfuscatedName(value="dk")
    @ObfuscatedGetter(intValue=-1730904993)
    @Export(value="modelZoom")
    public int modelZoom = 100;
    @ObfuscatedName(value="ds")
    @ObfuscatedGetter(intValue=-1126089181)
    public int field3927 = 0;
    @ObfuscatedName(value="dr")
    @ObfuscatedGetter(intValue=-1570591585)
    public int field3928 = 0;
    @ObfuscatedName(value="dl")
    @ObfuscatedSignature(descriptor="Lny;")
    public PlayerComposition field3924;
    @ObfuscatedName(value="do")
    @Export(value="modelOrthog")
    public boolean modelOrthog = false;
    @ObfuscatedName(value="dg")
    @Export(value="modelTransparency")
    public boolean modelTransparency = false;
    @ObfuscatedName(value="dt")
    @ObfuscatedGetter(intValue=66306423)
    @Export(value="itemQuantityMode")
    public int itemQuantityMode = 2;
    @ObfuscatedName(value="df")
    @ObfuscatedGetter(intValue=-571523933)
    @Export(value="fontId")
    public int fontId = -1;
    @ObfuscatedName(value="de")
    @Export(value="text")
    public String text = "";
    @ObfuscatedName(value="dw")
    @Export(value="text2")
    public String text2 = "";
    @ObfuscatedName(value="dv")
    @ObfuscatedGetter(intValue=-445810873)
    @Export(value="textLineHeight")
    public int textLineHeight = 0;
    @ObfuscatedName(value="dx")
    @ObfuscatedGetter(intValue=-1101355927)
    @Export(value="textXAlignment")
    public int textXAlignment = 0;
    @ObfuscatedName(value="dd")
    @ObfuscatedGetter(intValue=1347532343)
    @Export(value="textYAlignment")
    public int textYAlignment = 0;
    @ObfuscatedName(value="dy")
    @Export(value="textShadowed")
    public boolean textShadowed = false;
    @ObfuscatedName(value="db")
    int[] field3940;
    @ObfuscatedName(value="du")
    int[] field3941;
    @ObfuscatedName(value="da")
    int[] field3942;
    @ObfuscatedName(value="dp")
    String[] field3943;
    @ObfuscatedName(value="di")
    @ObfuscatedSignature(descriptor="Lii;")
    class212 field3962;
    @ObfuscatedName(value="dq")
    @ObfuscatedGetter(intValue=630542237)
    int field3945 = -1;
    @ObfuscatedName(value="dz")
    HashMap field3920;
    @ObfuscatedName(value="ex")
    HashMap field3947;
    @ObfuscatedName(value="ef")
    @ObfuscatedSignature(descriptor="Lnk;")
    class357 field3946;
    @ObfuscatedName(value="ei")
    @ObfuscatedGetter(intValue=-582573061)
    @Export(value="flags")
    public int flags = 0;
    @ObfuscatedName(value="ej")
    public boolean field3950 = false;
    @ObfuscatedName(value="eg")
    public byte[][] field3861;
    @ObfuscatedName(value="ek")
    public byte[][] field3952;
    @ObfuscatedName(value="et")
    public int[] field3964;
    @ObfuscatedName(value="ec")
    public int[] field3864;
    @ObfuscatedName(value="ez")
    @Export(value="dataText")
    public String dataText = "";
    @ObfuscatedName(value="eb")
    @Export(value="actions")
    public String[] actions;
    @ObfuscatedName(value="en")
    public String[][] field3957;
    @ObfuscatedName(value="ee")
    public int field3958 = 319558396;
    @ObfuscatedName(value="ev")
    @ObfuscatedSignature(descriptor="Lna;")
    @Export(value="parent")
    public Widget parent = null;
    @ObfuscatedName(value="el")
    @ObfuscatedGetter(intValue=-89573721)
    @Export(value="dragZoneSize")
    public int dragZoneSize = 0;
    @ObfuscatedName(value="ea")
    @ObfuscatedGetter(intValue=-1300260515)
    @Export(value="dragThreshold")
    public int dragThreshold = 0;
    @ObfuscatedName(value="eu")
    @Export(value="isScrollBar")
    public boolean isScrollBar = false;
    @ObfuscatedName(value="ey")
    @Export(value="spellActionName")
    public String spellActionName = "";
    @ObfuscatedName(value="eh")
    @Export(value="hasListener")
    public boolean hasListener = false;
    @ObfuscatedName(value="ew")
    @Export(value="onLoad")
    public Object[] onLoad;
    @ObfuscatedName(value="ed")
    @Export(value="onClick")
    public Object[] onClick;
    @ObfuscatedName(value="fz")
    @Export(value="onClickRepeat")
    public Object[] onClickRepeat;
    @ObfuscatedName(value="fn")
    @Export(value="onRelease")
    public Object[] onRelease;
    @ObfuscatedName(value="fd")
    @Export(value="onHold")
    public Object[] onHold;
    @ObfuscatedName(value="fc")
    @Export(value="onMouseOver")
    public Object[] onMouseOver;
    @ObfuscatedName(value="fb")
    @Export(value="onMouseRepeat")
    public Object[] onMouseRepeat;
    @ObfuscatedName(value="fg")
    @Export(value="onMouseLeave")
    public Object[] onMouseLeave;
    @ObfuscatedName(value="ff")
    @Export(value="onDrag")
    public Object[] onDrag;
    @ObfuscatedName(value="fs")
    @Export(value="onDragComplete")
    public Object[] onDragComplete;
    @ObfuscatedName(value="fm")
    @Export(value="onTargetEnter")
    public Object[] onTargetEnter;
    @ObfuscatedName(value="fx")
    @Export(value="onTargetLeave")
    public Object[] onTargetLeave;
    @ObfuscatedName(value="fi")
    @Export(value="onVarTransmit")
    public Object[] onVarTransmit;
    @ObfuscatedName(value="fu")
    @Export(value="varTransmitTriggers")
    public int[] varTransmitTriggers;
    @ObfuscatedName(value="fq")
    @Export(value="onInvTransmit")
    public Object[] onInvTransmit;
    @ObfuscatedName(value="fr")
    @Export(value="invTransmitTriggers")
    public int[] invTransmitTriggers;
    @ObfuscatedName(value="fl")
    @Export(value="onStatTransmit")
    public Object[] onStatTransmit;
    @ObfuscatedName(value="fe")
    @Export(value="statTransmitTriggers")
    public int[] statTransmitTriggers;
    @ObfuscatedName(value="ft")
    @Export(value="onTimer")
    public Object[] onTimer;
    @ObfuscatedName(value="fa")
    @Export(value="onOp")
    public Object[] onOp;
    @ObfuscatedName(value="fk")
    public Object[] field3985;
    @ObfuscatedName(value="fo")
    @Export(value="onScroll")
    public Object[] onScroll;
    @ObfuscatedName(value="fp")
    @Export(value="onChatTransmit")
    public Object[] onChatTransmit;
    @ObfuscatedName(value="fh")
    @Export(value="onKey")
    public Object[] onKey;
    @ObfuscatedName(value="fw")
    public Object[] field3989;
    @ObfuscatedName(value="fv")
    public Object[] field3901;
    @ObfuscatedName(value="fj")
    @Export(value="onFriendTransmit")
    public Object[] onFriendTransmit;
    @ObfuscatedName(value="fy")
    @Export(value="onClanTransmit")
    public Object[] onClanTransmit;
    @ObfuscatedName(value="gg")
    public Object[] field3993;
    @ObfuscatedName(value="gn")
    public Object[] field3988;
    @ObfuscatedName(value="gw")
    @Export(value="onMiscTransmit")
    public Object[] onMiscTransmit;
    @ObfuscatedName(value="gc")
    @Export(value="onDialogAbort")
    public Object[] onDialogAbort;
    @ObfuscatedName(value="gb")
    @Export(value="onSubChange")
    public Object[] onSubChange;
    @ObfuscatedName(value="gq")
    @Export(value="onResize")
    public Object[] onResize;
    @ObfuscatedName(value="gr")
    @Export(value="onStockTransmit")
    public Object[] onStockTransmit;
    @ObfuscatedName(value="ga")
    public Object[] field4000;
    @ObfuscatedName(value="gp")
    public Object[] field4023;
    @ObfuscatedName(value="gy")
    @Export(value="cs1Instructions")
    public int[][] cs1Instructions;
    @ObfuscatedName(value="gt")
    @Export(value="cs1Comparisons")
    public int[] cs1Comparisons;
    @ObfuscatedName(value="gv")
    @Export(value="cs1ComparisonValues")
    public int[] cs1ComparisonValues;
    @ObfuscatedName(value="gl")
    @ObfuscatedGetter(intValue=-524432329)
    @Export(value="mouseOverRedirect")
    public int mouseOverRedirect = -1;
    @ObfuscatedName(value="gm")
    public String field4006 = "";
    @ObfuscatedName(value="gk")
    public String field4007 = "Ok";
    @ObfuscatedName(value="gd")
    public int[] field3903;
    @ObfuscatedName(value="go")
    public int[] field4009;
    @ObfuscatedName(value="gz")
    @ObfuscatedGetter(intValue=-1482639407)
    @Export(value="itemId")
    public int itemId = -1;
    @ObfuscatedName(value="ge")
    @ObfuscatedGetter(intValue=-910176587)
    @Export(value="itemQuantity")
    public int itemQuantity = 0;
    @ObfuscatedName(value="gs")
    @ObfuscatedGetter(intValue=1481692413)
    @Export(value="modelFrame")
    public int modelFrame = 0;
    @ObfuscatedName(value="gj")
    @ObfuscatedGetter(intValue=-966650257)
    @Export(value="modelFrameCycle")
    public int modelFrameCycle = 0;
    @ObfuscatedName(value="gx")
    @ObfuscatedSignature(descriptor="[Lna;")
    @Export(value="children")
    public Widget[] children;
    @ObfuscatedName(value="gi")
    public boolean field3959 = false;
    @ObfuscatedName(value="gh")
    public boolean field4016 = false;
    @ObfuscatedName(value="gf")
    @ObfuscatedGetter(intValue=-664324339)
    public int field4017 = -1;
    @ObfuscatedName(value="gu")
    @ObfuscatedGetter(intValue=-1753747975)
    public int field4018 = 0;
    @ObfuscatedName(value="hq")
    @ObfuscatedGetter(intValue=1564458011)
    public int field4019 = 0;
    @ObfuscatedName(value="hg")
    @ObfuscatedGetter(intValue=1391734537)
    public int field3954 = 0;
    @ObfuscatedName(value="hn")
    @ObfuscatedGetter(intValue=1544756993)
    @Export(value="rootIndex")
    public int rootIndex = -1;
    @ObfuscatedName(value="hx")
    @ObfuscatedGetter(intValue=2000253657)
    @Export(value="cycle")
    public int cycle = -1;
    @ObfuscatedName(value="hu")
    public int[] field3953;
    @ObfuscatedName(value="hj")
    @Export(value="noClickThrough")
    public boolean noClickThrough = false;
    @ObfuscatedName(value="hp")
    @Export(value="noScrollThrough")
    public boolean noScrollThrough = false;
    @ObfuscatedName(value="hr")
    @Export(value="prioritizeMenuEntry")
    public boolean prioritizeMenuEntry = false;

    public Widget() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedSignature(descriptor="(Lna;I)V")
    public Widget(Widget widget, int n) {
        int n2;
        this.isIf3 = widget.isIf3;
        this.id = widget.id;
        this.childIndex = n;
        this.field3872 = widget.field3872;
        this.type = widget.type;
        this.buttonType = widget.buttonType;
        this.contentType = widget.contentType;
        this.xAlignment = widget.xAlignment;
        this.yAlignment = widget.yAlignment;
        this.widthAlignment = widget.widthAlignment;
        this.heightAlignment = widget.heightAlignment;
        this.rawX = widget.rawX;
        this.rawY = widget.rawY;
        this.rawWidth = widget.rawWidth;
        this.rawHeight = widget.rawHeight;
        this.x = widget.x;
        this.y = widget.y;
        this.width = widget.width;
        this.height = widget.height;
        this.field3888 = widget.field3888;
        this.field4008 = widget.field4008;
        this.parentId = widget.parentId;
        this.isHidden = widget.isHidden;
        this.scrollX = widget.scrollX;
        this.scrollY = widget.scrollY;
        this.scrollWidth = widget.scrollWidth;
        this.scrollHeight = widget.scrollHeight;
        this.color = widget.color;
        this.color2 = widget.color2;
        this.field3892 = widget.field3892;
        this.field3900 = widget.field3900;
        this.fill = widget.fill;
        this.fillMode = widget.fillMode;
        this.transparencyTop = widget.transparencyTop;
        this.transparencyBot = widget.transparencyBot;
        this.lineWid = widget.lineWid;
        this.field3907 = widget.field3907;
        this.spriteId2 = widget.spriteId2;
        this.spriteId = widget.spriteId;
        this.field3908 = widget.field3908;
        this.spriteAngle = widget.spriteAngle;
        this.spriteTiling = widget.spriteTiling;
        this.outline = widget.outline;
        this.spriteShadow = widget.spriteShadow;
        this.spriteFlipV = widget.spriteFlipV;
        this.spriteFlipH = widget.spriteFlipH;
        this.modelType = widget.modelType;
        this.modelId = widget.modelId;
        this.field3917 = widget.field3917;
        this.field3918 = widget.field3918;
        this.sequenceId = widget.sequenceId;
        this.sequenceId2 = widget.sequenceId2;
        this.modelOffsetX = widget.modelOffsetX;
        this.modelOffsetY = widget.modelOffsetY;
        this.modelAngleX = widget.modelAngleX;
        this.modelAngleY = widget.modelAngleY;
        this.modelAngleZ = widget.modelAngleZ;
        this.modelZoom = widget.modelZoom;
        this.field3927 = widget.field3927;
        this.field3928 = widget.field3928;
        if (widget.field3924 != null) {
            this.field3924 = new PlayerComposition(widget.field3924);
        }
        this.modelOrthog = widget.modelOrthog;
        this.modelTransparency = widget.modelTransparency;
        this.itemQuantityMode = widget.itemQuantityMode;
        this.fontId = widget.fontId;
        this.text = widget.text;
        this.text2 = widget.text2;
        this.textLineHeight = widget.textLineHeight;
        this.textXAlignment = widget.textXAlignment;
        this.textYAlignment = widget.textYAlignment;
        this.textShadowed = widget.textShadowed;
        this.field3940 = this.method7409(widget.field3940);
        this.field3941 = this.method7409(widget.field3941);
        this.field3942 = this.method7409(widget.field3942);
        this.field3943 = (String[])this.method7408(widget.field3943);
        if (widget.field3962 != null) {
            this.field3962 = new class212(widget.field3962);
        }
        this.field3945 = widget.field3945;
        this.field3920 = widget.field3920;
        if (widget.field3947 != null) {
            this.field3947 = new HashMap();
            this.field3947.putAll(widget.field3947);
        }
        this.field3946 = null;
        this.flags = widget.flags;
        this.field3950 = widget.field3950;
        if (widget.field3861 != null) {
            this.field3861 = new byte[widget.field3861.length][];
            for (n2 = 0; n2 < widget.field3861.length; ++n2) {
                this.field3861[n2] = new byte[widget.field3861[n2].length];
                System.arraycopy(widget.field3861[n2], 0, this.field3861[n2], 0, widget.field3861[n2].length);
            }
        }
        if (widget.field3952 != null) {
            this.field3952 = new byte[widget.field3952.length][];
            for (n2 = 0; n2 < widget.field3952.length; ++n2) {
                this.field3952[n2] = new byte[widget.field3952[n2].length];
                System.arraycopy(widget.field3952[n2], 0, this.field3952[n2], 0, widget.field3952[n2].length);
            }
        }
        this.field3964 = this.method7409(widget.field3964);
        this.field3864 = this.method7409(widget.field3864);
        this.dataText = widget.dataText;
        this.actions = (String[])this.method7408(widget.actions);
        if (widget.field3957 != null) {
            this.field3957 = new String[widget.field3957.length][];
            for (n2 = 0; n2 < widget.field3957.length; ++n2) {
                this.field3957[n2] = new String[widget.field3957[n2].length];
                System.arraycopy(widget.field3957[n2], 0, this.field3957[n2], 0, widget.field3957[n2].length);
            }
        }
        this.field3958 = widget.field3958;
        this.parent = widget.parent;
        this.dragZoneSize = widget.dragZoneSize;
        this.dragThreshold = widget.dragThreshold;
        this.isScrollBar = widget.isScrollBar;
        this.spellActionName = widget.spellActionName;
        this.hasListener = widget.hasListener;
        this.onLoad = widget.onLoad;
        this.onClick = widget.onClick;
        this.onClickRepeat = widget.onClickRepeat;
        this.onRelease = widget.onRelease;
        this.onHold = widget.onHold;
        this.onMouseOver = widget.onMouseOver;
        this.onMouseRepeat = widget.onMouseRepeat;
        this.onMouseLeave = widget.onMouseLeave;
        this.onDrag = widget.onDrag;
        this.onDragComplete = widget.onDragComplete;
        this.onTargetEnter = widget.onTargetEnter;
        this.onTargetLeave = widget.onTargetLeave;
        this.onVarTransmit = widget.onVarTransmit;
        this.varTransmitTriggers = widget.varTransmitTriggers;
        this.onInvTransmit = widget.onInvTransmit;
        this.invTransmitTriggers = widget.invTransmitTriggers;
        this.onStatTransmit = widget.onStatTransmit;
        this.statTransmitTriggers = widget.statTransmitTriggers;
        this.onTimer = widget.onTimer;
        this.onOp = widget.onOp;
        this.field3985 = widget.field3985;
        this.onScroll = widget.onScroll;
        this.onChatTransmit = widget.onChatTransmit;
        this.onKey = widget.onKey;
        this.field3989 = widget.field3989;
        this.field3901 = widget.field3901;
        this.onFriendTransmit = widget.onFriendTransmit;
        this.onClanTransmit = widget.onClanTransmit;
        this.field3993 = widget.field3993;
        this.field3988 = widget.field3988;
        this.onMiscTransmit = widget.onMiscTransmit;
        this.onDialogAbort = widget.onDialogAbort;
        this.onSubChange = widget.onSubChange;
        this.onResize = widget.onResize;
        this.onStockTransmit = widget.onStockTransmit;
        this.field4000 = widget.field4000;
        this.field4023 = widget.field4023;
        this.cs1Instructions = widget.cs1Instructions;
        this.cs1Comparisons = this.method7409(widget.cs1Comparisons);
        this.cs1ComparisonValues = this.method7409(widget.cs1ComparisonValues);
        this.mouseOverRedirect = widget.mouseOverRedirect;
        this.field4006 = widget.field4006;
        this.field4007 = widget.field4007;
        this.field3903 = this.method7409(widget.field3903);
        this.field4009 = this.method7409(widget.field4009);
        this.itemId = widget.itemId;
        this.itemQuantity = widget.itemQuantity;
        this.modelFrame = widget.modelFrame;
        this.modelFrameCycle = widget.modelFrameCycle;
        if (widget.children != null) {
            this.children = new Widget[widget.children.length];
            for (n2 = 0; n2 < widget.children.length; ++n2) {
                this.children[n2] = new Widget(widget.children[n2], widget.children[n2].childIndex);
            }
        }
        this.field3959 = widget.field3959;
        this.field4016 = widget.field4016;
        this.field4017 = widget.field4017;
        this.field4018 = widget.field4018;
        this.field4019 = widget.field4019;
        this.field3954 = widget.field3954;
        this.rootIndex = widget.rootIndex;
        this.cycle = widget.cycle;
        this.field3953 = this.method7409(widget.field3953);
        this.noClickThrough = widget.noClickThrough;
        this.noScrollThrough = widget.noScrollThrough;
        this.prioritizeMenuEntry = widget.prioritizeMenuEntry;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Ljava/lang/Object;B)[Ljava/lang/Object;", garbageValue="86")
    Object[] method7408(Object[] objectArray) {
        return objectArray != null ? Arrays.copyOf(objectArray, objectArray.length) : null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([IB)[I", garbageValue="-20")
    int[] method7409(int[] nArray) {
        return nArray != null ? Arrays.copyOf(nArray, nArray.length) : null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-2144733483")
    @Export(value="decodeLegacy")
    void decodeLegacy(Buffer buffer) {
        int n;
        int n2;
        int n3;
        this.isIf3 = false;
        this.type = buffer.readUnsignedByte();
        this.buttonType = buffer.readUnsignedByte();
        this.contentType = buffer.readUnsignedShort();
        this.rawX = buffer.readShort();
        this.rawY = buffer.readShort();
        this.rawWidth = buffer.readUnsignedShort();
        this.rawHeight = buffer.readUnsignedShort();
        this.transparencyTop = buffer.readUnsignedByte();
        this.parentId = buffer.readUnsignedShort();
        this.parentId = this.parentId == 65535 ? -1 : (this.id & 0xFFFF0000) + this.parentId;
        this.mouseOverRedirect = buffer.readUnsignedShort();
        if (this.mouseOverRedirect == 65535) {
            this.mouseOverRedirect = -1;
        }
        if ((n3 = buffer.readUnsignedByte()) > 0) {
            this.cs1Comparisons = new int[n3];
            this.cs1ComparisonValues = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.cs1Comparisons[n2] = buffer.readUnsignedByte();
                this.cs1ComparisonValues[n2] = buffer.readUnsignedShort();
            }
        }
        if ((n2 = buffer.readUnsignedByte()) > 0) {
            this.cs1Instructions = new int[n2][];
            for (n = 0; n < n2; ++n) {
                int n4 = buffer.readUnsignedShort();
                this.cs1Instructions[n] = new int[n4];
                for (int i = 0; i < n4; ++i) {
                    this.cs1Instructions[n][i] = buffer.readUnsignedShort();
                    if (this.cs1Instructions[n][i] != 65535) continue;
                    this.cs1Instructions[n][i] = -1;
                }
            }
        }
        if (this.type == 0) {
            this.scrollHeight = buffer.readUnsignedShort();
            boolean bl = this.isHidden = buffer.readUnsignedByte() == 1;
        }
        if (this.type == 1) {
            buffer.readUnsignedShort();
            buffer.readUnsignedByte();
        }
        if (this.type == 3) {
            boolean bl = this.fill = buffer.readUnsignedByte() == 1;
        }
        if (this.type == 4 || this.type == 1) {
            this.textXAlignment = buffer.readUnsignedByte();
            this.textYAlignment = buffer.readUnsignedByte();
            this.textLineHeight = buffer.readUnsignedByte();
            this.fontId = buffer.readUnsignedShort();
            if (this.fontId == 65535) {
                this.fontId = -1;
            }
            boolean bl = this.textShadowed = buffer.readUnsignedByte() == 1;
        }
        if (this.type == 4) {
            this.text = buffer.readStringCp1252NullTerminated();
            this.text2 = buffer.readStringCp1252NullTerminated();
        }
        if (this.type == 1 || this.type == 3 || this.type == 4) {
            this.color = buffer.readInt();
        }
        if (this.type == 3 || this.type == 4) {
            this.color2 = buffer.readInt();
            this.field3892 = buffer.readInt();
            this.field3900 = buffer.readInt();
        }
        if (this.type == 5) {
            this.spriteId2 = buffer.readInt();
            this.spriteId = buffer.readInt();
        }
        if (this.type == 6) {
            this.modelType = 1;
            this.modelId = buffer.readUnsignedShort();
            if (this.modelId == 65535) {
                this.modelId = -1;
            }
            this.field3917 = 1;
            this.field3918 = buffer.readUnsignedShort();
            if (this.field3918 == 65535) {
                this.field3918 = -1;
            }
            this.sequenceId = buffer.readUnsignedShort();
            if (this.sequenceId == 65535) {
                this.sequenceId = -1;
            }
            this.sequenceId2 = buffer.readUnsignedShort();
            if (this.sequenceId2 == 65535) {
                this.sequenceId2 = -1;
            }
            this.modelZoom = buffer.readUnsignedShort();
            this.modelAngleX = buffer.readUnsignedShort();
            this.modelAngleY = buffer.readUnsignedShort();
        }
        if (this.type == 8) {
            this.text = buffer.readStringCp1252NullTerminated();
        }
        if (this.buttonType == 2) {
            this.spellActionName = buffer.readStringCp1252NullTerminated();
            this.field4006 = buffer.readStringCp1252NullTerminated();
            n = buffer.readUnsignedShort() & 0x3F;
            this.flags |= n << 11;
        }
        if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
            this.field4007 = buffer.readStringCp1252NullTerminated();
            if (this.field4007.length() == 0) {
                if (this.buttonType == 1) {
                    this.field4007 = "Ok";
                }
                if (this.buttonType == 4) {
                    this.field4007 = "Select";
                }
                if (this.buttonType == 5) {
                    this.field4007 = "Select";
                }
                if (this.buttonType == 6) {
                    this.field4007 = "Continue";
                }
            }
        }
        if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
            this.flags |= 0x400000;
        }
        if (this.buttonType == 6) {
            this.flags |= 1;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="98")
    @Export(value="decode")
    void decode(Buffer buffer) {
        buffer.readUnsignedByte();
        this.isIf3 = true;
        this.type = buffer.readUnsignedByte();
        this.contentType = buffer.readUnsignedShort();
        this.rawX = buffer.readShort();
        this.rawY = buffer.readShort();
        this.rawWidth = buffer.readUnsignedShort();
        this.rawHeight = this.type == 9 ? buffer.readShort() : buffer.readUnsignedShort();
        this.widthAlignment = buffer.readByte();
        this.heightAlignment = buffer.readByte();
        this.xAlignment = buffer.readByte();
        this.yAlignment = buffer.readByte();
        this.parentId = buffer.readUnsignedShort();
        this.parentId = this.parentId == 65535 ? -1 : (this.id & 0xFFFF0000) + this.parentId;
        boolean bl = this.isHidden = buffer.readUnsignedByte() == 1;
        if (this.type == 0) {
            this.scrollWidth = buffer.readUnsignedShort();
            this.scrollHeight = buffer.readUnsignedShort();
            boolean bl2 = this.noClickThrough = buffer.readUnsignedByte() == 1;
        }
        if (this.type == 5) {
            this.spriteId2 = buffer.readInt();
            this.spriteAngle = buffer.readUnsignedShort();
            this.spriteTiling = buffer.readUnsignedByte() == 1;
            this.transparencyTop = buffer.readUnsignedByte();
            this.outline = buffer.readUnsignedByte();
            this.spriteShadow = buffer.readInt();
            this.spriteFlipV = buffer.readUnsignedByte() == 1;
            boolean bl3 = this.spriteFlipH = buffer.readUnsignedByte() == 1;
        }
        if (this.type == 6) {
            this.modelType = 1;
            this.modelId = buffer.readUnsignedShort();
            if (this.modelId == 65535) {
                this.modelId = -1;
            }
            this.modelOffsetX = buffer.readShort();
            this.modelOffsetY = buffer.readShort();
            this.modelAngleX = buffer.readUnsignedShort();
            this.modelAngleY = buffer.readUnsignedShort();
            this.modelAngleZ = buffer.readUnsignedShort();
            this.modelZoom = buffer.readUnsignedShort();
            this.sequenceId = buffer.readUnsignedShort();
            if (this.sequenceId == 65535) {
                this.sequenceId = -1;
            }
            this.modelOrthog = buffer.readUnsignedByte() == 1;
            buffer.readUnsignedShort();
            if (this.widthAlignment != 0) {
                this.field3927 = buffer.readUnsignedShort();
            }
            if (this.heightAlignment != 0) {
                buffer.readUnsignedShort();
            }
        }
        if (this.type == 4) {
            this.fontId = buffer.readUnsignedShort();
            if (this.fontId == 65535) {
                this.fontId = -1;
            }
            this.text = buffer.readStringCp1252NullTerminated();
            this.textLineHeight = buffer.readUnsignedByte();
            this.textXAlignment = buffer.readUnsignedByte();
            this.textYAlignment = buffer.readUnsignedByte();
            this.textShadowed = buffer.readUnsignedByte() == 1;
            this.color = buffer.readInt();
        }
        if (this.type == 3) {
            this.color = buffer.readInt();
            this.fill = buffer.readUnsignedByte() == 1;
            this.transparencyTop = buffer.readUnsignedByte();
        }
        if (this.type == 9) {
            this.lineWid = buffer.readUnsignedByte();
            this.color = buffer.readInt();
            this.field3907 = buffer.readUnsignedByte() == 1;
        }
        this.flags = buffer.readMedium();
        this.dataText = buffer.readStringCp1252NullTerminated();
        int n = buffer.readUnsignedByte();
        if (n > 0) {
            this.actions = new String[n];
            for (int i = 0; i < n; ++i) {
                this.actions[i] = buffer.readStringCp1252NullTerminated();
            }
        }
        this.dragZoneSize = buffer.readUnsignedByte();
        this.dragThreshold = buffer.readUnsignedByte();
        this.isScrollBar = buffer.readUnsignedByte() == 1;
        this.spellActionName = buffer.readStringCp1252NullTerminated();
        this.onLoad = this.readListener(buffer);
        this.onMouseOver = this.readListener(buffer);
        this.onMouseLeave = this.readListener(buffer);
        this.onTargetLeave = this.readListener(buffer);
        this.onTargetEnter = this.readListener(buffer);
        this.onVarTransmit = this.readListener(buffer);
        this.onInvTransmit = this.readListener(buffer);
        this.onStatTransmit = this.readListener(buffer);
        this.onTimer = this.readListener(buffer);
        this.onOp = this.readListener(buffer);
        this.onMouseRepeat = this.readListener(buffer);
        this.onClick = this.readListener(buffer);
        this.onClickRepeat = this.readListener(buffer);
        this.onRelease = this.readListener(buffer);
        this.onHold = this.readListener(buffer);
        this.onDrag = this.readListener(buffer);
        this.onDragComplete = this.readListener(buffer);
        this.onScroll = this.readListener(buffer);
        this.varTransmitTriggers = this.readListenerTriggers(buffer);
        this.invTransmitTriggers = this.readListenerTriggers(buffer);
        this.statTransmitTriggers = this.readListenerTriggers(buffer);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="688799447")
    void method7552(Buffer buffer) {
        this.field3872 = buffer.readStringCp1252NullTerminated();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)[Ljava/lang/Object;", garbageValue="1211797701")
    @Export(value="readListener")
    Object[] readListener(Buffer buffer) {
        int n = buffer.readUnsignedByte();
        if (n == 0) {
            return null;
        }
        Object[] objectArray = new Object[n];
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.hasListener = true;
                return objectArray;
            }
            int n3 = buffer.readUnsignedByte();
            if (n3 == 0) {
                objectArray[n2] = new Integer(buffer.readInt());
            } else if (n3 == 1) {
                objectArray[n2] = buffer.readStringCp1252NullTerminated();
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lvy;B)[I", garbageValue="-13")
    @Export(value="readListenerTriggers")
    int[] readListenerTriggers(Buffer buffer) {
        int n = buffer.readUnsignedByte();
        if (n == 0) {
            return null;
        }
        int[] nArray = new int[n];
        int n2 = 0;
        while (n2 < n) {
            nArray[n2] = buffer.readInt();
            ++n2;
        }
        return nArray;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lnq;ZLez;I)Lvf;", garbageValue="-1673736648")
    public SpritePixels method7430(class352 class3522, boolean bl, UrlRequester urlRequester) {
        SpritePixels spritePixels;
        field3868 = false;
        if (this.field3908 == null || (spritePixels = this.method7415(class3522, urlRequester)) == null) {
            int n = bl ? this.spriteId : this.spriteId2;
            if (n == -1) {
                return null;
            }
            long l = ((long)this.spriteShadow << 40) + (((this.spriteFlipH ? 1L : 0L) << 39) + (((this.spriteFlipV ? 1L : 0L) << 38) + ((long)n + ((long)this.outline << 36))));
            SpritePixels spritePixels2 = (SpritePixels)class3522.field3774.get(l);
            if (spritePixels2 != null) {
                return spritePixels2;
            }
            spritePixels2 = ChatChannel.SpriteBuffer_getSprite(class3522.field3770, n, 0);
            if (spritePixels2 != null) {
                this.method7482(spritePixels2);
                class3522.field3774.put(spritePixels2, l);
                return spritePixels2;
            }
            field3868 = true;
            return null;
        }
        return spritePixels;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lnq;Lez;I)Lvf;", garbageValue="-1401249252")
    SpritePixels method7415(class352 class3522, UrlRequester urlRequester) {
        if (this.method7416()) {
            SpritePixels spritePixels;
            String string = this.field3908 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
            SpritePixels spritePixels2 = (SpritePixels)class3522.field3780.method9037(string);
            if (spritePixels2 == null && (spritePixels = this.method7525(class3522, urlRequester)) != null) {
                spritePixels2 = spritePixels.method10732();
                this.method7482(spritePixels2);
                class3522.field3780.method9038(string, spritePixels2);
            }
            return spritePixels2;
        }
        return this.method7525(class3522, urlRequester);
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lnq;Lez;I)Lvf;", garbageValue="-793269285")
    SpritePixels method7525(class352 class3522, UrlRequester urlRequester) {
        if (this.field3908 != null && urlRequester != null) {
            class356 class3562 = (class356)class3522.field3779.method9037(this.field3908);
            if (class3562 == null) {
                class3562 = new class356(this.field3908, urlRequester);
                class3522.field3779.method9038(this.field3908, class3562);
            }
            return class3562.method7045();
        }
        return null;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-954042597")
    boolean method7416() {
        return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lvf;I)V", garbageValue="951843692")
    void method7482(SpritePixels spritePixels) {
        if (this.spriteFlipV) {
            spritePixels.flipVertically();
        }
        if (this.spriteFlipH) {
            spritePixels.flipHorizontally();
        }
        if (this.outline > 0) {
            spritePixels.pad(this.outline);
        }
        if (this.outline >= 1) {
            spritePixels.outline(1);
        }
        if (this.outline >= 2) {
            spritePixels.outline(0xFFFFFF);
        }
        if (this.spriteShadow != 0) {
            spritePixels.shadow(this.spriteShadow);
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lnq;B)Lqw;", garbageValue="-33")
    public Font method7419(class352 class3522) {
        Font font;
        field3868 = false;
        if (this.fontId == -1) {
            return null;
        }
        Font font2 = (Font)class3522.field3771.get(this.fontId);
        if (font2 != null) {
            return font2;
        }
        AbstractArchive abstractArchive = class3522.field3770;
        AbstractArchive abstractArchive2 = class3522.field3767;
        int n = this.fontId;
        if (WorldMapSprite.method6397(abstractArchive, n, 0)) {
            Font font3;
            byte[] byArray = abstractArchive2.takeFile(n, 0);
            if (byArray != null) {
                Font font4 = new Font(byArray, class241.SpriteBuffer_xOffsets, class571.SpriteBuffer_yOffsets, class571.SpriteBuffer_spriteWidths, class403.SpriteBuffer_spriteHeights, KeyHandler.SpriteBuffer_spritePalette, class240.SpriteBuffer_pixels);
                class241.SpriteBuffer_xOffsets = null;
                class571.SpriteBuffer_yOffsets = null;
                class571.SpriteBuffer_spriteWidths = null;
                class403.SpriteBuffer_spriteHeights = null;
                KeyHandler.SpriteBuffer_spritePalette = null;
                class240.SpriteBuffer_pixels = null;
                font3 = font4;
            } else {
                font3 = null;
            }
            font = font3;
        } else {
            font = null;
        }
        font2 = font;
        if (font2 != null) {
            class3522.field3771.put(font2, this.fontId);
        } else {
            field3868 = true;
        }
        return font2;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Lnq;Lkb;IZLny;Ljz;Ljs;B)Lhv;", garbageValue="5")
    public Model method7420(class352 class3522, SequenceDefinition sequenceDefinition, int n, boolean bl, PlayerComposition playerComposition, NPCComposition nPCComposition, NewStuff newStuff) {
        block20: {
            Model model;
            block19: {
                int n2;
                int n3;
                field3868 = false;
                if (!bl) {
                    n3 = this.modelType;
                    n2 = this.modelId;
                } else {
                    n3 = this.field3917;
                    n2 = this.field3918;
                }
                if (n3 == 0) {
                    return null;
                }
                if (n3 == 1 && n2 == -1) {
                    return null;
                }
                if (newStuff != null && newStuff.field2614 && n3 == 6) {
                    n3 = 3;
                }
                long l = n2 + (n3 << 16);
                if (n3 == 2 || n3 == 6) {
                    if (nPCComposition == null) {
                        return null;
                    }
                    l = nPCComposition.id + (n3 << 16);
                }
                if (newStuff != null) {
                    l |= newStuff.field2613 << 20;
                }
                if ((model = (Model)class3522.field3776.get(l)) != null) break block19;
                ModelData modelData = null;
                int n4 = 64;
                int n5 = 768;
                switch (n3) {
                    case 4: {
                        ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n2);
                        modelData = itemComposition.getModelData(10);
                        n4 += itemComposition.field2893;
                        n5 += itemComposition.field2868;
                        break;
                    }
                    case 2: {
                        modelData = nPCComposition.method5342(null);
                        break;
                    }
                    case 3: {
                        modelData = playerComposition != null ? playerComposition.getModelData() : null;
                        break;
                    }
                    case 6: {
                        modelData = nPCComposition.method5342(newStuff);
                        break;
                    }
                    case 1: {
                        modelData = ModelData.ModelData_get(class3522.field3769, n2, 0);
                    }
                }
                if (modelData == null) break block20;
                model = modelData.toModel(n4, n5, -50, -10, -50);
                class3522.field3776.put(model, l);
            }
            if (sequenceDefinition != null) {
                model = sequenceDefinition.transformWidgetModel(model, n);
            }
            return model;
        }
        field3868 = true;
        return null;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lnq;ZI)Lnf;", garbageValue="462192621")
    public SpriteMask method7446(class352 class3522, boolean bl) {
        int n;
        if (this.spriteId == -1) {
            bl = false;
        }
        int n2 = n = bl ? this.spriteId : this.spriteId2;
        if (n == -1) {
            return null;
        }
        long l = ((long)this.spriteShadow << 40) + (((this.spriteFlipH ? 1L : 0L) << 39) + ((long)n + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38)));
        SpriteMask spriteMask = (SpriteMask)class3522.field3777.get(l);
        if (spriteMask != null) {
            return spriteMask;
        }
        SpritePixels spritePixels = this.method7430(class3522, bl, null);
        if (spritePixels == null) {
            return null;
        }
        SpritePixels spritePixels2 = spritePixels.copyNormalized();
        int[] nArray = new int[spritePixels2.subHeight];
        int[] nArray2 = new int[spritePixels2.subHeight];
        int n3 = 0;
        block0: while (true) {
            if (n3 >= spritePixels2.subHeight) {
                spriteMask = new SpriteMask(spritePixels2.subWidth, spritePixels2.subHeight, nArray2, nArray, n);
                class3522.field3777.put(spriteMask, l);
                return spriteMask;
            }
            int n4 = 0;
            int n5 = spritePixels2.subWidth;
            int n6 = 0;
            while (true) {
                block12: {
                    block11: {
                        if (n6 >= spritePixels2.subWidth) break block11;
                        if (spritePixels2.pixels[n6 + n3 * spritePixels2.subWidth] != 0) break block12;
                        n4 = n6;
                    }
                    n6 = spritePixels2.subWidth - 1;
                    while (true) {
                        block14: {
                            block13: {
                                if (n6 < n4) break block13;
                                if (spritePixels2.pixels[n6 + n3 * spritePixels2.subWidth] != 0) break block14;
                                n5 = n6 + 1;
                            }
                            nArray[n3] = n4;
                            nArray2[n3] = n5 - n4;
                            ++n3;
                            continue block0;
                        }
                        --n6;
                    }
                }
                ++n6;
            }
            break;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;B)V", garbageValue="63")
    @Export(value="setAction")
    public void setAction(int n, String string) {
        if (this.actions == null || this.actions.length <= n) {
            String[] stringArray = new String[n + 1];
            if (this.actions != null) {
                for (int i = 0; i < this.actions.length; ++i) {
                    stringArray[i] = this.actions[i];
                }
            }
            this.actions = stringArray;
        }
        this.actions[n] = string;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IILjava/lang/String;I)V", garbageValue="-138100882")
    public void method7498(int n, int n2, String string) {
        String[][] stringArrayArray;
        if (this.field3957 == null || this.field3957.length <= n) {
            stringArrayArray = new String[n + 1][];
            if (this.field3957 != null) {
                System.arraycopy(this.field3957, 0, stringArrayArray, 0, this.field3957.length);
            }
            this.field3957 = stringArrayArray;
        }
        if (this.field3957[n] == null || this.field3957[n].length <= n2) {
            stringArrayArray = new String[n2 + 1];
            if (this.field3957[n] != null) {
                System.arraycopy(this.field3957[n], 0, stringArrayArray, 0, this.field3957[n].length);
            }
            this.field3957[n] = stringArrayArray;
        }
        this.field3957[n][n2] = string;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-2029704733")
    public boolean method7424() {
        return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-117")
    public boolean method7425() {
        return this.type == 11 || this.type == 12;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Lez;J)V")
    public void method7426(String string, String string2, UrlRequester urlRequester, long l) {
        if (this.type == 11 && -1L != l) {
            string = string.replaceAll("%userid%", Long.toString(l));
            this.field3962 = new class212();
            if (this.field3962.method4862(string, string2, urlRequester)) {
                if (this.field3920 == null || this.field3947 == null) {
                    this.method7421();
                }
                return;
            }
            this.field3962 = null;
            return;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lez;B)V", garbageValue="116")
    public void method7427(String string, String string2, String string3, String string4, String string5, UrlRequester urlRequester) {
        this.field3962 = new class212();
        if (this.field3962.method4862(string, string3, urlRequester)) {
            if (this.field3920 == null || this.field3947 == null) {
                this.method7421();
            }
            this.field3962.method4842(string2, string4, string5);
            return;
        }
        this.field3962 = null;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lez;B)V", garbageValue="40")
    public void method7428(String string, UrlRequester urlRequester) {
        if (this.type == 11 && string != null) {
            this.field3962 = new class212();
            this.field3962.method4857(string, urlRequester);
            return;
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-781294477")
    void method7421() {
        this.field3920 = new HashMap();
        this.field3947 = new HashMap();
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1544918859")
    public void method7521(int n, int n2) {
        if (this.type != 11) {
            return;
        }
        if (this.field3920 == null) {
            this.method7421();
        }
        this.field3920.put(n, n2);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)V", garbageValue="-795200663")
    public void method7546(String string, int n) {
        if (this.type != 11) {
            return;
        }
        if (this.field3947 == null) {
            this.method7421();
        }
        this.field3947.put(string, n);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IIIII)Z", garbageValue="140898868")
    public boolean method7432(int n, int n2, int n3, int n4) {
        if (this.type == 11 && this.field3962 != null && this.method7433()) {
            int n5 = (int)(this.field3962.method4852()[0] * (float)this.width);
            int n6 = (int)(this.field3962.method4852()[1] * (float)(this.height * -1528330031));
            int n7 = n5 + (int)(this.field3962.method4852()[2] * (float)this.width);
            int n8 = n6 + (int)(this.field3962.method4852()[3] * (float)(this.height * -1528330031));
            return n >= n5 && (n2 -= n4) >= n6 && (n -= n3) < n7 && n2 < n8;
        }
        return false;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-110085272")
    public boolean method7433() {
        return this.field3945 == 2;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="102")
    public int method7465(String string) {
        if (this.type == 11 && this.field3962 != null && this.method7433()) {
            return this.field3962.method4846(string);
        }
        return -1;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/lang/String;", garbageValue="1447744598")
    public String method7548(String string) {
        if (this.type == 11 && this.field3962 != null && this.method7433()) {
            return this.field3962.method4848(string);
        }
        return null;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1023157134")
    public int method7441() {
        return this.field3947 != null && this.field3947.size() > 0 ? 1 : 0;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-34")
    public int method7437() {
        if (this.type == 11 && this.field3962 != null && this.field3947 != null && !this.field3947.isEmpty()) {
            String string = this.field3962.method4856();
            if (string != null && this.field3947.containsKey(this.field3962.method4856())) {
                return (Integer)this.field3947.get(string);
            }
            return -1;
        }
        return -1;
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="2138232535")
    public String method7436() {
        if (this.type == 11 && this.field3962 != null) {
            String string = this.field3962.method4856();
            Iterator iterator = this.field3962.method4850().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    return string;
                }
                class226 class2262 = (class226)iterator.next();
                String string2 = String.format("%%%S%%", class2262.method5059());
                if (class2262.vmethod5060() != 0) {
                    string.replaceAll(string2, class2262.vmethod5061());
                    continue;
                }
                string.replaceAll(string2, Integer.toString(class2262.vmethod5064()));
            }
        }
        return null;
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(B)[I", garbageValue="1")
    public int[] method7536() {
        if (this.type == 11 && this.field3962 != null) {
            int[] nArray = new int[3];
            int n = 0;
            Iterator iterator = this.field3962.method4850().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    return nArray;
                }
                class226 class2262 = (class226)iterator.next();
                if (class2262.method5059().equals("user_id")) continue;
                if (class2262.vmethod5060() != 0) {
                    return null;
                }
                nArray[n++] = class2262.vmethod5064();
                if (n > 3) break;
            }
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(I)Lii;", garbageValue="-1483029632")
    public class212 method7440() {
        return this.field3962;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(Lnq;Lez;I)Z", garbageValue="1160648095")
    public boolean method7523(class352 class3522, UrlRequester urlRequester) {
        block2: {
            block4: {
                block5: {
                    block3: {
                        if (this.type != 11 || this.field3962 == null) break block2;
                        this.field3962.method4843(urlRequester);
                        if (this.field3962.method4903() == this.field3945) break block3;
                        this.field3945 = this.field3962.method4903();
                        if (this.field3945 >= 3) break block4;
                        if (this.field3945 == 2) break block5;
                    }
                    return false;
                }
                this.method7526(class3522);
                return true;
            }
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="(Lnq;I)V", garbageValue="208997219")
    void method7526(class352 class3522) {
        this.noClickThrough = true;
        ArrayList arrayList = this.field3962.method4902();
        ArrayList arrayList2 = this.field3962.method4840();
        int n = arrayList.size() + arrayList2.size();
        this.children = new Widget[n];
        int n2 = 0;
        Iterator iterator = arrayList.iterator();
        while (true) {
            Widget widget;
            Object object;
            if (!iterator.hasNext()) {
                iterator = arrayList2.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    object = (class224)iterator.next();
                    widget = PlayerType.method7660(4, this, n2, 0, 0, 0, 0, ((class224)object).field2447);
                    widget.text = ((class224)object).field2450;
                    widget.fontId = (Integer)this.field3920.get(((class224)object).field2454);
                    widget.textXAlignment = ((class224)object).field2451;
                    widget.textYAlignment = ((class224)object).field2453;
                    this.children[n2++] = widget;
                }
            }
            object = (class213)iterator.next();
            widget = PlayerType.method7660(5, this, n2, 0, 0, 0, 0, ((class213)object).field2372);
            widget.field3908 = ((class213)object).field2373.method3308();
            class356 class3562 = new class356(((class213)object).field2373);
            class3522.field3779.method9038(widget.field3908, class3562);
            this.children[n2++] = widget;
        }
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2104048213")
    @Export(value="importIndex")
    public void importIndex() {
        this.field3946 = new class357();
        char c = '\u0001';
        while (true) {
            if (c > '\f') {
                c = '\u0000';
                while (true) {
                    if (c >= ' ') {
                        this.field3946.field3799.method407('\u0080', 0);
                        this.field3946.field3799.method408(82, 2);
                        this.field3946.field3799.method408(81, 2);
                        this.field3946.field3799.method408(86, 2);
                        return;
                    }
                    this.field3946.field3799.method407(c, 0);
                    c = (char)(c + '\u0001');
                }
            }
            this.field3946.field3799.method408(c, 0);
            ++c;
        }
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(B)Lnn;", garbageValue="-26")
    public class359 method7444() {
        return this.field3946 != null ? this.field3946.field3801 : null;
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(I)Lnl;", garbageValue="-1682998102")
    public class353 method7445() {
        return this.field3946 != null ? this.field3946.field3800 : null;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(I)Lbh;", garbageValue="618602681")
    public class27 method7535() {
        return this.field3946 != null ? this.field3946.field3799 : null;
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(B)Lnk;", garbageValue="42")
    public class357 method7447() {
        return this.field3946;
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Lnn;B)Z", garbageValue="104")
    boolean method7489(class359 class3592) {
        boolean bl = false;
        if (this.text != null && !this.text.isEmpty()) {
            bl |= class3592.method7131(class561.method10574(this.text));
            this.text = "";
        }
        if (this.text2 != null && !this.text2.isEmpty()) {
            bl |= class3592.method7298(class561.method10574(this.text2));
            this.text2 = "";
        }
        return bl;
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(Lnq;I)Z", garbageValue="-1316055303")
    public boolean method7449(class352 class3522) {
        class359 class3592 = this.method7444();
        if (class3592 == null) {
            return false;
        }
        boolean bl = false;
        if (!class3592.method7276() && this.fontId != -1) {
            int n = class3592.method7167();
            int n2 = class3592.method7187();
            int n3 = class3592.method7184();
            int n4 = class3592.method7259();
            Font font = this.method7419(class3522);
            if (font != null) {
                bl |= class3592.method7242(font);
                bl |= this.method7489(class3592);
                bl |= class3592.method7138(n, n2);
                bl |= class3592.method7285(n3, n4);
            }
        } else if (class3592.method7276()) {
            bl |= this.method7489(class3592);
        }
        class3592.method7315();
        return bl;
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(Lny;ZI)V", garbageValue="134742024")
    public void method7542(PlayerComposition playerComposition, boolean bl) {
        this.modelType = 7;
        this.field3924 = new PlayerComposition(playerComposition);
        if (!bl) {
            this.field3924.field3809 = Arrays.copyOf(this.field3924.field3814, this.field3924.field3814.length);
            this.field3924.method7061();
        }
    }
}

