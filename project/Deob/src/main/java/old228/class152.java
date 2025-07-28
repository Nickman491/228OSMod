package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fw")
public class class152 {
    @ObfuscatedName(value="ay")
    public byte field1686;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1001783433)
    public int field1687;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lwb;")
    public class579 field1685;

    class152() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;B)V", garbageValue="43")
    static void method3609(Component component) {
        component.removeMouseListener(class35.field194);
        component.removeMouseMotionListener(class35.field194);
        component.removeFocusListener(class35.field194);
        class35.field196 = 0;
    }
}

