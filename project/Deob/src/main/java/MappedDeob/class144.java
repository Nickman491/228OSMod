/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fl")
public class class144
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1373393293)
    int field1643;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[[Lff;")
    public class136[][] field1639 = null;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="[[Lff;")
    class136[][] field1638 = null;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lhu;")
    public Skeleton field1641;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1557858399)
    int field1642 = 0;
    @ObfuscatedName(value="an")
    boolean field1644;
    @ObfuscatedName(value="at")
    Future field1640;
    @ObfuscatedName(value="ac")
    List field1645;

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;IZ)V")
    class144(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, int n, boolean bl) {
        this.field1643 = n;
        byte[] byArray = abstractArchive.takeFile(this.field1643 >> 16 & 0xFFFF, this.field1643 & 0xFFFF);
        Buffer buffer = new Buffer(byArray);
        int n2 = buffer.readUnsignedByte();
        int n3 = buffer.readUnsignedShort();
        byte[] byArray2 = bl ? abstractArchive2.getFile(0, n3) : abstractArchive2.getFile(n3, 0);
        this.field1641 = new Skeleton(n3, byArray2);
        this.field1645 = new ArrayList();
        this.field1640 = WorldMapID.field3245.submit(new class143(this, buffer, n2));
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;IS)V", garbageValue="6837")
    void method3520(Buffer buffer, int n) {
        buffer.readUnsignedShort();
        buffer.readUnsignedShort();
        this.field1642 = buffer.readUnsignedByte();
        int n2 = buffer.readUnsignedShort();
        this.field1638 = new class136[this.field1641.method4168().method4107()][];
        this.field1639 = new class136[this.field1641.method4164()][];
        class135[] class135Array = new class135[n2];
        int n3 = 0;
        while (true) {
            int n4;
            int n5;
            if (n3 >= n2) {
                n3 = n2 / class142.field1631;
                int n6 = n2 % class142.field1631;
                int n7 = 0;
                for (int i = 0; i < class142.field1631; ++i) {
                    n5 = n7;
                    n7 += n3;
                    if (n6 > 0) {
                        ++n7;
                        --n6;
                    }
                    if (n5 == n7) break;
                    n4 = n5;
                    int n8 = n7;
                    this.field1645.add(WorldMapID.field3245.submit(new class139(this, n4, n8, class135Array)));
                }
                return;
            }
            class137 class1372 = Message.method1253(buffer.readUnsignedByte());
            n5 = buffer.readShortSmart();
            class138 class1382 = class538.method10069(buffer.readUnsignedByte());
            class136 class1362 = new class136();
            class1362.method3447(buffer, n);
            class135Array[n3] = new class135(this, class1362, class1372, class1382, n5);
            n4 = class1372.method3482();
            class136[][] class136Array = class1372 != class137.field1600 ? this.field1639 : this.field1638;
            if (class136Array[n5] == null) {
                class136Array[n5] = new class136[n4];
            }
            if (class1372 == class137.field1598) {
                this.field1644 = true;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1447380670")
    public boolean method3521() {
        block10: {
            block9: {
                if (this.field1640 == null && this.field1645 == null) {
                    return true;
                }
                if (this.field1640 == null) break block9;
                if (!this.field1640.isDone()) break block10;
                this.field1640 = null;
            }
            boolean bl = true;
            int n = 0;
            while (true) {
                if (n >= this.field1645.size()) {
                    if (bl) {
                        this.field1645 = null;
                        return true;
                    }
                    return false;
                }
                if (((Future)this.field1645.get(n)).isDone()) {
                    this.field1645.remove(n);
                    --n;
                } else {
                    bl = false;
                }
                ++n;
            }
        }
        return false;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1662996219")
    public int method3529() {
        return this.field1642;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1967924794")
    public boolean method3535() {
        return this.field1644;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ILfc;III)V", garbageValue="-2052020098")
    public void method3524(int n, class133 class1332, int n2, int n3) {
        class428 class4282 = AbstractWorldMapData.method6389();
        this.method3525(class4282, n2, class1332, n);
        this.method3527(class4282, n2, class1332, n);
        this.method3533(class4282, n2, class1332, n);
        class1332.method3400(class4282);
        class4282.method8373();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lqe;ILfc;II)V", garbageValue="-330565697")
    void method3525(class428 class4282, int n, class133 class1332, int n2) {
        Object object;
        Object object2;
        Object object3;
        float[] fArray = class1332.method3402(this.field1642);
        float f = fArray[0];
        float f2 = fArray[1];
        float f3 = fArray[2];
        if (this.field1638[n] != null) {
            object3 = this.field1638[n][0];
            object2 = this.field1638[n][1];
            object = this.field1638[n][2];
            if (object3 != null) {
                f = ((class136)object3).method3454(n2);
            }
            if (object2 != null) {
                f2 = ((class136)object2).method3454(n2);
            }
            if (object != null) {
                f3 = ((class136)object).method3454(n2);
            }
        }
        object3 = FaceNormal.method4465();
        ((class427)object3).method8334(1.0f, 0.0f, 0.0f, f);
        object2 = FaceNormal.method4465();
        ((class427)object2).method8334(0.0f, 1.0f, 0.0f, f2);
        object = FaceNormal.method4465();
        ((class427)object).method8334(0.0f, 0.0f, 1.0f, f3);
        class427 class4272 = FaceNormal.method4465();
        class4272.method8340((class427)object);
        class4272.method8340((class427)object3);
        class4272.method8340((class427)object2);
        class428 class4283 = AbstractWorldMapData.method6389();
        class4283.method8380(class4272);
        class4282.method8389(class4283);
        ((class427)object3).method8354();
        ((class427)object2).method8354();
        ((class427)object).method8354();
        class4272.method8354();
        class4283.method8373();
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lqe;ILfc;II)V", garbageValue="383587504")
    void method3533(class428 class4282, int n, class133 class1332, int n2) {
        float[] fArray = class1332.method3410(this.field1642);
        float f = fArray[0];
        float f2 = fArray[1];
        float f3 = fArray[2];
        if (this.field1638[n] != null) {
            class136 class1362 = this.field1638[n][3];
            class136 class1363 = this.field1638[n][4];
            class136 class1364 = this.field1638[n][5];
            if (class1362 != null) {
                f = class1362.method3454(n2);
            }
            if (class1363 != null) {
                f2 = class1363.method3454(n2);
            }
            if (class1364 != null) {
                f3 = class1364.method3454(n2);
            }
        }
        class4282.field4761[12] = f;
        class4282.field4761[13] = f2;
        class4282.field4761[14] = f3;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lqe;ILfc;IB)V", garbageValue="0")
    void method3527(class428 class4282, int n, class133 class1332, int n2) {
        Object object;
        float[] fArray = class1332.method3406(this.field1642);
        float f = fArray[0];
        float f2 = fArray[1];
        float f3 = fArray[2];
        if (this.field1638[n] != null) {
            object = this.field1638[n][6];
            class136 class1362 = this.field1638[n][7];
            class136 class1363 = this.field1638[n][8];
            if (object != null) {
                f = ((class136)object).method3454(n2);
            }
            if (class1362 != null) {
                f2 = class1362.method3454(n2);
            }
            if (class1363 != null) {
                f3 = class1363.method3454(n2);
            }
        }
        object = AbstractWorldMapData.method6389();
        ((class428)object).method8378(f, f2, f3);
        class4282.method8389((class428)object);
        ((class428)object).method8373();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lff;FFFFFFFFB)V", garbageValue="-9")
    static void method3550(class136 class1362, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (class1362 != null) {
            float f9 = f4 - f;
            if (f9 != 0.0f) {
                float f10 = f2 - f;
                float f11 = f3 - f;
                float[] fArray = new float[]{f10 / f9, f11 / f9};
                class1362.field1575 = 0.33333334f == fArray[0] && 0.6666667f == fArray[1];
                float f12 = fArray[0];
                float f13 = fArray[1];
                if (fArray[0] < 0.0f) {
                    fArray[0] = 0.0f;
                }
                if (fArray[1] > 1.0f) {
                    fArray[1] = 1.0f;
                }
                if (fArray[0] > 1.0f || fArray[1] < -1.0f) {
                    class9.method81(fArray);
                }
                if (fArray[0] != f12) {
                    f2 = fArray[0] * f9 + f;
                    if (0.0f != f12) {
                        f6 = (f6 - f5) * fArray[0] / f12 + f5;
                    }
                }
                if (f13 != fArray[1]) {
                    f3 = f9 * fArray[1] + f;
                    if (f13 != 1.0f) {
                        f7 = f8 - (f8 - f7) * (1.0f - fArray[1]) / (1.0f - f13);
                    }
                }
                class1362.field1576 = f;
                class1362.field1577 = f4;
                class172.method3866(0.0f, fArray[0], fArray[1], 1.0f, class1362);
                float f14 = f6 - f5;
                float f15 = f7 - f6;
                float f16 = f8 - f7;
                float f17 = f15 - f14;
                class1362.field1591 = f16 - f15 - f17;
                class1362.field1584 = f17 + f17 + f17;
                class1362.field1585 = f14 + (f14 + f14);
                class1362.field1582 = f5;
                return;
            }
            return;
        }
    }
}

