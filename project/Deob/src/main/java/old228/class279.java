package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ko")
public class class279
extends class293 {
    class279() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="28976712")
    void method5981(class556 class5562) {
        int n = class5562.method10282();
        if (n == class299.field3247.field3242) {
            this.field3211 = class5562.method10282();
            this.field3202 = class5562.method10282();
            this.field3204 = class5562.method10307() * 4096;
            this.field3201 = class5562.method10307() * 4096;
            this.field3203 = class5562.method10307();
            this.field3200 = class5562.method10307();
            this.field3212 = class5562.method10476();
            this.field3207 = class5562.method10476();
            return;
        }
        throw new IllegalStateException("");
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="-46")
    void vmethod6369(class556 class5562) {
        this.field3202 = Math.min(this.field3202, 4);
        this.field3206 = new short[1][64][64];
        this.field3209 = new short[this.field3202][64][64];
        this.field3210 = new byte[this.field3202][64][64];
        this.field3205 = new byte[this.field3202][64][64];
        this.field3208 = new class295[this.field3202][64][64][];
        int n = class5562.method10282();
        if (n == class298.field3236.field3238) {
            int n2 = class5562.method10282();
            int n3 = class5562.method10282();
            if (n2 == this.field3203 && n3 == this.field3200) {
                int n4 = 0;
                while (true) {
                    if (n4 >= 64) {
                        return;
                    }
                    for (int i = 0; i < 64; ++i) {
                        this.method6374(n4, i, class5562);
                    }
                    ++n4;
                }
            }
            throw new IllegalStateException("");
        }
        throw new IllegalStateException("");
    }

    public int hashCode() {
        return this.field3203 | this.field3200 << 8;
    }

    public boolean equals(Object object) {
        if (object instanceof class279) {
            class279 class2792 = (class279)object;
            return this.field3203 == class2792.field3203 && this.field3200 == class2792.field3200;
        }
        return false;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)[Lmn;", garbageValue="48")
    public static class325[] method5975() {
        return new class325[]{class325.field3468, class325.field3444, class325.field3445, class325.field3446, class325.field3535, class325.field3460, class325.field3497, class325.field3519, class325.field3451, class325.field3452, class325.field3516, class325.field3474, class325.field3472, class325.field3456, class325.field3457, class325.field3491, class325.field3459, class325.field3449, class325.field3461, class325.field3501, class325.field3463, class325.field3464, class325.field3454, class325.field3466, class325.field3520, class325.field3540, class325.field3469, class325.field3470, class325.field3471, class325.field3564, class325.field3473, class325.field3562, class325.field3475, class325.field3476, class325.field3477, class325.field3478, class325.field3479, class325.field3465, class325.field3487, class325.field3482, class325.field3483, class325.field3467, class325.field3521, class325.field3486, class325.field3485, class325.field3488, class325.field3450, class325.field3531, class325.field3557, class325.field3492, class325.field3493, class325.field3494, class325.field3447, class325.field3496, class325.field3481, class325.field3541, class325.field3499, class325.field3500, class325.field3498, class325.field3502, class325.field3503, class325.field3504, class325.field3455, class325.field3506, class325.field3507, class325.field3508, class325.field3509, class325.field3510, class325.field3511, class325.field3512, class325.field3513, class325.field3514, class325.field3515, class325.field3490, class325.field3517, class325.field3525, class325.field3560, class325.field3524, class325.field3462, class325.field3522, class325.field3443, class325.field3555, class325.field3518, class325.field3526, class325.field3527, class325.field3528, class325.field3529, class325.field3530, class325.field3579, class325.field3532, class325.field3533, class325.field3534, class325.field3575, class325.field3536, class325.field3537, class325.field3538, class325.field3539, class325.field3489, class325.field3577, class325.field3569, class325.field3543, class325.field3544, class325.field3545, class325.field3546, class325.field3547, class325.field3548, class325.field3549, class325.field3550, class325.field3542, class325.field3552, class325.field3553, class325.field3554, class325.field3565, class325.field3556, class325.field3480, class325.field3558, class325.field3559, class325.field3448, class325.field3561, class325.field3458, class325.field3563, class325.field3551, class325.field3570, class325.field3566, class325.field3567, class325.field3568, class325.field3484, class325.field3495, class325.field3571, class325.field3572, class325.field3573, class325.field3574, class325.field3523, class325.field3576, class325.field3505, class325.field3578, class325.field3453};
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1281370951")
    static int method5988(int n, class81 class812, boolean bl) {
        class361 class3612 = class170.field1807.method7031(class72.field865[--class63.field444]);
        if (n != 2500) {
            if (n != 2501) {
                if (n != 2502) {
                    if (n != 2503) {
                        if (n != 2504) {
                            if (n != 2505) {
                                return 2;
                            }
                            class72.field865[++class63.field444 - 1] = class3612.field4026;
                            return 1;
                        }
                        class72.field865[++class63.field444 - 1] = class3612.field3891 ? 1 : 0;
                        return 1;
                    }
                    class72.field865[++class63.field444 - 1] = class3612.field3887 * -1528330031;
                    return 1;
                }
                class72.field865[++class63.field444 - 1] = class3612.field3886;
                return 1;
            }
            class72.field865[++class63.field444 - 1] = class3612.field3885;
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class3612.field3884;
        return 1;
    }
}

