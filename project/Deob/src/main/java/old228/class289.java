package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lp")
public class class289 {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Lqh;", garbageValue="-873555905")
    static class426 method6322() {
        class426[] class426Array = class426.field4746;
        synchronized (class426.field4746) {
            if (class426.field4742 == 0) {
                // ** MonitorExit[var0] (shouldn't be in output)
                return new class426();
            }
            class426.field4746[--class426.field4742].method8287();
            // ** MonitorExit[var0] (shouldn't be in output)
            return class426.field4746[class426.field4742];
        }
    }
}

