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

@ObfuscatedName(value="hu")
public class class186
extends class514 {
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-986149625)
    int field1996;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=771980369)
    int field1997;
    @ObfuscatedName(value="ax")
    int[] field1998;
    @ObfuscatedName(value="at")
    int[][] field1999;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lhn;")
    class184 field1991;

    public class186(int n, byte[] byArray) {
        int n2;
        this.field1996 = n;
        class556 class5562 = new class556(byArray);
        this.field1997 = class5562.method10282();
        this.field1998 = new int[this.field1997];
        this.field1999 = new int[this.field1997][];
        for (n2 = 0; n2 < this.field1997; ++n2) {
            this.field1998[n2] = class5562.method10282();
        }
        for (n2 = 0; n2 < this.field1997; ++n2) {
            this.field1999[n2] = new int[class5562.method10282()];
        }
        n2 = 0;
        while (true) {
            if (n2 >= this.field1997) {
                if (class5562.field5471 < class5562.field5470.length && (n2 = class5562.method10307()) > 0) {
                    this.field1991 = new class184(class5562, n2);
                }
                return;
            }
            for (int i = 0; i < this.field1999[n2].length; ++i) {
                this.field1999[n2][i] = class5562.method10282();
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1958480408")
    public int method4164() {
        return this.field1997;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)Lhn;", garbageValue="11")
    public class184 method4168() {
        return this.field1991;
    }

    @ObfuscatedName(value="kz")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="21389")
    static final boolean method4171() {
        return client.field647;
    }

    @ObfuscatedName(value="ov")
    @ObfuscatedSignature(descriptor="([BII)V", garbageValue="904018870")
    static void method4172(byte[] byArray, int n) {
        if (client.field782 == null) {
            client.field782 = new byte[24];
        }
        class451.method8889(byArray, n, client.field782, 0, 24);
    }
}

