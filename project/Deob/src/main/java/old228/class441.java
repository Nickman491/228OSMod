package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qt")
public class class441
extends class448 {
    @ObfuscatedSignature(descriptor="(Lrh;)V")
    public class441(class448 class4482) {
        super(class4482);
        this.field4868 = "AddRequestTask";
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        while (!class333.field3631.isEmpty()) {
            class345 class3452 = (class345)class333.field3631.peek();
            if (class3452 != null) {
                class3452.field3743 = this.method8817();
                class333.field3623.add(class3452);
                class333.field3631.pop();
                continue;
            }
            class333.field3631.pop();
        }
        return true;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Lma;", garbageValue="-1744048906")
    class334 method8817() {
        class334 class3342 = null;
        Iterator iterator = class333.field3625.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (class3342 != null) {
                    ++class3342.field3668;
                    if (class3342.method6710() == 0 && class3342.method6717()) {
                        class3342.method6721();
                        class3342.method6714();
                        class3342.method6709(0);
                    }
                }
                return class3342;
            }
            class334 class3343 = (class334)iterator.next();
            if (class3343 == null || class3342 != null && class3342.field3668 <= class3343.field3668 && (class3343.method6710() != 0 || !class3343.method6717())) continue;
            class3342 = class3343;
        }
    }
}

