/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sq")
@Implements(value="AbstractSocket")
public abstract class AbstractSocket {
    AbstractSocket() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1264971006")
    @Export(value="isAvailable")
    public abstract boolean isAvailable(int var1) throws IOException;

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2125512046")
    public abstract int vmethod9408() throws IOException;

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1363854656")
    public abstract int vmethod9406() throws IOException;

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([BIIB)I", garbageValue="72")
    @Export(value="read")
    public abstract int read(byte[] var1, int var2, int var3) throws IOException;

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="([BIIB)V", garbageValue="-105")
    @Export(value="write")
    public abstract void write(byte[] var1, int var2, int var3) throws IOException;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1821776179")
    @Export(value="close")
    public abstract void close();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lpq;IIB)[Lvf;", garbageValue="34")
    public static SpritePixels[] method9404(AbstractArchive abstractArchive, int n, int n2) {
        if (!WorldMapSprite.method6397(abstractArchive, n, n2)) {
            return null;
        }
        return class457.method8965();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-97")
    static void method9400(boolean bl) {
        int n = 0;
        if (LoginScreenAnimation.method2876()) {
            if (Client.client.method1441() || Client.client.method1293() || Client.client.method1418()) {
                n = 10;
            }
        } else {
            n = 12;
        }
        Varcs.method3212(n);
        if (bl) {
            Login.Login_username = "";
            Login.Login_password = "";
            class326.field3592 = 0;
            class480.otp = "";
        }
        if (Login.Login_username == null || Login.Login_username.length() <= 0) {
            if (class544.clientPreferences.method2944() == null) {
                Client.Login_isUsernameRemembered = false;
            } else {
                Login.Login_username = class544.clientPreferences.method2944();
                Client.Login_isUsernameRemembered = true;
            }
        }
        HealthBarUpdate.method2832();
    }
}

