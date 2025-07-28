/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="tj")
@Implements(value="IntegerNode")
public class IntegerNode
extends Node {
    @ObfuscatedName(value="ay")
    @Export(value="integer")
    public int integer;

    public IntegerNode(int n) {
        this.integer = n;
    }
}

