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

@ObfuscatedName(value="am")
@Implements(value="DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider
implements class51 {
    @ObfuscatedName(value="gl")
    static String field94;

    DevicePcmPlayerProvider() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Lbq;", garbageValue="70280008")
    @Export(value="player")
    public PcmPlayer player() {
        return new DevicePcmPlayer();
    }

    @ObfuscatedName(value="at")
    @Export(value="Entity_unpackID")
    public static int Entity_unpackID(long l) {
        return (int)(l >>> 49 & 0x7FFL);
    }

    @ObfuscatedName(value="oz")
    @ObfuscatedSignature(descriptor="(Lcj;I)V", garbageValue="286253951")
    static void method327(class68 class682) {
        if (VarpDefinition.field2510 == class682) {
            return;
        }
        VarpDefinition.field2510 = class682;
    }
}

