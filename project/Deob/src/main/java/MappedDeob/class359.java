/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nn")
public class class359 {
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lqi;")
    class436 field3850 = new class436();
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="Lqi;")
    class436 field3829 = new class436();
    @ObfuscatedName(value="aw")
    boolean field3844 = false;
    @ObfuscatedName(value="ai")
    boolean field3835 = true;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-741942325)
    int field3836 = 0;
    @ObfuscatedName(value="am")
    boolean field3834 = false;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=2059293545)
    int field3833 = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=425299993)
    int field3839 = 0;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1649693963)
    int field3840 = 0;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=-455222829)
    int field3841 = 0;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=1797435683)
    int field3842 = 0;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=1357046699)
    int field3843 = 0;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=-699182233)
    int field3838 = 0;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=-1889856721)
    int field3845 = Integer.MAX_VALUE;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=181061069)
    int field3846 = Integer.MAX_VALUE;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=-2091447531)
    int field3823 = 0;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=-682041293)
    int field3848 = 0;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-170108995)
    int field3849 = 0;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=2005463583)
    int field3824 = 0;
    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="Lnd;")
    class351 field3851;
    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="Lnd;")
    class351 field3852;

    class359() {
        this.field3850.method8602(1);
        this.field3829.method8602(1);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1779052711")
    void method7315() {
        this.field3836 = (this.field3836 + 1) % 60;
        if (this.field3838 > 0) {
            --this.field3838;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ZB)Z", garbageValue="16")
    public boolean method7129(boolean bl) {
        bl = bl && this.field3835;
        boolean bl2 = this.field3844 != bl;
        this.field3844 = bl;
        if (!this.field3844) {
            this.method7285(this.field3841, this.field3841);
        }
        return bl2;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1592935546")
    public void method7128(boolean bl) {
        this.field3835 = bl;
        this.field3844 = bl && this.field3844;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="-223717769")
    public boolean method7131(String string) {
        String string2 = this.field3850.method8533();
        if (string2.equals(string)) {
            return false;
        }
        string = this.method7197(string);
        this.field3850.method8545(string);
        this.method7285(this.field3842, this.field3841);
        this.method7138(this.field3849, this.field3824);
        this.method7236();
        this.method7206();
        return true;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="1585388802")
    boolean method7298(String string) {
        this.field3829.method8545(string);
        return true;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lqc;I)Z", garbageValue="1527867212")
    boolean method7242(AbstractFont abstractFont) {
        boolean bl = !this.field3834;
        this.field3850.method8663(abstractFont);
        this.field3829.method8663(abstractFont);
        this.field3834 = true;
        bl |= this.method7138(this.field3849, this.field3824);
        bl |= this.method7285(this.field3842, this.field3841);
        if (this.method7236()) {
            this.method7206();
            bl = true;
        }
        return bl;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="-6")
    public boolean method7134(int n, int n2) {
        boolean bl = this.field3823 != n || n2 != this.field3848;
        this.field3823 = n;
        this.field3848 = n2;
        return bl |= this.method7138(this.field3849, this.field3824);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="407542733")
    public boolean method7212(int n) {
        if (n < 0) {
            n = Integer.MAX_VALUE;
        }
        boolean bl = n == this.field3850.method8627();
        this.field3850.method8534(n);
        this.field3829.method8534(n);
        if (this.method7236()) {
            this.method7206();
            bl = true;
        }
        return bl;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1982663663")
    public boolean method7136(int n) {
        this.field3850.method8662(n);
        if (!this.method7236()) {
            return false;
        }
        this.method7206();
        return true;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="119134741")
    public boolean method7379(int n) {
        this.field3846 = n;
        if (!this.method7236()) {
            return false;
        }
        this.method7206();
        return true;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="58")
    public boolean method7138(int n, int n2) {
        if (this.method7276()) {
            int n3 = this.field3849;
            int n4 = this.field3824;
            int n5 = Math.max(0, this.field3850.method8535() - this.field3823 + 2);
            int n6 = Math.max(0, this.field3850.method8555() - this.field3848 + 1);
            this.field3849 = Math.max(0, Math.min(n5, n));
            this.field3824 = Math.max(0, Math.min(n6, n2));
            return n3 != this.field3849 || n4 != this.field3824;
        }
        this.field3849 = n;
        this.field3824 = n2;
        return false;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="0")
    public boolean method7345(int n, int n2) {
        boolean bl = true;
        if (n < 0 || n > 2) {
            bl = false;
        }
        if (n2 < 0 || n2 > 2) {
            bl = false;
        }
        if (!bl) {
            return false;
        }
        return this.field3850.method8539(n, n2);
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="51")
    public void method7311(int n) {
        this.field3850.method8540(n);
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="341938854")
    public void method7141(int n) {
        this.field3833 = n;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="4")
    public void method7142(int n) {
        this.field3850.method8602(n);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="863388330")
    public void method7143(int n) {
        this.field3850.method8581(n);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1302974713")
    public boolean method7144(int n) {
        this.field3840 = n;
        String string = this.field3850.method8533();
        int n2 = string.length();
        if ((string = this.method7197(string)).length() == n2) {
            return false;
        }
        this.field3850.method8545(string);
        this.method7138(this.field3849, this.field3824);
        this.method7236();
        this.method7206();
        return true;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1952270718")
    public void method7145() {
        this.field3834 = false;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="801820776")
    public boolean method7146(int n) {
        if (this.method7207(n)) {
            this.method7151();
            class437 class4372 = this.field3850.method8543((char)n, this.field3841, this.field3845);
            this.method7285(class4372.method8668(), class4372.method8668());
            this.method7236();
            this.method7206();
        }
        return true;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1533053203")
    public void method7228() {
        if (!this.method7151() && this.field3841 > 0) {
            int n = this.field3850.method8547(this.field3841 - 1);
            this.method7206();
            this.method7285(n, n);
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-118")
    public void method7281() {
        if (!this.method7151() && this.field3841 < this.field3850.method8532()) {
            int n = this.field3850.method8547(this.field3841);
            this.method7206();
            this.method7285(n, n);
        }
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1366873260")
    public void method7201() {
        if (!this.method7151() && this.field3841 > 0) {
            class527 class5272 = this.method7199(this.field3841 - 1);
            int n = this.field3850.method8548((Integer)class5272.field5326, this.field3841);
            this.method7206();
            this.method7285(n, n);
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-106")
    public void method7150() {
        if (!this.method7151() && this.field3841 < this.field3850.method8532()) {
            class527 class5272 = this.method7199(this.field3841);
            int n = this.field3850.method8548(this.field3841, (Integer)class5272.field5327);
            this.method7206();
            this.method7285(n, n);
        }
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1917012645")
    boolean method7151() {
        if (!this.method7196()) {
            return false;
        }
        int n = this.field3850.method8548(this.field3842, this.field3841);
        this.method7206();
        this.method7285(n, n);
        return true;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="107")
    public void method7152() {
        this.method7285(0, this.field3850.method8532());
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IIS)Z", garbageValue="-14268")
    public boolean method7285(int n, int n2) {
        if (this.method7276()) {
            if (n > this.field3850.method8532()) {
                n = this.field3850.method8532();
            }
            if (n2 > this.field3850.method8532()) {
                n2 = this.field3850.method8532();
            }
            boolean bl = this.field3842 != n || n2 != this.field3841;
            this.field3842 = n;
            if (n2 != this.field3841) {
                this.field3841 = n2;
                this.field3836 = 0;
                this.method7204();
            }
            if (bl && this.field3852 != null) {
                this.field3852.vmethod7020();
            }
            return bl;
        }
        this.field3842 = n;
        this.field3841 = n2;
        return false;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="130295381")
    public void method7332(boolean bl) {
        class527 class5272 = this.method7200(this.field3841);
        this.method7202((Integer)class5272.field5326, bl);
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="1558820978")
    public void method7155(boolean bl) {
        class527 class5272 = this.method7200(this.field3841);
        this.method7202((Integer)class5272.field5327, bl);
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-276372919")
    public void method7290(boolean bl) {
        this.method7202(0, bl);
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="8")
    public void method7137(boolean bl) {
        this.method7202(this.field3850.method8532(), bl);
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-31")
    public void method7220(boolean bl) {
        if (this.method7196() && !bl) {
            this.method7202(Math.min(this.field3842, this.field3841), bl);
        } else if (this.field3841 > 0) {
            this.method7202(this.field3841 - 1, bl);
        }
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(ZS)V", garbageValue="4651")
    public void method7194(boolean bl) {
        if (this.method7196() && !bl) {
            this.method7202(Math.max(this.field3842, this.field3841), bl);
        } else if (this.field3841 < this.field3850.method8532()) {
            this.method7202(this.field3841 + 1, bl);
        }
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="1318482631")
    public void method7160(boolean bl) {
        if (this.field3841 > 0) {
            class527 class5272 = this.method7199(this.field3841 - 1);
            this.method7202((Integer)class5272.field5326, bl);
        }
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1104639542")
    public void method7161(boolean bl) {
        if (this.field3841 < this.field3850.method8532()) {
            class527 class5272 = this.method7199(this.field3841 + 1);
            this.method7202((Integer)class5272.field5327, bl);
        }
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="1651896224")
    public void method7162(boolean bl) {
        if (this.field3841 > 0) {
            this.method7202(this.field3850.method8603(this.field3841, -1), bl);
        }
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="1741633644")
    public void method7163(boolean bl) {
        if (this.field3841 < this.field3850.method8532()) {
            this.method7202(this.field3850.method8603(this.field3841, 1), bl);
        }
    }

    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="2113041042")
    public void method7164(boolean bl) {
        if (this.field3841 > 0) {
            int n = this.method7203();
            this.method7202(this.field3850.method8603(this.field3841, -n), bl);
        }
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1616171133")
    public void method7165(boolean bl) {
        if (this.field3841 < this.field3850.method8532()) {
            int n = this.method7203();
            this.method7202(this.field3850.method8603(this.field3841, n), bl);
        }
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="373836384")
    public void method7166(boolean bl) {
        class440 class4402 = this.field3850.method8629(0, this.field3841);
        class527 class5272 = class4402.method8792();
        this.method7202(this.field3850.method8549((Integer)class5272.field5326, this.field3824), bl);
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="830330005")
    public void method7260(boolean bl) {
        class440 class4402 = this.field3850.method8629(0, this.field3841);
        class527 class5272 = class4402.method8792();
        this.method7202(this.field3850.method8549((Integer)class5272.field5326, this.field3848 + this.field3824), bl);
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(IIZZB)V", garbageValue="40")
    public void method7317(int n, int n2, boolean bl, boolean bl2) {
        class527 class5272;
        int n3 = 0;
        if (this.field3834) {
            n = this.field3849 + n;
            class5272 = this.method7208();
            n3 = this.field3850.method8549(n - (Integer)class5272.field5326, (n2 += this.field3824) - (Integer)class5272.field5327);
        } else {
            n3 = 0;
        }
        if (bl && bl2) {
            this.field3839 = 1;
            class5272 = this.method7199(n3);
            class527 class5273 = this.method7199(this.field3843);
            this.method7133(class5273, class5272);
        } else if (!bl) {
            if (!bl2) {
                if (this.field3838 > 0 && n3 == this.field3843) {
                    if (this.field3842 != this.field3841) {
                        this.field3839 = 2;
                        class5272 = this.method7200(n3);
                        this.method7285((Integer)class5272.field5326, (Integer)class5272.field5327);
                    } else {
                        this.field3839 = 1;
                        class5272 = this.method7199(n3);
                        this.method7285((Integer)class5272.field5326, (Integer)class5272.field5327);
                    }
                } else {
                    this.field3839 = 0;
                    this.method7285(n3, n3);
                    this.field3843 = n3;
                }
                this.field3838 = 25;
            } else {
                this.method7285(this.field3843, n3);
            }
        } else {
            this.field3839 = 1;
            class5272 = this.method7199(n3);
            this.method7285((Integer)class5272.field5326, (Integer)class5272.field5327);
            this.field3843 = (Integer)class5272.field5326;
        }
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="-103")
    public void method7169(int n, int n2) {
        if (this.field3834 && this.method7221()) {
            n = this.field3849 + n;
            class527 class5272 = this.method7208();
            int n3 = this.field3850.method8549(n - (Integer)class5272.field5326, (n2 += this.field3824) - (Integer)class5272.field5327);
            switch (this.field3839) {
                case 1: {
                    class527 class5273 = this.method7199(this.field3843);
                    class527 class5274 = this.method7199(n3);
                    this.method7133(class5273, class5274);
                    break;
                }
                case 2: {
                    class527 class5275 = this.method7200(this.field3843);
                    class527 class5276 = this.method7200(n3);
                    this.method7133(class5275, class5276);
                    break;
                }
                case 0: {
                    this.method7285(this.field3842, n3);
                }
            }
        }
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Ljava/awt/datatransfer/Clipboard;I)V", garbageValue="-579443652")
    public void method7170(Clipboard clipboard) {
        String string;
        class440 class4402 = this.field3850.method8629(this.field3842, this.field3841);
        if (!class4402.method8788() && !(string = class4402.method8809()).isEmpty()) {
            clipboard.setContents(new StringSelection(string), null);
        }
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(Ljava/awt/datatransfer/Clipboard;B)V", garbageValue="0")
    public void method7171(Clipboard clipboard) {
        if (this.method7196()) {
            this.method7170(clipboard);
            this.method7151();
        }
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(Ljava/awt/datatransfer/Clipboard;I)V", garbageValue="290156297")
    public void method7172(Clipboard clipboard) {
        Transferable transferable = clipboard.getContents(null);
        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String string = this.method7197((String)transferable.getTransferData(DataFlavor.stringFlavor));
                this.method7151();
                class437 class4372 = this.field3850.method8601(string, this.field3841, this.field3845);
                this.method7285(class4372.method8668(), class4372.method8668());
                this.method7236();
                this.method7206();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="97")
    public void method7173() {
        this.field3824 = Math.max(0, this.field3824 - this.field3850.method8552());
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1933317560")
    public void method7174() {
        int n = Math.max(0, this.field3850.method8555() - this.field3848);
        this.field3824 = Math.min(n, this.field3824 + this.field3850.method8552());
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(Lnd;B)V", garbageValue="68")
    public void method7175(class351 class3512) {
        this.field3851 = class3512;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(Lnd;B)V", garbageValue="110")
    public void method7176(class351 class3512) {
        this.field3852 = class3512;
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(B)Lqi;", garbageValue="7")
    public class436 method7331() {
        return this.field3850;
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(B)Lqi;", garbageValue="1")
    public class436 method7363() {
        return this.field3829;
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(I)Lqk;", garbageValue="688799447")
    public class440 method7179() {
        return this.field3850.method8629(this.field3842, this.field3841);
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="127")
    public boolean method7221() {
        return this.field3844;
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="618604110")
    public boolean method7181() {
        return this.field3835;
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1666922979")
    public boolean method7182() {
        return this.method7221() && this.field3836 % 60 < 30;
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1412363426")
    public int method7259() {
        return this.field3841;
    }

    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="116")
    public int method7184() {
        return this.field3842;
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-946540333")
    public boolean method7276() {
        return this.field3834;
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-10")
    public int method7167() {
        return this.field3849;
    }

    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="0")
    public int method7187() {
        return this.field3824;
    }

    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="50")
    public int method7188() {
        return this.field3850.method8627();
    }

    @ObfuscatedName(value="cu")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="773127273")
    public int method7189() {
        return this.field3850.method8556();
    }

    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1032306936")
    public int method7190() {
        return this.field3846;
    }

    @ObfuscatedName(value="cf")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-19")
    public int method7191() {
        return this.field3833;
    }

    @ObfuscatedName(value="ct")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="102709807")
    public int method7157() {
        return this.field3850.method8553();
    }

    @ObfuscatedName(value="ci")
    @ObfuscatedSignature(descriptor="(S)I", garbageValue="1000")
    public int method7193() {
        return this.field3840;
    }

    @ObfuscatedName(value="cl")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1831508539")
    public int method7371() {
        return this.field3850.method8536();
    }

    @ObfuscatedName(value="cw")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="932495240")
    public boolean method7195() {
        return this.method7189() > 1;
    }

    @ObfuscatedName(value="cj")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1394085711")
    boolean method7196() {
        return this.field3841 != this.field3842;
    }

    @ObfuscatedName(value="cx")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/lang/String;", garbageValue="-826053742")
    String method7197(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int n = 0;
        while (n < string.length()) {
            char c = string.charAt(n);
            if (this.method7207(c)) {
                stringBuilder.append(c);
            }
            ++n;
        }
        return stringBuilder.toString();
    }

    @ObfuscatedName(value="cd")
    @ObfuscatedSignature(descriptor="(Lug;Lug;B)V", garbageValue="-6")
    void method7133(class527 class5272, class527 class5273) {
        if ((Integer)class5273.field5326 >= (Integer)class5272.field5326) {
            this.method7285((Integer)class5272.field5326, (Integer)class5273.field5327);
        } else {
            this.method7285((Integer)class5272.field5327, (Integer)class5273.field5326);
        }
    }

    @ObfuscatedName(value="cv")
    @ObfuscatedSignature(descriptor="(IB)Lug;", garbageValue="16")
    class527 method7199(int n) {
        int n2 = this.field3850.method8532();
        int n3 = 0;
        int n4 = n2;
        int n5 = n;
        while (true) {
            block5: {
                block4: {
                    if (n5 <= 0) break block4;
                    if (!this.method7205(this.field3850.method8528((int)(n5 - 1)).field4824)) break block5;
                    n3 = n5;
                }
                n5 = n;
                while (true) {
                    block7: {
                        block6: {
                            if (n5 >= n2) break block6;
                            if (!this.method7205(this.field3850.method8528((int)n5).field4824)) break block7;
                            n4 = n5;
                        }
                        return new class527(n3, n4);
                    }
                    ++n5;
                }
            }
            --n5;
        }
    }

    @ObfuscatedName(value="ck")
    @ObfuscatedSignature(descriptor="(IB)Lug;", garbageValue="-109")
    class527 method7200(int n) {
        int n2 = this.field3850.method8532();
        int n3 = 0;
        int n4 = n2;
        int n5 = n;
        while (true) {
            block7: {
                block6: {
                    if (n5 <= 0) break block6;
                    if (this.field3850.method8528((int)(n5 - 1)).field4824 != '\n') break block7;
                    n3 = n5;
                }
                for (n5 = n; n5 < n2; ++n5) {
                    if (this.field3850.method8528((int)n5).field4824 != '\n') {
                        continue;
                    }
                    n4 = n5;
                    break;
                }
                return new class527(n3, n4);
            }
            --n5;
        }
    }

    @ObfuscatedName(value="cs")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-2135983083")
    boolean method7236() {
        int n;
        if (!this.method7276()) {
            return false;
        }
        boolean bl = false;
        if (this.field3850.method8532() > this.field3846) {
            this.field3850.method8548(this.field3846, this.field3850.method8532());
            bl = true;
        }
        int n2 = this.method7189();
        if (this.field3850.method8530() > n2) {
            n = this.field3850.method8603(0, n2) - 1;
            this.field3850.method8548(n, this.field3850.method8532());
            bl = true;
        }
        if (bl) {
            n = this.field3841;
            int n3 = this.field3842;
            int n4 = this.field3850.method8532();
            if (this.field3841 > n4) {
                n = n4;
            }
            if (this.field3842 > n4) {
                n3 = n4;
            }
            this.method7285(n3, n);
        }
        return bl;
    }

    @ObfuscatedName(value="cm")
    @ObfuscatedSignature(descriptor="(IZI)V", garbageValue="-1767877734")
    void method7202(int n, boolean bl) {
        if (bl) {
            this.method7285(this.field3842, n);
        } else {
            this.method7285(n, n);
        }
    }

    @ObfuscatedName(value="ce")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1247723734")
    int method7203() {
        return this.field3848 / this.field3850.method8552();
    }

    @ObfuscatedName(value="cr")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1584174140")
    void method7204() {
        class440 class4402 = this.field3850.method8629(0, this.field3841);
        class527 class5272 = class4402.method8792();
        int n = this.field3850.method8552();
        int n2 = (Integer)class5272.field5326 - 10;
        int n3 = n2 + 20;
        int n4 = (Integer)class5272.field5327 - 3;
        int n5 = n + n4 + 6;
        int n6 = this.field3849;
        int n7 = n6 + this.field3823;
        int n8 = this.field3824;
        int n9 = n8 + this.field3848;
        int n10 = this.field3849;
        int n11 = this.field3824;
        if (n2 >= n6) {
            if (n3 > n7) {
                n10 = n3 - this.field3823;
            }
        } else {
            n10 = n2;
        }
        if (n4 >= n8) {
            if (n5 > n9) {
                n11 = n5 - this.field3848;
            }
        } else {
            n11 = n4;
        }
        this.method7138(n10, n11);
    }

    @ObfuscatedName(value="ch")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1592153882")
    boolean method7205(int n) {
        return n == 32 || n == 10 || n == 9;
    }

    @ObfuscatedName(value="dh")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="540972933")
    void method7206() {
        if (this.field3851 != null) {
            this.field3851.vmethod7020();
        }
    }

    @ObfuscatedName(value="dn")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="-93")
    boolean method7207(int n) {
        switch (this.field3840) {
            case 2: {
                return class167.isCharAlphabetic((char)n);
            }
            default: {
                return true;
            }
            case 1: {
                return class274.isAlphaNumeric((char)n);
            }
            case 3: {
                return Huffman.isDigit((char)n);
            }
            case 4: 
        }
        char c = (char)n;
        if (!Huffman.isDigit(c)) {
            return c == 'k' || c == 'K' || c == 'm' || c == 'M' || c == 'b' || c == 'B';
            {
            }
        }
        return true;
    }

    @ObfuscatedName(value="dc")
    @ObfuscatedSignature(descriptor="(I)Lug;", garbageValue="2041424888")
    class527 method7208() {
        int n = this.field3850.method8559(this.field3823);
        int n2 = this.field3850.method8560(this.field3848);
        return new class527(n, n2);
    }
}

