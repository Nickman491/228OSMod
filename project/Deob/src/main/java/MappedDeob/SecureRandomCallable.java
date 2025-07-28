/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="dr")
@Implements(value="SecureRandomCallable")
public class SecureRandomCallable
implements Callable {
    @ObfuscatedName(value="ah")
    @Export(value="Tiles_underlays")
    static short[][][] Tiles_underlays;

    SecureRandomCallable() {
    }

    public Object call() {
        return ObjectSound.method2103();
    }
}

