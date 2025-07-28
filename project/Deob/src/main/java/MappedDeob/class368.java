/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ow")
public class class368 {
    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="lc")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1711334686")
    @Export(value="addSceneMenuOptions")
    static final void addSceneMenuOptions(int n, int n2, int n3, int n4) {
        if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
            class77.method2366(n - n3, n2 - n4);
        }
        long l = -1L;
        int n5 = 0;
        long l2 = -1L;
        int n6 = 0;
        while (true) {
            block54: {
                int n7;
                Object object;
                Object object2;
                Object object3;
                int n8;
                class103 class1032;
                int n9;
                int n10;
                int n11;
                int n12;
                block62: {
                    int n13;
                    block63: {
                        int n14;
                        Object object4;
                        int n15;
                        block57: {
                            block58: {
                                block50: {
                                    block51: {
                                        int n16;
                                        int n17;
                                        long l3;
                                        block53: {
                                            block52: {
                                                if (n6 >= class319.method6609()) break block52;
                                                l3 = class141.method3506(n6);
                                                if (l2 != l3) break block53;
                                                break block54;
                                            }
                                            if (-1L != l) {
                                                int n18;
                                                n6 = ClientPreferences.method2988(l);
                                                int n19 = n18 = (int)(l >>> 7 & 0x7FL);
                                                Player player = GameEngine.field189.field1329[Client.combatTargetPlayerIndex];
                                                class53.method1132(player, Client.combatTargetPlayerIndex, n6, n19, n5);
                                            }
                                            return;
                                        }
                                        l2 = l3;
                                        n12 = n17 = ClientPreferences.method2988(ViewportMouse.ViewportMouse_entityTags[n6]);
                                        n11 = class148.method3577(n6);
                                        n10 = FontName.method9937(n6);
                                        n13 = class20.method307(n6);
                                        int n20 = DevicePcmPlayerProvider.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[n6]);
                                        n9 = n20;
                                        if (n9 == 2047) {
                                            n9 = -1;
                                        }
                                        class480 class4802 = null;
                                        class1032 = null;
                                        if (n9 >= 0 && GameEngine.field189.field1318[n9] != null) {
                                            class4802 = GameEngine.field189.field1318[n9];
                                            class1032 = class4802.field5035;
                                        } else if (n9 == -1) {
                                            class4802 = null;
                                            class1032 = GameEngine.field189;
                                        }
                                        if (class1032 == null) break block54;
                                        n8 = -1;
                                        if (n9 == class148.field1676) {
                                            n8 = class1032.field1321;
                                        } else if (class148.field1676 == -1) {
                                            n8 = class4802.field5027;
                                        } else {
                                            object3 = GameEngine.field189.field1318[class148.field1676];
                                            object2 = ((class480)object3).field5035;
                                            if (((class480)object3).field5027 == ((class103)object2).field1321) {
                                                n8 = n9 == -1 ? GameEngine.field189.field1318[class148.field1676].vmethod9290() : class4802.field5027;
                                            }
                                        }
                                        if ((n8 = (n16 = n8)) == -1) break block54;
                                        if (n10 != 2 || class1032.field1319.method4192(n8, n12, n11, l3) < 0) break block50;
                                        object3 = class142.getObjectDefinition(n13);
                                        if (((ObjectComposition)object3).transforms != null) {
                                            object3 = ((ObjectComposition)object3).transform();
                                        }
                                        if (object3 == null) break block54;
                                        object2 = null;
                                        object = (PendingSpawn)class1032.field1333.last();
                                        while (true) {
                                            block56: {
                                                block55: {
                                                    if (object == null) break block55;
                                                    if (n8 != ((PendingSpawn)object).field1188 || n12 != ((PendingSpawn)object).field1187 || n11 != ((PendingSpawn)object).field1182 || n13 != ((PendingSpawn)object).field1192) break block56;
                                                    object2 = object;
                                                }
                                                if (!class418.field4719 && Client.isItemSelected == 1) {
                                                    class231.method5128("Use", Client.field570 + " " + "->" + " " + class97.colorStartTag(65535) + ((ObjectComposition)object3).name, 1, n13, n12, n11, -1, false, n9);
                                                    break block50;
                                                }
                                                if (Client.isSpellSelected) {
                                                    if (class418.field4719) break block50;
                                                } else {
                                                    object = ((ObjectComposition)object3).actions;
                                                    if (object != null) {
                                                        break;
                                                    }
                                                    break block51;
                                                }
                                                if ((class106.field1365 & 4) == 4) {
                                                    class231.method5128(Client.field661, Client.field662 + " " + "->" + " " + class97.colorStartTag(65535) + ((ObjectComposition)object3).name, 2, n13, n12, n11, -1, false, n9);
                                                }
                                                break block50;
                                            }
                                            object = (PendingSpawn)class1032.field1333.previous();
                                        }
                                        for (n15 = 4; n15 >= 0; --n15) {
                                            if (class418.field4719 || object2 != null && !((PendingSpawn)object2).method2756(n15)) continue;
                                            object4 = object[n15];
                                            if (object2 != null && ((PendingSpawn)object2).method2753(n15)) {
                                                object4 = ((PendingSpawn)object2).method2766(n15);
                                            }
                                            if (object4 == null) continue;
                                            n7 = 0;
                                            if (n15 == 0) {
                                                n7 = 3;
                                            }
                                            if (n15 == 1) {
                                                n7 = 4;
                                            }
                                            if (n15 == 2) {
                                                n7 = 5;
                                            }
                                            if (n15 == 3) {
                                                n7 = 6;
                                            }
                                            if (n15 == 4) {
                                                n7 = 1001;
                                            }
                                            class231.method5128((String)object4, class97.colorStartTag(65535) + ((ObjectComposition)object3).name, n7, n13, n12, n11, -1, false, n9);
                                        }
                                    }
                                    class231.method5128("Examine", class97.colorStartTag(65535) + ((ObjectComposition)object3).name, 1002, ((ObjectComposition)object3).id, n12, n11, -1, false, n9);
                                }
                                if (n10 != 1) break block57;
                                object3 = class1032.field1330[n13];
                                if (object3 == null) break block54;
                                if (((class105)object3).field1354.size != 1 || (((Actor)object3).x & 0x7F) != 64 || (((Actor)object3).field1196 & 0x7F) != 64) break block58;
                                n14 = 0;
                                while (true) {
                                    block60: {
                                        block61: {
                                            block59: {
                                                if (n14 >= class1032.field1331) break block59;
                                                object = class1032.field1330[class1032.field1332[n14]];
                                                if (object == null) break block60;
                                                break block61;
                                            }
                                            n14 = Client.field673.field1406;
                                            object = Client.field673.field1412;
                                            for (n15 = 0; n15 < n14; ++n15) {
                                                object4 = class1032.field1329[object[n15]];
                                                if (object4 == null || ((Actor)object4).x != ((Actor)object3).x || ((Actor)object3).field1196 != ((Actor)object4).field1196) continue;
                                                class53.method1132((Player)object4, (int)object[n15], n12, n11, n9);
                                            }
                                            break;
                                        }
                                        if (object3 != object && ((class105)object).field1354.size == 1 && ((Actor)object3).x == ((Actor)object).x && ((Actor)object).field1196 == ((Actor)object3).field1196) {
                                            class447.method8854((class105)object, class1032.field1332[n14], n12, n11, n9);
                                        }
                                    }
                                    ++n14;
                                }
                            }
                            class447.method8854((class105)object3, n13, n12, n11, n9);
                        }
                        if (n10 != 0) break block62;
                        object3 = class1032.field1329[n13];
                        if (object3 == null) break block54;
                        if ((((Actor)object3).x & 0x7F) != 64 || (((Actor)object3).field1196 & 0x7F) != 64) break block63;
                        n14 = 0;
                        while (true) {
                            block65: {
                                block66: {
                                    block64: {
                                        if (n14 >= class1032.field1331) break block64;
                                        object = class1032.field1330[class1032.field1332[n14]];
                                        if (object == null) break block65;
                                        break block66;
                                    }
                                    n14 = Client.field673.field1406;
                                    object = Client.field673.field1412;
                                    for (n15 = 0; n15 < n14; ++n15) {
                                        object4 = class1032.field1329[object[n15]];
                                        if (object4 == null || object3 == object4 || ((Actor)object4).x != ((Actor)object3).x || ((Actor)object3).field1196 != ((Actor)object4).field1196) continue;
                                        class53.method1132((Player)object4, (int)object[n15], n12, n11, n9);
                                    }
                                    break;
                                }
                                if (((class105)object).field1354.size == 1 && ((Actor)object).x == ((Actor)object3).x && ((Actor)object).field1196 == ((Actor)object3).field1196) {
                                    class447.method8854((class105)object, class1032.field1332[n14], n12, n11, n9);
                                }
                            }
                            ++n14;
                        }
                    }
                    if (n13 != Client.combatTargetPlayerIndex) {
                        class53.method1132((Player)object3, n13, n12, n11, n9);
                    } else {
                        l = l2;
                        n5 = n9;
                    }
                }
                if (n10 != 3 || (object3 = class1032.field1327[n8][n12][n11]) == null) break block54;
                object2 = (TileItem)((NodeDeque)object3).first();
                while (object2 != null) {
                    block68: {
                        block69: {
                            block67: {
                                object = FaceNormal.ItemDefinition_get(((TileItem)object2).id);
                                if (class436.field4815 || Client.isItemSelected != 1) break block67;
                                class231.method5128("Use", Client.field570 + " " + "->" + " " + class97.colorStartTag(16748608) + ((ItemComposition)object).name, 16, ((TileItem)object2).id, n12, n11, -1, false, n9);
                                break block68;
                            }
                            if (!Client.isSpellSelected) break block69;
                            if (!class436.field4815) {
                                if ((class106.field1365 & 1) == 1) {
                                    class231.method5128(Client.field661, Client.field662 + " " + "->" + " " + class97.colorStartTag(16748608) + ((ItemComposition)object).name, 17, ((TileItem)object2).id, n12, n11, -1, false, n9);
                                }
                            }
                            break block68;
                        }
                        String[] stringArray = ((ItemComposition)object).groundActions;
                        int n21 = 4;
                        while (true) {
                            block71: {
                                block72: {
                                    block70: {
                                        if (n21 < 0) break block70;
                                        if (class436.field4815) break block71;
                                        break block72;
                                    }
                                    class231.method5128("Examine", class97.colorStartTag(16748608) + ((ItemComposition)object).name, 1004, ((TileItem)object2).id, n12, n11, -1, false, n9);
                                    break;
                                }
                                if (((TileItem)object2).method3116(n21)) {
                                    if (stringArray != null && stringArray[n21] != null) {
                                        n7 = 0;
                                        if (n21 == 0) {
                                            n7 = 18;
                                        }
                                        if (n21 == 1) {
                                            n7 = 19;
                                        }
                                        if (n21 == 2) {
                                            n7 = 20;
                                        }
                                        if (n21 == 3) {
                                            n7 = 21;
                                        }
                                        if (n21 == 4) {
                                            n7 = 22;
                                        }
                                        class231.method5128(stringArray[n21], class97.colorStartTag(16748608) + ((ItemComposition)object).name, n7, ((TileItem)object2).id, n12, n11, -1, false, n9);
                                    } else if (n21 == 2) {
                                        class231.method5128("Take", class97.colorStartTag(16748608) + ((ItemComposition)object).name, 20, ((TileItem)object2).id, n12, n11, -1, false, n9);
                                    }
                                }
                            }
                            --n21;
                        }
                    }
                    object2 = (TileItem)((NodeDeque)object3).next();
                }
            }
            ++n6;
        }
    }
}

