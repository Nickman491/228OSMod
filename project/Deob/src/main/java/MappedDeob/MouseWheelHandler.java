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
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ar")
@Implements(value="MouseWheelHandler")
public final class MouseWheelHandler
implements class217,
MouseWheelListener {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-2069138689)
    @Export(value="rotation")
    int rotation = 0;

    MouseWheelHandler() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="1102146793")
    @Export(value="addTo")
    void addTo(Component component) {
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
    @Export(value="useRotation")
    public synchronized int useRotation() {
        int n = this.rotation;
        this.rotation = 0;
        return n;
    }

    @Override
    public synchronized void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        this.rotation += mouseWheelEvent.getWheelRotation();
    }
}

