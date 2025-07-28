package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gg")
public class class156
extends class166 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1538274283)
    int field1712 = -1;
    @ObfuscatedName(value="ah")
    byte field1710;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1511951237)
    int field1711;
    @ObfuscatedName(value="ao")
    String field1713;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class156(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(class556 class5562) {
        this.field1712 = class5562.method10307();
        this.field1710 = class5562.method10524();
        this.field1711 = class5562.method10307();
        class5562.method10273();
        this.field1713 = class5562.method10290();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(class170 class1702) {
        class152 class1522 = (class152)class1702.field1808.get(this.field1712);
        class1522.field1686 = this.field1710;
        class1522.field1687 = this.field1711;
        class1522.field1685 = new class579(this.field1713);
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="61")
    static int method3638(int n, class81 class812, boolean bl) {
        int n2;
        class548 class5482;
        block38: {
            block39: {
                int n3;
                int n4;
                block41: {
                    Object[] objectArray;
                    int n5;
                    int[] nArray;
                    class547 class5472;
                    class549 class5492;
                    int n6;
                    int n7;
                    block40: {
                        if (n == 7500) break block38;
                        if (n == 7501) break block39;
                        if (n != 7502) {
                            if (n != 7503) {
                                int n8;
                                class548 class5483;
                                if (n != 7504) {
                                    if (n != 7505) {
                                        if (n != 7506) {
                                            if (n != 7507) {
                                                return 2;
                                            }
                                            int n9 = class72.field865[--class63.field444];
                                            Object object = class4.method17(n9);
                                            int n10 = class72.field865[--class63.field444];
                                            class548 class5484 = class45.method892(n10);
                                            if (class5484 != null) {
                                                if (class244.method5288(n10) == client.field790) {
                                                    if (class230.field2489 == null && class230.field2489.isEmpty()) {
                                                        throw new RuntimeException();
                                                    }
                                                    int n11 = class208.method4819(n10);
                                                    List list = class5484.method10168(object, n11);
                                                    class230.field2489 = new LinkedList(class230.field2489);
                                                    if (list == null) {
                                                        class230.field2489.clear();
                                                    } else {
                                                        class230.field2489.retainAll(list);
                                                    }
                                                    class261.field2784 = class230.field2489.iterator();
                                                    if (n == 7507) {
                                                        class72.field865[++class63.field444 - 1] = class230.field2489.size();
                                                    }
                                                    return 1;
                                                }
                                                throw new RuntimeException();
                                            }
                                            throw new RuntimeException();
                                        }
                                        int n12 = class72.field865[--class63.field444];
                                        int n13 = -1;
                                        if (class230.field2489 != null && n12 >= 0 && n12 < class230.field2489.size()) {
                                            n13 = (Integer)class230.field2489.get(n12);
                                        }
                                        class72.field865[++class63.field444 - 1] = n13;
                                        return 1;
                                    }
                                    int n14 = class72.field865[--class63.field444];
                                    class549 class5493 = class28.method463(n14);
                                    class72.field865[++class63.field444 - 1] = class5493.field5419;
                                    return 1;
                                }
                                if ((class5483 = class454.method8935(n8 = class72.field865[--class63.field444])) != null) {
                                    class230.field2489 = class5483.method10168(0, 0);
                                    int n15 = 0;
                                    if (class230.field2489 != null) {
                                        client.field790 = n8;
                                        class261.field2784 = class230.field2489.iterator();
                                        n15 = class230.field2489.size();
                                    }
                                    if (n == 7504) {
                                        class72.field865[++class63.field444 - 1] = n15;
                                    }
                                    return 1;
                                }
                                throw new RuntimeException();
                            }
                            int n16 = class72.field865[class63.field444 -= 2];
                            int n17 = class72.field865[class63.field444 + 1];
                            int n18 = 0;
                            int n19 = class244.method5288(n17);
                            int n20 = class384.method7653(n17);
                            class549 class5494 = class28.method463(n16);
                            class547 class5473 = class387.method7671(n19);
                            int[] nArray2 = class5473.field5407[n20];
                            Object[] objectArray2 = class5494.method10171(n20);
                            if (objectArray2 == null && class5473.field5410 != null) {
                                objectArray2 = class5473.field5410[n20];
                            }
                            if (objectArray2 != null) {
                                n18 = objectArray2.length / nArray2.length;
                            }
                            class72.field865[++class63.field444 - 1] = n18;
                            return 1;
                        }
                        int n21 = class72.field865[class63.field444 -= 3];
                        int n22 = class72.field865[class63.field444 + 1];
                        n7 = class72.field865[class63.field444 + 2];
                        int n23 = class244.method5288(n22);
                        n6 = class384.method7653(n22);
                        n4 = class208.method4819(n22);
                        class5492 = class28.method463(n21);
                        class5472 = class387.method7671(n23);
                        nArray = class5472.field5407[n6];
                        n5 = 0;
                        n3 = nArray.length;
                        if (n4 < 0) break block40;
                        if (n4 >= n3) break block41;
                        n5 = n4;
                        n3 = n4 + 1;
                    }
                    if ((objectArray = class5492.method10171(n6)) == null && class5472.field5410 != null) {
                        objectArray = class5472.field5410[n6];
                    }
                    if (objectArray != null) {
                        int n24 = objectArray.length / nArray.length;
                        if (n7 >= 0 && n7 < n24) {
                            int n25 = n5;
                            while (true) {
                                if (n25 >= n3) {
                                    return 1;
                                }
                                int n26 = n25 + nArray.length * n7;
                                class544 class5442 = class242.method5280(nArray[n25]);
                                if (class5442 == class544.field5393) {
                                    class72.field855[++class104.field1343 - 1] = (String)objectArray[n26];
                                } else {
                                    class72.field865[++class63.field444 - 1] = (Integer)objectArray[n26];
                                }
                                ++n25;
                            }
                        }
                        throw new RuntimeException();
                    }
                    int n27 = n5;
                    while (true) {
                        if (n27 >= n3) {
                            return 1;
                        }
                        int n28 = nArray[n27];
                        class544 class5443 = class242.method5280(n28);
                        if (class5443 == class544.field5393) {
                            class72.field855[++class104.field1343 - 1] = "";
                        } else {
                            class72.field865[++class63.field444 - 1] = class485.method9377(n28);
                        }
                        ++n27;
                    }
                }
                throw new RuntimeException("Tuple index out-of-bounds. Requested: " + n4 + ", Max: " + n3);
            }
            class72.field865[++class63.field444 - 1] = class261.field2784 != null && class261.field2784.hasNext() ? (Integer)class261.field2784.next() : -1;
            return 1;
        }
        int n29 = class72.field865[--class63.field444];
        Object object = class4.method17(n29);
        if ((class5482 = class45.method892(n2 = class72.field865[--class63.field444])) != null) {
            int n30 = class208.method4819(n2);
            class230.field2489 = class5482.method10168(object, n30);
            if (class230.field2489 == null) {
                client.field790 = -1;
                class261.field2784 = null;
                if (n == 7500) {
                    class72.field865[++class63.field444 - 1] = 0;
                }
            } else {
                client.field790 = class244.method5288(n2);
                class261.field2784 = class230.field2489.iterator();
                if (n == 7500) {
                    class72.field865[++class63.field444 - 1] = class230.field2489.size();
                }
            }
            return 1;
        }
        throw new RuntimeException();
    }
}

