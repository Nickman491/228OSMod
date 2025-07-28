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

@ObfuscatedName(value="dt")
@Implements(value="InterfaceParent")
public class InterfaceParent
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=812877491)
    @Export(value="group")
    int group;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=661452433)
    @Export(value="type")
    int type;
    @ObfuscatedName(value="az")
    boolean field1071 = false;

    InterfaceParent() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;I)V", garbageValue="-1285017470")
    public static void method2618(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        HealthBarDefinition.HealthBarDefinition_archive = abstractArchive;
        HealthBarDefinition.field2572 = abstractArchive2;
    }
}

