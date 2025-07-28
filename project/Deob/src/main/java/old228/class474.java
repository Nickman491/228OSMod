package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="so")
public class class474
implements Comparable {
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lwb;")
    class579 field5002;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lwb;")
    class579 field5003;

    class474() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lso;I)I", garbageValue="1212702091")
    public int vmethod9266(class474 class4742) {
        return this.field5002.method10972(class4742.field5002);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)Lwb;", garbageValue="1358869311")
    public class579 method9161() {
        return this.field5002;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1878291951")
    public String method9162() {
        if (this.field5002 == null) {
            return "";
        }
        return this.field5002.method10969();
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="-45")
    public String method9163() {
        if (this.field5003 == null) {
            return "";
        }
        return this.field5003.method10969();
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(Lwb;Lwb;I)V", garbageValue="-1893783857")
    void method9164(class579 class5792, class579 class5793) {
        if (class5792 == null) {
            throw new NullPointerException();
        }
        this.field5002 = class5792;
        this.field5003 = class5793;
    }

    public int compareTo(Object object) {
        return this.vmethod9266((class474)object);
    }
}

