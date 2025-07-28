/*
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

@ObfuscatedName(value="qa")
public final class class427 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lqa;")
    static class427[] field4755 = new class427[0];
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1504367069)
    static int field4750 = 100;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-457814417)
    static int field4752;
    @ObfuscatedName(value="ao")
    float field4751;
    @ObfuscatedName(value="ad")
    float field4754;
    @ObfuscatedName(value="an")
    float field4753;
    @ObfuscatedName(value="ae")
    float field4756;

    static {
        field4755 = new class427[100];
        field4752 = 0;
        new class427();
    }

    class427() {
        this.method8345();
    }

    public class427(float f, float f2, float f3) {
        this.method8332(f, f2, f3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1473805285")
    public void method8354() {
        class427[] class427Array = field4755;
        synchronized (field4755) {
            if (field4752 < field4750 - 1) {
                class427.field4755[++class427.field4752 - 1] = this;
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(FFFFI)V", garbageValue="-987345796")
    void method8333(float f, float f2, float f3, float f4) {
        this.field4751 = f;
        this.field4754 = f2;
        this.field4753 = f3;
        this.field4756 = f4;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(FFFFI)V", garbageValue="1523709540")
    public void method8334(float f, float f2, float f3, float f4) {
        float f5 = (float)Math.sin(0.5f * f4);
        float f6 = (float)Math.cos(0.5f * f4);
        this.field4751 = f * f5;
        this.field4754 = f5 * f2;
        this.field4753 = f3 * f5;
        this.field4756 = f6;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(FFFI)V", garbageValue="-29318803")
    public void method8332(float f, float f2, float f3) {
        this.method8334(0.0f, 1.0f, 0.0f, f);
        class427 class4272 = FaceNormal.method4465();
        class4272.method8334(1.0f, 0.0f, 0.0f, f2);
        this.method8340(class4272);
        class4272.method8334(0.0f, 0.0f, 1.0f, f3);
        this.method8340(class4272);
        class4272.method8354();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-476969734")
    final void method8345() {
        this.field4753 = 0.0f;
        this.field4754 = 0.0f;
        this.field4751 = 0.0f;
        this.field4756 = 1.0f;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lqa;I)V", garbageValue="2146504528")
    public final void method8340(class427 class4272) {
        this.method8333(this.field4751 * class4272.field4756 + this.field4756 * class4272.field4751 + class4272.field4754 * this.field4753 - this.field4754 * class4272.field4753, class4272.field4753 * this.field4751 + (class4272.field4756 * this.field4754 - class4272.field4751 * this.field4753 + this.field4756 * class4272.field4754), class4272.field4756 * this.field4753 + this.field4754 * class4272.field4751 - class4272.field4754 * this.field4751 + this.field4756 * class4272.field4753, this.field4756 * class4272.field4756 - class4272.field4751 * this.field4751 - this.field4754 * class4272.field4754 - class4272.field4753 * this.field4753);
    }

    public int hashCode() {
        int n = 31;
        float f = 1.0f;
        f = this.field4751 + f * 31.0f;
        f = this.field4754 + 31.0f * f;
        f = this.field4753 + 31.0f * f;
        f = this.field4756 + f * 31.0f;
        return (int)f;
    }

    public String toString() {
        return this.field4751 + "," + this.field4754 + "," + this.field4753 + "," + this.field4756;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class427)) {
            return false;
        }
        class427 class4272 = (class427)object;
        return class4272.field4751 == this.field4751 && this.field4754 == class4272.field4754 && class4272.field4753 == this.field4753 && class4272.field4756 == this.field4756;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ldf;Ldm;III)V", garbageValue="-105147355")
    static void method8367(ScriptEvent scriptEvent, Script object, int n, int n2) {
        Object object2;
        int n7;
        Object[] objectArray = scriptEvent.args;
        ScriptFrame.Interpreter_intStackSize = 0;
        HealthBar.Interpreter_stringStackSize = 0;
        int n3 = -1;
        int[] nArray = ((Script)object).opcodes;
        int[] nArray2 = ((Script)object).intOperands;
        int n4 = -1;
        Interpreter.Interpreter_frameDepth = 0;
        Interpreter.field850 = false;
        boolean bl = false;
        int n5 = 0;
        try {
            Object object3;
            int n6;
            class542.Interpreter_intLocals = new int[((Script)object).localIntCount];
            int n8 = 0;
            class148.Interpreter_stringLocals = new String[((Script)object).localStringCount];
            int n9 = 0;
            for (n7 = 1; n7 < objectArray.length; ++n7) {
                if (objectArray[n7] instanceof Integer) {
                    n6 = (Integer)objectArray[n7];
                    if (n6 == -2147483647) {
                        n6 = scriptEvent.mouseX;
                    }
                    if (n6 == -2147483646) {
                        n6 = scriptEvent.mouseY;
                    }
                    if (n6 == -2147483645) {
                        int n10 = n6 = scriptEvent.widget != null ? scriptEvent.widget.id : -1;
                    }
                    if (n6 == -2147483644) {
                        n6 = scriptEvent.opIndex;
                    }
                    if (n6 == -2147483643) {
                        int n11 = n6 = scriptEvent.widget != null ? scriptEvent.widget.childIndex : -1;
                    }
                    if (n6 == -2147483642) {
                        int n12 = n6 = scriptEvent.dragTarget != null ? scriptEvent.dragTarget.id : -1;
                    }
                    if (n6 == -2147483641) {
                        int n13 = n6 = scriptEvent.dragTarget != null ? scriptEvent.dragTarget.childIndex : -1;
                    }
                    if (n6 == -2147483640) {
                        n6 = scriptEvent.keyTyped;
                    }
                    if (n6 == -2147483639) {
                        n6 = scriptEvent.field1084;
                    }
                    if (n6 == -2147483638) {
                        n6 = scriptEvent.field1081;
                    }
                    class542.Interpreter_intLocals[n8++] = n6;
                    continue;
                }
                if (!(objectArray[n7] instanceof String)) continue;
                object3 = (String)objectArray[n7];
                if (((String)object3).equals("event_opbase")) {
                    object3 = scriptEvent.targetName;
                }
                class148.Interpreter_stringLocals[n9++] = object3;
            }
            Interpreter.field864 = scriptEvent.field1080;
            block13: while (true) {
                if (++n5 > n) {
                    throw new RuntimeException();
                }
                if ((n4 = nArray[++n3]) < 100) {
                    int n14;
                    if (n4 == 0) {
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = nArray2[n3];
                        continue;
                    }
                    if (n4 == 1) {
                        n7 = nArray2[n3];
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Varps.Varps_main[n7];
                        continue;
                    }
                    if (n4 == 2) {
                        n7 = nArray2[n3];
                        Varps.Varps_main[n7] = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        RouteStrategy.changeGameOptions(n7);
                        continue;
                    }
                    if (n4 == 3) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ((Script)object).stringOperands[n3];
                        continue;
                    }
                    if (n4 == 6) {
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 7) {
                        if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] == Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 8) {
                        if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] != Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 9) {
                        if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] >= Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 10) {
                        if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] <= Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 21) {
                        if (Interpreter.Interpreter_frameDepth == 0) {
                            return;
                        }
                        object2 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
                        object = ((ScriptFrame)object2).field442;
                        nArray = ((Script)object).opcodes;
                        nArray2 = ((Script)object).intOperands;
                        n3 = ((ScriptFrame)object2).field440;
                        class542.Interpreter_intLocals = ((ScriptFrame)object2).intLocals;
                        class148.Interpreter_stringLocals = ((ScriptFrame)object2).stringLocals;
                        continue;
                    }
                    if (n4 == 25) {
                        n7 = nArray2[n3];
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class77.getVarbit(n7);
                        continue;
                    }
                    if (n4 == 27) {
                        n7 = nArray2[n3];
                        RouteStrategy.method5847(n7, Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                        continue;
                    }
                    if (n4 == 31) {
                        if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] > Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 32) {
                        if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] < Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 33) {
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class542.Interpreter_intLocals[nArray2[n3]];
                        continue;
                    }
                    if (n4 == 34) {
                        class542.Interpreter_intLocals[nArray2[n3]] = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        continue;
                    }
                    if (n4 == 35) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class148.Interpreter_stringLocals[nArray2[n3]];
                        continue;
                    }
                    if (n4 == 36) {
                        class148.Interpreter_stringLocals[nArray2[n3]] = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                        continue;
                    }
                    if (n4 == 37) {
                        n7 = nArray2[n3];
                        object3 = ArchiveDiskActionHandler.method7668(Interpreter.Interpreter_stringStack, HealthBar.Interpreter_stringStackSize -= n7, n7);
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = object3;
                        continue;
                    }
                    if (n4 == 38) {
                        --ScriptFrame.Interpreter_intStackSize;
                        continue;
                    }
                    if (n4 == 39) {
                        --HealthBar.Interpreter_stringStackSize;
                        continue;
                    }
                    if (n4 == 40) {
                        if (Interpreter.Interpreter_frameDepth == 50) {
                            throw new RuntimeException();
                        }
                        n7 = nArray2[n3];
                        object3 = GameEngine.getScript(n7);
                        Object object4 = new int[((Script)object3).localIntCount];
                        String[] stringArray = new String[((Script)object3).localStringCount];
                        for (n14 = 0; n14 < ((Script)object3).intArgumentCount; ++n14) {
                            object4[n14] = Interpreter.Interpreter_intStack[n14 + (ScriptFrame.Interpreter_intStackSize - ((Script)object3).intArgumentCount)];
                        }
                        for (n14 = 0; n14 < ((Script)object3).stringArgumentCount; ++n14) {
                            stringArray[n14] = Interpreter.Interpreter_stringStack[n14 + (HealthBar.Interpreter_stringStackSize - ((Script)object3).stringArgumentCount)];
                        }
                        ScriptFrame.Interpreter_intStackSize -= ((Script)object3).intArgumentCount;
                        HealthBar.Interpreter_stringStackSize -= ((Script)object3).stringArgumentCount;
                        ScriptFrame scriptFrame = new ScriptFrame();
                        scriptFrame.field442 = object;
                        scriptFrame.field440 = n3;
                        scriptFrame.intLocals = class542.Interpreter_intLocals;
                        scriptFrame.stringLocals = class148.Interpreter_stringLocals;
                        Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = scriptFrame;
                        object = object3;
                        nArray = ((Script)object).opcodes;
                        nArray2 = ((Script)object).intOperands;
                        n3 = -1;
                        class542.Interpreter_intLocals = (int[])object4;
                        class148.Interpreter_stringLocals = stringArray;
                        continue;
                    }
                    if (n4 == 42) {
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class19.varcs.getInt(nArray2[n3]);
                        continue;
                    }
                    if (n4 == 43) {
                        class19.varcs.setInt(nArray2[n3], Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                        continue;
                    }
                    if (n4 == 44) {
                        int n15;
                        n7 = nArray2[n3] >> 16;
                        n6 = nArray2[n3] & 0xFFFF;
                        if ((n15 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) < 0) throw new RuntimeException();
                        if (n15 > 5000) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_arrayLengths[n7] = n15;
                        int n16 = -1;
                        if (n6 == 105) {
                            n16 = 0;
                        }
                        n14 = 0;
                        while (true) {
                            if (n14 >= n15) continue block13;
                            Interpreter.Interpreter_arrays[n7][n14] = n16;
                            ++n14;
                        }
                    }
                    if (n4 == 45) {
                        n7 = nArray2[n3];
                        if ((n6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) < 0) throw new RuntimeException();
                        if (n6 >= Interpreter.Interpreter_arrayLengths[n7]) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[n7][n6];
                        continue;
                    }
                    if (n4 == 46) {
                        n7 = nArray2[n3];
                        n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                        if (n6 < 0) throw new RuntimeException();
                        if (n6 >= Interpreter.Interpreter_arrayLengths[n7]) {
                            throw new RuntimeException();
                        }
                        Interpreter.Interpreter_arrays[n7][n6] = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                        continue;
                    }
                    if (n4 == 49) {
                        object2 = class19.varcs.getStringOld(nArray2[n3]);
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = object2;
                        continue;
                    }
                    if (n4 == 50) {
                        class19.varcs.setStringOld(nArray2[n3], Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]);
                        continue;
                    }
                    if (n4 == 60) {
                        object2 = ((Script)object).switches[nArray2[n3]];
                        if ((object3 = (IntegerNode)((IterableNodeHashTable)object2).get(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) == null) continue;
                        n3 += ((IntegerNode)object3).integer;
                        continue;
                    }
                    if (n4 == 74) {
                        object2 = WorldMapLabelSize.field3082.getTitleGroupValue(nArray2[n3]);
                        if (object2 == null) {
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                            continue;
                        }
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (Integer)object2;
                        continue;
                    }
                    if (n4 != 76) throw new IllegalStateException();
                    object2 = Client.field803.method9506(nArray2[n3]);
                    if (object2 == null) {
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                        continue;
                    }
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (Integer)object2;
                    continue;
                }
                n7 = ((Script)object).intOperands[n3] == 1 ? 1 : 0;
                n6 = class53.method1129(n4, (Script)object, n7 != 0);
                switch (n6) {
                    case 1: {
                        continue block13;
                    }
                    case 2: {
                        throw new IllegalStateException();
                    }
                    case 0: {
                        return;
                    }
                }
                continue;
                break;
            }
        }
        catch (Exception exception) {
            bl = true;
            StringBuilder stringBuilder = new StringBuilder(30);
            stringBuilder.append("").append(((Node)object).key).append(" ");
            for (n7 = Interpreter.Interpreter_frameDepth - 1; n7 >= 0; --n7) {
                stringBuilder.append("").append(Interpreter.Interpreter_frames[n7].field442.key).append(" ");
            }
            stringBuilder.append("").append(n4);
            class255.RunException_sendStackTrace(stringBuilder.toString(), exception);
            return;
        }
        finally {
            while (Interpreter.field863.size() > 0) {
                object2 = (class107)Interpreter.field863.remove(0);
                UrlRequester.widgetDefaultMenuAction(((class107)object2).method3090(), ((class107)object2).method3081(), ((class107)object2).method3082(), ((class107)object2).method3083(), "");
            }
            if (Interpreter.field850) {
                Interpreter.field850 = false;
                AbstractByteArrayCopier.method7584();
            }
            if (!bl && n2 > 0 && n5 >= n2) {
                class255.RunException_sendStackTrace("Warning: Script " + ((Script)object).field1004 + " finished at op count " + n5 + " of max " + n, null);
            }
        }
    }
}

