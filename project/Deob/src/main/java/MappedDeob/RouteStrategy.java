/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kv")
@Implements(value="RouteStrategy")
public abstract class RouteStrategy {
    @ObfuscatedName(value="hq")
    static String field3024;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=843506147)
    @Export(value="approxDestinationX")
    public int approxDestinationX;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=200025215)
    @Export(value="approxDestinationY")
    public int approxDestinationY;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1048838837)
    @Export(value="approxDestinationSizeX")
    public int approxDestinationSizeX;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=322017111)
    @Export(value="approxDestinationSizeY")
    public int approxDestinationSizeY;

    protected RouteStrategy() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIILku;B)Z", garbageValue="-42")
    @Export(value="hasArrived")
    protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1148389678")
    public static void method5847(int n, int n2) {
        VarbitComposition varbitComposition = ModelData0.method4806(n);
        int n3 = varbitComposition.baseVar;
        int n4 = varbitComposition.startBit;
        int n5 = varbitComposition.endBit;
        int n6 = Varps.Varps_masks[n5 - n4];
        if (n2 < 0 || n2 > n6) {
            n2 = 0;
        }
        Varps.Varps_main[n3] = Varps.Varps_main[n3] & ~(n6 <<= n4) | n2 << n4 & n6;
    }

    @ObfuscatedName(value="ne")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-2028955871")
    @Export(value="changeGameOptions")
    static final void changeGameOptions(int n) {
        class150.method3598();
        ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last();
        while (true) {
            if (objectSound == null) {
                int n2 = class254.VarpDefinition_get((int)n).type;
                if (n2 == 0) {
                    return;
                }
                int n3 = Varps.Varps_main[n];
                if (n2 == 1) {
                    if (n3 == 1) {
                        class33.method522(0.9);
                    }
                    if (n3 == 2) {
                        class33.method522(0.8);
                    }
                    if (n3 == 3) {
                        class33.method522(0.7);
                    }
                    if (n3 == 4) {
                        class33.method522(0.6);
                    }
                }
                if (n2 == 3) {
                    if (n3 == 0) {
                        class149.method3578(255);
                    }
                    if (n3 == 1) {
                        class149.method3578(192);
                    }
                    if (n3 == 2) {
                        class149.method3578(128);
                    }
                    if (n3 == 3) {
                        class149.method3578(64);
                    }
                    if (n3 == 4) {
                        class149.method3578(0);
                    }
                }
                if (n2 == 4) {
                    if (n3 == 0) {
                        ClanChannel.method3839(127);
                    }
                    if (n3 == 1) {
                        ClanChannel.method3839(96);
                    }
                    if (n3 == 2) {
                        ClanChannel.method3839(64);
                    }
                    if (n3 == 3) {
                        ClanChannel.method3839(32);
                    }
                    if (n3 == 4) {
                        ClanChannel.method3839(0);
                    }
                }
                if (n2 == 5) {
                    boolean bl = Client.leftClickOpensMenu = n3 == 1;
                }
                if (n2 == 6) {
                    Client.chatEffects = n3;
                }
                if (n2 == 9) {
                    // empty if block
                }
                if (n2 == 10) {
                    if (n3 == 0) {
                        class240.method5252(127);
                    }
                    if (n3 == 1) {
                        class240.method5252(96);
                    }
                    if (n3 == 2) {
                        class240.method5252(64);
                    }
                    if (n3 == 3) {
                        class240.method5252(32);
                    }
                    if (n3 == 4) {
                        class240.method5252(0);
                    }
                }
                if (n2 == 17) {
                    Client.followerIndex = n3 & 0xFFFF;
                }
                if (n2 == 18 && (Client.playerAttackOption = (AttackOption)StructComposition.findEnumerated(class146.method3561(), n3)) == null) {
                    Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
                }
                if (n2 == 19) {
                    Client.combatTargetPlayerIndex = n3 == -1 ? -1 : n3 & 0x7FF;
                }
                if (n2 == 22 && (Client.npcAttackOption = (AttackOption)StructComposition.findEnumerated(class146.method3561(), n3)) == null) {
                    Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
                }
                return;
            }
            if (objectSound.obj != null) {
                objectSound.set();
            }
            objectSound = (ObjectSound)ObjectSound.objectSounds.previous();
        }
    }

    @ObfuscatedName(value="on")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZB)Ljava/lang/String;", garbageValue="59")
    static String method5846(String string, boolean bl) {
        String string2;
        String string3 = string2 = bl ? "https://" : "http://";
        if (Client.gameBuild == 1) {
            string = string + "-wtrc";
        } else if (Client.gameBuild == 2) {
            string = string + "-wtqa";
        } else if (Client.gameBuild == 3) {
            string = string + "-wtwip";
        } else if (Client.gameBuild == 5) {
            string = string + "-wti";
        } else if (Client.gameBuild == 4) {
            string = "local";
        }
        String string4 = "";
        if (Language.field4674 != null) {
            string4 = "/p=" + Language.field4674;
        }
        String string5 = "runescape.com";
        return string2 + string + "." + string5 + "/l=" + ScriptFrame.clientLanguage + "/a=" + class483.field5046 + string4 + "/";
    }
}

