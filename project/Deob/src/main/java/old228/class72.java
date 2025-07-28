package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ck")
public class class72 {
    @ObfuscatedName(value="an")
    static int[] field852 = new int[5];
    @ObfuscatedName(value="ae")
    static int[][] field853 = new int[5][5000];
    @ObfuscatedName(value="ax")
    static int[] field865 = new int[1000];
    @ObfuscatedName(value="ac")
    static String[] field855 = new String[1000];
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=702679413)
    static int field851 = 0;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="[Lcf;")
    static class63[] field858 = new class63[50];
    @ObfuscatedName(value="aw")
    static Calendar field859 = Calendar.getInstance();
    @ObfuscatedName(value="ai")
    static final String[] field860 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
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
    static void method2153(int n, String string, String string2) {
        class81.method2488(n, string, string2, null);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-171463991")
    static void method2269() {
        Iterator iterator = class115.field1443.iterator();
        while (iterator.hasNext()) {
            class64 class642 = (class64)iterator.next();
            class642.method1240();
        }
        return;
    }
}

