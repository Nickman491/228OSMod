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

@ObfuscatedName(value="dl")
public class class86 {
    @ObfuscatedName(value="kt")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static class570[] field1054;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lok;")
    final class388 field1056;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=806302351)
    final int field1051;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1027900291)
    int field1055 = 0;

    @ObfuscatedSignature(descriptor="(Lok;Ljava/lang/String;)V")
    class86(class388 class3882, String string) {
        this.field1056 = class3882;
        this.field1051 = class3882.method7812();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1114413689")
    boolean method2580() {
        this.field1055 = 0;
        int n = 0;
        while (n < this.field1051) {
            if (!this.field1056.method7684(n) || this.field1056.method7720(n)) {
                ++this.field1055;
            }
            ++n;
        }
        return this.field1055 >= this.field1051;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Ltl;", garbageValue="-1280910138")
    static class495[] method2586() {
        return new class495[]{class495.field5119, class495.field5125, class495.field5121, class495.field5122};
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="0")
    static final boolean method2587(int n) {
        boolean bl;
        boolean bl2;
        boolean bl3 = n != 14 && n != 15 && (n < 44 || n > 51) ? false : (bl2 = true);
        boolean bl4 = !(bl2 || class212.method4905(n) || class358.method7125(n) || class544.method10126(n)) ? false : (bl = true);
        if (!bl) {
            boolean bl5;
            bl = bl5 = n == 1002 || n == 1003 || n == 1004;
        }
        return bl;
    }

    @ObfuscatedName(value="gk")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="688799447")
    static void method2581() {
        if (client.field533 != class95.field1157) {
            if (class95.field1151 != client.field533) {
                if (class95.field1150 != client.field533) {
                    if (class95.field1154 != client.field533) {
                        if (client.field533 != class95.field1155) {
                            if (client.field533 != class95.field1160) {
                                class388 class3882;
                                if (class95.field1153 != client.field533) {
                                    if (client.field533 != class95.field1152) {
                                        if (class95.field1165 != client.field533) {
                                            if (class95.field1149 != client.field533) {
                                                if (client.field533 != class95.field1148) {
                                                    if (class95.field1158 != client.field533) {
                                                        if (class95.field1159 != client.field533) {
                                                            if (class95.field1156 != client.field533) {
                                                                if (client.field533 != class95.field1161) {
                                                                    if (client.field533 != class95.field1162) {
                                                                        if (client.field533 != class95.field1163) {
                                                                            if (class95.field1164 == client.field533) {
                                                                                client.field765 = false;
                                                                                class360.method7405(20);
                                                                                class22.method327(class68.field474);
                                                                            }
                                                                            return;
                                                                        }
                                                                        if (class157.field1718.method7812() > 0 && !class157.field1718.method7751(class303.field3264.field3268)) {
                                                                            class74.method2357(100, "Loading world map - " + class157.field1718.method7753(class303.field3264.field3268) / 10 + "%");
                                                                            return;
                                                                        }
                                                                        if (class420.field4722 == null) {
                                                                            class420.field4722 = new class524();
                                                                            class420.field4722.method9719(class157.field1718, class259.field2746, class137.field1603, class74.field892, client.field568, class155.field1709);
                                                                        }
                                                                        class74.method2357(100, "Loaded world map");
                                                                        if (!class273.field3035) {
                                                                            class227.method5078(class95.field1160);
                                                                        } else {
                                                                            class227.method5078(class95.field1164);
                                                                        }
                                                                        client.field512 = false;
                                                                        return;
                                                                    }
                                                                    if (class45.field291.method7733()) {
                                                                        if (class88.field1069.method7733()) {
                                                                            if (class167.field1793.method7733()) {
                                                                                if (class220.field2408.method7733()) {
                                                                                    class74.method2357(98, "Loaded interfaces");
                                                                                    if (class167.field1793.method7781("version.dat", "")) {
                                                                                        class556 class5562 = new class556(class167.field1793.method7749("version.dat", ""));
                                                                                        class5562.method10307();
                                                                                    }
                                                                                    class227.method5078(class95.field1163);
                                                                                    return;
                                                                                }
                                                                                class74.method2357(96, "Loading interfaces - " + (96 + class220.field2408.method7694() / 50) + "%");
                                                                                return;
                                                                            }
                                                                            class74.method2357(96, "Loading interfaces - " + (80 + class167.field1793.method7694() / 6) + "%");
                                                                            return;
                                                                        }
                                                                        class74.method2357(96, "Loading interfaces - " + class88.field1069.method7694() * 4 / 5 + "%");
                                                                        return;
                                                                    }
                                                                    class74.method2357(96, "Loading interfaces - " + class45.field291.method7694() * 4 / 5 + "%");
                                                                    return;
                                                                }
                                                                if (class166.field1785.method7750("huffman", "")) {
                                                                    class363 class3632 = new class363(class166.field1785.method7749("huffman", ""));
                                                                    class109.method3111(class3632);
                                                                    class74.method2357(94, "Loaded wordpack");
                                                                    class227.method5078(class95.field1162);
                                                                    return;
                                                                }
                                                                class74.method2357(94, "Loading wordpack - " + 0 + "%");
                                                                return;
                                                            }
                                                            class168.field1794 = new class91();
                                                            class34.field156.method4912(class168.field1794, 10);
                                                            class74.method2357(92, "Loaded input handler");
                                                            class227.method5078(class95.field1161);
                                                            return;
                                                        }
                                                        int n = class19.field82.method4472();
                                                        if (n >= 100) {
                                                            class74.method2357(90, "Loaded textures");
                                                            class227.method5078(class95.field1156);
                                                            return;
                                                        }
                                                        class74.method2357(80, "Loading textures - " + n + "%");
                                                        return;
                                                    }
                                                    if (class252.field2704.method7733()) {
                                                        class19.field82 = new class194(class252.field2704, class42.field276, 20, class544.field5403.method2941(), client.field502 ? 64 : 128);
                                                        class182.method4003(class19.field82);
                                                        class182.method4004(class544.field5403.method2941());
                                                        class227.method5078(class95.field1159);
                                                        return;
                                                    }
                                                    class74.method2357(70, "Loading textures - " + "0%");
                                                    return;
                                                }
                                                int n = 0;
                                                if (class348.field3758 == null) {
                                                    class348.field3758 = class83.method2509(class42.field276, class30.field133.field5116, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class213.field2371 == null) {
                                                    class213.field2371 = class83.method2509(class42.field276, class30.field133.field5106, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class155.field1709 == null) {
                                                    class155.field1709 = class16.method213(class42.field276, class30.field133.field5102, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class128.field1520 == null) {
                                                    class128.field1520 = class486.method9404(class42.field276, class30.field133.field5103, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class10.field47 == null) {
                                                    class10.field47 = class486.method9404(class42.field276, class30.field133.field5104, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class44.field288 == null) {
                                                    class44.field288 = class486.method9404(class42.field276, class30.field133.field5105, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class140.field1626 == null) {
                                                    class140.field1626 = class486.method9404(class42.field276, class30.field133.field5108, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (field1054 == null) {
                                                    field1054 = class486.method9404(class42.field276, class30.field133.field5107, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class464.field4957 == null) {
                                                    class464.field4957 = class486.method9404(class42.field276, class30.field133.field5100, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class283.field3094 == null) {
                                                    class283.field3094 = class16.method213(class42.field276, class30.field133.field5109, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class70.field829 == null) {
                                                    class70.field829 = class16.method213(class42.field276, class30.field133.field5110, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (n >= 11) {
                                                    class439.field4835 = class70.field829;
                                                    class213.field2371.method10735();
                                                    int n2 = (int)(Math.random() * 21.0) - 10;
                                                    int n3 = (int)(Math.random() * 21.0) - 10;
                                                    int n4 = (int)(Math.random() * 21.0) - 10;
                                                    int n5 = (int)(Math.random() * 41.0) - 20;
                                                    class155.field1709[0].method10709(n2 + n5, n3 + n5, n5 + n4);
                                                    class74.method2357(60, "Loaded sprites");
                                                    class227.method5078(class95.field1158);
                                                    return;
                                                }
                                                class74.method2357(70, "Loading sprites - " + n * 100 / 12 + "%");
                                                return;
                                            }
                                            if (class268.field2973.method7733()) {
                                                if (HitSplatDef.field2777.method7733()) {
                                                    class151.method3608(class268.field2973);
                                                    class388 class3883 = class268.field2973;
                                                    class253.field2706 = class3883;
                                                    class388 class3884 = class268.field2973;
                                                    class388 class3885 = class59.field398;
                                                    class238.field2562 = class3884;
                                                    class238.field2554 = class3885;
                                                    class238.field2550 = class238.field2562.method7740(3);
                                                    class136.method3476(class268.field2973, class59.field398, client.field502);
                                                    class448.method8875(class268.field2973, class59.field398);
                                                    class388 class3886 = class268.field2973;
                                                    class259.field2745 = class3886;
                                                    class108.method3099(class268.field2973, class59.field398, client.field796, class526.field5319);
                                                    class243.method5285(class268.field2973, class494.field5117, class188.field2104);
                                                    class491.method9488(class268.field2973, class59.field398);
                                                    class388 class3887 = class268.field2973;
                                                    class431.field4781 = class3887;
                                                    class392.method7840(class268.field2973);
                                                    class170.field1807 = new class352(class45.field291, class59.field398, class42.field276, class220.field2408, class88.field1069);
                                                    class25.method373(class268.field2973);
                                                    class167.method3811(class268.field2973);
                                                    URLLoader.method3282(class268.field2973);
                                                    class388 class3888 = class268.field2973;
                                                    class229.method5120(class268.field2973);
                                                    class388 class3889 = class268.field2973;
                                                    class547.field5408 = class3889;
                                                    class494.method9495(class268.field2973);
                                                    class18.field75 = new class539(class259.field2749, 54, class63.field446, class268.field2973);
                                                    class126.field1513 = new class539(class259.field2749, 47, class63.field446, class268.field2973);
                                                    class19.field80 = new class114();
                                                    class94.method2704(class268.field2973, class42.field276, class220.field2408);
                                                    class89.method2618(class268.field2973, class42.field276);
                                                    class297.method6398(class268.field2973, class42.field276);
                                                    class74.method2357(50, "Loaded config");
                                                    class227.method5078(class95.field1148);
                                                    return;
                                                }
                                                class74.method2357(40, "Loading config - " + (80 + class167.field1793.method7694() / 6) + "%");
                                                return;
                                            }
                                            class74.method2357(40, "Loading config - " + class268.field2973.method7694() + "%");
                                            return;
                                        }
                                        class30.field131 = class34.field189 = client.field508.method2712(104, 104, class544.field5403.method2902());
                                        class174.field1834 = new class570(512, 512);
                                        class74.method2357(30, "Starting game engine...");
                                        class227.method5078(class95.field1149);
                                        return;
                                    }
                                    int n = 0;
                                    n += class494.field5117.method7680() * 5 / 100;
                                    n += class188.field2104.method7680() * 2 / 100;
                                    n += class268.field2973.method7680() / 100;
                                    n += class45.field291.method7680() / 100;
                                    n += class68.field494.method7680() * 10 / 100;
                                    n += class59.field398.method7680() * 65 / 100;
                                    n += class252.field2704.method7680() / 100;
                                    n += class283.field3102.method7680() / 100;
                                    n += class167.field1793.method7680() * 6 / 100;
                                    n += class157.field1718.method7680() / 100;
                                    n += class259.field2746.method7680() * 2 / 100;
                                    n += class137.field1603.method7680() * 2 / 100;
                                    n += HitSplatDef.field2777.method7680() / 100;
                                    if ((n += class88.field1069.method7680() * 2 / 100) == 100) {
                                        class34.method677(class494.field5117, "Animations");
                                        class34.method677(class188.field2104, "Skeletons");
                                        class34.method677(class68.field494, "Maps");
                                        class34.method677(class59.field398, "Models");
                                        class34.method677(class283.field3102, "Music Jingles");
                                        class34.method677(class157.field1718, "World Map");
                                        class34.method677(class259.field2746, "World Map Geography");
                                        class34.method677(class137.field1603, "World Map Ground");
                                        class74.method2357(30, "Loaded update list");
                                        class227.method5078(class95.field1165);
                                        return;
                                    }
                                    if (n != 0) {
                                        class74.method2357(30, "Checking for updates - " + n + "%");
                                    }
                                    return;
                                }
                                class494.field5117 = class92.method2644(class389.field4549.field4567, false, true, true, false);
                                class188.field2104 = class92.method2644(class389.field4558.field4567, false, true, true, false);
                                class268.field2973 = class92.method2644(class389.field4571.field4567, true, false, true, false);
                                class45.field291 = class92.method2644(class389.field4552.field4567, false, true, true, false);
                                class68.field494 = class92.method2644(class389.field4554.field4567, true, true, true, false);
                                class59.field398 = class92.method2644(class389.field4565.field4567, false, true, true, false);
                                class252.field2704 = class92.method2644(class389.field4553.field4567, false, true, true, false);
                                class283.field3102 = class92.method2644(class389.field4560.field4567, false, true, true, false);
                                class167.field1793 = class92.method2644(class389.field4561.field4567, false, true, true, false);
                                class259.field2746 = class92.method2644(class389.field4566.field4567, false, true, true, false);
                                class157.field1718 = class92.method2644(class389.field4551.field4567, false, true, true, false);
                                class137.field1603 = class92.method2644(class389.field4568.field4567, false, true, true, false);
                                HitSplatDef.field2777 = class92.method2644(class389.field4569.field4567, false, true, true, false);
                                int n = class389.field4570.field4567;
                                class490 class4902 = null;
                                if (class216.field2393 != null) {
                                    class4902 = new class490(n, class216.field2393, class121.field1484[n], 1000000);
                                }
                                class88.field1069 = class3882 = new class388(class4902, class37.field227, HitSplatDef.field2760, n, false, true, true, true, true);
                                class74.method2357(20, "Connecting to update server");
                                class227.method5078(class95.field1152);
                                return;
                            }
                            class360.method7405(10);
                            return;
                        }
                        class388 class38810 = class166.field1785;
                        class388 class38811 = class42.field276;
                        int n = 0;
                        String[] stringArray = class78.field956;
                        int n6 = 0;
                        while (true) {
                            String string;
                            if (n6 >= stringArray.length) {
                                stringArray = class78.field960;
                                n6 = 0;
                                while (true) {
                                    if (n6 >= stringArray.length) {
                                        stringArray = class78.field958;
                                        n6 = 0;
                                        while (true) {
                                            if (n6 >= stringArray.length) {
                                                int n7;
                                                n = n7 = n;
                                                class388 class38812 = class42.field276;
                                                int n8 = class78.field960.length + class78.field956.length;
                                                String[] stringArray2 = class78.field958;
                                                int n9 = 0;
                                                while (true) {
                                                    if (n9 >= stringArray2.length) {
                                                        int n10 = n8;
                                                        if (n >= (n8 = n10)) {
                                                            class74.method2357(100, "Loaded title screen");
                                                            if (!class273.field3035) {
                                                                class227.method5078(class95.field1153);
                                                            } else {
                                                                class360.method7405(5);
                                                                class227.method5078(class95.field1160);
                                                            }
                                                            return;
                                                        }
                                                        class74.method2357(90, "Loading title screen - " + n * 100 / n8 + "%");
                                                        return;
                                                    }
                                                    String string2 = stringArray2[n9];
                                                    if (class38812.method7743(string2) != -1) {
                                                        ++n8;
                                                    }
                                                    ++n9;
                                                }
                                            }
                                            string = stringArray[n6];
                                            if (class38811.method7743(string) != -1 && class38811.method7750(string, "")) {
                                                ++n;
                                            }
                                            ++n6;
                                        }
                                    }
                                    string = stringArray[n6];
                                    if (class38811.method7750(string, "")) {
                                        ++n;
                                    }
                                    ++n6;
                                }
                            }
                            string = stringArray[n6];
                            if (class38810.method7750(string, "")) {
                                ++n;
                            }
                            ++n6;
                        }
                    }
                    if (class249.field2674 == null) {
                        class249.field2674 = new class525(class42.field276, class220.field2408);
                    }
                    int n = class526.method9935().length;
                    client.field568 = class249.field2674.method9927(class526.method9935());
                    if (client.field568.size() >= n) {
                        class526.field5319 = (class435)client.field568.get(class526.field5312);
                        class100.field1278 = (class435)client.field568.get(class526.field5322);
                        class74.field892 = (class435)client.field568.get(class526.field5313);
                        class437.field4816 = client.field686.vmethod9665();
                        class74.method2357(80, "Loaded fonts");
                        class227.method5078(class95.field1155);
                        return;
                    }
                    class74.method2357(80, "Loading fonts - " + client.field568.size() * 100 / n + "%");
                    return;
                }
                boolean bl = !client.field502;
                class42.field257 = 22050;
                class42.field264 = bl;
                class328.field3605 = 2;
                ArrayList<class334> arrayList = new ArrayList<class334>(3);
                class328.field3606 = class241.method5262(class34.field156, 0, 2048);
                class476.field5014 = new class38();
                class38 class3810 = new class38();
                class3810.method741(class476.field5014);
                int n = 0;
                while (true) {
                    if (n >= 3) {
                        class328.field3606.method849(class3810);
                        class455.method8939(class161.field1762, class221.field2421, class69.field815, arrayList);
                        class64.field457 = new class57(22050, class42.field257);
                        class74.method2357(60, "Prepared sound engine");
                        class227.method5078(class95.field1154);
                        return;
                    }
                    class334 class3342 = new class334(class328.field3606);
                    class3342.method6719(9, 128);
                    class3810.method741(class3342);
                    arrayList.add(class3342);
                    ++n;
                }
            }
            int n = 0;
            n += class69.field815.method7680() * 53 / 100;
            n += class544.field5399.method7680() * 5 / 100;
            n += class42.field276.method7680() * 36 / 100;
            n += class166.field1785.method7680() / 100;
            n += class220.field2408.method7680() / 100;
            n += class221.field2421.method7680() * 2 / 100;
            n += class161.field1762.method7680() / 100;
            if ((n += class191.field2120.method7674() && class191.field2120.method7733() ? 1 : 0) == 100) {
                class34.method677(class69.field815, "Sound FX");
                class34.method677(class544.field5399, "Music Tracks");
                class34.method677(class42.field276, "Sprites");
                class34.method677(class221.field2421, "Music Samples");
                class34.method677(class161.field1762, "Music Patches");
                class30.field133 = new class494();
                class30.field133.method9494(class191.field2120);
                class74.method2357(40, "Loaded update list");
                class227.method5078(class95.field1150);
                return;
            }
            if (n != 0) {
                class74.method2357(30, "Checking for updates - " + n + "%");
            }
            return;
        }
        class69.field815 = class92.method2644(class389.field4556.field4567, false, true, true, false);
        class544.field5399 = class92.method2644(class389.field4555.field4567, true, true, true, false);
        class42.field276 = class92.method2644(class389.field4557.field4567, false, true, true, false);
        class166.field1785 = class92.method2644(class389.field4559.field4567, false, true, true, false);
        class220.field2408 = class92.method2644(class389.field4562.field4567, true, false, true, false);
        class221.field2421 = class92.method2644(class389.field4563.field4567, false, true, true, false);
        class161.field1762 = class92.method2644(class389.field4564.field4567, false, true, true, false);
        class191.field2120 = class92.method2644(class389.field4548.field4567, true, true, true, false);
        class74.method2357(20, "Connecting to update server");
        class227.method5078(class95.field1151);
    }

    @ObfuscatedName(value="le")
    @ObfuscatedSignature(descriptor="(III)Ljava/lang/String;", garbageValue="589124194")
    static final String method2584(int n, int n2) {
        int n3 = n2 - n;
        if (n3 < -9) {
            return class97.method2752(0xFF0000);
        }
        if (n3 < -6) {
            return class97.method2752(0xFF3000);
        }
        if (n3 < -3) {
            return class97.method2752(0xFF7000);
        }
        if (n3 < 0) {
            return class97.method2752(0xFFB000);
        }
        if (n3 > 9) {
            return class97.method2752(65280);
        }
        if (n3 > 6) {
            return class97.method2752(0x40FF00);
        }
        if (n3 > 3) {
            return class97.method2752(0x80FF00);
        }
        if (n3 > 0) {
            return class97.method2752(0xC0FF00);
        }
        return class97.method2752(0xFFFF00);
    }

    @ObfuscatedName(value="mk")
    @ObfuscatedSignature(descriptor="([Lna;IIIZI)V", garbageValue="1382423197")
    static void method2588(class361[] class361Array, int n, int n2, int n3, boolean bl) {
        int n4 = 0;
        while (n4 < class361Array.length) {
            class361 class3612 = class361Array[n4];
            if (class3612 != null && class3612.field4026 == n) {
                class394.method7872(class3612, n2, n3, bl);
                class86.method2585(class3612, n2, n3);
                if (class3612.field3987 > class3612.field3894 - class3612.field3886) {
                    class3612.field3987 = class3612.field3894 - class3612.field3886;
                }
                if (class3612.field3987 < 0) {
                    class3612.field3987 = 0;
                }
                if (class3612.field3899 > class3612.field3895 - class3612.field3887 * -1528330031) {
                    class3612.field3899 = class3612.field3895 - class3612.field3887 * -1528330031;
                }
                if (class3612.field3899 < 0) {
                    class3612.field3899 = 0;
                }
                if (class3612.field3873 == 0) {
                    class244.method5286(class361Array, class3612, bl);
                }
            }
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="mt")
    @ObfuscatedSignature(descriptor="(Lna;IIB)V", garbageValue="17")
    static void method2585(class361 class3612, int n, int n2) {
        class3612.field3884 = class3612.field3876 == 0 ? class3612.field3880 : (class3612.field3876 == 1 ? class3612.field3880 + (n - class3612.field3886) / 2 : (class3612.field3876 == 2 ? n - class3612.field3886 - class3612.field3880 : (class3612.field3876 == 3 ? class3612.field3880 * n >> 14 : (class3612.field3876 == 4 ? (class3612.field3880 * n >> 14) + (n - class3612.field3886) / 2 : n - class3612.field3886 - (class3612.field3880 * n >> 14)))));
        class3612.field3885 = class3612.field3877 == 0 ? class3612.field3926 : (class3612.field3877 == 1 ? (n2 - class3612.field3887 * -1528330031) / 2 + class3612.field3926 : (class3612.field3877 == 2 ? n2 - class3612.field3887 * -1528330031 - class3612.field3926 : (class3612.field3877 == 3 ? n2 * class3612.field3926 >> 14 : (class3612.field3877 == 4 ? (n2 * class3612.field3926 >> 14) + (n2 - class3612.field3887 * -1528330031) / 2 : n2 - class3612.field3887 * -1528330031 - (n2 * class3612.field3926 >> 14)))));
    }
}

