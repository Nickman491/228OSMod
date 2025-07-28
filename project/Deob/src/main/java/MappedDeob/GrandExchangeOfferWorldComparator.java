/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="py")
@Implements(value="GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator
implements Comparator {
    GrandExchangeOfferWorldComparator() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="1702190653")
    @Export(value="compare_bridged")
    int compare_bridged(GrandExchangeEvent grandExchangeEvent, GrandExchangeEvent grandExchangeEvent2) {
        return grandExchangeEvent.world < grandExchangeEvent2.world ? -1 : (grandExchangeEvent2.world == grandExchangeEvent.world ? 0 : 1);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int compare(Object object, Object object2) {
        return this.compare_bridged((GrandExchangeEvent)object, (GrandExchangeEvent)object2);
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="40")
    protected static final void method7902() {
        int n;
        class16.clock.mark();
        for (n = 0; n < 32; ++n) {
            GameEngine.graphicsTickTimes[n] = 0L;
        }
        for (n = 0; n < 32; ++n) {
            GameEngine.clientTickTimes[n] = 0L;
        }
        GameEngine.gameCyclesToDo = 0;
    }
}

