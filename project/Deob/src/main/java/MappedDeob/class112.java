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

@ObfuscatedName(value="ec")
public class class112 {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lvi;")
    static IndexedSprite field1414;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="[Lcs;")
    final class73[] field1413 = new class73[2048];
    @ObfuscatedName(value="ao")
    final boolean[] field1399 = new boolean[2048];
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="[Lkq;")
    final class275[] field1403 = new class275[2048];
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lvy;")
    final Buffer field1407 = new Buffer(new byte[5000]);
    @ObfuscatedName(value="ae")
    final String[] field1405 = new String[3];
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-424710833)
    int field1406 = 0;
    @ObfuscatedName(value="at")
    final int[] field1412 = new int[2048];
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=354342637)
    int field1408 = 0;
    @ObfuscatedName(value="au")
    final int[] field1409 = new int[2048];
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-141109869)
    int field1410 = 0;
    @ObfuscatedName(value="aq")
    final int[] field1411 = new int[2048];
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=623422135)
    int field1404 = 0;
    @ObfuscatedName(value="aa")
    final int[] field1401 = new int[2048];

    class112() {
        int n = 0;
        while (n < 2048) {
            this.field1413[n] = new class73(n);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvv;B)V", garbageValue="4")
    final void method3131(PacketBuffer packetBuffer) {
        this.method3139();
        packetBuffer.method10226();
        int n = Client.field623;
        class73 class732 = this.field1413[n];
        int n2 = packetBuffer.readBits(30);
        class732.method2272(-1);
        class732.field874.method6967(n2);
        class732.field871 = 0;
        Player player = class732.method2275(n, GameEngine.field189);
        class732.method2347(player);
        GameEngine.field189.field1329[n] = player;
        ModeWhere.localPlayer = player;
        this.field1406 = 0;
        this.field1412[++this.field1406 - 1] = n;
        this.field1408 = 0;
        int n3 = 1;
        while (true) {
            if (n3 >= 2048) {
                packetBuffer.exportIndex();
                return;
            }
            if (n3 != n) {
                int n4 = packetBuffer.readBits(18);
                int n5 = n4 >> 16;
                int n6 = n4 >> 8 & 0xFF;
                int n7 = n4 & 0xFF;
                this.field1413[n3].method2272(Coord.method6969(n5, n6, n7));
                this.field1409[++this.field1408 - 1] = n3;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvv;IB)V", garbageValue="95")
    final void method3144(PacketBuffer packetBuffer, int n) {
        int n2 = packetBuffer.offset;
        this.field1404 = 0;
        this.method3130(packetBuffer);
        this.method3127();
        this.method3135();
        this.method3136(packetBuffer);
        this.method3150();
        if (n == packetBuffer.offset - n2) {
            return;
        }
        throw new RuntimeException(packetBuffer.offset - n2 + " " + n);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvv;I)V", garbageValue="-1630891958")
    void method3130(PacketBuffer packetBuffer) {
        this.field1410 = 0;
        int n = 0;
        packetBuffer.method10226();
        int n2 = 0;
        while (true) {
            int n3;
            int n4;
            if (n2 >= this.field1406) {
                packetBuffer.exportIndex();
                if (n == 0) {
                    packetBuffer.method10226();
                    n2 = 0;
                    while (true) {
                        if (n2 >= this.field1406) {
                            packetBuffer.exportIndex();
                            if (n == 0) {
                                packetBuffer.method10226();
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.field1408) {
                                        packetBuffer.exportIndex();
                                        if (n == 0) {
                                            packetBuffer.method10226();
                                            n2 = 0;
                                            while (true) {
                                                if (n2 >= this.field1408) {
                                                    packetBuffer.exportIndex();
                                                    if (n == 0) {
                                                        this.field1406 = 0;
                                                        this.field1408 = 0;
                                                        n2 = 1;
                                                        while (true) {
                                                            if (n2 >= 2048) {
                                                                return;
                                                            }
                                                            this.field1413[n2].field871 = (byte)(this.field1413[n2].field871 >> 1);
                                                            if (this.field1413[n2].method2276()) {
                                                                this.field1412[++this.field1406 - 1] = n2;
                                                            } else {
                                                                this.field1409[++this.field1408 - 1] = n2;
                                                            }
                                                            ++n2;
                                                        }
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                n4 = this.field1409[n2];
                                                if ((this.field1413[n4].field871 & 1) == 0) {
                                                    if (n <= 0) {
                                                        n3 = packetBuffer.readBits(1);
                                                        if (n3 != 0) {
                                                            if (this.method3133(packetBuffer, n4)) {
                                                                this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                                            }
                                                        } else {
                                                            n = this.method3134(packetBuffer);
                                                            this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                                        }
                                                    } else {
                                                        --n;
                                                        this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                                    }
                                                }
                                                ++n2;
                                            }
                                        }
                                        throw new RuntimeException();
                                    }
                                    n4 = this.field1409[n2];
                                    if ((this.field1413[n4].field871 & 1) != 0) {
                                        if (n <= 0) {
                                            n3 = packetBuffer.readBits(1);
                                            if (n3 != 0) {
                                                if (this.method3133(packetBuffer, n4)) {
                                                    this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                                }
                                            } else {
                                                n = this.method3134(packetBuffer);
                                                this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                            }
                                        } else {
                                            --n;
                                            this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                        }
                                    }
                                    ++n2;
                                }
                            }
                            throw new RuntimeException();
                        }
                        n4 = this.field1412[n2];
                        if ((this.field1413[n4].field871 & 1) != 0) {
                            if (n <= 0) {
                                n3 = packetBuffer.readBits(1);
                                if (n3 != 0) {
                                    this.method3132(packetBuffer, n4);
                                } else {
                                    n = this.method3134(packetBuffer);
                                    this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                }
                            } else {
                                --n;
                                this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                            }
                        }
                        ++n2;
                    }
                }
                throw new RuntimeException();
            }
            n4 = this.field1412[n2];
            if ((this.field1413[n4].field871 & 1) == 0) {
                if (n <= 0) {
                    n3 = packetBuffer.readBits(1);
                    if (n3 != 0) {
                        this.method3132(packetBuffer, n4);
                    } else {
                        n = this.method3134(packetBuffer);
                        this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                    }
                } else {
                    --n;
                    this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                }
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvv;B)I", garbageValue="-1")
    int method3134(PacketBuffer packetBuffer) {
        int n = packetBuffer.readBits(2);
        int n2 = n == 0 ? 0 : (n == 1 ? packetBuffer.readBits(5) : (n == 2 ? packetBuffer.readBits(8) : packetBuffer.readBits(11)));
        return n2;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvv;II)V", garbageValue="856013933")
    void method3132(PacketBuffer packetBuffer, int n) {
        boolean bl;
        boolean bl2 = bl = packetBuffer.readBits(1) == 1;
        if (bl) {
            this.field1401[++this.field1404 - 1] = n;
        }
        int n2 = packetBuffer.readBits(2);
        class73 class732 = this.field1413[n];
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    int n3;
                    int n4 = packetBuffer.readBits(1);
                    if (n4 != 0) {
                        int n5 = packetBuffer.readBits(30);
                        int n6 = Coord.method6965(n5);
                        int n7 = Coord.method6971(n5);
                        int n8 = Coord.method6972(n5);
                        Coord coord = class732.field874;
                        coord.plane = (byte)(n6 + coord.plane & 3);
                        coord.x = n7 + coord.x & 0x3FFF;
                        coord.y = n8 + coord.y & 0x3FFF;
                        this.field1399[n] = true;
                        this.field1403[n] = class732.field875;
                        return;
                    }
                    int n9 = packetBuffer.readBits(12);
                    int n10 = n9 >> 10;
                    int n11 = n9 >> 5 & 0x1F;
                    if (n11 > 15) {
                        n11 -= 32;
                    }
                    if ((n3 = n9 & 0x1F) > 15) {
                        n3 -= 32;
                    }
                    Coord coord = class732.field874;
                    coord.plane = (byte)(n10 + coord.plane & 3);
                    coord.x += n11;
                    coord.y += n3;
                    this.field1399[n] = true;
                    this.field1403[n] = class732.field875;
                    return;
                }
                int n12 = packetBuffer.readBits(4);
                Coord coord = class732.field874;
                if (n12 != 0) {
                    if (n12 != 1) {
                        if (n12 == 2) {
                            coord.y -= 2;
                        } else if (n12 != 3) {
                            if (n12 != 4) {
                                if (n12 != 5) {
                                    if (n12 != 6) {
                                        if (n12 == 7) {
                                            coord.x -= 2;
                                        } else if (n12 == 8) {
                                            coord.x += 2;
                                        } else if (n12 != 9) {
                                            if (n12 != 10) {
                                                if (n12 != 11) {
                                                    if (n12 != 12) {
                                                        if (n12 == 13) {
                                                            coord.y += 2;
                                                        } else if (n12 != 14) {
                                                            if (n12 == 15) {
                                                                coord.x += 2;
                                                                coord.y += 2;
                                                            }
                                                        } else {
                                                            ++coord.x;
                                                            coord.y += 2;
                                                        }
                                                    } else {
                                                        --coord.x;
                                                        coord.y += 2;
                                                    }
                                                } else {
                                                    coord.x -= 2;
                                                    coord.y += 2;
                                                }
                                            } else {
                                                coord.x += 2;
                                                ++coord.y;
                                            }
                                        } else {
                                            coord.x -= 2;
                                            ++coord.y;
                                        }
                                    } else {
                                        coord.x += 2;
                                        --coord.y;
                                    }
                                } else {
                                    coord.x -= 2;
                                    --coord.y;
                                }
                            } else {
                                coord.x += 2;
                                coord.y -= 2;
                            }
                        } else {
                            ++coord.x;
                            coord.y -= 2;
                        }
                    } else {
                        --coord.x;
                        coord.y -= 2;
                    }
                } else {
                    coord.x -= 2;
                    coord.y -= 2;
                }
                this.field1399[n] = true;
                this.field1403[n] = class732.field875;
                return;
            }
            int n13 = packetBuffer.readBits(3);
            Coord coord = class732.field874;
            if (n13 != 0) {
                if (n13 == 1) {
                    --coord.y;
                } else if (n13 != 2) {
                    if (n13 == 3) {
                        --coord.x;
                    } else if (n13 == 4) {
                        ++coord.x;
                    } else if (n13 != 5) {
                        if (n13 == 6) {
                            ++coord.y;
                        } else if (n13 == 7) {
                            ++coord.x;
                            ++coord.y;
                        }
                    } else {
                        --coord.x;
                        ++coord.y;
                    }
                } else {
                    ++coord.x;
                    --coord.y;
                }
            } else {
                --coord.x;
                --coord.y;
            }
            this.field1399[n] = true;
            this.field1403[n] = class732.field875;
            return;
        }
        if (!bl) {
            if (n == Client.field623) {
                throw new RuntimeException();
            }
            class732.method2277();
            if (packetBuffer.readBits(1) != 0) {
                this.method3133(packetBuffer, n);
            }
            this.field1411[++this.field1410 - 1] = n;
            return;
        }
        this.field1399[n] = false;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvv;II)Z", garbageValue="2008955812")
    boolean method3133(PacketBuffer packetBuffer, int n) {
        boolean bl;
        class73 class732 = this.field1413[n];
        int n2 = packetBuffer.readBits(2);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    int n3 = packetBuffer.readBits(18);
                    int n4 = n3 >> 16;
                    int n5 = n3 >> 8 & 0xFF;
                    int n6 = n3 & 0xFF;
                    int n7 = class732.field869;
                    int n8 = Coord.method6965(n7) + n4 & 3;
                    class732.method2326(n8);
                    int n9 = Coord.method6971(n7) + n5 & 0xFF;
                    int n10 = Coord.method6972(n7) + n6 & 0xFF;
                    class732.field869 = Coord.method6969(class732.method2328(), n9, n10);
                    return false;
                }
                int n11 = packetBuffer.readBits(5);
                int n12 = n11 >> 3;
                int n13 = n11 & 7;
                int n14 = class732.field869;
                int n15 = Coord.method6965(n14) + n12 & 3;
                int n16 = n14 >> 14 & 0xFF;
                int n17 = n14 & 0xFF;
                if (n13 == 0) {
                    --n16;
                    --n17;
                }
                if (n13 == 1) {
                    --n17;
                }
                if (n13 == 2) {
                    ++n16;
                    --n17;
                }
                if (n13 == 3) {
                    --n16;
                }
                if (n13 == 4) {
                    ++n16;
                }
                if (n13 == 5) {
                    --n16;
                    ++n17;
                }
                if (n13 == 6) {
                    ++n17;
                }
                if (n13 == 7) {
                    ++n16;
                    ++n17;
                }
                class732.method2326(n15);
                class732.field869 = Coord.method6969(n15, n16, n17);
                return false;
            }
            int n18 = packetBuffer.readBits(2);
            int n19 = class732.field869;
            int n20 = Coord.method6965(n19) + n18 & 3;
            class732.method2326(n20);
            class732.field869 = (n19 & 0xFFFFFFF) + (n20 << 28);
            return false;
        }
        if (packetBuffer.readBits(1) != 0) {
            this.method3133(packetBuffer, n);
        }
        int n21 = packetBuffer.readBits(13);
        int n22 = packetBuffer.readBits(13);
        boolean bl2 = bl = packetBuffer.readBits(1) == 1;
        if (bl) {
            this.field1401[++this.field1404 - 1] = n;
        }
        if (!class732.method2276()) {
            class732.method2332(n21, n22);
            this.field1399[n] = false;
            return true;
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1082969786")
    void method3127() {
        int n = 0;
        while (n < this.field1410) {
            int n2 = this.field1411[n];
            class73 class732 = this.field1413[n2];
            for (class103 class1032 : Client.field508) {
                Player player = class1032.field1329[n2];
                if (player == null) continue;
                class732.method2291(player);
                class1032.field1329[n2] = null;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1157490276")
    void method3135() {
        class148.field1676 = -1;
        int n = 0;
        while (n < this.field1406) {
            int n2 = this.field1412[n];
            class73 class732 = this.field1413[n2];
            Coord coord = class732.field874;
            for (class103 class1032 : Client.field508) {
                boolean bl;
                Player player = class1032.field1329[n2];
                boolean bl2 = bl = coord.x > class1032.field1324 && coord.y > class1032.field1325 && coord.x < class1032.field1322 + class1032.field1324 && coord.y < class1032.field1325 + class1032.field1323;
                if (n2 == Client.field623 && bl && class1032.field1320 != -1) {
                    class148.field1676 = class1032.field1320;
                }
                if (bl && player == null) {
                    player = class732.method2275(n2, class1032);
                    class732.method2347(player);
                    class1032.field1329[n2] = player;
                    continue;
                }
                if (bl || player == null || player == ModeWhere.localPlayer) continue;
                class732.method2291(player);
                class1032.field1329[n2] = null;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lvv;I)V", garbageValue="-1845304357")
    void method3136(PacketBuffer packetBuffer) {
        int n = 0;
        while (n < this.field1404) {
            int n2 = this.field1401[n];
            int n3 = packetBuffer.readUnsignedByte();
            if ((n3 & 4) != 0) {
                n3 += packetBuffer.readUnsignedByte() << 8;
            }
            if ((n3 & 0x100) != 0) {
                n3 += packetBuffer.readUnsignedByte() << 16;
            }
            this.method3172(packetBuffer, n2, n3);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="17329")
    void method3150() {
        int n = 0;
        while (n < this.field1406) {
            int n2 = this.field1412[n];
            if (this.field1399[n2]) {
                class73 class732 = this.field1413[n2];
                class732.method2297(this.field1403[n2]);
                this.field1399[n2] = false;
            }
            ++n;
        }
        return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lvv;III)V", garbageValue="1182589201")
    void method3172(PacketBuffer var1_1, int var2_2, int var3_3) {
        var4_4 = this.field1413[var2_2];
        var5_5 = 0x7FFFFFFF;
        if ((var3_3 & 1024) != 0) {
            for (var6_6 = 0; var6_6 < 3; ++var6_6) {
                this.field1405[var6_6] = var1_1.readStringCp1252NullTerminated();
            }
            var4_4.method2286(this.field1405);
        }
        if ((var3_3 & 8) != 0) {
            var7_7 = var1_1.method10323();
            if ((var7_7 += var1_1.method10312() << 16) == (var6_6 = 0xFFFFFF)) {
                var7_7 = -1;
            }
            var4_4.method2284(var7_7);
        }
        if ((var3_3 & 512) != 0) {
            var15_8 /* !! */  = var4_4;
            var16_9 /* !! */  = (byte[])new class275[]{class275.field3049, class275.field3047, class275.field3048, class275.field3044, class275.field3045, class275.field3051, class275.field3050, class275.field3043, class275.field3046};
            var15_8 /* !! */ .field875 = (class275)StructComposition.findEnumerated((class404[])var16_9 /* !! */ , var1_1.method10443());
            if (var5_5 == 0x7FFFFFFF) {
                this.field1403[var2_2] = var4_4.field875;
            }
        }
        if ((var3_3 & 16) != 0) {
            var6_6 = var1_1.readUnsignedByte();
            var16_9 /* !! */  = new byte[var6_6];
            var8_10 = new Buffer(var16_9 /* !! */ );
            var1_1.method10337(var16_9 /* !! */ , 0, var6_6);
            var4_4.method2282((Buffer)var8_10);
        }
        if ((var3_3 & 2) == 0) ** GOTO lbl35
        var6_6 = var1_1.readUnsignedByte();
        if (var6_6 <= 0) ** GOTO lbl31
        var7_7 = 0;
        while (true) {
            block32: {
                if (var7_7 < var6_6) break block32;
lbl31:
                // 2 sources

                if ((var7_7 = var1_1.method10341()) <= 0) ** GOTO lbl35
                var17_13 = 0;
                while (true) {
                    block33: {
                        if (var17_13 < var7_7) break block33;
lbl35:
                        // 3 sources

                        if ((var3_3 & 32) != 0) {
                            var1_1.method10323();
                            var1_1.method10312();
                            var1_1.method10314();
                            var6_6 = var1_1.method10312();
                            this.field1407.offset = 0;
                            var1_1.method10337(this.field1407.array, 0, var6_6);
                            this.field1407.offset = 0;
                        }
                        if ((var3_3 & 32768) != 0) {
                            var6_6 = var1_1.method10458();
                            var7_7 = var6_6 >> 8;
                            var17_13 = var7_7 >= 13 && var7_7 <= 20 ? var7_7 - 12 : 0;
                            var9_17 = (PlayerType)StructComposition.findEnumerated(class151.PlayerType_values(), var1_1.method10312());
                            var10_11 = var1_1.method10312() == 1 ? 1 : 0;
                            var11_12 = var1_1.method10314();
                            this.field1407.offset = 0;
                            var1_1.readBytes(this.field1407.array, 0, var11_12);
                            this.field1407.offset = 0;
                            var12_18 = AbstractFont.escapeBrackets(Skills.method7619(class261.method5505(this.field1407)));
                            var13_19 = null;
                            if (var17_13 > 0 && var17_13 <= 8) {
                                var13_19 = new byte[var17_13];
                                for (var14_20 = 0; var14_20 < var17_13; ++var14_20) {
                                    var13_19[var14_20] = var1_1.method10443();
                                }
                            }
                            var4_4.method2289(var6_6, var9_17, (boolean)var10_11, var12_18, var13_19);
                        }
                        if ((var3_3 & 2048) != 0) {
                            var5_5 = var1_1.method10316();
                            if (var5_5 != 127) {
                                var15_8 /* !! */  = this.field1403;
                                var7_7 = var2_2;
                                var8_10 = new class275[]{class275.field3049, class275.field3047, class275.field3048, class275.field3044, class275.field3045, class275.field3051, class275.field3050, class275.field3043, class275.field3046};
                                var15_8 /* !! */ [var7_7] = (class275)StructComposition.findEnumerated(var8_10, var5_5);
                            } else {
                                this.field1403[var2_2] = class275.field3048;
                            }
                        }
                        if ((var3_3 & 4096) != 0) {
                            var6_6 = Client.cycle + var1_1.method10323();
                            var7_7 = Client.cycle + var1_1.method10458();
                            var17_13 = var1_1.method10443();
                            var18_14 = var1_1.readByte();
                            var10_11 = var1_1.method10315();
                            var11_12 = (byte)var1_1.method10312();
                            var4_4.method2292(var6_6, var7_7, (byte)var17_13, var18_14, (byte)var10_11, (byte)var11_12);
                        }
                        if ((var3_3 & 128) != 0) {
                            var15_8 /* !! */  = var1_1.readStringCp1252NullTerminated();
                            var4_4.method2285((String)var15_8 /* !! */ );
                        }
                        if ((var3_3 & 1) != 0) {
                            var6_6 = var1_1.method10334();
                            if (var6_6 == 65535) {
                                var6_6 = -1;
                            }
                            var7_7 = var1_1.method10312();
                            var4_4.method2283(var6_6, var7_7);
                        }
                        if ((var3_3 & 65536) == 0) ** GOTO lbl95
                        var6_6 = var1_1.method10314();
                        var7_7 = 0;
                        while (true) {
                            block34: {
                                if (var7_7 < var6_6) break block34;
lbl95:
                                // 2 sources

                                if ((var3_3 & 64) != 0) {
                                    var6_6 = var1_1.readUnsignedShort();
                                    var4_4.method2288(var6_6);
                                }
                                if ((var3_3 & 16384) != 0) {
                                    var6_6 = var1_1.readByte();
                                    var7_7 = var1_1.method10316();
                                    var17_13 = var1_1.readByte();
                                    var18_14 = var1_1.method10316();
                                    var10_11 = var1_1.method10458() + Client.cycle;
                                    var11_12 = var1_1.method10334() + Client.cycle;
                                    var19_15 = var1_1.method10458();
                                    var4_4.method2290(var6_6, var7_7, var17_13, var18_14, var10_11, var11_12, var19_15, this.field1399[var2_2]);
                                }
                                return;
                            }
                            var17_13 = var1_1.method10314();
                            var18_14 = var1_1.method10323();
                            var10_11 = var1_1.readInt();
                            var4_4.method2311(var17_13, var18_14, var10_11 >> 16, var10_11 & 65535);
                            ++var7_7;
                        }
                    }
                    var18_14 = var1_1.readUShortSmart();
                    var10_11 = var1_1.readUShortSmart();
                    if (var10_11 == 32767) {
                        var4_4.method2314(var18_14);
                    } else {
                        var11_12 = var1_1.readUShortSmart();
                        var19_15 = var1_1.method10312();
                        var20_16 = var10_11 > 0 ? var1_1.method10341() : var19_15;
                        var4_4.method2287(var18_14, var10_11, var11_12, var19_15, var20_16);
                    }
                    ++var17_13;
                }
            }
            var18_14 = -1;
            var10_11 = -1;
            var11_12 = -1;
            var17_13 = var1_1.readUShortSmart();
            if (var17_13 != 32767) {
                if (var17_13 == 32766) {
                    var17_13 = -1;
                } else {
                    var10_11 = var1_1.readUShortSmart();
                }
            } else {
                var17_13 = var1_1.readUShortSmart();
                var10_11 = var1_1.readUShortSmart();
                var18_14 = var1_1.readUShortSmart();
                var11_12 = var1_1.readUShortSmart();
            }
            var19_15 = var1_1.readUShortSmart();
            var4_4.method2329(var17_13, var10_11, var18_14, var11_12, var19_15);
            ++var7_7;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2040127946")
    void method3139() {
        this.field1406 = 0;
        int n = 0;
        while (n < 2048) {
            this.field1413[n].method2271();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="585853899")
    static final int method3152() {
        return ViewportMouse.ViewportMouse_x;
    }
}

