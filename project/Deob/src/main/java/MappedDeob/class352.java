/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nq")
public class class352 {
    @ObfuscatedName(value="ae")
    static boolean[] field3778;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    AbstractArchive field3775;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    AbstractArchive field3768;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpq;")
    AbstractArchive field3769;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lpq;")
    AbstractArchive field3770;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpq;")
    AbstractArchive field3767;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="[[Lna;")
    public Widget[][] field3772;
    @ObfuscatedName(value="ax")
    Map field3773 = new HashMap();
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lmi;")
    EvictingDualNodeHashTable field3774 = new EvictingDualNodeHashTable(200);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lmi;")
    EvictingDualNodeHashTable field3776 = new EvictingDualNodeHashTable(50);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lmi;")
    EvictingDualNodeHashTable field3771 = new EvictingDualNodeHashTable(20);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lmi;")
    EvictingDualNodeHashTable field3777 = new EvictingDualNodeHashTable(8);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lro;")
    class465 field3779 = new class465(10, class463.field4954);
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lro;")
    class465 field3780 = new class465(10, class463.field4954);

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lpq;Lpq;Lpq;)V")
    public class352(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, AbstractArchive abstractArchive3, AbstractArchive abstractArchive4, AbstractArchive abstractArchive5) {
        int n = 0;
        if (abstractArchive != null) {
            this.field3775 = abstractArchive;
            this.field3769 = abstractArchive2;
            this.field3770 = abstractArchive3;
            this.field3767 = abstractArchive4;
            this.field3768 = abstractArchive5;
            n = this.field3775.getGroupCount();
        }
        this.field3772 = new Widget[n][];
        field3778 = new boolean[n];
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lna;", garbageValue="1962524701")
    public Widget method7031(int n) {
        boolean bl;
        int n2 = n >> 16;
        int n3 = n & 0xFFFF;
        if (!(this.field3772[n2] != null && this.field3772[n2][n3] != null || (bl = this.method7024(n2)))) {
            return null;
        }
        return this.field3772[n2][n3];
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)Lna;", garbageValue="-1107392999")
    public Widget method7023(int n, int n2) {
        Widget widget = this.method7031(n);
        if (n2 == -1) {
            return widget;
        }
        if (widget != null && widget.children != null && n2 < widget.children.length) {
            return widget.children[n2];
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-87937638")
    public boolean method7024(int n) {
        if (field3778[n]) {
            return true;
        }
        if (!this.field3775.tryLoadGroup(n)) {
            return false;
        }
        int n2 = this.field3775.getGroupFileCount(n);
        if (n2 != 0) {
            if (this.field3772[n] == null) {
                this.field3772[n] = new Widget[n2];
            }
            int n3 = 0;
            while (true) {
                byte[] byArray;
                if (n3 >= n2) {
                    class352.field3778[n] = true;
                    return true;
                }
                if (this.field3772[n][n3] == null && (byArray = this.field3775.takeFile(n, n3)) != null) {
                    byte[] byArray2;
                    this.field3772[n][n3] = new Widget();
                    this.field3772[n][n3].id = n3 + (n << 16);
                    if (byArray[0] == -1) {
                        this.field3772[n][n3].decode(new Buffer(byArray));
                    } else {
                        this.field3772[n][n3].decodeLegacy(new Buffer(byArray));
                    }
                    if (this.field3768 != null && (byArray2 = this.field3768.takeFile(n, n3)) != null && byArray2.length > 0) {
                        this.field3772[n][n3].method7552(new Buffer(byArray2));
                        this.field3773.put(this.field3772[n][n3].field3872, n);
                    }
                }
                ++n3;
            }
        }
        class352.field3778[n] = true;
        return true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-59723310")
    public void method7021(int n) {
        if (n == -1) {
            return;
        }
        if (!field3778[n]) {
            return;
        }
        this.field3775.clearFilesGroup(n);
        if (this.field3772[n] == null) {
            return;
        }
        int n2 = 0;
        while (true) {
            if (n2 >= this.field3772[n].length) {
                this.field3772[n] = null;
                class352.field3778[n] = false;
                return;
            }
            if (this.field3772[n][n2] != null) {
                this.field3772[n][n2] = null;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-21")
    public void method7026() {
        this.field3774.clear();
        this.field3776.clear();
        this.field3771.clear();
        this.field3777.clear();
    }
}

