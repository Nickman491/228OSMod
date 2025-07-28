/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  np
 */
import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@np
@ObfuscatedName(value="qg")
public final class class419 {
    static {
        Pattern.compile("^\\D*(\\d+)\\D*$");
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)I", garbageValue="1866255552")
    public static int method8220(CharSequence charSequence) {
        int n = charSequence.length();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 = (n2 << 5) - n2 + charSequence.charAt(i);
        }
        return n2;
    }

    @ObfuscatedName(value="mv")
    @ObfuscatedSignature(descriptor="(Lna;I)V", garbageValue="-1747181726")
    static final void method8221(Widget widget) {
        block18: {
            String string;
            if (widget.buttonType == 1) {
                TaskHandler.method4908(widget.field4007, "", 24, 0, 0, widget.id, widget.itemId);
            }
            if (widget.buttonType == 2 && !Client.isSpellSelected && (string = class47.Widget_getSpellActionName(widget)) != null) {
                TaskHandler.method4908(string, class97.colorStartTag(65280) + widget.field4006, 25, 0, -1, widget.id, widget.itemId);
            }
            if (widget.buttonType == 3) {
                class6.method44("Close", "", 26, 0, 0, widget.id);
            }
            if (widget.buttonType == 4) {
                class6.method44(widget.field4007, "", 28, 0, 0, widget.id);
            }
            if (widget.buttonType == 5) {
                class6.method44(widget.field4007, "", 29, 0, 0, widget.id);
            }
            if (widget.buttonType == 6 && Client.meslayerContinueWidget == null) {
                class6.method44(widget.field4007, "", 30, 0, -1, widget.id);
            }
            if (widget.isIf3) {
                if (!Client.isSpellSelected) {
                    int n = 9;
                    while (true) {
                        String string2;
                        if (n < 0) {
                            if (class248.method5351(class232.getWidgetFlags(widget))) {
                                class6.method44("Continue", "", 30, 0, widget.childIndex, widget.id);
                            }
                            break block18;
                        }
                        if (n == widget.field3958 * 1920625471 && (string2 = class47.Widget_getSpellActionName(widget)) != null) {
                            TaskHandler.method4908(string2, widget.dataText, 25, 0, widget.childIndex, widget.id, widget.itemId);
                        }
                        string2 = !class250.method5357(class232.getWidgetFlags(widget), n) && widget.onOp == null ? null : (widget.actions != null && widget.actions.length > n && widget.actions[n] != null && widget.actions[n].trim().length() != 0 ? widget.actions[n] : null);
                        String string3 = string2;
                        if (string3 != null) {
                            int n2;
                            int n3;
                            if (n <= widget.field3958 * 1920625471) {
                                n3 = 57;
                                n2 = class231.method5128(string3, widget.dataText, n3, n + 1, widget.childIndex, widget.id, widget.itemId, widget.prioritizeMenuEntry, -1);
                            } else {
                                n3 = 1007;
                                n2 = TaskHandler.method4908(string3, widget.dataText, n3, n + 1, widget.childIndex, widget.id, widget.itemId);
                            }
                            if (widget.field3957 != null && n < widget.field3957.length && widget.field3957[n] != null) {
                                String[] stringArray = widget.field3957[n];
                                for (int i = stringArray.length - 1; i >= 0; --i) {
                                    int n4 = i + 1 << 16 | n + 1;
                                    if (stringArray[i] == null || stringArray[i].isEmpty()) continue;
                                    FontName.method9934(n2, stringArray[i], "", n3, n4, widget.childIndex, widget.id, widget.itemId, -1);
                                }
                            }
                        }
                        --n;
                    }
                }
                if (class141.method3509(class232.getWidgetFlags(widget)) && (class106.field1365 & 0x20) == 32) {
                    TaskHandler.method4908(Client.field661, Client.field662 + " " + "->" + " " + widget.dataText, 58, 0, widget.childIndex, widget.id, widget.itemId);
                }
            }
        }
    }
}

