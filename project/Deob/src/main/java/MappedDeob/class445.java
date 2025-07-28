/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rd")
public class class445
extends class448 {
    @ObfuscatedSignature(descriptor="(Lrh;)V")
    public class445(class448 class4482) {
        super(class4482);
        this.field4868 = "StartSongTask";
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        for (class345 class3452 : class333.field3623) {
            if (class3452 == null || class3452.field3742 || class3452.field3743 == null) continue;
            try {
                class3452.field3743.method6713();
                class3452.field3743.setPcmStreamVolume(0);
                if (class3452.field3747 != null) {
                    class3452.field3743.setMusicTrack(class3452.field3747, class3452.field3740);
                }
                class3452.field3747 = null;
                class3452.field3746 = null;
                class3452.field3736 = null;
                class3452.field3742 = true;
            }
            catch (Exception exception) {
                class255.RunException_sendStackTrace(null, exception);
                this.method8861(exception.getMessage());
                return true;
            }
        }
        this.field4870 = true;
        return true;
    }
}

