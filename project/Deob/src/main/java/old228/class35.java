package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bf")
public class class35
implements MouseListener,
MouseMotionListener,
FocusListener {
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lbf;")
    public static class35 field194 = new class35();
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1935338615)
    public static volatile int field192 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=2124270049)
    static volatile int field196 = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=2010003039)
    static volatile int field197 = -1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-639100369)
    static volatile int field208 = -1;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(longValue=-7774804721691637273L)
    static volatile long field199 = -1L;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1366721987)
    public static int field206 = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1010925675)
    public static int field201 = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1325943563)
    public static int field202 = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(longValue=7494149260762752325L)
    public static long field203 = 0L;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1715819817)
    static volatile int field204 = 0;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1731558015)
    static volatile int field205 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=536695409)
    static volatile int field210 = 0;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(longValue=5545250730838176113L)
    static volatile long field207 = 0L;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=820326979)
    public static int field200 = 0;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=107791339)
    public static int field209 = 0;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=54128059)
    public static int field211 = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(longValue=2043095713508668419L)
    public static long field191 = 0L;

    class35() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/awt/event/MouseEvent;I)I", garbageValue="44205247")
    final int method686(MouseEvent mouseEvent) {
        int n = mouseEvent.getButton();
        if (!mouseEvent.isAltDown() && n != 2) {
            if (!mouseEvent.isMetaDown() && n != 3) {
                return 1;
            }
            return 2;
        }
        return 4;
    }

    @Override
    public final synchronized void mouseMoved(MouseEvent mouseEvent) {
        if (field194 != null) {
            field192 = 0;
            field197 = mouseEvent.getX();
            field208 = mouseEvent.getY();
            field199 = mouseEvent.getWhen();
        }
    }

    @Override
    public final synchronized void mouseReleased(MouseEvent mouseEvent) {
        if (field194 != null) {
            field192 = 0;
            field196 = 0;
        }
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }

    @Override
    public final synchronized void mouseEntered(MouseEvent mouseEvent) {
        this.mouseMoved(mouseEvent);
    }

    @Override
    public final synchronized void mouseExited(MouseEvent mouseEvent) {
        if (field194 != null) {
            field192 = 0;
            field197 = -1;
            field208 = -1;
            field199 = mouseEvent.getWhen();
        }
    }

    @Override
    public final synchronized void mouseDragged(MouseEvent mouseEvent) {
        this.mouseMoved(mouseEvent);
    }

    @Override
    public final void focusGained(FocusEvent focusEvent) {
    }

    @Override
    public final synchronized void focusLost(FocusEvent focusEvent) {
        if (field194 != null) {
            field196 = 0;
        }
    }

    @Override
    public final synchronized void mousePressed(MouseEvent mouseEvent) {
        if (field194 != null) {
            field192 = 0;
            field205 = mouseEvent.getX();
            field210 = mouseEvent.getY();
            field207 = class37.method724();
            field204 = this.method686(mouseEvent);
            if (field204 != 0) {
                field196 = field204;
            }
        }
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }

    @Override
    public final void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lcx;Lcx;IZIZI)I", garbageValue="-1698347438")
    static int method703(class69 class692, class69 class693, int n, boolean bl, int n2, boolean bl2) {
        int n3 = class133.method3436(class692, class693, n, bl);
        if (n3 == 0) {
            if (n2 == -1) {
                return 0;
            }
            int n4 = class133.method3436(class692, class693, n2, bl2);
            if (bl2) {
                return -n4;
            }
            return n4;
        }
        if (bl) {
            return -n3;
        }
        return n3;
    }

    @ObfuscatedName(value="nw")
    @ObfuscatedSignature(descriptor="(IIZB)V", garbageValue="-8")
    static final void method678(int n, int n2, boolean bl) {
        if (client.field738[n] == null) {
            return;
        }
        if (n2 >= 0 && n2 < client.field738[n].method3837()) {
            class152 class1522 = (class152)client.field738[n].field1808.get(n2);
            class324 class3242 = class90.method2629(class322.field3411, client.field564.field1446);
            class3242.field3442.method10300(4 + class91.method2631(class1522.field1685.method10969()));
            class3242.field3442.method10300(n);
            class3242.field3442.method10266(n2);
            class3242.field3442.method10329(bl);
            class3242.field3442.method10442(class1522.field1685.method10969());
            client.field564.method3257(class3242);
            return;
        }
    }
}

