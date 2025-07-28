/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kt")
public class class267
implements class29 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lna;")
    Widget field2966 = null;
    @ObfuscatedName(value="ah")
    boolean field2961 = false;
    @ObfuscatedName(value="az")
    boolean field2962 = false;

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-458319724")
    public boolean vmethod5756(int n) {
        if (this.field2966 == null) {
            return false;
        }
        class27 class272 = this.field2966.method7535();
        if (class272 == null) {
            return false;
        }
        if (class272.method412(n)) {
            switch (n) {
                case 82: {
                    this.field2961 = true;
                    break;
                }
                case 81: {
                    this.field2962 = true;
                    break;
                }
                default: {
                    if (!this.method5752(n)) break;
                    UserComparator8.invalidateWidget(this.field2966);
                }
            }
        }
        return class272.method406(n);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="0")
    public boolean vmethod5757(int n) {
        switch (n) {
            default: {
                return false;
            }
            case 81: {
                this.field2962 = false;
                return false;
            }
            case 82: 
        }
        this.field2961 = false;
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="804434279")
    public boolean vmethod5758(char c) {
        if (this.field2966 == null) {
            return false;
        }
        if (!class59.method1203(c)) {
            return false;
        }
        class359 class3592 = this.field2966.method7444();
        if (class3592 != null && class3592.method7276()) {
            class27 class272 = this.field2966.method7535();
            if (class272 == null) {
                return false;
            }
            if (class272.method413(c) && class3592.method7146(c)) {
                UserComparator8.invalidateWidget(this.field2966);
            }
            return class272.method411(c);
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ZI)Z", garbageValue="1360179052")
    public boolean vmethod5764(boolean bl) {
        return false;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lna;B)V", garbageValue="-10")
    public void method5727(Widget widget) {
        if (widget == null) {
            this.method5738();
        } else {
            class357 class3572;
            if (widget != this.field2966) {
                this.method5738();
                this.field2966 = widget;
            }
            if ((class3572 = widget.method7447()) != null) {
                if (!class3572.field3801.method7221() && class3572.field3803 != null) {
                    ScriptEvent scriptEvent = new ScriptEvent();
                    scriptEvent.method2628(widget);
                    scriptEvent.setArgs(class3572.field3803);
                    WorldMapElement.method5196().addFirst(scriptEvent);
                }
                class3572.field3801.method7129(true);
            }
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lna;", garbageValue="-1925559873")
    public Widget method5728() {
        return this.field2966;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-4397062")
    public void method5738() {
        if (this.field2966 == null) {
            return;
        }
        class357 class3572 = this.field2966.method7447();
        Widget widget = this.field2966;
        this.field2966 = null;
        if (class3572 == null) {
            return;
        }
        if (class3572.field3801.method7221() && class3572.field3803 != null) {
            ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.method2628(widget);
            scriptEvent.setArgs(class3572.field3803);
            WorldMapElement.method5196().addFirst(scriptEvent);
        }
        class3572.field3801.method7129(false);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="187447019")
    boolean method5752(int n) {
        if (this.field2966 == null) {
            return false;
        }
        class359 class3592 = this.field2966.method7444();
        if (class3592 != null && class3592.method7276()) {
            switch (n) {
                default: {
                    return false;
                }
                case 84: {
                    if (class3592.method7191() != 0) {
                        if (this.field2962 && class3592.method7195()) {
                            class3592.method7146(10);
                        } else {
                            class357 class3572 = this.field2966.method7447();
                            ScriptEvent scriptEvent = new ScriptEvent();
                            scriptEvent.method2628(this.field2966);
                            scriptEvent.setArgs(class3572.field3805);
                            WorldMapElement.method5196().addFirst(scriptEvent);
                            this.method5738();
                        }
                    } else {
                        class3592.method7146(10);
                    }
                    return true;
                }
                case 103: {
                    if (!this.field2961) {
                        class3592.method7155(this.field2962);
                    } else {
                        class3592.method7137(this.field2962);
                    }
                    return true;
                }
                case 102: {
                    if (!this.field2961) {
                        class3592.method7332(this.field2962);
                    } else {
                        class3592.method7290(this.field2962);
                    }
                    return true;
                }
                case 105: {
                    if (!this.field2961) {
                        class3592.method7165(this.field2962);
                    } else {
                        class3592.method7260(this.field2962);
                    }
                    return true;
                }
                case 85: {
                    if (!this.field2961) {
                        class3592.method7228();
                    } else {
                        class3592.method7201();
                    }
                    return true;
                }
                case 96: {
                    if (!this.field2961) {
                        class3592.method7220(this.field2962);
                    } else {
                        class3592.method7160(this.field2962);
                    }
                    return true;
                }
                case 97: {
                    if (!this.field2961) {
                        class3592.method7194(this.field2962);
                    } else {
                        class3592.method7161(this.field2962);
                    }
                    return true;
                }
                case 65: {
                    if (this.field2961) {
                        class3592.method7171(class421.method8239());
                    }
                    return true;
                }
                case 66: {
                    if (this.field2961) {
                        class3592.method7170(class421.method8239());
                    }
                    return true;
                }
                case 48: {
                    if (this.field2961) {
                        class3592.method7152();
                    }
                    return true;
                }
                case 67: {
                    if (this.field2961) {
                        class3592.method7172(class421.method8239());
                    }
                    return true;
                }
                case 13: {
                    this.method5738();
                    return true;
                }
                case 98: {
                    if (!this.field2961) {
                        class3592.method7162(this.field2962);
                    } else {
                        class3592.method7173();
                    }
                    return true;
                }
                case 104: {
                    if (!this.field2961) {
                        class3592.method7164(this.field2962);
                    } else {
                        class3592.method7166(this.field2962);
                    }
                    return true;
                }
                case 99: {
                    if (!this.field2961) {
                        class3592.method7163(this.field2962);
                    } else {
                        class3592.method7174();
                    }
                    return true;
                }
                case 101: 
            }
            if (!this.field2961) {
                class3592.method7281();
            } else {
                class3592.method7150();
            }
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lth;ZII)V", garbageValue="-892928212")
    static void method5753(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, GraphicsDefaults graphicsDefaults, boolean bl, int n) {
        if (!Login.clearLoginScreen) {
            if (n != 0) {
                Varcs.method3212(n);
            } else {
                AbstractSocket.method9400(bl);
            }
            Rasterizer2D.Rasterizer2D_clear();
            byte[] byArray = abstractArchive.takeFileByNames("title.jpg", "");
            WorldMapSectionType.leftTitleSprite = GrandExchangeOfferNameComparator.method7878(byArray);
            TriBool.rightTitleSprite = WorldMapSectionType.leftTitleSprite.mirrorHorizontally();
            int n2 = Client.worldProperties;
            Login.logoSprite = (n2 & class552.field5431.rsOrdinal()) == 0 ? ((n2 & class552.field5456.rsOrdinal()) == 0 ? ((n2 & class552.field5441.rsOrdinal()) == 0 ? AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo", "") : AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_speedrunning", "")) : AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_seasonal_mode", "")) : AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_deadman_mode", "");
            Login.titleboxSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebox", "");
            class454.field4897 = AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton", "");
            Login.field953 = AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_large", "");
            class418.field4715 = AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "play_now_text", "");
            AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_wide42,1", "");
            class538.field5379 = class319.method6611(abstractArchive2, "runes", "");
            class169.title_muteSprite = class319.method6611(abstractArchive2, "title_mute", "");
            Login.field920 = AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,0", "");
            class157.field1724 = AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,4", "");
            FriendLoginUpdate.field4992 = AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,2", "");
            class112.field1414 = AttackOption.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,6", "");
            ClanMate.field5001 = Login.field920.subWidth;
            UrlRequester.field1461 = Login.field920.subHeight;
            class461.loginScreenRunesAnimation = new LoginScreenAnimation(class538.field5379, graphicsDefaults.field5101);
            if (bl) {
                Login.Login_username = "";
                Login.Login_password = "";
                Login.field922 = new String[8];
                Login.field941 = 0;
            }
            class326.field3592 = 0;
            class480.otp = "";
            Login.field946 = true;
            Login.worldSelectOpen = false;
            class106.method3078();
            class153.method3619();
            UserComparator8.method3320().method7823(false);
            Login.clearLoginScreen = true;
            Login.xPadding = (BuddyRankComparator.canvasWidth - 765) / 2;
            Login.loginBoxX = Login.xPadding + 202;
            UserComparator3.loginBoxCenter = Login.loginBoxX + 180;
            WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
            TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
            Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
            return;
        }
        if (n == 4) {
            Varcs.method3212(4);
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-594909621")
    public static void method5746(boolean bl) {
        if (bl != WorldMapEvent.ItemDefinition_inMembersWorld) {
            ItemComposition.ItemDefinition_cached.clear();
            ItemComposition.ItemDefinition_cachedModels.clear();
            ItemComposition.ItemDefinition_cachedSprites.clear();
            WorldMapEvent.ItemDefinition_inMembersWorld = bl;
        }
    }
}

