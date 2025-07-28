/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dy")
public class class96 {
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lpq;IB)V", garbageValue="51")
    public static void method2709(AbstractArchive abstractArchive, int n) {
        if (!class333.field3626.isEmpty()) {
            ArrayList<class345> arrayList = new ArrayList<class345>();
            Iterator iterator = class333.field3626.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    class1.method9(arrayList, class333.field3630, class333.field3632, class333.field3633, class333.field3634, false);
                    return;
                }
                class345 class3452 = (class345)iterator.next();
                class3452.field3742 = false;
                class3452.field3741 = false;
                class3452.field3745 = false;
                class3452.field3744 = false;
                class3452.field3736 = abstractArchive;
                class3452.field3738 = n;
                class3452.field3739 = 0.0f;
                arrayList.add(class3452);
            }
        }
    }

    @ObfuscatedName(value="il")
    @ObfuscatedSignature(descriptor="(Ldz;Lda;I)V", garbageValue="-498840566")
    static final void method2710(class103 class1032, Actor actor) {
        int n;
        int n2;
        int n3;
        int n4;
        class67 class672;
        int n5;
        int n6;
        if (actor.field1230 != -1) {
            class103 class1033 = null;
            Actor actor2 = null;
            n6 = 65536;
            if (actor.field1230 >= n6) {
                n5 = actor.field1230 - n6;
                class1033 = BuddyRankComparator.method3366(n5, Client.field508);
                actor2 = class1033.field1329[n5];
            } else {
                class1033 = class508.method9616(actor.field1230, Client.field508);
                actor2 = class1033.field1330[actor.field1230];
            }
            if (actor2 == null) {
                if (actor.field1236) {
                    actor.field1230 = -1;
                    actor.field1236 = false;
                }
            } else {
                class426 class4262 = Varps.method6964(actor.x, 0.0f, actor.field1196);
                class426 class4263 = Varps.method6964(actor2.x, 0.0f, actor2.field1196);
                if (class1032.field1320 != -1) {
                    class672 = GameEngine.field189.field1318[class1032.field1320];
                    class4262 = class672.method9302(actor.x, actor.field1196);
                }
                if (class1033.field1320 != -1) {
                    class672 = GameEngine.field189.field1318[class1033.field1320];
                    class4263 = class672.method9302(actor2.x, actor2.field1196);
                }
                n4 = (int)(class4262.field4747 - class4263.field4747);
                int n7 = (int)(class4262.field4749 - class4263.field4749);
                if (n4 != 0 || n7 != 0) {
                    int n8;
                    Actor actor3 = actor;
                    actor3.field1262 = n8 = (int)(Math.atan2(n4, n7) * 325.94932345220167) & 0x7FF;
                }
            }
        }
        if (actor.field1265 == 0 || actor.field1269 > 0) {
            n3 = -1;
            if (actor.field1233 != -1 && actor.field1205 != -1) {
                n2 = Coord.method6980(actor.field1233 - GameEngine.field189.field1324);
                n6 = Coord.method6980(actor.field1205 - GameEngine.field189.field1325);
                n5 = actor.x - n2;
                n = actor.field1196 - n6;
                if (n5 != 0 || n != 0) {
                    n3 = n4 = (int)(Math.atan2(n5, n) * 325.94932345220167) & 0x7FF;
                }
            } else if (actor.field1232 != -1) {
                n3 = actor.field1232;
            }
            if (n3 != -1) {
                actor.field1262 = n3;
                if (actor.field1235) {
                    actor.field1197 = actor.field1262;
                }
            }
            actor.method2782();
        }
        if ((n3 = actor.field1262 - actor.field1197 & 0x7FF) == 0) {
            if (actor.field1236) {
                actor.field1230 = -1;
                actor.field1236 = false;
            }
            actor.field1231 = 0;
        } else {
            n2 = -1;
            n6 = 1;
            ++actor.field1231;
            n5 = n3 > 1024 ? -1 : 1;
            actor.field1197 += n5 * actor.field1200;
            n = 1;
            if (n3 < actor.field1200 || n3 > 2048 - actor.field1200) {
                actor.field1197 = actor.field1262;
                n = 0;
            }
            if (actor.field1200 > 0 && actor.field1201 == actor.field1238 && (actor.field1231 > 25 || n != 0)) {
                actor.field1238 = n5 != -1 || actor.field1202 == -1 ? (n5 == 1 && actor.field1203 != -1 ? actor.field1203 : actor.field1204) : actor.field1202;
            }
            class672 = actor;
            actor.field1197 = ((Actor)class672).field1197 & 0x7FF;
        }
    }
}

