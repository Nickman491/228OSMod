/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ji")
public class class255 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lji;")
    static final class255 field2727 = new class255(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lji;")
    static final class255 field2725 = new class255(1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lji;")
    static final class255 field2721 = new class255(2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lji;")
    static final class255 field2722 = new class255(3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lji;")
    static final class255 field2723 = new class255(4);
    @ObfuscatedName(value="hg")
    static String field2724;

    @ObfuscatedSignature(descriptor="(I)V", garbageValue="0")
    class255(int n) {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/Throwable;I)V", garbageValue="1979524081")
    @Export(value="RunException_sendStackTrace")
    public static void RunException_sendStackTrace(String string, Throwable throwable) {
        if (throwable != null) {
            throwable.printStackTrace();
            return;
        }
        try {
            Object object;
            Object object2;
            String string2 = "";
            if (throwable != null) {
                String string3;
                String string4;
                Object object3;
                object2 = throwable;
                if (object2 instanceof RunException) {
                    object3 = (RunException)object2;
                    string4 = ((RunException)object3).message + " | ";
                    object2 = ((RunException)object3).throwable;
                } else {
                    string4 = "";
                }
                object3 = new StringWriter();
                PrintWriter printWriter = new PrintWriter((Writer)object3);
                ((Throwable)object2).printStackTrace(printWriter);
                printWriter.close();
                String string5 = ((StringWriter)object3).toString();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(string5));
                String string6 = bufferedReader.readLine();
                while ((string3 = bufferedReader.readLine()) != null) {
                    int n = string3.indexOf(40);
                    int n2 = string3.indexOf(41, n + 1);
                    if (n >= 0 && n2 >= 0) {
                        String string7 = string3.substring(n + 1, n2);
                        int n3 = string7.indexOf(".java:");
                        if (n3 >= 0) {
                            string7 = string7.substring(0, n3) + string7.substring(n3 + 5);
                            string4 = string4 + string7 + ' ';
                            continue;
                        }
                        string3 = string3.substring(0, n);
                    }
                    string3 = string3.trim();
                    string3 = string3.substring(string3.lastIndexOf(32) + 1);
                    string3 = string3.substring(string3.lastIndexOf(9) + 1);
                    string4 = string4 + string3 + ' ';
                }
                string4 = string4 + "| " + string6;
                object = string4;
                string2 = object;
            }
            if (string != null) {
                if (throwable != null) {
                    string2 = string2 + " | ";
                }
                string2 = string2 + string;
            }
            System.out.println("Error: " + string2);
            string2 = string2.replace(':', '.');
            string2 = string2.replace('@', '_');
            string2 = string2.replace('&', '_');
            string2 = string2.replace('#', '_');
            if (RunException.RunException_applet == null) {
                return;
            }
            object = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + class484.field5050 + "&u=" + class484.field5049 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class226.field2468 + "&e=" + string2);
            object2 = new DataInputStream(((URL)object).openStream());
            ((FilterInputStream)object2).read();
            ((FilterInputStream)object2).close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

