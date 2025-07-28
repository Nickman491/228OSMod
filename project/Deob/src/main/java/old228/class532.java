package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="up")
public class class532
implements class531 {
    @ObfuscatedName(value="ay")
    Map field5344;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lvp;")
    final class564 field5345;

    @ObfuscatedSignature(descriptor="(Lvp;)V")
    public class532(class564 class5642) {
        this.field5345 = class5642;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-195596197")
    public int vmethod10004(int n) {
        class565 class5652;
        if (this.field5344 != null && (class5652 = (class565)this.field5344.get(n)) != null) {
            return (Integer)class5652.field5539;
        }
        return (Integer)this.field5345.vmethod10593(n);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILjava/lang/Object;I)V", garbageValue="1337046256")
    public void vmethod10011(int n, Object object) {
        if (this.field5344 != null) {
            class565 class5652 = (class565)this.field5344.get(n);
            if (class5652 == null) {
                this.field5344.put(n, new class565(n, object));
            } else {
                class5652.field5539 = object;
            }
        } else {
            this.field5344 = new HashMap();
            this.field5344.put(n, new class565(n, object));
        }
    }

    public Iterator iterator() {
        if (this.field5344 == null) {
            return Collections.emptyList().iterator();
        }
        return this.field5344.values().iterator();
    }
}

