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

@ObfuscatedName(value="ue")
public final class class529
implements Iterable {
    @ObfuscatedName(value="ay")
    int field5337;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Ltf;")
    class514[] field5334;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field5335;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field5336;
    @ObfuscatedName(value="ad")
    int field5333 = 0;

    public class529(int n) {
        this.field5337 = n;
        this.field5334 = new class514[n];
        int n2 = 0;
        while (n2 < n) {
            class514 class5142;
            class5142.field5173 = class5142 = (this.field5334[n2] = new class514());
            class5142.field5175 = class5142;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(J)Ltf;")
    public class514 method9967(long l) {
        class514 class5142 = this.field5334[(int)(l & (long)(this.field5337 - 1))];
        this.field5335 = class5142.field5173;
        while (true) {
            if (class5142 == this.field5335) {
                this.field5335 = null;
                return null;
            }
            if (this.field5335.field5174 == l) break;
            this.field5335 = this.field5335.field5173;
        }
        class514 class5143 = this.field5335;
        this.field5335 = this.field5335.field5173;
        return class5143;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ltf;J)V")
    public void method9970(class514 class5142, long l) {
        if (class5142.field5175 != null) {
            class5142.method9623();
        }
        class514 class5143 = this.field5334[(int)(l & (long)(this.field5337 - 1))];
        class5142.field5175 = class5143.field5175;
        class5142.field5173 = class5143;
        class5142.field5175.field5173 = class5142;
        class5142.field5173.field5175 = class5142;
        class5142.field5174 = l;
    }

    @ObfuscatedName(value="az")
    public void method9968() {
        int n = 0;
        block0: while (true) {
            if (n >= this.field5337) {
                this.field5335 = null;
                this.field5336 = null;
                return;
            }
            class514 class5142 = this.field5334[n];
            while (true) {
                class514 class5143;
                if ((class5143 = class5142.field5173) == class5142) {
                    ++n;
                    continue block0;
                }
                class5143.method9623();
            }
            break;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="()Ltf;")
    public class514 method9978() {
        this.field5333 = 0;
        return this.method9975();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="()Ltf;")
    public class514 method9975() {
        class514 class5142;
        if (this.field5333 > 0 && this.field5334[this.field5333 - 1] != this.field5336) {
            class514 class5143 = this.field5336;
            this.field5336 = class5143.field5173;
            return class5143;
        }
        do {
            if (this.field5333 < this.field5337) continue;
            return null;
        } while ((class5142 = this.field5334[this.field5333++].field5173) == this.field5334[this.field5333 - 1]);
        this.field5336 = class5142.field5173;
        return class5142;
    }

    public Iterator iterator() {
        return new class528(this);
    }
}

