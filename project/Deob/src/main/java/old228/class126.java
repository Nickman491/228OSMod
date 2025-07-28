package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ey")
public class class126
extends class475 {
    @ObfuscatedName(value="qw")
    @ObfuscatedSignature(descriptor="Luf;")
    static class539 field1513;
    @ObfuscatedName(value="ay")
    final boolean field1511;

    public class126(boolean bl) {
        this.field1511 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="-1948928075")
    int method3349(class478 class4782, class478 class4783) {
        if (client.field689 == class4782.field5020 && class4783.field5020 == client.field689) {
            return this.field1511 ? class4782.method9161().method10972(class4783.method9161()) : class4783.method9161().method10972(class4782.method9161());
        }
        return this.method9184(class4782, class4783);
    }

    public int compare(Object object, Object object2) {
        return this.method3349((class478)object, (class478)object2);
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="1358990506")
    static int method3354(int n, class81 class812, boolean bl) {
        if (n != 6200) {
            if (n != 6201) {
                if (n != 6202) {
                    if (n != 6203) {
                        if (n != 6204) {
                            if (n != 6205) {
                                if (n != 6220) {
                                    if (n != 6221) {
                                        if (n != 6222) {
                                            if (n != 6223) {
                                                return 2;
                                            }
                                            class72.field865[++class63.field444 - 1] = class363.field4038;
                                            return 1;
                                        }
                                        class72.field865[++class63.field444 - 1] = class128.field1521;
                                        return 1;
                                    }
                                    class72.field865[++class63.field444 - 1] = 0;
                                    return 1;
                                }
                                class72.field865[++class63.field444 - 1] = 0;
                                return 1;
                            }
                            class72.field865[++class63.field444 - 1] = class9.method85(client.field609);
                            class72.field865[++class63.field444 - 1] = class9.method85(client.field656);
                            return 1;
                        }
                        class72.field865[++class63.field444 - 1] = client.field614;
                        class72.field865[++class63.field444 - 1] = client.field771;
                        return 1;
                    }
                    if (client.field687 == null) {
                        class72.field865[++class63.field444 - 1] = -1;
                        class72.field865[++class63.field444 - 1] = -1;
                    } else {
                        class143.method3515(0, 0, client.field687.field3886, client.field687.field3887 * -1528330031, false);
                        class72.field865[++class63.field444 - 1] = client.field778;
                        class72.field865[++class63.field444 - 1] = client.field779;
                    }
                    return 1;
                }
                client.field772 = (short)class72.field865[class63.field444 -= 4];
                if (client.field772 <= 0) {
                    client.field772 = 1;
                }
                if ((client.field773 = (short)class72.field865[class63.field444 + 1]) <= 0) {
                    client.field773 = Short.MAX_VALUE;
                } else if (client.field773 < client.field772) {
                    client.field773 = client.field772;
                }
                client.field702 = (short)class72.field865[class63.field444 + 2];
                if (client.field702 <= 0) {
                    client.field702 = 1;
                }
                if ((client.field775 = (short)class72.field865[class63.field444 + 3]) <= 0) {
                    client.field775 = Short.MAX_VALUE;
                } else if (client.field775 < client.field702) {
                    client.field775 = client.field702;
                }
                return 1;
            }
            client.field614 = (short)class72.field865[class63.field444 -= 2];
            if (client.field614 <= 0) {
                client.field614 = (short)256;
            }
            if ((client.field771 = (short)class72.field865[class63.field444 + 1]) <= 0) {
                client.field771 = (short)320;
            }
            return 1;
        }
        client.field609 = (short)class148.method3575(class72.field865[class63.field444 -= 2]);
        if (client.field609 <= 0) {
            client.field609 = (short)256;
        }
        if ((client.field656 = (short)class148.method3575(class72.field865[class63.field444 + 1])) <= 0) {
            client.field656 = (short)256;
        }
        return 1;
    }
}

