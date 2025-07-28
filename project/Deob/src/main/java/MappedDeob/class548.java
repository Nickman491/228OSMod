/*
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
extends DualNode {
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="[Lud;")
    class544[] field5413;
    @ObfuscatedName(value="ad")
    List field5412;

    @ObfuscatedSignature(descriptor="(Lpq;I)V")
    public class548(AbstractArchive abstractArchive, int n) {
        byte[] byArray = abstractArchive.takeFile(n, 0);
        this.method10163(new Buffer(byArray));
    }

    @ObfuscatedSignature(descriptor="(Lpq;II)V")
    public class548(AbstractArchive abstractArchive, int n, int n2) {
        byte[] byArray = abstractArchive.takeFile(n, n2 + 1);
        this.method10163(new Buffer(byArray));
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1568054940")
    void method10163(Buffer buffer) {
        int n = buffer.method10301();
        this.field5413 = new class544[n];
        this.field5412 = new ArrayList(n);
        int n2 = 0;
        block0: while (n2 < n) {
            this.field5413[n2] = (class544)StructComposition.findEnumerated(class544.method10125(), buffer.readUnsignedByte());
            int n3 = buffer.method10301();
            HashMap hashMap = new HashMap(n3);
            while (true) {
                ArrayList<Integer> arrayList;
                int n4;
                Object object;
                if (n3-- > 0) {
                    object = this.field5413[n2].method10123(buffer);
                    n4 = buffer.method10301();
                    arrayList = new ArrayList<Integer>();
                } else {
                    this.field5412.add(n2, hashMap);
                    ++n2;
                    continue block0;
                }
                while (n4-- > 0) {
                    int n5 = buffer.method10301();
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

