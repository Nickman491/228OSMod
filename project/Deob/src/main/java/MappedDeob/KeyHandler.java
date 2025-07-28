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
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="aj")
@Implements(value="KeyHandler")
public class KeyHandler
implements KeyListener,
FocusListener {
    @ObfuscatedName(value="ax")
    @Export(value="SpriteBuffer_spritePalette")
    public static int[] SpriteBuffer_spritePalette;
    @ObfuscatedName(value="ei")
    @Export(value="mouseCam")
    static boolean mouseCam;
    @ObfuscatedName(value="ah")
    Collection field102;
    @ObfuscatedName(value="az")
    Collection field103;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="[Lbb;")
    class29[] field105 = new class29[3];
    @ObfuscatedName(value="ad")
    @Export(value="KeyHandler_pressedKeys")
    boolean[] KeyHandler_pressedKeys = new boolean[112];
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1024475951)
    @Export(value="KeyHandler_idleCycles")
    volatile int KeyHandler_idleCycles = 0;

    KeyHandler() {
        this.field102 = new ArrayList(100);
        this.field103 = new ArrayList(100);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lbb;IB)V", garbageValue="53")
    void method368(class29 class292, int n) {
        this.field105[n] = class292;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1819629984")
    public int method362() {
        return this.KeyHandler_idleCycles;
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
        KeyHandler keyHandler = this;
        synchronized (keyHandler) {
            this.field102.add(new class33(4, 0));
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1798794123")
    void method364() {
        ++this.KeyHandler_idleCycles;
        this.method366();
        Iterator iterator = this.field103.iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                this.field103.clear();
                return;
            }
            class33 class332 = (class33)iterator.next();
            int n = 0;
            while (true) {
                if (n >= this.field105.length || class332.method519(this.field105[n])) continue block0;
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
        if (n3 < 0 || (n2 = n3) >= (n = class28.KeyHandler_keyCodes.length)) {
            n3 = -1;
        } else {
            int n4;
            n3 = n4 = class28.KeyHandler_keyCodes[n3];
            if (class389.method7722(n3)) {
                n3 = -1;
            }
        }
        if (n3 >= 0) {
            if (!this.KeyHandler_pressedKeys[n3]) {
                this.KeyHandler_idleCycles = 0;
            }
            this.KeyHandler_pressedKeys[n3] = true;
            this.field102.add(new class33(1, n3));
        }
        keyEvent.consume();
    }

    @Override
    public final synchronized void keyReleased(KeyEvent keyEvent) {
        int n;
        int n2;
        int n3 = keyEvent.getKeyCode();
        if (n3 < 0 || (n2 = n3) >= (n = class28.KeyHandler_keyCodes.length)) {
            n3 = -1;
        } else {
            int n4 = class28.KeyHandler_keyCodes[n3];
            n3 = n4 & 0xFFFFFF7F;
        }
        if (n3 >= 0) {
            this.KeyHandler_pressedKeys[n3] = false;
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
                char[] cArray = class417.cp1252AsciiExtension;
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
            if (this.KeyHandler_pressedKeys[n]) {
                this.KeyHandler_pressedKeys[n] = false;
                this.field102.add(new class33(2, n));
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="-1569725911")
    public static void method373(AbstractArchive abstractArchive) {
        InvDefinition.InvDefinition_archive = abstractArchive;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILsh;Lok;I)V", garbageValue="1442958615")
    static void method401(int n, ArchiveDisk archiveDisk, Archive archive) {
        byte[] byArray = null;
        Object object = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
        synchronized (object) {
            ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
            while (archiveDiskAction != null) {
                if ((long)n == archiveDiskAction.key && archiveDisk == archiveDiskAction.archiveDisk && archiveDiskAction.type == 0) {
                    byArray = archiveDiskAction.data;
                    break;
                }
                archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous();
            }
        }
        if (byArray != null) {
            archive.load(archiveDisk, n, byArray, true);
            return;
        }
        object = archiveDisk.read(n);
        archive.load(archiveDisk, n, (byte[])object, true);
    }
}

