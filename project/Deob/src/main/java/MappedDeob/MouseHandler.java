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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bf")
@Implements(value="MouseHandler")
public class MouseHandler
implements MouseListener,
MouseMotionListener,
FocusListener {
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lbf;")
    @Export(value="MouseHandler_instance")
    public static MouseHandler MouseHandler_instance = new MouseHandler();
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1935338615)
    @Export(value="MouseHandler_idleCycles")
    public static volatile int MouseHandler_idleCycles = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=2124270049)
    @Export(value="MouseHandler_currentButtonVolatile")
    static volatile int MouseHandler_currentButtonVolatile = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=2010003039)
    @Export(value="MouseHandler_xVolatile")
    static volatile int MouseHandler_xVolatile = -1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-639100369)
    @Export(value="MouseHandler_yVolatile")
    static volatile int MouseHandler_yVolatile = -1;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(longValue=-7774804721691637273L)
    @Export(value="MouseHandler_lastMovedVolatile")
    static volatile long MouseHandler_lastMovedVolatile = -1L;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1366721987)
    @Export(value="MouseHandler_currentButton")
    public static int MouseHandler_currentButton = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1010925675)
    @Export(value="MouseHandler_x")
    public static int MouseHandler_x = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1325943563)
    @Export(value="MouseHandler_y")
    public static int MouseHandler_y = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(longValue=7494149260762752325L)
    @Export(value="MouseHandler_millis")
    public static long MouseHandler_millis = 0L;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1715819817)
    @Export(value="MouseHandler_lastButtonVolatile")
    static volatile int MouseHandler_lastButtonVolatile = 0;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1731558015)
    @Export(value="MouseHandler_lastPressedXVolatile")
    static volatile int MouseHandler_lastPressedXVolatile = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=536695409)
    @Export(value="MouseHandler_lastPressedYVolatile")
    static volatile int MouseHandler_lastPressedYVolatile = 0;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(longValue=5545250730838176113L)
    @Export(value="MouseHandler_lastPressedTimeMillisVolatile")
    static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=820326979)
    @Export(value="MouseHandler_lastButton")
    public static int MouseHandler_lastButton = 0;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=107791339)
    @Export(value="MouseHandler_lastPressedX")
    public static int MouseHandler_lastPressedX = 0;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=54128059)
    @Export(value="MouseHandler_lastPressedY")
    public static int MouseHandler_lastPressedY = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(longValue=2043095713508668419L)
    @Export(value="MouseHandler_lastPressedTimeMillis")
    public static long MouseHandler_lastPressedTimeMillis = 0L;

    MouseHandler() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/awt/event/MouseEvent;I)I", garbageValue="44205247")
    @Export(value="getButton")
    final int getButton(MouseEvent mouseEvent) {
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
        if (MouseHandler_instance != null) {
            MouseHandler_idleCycles = 0;
            MouseHandler_xVolatile = mouseEvent.getX();
            MouseHandler_yVolatile = mouseEvent.getY();
            MouseHandler_lastMovedVolatile = mouseEvent.getWhen();
        }
    }

    @Override
    public final synchronized void mouseReleased(MouseEvent mouseEvent) {
        if (MouseHandler_instance != null) {
            MouseHandler_idleCycles = 0;
            MouseHandler_currentButtonVolatile = 0;
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
        if (MouseHandler_instance != null) {
            MouseHandler_idleCycles = 0;
            MouseHandler_xVolatile = -1;
            MouseHandler_yVolatile = -1;
            MouseHandler_lastMovedVolatile = mouseEvent.getWhen();
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
        if (MouseHandler_instance != null) {
            MouseHandler_currentButtonVolatile = 0;
        }
    }

    @Override
    public final synchronized void mousePressed(MouseEvent mouseEvent) {
        if (MouseHandler_instance != null) {
            MouseHandler_idleCycles = 0;
            MouseHandler_lastPressedXVolatile = mouseEvent.getX();
            MouseHandler_lastPressedYVolatile = mouseEvent.getY();
            MouseHandler_lastPressedTimeMillisVolatile = ReflectionCheck.method724();
            MouseHandler_lastButtonVolatile = this.getButton(mouseEvent);
            if (MouseHandler_lastButtonVolatile != 0) {
                MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
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
    static int method703(World world, World world2, int n, boolean bl, int n2, boolean bl2) {
        int n3 = class133.compareWorlds(world, world2, n, bl);
        if (n3 == 0) {
            if (n2 == -1) {
                return 0;
            }
            int n4 = class133.compareWorlds(world, world2, n2, bl2);
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
        if (Client.currentClanChannels[n] == null) {
            return;
        }
        if (n2 >= 0 && n2 < Client.currentClanChannels[n].method3837()) {
            ClanChannelMember clanChannelMember = (ClanChannelMember)Client.currentClanChannels[n].members.get(n2);
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3411, Client.packetWriter.isaacCipher);
            packetBufferNode.packetBuffer.writeByte(4 + MouseRecorder.stringCp1252NullTerminatedByteSize(clanChannelMember.username.getName()));
            packetBufferNode.packetBuffer.writeByte(n);
            packetBufferNode.packetBuffer.writeShort(n2);
            packetBufferNode.packetBuffer.writeBoolean(bl);
            packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(clanChannelMember.username.getName());
            Client.packetWriter.addNode(packetBufferNode);
            return;
        }
    }
}

