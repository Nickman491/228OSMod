package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dm")
public class class81
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field1009 = new class315(128);
    @ObfuscatedName(value="dl")
    @ObfuscatedSignature(descriptor="[Lvi;")
    static class569[] field999;
    @ObfuscatedName(value="ah")
    String field1004;
    @ObfuscatedName(value="az")
    int[] field1001;
    @ObfuscatedName(value="ao")
    int[] field1002;
    @ObfuscatedName(value="ad")
    String[] field1003;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1831460751)
    int field1005;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-970822451)
    int field1000;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=386041121)
    int field1006;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-914529041)
    int field1007;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="[Lue;")
    class529[] field1008;

    class81() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)[Lue;", garbageValue="-1004050298")
    class529[] method2477(int n) {
        return new class529[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="310846203")
    static void method2488(int n, String string, String string2, String string3) {
        class83 class832 = (class83)class115.field1439.get(n);
        if (class832 == null) {
            class832 = new class83();
            class115.field1439.put(n, class832);
        }
        class64 class642 = class832.method2506(n, string, string2, string3);
        class115.field1443.method9970(class642, class642.field452);
        class115.field1440.method8134(class642);
        client.field696 = client.field549;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/Date;", garbageValue="-1522771239")
    static Date method2490() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(1, 1900);
        return calendar.getTime();
    }

    @ObfuscatedName(value="hd")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1144422908")
    static final void PlayerSettings(String string) {
        int n;
        Object object;
        if (string.equalsIgnoreCase("toggleroof")) {
            class544.field5403.method2921(!class544.field5403.method2890());
            if (class544.field5403.method2890()) {
                class72.method2153(99, "", "Roofs are now all hidden");
            } else {
                class72.method2153(99, "", "Roofs will only be removed selectively");
            }
        }
        if (string.startsWith("zbuf")) {
            boolean bl = class278.method5972(string.substring(5).trim()) == 1;
            client.field521.method541(bl);
            class182.method4017(bl);
        }
        if (string.equalsIgnoreCase("z")) {
            boolean bl = client.field532 = !client.field532;
        }
        if (string.equalsIgnoreCase("displayfps")) {
            class544.field5403.method2889();
        }
        if (string.equalsIgnoreCase("renderself")) {
            boolean bl = client.field633 = !client.field633;
        }
        if (string.equalsIgnoreCase("mouseovertext")) {
            boolean bl = client.field598 = !client.field598;
        }
        if (string.startsWith("setdrawdistance")) {
            object = string.split(" ");
            try {
                n = Integer.parseInt(object[1]);
                class544.field5403.method2911(n);
            }
            catch (NumberFormatException numberFormatException) {
                class72.method2153(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", object[1]));
            }
        }
        if (string.startsWith("settilerendermode")) {
            object = string.split(" ");
            try {
                n = Integer.parseInt(object[1]);
                class34.field189.field1319.method4212(class175.method3888()[n]);
            }
            catch (NumberFormatException numberFormatException) {
                class72.method2153(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", object[1]));
            }
        }
        if (string.equalsIgnoreCase("getdrawdistance")) {
            class72.method2153(99, "", String.format("%d", class544.field5403.method2902()));
        }
        if (client.field671 >= 2) {
            if (string.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (string.equalsIgnoreCase("showcoord")) {
                boolean bl = class420.field4722.field5302 = !class420.field4722.field5302;
            }
            if (string.equalsIgnoreCase("fpson")) {
                class544.field5403.method2899(true);
            }
            if (string.equalsIgnoreCase("fpsoff")) {
                class544.field5403.method2899(false);
            }
            if (string.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (string.equalsIgnoreCase("clientdrop")) {
                class76.method2363();
            }
            if (string.equalsIgnoreCase("clientreload")) {
                class205.method4808();
            }
        }
        object = class90.method2629(class322.field3344, client.field564.field1446);
        object.field3442.method10300(string.length() + 1);
        object.field3442.method10442(string);
        client.field564.method3257((class324)object);
    }
}

