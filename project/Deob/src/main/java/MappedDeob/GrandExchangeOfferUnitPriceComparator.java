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

@ObfuscatedName(value="pe")
@Implements(value="GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator
implements Comparator {
    GrandExchangeOfferUnitPriceComparator() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;B)I", garbageValue="113")
    @Export(value="compare_bridged")
    int compare_bridged(GrandExchangeEvent grandExchangeEvent, GrandExchangeEvent grandExchangeEvent2) {
        return grandExchangeEvent.grandExchangeOffer.unitPrice < grandExchangeEvent2.grandExchangeOffer.unitPrice ? -1 : (grandExchangeEvent2.grandExchangeOffer.unitPrice == grandExchangeEvent.grandExchangeOffer.unitPrice ? 0 : 1);
    }

    public int compare(Object object, Object object2) {
        return this.compare_bridged((GrandExchangeEvent)object, (GrandExchangeEvent)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}

