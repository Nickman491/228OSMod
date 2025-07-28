/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="wg")
@Implements(value="RunException")
public class RunException
extends RuntimeException {
    @ObfuscatedName(value="ay")
    @Export(value="RunException_applet")
    public static Applet RunException_applet;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1050277641)
    @Export(value="RunException_revision")
    public static int RunException_revision;
    @ObfuscatedName(value="an")
    @Export(value="message")
    String message;
    @ObfuscatedName(value="ae")
    @Export(value="throwable")
    Throwable throwable;

    RunException(Throwable throwable, String string) {
        this.message = string;
        this.throwable = throwable;
    }
}

