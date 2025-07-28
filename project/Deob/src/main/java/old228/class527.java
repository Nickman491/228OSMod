package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="ug")
public class class527 {
    @ObfuscatedName(value="ay")
    public final Object field5326;
    @ObfuscatedName(value="ah")
    public final Object field5327;

    public class527(Object object, Object object2) {
        this.field5326 = object;
        this.field5327 = object2;
    }

    public String toString() {
        return this.field5326 + ", " + this.field5327;
    }

    public boolean equals(Object object) {
        if (object != null && object instanceof class527) {
            class527 class5272 = (class527)object;
            if (this.field5326 != null ? !this.field5326.equals(class5272.field5326) : class5272.field5326 != null) {
                return false;
            }
            return !(this.field5327 != null ? !this.field5327.equals(class5272.field5327) : class5272.field5327 != null);
        }
        return false;
    }

    public int hashCode() {
        int n = 0;
        if (this.field5326 != null) {
            n += this.field5326.hashCode();
        }
        if (this.field5327 != null) {
            n += 31 * this.field5327.hashCode();
        }
        return n;
    }
}

