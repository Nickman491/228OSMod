/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rh")
public abstract class class448 {
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lrh;")
    class448 field4866;
    @ObfuscatedName(value="ao")
    String field4867;
    @ObfuscatedName(value="ad")
    String field4868;
    @ObfuscatedName(value="an")
    boolean field4869;
    @ObfuscatedName(value="ae")
    boolean field4870;

    @ObfuscatedSignature(descriptor="(Lrh;)V")
    class448(class448 class4482) {
        this.field4866 = class4482;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public abstract boolean vmethod8883();

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-99")
    public boolean method8855() {
        return this.field4869;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-306886513")
    public boolean method8858() {
        return this.field4870;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-239741006")
    public String method8870() {
        return "Error in task: " + this.field4868 + ", Error message: " + this.field4867;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(S)Lrh;", garbageValue="-7939")
    public class448 method8860() {
        return this.field4866;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1426819065")
    void method8861(String string) {
        this.field4869 = true;
        this.field4867 = string;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;I)V", garbageValue="1515042012")
    public static void method8875(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        NPCComposition.NpcDefinition_archive = abstractArchive;
        class430.field4779 = abstractArchive2;
    }
}

