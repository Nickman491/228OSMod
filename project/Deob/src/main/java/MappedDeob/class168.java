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

@ObfuscatedName(value="gl")
public class class168
extends class150 {
    @ObfuscatedName(value="dv")
    @ObfuscatedSignature(descriptor="Lde;")
    static MouseRecorder field1794;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1951142615)
    int field1796;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-118886787)
    int field1795;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class168(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        this.field1796 = buffer.readInt();
        this.field1795 = buffer.readInt();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.method3717(this.field1796, this.field1795);
    }

    @ObfuscatedName(value="kt")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIIIIII)V", garbageValue="-1803870393")
    static final void method3819(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        block25: {
            ObjectComposition objectComposition;
            int n9;
            class187 class1872 = class1032.field1319;
            if (n3 < 1 || n4 < 1 || n3 > class1032.field1322 - 1 || n4 > class1032.field1323 - 1) break block25;
            if (Client.isLowDetail && class1032.field1321 != n) {
                return;
            }
            long l = 0L;
            int n10 = -1;
            int n11 = 0;
            int n12 = 0;
            if (n2 == 0) {
                l = class1872.method4395(n, n3, n4);
            }
            if (n2 == 1) {
                l = class1872.method4253(n, n3, n4);
            }
            if (n2 == 2) {
                l = class1872.method4202(n, n3, n4);
            }
            if (n2 == 3) {
                l = class1872.method4203(n, n3, n4);
            }
            if (l != 0L) {
                n9 = class1872.method4192(n, n3, n4, l);
                n10 = class360.method7406(l);
                n11 = n9 & 0x1F;
                n12 = n9 >> 6 & 3;
                objectComposition = class142.getObjectDefinition(n10);
                int n13 = n3;
                int n14 = n4;
                if (objectComposition != null && objectComposition.hasSound()) {
                    Node node;
                    int n15 = objectComposition.sizeX;
                    int n16 = objectComposition.sizeY;
                    if (n12 == 1 || n12 == 3) {
                        n15 = objectComposition.sizeY;
                        n16 = objectComposition.sizeX;
                    }
                    int n17 = (n15 + n13) * 128;
                    int n18 = (n14 + n16) * 128;
                    n13 *= 128;
                    n14 *= 128;
                    int n19 = objectComposition.ambientSoundId;
                    int n20 = objectComposition.int7 * 128;
                    int n21 = objectComposition.field2835 * 128;
                    if (objectComposition.transforms != null && (node = objectComposition.transform()) != null) {
                        n19 = ((ObjectComposition)node).ambientSoundId;
                        n20 = ((ObjectComposition)node).int7 * 128;
                        n21 = ((ObjectComposition)node).field2835 * 128;
                    }
                    node = (ObjectSound)ObjectSound.objectSounds.last();
                    while (node != null) {
                        if (((ObjectSound)node).field835 == n && n13 == ((ObjectSound)node).field837 * 16384 && n14 == ((ObjectSound)node).field834 * 16384 && n17 == ((ObjectSound)node).field838 * 16384 && n18 == ((ObjectSound)node).field839 * 16384 && n19 == ((ObjectSound)node).soundEffectId && n20 == ((ObjectSound)node).field840 && n21 == ((ObjectSound)node).field841) {
                            if (((ObjectSound)node).stream1 != null) {
                                UserList.pcmStreamMixer.removeSubStream(((ObjectSound)node).stream1);
                                ((ObjectSound)node).stream1 = null;
                            }
                            if (((ObjectSound)node).stream2 != null) {
                                UserList.pcmStreamMixer.removeSubStream(((ObjectSound)node).stream2);
                                ((ObjectSound)node).stream2 = null;
                            }
                            node.remove();
                            break;
                        }
                        node = (ObjectSound)ObjectSound.objectSounds.previous();
                    }
                }
                if (n2 == 0) {
                    class1872.method4191(n, n3, n4);
                    if (objectComposition.interactType != 0) {
                        class1032.field1336[n].method5802(n3, n4, n11, n12, objectComposition.boolean1);
                    }
                }
                if (n2 == 1) {
                    class1872.method4381(n, n3, n4);
                }
                if (n2 == 2) {
                    class1872.method4242(n, n3, n4);
                    if (n3 + objectComposition.sizeX > class1032.field1322 - 1 || n4 + objectComposition.sizeX > class1032.field1323 - 1 || n3 + objectComposition.sizeY > class1032.field1322 - 1 || n4 + objectComposition.sizeY > class1032.field1323 - 1) {
                        return;
                    }
                    if (objectComposition.interactType != 0) {
                        class1032.field1336[n].setFlagOffNonSquare(n3, n4, objectComposition.sizeX, objectComposition.sizeY, n12, objectComposition.boolean1);
                    }
                }
                if (n2 == 3) {
                    class1872.method4194(n, n3, n4);
                    if (objectComposition.interactType == 1) {
                        class1032.field1336[n].method5805(n3, n4);
                    }
                }
            }
            if (n5 >= 0) {
                n9 = n;
                if (n9 < 3 && (class1032.field1337[1][n3][n4] & 2) == 2) {
                    ++n9;
                }
                PcmPlayer.method823(class1032, n, n9, n3, n4, n5, n6, n7, n8, class1032.field1336[n]);
                objectComposition = class142.getObjectDefinition(n5);
                if (objectComposition != null && objectComposition.hasSound()) {
                    GameEngine.method593(n9, n3, n4, objectComposition, n6);
                }
            }
        }
    }
}

