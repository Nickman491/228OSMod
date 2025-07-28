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
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vy")
@Implements(value="Buffer")
public class Buffer
extends Node {
    @ObfuscatedName(value="ac")
    static int[] field5469 = new int[256];
    @ObfuscatedName(value="as")
    public static long[] field5472;
    @ObfuscatedName(value="ax")
    @Export(value="array")
    public byte[] array;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1399283481)
    @Export(value="offset")
    public int offset;

    static {
        int n = 0;
        block0: while (true) {
            int n2;
            if (n >= 256) {
                field5472 = new long[256];
                n2 = 0;
                block1: while (true) {
                    if (n2 >= 256) {
                        return;
                    }
                    long l = n2;
                    int n3 = 0;
                    while (true) {
                        if (n3 >= 8) {
                            Buffer.field5472[n2] = l;
                            ++n2;
                            continue block1;
                        }
                        l = (l & 1L) == 1L ? l >>> 1 ^ 0xC96C5795D7870F42L : (l >>>= 1);
                        ++n3;
                    }
                    break;
                }
            }
            int n4 = n;
            n2 = 0;
            while (true) {
                if (n2 >= 8) {
                    Buffer.field5469[n] = n4;
                    ++n;
                    continue block0;
                }
                n4 = (n4 & 1) == 1 ? n4 >>> 1 ^ 0xEDB88320 : (n4 >>>= 1);
                ++n2;
            }
            break;
        }
    }

    public Buffer(int n, boolean bl) {
        this.array = AbstractWorldMapIcon.ByteArrayPool_getArrayBool(n, bl);
    }

    public Buffer(int n) {
        byte[] byArray = AbstractWorldMapIcon.ByteArrayPool_getArrayBool(n, false);
        this.array = byArray;
        this.offset = 0;
    }

    public Buffer(byte[] byArray) {
        this.array = byArray;
        this.offset = 0;
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-638620493")
    @Export(value="releaseArray")
    public void releaseArray() {
        if (this.array != null) {
            WorldMapArea.ByteArrayPool_release(this.array);
        }
        this.array = null;
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(IS)V", garbageValue="-14184")
    @Export(value="writeByte")
    public void writeByte(int n) {
        this.array[++this.offset - 1] = (byte)n;
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1680087208")
    @Export(value="writeShort")
    public void writeShort(int n) {
        this.array[++this.offset - 1] = (byte)(n >> 8);
        this.array[++this.offset - 1] = (byte)n;
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1091542117")
    public void method10267(int n) {
        this.array[++this.offset - 1] = (byte)(n >> 16);
        this.array[++this.offset - 1] = (byte)(n >> 8);
        this.array[++this.offset - 1] = (byte)n;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1881089628")
    public void method10268(int n) {
        this.array[++this.offset - 1] = (byte)(n >> 24);
        this.array[++this.offset - 1] = (byte)(n >> 16);
        this.array[++this.offset - 1] = (byte)(n >> 8);
        this.array[++this.offset - 1] = (byte)n;
    }

    @ObfuscatedName(value="bn")
    @Export(value="writeLongMedium")
    public void writeLongMedium(long l) {
        this.array[++this.offset - 1] = (byte)(l >> 40);
        this.array[++this.offset - 1] = (byte)(l >> 32);
        this.array[++this.offset - 1] = (byte)(l >> 24);
        this.array[++this.offset - 1] = (byte)(l >> 16);
        this.array[++this.offset - 1] = (byte)(l >> 8);
        this.array[++this.offset - 1] = (byte)l;
    }

    @ObfuscatedName(value="br")
    @Export(value="writeLong")
    public void writeLong(long l) {
        this.array[++this.offset - 1] = (byte)(l >> 56);
        this.array[++this.offset - 1] = (byte)(l >> 48);
        this.array[++this.offset - 1] = (byte)(l >> 40);
        this.array[++this.offset - 1] = (byte)(l >> 32);
        this.array[++this.offset - 1] = (byte)(l >> 24);
        this.array[++this.offset - 1] = (byte)(l >> 16);
        this.array[++this.offset - 1] = (byte)(l >> 8);
        this.array[++this.offset - 1] = (byte)l;
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-2095383927")
    @Export(value="writeBoolean")
    public void writeBoolean(boolean bl) {
        this.writeByte(bl ? 1 : 0);
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-27")
    @Export(value="writeStringCp1252NullTerminated")
    public void writeStringCp1252NullTerminated(String string) {
        int n = string.indexOf(0);
        if (n >= 0) {
            throw new IllegalArgumentException("");
        }
        this.offset += Calendar.encodeStringCp1252(string, 0, string.length(), this.array, this.offset);
        this.array[++this.offset - 1] = 0;
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-2016992061")
    @Export(value="writeStringCp1252NullCircumfixed")
    public void writeStringCp1252NullCircumfixed(String string) {
        int n = string.indexOf(0);
        if (n >= 0) {
            throw new IllegalArgumentException("");
        }
        this.array[++this.offset - 1] = 0;
        this.offset += Calendar.encodeStringCp1252(string, 0, string.length(), this.array, this.offset);
        this.array[++this.offset - 1] = 0;
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;B)V", garbageValue="106")
    @Export(value="writeCESU8")
    public void writeCESU8(CharSequence charSequence) {
        int n = charSequence.length();
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= n) {
                int n4;
                n = n4 = n2;
                this.array[++this.offset - 1] = 0;
                this.writeVarInt(n);
                n2 = this.offset;
                byte[] byArray = this.array;
                int n5 = this.offset;
                int n6 = charSequence.length();
                int n7 = n5;
                int n8 = 0;
                while (true) {
                    if (n8 >= n6) {
                        n3 = n7 - n5;
                        this.offset = n2 + n3;
                        return;
                    }
                    char c = charSequence.charAt(n8);
                    if (c > '\u007f') {
                        if (c > '\u07ff') {
                            byArray[n7++] = (byte)(0xE0 | c >> 12);
                            byArray[n7++] = (byte)(0x80 | c >> 6 & 0x3F);
                            byArray[n7++] = (byte)(0x80 | c & 0x3F);
                        } else {
                            byArray[n7++] = (byte)(0xC0 | c >> 6);
                            byArray[n7++] = (byte)(0x80 | c & 0x3F);
                        }
                    } else {
                        byArray[n7++] = (byte)c;
                    }
                    ++n8;
                }
            }
            char c = charSequence.charAt(n3);
            n2 = c <= '\u007f' ? ++n2 : (c <= '\u07ff' ? (n2 += 2) : (n2 += 3));
            ++n3;
        }
    }

    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="-1824575331")
    @Export(value="writeBytes")
    public void writeBytes(byte[] byArray, int n, int n2) {
        for (int i = n; i < n2 + n; ++i) {
            this.array[++this.offset - 1] = byArray[i];
        }
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1986430757")
    public void method10478(Buffer buffer) {
        this.writeBytes(buffer.array, 0, buffer.offset);
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-46")
    @Export(value="writeLengthInt")
    public void writeLengthInt(int n) {
        if (n >= 0) {
            this.array[this.offset - n - 4] = (byte)(n >> 24);
            this.array[this.offset - n - 3] = (byte)(n >> 16);
            this.array[this.offset - n - 2] = (byte)(n >> 8);
            this.array[this.offset - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="370184065")
    @Export(value="writeLengthShort")
    public void writeLengthShort(int n) {
        if (n >= 0 && n <= 65535) {
            this.array[this.offset - n - 2] = (byte)(n >> 8);
            this.array[this.offset - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1945244379")
    public void method10279(int n) {
        if (n >= 0 && n <= 255) {
            this.array[this.offset - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="cu")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="0")
    @Export(value="writeSmartByteShort")
    public void writeSmartByteShort(int n) {
        if (n >= 0 && n < 128) {
            this.writeByte(n);
            return;
        }
        if (n >= 0 && n < 32768) {
            this.writeShort(n + 32768);
            return;
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1203966043")
    @Export(value="writeVarInt")
    public void writeVarInt(int n) {
        if ((n & 0xFFFFFF80) != 0) {
            if ((n & 0xFFFFC000) != 0) {
                if ((n & 0xFFE00000) != 0) {
                    if ((n & 0xF0000000) != 0) {
                        this.writeByte(n >>> 28 | 0x80);
                    }
                    this.writeByte(n >>> 21 | 0x80);
                }
                this.writeByte(n >>> 14 | 0x80);
            }
            this.writeByte(n >>> 7 | 0x80);
        }
        this.writeByte(n & 0x7F);
    }

    @ObfuscatedName(value="cf")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-75")
    @Export(value="readUnsignedByte")
    public int readUnsignedByte() {
        return this.array[++this.offset - 1] & 0xFF;
    }

    @ObfuscatedName(value="ct")
    @ObfuscatedSignature(descriptor="(I)B", garbageValue="-1717991247")
    @Export(value="readByte")
    public byte readByte() {
        return this.array[++this.offset - 1];
    }

    @ObfuscatedName(value="ci")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="112")
    @Export(value="readUnsignedShort")
    public int readUnsignedShort() {
        this.offset += 2;
        return (this.array[this.offset - 1] & 0xFF) + ((this.array[this.offset - 2] & 0xFF) << 8);
    }

    @ObfuscatedName(value="cl")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1863322819")
    @Export(value="readShort")
    public int readShort() {
        this.offset += 2;
        int n = (this.array[this.offset - 1] & 0xFF) + ((this.array[this.offset - 2] & 0xFF) << 8);
        if (n > Short.MAX_VALUE) {
            n -= 65536;
        }
        return n;
    }

    @ObfuscatedName(value="cw")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1921343795")
    @Export(value="readMedium")
    public int readMedium() {
        this.offset += 3;
        return ((this.array[this.offset - 3] & 0xFF) << 16) + (this.array[this.offset - 1] & 0xFF) + ((this.array[this.offset - 2] & 0xFF) << 8);
    }

    @ObfuscatedName(value="cj")
    @ObfuscatedSignature(descriptor="(S)I", garbageValue="-19618")
    @Export(value="readInt")
    public int readInt() {
        this.offset += 4;
        return ((this.array[this.offset - 3] & 0xFF) << 16) + (this.array[this.offset - 1] & 0xFF) + ((this.array[this.offset - 2] & 0xFF) << 8) + ((this.array[this.offset - 4] & 0xFF) << 24);
    }

    @ObfuscatedName(value="cx")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="2087724181")
    @Export(value="readLong")
    public long readLong() {
        long l = (long)this.readInt() & 0xFFFFFFFFL;
        long l2 = (long)this.readInt() & 0xFFFFFFFFL;
        return (l << 32) + l2;
    }

    @ObfuscatedName(value="cd")
    @ObfuscatedSignature(descriptor="(B)F", garbageValue="40")
    public float method10302() {
        return Float.intBitsToFloat(this.readInt());
    }

    @ObfuscatedName(value="cv")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="54")
    @Export(value="readBoolean")
    public boolean readBoolean() {
        return (this.readUnsignedByte() & 1) == 1;
    }

    @ObfuscatedName(value="ck")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="1")
    @Export(value="readStringCp1252NullTerminatedOrNull")
    public String readStringCp1252NullTerminatedOrNull() {
        if (this.array[this.offset] != 0) {
            return this.readStringCp1252NullTerminated();
        }
        ++this.offset;
        return null;
    }

    @ObfuscatedName(value="cs")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="-49")
    @Export(value="readStringCp1252NullTerminated")
    public String readStringCp1252NullTerminated() {
        int n = this.offset;
        while (this.array[++this.offset - 1] != 0) {
        }
        int n2 = this.offset - n - 1;
        if (n2 == 0) {
            return "";
        }
        return GrandExchangeOfferTotalQuantityComparator.decodeStringCp1252(this.array, n, n2);
    }

    @ObfuscatedName(value="cm")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1901204193")
    @Export(value="readStringCp1252NullCircumfixed")
    public String readStringCp1252NullCircumfixed() {
        byte by;
        if ((by = this.array[++this.offset - 1]) != 0) {
            throw new IllegalStateException("");
        }
        int n = this.offset;
        while (this.array[++this.offset - 1] != 0) {
        }
        int n2 = this.offset - n - 1;
        if (n2 == 0) {
            return "";
        }
        return GrandExchangeOfferTotalQuantityComparator.decodeStringCp1252(this.array, n, n2);
    }

    @ObfuscatedName(value="ce")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1848656728")
    @Export(value="readCESU8")
    public String readCESU8() {
        byte by;
        if ((by = this.array[++this.offset - 1]) != 0) {
            throw new IllegalStateException("");
        }
        int n = this.readVarInt();
        if (n + this.offset > this.array.length) {
            throw new IllegalStateException("");
        }
        byte[] byArray = this.array;
        int n2 = this.offset;
        Object object = new char[n];
        int n3 = 0;
        int n4 = n2;
        int n5 = n2 + n;
        while (true) {
            int n6;
            if (n4 >= n5) {
                String string = new String((char[])object, 0, n3);
                object = string;
                this.offset += n;
                return object;
            }
            int n7 = byArray[n4++] & 0xFF;
            if (n7 >= 128) {
                if (n7 < 192) {
                    n6 = 65533;
                } else if (n7 >= 224) {
                    if (n7 >= 240) {
                        n6 = n7 >= 248 ? 65533 : (n4 + 2 < n5 && (byArray[n4] & 0xC0) == 128 && (byArray[n4 + 1] & 0xC0) == 128 && (byArray[n4 + 2] & 0xC0) == 128 ? ((n6 = (n7 & 7) << 18 | (byArray[n4++] & 0x3F) << 12 | (byArray[n4++] & 0x3F) << 6 | byArray[n4++] & 0x3F) >= 65536 && n6 <= 0x10FFFF ? 65533 : 65533) : 65533);
                    } else if (n4 + 1 < n5 && (byArray[n4] & 0xC0) == 128 && (byArray[n4 + 1] & 0xC0) == 128) {
                        if ((n6 = (n7 & 0xF) << 12 | (byArray[n4++] & 0x3F) << 6 | byArray[n4++] & 0x3F) < 2048) {
                            n6 = 65533;
                        }
                    } else {
                        n6 = 65533;
                    }
                } else if (n4 < n5 && (byArray[n4] & 0xC0) == 128) {
                    if ((n6 = (n7 & 0x1F) << 6 | byArray[n4++] & 0x3F) < 128) {
                        n6 = 65533;
                    }
                } else {
                    n6 = 65533;
                }
            } else {
                n6 = n7 == 0 ? 65533 : n7;
            }
            object[n3++] = (char)n6;
        }
    }

    @ObfuscatedName(value="cr")
    @ObfuscatedSignature(descriptor="([BIIS)V", garbageValue="2360")
    @Export(value="readBytes")
    public void readBytes(byte[] byArray, int n, int n2) {
        for (int i = n; i < n2 + n; ++i) {
            byArray[i] = this.array[++this.offset - 1];
        }
    }

    @ObfuscatedName(value="ch")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="2010062227")
    @Export(value="readShortSmart")
    public int readShortSmart() {
        int n = this.array[this.offset] & 0xFF;
        if (n < 128) {
            return this.readUnsignedByte() - 64;
        }
        return this.readUnsignedShort() - 49152;
    }

    @ObfuscatedName(value="dh")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="2")
    @Export(value="readUShortSmart")
    public int readUShortSmart() {
        int n = this.array[this.offset] & 0xFF;
        if (n < 128) {
            return this.readUnsignedByte();
        }
        return this.readUnsignedShort() - 32768;
    }

    @ObfuscatedName(value="dn")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1127285883")
    public int method10441() {
        int n = this.array[this.offset] & 0xFF;
        if (n < 128) {
            return this.readUnsignedByte() - 1;
        }
        return this.readUnsignedShort() - 32769;
    }

    @ObfuscatedName(value="dc")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="587119874")
    public int method10297() {
        int n = 0;
        int n2 = this.readUShortSmart();
        while (n2 == Short.MAX_VALUE) {
            n += Short.MAX_VALUE;
            n2 = this.readUShortSmart();
        }
        return n += n2;
    }

    @ObfuscatedName(value="dm")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="99")
    public int method10298() {
        if (this.array[this.offset] < 0) {
            return this.readInt() & Integer.MAX_VALUE;
        }
        return this.readUnsignedShort();
    }

    @ObfuscatedName(value="dj")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1959823020")
    public int method10476() {
        if (this.array[this.offset] < 0) {
            return this.readInt() & Integer.MAX_VALUE;
        }
        int n = this.readUnsignedShort();
        if (n == Short.MAX_VALUE) {
            return -1;
        }
        return n;
    }

    @ObfuscatedName(value="dk")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-120")
    @Export(value="readVarInt")
    public int readVarInt() {
        byte by = this.array[++this.offset - 1];
        int n = 0;
        while (by < 0) {
            n = (n | by & 0x7F) << 7;
            by = this.array[++this.offset - 1];
        }
        return n | by;
    }

    @ObfuscatedName(value="ds")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2120394268")
    public int method10301() {
        int n;
        int n2 = 0;
        int n3 = 0;
        do {
            n = this.readUnsignedByte();
            n2 |= (n & 0x7F) << n3;
            n3 += 7;
        } while (n > 127);
        return n2;
    }

    @ObfuscatedName(value="dr")
    @ObfuscatedSignature(descriptor="([IB)V", garbageValue="1")
    @Export(value="xteaEncryptAll")
    public void xteaEncryptAll(int[] nArray) {
        int n = this.offset / 8;
        this.offset = 0;
        int n2 = 0;
        block0: while (n2 < n) {
            int n3 = this.readInt();
            int n4 = this.readInt();
            int n5 = 0;
            int n6 = -1640531527;
            int n7 = 32;
            while (true) {
                if (n7-- <= 0) {
                    this.offset -= 8;
                    this.method10268(n3);
                    this.method10268(n4);
                    ++n2;
                    continue block0;
                }
                n3 = (n4 + (n4 << 4 ^ n4 >>> 5) ^ n5 + nArray[n5 & 3]) + n3;
                n4 += n3 + (n3 << 4 ^ n3 >>> 5) ^ nArray[(n5 += n6) >>> 11 & 3] + n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="dl")
    @ObfuscatedSignature(descriptor="([IB)V", garbageValue="3")
    @Export(value="xteaDecryptAll")
    public void xteaDecryptAll(int[] nArray) {
        int n = this.offset / 8;
        this.offset = 0;
        int n2 = 0;
        block0: while (n2 < n) {
            int n3 = this.readInt();
            int n4 = this.readInt();
            int n5 = -957401312;
            int n6 = -1640531527;
            int n7 = 32;
            while (true) {
                if (n7-- <= 0) {
                    this.offset -= 8;
                    this.method10268(n3);
                    this.method10268(n4);
                    ++n2;
                    continue block0;
                }
                n3 -= (n4 -= n3 + (n3 << 4 ^ n3 >>> 5) ^ nArray[n5 >>> 11 & 3] + n5) + (n4 << 4 ^ n4 >>> 5) ^ (n5 -= n6) + nArray[n5 & 3];
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="do")
    @ObfuscatedSignature(descriptor="([IIIS)V", garbageValue="-684")
    @Export(value="xteaEncrypt")
    public void xteaEncrypt(int[] nArray, int n, int n2) {
        int n3 = this.offset;
        this.offset = n;
        int n4 = (n2 - n) / 8;
        int n5 = 0;
        block0: while (true) {
            if (n5 >= n4) {
                this.offset = n3;
                return;
            }
            int n6 = this.readInt();
            int n7 = this.readInt();
            int n8 = 0;
            int n9 = -1640531527;
            int n10 = 32;
            while (true) {
                if (n10-- <= 0) {
                    this.offset -= 8;
                    this.method10268(n6);
                    this.method10268(n7);
                    ++n5;
                    continue block0;
                }
                n6 = (n7 + (n7 << 4 ^ n7 >>> 5) ^ n8 + nArray[n8 & 3]) + n6;
                n7 += n6 + (n6 << 4 ^ n6 >>> 5) ^ nArray[(n8 += n9) >>> 11 & 3] + n8;
            }
            break;
        }
    }

    @ObfuscatedName(value="dg")
    @ObfuscatedSignature(descriptor="([IIII)V", garbageValue="-367008219")
    @Export(value="xteaDecrypt")
    public void xteaDecrypt(int[] nArray, int n, int n2) {
        int n3 = this.offset;
        this.offset = n;
        int n4 = (n2 - n) / 8;
        int n5 = 0;
        block0: while (true) {
            if (n5 >= n4) {
                this.offset = n3;
                return;
            }
            int n6 = this.readInt();
            int n7 = this.readInt();
            int n8 = -957401312;
            int n9 = -1640531527;
            int n10 = 32;
            while (true) {
                if (n10-- <= 0) {
                    this.offset -= 8;
                    this.method10268(n6);
                    this.method10268(n7);
                    ++n5;
                    continue block0;
                }
                n6 -= (n7 -= n6 + (n6 << 4 ^ n6 >>> 5) ^ nArray[n8 >>> 11 & 3] + n8) + (n7 << 4 ^ n7 >>> 5) ^ (n8 -= n9) + nArray[n8 & 3];
            }
            break;
        }
    }

    @ObfuscatedName(value="dt")
    @ObfuscatedSignature(descriptor="(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", garbageValue="-1814837936")
    @Export(value="encryptRsa")
    public void encryptRsa(BigInteger bigInteger, BigInteger bigInteger2) {
        int n = this.offset;
        this.offset = 0;
        byte[] byArray = new byte[n];
        this.readBytes(byArray, 0, n);
        BigInteger bigInteger3 = new BigInteger(byArray);
        BigInteger bigInteger4 = bigInteger3.modPow(bigInteger, bigInteger2);
        byte[] byArray2 = bigInteger4.toByteArray();
        this.offset = 0;
        this.writeShort(byArray2.length);
        this.writeBytes(byArray2, 0, byArray2.length);
    }

    @ObfuscatedName(value="df")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1186297975")
    @Export(value="writeCrc")
    public int writeCrc(int n) {
        int n2 = class499.method9539(this.array, n, this.offset);
        this.method10268(n2);
        return n2;
    }

    @ObfuscatedName(value="de")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="-11535")
    @Export(value="checkCrc")
    public boolean checkCrc() {
        int n;
        this.offset -= 4;
        int n2 = class499.method9539(this.array, 0, this.offset);
        return n2 == (n = this.readInt());
    }

    @ObfuscatedName(value="dw")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1504604099")
    public void method10477(int n) {
        this.array[++this.offset - 1] = (byte)(n + 128);
    }

    @ObfuscatedName(value="dv")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-75962357")
    public void method10310(int n) {
        this.array[++this.offset - 1] = (byte)(0 - n);
    }

    @ObfuscatedName(value="dx")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1928075364")
    public void method10311(int n) {
        this.array[++this.offset - 1] = (byte)(128 - n);
    }

    @ObfuscatedName(value="dd")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="2143280892")
    public int method10312() {
        return this.array[++this.offset - 1] - 128 & 0xFF;
    }

    @ObfuscatedName(value="dy")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="81")
    public int method10341() {
        return 0 - this.array[++this.offset - 1] & 0xFF;
    }

    @ObfuscatedName(value="db")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-57")
    public int method10314() {
        return 128 - this.array[++this.offset - 1] & 0xFF;
    }

    @ObfuscatedName(value="du")
    @ObfuscatedSignature(descriptor="(I)B", garbageValue="1342197840")
    public byte method10315() {
        return (byte)(this.array[++this.offset - 1] - 128);
    }

    @ObfuscatedName(value="da")
    @ObfuscatedSignature(descriptor="(I)B", garbageValue="-534708668")
    public byte method10316() {
        return (byte)(0 - this.array[++this.offset - 1]);
    }

    @ObfuscatedName(value="dp")
    @ObfuscatedSignature(descriptor="(B)B", garbageValue="107")
    public byte method10443() {
        return (byte)(128 - this.array[++this.offset - 1]);
    }

    @ObfuscatedName(value="di")
    @ObfuscatedSignature(descriptor="(IS)V", garbageValue="-1033")
    public void method10454(int n) {
        this.array[++this.offset - 1] = (byte)n;
        this.array[++this.offset - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="dq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-718530840")
    @Export(value="writeInt")
    public void writeInt(int n) {
        this.array[++this.offset - 1] = (byte)(n >> 8);
        this.array[++this.offset - 1] = (byte)(n + 128);
    }

    @ObfuscatedName(value="dz")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="47")
    public void method10320(int n) {
        this.array[++this.offset - 1] = (byte)(n + 128);
        this.array[++this.offset - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="ex")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-4")
    public int method10334() {
        this.offset += 2;
        return ((this.array[this.offset - 1] & 0xFF) << 8) + (this.array[this.offset - 2] & 0xFF);
    }

    @ObfuscatedName(value="eq")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="1")
    public int method10458() {
        this.offset += 2;
        return (this.array[this.offset - 1] - 128 & 0xFF) + ((this.array[this.offset - 2] & 0xFF) << 8);
    }

    @ObfuscatedName(value="ef")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-36")
    public int method10323() {
        this.offset += 2;
        return ((this.array[this.offset - 1] & 0xFF) << 8) + (this.array[this.offset - 2] - 128 & 0xFF);
    }

    @ObfuscatedName(value="ei")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1450622479")
    public int method10324() {
        this.offset += 2;
        int n = ((this.array[this.offset - 1] & 0xFF) << 8) + (this.array[this.offset - 2] & 0xFF);
        if (n > Short.MAX_VALUE) {
            n -= 65536;
        }
        return n;
    }

    @ObfuscatedName(value="ej")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1517766132")
    public int method10325() {
        this.offset += 2;
        int n = (this.array[this.offset - 1] - 128 & 0xFF) + ((this.array[this.offset - 2] & 0xFF) << 8);
        if (n > Short.MAX_VALUE) {
            n -= 65536;
        }
        return n;
    }

    @ObfuscatedName(value="eg")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="37")
    public int method10326() {
        this.offset += 2;
        int n = ((this.array[this.offset - 1] & 0xFF) << 8) + (this.array[this.offset - 2] - 128 & 0xFF);
        if (n > Short.MAX_VALUE) {
            n -= 65536;
        }
        return n;
    }

    @ObfuscatedName(value="ek")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="925241387")
    public void method10327(int n) {
        this.array[++this.offset - 1] = (byte)(n >> 16);
        this.array[++this.offset - 1] = (byte)n;
        this.array[++this.offset - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="et")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="786071719")
    public int method10354() {
        this.offset += 3;
        return (this.array[this.offset - 3] & 0xFF) + ((this.array[this.offset - 2] & 0xFF) << 8) + ((this.array[this.offset - 1] & 0xFF) << 16);
    }

    @ObfuscatedName(value="ec")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="541244151")
    public int method10434() {
        this.offset += 3;
        return ((this.array[this.offset - 1] & 0xFF) << 8) + ((this.array[this.offset - 3] & 0xFF) << 16) + (this.array[this.offset - 2] & 0xFF);
    }

    @ObfuscatedName(value="em")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="112")
    public int method10330() {
        this.offset += 3;
        int n = ((this.array[this.offset - 1] & 0xFF) << 8) + ((this.array[this.offset - 3] & 0xFF) << 16) + (this.array[this.offset - 2] & 0xFF);
        if (n > 0x7FFFFF) {
            n -= 0x1000000;
        }
        return n;
    }

    @ObfuscatedName(value="es")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="83")
    public void method10331(int n) {
        this.array[++this.offset - 1] = (byte)n;
        this.array[++this.offset - 1] = (byte)(n >> 8);
        this.array[++this.offset - 1] = (byte)(n >> 16);
        this.array[++this.offset - 1] = (byte)(n >> 24);
    }

    @ObfuscatedName(value="er")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1033261220")
    public void method10332(int n) {
        this.array[++this.offset - 1] = (byte)(n >> 8);
        this.array[++this.offset - 1] = (byte)n;
        this.array[++this.offset - 1] = (byte)(n >> 24);
        this.array[++this.offset - 1] = (byte)(n >> 16);
    }

    @ObfuscatedName(value="ep")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="570742558")
    public void method10333(int n) {
        this.array[++this.offset - 1] = (byte)(n >> 16);
        this.array[++this.offset - 1] = (byte)(n >> 24);
        this.array[++this.offset - 1] = (byte)n;
        this.array[++this.offset - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="eo")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-258527649")
    public int method10378() {
        this.offset += 4;
        return (this.array[this.offset - 4] & 0xFF) + ((this.array[this.offset - 3] & 0xFF) << 8) + ((this.array[this.offset - 2] & 0xFF) << 16) + ((this.array[this.offset - 1] & 0xFF) << 24);
    }

    @ObfuscatedName(value="ez")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-520093696")
    public int method10335() {
        this.offset += 4;
        return ((this.array[this.offset - 2] & 0xFF) << 24) + ((this.array[this.offset - 4] & 0xFF) << 8) + (this.array[this.offset - 3] & 0xFF) + ((this.array[this.offset - 1] & 0xFF) << 16);
    }

    @ObfuscatedName(value="eb")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-1")
    public int method10387() {
        this.offset += 4;
        return ((this.array[this.offset - 1] & 0xFF) << 8) + ((this.array[this.offset - 4] & 0xFF) << 16) + (this.array[this.offset - 2] & 0xFF) + ((this.array[this.offset - 3] & 0xFF) << 24);
    }

    @ObfuscatedName(value="en")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="-41111164")
    public void method10337(byte[] byArray, int n, int n2) {
        for (int i = n; i < n2 + n; ++i) {
            byArray[i] = (byte)(this.array[++this.offset - 1] - 128);
        }
    }
}

