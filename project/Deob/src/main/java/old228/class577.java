package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ws")
public class class577 {
    @ObfuscatedName(value="ay")
    Inflater field5634;

    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1000000")
    class577(int n, int n2, int n3) {
    }

    public class577() {
        this(-1, 1000000, 1000000);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;[BI)V", garbageValue="-3383708")
    public void method10963(class556 class5562, byte[] byArray) {
        if (class5562.field5470[class5562.field5471] != 31 || class5562.field5470[class5562.field5471 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5634 == null) {
            this.field5634 = new Inflater(true);
        }
        try {
            this.field5634.setInput(class5562.field5470, class5562.field5471 + 10, class5562.field5470.length - (class5562.field5471 + 8 + 10));
            this.field5634.inflate(byArray);
        }
        catch (Exception exception) {
            this.field5634.reset();
            throw new RuntimeException("");
        }
        this.field5634.reset();
    }
}

