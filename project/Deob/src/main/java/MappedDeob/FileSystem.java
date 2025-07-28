/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="id")
@Implements(value="FileSystem")
public class FileSystem {
    @ObfuscatedName(value="ay")
    @Export(value="FileSystem_hasPermissions")
    static boolean FileSystem_hasPermissions = false;
    @ObfuscatedName(value="ah")
    @Export(value="FileSystem_cacheDir")
    static File FileSystem_cacheDir;
    @ObfuscatedName(value="az")
    @Export(value="FileSystem_cacheFiles")
    static Hashtable FileSystem_cacheFiles;

    static {
        FileSystem_cacheFiles = new Hashtable(16);
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="74")
    static int method4954(int n, Script script, boolean bl) {
        if (n != 6809) {
            return 2;
        }
        int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        ObjectComposition objectComposition = class142.getObjectDefinition(n2);
        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = objectComposition != null ? objectComposition.name : "";
        return 1;
    }
}

