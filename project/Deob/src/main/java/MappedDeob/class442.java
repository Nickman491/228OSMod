/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rp")
public class class442
extends class448 {
    @ObfuscatedSignature(descriptor="(Lrh;)V")
    public class442(class448 class4482) {
        super(class4482);
        this.field4868 = "SwapSongTask";
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        if (class333.field3623.size() > 1 && class333.field3623.get(0) != null && ((class345)class333.field3623.get((int)0)).field3743.isReady() && class333.field3623.get(1) != null && ((class345)class333.field3623.get((int)1)).field3743.isReady()) {
            class345 class3452 = (class345)class333.field3623.get(0);
            class333.field3623.set(0, class333.field3623.get(1));
            class333.field3623.set(1, class3452);
        }
        return true;
    }
}

