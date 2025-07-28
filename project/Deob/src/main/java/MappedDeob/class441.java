/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qt")
public class class441
extends class448 {
    @ObfuscatedSignature(descriptor="(Lrh;)V")
    public class441(class448 class4482) {
        super(class4482);
        this.field4868 = "AddRequestTask";
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        while (!class333.field3631.isEmpty()) {
            class345 class3452 = (class345)class333.field3631.peek();
            if (class3452 != null) {
                class3452.field3743 = this.method8817();
                class333.field3623.add(class3452);
                class333.field3631.pop();
                continue;
            }
            class333.field3631.pop();
        }
        return true;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Lma;", garbageValue="-1744048906")
    MidiPcmStream method8817() {
        MidiPcmStream midiPcmStream = null;
        Iterator iterator = class333.field3625.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (midiPcmStream != null) {
                    ++midiPcmStream.field3668;
                    if (midiPcmStream.method6710() == 0 && midiPcmStream.isReady()) {
                        midiPcmStream.clear();
                        midiPcmStream.method6714();
                        midiPcmStream.setPcmStreamVolume(0);
                    }
                }
                return midiPcmStream;
            }
            MidiPcmStream midiPcmStream2 = (MidiPcmStream)iterator.next();
            if (midiPcmStream2 == null || midiPcmStream != null && midiPcmStream.field3668 <= midiPcmStream2.field3668 && (midiPcmStream2.method6710() != 0 || !midiPcmStream2.isReady())) continue;
            midiPcmStream = midiPcmStream2;
        }
    }
}

