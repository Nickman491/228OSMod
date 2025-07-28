/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pv")
public class class405 {
    static {
        new HashMap();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1071217045")
    static final void method7966(String string) {
        String string2 = string + " is already on your ignore list";
        Interpreter.addGameMessage(30, "", string2);
    }
}

