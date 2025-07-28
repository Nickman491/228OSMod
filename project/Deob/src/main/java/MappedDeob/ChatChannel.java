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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dk")
@Implements(value="ChatChannel")
public class ChatChannel {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Lct;")
    @Export(value="messages")
    Message[] messages = new Message[100];
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=2144686969)
    @Export(value="count")
    int count;

    ChatChannel() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lct;", garbageValue="-373552992")
    @Export(value="addMessage")
    Message addMessage(int n, String string, String string2, String string3) {
        Message message = this.messages[99];
        int n2 = this.count;
        while (true) {
            if (n2 <= 0) {
                if (message == null) {
                    message = new Message(n, string, string3, string2);
                } else {
                    message.remove();
                    message.removeDual();
                    message.set(n, string, string3, string2);
                }
                this.messages[0] = message;
                if (this.count < 100) {
                    ++this.count;
                }
                return message;
            }
            if (n2 != 100) {
                this.messages[n2] = this.messages[n2 - 1];
            }
            --n2;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lct;", garbageValue="-1427940988")
    @Export(value="getMessage")
    Message getMessage(int n) {
        if (n >= 0 && n < this.count) {
            return this.messages[n];
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1858544506")
    @Export(value="size")
    int size() {
        return this.count;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Loe;", garbageValue="-908384021")
    public static GameBuild method2508(int n) {
        GameBuild[] gameBuildArray = Messages.method3241();
        int n2 = 0;
        while (n2 < gameBuildArray.length) {
            GameBuild gameBuild = gameBuildArray[n2];
            if (n == gameBuild.buildId) {
                return gameBuild;
            }
            ++n2;
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lpq;III)Lvf;", garbageValue="437889605")
    @Export(value="SpriteBuffer_getSprite")
    public static SpritePixels SpriteBuffer_getSprite(AbstractArchive abstractArchive, int n, int n2) {
        if (!WorldMapSprite.method6397(abstractArchive, n, n2)) {
            return null;
        }
        SpritePixels spritePixels = new SpritePixels();
        spritePixels.width = class571.SpriteBuffer_spriteWidth;
        spritePixels.height = class174.SpriteBuffer_spriteHeight;
        spritePixels.xOffset = class241.SpriteBuffer_xOffsets[0];
        spritePixels.yOffset = class571.SpriteBuffer_yOffsets[0];
        spritePixels.subWidth = class571.SpriteBuffer_spriteWidths[0];
        spritePixels.subHeight = class403.SpriteBuffer_spriteHeights[0];
        int n3 = spritePixels.subHeight * spritePixels.subWidth;
        byte[] byArray = class240.SpriteBuffer_pixels[0];
        spritePixels.pixels = new int[n3];
        for (int i = 0; i < n3; ++i) {
            spritePixels.pixels[i] = KeyHandler.SpriteBuffer_spritePalette[byArray[i] & 0xFF];
        }
        class241.SpriteBuffer_xOffsets = null;
        class571.SpriteBuffer_yOffsets = null;
        class571.SpriteBuffer_spriteWidths = null;
        class403.SpriteBuffer_spriteHeights = null;
        KeyHandler.SpriteBuffer_spritePalette = null;
        class240.SpriteBuffer_pixels = null;
        SpritePixels spritePixels2 = spritePixels;
        return spritePixels2;
    }
}

