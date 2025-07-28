package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ok")
public class class388
extends class391 {
    @ObfuscatedName(value="as")
    static CRC32 field4540 = new CRC32();
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lsh;")
    class490 field4533;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lsh;")
    class490 field4535;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=2139342699)
    int field4532;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1662195143)
    volatile int field4537 = 0;
    @ObfuscatedName(value="ac")
    boolean field4538 = false;
    @ObfuscatedName(value="au")
    volatile boolean[] field4547;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1014943143)
    int field4539;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=2065943831)
    int field4542;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1727520787)
    int field4531 = -1;
    @ObfuscatedName(value="ak")
    boolean field4544 = false;
    @ObfuscatedName(value="al")
    boolean field4545 = false;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lpa;")
    class392 field4546;

    @ObfuscatedSignature(descriptor="(Lsh;Lsh;Lpa;IZZZZZ)V")
    public class388(class490 class4902, class490 class4903, class392 class3922, int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        super(bl, bl2);
        this.field4533 = class4902;
        this.field4535 = class4903;
        this.field4532 = n;
        this.field4538 = bl3;
        this.field4544 = bl4;
        this.field4545 = bl5;
        this.field4546 = class3922;
        this.field4546.method7825(this, this.field4532);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1720456553")
    public boolean method7674() {
        return this.field4537 == 1;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="0")
    public int method7680() {
        if (!(this.field4537 == 1 || this.field4544 && this.field4537 == 2)) {
            if (this.field4578 != null) {
                return 99;
            }
            int n = this.field4546.method7831(class389.field4550.field4567, this.field4532);
            if (n >= 100) {
                n = 99;
            }
            return n;
        }
        return 100;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1455866633")
    void vmethod7727(int n) {
        this.field4546.method7828(this.field4532, n);
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IS)V", garbageValue="20201")
    void vmethod7738(int n) {
        if (this.field4533 != null && this.field4547 != null && this.field4547[n]) {
            class25.method401(n, this.field4533, this);
        } else {
            this.field4546.method7827(this, this.field4532, n, this.field4581[n], (byte)2, true);
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="9665")
    void method7678() {
        this.field4537 = 2;
        this.field4577 = new int[0];
        this.field4581 = new int[0];
        this.field4593 = new int[0];
        this.field4583 = new int[0];
        this.field4584 = new int[0][];
        this.field4578 = new Object[0];
        this.field4582 = new Object[0][];
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-2080316251")
    void method7673(int n, int n2) {
        this.field4539 = n;
        this.field4542 = n2;
        if (this.field4535 != null) {
            class25.method401(this.field4532, this.field4535, this);
        } else {
            this.field4546.method7827(this, class389.field4550.field4567, this.field4532, this.field4539, (byte)0, true);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I[BZZI)V", garbageValue="-954013354")
    void method7698(int n, byte[] byArray, boolean bl, boolean bl2) {
        if (bl) {
            if (this.field4537 == 1) {
                throw new RuntimeException();
            }
            if (this.field4535 != null) {
                int n2 = this.field4532;
                class490 class4902 = this.field4535;
                class386 class3862 = new class386();
                class3862.field4522 = 0;
                class3862.field5174 = n2;
                class3862.field4523 = byArray;
                class3862.field4521 = class4902;
                Object object = class387.field4527;
                synchronized (object) {
                    class387.field4527.method7998(class3862);
                }
                object = class387.field4530;
                synchronized (object) {
                    if (class387.field4526 == 0) {
                        class387.field4529 = new Thread(new class387());
                        class387.field4529.setDaemon(true);
                        class387.field4529.start();
                        class387.field4529.setPriority(5);
                    }
                    class387.field4526 = 600;
                }
            }
            this.method7818(byArray);
            this.method7681();
        } else {
            byArray[byArray.length - 2] = (byte)(this.field4593[n] >> 8);
            byArray[byArray.length - 1] = (byte)this.field4593[n];
            if (this.field4533 != null) {
                class99.method2784(n, byArray, this.field4533);
                this.field4547[n] = true;
            }
            if (bl2) {
                Object object;
                Object[] objectArray = this.field4578;
                int n3 = n;
                if (byArray == null) {
                    object = null;
                } else if (byArray.length > 136) {
                    class367 class3672 = new class367();
                    ((class365)class3672).vmethod7600(byArray);
                    object = class3672;
                } else {
                    object = byArray;
                }
                objectArray[n3] = object;
            }
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lsh;I[BZB)V", garbageValue="-61")
    void method7692(class490 class4902, int n, byte[] byArray, boolean bl) {
        block17: {
            block18: {
                block19: {
                    int n2;
                    block20: {
                        block21: {
                            block16: {
                                block13: {
                                    block14: {
                                        block15: {
                                            if (class4902 == this.field4535) break block13;
                                            if (!bl && n == this.field4531) {
                                                this.field4537 = 1;
                                            }
                                            if (byArray == null || byArray.length <= 2) break block14;
                                            field4540.reset();
                                            field4540.update(byArray, 0, byArray.length - 2);
                                            int n3 = (int)field4540.getValue();
                                            int n4 = ((byArray[byArray.length - 2] & 0xFF) << 8) + (byArray[byArray.length - 1] & 0xFF);
                                            if (n3 != this.field4581[n] || n4 != this.field4593[n]) break block15;
                                            this.field4547[n] = true;
                                            if (bl) {
                                                Object object;
                                                Object[] objectArray = this.field4578;
                                                int n5 = n;
                                                if (byArray != null) {
                                                    if (byArray.length <= 136) {
                                                        object = byArray;
                                                    } else {
                                                        class367 class3672 = new class367();
                                                        ((class365)class3672).vmethod7600(byArray);
                                                        object = class3672;
                                                    }
                                                } else {
                                                    object = null;
                                                }
                                                objectArray[n5] = object;
                                            }
                                            break block16;
                                        }
                                        this.field4547[n] = false;
                                        if (this.field4538 || bl) {
                                            this.field4546.method7827(this, this.field4532, n, this.field4581[n], (byte)2, bl);
                                        }
                                        return;
                                    }
                                    this.field4547[n] = false;
                                    if (this.field4538 || bl) {
                                        this.field4546.method7827(this, this.field4532, n, this.field4581[n], (byte)2, bl);
                                    }
                                    return;
                                }
                                if (this.field4537 == 1) break block17;
                                if (byArray == null) break block18;
                                field4540.reset();
                                field4540.update(byArray, 0, byArray.length);
                                int n6 = (int)field4540.getValue();
                                if (n6 != this.field4539) break block19;
                                class556 class5562 = new class556(class214.method4920(byArray));
                                n2 = class5562.method10282();
                                if (n2 < 5 || n2 > 7) break block20;
                                int n7 = 0;
                                if (n2 >= 6) {
                                    n7 = class5562.method10440();
                                }
                                if (n7 != this.field4542) break block21;
                                this.method7818(byArray);
                                this.method7681();
                            }
                            return;
                        }
                        this.field4546.method7827(this, class389.field4550.field4567, this.field4532, this.field4539, (byte)0, true);
                        return;
                    }
                    throw new RuntimeException(n2 + "," + this.field4532 + "," + n);
                }
                this.field4546.method7827(this, class389.field4550.field4567, this.field4532, this.field4539, (byte)0, true);
                return;
            }
            this.field4546.method7827(this, class389.field4550.field4567, this.field4532, this.field4539, (byte)0, true);
            return;
        }
        throw new RuntimeException();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-914427665")
    void method7681() {
        int n;
        this.field4547 = new boolean[this.field4578.length];
        for (n = 0; n < this.field4547.length; ++n) {
            this.field4547[n] = false;
        }
        if (this.field4533 == null) {
            this.field4537 = 1;
            return;
        }
        this.field4531 = -1;
        for (n = 0; n < this.field4547.length; ++n) {
            if (this.field4583[n] <= 0) continue;
            class490 class4902 = this.field4533;
            class388 class3882 = this;
            class386 class3862 = new class386();
            class3862.field4522 = 1;
            class3862.field5174 = n;
            class3862.field4521 = class4902;
            class3862.field4524 = class3882;
            Object object = class387.field4527;
            synchronized (object) {
                class387.field4527.method7998(class3862);
            }
            object = class387.field4530;
            synchronized (object) {
                if (class387.field4526 == 0) {
                    class387.field4529 = new Thread(new class387());
                    class387.field4529.setDaemon(true);
                    class387.field4529.start();
                    class387.field4529.setPriority(5);
                }
                class387.field4526 = 600;
            }
            this.field4531 = n;
        }
        if (this.field4531 == -1) {
            this.field4537 = 1;
        }
    }

    @Override
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-78")
    int vmethod7734(int n) {
        if (this.field4578[n] != null) {
            return 100;
        }
        if (this.field4547[n]) {
            return 100;
        }
        return this.field4546.method7831(this.field4532, n);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1285921286")
    public boolean method7720(int n) {
        return this.field4547[n];
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1818002973")
    public boolean method7684(int n) {
        return this.method7814(n) != null;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="187981839")
    public int method7694() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= this.field4578.length) {
                if (n == 0) {
                    return 100;
                }
                n3 = n2 * 100 / n;
                return n3;
            }
            if (this.field4583[n3] > 0) {
                n += 100;
                n2 += this.vmethod7734(n3);
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="1")
    static int method7721(int n, class81 class812, boolean bl) {
        if (n != 6600) {
            if (n != 6601) {
                if (n != 6602) {
                    if (n != 6603) {
                        if (n != 6604) {
                            if (n != 6605) {
                                if (n != 6606) {
                                    if (n != 6607) {
                                        if (n != 6608) {
                                            if (n != 6609) {
                                                if (n != 6610) {
                                                    if (n != 6611) {
                                                        if (n != 6612) {
                                                            if (n != 6613) {
                                                                if (n != 6614) {
                                                                    if (n != 6615) {
                                                                        if (n != 6616) {
                                                                            if (n != 6617) {
                                                                                if (n != 6618) {
                                                                                    if (n != 6619) {
                                                                                        if (n != 6620) {
                                                                                            if (n != 6621) {
                                                                                                if (n != 6622) {
                                                                                                    if (n != 6623) {
                                                                                                        if (n != 6624) {
                                                                                                            if (n != 6625) {
                                                                                                                if (n != 6626) {
                                                                                                                    if (n != 6627) {
                                                                                                                        if (n != 6628) {
                                                                                                                            if (n != 6629) {
                                                                                                                                if (n != 6630) {
                                                                                                                                    if (n != 6631) {
                                                                                                                                        if (n != 6632) {
                                                                                                                                            if (n != 6633) {
                                                                                                                                                if (n != 6634) {
                                                                                                                                                    if (n != 6635) {
                                                                                                                                                        if (n != 6636) {
                                                                                                                                                            if (n != 6637) {
                                                                                                                                                                if (n != 6638) {
                                                                                                                                                                    if (n != 6639) {
                                                                                                                                                                        if (n != 6640) {
                                                                                                                                                                            if (n != 6693) {
                                                                                                                                                                                if (n != 6694) {
                                                                                                                                                                                    int n2;
                                                                                                                                                                                    class236 class2362;
                                                                                                                                                                                    if (n != 6695) {
                                                                                                                                                                                        int n3;
                                                                                                                                                                                        class236 class2363;
                                                                                                                                                                                        if (n != 6696) {
                                                                                                                                                                                            if (n != 6697) {
                                                                                                                                                                                                if (n != 6698) {
                                                                                                                                                                                                    if (n != 6699) {
                                                                                                                                                                                                        return 2;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    class72.field865[++class63.field444 - 1] = class124.field1499.field3285.method7003();
                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                }
                                                                                                                                                                                                class72.field865[++class63.field444 - 1] = class124.field1499.field3283.method7003();
                                                                                                                                                                                                return 1;
                                                                                                                                                                                            }
                                                                                                                                                                                            class72.field865[++class63.field444 - 1] = class124.field1499.field3284;
                                                                                                                                                                                            return 1;
                                                                                                                                                                                        }
                                                                                                                                                                                        class72.field865[++class63.field444 - 1] = (class2363 = class31.method498(n3 = class72.field865[--class63.field444])) != null ? class2363.field2523 : -1;
                                                                                                                                                                                        return 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    class72.field865[++class63.field444 - 1] = (class2362 = class31.method498(n2 = class72.field865[--class63.field444])) != null ? class2362.field2529 : -1;
                                                                                                                                                                                    return 1;
                                                                                                                                                                                }
                                                                                                                                                                                int n4 = class72.field865[--class63.field444];
                                                                                                                                                                                class236 class2364 = class31.method498(n4);
                                                                                                                                                                                class72.field865[++class63.field444 - 1] = class2364.field2527;
                                                                                                                                                                                return 1;
                                                                                                                                                                            }
                                                                                                                                                                            int n5 = class72.field865[--class63.field444];
                                                                                                                                                                            class236 class2365 = class31.method498(n5);
                                                                                                                                                                            class72.field855[++class104.field1343 - 1] = class2365.field2525 != null ? class2365.field2525 : "";
                                                                                                                                                                            return 1;
                                                                                                                                                                        }
                                                                                                                                                                        class302 class3022 = class23.method330().method9883();
                                                                                                                                                                        if (class3022 != null) {
                                                                                                                                                                            class72.field865[++class63.field444 - 1] = class3022.vmethod6438();
                                                                                                                                                                            class72.field865[++class63.field444 - 1] = class3022.field3260.method7003();
                                                                                                                                                                        } else {
                                                                                                                                                                            class72.field865[++class63.field444 - 1] = -1;
                                                                                                                                                                            class72.field865[++class63.field444 - 1] = -1;
                                                                                                                                                                        }
                                                                                                                                                                        return 1;
                                                                                                                                                                    }
                                                                                                                                                                    class302 class3023 = class23.method330().method9777();
                                                                                                                                                                    if (class3023 != null) {
                                                                                                                                                                        class72.field865[++class63.field444 - 1] = class3023.vmethod6438();
                                                                                                                                                                        class72.field865[++class63.field444 - 1] = class3023.field3260.method7003();
                                                                                                                                                                    } else {
                                                                                                                                                                        class72.field865[++class63.field444 - 1] = -1;
                                                                                                                                                                        class72.field865[++class63.field444 - 1] = -1;
                                                                                                                                                                    }
                                                                                                                                                                    return 1;
                                                                                                                                                                }
                                                                                                                                                                int n6 = class72.field865[class63.field444 -= 2];
                                                                                                                                                                class350 class3502 = new class350(class72.field865[class63.field444 + 1]);
                                                                                                                                                                class350 class3503 = class23.method330().method9775(n6, class3502);
                                                                                                                                                                class72.field865[++class63.field444 - 1] = class3503 != null ? class3503.method7003() : -1;
                                                                                                                                                                return 1;
                                                                                                                                                            }
                                                                                                                                                            int n7 = class72.field865[--class63.field444];
                                                                                                                                                            class72.field865[++class63.field444 - 1] = class23.method330().method9772(n7) ? 1 : 0;
                                                                                                                                                            return 1;
                                                                                                                                                        }
                                                                                                                                                        int n8 = class72.field865[--class63.field444];
                                                                                                                                                        class72.field865[++class63.field444 - 1] = class23.method330().method9771(n8) ? 1 : 0;
                                                                                                                                                        return 1;
                                                                                                                                                    }
                                                                                                                                                    class72.field865[++class63.field444 - 1] = class23.method330().method9825() ? 1 : 0;
                                                                                                                                                    return 1;
                                                                                                                                                }
                                                                                                                                                int n9 = class72.field865[class63.field444 -= 2];
                                                                                                                                                boolean bl2 = class72.field865[class63.field444 + 1] == 1;
                                                                                                                                                class23.method330().method9805(n9, bl2);
                                                                                                                                                return 1;
                                                                                                                                            }
                                                                                                                                            int n10 = class72.field865[class63.field444 -= 2];
                                                                                                                                            boolean bl3 = class72.field865[class63.field444 + 1] == 1;
                                                                                                                                            class23.method330().method9841(n10, bl3);
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        boolean bl4 = class72.field865[--class63.field444] == 1;
                                                                                                                                        class23.method330().method9851(bl4);
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    class23.method330().method9762();
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                int n11 = class72.field865[--class63.field444];
                                                                                                                                class23.method330().method9765(n11);
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            int n12 = class72.field865[--class63.field444];
                                                                                                                            class23.method330().method9794(n12);
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        boolean bl5 = class72.field865[--class63.field444] == 1;
                                                                                                                        class23.method330().method9763(bl5);
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    class23.method330().method9874();
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                class23.method330().method9761(class72.field865[--class63.field444]);
                                                                                                                return 1;
                                                                                                            }
                                                                                                            class23.method330().method9760();
                                                                                                            return 1;
                                                                                                        }
                                                                                                        class23.method330().method9759(class72.field865[--class63.field444]);
                                                                                                        return 1;
                                                                                                    }
                                                                                                    class350 class3504 = new class350(class72.field865[--class63.field444]);
                                                                                                    class284 class2842 = class23.method330().method9729(class3504.field3766, class3504.field3764, class3504.field3765);
                                                                                                    class72.field865[++class63.field444 - 1] = class2842 != null ? class2842.method6040() : -1;
                                                                                                    return 1;
                                                                                                }
                                                                                                class72.field865[++class63.field444 - 1] = class23.method330().method9757();
                                                                                                class72.field865[++class63.field444 - 1] = class23.method330().method9774();
                                                                                                return 1;
                                                                                            }
                                                                                            int n13 = class72.field865[class63.field444 -= 2];
                                                                                            class350 class3505 = new class350(class72.field865[class63.field444 + 1]);
                                                                                            class284 class2843 = class23.method330().method9749(n13);
                                                                                            if (class2843 != null) {
                                                                                                class72.field865[++class63.field444 - 1] = class2843.method6035(class3505.field3766, class3505.field3764, class3505.field3765) ? 1 : 0;
                                                                                                return 1;
                                                                                            }
                                                                                            class72.field865[++class63.field444 - 1] = 0;
                                                                                            return 1;
                                                                                        }
                                                                                        int n14 = class72.field865[class63.field444 -= 2];
                                                                                        class350 class3506 = new class350(class72.field865[class63.field444 + 1]);
                                                                                        class88.method2612(n14, class3506, true);
                                                                                        return 1;
                                                                                    }
                                                                                    int n15 = class72.field865[class63.field444 -= 2];
                                                                                    class350 class3507 = new class350(class72.field865[class63.field444 + 1]);
                                                                                    class88.method2612(n15, class3507, false);
                                                                                    return 1;
                                                                                }
                                                                                class350 class3508 = new class350(class72.field865[--class63.field444]);
                                                                                class284 class2844 = class23.method330().method9733();
                                                                                if (class2844 != null) {
                                                                                    class350 class3509 = class2844.method6038(class3508.field3764, class3508.field3765);
                                                                                    class72.field865[++class63.field444 - 1] = class3509 != null ? class3509.method7003() : -1;
                                                                                    return 1;
                                                                                }
                                                                                class72.field865[++class63.field444 - 1] = -1;
                                                                                class72.field865[++class63.field444 - 1] = -1;
                                                                                return 1;
                                                                            }
                                                                            class350 class35010 = new class350(class72.field865[--class63.field444]);
                                                                            class284 class2845 = class23.method330().method9733();
                                                                            if (class2845 != null) {
                                                                                int[] nArray = class2845.method6056(class35010.field3766, class35010.field3764, class35010.field3765);
                                                                                if (nArray != null) {
                                                                                    class72.field865[++class63.field444 - 1] = nArray[0];
                                                                                    class72.field865[++class63.field444 - 1] = nArray[1];
                                                                                } else {
                                                                                    class72.field865[++class63.field444 - 1] = -1;
                                                                                    class72.field865[++class63.field444 - 1] = -1;
                                                                                }
                                                                                return 1;
                                                                            }
                                                                            class72.field865[++class63.field444 - 1] = -1;
                                                                            class72.field865[++class63.field444 - 1] = -1;
                                                                            return 1;
                                                                        }
                                                                        class72.field865[++class63.field444 - 1] = class23.method330().method9739();
                                                                        return 1;
                                                                    }
                                                                    class350 class35011 = class23.method330().method9766();
                                                                    if (class35011 != null) {
                                                                        class72.field865[++class63.field444 - 1] = class35011.field3764;
                                                                        class72.field865[++class63.field444 - 1] = class35011.field3765;
                                                                    } else {
                                                                        class72.field865[++class63.field444 - 1] = -1;
                                                                        class72.field865[++class63.field444 - 1] = -1;
                                                                    }
                                                                    return 1;
                                                                }
                                                                int n16 = class72.field865[--class63.field444];
                                                                class284 class2846 = class23.method330().method9749(n16);
                                                                class72.field865[++class63.field444 - 1] = class2846 != null ? class2846.method6073() : -1;
                                                                return 1;
                                                            }
                                                            int n17 = class72.field865[--class63.field444];
                                                            class284 class2847 = class23.method330().method9749(n17);
                                                            if (class2847 != null) {
                                                                class72.field865[++class63.field444 - 1] = class2847.method6047() * 64;
                                                                class72.field865[++class63.field444 - 1] = class2847.method6049() * 64;
                                                                class72.field865[++class63.field444 - 1] = class2847.method6064() * 64 + 64 - 1;
                                                                class72.field865[++class63.field444 - 1] = class2847.method6050() * 64 + 64 - 1;
                                                            } else {
                                                                class72.field865[++class63.field444 - 1] = 0;
                                                                class72.field865[++class63.field444 - 1] = 0;
                                                                class72.field865[++class63.field444 - 1] = 0;
                                                                class72.field865[++class63.field444 - 1] = 0;
                                                            }
                                                            return 1;
                                                        }
                                                        int n18 = class72.field865[--class63.field444];
                                                        class284 class2848 = class23.method330().method9749(n18);
                                                        if (class2848 != null) {
                                                            class72.field865[++class63.field444 - 1] = (class2848.method6064() - class2848.method6047() + 1) * 64;
                                                            class72.field865[++class63.field444 - 1] = (class2848.method6050() - class2848.method6049() + 1) * 64;
                                                        } else {
                                                            class72.field865[++class63.field444 - 1] = 0;
                                                            class72.field865[++class63.field444 - 1] = 0;
                                                        }
                                                        return 1;
                                                    }
                                                    int n19 = class72.field865[--class63.field444];
                                                    class284 class2849 = class23.method330().method9749(n19);
                                                    class72.field865[++class63.field444 - 1] = class2849 != null ? class2849.method6054().method7003() : 0;
                                                    return 1;
                                                }
                                                class72.field865[++class63.field444 - 1] = class23.method330().method9721();
                                                class72.field865[++class63.field444 - 1] = class23.method330().method9755();
                                                return 1;
                                            }
                                            class350 class35012 = new class350(class72.field865[--class63.field444]);
                                            class23.method330().method9918(class35012.field3766, class35012.field3764, class35012.field3765);
                                            return 1;
                                        }
                                        class350 class35013 = new class350(class72.field865[--class63.field444]);
                                        class23.method330().method9758(class35013.field3766, class35013.field3764, class35013.field3765);
                                        return 1;
                                    }
                                    class350 class35014 = new class350(class72.field865[--class63.field444]);
                                    class23.method330().method9781(class35014.field3764, class35014.field3765);
                                    return 1;
                                }
                                class350 class35015 = new class350(class72.field865[--class63.field444]);
                                class23.method330().method9750(class35015.field3764, class35015.field3765);
                                return 1;
                            }
                            class72.field865[++class63.field444 - 1] = class23.method330().method9748() ? 1 : 0;
                            return 1;
                        }
                        int n20 = class72.field865[--class63.field444];
                        class23.method330().method9743(n20);
                        return 1;
                    }
                    class72.field865[++class63.field444 - 1] = class23.method330().method9899();
                    return 1;
                }
                int n21 = class72.field865[--class63.field444];
                class23.method330().method9731(n21);
                return 1;
            }
            int n22 = class72.field865[--class63.field444];
            String string = "";
            class284 class28410 = class23.method330().method9749(n22);
            if (class28410 != null) {
                string = class28410.method6043();
            }
            class72.field855[++class104.field1343 - 1] = string;
            return 1;
        }
        int n23 = class34.field189.field1321;
        int n24 = (class407.field4693.field1213 >> 7) + class34.field189.field1324;
        int n25 = (class407.field4693.field1196 >> 7) + class34.field189.field1325;
        class23.method330().method9730(n23, n24, n25, true);
        return 1;
    }

    @ObfuscatedName(value="js")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="789896050")
    static final void method7701(int n) {
        int n2;
        int[] nArray = class174.field1834.field5576;
        int n3 = nArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            nArray[n2] = 0;
        }
        n2 = 1;
        while (true) {
            int n4;
            int n5;
            if (n2 >= 103) {
                n2 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
                n5 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
                class174.field1834.method10734();
                n4 = 1;
                while (true) {
                    int n6;
                    if (n4 >= 103) {
                        client.field756 = 0;
                        n4 = 0;
                        while (true) {
                            if (n4 >= 104) {
                                class6.field14.method10693();
                                return;
                            }
                            for (n6 = 0; n6 < 104; ++n6) {
                                long l = class34.field189.field1319.method4203(class34.field189.field1321, n4, n6);
                                if (l == 0L) continue;
                                int n7 = class360.method7406(l);
                                int n8 = class142.method3512((int)n7).field2817;
                                if (n8 < 0 || !class31.method498((int)n8).field2530) continue;
                                client.field719[client.field756] = class31.method498(n8).method5167(false);
                                client.field658[client.field756] = n4;
                                client.field742[client.field756] = n6;
                                ++client.field756;
                            }
                            ++n4;
                        }
                    }
                    for (n6 = 1; n6 < 103; ++n6) {
                        if ((class34.field189.field1337[n][n6][n4] & 0x18) == 0) {
                            class70.method2046(n, n6, n4, n2, n5);
                        }
                        if (n >= 3 || (class34.field189.field1337[n + 1][n6][n4] & 8) == 0) continue;
                        class70.method2046(n + 1, n6, n4, n2, n5);
                    }
                    ++n4;
                }
            }
            n5 = (103 - n2) * 2048 + 24628;
            for (n4 = 1; n4 < 103; ++n4) {
                if ((class34.field189.field1337[n][n4][n2] & 0x18) == 0) {
                    class34.field189.field1319.method4210(nArray, n5, 512, n, n4, n2);
                }
                if (n < 3 && (class34.field189.field1337[n + 1][n4][n2] & 8) != 0) {
                    class34.field189.field1319.method4210(nArray, n5, 512, n + 1, n4, n2);
                }
                n5 += 4;
            }
            ++n2;
        }
    }
}

