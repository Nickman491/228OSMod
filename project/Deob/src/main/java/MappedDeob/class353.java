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

@ObfuscatedName(value="nl")
public class class353 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=887651347)
    public int field3783;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1120993141)
    public int field3781;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1023470549)
    public int field3782;

    class353() {
    }

    @ObfuscatedName(value="ok")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="492656019")
    static void method7037(int n) {
        SequenceDefinition sequenceDefinition = class33.SequenceDefinition_get(n);
        if (sequenceDefinition.isCachedModelIdSet()) {
            if (class166.method3808(sequenceDefinition.SequenceDefinition_cachedModelId) == 2) {
                Client.field792.add(sequenceDefinition.SequenceDefinition_cachedModelId);
            }
            return;
        }
    }
}

