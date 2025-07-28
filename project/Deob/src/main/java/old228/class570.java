package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vf")
public final class class570
extends class566 {
    @ObfuscatedName(value="ay")
    public int[] field5576;
    @ObfuscatedName(value="ah")
    public int field5570;
    @ObfuscatedName(value="az")
    public int field5571;
    @ObfuscatedName(value="ao")
    public int field5572;
    @ObfuscatedName(value="ad")
    int field5573;
    @ObfuscatedName(value="an")
    public int field5574;
    @ObfuscatedName(value="ae")
    public int field5575;

    public class570(int[] nArray, int n, int n2) {
        this.field5576 = nArray;
        this.field5570 = this.field5574 = n;
        this.field5571 = this.field5575 = n2;
        this.field5573 = 0;
        this.field5572 = 0;
    }

    public class570(int n, int n2) {
        this(new int[n2 * n], n, n2);
    }

    class570() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="()Lvf;")
    public class570 method10819() {
        class570 class5702 = new class570(this.field5570, this.field5571);
        class5702.field5574 = this.field5574;
        class5702.field5575 = this.field5575;
        class5702.field5572 = this.field5574 - this.field5570 - this.field5572;
        class5702.field5573 = this.field5573;
        int n = 0;
        while (n < this.field5571) {
            for (int i = 0; i < this.field5570; ++i) {
                class5702.field5576[i + n * this.field5570] = this.field5576[n * this.field5570 + this.field5570 - 1 - i];
            }
            ++n;
        }
        return class5702;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Lvf;")
    public class570 method10732() {
        class570 class5702 = new class570(this.field5570, this.field5571);
        class5702.field5574 = this.field5574;
        class5702.field5575 = this.field5575;
        class5702.field5572 = this.field5572;
        class5702.field5573 = this.field5573;
        for (int class5702.field5576[var3_3] : this.field5576) {
        }
        return class5702;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="()Lvf;")
    public class570 method10788() {
        class570 class5702 = new class570(this.field5574, this.field5575);
        int n = 0;
        while (n < this.field5571) {
            for (int i = 0; i < this.field5570; ++i) {
                class5702.field5576[i + (n + this.field5573) * this.field5574 + this.field5572] = this.field5576[i + n * this.field5570];
            }
            ++n;
        }
        return class5702;
    }

    @ObfuscatedName(value="ao")
    public void method10734() {
        class566.method10603(this.field5576, this.field5570, this.field5571, null);
    }

    @ObfuscatedName(value="ad")
    public void method10735() {
        if (this.field5570 == this.field5574 && this.field5571 == this.field5575) {
            return;
        }
        int[] nArray = new int[this.field5574 * this.field5575];
        int n = 0;
        while (true) {
            if (n >= this.field5571) {
                this.field5576 = nArray;
                this.field5570 = this.field5574;
                this.field5571 = this.field5575;
                this.field5572 = 0;
                this.field5573 = 0;
                return;
            }
            for (int i = 0; i < this.field5570; ++i) {
                nArray[i + (n + this.field5573) * this.field5574 + this.field5572] = this.field5576[i + n * this.field5570];
            }
            ++n;
        }
    }

    @ObfuscatedName(value="an")
    public void method10736(int n) {
        int n2;
        int n3;
        int n4;
        if (this.field5570 == this.field5574 && this.field5571 == this.field5575) {
            return;
        }
        int n5 = n;
        if (n5 > this.field5572) {
            n5 = this.field5572;
        }
        if ((n4 = n) + this.field5572 + this.field5570 > this.field5574) {
            n4 = this.field5574 - this.field5572 - this.field5570;
        }
        if ((n3 = n) > this.field5573) {
            n3 = this.field5573;
        }
        if ((n2 = n) + this.field5573 + this.field5571 > this.field5575) {
            n2 = this.field5575 - this.field5573 - this.field5571;
        }
        int n6 = n5 + n4 + this.field5570;
        int n7 = n3 + n2 + this.field5571;
        int[] nArray = new int[n6 * n7];
        int n8 = 0;
        while (true) {
            if (n8 >= this.field5571) {
                this.field5576 = nArray;
                this.field5570 = n6;
                this.field5571 = n7;
                this.field5572 -= n5;
                this.field5573 -= n3;
                return;
            }
            for (int i = 0; i < this.field5570; ++i) {
                nArray[n6 * (n8 + n3) + i + n5] = this.field5576[i + n8 * this.field5570];
            }
            ++n8;
        }
    }

    @ObfuscatedName(value="ae")
    public void method10780() {
        int[] nArray = new int[this.field5570 * this.field5571];
        int n = 0;
        int n2 = 0;
        while (true) {
            if (n2 >= this.field5571) {
                this.field5576 = nArray;
                this.field5572 = this.field5574 - this.field5570 - this.field5572;
                return;
            }
            for (int i = this.field5570 - 1; i >= 0; --i) {
                nArray[n++] = this.field5576[i + n2 * this.field5570];
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ax")
    public void method10738() {
        int[] nArray = new int[this.field5570 * this.field5571];
        int n = 0;
        int n2 = this.field5571 - 1;
        while (true) {
            if (n2 < 0) {
                this.field5576 = nArray;
                this.field5573 = this.field5575 - this.field5571 - this.field5573;
                return;
            }
            for (int i = 0; i < this.field5570; ++i) {
                nArray[n++] = this.field5576[i + n2 * this.field5570];
            }
            --n2;
        }
    }

    @ObfuscatedName(value="at")
    public void method10739(int n) {
        int[] nArray = new int[this.field5570 * this.field5571];
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= this.field5571) {
                this.field5576 = nArray;
                return;
            }
            for (int i = 0; i < this.field5570; ++i) {
                int n4 = this.field5576[n2];
                if (n4 == 0) {
                    if (i > 0 && this.field5576[n2 - 1] != 0) {
                        n4 = n;
                    } else if (n3 > 0 && this.field5576[n2 - this.field5570] != 0) {
                        n4 = n;
                    } else if (i < this.field5570 - 1 && this.field5576[n2 + 1] != 0) {
                        n4 = n;
                    } else if (n3 < this.field5571 - 1 && this.field5576[n2 + this.field5570] != 0) {
                        n4 = n;
                    }
                }
                nArray[n2++] = n4;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ac")
    public void method10740(int n) {
        int n2 = this.field5571 - 1;
        block0: while (n2 > 0) {
            int n3 = n2 * this.field5570;
            int n4 = this.field5570 - 1;
            while (true) {
                if (n4 <= 0) {
                    --n2;
                    continue block0;
                }
                if (this.field5576[n4 + n3] == 0 && this.field5576[n4 + n3 - 1 - this.field5570] != 0) {
                    this.field5576[n4 + n3] = n;
                }
                --n4;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="au")
    public void method10741(int n, int n2) {
        int n3;
        n = this.field5572 + n;
        int n4 = n + (n2 += this.field5573) * class566.field5542;
        int n5 = 0;
        int n6 = this.field5571;
        int n7 = this.field5570;
        int n8 = class566.field5542 - n7;
        int n9 = 0;
        if (n2 < class566.field5541) {
            n3 = class566.field5541 - n2;
            n6 -= n3;
            n2 = class566.field5541;
            n5 += n3 * n7;
            n4 += n3 * class566.field5542;
        }
        if (n6 + n2 > class566.field5547) {
            n6 -= n6 + n2 - class566.field5547;
        }
        if (n < class566.field5548) {
            n3 = class566.field5548 - n;
            n7 -= n3;
            n = class566.field5548;
            n5 += n3;
            n4 += n3;
            n9 += n3;
            n8 += n3;
        }
        if (n7 + n > class566.field5549) {
            n3 = n7 + n - class566.field5549;
            n7 -= n3;
            n9 += n3;
            n8 += n3;
        }
        if (n7 > 0 && n6 > 0) {
            class570.method10742(class566.field5546, this.field5576, n5, n4, n7, n6, n8, n9);
            return;
        }
    }

    @ObfuscatedName(value="aq")
    public void method10774(int n, int n2) {
        int n3;
        n = this.field5572 + n;
        int n4 = n + (n2 += this.field5573) * class566.field5542;
        int n5 = 0;
        int n6 = this.field5571;
        int n7 = this.field5570;
        int n8 = class566.field5542 - n7;
        int n9 = 0;
        if (n2 < class566.field5541) {
            n3 = class566.field5541 - n2;
            n6 -= n3;
            n2 = class566.field5541;
            n5 += n3 * n7;
            n4 += n3 * class566.field5542;
        }
        if (n6 + n2 > class566.field5547) {
            n6 -= n6 + n2 - class566.field5547;
        }
        if (n < class566.field5548) {
            n3 = class566.field5548 - n;
            n7 -= n3;
            n = class566.field5548;
            n5 += n3;
            n4 += n3;
            n9 += n3;
            n8 += n3;
        }
        if (n7 + n > class566.field5549) {
            n3 = n7 + n - class566.field5549;
            n7 -= n3;
            n9 += n3;
            n8 += n3;
        }
        if (n7 > 0 && n6 > 0) {
            class570.method10744(class566.field5546, this.field5576, 0, n5, n4, n7, n6, n8, n9);
            return;
        }
    }

    @ObfuscatedName(value="aa")
    public void method10802(int n, int n2, int n3, int n4) {
        if (n3 > 0 && n4 > 0) {
            int n5;
            int n6;
            int n7 = this.field5570;
            int n8 = this.field5571;
            int n9 = 0;
            int n10 = 0;
            int n11 = this.field5574;
            int n12 = this.field5575;
            int n13 = (n11 << 16) / n3;
            int n14 = (n12 << 16) / n4;
            if (this.field5572 > 0) {
                n6 = (n13 + (this.field5572 << 16) - 1) / n13;
                n = n6 + n;
                n9 += n6 * n13 - (this.field5572 << 16);
            }
            if (this.field5573 > 0) {
                n6 = (n14 + (this.field5573 << 16) - 1) / n14;
                n2 = n6 + n2;
                n10 += n6 * n14 - (this.field5573 << 16);
            }
            if (n7 < n11) {
                n3 = (n13 + ((n7 << 16) - n9) - 1) / n13;
            }
            if (n8 < n12) {
                n4 = (n14 + ((n8 << 16) - n10) - 1) / n14;
            }
            n6 = n + n2 * class566.field5542;
            int n15 = class566.field5542 - n3;
            if (n2 + n4 > class566.field5547) {
                n4 -= n2 + n4 - class566.field5547;
            }
            if (n2 < class566.field5541) {
                n5 = class566.field5541 - n2;
                n4 -= n5;
                n6 += n5 * class566.field5542;
                n10 += n14 * n5;
            }
            if (n3 + n > class566.field5549) {
                n5 = n3 + n - class566.field5549;
                n3 -= n5;
                n15 += n5;
            }
            if (n < class566.field5548) {
                n5 = class566.field5548 - n;
                n3 -= n5;
                n6 += n5;
                n9 += n13 * n5;
                n15 += n5;
            }
            class570.method10822(class566.field5546, this.field5576, 0, n9, n10, n6, n15, n3, n4, n13, n14, n7);
            return;
        }
    }

    @ObfuscatedName(value="al")
    public void method10747(int n, int n2, int n3, int n4) {
        if (n3 != 256) {
            int n5;
            n = this.field5572 + n;
            int n6 = n + (n2 += this.field5573) * class566.field5542;
            int n7 = 0;
            int n8 = this.field5571;
            int n9 = this.field5570;
            int n10 = class566.field5542 - n9;
            int n11 = 0;
            if (n2 < class566.field5541) {
                n5 = class566.field5541 - n2;
                n8 -= n5;
                n2 = class566.field5541;
                n7 += n5 * n9;
                n6 += n5 * class566.field5542;
            }
            if (n8 + n2 > class566.field5547) {
                n8 -= n8 + n2 - class566.field5547;
            }
            if (n < class566.field5548) {
                n5 = class566.field5548 - n;
                n9 -= n5;
                n = class566.field5548;
                n7 += n5;
                n6 += n5;
                n11 += n5;
                n10 += n5;
            }
            if (n9 + n > class566.field5549) {
                n5 = n9 + n - class566.field5549;
                n9 -= n5;
                n11 += n5;
                n10 += n5;
            }
            if (n9 > 0 && n8 > 0) {
                class570.method10748(class566.field5546, this.field5576, 0, n7, n6, n9, n8, n10, n11, n3, n4);
                return;
            }
            return;
        }
        this.method10774(n, n2);
    }

    @ObfuscatedName(value="ag")
    public void method10773(int n, int n2, int n3) {
        int n4;
        n = this.field5572 + n;
        int n5 = n + (n2 += this.field5573) * class566.field5542;
        int n6 = 0;
        int n7 = this.field5571;
        int n8 = this.field5570;
        int n9 = class566.field5542 - n8;
        int n10 = 0;
        if (n2 < class566.field5541) {
            n4 = class566.field5541 - n2;
            n7 -= n4;
            n2 = class566.field5541;
            n6 += n4 * n8;
            n5 += n4 * class566.field5542;
        }
        if (n7 + n2 > class566.field5547) {
            n7 -= n7 + n2 - class566.field5547;
        }
        if (n < class566.field5548) {
            n4 = class566.field5548 - n;
            n8 -= n4;
            n = class566.field5548;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 + n > class566.field5549) {
            n4 = n8 + n - class566.field5549;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            class570.method10821(class566.field5546, this.field5576, 0, n6, n5, n8, n7, n9, n10, n3);
            return;
        }
    }

    @ObfuscatedName(value="ai")
    public void method10751(int n, int n2, int n3, int n4, int n5) {
        if (n3 > 0 && n4 > 0) {
            int n6;
            int n7;
            int n8 = this.field5570;
            int n9 = this.field5571;
            int n10 = 0;
            int n11 = 0;
            int n12 = this.field5574;
            int n13 = this.field5575;
            int n14 = (n12 << 16) / n3;
            int n15 = (n13 << 16) / n4;
            if (this.field5572 > 0) {
                n7 = (n14 + (this.field5572 << 16) - 1) / n14;
                n = n7 + n;
                n10 += n7 * n14 - (this.field5572 << 16);
            }
            if (this.field5573 > 0) {
                n7 = (n15 + (this.field5573 << 16) - 1) / n15;
                n2 = n7 + n2;
                n11 += n7 * n15 - (this.field5573 << 16);
            }
            if (n8 < n12) {
                n3 = (n14 + ((n8 << 16) - n10) - 1) / n14;
            }
            if (n9 < n13) {
                n4 = (n15 + ((n9 << 16) - n11) - 1) / n15;
            }
            n7 = n + n2 * class566.field5542;
            int n16 = class566.field5542 - n3;
            if (n2 + n4 > class566.field5547) {
                n4 -= n2 + n4 - class566.field5547;
            }
            if (n2 < class566.field5541) {
                n6 = class566.field5541 - n2;
                n4 -= n6;
                n7 += n6 * class566.field5542;
                n11 += n15 * n6;
            }
            if (n3 + n > class566.field5549) {
                n6 = n3 + n - class566.field5549;
                n3 -= n6;
                n16 += n6;
            }
            if (n < class566.field5548) {
                n6 = class566.field5548 - n;
                n3 -= n6;
                n7 += n6;
                n10 += n14 * n6;
                n16 += n6;
            }
            class570.method10750(class566.field5546, this.field5576, 0, n10, n11, n7, n16, n3, n4, n14, n15, n8, n5);
            return;
        }
    }

    @ObfuscatedName(value="am")
    public void method10753(int n, int n2, int n3) {
        int n4;
        n = this.field5572 + n;
        int n5 = n + (n2 += this.field5573) * class566.field5542;
        int n6 = 0;
        int n7 = this.field5571;
        int n8 = this.field5570;
        int n9 = class566.field5542 - n8;
        int n10 = 0;
        if (n2 < class566.field5541) {
            n4 = class566.field5541 - n2;
            n7 -= n4;
            n2 = class566.field5541;
            n6 += n4 * n8;
            n5 += n4 * class566.field5542;
        }
        if (n7 + n2 > class566.field5547) {
            n7 -= n7 + n2 - class566.field5547;
        }
        if (n < class566.field5548) {
            n4 = class566.field5548 - n;
            n8 -= n4;
            n = class566.field5548;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 + n > class566.field5549) {
            n4 = n8 + n - class566.field5549;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            if (n3 == 256) {
                class570.method10730(0, 0, 0, class566.field5546, this.field5576, n6, 0, n5, 0, n8, n7, n9, n10);
            } else {
                class570.method10755(0, 0, 0, class566.field5546, this.field5576, n6, 0, n5, 0, n8, n7, n9, n10, n3);
            }
            return;
        }
    }

    @ObfuscatedName(value="aj")
    public void method10769(int n, int n2, int n3, int n4, int n5) {
        if (n3 > 0 && n4 > 0) {
            int n6;
            int n7;
            int n8 = this.field5570;
            int n9 = this.field5571;
            int n10 = 0;
            int n11 = 0;
            int n12 = this.field5574;
            int n13 = this.field5575;
            int n14 = (n12 << 16) / n3;
            int n15 = (n13 << 16) / n4;
            if (this.field5572 > 0) {
                n7 = (n14 + (this.field5572 << 16) - 1) / n14;
                n = n7 + n;
                n10 += n7 * n14 - (this.field5572 << 16);
            }
            if (this.field5573 > 0) {
                n7 = (n15 + (this.field5573 << 16) - 1) / n15;
                n2 = n7 + n2;
                n11 += n7 * n15 - (this.field5573 << 16);
            }
            if (n8 < n12) {
                n3 = (n14 + ((n8 << 16) - n10) - 1) / n14;
            }
            if (n9 < n13) {
                n4 = (n15 + ((n9 << 16) - n11) - 1) / n15;
            }
            n7 = n + n2 * class566.field5542;
            int n16 = class566.field5542 - n3;
            if (n2 + n4 > class566.field5547) {
                n4 -= n2 + n4 - class566.field5547;
            }
            if (n2 < class566.field5541) {
                n6 = class566.field5541 - n2;
                n4 -= n6;
                n7 += n6 * class566.field5542;
                n11 += n15 * n6;
            }
            if (n3 + n > class566.field5549) {
                n6 = n3 + n - class566.field5549;
                n3 -= n6;
                n16 += n6;
            }
            if (n < class566.field5548) {
                n6 = class566.field5548 - n;
                n3 -= n6;
                n7 += n6;
                n10 += n14 * n6;
                n16 += n6;
            }
            if (n5 == 256) {
                class570.method10757(0, 0, 0, n10, this.field5576, class566.field5546, 0, 0, -n4, n11, n7, n16, n3, n14, n15, n8);
            } else {
                class570.method10743(0, 0, 0, n10, this.field5576, class566.field5546, 0, 0, -n4, n11, n7, n16, n3, n14, n15, n8, n5);
            }
            return;
        }
    }

    @ObfuscatedName(value="bw")
    public void method10758(int n, int n2, int n3, int n4, int n5, int n6, int[] nArray, int[] nArray2) {
        int n7 = n2 < 0 ? -n2 : 0;
        int n8 = n2 + this.field5571 <= n6 ? this.field5571 : n6 - n2;
        int n9 = n < 0 ? -n : 0;
        int n10 = this.field5570 + n <= n5 ? this.field5570 : n5 - n;
        int n11 = n3 + n9 + (n7 + n2 + n4) * class566.field5542 + n;
        int n12 = n7 + n2;
        int n13 = n7;
        block0: while (n13 < n8) {
            int n14;
            int n15 = nArray[n12];
            int n16 = nArray2[n12++];
            int n17 = n11;
            if (n >= n15) {
                n14 = n9;
            } else {
                n14 = n15 - n;
                n17 += n14 - n9;
            }
            n10 = this.field5570 + n <= n15 + n16 ? this.field5570 : n15 + n16 - n;
            int n18 = n14;
            while (true) {
                if (n18 >= n10) {
                    n11 += class566.field5542;
                    ++n13;
                    continue block0;
                }
                int n19 = this.field5576[n18 + n13 * this.field5570];
                if (n19 != 0) {
                    class566.field5546[n17++] = n19;
                } else {
                    ++n17;
                }
                ++n18;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="bb")
    public void method10760(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int[] nArray, int[] nArray2) {
        try {
            int n9 = -n3 / 2;
            int n10 = -n4 / 2;
            int n11 = (int)(Math.sin((double)n7 / 326.11) * 65536.0);
            int n12 = (int)(Math.cos((double)n7 / 326.11) * 65536.0);
            n11 = n11 * n8 >> 8;
            n12 = n12 * n8 >> 8;
            int n13 = n10 * n11 + n9 * n12 + (n5 << 16);
            int n14 = n10 * n12 - n9 * n11 + (n6 << 16);
            int n15 = n + n2 * class566.field5542;
            for (n2 = 0; n2 < n4; ++n2) {
                int n16 = nArray[n2];
                int n17 = n15 + n16;
                int n18 = n13 + n12 * n16;
                int n19 = n14 - n11 * n16;
                for (n = -nArray2[n2]; n < 0; ++n) {
                    class566.field5546[n17++] = this.field5576[this.field5570 * (n19 >> 16) + (n18 >> 16)];
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += class566.field5542;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="bx")
    public void method10761(int n, int n2, int n3, int n4, int n5, int n6, double d, int n7) {
        try {
            int n8 = -n3 / 2;
            int n9 = -n4 / 2;
            int n10 = (int)(Math.sin(d) * 65536.0);
            int n11 = (int)(Math.cos(d) * 65536.0);
            n10 = n10 * n7 >> 8;
            n11 = n11 * n7 >> 8;
            int n12 = n9 * n10 + n8 * n11 + (n5 << 16);
            int n13 = n9 * n11 - n8 * n10 + (n6 << 16);
            int n14 = n + n2 * class566.field5542;
            for (n2 = 0; n2 < n4; ++n2) {
                int n15 = n14;
                int n16 = n12;
                int n17 = n13;
                for (n = -n3; n < 0; ++n) {
                    int n18 = this.field5576[this.field5570 * (n17 >> 16) + (n16 >> 16)];
                    if (n18 != 0) {
                        class566.field5546[n15++] = n18;
                    } else {
                        ++n15;
                    }
                    n16 += n11;
                    n17 -= n10;
                }
                n12 += n10;
                n13 += n11;
                n14 += class566.field5542;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="bd")
    public void method10770(int n, int n2, int n3, int n4) {
        this.method10763(this.field5574 << 3, this.field5575 << 3, n << 4, n2 << 4, n3, n4);
    }

    @ObfuscatedName(value="bi")
    void method10763(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        int n9;
        int n10;
        if (n6 == 0) {
            return;
        }
        double d = (double)(n5 & 0xFFFF) * 9.587379924285257E-5;
        int n11 = (int)Math.floor(Math.sin(d) * (double)n6 + 0.5);
        int n12 = (int)Math.floor(Math.cos(d) * (double)n6 + 0.5);
        int n13 = n12 * -(n -= this.field5572 << 4) + -(n2 -= this.field5573 << 4) * n11;
        int n14 = -n2 * n12 + n11 * -(-n);
        int n15 = n12 * ((this.field5570 << 4) - n) + -n2 * n11;
        int n16 = n11 * -((this.field5570 << 4) - n) + -n2 * n12;
        int n17 = ((this.field5571 << 4) - n2) * n11 + n12 * -n;
        int n18 = ((this.field5571 << 4) - n2) * n12 + n11 * -(-n);
        int n19 = ((this.field5571 << 4) - n2) * n11 + n12 * ((this.field5570 << 4) - n);
        int n20 = ((this.field5571 << 4) - n2) * n12 + n11 * -((this.field5570 << 4) - n);
        if (n13 >= n15) {
            n10 = n15;
            n9 = n13;
        } else {
            n10 = n13;
            n9 = n15;
        }
        if (n17 < n10) {
            n10 = n17;
        }
        if (n19 < n10) {
            n10 = n19;
        }
        if (n17 > n9) {
            n9 = n17;
        }
        if (n19 > n9) {
            n9 = n19;
        }
        if (n14 >= n16) {
            n8 = n16;
            n7 = n14;
        } else {
            n8 = n14;
            n7 = n16;
        }
        if (n18 < n8) {
            n8 = n18;
        }
        if (n20 < n8) {
            n8 = n20;
        }
        if (n18 > n7) {
            n7 = n18;
        }
        if (n20 > n7) {
            n7 = n20;
        }
        n10 >>= 12;
        n9 = n9 + 4095 >> 12;
        n8 >>= 12;
        n7 = n7 + 4095 >> 12;
        n10 = n3 + n10;
        n9 = n3 + n9;
        n8 += n4;
        n7 += n4;
        n9 = n9 + 15 >> 4;
        n8 >>= 4;
        n7 = n7 + 15 >> 4;
        if ((n10 >>= 4) < class566.field5548) {
            n10 = class566.field5548;
        }
        if (n9 > class566.field5549) {
            n9 = class566.field5549;
        }
        if (n8 < class566.field5541) {
            n8 = class566.field5541;
        }
        if (n7 > class566.field5547) {
            n7 = class566.field5547;
        }
        if ((n9 = n10 - n9) >= 0) {
            return;
        }
        if ((n7 = n8 - n7) >= 0) {
            return;
        }
        int n21 = n10 + n8 * class566.field5542;
        double d2 = 1.6777216E7 / (double)n6;
        int n22 = (int)Math.floor(Math.sin(d) * d2 + 0.5);
        int n23 = (int)Math.floor(Math.cos(d) * d2 + 0.5);
        int n24 = (n10 << 4) + 8 - n3;
        int n25 = (n8 << 4) + 8 - n4;
        int n26 = (n << 8) - (n25 * n22 >> 4);
        int n27 = (n25 * n23 >> 4) + (n2 << 8);
        if (n23 != 0) {
            if (n23 >= 0) {
                if (n22 != 0) {
                    if (n22 >= 0) {
                        int n28 = n7;
                        while (n28 < 0) {
                            int n29;
                            int n30 = n21;
                            int n31 = (n24 * n23 >> 4) + n26;
                            int n32 = (n24 * n22 >> 4) + n27;
                            int n33 = n9;
                            if (n31 < 0) {
                                n29 = (n23 - 1 - n31) / n23;
                                n33 += n29;
                                n31 += n23 * n29;
                                n32 += n22 * n29;
                                n30 += n29;
                            }
                            if ((n29 = (n31 + 1 - (this.field5570 << 12) - n23) / n23) > n33) {
                                n33 = n29;
                            }
                            if (n32 < 0) {
                                n29 = (n22 - 1 - n32) / n22;
                                n33 += n29;
                                n31 += n23 * n29;
                                n32 += n22 * n29;
                                n30 += n29;
                            }
                            if ((n29 = (n32 + 1 - (this.field5571 << 12) - n22) / n22) > n33) {
                                n33 = n29;
                            }
                            while (n33 < 0) {
                                int n34 = this.field5576[(n31 >> 12) + (n32 >> 12) * this.field5570];
                                if (n34 != 0) {
                                    class566.field5546[n30++] = n34;
                                } else {
                                    ++n30;
                                }
                                n31 += n23;
                                n32 += n22;
                                ++n33;
                            }
                            ++n28;
                            n26 -= n22;
                            n27 += n23;
                            n21 += class566.field5542;
                        }
                    } else {
                        int n35 = n7;
                        while (n35 < 0) {
                            int n36;
                            int n37 = n21;
                            int n38 = (n24 * n23 >> 4) + n26;
                            int n39 = (n24 * n22 >> 4) + n27;
                            int n40 = n9;
                            if (n38 < 0) {
                                n36 = (n23 - 1 - n38) / n23;
                                n40 += n36;
                                n38 += n23 * n36;
                                n39 += n22 * n36;
                                n37 += n36;
                            }
                            if ((n36 = (n38 + 1 - (this.field5570 << 12) - n23) / n23) > n40) {
                                n40 = n36;
                            }
                            if ((n36 = n39 - (this.field5571 << 12)) >= 0) {
                                n36 = (n22 - n36) / n22;
                                n40 += n36;
                                n38 += n23 * n36;
                                n39 += n22 * n36;
                                n37 += n36;
                            }
                            if ((n36 = (n39 - n22) / n22) > n40) {
                                n40 = n36;
                            }
                            while (n40 < 0) {
                                int n41 = this.field5576[(n38 >> 12) + (n39 >> 12) * this.field5570];
                                if (n41 != 0) {
                                    class566.field5546[n37++] = n41;
                                } else {
                                    ++n37;
                                }
                                n38 += n23;
                                n39 += n22;
                                ++n40;
                            }
                            ++n35;
                            n26 -= n22;
                            n27 += n23;
                            n21 += class566.field5542;
                        }
                    }
                } else {
                    int n42 = n7;
                    while (n42 < 0) {
                        int n43 = n21;
                        int n44 = (n24 * n23 >> 4) + n26;
                        int n45 = n27;
                        int n46 = n9;
                        if (n45 >= 0 && n45 - (this.field5571 << 12) < 0) {
                            int n47;
                            if (n44 < 0) {
                                n47 = (n23 - 1 - n44) / n23;
                                n46 += n47;
                                n44 += n23 * n47;
                                n43 += n47;
                            }
                            if ((n47 = (n44 + 1 - (this.field5570 << 12) - n23) / n23) > n46) {
                                n46 = n47;
                            }
                            while (n46 < 0) {
                                int n48 = this.field5576[(n44 >> 12) + (n45 >> 12) * this.field5570];
                                if (n48 != 0) {
                                    class566.field5546[n43++] = n48;
                                } else {
                                    ++n43;
                                }
                                n44 += n23;
                                ++n46;
                            }
                        }
                        ++n42;
                        n27 += n23;
                        n21 += class566.field5542;
                    }
                }
            } else if (n22 != 0) {
                if (n22 >= 0) {
                    int n49 = n7;
                    block6: while (n49 < 0) {
                        int n50 = n21;
                        int n51 = (n24 * n23 >> 4) + n26;
                        int n52 = (n24 * n22 >> 4) + n27;
                        int n53 = n9;
                        int n54 = n51 - (this.field5570 << 12);
                        if (n54 >= 0) {
                            n54 = (n23 - n54) / n23;
                            n53 += n54;
                            n51 += n23 * n54;
                            n52 += n22 * n54;
                            n50 += n54;
                        }
                        if ((n54 = (n51 - n23) / n23) > n53) {
                            n53 = n54;
                        }
                        if (n52 < 0) {
                            n54 = (n22 - 1 - n52) / n22;
                            n53 += n54;
                            n51 += n23 * n54;
                            n52 += n22 * n54;
                            n50 += n54;
                        }
                        if ((n54 = (n52 + 1 - (this.field5571 << 12) - n22) / n22) > n53) {
                            n53 = n54;
                        }
                        while (true) {
                            if (n53 >= 0) {
                                ++n49;
                                n26 -= n22;
                                n27 += n23;
                                n21 += class566.field5542;
                                continue block6;
                            }
                            int n55 = this.field5576[(n51 >> 12) + (n52 >> 12) * this.field5570];
                            if (n55 != 0) {
                                class566.field5546[n50++] = n55;
                            } else {
                                ++n50;
                            }
                            n51 += n23;
                            n52 += n22;
                            ++n53;
                        }
                    }
                } else {
                    int n56 = n7;
                    while (n56 < 0) {
                        int n57 = n21;
                        int n58 = (n24 * n23 >> 4) + n26;
                        int n59 = (n24 * n22 >> 4) + n27;
                        int n60 = n9;
                        int n61 = n58 - (this.field5570 << 12);
                        if (n61 >= 0) {
                            n61 = (n23 - n61) / n23;
                            n60 += n61;
                            n58 += n23 * n61;
                            n59 += n22 * n61;
                            n57 += n61;
                        }
                        if ((n61 = (n58 - n23) / n23) > n60) {
                            n60 = n61;
                        }
                        if ((n61 = n59 - (this.field5571 << 12)) >= 0) {
                            n61 = (n22 - n61) / n22;
                            n60 += n61;
                            n58 += n23 * n61;
                            n59 += n22 * n61;
                            n57 += n61;
                        }
                        if ((n61 = (n59 - n22) / n22) > n60) {
                            n60 = n61;
                        }
                        while (n60 < 0) {
                            int n62 = this.field5576[(n58 >> 12) + (n59 >> 12) * this.field5570];
                            if (n62 != 0) {
                                class566.field5546[n57++] = n62;
                            } else {
                                ++n57;
                            }
                            n58 += n23;
                            n59 += n22;
                            ++n60;
                        }
                        ++n56;
                        n26 -= n22;
                        n27 += n23;
                        n21 += class566.field5542;
                    }
                }
            } else {
                int n63 = n7;
                while (n63 < 0) {
                    int n64 = n21;
                    int n65 = (n24 * n23 >> 4) + n26;
                    int n66 = n27;
                    int n67 = n9;
                    if (n66 >= 0 && n66 - (this.field5571 << 12) < 0) {
                        int n68 = n65 - (this.field5570 << 12);
                        if (n68 >= 0) {
                            n68 = (n23 - n68) / n23;
                            n67 += n68;
                            n65 += n23 * n68;
                            n64 += n68;
                        }
                        if ((n68 = (n65 - n23) / n23) > n67) {
                            n67 = n68;
                        }
                        while (n67 < 0) {
                            int n69 = this.field5576[(n65 >> 12) + (n66 >> 12) * this.field5570];
                            if (n69 != 0) {
                                class566.field5546[n64++] = n69;
                            } else {
                                ++n64;
                            }
                            n65 += n23;
                            ++n67;
                        }
                    }
                    ++n63;
                    n27 += n23;
                    n21 += class566.field5542;
                }
            }
        } else if (n22 != 0) {
            if (n22 >= 0) {
                int n70 = n7;
                while (n70 < 0) {
                    int n71 = n21;
                    int n72 = n26;
                    int n73 = (n24 * n22 >> 4) + n27;
                    int n74 = n9;
                    if (n72 >= 0 && n72 - (this.field5570 << 12) < 0) {
                        int n75;
                        if (n73 < 0) {
                            n75 = (n22 - 1 - n73) / n22;
                            n74 += n75;
                            n73 += n22 * n75;
                            n71 += n75;
                        }
                        if ((n75 = (n73 + 1 - (this.field5571 << 12) - n22) / n22) > n74) {
                            n74 = n75;
                        }
                        while (n74 < 0) {
                            int n76 = this.field5576[(n72 >> 12) + (n73 >> 12) * this.field5570];
                            if (n76 != 0) {
                                class566.field5546[n71++] = n76;
                            } else {
                                ++n71;
                            }
                            n73 += n22;
                            ++n74;
                        }
                    }
                    ++n70;
                    n26 -= n22;
                    n21 += class566.field5542;
                }
            } else {
                int n77 = n7;
                while (n77 < 0) {
                    int n78 = n21;
                    int n79 = n26;
                    int n80 = (n24 * n22 >> 4) + n27;
                    int n81 = n9;
                    if (n79 >= 0 && n79 - (this.field5570 << 12) < 0) {
                        int n82 = n80 - (this.field5571 << 12);
                        if (n82 >= 0) {
                            n82 = (n22 - n82) / n22;
                            n81 += n82;
                            n80 += n22 * n82;
                            n78 += n82;
                        }
                        if ((n82 = (n80 - n22) / n22) > n81) {
                            n81 = n82;
                        }
                        while (n81 < 0) {
                            int n83 = this.field5576[(n79 >> 12) + (n80 >> 12) * this.field5570];
                            if (n83 != 0) {
                                class566.field5546[n78++] = n83;
                            } else {
                                ++n78;
                            }
                            n80 += n22;
                            ++n81;
                        }
                    }
                    ++n77;
                    n26 -= n22;
                    n21 += class566.field5542;
                }
            }
        } else {
            int n84 = n7;
            while (n84 < 0) {
                int n85 = n21;
                int n86 = n26;
                int n87 = n27;
                if (n86 >= 0 && n87 >= 0 && n86 - (this.field5570 << 12) < 0 && n87 - (this.field5571 << 12) < 0) {
                    for (int i = n9; i < 0; ++i) {
                        int n88 = this.field5576[(n86 >> 12) + (n87 >> 12) * this.field5570];
                        if (n88 != 0) {
                            class566.field5546[n85++] = n88;
                            continue;
                        }
                        ++n85;
                    }
                }
                ++n84;
                n21 += class566.field5542;
            }
        }
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="bz")
    public void method10764(int var1_1, int var2_2, int var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 2[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @ObfuscatedName(value="as")
    static void method10742(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = -n4;
        block0: while (n7 < 0) {
            int n8 = n2 + n3 - 3;
            while (true) {
                if (n2 >= n8) {
                    n8 += 3;
                    while (true) {
                        if (n2 >= n8) {
                            n2 += n5;
                            n += n6;
                            ++n7;
                            continue block0;
                        }
                        nArray[n2++] = nArray2[n++];
                    }
                }
                nArray[n2++] = nArray2[n++];
                nArray[n2++] = nArray2[n++];
                nArray[n2++] = nArray2[n++];
                nArray[n2++] = nArray2[n++];
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="af")
    static void method10744(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = -(n4 >> 2);
        n4 = -(n4 & 3);
        int n9 = -n5;
        block0: while (n9 < 0) {
            int n10 = n8;
            while (true) {
                if (n10 >= 0) {
                    n10 = n4;
                    while (true) {
                        if (n10 >= 0) {
                            n3 += n6;
                            n2 += n7;
                            ++n9;
                            continue block0;
                        }
                        n = nArray2[n2++];
                        if (n != 0) {
                            nArray[n3++] = n;
                        } else {
                            ++n3;
                        }
                        ++n10;
                    }
                }
                n = nArray2[n2++];
                if (n != 0) {
                    nArray[n3++] = n;
                } else {
                    ++n3;
                }
                n = nArray2[n2++];
                if (n != 0) {
                    nArray[n3++] = n;
                } else {
                    ++n3;
                }
                n = nArray2[n2++];
                if (n != 0) {
                    nArray[n3++] = n;
                } else {
                    ++n3;
                }
                n = nArray2[n2++];
                if (n != 0) {
                    nArray[n3++] = n;
                } else {
                    ++n3;
                }
                ++n10;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ak")
    static void method10822(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11 = n2;
        int n12 = -n7;
        block0: while (n12 < 0) {
            int n13 = n10 * (n3 >> 16);
            int n14 = -n6;
            while (true) {
                if (n14 >= 0) {
                    n3 = n9 + n3;
                    n2 = n11;
                    n4 += n5;
                    ++n12;
                    continue block0;
                }
                n = nArray2[(n2 >> 16) + n13];
                if (n != 0) {
                    nArray[n4++] = n;
                } else {
                    ++n4;
                }
                n2 += n8;
                ++n14;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="av")
    static void method10748(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = 256 - n8;
        int n11 = (n9 & 0xFF00FF) * n10 & 0xFF00FF00;
        int n12 = (n9 & 0xFF00) * n10 & 0xFF0000;
        n9 = (n11 | n12) >>> 8;
        int n13 = -n5;
        block0: while (n13 < 0) {
            int n14 = -n4;
            while (true) {
                if (n14 >= 0) {
                    n3 += n6;
                    n2 += n7;
                    ++n13;
                    continue block0;
                }
                n = nArray2[n2++];
                if (n == 0) {
                    ++n3;
                } else {
                    n11 = n8 * (n & 0xFF00FF) & 0xFF00FF00;
                    n12 = (n & 0xFF00) * n8 & 0xFF0000;
                    nArray[n3++] = n9 + ((n11 | n12) >>> 8);
                }
                ++n14;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="aw")
    static void method10821(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = 256 - n8;
        int n10 = -n5;
        block0: while (n10 < 0) {
            int n11 = -n4;
            while (true) {
                if (n11 >= 0) {
                    n3 += n6;
                    n2 += n7;
                    ++n10;
                    continue block0;
                }
                n = nArray2[n2++];
                if (n == 0) {
                    ++n3;
                } else {
                    int n12 = nArray[n3];
                    nArray[n3++] = ((n12 & 0xFF00FF) * n9 + n8 * (n & 0xFF00FF) & 0xFF00FF00) + ((n & 0xFF00) * n8 + n9 * (n12 & 0xFF00) & 0xFF0000) >> 8;
                }
                ++n11;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ar")
    static void method10750(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        int n12 = 256 - n11;
        int n13 = n2;
        int n14 = -n7;
        block0: while (n14 < 0) {
            int n15 = n10 * (n3 >> 16);
            int n16 = -n6;
            while (true) {
                if (n16 >= 0) {
                    n3 = n9 + n3;
                    n2 = n13;
                    n4 += n5;
                    ++n14;
                    continue block0;
                }
                n = nArray2[(n2 >> 16) + n15];
                if (n == 0) {
                    ++n4;
                } else {
                    int n17 = nArray[n4];
                    nArray[n4++] = ((n & 0xFF00) * n11 + n12 * (n17 & 0xFF00) & 0xFF0000) + ((n17 & 0xFF00FF) * n12 + n11 * (n & 0xFF00FF) & 0xFF00FF00) >> 8;
                }
                n2 += n8;
                ++n16;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ap")
    static void method10730(int n, int n2, int n3, int[] nArray, int[] nArray2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        n7 = -n9;
        block0: while (n7 < 0) {
            n5 = -n8;
            while (true) {
                if (n5 >= 0) {
                    n6 = n10 + n6;
                    n4 += n11;
                    ++n7;
                    continue block0;
                }
                n = nArray2[n4++];
                if (n == 0) {
                    ++n6;
                } else {
                    n2 = nArray[n6];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    nArray[n6++] = n3 - n2 | n2 - (n2 >>> 8);
                }
                ++n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ab")
    static void method10755(int n, int n2, int n3, int[] nArray, int[] nArray2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        n7 = -n9;
        block0: while (n7 < 0) {
            n5 = -n8;
            while (true) {
                if (n5 >= 0) {
                    n6 = n10 + n6;
                    n4 += n11;
                    ++n7;
                    continue block0;
                }
                n = nArray2[n4++];
                if (n == 0) {
                    ++n6;
                } else {
                    n2 = n12 * (n & 0xFF00FF);
                    n = (n2 & 0xFF00FF00) + (n12 * n - n2 & 0xFF0000) >>> 8;
                    n2 = nArray[n6];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    nArray[n6++] = n3 - n2 | n2 - (n2 >>> 8);
                }
                ++n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="bu")
    static void method10757(int n, int n2, int n3, int n4, int[] nArray, int[] nArray2, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        int n15 = n4;
        block0: while (n7 < 0) {
            n6 = n14 * (n8 >> 16);
            n5 = -n11;
            while (true) {
                if (n5 >= 0) {
                    n8 += n13;
                    n4 = n15;
                    n9 = n10 + n9;
                    ++n7;
                    continue block0;
                }
                n = nArray[(n4 >> 16) + n6];
                if (n == 0) {
                    ++n9;
                } else {
                    n2 = nArray2[n9];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    nArray2[n9++] = n3 - n2 | n2 - (n2 >>> 8);
                }
                n4 += n12;
                ++n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="bh")
    static void method10743(int n, int n2, int n3, int n4, int[] nArray, int[] nArray2, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        int n16 = n4;
        block0: while (n7 < 0) {
            n6 = n14 * (n8 >> 16);
            n5 = -n11;
            while (true) {
                if (n5 >= 0) {
                    n8 += n13;
                    n4 = n16;
                    n9 = n10 + n9;
                    ++n7;
                    continue block0;
                }
                n = nArray[(n4 >> 16) + n6];
                if (n == 0) {
                    ++n9;
                } else {
                    n2 = (n & 0xFF00FF) * n15;
                    n = (n2 & 0xFF00FF00) + (n * n15 - n2 & 0xFF0000) >>> 8;
                    n2 = nArray2[n9];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    nArray2[n9++] = n3 - n2 | n2 - (n2 >>> 8);
                }
                n4 += n12;
                ++n5;
            }
            break;
        }
        return;
    }
}

