/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ms")
public final class class329 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=-4022445036769029259L)
    static long field3607;

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Lcx;", garbageValue="461656985")
    @Export(value="getNextWorldListWorld")
    static World getNextWorldListWorld() {
        if (World.World_listCount < World.World_count) {
            return World.World_worlds[++World.World_listCount - 1];
        }
        return null;
    }

    @ObfuscatedName(value="ii")
    @ObfuscatedSignature(descriptor="(Lda;I)V", garbageValue="171579587")
    static final void method6646(Actor actor) {
        boolean bl;
        boolean bl2 = actor.field1199 != Client.cycle && actor.field1240 != -1 && actor.field1271 == 0 ? false : (bl = true);
        if (!bl) {
            SequenceDefinition sequenceDefinition = class33.SequenceDefinition_get(actor.field1240);
            bl = sequenceDefinition != null && !sequenceDefinition.isCachedModelIdSet() ? actor.field1242 + 1 > sequenceDefinition.frameLengths[actor.field1241] : true;
        }
        if (bl) {
            int n = actor.field1199 - actor.field1263;
            int n2 = Client.cycle - actor.field1263;
            int n3 = actor.field1268 * 936633408 + actor.field1247 * 128;
            int n4 = actor.field1249 * 128 + actor.field1268 * 936633408;
            int n5 = actor.field1268 * 936633408 + actor.field1248 * 128;
            int n6 = actor.field1250 * 128 + actor.field1268 * 936633408;
            actor.x = (n5 * n2 + n3 * (n - n2)) / n;
            actor.field1196 = (n2 * n6 + n4 * (n - n2)) / n;
        }
        actor.field1269 = 0;
        actor.field1197 = actor.field1262 = actor.field1253;
    }
}

