package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kg")
public class class284 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1318861981)
    int field3105 = -1;
    @ObfuscatedName(value="ah")
    String field3106;
    @ObfuscatedName(value="az")
    String field3107;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=34779515)
    int field3108 = -1;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-316135669)
    int field3115 = -16777216;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-366932217)
    int field3109 = -1;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnz;")
    class350 field3111 = null;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-706980989)
    int field3112 = Integer.MAX_VALUE;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1436587615)
    int field3113 = 0;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1400082121)
    int field3114 = Integer.MAX_VALUE;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1496544063)
    int field3117 = 0;
    @ObfuscatedName(value="as")
    boolean field3116 = false;
    @ObfuscatedName(value="aq")
    LinkedList field3110;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1084362175")
    public void method6033(class556 class5562, int n) {
        this.field3105 = n;
        this.field3106 = class5562.method10290();
        this.field3107 = class5562.method10290();
        this.field3111 = new class350(class5562.method10440());
        this.field3108 = class5562.method10440();
        this.field3115 = class5562.method10440();
        class5562.method10282();
        this.field3116 = class5562.method10282() == 1;
        this.field3109 = class5562.method10282();
        int n2 = class5562.method10282();
        this.field3110 = new LinkedList();
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                this.method6039();
                return;
            }
            this.field3110.add(this.method6034(class5562));
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)Llb;", garbageValue="64957886")
    class304 method6034(class556 class5562) {
        int n = class5562.method10282();
        MouseWheel[] mouseWheelArray = new class292[]{class292.field3190, class292.field3192, class292.field3188, class292.field3189};
        class292 class2922 = (class292)class259.method5457(mouseWheelArray, n);
        class304 class3042 = null;
        switch (class2922.field3191) {
            case 1: {
                class3042 = new class291();
                break;
            }
            default: {
                throw new IllegalStateException("");
            }
            case 3: {
                class3042 = new class301();
                break;
            }
            case 0: {
                class3042 = new class283();
                break;
            }
            case 2: {
                class3042 = new class288();
            }
        }
        class3042.vmethod6474(class5562);
        return class3042;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIII)Z", garbageValue="2114827468")
    public boolean method6035(int n, int n2, int n3) {
        class304 class3042;
        Iterator iterator = this.field3110.iterator();
        do {
            if (iterator.hasNext()) continue;
            return false;
        } while (!(class3042 = (class304)iterator.next()).vmethod6470(n, n2, n3));
        return true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="7")
    public boolean method6053(int n, int n2) {
        int n3 = n / 64;
        int n4 = n2 / 64;
        if (n3 >= this.field3112 && n3 <= this.field3113) {
            if (n4 >= this.field3114 && n4 <= this.field3117) {
                class304 class3042;
                Iterator iterator = this.field3110.iterator();
                do {
                    if (iterator.hasNext()) continue;
                    return false;
                } while (!(class3042 = (class304)iterator.next()).vmethod6469(n, n2));
                return true;
            }
            return false;
        }
        return false;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="-21")
    public int[] method6056(int n, int n2, int n3) {
        class304 class3042;
        Iterator iterator = this.field3110.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(class3042 = (class304)iterator.next()).vmethod6470(n, n2, n3));
        return class3042.vmethod6481(n, n2, n3);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIS)Lnz;", garbageValue="255")
    public class350 method6038(int n, int n2) {
        class304 class3042;
        Iterator iterator = this.field3110.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(class3042 = (class304)iterator.next()).vmethod6469(n, n2));
        return class3042.vmethod6473(n, n2);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-533653807")
    void method6039() {
        Iterator iterator = this.field3110.iterator();
        while (iterator.hasNext()) {
            class304 class3042 = (class304)iterator.next();
            class3042.vmethod6484(this);
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="4")
    public int method6040() {
        return this.field3105;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="737441105")
    public boolean method6098() {
        return this.field3116;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1003881370")
    public String method6042() {
        return this.field3106;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1516921793")
    public String method6043() {
        return this.field3107;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-95461746")
    int method6044() {
        return this.field3108;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-907957900")
    int method6045() {
        return this.field3115;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1606431166")
    public int method6073() {
        return this.field3109;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1769521116")
    public int method6047() {
        return this.field3112;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="10")
    public int method6064() {
        return this.field3113;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1701617392")
    public int method6049() {
        return this.field3114;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="84")
    public int method6050() {
        return this.field3117;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-78")
    public int method6070() {
        return this.field3111.field3764;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="587959186")
    public int method6052() {
        return this.field3111.field3766;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1028869615")
    public int method6093() {
        return this.field3111.field3765;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(S)Lnz;", garbageValue="326")
    public class350 method6054() {
        return new class350(this.field3111);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BB)V", garbageValue="-6")
    public static void method6065(byte[] byArray) {
        Object object = class453.field4883;
        synchronized (object) {
            if (byArray.length == 100 && class453.field4884 < class453.field4880) {
                class453.field4890[++class453.field4884 - 1] = byArray;
                return;
            }
            if (byArray.length == 5000 && class453.field4896 < class453.field4895) {
                class453.field4893[++class453.field4896 - 1] = byArray;
                return;
            }
            if (byArray.length == 10000 && class453.field4886 < class453.field4888) {
                class453.field4894[++class453.field4886 - 1] = byArray;
                return;
            }
            if (byArray.length == 30000 && class453.field4885 < class453.field4891) {
                class453.field4892[++class453.field4885 - 1] = byArray;
                return;
            }
            if (class225.field2459 != null) {
                for (int i = 0; i < class580.field5644.length; ++i) {
                    if (byArray.length != class580.field5644[i] || class238.field2563[i] >= class225.field2459[i].length) continue;
                    int n = i;
                    int n2 = class238.field2563[n];
                    class238.field2563[n] = n2 + 1;
                    class225.field2459[i][n2] = byArray;
                    return;
                }
            }
        }
    }
}

