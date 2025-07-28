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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ck")
@Implements(value="Interpreter")
public class Interpreter {
    @ObfuscatedName(value="an")
    @Export(value="Interpreter_arrayLengths")
    static int[] Interpreter_arrayLengths = new int[5];
    @ObfuscatedName(value="ae")
    @Export(value="Interpreter_arrays")
    static int[][] Interpreter_arrays = new int[5][5000];
    @ObfuscatedName(value="ax")
    @Export(value="Interpreter_intStack")
    static int[] Interpreter_intStack = new int[1000];
    @ObfuscatedName(value="ac")
    @Export(value="Interpreter_stringStack")
    static String[] Interpreter_stringStack = new String[1000];
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=702679413)
    @Export(value="Interpreter_frameDepth")
    static int Interpreter_frameDepth = 0;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="[Lcf;")
    @Export(value="Interpreter_frames")
    static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];
    @ObfuscatedName(value="aw")
    @Export(value="Interpreter_calendar")
    static Calendar Interpreter_calendar = Calendar.getInstance();
    @ObfuscatedName(value="ai")
    @Export(value="Interpreter_MONTHS")
    static final String[] Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    @ObfuscatedName(value="am")
    static boolean field850 = false;
    @ObfuscatedName(value="ap")
    static boolean field862 = false;
    @ObfuscatedName(value="ab")
    static ArrayList field863 = new ArrayList();
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1673138457)
    static int field864 = 0;
    @ObfuscatedName(value="bb")
    static final double field854 = Math.log(2.0);
    @ObfuscatedName(value="or")
    @ObfuscatedGetter(intValue=1192369403)
    static int field866;

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;I)V", garbageValue="-1931393022")
    @Export(value="addGameMessage")
    static void addGameMessage(int n, String string, String string2) {
        Script.addChatMessage(n, string, string2, null);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-171463991")
    static void method2269() {
        Iterator iterator = Messages.Messages_hashTable.iterator();
        while (iterator.hasNext()) {
            Message message = (Message)iterator.next();
            message.clearIsFromFriend();
        }
        return;
    }
}

