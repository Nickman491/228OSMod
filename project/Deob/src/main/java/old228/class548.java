package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vr")
public class class548
extends class510 {
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="[Lud;")
    class544[] field5413;
    @ObfuscatedName(value="ad")
    List field5412;

    @ObfuscatedSignature(descriptor="(Lpq;I)V")
    public class548(class391 class3912, int n) {
        byte[] byArray = class3912.method7790(n, 0);
        this.method10163(new class556(byArray));
    }

    @ObfuscatedSignature(descriptor="(Lpq;II)V")
    public class548(class391 class3912, int n, int n2) {
        byte[] byArray = class3912.method7790(n, n2 + 1);
        this.method10163(new class556(byArray));
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1568054940")
    void method10163(class556 class5562) {
        int n = class5562.method10301();
        this.field5413 = new class544[n];
        this.field5412 = new ArrayList(n);
        int n2 = 0;
        block0: while (n2 < n) {
            this.field5413[n2] = (class544)class259.method5457(class544.method10125(), class5562.method10282());
            int n3 = class5562.method10301();
            HashMap hashMap = new HashMap(n3);
            while (true) {
                ArrayList<Integer> arrayList;
                int n4;
                Object object;
                if (n3-- > 0) {
                    object = this.field5413[n2].method10123(class5562);
                    n4 = class5562.method10301();
                    arrayList = new ArrayList<Integer>();
                } else {
                    this.field5412.add(n2, hashMap);
                    ++n2;
                    continue block0;
                }
                while (n4-- > 0) {
                    int n5 = class5562.method10301();
                    arrayList.add(n5);
                }
                hashMap.put(object, arrayList);
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;II)Ljava/util/List;", garbageValue="-2077876745")
    public List method10168(Object object, int n) {
        if (n < 0) {
            n = 0;
        }
        Map map = (Map)this.field5412.get(n);
        return (List)map.get(object);
    }
}

