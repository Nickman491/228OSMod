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
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bt")
@Implements(value="GameEngine")
public abstract class GameEngine
extends Applet
implements Runnable,
FocusListener,
WindowListener {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lix;")
    @Export(value="taskHandler")
    protected static TaskHandler taskHandler;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lbt;")
    @Export(value="gameEngine")
    static GameEngine gameEngine;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1722620173)
    @Export(value="GameEngine_redundantStartThreadCount")
    static int GameEngine_redundantStartThreadCount;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=5464962418765997645L)
    @Export(value="stopTimeMs")
    static long stopTimeMs;
    @ObfuscatedName(value="ad")
    @Export(value="isKilled")
    static boolean isKilled;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-213826595)
    @Export(value="gameCyclesToDo")
    static int gameCyclesToDo;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-754473845)
    @Export(value="cycleDurationMillis")
    protected static int cycleDurationMillis;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=303838851)
    @Export(value="fiveOrOne")
    static int fiveOrOne;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-572708001)
    @Export(value="fps")
    protected static int fps;
    @ObfuscatedName(value="aq")
    @Export(value="graphicsTickTimes")
    static long[] graphicsTickTimes;
    @ObfuscatedName(value="aa")
    @Export(value="clientTickTimes")
    static long[] clientTickTimes;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-1107754689)
    static int field176;
    @ObfuscatedName(value="ba")
    @Export(value="volatileFocus")
    static volatile boolean volatileFocus;
    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="Laj;")
    @Export(value="keyHandler")
    protected static KeyHandler keyHandler;
    @ObfuscatedName(value="bo")
    @ObfuscatedGetter(longValue=1088414789088896831L)
    @Export(value="garbageCollectorLastCollectionTime")
    static long garbageCollectorLastCollectionTime;
    @ObfuscatedName(value="be")
    @ObfuscatedGetter(longValue=3858079444675219951L)
    @Export(value="garbageCollectorLastCheckTimeMs")
    static long garbageCollectorLastCheckTimeMs;
    @ObfuscatedName(value="jj")
    @ObfuscatedSignature(descriptor="Ldz;")
    static class103 field189;
    @ObfuscatedName(value="an")
    @Export(value="hasErrored")
    boolean hasErrored = false;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1428336891)
    @Export(value="contentWidth")
    protected int contentWidth;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-812457647)
    @Export(value="contentHeight")
    protected int contentHeight;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-315770341)
    @Export(value="canvasX")
    int canvasX = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1665662357)
    @Export(value="canvasY")
    int canvasY = 0;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=2015058129)
    int field170;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-587645521)
    int field171;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=544990267)
    @Export(value="maxCanvasWidth")
    int maxCanvasWidth;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=2035349253)
    @Export(value="maxCanvasHeight")
    int maxCanvasHeight;
    @ObfuscatedName(value="bh")
    protected boolean field174 = false;
    @ObfuscatedName(value="bx")
    @Export(value="frame")
    Frame frame;
    @ObfuscatedName(value="bd")
    @Export(value="canvas")
    java.awt.Canvas canvas;
    @ObfuscatedName(value="bi")
    @Export(value="fullRedraw")
    volatile boolean fullRedraw = true;
    @ObfuscatedName(value="bf")
    @Export(value="resizeCanvasNextFrame")
    boolean resizeCanvasNextFrame = false;
    @ObfuscatedName(value="by")
    @Export(value="isCanvasInvalid")
    volatile boolean isCanvasInvalid = false;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(longValue=9000124658905312171L)
    volatile long field183 = 0L;
    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="Lar;")
    @Export(value="mouseWheelHandler")
    MouseWheelHandler mouseWheelHandler;
    @ObfuscatedName(value="bv")
    @Export(value="clipboard")
    Clipboard clipboard;
    @ObfuscatedName(value="bq")
    @Export(value="eventQueue")
    final EventQueue eventQueue;

    static {
        gameEngine = null;
        GameEngine_redundantStartThreadCount = 0;
        stopTimeMs = 0L;
        isKilled = false;
        cycleDurationMillis = 20;
        fiveOrOne = 1;
        fps = 0;
        graphicsTickTimes = new long[32];
        clientTickTimes = new long[32];
        field176 = 500;
        volatileFocus = true;
        keyHandler = new KeyHandler();
        garbageCollectorLastCollectionTime = -1L;
        garbageCollectorLastCheckTimeMs = -1L;
    }

    protected GameEngine() {
        EventQueue eventQueue = null;
        try {
            eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.eventQueue = eventQueue;
        DevicePcmPlayerProvider devicePcmPlayerProvider = new DevicePcmPlayerProvider();
        class355.pcmPlayerProvider = devicePcmPlayerProvider;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="307314874")
    @Export(value="setMaxCanvasSize")
    protected final void setMaxCanvasSize(int n, int n2) {
        if (this.maxCanvasWidth != n || n2 != this.maxCanvasHeight) {
            this.method640();
        }
        this.maxCanvasWidth = n;
        this.maxCanvasHeight = n2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;I)V", garbageValue="-1433952013")
    @Export(value="post")
    final void post(Object object) {
        if (this.eventQueue == null) {
            return;
        }
        for (int i = 0; i < 50 && this.eventQueue.peekEvent() != null; ++i) {
            class174.method3881(1L);
        }
        if (object != null) {
            this.eventQueue.postEvent(new ActionEvent(object, 1001, "dummy"));
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Lis;", garbageValue="54929218")
    @Export(value="mouseWheel")
    protected class217 mouseWheel() {
        if (this.mouseWheelHandler == null) {
            this.mouseWheelHandler = new MouseWheelHandler();
            this.mouseWheelHandler.addTo(this.canvas);
        }
        return this.mouseWheelHandler;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-48")
    @Export(value="setUpClipboard")
    protected void setUpClipboard() {
        this.clipboard = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="64")
    protected void method529(String string) {
        this.clipboard.setContents(new StringSelection(string), null);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Ljava/awt/datatransfer/Clipboard;", garbageValue="-1024779189")
    protected Clipboard method551() {
        return this.clipboard;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="41")
    @Export(value="setUpKeyboard")
    protected final void setUpKeyboard() {
        if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") == -1) {
            class28.KeyHandler_keyCodes[44] = 71;
            class28.KeyHandler_keyCodes[45] = 26;
            class28.KeyHandler_keyCodes[46] = 72;
            class28.KeyHandler_keyCodes[47] = 73;
            class28.KeyHandler_keyCodes[59] = 57;
            class28.KeyHandler_keyCodes[61] = 27;
            class28.KeyHandler_keyCodes[91] = 42;
            class28.KeyHandler_keyCodes[92] = 74;
            class28.KeyHandler_keyCodes[93] = 43;
            class28.KeyHandler_keyCodes[192] = 28;
            class28.KeyHandler_keyCodes[222] = 58;
            class28.KeyHandler_keyCodes[520] = 59;
        } else {
            class28.KeyHandler_keyCodes[186] = 57;
            class28.KeyHandler_keyCodes[187] = 27;
            class28.KeyHandler_keyCodes[188] = 71;
            class28.KeyHandler_keyCodes[189] = 26;
            class28.KeyHandler_keyCodes[190] = 72;
            class28.KeyHandler_keyCodes[191] = 73;
            class28.KeyHandler_keyCodes[192] = 58;
            class28.KeyHandler_keyCodes[219] = 42;
            class28.KeyHandler_keyCodes[220] = 74;
            class28.KeyHandler_keyCodes[221] = 43;
            class28.KeyHandler_keyCodes[222] = 59;
            class28.KeyHandler_keyCodes[223] = 28;
        }
        keyHandler.method361(this.canvas);
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="206898290")
    protected final void method532() {
        keyHandler.method364();
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Lbb;II)V", garbageValue="-1559149149")
    protected void method533(class29 class292, int n) {
        keyHandler.method368(class292, n);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-1839")
    protected final void method534() {
        class131.method3379(this.canvas);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-670717205")
    @Export(value="resizeCanvas")
    final void resizeCanvas() {
        Container container = this.container();
        if (container == null) {
            return;
        }
        Bounds bounds = this.getFrameContentBounds();
        this.contentWidth = Math.max(bounds.highX, this.field170);
        this.contentHeight = Math.max(bounds.highY, this.field171);
        if (this.contentWidth <= 0) {
            this.contentWidth = 1;
        }
        if (this.contentHeight <= 0) {
            this.contentHeight = 1;
        }
        BuddyRankComparator.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
        Huffman.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
        this.canvasX = (this.contentWidth - BuddyRankComparator.canvasWidth) / 2;
        this.canvasY = 0;
        this.canvas.setSize(BuddyRankComparator.canvasWidth, Huffman.canvasHeight);
        class6.rasterProvider = new RasterProvider(BuddyRankComparator.canvasWidth, Huffman.canvasHeight, this.canvas, this.field174);
        if (container != this.frame) {
            this.canvas.setLocation(this.canvasX, this.canvasY);
        } else {
            Insets insets = this.frame.getInsets();
            this.canvas.setLocation(this.canvasX + insets.left, this.canvasY + insets.top);
        }
        this.fullRedraw = true;
        this.resizeGame();
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1848806273")
    @Export(value="resizeGame")
    protected abstract void resizeGame();

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1259549085")
    @Export(value="clearBackground")
    void clearBackground() {
        int n = this.canvasX;
        int n2 = this.canvasY;
        int n3 = this.contentWidth - BuddyRankComparator.canvasWidth - n;
        int n4 = this.contentHeight - Huffman.canvasHeight - n2;
        if (n > 0 || n3 > 0 || n2 > 0 || n4 > 0) {
            try {
                Object object;
                Container container = this.container();
                int n5 = 0;
                int n6 = 0;
                if (container == this.frame) {
                    object = this.frame.getInsets();
                    n5 = ((Insets)object).left;
                    n6 = ((Insets)object).top;
                }
                object = container.getGraphics();
                ((Graphics)object).setColor(Color.black);
                if (n > 0) {
                    ((Graphics)object).fillRect(n5, n6, n, this.contentHeight);
                }
                if (n2 > 0) {
                    ((Graphics)object).fillRect(n5, n6, this.contentWidth, n2);
                }
                if (n3 > 0) {
                    ((Graphics)object).fillRect(n5 + this.contentWidth - n3, n6, n3, this.contentHeight);
                }
                if (n4 > 0) {
                    ((Graphics)object).fillRect(n5, n6 + this.contentHeight - n4, this.contentWidth, n4);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="901715879")
    @Export(value="replaceCanvas")
    final void replaceCanvas() {
        keyHandler.method363(this.canvas);
        ClanChannelMember.method3609(this.canvas);
        if (this.mouseWheelHandler != null) {
            this.mouseWheelHandler.method311(this.canvas);
        }
        this.addCanvas();
        keyHandler.method361(this.canvas);
        class131.method3379(this.canvas);
        if (this.mouseWheelHandler != null) {
            this.mouseWheelHandler.addTo(this.canvas);
        }
        this.method640();
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1610291587")
    @Export(value="startThread")
    protected final void startThread(int n, int n2, int n3, int n4) {
        try {
            if (gameEngine != null) {
                if (++GameEngine_redundantStartThreadCount >= 3) {
                    this.error("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            gameEngine = this;
            BuddyRankComparator.canvasWidth = n;
            Huffman.canvasHeight = n2;
            RunException.RunException_revision = n3;
            class484.field5050 = n4;
            RunException.RunException_applet = this;
            if (taskHandler == null) {
                taskHandler = new TaskHandler();
            }
            taskHandler.newThreadTask(this, 1);
        }
        catch (Exception exception) {
            class255.RunException_sendStackTrace(null, exception);
            this.error("crash");
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1182885754")
    @Export(value="addCanvas")
    final synchronized void addCanvas() {
        Insets insets;
        Container container = this.container();
        if (this.canvas != null) {
            this.canvas.removeFocusListener(this);
            container.remove(this.canvas);
        }
        BuddyRankComparator.canvasWidth = Math.max(container.getWidth(), this.field170);
        Huffman.canvasHeight = Math.max(container.getHeight(), this.field171);
        if (this.frame != null) {
            insets = this.frame.getInsets();
            BuddyRankComparator.canvasWidth -= insets.left + insets.right;
            Huffman.canvasHeight -= insets.top + insets.bottom;
        }
        this.canvas = new Canvas(this);
        container.setBackground(Color.BLACK);
        container.setLayout(null);
        container.add(this.canvas);
        this.canvas.setSize(BuddyRankComparator.canvasWidth, Huffman.canvasHeight);
        this.canvas.setVisible(true);
        this.canvas.setBackground(Color.BLACK);
        if (container != this.frame) {
            this.canvas.setLocation(this.canvasX, this.canvasY);
        } else {
            insets = this.frame.getInsets();
            this.canvas.setLocation(insets.left + this.canvasX, this.canvasY + insets.top);
        }
        this.canvas.addFocusListener(this);
        this.canvas.requestFocus();
        this.fullRedraw = true;
        if (class6.rasterProvider != null && BuddyRankComparator.canvasWidth == class6.rasterProvider.width && Huffman.canvasHeight == class6.rasterProvider.height) {
            ((RasterProvider)class6.rasterProvider).setComponent(this.canvas);
            class6.rasterProvider.drawFull(0, 0);
        } else {
            class6.rasterProvider = new RasterProvider(BuddyRankComparator.canvasWidth, Huffman.canvasHeight, this.canvas, this.field174);
        }
        this.isCanvasInvalid = false;
        this.field183 = ReflectionCheck.method724();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="107")
    protected void method541(boolean bl) {
        if (this.field174 != bl) {
            this.field174 = bl;
            class6.rasterProvider.method10691(bl);
            class6.rasterProvider.apply();
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="82")
    @Export(value="checkHost")
    protected final boolean checkHost() {
        String string = this.getDocumentBase().getHost().toLowerCase();
        if (!string.equals("jagex.com") && !string.endsWith(".jagex.com")) {
            if (!string.equals("runescape.com") && !string.endsWith(".runescape.com")) {
                if (string.endsWith("127.0.0.1")) {
                    return true;
                }
                while (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9') {
                    string = string.substring(0, string.length() - 1);
                }
                if (string.endsWith("192.168.1.")) {
                    return true;
                }
                this.error("invalidhost");
                return false;
            }
            return true;
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="42542346")
    @Export(value="clientTick")
    void clientTick() {
        long l = ReflectionCheck.method724();
        long l2 = clientTickTimes[class561.field5532];
        GameEngine.clientTickTimes[class561.field5532] = l;
        class561.field5532 = class561.field5532 + 1 & 0x1F;
        if (0L == l2 || l > l2) {
            // empty if block
        }
        GameEngine gameEngine = this;
        synchronized (gameEngine) {
            SecureRandomFuture.hasFocus = volatileFocus;
        }
        this.doCycle();
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="706177694")
    protected final void method544() {
        this.fullRedraw = true;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2017959842")
    @Export(value="graphicsTick")
    void graphicsTick() {
        Container container = this.container();
        long l = ReflectionCheck.method724();
        long l2 = graphicsTickTimes[Ignored.field5015];
        GameEngine.graphicsTickTimes[Ignored.field5015] = l;
        Ignored.field5015 = Ignored.field5015 + 1 & 0x1F;
        if (l2 != 0L && l > l2) {
            int n = (int)(l - l2);
            fps = ((n >> 1) + 32000) / n;
        }
        if (++field176 - 1 > 50) {
            field176 -= 50;
            this.fullRedraw = true;
            this.canvas.setSize(BuddyRankComparator.canvasWidth, Huffman.canvasHeight);
            this.canvas.setVisible(true);
            if (container != this.frame) {
                this.canvas.setLocation(this.canvasX, this.canvasY);
            } else {
                Insets insets = this.frame.getInsets();
                this.canvas.setLocation(insets.left + this.canvasX, insets.top + this.canvasY);
            }
        }
        if (this.isCanvasInvalid) {
            this.replaceCanvas();
        }
        this.method546();
        this.draw(this.fullRedraw);
        if (this.fullRedraw) {
            this.clearBackground();
        }
        this.fullRedraw = false;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1446954978")
    final void method546() {
        Bounds bounds = this.getFrameContentBounds();
        if (bounds.highX != this.contentWidth || this.contentHeight != bounds.highY || this.resizeCanvasNextFrame) {
            this.resizeCanvas();
            this.resizeCanvasNextFrame = false;
        }
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-124")
    final void method640() {
        this.resizeCanvasNextFrame = true;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="97")
    @Export(value="kill")
    final synchronized void kill() {
        if (isKilled) {
            return;
        }
        isKilled = true;
        try {
            this.canvas.removeFocusListener(this);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            this.kill0();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.frame != null) {
            try {
                System.exit(0);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (taskHandler != null) {
            try {
                taskHandler.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.vmethod1282();
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-494623143")
    @Export(value="setUp")
    protected abstract void setUp();

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1077900572")
    @Export(value="doCycle")
    protected abstract void doCycle();

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-861113109")
    @Export(value="draw")
    protected abstract void draw(boolean var1);

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-12")
    @Export(value="kill0")
    protected abstract void kill0();

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;ZZI)V", garbageValue="441069439")
    protected final void method556(int n, String string, boolean bl, boolean bl2) {
        try {
            Graphics graphics = this.canvas.getGraphics();
            if (class197.fontHelvetica13 == null) {
                class197.fontHelvetica13 = new Font("Helvetica", 1, 13);
                UserComparator5.loginScreenFontMetrics = this.canvas.getFontMetrics(class197.fontHelvetica13);
            }
            if (bl && !bl2) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, BuddyRankComparator.canvasWidth, Huffman.canvasHeight);
            }
            Color color = new Color(140, 17, 17);
            try {
                if (class232.field2500 == null) {
                    class232.field2500 = this.canvas.createImage(304, 34);
                }
                Graphics graphics2 = class232.field2500.getGraphics();
                graphics2.setColor(color);
                graphics2.drawRect(0, 0, 303, 33);
                graphics2.fillRect(2, 2, n * 3, 30);
                graphics2.setColor(Color.black);
                graphics2.drawRect(1, 1, 301, 31);
                graphics2.fillRect(n * 3 + 2, 2, 300 - n * 3, 30);
                graphics2.setFont(class197.fontHelvetica13);
                graphics2.setColor(Color.white);
                graphics2.drawString(string, (304 - UserComparator5.loginScreenFontMetrics.stringWidth(string)) / 2, 22);
                graphics.drawImage(class232.field2500, BuddyRankComparator.canvasWidth / 2 - 152, Huffman.canvasHeight / 2 + (bl2 ? 50 : -18), null);
            }
            catch (Exception exception) {
                int n2 = BuddyRankComparator.canvasWidth / 2 - 152;
                int n3 = Huffman.canvasHeight / 2 - 18;
                graphics.setColor(color);
                graphics.drawRect(n2, n3, 303, 33);
                graphics.fillRect(n2 + 2, n3 + 2, n * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(n2 + 1, n3 + 1, 301, 31);
                graphics.fillRect(n * 3 + n2 + 2, n3 + 2, 300 - n * 3, 30);
                graphics.setFont(class197.fontHelvetica13);
                graphics.setColor(Color.white);
                graphics.drawString(string, n2 + (304 - UserComparator5.loginScreenFontMetrics.stringWidth(string)) / 2, n3 + 22);
            }
        }
        catch (Exception exception) {
            this.canvas.repaint();
        }
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="79")
    protected final void method557() {
        class232.field2500 = null;
        class197.fontHelvetica13 = null;
        UserComparator5.loginScreenFontMetrics = null;
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-342460508")
    @Export(value="error")
    protected void error(String string) {
        if (this.hasErrored) {
            return;
        }
        this.hasErrored = true;
        System.out.println("error_game_" + string);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + string + ".ws"), "_self");
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(B)Ljava/awt/Container;", garbageValue="64")
    @Export(value="container")
    Container container() {
        if (this.frame != null) {
            return this.frame;
        }
        return this;
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(I)Lql;", garbageValue="-381002297")
    @Export(value="getFrameContentBounds")
    Bounds getFrameContentBounds() {
        Container container = this.container();
        int n = Math.max(container.getWidth(), this.field170);
        int n2 = Math.max(container.getHeight(), this.field171);
        if (this.frame != null) {
            Insets insets = this.frame.getInsets();
            n -= insets.right + insets.left;
            n2 -= insets.bottom + insets.top;
        }
        return new Bounds(n, n2);
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="44")
    @Export(value="hasFrame")
    protected final boolean hasFrame() {
        return this.frame != null;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="26444")
    protected abstract void vmethod1282();

    @Override
    public final void destroy() {
        if (this == gameEngine && !isKilled) {
            stopTimeMs = ReflectionCheck.method724();
            class174.method3881(5000L);
            this.kill();
            return;
        }
    }

    @Override
    public final synchronized void paint(Graphics graphics) {
        if (this == gameEngine && !isKilled) {
            Rectangle rectangle;
            this.fullRedraw = true;
            if (ReflectionCheck.method724() - this.field183 > 1000L && ((rectangle = graphics.getClipBounds()) == null || rectangle.width >= BuddyRankComparator.canvasWidth && rectangle.height >= Huffman.canvasHeight)) {
                this.isCanvasInvalid = true;
            }
            return;
        }
    }

    @Override
    public void run() {
        try {
            Object object;
            if (TaskHandler.javaVendor != null && (((String)(object = TaskHandler.javaVendor.toLowerCase())).indexOf("sun") != -1 || ((String)object).indexOf("apple") != -1)) {
                String string = TaskHandler.javaVersion;
                if (string.equals("1.1") || string.startsWith("1.1.") || string.equals("1.2") || string.startsWith("1.2.") || string.equals("1.3") || string.startsWith("1.3.") || string.equals("1.4") || string.startsWith("1.4.") || string.equals("1.5") || string.startsWith("1.5.") || string.equals("1.6.0")) {
                    this.error("wrongjava");
                    return;
                }
                if (string.startsWith("1.6.0_")) {
                    int n;
                    for (n = 6; n < string.length() && Huffman.isDigit(string.charAt(n)); ++n) {
                    }
                    String string2 = string.substring(6, n);
                    if (class426.isNumber(string2) && class278.method5972(string2) < 10) {
                        this.error("wrongjava");
                        return;
                    }
                }
                fiveOrOne = 5;
            }
            this.setFocusCycleRoot(true);
            this.addCanvas();
            this.setUp();
            try {
                object = new NanoClock();
            }
            catch (Throwable throwable) {
                object = new MilliClock();
            }
            class16.clock = object;
            while (0L == stopTimeMs || ReflectionCheck.method724() < stopTimeMs) {
                gameCyclesToDo = class16.clock.wait(cycleDurationMillis, fiveOrOne);
                for (int i = 0; i < gameCyclesToDo; ++i) {
                    this.clientTick();
                }
                this.graphicsTick();
                this.post(this.canvas);
            }
        }
        catch (Exception exception) {
            class255.RunException_sendStackTrace(null, exception);
            this.error("crash");
        }
        this.kill();
    }

    @Override
    public final void start() {
        if (this == gameEngine && !isKilled) {
            stopTimeMs = 0L;
            return;
        }
    }

    @Override
    public final void stop() {
        if (this == gameEngine && !isKilled) {
            stopTimeMs = ReflectionCheck.method724() + 4000L;
            return;
        }
    }

    @Override
    public final void update(Graphics graphics) {
        this.paint(graphics);
    }

    @Override
    public final void focusGained(FocusEvent focusEvent) {
        volatileFocus = true;
        this.fullRedraw = true;
    }

    @Override
    public final void windowActivated(WindowEvent windowEvent) {
    }

    @Override
    public final void windowClosing(WindowEvent windowEvent) {
        this.destroy();
    }

    @Override
    public final void windowDeactivated(WindowEvent windowEvent) {
    }

    @Override
    public final void windowDeiconified(WindowEvent windowEvent) {
    }

    @Override
    public final void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public final void windowOpened(WindowEvent windowEvent) {
    }

    @ObfuscatedName(value="init")
    @Export(value="kill0")
    public abstract void kill0();

    @Override
    public final void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public final void focusLost(FocusEvent focusEvent) {
        volatileFocus = false;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ldm;", garbageValue="1197299643")
    @Export(value="getScript")
    static Script getScript(int n) {
        Script script = (Script)Script.Script_cached.get(n);
        if (script != null) {
            return script;
        }
        byte[] byArray = class167.archive12.takeFile(n, 0);
        if (byArray != null) {
            script = GrandExchangeOfferAgeComparator.newScript(byArray);
            Script.Script_cached.put(script, n);
            return script;
        }
        return null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;ZI)[B", garbageValue="2006237067")
    public static byte[] method676(Object object, boolean bl) {
        if (object == null) {
            return null;
        }
        if (!(object instanceof byte[])) {
            if (!(object instanceof AbstractByteArrayCopier)) {
                throw new IllegalArgumentException();
            }
            AbstractByteArrayCopier abstractByteArrayCopier = (AbstractByteArrayCopier)object;
            return abstractByteArrayCopier.get();
        }
        byte[] byArray = (byte[])object;
        if (!bl) {
            return byArray;
        }
        int n = byArray.length;
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, 0, byArray2, 0, n);
        byte[] byArray3 = byArray2;
        return byArray3;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIILkl;II)V", garbageValue="2089784113")
    static void method593(int n, int n2, int n3, ObjectComposition objectComposition, int n4) {
        ObjectSound objectSound = new ObjectSound();
        objectSound.field835 = n;
        objectSound.field837 = n2 * 128;
        objectSound.field834 = n3 * 128;
        int n5 = objectComposition.sizeX;
        int n6 = objectComposition.sizeY;
        if (n4 == 1 || n4 == 3) {
            n5 = objectComposition.sizeY;
            n6 = objectComposition.sizeX;
        }
        objectSound.field838 = (n5 + n2) * 128;
        objectSound.field839 = (n6 + n3) * 128;
        objectSound.soundEffectId = objectComposition.ambientSoundId;
        objectSound.field840 = objectComposition.int7 * 128;
        objectSound.field841 = Math.max(objectComposition.field2835 * 128 - 128, 0);
        objectSound.field844 = objectComposition.int5;
        objectSound.field845 = objectComposition.int6;
        objectSound.field849 = objectComposition.soundEffectIds;
        if (objectComposition.transforms != null) {
            objectSound.obj = objectComposition;
            objectSound.set();
        }
        ObjectSound.objectSounds.addFirst(objectSound);
        if (objectSound.field849 != null) {
            objectSound.field847 = objectSound.field844 + (int)(Math.random() * (double)(objectSound.field845 - objectSound.field844));
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1884954619")
    public static boolean method673(int n) {
        return (n >> 20 & 1) != 0;
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(ILdm;ZS)I", garbageValue="128")
    static int method549(int n, Script script, boolean bl) {
        return 2;
    }

    @ObfuscatedName(value="gv")
    @ObfuscatedSignature(descriptor="(Lok;Ljava/lang/String;B)V", garbageValue="0")
    static void method677(Archive archive, String string) {
        ArchiveLoader archiveLoader = new ArchiveLoader(archive, string);
        Client.archiveLoaders.add(archiveLoader);
        Client.field692 = archiveLoader.groupCount + Client.field692;
    }
}

