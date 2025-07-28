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

@ObfuscatedName(value="sa")
@Implements(value="FriendsChat")
public class FriendsChat
extends UserList {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Luo;")
    @Export(value="loginType")
    final LoginType loginType;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lsw;")
    @Export(value="localUser")
    final Usernamed localUser;
    @ObfuscatedName(value="ao")
    @Export(value="name")
    public String name = null;
    @ObfuscatedName(value="ad")
    @Export(value="owner")
    public String owner = null;
    @ObfuscatedName(value="an")
    @Export(value="minKick")
    public byte minKick;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1655402779)
    @Export(value="rank")
    public int rank;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-99232999)
    int field4989 = 1;

    @ObfuscatedSignature(descriptor="(Luo;Lsw;)V")
    public FriendsChat(LoginType loginType, Usernamed usernamed) {
        super(500);
        this.loginType = loginType;
        this.localUser = usernamed;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lso;", garbageValue="35")
    @Export(value="newInstance")
    User newInstance() {
        return new ClanMate();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)[Lso;", garbageValue="-1808909632")
    @Export(value="newTypedArray")
    User[] newTypedArray(int n) {
        return new ClanMate[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1660520999")
    final void method9105(String string) {
        String string2;
        String string3 = WorldMapRectangle.base37DecodeLong(class429.method8477(string));
        if (string3 == null) {
            string3 = "";
        }
        this.name = string2 = string3;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-549241957")
    final void method9109(String string) {
        String string2;
        String string3 = WorldMapRectangle.base37DecodeLong(class429.method8477(string));
        if (string3 == null) {
            string3 = "";
        }
        this.owner = string2 = string3;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="864106992")
    public final void method9126(Buffer buffer) {
        this.method9109(buffer.readStringCp1252NullTerminated());
        long l = buffer.readLong();
        this.method9105(class92.method2641(l));
        this.minKick = buffer.readByte();
        int n = buffer.method10441();
        if (n != -1) {
            this.clear();
            int n2 = 0;
            while (true) {
                if (n2 >= n) {
                    return;
                }
                ClanMate clanMate = (ClanMate)this.addLastNoPreviousUsername(new Username(buffer.readStringCp1252NullTerminated(), this.loginType));
                int n3 = buffer.readUnsignedShort();
                clanMate.set(n3, ++this.field4989 - 1);
                clanMate.rank = buffer.readByte();
                buffer.readStringCp1252NullTerminated();
                this.isLocalPlayer(clanMate);
                ++n2;
            }
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="423902017")
    public final void method9108(Buffer buffer) {
        Username username = new Username(buffer.readStringCp1252NullTerminated(), this.loginType);
        int n = buffer.readUnsignedShort();
        byte by = buffer.readByte();
        boolean bl = false;
        if (by == -128) {
            bl = true;
        }
        if (!bl) {
            buffer.readStringCp1252NullTerminated();
            ClanMate clanMate = (ClanMate)this.getByCurrentUsername(username);
            if (clanMate == null) {
                if (this.getSize() > this.capacity) {
                    return;
                }
                clanMate = (ClanMate)this.addLastNoPreviousUsername(username);
            }
            clanMate.set(n, ++this.field4989 - 1);
            clanMate.rank = by;
            this.isLocalPlayer(clanMate);
        } else {
            if (this.getSize() == 0) {
                return;
            }
            ClanMate clanMate = (ClanMate)this.getByCurrentUsername(username);
            if (clanMate != null && clanMate.getWorld() == n) {
                this.remove(clanMate);
            }
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="95")
    public final void method9112() {
        int n = 0;
        while (n < this.getSize()) {
            ((ClanMate)this.get(n)).method9143();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1492487604")
    @Export(value="invalidateIgnoreds")
    public final void invalidateIgnoreds() {
        int n = 0;
        while (n < this.getSize()) {
            ((ClanMate)this.get(n)).clearIsIgnored();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lsc;I)V", garbageValue="1219520794")
    @Export(value="isLocalPlayer")
    final void isLocalPlayer(ClanMate clanMate) {
        if (clanMate.getUsername().equals(this.localUser.username())) {
            this.rank = clanMate.rank;
        }
    }
}

