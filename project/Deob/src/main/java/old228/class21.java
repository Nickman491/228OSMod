package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ar")
public final class class21
implements class217,
MouseWheelListener {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-2069138689)
    int field93 = 0;

    class21() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="1102146793")
    void method316(Component component) {
        component.addMouseWheelListener(this);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="-1399283481")
    void method311(Component component) {
        component.removeMouseWheelListener(this);
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="38")
    public synchronized int vmethod4941() {
        int n = this.field93;
        this.field93 = 0;
        return n;
    }

    @Override
    public synchronized void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        this.field93 += mouseWheelEvent.getWheelRotation();
    }
}

