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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fw")
@Implements(value="ClanChannelMember")
public class ClanChannelMember {
    @ObfuscatedName(value="ay")
    @Export(value="rank")
    public byte rank;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1001783433)
    @Export(value="world")
    public int world;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lwb;")
    @Export(value="username")
    public Username username;

    ClanChannelMember() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;B)V", garbageValue="43")
    static void method3609(Component component) {
        component.removeMouseListener(MouseHandler.MouseHandler_instance);
        component.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
        component.removeFocusListener(MouseHandler.MouseHandler_instance);
        MouseHandler.MouseHandler_currentButtonVolatile = 0;
    }
}

