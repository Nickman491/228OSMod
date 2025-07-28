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

@ObfuscatedName(value="gz")
public class class173
extends class166 {
    @ObfuscatedName(value="gc")
    @ObfuscatedGetter(intValue=-188441259)
    static int field1829;
    @ObfuscatedName(value="ay")
    String field1828;
    @ObfuscatedName(value="ah")
    byte field1826;
    @ObfuscatedName(value="az")
    byte field1827;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class173(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(class556 class5562) {
        this.field1828 = class5562.method10360();
        if (this.field1828 != null) {
            class5562.method10282();
            this.field1826 = class5562.method10524();
            this.field1827 = class5562.method10524();
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(class170 class1702) {
        class1702.field1811 = this.field1828;
        if (this.field1828 != null) {
            class1702.field1812 = this.field1826;
            class1702.field1813 = this.field1827;
        }
    }
}

