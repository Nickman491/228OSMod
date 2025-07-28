package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nz")
public class class350 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1769372871)
    public int field3766;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-556958301)
    public int field3764;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1962491797)
    public int field3765;

    @ObfuscatedSignature(descriptor="(Lnz;)V")
    public class350(class350 class3502) {
        this.field3766 = class3502.field3766;
        this.field3764 = class3502.field3764;
        this.field3765 = class3502.field3765;
    }

    public class350(int n, int n2, int n3) {
        this.field3766 = n;
        this.field3764 = n2;
        this.field3765 = n3;
    }

    public class350() {
        this.field3766 = -1;
    }

    public class350(int n) {
        if (n == -1) {
            this.field3766 = -1;
        } else {
            this.field3766 = n >> 28 & 3;
            this.field3764 = n >> 14 & 0x3FFF;
            this.field3765 = n & 0x3FFF;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1106107104")
    public void method6967(int n) {
        if (n == -1) {
            this.field3766 = -1;
        } else {
            this.field3766 = n >> 28 & 3;
            this.field3764 = n >> 14 & 0x3FFF;
            this.field3765 = n & 0x3FFF;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="80")
    public int method7003() {
        return class350.method6969(this.field3766, this.field3764, this.field3765);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(S)I", garbageValue="30362")
    public int method6973() {
        return class350.method6969(this.field3766, this.field3764 >> 13, this.field3765 >> 13);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-331645768")
    public void method7009(int n, int n2, int n3) {
        int n4 = n >> 14 & 0xFF;
        int n5 = n & 0xFF;
        this.field3766 = n >> 28;
        this.field3764 = (n4 << 13) + n2;
        this.field3765 = n3 + (n5 << 13);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lnz;I)Z", garbageValue="1423613074")
    boolean method6974(class350 class3502) {
        if (this.field3766 != class3502.field3766) {
            return false;
        }
        if (this.field3764 != class3502.field3764) {
            return false;
        }
        return this.field3765 == class3502.field3765;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/lang/String;", garbageValue="-112")
    String method6975(String string) {
        return this.field3766 + string + (this.field3764 >> 6) + string + (this.field3765 >> 6) + string + (this.field3764 & 0x3F) + string + (this.field3765 & 0x3F);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class350)) {
            return false;
        }
        return this.method6974((class350)object);
    }

    public int hashCode() {
        return this.method7003();
    }

    public String toString() {
        return this.method6975(",");
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIB)I", garbageValue="53")
    public static int method6969(int n, int n2, int n3) {
        return n << 28 | n2 << 14 | n3;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="257643024")
    public static int method6965(int n) {
        return n >> 28;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-820910170")
    public static int method6971(int n) {
        return n >> 14 & 0x3FFF;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-203751494")
    public static int method6972(int n) {
        return n & 0x3FFF;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="897125856")
    public static int method6976(int n) {
        return n >> 3;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="4")
    public static int method6970(int n) {
        return n << 3;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1803954006")
    public static int method6978(int n) {
        return n << 6;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="36970397")
    public static int method6979(int n) {
        return n << 3;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1562226791")
    public static int method6980(int n) {
        return (n << 7) + 64;
    }
}

