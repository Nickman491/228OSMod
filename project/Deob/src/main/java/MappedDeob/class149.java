/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fo")
public class class149
extends class150 {
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Len;")
    @Export(value="World_request")
    static UrlRequest World_request;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=736475757)
    int field1677 = -1;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class149(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        this.field1677 = buffer.readUnsignedShort();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.method3692(this.field1677);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;II)Lnb;", garbageValue="1271589655")
    static MusicPatch method3586(AbstractArchive abstractArchive, int n) {
        byte[] byArray = abstractArchive.takeFileFlat(n);
        if (byArray == null) {
            return null;
        }
        return new MusicPatch(byArray);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lff;FI)F", garbageValue="-597744766")
    static float method3585(class136 class1362, float f) {
        if (class1362 != null && class1362.method3455() != 0) {
            if (!(f < (float)class1362.field1573[0].field1528)) {
                if (!(f > (float)class1362.field1573[class1362.method3455() - 1].field1528)) {
                    if (!class1362.field1571) {
                        float f2;
                        float f3;
                        class131 class1312 = class1362.method3460(f);
                        boolean bl = false;
                        boolean bl2 = false;
                        if (class1312 == null) {
                            return 0.0f;
                        }
                        if (0.0f == class1312.field1530 && class1312.field1526 == 0.0f) {
                            bl = true;
                        } else if (class1312.field1530 == Float.MAX_VALUE && Float.MAX_VALUE == class1312.field1526) {
                            bl2 = true;
                        } else if (class1312.field1532 == null) {
                            bl = true;
                        } else if (class1362.field1586) {
                            f3 = class1312.field1528;
                            float f4 = class1312.field1527;
                            f2 = class1312.field1530 * 0.33333334f + f3;
                            float f5 = class1312.field1526 * 0.33333334f + f4;
                            float f6 = class1312.field1532.field1528;
                            float f7 = class1312.field1532.field1527;
                            float f8 = f6 - class1312.field1532.field1531 * 0.33333334f;
                            float f9 = f7 - 0.33333334f * class1312.field1532.field1529;
                            if (!class1362.field1593) {
                                if (class1362 != null) {
                                    class1362.field1576 = f3;
                                    float f10 = f6 - f3;
                                    float f11 = f7 - f4;
                                    float f12 = f2 - f3;
                                    float f13 = 0.0f;
                                    float f14 = 0.0f;
                                    if (f12 != 0.0f) {
                                        f13 = (f5 - f4) / f12;
                                    }
                                    if ((f12 = f6 - f8) != 0.0f) {
                                        f14 = (f7 - f9) / f12;
                                    }
                                    float f15 = 1.0f / (f10 * f10);
                                    float f16 = f13 * f10;
                                    float f17 = f10 * f14;
                                    class1362.field1578 = f15 * (f16 + f17 - f11 - f11) / f10;
                                    class1362.field1579 = (f11 + f11 + f11 - f16 - f16 - f17) * f15;
                                    class1362.field1580 = f13;
                                    class1362.field1581 = f4;
                                }
                            } else {
                                class144.method3550(class1362, f3, f2, f8, f6, f4, f5, f9, f7);
                            }
                            class1362.field1586 = false;
                        }
                        if (!bl) {
                            if (!bl2) {
                                if (!class1362.field1593) {
                                    if (class1362 != null) {
                                        f2 = f - class1362.field1576;
                                        f3 = f2 * ((class1362.field1579 + f2 * class1362.field1578) * f2 + class1362.field1580) + class1362.field1581;
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    return f3;
                                }
                                return class141.method3511(class1362, f);
                            }
                            if ((float)class1312.field1528 != f && class1312.field1532 != null) {
                                return class1312.field1532.field1527;
                            }
                            return class1312.field1527;
                        }
                        return class1312.field1527;
                    }
                    return class1362.field1573[0].field1527;
                }
                if (class1362.field1574 != class134.field1561) {
                    return SoundCache.method895(class1362, f, false);
                }
                return class1362.field1573[class1362.method3455() - 1].field1527;
            }
            if (class1362.field1572 != class134.field1561) {
                return SoundCache.method895(class1362, f, true);
            }
            return class1362.field1573[0].field1527;
        }
        return 0.0f;
    }

    @ObfuscatedName(value="no")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1960898800")
    static final void method3578(int n) {
        if ((n = Math.min(Math.max(n, 0), 255)) != class544.clientPreferences.method2896()) {
            if (class544.clientPreferences.method2896() == 0 && class153.method3620()) {
                class96.method2709(class544.field5399, n);
                Client.playingJingle = false;
            } else if (n != 0) {
                ScriptEvent.method2622(n);
            } else {
                UserComparator3.method3347(0, 0);
                Client.playingJingle = false;
            }
            class544.clientPreferences.method2888(n);
        }
    }
}

