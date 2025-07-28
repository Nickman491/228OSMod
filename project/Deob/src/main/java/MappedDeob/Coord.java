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

@ObfuscatedName(value="nz")
@Implements(value="Coord")
public class Coord {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1769372871)
    @Export(value="plane")
    public int plane;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-556958301)
    @Export(value="x")
    public int x;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1962491797)
    @Export(value="y")
    public int y;

    @ObfuscatedSignature(descriptor="(Lnz;)V")
    public Coord(Coord coord) {
        this.plane = coord.plane;
        this.x = coord.x;
        this.y = coord.y;
    }

    public Coord(int n, int n2, int n3) {
        this.plane = n;
        this.x = n2;
        this.y = n3;
    }

    public Coord() {
        this.plane = -1;
    }

    public Coord(int n) {
        if (n == -1) {
            this.plane = -1;
        } else {
            this.plane = n >> 28 & 3;
            this.x = n >> 14 & 0x3FFF;
            this.y = n & 0x3FFF;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1106107104")
    public void method6967(int n) {
        if (n == -1) {
            this.plane = -1;
        } else {
            this.plane = n >> 28 & 3;
            this.x = n >> 14 & 0x3FFF;
            this.y = n & 0x3FFF;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="80")
    @Export(value="packed")
    public int packed() {
        return Coord.method6969(this.plane, this.x, this.y);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(S)I", garbageValue="30362")
    public int method6973() {
        return Coord.method6969(this.plane, this.x >> 13, this.y >> 13);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-331645768")
    public void method7009(int n, int n2, int n3) {
        int n4 = n >> 14 & 0xFF;
        int n5 = n & 0xFF;
        this.plane = n >> 28;
        this.x = (n4 << 13) + n2;
        this.y = n3 + (n5 << 13);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lnz;I)Z", garbageValue="1423613074")
    @Export(value="equalsCoord")
    boolean equalsCoord(Coord coord) {
        if (this.plane != coord.plane) {
            return false;
        }
        if (this.x != coord.x) {
            return false;
        }
        return this.y == coord.y;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/lang/String;", garbageValue="-112")
    @Export(value="toString")
    String toString(String string) {
        return this.plane + string + (this.x >> 6) + string + (this.y >> 6) + string + (this.x & 0x3F) + string + (this.y & 0x3F);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Coord)) {
            return false;
        }
        return this.equalsCoord((Coord)object);
    }

    public int hashCode() {
        return this.packed();
    }

    public String toString() {
        return this.toString(",");
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

