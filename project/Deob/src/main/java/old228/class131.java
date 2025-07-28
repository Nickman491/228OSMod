package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fn")
public class class131 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=59770549)
    int field1528;
    @ObfuscatedName(value="ah")
    float field1527;
    @ObfuscatedName(value="az")
    float field1531 = Float.MAX_VALUE;
    @ObfuscatedName(value="ao")
    float field1529 = Float.MAX_VALUE;
    @ObfuscatedName(value="ad")
    float field1530 = Float.MAX_VALUE;
    @ObfuscatedName(value="an")
    float field1526 = Float.MAX_VALUE;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfn;")
    class131 field1532;

    class131() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="740982673")
    void method3375(class556 class5562, int n) {
        this.field1528 = class5562.method10284();
        this.field1527 = class5562.method10302();
        this.field1531 = class5562.method10302();
        this.field1529 = class5562.method10302();
        this.field1530 = class5562.method10302();
        this.field1526 = class5562.method10302();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="2033705331")
    static void method3379(Component component) {
        component.addMouseListener(class35.field194);
        component.addMouseMotionListener(class35.field194);
        component.addFocusListener(class35.field194);
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1032226607")
    static void method3380(int n, int n2, int n3, int n4) {
        class87 class872 = (class87)class87.field1057.method9985(n);
        if (class872 == null) {
            class872 = new class87();
            class87.field1057.method9984(class872, n);
        }
        if (class872.field1058.length <= n2) {
            int n5;
            int[] nArray = new int[n2 + 1];
            int[] nArray2 = new int[n2 + 1];
            for (n5 = 0; n5 < class872.field1058.length; ++n5) {
                nArray[n5] = class872.field1058[n5];
                nArray2[n5] = class872.field1059[n5];
            }
            for (n5 = class872.field1058.length; n5 < n2; ++n5) {
                nArray[n5] = -1;
                nArray2[n5] = 0;
            }
            class872.field1058 = nArray;
            class872.field1059 = nArray2;
        }
        class872.field1058[n2] = n3;
        class872.field1059[n2] = n4;
    }
}

