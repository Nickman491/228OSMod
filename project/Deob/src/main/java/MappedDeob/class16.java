/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="al")
public class class16
implements ThreadFactory {
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lit;")
    @Export(value="clock")
    static Clock clock;
    @ObfuscatedName(value="ay")
    final ThreadGroup field67;
    @ObfuscatedName(value="ah")
    final AtomicInteger field69 = new AtomicInteger(1);
    @ObfuscatedSignature(descriptor="Laa;")
    final /* synthetic */ class14 this$0;

    @ObfuscatedSignature(descriptor="(Laa;)V")
    class16(class14 class1410) {
        this.this$0 = class1410;
        SecurityManager securityManager = System.getSecurityManager();
        this.field67 = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.field67, runnable, this.this$0.field58 + "-rest-request-" + this.field69.getAndIncrement(), 0L);
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;III)[Lvi;", garbageValue="591347831")
    public static IndexedSprite[] method213(AbstractArchive abstractArchive, int n, int n2) {
        if (!WorldMapSprite.method6397(abstractArchive, n, n2)) {
            return null;
        }
        IndexedSprite[] indexedSpriteArray = new IndexedSprite[class571.SpriteBuffer_spriteCount];
        int n3 = 0;
        while (true) {
            if (n3 >= class571.SpriteBuffer_spriteCount) {
                class241.SpriteBuffer_xOffsets = null;
                class571.SpriteBuffer_yOffsets = null;
                class571.SpriteBuffer_spriteWidths = null;
                class403.SpriteBuffer_spriteHeights = null;
                KeyHandler.SpriteBuffer_spritePalette = null;
                class240.SpriteBuffer_pixels = null;
                IndexedSprite[] indexedSpriteArray2 = indexedSpriteArray;
                return indexedSpriteArray2;
            }
            IndexedSprite indexedSprite = indexedSpriteArray[n3] = new IndexedSprite();
            indexedSprite.width = class571.SpriteBuffer_spriteWidth;
            indexedSprite.height = class174.SpriteBuffer_spriteHeight;
            indexedSprite.xOffset = class241.SpriteBuffer_xOffsets[n3];
            indexedSprite.yOffset = class571.SpriteBuffer_yOffsets[n3];
            indexedSprite.subWidth = class571.SpriteBuffer_spriteWidths[n3];
            indexedSprite.subHeight = class403.SpriteBuffer_spriteHeights[n3];
            indexedSprite.palette = KeyHandler.SpriteBuffer_spritePalette;
            indexedSprite.pixels = class240.SpriteBuffer_pixels[n3];
            ++n3;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="595905120")
    public static void method209() {
        HealthBarDefinition.HealthBarDefinition_cached.clear();
        HealthBarDefinition.field2567.clear();
    }

    @ObfuscatedName(value="ia")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="790177061")
    static final void method208(class103 class1032) {
        GraphicsObject graphicsObject = (GraphicsObject)class1032.field1339.last();
        while (graphicsObject != null) {
            if (class1032.field1321 == graphicsObject.plane && !graphicsObject.isFinished) {
                if (Client.cycle >= graphicsObject.cycleStart) {
                    graphicsObject.advance(Client.field581);
                    if (graphicsObject.isFinished) {
                        graphicsObject.remove();
                    } else {
                        class1032.field1319.method4185(graphicsObject.plane, graphicsObject.x, graphicsObject.y, graphicsObject.z, 60, graphicsObject, 0, -1L, false);
                    }
                }
            } else {
                graphicsObject.remove();
            }
            graphicsObject = (GraphicsObject)class1032.field1339.previous();
        }
        return;
    }

    @ObfuscatedName(value="ma")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1734456775")
    static final void method211(int n) {
        if (!ClanChannel.field1807.method7024(n)) {
            return;
        }
        Widget[] widgetArray = ClanChannel.field1807.field3772[n];
        int n2 = 0;
        while (n2 < widgetArray.length) {
            Widget widget = widgetArray[n2];
            if (widget != null) {
                widget.modelFrame = 0;
                widget.modelFrameCycle = 0;
            }
            ++n2;
        }
        return;
    }
}

