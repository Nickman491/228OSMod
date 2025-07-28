/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pa")
public class class392 {
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lsq;")
    AbstractSocket field4598;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1096464379)
    int field4607 = 0;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(longValue=4500052521144206431L)
    long field4600;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lub;")
    NodeHashTable field4608 = new NodeHashTable(4096);
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-315141703)
    int field4602 = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lub;")
    NodeHashTable field4603 = new NodeHashTable(32);
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1574586861)
    int field4604 = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lpn;")
    DualNodeDeque field4605 = new DualNodeDeque();
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lub;")
    NodeHashTable field4621 = new NodeHashTable(4096);
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=578012545)
    int field4612 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lub;")
    NodeHashTable field4601 = new NodeHashTable(4096);
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-150234431)
    int field4609 = 0;
    @ObfuscatedName(value="av")
    boolean field4610;
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="Lpc;")
    class390 field4611;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="Lvy;")
    Buffer field4596 = new Buffer(8);
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lvy;")
    Buffer field4613;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1583644273)
    int field4614 = 0;
    @ObfuscatedName(value="ap")
    CRC32 field4615 = new CRC32();
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Lvy;")
    Buffer field4616;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="[Lok;")
    Archive[] field4594 = new Archive[256];
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=1230184665)
    int field4599 = -1;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-1123849549)
    int field4619 = 255;
    @ObfuscatedName(value="bw")
    byte field4620 = 0;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=94194841)
    public int field4617 = 0;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=794022525)
    public int field4622 = 0;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="12")
    public boolean method7822() {
        long l = ReflectionCheck.method724();
        int n = (int)(l - this.field4600);
        this.field4600 = l;
        if (n > 200) {
            n = 200;
        }
        this.field4607 += n;
        if (this.field4609 == 0 && this.field4604 == 0 && this.field4612 == 0 && this.field4602 == 0) {
            return true;
        }
        if (this.field4598 == null) {
            return false;
        }
        try {
            Buffer buffer;
            class390 class3902;
            if (this.field4607 > 30000) {
                throw new IOException();
            }
            while (this.field4604 < 200 && this.field4602 > 0) {
                class3902 = (class390)this.field4608.first();
                buffer = new Buffer(4);
                buffer.writeByte(1);
                buffer.method10267((int)class3902.key);
                this.field4598.write(buffer.array, 0, 4);
                this.field4603.put(class3902, class3902.key);
                --this.field4602;
                ++this.field4604;
            }
            while (this.field4609 < 200 && this.field4612 > 0) {
                class3902 = (class390)this.field4605.removeLast();
                buffer = new Buffer(4);
                buffer.writeByte(0);
                buffer.method10267((int)class3902.key);
                this.field4598.write(buffer.array, 0, 4);
                class3902.removeDual();
                this.field4601.put(class3902, class3902.key);
                --this.field4612;
                ++this.field4609;
            }
            for (int i = 0; i < 100; ++i) {
                int n2;
                int n3;
                int n4;
                int n5 = this.field4598.vmethod9408();
                if (n5 < 0) {
                    throw new IOException();
                }
                if (n5 == 0) break;
                this.field4607 = 0;
                int n6 = 0;
                if (this.field4611 == null) {
                    n6 = 8;
                } else if (this.field4614 == 0) {
                    n6 = 1;
                }
                if (n6 > 0) {
                    n4 = n6 - this.field4596.offset;
                    if (n4 > n5) {
                        n4 = n5;
                    }
                    this.field4598.read(this.field4596.array, this.field4596.offset, n4);
                    if (this.field4620 != 0) {
                        for (n3 = 0; n3 < n4; ++n3) {
                            int n7 = n3 + this.field4596.offset;
                            this.field4596.array[n7] = (byte)(this.field4596.array[n7] ^ this.field4620);
                        }
                    }
                    this.field4596.offset += n4;
                    if (this.field4596.offset < n6) break;
                    if (this.field4611 == null) {
                        this.field4596.offset = 0;
                        n3 = this.field4596.readUnsignedByte();
                        n2 = this.field4596.readUnsignedShort();
                        int n8 = this.field4596.readUnsignedByte();
                        int n9 = this.field4596.readInt();
                        long l2 = n2 + (n3 << 16);
                        class390 class3903 = (class390)this.field4603.get(l2);
                        this.field4610 = true;
                        if (class3903 == null) {
                            class3903 = (class390)this.field4601.get(l2);
                            this.field4610 = false;
                        }
                        if (class3903 == null) {
                            throw new IOException();
                        }
                        int n10 = n8 == 0 ? 5 : 9;
                        this.field4611 = class3903;
                        this.field4613 = new Buffer(this.field4611.field4572 + n9 + n10);
                        this.field4613.writeByte(n8);
                        this.field4613.method10268(n9);
                        this.field4614 = 8;
                        this.field4596.offset = 0;
                        continue;
                    }
                    if (this.field4614 != 0) continue;
                    if (this.field4596.array[0] == -1) {
                        this.field4614 = 1;
                        this.field4596.offset = 0;
                        continue;
                    }
                    this.field4611 = null;
                    continue;
                }
                n3 = 512 - this.field4614;
                n4 = this.field4613.array.length - this.field4611.field4572;
                if (n3 > n4 - this.field4613.offset) {
                    n3 = n4 - this.field4613.offset;
                }
                if (n3 > n5) {
                    n3 = n5;
                }
                this.field4598.read(this.field4613.array, this.field4613.offset, n3);
                if (this.field4620 != 0) {
                    for (n2 = 0; n2 < n3; ++n2) {
                        int n11 = n2 + this.field4613.offset;
                        this.field4613.array[n11] = (byte)(this.field4613.array[n11] ^ this.field4620);
                    }
                }
                this.field4613.offset += n3;
                this.field4614 += n3;
                if (this.field4613.offset == n4) {
                    if (this.field4611.key == 0xFF00FFL) {
                        this.field4616 = this.field4613;
                        for (n2 = 0; n2 < 256; ++n2) {
                            Archive archive = this.field4594[n2];
                            if (archive == null) continue;
                            this.method7826(archive, n2);
                        }
                    } else {
                        this.field4615.reset();
                        this.field4615.update(this.field4613.array, 0, n4);
                        n2 = (int)this.field4615.getValue();
                        if (this.field4611.field4575 != n2) {
                            try {
                                this.field4598.close();
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            ++this.field4617;
                            this.field4598 = null;
                            this.field4620 = (byte)(Math.random() * 255.0 + 1.0);
                            return false;
                        }
                        this.field4617 = 0;
                        this.field4622 = 0;
                        this.field4611.field4573.write((int)(this.field4611.key & 0xFFFFL), this.field4613.array, (this.field4611.key & 0xFF0000L) == 0xFF0000L, this.field4610);
                    }
                    this.field4611.remove();
                    if (this.field4610) {
                        --this.field4604;
                    } else {
                        --this.field4609;
                    }
                    this.field4614 = 0;
                    this.field4611 = null;
                    this.field4613 = null;
                    continue;
                }
                if (this.field4614 != 512) break;
                this.field4614 = 0;
            }
            return true;
        }
        catch (IOException iOException) {
            try {
                this.field4598.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++this.field4622;
            this.field4598 = null;
            return false;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1932547567")
    public void method7823(boolean bl) {
        if (this.field4598 == null) {
            return;
        }
        try {
            Buffer buffer = new Buffer(4);
            buffer.writeByte(bl ? 2 : 3);
            buffer.method10267(0);
            this.field4598.write(buffer.array, 0, 4);
        }
        catch (IOException iOException) {
            try {
                this.field4598.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++this.field4622;
            this.field4598 = null;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lsq;ZI)V", garbageValue="231801779")
    public void method7835(AbstractSocket abstractSocket, boolean bl) {
        Node node;
        if (this.field4598 != null) {
            try {
                this.field4598.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.field4598 = null;
        }
        this.field4598 = abstractSocket;
        this.method7823(bl);
        this.field4596.offset = 0;
        this.field4611 = null;
        this.field4613 = null;
        this.field4614 = 0;
        while ((node = (class390)this.field4603.first()) != null) {
            this.field4608.put(node, node.key);
            ++this.field4602;
            --this.field4604;
        }
        while ((node = (class390)this.field4601.first()) != null) {
            this.field4605.method7990((DualNode)node);
            this.field4621.put(node, node.key);
            ++this.field4612;
            --this.field4609;
        }
        if (this.field4620 != 0) {
            try {
                node = new Buffer(4);
                ((Buffer)node).writeByte(4);
                ((Buffer)node).writeByte(this.field4620);
                ((Buffer)node).writeShort(0);
                this.field4598.write(((Buffer)node).array, 0, 4);
            }
            catch (IOException iOException) {
                try {
                    this.field4598.close();
                }
                catch (Exception exception) {
                    // empty catch block
                }
                ++this.field4622;
                this.field4598 = null;
            }
        }
        this.field4607 = 0;
        this.field4600 = ReflectionCheck.method724();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lok;IB)V", garbageValue="0")
    void method7825(Archive archive, int n) {
        block10: {
            block9: {
                block7: {
                    block8: {
                        if (!archive.field4544 || archive.field4545) break block7;
                        if (n <= this.field4599) break block8;
                        if (n < this.field4619) {
                            this.field4619 = n;
                        }
                        break block9;
                    }
                    throw new RuntimeException("");
                }
                if (n >= this.field4619) break block10;
                if (n > this.field4599) {
                    this.field4599 = n;
                }
            }
            if (this.field4616 == null) {
                this.method7827(null, class389.field4550.field4567, 255, 0, (byte)0, true);
                this.field4594[n] = archive;
                return;
            }
            this.method7826(archive, n);
            return;
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lok;II)V", garbageValue="6968583")
    void method7826(Archive archive, int n) {
        this.field4616.offset = n * 8 + 5;
        if (this.field4616.offset < this.field4616.array.length) {
            int n2 = this.field4616.readInt();
            int n3 = this.field4616.readInt();
            archive.loadIndex(n2, n3);
            return;
        }
        if (!archive.field4544) {
            throw new RuntimeException("");
        }
        archive.method7678();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lok;IIIBZI)V", garbageValue="-1674923453")
    void method7827(Archive archive, int n, int n2, int n3, byte by, boolean bl) {
        long l = n2 + (n << 16);
        class390 class3902 = (class390)this.field4608.get(l);
        if (class3902 != null) {
            return;
        }
        class3902 = (class390)this.field4603.get(l);
        if (class3902 != null) {
            return;
        }
        class3902 = (class390)this.field4621.get(l);
        if (class3902 == null) {
            if (!bl && (class3902 = (class390)this.field4601.get(l)) != null) {
                return;
            }
            class3902 = new class390();
            class3902.field4573 = archive;
            class3902.field4575 = n3;
            class3902.field4572 = by;
            if (!bl) {
                this.field4605.method7987(class3902);
                this.field4621.put(class3902, l);
                ++this.field4612;
            } else {
                this.field4608.put(class3902, l);
                ++this.field4602;
            }
            return;
        }
        if (bl) {
            class3902.removeDual();
            this.field4608.put(class3902, l);
            --this.field4612;
            ++this.field4602;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="72025246")
    void method7828(int n, int n2) {
        long l = (n << 16) + n2;
        class390 class3902 = (class390)this.field4621.get(l);
        if (class3902 == null) {
            return;
        }
        this.field4605.method7990(class3902);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1504854630")
    int method7831(int n, int n2) {
        long l = (n << 16) + n2;
        if (this.field4611 != null && l == this.field4611.key) {
            return this.field4613.offset * 99 / (this.field4613.array.length - this.field4611.field4572) + 1;
        }
        return 0;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(ZZS)I", garbageValue="129")
    public int method7836(boolean bl, boolean bl2) {
        int n = 0;
        n = n + this.field4604 + this.field4602;
        return n;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="22957")
    public void method7855() {
        if (this.field4598 != null) {
            try {
                this.field4598.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.field4598 = null;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="92155993")
    public static void method7840(AbstractArchive abstractArchive) {
        VarpDefinition.VarpDefinition_archive = abstractArchive;
        VarpDefinition.field2505 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
    }
}

