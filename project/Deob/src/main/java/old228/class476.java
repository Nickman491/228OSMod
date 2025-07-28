package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sr")
public abstract class class476 {
    @ObfuscatedName(value="tx")
    @ObfuscatedSignature(descriptor="Lbp;")
    static class38 field5014;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1177259493)
    final int field5010;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1595213487)
    int field5009 = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lso;")
    class474[] field5011;
    @ObfuscatedName(value="as")
    HashMap field5008;
    @ObfuscatedName(value="aq")
    HashMap field5012;
    @ObfuscatedName(value="af")
    Comparator field5013 = null;

    class476(int n) {
        this.field5010 = n;
        this.field5011 = this.vmethod9200(n);
        this.field5008 = new HashMap(n / 8);
        this.field5012 = new HashMap(n / 8);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lso;", garbageValue="35")
    abstract class474 vmethod9210();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)[Lso;", garbageValue="-1808909632")
    abstract class474[] vmethod9200(int var1);

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1394017379")
    public void method9191() {
        this.field5009 = 0;
        Arrays.fill(this.field5011, null);
        this.field5008.clear();
        this.field5012.clear();
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1657712133")
    public int method9192() {
        return this.field5009;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="653055413")
    public boolean method9193() {
        return this.field5009 == this.field5010;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(Lwb;B)Z", garbageValue="-71")
    public boolean method9194(class579 class5792) {
        if (!class5792.method10980()) {
            return false;
        }
        if (this.field5008.containsKey(class5792)) {
            return true;
        }
        return this.field5012.containsKey(class5792);
    }

    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="(Lwb;B)Lso;", garbageValue="1")
    public class474 method9219(class579 class5792) {
        class474 class4742 = this.method9196(class5792);
        if (class4742 != null) {
            return class4742;
        }
        return this.method9237(class5792);
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(Lwb;I)Lso;", garbageValue="712815494")
    class474 method9196(class579 class5792) {
        if (!class5792.method10980()) {
            return null;
        }
        return (class474)this.field5008.get(class5792);
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(Lwb;I)Lso;", garbageValue="-996360738")
    class474 method9237(class579 class5792) {
        if (!class5792.method10980()) {
            return null;
        }
        return (class474)this.field5012.get(class5792);
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(Lwb;I)Z", garbageValue="-605591244")
    public final boolean method9198(class579 class5792) {
        class474 class4742 = this.method9196(class5792);
        if (class4742 == null) {
            return false;
        }
        this.method9241(class4742);
        return true;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(Lso;I)V", garbageValue="-1907086989")
    final void method9241(class474 class4742) {
        int n = this.method9205(class4742);
        if (n == -1) {
            return;
        }
        this.method9209(n);
        this.method9207(class4742);
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(Lwb;B)Lso;", garbageValue="1")
    class474 method9231(class579 class5792) {
        return this.method9201(class5792, null);
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Lwb;Lwb;I)Lso;", garbageValue="1721213229")
    class474 method9201(class579 class5792, class579 class5793) {
        if (this.method9196(class5792) != null) {
            throw new IllegalStateException();
        }
        class474 class4742 = this.vmethod9210();
        class4742.method9164(class5792, class5793);
        this.method9195(class4742);
        this.method9215(class4742);
        return class4742;
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(II)Lso;", garbageValue="-194587924")
    public final class474 method9202(int n) {
        if (n >= 0 && n < this.field5009) {
            return this.field5011[n];
        }
        throw new ArrayIndexOutOfBoundsException(n);
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="104")
    public final void method9203() {
        if (this.field5013 != null) {
            Arrays.sort(this.field5011, 0, this.field5009, this.field5013);
        } else {
            Arrays.sort(this.field5011, 0, this.field5009);
        }
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(Lso;Lwb;Lwb;I)V", garbageValue="-1662599861")
    final void method9204(class474 class4742, class579 class5792, class579 class5793) {
        this.method9207(class4742);
        class4742.method9164(class5792, class5793);
        this.method9215(class4742);
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(Lso;I)I", garbageValue="715861802")
    final int method9205(class474 class4742) {
        int n = 0;
        while (n < this.field5009) {
            if (this.field5011[n] == class4742) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(Lso;S)V", garbageValue="12018")
    final void method9207(class474 class4742) {
        if (this.field5008.remove(class4742.field5002) == null) {
            throw new IllegalStateException();
        }
        if (class4742.field5003 != null) {
            this.field5012.remove(class4742.field5003);
        }
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(Lso;I)V", garbageValue="1325537687")
    final void method9195(class474 class4742) {
        this.field5011[++this.field5009 - 1] = class4742;
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(Lso;B)V", garbageValue="-18")
    final void method9215(class474 class4742) {
        class474 class4743;
        this.field5008.put(class4742.field5002, class4742);
        if (class4742.field5003 != null && (class4743 = this.field5012.put(class4742.field5003, class4742)) != null && class4743 != class4742) {
            class4743.field5003 = null;
        }
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-62")
    final void method9209(int n) {
        --this.field5009;
        if (n < this.field5009) {
            System.arraycopy(this.field5011, n + 1, this.field5011, n, this.field5009 - n);
        }
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1045943049")
    public final void method9212() {
        this.field5013 = null;
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(Ljava/util/Comparator;I)V", garbageValue="-589206410")
    public final void method9253(Comparator comparator) {
        if (this.field5013 != null) {
            if (this.field5013 instanceof class475) {
                ((class475)this.field5013).method9182(comparator);
            }
        } else {
            this.field5013 = comparator;
        }
    }
}

