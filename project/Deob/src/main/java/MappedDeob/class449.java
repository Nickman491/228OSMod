/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rv")
public class class449
extends class448 {
    @ObfuscatedName(value="ay")
    ArrayList field4871;

    @ObfuscatedSignature(descriptor="(Lrh;Ljava/util/ArrayList;)V")
    public class449(class448 class4482, ArrayList arrayList) {
        super(class4482);
        this.field4871 = arrayList;
        this.field4868 = "ConcurrentMidiTask";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        int n = 0;
        while (true) {
            if (n >= this.field4871.size()) {
                if (!this.field4871.isEmpty()) return false;
                return true;
            }
            class448 class4482 = (class448)this.field4871.get(n);
            if (class4482 == null) {
                this.field4871.remove(n);
                --n;
            } else if (class4482.vmethod8883()) {
                if (class4482.method8855()) {
                    this.method8861(class4482.method8870());
                    this.field4871.clear();
                    return true;
                }
                if (class4482.method8860() != null) {
                    this.field4871.add(class4482.method8860());
                }
                this.field4870 = class4482.field4870;
                this.field4871.remove(n);
                --n;
            }
            ++n;
        }
    }
}

