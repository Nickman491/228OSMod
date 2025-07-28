/*
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

@ObfuscatedName(value="rj")
public class class447
extends class448 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lnh;")
    class345 field4864 = null;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1935554183)
    int field4865 = 0;

    @ObfuscatedSignature(descriptor="(Lrh;IZI)V")
    public class447(class448 class4482, int n, boolean bl, int n2) {
        super(class4482);
        this.field4868 = "FadeInTask";
        if (n >= 0) {
            if (bl && n < class333.field3631.size()) {
                this.field4864 = (class345)class333.field3631.get(n);
            } else if (!bl && n < class333.field3623.size()) {
                this.field4864 = (class345)class333.field3623.get(n);
            }
            this.field4865 = n2;
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        if (this.field4864 == null || this.field4864.field3743 == null) {
            return true;
        }
        this.field4864.field3745 = true;
        try {
            if (this.field4864.field3739 < (float)this.field4864.field3738 && this.field4864.field3743.isReady()) {
                float f = this.field4865 == 0 ? (float)this.field4865 : (float)this.field4864.field3738 / (float)this.field4865;
                this.field4864.field3739 = this.field4864.field3739 + (0.0f == f ? (float)this.field4864.field3738 : f);
                if (this.field4864.field3739 > (float)this.field4864.field3738) {
                    this.field4864.field3739 = this.field4864.field3738;
                }
                this.field4864.field3743.setPcmStreamVolume((int)this.field4864.field3739);
                return false;
            }
        }
        catch (Exception exception) {
            this.method8861(exception.getMessage());
            return true;
        }
        this.field4864.field3745 = false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="lq")
    @ObfuscatedSignature(descriptor="(Leq;IIIII)V", garbageValue="406804930")
    static final void method8854(class105 class1052, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        NPCComposition nPCComposition = class1052.field1354;
        if (Client.field648.field5612 >= 400) {
            return;
        }
        if (nPCComposition.transforms != null) {
            nPCComposition = nPCComposition.transform();
        }
        if (nPCComposition == null) {
            return;
        }
        if (!nPCComposition.field2656) {
            return;
        }
        if (nPCComposition.field2658 && Client.followerIndex != n) {
            return;
        }
        String string = class1052.method3015();
        if (nPCComposition.combatLevel != 0 && class1052.field1209 != 0) {
            n7 = class1052.field1209 != -1 ? class1052.field1209 : nPCComposition.combatLevel;
            string = string + ArchiveLoader.method2584(n7, ModeWhere.localPlayer.field1136) + " " + " (" + "level-" + n7 + ")";
        }
        if (nPCComposition.field2638 && Client.followerOpsLowPriority) {
            class231.method5128("Examine", class97.colorStartTag(0xFFFF00) + string, 1003, n, n2, n3, -1, false, n4);
        }
        if (!class93.field1111 && Client.isItemSelected == 1) {
            class231.method5128("Use", Client.field570 + " " + "->" + " " + class97.colorStartTag(0xFFFF00) + string, 7, n, n2, n3, -1, false, n4);
            return;
        }
        if (Client.isSpellSelected) {
            if (class93.field1111) return;
            if ((class106.field1365 & 2) != 2) return;
            class231.method5128(Client.field661, Client.field662 + " " + "->" + " " + class97.colorStartTag(0xFFFF00) + string, 8, n, n2, n3, -1, false, n4);
            return;
        }
        n7 = nPCComposition.field2638 && Client.followerOpsLowPriority ? 2000 : 0;
        String[] stringArray = nPCComposition.actions;
        if (stringArray != null) {
            for (n6 = 4; n6 >= 0; --n6) {
                if (class93.field1111 || !class1052.method3066(n6) || stringArray[n6] == null || stringArray[n6].equalsIgnoreCase("Attack")) continue;
                n5 = 0;
                if (n6 == 0) {
                    n5 = n7 + 9;
                }
                if (n6 == 1) {
                    n5 = n7 + 10;
                }
                if (n6 == 2) {
                    n5 = n7 + 11;
                }
                if (n6 == 3) {
                    n5 = n7 + 12;
                }
                if (n6 == 4) {
                    n5 = n7 + 13;
                }
                class231.method5128(stringArray[n6], class97.colorStartTag(0xFFFF00) + string, n5, n, n2, n3, -1, false, n4);
            }
        }
        if (stringArray != null) {
            for (n6 = 4; n6 >= 0; --n6) {
                if (class93.field1111 || !class1052.method3066(n6) || stringArray[n6] == null || !stringArray[n6].equalsIgnoreCase("Attack")) continue;
                n7 = 0;
                if (AttackOption.field1380 == Client.npcAttackOption) continue;
                if (Client.npcAttackOption == AttackOption.field1382 || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && nPCComposition.combatLevel > ModeWhere.localPlayer.field1136) {
                    n7 = 2000;
                }
                n5 = 0;
                if (n6 == 0) {
                    n5 = n7 + 9;
                }
                if (n6 == 1) {
                    n5 = n7 + 10;
                }
                if (n6 == 2) {
                    n5 = n7 + 11;
                }
                if (n6 == 3) {
                    n5 = n7 + 12;
                }
                if (n6 == 4) {
                    n5 = n7 + 13;
                }
                class231.method5128(stringArray[n6], class97.colorStartTag(0xFFFF00) + string, n5, n, n2, n3, -1, false, n4);
            }
        }
        if (nPCComposition.field2638) {
            if (Client.followerOpsLowPriority) return;
        }
        class231.method5128("Examine", class97.colorStartTag(0xFFFF00) + string, 1003, n, n2, n3, -1, false, n4);
    }
}

