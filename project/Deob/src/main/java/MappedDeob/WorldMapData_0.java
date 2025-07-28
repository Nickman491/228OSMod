/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="ko")
@Implements(value="WorldMapData_0")
public class WorldMapData_0
extends AbstractWorldMapData {
    WorldMapData_0() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="28976712")
    @Export(value="init")
    void init(Buffer buffer) {
        int n = buffer.readUnsignedByte();
        if (n == WorldMapID.field3247.value) {
            this.minPlane = buffer.readUnsignedByte();
            this.planes = buffer.readUnsignedByte();
            this.regionXLow = buffer.readUnsignedShort() * 4096;
            this.regionYLow = buffer.readUnsignedShort() * 64;
            this.regionX = buffer.readUnsignedShort();
            this.regionY = buffer.readUnsignedShort();
            this.groupId = buffer.method10476();
            this.fileId = buffer.method10476();
            return;
        }
        throw new IllegalStateException("");
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="-46")
    @Export(value="readGeography")
    void readGeography(Buffer buffer) {
        this.planes = Math.min(this.planes, 4);
        this.floorUnderlayIds = new short[1][64][64];
        this.floorOverlayIds = new short[this.planes][64][64];
        this.field3210 = new byte[this.planes][64][64];
        this.field3205 = new byte[this.planes][64][64];
        this.decorations = new WorldMapDecoration[this.planes][64][64][];
        int n = buffer.readUnsignedByte();
        if (n == class298.field3236.value) {
            int n2 = buffer.readUnsignedByte();
            int n3 = buffer.readUnsignedByte();
            if (n2 == this.regionX && n3 == this.regionY) {
                int n4 = 0;
                while (true) {
                    if (n4 >= 64) {
                        return;
                    }
                    for (int i = 0; i < 64; ++i) {
                        this.readTile(n4, i, buffer);
                    }
                    ++n4;
                }
            }
            throw new IllegalStateException("");
        }
        throw new IllegalStateException("");
    }

    public int hashCode() {
        return this.regionX | this.regionY << 8;
    }

    public boolean equals(Object object) {
        if (object instanceof WorldMapData_0) {
            WorldMapData_0 worldMapData_0 = (WorldMapData_0)object;
            return this.regionX == worldMapData_0.regionX && this.regionY == worldMapData_0.regionY;
        }
        return false;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)[Lmn;", garbageValue="48")
    public static ServerPacket[] method5975() {
        return new ServerPacket[]{ServerPacket.field3468, ServerPacket.field3444, ServerPacket.field3445, ServerPacket.field3446, ServerPacket.field3535, ServerPacket.field3460, ServerPacket.field3497, ServerPacket.field3519, ServerPacket.field3451, ServerPacket.field3452, ServerPacket.field3516, ServerPacket.field3474, ServerPacket.field3472, ServerPacket.field3456, ServerPacket.field3457, ServerPacket.field3491, ServerPacket.field3459, ServerPacket.field3449, ServerPacket.field3461, ServerPacket.field3501, ServerPacket.field3463, ServerPacket.field3464, ServerPacket.field3454, ServerPacket.field3466, ServerPacket.field3520, ServerPacket.field3540, ServerPacket.field3469, ServerPacket.field3470, ServerPacket.field3471, ServerPacket.field3564, ServerPacket.field3473, ServerPacket.field3562, ServerPacket.field3475, ServerPacket.field3476, ServerPacket.field3477, ServerPacket.field3478, ServerPacket.field3479, ServerPacket.field3465, ServerPacket.field3487, ServerPacket.field3482, ServerPacket.field3483, ServerPacket.field3467, ServerPacket.field3521, ServerPacket.field3486, ServerPacket.field3485, ServerPacket.field3488, ServerPacket.field3450, ServerPacket.field3531, ServerPacket.field3557, ServerPacket.field3492, ServerPacket.field3493, ServerPacket.field3494, ServerPacket.field3447, ServerPacket.field3496, ServerPacket.field3481, ServerPacket.field3541, ServerPacket.field3499, ServerPacket.field3500, ServerPacket.field3498, ServerPacket.field3502, ServerPacket.field3503, ServerPacket.field3504, ServerPacket.field3455, ServerPacket.field3506, ServerPacket.field3507, ServerPacket.field3508, ServerPacket.field3509, ServerPacket.field3510, ServerPacket.field3511, ServerPacket.field3512, ServerPacket.field3513, ServerPacket.field3514, ServerPacket.field3515, ServerPacket.field3490, ServerPacket.field3517, ServerPacket.field3525, ServerPacket.field3560, ServerPacket.field3524, ServerPacket.field3462, ServerPacket.field3522, ServerPacket.field3443, ServerPacket.field3555, ServerPacket.field3518, ServerPacket.field3526, ServerPacket.field3527, ServerPacket.field3528, ServerPacket.field3529, ServerPacket.field3530, ServerPacket.field3579, ServerPacket.field3532, ServerPacket.field3533, ServerPacket.field3534, ServerPacket.field3575, ServerPacket.field3536, ServerPacket.field3537, ServerPacket.field3538, ServerPacket.field3539, ServerPacket.field3489, ServerPacket.field3577, ServerPacket.field3569, ServerPacket.field3543, ServerPacket.field3544, ServerPacket.field3545, ServerPacket.field3546, ServerPacket.field3547, ServerPacket.field3548, ServerPacket.field3549, ServerPacket.field3550, ServerPacket.field3542, ServerPacket.field3552, ServerPacket.field3553, ServerPacket.field3554, ServerPacket.field3565, ServerPacket.field3556, ServerPacket.field3480, ServerPacket.field3558, ServerPacket.field3559, ServerPacket.field3448, ServerPacket.field3561, ServerPacket.field3458, ServerPacket.field3563, ServerPacket.field3551, ServerPacket.field3570, ServerPacket.field3566, ServerPacket.field3567, ServerPacket.field3568, ServerPacket.field3484, ServerPacket.field3495, ServerPacket.field3571, ServerPacket.field3572, ServerPacket.field3573, ServerPacket.field3574, ServerPacket.field3523, ServerPacket.field3576, ServerPacket.field3505, ServerPacket.field3578, ServerPacket.field3453};
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1281370951")
    static int method5988(int n, Script script, boolean bl) {
        Widget widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
        if (n != ScriptOpcodes.IF_GETX) {
            if (n != ScriptOpcodes.IF_GETY) {
                if (n != ScriptOpcodes.IF_GETWIDTH) {
                    if (n != ScriptOpcodes.IF_GETHEIGHT) {
                        if (n != ScriptOpcodes.IF_GETHIDE) {
                            if (n != ScriptOpcodes.IF_GETLAYER) {
                                return 2;
                            }
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.parentId;
                            return 1;
                        }
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.isHidden ? 1 : 0;
                        return 1;
                    }
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.height * -1528330031;
                    return 1;
                }
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.width;
                return 1;
            }
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.y;
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.x;
        return 1;
    }
}

