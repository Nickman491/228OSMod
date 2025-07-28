/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  np
 *  px
 */
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@px
@np
@ObfuscatedName(value="ph")
@Implements(value="Language")
public class Language
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lph;")
    @Export(value="Language_EN")
    public static final Language Language_EN = new Language("EN", "en", "English", ModeWhere.field4684, 0, "GB");
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lph;")
    @Export(value="Language_DE")
    static final Language Language_DE = new Language("DE", "de", "German", ModeWhere.field4684, 1, "DE");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lph;")
    @Export(value="Language_FR")
    public static final Language Language_FR = new Language("FR", "fr", "French", ModeWhere.field4684, 2, "FR");
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lph;")
    @Export(value="Language_PT")
    static final Language Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4684, 3, "BR");
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lph;")
    @Export(value="Language_NL")
    static final Language Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4681, 4, "NL");
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lph;")
    @Export(value="Language_ES")
    public static final Language Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4681, 5, "ES");
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lph;")
    @Export(value="Language_ES_MX")
    static final Language Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4684, 6, "MX");
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lph;")
    @Export(value="Language_valuesOrdered")
    public static final Language[] Language_valuesOrdered;
    @ObfuscatedName(value="cq")
    static String field4674;
    @ObfuscatedName(value="ax")
    final String field4670;
    @ObfuscatedName(value="at")
    @Export(value="language")
    final String language;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1375478211)
    @Export(value="id")
    final int id;

    static {
        Language[] languageArray = Language.method7969();
        Language_valuesOrdered = new Language[languageArray.length];
        Language[] languageArray2 = languageArray;
        int n = 0;
        while (true) {
            if (n >= languageArray2.length) {
                return;
            }
            Language language = languageArray2[n];
            if (Language_valuesOrdered[language.id] != null) break;
            Language.Language_valuesOrdered[language.id] = language;
            ++n;
        }
        throw new IllegalStateException();
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpg;ILjava/lang/String;)V")
    Language(String string, String string2, String string3, ModeWhere modeWhere, int n, String string4) {
        this.field4670 = string;
        this.language = string2;
        this.id = n;
        if (string4 == null) {
            new Locale(string2.substring(0, 2));
        } else {
            new Locale(string2.substring(0, 2), string4);
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-439268539")
    @Export(value="getLanguage")
    String getLanguage() {
        return this.language;
    }

    public String toString() {
        return this.getLanguage().toLowerCase(Locale.ENGLISH);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lph;", garbageValue="-1245891173")
    static Language[] method7969() {
        return new Language[]{Language_FR, Language_ES, Language_PT, Language_EN, Language_DE, Language_ES_MX, Language_NL};
    }

    @ObfuscatedName(value="ah")
    static boolean method7967(long l) {
        int n = (int)(l >>> 14 & 3L);
        return n == 2;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ldz;[BIIIII)V", garbageValue="1521949636")
    static final void method7975(class103 var0, byte[] var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        if (var0.field1336 == null) ** GOTO lbl5
        var6_6 = 0;
        while (true) {
            block10: {
                if (var6_6 < 4) break block10;
lbl5:
                // 2 sources

                var12_9 = new Buffer(var1_1);
                var7_7 = 0;
                while (true) {
                    if (var7_7 >= 4) {
                        return;
                    }
                    for (var8_8 = 0; var8_8 < 64; ++var8_8) {
                        for (var9_10 = 0; var9_10 < 64; ++var9_10) {
                            var10_11 = var8_8 + var2_2;
                            var11_12 = var3_3 + var9_10;
                            class28.method454(var0, var12_9, var7_7, var10_11, var11_12, var10_11 + var4_4, var5_5 + var11_12, 0);
                        }
                    }
                    ++var7_7;
                }
            }
            for (var7_7 = 0; var7_7 < 64; ++var7_7) {
                for (var8_8 = 0; var8_8 < 64; ++var8_8) {
                    if (var7_7 + var2_2 <= 0 || var7_7 + var2_2 >= var0.field1336[var6_6].flags.length || var3_3 + var8_8 <= 0 || var3_3 + var8_8 >= var0.field1336[var6_6].flags[var7_7 + var2_2].length) continue;
                    v0 = var0.field1336[var6_6].flags[var7_7 + var2_2];
                    v1 = var8_8 + var3_3;
                    v0[v1] = v0[v1] & -1073741825;
                }
            }
            ++var6_6;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lcx;I)V", garbageValue="-1719770110")
    @Export(value="changeWorld")
    static void changeWorld(World world) {
        if (world.isMembersOnly() != Client.isMembersWorld) {
            Client.isMembersWorld = world.isMembersOnly();
            class267.method5746(world.isMembersOnly());
        }
        if (world.properties != Client.worldProperties) {
            Archive archive = PcmPlayer.field276;
            int n = world.properties;
            Login.logoSprite = (n & class552.field5431.rsOrdinal()) == 0 ? ((n & class552.field5456.rsOrdinal()) == 0 ? ((n & class552.field5441.rsOrdinal()) == 0 ? AttackOption.SpriteBuffer_getIndexedSpriteByName(archive, "logo", "") : AttackOption.SpriteBuffer_getIndexedSpriteByName(archive, "logo_speedrunning", "")) : AttackOption.SpriteBuffer_getIndexedSpriteByName(archive, "logo_seasonal_mode", "")) : AttackOption.SpriteBuffer_getIndexedSpriteByName(archive, "logo_deadman_mode", "");
        }
        FontName.worldHost = world.host;
        Client.worldId = world.id;
        Client.worldProperties = world.properties;
        class255.field2724 = world.field819;
        PlayerComposition.worldPort = Client.gameBuild == 0 ? 43594 : world.id + 40000;
        class173.js5Port = Client.gameBuild == 0 ? 443 : world.id + 50000;
        class340.currentPort = PlayerComposition.worldPort;
    }

    @ObfuscatedName(value="it")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="-706406186")
    static final void method7980(class103 class1032) {
        Projectile projectile = (Projectile)class1032.field1338.last();
        while (projectile != null) {
            if (class1032.field1321 == projectile.plane && Client.cycle <= projectile.cycleEnd) {
                if (Client.cycle >= projectile.cycleStart) {
                    Actor actor;
                    int n;
                    if (!projectile.isMoving && projectile.field975 != 0) {
                        if (projectile.field975 <= 0) {
                            n = -projectile.field975 - 1;
                            actor = n == Client.field623 ? ModeWhere.localPlayer : class30.field131.field1329[n];
                            if (actor != null && 0 <= actor.x && actor.x < 13312 && 0 <= actor.field1196 && actor.field1196 < 13312) {
                                projectile.sourceX = actor.x;
                                projectile.sourceY = actor.field1196;
                                projectile.setDestination(projectile.field985, projectile.field967, projectile.field964, Client.cycle);
                            }
                        } else {
                            actor = class30.field131.field1330[projectile.field975 - 1];
                            if (actor != null && 0 <= actor.x && actor.x < 13312 && 0 <= actor.field1196 && actor.field1196 < 13312) {
                                projectile.sourceX = actor.x;
                                projectile.sourceY = actor.field1196;
                                projectile.setDestination(projectile.field985, projectile.field967, projectile.field964, Client.cycle);
                            }
                        }
                    }
                    if (projectile.targetIndex > 0 && (actor = class1032.field1330[projectile.targetIndex - 1]) != null && 0 <= actor.x && actor.x < 13312 && 0 <= actor.field1196 && actor.field1196 < 13312) {
                        projectile.setDestination(actor.x, actor.field1196, Canvas.method337(class1032, actor.x, actor.field1196, projectile.plane) - projectile.endHeight, Client.cycle);
                    }
                    if (projectile.targetIndex < 0 && (actor = (n = -projectile.targetIndex - 1) == Client.field623 ? ModeWhere.localPlayer : class1032.field1329[n]) != null && 0 <= actor.x && actor.x < 13312 && 0 <= actor.field1196 && actor.field1196 < 13312) {
                        projectile.setDestination(actor.x, actor.field1196, Canvas.method337(class1032, actor.x, actor.field1196, projectile.plane) - projectile.endHeight, Client.cycle);
                    }
                    projectile.advance(Client.field581);
                    class1032.field1319.method4185(class1032.field1321, (int)projectile.x, (int)projectile.y, (int)projectile.z, 60, projectile, projectile.yaw, -1L, false);
                }
            } else {
                projectile.remove();
            }
            projectile = (Projectile)class1032.field1338.previous();
        }
        return;
    }

    @ObfuscatedName(value="kn")
    @ObfuscatedSignature(descriptor="(Ldz;Lvv;II)V", garbageValue="-484128573")
    static void method7972(class103 class1032, PacketBuffer packetBuffer, int n) {
        int n2 = packetBuffer.readUnsignedByte();
        if (n2 < class1032.field1334) {
            throw new RuntimeException("dang");
        }
        if (n2 > class1032.field1334) {
            throw new RuntimeException("dang!");
        }
        class1032.field1334 = 0;
        class274 class2742 = new class274();
        int n3 = 0;
        while (true) {
            int n4;
            int n5;
            if (n3 >= n2) {
                while (true) {
                    class480 class4802;
                    if (packetBuffer.method10230(Client.packetWriter.field1452) < 10) {
                        return;
                    }
                    n3 = packetBuffer.readUnsignedShort();
                    class1032.field1335[++class1032.field1334 - 1] = n3;
                    n5 = packetBuffer.readUnsignedByte();
                    int n6 = packetBuffer.readUnsignedByte();
                    n4 = n5 * 8;
                    int n7 = n6 * 8;
                    class103 class1033 = Client.field508.method2713(n3, n4, n7, class544.clientPreferences.method2902(), class175.field1838);
                    class1032.field1318[n3] = class4802 = new class480(n3, class1033);
                    class4802.field5027 = packetBuffer.readByte();
                    class274 class2743 = class4802.field5029;
                    class2743.method5900(0, 0);
                    class2743.method5891(0);
                    class2743.method5901(0);
                    class36.method722(packetBuffer, class2743);
                    class4802.method9298(class4802.field5029);
                    if (n < 4) continue;
                    int n8 = packetBuffer.readShort();
                    int n9 = packetBuffer.readShort();
                    class4802.method9334(n8, n9);
                }
            }
            n5 = class1032.field1335[n3];
            class480 class4803 = class1032.field1318[n5];
            n4 = packetBuffer.readUnsignedByte();
            if (n4 != 0) {
                class1032.field1335[++class1032.field1334 - 1] = n5;
                if (n4 != 1) {
                    class2742.method5899(class4803.method9293());
                    class36.method722(packetBuffer, class2742);
                    if (n4 != 2) {
                        class4803.method9316(class2742);
                    } else {
                        class4803.method9298(class2742);
                    }
                }
            } else {
                Client.field508.method2737(class4803.field5035);
                class1032.field1318[n5] = null;
            }
            ++n3;
        }
    }
}

