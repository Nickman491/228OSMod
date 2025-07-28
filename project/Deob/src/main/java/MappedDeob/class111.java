/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="et")
final class class111
implements class351 {
    @ObfuscatedSignature(descriptor="Lna;")
    final /* synthetic */ Widget val$item;

    @ObfuscatedSignature(descriptor="(Lna;)V")
    class111(Widget widget) {
        this.val$item = widget;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1894647927")
    public void vmethod7020() {
        if (this.val$item.method7447().field3802 != null) {
            ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.method2628(this.val$item);
            scriptEvent.setArgs(this.val$item.method7447().field3802);
            WorldMapElement.method5196().addFirst(scriptEvent);
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lae;B)Lao;", garbageValue="103")
    public static class3 method3126(class6 class62) {
        switch (class62.field15) {
            case 0: {
                return new class0();
            }
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="ky")
    @ObfuscatedSignature(descriptor="(Ldz;ZLvv;I)V", garbageValue="850337230")
    static final void method3125(class103 class1032, boolean bl, PacketBuffer packetBuffer) {
        Client.field635 = 0;
        Client.field562 = 0;
        class223.method5008(class1032, packetBuffer);
        while (true) {
            int n;
            boolean bl2;
            int n2;
            int n3;
            int n4;
            int n5 = 16;
            int n6 = 1 << n5;
            if (packetBuffer.method10229(Client.packetWriter.field1452) < n5 + 12 || (n4 = packetBuffer.readBits(n5)) == n6 - 1) {
                packetBuffer.exportIndex();
                AbstractUserComparator.method9189(class1032, packetBuffer);
                n5 = 0;
                while (true) {
                    if (n5 >= Client.field635) {
                        if (packetBuffer.offset == Client.packetWriter.field1452) {
                            n5 = 0;
                            while (true) {
                                if (n5 >= class1032.field1331) {
                                    return;
                                }
                                if (class1032.field1330[class1032.field1332[n5]] == null) {
                                    throw new RuntimeException(n5 + "," + class1032.field1331);
                                }
                                ++n5;
                            }
                        }
                        throw new RuntimeException(packetBuffer.offset + "," + Client.packetWriter.field1452);
                    }
                    n6 = Client.field537[n5];
                    if (class1032.field1330[n6].field1259 != Client.cycle) {
                        class1032.field1330[n6].field1354 = null;
                        class1032.field1330[n6] = null;
                    }
                    ++n5;
                }
            }
            int n7 = class183.field1966;
            boolean bl3 = false;
            if (class1032.field1330[n4] == null) {
                class1032.field1330[n4] = new class105();
                bl3 = true;
            }
            class105 class1052 = class1032.field1330[n4];
            class1052.field1350 = n7;
            class1032.field1332[++class1032.field1331 - 1] = n4;
            class1052.field1259 = Client.cycle;
            if (!bl) {
                n3 = packetBuffer.readBits(6);
                if (n3 > 31) {
                    n3 -= 64;
                }
            } else {
                n3 = packetBuffer.readBits(8);
                if (n3 > 127) {
                    n3 -= 256;
                }
            }
            if (!bl) {
                n2 = packetBuffer.readBits(6);
                if (n2 > 31) {
                    n2 -= 64;
                }
            } else {
                n2 = packetBuffer.readBits(8);
                if (n2 > 127) {
                    n2 -= 256;
                }
            }
            boolean bl4 = bl2 = packetBuffer.readBits(1) == 1;
            if (bl2) {
                packetBuffer.readBits(32);
            }
            class1052.field1354 = class446.getNpcDefinition(packetBuffer.readBits(14));
            int n8 = packetBuffer.readBits(1);
            int n9 = Client.field640[packetBuffer.readBits(3)];
            if (bl3) {
                class1052.field1262 = class1052.field1197 = n9;
            }
            if ((n = packetBuffer.readBits(1)) == 1) {
                Client.field567[++Client.field562 - 1] = n4;
            }
            class97.method2736(class1052);
            if (class1052.field1200 == 0) {
                class1052.field1197 = 0;
            }
            class1052.method3049(n2 + class277.field3055, n3 + class221.field2426, n8 == 1);
        }
    }
}

