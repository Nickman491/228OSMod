/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="so")
@Implements(value="User")
public class User
implements Comparable {
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lwb;")
    @Export(value="username")
    Username username;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lwb;")
    @Export(value="previousUsername")
    Username previousUsername;

    User() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lso;I)I", garbageValue="1212702091")
    @Export(value="compareTo_user")
    public int compareTo_user(User user) {
        return this.username.compareToTyped(user.username);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)Lwb;", garbageValue="1358869311")
    @Export(value="getUsername")
    public Username getUsername() {
        return this.username;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1878291951")
    @Export(value="getName")
    public String getName() {
        if (this.username == null) {
            return "";
        }
        return this.username.getName();
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="-45")
    @Export(value="getPreviousName")
    public String getPreviousName() {
        if (this.previousUsername == null) {
            return "";
        }
        return this.previousUsername.getName();
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(Lwb;Lwb;I)V", garbageValue="-1893783857")
    @Export(value="set")
    void set(Username username, Username username2) {
        if (username == null) {
            throw new NullPointerException();
        }
        this.username = username;
        this.previousUsername = username2;
    }

    public int compareTo(Object object) {
        return this.compareTo_user((User)object);
    }
}

