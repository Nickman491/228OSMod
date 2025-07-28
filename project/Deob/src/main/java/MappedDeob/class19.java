/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="aw")
public class class19
implements Callable {
    @ObfuscatedName(value="ml")
    @ObfuscatedSignature(descriptor="Lhy;")
    static TextureProvider field82;
    @ObfuscatedName(value="qz")
    @ObfuscatedSignature(descriptor="Les;")
    @Export(value="varcs")
    static Varcs varcs;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lau;")
    final class10 field83;
    @ObfuscatedSignature(descriptor="Laa;")
    final /* synthetic */ class14 this$0;

    @ObfuscatedSignature(descriptor="(Laa;Lau;)V")
    class19(class14 class1410, class10 class102) {
        this.this$0 = class1410;
        this.field83 = class102;
    }

    public Object call() throws Exception {
        try {
            while (this.field83.method90()) {
                class174.method3881(10L);
            }
        }
        catch (IOException iOException) {
            return new class20("Error servicing REST query: " + iOException.getMessage());
        }
        return this.field83.method91();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Lmb;", garbageValue="1134121866")
    static PacketBufferNode method288() {
        if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
            return new PacketBufferNode();
        }
        return PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="32")
    static int method285(int n, Script script, boolean bl) {
        Widget widget;
        int n2 = -1;
        if (n < 2000) {
            widget = bl ? class134.scriptDotWidget : class9.field45;
        } else {
            n -= 1000;
            n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            widget = ClanChannel.field1807.method7031(n2);
        }
        if (n != ScriptOpcodes.CC_SETPOSITION) {
            if (n != ScriptOpcodes.CC_SETSIZE) {
                boolean bl2;
                if (n != ScriptOpcodes.CC_SETHIDE) {
                    if (n != ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
                        if (n != ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
                            return 2;
                        }
                        widget.noScrollThrough = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                        return 1;
                    }
                    widget.noClickThrough = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                    return 1;
                }
                boolean bl3 = bl2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                if (bl2 != widget.isHidden) {
                    widget.isHidden = bl2;
                    UserComparator8.invalidateWidget(widget);
                }
                return 1;
            }
            widget.rawWidth = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 4];
            widget.rawHeight = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
            widget.widthAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
            widget.heightAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
            UserComparator8.invalidateWidget(widget);
            Client.client.alignWidget(widget);
            if (n2 != -1 && widget.type == 0) {
                class244.revalidateWidgetScroll(ClanChannel.field1807.field3772[n2 >> 16], widget, false);
            }
            return 1;
        }
        widget.rawX = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 4];
        widget.rawY = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
        widget.xAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
        widget.yAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
        UserComparator8.invalidateWidget(widget);
        Client.client.alignWidget(widget);
        if (n2 != -1 && widget.type == 0) {
            class244.revalidateWidgetScroll(ClanChannel.field1807.field3772[n2 >> 16], widget, false);
        }
        return 1;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="116531498")
    static final void method287() {
        String string = "Your ignore list is full. Max of 100 for free users, and 400 for members";
        Interpreter.addGameMessage(30, "", string);
    }
}

