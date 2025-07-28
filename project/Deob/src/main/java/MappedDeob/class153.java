/*
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

@ObfuscatedName(value="fv")
public class class153 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=8826564680902898909L)
    long field1692;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=246819445)
    public int field1695 = -1;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lps;")
    IterableNodeDeque field1691 = new IterableNodeDeque();

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    public class153(Buffer buffer) {
        this.method3613(buffer);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="69")
    void method3613(Buffer buffer) {
        this.field1692 = buffer.readLong();
        this.field1695 = buffer.readInt();
        int n = buffer.readUnsignedByte();
        while (true) {
            class150 class1502;
            if (n == 0) {
                return;
            }
            if (n == 3) {
                class1502 = new class172(this);
            } else if (n == 1) {
                class1502 = new class148(this);
            } else if (n == 13) {
                class1502 = new class165(this);
            } else if (n == 4) {
                class1502 = new class157(this);
            } else if (n == 6) {
                class1502 = new class164(this);
            } else if (n == 5) {
                class1502 = new class149(this);
            } else if (n == 2) {
                class1502 = new class154(this);
            } else if (n == 7) {
                class1502 = new class147(this);
            } else if (n == 14) {
                class1502 = new class151(this);
            } else if (n == 8) {
                class1502 = new class168(this);
            } else if (n == 9) {
                class1502 = new class174(this);
            } else if (n == 10) {
                class1502 = new class160(this);
            } else if (n == 11) {
                class1502 = new class155(this);
            } else if (n == 12) {
                class1502 = new class159(this);
            } else {
                if (n != 15) break;
                class1502 = new class169(this);
            }
            ((class150)class1502).vmethod3879(buffer);
            this.field1691.addFirst(class1502);
            n = buffer.readUnsignedByte();
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="-28")
    public void method3612(ClanSettings clanSettings) {
        if (clanSettings.field1759 == this.field1692 && this.field1695 == clanSettings.field1738) {
            class150 class1502 = (class150)this.field1691.last();
            while (true) {
                if (class1502 == null) {
                    ++clanSettings.field1738;
                    return;
                }
                class1502.vmethod3882(clanSettings);
                class1502 = (class150)this.field1691.previous();
            }
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1157377129")
    public static void method3618() {
        class235.field2514.clear();
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1814785539")
    public static boolean method3620() {
        return !class333.field3626.isEmpty();
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-44")
    public static void method3619() {
        class333.field3626.clear();
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)I", garbageValue="-1352185577")
    static int method3617(String string) {
        if (!string.equals("centre")) {
            if (!string.equals("bottom") && !string.equals("right")) {
                return 0;
            }
            return 2;
        }
        return 1;
    }
}

