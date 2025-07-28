/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="il")
public class class213 {
    @ObfuscatedName(value="kx")
    @ObfuscatedSignature(descriptor="Lvf;")
    @Export(value="redHintArrowSprite")
    static SpritePixels redHintArrowSprite;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Len;")
    public UrlRequest field2373;
    @ObfuscatedName(value="ah")
    public float[] field2372 = new float[4];
    @ObfuscatedSignature(descriptor="Lic;")
    final /* synthetic */ class223 this$0;

    @ObfuscatedSignature(descriptor="(Lic;)V")
    class213(class223 class2232) {
        this.this$0 = class2232;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @ObfuscatedName(value="ju")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-919920239")
    static final void method4907() {
        Projectile.method2454(false);
        Client.field760 = 0;
        var0 = true;
        var1_1 = 0;
        while (true) {
            block45: {
                block46: {
                    if (var1_1 < class20.field88.length) break block45;
                    if (!var0) break block46;
                    Client.field561 = 0;
                    var0 = true;
                    var1_1 = 0;
                    while (true) {
                        block47: {
                            block48: {
                                if (var1_1 < class20.field88.length) break block47;
                                if (!var0) break block48;
                                if (Client.field573 != 0) {
                                    class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
                                }
                                class113.method3178();
                                GameEngine.field189.field1319.method4309();
                                for (var1_1 = 0; var1_1 < 4; ++var1_1) {
                                    GameEngine.field189.field1336[var1_1].clear();
                                }
                                var1_1 = 0;
                                while (true) {
                                    block49: {
                                        if (var1_1 < 4) break block49;
                                        class113.method3178();
                                        Renderable.method4460();
                                        var1_1 = class20.field88.length;
                                        World.method1957();
                                        Projectile.method2454(true);
                                        if (Client.isInInstance) ** GOTO lbl40
                                        var2_5 = 0;
                                        while (true) {
                                            block50: {
                                                if (var2_5 < var1_1) break block50;
                                                var2_5 = 0;
                                                while (true) {
                                                    block51: {
                                                        if (var2_5 < var1_1) break block51;
                                                        Projectile.method2454(true);
                                                        var2_5 = 0;
                                                        while (true) {
                                                            block52: {
                                                                if (var2_5 < var1_1) break block52;
lbl40:
                                                                // 2 sources

                                                                if (!Client.isInInstance) ** GOTO lbl51
                                                                var2_5 = 0;
                                                                while (true) {
                                                                    block53: {
                                                                        if (var2_5 < 4) break block53;
                                                                        var2_5 = 0;
                                                                        while (true) {
                                                                            block54: {
                                                                                if (var2_5 < 13) break block54;
                                                                                Projectile.method2454(true);
                                                                                var2_5 = 0;
                                                                                while (true) {
                                                                                    block55: {
                                                                                        if (var2_5 < 4) break block55;
lbl51:
                                                                                        // 2 sources

                                                                                        Projectile.method2454(true);
                                                                                        class113.method3178();
                                                                                        GrandExchangeEvent.method7903(GameEngine.field189);
                                                                                        Projectile.method2454(true);
                                                                                        var2_5 = Tiles.Tiles_minPlane;
                                                                                        if (var2_5 > GameEngine.field189.field1321) {
                                                                                            var2_5 = GameEngine.field189.field1321;
                                                                                        }
                                                                                        if (var2_5 < GameEngine.field189.field1321 - 1) {
                                                                                            var2_5 = GameEngine.field189.field1321 - 1;
                                                                                        }
                                                                                        if (Client.isLowDetail) {
                                                                                            GameEngine.field189.field1319.method4175(Tiles.Tiles_minPlane);
                                                                                        } else {
                                                                                            GameEngine.field189.field1319.method4175(0);
                                                                                        }
                                                                                        var3_3 = 0;
                                                                                        block10: while (true) {
                                                                                            block56: {
                                                                                                if (var3_3 < 104) break block56;
                                                                                                class113.method3178();
                                                                                                class188.method4435();
                                                                                                ObjectComposition.ObjectDefinition_cachedModelData.clear();
                                                                                                if (Client.client.hasFrame()) {
                                                                                                    var15_8 /* !! */  = (byte[])ScriptEvent.getPacketBufferNode(ClientPacket.field3324, Client.packetWriter.isaacCipher);
                                                                                                    var15_8 /* !! */ .packetBuffer.method10268(1057001181);
                                                                                                    Client.packetWriter.addNode((PacketBufferNode)var15_8 /* !! */ );
                                                                                                }
                                                                                                if (Client.isInInstance) ** GOTO lbl82
                                                                                                var3_3 = (class14.field62 - 6) / 8;
                                                                                                var4_4 = (class14.field62 + 6) / 8;
                                                                                                var5_7 = (class133.field1554 - 6) / 8;
                                                                                                var6_9 = (class133.field1554 + 6) / 8;
                                                                                                var7_10 = var3_3 - 1;
                                                                                                while (true) {
                                                                                                    block57: {
                                                                                                        if (var7_10 <= var4_4 + 1) break block57;
lbl82:
                                                                                                        // 2 sources

                                                                                                        class113.method3178();
                                                                                                        UserComparator7.method3331();
                                                                                                        var15_8 /* !! */  = (byte[])ScriptEvent.getPacketBufferNode(ClientPacket.field3361, Client.packetWriter.isaacCipher);
                                                                                                        Client.packetWriter.addNode((PacketBufferNode)var15_8 /* !! */ );
                                                                                                        GrandExchangeOfferWorldComparator.method7902();
                                                                                                        Client.field723 = false;
                                                                                                        return;
                                                                                                    }
                                                                                                    for (var8_11 = var5_7 - 1; var8_11 <= var6_9 + 1; ++var8_11) {
                                                                                                        if (var7_10 >= var3_3 && var7_10 <= var4_4 && var8_11 >= var5_7 && var8_11 <= var6_9) continue;
                                                                                                        class68.field494.loadRegionFromName("m" + var7_10 + "_" + var8_11);
                                                                                                        class68.field494.loadRegionFromName("l" + var7_10 + "_" + var8_11);
                                                                                                    }
                                                                                                    ++var7_10;
                                                                                                }
                                                                                            }
                                                                                            var4_4 = 0;
                                                                                            while (true) {
                                                                                                if (var4_4 >= 104) {
                                                                                                    ++var3_3;
                                                                                                    continue block10;
                                                                                                }
                                                                                                MusicPatchPcmStream.method6901(GameEngine.field189, var3_3, var4_4);
                                                                                                ++var4_4;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    class113.method3178();
                                                                                    for (var3_3 = 0; var3_3 < 13; ++var3_3) {
                                                                                        block15: for (var4_4 = 0; var4_4 < 13; ++var4_4) {
                                                                                            var5_7 = Client.field577[var2_5][var3_3][var4_4];
                                                                                            if (var5_7 == -1) continue;
                                                                                            var6_9 = var5_7 >> 24 & 3;
                                                                                            var7_10 = var5_7 >> 1 & 3;
                                                                                            var8_11 = var5_7 >> 14 & 1023;
                                                                                            var9_12 = var5_7 >> 3 & 2047;
                                                                                            var10_13 = (var8_11 / 8 << 8) + var9_12 / 8;
                                                                                            for (var11_14 = 0; var11_14 < TextureProvider.field2157.length; ++var11_14) {
                                                                                                if (TextureProvider.field2157[var11_14] != var10_13 || WorldMapCacheName.field3270[var11_14] == null) continue;
                                                                                                Tiles.method2511(GameEngine.field189, WorldMapCacheName.field3270[var11_14], var2_5, var3_3 * 8, var4_4 * 8, var6_9, (var8_11 & 7) * 8, (var9_12 & 7) * 8, var7_10);
                                                                                                continue block15;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    ++var2_5;
                                                                                }
                                                                            }
                                                                            for (var3_3 = 0; var3_3 < 13; ++var3_3) {
                                                                                var4_4 = Client.field577[0][var2_5][var3_3];
                                                                                if (var4_4 != -1) continue;
                                                                                class280.method5989(GameEngine.field189, var2_5 * 8, var3_3 * 8, 8, 8);
                                                                            }
                                                                            ++var2_5;
                                                                        }
                                                                    }
                                                                    class113.method3178();
                                                                    for (var3_3 = 0; var3_3 < 13; ++var3_3) {
                                                                        block19: for (var4_4 = 0; var4_4 < 13; ++var4_4) {
                                                                            var5_7 = 0;
                                                                            var6_9 = Client.field577[var2_5][var3_3][var4_4];
                                                                            if (var6_9 == -1) ** GOTO lbl153
                                                                            var7_10 = var6_9 >> 24 & 3;
                                                                            var8_11 = var6_9 >> 1 & 3;
                                                                            var9_12 = var6_9 >> 14 & 1023;
                                                                            var10_13 = var6_9 >> 3 & 2047;
                                                                            var11_14 = (var9_12 / 8 << 8) + var10_13 / 8;
                                                                            var12_15 = 0;
                                                                            while (true) {
                                                                                block59: {
                                                                                    block58: {
                                                                                        if (var12_15 >= TextureProvider.field2157.length) break block58;
                                                                                        if (TextureProvider.field2157[var12_15] != var11_14 || class20.field88[var12_15] == null) break block59;
                                                                                        var13_16 = (var9_12 - var3_3) * 8;
                                                                                        var14_17 = (var10_13 - var4_4) * 8;
                                                                                        class92.method2646(GameEngine.field189, class20.field88[var12_15], var2_5, var3_3 * 8, var4_4 * 8, var7_10, (var9_12 & 7) * 8, (var10_13 & 7) * 8, var8_11, var13_16, var14_17);
                                                                                        var5_7 = 1;
                                                                                    }
                                                                                    if (var5_7 != 0) continue block19;
                                                                                    FloorOverlayDefinition.method5662(GameEngine.field189.field1328, var2_5, var3_3 * 8, var4_4 * 8);
                                                                                    continue block19;
                                                                                }
                                                                                ++var12_15;
                                                                            }
                                                                        }
                                                                    }
                                                                    ++var2_5;
                                                                }
                                                            }
                                                            var15_8 /* !! */  = WorldMapCacheName.field3270[var2_5];
                                                            if (var15_8 /* !! */  != null) {
                                                                var4_4 = (TextureProvider.field2157[var2_5] >> 8) * 64 - GameEngine.field189.field1324;
                                                                var5_7 = (TextureProvider.field2157[var2_5] & 255) * 64 - GameEngine.field189.field1325;
                                                                class113.method3178();
                                                                class140.method3503(GameEngine.field189, var15_8 /* !! */ , var4_4, var5_7);
                                                            }
                                                            ++var2_5;
                                                        }
                                                    }
                                                    var3_3 = (TextureProvider.field2157[var2_5] >> 8) * 64 - GameEngine.field189.field1324;
                                                    var4_4 = (TextureProvider.field2157[var2_5] & 255) * 64 - GameEngine.field189.field1325;
                                                    var16_6 = class20.field88[var2_5];
                                                    if (var16_6 == null && class133.field1554 < 800) {
                                                        class113.method3178();
                                                        class280.method5989(GameEngine.field189, var3_3, var4_4, 64, 64);
                                                    }
                                                    ++var2_5;
                                                }
                                            }
                                            var3_3 = (TextureProvider.field2157[var2_5] >> 8) * 64 - GameEngine.field189.field1324;
                                            var4_4 = (TextureProvider.field2157[var2_5] & 255) * 64 - GameEngine.field189.field1325;
                                            var16_6 = class20.field88[var2_5];
                                            if (var16_6 != null) {
                                                class113.method3178();
                                                Language.method7975(GameEngine.field189, var16_6, var3_3, var4_4, class14.field62 * 8 - 48, class133.field1554 * 8 - 48);
                                            }
                                            ++var2_5;
                                        }
                                    }
                                    for (var2_5 = 0; var2_5 < 104; ++var2_5) {
                                        for (var3_3 = 0; var3_3 < 104; ++var3_3) {
                                            GameEngine.field189.field1337[var1_1][var2_5][var3_3] = 0;
                                        }
                                    }
                                    ++var1_1;
                                }
                            }
                            Client.field573 = 2;
                            return;
                        }
                        var17_2 = WorldMapCacheName.field3270[var1_1];
                        if (var17_2 != null) {
                            var3_3 = (TextureProvider.field2157[var1_1] >> 8) * 64 - GameEngine.field189.field1324;
                            var4_4 = (TextureProvider.field2157[var1_1] & 255) * 64 - GameEngine.field189.field1325;
                            if (Client.isInInstance) {
                                var3_3 = 10;
                                var4_4 = 10;
                            }
                            var0 &= class508.method9614(var17_2, var3_3, var4_4);
                        }
                        ++var1_1;
                    }
                }
                Client.field573 = 1;
                return;
            }
            if (class92.field1101[var1_1] != -1 && class20.field88[var1_1] == null) {
                class20.field88[var1_1] = class68.field494.takeFile(class92.field1101[var1_1], 0);
                if (class20.field88[var1_1] == null) {
                    var0 = false;
                    ++Client.field760;
                }
            }
            if (GrandExchangeOfferNameComparator.field4630[var1_1] != -1 && WorldMapCacheName.field3270[var1_1] == null) {
                WorldMapCacheName.field3270[var1_1] = class68.field494.takeFileEncrypted(GrandExchangeOfferNameComparator.field4630[var1_1], 0, MusicPatchPcmStream.field3705[var1_1]);
                if (WorldMapCacheName.field3270[var1_1] == null) {
                    var0 = false;
                    ++Client.field760;
                }
            }
            ++var1_1;
        }
    }
}

