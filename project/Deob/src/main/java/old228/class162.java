package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gr")
public class class162
extends class166 {
    @ObfuscatedName(value="ay")
    String field1763 = null;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1131253487)
    int field1765;
    @ObfuscatedName(value="az")
    byte field1764;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class162(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(class556 class5562) {
        if (class5562.method10282() != 255) {
            --class5562.field5471;
            class5562.method10273();
        }
        this.field1763 = class5562.method10360();
        this.field1765 = class5562.method10307();
        this.field1764 = class5562.method10524();
        class5562.method10273();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(class170 class1702) {
        class152 class1522 = new class152();
        class1522.field1685 = new class579(this.field1763);
        class1522.field1687 = this.field1765;
        class1522.field1686 = this.field1764;
        class1702.method3835(class1522);
    }
}

