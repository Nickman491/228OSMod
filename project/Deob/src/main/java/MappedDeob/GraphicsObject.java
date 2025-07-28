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
import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cm")
@Implements(value="GraphicsObject")
public class GraphicsObject
extends Renderable {
    @ObfuscatedName(value="iq")
    @ObfuscatedSignature(descriptor="Lqw;")
    public static Font field892;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1789390543)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1926961565)
    @Export(value="cycleStart")
    int cycleStart;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2147325297)
    @Export(value="plane")
    int plane;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1275497143)
    @Export(value="x")
    int x;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-89883695)
    @Export(value="y")
    int y;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1175477221)
    @Export(value="z")
    int z;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkb;")
    @Export(value="sequenceDefinition")
    SequenceDefinition sequenceDefinition;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=337630113)
    @Export(value="frame")
    int frame;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-362503139)
    @Export(value="frameCycle")
    int frameCycle;
    @ObfuscatedName(value="ac")
    @Export(value="isFinished")
    boolean isFinished;

    GraphicsObject(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.frame = 0;
        this.frameCycle = 0;
        this.isFinished = false;
        this.id = n;
        this.plane = n2;
        this.x = n3;
        this.y = n4;
        this.z = n5;
        this.cycleStart = n7 + n6;
        int n8 = ObjectComposition.SpotAnimationDefinition_get((int)this.id).sequence;
        if (n8 == -1) {
            this.isFinished = true;
        } else {
            this.isFinished = false;
            this.sequenceDefinition = class33.SequenceDefinition_get(n8);
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-437976859")
    @Export(value="advance")
    final void advance(int n) {
        if (this.isFinished) {
            return;
        }
        this.frameCycle += n;
        if (this.sequenceDefinition.isCachedModelIdSet()) {
            this.frame += n;
            if (this.frame < this.sequenceDefinition.method5703()) {
                class271.method5839(this.sequenceDefinition, this.frame, this.x, this.y, false);
            } else {
                this.isFinished = true;
            }
        } else {
            while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
                this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
                ++this.frame;
                if (this.frame < this.sequenceDefinition.frameIds.length) {
                    class271.method5839(this.sequenceDefinition, this.frame, this.x, this.y, false);
                    continue;
                }
                this.isFinished = true;
                break;
            }
        }
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    @Export(value="getModel")
    protected final Model getModel() {
        SpotAnimationDefinition spotAnimationDefinition = ObjectComposition.SpotAnimationDefinition_get(this.id);
        Model model = !this.isFinished ? spotAnimationDefinition.getModel(this.frame) : spotAnimationDefinition.getModel(-1);
        if (model == null) {
            return null;
        }
        return model;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/applet/Applet;Ljava/lang/String;B)V", garbageValue="13")
    public static void method2356(Applet applet, String string) {
        class31.field138 = applet;
        if (string != null) {
            class31.field137 = string;
        }
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)V", garbageValue="2082786972")
    static void method2357(int n, String string) {
        Login.Login_loadingText = string;
        Login.Login_loadingPercent = n;
    }

    @ObfuscatedName(value="hh")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-846140912")
    static final void method2358(int n, int n2) {
        int n3;
        int n4;
        if (n >= 128) {
            if (n > 383) {
                n = 383;
            }
        } else {
            n = 128;
        }
        if (class159.cameraPitch >= n) {
            if (class159.cameraPitch > n && (class159.cameraPitch -= (class159.cameraPitch - n) * class505.field5142 / 1000 + class383.field4491) < n) {
                class159.cameraPitch = n;
            }
        } else if ((class159.cameraPitch = (n - class159.cameraPitch) * class505.field5142 / 1000 + class159.cameraPitch + class383.field4491) > n) {
            class159.cameraPitch = n;
        }
        if ((n4 = (n2 &= 0x7FF) - class183.cameraYaw) <= 1024) {
            if (n4 < -1024) {
                n4 += 2048;
            }
        } else {
            n4 -= 2048;
        }
        if (n4 <= 0) {
            if (n4 < 0) {
                class183.cameraYaw -= -n4 * class505.field5142 / 1000 + class383.field4491;
                class183.cameraYaw &= 0x7FF;
            }
        } else {
            class183.cameraYaw = n4 * class505.field5142 / 1000 + class183.cameraYaw + class383.field4491;
            class183.cameraYaw &= 0x7FF;
        }
        if ((n3 = n2 - class183.cameraYaw) <= 1024) {
            if (n3 < -1024) {
                n3 += 2048;
            }
        } else {
            n3 -= 2048;
        }
        if (n3 < 0 && n4 > 0 || n3 > 0 && n4 < 0) {
            class183.cameraYaw = n2;
        }
    }

    public GraphicsObject() {
    }
}

