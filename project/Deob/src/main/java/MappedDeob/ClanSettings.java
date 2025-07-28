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

@ObfuscatedName(value="gq")
@Implements(value="ClanSettings")
public class ClanSettings {
    @ObfuscatedName(value="fu")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field1762;
    @ObfuscatedName(value="qy")
    @ObfuscatedSignature(descriptor="Lis;")
    static class217 field1750;
    @ObfuscatedName(value="ah")
    @Export(value="useHashes")
    boolean useHashes;
    @ObfuscatedName(value="az")
    @Export(value="useNames")
    boolean useNames;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=-3709235999232645775L)
    long field1759;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-661585717)
    public int field1738 = 0;
    @ObfuscatedName(value="an")
    @Export(value="name")
    public String name = null;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1276121963)
    int field1740 = 0;
    @ObfuscatedName(value="ax")
    @Export(value="allowGuests")
    public boolean allowGuests;
    @ObfuscatedName(value="at")
    public byte field1742;
    @ObfuscatedName(value="ac")
    public byte field1753;
    @ObfuscatedName(value="au")
    public byte field1744;
    @ObfuscatedName(value="as")
    public byte field1745;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1201920345)
    @Export(value="memberCount")
    public int memberCount;
    @ObfuscatedName(value="af")
    @Export(value="memberHashes")
    long[] memberHashes;
    @ObfuscatedName(value="aa")
    @Export(value="memberRanks")
    public byte[] memberRanks;
    @ObfuscatedName(value="ak")
    @Export(value="sortedMembers")
    int[] sortedMembers;
    @ObfuscatedName(value="al")
    int[] field1757;
    @ObfuscatedName(value="av")
    public int[] field1751;
    @ObfuscatedName(value="ag")
    public boolean[] field1749;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-2066897607)
    @Export(value="currentOwner")
    public int currentOwner = -1;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=505072089)
    public int field1760 = -1;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-1741264551)
    @Export(value="bannedMemberCount")
    public int bannedMemberCount;
    @ObfuscatedName(value="am")
    @Export(value="bannedMemberHashes")
    long[] bannedMemberHashes;
    @ObfuscatedName(value="ap")
    @Export(value="memberNames")
    public String[] memberNames;
    @ObfuscatedName(value="ab")
    @Export(value="bannedMemberNames")
    public String[] bannedMemberNames;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="parameters")
    IterableNodeHashTable parameters;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    public ClanSettings(Buffer buffer) {
        this.method3703(buffer);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="2138067556")
    void method3753(int n) {
        if (this.useHashes) {
            if (this.memberHashes != null) {
                this.memberHashes = new long[n];
                System.arraycopy(this.memberHashes, 0, this.memberHashes, 0, this.memberCount);
            } else {
                this.memberHashes = new long[n];
            }
        }
        if (this.useNames) {
            if (this.memberNames != null) {
                this.memberNames = new String[n];
                System.arraycopy(this.memberNames, 0, this.memberNames, 0, this.memberCount);
            } else {
                this.memberNames = new String[n];
            }
        }
        if (this.memberRanks != null) {
            this.memberRanks = new byte[n];
            System.arraycopy(this.memberRanks, 0, this.memberRanks, 0, this.memberCount);
        } else {
            this.memberRanks = new byte[n];
        }
        if (this.field1757 != null) {
            this.field1757 = new int[n];
            System.arraycopy(this.field1757, 0, this.field1757, 0, this.memberCount);
        } else {
            this.field1757 = new int[n];
        }
        if (this.field1751 != null) {
            this.field1751 = new int[n];
            System.arraycopy(this.field1751, 0, this.field1751, 0, this.memberCount);
        } else {
            this.field1751 = new int[n];
        }
        if (this.field1749 != null) {
            this.field1749 = new boolean[n];
            System.arraycopy(this.field1749, 0, this.field1749, 0, this.memberCount);
        } else {
            this.field1749 = new boolean[n];
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1821713879")
    void method3686(int n) {
        if (this.useHashes) {
            if (this.bannedMemberHashes != null) {
                this.bannedMemberHashes = new long[n];
                System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes, 0, this.bannedMemberCount);
            } else {
                this.bannedMemberHashes = new long[n];
            }
        }
        if (this.useNames) {
            if (this.bannedMemberNames != null) {
                this.bannedMemberNames = new String[n];
                System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames, 0, this.bannedMemberCount);
            } else {
                this.bannedMemberNames = new String[n];
            }
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)I", garbageValue="-312021165")
    public int method3712(String string) {
        if (string != null && string.length() != 0) {
            int n = 0;
            while (true) {
                if (n >= this.memberCount) {
                    return -1;
                }
                if (this.memberNames[n].equals(string)) {
                    return n;
                }
                ++n;
            }
        }
        return -1;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)I", garbageValue="-47")
    public int method3711(int n, int n2, int n3) {
        int n4 = n3 == 31 ? -1 : (1 << n3 + 1) - 1;
        return (this.field1757[n] & n4) >>> n2;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/Integer;", garbageValue="-1059269862")
    @Export(value="getTitleGroupValue")
    public Integer getTitleGroupValue(int n) {
        if (this.parameters == null) {
            return null;
        }
        Node node = this.parameters.get(n);
        if (node != null && node instanceof IntegerNode) {
            return new Integer(((IntegerNode)node).integer);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="1423743648")
    @Export(value="getSortedMembers")
    public int[] getSortedMembers() {
        if (this.sortedMembers != null) return this.sortedMembers;
        String[] stringArray = new String[this.memberCount];
        this.sortedMembers = new int[this.memberCount];
        int n = 0;
        while (true) {
            if (n >= this.memberCount) {
                Renderable.method4461(stringArray, this.sortedMembers);
                return this.sortedMembers;
            }
            stringArray[n] = this.memberNames[n];
            if (stringArray[n] != null) {
                stringArray[n] = stringArray[n].toLowerCase();
            }
            this.sortedMembers[n] = n;
            ++n;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(JLjava/lang/String;II)V", garbageValue="1735897697")
    void method3691(long l, String string, int n) {
        if (string != null && string.length() == 0) {
            string = null;
        }
        if (l > 0L != this.useHashes) {
            throw new RuntimeException("");
        }
        if (this.useNames != (string != null)) {
            throw new RuntimeException("");
        }
        if (l > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || string != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
            this.method3753(this.memberCount + 5);
        }
        if (this.memberHashes != null) {
            this.memberHashes[this.memberCount] = l;
        }
        if (this.memberNames != null) {
            this.memberNames[this.memberCount] = string;
        }
        if (this.currentOwner != -1) {
            this.memberRanks[this.memberCount] = 0;
        } else {
            this.currentOwner = this.memberCount;
            this.memberRanks[this.memberCount] = 126;
        }
        this.field1757[this.memberCount] = 0;
        this.field1751[this.memberCount] = n;
        this.field1749[this.memberCount] = false;
        ++this.memberCount;
        this.sortedMembers = null;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1089096698")
    void method3692(int n) {
        if (n >= 0 && n < this.memberCount) {
            --this.memberCount;
            this.sortedMembers = null;
            if (this.memberCount != 0) {
                System.arraycopy(this.memberRanks, n + 1, this.memberRanks, n, this.memberCount - n);
                System.arraycopy(this.field1757, n + 1, this.field1757, n, this.memberCount - n);
                System.arraycopy(this.field1751, n + 1, this.field1751, n, this.memberCount - n);
                System.arraycopy(this.field1749, n + 1, this.field1749, n, this.memberCount - n);
                if (this.memberHashes != null) {
                    System.arraycopy(this.memberHashes, n + 1, this.memberHashes, n, this.memberCount - n);
                }
                if (this.memberNames != null) {
                    System.arraycopy(this.memberNames, n + 1, this.memberNames, n, this.memberCount - n);
                }
                this.updateOwner();
            } else {
                this.memberHashes = null;
                this.memberNames = null;
                this.memberRanks = null;
                this.field1757 = null;
                this.field1751 = null;
                this.field1749 = null;
                this.currentOwner = -1;
                this.field1760 = -1;
            }
            return;
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="30")
    @Export(value="updateOwner")
    void updateOwner() {
        if (this.memberCount != 0) {
            this.currentOwner = -1;
            this.field1760 = -1;
            int n = 0;
            byte by = this.memberRanks[0];
            int n2 = 1;
            while (true) {
                if (n2 >= this.memberCount) {
                    this.currentOwner = n;
                    if (this.currentOwner != -1) {
                        this.memberRanks[this.currentOwner] = 126;
                    }
                    return;
                }
                if (this.memberRanks[n2] <= by) {
                    if (this.field1760 == -1 && this.memberRanks[n2] == 125) {
                        this.field1760 = n2;
                    }
                } else {
                    if (by == 125) {
                        this.field1760 = n;
                    }
                    n = n2;
                    by = this.memberRanks[n2];
                }
                ++n2;
            }
        }
        this.currentOwner = -1;
        this.field1760 = -1;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(JLjava/lang/String;B)V", garbageValue="30")
    void method3693(long l, String string) {
        if (string != null && string.length() == 0) {
            string = null;
        }
        if (this.useHashes != l > 0L) {
            throw new RuntimeException("");
        }
        if (string != null != this.useNames) {
            throw new RuntimeException("");
        }
        if (l > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || string != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
            this.method3686(this.bannedMemberCount + 5);
        }
        if (this.bannedMemberHashes != null) {
            this.bannedMemberHashes[this.bannedMemberCount] = l;
        }
        if (this.bannedMemberNames != null) {
            this.bannedMemberNames[this.bannedMemberCount] = string;
        }
        ++this.bannedMemberCount;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1842806052")
    void method3694(int n) {
        --this.bannedMemberCount;
        if (this.bannedMemberCount != 0) {
            if (this.bannedMemberHashes != null) {
                System.arraycopy(this.bannedMemberHashes, n + 1, this.bannedMemberHashes, n, this.bannedMemberCount - n);
            }
            if (this.bannedMemberNames != null) {
                System.arraycopy(this.bannedMemberNames, n + 1, this.bannedMemberNames, n, this.bannedMemberCount - n);
            }
        } else {
            this.bannedMemberHashes = null;
            this.bannedMemberNames = null;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IBS)I", garbageValue="21359")
    int method3695(int n, byte by) {
        if (by != 126 && by != 127) {
            if (this.currentOwner == n && (this.field1760 == -1 || this.memberRanks[this.field1760] < 125)) {
                return -1;
            }
            if (this.memberRanks[n] == by) {
                return -1;
            }
            this.memberRanks[n] = by;
            this.updateOwner();
            return n;
        }
        return -1;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-635673545")
    boolean method3718(int n) {
        if (this.currentOwner != n && this.memberRanks[n] != 126) {
            this.memberRanks[this.currentOwner] = 125;
            this.field1760 = this.currentOwner;
            this.memberRanks[n] = 126;
            this.currentOwner = n;
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(IZB)I", garbageValue="-36")
    int method3687(int n, boolean bl) {
        if (this.field1749[n] == bl) {
            return -1;
        }
        this.field1749[n] = bl;
        return n;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIIB)I", garbageValue="1")
    int method3697(int n, int n2, int n3, int n4) {
        int n5 = (1 << n3) - 1;
        int n6 = n4 == 31 ? -1 : (1 << n4 + 1) - 1;
        int n7 = n6 ^ n5;
        n2 <<= n3;
        int n8 = this.field1757[n];
        if ((n8 & n7) == (n2 &= n7)) {
            return -1;
        }
        this.field1757[n] = (n8 &= ~n7) | n2;
        return n;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="114")
    boolean method3717(int n, int n2) {
        Node node;
        block6: {
            block5: {
                block4: {
                    if (this.parameters != null) break block4;
                    this.parameters = new IterableNodeHashTable(4);
                    break block5;
                }
                node = this.parameters.get(n);
                if (node == null) break block5;
                if (node instanceof IntegerNode) break block6;
                node.remove();
            }
            this.parameters.put(new IntegerNode(n2), n);
            return true;
        }
        IntegerNode integerNode = (IntegerNode)node;
        if (n2 == integerNode.integer) {
            return false;
        }
        integerNode.integer = n2;
        return true;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIIIB)Z", garbageValue="17")
    boolean method3731(int n, int n2, int n3, int n4) {
        Node node;
        int n5;
        block6: {
            block5: {
                block4: {
                    int n6 = (1 << n3) - 1;
                    int n7 = n4 == 31 ? -1 : (1 << n4 + 1) - 1;
                    n5 = n7 ^ n6;
                    n2 <<= n3;
                    n2 &= n5;
                    if (this.parameters != null) break block4;
                    this.parameters = new IterableNodeHashTable(4);
                    break block5;
                }
                node = this.parameters.get(n);
                if (node == null) break block5;
                if (node instanceof IntegerNode) break block6;
                node.remove();
            }
            this.parameters.put(new IntegerNode(n2), n);
            return true;
        }
        IntegerNode integerNode = (IntegerNode)node;
        if ((integerNode.integer & n5) == n2) {
            return false;
        }
        integerNode.integer &= ~n5;
        integerNode.integer |= n2;
        return true;
    }

    @ObfuscatedName(value="av")
    boolean method3701(int n, long l) {
        Node node;
        block6: {
            block5: {
                block4: {
                    if (this.parameters != null) break block4;
                    this.parameters = new IterableNodeHashTable(4);
                    break block5;
                }
                node = this.parameters.get(n);
                if (node == null) break block5;
                if (node instanceof class512) break block6;
                node.remove();
            }
            this.parameters.put(new class512(l), n);
            return true;
        }
        class512 class5122 = (class512)node;
        if (l == class5122.field5171) {
            return false;
        }
        class5122.field5171 = l;
        return true;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)Z", garbageValue="1950194387")
    boolean method3702(int n, String string) {
        ObjectNode objectNode;
        block10: {
            block8: {
                Node node;
                block9: {
                    block7: {
                        if (string == null) {
                            string = "";
                        } else if (string.length() > 80) {
                            string = string.substring(0, 80);
                        }
                        if (this.parameters != null) break block7;
                        this.parameters = new IterableNodeHashTable(4);
                        break block8;
                    }
                    node = this.parameters.get(n);
                    if (node == null) break block8;
                    if (!(node instanceof ObjectNode)) break block9;
                    objectNode = (ObjectNode)node;
                    if (objectNode.obj instanceof String) break block10;
                }
                node.remove();
            }
            this.parameters.put(new ObjectNode(string), n);
            return true;
        }
        if (string.equals(objectNode.obj)) {
            return false;
        }
        objectNode.remove();
        this.parameters.put(new ObjectNode(string), objectNode.key);
        return true;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="551467554")
    void method3703(Buffer buffer) {
        int n;
        int n2;
        block24: {
            n2 = buffer.readUnsignedByte();
            if (n2 < 1) throw new RuntimeException("" + n2);
            if (n2 > 6) {
                throw new RuntimeException("" + n2);
            }
            int n3 = buffer.readUnsignedByte();
            if ((n3 & 1) != 0) {
                this.useHashes = true;
            }
            if ((n3 & 2) != 0) {
                this.useNames = true;
            }
            if (!this.useHashes) {
                this.memberHashes = null;
                this.bannedMemberHashes = null;
            }
            if (!this.useNames) {
                this.memberNames = null;
                this.bannedMemberNames = null;
            }
            this.field1738 = buffer.readInt();
            this.field1740 = buffer.readInt();
            if (n2 <= 3 && this.field1740 != 0) {
                this.field1740 += 16912800;
            }
            this.memberCount = buffer.readUnsignedShort();
            this.bannedMemberCount = buffer.readUnsignedByte();
            this.name = buffer.readStringCp1252NullTerminated();
            if (n2 >= 4) {
                buffer.readInt();
            }
            this.allowGuests = buffer.readUnsignedByte() == 1;
            this.field1742 = buffer.readByte();
            this.field1753 = buffer.readByte();
            this.field1744 = buffer.readByte();
            this.field1745 = buffer.readByte();
            boolean bl = true;
            while (true) {
                block28: {
                    block29: {
                        block26: {
                            block27: {
                                block25: {
                                    if (!bl || (bl = false)) break block25;
                                    if (this.memberCount <= 0) break block26;
                                    if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
                                        this.memberHashes = new long[this.memberCount];
                                    }
                                    if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
                                        this.memberNames = new String[this.memberCount];
                                    }
                                    if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
                                        this.memberRanks = new byte[this.memberCount];
                                    }
                                    if (this.field1757 == null || this.field1757.length < this.memberCount) {
                                        this.field1757 = new int[this.memberCount];
                                    }
                                    if (this.field1751 == null || this.field1751.length < this.memberCount) {
                                        this.field1751 = new int[this.memberCount];
                                    }
                                    if (this.field1749 == null || this.field1749.length < this.memberCount) {
                                        this.field1749 = new boolean[this.memberCount];
                                    }
                                    n = 0;
                                }
                                if (n >= this.memberCount) break block27;
                                if (!this.useHashes) break block28;
                                break block29;
                            }
                            this.updateOwner();
                        }
                        if (this.bannedMemberCount <= 0) break block24;
                        if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
                            this.bannedMemberHashes = new long[this.bannedMemberCount];
                        }
                        if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) {
                            this.bannedMemberNames = new String[this.bannedMemberCount];
                        }
                        break;
                    }
                    this.memberHashes[n] = buffer.readLong();
                }
                if (this.useNames) {
                    this.memberNames[n] = buffer.readStringCp1252NullTerminatedOrNull();
                }
                this.memberRanks[n] = buffer.readByte();
                if (n2 >= 2) {
                    this.field1757[n] = buffer.readInt();
                }
                this.field1751[n] = n2 >= 5 ? buffer.readUnsignedShort() : 0;
                this.field1749[n] = n2 >= 6 ? buffer.readUnsignedByte() == 1 : false;
                ++n;
            }
            n = 0;
            while (true) {
                if (n >= this.bannedMemberCount) break;
                if (this.useHashes) {
                    this.bannedMemberHashes[n] = buffer.readLong();
                }
                if (this.useNames) {
                    this.bannedMemberNames[n] = buffer.readStringCp1252NullTerminatedOrNull();
                }
                ++n;
            }
        }
        if (n2 < 3) return;
        n = buffer.readUnsignedShort();
        if (n <= 0) return;
        this.parameters = new IterableNodeHashTable(n < 16 ? class357.method7049(n) : 16);
        while (n-- > 0) {
            int n4 = buffer.readInt();
            int n5 = n4 & 0x3FFFFFFF;
            int n6 = n4 >>> 30;
            if (n6 == 0) {
                int n7 = buffer.readInt();
                this.parameters.put(new IntegerNode(n7), n5);
                continue;
            }
            if (n6 == 1) {
                long l = buffer.readLong();
                this.parameters.put(new class512(l), n5);
                continue;
            }
            if (n6 != 2) continue;
            String string = buffer.readStringCp1252NullTerminated();
            this.parameters.put(new ObjectNode(string), n5);
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1266692188")
    static int method3688(int n, int n2) {
        if (n == -2) {
            return 12345678;
        }
        if (n != -1) {
            if ((n2 = (n & 0x7F) * n2 / 128) < 2) {
                n2 = 2;
            } else if (n2 > 126) {
                n2 = 126;
            }
            return (n & 0xFF80) + n2;
        }
        if (n2 >= 0) {
            if (n2 > 127) {
                n2 = 127;
            }
        } else {
            n2 = 0;
        }
        n2 = 127 - n2;
        return n2;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-591640412")
    static int method3755(int n, Script script, boolean bl) {
        return 2;
    }
}

