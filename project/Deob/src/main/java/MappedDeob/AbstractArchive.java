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
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pq")
@Implements(value="AbstractArchive")
public abstract class AbstractArchive {
    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="Lws;")
    @Export(value="gzipDecompressor")
    static GZipDecompressor gzipDecompressor = new GZipDecompressor();
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=-391705417)
    static int field4585 = 0;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=-1154955815)
    int field4587;
    @ObfuscatedName(value="ab")
    @Export(value="groupIds")
    int[] groupIds;
    @ObfuscatedName(value="aj")
    int[] field4592;
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="Lwt;")
    @Export(value="groupNameHashTable")
    IntHashTable groupNameHashTable;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=119017569)
    int field4580;
    @ObfuscatedName(value="bw")
    @Export(value="groupCrcs")
    int[] groupCrcs;
    @ObfuscatedName(value="bb")
    @Export(value="groupVersions")
    int[] groupVersions;
    @ObfuscatedName(value="bx")
    @Export(value="fileCounts")
    int[] fileCounts;
    @ObfuscatedName(value="bd")
    @Export(value="fileIds")
    int[][] fileIds;
    @ObfuscatedName(value="bi")
    int[][] field4588;
    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="[Lwt;")
    @Export(value="fileNameHashTables")
    IntHashTable[] fileNameHashTables;
    @ObfuscatedName(value="bt")
    @Export(value="groups")
    Object[] groups;
    @ObfuscatedName(value="bf")
    @Export(value="files")
    Object[][] files;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=-625245881)
    @Export(value="hash")
    public int hash;
    @ObfuscatedName(value="bp")
    @Export(value="releaseGroups")
    boolean releaseGroups;
    @ObfuscatedName(value="bg")
    @Export(value="shallowFiles")
    boolean shallowFiles;

    AbstractArchive(boolean bl, boolean bl2) {
        this.releaseGroups = bl;
        this.shallowFiles = bl2;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1455866633")
    @Export(value="loadRegionFromGroup")
    void loadRegionFromGroup(int n) {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IS)V", garbageValue="20201")
    @Export(value="loadGroup")
    void loadGroup(int n) {
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-78")
    @Export(value="groupLoadPercent")
    int groupLoadPercent(int n) {
        if (this.groups[n] != null) {
            return 100;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="([BB)V", garbageValue="-32")
    @Export(value="decodeIndex")
    void decodeIndex(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl;
        int n7;
        this.hash = class428.method8382(byArray, byArray.length);
        Buffer buffer = new Buffer(TaskHandler.decompressBytes(byArray));
        int n8 = buffer.readUnsignedByte();
        if (n8 < 5 || n8 > 7) throw new RuntimeException("");
        if (n8 >= 6) {
            buffer.readInt();
        }
        boolean bl2 = ((n7 = buffer.readUnsignedByte()) & 1) != 0;
        boolean bl3 = (n7 & 2) != 0;
        boolean bl4 = (n7 & 4) != 0;
        boolean bl5 = bl = (n7 & 8) != 0;
        if (bl3) throw new UnsupportedOperationException("");
        if (bl4) throw new UnsupportedOperationException("");
        if (bl) throw new UnsupportedOperationException("");
        this.field4587 = n8 >= 7 ? buffer.method10298() : buffer.readUnsignedShort();
        int n9 = 0;
        int n10 = -1;
        this.groupIds = new int[this.field4587];
        if (n8 < 7) {
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.groupIds[n6] = n9 += buffer.readUnsignedShort();
                if (this.groupIds[n6] <= n10) continue;
                n10 = this.groupIds[n6];
            }
        } else {
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.groupIds[n6] = n9 += buffer.method10298();
                if (this.groupIds[n6] <= n10) continue;
                n10 = this.groupIds[n6];
            }
        }
        this.field4580 = n10 + 1;
        this.groupCrcs = new int[this.field4580];
        this.groupVersions = new int[this.field4580];
        this.fileCounts = new int[this.field4580];
        this.fileIds = new int[this.field4580][];
        this.groups = new Object[this.field4580];
        this.files = new Object[this.field4580][];
        if (bl2) {
            this.field4592 = new int[this.field4580];
            Arrays.fill(this.field4592, -1);
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.field4592[this.groupIds[n6]] = buffer.readInt();
            }
            this.groupNameHashTable = new IntHashTable(this.field4592);
        }
        for (n6 = 0; n6 < this.field4587; ++n6) {
            this.groupCrcs[this.groupIds[n6]] = buffer.readInt();
        }
        for (n6 = 0; n6 < this.field4587; ++n6) {
            this.groupVersions[this.groupIds[n6]] = buffer.readInt();
        }
        if (n8 < 7) {
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.fileCounts[this.groupIds[n6]] = buffer.readUnsignedShort();
            }
            block6: for (n6 = 0; n6 < this.field4587; ++n6) {
                n5 = this.groupIds[n6];
                n4 = this.fileCounts[n5];
                n9 = 0;
                n3 = -1;
                this.fileIds[n5] = new int[n4];
                n2 = 0;
                while (true) {
                    if (n2 >= n4) {
                        this.files[n5] = new Object[n3 + 1];
                        continue block6;
                    }
                    this.fileIds[n5][n2] = n9 += buffer.readUnsignedShort();
                    n = n9;
                    if (n > n3) {
                        n3 = n;
                    }
                    ++n2;
                }
            }
        } else {
            for (n6 = 0; n6 < this.field4587; ++n6) {
                this.fileCounts[this.groupIds[n6]] = buffer.method10298();
            }
            block9: for (n6 = 0; n6 < this.field4587; ++n6) {
                n5 = this.groupIds[n6];
                n4 = this.fileCounts[n5];
                n9 = 0;
                n3 = -1;
                this.fileIds[n5] = new int[n4];
                n2 = 0;
                while (true) {
                    if (n2 >= n4) {
                        this.files[n5] = new Object[n3 + 1];
                        continue block9;
                    }
                    this.fileIds[n5][n2] = n9 += buffer.method10298();
                    n = n9;
                    if (n > n3) {
                        n3 = n;
                    }
                    ++n2;
                }
            }
        }
        if (!bl2) return;
        this.field4588 = new int[n10 + 1][];
        this.fileNameHashTables = new IntHashTable[n10 + 1];
        n6 = 0;
        block11: while (n6 < this.field4587) {
            n5 = this.groupIds[n6];
            n4 = this.fileCounts[n5];
            this.field4588[n5] = new int[this.files[n5].length];
            Arrays.fill(this.field4588[n5], -1);
            n3 = 0;
            while (true) {
                if (n3 >= n4) {
                    this.fileNameHashTables[n5] = new IntHashTable(this.field4588[n5]);
                    ++n6;
                    continue block11;
                }
                n2 = this.fileIds[n5] != null ? this.fileIds[n5][n3] : n3;
                this.field4588[n5][n2] = buffer.readInt();
                ++n3;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(IIB)[B", garbageValue="0")
    @Export(value="takeFile")
    public byte[] takeFile(int n, int n2) {
        return this.takeFileEncrypted(n, n2, null);
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(II[II)[B", garbageValue="505728430")
    @Export(value="takeFileEncrypted")
    public byte[] takeFileEncrypted(int n, int n2, int[] nArray) {
        if (n >= 0 && n < this.files.length && this.files[n] != null && n2 >= 0 && n2 < this.files[n].length) {
            boolean bl;
            if (this.files[n][n2] == null && !(bl = this.buildFiles(n, nArray))) {
                this.loadGroup(n);
                bl = this.buildFiles(n, nArray);
                if (!bl) {
                    return null;
                }
            }
            byte[] byArray = GameEngine.method676(this.files[n][n2], false);
            if (this.shallowFiles) {
                this.files[n][n2] = null;
            }
            return byArray;
        }
        return null;
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="469868881")
    @Export(value="tryLoadFile")
    public boolean tryLoadFile(int n, int n2) {
        if (n >= 0 && n < this.files.length && this.files[n] != null && n2 >= 0 && n2 < this.files[n].length) {
            if (this.files[n][n2] != null) {
                return true;
            }
            if (this.groups[n] != null) {
                return true;
            }
            this.loadGroup(n);
            return this.groups[n] != null;
        }
        return false;
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-907088043")
    public boolean method7731(int n) {
        if (this.files.length == 1) {
            return this.tryLoadFile(0, n);
        }
        if (this.files[n].length == 1) {
            return this.tryLoadFile(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1231570039")
    @Export(value="tryLoadGroup")
    public boolean tryLoadGroup(int n) {
        if (this.groups[n] != null) {
            return true;
        }
        this.loadGroup(n);
        return this.groups[n] != null;
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-2039184779")
    @Export(value="isFullyLoaded")
    public boolean isFullyLoaded() {
        boolean bl = true;
        int n = 0;
        while (n < this.groupIds.length) {
            int n2 = this.groupIds[n];
            if (this.groups[n2] == null) {
                this.loadGroup(n2);
                if (this.groups[n2] == null) {
                    bl = false;
                }
            }
            ++n;
        }
        return bl;
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="-1896394370")
    @Export(value="takeFileFlat")
    public byte[] takeFileFlat(int n) {
        if (this.files.length == 1) {
            return this.takeFile(0, n);
        }
        if (this.files[n].length == 1) {
            return this.takeFile(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(III)[B", garbageValue="360301092")
    @Export(value="getFile")
    public byte[] getFile(int n, int n2) {
        if (n >= 0 && n < this.files.length && this.files[n] != null && n2 >= 0 && n2 < this.files[n].length) {
            boolean bl;
            if (this.files[n][n2] == null && !(bl = this.buildFiles(n, null))) {
                this.loadGroup(n);
                bl = this.buildFiles(n, null);
                if (!bl) {
                    return null;
                }
            }
            byte[] byArray = GameEngine.method676(this.files[n][n2], false);
            return byArray;
        }
        return null;
    }

    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="808469936")
    @Export(value="getFileFlat")
    public byte[] getFileFlat(int n) {
        if (this.files.length == 1) {
            return this.getFile(0, n);
        }
        if (this.files[n].length == 1) {
            return this.getFile(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="(II)[I", garbageValue="1073037891")
    @Export(value="getGroupFileIds")
    public int[] getGroupFileIds(int n) {
        if (n >= 0 && n < this.fileIds.length) {
            return this.fileIds[n];
        }
        return null;
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-242629885")
    @Export(value="getGroupFileCount")
    public int getGroupFileCount(int n) {
        if (this.files != null && n < this.files.length && this.files[n] != null) {
            return this.files[n].length;
        }
        return 0;
    }

    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1013330448")
    @Export(value="getGroupCount")
    public int getGroupCount() {
        return this.field4580;
    }

    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="36")
    @Export(value="clearGroups")
    public void clearGroups() {
        for (int i = 0; i < this.groups.length; ++i) {
            this.groups[i] = null;
        }
    }

    @ObfuscatedName(value="cu")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1672149413")
    @Export(value="clearFilesGroup")
    public void clearFilesGroup(int n) {
        for (int i = 0; i < this.files[n].length; ++i) {
            this.files[n][i] = null;
        }
    }

    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="15")
    @Export(value="clearFiles")
    public void clearFiles() {
        int n = 0;
        while (n < this.files.length) {
            if (this.files[n] != null) {
                for (int i = 0; i < this.files[n].length; ++i) {
                    this.files[n][i] = null;
                }
            }
            ++n;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="cf")
    @ObfuscatedSignature(descriptor="(I[II)Z", garbageValue="-660532610")
    @Export(value="buildFiles")
    boolean buildFiles(int n, int[] nArray) {
        if (this.groups[n] == null) {
            return false;
        }
        int n2 = this.fileCounts[n];
        int[] nArray2 = this.fileIds[n];
        Object[] objectArray = this.files[n];
        boolean bl = true;
        int n3 = 0;
        while (true) {
            block22: {
                Object object;
                byte[] byArray;
                block21: {
                    if (n3 >= n2) break block21;
                    if (objectArray[nArray2[n3]] != null) break block22;
                    bl = false;
                }
                if (bl) {
                    return true;
                }
                if (nArray != null && (nArray[0] != 0 || nArray[1] != 0 || nArray[2] != 0 || nArray[3] != 0)) {
                    byArray = GameEngine.method676(this.groups[n], true);
                    object = new Buffer(byArray);
                    ((Buffer)object).xteaDecrypt(nArray, 5, ((Buffer)object).array.length);
                } else {
                    byArray = GameEngine.method676(this.groups[n], false);
                }
                object = TaskHandler.decompressBytes(byArray);
                if (this.releaseGroups) {
                    this.groups[n] = null;
                }
                if (n2 <= 1) {
                    objectArray[nArray2[0]] = !this.shallowFiles ? ItemComposition.method5587((byte[])object, false) : object;
                    return true;
                }
                int n4 = ((byte[])object).length;
                int n5 = object[--n4] & 0xFF;
                Buffer buffer = new Buffer((byte[])object);
                int[] nArray3 = new int[n2];
                buffer.offset = n4 -= n5 * n2 * 4;
                int n6 = 0;
                while (true) {
                    int n7;
                    int n8;
                    if (n6 >= n5) {
                        byte[][] byArrayArray = new byte[n2][];
                        n8 = 0;
                        while (true) {
                            if (n8 >= n2) {
                                buffer.offset = n4;
                                n8 = 0;
                                n7 = 0;
                                while (true) {
                                    if (n7 >= n5) {
                                        n7 = 0;
                                        while (true) {
                                            if (n7 >= n2) {
                                                return true;
                                            }
                                            objectArray[nArray2[n7]] = !this.shallowFiles ? ItemComposition.method5587(byArrayArray[n7], false) : (Object)byArrayArray[n7];
                                            ++n7;
                                        }
                                    }
                                    int n9 = 0;
                                    int n10 = 0;
                                    while (n10 < n2) {
                                        System.arraycopy(object, n8, byArrayArray[n10], nArray3[n10], n9 += buffer.readInt());
                                        int n11 = n10++;
                                        nArray3[n11] = nArray3[n11] + n9;
                                        n8 += n9;
                                    }
                                    ++n7;
                                }
                            }
                            byArrayArray[n8] = new byte[nArray3[n8]];
                            nArray3[n8] = 0;
                            ++n8;
                        }
                    }
                    n8 = 0;
                    n7 = 0;
                    while (n7 < n2) {
                        int n12 = n7++;
                        nArray3[n12] = nArray3[n12] + (n8 += buffer.readInt());
                    }
                    ++n6;
                }
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ct")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="-104")
    @Export(value="getGroupId")
    public int getGroupId(String string) {
        string = string.toLowerCase();
        return this.groupNameHashTable.get(FaceNormal.hashString(string));
    }

    @ObfuscatedName(value="ci")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;B)I", garbageValue="116")
    @Export(value="getFileId")
    public int getFileId(int n, String string) {
        string = string.toLowerCase();
        return this.fileNameHashTables[n].get(FaceNormal.hashString(string));
    }

    @ObfuscatedName(value="cl")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;S)Z", garbageValue="-20842")
    @Export(value="isValidFileName")
    public boolean isValidFileName(String string, String string2) {
        string = string.toLowerCase();
        string2 = string2.toLowerCase();
        int n = this.groupNameHashTable.get(FaceNormal.hashString(string));
        if (n < 0) {
            return false;
        }
        int n2 = this.fileNameHashTables[n].get(FaceNormal.hashString(string2));
        return n2 >= 0;
    }

    @ObfuscatedName(value="cw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;I)[B", garbageValue="-10375944")
    @Export(value="takeFileByNames")
    public byte[] takeFileByNames(String string, String string2) {
        string = string.toLowerCase();
        string2 = string2.toLowerCase();
        int n = this.groupNameHashTable.get(FaceNormal.hashString(string));
        int n2 = this.fileNameHashTables[n].get(FaceNormal.hashString(string2));
        return this.takeFile(n, n2);
    }

    @ObfuscatedName(value="cj")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;I)Z", garbageValue="1876404966")
    @Export(value="tryLoadFileByNames")
    public boolean tryLoadFileByNames(String string, String string2) {
        string = string.toLowerCase();
        string2 = string2.toLowerCase();
        int n = this.groupNameHashTable.get(FaceNormal.hashString(string));
        int n2 = this.fileNameHashTables[n].get(FaceNormal.hashString(string2));
        return this.tryLoadFile(n, n2);
    }

    @ObfuscatedName(value="cx")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="1088736701")
    @Export(value="tryLoadGroupByName")
    public boolean tryLoadGroupByName(String string) {
        string = string.toLowerCase();
        int n = this.groupNameHashTable.get(FaceNormal.hashString(string));
        return this.tryLoadGroup(n);
    }

    @ObfuscatedName(value="cd")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="1")
    @Export(value="loadRegionFromName")
    public void loadRegionFromName(String string) {
        int n = this.groupNameHashTable.get(FaceNormal.hashString(string = string.toLowerCase()));
        if (n < 0) {
            return;
        }
        this.loadRegionFromGroup(n);
    }

    @ObfuscatedName(value="cv")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="7")
    @Export(value="groupLoadPercentByName")
    public int groupLoadPercentByName(String string) {
        string = string.toLowerCase();
        int n = this.groupNameHashTable.get(FaceNormal.hashString(string));
        return this.groupLoadPercent(n);
    }

    @ObfuscatedName(value="gf")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="4")
    static void method7820() {
        Client.packetWriter.clearBuffer();
        Client.packetWriter.field1456 = 0;
        Client.packetWriter.packetBuffer.offset = 0;
        Client.packetWriter.serverPacket = null;
        Client.packetWriter.field1458 = null;
        Client.packetWriter.field1447 = null;
        Client.packetWriter.field1460 = null;
        Client.packetWriter.field1452 = 0;
        Client.packetWriter.field1454 = 0;
        Client.rebootTimer = 0;
        class188.method4443();
        Client.minimapState = 0;
        Client.field744 = 0;
        GameEngine.field189.method2992();
        ItemContainer.itemContainers = new NodeHashTable(32);
        class360.updateGameState(30);
        for (int i = 0; i < 100; ++i) {
            Client.field713[i] = true;
        }
        if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3337, Client.packetWriter.isaacCipher);
            packetBufferNode.packetBuffer.writeByte(TextureProvider.getWindowedMode());
            packetBufferNode.packetBuffer.writeShort(BuddyRankComparator.canvasWidth);
            packetBufferNode.packetBuffer.writeShort(Huffman.canvasHeight);
            Client.packetWriter.addNode(packetBufferNode);
        }
    }
}

