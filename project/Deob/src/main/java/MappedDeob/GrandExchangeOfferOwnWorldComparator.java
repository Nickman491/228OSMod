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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="cl")
@Implements(value="GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator
implements Comparator {
    @ObfuscatedName(value="ay")
    @Export(value="filterWorlds")
    boolean filterWorlds;

    GrandExchangeOfferOwnWorldComparator() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="1976626223")
    @Export(value="compare_bridged")
    int compare_bridged(GrandExchangeEvent grandExchangeEvent, GrandExchangeEvent grandExchangeEvent2) {
        if (grandExchangeEvent2.world == grandExchangeEvent.world) {
            return 0;
        }
        if (this.filterWorlds) {
            if (Client.worldId == grandExchangeEvent.world) {
                return -1;
            }
            if (grandExchangeEvent2.world == Client.worldId) {
                return 1;
            }
        }
        return grandExchangeEvent.world < grandExchangeEvent2.world ? -1 : 1;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int compare(Object object, Object object2) {
        return this.compare_bridged((GrandExchangeEvent)object, (GrandExchangeEvent)object2);
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1234038462")
    static int method1269(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
            if (n != ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
                if (n != ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
                    if (n != ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
                        if (n != ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
                            if (n != ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
                                if (n != ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
                                    if (n != ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
                                        if (n != ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
                                            if (n != ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
                                                boolean bl2;
                                                if (n != ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
                                                    boolean bl3;
                                                    if (n != ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
                                                        boolean bl4;
                                                        if (n != ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
                                                            boolean bl5;
                                                            if (n != ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
                                                                boolean bl6;
                                                                if (n != ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
                                                                    if (n != ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
                                                                        if (n != ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
                                                                            if (n != ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
                                                                                if (n != ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
                                                                                    if (n != ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
                                                                                        if (n != ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
                                                                                            if (n != ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
                                                                                                if (n != ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
                                                                                                    if (n != 3939) {
                                                                                                        return 2;
                                                                                                    }
                                                                                                    int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get((int)n2).isTradable ? 1 : 0;
                                                                                                    return 1;
                                                                                                }
                                                                                                int n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                GrandExchangeEvent grandExchangeEvent = (GrandExchangeEvent)class328.grandExchangeEvents.events.get(n3);
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = grandExchangeEvent.grandExchangeOffer.id;
                                                                                                return 1;
                                                                                            }
                                                                                            int n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                            GrandExchangeEvent grandExchangeEvent = (GrandExchangeEvent)class328.grandExchangeEvents.events.get(n4);
                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = grandExchangeEvent.grandExchangeOffer.unitPrice;
                                                                                            return 1;
                                                                                        }
                                                                                        int n5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                        GrandExchangeEvent grandExchangeEvent = (GrandExchangeEvent)class328.grandExchangeEvents.events.get(n5);
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = grandExchangeEvent.grandExchangeOffer.totalQuantity;
                                                                                        return 1;
                                                                                    }
                                                                                    int n6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                    GrandExchangeEvent grandExchangeEvent = (GrandExchangeEvent)class328.grandExchangeEvents.events.get(n6);
                                                                                    long l = ReflectionCheck.method724() - Widget.field3909 - grandExchangeEvent.age;
                                                                                    int n7 = (int)(l / 3600000L);
                                                                                    int n8 = (int)((l - (long)(n7 * 3600000)) / 60000L);
                                                                                    int n9 = (int)((l - (long)(n7 * 3600000) - (long)(n8 * 60000)) / 1000L);
                                                                                    String string = n7 + ":" + n8 / 10 + n8 % 10 + ":" + n9 / 10 + n9 % 10;
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string;
                                                                                    return 1;
                                                                                }
                                                                                int n10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                GrandExchangeEvent grandExchangeEvent = (GrandExchangeEvent)class328.grandExchangeEvents.events.get(n10);
                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = grandExchangeEvent.getPreviousOfferName();
                                                                                return 1;
                                                                            }
                                                                            int n11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                            GrandExchangeEvent grandExchangeEvent = (GrandExchangeEvent)class328.grandExchangeEvents.events.get(n11);
                                                                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = grandExchangeEvent.getOfferName();
                                                                            return 1;
                                                                        }
                                                                        int n12 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                        GrandExchangeEvent grandExchangeEvent = (GrandExchangeEvent)class328.grandExchangeEvents.events.get(n12);
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = grandExchangeEvent.world;
                                                                        return 1;
                                                                    }
                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class328.grandExchangeEvents == null ? 0 : class328.grandExchangeEvents.events.size();
                                                                    return 1;
                                                                }
                                                                boolean bl7 = bl6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                if (class328.grandExchangeEvents != null) {
                                                                    class328.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, bl6);
                                                                }
                                                                return 1;
                                                            }
                                                            boolean bl8 = bl5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                            if (class328.grandExchangeEvents != null) {
                                                                class328.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, bl5);
                                                            }
                                                            return 1;
                                                        }
                                                        boolean bl9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] == 1;
                                                        boolean bl10 = bl4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
                                                        if (class328.grandExchangeEvents != null) {
                                                            Client.GrandExchangeEvents_worldComparator.filterWorlds = bl4;
                                                            class328.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, bl9);
                                                        }
                                                        return 1;
                                                    }
                                                    boolean bl11 = bl3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                    if (class328.grandExchangeEvents != null) {
                                                        class328.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, bl3);
                                                    }
                                                    return 1;
                                                }
                                                boolean bl12 = bl2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                if (class328.grandExchangeEvents != null) {
                                                    class328.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, bl2);
                                                }
                                                return 1;
                                            }
                                            int n13 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                            int n14 = Client.grandExchangeOffers[n13].status();
                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n14 == 1 ? 1 : 0;
                                            return 1;
                                        }
                                        int n15 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                        int n16 = Client.grandExchangeOffers[n15].status();
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n16 == 5 ? 1 : 0;
                                        return 1;
                                    }
                                    int n17 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                    int n18 = Client.grandExchangeOffers[n17].status();
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n18 == 2 ? 1 : 0;
                                    return 1;
                                }
                                int n19 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                int n20 = Client.grandExchangeOffers[n19].status();
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n20 == 0 ? 1 : 0;
                                return 1;
                            }
                            int n21 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[n21].currentPrice;
                            return 1;
                        }
                        int n22 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[n22].currentQuantity;
                        return 1;
                    }
                    int n23 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[n23].totalQuantity;
                    return 1;
                }
                int n24 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[n24].unitPrice;
                return 1;
            }
            int n25 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[n25].id;
            return 1;
        }
        int n26 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[n26].type();
        return 1;
    }
}

