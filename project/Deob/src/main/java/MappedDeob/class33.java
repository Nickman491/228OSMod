/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bz")
public class class33 {
    @ObfuscatedName(value="oj")
    @ObfuscatedGetter(intValue=-1027343517)
    static int field149;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1927105713)
    int field147;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1996685255)
    int field144;

    class33(int n, int n2) {
        this.field147 = n;
        this.field144 = n2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lbb;I)Z", garbageValue="2126273148")
    boolean method519(class29 class292) {
        if (class292 == null) {
            return false;
        }
        switch (this.field147) {
            case 4: {
                return class292.vmethod5764(this.field144 == 1);
            }
            default: {
                return false;
            }
            case 1: {
                return class292.vmethod5756(this.field144);
            }
            case 3: {
                return class292.vmethod5758((char)this.field144);
            }
            case 2: 
        }
        return class292.vmethod5757(this.field144);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lkb;", garbageValue="1208084405")
    @Export(value="SequenceDefinition_get")
    public static SequenceDefinition SequenceDefinition_get(int n) {
        SequenceDefinition sequenceDefinition = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get(n);
        if (sequenceDefinition == null) {
            byte[] byArray = SequenceDefinition.SequenceDefinition_archive.takeFile(12, n);
            sequenceDefinition = new SequenceDefinition();
            if (byArray != null) {
                sequenceDefinition.decode(new Buffer(byArray));
            }
            sequenceDefinition.postDecode();
            SequenceDefinition.SequenceDefinition_cached.put(sequenceDefinition, n);
            return sequenceDefinition;
        }
        return sequenceDefinition;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)F", garbageValue="86")
    static float method521(int n, int n2, int n3) {
        return (float)(n - n2) / (float)(n3 - n2);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="38")
    @Export(value="Login_promptCredentials")
    static void Login_promptCredentials(boolean bl) {
        if (!(Client.client.method1441() || Client.client.method1293() || Client.client.method1418())) {
            Login.Login_response1 = "";
            Login.Login_response2 = "Enter your username/email & password.";
            Login.Login_response3 = "";
            Varcs.method3212(2);
            if (bl) {
                Login.Login_password = "";
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
            return;
        }
        Varcs.method3212(10);
    }

    @ObfuscatedName(value="jh")
    @ObfuscatedSignature(descriptor="(Ldz;Lda;II)V", garbageValue="1603163751")
    static void method523(class103 class1032, Actor actor, int n) {
        int n2;
        int n3;
        Coord coord = actor.method2785(class1032);
        int n4 = actor.x;
        int n5 = actor.field1268 * -2132848751 - 1;
        int n6 = n3 = n4 + (n5 << 6);
        int n7 = actor.field1196;
        int n8 = actor.field1268 * -2132848751 - 1;
        int n9 = n2 = n7 + (n8 << 6);
        class4.drawActor2d(class1032, coord.x, coord.y, n6, n9, n);
    }

    @ObfuscatedName(value="ni")
    static final void method522(double d) {
        SceneTileModel.method4004(d);
        ((TextureProvider)SceneTileModel.field1957.Rasterizer3D_textureLoader).setBrightness(d);
        if (class420.worldMap != null) {
            class420.worldMap.method9843();
        }
        ItemComposition.ItemDefinition_cachedSprites.clear();
        class544.clientPreferences.method2893(d);
    }
}

