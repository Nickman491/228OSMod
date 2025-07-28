/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nx")
@Implements(value="MusicTrack")
public class MusicTrack
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lub;")
    NodeHashTable field3712 = new NodeHashTable(16);
    @ObfuscatedName(value="ah")
    @Export(value="midi")
    byte[] midi;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    MusicTrack(Buffer buffer) {
        buffer.offset = buffer.array.length - 3;
        int n = buffer.readUnsignedByte();
        int n2 = buffer.readUnsignedShort();
        int n3 = n * 10 + 14;
        buffer.offset = 0;
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
                n12 = buffer.offset;
                n14 = n + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11;
                for (n13 = 0; n13 < n14; ++n13) {
                    buffer.readVarInt();
                }
                n3 += buffer.offset - n12;
                n13 = buffer.offset;
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
                        int n29 = buffer.offset;
                        buffer.offset += n25;
                        int n30 = buffer.offset;
                        buffer.offset += n10;
                        int n31 = buffer.offset;
                        buffer.offset += n9;
                        int n32 = buffer.offset;
                        buffer.offset += n8;
                        int n33 = buffer.offset;
                        buffer.offset += n15;
                        int n34 = buffer.offset;
                        buffer.offset += n17;
                        int n35 = buffer.offset;
                        buffer.offset += n19;
                        int n36 = buffer.offset;
                        buffer.offset += n6 + n7 + n10;
                        int n37 = buffer.offset;
                        buffer.offset += n6;
                        int n38 = buffer.offset;
                        buffer.offset += n26;
                        int n39 = buffer.offset;
                        buffer.offset += n7;
                        int n40 = buffer.offset;
                        buffer.offset += n16;
                        int n41 = buffer.offset;
                        buffer.offset += n18;
                        int n42 = buffer.offset;
                        buffer.offset += n20;
                        int n43 = buffer.offset;
                        buffer.offset += n11;
                        int n44 = buffer.offset;
                        buffer.offset += n8;
                        int n45 = buffer.offset;
                        buffer.offset += n21;
                        int n46 = buffer.offset;
                        buffer.offset += n22;
                        int n47 = buffer.offset;
                        buffer.offset += n23;
                        int n48 = buffer.offset;
                        buffer.offset += n24;
                        int n49 = buffer.offset;
                        buffer.offset += n4 * 3;
                        this.midi = new byte[n3];
                        Buffer buffer2 = new Buffer(this.midi);
                        buffer2.method10268(1297377380);
                        buffer2.method10268(6);
                        buffer2.writeShort(n > 1 ? 1 : 0);
                        buffer2.writeShort(n);
                        buffer2.writeShort(n2);
                        buffer.offset = n12;
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
                            buffer2.method10268(1297379947);
                            buffer2.offset += 4;
                            int n59 = n58 = buffer2.offset;
                            int n60 = -1;
                            while (true) {
                                int n61 = buffer.readVarInt();
                                buffer2.writeVarInt(n61);
                                n59 += n61;
                                int n62 = buffer.array[n28++] & 0xFF;
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
                                                                buffer2.writeByte(n50 + 192);
                                                            }
                                                            n64 = buffer.array[n43++];
                                                            nArray3[n50] = n64 + nArray2[n50];
                                                            buffer2.writeByte(n64);
                                                            continue;
                                                        }
                                                        if (bl) {
                                                            buffer2.writeByte(n50 + 160);
                                                        }
                                                        int n65 = n36++;
                                                        int n66 = n30++;
                                                        buffer2.writeByte((n51 += buffer.array[n65]) & 0x7F);
                                                        buffer2.writeByte((n56 += buffer.array[n66]) & 0x7F);
                                                        continue;
                                                    }
                                                    if (bl) {
                                                        buffer2.writeByte(n50 + 208);
                                                    }
                                                    buffer2.writeByte((n55 += buffer.array[n31++]) & 0x7F);
                                                    continue;
                                                }
                                                if (bl) {
                                                    buffer2.writeByte(n50 + 224);
                                                }
                                                n54 += buffer.array[n44++];
                                                buffer2.writeByte((n54 += buffer.array[n32++] << 7) & 0x7F);
                                                buffer2.writeByte(n54 >> 7 & 0x7F);
                                                continue;
                                            }
                                            if (bl) {
                                                buffer2.writeByte(n50 + 176);
                                            }
                                            n27 = n27 + buffer.array[n13++] & 0x7F;
                                            buffer2.writeByte(n27);
                                            n64 = n27 != 0 && n27 != 32 ? (n27 == 1 ? buffer.array[n33++] : (n27 == 33 ? buffer.array[n40++] : (n27 == 7 ? buffer.array[n34++] : (n27 == 39 ? buffer.array[n41++] : (n27 == 10 ? buffer.array[n35++] : (n27 == 42 ? buffer.array[n42++] : (n27 == 99 ? buffer.array[n45++] : (n27 == 98 ? buffer.array[n46++] : (n27 == 101 ? buffer.array[n47++] : (n27 == 100 ? buffer.array[n48++] : (n27 != 64 && n27 != 65 && n27 != 120 && n27 != 121 && n27 != 123 ? buffer.array[n38++] : buffer.array[n29++]))))))))))) : buffer.array[n43++];
                                            nArray[n27] = n64 += nArray[n27];
                                            n63 = n64 & 0x7F;
                                            buffer2.writeByte(n63);
                                            if (n27 == 0) {
                                                nArray2[n50] = (n63 << 14) + (nArray2[n50] & 0xFFE03FFF);
                                            }
                                            if (n27 != 32) continue;
                                            nArray2[n50] = (nArray2[n50] & 0xFFFFC07F) + (n63 << 7);
                                            continue;
                                        }
                                        if (bl) {
                                            buffer2.writeByte(n50 + 128);
                                        }
                                        int n67 = n36++;
                                        int n68 = n39++;
                                        buffer2.writeByte((n51 += buffer.array[n67]) & 0x7F);
                                        buffer2.writeByte((n53 += buffer.array[n68]) & 0x7F);
                                        continue;
                                    }
                                    if (bl) {
                                        buffer2.writeByte(n50 + 144);
                                    }
                                    int n69 = n36++;
                                    int n70 = n37++;
                                    n64 = (n51 += buffer.array[n69]) & 0x7F;
                                    n63 = (n52 += buffer.array[n70]) & 0x7F;
                                    buffer2.writeByte(n64);
                                    buffer2.writeByte(n63);
                                    if (n63 <= 0) continue;
                                    int n71 = nArray3[n50];
                                    class346 class3462 = (class346)this.field3712.get(n71);
                                    if (class3462 == null) {
                                        class3462 = new class346(n59);
                                        this.field3712.put(class3462, n71);
                                    }
                                    class3462.field3748.set(n64);
                                    continue;
                                }
                                if (bl) {
                                    buffer2.writeByte(255);
                                }
                                buffer2.writeByte(81);
                                buffer2.writeByte(3);
                                buffer2.writeByte(buffer.array[n49++]);
                                buffer2.writeByte(buffer.array[n49++]);
                                buffer2.writeByte(buffer.array[n49++]);
                            }
                            if (bl) {
                                buffer2.writeByte(255);
                            }
                            buffer2.writeByte(47);
                            buffer2.writeByte(0);
                            buffer2.writeLengthInt(buffer2.offset - n58);
                            ++n57;
                        }
                    }
                    n27 = n27 + buffer.readUnsignedByte() & 0x7F;
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
                if ((n13 = buffer.readUnsignedByte()) != n14) {
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
    @Export(value="readTrack")
    public static MusicTrack readTrack(AbstractArchive abstractArchive, int n, int n2) {
        byte[] byArray = abstractArchive.takeFile(n, n2);
        if (byArray == null) {
            return null;
        }
        return new MusicTrack(new Buffer(byArray));
    }
}

