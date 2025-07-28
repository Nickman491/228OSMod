package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="aj")
public class class25
implements KeyListener,
FocusListener {
    @ObfuscatedName(value="ax")
    public static int[] field108;
    @ObfuscatedName(value="ei")
    static boolean field109;
    @ObfuscatedName(value="ah")
    Collection field102;
    @ObfuscatedName(value="az")
    Collection field103;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="[Lbb;")
    class29[] field105 = new class29[3];
    @ObfuscatedName(value="ad")
    boolean[] field104 = new boolean[112];
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1024475951)
    volatile int field106 = 0;

    class25() {
        this.field102 = new ArrayList(100);
        this.field103 = new ArrayList(100);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lbb;IB)V", garbageValue="53")
    void method368(class29 class2910, int n) {
        this.field105[n] = class2910;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1819629984")
    public int method362() {
        return this.field106;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="-2076398807")
    void method361(Component component) {
        component.setFocusTraversalKeysEnabled(false);
        component.addKeyListener(this);
        component.addFocusListener(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="-528580682")
    synchronized void method363(Component component) {
        component.removeKeyListener(this);
        component.removeFocusListener(this);
        class25 class2510 = this;
        synchronized (class2510) {
            this.field102.add(new class33(4, 0));
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1798794123")
    void method364() {
        ++this.field106;
        this.method366();
        Iterator iterator = this.field103.iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                this.field103.clear();
                return;
            }
            class33 class3310 = (class33)iterator.next();
            int n = 0;
            while (true) {
                if (n >= this.field105.length || class3310.method519(this.field105[n])) continue block0;
                ++n;
            }
            break;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="4548")
    synchronized void method366() {
        Collection collection = this.field103;
        this.field103 = this.field102;
        this.field102 = collection;
    }

    @Override
    public final synchronized void keyPressed(KeyEvent keyEvent) {
        int n;
        int n2;
        int n3 = keyEvent.getKeyCode();
        if (n3 < 0 || (n2 = n3) >= (n = class28.field126.length)) {
            n3 = -1;
        } else {
            int n4;
            n3 = n4 = class28.field126[n3];
            if (class389.method7722(n3)) {
                n3 = -1;
            }
        }
        if (n3 >= 0) {
            if (!this.field104[n3]) {
                this.field106 = 0;
            }
            this.field104[n3] = true;
            this.field102.add(new class33(1, n3));
        }
        keyEvent.consume();
    }

    @Override
    public final synchronized void keyReleased(KeyEvent keyEvent) {
        int n;
        int n2;
        int n3 = keyEvent.getKeyCode();
        if (n3 < 0 || (n2 = n3) >= (n = class28.field126.length)) {
            n3 = -1;
        } else {
            int n4 = class28.field126[n3];
            n3 = n4 & 0xFFFFFF7F;
        }
        if (n3 >= 0) {
            this.field104[n3] = false;
            this.field102.add(new class33(2, n3));
        }
        keyEvent.consume();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final synchronized void keyTyped(KeyEvent keyEvent) {
        char c = keyEvent.getKeyChar();
        if (c != '\u0000' && c != '\uffff') {
            boolean bl;
            if (c > '\u0000' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
                bl = true;
            } else if (c != '\u0000') {
                char[] cArray = class417.field4711;
                for (int i = 0; i < cArray.length; ++i) {
                    char c2 = cArray[i];
                    if (c != c2) continue;
                    bl = true;
                    break;
                }
            } else {
                bl = false;
            }
            if (bl) {
                this.field102.add(new class33(3, c));
            }
        }
        keyEvent.consume();
    }

    @Override
    public final synchronized void focusGained(FocusEvent focusEvent) {
        this.field102.add(new class33(4, 1));
    }

    @Override
    public final synchronized void focusLost(FocusEvent focusEvent) {
        int n = 0;
        while (true) {
            if (n >= 112) {
                this.field102.add(new class33(4, 0));
                return;
            }
            if (this.field104[n]) {
                this.field104[n] = false;
                this.field102.add(new class33(2, n));
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="-1569725911")
    public static void method373(class391 class3912) {
        class229.field2484 = class3912;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILsh;Lok;I)V", garbageValue="1442958615")
    static void method401(int n, class490 class4902, class388 class3882) {
        byte[] byArray = null;
        Object object = class387.field4527;
        synchronized (object) {
            class386 class3862 = (class386)class387.field4527.method7996();
            while (class3862 != null) {
                if ((long)n == class3862.field5174 && class4902 == class3862.field4521 && class3862.field4522 == 0) {
                    byArray = class3862.field4523;
                    break;
                }
                class3862 = (class386)class387.field4527.method8005();
            }
        }
        if (byArray != null) {
            class3882.method7692(class4902, n, byArray, true);
            return;
        }
        object = class4902.method9468(n);
        class3882.method7692(class4902, n, (byte[])object, true);
    }
}

