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

@ObfuscatedName(value="ct")
@Implements(value="Message")
public class Message
extends DualNode {
    @ObfuscatedName(value="kw")
    @ObfuscatedGetter(intValue=-1531834981)
    @Export(value="cameraY")
    static int cameraY;
    @ObfuscatedName(value="tf")
    @ObfuscatedSignature(descriptor="Lcg;")
    @Export(value="decimator")
    static Decimator decimator;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-45791165)
    @Export(value="count")
    int count;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=855742145)
    @Export(value="cycle")
    int cycle;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=119134741)
    @Export(value="type")
    int type;
    @ObfuscatedName(value="ao")
    @Export(value="sender")
    String sender;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lwb;")
    @Export(value="senderUsername")
    Username senderUsername;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lsb;")
    @Export(value="isFromFriend0")
    TriBool isFromFriend0 = TriBool.TriBool_unknown;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lsb;")
    @Export(value="isFromIgnored0")
    TriBool isFromIgnored0 = TriBool.TriBool_unknown;
    @ObfuscatedName(value="ax")
    @Export(value="prefix")
    String prefix;
    @ObfuscatedName(value="at")
    @Export(value="text")
    String text;

    Message(int n, String string, String string2, String string3) {
        this.set(n, string, string2, string3);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue="-94")
    @Export(value="set")
    void set(int n, String string, String string2, String string3) {
        this.count = Tiles.method2572();
        this.cycle = Client.cycle;
        this.type = n;
        this.sender = string;
        this.fillSenderUsername();
        this.prefix = string2;
        this.text = string3;
        this.clearIsFromFriend();
        this.clearIsFromIgnored();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="662241692")
    @Export(value="clearIsFromFriend")
    void clearIsFromFriend() {
        this.isFromFriend0 = TriBool.TriBool_unknown;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-64")
    @Export(value="isFromFriend")
    final boolean isFromFriend() {
        if (this.isFromFriend0 == TriBool.TriBool_unknown) {
            this.fillIsFromFriend();
        }
        return this.isFromFriend0 == TriBool.TriBool_true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-65")
    @Export(value="fillIsFromFriend")
    void fillIsFromFriend() {
        this.isFromFriend0 = class10.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-348559967")
    @Export(value="clearIsFromIgnored")
    void clearIsFromIgnored() {
        this.isFromIgnored0 = TriBool.TriBool_unknown;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-538386494")
    @Export(value="isFromIgnored")
    final boolean isFromIgnored() {
        if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
            this.fillIsFromIgnored();
        }
        return this.isFromIgnored0 == TriBool.TriBool_true;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-929945081")
    @Export(value="fillIsFromIgnored")
    void fillIsFromIgnored() {
        this.isFromIgnored0 = class10.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    @Export(value="fillSenderUsername")
    final void fillSenderUsername() {
        this.senderUsername = this.sender != null ? new Username(Canvas.method48(this.sender), class383.loginType) : null;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lfs;", garbageValue="1020129089")
    static class137 method1253(int n) {
        class404[] class404Array = new class137[]{class137.field1604, class137.field1600, class137.field1596, class137.field1597, class137.field1598, class137.field1599};
        class137 class1372 = (class137)StructComposition.findEnumerated(class404Array, n);
        if (class1372 == null) {
            class1372 = class137.field1604;
        }
        return class1372;
    }
}

