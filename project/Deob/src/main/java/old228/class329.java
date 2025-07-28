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

@ObfuscatedName(value="ms")
public final class class329 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=-4022445036769029259L)
    static long field3607;

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Lcx;", garbageValue="461656985")
    static class69 method6648() {
        if (class69.field820 < class69.field808) {
            return class69.field817[++class69.field820 - 1];
        }
        return null;
    }

    @ObfuscatedName(value="ii")
    @ObfuscatedSignature(descriptor="(Lda;I)V", garbageValue="171579587")
    static final void method6646(class99 class992) {
        boolean bl;
        boolean bl2 = class992.field1199 != client.field514 && class992.field1240 != -1 && class992.field1271 == 0 ? false : (bl = true);
        if (!bl) {
            SequenceDef class2652 = class33.method520(class992.field1240);
            bl = class2652 != null && !class2652.method5672() ? class992.field1242 + 1 > class2652.field2923[class992.field1241] : true;
        }
        if (bl) {
            int n = class992.field1199 - class992.field1263;
            int n2 = client.field514 - class992.field1263;
            int n3 = class992.field1268 * 936633408 + class992.field1247 * 128;
            int n4 = class992.field1249 * 128 + class992.field1268 * 936633408;
            int n5 = class992.field1268 * 936633408 + class992.field1248 * 128;
            int n6 = class992.field1250 * 128 + class992.field1268 * 936633408;
            class992.field1213 = (n5 * n2 + n3 * (n - n2)) / n;
            class992.field1196 = (n2 * n6 + n4 * (n - n2)) / n;
        }
        class992.field1269 = 0;
        class992.field1197 = class992.field1262 = class992.field1253;
    }
}

