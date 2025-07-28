/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fj")
public class class154
extends class150 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-59590313)
    int field1700 = -1;
    @ObfuscatedName(value="ah")
    byte field1699;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class154(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        this.field1700 = buffer.readUnsignedShort();
        this.field1699 = buffer.readByte();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.method3695(this.field1700, this.field1699);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-792671172")
    public static final void method3627(int n, int n2) {
        ViewportMouse.ViewportMouse_x = n;
        ViewportMouse.ViewportMouse_y = n2;
        ViewportMouse.ViewportMouse_isInViewport = true;
        ViewportMouse.ViewportMouse_entityCount = 0;
        ViewportMouse.ViewportMouse_false0 = false;
    }

    @ObfuscatedName(value="kx")
    @ObfuscatedSignature(descriptor="(IIIIIIB)Z", garbageValue="27")
    static boolean method3621(int n, int n2, int n3, int n4, int n5, int n6) {
        return class323.method6619(class30.field131.field1321, n, n2, n3, n4, n5, n6);
    }

    @ObfuscatedName(value="kk")
    @ObfuscatedSignature(descriptor="(Ldz;Ldx;IILkq;I)V", garbageValue="-2028366493")
    static final void method3629(class103 class1032, Player player, int n, int n2, class275 class2752) {
        int n3 = player.field1266[0];
        int n4 = player.field1221[0];
        int n5 = player.transformedSize();
        CollisionMap collisionMap = class1032.field1336[class1032.field1321];
        if (n3 >= n5 && n3 < collisionMap.xSize - n5 && n4 >= n5 && n4 < collisionMap.ySize - n5) {
            if (n >= n5 && n < collisionMap.xSize - n5 && n2 >= n5 && n2 < collisionMap.ySize - n5) {
                int n6 = Client.field793.method5941(n3, n4, player.transformedSize(), class231.method5129(n, n2), collisionMap, true, Client.field799, Client.field800);
                if (n6 < 1) {
                    return;
                }
                for (int i = 0; i < n6 - 1; ++i) {
                    player.method2678(Client.field799[i], Client.field800[i], class2752);
                }
                return;
            }
            return;
        }
    }
}

