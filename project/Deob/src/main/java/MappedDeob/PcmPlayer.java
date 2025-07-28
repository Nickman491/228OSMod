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
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bq")
@Implements(value="PcmPlayer")
public class PcmPlayer {
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=323263577)
    public static int field257;
    @ObfuscatedName(value="an")
    @Export(value="PcmPlayer_stereo")
    public static boolean PcmPlayer_stereo;
    @ObfuscatedName(value="ax")
    @Export(value="soundSystemExecutor")
    static ScheduledExecutorService soundSystemExecutor;
    @ObfuscatedName(value="fb")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field276;
    @ObfuscatedName(value="uo")
    @ObfuscatedGetter(intValue=1930587711)
    static int field275;
    @ObfuscatedName(value="af")
    @Export(value="samples")
    protected int[] samples;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lbn;")
    @Export(value="stream")
    PcmStream stream;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1358623715)
    int field261 = 32;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(longValue=-9098802176499279333L)
    @Export(value="timeMs")
    long timeMs = ReflectionCheck.method724();
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-1048911801)
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-474399613)
    int field263;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1729245287)
    int field265;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(longValue=-3167251829314267789L)
    long field266 = 0L;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1007287475)
    int field259 = 0;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=310071645)
    int field268 = 0;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=905456165)
    int field269 = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(longValue=205761756168129153L)
    long field270 = 0L;
    @ObfuscatedName(value="aj")
    boolean field271 = true;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=940450061)
    int field272 = 0;
    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="[Lbn;")
    PcmStream[] field273 = new PcmStream[8];
    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="[Lbn;")
    PcmStream[] field274 = new PcmStream[8];

    protected PcmPlayer() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-934813238")
    @Export(value="init")
    protected void init() throws Exception {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="2008767536")
    @Export(value="open")
    protected void open(int n) throws Exception {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1560665771")
    @Export(value="position")
    protected int position() throws Exception {
        return this.capacity;
    }

    @ObfuscatedName(value="ao")
    @Export(value="write")
    protected void write() throws Exception {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    @Export(value="close")
    protected void close() {
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-376770394")
    @Export(value="discard")
    protected void discard() throws Exception {
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Lbn;I)V", garbageValue="238570419")
    @Export(value="setStream")
    public final synchronized void setStream(PcmStream pcmStream) {
        this.stream = pcmStream;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="61")
    @Export(value="run")
    public final synchronized void run() {
        if (this.samples == null) {
            return;
        }
        long l = ReflectionCheck.method724();
        try {
            int n;
            int n2;
            if (0L != this.field266) {
                if (l < this.field266) {
                    return;
                }
                this.open(this.capacity);
                this.field266 = 0L;
                this.field271 = true;
            }
            if (this.field269 - (n2 = this.position()) > this.field259) {
                this.field259 = this.field269 - n2;
            }
            if ((n = this.field265 + this.field263) + 256 > 16384) {
                n = 16128;
            }
            if (n + 256 > this.capacity) {
                this.capacity += 1024;
                if (this.capacity > 16384) {
                    this.capacity = 16384;
                }
                this.close();
                this.open(this.capacity);
                n2 = 0;
                this.field271 = true;
                if (n + 256 > this.capacity) {
                    n = this.capacity - 256;
                    this.field265 = n - this.field263;
                }
            }
            while (n2 < n) {
                this.fill(this.samples, 256);
                this.write();
                n2 += 256;
            }
            if (l > this.field270) {
                if (!this.field271) {
                    if (this.field259 == 0 && this.field268 == 0) {
                        this.close();
                        this.field266 = 2000L + l;
                        return;
                    }
                    this.field265 = Math.min(this.field268, this.field259);
                    this.field268 = this.field259;
                } else {
                    this.field271 = false;
                }
                this.field259 = 0;
                this.field270 = 2000L + l;
            }
            this.field269 = n2;
        }
        catch (Exception exception) {
            this.close();
            this.field266 = 2000L + l;
        }
        try {
            if (l > 500000L + this.timeMs) {
                l = this.timeMs;
            }
            while (l > this.timeMs + 5000L) {
                this.skip(256);
                this.timeMs += (long)(256000 / field257);
            }
        }
        catch (Exception exception) {
            this.timeMs = l;
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1874859943")
    public final void method807() {
        this.field271 = true;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-19562")
    @Export(value="tryDiscard")
    public final synchronized void tryDiscard() {
        this.field271 = true;
        try {
            this.discard();
        }
        catch (Exception exception) {
            this.close();
            this.field266 = ReflectionCheck.method724() + 2000L;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-82")
    @Export(value="shutdown")
    public final synchronized void shutdown() {
        block2: {
            if (DefaultsGroup.soundSystem == null) break block2;
            boolean bl = true;
            int n = 0;
            while (true) {
                block4: {
                    block5: {
                        block3: {
                            if (n >= 2) break block3;
                            if (this != DefaultsGroup.soundSystem.players[n]) break block4;
                            break block5;
                        }
                        if (!bl) break;
                        soundSystemExecutor.shutdownNow();
                        soundSystemExecutor = null;
                        DefaultsGroup.soundSystem = null;
                        break;
                    }
                    DefaultsGroup.soundSystem.players[n] = null;
                }
                if (DefaultsGroup.soundSystem.players[n] != null) {
                    bl = false;
                }
                ++n;
            }
        }
        this.close();
        this.samples = null;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-4852237")
    @Export(value="skip")
    final void skip(int n) {
        this.field272 -= n;
        if (this.field272 < 0) {
            this.field272 = 0;
        }
        if (this.stream != null) {
            this.stream.skip(n);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="bw")
    @Export(value="fill")
    final void fill(int[] nArray, int n) {
        block21: {
            PcmStream pcmStream;
            int n2;
            int n3 = n;
            if (PcmPlayer_stereo) {
                n3 <<= 1;
            }
            class451.clearIntArray(nArray, 0, n3);
            this.field272 -= n;
            if (this.stream == null || this.field272 > 0) break block21;
            this.field272 += field257 >> 4;
            class220.PcmStream_disable(this.stream);
            this.method812(this.stream, this.stream.vmethod1079());
            int n4 = 0;
            int n5 = 255;
            int n6 = 7;
            block0: while (n5 != 0) {
                int n7;
                int n8;
                if (n6 < 0) {
                    n8 = n6 & 3;
                    n7 = -(n6 >> 2);
                } else {
                    n8 = n6;
                    n7 = 0;
                }
                n2 = n5 >>> n8 & 0x11111111;
                while (true) {
                    block22: {
                        if (n2 == 0) {
                            --n6;
                            continue block0;
                        }
                        if ((n2 & 1) == 0) break block22;
                        n5 &= ~(1 << n8);
                        pcmStream = null;
                        PcmStream pcmStream2 = this.field273[n8];
                        while (pcmStream2 != null) {
                            block23: {
                                AbstractSound abstractSound = pcmStream2.sound;
                                if (abstractSound != null && abstractSound.position > n7) {
                                    n5 |= 1 << n8;
                                    pcmStream = pcmStream2;
                                    pcmStream2 = pcmStream2.after;
                                    continue;
                                }
                                pcmStream2.active = true;
                                int n9 = pcmStream2.vmethod6927();
                                n4 += n9;
                                if (abstractSound != null) {
                                    abstractSound.position += n9;
                                }
                                if (n4 < this.field261) break block23;
                                break block0;
                            }
                            PcmStream pcmStream3 = pcmStream2.firstSubStream();
                            if (pcmStream3 != null) {
                                int n10 = pcmStream2.field323;
                                while (pcmStream3 != null) {
                                    this.method812(pcmStream3, n10 * pcmStream3.vmethod1079() >> 8);
                                    pcmStream3 = pcmStream2.nextSubStream();
                                }
                            }
                            PcmStream pcmStream4 = pcmStream2.after;
                            pcmStream2.after = null;
                            if (pcmStream == null) {
                                this.field273[n8] = pcmStream4;
                            } else {
                                pcmStream.after = pcmStream4;
                            }
                            if (pcmStream4 == null) {
                                this.field274[n8] = pcmStream;
                            }
                            pcmStream2 = pcmStream4;
                        }
                    }
                    n8 += 4;
                    ++n7;
                    n2 >>>= 4;
                }
            }
            for (n6 = 0; n6 < 8; ++n6) {
                PcmStream pcmStream5 = this.field273[n6];
                PcmStream[] pcmStreamArray = this.field273;
                n2 = n6;
                this.field274[n6] = null;
                pcmStreamArray[n2] = null;
                while (pcmStream5 != null) {
                    pcmStream = pcmStream5.after;
                    pcmStream5.after = null;
                    pcmStream5 = pcmStream;
                }
            }
        }
        if (this.field272 < 0) {
            this.field272 = 0;
        }
        if (this.stream != null) {
            this.stream.fill(nArray, 0, n);
        }
        this.timeMs = ReflectionCheck.method724();
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(Lbn;II)V", garbageValue="705422506")
    final void method812(PcmStream pcmStream, int n) {
        int n2 = n >> 5;
        PcmStream pcmStream2 = this.field274[n2];
        if (pcmStream2 == null) {
            this.field273[n2] = pcmStream;
        } else {
            pcmStream2.after = pcmStream;
        }
        this.field274[n2] = pcmStream;
        pcmStream.field323 = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)Ljava/lang/String;", garbageValue="817321018")
    public static String method857(CharSequence charSequence) {
        int n = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n);
        int n2 = 0;
        while (n2 < n) {
            char c = charSequence.charAt(n2);
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || c == '-' || c == '*' || c == '_')) {
                if (c == ' ') {
                    stringBuilder.append('+');
                } else {
                    byte by = class232.charToByteCp1252(c);
                    stringBuilder.append('%');
                    int n3 = by >> 4 & 0xF;
                    if (n3 >= 10) {
                        stringBuilder.append((char)(n3 + 55));
                    } else {
                        stringBuilder.append((char)(n3 + 48));
                    }
                    n3 = by & 0xF;
                    if (n3 >= 10) {
                        stringBuilder.append((char)(n3 + 55));
                    } else {
                        stringBuilder.append((char)(n3 + 48));
                    }
                }
            } else {
                stringBuilder.append(c);
            }
            ++n2;
        }
        return stringBuilder.toString();
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1488118055")
    static final int method804(int n, int n2) {
        int n3 = n + n2 * 57;
        n3 = n3 << 13 ^ n3;
        int n4 = n3 * (n3 * n3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return n4 >> 19 & 0xFF;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIIIIILku;I)V", garbageValue="-1915575984")
    static final void method823(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, CollisionMap collisionMap) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        ObjectComposition objectComposition = class142.getObjectDefinition(n5);
        int n16 = n15 = n8 >= 0 ? n8 : objectComposition.animationId;
        if (n6 != 1 && n6 != 3) {
            n14 = objectComposition.sizeX;
            n13 = objectComposition.sizeY;
        } else {
            n14 = objectComposition.sizeY;
            n13 = objectComposition.sizeX;
        }
        if (n3 + n14 > class1032.field1322) {
            n12 = n3;
            n11 = n3 + 1;
        } else {
            n12 = n3 + (n14 >> 1);
            n11 = n3 + (n14 + 1 >> 1);
        }
        if (n13 + n4 > class1032.field1323) {
            n10 = n4;
            n9 = n4 + 1;
        } else {
            n10 = (n13 >> 1) + n4;
            n9 = n4 + (n13 + 1 >> 1);
        }
        int[][] nArray = class1032.field1328[n2];
        int n17 = nArray[n11][n9] + nArray[n12][n9] + nArray[n12][n10] + nArray[n11][n10] >> 2;
        int n18 = (n3 << 7) + (n14 << 6);
        int n19 = (n4 << 7) + (n13 << 6);
        class187 class1872 = class1032.field1319;
        long l = Projectile.method2452(n3, n4, 2, objectComposition.int1 == 0, n5, class1032.field1320);
        int n20 = (n6 << 6) + n7;
        if (objectComposition.int3 == 1) {
            n20 += 256;
        }
        if (n7 != 22) {
            if (n7 != 10 && n7 != 11) {
                if (n7 < 12) {
                    if (n7 != 0) {
                        if (n7 != 1) {
                            Renderable renderable;
                            Renderable renderable2;
                            if (n7 != 2) {
                                if (n7 != 3) {
                                    if (n7 != 9) {
                                        if (n7 != 4) {
                                            if (n7 != 5) {
                                                if (n7 != 6) {
                                                    if (n7 != 7) {
                                                        Renderable renderable3;
                                                        Renderable renderable4;
                                                        if (n7 != 8) {
                                                            return;
                                                        }
                                                        int n21 = 8;
                                                        long l2 = class1872.method4395(n, n3, n4);
                                                        if (l2 != 0L) {
                                                            n21 = class142.getObjectDefinition((int)class360.method7406((long)l2)).int2 / 2;
                                                        }
                                                        int n22 = n6 + 2 & 3;
                                                        if (n15 == -1 && objectComposition.transforms == null) {
                                                            renderable4 = objectComposition.getModel(4, n6 + 4, nArray, n18, n17, n19);
                                                            renderable3 = objectComposition.getModel(4, n22 + 4, nArray, n18, n17, n19);
                                                        } else {
                                                            renderable4 = new class82(class1032, n5, 4, n6 + 4, n2, n3, n4, n15, objectComposition.boolean3, null);
                                                            renderable3 = new class82(class1032, n5, 4, n22 + 4, n2, n3, n4, n15, objectComposition.boolean3, null);
                                                        }
                                                        class1872.method4183(n, n3, n4, n17, renderable4, renderable3, 256, n6, Tiles.field1037[n6] * n21, Tiles.field1038[n6] * n21, l, n20);
                                                        return;
                                                    }
                                                    int n23 = n6 + 2 & 3;
                                                    Renderable renderable5 = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(4, n23 + 4, nArray, n18, n17, n19) : new class82(class1032, n5, 4, n23 + 4, n2, n3, n4, n15, objectComposition.boolean3, null);
                                                    class1872.method4183(n, n3, n4, n17, renderable5, null, 256, n23, 0, 0, l, n20);
                                                    return;
                                                }
                                                int n24 = 8;
                                                long l3 = class1872.method4395(n, n3, n4);
                                                if (0L != l3) {
                                                    n24 = class142.getObjectDefinition((int)class360.method7406((long)l3)).int2 / 2;
                                                }
                                                Renderable renderable6 = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(4, n6 + 4, nArray, n18, n17, n19) : new class82(class1032, n5, 4, n6 + 4, n2, n3, n4, n15, objectComposition.boolean3, null);
                                                class1872.method4183(n, n3, n4, n17, renderable6, null, 256, n6, Tiles.field1037[n6] * n24, Tiles.field1038[n6] * n24, l, n20);
                                                return;
                                            }
                                            int n25 = 16;
                                            long l4 = class1872.method4395(n, n3, n4);
                                            if (0L != l4) {
                                                n25 = class142.getObjectDefinition((int)class360.method7406((long)l4)).int2;
                                            }
                                            Renderable renderable7 = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(4, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 4, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
                                            class1872.method4183(n, n3, n4, n17, renderable7, null, Tiles.field1028[n6], 0, Tiles.field1031[n6] * n25, Tiles.field1036[n6] * n25, l, n20);
                                            return;
                                        }
                                        Renderable renderable8 = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(4, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 4, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
                                        class1872.method4183(n, n3, n4, n17, renderable8, null, Tiles.field1028[n6], 0, 0, 0, l, n20);
                                        return;
                                    }
                                    Renderable renderable9 = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(n7, n6, nArray, n18, n17, n19) : new class82(class1032, n5, n7, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
                                    class1872.method4184(n, n3, n4, n17, 1, 1, renderable9, 0, l, n20);
                                    if (objectComposition.interactType != 0 && collisionMap != null) {
                                        collisionMap.addGameObject(n3, n4, n14, n13, objectComposition.boolean1);
                                    }
                                    return;
                                }
                                Renderable renderable10 = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(3, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 3, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
                                class1872.method4182(n, n3, n4, n17, renderable10, null, Tiles.field1034[n6], 0, l, n20);
                                if (objectComposition.interactType != 0 && collisionMap != null) {
                                    collisionMap.method5797(n3, n4, n7, n6, objectComposition.boolean1);
                                }
                                return;
                            }
                            int n26 = n6 + 1 & 3;
                            if (n15 == -1 && objectComposition.transforms == null) {
                                renderable2 = objectComposition.getModel(2, n6 + 4, nArray, n18, n17, n19);
                                renderable = objectComposition.getModel(2, n26, nArray, n18, n17, n19);
                            } else {
                                renderable2 = new class82(class1032, n5, 2, n6 + 4, n2, n3, n4, n15, objectComposition.boolean3, null);
                                renderable = new class82(class1032, n5, 2, n26, n2, n3, n4, n15, objectComposition.boolean3, null);
                            }
                            class1872.method4182(n, n3, n4, n17, renderable2, renderable, Tiles.field1028[n6], Tiles.field1028[n26], l, n20);
                            if (objectComposition.interactType != 0 && collisionMap != null) {
                                collisionMap.method5797(n3, n4, n7, n6, objectComposition.boolean1);
                            }
                            return;
                        }
                        Renderable renderable = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(1, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 1, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
                        class1872.method4182(n, n3, n4, n17, renderable, null, Tiles.field1034[n6], 0, l, n20);
                        if (objectComposition.interactType != 0 && collisionMap != null) {
                            collisionMap.method5797(n3, n4, n7, n6, objectComposition.boolean1);
                        }
                        return;
                    }
                    Renderable renderable = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(0, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 0, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
                    class1872.method4182(n, n3, n4, n17, renderable, null, Tiles.field1028[n6], 0, l, n20);
                    if (objectComposition.interactType != 0 && collisionMap != null) {
                        collisionMap.method5797(n3, n4, n7, n6, objectComposition.boolean1);
                    }
                    return;
                }
                Renderable renderable = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(n7, n6, nArray, n18, n17, n19) : new class82(class1032, n5, n7, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
                class1872.method4184(n, n3, n4, n17, 1, 1, renderable, 0, l, n20);
                if (objectComposition.interactType != 0 && collisionMap != null) {
                    collisionMap.addGameObject(n3, n4, n14, n13, objectComposition.boolean1);
                }
                return;
            }
            Renderable renderable = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(10, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 10, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
            if (renderable != null) {
                class1872.method4184(n, n3, n4, n17, n14, n13, renderable, n7 == 11 ? 256 : 0, l, n20);
            }
            if (objectComposition.interactType != 0 && collisionMap != null) {
                collisionMap.addGameObject(n3, n4, n14, n13, objectComposition.boolean1);
            }
            return;
        }
        Renderable renderable = n15 == -1 && objectComposition.transforms == null ? objectComposition.getModel(22, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 22, n6, n2, n3, n4, n15, objectComposition.boolean3, null);
        class1872.method4180(n, n3, n4, n17, renderable, l, n20);
        if (objectComposition.interactType == 1 && collisionMap != null) {
            collisionMap.method5812(n3, n4);
        }
    }

    @ObfuscatedName(value="ku")
    @ObfuscatedSignature(descriptor="(Ldz;IIII)V", garbageValue="218938967")
    static final void method827(class103 class1032, int n, int n2, int n3) {
        NodeDeque nodeDeque = class1032.field1327[n][n2][n3];
        if (nodeDeque != null) {
            long l = -99999999L;
            TileItem tileItem = null;
            TileItem tileItem2 = (TileItem)nodeDeque.last();
            while (true) {
                DualNode dualNode;
                if (tileItem2 == null) {
                    if (tileItem != null) {
                        nodeDeque.addLast(tileItem);
                        dualNode = null;
                        TileItem tileItem3 = null;
                        tileItem2 = (TileItem)nodeDeque.last();
                        while (true) {
                            if (tileItem2 == null) {
                                long l2 = Projectile.method2452(n2, n3, 3, false, 0, class1032.field1320);
                                class1032.field1319.method4297(n, n2, n3, Canvas.method337(class1032, Coord.method6980(n2), Coord.method6980(n3), n), tileItem, l2, (Renderable)dualNode, tileItem3);
                                return;
                            }
                            if (tileItem2.id != tileItem.id) {
                                if (dualNode == null) {
                                    dualNode = tileItem2;
                                }
                                if (tileItem2.id != ((TileItem)dualNode).id && tileItem3 == null) {
                                    tileItem3 = tileItem2;
                                }
                            }
                            tileItem2 = (TileItem)nodeDeque.previous();
                        }
                    }
                    class1032.field1319.method4195(n, n2, n3);
                    return;
                }
                dualNode = FaceNormal.ItemDefinition_get(tileItem2.id);
                long l3 = dualNode.maleModel;
                if (dualNode.isStackable == 1) {
                    l3 *= tileItem2.field1385 < Integer.MAX_VALUE ? (long)(tileItem2.field1385 + 1) : (long)tileItem2.field1385;
                }
                if (l3 > l) {
                    l = l3;
                    tileItem = tileItem2;
                }
                tileItem2 = (TileItem)nodeDeque.previous();
            }
        }
        class1032.field1319.method4195(n, n2, n3);
    }
}

