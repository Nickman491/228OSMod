package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.applet.Applet;
import java.awt.Canvas;
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
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bt")
public abstract class class34
extends Applet
implements Runnable,
FocusListener,
WindowListener {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lix;")
    protected static class214 field156;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lbt;")
    static class34 field155;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1722620173)
    static int field184;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=5464962418765997645L)
    static long field157;
    @ObfuscatedName(value="ad")
    static boolean field158;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-213826595)
    static int field160;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-754473845)
    protected static int field161;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=303838851)
    static int field162;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-572708001)
    protected static int field163;
    @ObfuscatedName(value="aq")
    static long[] field164;
    @ObfuscatedName(value="aa")
    static long[] field165;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-1107754689)
    static int field176;
    @ObfuscatedName(value="ba")
    static volatile boolean field185;
    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="Laj;")
    protected static class25 field186;
    @ObfuscatedName(value="bo")
    @ObfuscatedGetter(longValue=1088414789088896831L)
    static long field181;
    @ObfuscatedName(value="be")
    @ObfuscatedGetter(longValue=3858079444675219951L)
    static long field188;
    @ObfuscatedName(value="jj")
    @ObfuscatedSignature(descriptor="Ldz;")
    static class103 field189;
    @ObfuscatedName(value="an")
    boolean field159 = false;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1428336891)
    protected int field182;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-812457647)
    protected int field178;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-315770341)
    int field187 = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1665662357)
    int field169 = 0;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=2015058129)
    int field170;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-587645521)
    int field171;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=544990267)
    int field172;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=2035349253)
    int field175;
    @ObfuscatedName(value="bh")
    protected boolean field174 = false;
    @ObfuscatedName(value="bx")
    Frame field173;
    @ObfuscatedName(value="bd")
    Canvas field154;
    @ObfuscatedName(value="bi")
    volatile boolean field177 = true;
    @ObfuscatedName(value="bf")
    boolean field179 = false;
    @ObfuscatedName(value="by")
    volatile boolean field180 = false;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(longValue=9000124658905312171L)
    volatile long field183 = 0L;
    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="Lar;")
    class21 field167;
    @ObfuscatedName(value="bv")
    Clipboard field168;
    @ObfuscatedName(value="bq")
    final EventQueue field166;

    static {
        field155 = null;
        field184 = 0;
        field157 = 0L;
        field158 = false;
        field161 = 20;
        field162 = 1;
        field163 = 0;
        field164 = new long[32];
        field165 = new long[32];
        field176 = 500;
        field185 = true;
        field186 = new class25();
        field181 = -1L;
        field188 = -1L;
    }

    protected class34() {
        EventQueue eventQueue = null;
        try {
            eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.field166 = eventQueue;
        class22 class2210 = new class22();
        class355.field3788 = class2210;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="307314874")
    protected final void method525(int n, int n2) {
        if (this.field172 != n || n2 != this.field175) {
            this.method640();
        }
        this.field172 = n;
        this.field175 = n2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;I)V", garbageValue="-1433952013")
    final void method526(Object object) {
        if (this.field166 == null) {
            return;
        }
        for (int i = 0; i < 50 && this.field166.peekEvent() != null; ++i) {
            class174.method3881(1L);
        }
        if (object != null) {
            this.field166.postEvent(new ActionEvent(object, 1001, "dummy"));
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Lis;", garbageValue="54929218")
    protected class217 method553() {
        if (this.field167 == null) {
            this.field167 = new class21();
            this.field167.method316(this.field154);
        }
        return this.field167;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-48")
    protected void method620() {
        this.field168 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="64")
    protected void method529(String string) {
        this.field168.setContents(new StringSelection(string), null);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Ljava/awt/datatransfer/Clipboard;", garbageValue="-1024779189")
    protected Clipboard method551() {
        return this.field168;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="41")
    protected final void method565() {
        if (class214.field2382.toLowerCase().indexOf("microsoft") == -1) {
            class28.field126[44] = 71;
            class28.field126[45] = 26;
            class28.field126[46] = 72;
            class28.field126[47] = 73;
            class28.field126[59] = 57;
            class28.field126[61] = 27;
            class28.field126[91] = 42;
            class28.field126[92] = 74;
            class28.field126[93] = 43;
            class28.field126[192] = 28;
            class28.field126[222] = 58;
            class28.field126[520] = 59;
        } else {
            class28.field126[186] = 57;
            class28.field126[187] = 27;
            class28.field126[188] = 71;
            class28.field126[189] = 26;
            class28.field126[190] = 72;
            class28.field126[191] = 73;
            class28.field126[192] = 58;
            class28.field126[219] = 42;
            class28.field126[220] = 74;
            class28.field126[221] = 43;
            class28.field126[222] = 59;
            class28.field126[223] = 28;
        }
        field186.method361(this.field154);
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="206898290")
    protected final void method532() {
        field186.method364();
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Lbb;II)V", garbageValue="-1559149149")
    protected void method533(class29 class2910, int n) {
        field186.method368(class2910, n);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-1839")
    protected final void method534() {
        class131.method3379(this.field154);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-670717205")
    final void method550() {
        Container container = this.method559();
        if (container == null) {
            return;
        }
        class423 class4232 = this.method560();
        this.field182 = Math.max(class4232.field4734, this.field170);
        this.field178 = Math.max(class4232.field4733, this.field171);
        if (this.field182 <= 0) {
            this.field182 = 1;
        }
        if (this.field178 <= 0) {
            this.field178 = 1;
        }
        class128.field1521 = Math.min(this.field182, this.field172);
        class363.field4038 = Math.min(this.field178, this.field175);
        this.field187 = (this.field182 - class128.field1521) / 2;
        this.field169 = 0;
        this.field154.setSize(class128.field1521, class363.field4038);
        class6.field14 = new class32(class128.field1521, class363.field4038, this.field154, this.field174);
        if (container != this.field173) {
            this.field154.setLocation(this.field187, this.field169);
        } else {
            Insets insets = this.field173.getInsets();
            this.field154.setLocation(this.field187 + insets.left, this.field169 + insets.top);
        }
        this.field177 = true;
        this.vmethod1631();
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1848806273")
    protected abstract void vmethod1631();

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1259549085")
    void method537() {
        int n = this.field187;
        int n2 = this.field169;
        int n3 = this.field182 - class128.field1521 - n;
        int n4 = this.field178 - class363.field4038 - n2;
        if (n > 0 || n3 > 0 || n2 > 0 || n4 > 0) {
            try {
                Object object;
                Container container = this.method559();
                int n5 = 0;
                int n6 = 0;
                if (container == this.field173) {
                    object = this.field173.getInsets();
                    n5 = ((Insets)object).left;
                    n6 = ((Insets)object).top;
                }
                object = container.getGraphics();
                ((Graphics)object).setColor(Color.black);
                if (n > 0) {
                    ((Graphics)object).fillRect(n5, n6, n, this.field178);
                }
                if (n2 > 0) {
                    ((Graphics)object).fillRect(n5, n6, this.field182, n2);
                }
                if (n3 > 0) {
                    ((Graphics)object).fillRect(n5 + this.field182 - n3, n6, n3, this.field178);
                }
                if (n4 > 0) {
                    ((Graphics)object).fillRect(n5, n6 + this.field178 - n4, this.field182, n4);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="901715879")
    final void method538() {
        field186.method363(this.field154);
        class152.method3609(this.field154);
        if (this.field167 != null) {
            this.field167.method311(this.field154);
        }
        this.method636();
        field186.method361(this.field154);
        class131.method3379(this.field154);
        if (this.field167 != null) {
            this.field167.method316(this.field154);
        }
        this.method640();
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1610291587")
    protected final void method539(int n, int n2, int n3, int n4) {
        try {
            if (field155 != null) {
                if (++field184 >= 3) {
                    this.method536("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field155 = this;
            class128.field1521 = n;
            class363.field4038 = n2;
            class582.field5650 = n3;
            class484.field5050 = n4;
            class582.field5649 = this;
            if (field156 == null) {
                field156 = new class214();
            }
            field156.method4912(this, 1);
        }
        catch (Exception exception) {
            class255.method5410(null, exception);
            this.method536("crash");
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1182885754")
    final synchronized void method636() {
        Insets insets;
        Container container = this.method559();
        if (this.field154 != null) {
            this.field154.removeFocusListener(this);
            container.remove(this.field154);
        }
        class128.field1521 = Math.max(container.getWidth(), this.field170);
        class363.field4038 = Math.max(container.getHeight(), this.field171);
        if (this.field173 != null) {
            insets = this.field173.getInsets();
            class128.field1521 -= insets.left + insets.right;
            class363.field4038 -= insets.top + insets.bottom;
        }
        this.field154 = new class23(this);
        container.setBackground(Color.BLACK);
        container.setLayout(null);
        container.add(this.field154);
        this.field154.setSize(class128.field1521, class363.field4038);
        this.field154.setVisible(true);
        this.field154.setBackground(Color.BLACK);
        if (container != this.field173) {
            this.field154.setLocation(this.field187, this.field169);
        } else {
            insets = this.field173.getInsets();
            this.field154.setLocation(insets.left + this.field187, this.field169 + insets.top);
        }
        this.field154.addFocusListener(this);
        this.field154.requestFocus();
        this.field177 = true;
        if (class6.field14 != null && class128.field1521 == class6.field14.field5551 && class363.field4038 == class6.field14.field5550) {
            ((class32)class6.field14).method499(this.field154);
            class6.field14.vmethod10689(0, 0);
        } else {
            class6.field14 = new class32(class128.field1521, class363.field4038, this.field154, this.field174);
        }
        this.field180 = false;
        this.field183 = class37.method724();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="107")
    protected void method541(boolean bl) {
        if (this.field174 != bl) {
            this.field174 = bl;
            class6.field14.method10691(bl);
            class6.field14.method10693();
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="82")
    protected final boolean method542() {
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
                this.method536("invalidhost");
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
    void method543() {
        long l = class37.method724();
        long l2 = field165[class561.field5532];
        class34.field165[class561.field5532] = l;
        class561.field5532 = class561.field5532 + 1 & 0x1F;
        if (0L == l2 || l > l2) {
            // empty if block
        }
        class34 class347 = this;
        synchronized (class347) {
            class80.field998 = field185;
        }
        this.vmethod1501();
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="706177694")
    protected final void method544() {
        this.field177 = true;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2017959842")
    void method545() {
        Container container = this.method559();
        long l = class37.method724();
        long l2 = field164[class477.field5015];
        class34.field164[class477.field5015] = l;
        class477.field5015 = class477.field5015 + 1 & 0x1F;
        if (l2 != 0L && l > l2) {
            int n = (int)(l - l2);
            field163 = ((n >> 1) + 32000) / n;
        }
        if (++field176 - 1 > 50) {
            field176 -= 50;
            this.field177 = true;
            this.field154.setSize(class128.field1521, class363.field4038);
            this.field154.setVisible(true);
            if (container != this.field173) {
                this.field154.setLocation(this.field187, this.field169);
            } else {
                Insets insets = this.field173.getInsets();
                this.field154.setLocation(insets.left + this.field187, insets.top + this.field169);
            }
        }
        if (this.field180) {
            this.method538();
        }
        this.method546();
        this.vmethod1299(this.field177);
        if (this.field177) {
            this.method537();
        }
        this.field177 = false;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1446954978")
    final void method546() {
        class423 class4232 = this.method560();
        if (class4232.field4734 != this.field182 || this.field178 != class4232.field4733 || this.field179) {
            this.method550();
            this.field179 = false;
        }
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-124")
    final void method640() {
        this.field179 = true;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="97")
    final synchronized void method548() {
        if (field158) {
            return;
        }
        field158 = true;
        try {
            this.field154.removeFocusListener(this);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            this.vmethod1300();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.field173 != null) {
            try {
                System.exit(0);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (field156 != null) {
            try {
                field156.method4909();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.vmethod1282();
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-494623143")
    protected abstract void vmethod1297();

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1077900572")
    protected abstract void vmethod1501();

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-861113109")
    protected abstract void vmethod1299(boolean var1);

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-12")
    protected abstract void vmethod1300();

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;ZZI)V", garbageValue="441069439")
    protected final void method556(int n, String string, boolean bl, boolean bl2) {
        try {
            Graphics graphics = this.field154.getGraphics();
            if (class197.field2183 == null) {
                class197.field2183 = new Font("Helvetica", 1, 13);
                class124.field1494 = this.field154.getFontMetrics(class197.field2183);
            }
            if (bl && !bl2) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, class128.field1521, class363.field4038);
            }
            Color color = new Color(140, 17, 17);
            try {
                if (class232.field2500 == null) {
                    class232.field2500 = this.field154.createImage(304, 34);
                }
                Graphics graphics2 = class232.field2500.getGraphics();
                graphics2.setColor(color);
                graphics2.drawRect(0, 0, 303, 33);
                graphics2.fillRect(2, 2, n * 3, 30);
                graphics2.setColor(Color.black);
                graphics2.drawRect(1, 1, 301, 31);
                graphics2.fillRect(n * 3 + 2, 2, 300 - n * 3, 30);
                graphics2.setFont(class197.field2183);
                graphics2.setColor(Color.white);
                graphics2.drawString(string, (304 - class124.field1494.stringWidth(string)) / 2, 22);
                graphics.drawImage(class232.field2500, class128.field1521 / 2 - 152, class363.field4038 / 2 + (bl2 ? 50 : -18), null);
            }
            catch (Exception exception) {
                int n2 = class128.field1521 / 2 - 152;
                int n3 = class363.field4038 / 2 - 18;
                graphics.setColor(color);
                graphics.drawRect(n2, n3, 303, 33);
                graphics.fillRect(n2 + 2, n3 + 2, n * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(n2 + 1, n3 + 1, 301, 31);
                graphics.fillRect(n * 3 + n2 + 2, n3 + 2, 300 - n * 3, 30);
                graphics.setFont(class197.field2183);
                graphics.setColor(Color.white);
                graphics.drawString(string, n2 + (304 - class124.field1494.stringWidth(string)) / 2, n3 + 22);
            }
        }
        catch (Exception exception) {
            this.field154.repaint();
        }
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="79")
    protected final void method557() {
        class232.field2500 = null;
        class197.field2183 = null;
        class124.field1494 = null;
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-342460508")
    protected void method536(String string) {
        if (this.field159) {
            return;
        }
        this.field159 = true;
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
    Container method559() {
        if (this.field173 != null) {
            return this.field173;
        }
        return this;
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(I)Lql;", garbageValue="-381002297")
    class423 method560() {
        Container container = this.method559();
        int n = Math.max(container.getWidth(), this.field170);
        int n2 = Math.max(container.getHeight(), this.field171);
        if (this.field173 != null) {
            Insets insets = this.field173.getInsets();
            n -= insets.right + insets.left;
            n2 -= insets.bottom + insets.top;
        }
        return new class423(n, n2);
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="44")
    protected final boolean method561() {
        return this.field173 != null;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="26444")
    protected abstract void vmethod1282();

    @Override
    public final void destroy() {
        if (this == field155 && !field158) {
            field157 = class37.method724();
            class174.method3881(5000L);
            this.method548();
            return;
        }
    }

    @Override
    public final synchronized void paint(Graphics graphics) {
        if (this == field155 && !field158) {
            Rectangle rectangle;
            this.field177 = true;
            if (class37.method724() - this.field183 > 1000L && ((rectangle = graphics.getClipBounds()) == null || rectangle.width >= class128.field1521 && rectangle.height >= class363.field4038)) {
                this.field180 = true;
            }
            return;
        }
    }

    @Override
    public void run() {
        try {
            Object object;
            if (class214.field2382 != null && (((String)(object = class214.field2382.toLowerCase())).indexOf("sun") != -1 || ((String)object).indexOf("apple") != -1)) {
                String string = class214.field2379;
                if (string.equals("1.1") || string.startsWith("1.1.") || string.equals("1.2") || string.startsWith("1.2.") || string.equals("1.3") || string.startsWith("1.3.") || string.equals("1.4") || string.startsWith("1.4.") || string.equals("1.5") || string.startsWith("1.5.") || string.equals("1.6.0")) {
                    this.method536("wrongjava");
                    return;
                }
                if (string.startsWith("1.6.0_")) {
                    int n;
                    for (n = 6; n < string.length() && class363.method7571(string.charAt(n)); ++n) {
                    }
                    String string2 = string.substring(6, n);
                    if (class426.method8330(string2) && class278.method5972(string2) < 10) {
                        this.method536("wrongjava");
                        return;
                    }
                }
                field162 = 5;
            }
            this.setFocusCycleRoot(true);
            this.method636();
            this.vmethod1297();
            try {
                object = new class210();
            }
            catch (Throwable throwable) {
                object = new class219();
            }
            class16.field70 = object;
            while (0L == field157 || class37.method724() < field157) {
                field160 = class16.field70.vmethod5072(field161, field162);
                for (int i = 0; i < field160; ++i) {
                    this.method543();
                }
                this.method545();
                this.method526(this.field154);
            }
        }
        catch (Exception exception) {
            class255.method5410(null, exception);
            this.method536("crash");
        }
        this.method548();
    }

    @Override
    public final void start() {
        if (this == field155 && !field158) {
            field157 = 0L;
            return;
        }
    }

    @Override
    public final void stop() {
        if (this == field155 && !field158) {
            field157 = class37.method724() + 4000L;
            return;
        }
    }

    @Override
    public final void update(Graphics graphics) {
        this.paint(graphics);
    }

    @Override
    public final void focusGained(FocusEvent focusEvent) {
        field185 = true;
        this.field177 = true;
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

    @Override
    public abstract void init();

    @Override
    public final void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public final void focusLost(FocusEvent focusEvent) {
        field185 = false;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ldm;", garbageValue="1197299643")
    static class81 method657(int n) {
        class81 class812 = (class81)class81.field1009.method6578(n);
        if (class812 != null) {
            return class812;
        }
        byte[] byArray = class167.field1793.method7790(n, 0);
        if (byArray != null) {
            class812 = class396.method7891(byArray);
            class81.field1009.method6590(class812, n);
            return class812;
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
            if (!(object instanceof class365)) {
                throw new IllegalArgumentException();
            }
            class365 class3652 = (class365)object;
            return class3652.vmethod7601();
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
    static void method593(int n, int n2, int n3, ObjectDef class2622, int n4) {
        class71 class712 = new class71();
        class712.field835 = n;
        class712.field837 = n2 * 128;
        class712.field834 = n3 * 128;
        int n5 = class2622.field2804;
        int n6 = class2622.field2805;
        if (n4 == 1 || n4 == 3) {
            n5 = class2622.field2805;
            n6 = class2622.field2804;
        }
        class712.field838 = (n5 + n2) * 128;
        class712.field839 = (n6 + n3) * 128;
        class712.field842 = class2622.field2819;
        class712.field840 = class2622.field2834 * 16384;
        class712.field841 = Math.max(class2622.field2835 * 16384 - 128, 0);
        class712.field844 = class2622.field2814;
        class712.field845 = class2622.field2811;
        class712.field849 = class2622.field2812;
        if (class2622.field2837 != null) {
            class712.field848 = class2622;
            class712.method2092();
        }
        class71.field846.method7998(class712);
        if (class712.field849 != null) {
            class712.field847 = class712.field844 + (int)(Math.random() * (double)(class712.field845 - class712.field844));
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1884954619")
    public static boolean method673(int n) {
        return (n >> 20 & 1) != 0;
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(ILdm;ZS)I", garbageValue="128")
    static int method549(int n, class81 class812, boolean bl) {
        return 2;
    }

    @ObfuscatedName(value="gv")
    @ObfuscatedSignature(descriptor="(Lok;Ljava/lang/String;B)V", garbageValue="0")
    static void method677(class388 class3882, String string) {
        class86 class862 = new class86(class3882, string);
        client.field795.add(class862);
        client.field692 = class862.field1051 + client.field692;
    }
}

