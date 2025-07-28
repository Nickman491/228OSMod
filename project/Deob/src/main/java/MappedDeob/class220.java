/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ig")
public class class220
extends class226 {
    @ObfuscatedName(value="fx")
    @ObfuscatedSignature(descriptor="Lok;")
    @Export(value="archive13")
    static Archive archive13;
    @ObfuscatedName(value="ay")
    String field2409;
    @ObfuscatedSignature(descriptor="Lic;")
    final /* synthetic */ class223 this$0;

    @ObfuscatedSignature(descriptor="(Lic;Ljava/lang/String;Ljava/lang/String;)V")
    class220(class223 class2232, String string, String string2) {
        this.this$0 = class2232;
        super(class2232, string);
        this.field2409 = string2;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-681041604")
    public int vmethod5060() {
        return 1;
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(S)Ljava/lang/String;", garbageValue="2048")
    public String vmethod5061() {
        return this.field2409;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ljava/util/ArrayList;IIIII)V", garbageValue="-1699747546")
    public static void method4973(ArrayList arrayList, int n, int n2, int n3, int n4) {
        class333.field3626.clear();
        class333.field3626.addAll(arrayList);
        class333.field3630 = n;
        class333.field3632 = n2;
        class333.field3633 = n3;
        class333.field3634 = n4;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(Lbn;I)V", garbageValue="-2006610283")
    @Export(value="PcmStream_disable")
    static final void PcmStream_disable(PcmStream pcmStream) {
        pcmStream.active = false;
        if (pcmStream.sound != null) {
            pcmStream.sound.position = 0;
        }
        PcmStream pcmStream2 = pcmStream.firstSubStream();
        while (pcmStream2 != null) {
            class220.PcmStream_disable(pcmStream2);
            pcmStream2 = pcmStream.nextSubStream();
        }
    }
}

