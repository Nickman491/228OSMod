/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pn")
@Implements(value="DualNodeDeque")
public final class DualNodeDeque {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltm;")
    @Export(value="sentinel")
    DualNode sentinel;

    public DualNodeDeque() {
        this.sentinel.previousDual = this.sentinel = new DualNode();
        this.sentinel.nextDual = this.sentinel;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ltm;)V")
    public void method7987(DualNode dualNode) {
        if (dualNode.nextDual != null) {
            dualNode.removeDual();
        }
        dualNode.nextDual = this.sentinel.nextDual;
        dualNode.previousDual = this.sentinel;
        dualNode.nextDual.previousDual = dualNode;
        dualNode.previousDual.nextDual = dualNode;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ltm;)V")
    public void method7990(DualNode dualNode) {
        if (dualNode.nextDual != null) {
            dualNode.removeDual();
        }
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual.previousDual = dualNode;
        dualNode.previousDual.nextDual = dualNode;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="()Ltm;")
    @Export(value="removeLast")
    public DualNode removeLast() {
        DualNode dualNode = this.sentinel.previousDual;
        if (dualNode != this.sentinel) {
            return dualNode;
        }
        return null;
    }
}

