/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ts")
public abstract class class499
implements class308 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lud;")
    class544 field5133;

    class499(int n) {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="66")
    abstract void vmethod9531(Buffer var1, int var2);

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1938210601")
    public void method9530(Buffer buffer) {
        int n;
        block5: while ((n = buffer.readUnsignedByte()) != 0) {
            class495 class4952 = (class495)StructComposition.findEnumerated(ArchiveLoader.method2586(), n);
            if (class4952 == null) {
                this.vmethod9531(buffer, n);
                continue;
            }
            switch (class4952.field5123) {
                case 2: {
                    int n2 = buffer.readUnsignedByte();
                    this.field5133 = EnumComposition.method5280(n2);
                    if (this.field5133 != null) continue block5;
                    throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + n2);
                }
                default: {
                    throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + class4952);
                }
                case 1: {
                    buffer.readStringCp1252NullCircumfixed();
                    continue block5;
                }
                case 0: 
            }
            StructComposition.findEnumerated(class4.method16(), buffer.readUnsignedByte());
        }
        return;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-72")
    boolean method9532() {
        return this.field5133 != null;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/Object;", garbageValue="1060776712")
    Object method9534() {
        if (this.field5133 != class544.field5392) {
            if (this.field5133 != class544.field5395) {
                if (this.field5133 != class544.field5393) {
                    return null;
                }
                return "";
            }
            return -1L;
        }
        return 0;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIB)I", garbageValue="-126")
    static final int method9540(int n, int n2, int n3, int n4) {
        return n3 * n2 - n4 * n >> 16;
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="([BIIB)I", garbageValue="3")
    static int method9539(byte[] byArray, int n, int n2) {
        int n3 = -1;
        int n4 = n;
        while (n4 < n2) {
            n3 = n3 >>> 8 ^ Buffer.field5469[(n3 ^ byArray[n4]) & 0xFF];
            ++n4;
        }
        return n3 ^= 0xFFFFFFFF;
    }
}

