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

@ObfuscatedName(value="si")
@Implements(value="FriendsList")
public class FriendsList
extends UserList {
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Luo;")
    @Export(value="loginType")
    final LoginType loginType;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1250552947)
    int field4981 = 1;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpi;")
    @Export(value="friendLoginUpdates")
    public LinkDeque friendLoginUpdates = new LinkDeque();

    @ObfuscatedSignature(descriptor="(Luo;)V")
    public FriendsList(LoginType loginType) {
        super(400);
        this.loginType = loginType;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lso;", garbageValue="35")
    @Export(value="newInstance")
    User newInstance() {
        return new Friend();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)[Lso;", garbageValue="-1808909632")
    @Export(value="newTypedArray")
    User[] newTypedArray(int n) {
        return new Friend[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lwb;ZI)Z", garbageValue="-1389788629")
    @Export(value="isFriended")
    public boolean isFriended(Username username, boolean bl) {
        Friend friend = (Friend)this.getByUsername(username);
        if (friend == null) {
            return false;
        }
        return !bl || friend.world != 0;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lvy;IS)V", garbageValue="4608")
    @Export(value="read")
    public void read(Buffer var1_1, int var2_2) {
        block0: while (true) {
            block17: {
                if (var1_1.offset >= var2_2) {
                    this.sort();
                    return;
                }
                var3_3 = var1_1.readUnsignedByte() == 1;
                var4_4 = new Username(var1_1.readStringCp1252NullTerminated(), this.loginType);
                var5_5 = new Username(var1_1.readStringCp1252NullTerminated(), this.loginType);
                var6_6 = var1_1.readUnsignedShort();
                var7_7 = var1_1.readUnsignedByte();
                var8_8 = var1_1.readUnsignedByte();
                var9_9 = (var8_8 & 2) != 0;
                v0 = var10_10 = (var8_8 & 1) != 0;
                if (var6_6 > 0) {
                    var1_1.readStringCp1252NullTerminated();
                    var1_1.readUnsignedByte();
                    var1_1.readInt();
                }
                var1_1.readStringCp1252NullTerminated();
                if (var4_4 == null || !var4_4.hasCleanName()) break;
                var11_11 = (Friend)this.getByCurrentUsername(var4_4);
                if (var3_3 && (var12_12 = (Friend)this.getByCurrentUsername(var5_5)) != null && var11_11 != var12_12) {
                    if (var11_11 == null) {
                        var11_11 = var12_12;
                    } else {
                        this.remove(var12_12);
                    }
                }
                if (var11_11 != null) break block17;
                if (this.getSize() >= 400) continue;
                var11_11 = (Friend)this.addLast(var4_4, var5_5);
                ** GOTO lbl42
            }
            this.changeName(var11_11, var4_4, var5_5);
            if (var6_6 == var11_11.world) ** GOTO lbl42
            var14_14 = true;
            var13_13 = (FriendLoginUpdate)this.friendLoginUpdates.last();
            while (true) {
                block18: {
                    if (var13_13 != null) break block18;
                    if (var14_14) {
                        this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4_4, var6_6));
                    }
lbl42:
                    // 5 sources

                    if (var6_6 != var11_11.world) {
                        var11_11.int2 = ++this.field4981 - 1;
                        if (var11_11.world == -1 && var6_6 == 0) {
                            var11_11.int2 = -(var11_11.int2 * -2003439171) * -1806970475;
                        }
                        var11_11.world = var6_6;
                    }
                    var11_11.rank = var7_7;
                    var11_11.field4990 = var9_9;
                    var11_11.field4991 = var10_10;
                    continue block0;
                }
                if (var13_13.username.equals(var4_4)) {
                    if (var6_6 != 0 && var13_13.world == 0) {
                        var13_13.remove();
                        var14_14 = false;
                    } else if (var6_6 == 0 && var13_13.world != 0) {
                        var13_13.remove();
                        var14_14 = false;
                    }
                }
                var13_13 = (FriendLoginUpdate)this.friendLoginUpdates.previous();
            }
            break;
        }
        throw new IllegalStateException();
    }

    @ObfuscatedName(value="nf")
    @ObfuscatedSignature(descriptor="(Lna;I)Z", garbageValue="-1721141643")
    static final boolean method9092(Widget widget) {
        int n = widget.contentType;
        if (n != 205) {
            int n2;
            int n3;
            if (n >= 300 && n <= 313) {
                n3 = (n - 300) / 2;
                n2 = n & 1;
                Client.playerAppearance.changeAppearance(n3, n2 == 1);
            }
            if (n >= 314 && n <= 323) {
                n3 = (n - 314) / 2;
                n2 = n & 1;
                Client.playerAppearance.method7055(n3, n2 == 1);
            }
            if (n == 324) {
                Client.playerAppearance.method7087(0);
            }
            if (n == 325) {
                Client.playerAppearance.method7087(1);
            }
            if (n != 326) {
                return false;
            }
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3364, Client.packetWriter.isaacCipher);
            Client.playerAppearance.write(packetBufferNode.packetBuffer);
            Client.packetWriter.addNode(packetBufferNode);
            return true;
        }
        Client.logoutTimer = 250;
        return true;
    }
}

