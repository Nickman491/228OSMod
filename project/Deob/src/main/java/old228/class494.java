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

@ObfuscatedName(value="th")
public class class494 {
    @ObfuscatedName(value="ey")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field5117;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1995491485)
    public int field5116 = -1;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-874753849)
    public int field5106 = -1;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1285545511)
    public int field5102 = -1;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1636138719)
    public int field5103 = -1;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=673540619)
    public int field5104 = -1;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-819112465)
    public int field5105 = -1;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1424382797)
    public int field5108 = -1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=612064461)
    public int field5107 = -1;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1264433171)
    public int field5100 = -1;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-386319745)
    public int field5109 = -1;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-2093006963)
    public int field5110 = -1;
    @ObfuscatedName(value="as")
    final int field5111 = 1;
    @ObfuscatedName(value="aq")
    final int field5112 = 2;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1431655765)
    final int field5113 = 1;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1431655765)
    final int field5114 = 1;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-858993459)
    final int field5115 = 1;
    @ObfuscatedName(value="al")
    public final int[][] field5101 = new int[3][5];

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="-1380656931")
    public void method9494(class391 class3912) {
        byte[] byArray = class3912.method7735(class493.field5097.field5099);
        class556 class5562 = new class556(byArray);
        int n;
        block5: while ((n = class5562.method10282()) != 0) {
            switch (n) {
                case 3: {
                    for (int i = 0; i < this.field5101.length; ++i) {
                        for (int j = 0; j < this.field5101[i].length; ++j) {
                            this.field5101[i][j] = class5562.method10285();
                        }
                    }
                    continue block5;
                }
                case 2: {
                    this.field5116 = class5562.method10476();
                    this.field5106 = class5562.method10476();
                    this.field5102 = class5562.method10476();
                    this.field5103 = class5562.method10476();
                    this.field5104 = class5562.method10476();
                    this.field5105 = class5562.method10476();
                    this.field5108 = class5562.method10476();
                    this.field5107 = class5562.method10476();
                    this.field5100 = class5562.method10476();
                    this.field5109 = class5562.method10476();
                    this.field5110 = class5562.method10476();
                    break;
                }
                case 1: {
                    class5562.method10285();
                    break;
                }
            }
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;B)V", garbageValue="88")
    public static void method9495(class391 class3912) {
        class549.field5417 = class3912;
    }
}

