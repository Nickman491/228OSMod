/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.security.SecureRandom;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cv")
@Implements(value="ObjectSound")
public final class ObjectSound
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpm;")
    @Export(value="objectSounds")
    static NodeDeque objectSounds = new NodeDeque();
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1131317725)
    int field835;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=942339623)
    int field837;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1696715089)
    int field834;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1635286519)
    int field838;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=941532923)
    int field839;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-975525999)
    int field840;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-798105153)
    int field841;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=40578233)
    @Export(value="soundEffectId")
    int soundEffectId;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lbe;")
    @Export(value="stream1")
    RawPcmStream stream1;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1328904845)
    int field844;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-553453707)
    int field845;
    @ObfuscatedName(value="aq")
    int[] field849;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=408592797)
    int field847;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lbe;")
    @Export(value="stream2")
    RawPcmStream stream2;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkl;")
    @Export(value="obj")
    ObjectComposition obj;

    ObjectSound() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1849624967")
    @Export(value="set")
    void set() {
        int n = this.soundEffectId;
        ObjectComposition objectComposition = this.obj.transform();
        if (objectComposition == null) {
            this.soundEffectId = -1;
            this.field840 = 0;
            this.field841 = 0;
            this.field844 = 0;
            this.field845 = 0;
            this.field849 = null;
        } else {
            this.soundEffectId = objectComposition.ambientSoundId;
            this.field840 = objectComposition.int7 * 128;
            this.field841 = objectComposition.field2835 * 128;
            this.field844 = objectComposition.int5;
            this.field845 = objectComposition.int6;
            this.field849 = objectComposition.soundEffectIds;
        }
        if (n != this.soundEffectId && this.stream1 != null) {
            UserList.pcmStreamMixer.removeSubStream(this.stream1);
            this.stream1 = null;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lkn;", garbageValue="1572526147")
    static class271[] method2105() {
        return new class271[]{class271.field3008, class271.field3017, class271.field3016, class271.field3005, class271.field3011, class271.field3010, class271.field3018};
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Ljava/security/SecureRandom;", garbageValue="21906822")
    static SecureRandom method2103() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="52")
    public static void method2104() {
        Arrays.fill(Varps.Varps_temp, 0);
        Arrays.fill(Varps.Varps_main, 0);
    }
}

