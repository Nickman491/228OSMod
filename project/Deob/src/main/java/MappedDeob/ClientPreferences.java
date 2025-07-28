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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dq")
@Implements(value="ClientPreferences")
public class ClientPreferences {
    @ObfuscatedName(value="ad")
    @Export(value="roofsHidden")
    boolean roofsHidden;
    @ObfuscatedName(value="an")
    @Export(value="hideUsername")
    boolean hideUsername = false;
    @ObfuscatedName(value="ae")
    @Export(value="titleMusicDisabled")
    boolean titleMusicDisabled;
    @ObfuscatedName(value="ax")
    @Export(value="displayFps")
    boolean displayFps = false;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=360808631)
    int field1308;
    @ObfuscatedName(value="ac")
    @Export(value="brightness")
    double brightness = 0.8;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=171288421)
    @Export(value="musicVolume")
    int musicVolume = 127;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1833607591)
    @Export(value="soundEffectsVolume")
    int soundEffectsVolume = 127;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-990493507)
    @Export(value="areaSoundEffectsVolume")
    int areaSoundEffectsVolume = 127;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1053727429)
    int field1311 = -1;
    @ObfuscatedName(value="aa")
    @Export(value="rememberedUsername")
    String rememberedUsername = null;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1867215081)
    @Export(value="windowMode")
    int windowMode = 1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-971491863)
    int field1305 = 25;
    @ObfuscatedName(value="av")
    @Export(value="parameters")
    final Map parameters = new LinkedHashMap();

    ClientPreferences() {
        this.method2958(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedSignature(descriptor="(Lvy;)V")
    ClientPreferences(Buffer buffer) {
        if (buffer != null && buffer.array != null) {
            int n = buffer.readUnsignedByte();
            if (n >= 0 && n <= 11) {
                if (buffer.readUnsignedByte() == 1) {
                    this.roofsHidden = true;
                }
                if (n > 1) {
                    boolean bl = this.titleMusicDisabled = buffer.readUnsignedByte() == 1;
                }
                if (n > 3) {
                    this.windowMode = buffer.readUnsignedByte();
                }
                if (n > 2) {
                    int n2 = buffer.readUnsignedByte();
                    for (int i = 0; i < n2; ++i) {
                        int n3 = buffer.readInt();
                        int n4 = buffer.readInt();
                        this.parameters.put(n3, n4);
                    }
                }
                if (n > 4) {
                    this.rememberedUsername = buffer.readStringCp1252NullTerminatedOrNull();
                }
                if (n > 5) {
                    this.hideUsername = buffer.readBoolean();
                }
                if (n > 6) {
                    this.brightness = (double)buffer.readUnsignedByte() / 100.0;
                    this.musicVolume = buffer.readUnsignedByte();
                    this.soundEffectsVolume = buffer.readUnsignedByte();
                    this.areaSoundEffectsVolume = buffer.readUnsignedByte();
                }
                if (n > 7) {
                    this.field1311 = buffer.readUnsignedByte();
                }
                if (n > 8) {
                    boolean bl = this.displayFps = buffer.readUnsignedByte() == 1;
                }
                if (n > 9) {
                    this.field1308 = buffer.readInt();
                }
                if (n <= 10) return;
                this.field1305 = buffer.readUnsignedByte();
                return;
            }
            this.method2958(true);
            return;
        }
        this.method2958(true);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-2087838146")
    void method2958(boolean bl) {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Lvy;", garbageValue="1462724230")
    @Export(value="toBuffer")
    Buffer toBuffer() {
        Buffer buffer = new Buffer(418, true);
        buffer.writeByte(11);
        buffer.writeByte(this.roofsHidden ? 1 : 0);
        buffer.writeByte(this.titleMusicDisabled ? 1 : 0);
        buffer.writeByte(this.windowMode);
        buffer.writeByte(this.parameters.size());
        Iterator iterator = this.parameters.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                buffer.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
                buffer.writeBoolean(this.hideUsername);
                buffer.writeByte((int)(100.0 * this.brightness));
                buffer.writeByte(this.musicVolume);
                buffer.writeByte(this.soundEffectsVolume);
                buffer.writeByte(this.areaSoundEffectsVolume);
                buffer.writeByte(this.field1311);
                buffer.writeByte(this.displayFps ? 1 : 0);
                buffer.method10268(this.field1308);
                buffer.writeByte(this.field1305);
                return buffer;
            }
            Map.Entry entry = iterator.next();
            buffer.method10268((Integer)entry.getKey());
            buffer.method10268((Integer)entry.getValue());
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-65")
    void method2921(boolean bl) {
        this.roofsHidden = bl;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1009742491")
    boolean method2890() {
        return this.roofsHidden;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-417120502")
    void method2884(boolean bl) {
        this.hideUsername = bl;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-46")
    boolean method2974() {
        return this.hideUsername;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="60")
    void method2978(boolean bl) {
        this.titleMusicDisabled = bl;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="1")
    boolean method2887() {
        return this.titleMusicDisabled;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1833834664")
    void method2899(boolean bl) {
        this.displayFps = bl;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-87")
    void method2889() {
        this.method2899(!this.displayFps);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1426224813")
    boolean method2983() {
        return this.displayFps;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1572518213")
    void method2891(int n) {
        this.field1308 = n;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="653163305")
    int method2892() {
        return this.field1308;
    }

    @ObfuscatedName(value="aa")
    void method2893(double d) {
        this.brightness = d;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)D", garbageValue="-92")
    double method2941() {
        return this.brightness;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1119003790")
    void method2888(int n) {
        this.musicVolume = n;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="86")
    int method2896() {
        return this.musicVolume;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-87")
    @Export(value="updateSoundEffectVolume")
    void updateSoundEffectVolume(int n) {
        this.soundEffectsVolume = n;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1475397758")
    int method2898() {
        return this.soundEffectsVolume;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1972871382")
    void method2967(int n) {
        this.areaSoundEffectsVolume = n;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1048848")
    int method2900() {
        return this.areaSoundEffectsVolume;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="18")
    void method2901(String string) {
        this.rememberedUsername = string;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1521571253")
    String method2944() {
        return this.rememberedUsername;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1193428060")
    void method2903(int n) {
        this.field1311 = n;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-971303773")
    int method2904() {
        return this.field1311;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1679225530")
    void method2905(int n) {
        this.windowMode = n;
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="120")
    int method2906() {
        return this.windowMode;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)V", garbageValue="-992090634")
    void method2907(String string, int n) {
        int n2 = this.method2879(string);
        if (this.parameters.size() >= 10 && !this.parameters.containsKey(n2)) {
            Iterator iterator = this.parameters.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
        this.parameters.put(n2, n);
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="-673907911")
    boolean method2894(String string) {
        int n = this.method2879(string);
        return this.parameters.containsKey(n);
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="-6")
    int method2909(String string) {
        int n = this.method2879(string);
        if (this.parameters.containsKey(n)) {
            return (Integer)this.parameters.get(n);
        }
        return 0;
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)I", garbageValue="370313994")
    int method2879(String string) {
        return class419.method8220(string.toLowerCase());
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-480240068")
    void method2911(int n) {
        this.field1305 = n;
        class230.method5124();
        Projectile.savePreferences();
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1062681713")
    int method2902() {
        return this.field1305;
    }

    @ObfuscatedName(value="ao")
    public static int method2988(long l) {
        return (int)(l >>> 0 & 0x7FL);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1874840281")
    static void method2989() {
        if ((Login.Login_username = Login.Login_username.trim()).length() != 0) {
            if (Login.Login_password.length() != 0) {
                class150.setLoginResponseString("", "Connecting to server...", "");
                Client.field629 = class544.clientPreferences.method2894(Login.Login_username) ? class146.field1659 : class146.field1661;
                class360.updateGameState(20);
                return;
            }
            class150.setLoginResponseString("", "Please enter your password.", "");
            return;
        }
        class150.setLoginResponseString("", "Please enter your username/email address.", "");
    }

    @ObfuscatedName(value="kw")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="1")
    static void method2990() {
        class188.method4443();
        Client.field648.field5617[0] = -1;
        Client.field648.field5618[0] = "Cancel";
        Client.field648.field5619[0] = "";
        Client.field648.field5614[0] = 1006;
        Client.field648.field5628[0] = false;
        Client.field648.field5623[0] = null;
        Client.field648.field5612 = 1;
    }
}

