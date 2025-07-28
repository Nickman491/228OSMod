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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cx")
@Implements(value="World")
public class World {
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="[Lcx;")
    @Export(value="World_worlds")
    static World[] World_worlds;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-661025249)
    @Export(value="World_count")
    static int World_count;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=972925949)
    @Export(value="World_listCount")
    static int World_listCount;
    @ObfuscatedName(value="ax")
    @Export(value="World_sortOption2")
    static int[] World_sortOption2;
    @ObfuscatedName(value="at")
    @Export(value="World_sortOption1")
    static int[] World_sortOption1;
    @ObfuscatedName(value="fz")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field815;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-32054383)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=950082965)
    @Export(value="properties")
    int properties;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-785393975)
    @Export(value="population")
    int population;
    @ObfuscatedName(value="af")
    @Export(value="host")
    String host;
    @ObfuscatedName(value="aa")
    @Export(value="activity")
    String activity;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-419021337)
    @Export(value="location")
    int location;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-384975721)
    @Export(value="index")
    int index;
    @ObfuscatedName(value="av")
    String field819;

    static {
        World_count = 0;
        World_listCount = 0;
        World_sortOption2 = new int[]{1, 1, 1, 1};
        World_sortOption1 = new int[]{0, 1, 2, 3};
    }

    World() {
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-646232155")
    @Export(value="isMembersOnly")
    boolean isMembersOnly() {
        return (class552.field5434.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1734303995")
    @Export(value="isDeadman")
    boolean isDeadman() {
        return (class552.field5442.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="848046499")
    boolean method1965() {
        return (class552.field5426.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-726478743")
    @Export(value="isPvp")
    boolean isPvp() {
        return (class552.field5428.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-76")
    boolean method1977() {
        return (class552.field5445.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="1")
    boolean method1963() {
        return (class552.field5431.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1219185298")
    @Export(value="isBeta")
    boolean isBeta() {
        return (class552.field5451.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="224954319")
    boolean method2016() {
        return (class552.field5456.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-670579797")
    boolean method1966() {
        return (class552.field5441.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="34")
    boolean method1984() {
        return (class552.field5447.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-729625320")
    static void method1957() {
        ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last();
        while (true) {
            if (objectSound == null) {
                ObjectSound.objectSounds.clear();
                return;
            }
            if (objectSound.stream1 != null) {
                UserList.pcmStreamMixer.removeSubStream(objectSound.stream1);
                objectSound.stream1 = null;
            }
            if (objectSound.stream2 != null) {
                UserList.pcmStreamMixer.removeSubStream(objectSound.stream2);
                objectSound.stream2 = null;
            }
            objectSound = (ObjectSound)ObjectSound.objectSounds.previous();
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1610335580")
    public static void method1994() {
        EnumComposition.EnumDefinition_cached.clear();
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="712989272")
    public static void method1960() {
        WorldMapElement.HitSplatDefinition_cached.clear();
    }
}

