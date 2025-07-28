/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mg")
public class class330 {
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1734069698")
    @Export(value="Messages_getLastChatID")
    static int Messages_getLastChatID(int n) {
        Message message = (Message)Messages.Messages_hashTable.get(n);
        if (message == null) {
            return -1;
        }
        if (message.previousDual == Messages.Messages_queue.sentinel) {
            return -1;
        }
        return ((Message)message.previousDual).count;
    }
}

