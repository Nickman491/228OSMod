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

@ObfuscatedName(value="jc")
@Implements(value="HealthBarDefinition")
public class HealthBarDefinition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="HealthBarDefinition_archive")
    static AbstractArchive HealthBarDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    static AbstractArchive field2572;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="HealthBarDefinition_cached")
    static EvictingDualNodeHashTable HealthBarDefinition_cached;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    static EvictingDualNodeHashTable field2567;
    @ObfuscatedName(value="jr")
    static int[] field2578;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1735350197)
    public int field2568;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=849378789)
    @Export(value="int1")
    public int int1 = 255;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=437889605)
    @Export(value="int2")
    public int int2 = 255;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=798558681)
    @Export(value="int3")
    public int int3 = -1;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1254299183)
    public int field2565 = 1;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=566914995)
    @Export(value="int5")
    public int int5 = 70;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=683773839)
    @Export(value="frontSpriteID")
    int frontSpriteID = -1;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1171934191)
    @Export(value="backSpriteID")
    int backSpriteID = -1;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1397526847)
    @Export(value="width")
    public int width = 30;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=714006507)
    @Export(value="widthPadding")
    public int widthPadding = 0;

    static {
        HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
        field2567 = new EvictingDualNodeHashTable(64);
    }

    HealthBarDefinition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="163483323")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="-95")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n != 1) {
            if (n == 2) {
                this.int1 = buffer.readUnsignedByte();
            } else if (n == 3) {
                this.int2 = buffer.readUnsignedByte();
            } else if (n == 4) {
                this.int3 = 0;
            } else if (n == 5) {
                this.int5 = buffer.readUnsignedShort();
            } else if (n != 6) {
                if (n == 7) {
                    this.frontSpriteID = buffer.method10476();
                } else if (n == 8) {
                    this.backSpriteID = buffer.method10476();
                } else if (n == 11) {
                    this.int3 = buffer.readUnsignedShort();
                } else if (n == 14) {
                    this.width = buffer.readUnsignedByte();
                } else if (n == 15) {
                    this.widthPadding = buffer.readUnsignedByte();
                }
            } else {
                buffer.readUnsignedByte();
            }
        } else {
            buffer.readUnsignedShort();
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="1179546533")
    public SpritePixels method5239() {
        if (this.frontSpriteID < 0) {
            return null;
        }
        SpritePixels spritePixels = (SpritePixels)field2567.get(this.frontSpriteID);
        if (spritePixels != null) {
            return spritePixels;
        }
        spritePixels = ChatChannel.SpriteBuffer_getSprite(field2572, this.frontSpriteID, 0);
        if (spritePixels != null) {
            field2567.put(spritePixels, this.frontSpriteID);
        }
        return spritePixels;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="-1979105144")
    public SpritePixels method5232() {
        if (this.backSpriteID < 0) {
            return null;
        }
        SpritePixels spritePixels = (SpritePixels)field2567.get(this.backSpriteID);
        if (spritePixels != null) {
            return spritePixels;
        }
        spritePixels = ChatChannel.SpriteBuffer_getSprite(field2572, this.backSpriteID, 0);
        if (spritePixels != null) {
            field2567.put(spritePixels, this.backSpriteID);
        }
        return spritePixels;
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="63")
    static int method5247(int n, Script script, boolean bl) {
        if (n != 8000) {
            if (n != 8001) {
                return 2;
            }
            int n2 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
            int n3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
            int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
            int n5 = Interpreter.Interpreter_arrayLengths[n2];
            if (n5 <= 1) {
                return 1;
            }
            class451.method8899(Interpreter.Interpreter_arrays[n2], n5, n3, n4);
            return 1;
        }
        int n6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        int n7 = Interpreter.Interpreter_arrayLengths[n6];
        DesktopPlatformInfoProvider.method9651(Interpreter.Interpreter_arrays[n6], new int[n7], 0, n7 - 1);
        return 1;
    }
}

