/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cr")
@Implements(value="MenuAction")
public class MenuAction {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1769426223)
    int field914;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=465307575)
    int field911;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=791045811)
    int field906;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-829818609)
    int field904;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1480952507)
    int field908;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1603213755)
    int field909;
    @ObfuscatedName(value="ae")
    String field910;
    @ObfuscatedName(value="ax")
    String field907;
    @ObfuscatedName(value="at")
    boolean field912;

    MenuAction() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ljy;", garbageValue="-512309802")
    public static FloorUnderlayDefinition method2365(int n) {
        FloorUnderlayDefinition floorUnderlayDefinition = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get(n);
        if (floorUnderlayDefinition != null) {
            return floorUnderlayDefinition;
        }
        byte[] byArray = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n);
        floorUnderlayDefinition = new FloorUnderlayDefinition();
        if (byArray != null) {
            floorUnderlayDefinition.decode(new Buffer(byArray), n);
        }
        floorUnderlayDefinition.postDecode();
        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition, n);
        return floorUnderlayDefinition;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="82")
    static final int method2362(int n, int n2) {
        if (n == -2) {
            return 12345678;
        }
        if (n != -1) {
            if ((n2 = (n & 0x7F) * n2 / 128) < 2) {
                n2 = 2;
            } else if (n2 > 126) {
                n2 = 126;
            }
            return (n & 0xFF80) + n2;
        }
        if (n2 < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return n2;
    }

    @ObfuscatedName(value="hp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-192239950")
    static final void method2363() {
        if (Client.logoutTimer <= 0) {
            Client.timer.method8954();
            class360.updateGameState(40);
            VarpDefinition.field2508 = Client.packetWriter.getSocket();
            Client.packetWriter.removeSocket();
            return;
        }
        Client.logOut();
    }

    @ObfuscatedName(value="mi")
    @ObfuscatedSignature(descriptor="(Lna;IIIIIIB)V", garbageValue="11")
    static final void method2364(Widget widget, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        Client.alternativeScrollbarWidth = Client.field519 ? 32 : 0;
        Client.field519 = false;
        if (MouseHandler.MouseHandler_currentButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
            if (n5 >= n && n5 < n + 16 && n6 >= n2 && n6 < n2 + 16) {
                widget.scrollY -= 4;
                UserComparator8.invalidateWidget(widget);
            } else if (n5 >= n && n5 < n + 16 && n6 >= n3 + n2 - 16 && n6 < n3 + n2) {
                widget.scrollY += 4;
                UserComparator8.invalidateWidget(widget);
            } else if (n5 >= n - Client.alternativeScrollbarWidth && n5 < Client.alternativeScrollbarWidth + n + 16 && n6 >= n2 + 16 && n6 < n3 + n2 - 16) {
                n7 = n3 * (n3 - 32) / n4;
                if (n7 < 8) {
                    n7 = 8;
                }
                int n8 = n6 - n2 - 16 - n7 / 2;
                int n9 = n3 - 32 - n7;
                widget.scrollY = n8 * (n4 - n3) / n9;
                UserComparator8.invalidateWidget(widget);
                Client.field519 = true;
            }
        }
        if (Client.mouseWheelRotation != 0 && n5 >= n - (n7 = widget.width) && n6 >= n2 && n5 < n + 16 && n6 <= n3 + n2) {
            widget.scrollY += Client.mouseWheelRotation * 45;
            UserComparator8.invalidateWidget(widget);
        }
    }
}

