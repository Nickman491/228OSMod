package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ux")
public class class528
implements Iterator {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lue;")
    class529 field5332;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field5331;
    @ObfuscatedName(value="az")
    int field5329;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field5330 = null;

    @ObfuscatedSignature(descriptor="(Lue;)V")
    public class528(class529 class5292) {
        this.field5332 = class5292;
        this.method9950();
    }

    @ObfuscatedName(value="ay")
    void method9950() {
        this.field5331 = this.field5332.field5334[0].field5173;
        this.field5329 = 1;
        this.field5330 = null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Ltf;")
    public class514 method9951() {
        this.method9950();
        return (class514)this.next();
    }

    public Object next() {
        if (this.field5332.field5334[this.field5329 - 1] == this.field5331) {
            class514 class5142;
            do {
                if (this.field5329 < this.field5332.field5337) continue;
                return null;
            } while ((class5142 = this.field5332.field5334[this.field5329++].field5173) == this.field5332.field5334[this.field5329 - 1]);
            this.field5331 = class5142.field5173;
            this.field5330 = class5142;
            return class5142;
        }
        class514 class5143 = this.field5331;
        this.field5331 = class5143.field5173;
        this.field5330 = class5143;
        return class5143;
    }

    @Override
    public void remove() {
        if (this.field5330 == null) {
            throw new IllegalStateException();
        }
        this.field5330.method9623();
        this.field5330 = null;
    }

    @Override
    public boolean hasNext() {
        if (this.field5332.field5334[this.field5329 - 1] != this.field5331) {
            return true;
        }
        while (true) {
            if (this.field5329 >= this.field5332.field5337) {
                return false;
            }
            if (this.field5332.field5334[this.field5329++].field5173 != this.field5332.field5334[this.field5329 - 1]) break;
            this.field5331 = this.field5332.field5334[this.field5329 - 1];
        }
        this.field5331 = this.field5332.field5334[this.field5329 - 1].field5173;
        return true;
    }
}

