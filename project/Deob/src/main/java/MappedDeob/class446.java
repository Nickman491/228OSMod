/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
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
            if (this.field4860.field3739 > 0.0f && this.field4860.field3743.isReady()) {
                float f = this.field4862 == 0 ? (float)this.field4862 : (float)this.field4860.field3738 / (float)this.field4862;
                this.field4860.field3739 = this.field4860.field3739 - (f == 0.0f ? (float)this.field4860.field3738 : f);
                if (this.field4860.field3739 < 0.0f) {
                    this.field4860.field3739 = 0.0f;
                }
                this.field4860.field3743.setPcmStreamVolume((int)this.field4860.field3739);
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
    @Export(value="getNpcDefinition")
    public static NPCComposition getNpcDefinition(int n) {
        NPCComposition nPCComposition = (NPCComposition)NPCComposition.NpcDefinition_cached.get(n);
        if (nPCComposition != null) {
            return nPCComposition;
        }
        byte[] byArray = NPCComposition.NpcDefinition_archive.takeFile(9, n);
        nPCComposition = new NPCComposition();
        nPCComposition.id = n;
        if (byArray != null) {
            nPCComposition.decode(new Buffer(byArray));
        }
        nPCComposition.postDecode();
        NPCComposition.NpcDefinition_cached.put(nPCComposition, n);
        return nPCComposition;
    }

    @ObfuscatedName(value="kf")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="842608515")
    public static final void method8847(int n, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < Client.rootWidgetCount) {
            if (Client.rootWidgetXs[n5] + Client.rootWidgetWidths[n5] > n && Client.rootWidgetXs[n5] < n + n3 && Client.rootWidgetHeights[n5] + Client.rootWidgetYs[n5] > n2 && Client.rootWidgetYs[n5] < n4 + n2) {
                Client.field732[n5] = true;
            }
            ++n5;
        }
        return;
    }
}

