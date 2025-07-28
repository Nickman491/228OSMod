/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="re")
public class class443
extends class448 {
    @ObfuscatedName(value="ay")
    ArrayList field4856;

    @ObfuscatedSignature(descriptor="(Lrh;Ljava/util/ArrayList;)V")
    public class443(class448 class4482, ArrayList arrayList) {
        super(class4482);
        this.field4868 = "ClearRequestTask";
        this.field4856 = arrayList;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        if (this.field4856.isEmpty()) {
            return true;
        }
        for (class345 class3452 : this.field4856) {
            try {
                if (!class333.field3623.contains(class3452)) continue;
                if (class3452 == null) {
                    class333.field3623.remove(class3452);
                    continue;
                }
                if (class3452.field3743.field3668 > 0) {
                    --class3452.field3743.field3668;
                }
                if (class3452.field3743.field3668 == 0) {
                    class3452.field3743.clear();
                    class3452.field3743.method6714();
                    class3452.field3743.setPcmStreamVolume(0);
                }
                int n = class3452.field3735;
                int n2 = class3452.field3737;
                for (class339 class3392 : class333.field3627) {
                    class3392.vmethod6894(n, n2);
                }
                class333.field3623.remove(class3452);
            }
            catch (Exception exception) {
                class255.RunException_sendStackTrace(null, exception);
                this.method8861(exception.getMessage());
                class333.field3623.clear();
                return true;
            }
        }
        return true;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="1336812875")
    @Export(value="SpriteBuffer_decode")
    static void SpriteBuffer_decode(byte[] byArray) {
        int n;
        Buffer buffer = new Buffer(byArray);
        buffer.offset = byArray.length - 2;
        class571.SpriteBuffer_spriteCount = buffer.readUnsignedShort();
        class241.SpriteBuffer_xOffsets = new int[class571.SpriteBuffer_spriteCount];
        class571.SpriteBuffer_yOffsets = new int[class571.SpriteBuffer_spriteCount];
        class571.SpriteBuffer_spriteWidths = new int[class571.SpriteBuffer_spriteCount];
        class403.SpriteBuffer_spriteHeights = new int[class571.SpriteBuffer_spriteCount];
        class240.SpriteBuffer_pixels = new byte[class571.SpriteBuffer_spriteCount][];
        buffer.offset = byArray.length - 7 - class571.SpriteBuffer_spriteCount * 8;
        class571.SpriteBuffer_spriteWidth = buffer.readUnsignedShort();
        class174.SpriteBuffer_spriteHeight = buffer.readUnsignedShort();
        int n2 = (buffer.readUnsignedByte() & 0xFF) + 1;
        for (n = 0; n < class571.SpriteBuffer_spriteCount; ++n) {
            class241.SpriteBuffer_xOffsets[n] = buffer.readUnsignedShort();
        }
        for (n = 0; n < class571.SpriteBuffer_spriteCount; ++n) {
            class571.SpriteBuffer_yOffsets[n] = buffer.readUnsignedShort();
        }
        for (n = 0; n < class571.SpriteBuffer_spriteCount; ++n) {
            class571.SpriteBuffer_spriteWidths[n] = buffer.readUnsignedShort();
        }
        for (n = 0; n < class571.SpriteBuffer_spriteCount; ++n) {
            class403.SpriteBuffer_spriteHeights[n] = buffer.readUnsignedShort();
        }
        buffer.offset = byArray.length - 7 - class571.SpriteBuffer_spriteCount * 8 - (n2 - 1) * 3;
        KeyHandler.SpriteBuffer_spritePalette = new int[n2];
        n = 1;
        while (true) {
            if (n >= n2) {
                buffer.offset = 0;
                n = 0;
                while (true) {
                    int n3;
                    if (n >= class571.SpriteBuffer_spriteCount) {
                        return;
                    }
                    int n4 = class571.SpriteBuffer_spriteWidths[n];
                    int n5 = class403.SpriteBuffer_spriteHeights[n];
                    int n6 = n5 * n4;
                    byte[] byArray2 = new byte[n6];
                    class240.SpriteBuffer_pixels[n] = byArray2;
                    int n7 = buffer.readUnsignedByte();
                    if (n7 != 0) {
                        if (n7 == 1) {
                            for (n3 = 0; n3 < n4; ++n3) {
                                for (int i = 0; i < n5; ++i) {
                                    byArray2[n3 + n4 * i] = buffer.readByte();
                                }
                            }
                        }
                    } else {
                        for (n3 = 0; n3 < n6; ++n3) {
                            byArray2[n3] = buffer.readByte();
                        }
                    }
                    ++n;
                }
            }
            KeyHandler.SpriteBuffer_spritePalette[n] = buffer.readMedium();
            if (KeyHandler.SpriteBuffer_spritePalette[n] == 0) {
                KeyHandler.SpriteBuffer_spritePalette[n] = 1;
            }
            ++n;
        }
    }
}

