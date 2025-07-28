package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nx")
public class class342
extends class514 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lub;")
    class530 field3712 = new class530(16);
    @ObfuscatedName(value="ah")
    byte[] field3711;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    class342(class556 class5562) {
        class5562.field5471 = class5562.field5470.length - 3;
        int n = class5562.method10282();
        int n2 = class5562.method10307();
        int n3 = n * 10 + 14;
        class5562.field5471 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        while (true) {
            int n13;
            int n14;
            if (n12 >= n) {
                n3 += n4 * 5;
                n3 += (n6 + n7 + n5 + n8 + n10) * 2;
                n3 = n3 + n9 + n11;
                n12 = class5562.field5471;
                n14 = n + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11;
                for (n13 = 0; n13 < n14; ++n13) {
                    class5562.method10309();
                }
                n3 += class5562.field5471 - n12;
                n13 = class5562.field5471;
                int n15 = 0;
                int n16 = 0;
                int n17 = 0;
                int n18 = 0;
                int n19 = 0;
                int n20 = 0;
                int n21 = 0;
                int n22 = 0;
                int n23 = 0;
                int n24 = 0;
                int n25 = 0;
                int n26 = 0;
                int n27 = 0;
                int n28 = 0;
                while (true) {
                    if (n28 >= n5) {
                        n28 = 0;
                        int n29 = class5562.field5471;
                        class5562.field5471 += n25;
                        int n30 = class5562.field5471;
                        class5562.field5471 += n10;
                        int n31 = class5562.field5471;
                        class5562.field5471 += n9;
                        int n32 = class5562.field5471;
                        class5562.field5471 += n8;
                        int n33 = class5562.field5471;
                        class5562.field5471 += n15;
                        int n34 = class5562.field5471;
                        class5562.field5471 += n17;
                        int n35 = class5562.field5471;
                        class5562.field5471 += n19;
                        int n36 = class5562.field5471;
                        class5562.field5471 += n6 + n7 + n10;
                        int n37 = class5562.field5471;
                        class5562.field5471 += n6;
                        int n38 = class5562.field5471;
                        class5562.field5471 += n26;
                        int n39 = class5562.field5471;
                        class5562.field5471 += n7;
                        int n40 = class5562.field5471;
                        class5562.field5471 += n16;
                        int n41 = class5562.field5471;
                        class5562.field5471 += n18;
                        int n42 = class5562.field5471;
                        class5562.field5471 += n20;
                        int n43 = class5562.field5471;
                        class5562.field5471 += n11;
                        int n44 = class5562.field5471;
                        class5562.field5471 += n8;
                        int n45 = class5562.field5471;
                        class5562.field5471 += n21;
                        int n46 = class5562.field5471;
                        class5562.field5471 += n22;
                        int n47 = class5562.field5471;
                        class5562.field5471 += n23;
                        int n48 = class5562.field5471;
                        class5562.field5471 += n24;
                        int n49 = class5562.field5471;
                        class5562.field5471 += n4 * 3;
                        this.field3711 = new byte[n3];
                        class556 class5563 = new class556(this.field3711);
                        class5563.method10268(1297377380);
                        class5563.method10268(6);
                        class5563.method10266(n > 1 ? 1 : 0);
                        class5563.method10266(n);
                        class5563.method10266(n2);
                        class5562.field5471 = n12;
                        int n50 = 0;
                        int n51 = 0;
                        int n52 = 0;
                        int n53 = 0;
                        int n54 = 0;
                        int n55 = 0;
                        int n56 = 0;
                        int[] nArray = new int[128];
                        n27 = 0;
                        int[] nArray2 = new int[16];
                        int[] nArray3 = new int[16];
                        int[] nArray4 = nArray2;
                        nArray3[9] = 128;
                        nArray4[9] = 128;
                        int n57 = 0;
                        while (true) {
                            boolean bl;
                            int n58;
                            if (n57 >= n) {
                                return;
                            }
                            class5563.method10268(1297379947);
                            class5563.field5471 += 4;
                            int n59 = n58 = class5563.field5471;
                            int n60 = -1;
                            while (true) {
                                int n61 = class5562.method10309();
                                class5563.method10350(n61);
                                n59 += n61;
                                int n62 = class5562.field5470[n28++] & 0xFF;
                                bl = n62 != n60;
                                n60 = n62 & 0xF;
                                if (n62 == 7) break;
                                if (n62 != 23) {
                                    int n63;
                                    int n64;
                                    n50 ^= n62 >> 4;
                                    if (n60 != 0) {
                                        if (n60 != 1) {
                                            if (n60 != 2) {
                                                if (n60 != 3) {
                                                    if (n60 != 4) {
                                                        if (n60 != 5) {
                                                            if (n60 != 6) {
                                                                throw new RuntimeException();
                                                            }
                                                            if (bl) {
                                                                class5563.method10300(n50 + 192);
                                                            }
                                                            n64 = class5562.field5470[n43++];
                                                            nArray3[n50] = n64 + nArray2[n50];
                                                            class5563.method10300(n64);
                                                            continue;
                                                        }
                                                        if (bl) {
                                                            class5563.method10300(n50 + 160);
                                                        }
                                                        int n65 = n36++;
                                                        int n66 = n30++;
                                                        class5563.method10300((n51 += class5562.field5470[n65]) & 0x7F);
                                                        class5563.method10300((n56 += class5562.field5470[n66]) & 0x7F);
                                                        continue;
                                                    }
                                                    if (bl) {
                                                        class5563.method10300(n50 + 208);
                                                    }
                                                    class5563.method10300((n55 += class5562.field5470[n31++]) & 0x7F);
                                                    continue;
                                                }
                                                if (bl) {
                                                    class5563.method10300(n50 + 224);
                                                }
                                                n54 += class5562.field5470[n44++];
                                                class5563.method10300((n54 += class5562.field5470[n32++] << 7) & 0x7F);
                                                class5563.method10300(n54 >> 7 & 0x7F);
                                                continue;
                                            }
                                            if (bl) {
                                                class5563.method10300(n50 + 176);
                                            }
                                            n27 = n27 + class5562.field5470[n13++] & 0x7F;
                                            class5563.method10300(n27);
                                            n64 = n27 != 0 && n27 != 32 ? (n27 == 1 ? class5562.field5470[n33++] : (n27 == 33 ? class5562.field5470[n40++] : (n27 == 7 ? class5562.field5470[n34++] : (n27 == 39 ? class5562.field5470[n41++] : (n27 == 10 ? class5562.field5470[n35++] : (n27 == 42 ? class5562.field5470[n42++] : (n27 == 99 ? class5562.field5470[n45++] : (n27 == 98 ? class5562.field5470[n46++] : (n27 == 101 ? class5562.field5470[n47++] : (n27 == 100 ? class5562.field5470[n48++] : (n27 != 64 && n27 != 65 && n27 != 120 && n27 != 121 && n27 != 123 ? class5562.field5470[n38++] : class5562.field5470[n29++]))))))))))) : class5562.field5470[n43++];
                                            nArray[n27] = n64 += nArray[n27];
                                            n63 = n64 & 0x7F;
                                            class5563.method10300(n63);
                                            if (n27 == 0) {
                                                nArray2[n50] = (n63 << 14) + (nArray2[n50] & 0xFFE03FFF);
                                            }
                                            if (n27 != 32) continue;
                                            nArray2[n50] = (nArray2[n50] & 0xFFFFC07F) + (n63 << 7);
                                            continue;
                                        }
                                        if (bl) {
                                            class5563.method10300(n50 + 128);
                                        }
                                        int n67 = n36++;
                                        int n68 = n39++;
                                        class5563.method10300((n51 += class5562.field5470[n67]) & 0x7F);
                                        class5563.method10300((n53 += class5562.field5470[n68]) & 0x7F);
                                        continue;
                                    }
                                    if (bl) {
                                        class5563.method10300(n50 + 144);
                                    }
                                    int n69 = n36++;
                                    int n70 = n37++;
                                    n64 = (n51 += class5562.field5470[n69]) & 0x7F;
                                    n63 = (n52 += class5562.field5470[n70]) & 0x7F;
                                    class5563.method10300(n64);
                                    class5563.method10300(n63);
                                    if (n63 <= 0) continue;
                                    int n71 = nArray3[n50];
                                    class346 class3462 = (class346)this.field3712.method9985(n71);
                                    if (class3462 == null) {
                                        class3462 = new class346(n59);
                                        this.field3712.method9984(class3462, n71);
                                    }
                                    class3462.field3748.set(n64);
                                    continue;
                                }
                                if (bl) {
                                    class5563.method10300(255);
                                }
                                class5563.method10300(81);
                                class5563.method10300(3);
                                class5563.method10300(class5562.field5470[n49++]);
                                class5563.method10300(class5562.field5470[n49++]);
                                class5563.method10300(class5562.field5470[n49++]);
                            }
                            if (bl) {
                                class5563.method10300(255);
                            }
                            class5563.method10300(47);
                            class5563.method10300(0);
                            class5563.method10277(class5563.field5471 - n58);
                            ++n57;
                        }
                    }
                    n27 = n27 + class5562.method10282() & 0x7F;
                    if (n27 != 0 && n27 != 32) {
                        if (n27 == 1) {
                            ++n15;
                        } else if (n27 == 33) {
                            ++n16;
                        } else if (n27 == 7) {
                            ++n17;
                        } else if (n27 == 39) {
                            ++n18;
                        } else if (n27 == 10) {
                            ++n19;
                        } else if (n27 == 42) {
                            ++n20;
                        } else if (n27 == 99) {
                            ++n21;
                        } else if (n27 == 98) {
                            ++n22;
                        } else if (n27 == 101) {
                            ++n23;
                        } else if (n27 == 100) {
                            ++n24;
                        } else if (n27 != 64 && n27 != 65 && n27 != 120 && n27 != 121 && n27 != 123) {
                            ++n26;
                        } else {
                            ++n25;
                        }
                    } else {
                        ++n11;
                    }
                    ++n28;
                }
            }
            n14 = -1;
            while (true) {
                if ((n13 = class5562.method10282()) != n14) {
                    ++n3;
                }
                n14 = n13 & 0xF;
                if (n13 == 7) break;
                if (n13 != 23) {
                    if (n14 != 0) {
                        if (n14 != 1) {
                            if (n14 != 2) {
                                if (n14 != 3) {
                                    if (n14 != 4) {
                                        if (n14 != 5) {
                                            if (n14 != 6) {
                                                throw new RuntimeException();
                                            }
                                            ++n11;
                                            continue;
                                        }
                                        ++n10;
                                        continue;
                                    }
                                    ++n9;
                                    continue;
                                }
                                ++n8;
                                continue;
                            }
                            ++n5;
                            continue;
                        }
                        ++n7;
                        continue;
                    }
                    ++n6;
                    continue;
                }
                ++n4;
            }
            ++n12;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;II)Lnx;")
    public static class342 method6928(class391 class3912, int n, int n2) {
        byte[] byArray = class3912.method7790(n, n2);
        if (byArray == null) {
            return null;
        }
        return new class342(new class556(byArray));
    }
}

