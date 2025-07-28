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

@ObfuscatedName(value="wb")
@Implements(value="Username")
public class Username
implements Comparable {
    @ObfuscatedName(value="ay")
    @Export(value="name")
    String name;
    @ObfuscatedName(value="ah")
    @Export(value="cleanName")
    String cleanName;

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Luo;)V")
    public Username(String string, LoginType loginType) {
        this.name = string;
        this.cleanName = class18.method270(string, loginType);
    }

    public Username(String string) {
        this.name = string;
        this.cleanName = class18.method270(string, LoginType.oldscape);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1230145962")
    @Export(value="getName")
    public String getName() {
        return this.name;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="920847303")
    public String method10974() {
        return this.cleanName;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="-15965")
    @Export(value="hasCleanName")
    public boolean hasCleanName() {
        return this.cleanName != null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lwb;I)I", garbageValue="-449735377")
    @Export(value="compareToTyped")
    public int compareToTyped(Username username) {
        if (this.cleanName != null) {
            if (username.cleanName == null) {
                return -1;
            }
            return this.cleanName.compareTo(username.cleanName);
        }
        if (username.cleanName == null) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Username)) {
            return false;
        }
        Username username = (Username)object;
        if (this.cleanName == null) {
            return username.cleanName == null;
        }
        if (username.cleanName == null) {
            return false;
        }
        if (this.hashCode() != username.hashCode()) {
            return false;
        }
        return this.cleanName.equals(username.cleanName);
    }

    public int hashCode() {
        if (this.cleanName == null) {
            return 0;
        }
        return this.cleanName.hashCode();
    }

    public String toString() {
        return this.getName();
    }

    public int compareTo(Object object) {
        return this.compareToTyped((Username)object);
    }
}

