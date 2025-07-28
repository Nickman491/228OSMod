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
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="ok")
@Implements(value="Archive")
public class Archive
extends AbstractArchive {
    @ObfuscatedName(value="as")
    @Export(value="Archive_crc")
    static CRC32 Archive_crc = new CRC32();
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lsh;")
    @Export(value="archiveDisk")
    ArchiveDisk archiveDisk;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lsh;")
    @Export(value="masterDisk")
    ArchiveDisk masterDisk;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=2139342699)
    @Export(value="index")
    int index;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1662195143)
    volatile int field4537 = 0;
    @ObfuscatedName(value="ac")
    boolean field4538 = false;
    @ObfuscatedName(value="au")
    @Export(value="validGroups")
    volatile boolean[] validGroups;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1014943143)
    @Export(value="indexCrc")
    int indexCrc;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=2065943831)
    @Export(value="indexVersion")
    int indexVersion;
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
    public Archive(ArchiveDisk archiveDisk, ArchiveDisk archiveDisk2, class392 class3922, int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        super(bl, bl2);
        this.archiveDisk = archiveDisk;
        this.masterDisk = archiveDisk2;
        this.index = n;
        this.field4538 = bl3;
        this.field4544 = bl4;
        this.field4545 = bl5;
        this.field4546 = class3922;
        this.field4546.method7825(this, this.index);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1720456553")
    public boolean method7674() {
        return this.field4537 == 1;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="0")
    @Export(value="percentage")
    public int percentage() {
        if (!(this.field4537 == 1 || this.field4544 && this.field4537 == 2)) {
            if (this.groups != null) {
                return 99;
            }
            int n = this.field4546.method7831(class389.field4550.field4567, this.index);
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
    @Export(value="loadRegionFromGroup")
    void loadRegionFromGroup(int n) {
        this.field4546.method7828(this.index, n);
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IS)V", garbageValue="20201")
    @Export(value="loadGroup")
    void loadGroup(int n) {
        if (this.archiveDisk != null && this.validGroups != null && this.validGroups[n]) {
            KeyHandler.method401(n, this.archiveDisk, this);
        } else {
            this.field4546.method7827(this, this.index, n, this.groupCrcs[n], (byte)2, true);
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="9665")
    void method7678() {
        this.field4537 = 2;
        this.groupIds = new int[0];
        this.groupCrcs = new int[0];
        this.groupVersions = new int[0];
        this.fileCounts = new int[0];
        this.fileIds = new int[0][];
        this.groups = new Object[0];
        this.files = new Object[0][];
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-2080316251")
    @Export(value="loadIndex")
    void loadIndex(int n, int n2) {
        this.indexCrc = n;
        this.indexVersion = n2;
        if (this.masterDisk != null) {
            KeyHandler.method401(this.index, this.masterDisk, this);
        } else {
            this.field4546.method7827(this, class389.field4550.field4567, this.index, this.indexCrc, (byte)0, true);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I[BZZI)V", garbageValue="-954013354")
    @Export(value="write")
    void write(int n, byte[] byArray, boolean bl, boolean bl2) {
        if (bl) {
            if (this.field4537 == 1) {
                throw new RuntimeException();
            }
            if (this.masterDisk != null) {
                int n2 = this.index;
                ArchiveDisk archiveDisk = this.masterDisk;
                ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
                archiveDiskAction.type = 0;
                archiveDiskAction.key = n2;
                archiveDiskAction.data = byArray;
                archiveDiskAction.archiveDisk = archiveDisk;
                Object object = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
                synchronized (object) {
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
                }
                object = ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock;
                synchronized (object) {
                    if (ArchiveDiskActionHandler.field4526 == 0) {
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
                    }
                    ArchiveDiskActionHandler.field4526 = 600;
                }
            }
            this.decodeIndex(byArray);
            this.loadAllLocal();
        } else {
            byArray[byArray.length - 2] = (byte)(this.groupVersions[n] >> 8);
            byArray[byArray.length - 1] = (byte)this.groupVersions[n];
            if (this.archiveDisk != null) {
                Actor.method2784(n, byArray, this.archiveDisk);
                this.validGroups[n] = true;
            }
            if (bl2) {
                Object object;
                Object[] objectArray = this.groups;
                int n3 = n;
                if (byArray == null) {
                    object = null;
                } else if (byArray.length > 136) {
                    DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
                    ((AbstractByteArrayCopier)directByteArrayCopier).set(byArray);
                    object = directByteArrayCopier;
                } else {
                    object = byArray;
                }
                objectArray[n3] = object;
            }
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lsh;I[BZB)V", garbageValue="-61")
    @Export(value="load")
    void load(ArchiveDisk archiveDisk, int n, byte[] byArray, boolean bl) {
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
                                            if (archiveDisk == this.masterDisk) break block13;
                                            if (!bl && n == this.field4531) {
                                                this.field4537 = 1;
                                            }
                                            if (byArray == null || byArray.length <= 2) break block14;
                                            Archive_crc.reset();
                                            Archive_crc.update(byArray, 0, byArray.length - 2);
                                            int n3 = (int)Archive_crc.getValue();
                                            int n4 = ((byArray[byArray.length - 2] & 0xFF) << 8) + (byArray[byArray.length - 1] & 0xFF);
                                            if (n3 != this.groupCrcs[n] || n4 != this.groupVersions[n]) break block15;
                                            this.validGroups[n] = true;
                                            if (bl) {
                                                Object object;
                                                Object[] objectArray = this.groups;
                                                int n5 = n;
                                                if (byArray != null) {
                                                    if (byArray.length <= 136) {
                                                        object = byArray;
                                                    } else {
                                                        DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
                                                        ((AbstractByteArrayCopier)directByteArrayCopier).set(byArray);
                                                        object = directByteArrayCopier;
                                                    }
                                                } else {
                                                    object = null;
                                                }
                                                objectArray[n5] = object;
                                            }
                                            break block16;
                                        }
                                        this.validGroups[n] = false;
                                        if (this.field4538 || bl) {
                                            this.field4546.method7827(this, this.index, n, this.groupCrcs[n], (byte)2, bl);
                                        }
                                        return;
                                    }
                                    this.validGroups[n] = false;
                                    if (this.field4538 || bl) {
                                        this.field4546.method7827(this, this.index, n, this.groupCrcs[n], (byte)2, bl);
                                    }
                                    return;
                                }
                                if (this.field4537 == 1) break block17;
                                if (byArray == null) break block18;
                                Archive_crc.reset();
                                Archive_crc.update(byArray, 0, byArray.length);
                                int n6 = (int)Archive_crc.getValue();
                                if (n6 != this.indexCrc) break block19;
                                Buffer buffer = new Buffer(TaskHandler.decompressBytes(byArray));
                                n2 = buffer.readUnsignedByte();
                                if (n2 < 5 || n2 > 7) break block20;
                                int n7 = 0;
                                if (n2 >= 6) {
                                    n7 = buffer.readInt();
                                }
                                if (n7 != this.indexVersion) break block21;
                                this.decodeIndex(byArray);
                                this.loadAllLocal();
                            }
                            return;
                        }
                        this.field4546.method7827(this, class389.field4550.field4567, this.index, this.indexCrc, (byte)0, true);
                        return;
                    }
                    throw new RuntimeException(n2 + "," + this.index + "," + n);
                }
                this.field4546.method7827(this, class389.field4550.field4567, this.index, this.indexCrc, (byte)0, true);
                return;
            }
            this.field4546.method7827(this, class389.field4550.field4567, this.index, this.indexCrc, (byte)0, true);
            return;
        }
        throw new RuntimeException();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-914427665")
    @Export(value="loadAllLocal")
    void loadAllLocal() {
        int n;
        this.validGroups = new boolean[this.groups.length];
        for (n = 0; n < this.validGroups.length; ++n) {
            this.validGroups[n] = false;
        }
        if (this.archiveDisk == null) {
            this.field4537 = 1;
            return;
        }
        this.field4531 = -1;
        for (n = 0; n < this.validGroups.length; ++n) {
            if (this.fileCounts[n] <= 0) continue;
            ArchiveDisk archiveDisk = this.archiveDisk;
            Archive archive = this;
            ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
            archiveDiskAction.type = 1;
            archiveDiskAction.key = n;
            archiveDiskAction.archiveDisk = archiveDisk;
            archiveDiskAction.archive = archive;
            Object object = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
            synchronized (object) {
                ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
            }
            object = ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock;
            synchronized (object) {
                if (ArchiveDiskActionHandler.field4526 == 0) {
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
                }
                ArchiveDiskActionHandler.field4526 = 600;
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
    @Export(value="groupLoadPercent")
    int groupLoadPercent(int n) {
        if (this.groups[n] != null) {
            return 100;
        }
        if (this.validGroups[n]) {
            return 100;
        }
        return this.field4546.method7831(this.index, n);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1285921286")
    public boolean method7720(int n) {
        return this.validGroups[n];
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1818002973")
    public boolean method7684(int n) {
        return this.getGroupFileIds(n) != null;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="187981839")
    @Export(value="loadPercent")
    public int loadPercent() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= this.groups.length) {
                if (n == 0) {
                    return 100;
                }
                n3 = n2 * 100 / n;
                return n3;
            }
            if (this.fileCounts[n3] > 0) {
                n += 100;
                n2 += this.groupLoadPercent(n3);
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="1")
    static int method7721(int n, Script script, boolean bl) {
        if (n != 6600) {
            if (n != ScriptOpcodes.WORLDMAP_GETMAPNAME) {
                if (n != ScriptOpcodes.WORLDMAP_SETMAP) {
                    if (n != ScriptOpcodes.WORLDMAP_GETZOOM) {
                        if (n != ScriptOpcodes.WORLDMAP_SETZOOM) {
                            if (n != ScriptOpcodes.WORLDMAP_ISLOADED) {
                                if (n != ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
                                    if (n != ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
                                        if (n != ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
                                            if (n != ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
                                                if (n != ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
                                                    if (n != ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
                                                        if (n != ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
                                                            if (n != ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
                                                                if (n != ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
                                                                    if (n != 6615) {
                                                                        if (n != ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
                                                                            if (n != ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
                                                                                if (n != 6618) {
                                                                                    if (n != 6619) {
                                                                                        if (n != 6620) {
                                                                                            if (n != ScriptOpcodes.WORLDMAP_COORDINMAP) {
                                                                                                if (n != ScriptOpcodes.WORLDMAP_GETSIZE) {
                                                                                                    if (n != 6623) {
                                                                                                        if (n != 6624) {
                                                                                                            if (n != 6625) {
                                                                                                                if (n != 6626) {
                                                                                                                    if (n != 6627) {
                                                                                                                        if (n != ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
                                                                                                                            if (n != ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
                                                                                                                                if (n != ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
                                                                                                                                    if (n != ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
                                                                                                                                        if (n != ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
                                                                                                                                            if (n != ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
                                                                                                                                                if (n != ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
                                                                                                                                                    if (n != ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
                                                                                                                                                        if (n != ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
                                                                                                                                                            if (n != ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
                                                                                                                                                                if (n != 6638) {
                                                                                                                                                                    if (n != ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
                                                                                                                                                                        if (n != ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
                                                                                                                                                                            if (n != ScriptOpcodes.MEC_TEXT) {
                                                                                                                                                                                if (n != ScriptOpcodes.MEC_TEXTSIZE) {
                                                                                                                                                                                    int n2;
                                                                                                                                                                                    WorldMapElement worldMapElement;
                                                                                                                                                                                    if (n != ScriptOpcodes.MEC_CATEGORY) {
                                                                                                                                                                                        int n3;
                                                                                                                                                                                        WorldMapElement worldMapElement2;
                                                                                                                                                                                        if (n != ScriptOpcodes.MEC_SPRITE) {
                                                                                                                                                                                            if (n != ScriptOpcodes.WORLDMAP_ELEMENT) {
                                                                                                                                                                                                if (n != 6698) {
                                                                                                                                                                                                    if (n != ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
                                                                                                                                                                                                        return 2;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = UserComparator5.worldMapEvent.coord2.packed();
                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                }
                                                                                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = UserComparator5.worldMapEvent.coord1.packed();
                                                                                                                                                                                                return 1;
                                                                                                                                                                                            }
                                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = UserComparator5.worldMapEvent.mapElement;
                                                                                                                                                                                            return 1;
                                                                                                                                                                                        }
                                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (worldMapElement2 = class31.WorldMapElement_get(n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) != null ? worldMapElement2.sprite1 : -1;
                                                                                                                                                                                        return 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (worldMapElement = class31.WorldMapElement_get(n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) != null ? worldMapElement.category : -1;
                                                                                                                                                                                    return 1;
                                                                                                                                                                                }
                                                                                                                                                                                int n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                                                WorldMapElement worldMapElement = class31.WorldMapElement_get(n4);
                                                                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapElement.textSize;
                                                                                                                                                                                return 1;
                                                                                                                                                                            }
                                                                                                                                                                            int n5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                                            WorldMapElement worldMapElement = class31.WorldMapElement_get(n5);
                                                                                                                                                                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = worldMapElement.name != null ? worldMapElement.name : "";
                                                                                                                                                                            return 1;
                                                                                                                                                                        }
                                                                                                                                                                        AbstractWorldMapIcon abstractWorldMapIcon = Canvas.getWorldMap().iconNext();
                                                                                                                                                                        if (abstractWorldMapIcon != null) {
                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = abstractWorldMapIcon.getElement();
                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = abstractWorldMapIcon.coord2.packed();
                                                                                                                                                                        } else {
                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                                                                                                        }
                                                                                                                                                                        return 1;
                                                                                                                                                                    }
                                                                                                                                                                    AbstractWorldMapIcon abstractWorldMapIcon = Canvas.getWorldMap().iconStart();
                                                                                                                                                                    if (abstractWorldMapIcon != null) {
                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = abstractWorldMapIcon.getElement();
                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = abstractWorldMapIcon.coord2.packed();
                                                                                                                                                                    } else {
                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                                                                                                    }
                                                                                                                                                                    return 1;
                                                                                                                                                                }
                                                                                                                                                                int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                                                                                                Coord coord = new Coord(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                                                                                                                                                                Coord coord2 = Canvas.getWorldMap().method9775(n6, coord);
                                                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = coord2 != null ? coord2.packed() : -1;
                                                                                                                                                                return 1;
                                                                                                                                                            }
                                                                                                                                                            int n7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isCategoryDisabled(n7) ? 1 : 0;
                                                                                                                                                            return 1;
                                                                                                                                                        }
                                                                                                                                                        int n8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isElementDisabled(n8) ? 1 : 0;
                                                                                                                                                        return 1;
                                                                                                                                                    }
                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getElementsDisabled() ? 1 : 0;
                                                                                                                                                    return 1;
                                                                                                                                                }
                                                                                                                                                int n9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                                                                                boolean bl2 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
                                                                                                                                                Canvas.getWorldMap().setCategoryDisabled(n9, bl2);
                                                                                                                                                return 1;
                                                                                                                                            }
                                                                                                                                            int n10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                                                                            boolean bl3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
                                                                                                                                            Canvas.getWorldMap().disableElement(n10, bl3);
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        boolean bl4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                        Canvas.getWorldMap().setElementsDisabled(bl4);
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    Canvas.getWorldMap().stopCurrentFlashes();
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                int n11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                Canvas.getWorldMap().flashCategory(n11);
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            int n12 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                            Canvas.getWorldMap().flashElement(n12);
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        boolean bl5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                        Canvas.getWorldMap().setPerpetualFlash(bl5);
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    Canvas.getWorldMap().resetCyclesPerFlash();
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                Canvas.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                                                                                                return 1;
                                                                                                            }
                                                                                                            Canvas.getWorldMap().resetMaxFlashCount();
                                                                                                            return 1;
                                                                                                        }
                                                                                                        Canvas.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                                                                                        return 1;
                                                                                                    }
                                                                                                    Coord coord = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                                                                                    WorldMapArea worldMapArea = Canvas.getWorldMap().mapAreaAtCoord(coord.plane, coord.x, coord.y);
                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapArea != null ? worldMapArea.getId() : -1;
                                                                                                    return 1;
                                                                                                }
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayWith();
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayHeight();
                                                                                                return 1;
                                                                                            }
                                                                                            int n13 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                            Coord coord = new Coord(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                                                                                            WorldMapArea worldMapArea = Canvas.getWorldMap().getMapArea(n13);
                                                                                            if (worldMapArea != null) {
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapArea.containsCoord(coord.plane, coord.x, coord.y) ? 1 : 0;
                                                                                                return 1;
                                                                                            }
                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                            return 1;
                                                                                        }
                                                                                        int n14 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                        Coord coord = new Coord(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                                                                                        class88.method2612(n14, coord, true);
                                                                                        return 1;
                                                                                    }
                                                                                    int n15 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                    Coord coord = new Coord(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                                                                                    class88.method2612(n15, coord, false);
                                                                                    return 1;
                                                                                }
                                                                                Coord coord = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                                                                WorldMapArea worldMapArea = Canvas.getWorldMap().getCurrentMapArea();
                                                                                if (worldMapArea != null) {
                                                                                    Coord coord3 = worldMapArea.coord(coord.x, coord.y);
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = coord3 != null ? coord3.packed() : -1;
                                                                                    return 1;
                                                                                }
                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                return 1;
                                                                            }
                                                                            Coord coord = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                                                            WorldMapArea worldMapArea = Canvas.getWorldMap().getCurrentMapArea();
                                                                            if (worldMapArea != null) {
                                                                                int[] nArray = worldMapArea.position(coord.plane, coord.x, coord.y);
                                                                                if (nArray != null) {
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = nArray[0];
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = nArray[1];
                                                                                } else {
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                }
                                                                                return 1;
                                                                            }
                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                            return 1;
                                                                        }
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().currentMapAreaId();
                                                                        return 1;
                                                                    }
                                                                    Coord coord = Canvas.getWorldMap().getDisplayCoord();
                                                                    if (coord != null) {
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = coord.x;
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = coord.y;
                                                                    } else {
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                    }
                                                                    return 1;
                                                                }
                                                                int n16 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                WorldMapArea worldMapArea = Canvas.getWorldMap().getMapArea(n16);
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapArea != null ? worldMapArea.getZoom() : -1;
                                                                return 1;
                                                            }
                                                            int n17 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                            WorldMapArea worldMapArea = Canvas.getWorldMap().getMapArea(n17);
                                                            if (worldMapArea != null) {
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapArea.getRegionLowX() * 64;
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapArea.getRegionLowY() * 64;
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapArea.getRegionHighX() * 64 + 64 - 1;
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapArea.getRegionHighY() * 64 + 64 - 1;
                                                            } else {
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                            }
                                                            return 1;
                                                        }
                                                        int n18 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                        WorldMapArea worldMapArea = Canvas.getWorldMap().getMapArea(n18);
                                                        if (worldMapArea != null) {
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (worldMapArea.getRegionHighX() - worldMapArea.getRegionLowX() + 1) * 64;
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (worldMapArea.getRegionHighY() - worldMapArea.getRegionLowY() + 1) * 64;
                                                        } else {
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                        }
                                                        return 1;
                                                    }
                                                    int n19 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                    WorldMapArea worldMapArea = Canvas.getWorldMap().getMapArea(n19);
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = worldMapArea != null ? worldMapArea.getOrigin().packed() : 0;
                                                    return 1;
                                                }
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayX();
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getDisplayY();
                                                return 1;
                                            }
                                            Coord coord = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                            Canvas.getWorldMap().jumpToSourceCoordInstant(coord.plane, coord.x, coord.y);
                                            return 1;
                                        }
                                        Coord coord = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                        Canvas.getWorldMap().jumpToSourceCoord(coord.plane, coord.x, coord.y);
                                        return 1;
                                    }
                                    Coord coord = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                    Canvas.getWorldMap().setWorldMapPositionTargetInstant(coord.x, coord.y);
                                    return 1;
                                }
                                Coord coord = new Coord(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                Canvas.getWorldMap().setWorldMapPositionTarget(coord.x, coord.y);
                                return 1;
                            }
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().isCacheLoaded() ? 1 : 0;
                            return 1;
                        }
                        int n20 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        Canvas.getWorldMap().setZoomPercentage(n20);
                        return 1;
                    }
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Canvas.getWorldMap().getZoomLevel();
                    return 1;
                }
                int n21 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                Canvas.getWorldMap().setCurrentMapAreaId(n21);
                return 1;
            }
            int n22 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            String string = "";
            WorldMapArea worldMapArea = Canvas.getWorldMap().getMapArea(n22);
            if (worldMapArea != null) {
                string = worldMapArea.getExternalName();
            }
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string;
            return 1;
        }
        int n23 = GameEngine.field189.field1321;
        int n24 = (ModeWhere.localPlayer.x >> 7) + GameEngine.field189.field1324;
        int n25 = (ModeWhere.localPlayer.field1196 >> 7) + GameEngine.field189.field1325;
        Canvas.getWorldMap().method9730(n23, n24, n25, true);
        return 1;
    }

    @ObfuscatedName(value="js")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="789896050")
    static final void method7701(int n) {
        int n2;
        int[] nArray = class174.sceneMinimapSprite.pixels;
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
                class174.sceneMinimapSprite.setRaster();
                n4 = 1;
                while (true) {
                    int n6;
                    if (n4 >= 103) {
                        Client.mapIconCount = 0;
                        n4 = 0;
                        while (true) {
                            if (n4 >= 104) {
                                class6.rasterProvider.apply();
                                return;
                            }
                            for (n6 = 0; n6 < 104; ++n6) {
                                long l = GameEngine.field189.field1319.method4203(GameEngine.field189.field1321, n4, n6);
                                if (l == 0L) continue;
                                int n7 = class360.method7406(l);
                                int n8 = class142.getObjectDefinition((int)n7).mapIconId;
                                if (n8 < 0 || !class31.WorldMapElement_get((int)n8).field2530) continue;
                                Client.field719[Client.mapIconCount] = class31.WorldMapElement_get(n8).getSpriteBool(false);
                                Client.field658[Client.mapIconCount] = n4;
                                Client.field742[Client.mapIconCount] = n6;
                                ++Client.mapIconCount;
                            }
                            ++n4;
                        }
                    }
                    for (n6 = 1; n6 < 103; ++n6) {
                        if ((GameEngine.field189.field1337[n][n6][n4] & 0x18) == 0) {
                            FriendSystem.method2046(n, n6, n4, n2, n5);
                        }
                        if (n >= 3 || (GameEngine.field189.field1337[n + 1][n6][n4] & 8) == 0) continue;
                        FriendSystem.method2046(n + 1, n6, n4, n2, n5);
                    }
                    ++n4;
                }
            }
            n5 = (103 - n2) * 2048 + 24628;
            for (n4 = 1; n4 < 103; ++n4) {
                if ((GameEngine.field189.field1337[n][n4][n2] & 0x18) == 0) {
                    GameEngine.field189.field1319.method4210(nArray, n5, 512, n, n4, n2);
                }
                if (n < 3 && (GameEngine.field189.field1337[n + 1][n4][n2] & 8) != 0) {
                    GameEngine.field189.field1319.method4210(nArray, n5, 512, n + 1, n4, n2);
                }
                n5 += 4;
            }
            ++n2;
        }
    }
}

