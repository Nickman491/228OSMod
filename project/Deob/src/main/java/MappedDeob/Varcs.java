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
import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="es")
@Implements(value="Varcs")
public class Varcs {
    @ObfuscatedName(value="az")
    @Export(value="intsPersistence")
    boolean[] intsPersistence;
    @ObfuscatedName(value="ao")
    @Export(value="map")
    Map map;
    @ObfuscatedName(value="ad")
    @Export(value="unwrittenChanges")
    boolean unwrittenChanges = false;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(longValue=6896705008618298895L)
    long field1437;

    Varcs() {
        int n = class268.archive2.getGroupFileCount(19);
        this.map = new HashMap();
        this.intsPersistence = new boolean[n];
        int n2 = 0;
        while (true) {
            VarcInt varcInt;
            if (n2 >= n) {
                this.read();
                return;
            }
            VarcInt varcInt2 = (VarcInt)VarcInt.VarcInt_cached.get(n2);
            if (varcInt2 == null) {
                byte[] byArray = VarcInt.VarcInt_archive.takeFile(19, n2);
                varcInt2 = new VarcInt();
                if (byArray != null) {
                    varcInt2.method5201(new Buffer(byArray));
                }
                VarcInt.VarcInt_cached.put(varcInt2, n2);
                varcInt = varcInt2;
            } else {
                varcInt = varcInt2;
            }
            varcInt2 = varcInt;
            this.intsPersistence[n2] = varcInt2.persist;
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="0")
    @Export(value="setInt")
    void setInt(int n, int n2) {
        this.map.put(n, n2);
        if (this.intsPersistence[n]) {
            this.unwrittenChanges = true;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="115")
    @Export(value="getInt")
    int getInt(int n) {
        Object v = this.map.get(n);
        if (!(v instanceof Integer)) {
            return -1;
        }
        return (Integer)v;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)V", garbageValue="1055164733")
    @Export(value="setStringOld")
    void setStringOld(int n, String string) {
        this.map.put(n, string);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="-260194423")
    @Export(value="getStringOld")
    String getStringOld(int n) {
        Object v = this.map.get(n);
        if (!(v instanceof String)) {
            return "";
        }
        return (String)v;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-811823227")
    @Export(value="clearTransient")
    void clearTransient() {
        int n = 0;
        while (n < this.intsPersistence.length) {
            if (!this.intsPersistence[n]) {
                this.map.remove(n);
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ZI)Luv;", garbageValue="568662494")
    @Export(value="getPreferencesFile")
    AccessFile getPreferencesFile(boolean bl) {
        return class31.getPreferencesFile("2", StructComposition.field2749.name, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1683180538")
    @Export(value="write")
    void write() {
        AccessFile accessFile = this.getPreferencesFile(true);
        try {
            int n = 3;
            int n2 = 0;
            for (Map.Entry entry : this.map.entrySet()) {
                int n3 = (Integer)entry.getKey();
                if (!this.intsPersistence[n3]) continue;
                Object v = entry.getValue();
                n += 3;
                if (v instanceof Integer) {
                    n += 4;
                } else if (v instanceof String) {
                    n += MouseRecorder.stringCp1252NullTerminatedByteSize((String)v);
                }
                ++n2;
            }
            Buffer buffer = new Buffer(n);
            buffer.writeByte(2);
            buffer.writeShort(n2);
            for (Map.Entry entry : this.map.entrySet()) {
                int n4 = (Integer)entry.getKey();
                if (!this.intsPersistence[n4]) continue;
                buffer.writeShort(n4);
                Object v = entry.getValue();
                class544 class5442 = class544.method10119(v.getClass());
                buffer.writeByte(class5442.field5391);
                class544.method10136(v, buffer);
            }
            accessFile.write(buffer.array, 0, buffer.offset);
        }
        catch (Exception exception) {
        }
        finally {
            try {
                accessFile.close();
            }
            catch (Exception exception) {}
        }
        this.unwrittenChanges = false;
        this.field1437 = ReflectionCheck.method724();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1663080803")
    @Export(value="read")
    void read() {
        AccessFile accessFile = this.getPreferencesFile(false);
        try {
            int n;
            byte[] byArray = new byte[(int)accessFile.length()];
            for (int i = 0; i < byArray.length; i += n) {
                n = accessFile.read(byArray, i, byArray.length - i);
                if (n != -1) continue;
                throw new EOFException();
            }
            Buffer buffer = new Buffer(byArray);
            if (buffer.array.length - buffer.offset < 1) {
                return;
            }
            int n2 = buffer.readUnsignedByte();
            if (n2 < 0 || n2 > 2) {
                return;
            }
            if (n2 >= 2) {
                int n3 = buffer.readUnsignedShort();
                for (int i = 0; i < n3; ++i) {
                    int n4 = buffer.readUnsignedShort();
                    int n5 = buffer.readUnsignedByte();
                    class544 class5442 = (class544)StructComposition.findEnumerated(class544.method10125(), n5);
                    Object object = class5442.method10123(buffer);
                    if (n4 < 0 || n4 >= this.intsPersistence.length || !this.intsPersistence[n4]) continue;
                    this.map.put(n4, object);
                }
            } else {
                int n6;
                int n7;
                int n8 = buffer.readUnsignedShort();
                for (n7 = 0; n7 < n8; ++n7) {
                    n6 = buffer.readUnsignedShort();
                    int n9 = buffer.readInt();
                    if (n6 < 0 || n6 >= this.intsPersistence.length || !this.intsPersistence[n6]) continue;
                    this.map.put(n6, n9);
                }
                n7 = buffer.readUnsignedShort();
                for (n6 = 0; n6 < n7; ++n6) {
                    buffer.readUnsignedShort();
                    buffer.readStringCp1252NullTerminated();
                }
            }
        }
        catch (Exception exception) {
        }
        finally {
            try {
                accessFile.close();
            }
            catch (Exception exception) {}
        }
        this.unwrittenChanges = false;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="364521518")
    @Export(value="tryWrite")
    void tryWrite() {
        if (this.unwrittenChanges && this.field1437 < ReflectionCheck.method724() - 60000L) {
            this.write();
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="11")
    boolean method3199() {
        return this.unwrittenChanges;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-28")
    static void method3212(int n) {
        if (n == Login.loginIndex) {
            return;
        }
        Login.loginIndex = n;
    }

    @ObfuscatedName(value="km")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIIIII[Ljava/lang/String;III)V", garbageValue="-51087148")
    static void method3211(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, String[] stringArray, int n9, int n10) {
        NodeDeque nodeDeque = class1032.field1333;
        PendingSpawn pendingSpawn = null;
        PendingSpawn pendingSpawn2 = (PendingSpawn)nodeDeque.last();
        while (true) {
            block6: {
                block5: {
                    if (pendingSpawn2 == null) break block5;
                    if (pendingSpawn2.field1188 != n || n2 != pendingSpawn2.field1187 || n3 != pendingSpawn2.field1182 || n4 != pendingSpawn2.field1180) break block6;
                    pendingSpawn = pendingSpawn2;
                }
                if (pendingSpawn == null) {
                    pendingSpawn = new PendingSpawn();
                    pendingSpawn.field1188 = n;
                    pendingSpawn.field1180 = n4;
                    pendingSpawn.field1187 = n2;
                    pendingSpawn.field1182 = n3;
                    pendingSpawn.field1189 = -1;
                    ObjectComposition.method5557(class1032, pendingSpawn);
                    nodeDeque.addFirst(pendingSpawn);
                }
                pendingSpawn.field1192 = n5;
                pendingSpawn.field1194 = n6;
                pendingSpawn.field1185 = n7;
                pendingSpawn.field1183 = n9;
                pendingSpawn.field1186 = n10;
                pendingSpawn.method2754(n8);
                pendingSpawn.method2757(stringArray);
                return;
            }
            pendingSpawn2 = (PendingSpawn)nodeDeque.previous();
        }
    }
}

