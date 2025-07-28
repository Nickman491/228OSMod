/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.Export;
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
    @Export(value="userHomeDirectory")
    static String userHomeDirectory;
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
        Iterator iterator = Messages.Messages_hashTable.iterator();
        while (iterator.hasNext()) {
            Message message = (Message)iterator.next();
            message.clearIsFromIgnored();
        }
        return;
    }
}

