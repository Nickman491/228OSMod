/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ud")
public class class544
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lud;")
    public static final class544 field5392 = new class544(2, 0, Integer.class, new class541());
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lud;")
    public static final class544 field5395 = new class544(1, 1, Long.class, new class543());
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lud;")
    public static final class544 field5393 = new class544(0, 2, String.class, new class545());
    @ObfuscatedName(value="ar")
    static String field5402;
    @ObfuscatedName(value="fd")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field5399;
    @ObfuscatedName(value="uh")
    @ObfuscatedGetter(intValue=1101882757)
    static int field5398;
    @ObfuscatedName(value="vp")
    @ObfuscatedSignature(descriptor="Ldq;")
    @Export(value="clientPreferences")
    static ClientPreferences clientPreferences;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1468080595)
    public final int field5394;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1822348369)
    public final int field5391;
    @ObfuscatedName(value="an")
    public final Class field5396;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Luj;")
    final class540 field5397;

    @ObfuscatedSignature(descriptor="(IILjava/lang/Class;Luj;)V")
    class544(int n, int n2, Class clazz, class540 class5402) {
        this.field5394 = n;
        this.field5391 = n2;
        this.field5396 = clazz;
        this.field5397 = class5402;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field5391;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;B)Ljava/lang/Object;", garbageValue="35")
    public Object method10123(Buffer buffer) {
        return this.field5397.vmethod10140(buffer);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lud;", garbageValue="583849502")
    public static class544[] method10125() {
        return new class544[]{field5393, field5392, field5395};
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Ldm;", garbageValue="1")
    @Export(value="getWorldMapScript")
    static Script getWorldMapScript(int n, int n2, int n3) {
        int n4 = class241.method5261(n2, n);
        Script script = class158.method3668(n4, n);
        if (script == null) {
            int n5 = (-3 - n3 << 8) + n;
            n4 = n5;
            script = class158.method3668(n4, n);
            if (script == null) {
                n4 = class454.method8933(n);
                script = class158.method3668(n4, n);
                if (script == null) {
                    return null;
                }
                return script;
            }
            return script;
        }
        return script;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Class;B)Lud;", garbageValue="46")
    public static class544 method10119(Class clazz) {
        class544[] class544Array = class544.method10125();
        int n = 0;
        while (n < class544Array.length) {
            class544 class5442 = class544Array[n];
            if (class5442.field5396 == clazz) {
                return class5442;
            }
            ++n;
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="119")
    static final boolean method10126(int n) {
        return n == 16 || n == 17 || n >= 18 && n <= 22;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;Lvy;B)V", garbageValue="1")
    public static void method10136(Object object, Buffer buffer) {
        Class<?> clazz = object.getClass();
        Object object2 = class544.method10119(clazz);
        if (object2 == null) {
            throw new IllegalArgumentException();
        }
        class540 class5402 = ((class544)object2).field5397;
        object2 = class5402;
        object2.vmethod10147(object, buffer);
    }

    @ObfuscatedName(value="mm")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="109")
    @Export(value="getTapToDrop")
    static boolean getTapToDrop() {
        return Client.tapToDrop;
    }
}

