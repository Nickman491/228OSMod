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
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jm")
@Implements(value="WorldMapElement")
public class WorldMapElement
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="WorldMapElement_archive")
    static AbstractArchive WorldMapElement_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Ljm;")
    @Export(value="WorldMapElement_cached")
    static WorldMapElement[] WorldMapElement_cached;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1187381095)
    @Export(value="WorldMapElement_count")
    public static int WorldMapElement_count;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="HitSplatDefinition_cached")
    static EvictingDualNodeHashTable HitSplatDefinition_cached;
    @ObfuscatedName(value="pi")
    @ObfuscatedGetter(intValue=-1003000535)
    static int field2543;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-418413189)
    @Export(value="objectId")
    public final int objectId;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1044903649)
    @Export(value="sprite1")
    public int sprite1 = -1;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1717119769)
    @Export(value="sprite2")
    int sprite2 = -1;
    @ObfuscatedName(value="ax")
    @Export(value="name")
    public String name;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1169799285)
    public int field2540;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1570467255)
    @Export(value="textSize")
    public int textSize = 0;
    @ObfuscatedName(value="as")
    public boolean field2533 = true;
    @ObfuscatedName(value="aq")
    public boolean field2530 = false;
    @ObfuscatedName(value="af")
    @Export(value="menuActions")
    public String[] menuActions = new String[5];
    @ObfuscatedName(value="aa")
    @Export(value="menuTargetName")
    public String menuTargetName;
    @ObfuscatedName(value="ak")
    int[] field2528;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-510614173)
    int field2534 = Integer.MAX_VALUE;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=12256039)
    int field2535 = Integer.MAX_VALUE;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=1837550443)
    int field2536 = Integer.MIN_VALUE;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-208336589)
    int field2537 = Integer.MIN_VALUE;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Ljt;")
    @Export(value="horizontalAlignment")
    public HorizontalAlignment horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Ljk;")
    @Export(value="verticalAlignment")
    public VerticalAlignment verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
    @ObfuscatedName(value="am")
    int[] field2538;
    @ObfuscatedName(value="ap")
    byte[] field2542;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1379816205)
    @Export(value="category")
    public int category = -1;

    static {
        HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
    }

    WorldMapElement(int n) {
        this.objectId = n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1689056337")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="825746633")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n == 1) {
            this.sprite1 = buffer.method10476();
        } else if (n == 2) {
            this.sprite2 = buffer.method10476();
        } else if (n == 3) {
            this.name = buffer.readStringCp1252NullTerminated();
        } else if (n == 4) {
            this.field2540 = buffer.readMedium();
        } else if (n != 5) {
            if (n == 6) {
                this.textSize = buffer.readUnsignedByte();
            } else if (n != 7) {
                if (n != 8) {
                    if (n >= 10 && n <= 14) {
                        this.menuActions[n - 10] = buffer.readStringCp1252NullTerminated();
                    } else if (n != 15) {
                        if (n != 16) {
                            if (n == 17) {
                                this.menuTargetName = buffer.readStringCp1252NullTerminated();
                            } else if (n != 18) {
                                if (n == 19) {
                                    this.category = buffer.readUnsignedShort();
                                } else if (n != 21) {
                                    if (n != 22) {
                                        if (n != 23) {
                                            if (n != 24) {
                                                if (n != 25) {
                                                    if (n != 28) {
                                                        if (n != 29) {
                                                            if (n == 30) {
                                                                class404[] class404Array = new VerticalAlignment[]{VerticalAlignment.field2670, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2673};
                                                                this.verticalAlignment = (VerticalAlignment)StructComposition.findEnumerated(class404Array, buffer.readUnsignedByte());
                                                            }
                                                        } else {
                                                            this.horizontalAlignment = (HorizontalAlignment)StructComposition.findEnumerated(Canvas.method338(), buffer.readUnsignedByte());
                                                        }
                                                    } else {
                                                        buffer.readUnsignedByte();
                                                    }
                                                } else {
                                                    buffer.method10476();
                                                }
                                            } else {
                                                buffer.readShort();
                                                buffer.readShort();
                                            }
                                        } else {
                                            buffer.readUnsignedByte();
                                            buffer.readUnsignedByte();
                                            buffer.readUnsignedByte();
                                        }
                                    } else {
                                        buffer.readInt();
                                    }
                                } else {
                                    buffer.readInt();
                                }
                            } else {
                                buffer.method10476();
                            }
                        }
                    } else {
                        int n2;
                        int n3;
                        int n4 = buffer.readUnsignedByte();
                        this.field2528 = new int[n4 * 2];
                        for (n3 = 0; n3 < n4 * 2; ++n3) {
                            this.field2528[n3] = buffer.readShort();
                        }
                        buffer.readInt();
                        n3 = buffer.readUnsignedByte();
                        this.field2538 = new int[n3];
                        for (n2 = 0; n2 < this.field2538.length; ++n2) {
                            this.field2538[n2] = buffer.readInt();
                        }
                        this.field2542 = new byte[n4];
                        for (n2 = 0; n2 < n4; ++n2) {
                            this.field2542[n2] = buffer.readByte();
                        }
                    }
                } else {
                    buffer.readUnsignedByte();
                }
            } else {
                int n5 = buffer.readUnsignedByte();
                if ((n5 & 1) == 0) {
                    this.field2533 = false;
                }
                if ((n5 & 2) == 2) {
                    this.field2530 = true;
                }
            }
        } else {
            buffer.readMedium();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1627989215")
    void method5166() {
        if (this.field2528 == null) return;
        int n = 0;
        while (n < this.field2528.length) {
            if (this.field2528[n] < this.field2534) {
                this.field2534 = this.field2528[n];
            } else if (this.field2528[n] > this.field2536) {
                this.field2536 = this.field2528[n];
            }
            if (this.field2528[n + 1] < this.field2535) {
                this.field2535 = this.field2528[n + 1];
            } else if (this.field2528[n + 1] > this.field2537) {
                this.field2537 = this.field2528[n + 1];
            }
            n += 2;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ZB)Lvf;", garbageValue="-100")
    @Export(value="getSpriteBool")
    public SpritePixels getSpriteBool(boolean bl) {
        int n = this.sprite1;
        return this.getSprite(n);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IB)Lvf;", garbageValue="63")
    @Export(value="getSprite")
    SpritePixels getSprite(int n) {
        if (n < 0) {
            return null;
        }
        SpritePixels spritePixels = (SpritePixels)HitSplatDefinition_cached.get(n);
        if (spritePixels != null) {
            return spritePixels;
        }
        spritePixels = ChatChannel.SpriteBuffer_getSprite(WorldMapElement_archive, n, 0);
        if (spritePixels != null) {
            HitSplatDefinition_cached.put(spritePixels, n);
        }
        return spritePixels;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-111")
    @Export(value="getObjectId")
    public int getObjectId() {
        return this.objectId;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="235760565")
    @Export(value="method1919")
    static String method1919(int n) {
        return "<img=" + n + ">";
    }

    @ObfuscatedName(value="iw")
    @ObfuscatedSignature(descriptor="(B)Lpm;", garbageValue="-98")
    public static NodeDeque method5196() {
        return Client.scriptEvents;
    }

    @ObfuscatedName(value="or")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="437702728")
    static void method5197(Buffer buffer) {
        byte[] byArray;
        if (Client.randomDatData != null) {
            buffer.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
            return;
        }
        byte[] byArray2 = new byte[24];
        try {
            int n;
            JagexCache.JagexCache_randomDat.seek(0L);
            JagexCache.JagexCache_randomDat.readFully(byArray2);
            for (n = 0; n < 24 && byArray2[n] == 0; ++n) {
            }
            if (n >= 24) {
                throw new IOException();
            }
        }
        catch (Exception exception) {
            for (int i = 0; i < 24; ++i) {
                byArray2[i] = -1;
            }
        }
        byArray2 = byArray = byArray2;
        buffer.writeBytes(byArray2, 0, byArray2.length);
    }
}

