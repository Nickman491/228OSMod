/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fp")
public abstract class class150
extends Node {
    class150() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    abstract void vmethod3879(Buffer var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    abstract void vmethod3882(ClanSettings var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ldf;III)V", garbageValue="-2022231235")
    @Export(value="runScript")
    static void runScript(ScriptEvent scriptEvent, int n, int n2) {
        Script script;
        Object[] objectArray = scriptEvent.args;
        if (!InvDefinition.isWorldMapEvent(scriptEvent.type)) {
            int n3 = (Integer)objectArray[0];
            script = GameEngine.getScript(n3);
        } else {
            UserComparator5.worldMapEvent = (WorldMapEvent)objectArray[0];
            WorldMapElement worldMapElement = class31.WorldMapElement_get(UserComparator5.worldMapEvent.mapElement);
            script = class544.getWorldMapScript(scriptEvent.type, worldMapElement.objectId, worldMapElement.category);
        }
        if (script != null) {
            class427.method8367(scriptEvent, script, n, n2);
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2034697086")
    public static void method3592() {
        try {
            JagexCache.JagexCache_dat2File.close();
            for (int i = 0; i < class438.idxCount; ++i) {
                UserComparator4.JagexCache_idxFiles[i].close();
            }
            JagexCache.JagexCache_idx255File.close();
            JagexCache.JagexCache_randomDat.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue="1")
    @Export(value="setLoginResponseString")
    static void setLoginResponseString(String string, String string2, String string3) {
        Login.Login_response1 = string;
        Login.Login_response2 = string2;
        Login.Login_response3 = string3;
    }

    @ObfuscatedName(value="mx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1872432444")
    static void method3598() {
        InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.first();
        while (true) {
            block6: {
                if (interfaceParent == null) {
                    return;
                }
                int n = interfaceParent.group;
                if (!ClanChannel.field1807.method7024(n)) break block6;
                boolean bl = true;
                Widget[] widgetArray = ClanChannel.field1807.field3772[n];
                int n2 = 0;
                while (true) {
                    block8: {
                        Widget widget;
                        block7: {
                            if (n2 >= widgetArray.length) break block7;
                            if (widgetArray[n2] == null) break block8;
                            bl = widgetArray[n2].isIf3;
                        }
                        if (bl || (widget = ClanChannel.field1807.method7031(n2 = (int)interfaceParent.key)) == null) break;
                        UserComparator8.invalidateWidget(widget);
                        break;
                    }
                    ++n2;
                }
            }
            interfaceParent = (InterfaceParent)Client.interfaceParents.next();
        }
    }
}

