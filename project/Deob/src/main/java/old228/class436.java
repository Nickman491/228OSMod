package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qi")
public class class436 {
    @ObfuscatedName(value="do")
    static boolean field4815;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-578814809)
    int field4804 = Integer.MAX_VALUE;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-753724057)
    int field4805 = Integer.MAX_VALUE;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=265104411)
    int field4808 = 0;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=1208307643)
    int field4800 = 0;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=553178799)
    int field4807 = 0;
    @ObfuscatedName(value="ai")
    boolean field4798 = true;
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Lqc;")
    class439 field4801;
    @ObfuscatedName(value="am")
    ArrayList field4811 = new ArrayList();
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=1024239379)
    int field4812 = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1973607425)
    int field4813 = 0;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Lqo;", garbageValue="17")
    public class438 method8528(int n) {
        return (class438)this.field4811.get(n);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)Lqo;", garbageValue="81")
    class438 method8529() {
        if (this.field4811.size() == 0) {
            return null;
        }
        return (class438)this.field4811.get(this.field4811.size() - 1);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="75")
    public boolean method8579() {
        return this.field4811.size() == 0;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-710679131")
    boolean method8531() {
        return this.field4805 > 1;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1601671820")
    public int method8532() {
        return this.field4811.size();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1887284918")
    public String method8533() {
        if (this.method8579()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(this.method8532());
        int n = 0;
        while (n < this.method8532()) {
            class438 class4382 = this.method8528(n);
            stringBuilder.append(class4382.field4824);
            ++n;
        }
        return stringBuilder.toString();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1824847702")
    public void method8534(int n) {
        if (this.field4801 != null && n < this.field4801.field4832 * 2) {
            n = Integer.MAX_VALUE;
        }
        if (this.field4804 != n) {
            this.field4804 = n;
            this.method8584();
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="649876821")
    public void method8662(int n) {
        if (this.field4805 != n) {
            this.field4805 = n;
            this.method8584();
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="112")
    public void method8581(int n) {
        if (this.field4813 != n) {
            this.field4813 = n;
            this.method8584();
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lqc;I)V", garbageValue="1479030546")
    public void method8663(class439 class4392) {
        if (class4392 != this.field4801) {
            this.field4801 = class4392;
            if (this.field4801 != null) {
                if (this.field4807 == 0) {
                    this.field4807 = this.field4801.field4832;
                }
                if (!this.method8579()) {
                    this.method8584();
                }
            }
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-282735397")
    public void method8602(int n) {
        if (this.field4812 != n) {
            this.field4812 = n;
            this.method8584();
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-842892656")
    public boolean method8539(int n, int n2) {
        if (this.field4808 != n || n2 != this.field4800) {
            this.field4808 = n;
            this.field4800 = n2;
            this.method8584();
        }
        return true;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="2029561408")
    public void method8540(int n) {
        if (this.field4807 != n) {
            this.field4807 = n;
            this.method8584();
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(III)Lqk;", garbageValue="-1123277917")
    public class440 method8629(int n, int n2) {
        if (n2 == n) {
            return new class440(this, 0, 0);
        }
        if (n <= this.field4811.size() && n2 <= this.field4811.size()) {
            if (n2 < n) {
                return new class440(this, n2, n);
            }
            return new class440(this, n, n2);
        }
        return new class440(this, 0, 0);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(CIIB)Lqy;", garbageValue="6")
    public class437 method8543(char c, int n, int n2) {
        return this.method8601(Character.toString(c), n, n2);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;III)Lqy;", garbageValue="688799447")
    public class437 method8601(String string, int n, int n2) {
        if (n2 == 0) {
            n2 = Integer.MAX_VALUE;
        }
        int n3 = n;
        if (this.field4811.size() < n2) {
            this.field4811.ensureCapacity(this.field4811.size() + string.length());
            for (int i = 0; i < string.length() && this.field4811.size() < n2; ++i) {
                class438 class4382 = new class438();
                class4382.field4824 = string.charAt(i);
                this.field4811.add(n3, class4382);
                ++n3;
            }
            this.method8562(n, n3);
            if (this.field4805 != 0 && this.method8530() > this.field4805) {
                while (n3 != n) {
                    this.method8547(--n3);
                    if (this.method8530() > this.field4805) continue;
                }
                return new class437(n3, true);
            }
            return new class437(n3, false);
        }
        this.method8562(n, n3);
        return new class437(n3, true);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)Lqy;", garbageValue="1179216185")
    class437 method8590(String string, int n) {
        return this.method8601(string, this.field4811.size(), n);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Lqy;", garbageValue="-1801082095")
    public class437 method8545(String string) {
        this.method8546();
        return this.method8590(string, 0);
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-272166622")
    void method8546() {
        this.field4811.clear();
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1441021426")
    public int method8547(int n) {
        return this.method8548(n, n + 1);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1298716202")
    public int method8548(int n, int n2) {
        int n3;
        if (n2 < n) {
            n3 = n2;
            n2 = n;
            n = n3;
        }
        this.field4811.subList(n, n2).clear();
        n3 = n;
        if (this.method8531() && this.field4812 == 1) {
            char c;
            while (n3 > 0 && (c = ((class438)this.field4811.get((int)(--n3))).field4824) != ' ' && c != '\t') {
            }
        }
        this.method8562(n3, n2);
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1371865968")
    public int method8549(int n, int n2) {
        if (this.field4801 == null) {
            return 0;
        }
        if (this.method8531() && n > this.field4804) {
            return this.field4811.size();
        }
        if (this.field4811.isEmpty()) return this.field4811.size();
        int n3 = 0;
        while (true) {
            block10: {
                class438 class4382;
                block11: {
                    block9: {
                        if (n3 >= this.field4811.size()) break block9;
                        class4382 = (class438)this.field4811.get(n3);
                        if (n2 > class4382.field4822 + this.method8552()) break block10;
                        if (n2 >= class4382.field4822) break block11;
                    }
                    class438 class4383 = (class438)this.field4811.get(this.field4811.size() - 1);
                    if (n < class4383.field4821) return this.field4811.size();
                    if (n > class4383.field4821 + this.method8554()) return this.field4811.size();
                    if (n2 < class4383.field4822) return this.field4811.size();
                    if (n2 > class4383.field4822 + this.method8552()) return this.field4811.size();
                    return this.field4811.size() - 1;
                }
                if (n < class4382.field4821) {
                    if (n3 <= 0) return 0;
                    int n4 = n3 - 1;
                    return n4;
                }
                if (n3 + 1 != this.field4811.size() && ((class438)this.field4811.get((int)(n3 + 1))).field4822 != class4382.field4822) {
                    int n5 = this.method8576((class438)this.field4811.get(n3), false);
                    if (n < n5 + class4382.field4821) return n3;
                    if (n2 <= class4382.field4822 + this.method8552()) {
                        return n3 + 1;
                    }
                }
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="2147290376")
    public int method8603(int n, int n2) {
        if (this.field4801 != null && !this.method8579() && n <= this.field4811.size()) {
            int n3;
            if (n2 <= 0) {
                n3 = -1;
                n2 = -n2;
            } else {
                n3 = 1;
            }
            int n4 = 0;
            int n5 = 0;
            if (n <= 0) {
                if (n3 == -1 && n == 0) {
                    return 0;
                }
            } else {
                class438 class4382 = (class438)this.field4811.get(n - 1);
                n4 = class4382.field4821 + this.method8563(n - 1);
                n5 = class4382.field4822;
            }
            int n6 = 0xFFFFFF;
            int n7 = 0;
            int n8 = n;
            int n9 = 0xFFFFFF;
            int n10 = n3 == 1 ? this.field4811.size() + 1 : 0;
            int n11 = n3 + n;
            while (true) {
                if (n11 == n10) {
                    if (n3 != 1) {
                        if (n5 != 0) {
                            ++n7;
                        }
                        if (n9 != 0xFFFFFF && (n7 != n2 || n4 >= n9)) {
                            return n8;
                        }
                        return 0;
                    }
                    return this.field4811.size();
                }
                class438 class4383 = (class438)this.field4811.get(n11 - 1);
                if (n5 != class4383.field4822) {
                    n5 = class4383.field4822;
                    if (++n7 > n2) break;
                }
                if (n7 == n2) {
                    int n12 = Math.abs(class4383.field4821 + this.method8563(n11 - 1) - n4);
                    if (n12 >= n9) {
                        return n8;
                    }
                    n8 = n11;
                    n9 = n12;
                }
                n11 += n3;
            }
            return n8;
        }
        return 0;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="724823986")
    public int method8535() {
        if (!this.field4811.isEmpty() && this.method8530() == 1) {
            return this.field4811.isEmpty() ? 0 : ((class438)this.field4811.get((int)(this.field4811.size() - 1))).field4821 + this.method8554();
        }
        int n = -1;
        int n2 = 0;
        int n3 = this.field4811.size() - 1;
        while (n3 >= 0) {
            class438 class4382 = (class438)this.field4811.get(n3);
            if (n != class4382.field4822) {
                int n4 = this.method8576(class4382, false) + class4382.field4821;
                n2 = Math.max(n4, n2);
                n = class4382.field4822;
            }
            --n3;
        }
        return n2;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="112")
    public int method8555() {
        return this.method8579() ? 0 : this.field4801.field4832 + ((class438)this.field4811.get((int)(this.field4811.size() - 1))).field4822;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1893689420")
    public int method8552() {
        return this.field4807;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-240461513")
    public int method8530() {
        return this.method8555() / this.field4801.field4832;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="2022140878")
    int method8554() {
        return this.method8579() ? 0 : this.method8576((class438)this.field4811.get(this.field4811.size() - 1), false);
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="108")
    public int method8627() {
        return this.field4804;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1613567763")
    public int method8556() {
        return this.field4805;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-349187962")
    public int method8553() {
        return this.field4812;
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-67")
    public int method8536() {
        return this.field4813;
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-43")
    public int method8559(int n) {
        switch (this.field4808) {
            default: {
                return 0;
            }
            case 2: {
                return n;
            }
            case 0: {
                return 0;
            }
            case 1: 
        }
        return n / 2;
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1889382726")
    public int method8560(int n) {
        switch (this.field4800) {
            default: {
                return 0;
            }
            case 0: {
                return 0;
            }
            case 2: {
                return n;
            }
            case 1: 
        }
        return n / 2;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="46")
    void method8584() {
        this.method8562(0, this.field4811.size());
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="2034973918")
    void method8562(int n, int n2) {
        if (this.method8579()) return;
        if (this.field4801 == null) {
            return;
        }
        class527 class5272 = this.method8565(n, n2);
        boolean bl = (Integer)class5272.field5326 == 0 && ((Integer)class5272.field5327).intValue() == this.field4811.size();
        int n3 = (Integer)class5272.field5326;
        int n4 = 0;
        int n5 = bl ? 0 : ((class438)this.field4811.get((int)((Integer)class5272.field5326).intValue())).field4822;
        int n6 = 0;
        int n7 = (Integer)class5272.field5326;
        while (true) {
            boolean bl2;
            int n8;
            int n9;
            block12: {
                block10: {
                    block11: {
                        block9: {
                            if (n7 > (Integer)class5272.field5327) break block9;
                            if (n7 < this.field4811.size()) break block10;
                            break block11;
                        }
                        if (this.field4800 == 0) return;
                        if (!bl) return;
                        n7 = n6 * this.method8552();
                        n9 = this.method8560(n7);
                        int n10 = 0;
                        while (n10 < this.field4811.size()) {
                            class438 class4382 = (class438)this.field4811.get(n10);
                            class4382.field4822 -= n9;
                            ++n10;
                        }
                        return;
                    }
                    n8 = 1;
                    break block12;
                }
                n8 = 0;
            }
            n9 = n8;
            class438 class4383 = (class438)this.field4811.get(n9 == 0 ? n7 : this.field4811.size() - 1);
            int n11 = n9 == 0 ? this.method8576(class4383, false) : 0;
            boolean bl3 = n9 == 0 && class4383.field4824 == '\n';
            boolean bl4 = bl2 = n9 == 0 && this.method8531() && n4 + n11 > this.field4804;
            if (bl3 || bl2 || n9 != 0) {
                int n12;
                class438 class4384;
                int n13;
                int n14;
                int n15 = n7;
                int n16 = 0;
                if (bl2) {
                    n14 = 0;
                    if (this.field4812 == 1) {
                        for (n13 = n15; n13 > n3; n14 += n13 < n15 ? this.method8576(class4384, false) : 0, --n13) {
                            class4384 = (class438)this.field4811.get(n13);
                            if (class4384.field4824 != ' ' && class4384.field4824 != '\n') {
                                continue;
                            }
                            n15 = n13;
                            n4 -= n14;
                            n16 = n14;
                            break;
                        }
                    }
                }
                n14 = -this.method8559(n4);
                for (n13 = n3; n13 < n15; n14 += n12, ++n13) {
                    class4384 = (class438)this.field4811.get(n13);
                    n12 = this.method8576(class4384, false);
                    class4384.field4821 = n14;
                    class4384.field4822 = n5;
                }
                n3 = n15;
                n4 = n16;
                n5 += this.method8552();
                ++n6;
            }
            n4 += n9 == 0 ? n11 : 0;
            ++n7;
        }
    }

    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="386227030")
    int method8563(int n) {
        return n < this.field4811.size() ? this.method8576((class438)this.field4811.get(n), false) : 0;
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(Lqo;ZB)I", garbageValue="98")
    int method8576(class438 class4382, boolean bl) {
        if (class4382.field4824 == '\n') {
            return 0;
        }
        if (this.field4813 != 0) {
            return this.field4801.field4827[42];
        }
        int n = this.field4801.field4827[class4382.field4824];
        if (n != 0) {
            return n;
        }
        if (class4382.field4824 != '\t') {
            return this.field4801.field4827[32];
        }
        return this.field4801.field4827[32] * 3;
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(III)Lug;", garbageValue="-2008755486")
    class527 method8565(int n, int n2) {
        int n3 = Math.min(n, n2);
        int n4 = Math.max(n, n2);
        int n5 = this.field4811.size();
        if (n3 == 0 && n5 == n4) {
            return new class527(0, n5);
        }
        int n6 = this.method8612(n3, false);
        int n7 = this.method8567(n4, false);
        switch (this.field4800) {
            default: {
                return new class527(0, n5);
            }
            case 2: {
                if (this.field4808 != 2) {
                    int n8 = this.method8567(n4, true);
                    return new class527(0, n8);
                }
                return new class527(0, n7);
            }
            case 0: {
                if (this.field4808 != 0) {
                    int n9 = this.method8612(n3, true);
                    return new class527(n9, n5);
                }
                return new class527(n6, n5);
            }
            case 1: 
        }
        return new class527(0, n5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(IZB)I", garbageValue="52")
    int method8612(int n, boolean bl) {
        if (n >= this.field4811.size()) return 0;
        int n2 = ((class438)this.field4811.get((int)n)).field4822;
        int n3 = n;
        while (n3 > 0) {
            if (((class438)this.field4811.get((int)(n3 - 1))).field4822 < n2) {
                if (!bl) return n3;
                bl = false;
                n2 = ((class438)this.field4811.get((int)(n3 - 1))).field4822;
            }
            --n3;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(IZB)I", garbageValue="5")
    int method8567(int n, boolean bl) {
        if (n >= this.field4811.size()) return this.field4811.size();
        int n2 = ((class438)this.field4811.get((int)n)).field4822;
        int n3 = n;
        while (n3 < this.field4811.size() - 1) {
            if (((class438)this.field4811.get((int)(n3 + 1))).field4822 > n2) {
                if (!bl) return n3;
                bl = false;
                n2 = ((class438)this.field4811.get((int)(n3 + 1))).field4822;
            }
            ++n3;
        }
        return this.field4811.size();
    }
}

