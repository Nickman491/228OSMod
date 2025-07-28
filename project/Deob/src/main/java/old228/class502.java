package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="tw")
public class class502 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltw;")
    public static final class502 field5137 = new class502("application/json");
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltw;")
    static final class502 field5135 = new class502("text/plain");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltw;")
    static final class502 field5138 = new class502("application/x-www-form-urlencoded");
    @ObfuscatedName(value="am")
    static String field5134;
    @ObfuscatedName(value="ao")
    String field5136;

    class502(String string) {
        this.field5136 = string;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="455008847")
    public String method9541() {
        return this.field5136;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1950558171")
    static void method9544() {
        Iterator iterator = class115.field1443.iterator();
        while (iterator.hasNext()) {
            class64 class642 = (class64)iterator.next();
            class642.method1238();
        }
        return;
    }
}

