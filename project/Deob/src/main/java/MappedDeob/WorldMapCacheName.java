/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="le")
@Implements(value="WorldMapCacheName")
public class WorldMapCacheName {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lle;")
    public static final WorldMapCacheName field3264 = new WorldMapCacheName("details");
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lle;")
    public static final WorldMapCacheName field3269 = new WorldMapCacheName("compositemap");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lle;")
    public static final WorldMapCacheName field3265 = new WorldMapCacheName("compositetexture");
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lle;")
    static final WorldMapCacheName field3263 = new WorldMapCacheName("area");
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lle;")
    public static final WorldMapCacheName field3267 = new WorldMapCacheName("labels");
    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="Lql;")
    static Bounds field3266;
    @ObfuscatedName(value="jc")
    static byte[][] field3270;
    @ObfuscatedName(value="an")
    @Export(value="name")
    public final String name;

    WorldMapCacheName(String string) {
        this.name = string;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-34")
    @Export(value="clearItemContainer")
    static void clearItemContainer(int n) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.get(n);
        if (itemContainer == null) {
            return;
        }
        int n2 = 0;
        while (n2 < itemContainer.ids.length) {
            itemContainer.ids[n2] = -1;
            itemContainer.quantities[n2] = 0;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lna;B)I", garbageValue="8")
    static int method6467(Widget widget) {
        if (widget.type == 11) {
            String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = widget.method7548(string);
            return 1;
        }
        Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize - 1] = "";
        return 1;
    }
}

