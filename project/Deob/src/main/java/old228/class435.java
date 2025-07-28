package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="qw")
public final class class435
extends class439 {
    public class435(byte[] byArray, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, byte[][] byArray2) {
        super(byArray, nArray, nArray2, nArray3, nArray4, byArray2);
    }

    public class435(byte[] byArray) {
        super(byArray);
    }

    @Override
    @ObfuscatedName(value="ay")
    final void vmethod8706(byte[] byArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = n2 * class566.field5542 + n;
        int n8 = class566.field5542 - n3;
        int n9 = 0;
        int n10 = 0;
        if (n2 < class566.field5541) {
            n6 = class566.field5541 - n2;
            n4 -= n6;
            n2 = class566.field5541;
            n10 += n6 * n3;
            n7 += n6 * class566.field5542;
        }
        if (n2 + n4 > class566.field5547) {
            n4 -= n2 + n4 - class566.field5547;
        }
        if (n < class566.field5548) {
            n6 = class566.field5548 - n;
            n3 -= n6;
            n = class566.field5548;
            n10 += n6;
            n7 += n6;
            n9 += n6;
            n8 += n6;
        }
        if (n + n3 > class566.field5549) {
            n6 = n + n3 - class566.field5549;
            n3 -= n6;
            n9 += n6;
            n8 += n6;
        }
        if (n3 > 0 && n4 > 0) {
            class439.method8778(class566.field5546, byArray, n5, n10, n7, n3, n4, n8, n9);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    final void vmethod8704(byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = n2 * class566.field5542 + n;
        int n9 = class566.field5542 - n3;
        int n10 = 0;
        int n11 = 0;
        if (n2 < class566.field5541) {
            n7 = class566.field5541 - n2;
            n4 -= n7;
            n2 = class566.field5541;
            n11 += n7 * n3;
            n8 += n7 * class566.field5542;
        }
        if (n2 + n4 > class566.field5547) {
            n4 -= n2 + n4 - class566.field5547;
        }
        if (n < class566.field5548) {
            n7 = class566.field5548 - n;
            n3 -= n7;
            n = class566.field5548;
            n11 += n7;
            n8 += n7;
            n10 += n7;
            n9 += n7;
        }
        if (n + n3 > class566.field5549) {
            n7 = n + n3 - class566.field5549;
            n3 -= n7;
            n10 += n7;
            n9 += n7;
        }
        if (n3 > 0 && n4 > 0) {
            class439.method8708(class566.field5546, byArray, n5, n11, n8, n3, n4, n9, n10, n6);
            return;
        }
    }
}

