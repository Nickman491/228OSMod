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
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dl")
@Implements(value="ArchiveLoader")
public class ArchiveLoader {
    @ObfuscatedName(value="kt")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static SpritePixels[] field1054;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lok;")
    @Export(value="archive")
    final Archive archive;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=806302351)
    @Export(value="groupCount")
    final int groupCount;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1027900291)
    @Export(value="loadedCount")
    int loadedCount = 0;

    @ObfuscatedSignature(descriptor="(Lok;Ljava/lang/String;)V")
    ArchiveLoader(Archive archive, String string) {
        this.archive = archive;
        this.groupCount = archive.getGroupCount();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1114413689")
    @Export(value="isLoaded")
    boolean isLoaded() {
        this.loadedCount = 0;
        int n = 0;
        while (n < this.groupCount) {
            if (!this.archive.method7684(n) || this.archive.method7720(n)) {
                ++this.loadedCount;
            }
            ++n;
        }
        return this.loadedCount >= this.groupCount;
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
        boolean bl4 = !(bl2 || class212.method4905(n) || PlayerComposition.method7125(n) || class544.method10126(n)) ? false : (bl = true);
        if (!bl) {
            boolean bl5;
            bl = bl5 = n == 1002 || n == 1003 || n == 1004;
        }
        return bl;
    }

    @ObfuscatedName(value="gk")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="688799447")
    static void method2581() {
        if (Client.field533 != class95.field1157) {
            if (class95.field1151 != Client.field533) {
                if (class95.field1150 != Client.field533) {
                    if (class95.field1154 != Client.field533) {
                        if (Client.field533 != class95.field1155) {
                            if (Client.field533 != class95.field1160) {
                                Archive archive;
                                if (class95.field1153 != Client.field533) {
                                    if (Client.field533 != class95.field1152) {
                                        if (class95.field1165 != Client.field533) {
                                            if (class95.field1149 != Client.field533) {
                                                if (Client.field533 != class95.field1148) {
                                                    if (class95.field1158 != Client.field533) {
                                                        if (class95.field1159 != Client.field533) {
                                                            if (class95.field1156 != Client.field533) {
                                                                if (Client.field533 != class95.field1161) {
                                                                    if (Client.field533 != class95.field1162) {
                                                                        if (Client.field533 != class95.field1163) {
                                                                            if (class95.field1164 == Client.field533) {
                                                                                Client.field765 = false;
                                                                                class360.updateGameState(20);
                                                                                DevicePcmPlayerProvider.method327(class68.field474);
                                                                            }
                                                                            return;
                                                                        }
                                                                        if (class157.field1718.getGroupCount() > 0 && !class157.field1718.tryLoadGroupByName(WorldMapCacheName.field3264.name)) {
                                                                            GraphicsObject.method2357(100, "Loading world map - " + class157.field1718.groupLoadPercentByName(WorldMapCacheName.field3264.name) / 10 + "%");
                                                                            return;
                                                                        }
                                                                        if (class420.worldMap == null) {
                                                                            class420.worldMap = new WorldMap();
                                                                            class420.worldMap.init(class157.field1718, StructComposition.field2746, class137.field1603, GraphicsObject.field892, Client.field568, class155.field1709);
                                                                        }
                                                                        GraphicsObject.method2357(100, "Loaded world map");
                                                                        if (!class273.field3035) {
                                                                            Clock.method5078(class95.field1160);
                                                                        } else {
                                                                            Clock.method5078(class95.field1164);
                                                                        }
                                                                        Client.field512 = false;
                                                                        return;
                                                                    }
                                                                    if (SoundCache.field291.isFullyLoaded()) {
                                                                        if (class88.field1069.isFullyLoaded()) {
                                                                            if (class167.archive12.isFullyLoaded()) {
                                                                                if (class220.archive13.isFullyLoaded()) {
                                                                                    GraphicsObject.method2357(98, "Loaded interfaces");
                                                                                    if (class167.archive12.isValidFileName("version.dat", "")) {
                                                                                        Buffer buffer = new Buffer(class167.archive12.takeFileByNames("version.dat", ""));
                                                                                        buffer.readUnsignedShort();
                                                                                    }
                                                                                    Clock.method5078(class95.field1163);
                                                                                    return;
                                                                                }
                                                                                GraphicsObject.method2357(96, "Loading interfaces - " + (96 + class220.archive13.loadPercent() / 50) + "%");
                                                                                return;
                                                                            }
                                                                            GraphicsObject.method2357(96, "Loading interfaces - " + (80 + class167.archive12.loadPercent() / 6) + "%");
                                                                            return;
                                                                        }
                                                                        GraphicsObject.method2357(96, "Loading interfaces - " + class88.field1069.loadPercent() * 4 / 5 + "%");
                                                                        return;
                                                                    }
                                                                    GraphicsObject.method2357(96, "Loading interfaces - " + SoundCache.field291.loadPercent() * 4 / 5 + "%");
                                                                    return;
                                                                }
                                                                if (class166.archive10.tryLoadFileByNames("huffman", "")) {
                                                                    Huffman huffman = new Huffman(class166.archive10.takeFileByNames("huffman", ""));
                                                                    TileItem.method3111(huffman);
                                                                    GraphicsObject.method2357(94, "Loaded wordpack");
                                                                    Clock.method5078(class95.field1162);
                                                                    return;
                                                                }
                                                                GraphicsObject.method2357(94, "Loading wordpack - " + 0 + "%");
                                                                return;
                                                            }
                                                            class168.field1794 = new MouseRecorder();
                                                            GameEngine.taskHandler.newThreadTask(class168.field1794, 10);
                                                            GraphicsObject.method2357(92, "Loaded input handler");
                                                            Clock.method5078(class95.field1161);
                                                            return;
                                                        }
                                                        int n = class19.field82.getLoadedPercentage();
                                                        if (n >= 100) {
                                                            GraphicsObject.method2357(90, "Loaded textures");
                                                            Clock.method5078(class95.field1156);
                                                            return;
                                                        }
                                                        GraphicsObject.method2357(80, "Loading textures - " + n + "%");
                                                        return;
                                                    }
                                                    if (SpotAnimationDefinition.field2704.isFullyLoaded()) {
                                                        class19.field82 = new TextureProvider(SpotAnimationDefinition.field2704, PcmPlayer.field276, 20, class544.clientPreferences.method2941(), Client.isLowDetail ? 64 : 128);
                                                        SceneTileModel.method4003(class19.field82);
                                                        SceneTileModel.method4004(class544.clientPreferences.method2941());
                                                        Clock.method5078(class95.field1159);
                                                        return;
                                                    }
                                                    GraphicsObject.method2357(70, "Loading textures - " + "0%");
                                                    return;
                                                }
                                                int n = 0;
                                                if (SpriteMask.field3758 == null) {
                                                    SpriteMask.field3758 = ChatChannel.SpriteBuffer_getSprite(PcmPlayer.field276, class30.field133.field5116, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class213.redHintArrowSprite == null) {
                                                    class213.redHintArrowSprite = ChatChannel.SpriteBuffer_getSprite(PcmPlayer.field276, class30.field133.field5106, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class155.field1709 == null) {
                                                    class155.field1709 = class16.method213(PcmPlayer.field276, class30.field133.field5102, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (BuddyRankComparator.field1520 == null) {
                                                    BuddyRankComparator.field1520 = AbstractSocket.method9404(PcmPlayer.field276, class30.field133.field5103, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class10.field47 == null) {
                                                    class10.field47 = AbstractSocket.method9404(PcmPlayer.field276, class30.field133.field5104, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (SoundSystem.field288 == null) {
                                                    SoundSystem.field288 = AbstractSocket.method9404(PcmPlayer.field276, class30.field133.field5105, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class140.field1626 == null) {
                                                    class140.field1626 = AbstractSocket.method9404(PcmPlayer.field276, class30.field133.field5108, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (field1054 == null) {
                                                    field1054 = AbstractSocket.method9404(PcmPlayer.field276, class30.field133.field5107, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (class464.field4957 == null) {
                                                    class464.field4957 = AbstractSocket.method9404(PcmPlayer.field276, class30.field133.field5100, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (WorldMapSection2.scrollBarSprites == null) {
                                                    WorldMapSection2.scrollBarSprites = class16.method213(PcmPlayer.field276, class30.field133.field5109, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (FriendSystem.field829 == null) {
                                                    FriendSystem.field829 = class16.method213(PcmPlayer.field276, class30.field133.field5110, 0);
                                                } else {
                                                    ++n;
                                                }
                                                if (n >= 11) {
                                                    AbstractFont.AbstractFont_modIconSprites = FriendSystem.field829;
                                                    class213.redHintArrowSprite.normalize();
                                                    int n2 = (int)(Math.random() * 21.0) - 10;
                                                    int n3 = (int)(Math.random() * 21.0) - 10;
                                                    int n4 = (int)(Math.random() * 21.0) - 10;
                                                    int n5 = (int)(Math.random() * 41.0) - 20;
                                                    class155.field1709[0].shiftColors(n2 + n5, n3 + n5, n5 + n4);
                                                    GraphicsObject.method2357(60, "Loaded sprites");
                                                    Clock.method5078(class95.field1158);
                                                    return;
                                                }
                                                GraphicsObject.method2357(70, "Loading sprites - " + n * 100 / 12 + "%");
                                                return;
                                            }
                                            if (class268.archive2.isFullyLoaded()) {
                                                if (HitSplatDefinition.field2777.isFullyLoaded()) {
                                                    class151.method3608(class268.archive2);
                                                    Archive archive2 = class268.archive2;
                                                    FloorUnderlayDefinition.FloorUnderlayDefinition_archive = archive2;
                                                    Archive archive3 = class268.archive2;
                                                    Archive archive4 = class59.field398;
                                                    KitDefinition.field2562 = archive3;
                                                    KitDefinition.KitDefinition_modelsArchive = archive4;
                                                    KitDefinition.field2550 = KitDefinition.field2562.getGroupFileCount(3);
                                                    class136.method3476(class268.archive2, class59.field398, Client.isLowDetail);
                                                    class448.method8875(class268.archive2, class59.field398);
                                                    Archive archive5 = class268.archive2;
                                                    StructComposition.StructDefinition_archive = archive5;
                                                    AttackOption.method3099(class268.archive2, class59.field398, Client.isMembersWorld, FontName.field5319);
                                                    class243.method5285(class268.archive2, GraphicsDefaults.field5117, class188.field2104);
                                                    class491.method9488(class268.archive2, class59.field398);
                                                    Archive archive6 = class268.archive2;
                                                    class431.VarbitDefinition_archive = archive6;
                                                    class392.method7840(class268.archive2);
                                                    ClanChannel.field1807 = new class352(SoundCache.field291, class59.field398, PcmPlayer.field276, class220.archive13, class88.field1069);
                                                    KeyHandler.method373(class268.archive2);
                                                    class167.method3811(class268.archive2);
                                                    UrlRequester.method3282(class268.archive2);
                                                    Archive archive7 = class268.archive2;
                                                    InvDefinition.method5120(class268.archive2);
                                                    Archive archive8 = class268.archive2;
                                                    DbTableType.field5408 = archive8;
                                                    GraphicsDefaults.method9495(class268.archive2);
                                                    class18.field75 = new class539(StructComposition.field2749, 54, ScriptFrame.clientLanguage, class268.archive2);
                                                    UserComparator9.field1513 = new class539(StructComposition.field2749, 47, ScriptFrame.clientLanguage, class268.archive2);
                                                    class19.varcs = new Varcs();
                                                    Player.method2704(class268.archive2, PcmPlayer.field276, class220.archive13);
                                                    InterfaceParent.method2618(class268.archive2, PcmPlayer.field276);
                                                    WorldMapLabel.method6398(class268.archive2, PcmPlayer.field276);
                                                    GraphicsObject.method2357(50, "Loaded config");
                                                    Clock.method5078(class95.field1148);
                                                    return;
                                                }
                                                GraphicsObject.method2357(40, "Loading config - " + (80 + class167.archive12.loadPercent() / 6) + "%");
                                                return;
                                            }
                                            GraphicsObject.method2357(40, "Loading config - " + class268.archive2.loadPercent() + "%");
                                            return;
                                        }
                                        class30.field131 = GameEngine.field189 = Client.field508.method2712(104, 104, class544.clientPreferences.method2902());
                                        class174.sceneMinimapSprite = new SpritePixels(512, 512);
                                        GraphicsObject.method2357(30, "Starting game engine...");
                                        Clock.method5078(class95.field1149);
                                        return;
                                    }
                                    int n = 0;
                                    n += GraphicsDefaults.field5117.percentage() * 5 / 100;
                                    n += class188.field2104.percentage() * 2 / 100;
                                    n += class268.archive2.percentage() / 100;
                                    n += SoundCache.field291.percentage() / 100;
                                    n += class68.field494.percentage() * 10 / 100;
                                    n += class59.field398.percentage() * 65 / 100;
                                    n += SpotAnimationDefinition.field2704.percentage() / 100;
                                    n += WorldMapSection2.field3102.percentage() / 100;
                                    n += class167.archive12.percentage() * 6 / 100;
                                    n += class157.field1718.percentage() / 100;
                                    n += StructComposition.field2746.percentage() * 2 / 100;
                                    n += class137.field1603.percentage() * 2 / 100;
                                    n += HitSplatDefinition.field2777.percentage() / 100;
                                    if ((n += class88.field1069.percentage() * 2 / 100) == 100) {
                                        GameEngine.method677(GraphicsDefaults.field5117, "Animations");
                                        GameEngine.method677(class188.field2104, "Skeletons");
                                        GameEngine.method677(class68.field494, "Maps");
                                        GameEngine.method677(class59.field398, "Models");
                                        GameEngine.method677(WorldMapSection2.field3102, "Music Jingles");
                                        GameEngine.method677(class157.field1718, "World Map");
                                        GameEngine.method677(StructComposition.field2746, "World Map Geography");
                                        GameEngine.method677(class137.field1603, "World Map Ground");
                                        GraphicsObject.method2357(30, "Loaded update list");
                                        Clock.method5078(class95.field1165);
                                        return;
                                    }
                                    if (n != 0) {
                                        GraphicsObject.method2357(30, "Checking for updates - " + n + "%");
                                    }
                                    return;
                                }
                                GraphicsDefaults.field5117 = class92.newArchive(class389.field4549.field4567, false, true, true, false);
                                class188.field2104 = class92.newArchive(class389.field4558.field4567, false, true, true, false);
                                class268.archive2 = class92.newArchive(class389.field4571.field4567, true, false, true, false);
                                SoundCache.field291 = class92.newArchive(class389.field4552.field4567, false, true, true, false);
                                class68.field494 = class92.newArchive(class389.field4554.field4567, true, true, true, false);
                                class59.field398 = class92.newArchive(class389.field4565.field4567, false, true, true, false);
                                SpotAnimationDefinition.field2704 = class92.newArchive(class389.field4553.field4567, false, true, true, false);
                                WorldMapSection2.field3102 = class92.newArchive(class389.field4560.field4567, false, true, true, false);
                                class167.archive12 = class92.newArchive(class389.field4561.field4567, false, true, true, false);
                                StructComposition.field2746 = class92.newArchive(class389.field4566.field4567, false, true, true, false);
                                class157.field1718 = class92.newArchive(class389.field4551.field4567, false, true, true, false);
                                class137.field1603 = class92.newArchive(class389.field4568.field4567, false, true, true, false);
                                HitSplatDefinition.field2777 = class92.newArchive(class389.field4569.field4567, false, true, true, false);
                                int n = class389.field4570.field4567;
                                ArchiveDisk archiveDisk = null;
                                if (JagexCache.JagexCache_dat2File != null) {
                                    archiveDisk = new ArchiveDisk(n, JagexCache.JagexCache_dat2File, UserComparator4.JagexCache_idxFiles[n], 1000000);
                                }
                                class88.field1069 = archive = new Archive(archiveDisk, ReflectionCheck.field227, HitSplatDefinition.field2760, n, false, true, true, true, true);
                                GraphicsObject.method2357(20, "Connecting to update server");
                                Clock.method5078(class95.field1152);
                                return;
                            }
                            class360.updateGameState(10);
                            return;
                        }
                        Archive archive = class166.archive10;
                        Archive archive9 = PcmPlayer.field276;
                        int n = 0;
                        String[] stringArray = Login.field956;
                        int n6 = 0;
                        while (true) {
                            String string;
                            if (n6 >= stringArray.length) {
                                stringArray = Login.field960;
                                n6 = 0;
                                while (true) {
                                    if (n6 >= stringArray.length) {
                                        stringArray = Login.field958;
                                        n6 = 0;
                                        while (true) {
                                            if (n6 >= stringArray.length) {
                                                int n7;
                                                n = n7 = n;
                                                Archive archive10 = PcmPlayer.field276;
                                                int n8 = Login.field960.length + Login.field956.length;
                                                String[] stringArray2 = Login.field958;
                                                int n9 = 0;
                                                while (true) {
                                                    if (n9 >= stringArray2.length) {
                                                        int n10 = n8;
                                                        if (n >= (n8 = n10)) {
                                                            GraphicsObject.method2357(100, "Loaded title screen");
                                                            if (!class273.field3035) {
                                                                Clock.method5078(class95.field1153);
                                                            } else {
                                                                class360.updateGameState(5);
                                                                Clock.method5078(class95.field1160);
                                                            }
                                                            return;
                                                        }
                                                        GraphicsObject.method2357(90, "Loading title screen - " + n * 100 / n8 + "%");
                                                        return;
                                                    }
                                                    String string2 = stringArray2[n9];
                                                    if (archive10.getGroupId(string2) != -1) {
                                                        ++n8;
                                                    }
                                                    ++n9;
                                                }
                                            }
                                            string = stringArray[n6];
                                            if (archive9.getGroupId(string) != -1 && archive9.tryLoadFileByNames(string, "")) {
                                                ++n;
                                            }
                                            ++n6;
                                        }
                                    }
                                    string = stringArray[n6];
                                    if (archive9.tryLoadFileByNames(string, "")) {
                                        ++n;
                                    }
                                    ++n6;
                                }
                            }
                            string = stringArray[n6];
                            if (archive.tryLoadFileByNames(string, "")) {
                                ++n;
                            }
                            ++n6;
                        }
                    }
                    if (VerticalAlignment.field2674 == null) {
                        VerticalAlignment.field2674 = new Fonts(PcmPlayer.field276, class220.archive13);
                    }
                    int n = FontName.method9935().length;
                    Client.field568 = VerticalAlignment.field2674.createMap(FontName.method9935());
                    if (Client.field568.size() >= n) {
                        FontName.field5319 = (Font)Client.field568.get(FontName.FontName_plain11);
                        HealthBarUpdate.fontPlain12 = (Font)Client.field568.get(FontName.FontName_plain12);
                        GraphicsObject.field892 = (Font)Client.field568.get(FontName.FontName_bold12);
                        class437.field4816 = Client.field686.get();
                        GraphicsObject.method2357(80, "Loaded fonts");
                        Clock.method5078(class95.field1155);
                        return;
                    }
                    GraphicsObject.method2357(80, "Loading fonts - " + Client.field568.size() * 100 / n + "%");
                    return;
                }
                boolean bl = !Client.isLowDetail;
                PcmPlayer.field257 = 22050;
                PcmPlayer.PcmPlayer_stereo = bl;
                class328.field3605 = 2;
                ArrayList<MidiPcmStream> arrayList = new ArrayList<MidiPcmStream>(3);
                class328.pcmPlayer1 = class241.method5262(GameEngine.taskHandler, 0, 2048);
                UserList.pcmStreamMixer = new PcmStreamMixer();
                PcmStreamMixer pcmStreamMixer = new PcmStreamMixer();
                pcmStreamMixer.addSubStream(UserList.pcmStreamMixer);
                int n = 0;
                while (true) {
                    if (n >= 3) {
                        class328.pcmPlayer1.setStream(pcmStreamMixer);
                        Timer.method8939(ClanSettings.field1762, class221.field2421, World.field815, arrayList);
                        Message.decimator = new Decimator(22050, PcmPlayer.field257);
                        GraphicsObject.method2357(60, "Prepared sound engine");
                        Clock.method5078(class95.field1154);
                        return;
                    }
                    MidiPcmStream midiPcmStream = new MidiPcmStream(class328.pcmPlayer1);
                    midiPcmStream.method6719(9, 128);
                    pcmStreamMixer.addSubStream(midiPcmStream);
                    arrayList.add(midiPcmStream);
                    ++n;
                }
            }
            int n = 0;
            n += World.field815.percentage() * 53 / 100;
            n += class544.field5399.percentage() * 5 / 100;
            n += PcmPlayer.field276.percentage() * 36 / 100;
            n += class166.archive10.percentage() / 100;
            n += class220.archive13.percentage() / 100;
            n += class221.field2421.percentage() * 2 / 100;
            n += ClanSettings.field1762.percentage() / 100;
            if ((n += FaceNormal.field2120.method7674() && FaceNormal.field2120.isFullyLoaded() ? 1 : 0) == 100) {
                GameEngine.method677(World.field815, "Sound FX");
                GameEngine.method677(class544.field5399, "Music Tracks");
                GameEngine.method677(PcmPlayer.field276, "Sprites");
                GameEngine.method677(class221.field2421, "Music Samples");
                GameEngine.method677(ClanSettings.field1762, "Music Patches");
                class30.field133 = new GraphicsDefaults();
                class30.field133.decode(FaceNormal.field2120);
                GraphicsObject.method2357(40, "Loaded update list");
                Clock.method5078(class95.field1150);
                return;
            }
            if (n != 0) {
                GraphicsObject.method2357(30, "Checking for updates - " + n + "%");
            }
            return;
        }
        World.field815 = class92.newArchive(class389.field4556.field4567, false, true, true, false);
        class544.field5399 = class92.newArchive(class389.field4555.field4567, true, true, true, false);
        PcmPlayer.field276 = class92.newArchive(class389.field4557.field4567, false, true, true, false);
        class166.archive10 = class92.newArchive(class389.field4559.field4567, false, true, true, false);
        class220.archive13 = class92.newArchive(class389.field4562.field4567, true, false, true, false);
        class221.field2421 = class92.newArchive(class389.field4563.field4567, false, true, true, false);
        ClanSettings.field1762 = class92.newArchive(class389.field4564.field4567, false, true, true, false);
        FaceNormal.field2120 = class92.newArchive(class389.field4548.field4567, true, true, true, false);
        GraphicsObject.method2357(20, "Connecting to update server");
        Clock.method5078(class95.field1151);
    }

    @ObfuscatedName(value="le")
    @ObfuscatedSignature(descriptor="(III)Ljava/lang/String;", garbageValue="589124194")
    static final String method2584(int n, int n2) {
        int n3 = n2 - n;
        if (n3 < -9) {
            return class97.colorStartTag(0xFF0000);
        }
        if (n3 < -6) {
            return class97.colorStartTag(0xFF3000);
        }
        if (n3 < -3) {
            return class97.colorStartTag(0xFF7000);
        }
        if (n3 < 0) {
            return class97.colorStartTag(0xFFB000);
        }
        if (n3 > 9) {
            return class97.colorStartTag(65280);
        }
        if (n3 > 6) {
            return class97.colorStartTag(0x40FF00);
        }
        if (n3 > 3) {
            return class97.colorStartTag(0x80FF00);
        }
        if (n3 > 0) {
            return class97.colorStartTag(0xC0FF00);
        }
        return class97.colorStartTag(0xFFFF00);
    }

    @ObfuscatedName(value="mk")
    @ObfuscatedSignature(descriptor="([Lna;IIIZI)V", garbageValue="1382423197")
    @Export(value="resizeInterface")
    static void resizeInterface(Widget[] widgetArray, int n, int n2, int n3, boolean bl) {
        int n4 = 0;
        while (n4 < widgetArray.length) {
            Widget widget = widgetArray[n4];
            if (widget != null && widget.parentId == n) {
                GrandExchangeOfferTotalQuantityComparator.alignWidgetSize(widget, n2, n3, bl);
                ArchiveLoader.alignWidgetPosition(widget, n2, n3);
                if (widget.scrollX > widget.scrollWidth - widget.width) {
                    widget.scrollX = widget.scrollWidth - widget.width;
                }
                if (widget.scrollX < 0) {
                    widget.scrollX = 0;
                }
                if (widget.scrollY > widget.scrollHeight - widget.height * -1528330031) {
                    widget.scrollY = widget.scrollHeight - widget.height * -1528330031;
                }
                if (widget.scrollY < 0) {
                    widget.scrollY = 0;
                }
                if (widget.type == 0) {
                    class244.revalidateWidgetScroll(widgetArray, widget, bl);
                }
            }
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="mt")
    @ObfuscatedSignature(descriptor="(Lna;IIB)V", garbageValue="17")
    @Export(value="alignWidgetPosition")
    static void alignWidgetPosition(Widget widget, int n, int n2) {
        widget.x = widget.xAlignment == 0 ? widget.rawX : (widget.xAlignment == 1 ? widget.rawX + (n - widget.width) / 2 : (widget.xAlignment == 2 ? n - widget.width - widget.rawX : (widget.xAlignment == 3 ? widget.rawX * n >> 14 : (widget.xAlignment == 4 ? (widget.rawX * n >> 14) + (n - widget.width) / 2 : n - widget.width - (widget.rawX * n >> 14)))));
        widget.y = widget.yAlignment == 0 ? widget.rawY : (widget.yAlignment == 1 ? (n2 - widget.height * -1528330031) / 2 + widget.rawY : (widget.yAlignment == 2 ? n2 - widget.height * -1528330031 - widget.rawY : (widget.yAlignment == 3 ? n2 * widget.rawY >> 14 : (widget.yAlignment == 4 ? (n2 * widget.rawY >> 14) + (n2 - widget.height * -1528330031) / 2 : n2 - widget.height * -1528330031 - (n2 * widget.rawY >> 14)))));
    }
}

