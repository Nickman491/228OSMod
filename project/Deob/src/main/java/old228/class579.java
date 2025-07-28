package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="wb")
public class class579
implements Comparable {
    @ObfuscatedName(value="ay")
    String field5640;
    @ObfuscatedName(value="ah")
    String field5641;

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Luo;)V")
    public class579(String string, class534 class5342) {
        this.field5640 = string;
        this.field5641 = class18.method270(string, class5342);
    }

    public class579(String string) {
        this.field5640 = string;
        this.field5641 = class18.method270(string, class534.field5352);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1230145962")
    public String method10969() {
        return this.field5640;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="920847303")
    public String method10974() {
        return this.field5641;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="-15965")
    public boolean method10980() {
        return this.field5641 != null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lwb;I)I", garbageValue="-449735377")
    public int method10972(class579 class5792) {
        if (this.field5641 != null) {
            if (class5792.field5641 == null) {
                return -1;
            }
            return this.field5641.compareTo(class5792.field5641);
        }
        if (class5792.field5641 == null) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class579)) {
            return false;
        }
        class579 class5792 = (class579)object;
        if (this.field5641 == null) {
            return class5792.field5641 == null;
        }
        if (class5792.field5641 == null) {
            return false;
        }
        if (this.hashCode() != class5792.hashCode()) {
            return false;
        }
        return this.field5641.equals(class5792.field5641);
    }

    public int hashCode() {
        if (this.field5641 == null) {
            return 0;
        }
        return this.field5641.hashCode();
    }

    public String toString() {
        return this.method10969();
    }

    public int compareTo(Object object) {
        return this.method10972((class579)object);
    }
}

