package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vy")
public class class556
extends class514 {
    @ObfuscatedName(value="ac")
    static int[] field5469 = new int[256];
    @ObfuscatedName(value="as")
    public static long[] field5472;
    @ObfuscatedName(value="ax")
    public byte[] field5470;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1399283481)
    public int field5471;

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
                            class556.field5472[n2] = l;
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
                    class556.field5469[n] = n4;
                    ++n;
                    continue block0;
                }
                n4 = (n4 & 1) == 1 ? n4 >>> 1 ^ 0xEDB88320 : (n4 >>>= 1);
                ++n2;
            }
            break;
        }
    }

    public class556(int n, boolean bl) {
        this.field5470 = class302.method6466(n, bl);
    }

    public class556(int n) {
        byte[] byArray = class302.method6466(n, false);
        this.field5470 = byArray;
        this.field5471 = 0;
    }

    public class556(byte[] byArray) {
        this.field5470 = byArray;
        this.field5471 = 0;
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-638620493")
    public void method10451() {
        if (this.field5470 != null) {
            class284.method6065(this.field5470);
        }
        this.field5470 = null;
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(IS)V", garbageValue="-14184")
    public void method10300(int n) {
        this.field5470[++this.field5471 - 1] = (byte)n;
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1680087208")
    public void method10266(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
        this.field5470[++this.field5471 - 1] = (byte)n;
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1091542117")
    public void method10267(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n >> 16);
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
        this.field5470[++this.field5471 - 1] = (byte)n;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1881089628")
    public void method10268(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n >> 24);
        this.field5470[++this.field5471 - 1] = (byte)(n >> 16);
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
        this.field5470[++this.field5471 - 1] = (byte)n;
    }

    @ObfuscatedName(value="bn")
    public void method10269(long l) {
        this.field5470[++this.field5471 - 1] = (byte)(l >> 40);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 32);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 24);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 16);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 8);
        this.field5470[++this.field5471 - 1] = (byte)l;
    }

    @ObfuscatedName(value="br")
    public void method10466(long l) {
        this.field5470[++this.field5471 - 1] = (byte)(l >> 56);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 48);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 40);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 32);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 24);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 16);
        this.field5470[++this.field5471 - 1] = (byte)(l >> 8);
        this.field5470[++this.field5471 - 1] = (byte)l;
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-2095383927")
    public void method10329(boolean bl) {
        this.method10300(bl ? 1 : 0);
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-27")
    public void method10442(String string) {
        int n = string.indexOf(0);
        if (n >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5471 += Calender.method7599(string, 0, string.length(), this.field5470, this.field5471);
        this.field5470[++this.field5471 - 1] = 0;
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-2016992061")
    public void method10318(String string) {
        int n = string.indexOf(0);
        if (n >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5470[++this.field5471 - 1] = 0;
        this.field5471 += Calender.method7599(string, 0, string.length(), this.field5470, this.field5471);
        this.field5470[++this.field5471 - 1] = 0;
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;B)V", garbageValue="106")
    public void method10274(CharSequence charSequence) {
        int n = charSequence.length();
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= n) {
                int n4;
                n = n4 = n2;
                this.field5470[++this.field5471 - 1] = 0;
                this.method10350(n);
                n2 = this.field5471;
                byte[] byArray = this.field5470;
                int n5 = this.field5471;
                int n6 = charSequence.length();
                int n7 = n5;
                int n8 = 0;
                while (true) {
                    if (n8 >= n6) {
                        n3 = n7 - n5;
                        this.field5471 = n2 + n3;
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
    public void method10275(byte[] byArray, int n, int n2) {
        for (int i = n; i < n2 + n; ++i) {
            this.field5470[++this.field5471 - 1] = byArray[i];
        }
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1986430757")
    public void method10478(class556 class5562) {
        this.method10275(class5562.field5470, 0, class5562.field5471);
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-46")
    public void method10277(int n) {
        if (n >= 0) {
            this.field5470[this.field5471 - n - 4] = (byte)(n >> 24);
            this.field5470[this.field5471 - n - 3] = (byte)(n >> 16);
            this.field5470[this.field5471 - n - 2] = (byte)(n >> 8);
            this.field5470[this.field5471 - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="370184065")
    public void method10278(int n) {
        if (n >= 0 && n <= 65535) {
            this.field5470[this.field5471 - n - 2] = (byte)(n >> 8);
            this.field5470[this.field5471 - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1945244379")
    public void method10279(int n) {
        if (n >= 0 && n <= 255) {
            this.field5470[this.field5471 - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="cu")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="0")
    public void method10280(int n) {
        if (n >= 0 && n < 128) {
            this.method10300(n);
            return;
        }
        if (n >= 0 && n < 32768) {
            this.method10266(n + 32768);
            return;
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1203966043")
    public void method10350(int n) {
        if ((n & 0xFFFFFF80) != 0) {
            if ((n & 0xFFFFC000) != 0) {
                if ((n & 0xFFE00000) != 0) {
                    if ((n & 0xF0000000) != 0) {
                        this.method10300(n >>> 28 | 0x80);
                    }
                    this.method10300(n >>> 21 | 0x80);
                }
                this.method10300(n >>> 14 | 0x80);
            }
            this.method10300(n >>> 7 | 0x80);
        }
        this.method10300(n & 0x7F);
    }

    @ObfuscatedName(value="cf")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-75")
    public int method10282() {
        return this.field5470[++this.field5471 - 1] & 0xFF;
    }

    @ObfuscatedName(value="ct")
    @ObfuscatedSignature(descriptor="(I)B", garbageValue="-1717991247")
    public byte method10524() {
        return this.field5470[++this.field5471 - 1];
    }

    @ObfuscatedName(value="ci")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="112")
    public int method10307() {
        this.field5471 += 2;
        return (this.field5470[this.field5471 - 1] & 0xFF) + ((this.field5470[this.field5471 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName(value="cl")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1863322819")
    public int method10284() {
        this.field5471 += 2;
        int n = (this.field5470[this.field5471 - 1] & 0xFF) + ((this.field5470[this.field5471 - 2] & 0xFF) << 8);
        if (n > Short.MAX_VALUE) {
            n -= 65536;
        }
        return n;
    }

    @ObfuscatedName(value="cw")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1921343795")
    public int method10285() {
        this.field5471 += 3;
        return ((this.field5470[this.field5471 - 3] & 0xFF) << 16) + (this.field5470[this.field5471 - 1] & 0xFF) + ((this.field5470[this.field5471 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName(value="cj")
    @ObfuscatedSignature(descriptor="(S)I", garbageValue="-19618")
    public int method10440() {
        this.field5471 += 4;
        return ((this.field5470[this.field5471 - 3] & 0xFF) << 16) + (this.field5470[this.field5471 - 1] & 0xFF) + ((this.field5470[this.field5471 - 2] & 0xFF) << 8) + ((this.field5470[this.field5471 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName(value="cx")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="2087724181")
    public long method10273() {
        long l = (long)this.method10440() & 0xFFFFFFFFL;
        long l2 = (long)this.method10440() & 0xFFFFFFFFL;
        return (l << 32) + l2;
    }

    @ObfuscatedName(value="cd")
    @ObfuscatedSignature(descriptor="(B)F", garbageValue="40")
    public float method10302() {
        return Float.intBitsToFloat(this.method10440());
    }

    @ObfuscatedName(value="cv")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="54")
    public boolean method10410() {
        return (this.method10282() & 1) == 1;
    }

    @ObfuscatedName(value="ck")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="1")
    public String method10360() {
        if (this.field5470[this.field5471] != 0) {
            return this.method10290();
        }
        ++this.field5471;
        return null;
    }

    @ObfuscatedName(value="cs")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="-49")
    public String method10290() {
        int n = this.field5471;
        while (this.field5470[++this.field5471 - 1] != 0) {
        }
        int n2 = this.field5471 - n - 1;
        if (n2 == 0) {
            return "";
        }
        return class394.method7867(this.field5470, n, n2);
    }

    @ObfuscatedName(value="cm")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1901204193")
    public String method10291() {
        byte by;
        if ((by = this.field5470[++this.field5471 - 1]) != 0) {
            throw new IllegalStateException("");
        }
        int n = this.field5471;
        while (this.field5470[++this.field5471 - 1] != 0) {
        }
        int n2 = this.field5471 - n - 1;
        if (n2 == 0) {
            return "";
        }
        return class394.method7867(this.field5470, n, n2);
    }

    @ObfuscatedName(value="ce")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1848656728")
    public String method10373() {
        byte by;
        if ((by = this.field5470[++this.field5471 - 1]) != 0) {
            throw new IllegalStateException("");
        }
        int n = this.method10309();
        if (n + this.field5471 > this.field5470.length) {
            throw new IllegalStateException("");
        }
        byte[] byArray = this.field5470;
        int n2 = this.field5471;
        Object object = new char[n];
        int n3 = 0;
        int n4 = n2;
        int n5 = n2 + n;
        while (true) {
            int n6;
            if (n4 >= n5) {
                String string = new String((char[])object, 0, n3);
                object = string;
                this.field5471 += n;
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
    public void method10293(byte[] byArray, int n, int n2) {
        for (int i = n; i < n2 + n; ++i) {
            byArray[i] = this.field5470[++this.field5471 - 1];
        }
    }

    @ObfuscatedName(value="ch")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="2010062227")
    public int method10294() {
        int n = this.field5470[this.field5471] & 0xFF;
        if (n < 128) {
            return this.method10282() - 64;
        }
        return this.method10307() - 49152;
    }

    @ObfuscatedName(value="dh")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="2")
    public int method10407() {
        int n = this.field5470[this.field5471] & 0xFF;
        if (n < 128) {
            return this.method10282();
        }
        return this.method10307() - 32768;
    }

    @ObfuscatedName(value="dn")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1127285883")
    public int method10441() {
        int n = this.field5470[this.field5471] & 0xFF;
        if (n < 128) {
            return this.method10282() - 1;
        }
        return this.method10307() - 32769;
    }

    @ObfuscatedName(value="dc")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="587119874")
    public int method10297() {
        int n = 0;
        int n2 = this.method10407();
        while (n2 == Short.MAX_VALUE) {
            n += Short.MAX_VALUE;
            n2 = this.method10407();
        }
        return n += n2;
    }

    @ObfuscatedName(value="dm")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="99")
    public int method10298() {
        if (this.field5470[this.field5471] < 0) {
            return this.method10440() & Integer.MAX_VALUE;
        }
        return this.method10307();
    }

    @ObfuscatedName(value="dj")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1959823020")
    public int method10476() {
        if (this.field5470[this.field5471] < 0) {
            return this.method10440() & Integer.MAX_VALUE;
        }
        int n = this.method10307();
        if (n == Short.MAX_VALUE) {
            return -1;
        }
        return n;
    }

    @ObfuscatedName(value="dk")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-120")
    public int method10309() {
        byte by = this.field5470[++this.field5471 - 1];
        int n = 0;
        while (by < 0) {
            n = (n | by & 0x7F) << 7;
            by = this.field5470[++this.field5471 - 1];
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
            n = this.method10282();
            n2 |= (n & 0x7F) << n3;
            n3 += 7;
        } while (n > 127);
        return n2;
    }

    @ObfuscatedName(value="dr")
    @ObfuscatedSignature(descriptor="([IB)V", garbageValue="1")
    public void method10351(int[] nArray) {
        int n = this.field5471 / 8;
        this.field5471 = 0;
        int n2 = 0;
        block0: while (n2 < n) {
            int n3 = this.method10440();
            int n4 = this.method10440();
            int n5 = 0;
            int n6 = -1640531527;
            int n7 = 32;
            while (true) {
                if (n7-- <= 0) {
                    this.field5471 -= 8;
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
    public void method10303(int[] nArray) {
        int n = this.field5471 / 8;
        this.field5471 = 0;
        int n2 = 0;
        block0: while (n2 < n) {
            int n3 = this.method10440();
            int n4 = this.method10440();
            int n5 = -957401312;
            int n6 = -1640531527;
            int n7 = 32;
            while (true) {
                if (n7-- <= 0) {
                    this.field5471 -= 8;
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
    public void method10492(int[] nArray, int n, int n2) {
        int n3 = this.field5471;
        this.field5471 = n;
        int n4 = (n2 - n) / 8;
        int n5 = 0;
        block0: while (true) {
            if (n5 >= n4) {
                this.field5471 = n3;
                return;
            }
            int n6 = this.method10440();
            int n7 = this.method10440();
            int n8 = 0;
            int n9 = -1640531527;
            int n10 = 32;
            while (true) {
                if (n10-- <= 0) {
                    this.field5471 -= 8;
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
    public void method10305(int[] nArray, int n, int n2) {
        int n3 = this.field5471;
        this.field5471 = n;
        int n4 = (n2 - n) / 8;
        int n5 = 0;
        block0: while (true) {
            if (n5 >= n4) {
                this.field5471 = n3;
                return;
            }
            int n6 = this.method10440();
            int n7 = this.method10440();
            int n8 = -957401312;
            int n9 = -1640531527;
            int n10 = 32;
            while (true) {
                if (n10-- <= 0) {
                    this.field5471 -= 8;
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
    public void method10306(BigInteger bigInteger, BigInteger bigInteger2) {
        int n = this.field5471;
        this.field5471 = 0;
        byte[] byArray = new byte[n];
        this.method10293(byArray, 0, n);
        BigInteger bigInteger3 = new BigInteger(byArray);
        BigInteger bigInteger4 = bigInteger3.modPow(bigInteger, bigInteger2);
        byte[] byArray2 = bigInteger4.toByteArray();
        this.field5471 = 0;
        this.method10266(byArray2.length);
        this.method10275(byArray2, 0, byArray2.length);
    }

    @ObfuscatedName(value="df")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1186297975")
    public int method10474(int n) {
        int n2 = class499.method9539(this.field5470, n, this.field5471);
        this.method10268(n2);
        return n2;
    }

    @ObfuscatedName(value="de")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="-11535")
    public boolean method10308() {
        int n;
        this.field5471 -= 4;
        int n2 = class499.method9539(this.field5470, 0, this.field5471);
        return n2 == (n = this.method10440());
    }

    @ObfuscatedName(value="dw")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1504604099")
    public void method10477(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n + 128);
    }

    @ObfuscatedName(value="dv")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-75962357")
    public void method10310(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(0 - n);
    }

    @ObfuscatedName(value="dx")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1928075364")
    public void method10311(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(128 - n);
    }

    @ObfuscatedName(value="dd")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="2143280892")
    public int method10312() {
        return this.field5470[++this.field5471 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName(value="dy")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="81")
    public int method10341() {
        return 0 - this.field5470[++this.field5471 - 1] & 0xFF;
    }

    @ObfuscatedName(value="db")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-57")
    public int method10314() {
        return 128 - this.field5470[++this.field5471 - 1] & 0xFF;
    }

    @ObfuscatedName(value="du")
    @ObfuscatedSignature(descriptor="(I)B", garbageValue="1342197840")
    public byte method10315() {
        return (byte)(this.field5470[++this.field5471 - 1] - 128);
    }

    @ObfuscatedName(value="da")
    @ObfuscatedSignature(descriptor="(I)B", garbageValue="-534708668")
    public byte method10316() {
        return (byte)(0 - this.field5470[++this.field5471 - 1]);
    }

    @ObfuscatedName(value="dp")
    @ObfuscatedSignature(descriptor="(B)B", garbageValue="107")
    public byte method10443() {
        return (byte)(128 - this.field5470[++this.field5471 - 1]);
    }

    @ObfuscatedName(value="di")
    @ObfuscatedSignature(descriptor="(IS)V", garbageValue="-1033")
    public void method10454(int n) {
        this.field5470[++this.field5471 - 1] = (byte)n;
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="dq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-718530840")
    public void method10319(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
        this.field5470[++this.field5471 - 1] = (byte)(n + 128);
    }

    @ObfuscatedName(value="dz")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="47")
    public void method10320(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n + 128);
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="ex")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-4")
    public int method10334() {
        this.field5471 += 2;
        return ((this.field5470[this.field5471 - 1] & 0xFF) << 8) + (this.field5470[this.field5471 - 2] & 0xFF);
    }

    @ObfuscatedName(value="eq")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="1")
    public int method10458() {
        this.field5471 += 2;
        return (this.field5470[this.field5471 - 1] - 128 & 0xFF) + ((this.field5470[this.field5471 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName(value="ef")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-36")
    public int method10323() {
        this.field5471 += 2;
        return ((this.field5470[this.field5471 - 1] & 0xFF) << 8) + (this.field5470[this.field5471 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName(value="ei")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1450622479")
    public int method10324() {
        this.field5471 += 2;
        int n = ((this.field5470[this.field5471 - 1] & 0xFF) << 8) + (this.field5470[this.field5471 - 2] & 0xFF);
        if (n > Short.MAX_VALUE) {
            n -= 65536;
        }
        return n;
    }

    @ObfuscatedName(value="ej")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1517766132")
    public int method10325() {
        this.field5471 += 2;
        int n = (this.field5470[this.field5471 - 1] - 128 & 0xFF) + ((this.field5470[this.field5471 - 2] & 0xFF) << 8);
        if (n > Short.MAX_VALUE) {
            n -= 65536;
        }
        return n;
    }

    @ObfuscatedName(value="eg")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="37")
    public int method10326() {
        this.field5471 += 2;
        int n = ((this.field5470[this.field5471 - 1] & 0xFF) << 8) + (this.field5470[this.field5471 - 2] - 128 & 0xFF);
        if (n > Short.MAX_VALUE) {
            n -= 65536;
        }
        return n;
    }

    @ObfuscatedName(value="ek")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="925241387")
    public void method10327(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n >> 16);
        this.field5470[++this.field5471 - 1] = (byte)n;
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="et")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="786071719")
    public int method10354() {
        this.field5471 += 3;
        return (this.field5470[this.field5471 - 3] & 0xFF) + ((this.field5470[this.field5471 - 2] & 0xFF) << 8) + ((this.field5470[this.field5471 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName(value="ec")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="541244151")
    public int method10434() {
        this.field5471 += 3;
        return ((this.field5470[this.field5471 - 1] & 0xFF) << 8) + ((this.field5470[this.field5471 - 3] & 0xFF) << 16) + (this.field5470[this.field5471 - 2] & 0xFF);
    }

    @ObfuscatedName(value="em")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="112")
    public int method10330() {
        this.field5471 += 3;
        int n = ((this.field5470[this.field5471 - 1] & 0xFF) << 8) + ((this.field5470[this.field5471 - 3] & 0xFF) << 16) + (this.field5470[this.field5471 - 2] & 0xFF);
        if (n > 0x7FFFFF) {
            n -= 0x1000000;
        }
        return n;
    }

    @ObfuscatedName(value="es")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="83")
    public void method10331(int n) {
        this.field5470[++this.field5471 - 1] = (byte)n;
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
        this.field5470[++this.field5471 - 1] = (byte)(n >> 16);
        this.field5470[++this.field5471 - 1] = (byte)(n >> 24);
    }

    @ObfuscatedName(value="er")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1033261220")
    public void method10332(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
        this.field5470[++this.field5471 - 1] = (byte)n;
        this.field5470[++this.field5471 - 1] = (byte)(n >> 24);
        this.field5470[++this.field5471 - 1] = (byte)(n >> 16);
    }

    @ObfuscatedName(value="ep")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="570742558")
    public void method10333(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n >> 16);
        this.field5470[++this.field5471 - 1] = (byte)(n >> 24);
        this.field5470[++this.field5471 - 1] = (byte)n;
        this.field5470[++this.field5471 - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="eo")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-258527649")
    public int method10378() {
        this.field5471 += 4;
        return (this.field5470[this.field5471 - 4] & 0xFF) + ((this.field5470[this.field5471 - 3] & 0xFF) << 8) + ((this.field5470[this.field5471 - 2] & 0xFF) << 16) + ((this.field5470[this.field5471 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName(value="ez")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-520093696")
    public int method10335() {
        this.field5471 += 4;
        return ((this.field5470[this.field5471 - 2] & 0xFF) << 24) + ((this.field5470[this.field5471 - 4] & 0xFF) << 8) + (this.field5470[this.field5471 - 3] & 0xFF) + ((this.field5470[this.field5471 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName(value="eb")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-1")
    public int method10387() {
        this.field5471 += 4;
        return ((this.field5470[this.field5471 - 1] & 0xFF) << 8) + ((this.field5470[this.field5471 - 4] & 0xFF) << 16) + (this.field5470[this.field5471 - 2] & 0xFF) + ((this.field5470[this.field5471 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName(value="en")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="-41111164")
    public void method10337(byte[] byArray, int n, int n2) {
        for (int i = n; i < n2 + n; ++i) {
            byArray[i] = (byte)(this.field5470[++this.field5471 - 1] - 128);
        }
    }
}

