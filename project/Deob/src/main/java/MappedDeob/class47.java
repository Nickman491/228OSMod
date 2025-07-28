/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bo")
public class class47 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lcc;")
    VorbisSample field304;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lbc;")
    RawSound field306;
    @ObfuscatedName(value="az")
    ReentrantLock field305;

    @ObfuscatedSignature(descriptor="(Lcc;Lbc;)V")
    class47(VorbisSample vorbisSample, RawSound rawSound) {
        this.field304 = vorbisSample;
        this.field306 = rawSound;
        this.field305 = new ReentrantLock();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lue;ILjava/lang/String;I)Ljava/lang/String;", garbageValue="744078519")
    static String method906(IterableNodeHashTable iterableNodeHashTable, int n, String string) {
        if (iterableNodeHashTable == null) {
            return string;
        }
        ObjectNode objectNode = (ObjectNode)iterableNodeHashTable.get(n);
        if (objectNode == null) {
            return string;
        }
        return (String)objectNode.obj;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(III)Lct;", garbageValue="-799303863")
    @Export(value="Messages_getByChannelAndID")
    static Message Messages_getByChannelAndID(int n, int n2) {
        ChatChannel chatChannel = (ChatChannel)Messages.Messages_channels.get(n);
        return chatChannel.getMessage(n2);
    }

    @ObfuscatedName(value="ow")
    @ObfuscatedSignature(descriptor="(Lna;I)Ljava/lang/String;", garbageValue="972230593")
    @Export(value="Widget_getSpellActionName")
    static String Widget_getSpellActionName(Widget widget) {
        if (class298.Widget_unpackTargetMask(class232.getWidgetFlags(widget)) == 0) {
            return null;
        }
        if (widget.spellActionName != null && widget.spellActionName.trim().length() != 0) {
            return widget.spellActionName;
        }
        return null;
    }
}

