/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="iq")
@Implements(value="Task")
public class Task {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Liq;")
    @Export(value="next")
    Task next;
    @ObfuscatedName(value="ao")
    @Export(value="status")
    public volatile int status = 0;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-263238277)
    @Export(value="type")
    int type;
    @ObfuscatedName(value="an")
    @Export(value="intArgument")
    public int intArgument;
    @ObfuscatedName(value="ae")
    @Export(value="objectArgument")
    Object objectArgument;
    @ObfuscatedName(value="ax")
    @Export(value="result")
    public volatile Object result;

    Task() {
    }
}

