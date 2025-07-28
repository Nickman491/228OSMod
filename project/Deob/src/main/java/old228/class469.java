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

@ObfuscatedName(value="si")
public class class469
extends class476 {
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Luo;")
    final class534 field4980;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1250552947)
    int field4981 = 1;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpi;")
    public class413 field4979 = new class413();

    @ObfuscatedSignature(descriptor="(Luo;)V")
    public class469(class534 class5342) {
        super(400);
        this.field4980 = class5342;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lso;", garbageValue="35")
    class474 vmethod9210() {
        return new class471();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)[Lso;", garbageValue="-1808909632")
    class474[] vmethod9200(int n) {
        return new class471[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lwb;ZI)Z", garbageValue="-1389788629")
    public boolean method9090(class579 class5792, boolean bl) {
        class471 class4712 = (class471)this.method9219(class5792);
        if (class4712 == null) {
            return false;
        }
        return !bl || class4712.field5020 != 0;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lvy;IS)V", garbageValue="4608")
    public void method9091(class556 var1_1, int var2_2) {
        block0: while (true) {
            block17: {
                if (var1_1.field5471 >= var2_2) {
                    this.method9203();
                    return;
                }
                var3_3 = var1_1.method10282() == 1;
                var4_4 = new class579(var1_1.method10290(), this.field4980);
                var5_5 = new class579(var1_1.method10290(), this.field4980);
                var6_6 = var1_1.method10307();
                var7_7 = var1_1.method10282();
                var8_8 = var1_1.method10282();
                var9_9 = (var8_8 & 2) != 0;
                v0 = var10_10 = (var8_8 & 1) != 0;
                if (var6_6 > 0) {
                    var1_1.method10290();
                    var1_1.method10282();
                    var1_1.method10440();
                }
                var1_1.method10290();
                if (var4_4 == null || !var4_4.method10980()) break;
                var11_11 = (class471)this.method9196(var4_4);
                if (var3_3 && (var12_12 = (class471)this.method9196(var5_5)) != null && var11_11 != var12_12) {
                    if (var11_11 == null) {
                        var11_11 = var12_12;
                    } else {
                        this.method9241(var12_12);
                    }
                }
                if (var11_11 != null) break block17;
                if (this.method9192() >= 400) continue;
                var11_11 = (class471)this.method9201(var4_4, var5_5);
                ** GOTO lbl42
            }
            this.method9204(var11_11, var4_4, var5_5);
            if (var6_6 == var11_11.field5020) ** GOTO lbl42
            var14_14 = true;
            var13_13 = (class472)this.field4979.method8118();
            while (true) {
                block18: {
                    if (var13_13 != null) break block18;
                    if (var14_14) {
                        this.field4979.method8120(new class472(var4_4, var6_6));
                    }
lbl42:
                    // 5 sources

                    if (var6_6 != var11_11.field5020) {
                        var11_11.field5018 = ++this.field4981 - 1;
                        if (var11_11.field5020 == -1 && var6_6 == 0) {
                            var11_11.field5018 = -(var11_11.field5018 * -2003439171) * -1806970475;
                        }
                        var11_11.field5020 = var6_6;
                    }
                    var11_11.field5019 = var7_7;
                    var11_11.field4990 = var9_9;
                    var11_11.field4991 = var10_10;
                    continue block0;
                }
                if (var13_13.field4993.equals(var4_4)) {
                    if (var6_6 != 0 && var13_13.field4994 == 0) {
                        var13_13.method9617();
                        var14_14 = false;
                    } else if (var6_6 == 0 && var13_13.field4994 != 0) {
                        var13_13.method9617();
                        var14_14 = false;
                    }
                }
                var13_13 = (class472)this.field4979.method8119();
            }
            break;
        }
        throw new IllegalStateException();
    }

    @ObfuscatedName(value="nf")
    @ObfuscatedSignature(descriptor="(Lna;I)Z", garbageValue="-1721141643")
    static final boolean method9092(class361 class3612) {
        int n = class3612.field3875;
        if (n != 205) {
            int n2;
            int n3;
            if (n >= 300 && n <= 313) {
                n3 = (n - 300) / 2;
                n2 = n & 1;
                client.field680.method7121(n3, n2 == 1);
            }
            if (n >= 314 && n <= 323) {
                n3 = (n - 314) / 2;
                n2 = n & 1;
                client.field680.method7055(n3, n2 == 1);
            }
            if (n == 324) {
                client.field680.method7087(0);
            }
            if (n == 325) {
                client.field680.method7087(1);
            }
            if (n != 326) {
                return false;
            }
            class324 class3242 = class90.method2629(class322.field3364, client.field564.field1446);
            client.field680.method7088(class3242.field3442);
            client.field564.method3257(class3242);
            return true;
        }
        client.field627 = 250;
        return true;
    }
}

