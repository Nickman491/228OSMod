package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bo")
public class class47 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lcc;")
    class54 field304;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lbc;")
    class40 field306;
    @ObfuscatedName(value="az")
    ReentrantLock field305;

    @ObfuscatedSignature(descriptor="(Lcc;Lbc;)V")
    class47(class54 class546, class40 class408) {
        this.field304 = class546;
        this.field306 = class408;
        this.field305 = new ReentrantLock();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lue;ILjava/lang/String;I)Ljava/lang/String;", garbageValue="744078519")
    static String method906(class529 class5292, int n, String string) {
        if (class5292 == null) {
            return string;
        }
        class511 class5112 = (class511)class5292.method9967(n);
        if (class5112 == null) {
            return string;
        }
        return (String)class5112.field5170;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(III)Lct;", garbageValue="-799303863")
    static class64 method904(int n, int n2) {
        class83 class832 = (class83)class115.field1439.get(n);
        return class832.method2498(n2);
    }

    @ObfuscatedName(value="ow")
    @ObfuscatedSignature(descriptor="(Lna;I)Ljava/lang/String;", garbageValue="972230593")
    static String method905(class361 class3612) {
        if (class298.method6401(class232.method5133(class3612)) == 0) {
            return null;
        }
        if (class3612.field3963 != null && class3612.field3963.trim().length() != 0) {
            return class3612.field3963;
        }
        return null;
    }
}

