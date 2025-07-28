package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="vm")
public class class565 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=95184995)
    public final int field5538;
    @ObfuscatedName(value="ah")
    public Object field5539;

    public class565(int n) {
        this.field5538 = n;
    }

    public class565(int n, Object object) {
        this.field5538 = n;
        this.field5539 = object;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof class565)) {
            return false;
        }
        class565 class5652 = (class565)object;
        if (class5652.field5539 == null && this.field5539 != null) {
            return false;
        }
        if (this.field5539 == null && class5652.field5539 != null) {
            return false;
        }
        return class5652.field5538 == this.field5538 && class5652.field5539.equals(this.field5539);
    }
}

