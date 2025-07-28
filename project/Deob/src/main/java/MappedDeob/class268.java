/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ka")
public class class268
extends Node {
    @ObfuscatedName(value="ew")
    @ObfuscatedSignature(descriptor="Lok;")
    @Export(value="archive2")
    static Archive archive2;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-490227731)
    public int field2968;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1771210245)
    public int field2969;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-657302699)
    public int field2970;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lna;")
    public Widget field2971;

    @ObfuscatedSignature(descriptor="(IIILna;)V")
    public class268(int n, int n2, int n3, Widget widget) {
        this.field2970 = n;
        this.field2968 = n2;
        this.field2969 = n3;
        this.field2971 = widget;
    }

    @ObfuscatedName(value="mc")
    @ObfuscatedSignature(descriptor="(Lna;B)Z", garbageValue="-73")
    @Export(value="runCs1")
    static final boolean runCs1(Widget widget) {
        if (widget.cs1Comparisons == null) {
            return false;
        }
        int n = 0;
        while (n < widget.cs1Comparisons.length) {
            int n2 = SequenceDefinition.method5725(widget, n);
            int n3 = widget.cs1ComparisonValues[n];
            if (widget.cs1Comparisons[n] != 2 ? (widget.cs1Comparisons[n] != 3 ? (widget.cs1Comparisons[n] != 4 ? n2 != n3 : n2 == n3) : n2 <= n3) : n2 >= n3) {
                return false;
            }
            ++n;
        }
        return true;
    }
}

