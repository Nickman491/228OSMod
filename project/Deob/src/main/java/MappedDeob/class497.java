/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="tr")
public abstract class class497
extends class309
implements class564 {
    @ObfuscatedSignature(descriptor="(Lol;Lph;I)V")
    protected class497(StudioGame studioGame, Language language, int n) {
        super(studioGame, language, n);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Lts;", garbageValue="-1")
    protected abstract class499 vmethod10080(int var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1500806592")
    public int method9511() {
        return this.field3286;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/Object;", garbageValue="-2107940388")
    public Object vmethod10593(int n) {
        class499 class4992 = this.vmethod10080(n);
        if (class4992 != null && class4992.method9532()) {
            return class4992.method9534();
        }
        return null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;B)Lvm;", garbageValue="1")
    public class565 method9513(Buffer buffer) {
        int n = buffer.readUnsignedShort();
        class499 class4992 = this.vmethod10080(n);
        class565 class5652 = new class565(n);
        Class clazz = class4992.field5133.field5396;
        if (clazz == Integer.class) {
            class5652.field5539 = buffer.readInt();
        } else if (clazz == Long.class) {
            class5652.field5539 = buffer.readLong();
        } else if (clazz == String.class) {
            class5652.field5539 = buffer.readStringCp1252NullCircumfixed();
        } else if (class560.class.isAssignableFrom(clazz)) {
            try {
                class560 class5602 = (class560)clazz.newInstance();
                class5602.method10570(buffer);
                class5652.field5539 = class5602;
            }
            catch (InstantiationException instantiationException) {
            }
            catch (IllegalAccessException illegalAccessException) {}
        } else {
            throw new IllegalStateException();
        }
        return class5652;
    }
}

