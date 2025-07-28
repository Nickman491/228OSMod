package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rc")
public class class446
extends class448 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lnh;")
    class345 field4860 = null;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=989740517)
    int field4862 = 0;

    @ObfuscatedSignature(descriptor="(Lrh;IZI)V")
    public class446(class448 class4482, int n, boolean bl, int n2) {
        super(class4482);
        this.field4868 = "FadeOutTask";
        if (n >= 0) {
            if (bl && n < class333.field3631.size()) {
                this.field4860 = (class345)class333.field3631.get(n);
            } else if (!bl && n < class333.field3623.size()) {
                this.field4860 = (class345)class333.field3623.get(n);
            }
            this.field4862 = n2;
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        if (this.field4860 == null || this.field4860.field3743 == null) {
            return true;
        }
        this.field4860.field3745 = true;
        try {
            if (this.field4860.field3739 > 0.0f && this.field4860.field3743.method6717()) {
                float f = this.field4862 == 0 ? (float)this.field4862 : (float)this.field4860.field3738 / (float)this.field4862;
                this.field4860.field3739 = this.field4860.field3739 - (f == 0.0f ? (float)this.field4860.field3738 : f);
                if (this.field4860.field3739 < 0.0f) {
                    this.field4860.field3739 = 0.0f;
                }
                this.field4860.field3743.method6709((int)this.field4860.field3739);
                return false;
            }
        }
        catch (Exception exception) {
            this.method8861(exception.getMessage());
            return true;
        }
        this.field4860.field3745 = false;
        return true;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Ljz;", garbageValue="-56")
    public static class247 method8848(int n) {
        class247 class2472 = (class247)class247.field2653.method6578(n);
        if (class2472 != null) {
            return class2472;
        }
        byte[] byArray = class247.field2618.method7790(9, n);
        class2472 = new class247();
        class2472.field2625 = n;
        if (byArray != null) {
            class2472.method5316(new class556(byArray));
        }
        class2472.method5297();
        class247.field2653.method6590(class2472, n);
        return class2472;
    }

    @ObfuscatedName(value="kf")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="842608515")
    public static final void method8847(int n, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < client.field711) {
            if (client.field716[n5] + client.field718[n5] > n && client.field716[n5] < n + n3 && client.field605[n5] + client.field611[n5] > n2 && client.field611[n5] < n4 + n2) {
                client.field732[n5] = true;
            }
            ++n5;
        }
        return;
    }
}

