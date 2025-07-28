package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rx")
class class462
implements Comparator {
    @ObfuscatedSignature(descriptor="Lri;")
    final /* synthetic */ class461 this$0;

    @ObfuscatedSignature(descriptor="(Lri;)V")
    class462(class461 class4612) {
        this.this$0 = class4612;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I", garbageValue="-2064664022")
    int method9017(Map.Entry entry, Map.Entry entry2) {
        return ((Float)entry2.getValue()).compareTo((Float)entry.getValue());
    }

    public int compare(Object object, Object object2) {
        return this.method9017((Map.Entry)object, (Map.Entry)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}

