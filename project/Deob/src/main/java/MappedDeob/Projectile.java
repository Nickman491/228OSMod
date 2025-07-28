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
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dn")
@Implements(value="Projectile")
public final class Projectile
extends Renderable {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=739120569)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1349592311)
    @Export(value="plane")
    int plane;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-865782673)
    @Export(value="sourceX")
    int sourceX;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-141392581)
    @Export(value="sourceY")
    int sourceY;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1900685121)
    @Export(value="sourceZ")
    int sourceZ;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-587423577)
    @Export(value="endHeight")
    int endHeight;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1673977269)
    int field985;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1065381413)
    int field967;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-706453793)
    int field964;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1633593095)
    @Export(value="cycleStart")
    int cycleStart;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1931084429)
    @Export(value="cycleEnd")
    int cycleEnd;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1958929093)
    @Export(value="slope")
    int slope;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1795420119)
    @Export(value="startHeight")
    int startHeight;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1310000737)
    int field975;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-278059355)
    @Export(value="targetIndex")
    int targetIndex;
    @ObfuscatedName(value="ak")
    @Export(value="isMoving")
    boolean isMoving = false;
    @ObfuscatedName(value="al")
    @Export(value="x")
    double x;
    @ObfuscatedName(value="av")
    @Export(value="y")
    double y;
    @ObfuscatedName(value="ag")
    @Export(value="z")
    double z;
    @ObfuscatedName(value="aw")
    double field981;
    @ObfuscatedName(value="ai")
    double field973;
    @ObfuscatedName(value="ar")
    double field983;
    @ObfuscatedName(value="am")
    @Export(value="speedZ")
    double speedZ;
    @ObfuscatedName(value="ap")
    double field970;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1609779233)
    @Export(value="yaw")
    int yaw;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1117073495)
    @Export(value="pitch")
    int pitch;
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="Lkb;")
    @Export(value="sequenceDefinition")
    SequenceDefinition sequenceDefinition;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-1645215705)
    @Export(value="frame")
    int frame = 0;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=-1043117971)
    @Export(value="frameCycle")
    int frameCycle = 0;

    Projectile(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.id = n;
        this.plane = n2;
        this.sourceX = n3;
        this.sourceY = n4;
        this.sourceZ = n5;
        this.cycleStart = n6;
        this.cycleEnd = n7;
        this.slope = n8;
        this.startHeight = n9;
        this.targetIndex = n10;
        this.endHeight = n11;
        this.isMoving = false;
        int n12 = ObjectComposition.SpotAnimationDefinition_get((int)this.id).sequence;
        this.sequenceDefinition = n12 != -1 ? class33.SequenceDefinition_get(n12) : null;
    }

    Projectile(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        this(n, n2, n3, n4, n5, n6, n7, n8, n9, n11, n12);
        this.field975 = n10;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="36")
    @Export(value="setDestination")
    final void setDestination(int n, int n2, int n3, int n4) {
        double d;
        this.field985 = n;
        this.field967 = n2;
        this.field964 = n3;
        if (!this.isMoving) {
            d = this.field985 - this.sourceX;
            double d2 = this.field967 - this.sourceY;
            double d3 = Math.sqrt(d * d + d2 * d2);
            this.x = (double)this.sourceX + (double)this.startHeight * d / d3;
            this.y = (double)this.sourceY + d2 * (double)this.startHeight / d3;
            this.z = this.sourceZ;
        }
        d = this.cycleEnd + 1 - n4;
        this.field981 = ((double)this.field985 - this.x) / d;
        this.field973 = ((double)this.field967 - this.y) / d;
        this.field983 = Math.sqrt(this.field973 * this.field973 + this.field981 * this.field981);
        if (!this.isMoving) {
            this.speedZ = -this.field983 * Math.tan(0.02454369 * (double)this.slope);
        }
        this.field970 = 2.0 * ((double)this.field964 - this.z - this.speedZ * d) / (d * d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1469246305")
    @Export(value="advance")
    final void advance(int n) {
        this.isMoving = true;
        this.x += this.field981 * (double)n;
        this.y += (double)n * this.field973;
        this.z += this.speedZ * (double)n + (double)n * (0.5 * this.field970) * (double)n;
        this.speedZ += (double)n * this.field970;
        this.yaw = (int)(Math.atan2(this.field981, this.field973) * 325.949) + 1024 & 0x7FF;
        this.pitch = (int)(Math.atan2(this.speedZ, this.field983) * 325.949) & 0x7FF;
        if (this.sequenceDefinition == null) return;
        if (this.sequenceDefinition.isCachedModelIdSet()) {
            this.frame += n;
            int n2 = this.sequenceDefinition.method5703();
            if (this.frame < n2) return;
            this.frame = n2 - this.sequenceDefinition.frameCount;
            return;
        }
        this.frameCycle += n;
        while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
            this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
            ++this.frame;
            if (this.frame < this.sequenceDefinition.frameIds.length) continue;
            this.frame -= this.sequenceDefinition.frameCount;
            if (this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length) continue;
            this.frame = 0;
        }
        return;
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    @Export(value="getModel")
    protected final Model getModel() {
        SpotAnimationDefinition spotAnimationDefinition = ObjectComposition.SpotAnimationDefinition_get(this.id);
        Model model = spotAnimationDefinition.getModel(this.frame);
        if (model == null) {
            return null;
        }
        model.rotateZ(this.pitch);
        return model;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="474346292")
    @Export(value="savePreferences")
    static void savePreferences() {
        AccessFile accessFile = null;
        try {
            accessFile = class31.getPreferencesFile("", StructComposition.field2749.name, true);
            Buffer buffer = class544.clientPreferences.toBuffer();
            accessFile.write(buffer.array, 0, buffer.offset);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            if (accessFile != null) {
                accessFile.closeSync(true);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IIIZIII)J", garbageValue="959258606")
    public static long method2452(int n, int n2, int n3, boolean bl, int n4, int n5) {
        long l = (long)((n & 0x7F) << 0 | (n2 & 0x7F) << 7 | (n3 & 3) << 14) | ((long)n4 & 0xFFFFFFFFL) << 17 | ((long)n5 & 0x7FFL) << 49;
        if (bl) {
            l |= 0x10000L;
        }
        return l;
    }

    @ObfuscatedName(value="jb")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-15")
    static final void method2454(boolean bl) {
        class113.method3178();
        ++Client.packetWriter.pendingWrites;
        if (Client.packetWriter.pendingWrites < 50 && !bl) {
            return;
        }
        Client.packetWriter.pendingWrites = 0;
        if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3382, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(packetBufferNode);
            try {
                Client.packetWriter.flush();
            }
            catch (IOException iOException) {
                Client.hadNetworkError = true;
            }
        }
    }
}

