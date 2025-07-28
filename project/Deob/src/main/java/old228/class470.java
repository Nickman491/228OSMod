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

@ObfuscatedName(value="sa")
public class class470
extends class476 {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Luo;")
    final class534 field4988;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lsw;")
    final class468 field4984;
    @ObfuscatedName(value="ao")
    public String field4985 = null;
    @ObfuscatedName(value="ad")
    public String field4986 = null;
    @ObfuscatedName(value="an")
    public byte field4987;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1655402779)
    public int field4983;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-99232999)
    int field4989 = 1;

    @ObfuscatedSignature(descriptor="(Luo;Lsw;)V")
    public class470(class534 class5342, class468 class4682) {
        super(500);
        this.field4988 = class5342;
        this.field4984 = class4682;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lso;", garbageValue="35")
    class474 vmethod9210() {
        return new class473();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)[Lso;", garbageValue="-1808909632")
    class474[] vmethod9200(int n) {
        return new class473[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1660520999")
    final void method9105(String string) {
        String string2;
        String string3 = class294.method6392(class429.method8477(string));
        if (string3 == null) {
            string3 = "";
        }
        this.field4985 = string2 = string3;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-549241957")
    final void method9109(String string) {
        String string2;
        String string3 = class294.method6392(class429.method8477(string));
        if (string3 == null) {
            string3 = "";
        }
        this.field4986 = string2 = string3;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="864106992")
    public final void method9126(class556 class5562) {
        this.method9109(class5562.method10290());
        long l = class5562.method10273();
        this.method9105(class92.method2641(l));
        this.field4987 = class5562.method10524();
        int n = class5562.method10441();
        if (n != -1) {
            this.method9191();
            int n2 = 0;
            while (true) {
                if (n2 >= n) {
                    return;
                }
                class473 class4732 = (class473)this.method9231(new class579(class5562.method10290(), this.field4988));
                int n3 = class5562.method10307();
                class4732.method9276(n3, ++this.field4989 - 1);
                class4732.field5019 = class5562.method10524();
                class5562.method10290();
                this.method9111(class4732);
                ++n2;
            }
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="423902017")
    public final void method9108(class556 class5562) {
        class579 class5792 = new class579(class5562.method10290(), this.field4988);
        int n = class5562.method10307();
        byte by = class5562.method10524();
        boolean bl = false;
        if (by == -128) {
            bl = true;
        }
        if (!bl) {
            class5562.method10290();
            class473 class4732 = (class473)this.method9196(class5792);
            if (class4732 == null) {
                if (this.method9192() > this.field5010) {
                    return;
                }
                class4732 = (class473)this.method9231(class5792);
            }
            class4732.method9276(n, ++this.field4989 - 1);
            class4732.field5019 = by;
            this.method9111(class4732);
        } else {
            if (this.method9192() == 0) {
                return;
            }
            class473 class4733 = (class473)this.method9196(class5792);
            if (class4733 != null && class4733.method9275() == n) {
                this.method9241(class4733);
            }
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="95")
    public final void method9112() {
        int n = 0;
        while (n < this.method9192()) {
            ((class473)this.method9202(n)).method9143();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1492487604")
    public final void method9120() {
        int n = 0;
        while (n < this.method9192()) {
            ((class473)this.method9202(n)).method9145();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lsc;I)V", garbageValue="1219520794")
    final void method9111(class473 class4732) {
        if (class4732.method9161().equals(this.field4984.vmethod9086())) {
            this.field4983 = class4732.field5019;
        }
    }
}

