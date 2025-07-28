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

@ObfuscatedName(value="cn")
public class class53
extends Node {
    @ObfuscatedName(value="mb")
    @ObfuscatedSignature(descriptor="Lhv;")
    static Model field338;
    @ObfuscatedName(value="mj")
    @ObfuscatedSignature(descriptor="Lcw;")
    static class67 field339;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lbo;")
    class47 field340;

    public class53() {
        this.field340 = null;
    }

    @ObfuscatedSignature(descriptor="(Lcc;)V")
    class53(VorbisSample vorbisSample) {
        if (vorbisSample != null) {
            this.field340 = new class47(vorbisSample, null);
            return;
        }
    }

    @ObfuscatedSignature(descriptor="(Lbc;)V")
    public class53(RawSound rawSound) {
        this.field340 = new class47(null, rawSound);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-39")
    public boolean method1117() {
        return this.field340 == null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Lbc;", garbageValue="1940326458")
    public RawSound method1130() {
        if (this.field340 != null && this.field340.field305.tryLock()) {
            RawSound rawSound;
            try {
                rawSound = this.method1128();
            }
            finally {
                this.field340.field305.unlock();
            }
            return rawSound;
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(S)Lbc;", garbageValue="-2570")
    public RawSound method1119() {
        if (this.field340 != null) {
            RawSound rawSound;
            this.field340.field305.lock();
            try {
                rawSound = this.method1128();
            }
            finally {
                this.field340.field305.unlock();
            }
            return rawSound;
        }
        return null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Lbc;", garbageValue="-1373017010")
    RawSound method1128() {
        if (this.field340.field306 == null) {
            this.field340.field306 = this.field340.field304.toRawSound(null);
            this.field340.field304 = null;
        }
        return this.field340.field306;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;IZB)Z", garbageValue="-25")
    static boolean method1131(CharSequence charSequence, int n, boolean bl) {
        if (n < 2 || n > 36) throw new IllegalArgumentException("" + n);
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 0;
        int n3 = charSequence.length();
        int n4 = 0;
        while (true) {
            block13: {
                block12: {
                    int n5;
                    int n6;
                    block11: {
                        if (n4 >= n3) {
                            return bl3;
                        }
                        n6 = charSequence.charAt(n4);
                        if (n4 != 0) break block11;
                        if (n6 == 45) break block12;
                        if (n6 == 43) break block13;
                    }
                    if (n6 >= 48 && n6 <= 57) {
                        n6 -= 48;
                    } else if (n6 >= 65 && n6 <= 90) {
                        n6 -= 55;
                    } else {
                        if (n6 < 97 || n6 > 122) return false;
                        n6 -= 87;
                    }
                    if (n6 >= n) {
                        return false;
                    }
                    if (bl2) {
                        n6 = -n6;
                    }
                    if ((n5 = n2 * n + n6) / n != n2) {
                        return false;
                    }
                    n2 = n5;
                    bl3 = true;
                    break block13;
                }
                bl2 = true;
            }
            ++n4;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="1825257480")
    static int method1129(int n, Script script, boolean bl) {
        if (n < 1000) {
            return class209.method4821(n, script, bl);
        }
        if (n < 1100) {
            return class19.method285(n, script, bl);
        }
        if (n < 1200) {
            return class454.method8934(n, script, bl);
        }
        if (n < 1300) {
            return FaceNormal.method4464(n, script, bl);
        }
        if (n < 1400) {
            return class273.method5890(n, script, bl);
        }
        if (n < 1500) {
            return UserComparator10.method3361(n, script, bl);
        }
        if (n < 1600) {
            return class209.method4823(n, script, bl);
        }
        if (n < 1700) {
            return class508.method9608(n, script, bl);
        }
        if (n < 1800) {
            return class165.method3793(n, script, bl);
        }
        if (n < 1900) {
            return class208.method4820(n, script, bl);
        }
        if (n < 2000) {
            return class166.method3800(n, script, bl);
        }
        if (n < 2100) {
            return class19.method285(n, script, bl);
        }
        if (n < 2200) {
            return class454.method8934(n, script, bl);
        }
        if (n < 2300) {
            return FaceNormal.method4464(n, script, bl);
        }
        if (n < 2400) {
            return class273.method5890(n, script, bl);
        }
        if (n < 2500) {
            return UserComparator10.method3361(n, script, bl);
        }
        if (n < 2600) {
            return WorldMapData_0.method5988(n, script, bl);
        }
        if (n < 2700) {
            return class27.method426(n, script, bl);
        }
        if (n < 2800) {
            return SoundCache.method896(n, script, bl);
        }
        if (n < 2900) {
            return class298.method6400(n, script, bl);
        }
        if (n < 3000) {
            return class166.method3800(n, script, bl);
        }
        if (n < 3200) {
            return SoundCache.method872(n, script, bl);
        }
        if (n < 3300) {
            return HealthBar.method3000(n, script, bl);
        }
        if (n < 3400) {
            return SoundSystem.method869(n, script, bl);
        }
        if (n < 3500) {
            return ReflectionCheck.method726(n, script, bl);
        }
        if (n < 3600) {
            return class30.method484(n, script, bl);
        }
        if (n < 3700) {
            return class379.method7638(n, script, bl);
        }
        if (n < 3800) {
            return ClanSettings.method3755(n, script, bl);
        }
        if (n < 3900) {
            return class539.method10085(n, script, bl);
        }
        if (n < 4000) {
            return GrandExchangeOfferOwnWorldComparator.method1269(n, script, bl);
        }
        if (n < 4100) {
            return class344.method6944(n, script, bl);
        }
        if (n < 4200) {
            return class140.method3501(n, script, bl);
        }
        if (n < 4300) {
            return class374.method7621(n, script, bl);
        }
        if (n < 5100) {
            return class157.method3656(n, script, bl);
        }
        if (n < 5400) {
            return Canvas.method339(n, script, bl);
        }
        if (n < 5600) {
            return TaskHandler.method4922(n, script, bl);
        }
        if (n < 5700) {
            return Tiles.method2544(n, script, bl);
        }
        if (n < 6300) {
            return UserComparator9.method3354(n, script, bl);
        }
        if (n < 6600) {
            return WorldMapRectangle.method6391(n, script, bl);
        }
        if (n < 6700) {
            return Archive.method7721(n, script, bl);
        }
        if (n < 6800) {
            return PendingSpawn.method2755(n, script, bl);
        }
        if (n < 6900) {
            return FileSystem.method4954(n, script, bl);
        }
        if (n < 7000) {
            return class31.method494(n, script, bl);
        }
        if (n < 7100) {
            return VerticalAlignment.method5355(n, script, bl);
        }
        if (n < 7200) {
            return SpotAnimationDefinition.method5382(n, script, bl);
        }
        if (n < 7500) {
            return NewStuff.method5295(n, script, bl);
        }
        if (n < 7600) {
            return class156.method3638(n, script, bl);
        }
        if (n < 7700) {
            return GameEngine.method549(n, script, bl);
        }
        if (n < 8000) {
            return class28.method459(n, script, bl);
        }
        if (n < 8100) {
            return HealthBarDefinition.method5247(n, script, bl);
        }
        return 2;
    }

    @ObfuscatedName(value="ly")
    @ObfuscatedSignature(descriptor="(Ldx;IIIII)V", garbageValue="-1177802429")
    static final void method1132(Player player, int n, int n2, int n3, int n4) {
        int n5;
        if (player.field1145 == Client.field623) {
            return;
        }
        if (Client.field648.field5612 >= 400) {
            return;
        }
        String string = player.field1127 == 0 ? player.field1125[0] + player.username + player.field1125[1] + ArchiveLoader.method2584(player.field1136, ModeWhere.localPlayer.field1136) + " " + " (" + "level-" + player.field1136 + ")" + player.field1125[2] : player.field1125[0] + player.username + player.field1125[1] + " " + " (" + "skill-" + player.field1127 + ")" + player.field1125[2];
        if (Client.isItemSelected != 1) {
            if (!Client.isSpellSelected) {
                for (n5 = 7; n5 >= 0; --n5) {
                    if (Client.field638[n5] == null) continue;
                    int n6 = 0;
                    if (!Client.field638[n5].equalsIgnoreCase("Attack")) {
                        if (Client.field639[n5]) {
                            n6 = 2000;
                        }
                    } else {
                        if (AttackOption.field1380 == Client.playerAttackOption) continue;
                        if (Client.playerAttackOption == AttackOption.field1382 || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && player.field1136 > ModeWhere.localPlayer.field1136) {
                            n6 = 2000;
                        }
                        if (ModeWhere.localPlayer.field1140 != 0 && player.field1140 != 0) {
                            n6 = player.field1140 == ModeWhere.localPlayer.field1140 ? 2000 : 0;
                        } else if (Client.playerAttackOption == AttackOption.field1378 && player.method2663()) {
                            n6 = 2000;
                        }
                    }
                    int n7 = 0;
                    n7 = Client.field637[n5] + n6;
                    class231.method5128(Client.field638[n5], class97.colorStartTag(0xFFFFFF) + string, n7, n, n2, n3, -1, false, n4);
                }
            } else if ((class106.field1365 & 8) == 8) {
                class231.method5128(Client.field661, Client.field662 + " " + "->" + " " + class97.colorStartTag(0xFFFFFF) + string, 15, n, n2, n3, -1, false, n4);
            }
        } else {
            class231.method5128("Use", Client.field570 + " " + "->" + " " + class97.colorStartTag(0xFFFFFF) + string, 14, n, n2, n3, -1, false, n4);
        }
        n5 = 0;
        while (true) {
            block21: {
                block20: {
                    if (n5 >= Client.field648.field5612) break block20;
                    if (Client.field648.field5614[n5] != 23) break block21;
                    Client.field648.field5619[n5] = class97.colorStartTag(0xFFFFFF) + string;
                }
                return;
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="mg")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1410523996")
    static void method1124(int n) {
        class318.tempMenuAction = new MenuAction();
        class318.tempMenuAction.field914 = Client.field648.field5622[n];
        class318.tempMenuAction.field911 = Client.field648.field5613[n];
        class318.tempMenuAction.field906 = Client.field648.field5614[n];
        class318.tempMenuAction.field904 = Client.field648.field5615[n];
        class318.tempMenuAction.field908 = Client.field648.field5616[n];
        class318.tempMenuAction.field910 = Client.field648.field5618[n];
        class318.tempMenuAction.field907 = Client.field648.field5619[n];
        class318.tempMenuAction.field909 = Client.field648.field5617[n];
        class318.tempMenuAction.field912 = Client.field648.field5628[n];
    }

    @ObfuscatedName(value="nd")
    @ObfuscatedSignature(descriptor="(IIIILvf;Lnf;I)V", garbageValue="-985042487")
    @Export(value="worldToMinimap")
    static final void worldToMinimap(int n, int n2, int n3, int n4, SpritePixels spritePixels, SpriteMask spriteMask) {
        int n5 = n4 * n4 + n3 * n3;
        if (n5 > 4225 && n5 < 90000) {
            int n6 = Client.camAngleY & 0x7FF;
            int n7 = SceneTileModel.field1954[n6];
            int n8 = SceneTileModel.Rasterizer3D_cosine[n6];
            int n9 = n8 * n3 + n4 * n7 >> 16;
            int n10 = n4 * n8 - n7 * n3 >> 16;
            double d = Math.atan2(n9, n10);
            int n11 = spriteMask.width / 2 - 25;
            int n12 = (int)(Math.sin(d) * (double)n11);
            int n13 = (int)(Math.cos(d) * (double)n11);
            int n14 = 20;
            class213.redHintArrowSprite.method10761(n12 + (n + spriteMask.width / 2 - n14 / 2), spriteMask.height / 2 + n2 - n14 / 2 - n13 - 10, n14, n14, 15, 15, d, 256);
        } else {
            FontName.drawSpriteOnMinimap(n, n2, n3, n4, spritePixels, spriteMask);
        }
    }
}

