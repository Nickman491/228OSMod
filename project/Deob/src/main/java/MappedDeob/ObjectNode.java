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

@ObfuscatedName(value="te")
@Implements(value="ObjectNode")
public class ObjectNode
extends Node {
    @ObfuscatedName(value="ay")
    @Export(value="obj")
    public final Object obj;

    public ObjectNode(Object object) {
        this.obj = object;
    }
}

