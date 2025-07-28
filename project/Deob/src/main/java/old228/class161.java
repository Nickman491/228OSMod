package old228;/*
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

@ObfuscatedName(value="gq")
public class class161 {
    @ObfuscatedName(value="fu")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field1762;
    @ObfuscatedName(value="qy")
    @ObfuscatedSignature(descriptor="Lis;")
    static class217 field1750;
    @ObfuscatedName(value="ah")
    boolean field1737;
    @ObfuscatedName(value="az")
    boolean field1736;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=-3709235999232645775L)
    long field1759;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-661585717)
    public int field1738 = 0;
    @ObfuscatedName(value="an")
    public String field1739 = null;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1276121963)
    int field1740 = 0;
    @ObfuscatedName(value="ax")
    public boolean field1741;
    @ObfuscatedName(value="at")
    public byte field1742;
    @ObfuscatedName(value="ac")
    public byte field1753;
    @ObfuscatedName(value="au")
    public byte field1744;
    @ObfuscatedName(value="as")
    public byte field1745;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1201920345)
    public int field1746;
    @ObfuscatedName(value="af")
    long[] field1743;
    @ObfuscatedName(value="aa")
    public byte[] field1748;
    @ObfuscatedName(value="ak")
    int[] field1756;
    @ObfuscatedName(value="al")
    int[] field1757;
    @ObfuscatedName(value="av")
    public int[] field1751;
    @ObfuscatedName(value="ag")
    public boolean[] field1749;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-2066897607)
    public int field1752 = -1;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=505072089)
    public int field1760 = -1;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-1741264551)
    public int field1755;
    @ObfuscatedName(value="am")
    long[] field1754;
    @ObfuscatedName(value="ap")
    public String[] field1761;
    @ObfuscatedName(value="ab")
    public String[] field1758;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lue;")
    class529 field1747;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    public class161(class556 class5562) {
        this.method3703(class5562);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="2138067556")
    void method3753(int n) {
        if (this.field1737) {
            if (this.field1743 != null) {
                this.field1743 = new long[n];
                System.arraycopy(this.field1743, 0, this.field1743, 0, this.field1746);
            } else {
                this.field1743 = new long[n];
            }
        }
        if (this.field1736) {
            if (this.field1761 != null) {
                this.field1761 = new String[n];
                System.arraycopy(this.field1761, 0, this.field1761, 0, this.field1746);
            } else {
                this.field1761 = new String[n];
            }
        }
        if (this.field1748 != null) {
            this.field1748 = new byte[n];
            System.arraycopy(this.field1748, 0, this.field1748, 0, this.field1746);
        } else {
            this.field1748 = new byte[n];
        }
        if (this.field1757 != null) {
            this.field1757 = new int[n];
            System.arraycopy(this.field1757, 0, this.field1757, 0, this.field1746);
        } else {
            this.field1757 = new int[n];
        }
        if (this.field1751 != null) {
            this.field1751 = new int[n];
            System.arraycopy(this.field1751, 0, this.field1751, 0, this.field1746);
        } else {
            this.field1751 = new int[n];
        }
        if (this.field1749 != null) {
            this.field1749 = new boolean[n];
            System.arraycopy(this.field1749, 0, this.field1749, 0, this.field1746);
        } else {
            this.field1749 = new boolean[n];
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1821713879")
    void method3686(int n) {
        if (this.field1737) {
            if (this.field1754 != null) {
                this.field1754 = new long[n];
                System.arraycopy(this.field1754, 0, this.field1754, 0, this.field1755);
            } else {
                this.field1754 = new long[n];
            }
        }
        if (this.field1736) {
            if (this.field1758 != null) {
                this.field1758 = new String[n];
                System.arraycopy(this.field1758, 0, this.field1758, 0, this.field1755);
            } else {
                this.field1758 = new String[n];
            }
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)I", garbageValue="-312021165")
    public int method3712(String string) {
        if (string != null && string.length() != 0) {
            int n = 0;
            while (true) {
                if (n >= this.field1746) {
                    return -1;
                }
                if (this.field1761[n].equals(string)) {
                    return n;
                }
                ++n;
            }
        }
        return -1;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)I", garbageValue="-47")
    public int method3711(int n, int n2, int n3) {
        int n4 = n3 == 31 ? -1 : (1 << n3 + 1) - 1;
        return (this.field1757[n] & n4) >>> n2;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/Integer;", garbageValue="-1059269862")
    public Integer method3689(int n) {
        if (this.field1747 == null) {
            return null;
        }
        class514 class5142 = this.field1747.method9967(n);
        if (class5142 != null && class5142 instanceof class513) {
            return new Integer(((class513)class5142).field5172);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="1423743648")
    public int[] method3709() {
        if (this.field1756 != null) return this.field1756;
        String[] stringArray = new String[this.field1746];
        this.field1756 = new int[this.field1746];
        int n = 0;
        while (true) {
            if (n >= this.field1746) {
                class190.method4461(stringArray, this.field1756);
                return this.field1756;
            }
            stringArray[n] = this.field1761[n];
            if (stringArray[n] != null) {
                stringArray[n] = stringArray[n].toLowerCase();
            }
            this.field1756[n] = n;
            ++n;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(JLjava/lang/String;II)V", garbageValue="1735897697")
    void method3691(long l, String string, int n) {
        if (string != null && string.length() == 0) {
            string = null;
        }
        if (l > 0L != this.field1737) {
            throw new RuntimeException("");
        }
        if (this.field1736 != (string != null)) {
            throw new RuntimeException("");
        }
        if (l > 0L && (this.field1743 == null || this.field1746 >= this.field1743.length) || string != null && (this.field1761 == null || this.field1746 >= this.field1761.length)) {
            this.method3753(this.field1746 + 5);
        }
        if (this.field1743 != null) {
            this.field1743[this.field1746] = l;
        }
        if (this.field1761 != null) {
            this.field1761[this.field1746] = string;
        }
        if (this.field1752 != -1) {
            this.field1748[this.field1746] = 0;
        } else {
            this.field1752 = this.field1746;
            this.field1748[this.field1746] = 126;
        }
        this.field1757[this.field1746] = 0;
        this.field1751[this.field1746] = n;
        this.field1749[this.field1746] = false;
        ++this.field1746;
        this.field1756 = null;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1089096698")
    void method3692(int n) {
        if (n >= 0 && n < this.field1746) {
            --this.field1746;
            this.field1756 = null;
            if (this.field1746 != 0) {
                System.arraycopy(this.field1748, n + 1, this.field1748, n, this.field1746 - n);
                System.arraycopy(this.field1757, n + 1, this.field1757, n, this.field1746 - n);
                System.arraycopy(this.field1751, n + 1, this.field1751, n, this.field1746 - n);
                System.arraycopy(this.field1749, n + 1, this.field1749, n, this.field1746 - n);
                if (this.field1743 != null) {
                    System.arraycopy(this.field1743, n + 1, this.field1743, n, this.field1746 - n);
                }
                if (this.field1761 != null) {
                    System.arraycopy(this.field1761, n + 1, this.field1761, n, this.field1746 - n);
                }
                this.method3754();
            } else {
                this.field1743 = null;
                this.field1761 = null;
                this.field1748 = null;
                this.field1757 = null;
                this.field1751 = null;
                this.field1749 = null;
                this.field1752 = -1;
                this.field1760 = -1;
            }
            return;
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="30")
    void method3754() {
        if (this.field1746 != 0) {
            this.field1752 = -1;
            this.field1760 = -1;
            int n = 0;
            byte by = this.field1748[0];
            int n2 = 1;
            while (true) {
                if (n2 >= this.field1746) {
                    this.field1752 = n;
                    if (this.field1752 != -1) {
                        this.field1748[this.field1752] = 126;
                    }
                    return;
                }
                if (this.field1748[n2] <= by) {
                    if (this.field1760 == -1 && this.field1748[n2] == 125) {
                        this.field1760 = n2;
                    }
                } else {
                    if (by == 125) {
                        this.field1760 = n;
                    }
                    n = n2;
                    by = this.field1748[n2];
                }
                ++n2;
            }
        }
        this.field1752 = -1;
        this.field1760 = -1;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(JLjava/lang/String;B)V", garbageValue="30")
    void method3693(long l, String string) {
        if (string != null && string.length() == 0) {
            string = null;
        }
        if (this.field1737 != l > 0L) {
            throw new RuntimeException("");
        }
        if (string != null != this.field1736) {
            throw new RuntimeException("");
        }
        if (l > 0L && (this.field1754 == null || this.field1755 >= this.field1754.length) || string != null && (this.field1758 == null || this.field1755 >= this.field1758.length)) {
            this.method3686(this.field1755 + 5);
        }
        if (this.field1754 != null) {
            this.field1754[this.field1755] = l;
        }
        if (this.field1758 != null) {
            this.field1758[this.field1755] = string;
        }
        ++this.field1755;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1842806052")
    void method3694(int n) {
        --this.field1755;
        if (this.field1755 != 0) {
            if (this.field1754 != null) {
                System.arraycopy(this.field1754, n + 1, this.field1754, n, this.field1755 - n);
            }
            if (this.field1758 != null) {
                System.arraycopy(this.field1758, n + 1, this.field1758, n, this.field1755 - n);
            }
        } else {
            this.field1754 = null;
            this.field1758 = null;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IBS)I", garbageValue="21359")
    int method3695(int n, byte by) {
        if (by != 126 && by != 127) {
            if (this.field1752 == n && (this.field1760 == -1 || this.field1748[this.field1760] < 125)) {
                return -1;
            }
            if (this.field1748[n] == by) {
                return -1;
            }
            this.field1748[n] = by;
            this.method3754();
            return n;
        }
        return -1;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-635673545")
    boolean method3718(int n) {
        if (this.field1752 != n && this.field1748[n] != 126) {
            this.field1748[this.field1752] = 125;
            this.field1760 = this.field1752;
            this.field1748[n] = 126;
            this.field1752 = n;
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(IZB)I", garbageValue="-36")
    int method3687(int n, boolean bl) {
        if (this.field1749[n] == bl) {
            return -1;
        }
        this.field1749[n] = bl;
        return n;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIIB)I", garbageValue="1")
    int method3697(int n, int n2, int n3, int n4) {
        int n5 = (1 << n3) - 1;
        int n6 = n4 == 31 ? -1 : (1 << n4 + 1) - 1;
        int n7 = n6 ^ n5;
        n2 <<= n3;
        int n8 = this.field1757[n];
        if ((n8 & n7) == (n2 &= n7)) {
            return -1;
        }
        this.field1757[n] = (n8 &= ~n7) | n2;
        return n;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="114")
    boolean method3717(int n, int n2) {
        class514 class5142;
        block6: {
            block5: {
                block4: {
                    if (this.field1747 != null) break block4;
                    this.field1747 = new class529(4);
                    break block5;
                }
                class5142 = this.field1747.method9967(n);
                if (class5142 == null) break block5;
                if (class5142 instanceof class513) break block6;
                class5142.method9623();
            }
            this.field1747.method9970(new class513(n2), n);
            return true;
        }
        class513 class5132 = (class513)class5142;
        if (n2 == class5132.field5172) {
            return false;
        }
        class5132.field5172 = n2;
        return true;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIIIB)Z", garbageValue="17")
    boolean method3731(int n, int n2, int n3, int n4) {
        class514 class5142;
        int n5;
        block6: {
            block5: {
                block4: {
                    int n6 = (1 << n3) - 1;
                    int n7 = n4 == 31 ? -1 : (1 << n4 + 1) - 1;
                    n5 = n7 ^ n6;
                    n2 <<= n3;
                    n2 &= n5;
                    if (this.field1747 != null) break block4;
                    this.field1747 = new class529(4);
                    break block5;
                }
                class5142 = this.field1747.method9967(n);
                if (class5142 == null) break block5;
                if (class5142 instanceof class513) break block6;
                class5142.method9623();
            }
            this.field1747.method9970(new class513(n2), n);
            return true;
        }
        class513 class5132 = (class513)class5142;
        if ((class5132.field5172 & n5) == n2) {
            return false;
        }
        class5132.field5172 &= ~n5;
        class5132.field5172 |= n2;
        return true;
    }

    @ObfuscatedName(value="av")
    boolean method3701(int n, long l) {
        class514 class5142;
        block6: {
            block5: {
                block4: {
                    if (this.field1747 != null) break block4;
                    this.field1747 = new class529(4);
                    break block5;
                }
                class5142 = this.field1747.method9967(n);
                if (class5142 == null) break block5;
                if (class5142 instanceof class512) break block6;
                class5142.method9623();
            }
            this.field1747.method9970(new class512(l), n);
            return true;
        }
        class512 class5122 = (class512)class5142;
        if (l == class5122.field5171) {
            return false;
        }
        class5122.field5171 = l;
        return true;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)Z", garbageValue="1950194387")
    boolean method3702(int n, String string) {
        class511 class5112;
        block10: {
            block8: {
                class514 class5142;
                block9: {
                    block7: {
                        if (string == null) {
                            string = "";
                        } else if (string.length() > 80) {
                            string = string.substring(0, 80);
                        }
                        if (this.field1747 != null) break block7;
                        this.field1747 = new class529(4);
                        break block8;
                    }
                    class5142 = this.field1747.method9967(n);
                    if (class5142 == null) break block8;
                    if (!(class5142 instanceof class511)) break block9;
                    class5112 = (class511)class5142;
                    if (class5112.field5170 instanceof String) break block10;
                }
                class5142.method9623();
            }
            this.field1747.method9970(new class511(string), n);
            return true;
        }
        if (string.equals(class5112.field5170)) {
            return false;
        }
        class5112.method9623();
        this.field1747.method9970(new class511(string), class5112.field5174);
        return true;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="551467554")
    void method3703(class556 class5562) {
        int n;
        int n2;
        block24: {
            n2 = class5562.method10282();
            if (n2 < 1) throw new RuntimeException("" + n2);
            if (n2 > 6) {
                throw new RuntimeException("" + n2);
            }
            int n3 = class5562.method10282();
            if ((n3 & 1) != 0) {
                this.field1737 = true;
            }
            if ((n3 & 2) != 0) {
                this.field1736 = true;
            }
            if (!this.field1737) {
                this.field1743 = null;
                this.field1754 = null;
            }
            if (!this.field1736) {
                this.field1761 = null;
                this.field1758 = null;
            }
            this.field1738 = class5562.method10440();
            this.field1740 = class5562.method10440();
            if (n2 <= 3 && this.field1740 != 0) {
                this.field1740 += 16912800;
            }
            this.field1746 = class5562.method10307();
            this.field1755 = class5562.method10282();
            this.field1739 = class5562.method10290();
            if (n2 >= 4) {
                class5562.method10440();
            }
            this.field1741 = class5562.method10282() == 1;
            this.field1742 = class5562.method10524();
            this.field1753 = class5562.method10524();
            this.field1744 = class5562.method10524();
            this.field1745 = class5562.method10524();
            boolean bl = true;
            while (true) {
                block28: {
                    block29: {
                        block26: {
                            block27: {
                                block25: {
                                    if (!bl || (bl = false)) break block25;
                                    if (this.field1746 <= 0) break block26;
                                    if (this.field1737 && (this.field1743 == null || this.field1743.length < this.field1746)) {
                                        this.field1743 = new long[this.field1746];
                                    }
                                    if (this.field1736 && (this.field1761 == null || this.field1761.length < this.field1746)) {
                                        this.field1761 = new String[this.field1746];
                                    }
                                    if (this.field1748 == null || this.field1748.length < this.field1746) {
                                        this.field1748 = new byte[this.field1746];
                                    }
                                    if (this.field1757 == null || this.field1757.length < this.field1746) {
                                        this.field1757 = new int[this.field1746];
                                    }
                                    if (this.field1751 == null || this.field1751.length < this.field1746) {
                                        this.field1751 = new int[this.field1746];
                                    }
                                    if (this.field1749 == null || this.field1749.length < this.field1746) {
                                        this.field1749 = new boolean[this.field1746];
                                    }
                                    n = 0;
                                }
                                if (n >= this.field1746) break block27;
                                if (!this.field1737) break block28;
                                break block29;
                            }
                            this.method3754();
                        }
                        if (this.field1755 <= 0) break block24;
                        if (this.field1737 && (this.field1754 == null || this.field1754.length < this.field1755)) {
                            this.field1754 = new long[this.field1755];
                        }
                        if (this.field1736 && (this.field1758 == null || this.field1758.length < this.field1755)) {
                            this.field1758 = new String[this.field1755];
                        }
                        break;
                    }
                    this.field1743[n] = class5562.method10273();
                }
                if (this.field1736) {
                    this.field1761[n] = class5562.method10360();
                }
                this.field1748[n] = class5562.method10524();
                if (n2 >= 2) {
                    this.field1757[n] = class5562.method10440();
                }
                this.field1751[n] = n2 >= 5 ? class5562.method10307() : 0;
                this.field1749[n] = n2 >= 6 ? class5562.method10282() == 1 : false;
                ++n;
            }
            n = 0;
            while (true) {
                if (n >= this.field1755) break;
                if (this.field1737) {
                    this.field1754[n] = class5562.method10273();
                }
                if (this.field1736) {
                    this.field1758[n] = class5562.method10360();
                }
                ++n;
            }
        }
        if (n2 < 3) return;
        n = class5562.method10307();
        if (n <= 0) return;
        this.field1747 = new class529(n < 16 ? class357.method7049(n) : 16);
        while (n-- > 0) {
            int n4 = class5562.method10440();
            int n5 = n4 & 0x3FFFFFFF;
            int n6 = n4 >>> 30;
            if (n6 == 0) {
                int n7 = class5562.method10440();
                this.field1747.method9970(new class513(n7), n5);
                continue;
            }
            if (n6 == 1) {
                long l = class5562.method10273();
                this.field1747.method9970(new class512(l), n5);
                continue;
            }
            if (n6 != 2) continue;
            String string = class5562.method10290();
            this.field1747.method9970(new class511(string), n5);
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1266692188")
    static int method3688(int n, int n2) {
        if (n == -2) {
            return 12345678;
        }
        if (n != -1) {
            if ((n2 = (n & 0x7F) * n2 / 128) < 2) {
                n2 = 2;
            } else if (n2 > 126) {
                n2 = 126;
            }
            return (n & 0xFF80) + n2;
        }
        if (n2 >= 0) {
            if (n2 > 127) {
                n2 = 127;
            }
        } else {
            n2 = 0;
        }
        n2 = 127 - n2;
        return n2;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-591640412")
    static int method3755(int n, class81 class812, boolean bl) {
        return 2;
    }
}

