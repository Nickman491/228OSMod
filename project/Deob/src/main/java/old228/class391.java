package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pq")
public abstract class class391 {
    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="Lws;")
    static class577 field4576 = new class577();
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=-391705417)
    static int field4585 = 0;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=-1154955815)
    int field4587;
    @ObfuscatedName(value="ab")
    int[] field4577;
    @ObfuscatedName(value="aj")
    int[] field4592;
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="Lwt;")
    class578 field4579;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=119017569)
    int field4580;
    @ObfuscatedName(value="bw")
    int[] field4581;
    @ObfuscatedName(value="bb")
    int[] field4593;
    @ObfuscatedName(value="bx")
    int[] field4583;
    @ObfuscatedName(value="bd")
    int[][] field4584;
    @ObfuscatedName(value="bi")
    int[][] field4588;
    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="[Lwt;")
    class578[] field4586;
    @ObfuscatedName(value="bt")
    Object[] field4578;
    @ObfuscatedName(value="bf")
    Object[][] field4582;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=-625245881)
    public int field4590;
    @ObfuscatedName(value="bp")
    boolean field4591;
    @ObfuscatedName(value="bg")
    boolean field4589;

    class391(boolean bl, boolean bl2) {
        this.field4591 = bl;
        this.field4589 = bl2;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1455866633")
    void vmethod7727(int n) {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IS)V", garbageValue="20201")
    void vmethod7738(int n) {
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-78")
    int vmethod7734(int n) {
        if (this.field4578[n] != null) {
            return 100;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="([BB)V", garbageValue="-32")
    void method7818(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl;
        int n7;
        this.field4590 = class428.method8382(byArray, byArray.length);
        class556 class5562 = new class556(class214.method4920(byArray));
        int n8 = class5562.method10282();
        if (n8 < 5 || n8 > 7) throw new RuntimeException("");
        if (n8 >= 6) {
            class5562.method10440();
        }
        boolean bl2 = ((n7 = class5562.method10282()) & 1) != 0;
        boolean bl3 = (n7 & 2) != 0;
        boolean bl4 = (n7 & 4) != 0;
        boolean bl5 = bl = (n7 & 8) != 0;
        if (bl3) throw new UnsupportedOperationException("");
        if (bl4) throw new UnsupportedOperationException("");
        if (bl) throw new UnsupportedOperationException("");
        this.field4587 = n8 >= 7 ? class5562.method10298() : class5562.method10307();
        int n9 = 0;
        int n10 = -1;
        this.field4577 = new int[this.field4587];
        if (n8 < 7) {
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.field4577[n6] = n9 += class5562.method10307();
                if (this.field4577[n6] <= n10) continue;
                n10 = this.field4577[n6];
            }
        } else {
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.field4577[n6] = n9 += class5562.method10298();
                if (this.field4577[n6] <= n10) continue;
                n10 = this.field4577[n6];
            }
        }
        this.field4580 = n10 + 1;
        this.field4581 = new int[this.field4580];
        this.field4593 = new int[this.field4580];
        this.field4583 = new int[this.field4580];
        this.field4584 = new int[this.field4580][];
        this.field4578 = new Object[this.field4580];
        this.field4582 = new Object[this.field4580][];
        if (bl2) {
            this.field4592 = new int[this.field4580];
            Arrays.fill(this.field4592, -1);
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.field4592[this.field4577[n6]] = class5562.method10440();
            }
            this.field4579 = new class578(this.field4592);
        }
        for (n6 = 0; n6 < this.field4587; ++n6) {
            this.field4581[this.field4577[n6]] = class5562.method10440();
        }
        for (n6 = 0; n6 < this.field4587; ++n6) {
            this.field4593[this.field4577[n6]] = class5562.method10440();
        }
        if (n8 < 7) {
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.field4583[this.field4577[n6]] = class5562.method10307();
            }
            block6: for (n6 = 0; n6 < this.field4587; ++n6) {
                n5 = this.field4577[n6];
                n4 = this.field4583[n5];
                n9 = 0;
                n3 = -1;
                this.field4584[n5] = new int[n4];
                n2 = 0;
                while (true) {
                    if (n2 >= n4) {
                        this.field4582[n5] = new Object[n3 + 1];
                        continue block6;
                    }
                    this.field4584[n5][n2] = n9 += class5562.method10307();
                    n = n9;
                    if (n > n3) {
                        n3 = n;
                    }
                    ++n2;
                }
            }
        } else {
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.field4583[this.field4577[n6]] = class5562.method10298();
            }
            block9: for (n6 = 0; n6 < this.field4587; ++n6) {
                n5 = this.field4577[n6];
                n4 = this.field4583[n5];
                n9 = 0;
                n3 = -1;
                this.field4584[n5] = new int[n4];
                n2 = 0;
                while (true) {
                    if (n2 >= n4) {
                        this.field4582[n5] = new Object[n3 + 1];
                        continue block9;
                    }
                    this.field4584[n5][n2] = n9 += class5562.method10298();
                    n = n9;
                    if (n > n3) {
                        n3 = n;
                    }
                    ++n2;
                }
            }
        }
        if (!bl2) return;
        this.field4588 = new int[n10 + 1][];
        this.field4586 = new class578[n10 + 1];
        n6 = 0;
        block11: while (n6 < this.field4587) {
            n5 = this.field4577[n6];
            n4 = this.field4583[n5];
            this.field4588[n5] = new int[this.field4582[n5].length];
            Arrays.fill(this.field4588[n5], -1);
            n3 = 0;
            while (true) {
                if (n3 >= n4) {
                    this.field4586[n5] = new class578(this.field4588[n5]);
                    ++n6;
                    continue block11;
                }
                n2 = this.field4584[n5] != null ? this.field4584[n5][n3] : n3;
                this.field4588[n5][n2] = class5562.method10440();
                ++n3;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(IIB)[B", garbageValue="0")
    public byte[] method7790(int n, int n2) {
        return this.method7729(n, n2, null);
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(II[II)[B", garbageValue="505728430")
    public byte[] method7729(int n, int n2, int[] nArray) {
        if (n >= 0 && n < this.field4582.length && this.field4582[n] != null && n2 >= 0 && n2 < this.field4582[n].length) {
            boolean bl;
            if (this.field4582[n][n2] == null && !(bl = this.method7745(n, nArray))) {
                this.vmethod7738(n);
                bl = this.method7745(n, nArray);
                if (!bl) {
                    return null;
                }
            }
            byte[] byArray = class34.method676(this.field4582[n][n2], false);
            if (this.field4589) {
                this.field4582[n][n2] = null;
            }
            return byArray;
        }
        return null;
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="469868881")
    public boolean method7730(int n, int n2) {
        if (n >= 0 && n < this.field4582.length && this.field4582[n] != null && n2 >= 0 && n2 < this.field4582[n].length) {
            if (this.field4582[n][n2] != null) {
                return true;
            }
            if (this.field4578[n] != null) {
                return true;
            }
            this.vmethod7738(n);
            return this.field4578[n] != null;
        }
        return false;
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-907088043")
    public boolean method7731(int n) {
        if (this.field4582.length == 1) {
            return this.method7730(0, n);
        }
        if (this.field4582[n].length == 1) {
            return this.method7730(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1231570039")
    public boolean method7732(int n) {
        if (this.field4578[n] != null) {
            return true;
        }
        this.vmethod7738(n);
        return this.field4578[n] != null;
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-2039184779")
    public boolean method7733() {
        boolean bl = true;
        int n = 0;
        while (n < this.field4577.length) {
            int n2 = this.field4577[n];
            if (this.field4578[n2] == null) {
                this.vmethod7738(n2);
                if (this.field4578[n2] == null) {
                    bl = false;
                }
            }
            ++n;
        }
        return bl;
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="-1896394370")
    public byte[] method7735(int n) {
        if (this.field4582.length == 1) {
            return this.method7790(0, n);
        }
        if (this.field4582[n].length == 1) {
            return this.method7790(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(III)[B", garbageValue="360301092")
    public byte[] method7736(int n, int n2) {
        if (n >= 0 && n < this.field4582.length && this.field4582[n] != null && n2 >= 0 && n2 < this.field4582[n].length) {
            boolean bl;
            if (this.field4582[n][n2] == null && !(bl = this.method7745(n, null))) {
                this.vmethod7738(n);
                bl = this.method7745(n, null);
                if (!bl) {
                    return null;
                }
            }
            byte[] byArray = class34.method676(this.field4582[n][n2], false);
            return byArray;
        }
        return null;
    }

    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="808469936")
    public byte[] method7767(int n) {
        if (this.field4582.length == 1) {
            return this.method7736(0, n);
        }
        if (this.field4582[n].length == 1) {
            return this.method7736(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="(II)[I", garbageValue="1073037891")
    public int[] method7814(int n) {
        if (n >= 0 && n < this.field4584.length) {
            return this.field4584[n];
        }
        return null;
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-242629885")
    public int method7740(int n) {
        if (this.field4582 != null && n < this.field4582.length && this.field4582[n] != null) {
            return this.field4582[n].length;
        }
        return 0;
    }

    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1013330448")
    public int method7812() {
        return this.field4580;
    }

    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="36")
    public void method7742() {
        for (int i = 0; i < this.field4578.length; ++i) {
            this.field4578[i] = null;
        }
    }

    @ObfuscatedName(value="cu")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1672149413")
    public void method7728(int n) {
        for (int i = 0; i < this.field4582[n].length; ++i) {
            this.field4582[n][i] = null;
        }
    }

    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="15")
    public void method7744() {
        int n = 0;
        while (n < this.field4582.length) {
            if (this.field4582[n] != null) {
                for (int i = 0; i < this.field4582[n].length; ++i) {
                    this.field4582[n][i] = null;
                }
            }
            ++n;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="cf")
    @ObfuscatedSignature(descriptor="(I[II)Z", garbageValue="-660532610")
    boolean method7745(int n, int[] nArray) {
        if (this.field4578[n] == null) {
            return false;
        }
        int n2 = this.field4583[n];
        int[] nArray2 = this.field4584[n];
        Object[] objectArray = this.field4582[n];
        boolean bl = true;
        int n3 = 0;
        while (true) {
            block22: {
                Object object;
                byte[] byArray;
                block21: {
                    if (n3 >= n2) break block21;
                    if (objectArray[nArray2[n3]] != null) break block22;
                    bl = false;
                }
                if (bl) {
                    return true;
                }
                if (nArray != null && (nArray[0] != 0 || nArray[1] != 0 || nArray[2] != 0 || nArray[3] != 0)) {
                    byArray = class34.method676(this.field4578[n], true);
                    object = new class556(byArray);
                    ((class556)object).method10305(nArray, 5, ((class556)object).field5470.length);
                } else {
                    byArray = class34.method676(this.field4578[n], false);
                }
                object = class214.method4920(byArray);
                if (this.field4591) {
                    this.field4578[n] = null;
                }
                if (n2 <= 1) {
                    objectArray[nArray2[0]] = !this.field4589 ? ItemDef.method5587((byte[])object, false) : object;
                    return true;
                }
                int n4 = ((byte[])object).length;
                int n5 = object[--n4] & 0xFF;
                class556 class5562 = new class556((byte[])object);
                int[] nArray3 = new int[n2];
                class5562.field5471 = n4 -= n5 * n2 * 4;
                int n6 = 0;
                while (true) {
                    int n7;
                    int n8;
                    if (n6 >= n5) {
                        byte[][] byArrayArray = new byte[n2][];
                        n8 = 0;
                        while (true) {
                            if (n8 >= n2) {
                                class5562.field5471 = n4;
                                n8 = 0;
                                n7 = 0;
                                while (true) {
                                    if (n7 >= n5) {
                                        n7 = 0;
                                        while (true) {
                                            if (n7 >= n2) {
                                                return true;
                                            }
                                            objectArray[nArray2[n7]] = !this.field4589 ? ItemDef.method5587(byArrayArray[n7], false) : (Object)byArrayArray[n7];
                                            ++n7;
                                        }
                                    }
                                    int n9 = 0;
                                    int n10 = 0;
                                    while (n10 < n2) {
                                        System.arraycopy(object, n8, byArrayArray[n10], nArray3[n10], n9 += class5562.method10440());
                                        int n11 = n10++;
                                        nArray3[n11] = nArray3[n11] + n9;
                                        n8 += n9;
                                    }
                                    ++n7;
                                }
                            }
                            byArrayArray[n8] = new byte[nArray3[n8]];
                            nArray3[n8] = 0;
                            ++n8;
                        }
                    }
                    n8 = 0;
                    n7 = 0;
                    while (n7 < n2) {
                        int n12 = n7++;
                        nArray3[n12] = nArray3[n12] + (n8 += class5562.method10440());
                    }
                    ++n6;
                }
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ct")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="-104")
    public int method7743(String string) {
        string = string.toLowerCase();
        return this.field4579.method10965(class191.method4466(string));
    }

    @ObfuscatedName(value="ci")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;B)I", garbageValue="116")
    public int method7747(int n, String string) {
        string = string.toLowerCase();
        return this.field4586[n].method10965(class191.method4466(string));
    }

    @ObfuscatedName(value="cl")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;S)Z", garbageValue="-20842")
    public boolean method7781(String string, String string2) {
        string = string.toLowerCase();
        string2 = string2.toLowerCase();
        int n = this.field4579.method10965(class191.method4466(string));
        if (n < 0) {
            return false;
        }
        int n2 = this.field4586[n].method10965(class191.method4466(string2));
        return n2 >= 0;
    }

    @ObfuscatedName(value="cw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;I)[B", garbageValue="-10375944")
    public byte[] method7749(String string, String string2) {
        string = string.toLowerCase();
        string2 = string2.toLowerCase();
        int n = this.field4579.method10965(class191.method4466(string));
        int n2 = this.field4586[n].method10965(class191.method4466(string2));
        return this.method7790(n, n2);
    }

    @ObfuscatedName(value="cj")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;I)Z", garbageValue="1876404966")
    public boolean method7750(String string, String string2) {
        string = string.toLowerCase();
        string2 = string2.toLowerCase();
        int n = this.field4579.method10965(class191.method4466(string));
        int n2 = this.field4586[n].method10965(class191.method4466(string2));
        return this.method7730(n, n2);
    }

    @ObfuscatedName(value="cx")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="1088736701")
    public boolean method7751(String string) {
        string = string.toLowerCase();
        int n = this.field4579.method10965(class191.method4466(string));
        return this.method7732(n);
    }

    @ObfuscatedName(value="cd")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="1")
    public void method7752(String string) {
        int n = this.field4579.method10965(class191.method4466(string = string.toLowerCase()));
        if (n < 0) {
            return;
        }
        this.vmethod7727(n);
    }

    @ObfuscatedName(value="cv")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="7")
    public int method7753(String string) {
        string = string.toLowerCase();
        int n = this.field4579.method10965(class191.method4466(string));
        return this.vmethod7734(n);
    }

    @ObfuscatedName(value="gf")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="4")
    static void method7820() {
        client.field564.method3243();
        client.field564.field1456 = 0;
        client.field564.field1450.field5471 = 0;
        client.field564.field1451 = null;
        client.field564.field1458 = null;
        client.field564.field1447 = null;
        client.field564.field1460 = null;
        client.field564.field1452 = 0;
        client.field564.field1454 = 0;
        client.field769 = 0;
        class188.method4443();
        client.field746 = 0;
        client.field744 = 0;
        class34.field189.method2992();
        class87.field1057 = new class530(32);
        class360.method7405(30);
        for (int i = 0; i < 100; ++i) {
            client.field713[i] = true;
        }
        if (client.field564 != null && client.field564.field1446 != null) {
            class324 class3242 = class90.method2629(class322.field3337, client.field564.field1446);
            class3242.field3442.method10300(class194.method4501());
            class3242.field3442.method10266(class128.field1521);
            class3242.field3442.method10266(class363.field4038);
            client.field564.method3257(class3242);
        }
    }
}

