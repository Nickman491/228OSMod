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

@ObfuscatedName(value="sg")
public class class480
implements class67 {
    @ObfuscatedName(value="ch")
    @Export(value="otp")
    static String otp;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=539044777)
    int field5028 = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1131649629)
    public int field5027;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ldz;")
    public class103 field5035;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lks;")
    public final class274 field5029 = new class274();
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1859350753)
    int field5030 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=11080905)
    int field5031 = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="[Lsm;")
    class481[] field5032 = new class481[10];
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1637372317)
    int field5033 = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lsp;")
    class482 field5034 = new class483();
    @ObfuscatedName(value="ac")
    boolean field5026 = false;

    @ObfuscatedSignature(descriptor="(ILdz;)V")
    public class480(int n, class103 class1032) {
        this.field5035 = class1032;
        this.field5033 = 0;
        int n2 = 0;
        while (n2 < 10) {
            this.field5032[n2] = new class481();
            ++n2;
        }
        return;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="392218032")
    public int vmethod9352() {
        return this.field5029.method5895();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="251050381")
    public int vmethod9331() {
        return this.field5029.method5894();
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="105")
    public int vmethod9290() {
        return this.field5028;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-582612716")
    public void method9351() {
        this.field5035.field1319.field2024 = this.field5035.field1321;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2121537640")
    public int method9288() {
        return this.field5029.method5893();
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="149257279")
    public int method9291() {
        return this.field5029.method5897();
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="826749675")
    public int method9315() {
        return Math.max(this.field5035.field1322, this.field5035.field1323) * 128;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lks;", garbageValue="1274992386")
    public class274 method9293() {
        return this.field5033 == 0 ? this.field5029 : this.field5032[0].field5037;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-57784512")
    public void method9334(int n, int n2) {
        this.field5030 = n;
        this.field5031 = n2;
        this.field5035.field1319.field2002 = n;
        this.field5035.field1319.field2040 = n2;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="72")
    public int method9287() {
        return this.field5035.field1322 * 64 - this.field5030;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-66460165")
    public int method9296() {
        return this.field5035.field1323 * 64 - this.field5031;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="0")
    public void method9297(int n, int n2) {
        int n3 = 0;
        while (true) {
            if (n3 >= this.field5032.length) {
                this.field5029.method5903(n, n2);
                this.field5034.vmethod9367(n, n2);
                return;
            }
            this.field5032[n3].field5037.method5903(n, n2);
            ++n3;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lks;I)V", garbageValue="-1554046541")
    public final void method9298(class274 class2742) {
        int n = class2742.method5925();
        int n2 = class2742.method5896();
        if (n >= 0 && n < 104 && n2 >= 0 && n2 < 104) {
            int n3 = class2742.method5895() - this.field5032[0].field5037.method5895();
            int n4 = class2742.method5894() - this.field5032[0].field5037.method5894();
            this.method9300(class2742, Math.abs(n3), Math.abs(n4));
        } else {
            this.method9316(class2742);
        }
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lks;B)V", garbageValue="79")
    public void method9316(class274 class2742) {
        this.field5029.method5899(class2742);
        this.field5032[0].field5037.method5899(class2742);
        this.field5033 = 0;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Lks;IIB)V", garbageValue="-88")
    void method9300(class274 class2742, int n, int n2) {
        if (this.field5033 < 9) {
            ++this.field5033;
        }
        int n3 = this.field5033;
        while (true) {
            if (n3 <= 0) {
                this.field5032[0].field5037.method5899(class2742);
                this.field5032[0].field5038 = Client.cycle;
                return;
            }
            class481 class4812 = this.field5032[n3];
            this.field5032[n3] = this.field5032[n3 - 1];
            this.field5032[n3 - 1] = class4812;
            --n3;
        }
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-23")
    public final void method9301(int n) {
        if (this.field5033 != 0) {
            if (!this.field5026) {
                this.field5034.vmethod9368(this.field5029, this.field5032[0], n);
                this.field5026 = true;
            }
            if (this.field5034.vmethod9369(this.field5029, n, this.field5033)) {
                --this.field5033;
                this.field5026 = false;
            }
            return;
        }
        this.method9316(this.field5032[0].field5037);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(III)Lqh;", garbageValue="-1684593861")
    public class426 method9302(int n, int n2) {
        class422 class4222 = new class422();
        class428 class4282 = AbstractWorldMapData.method6389();
        class4222.field4728.method8332(class172.method3867(this.field5029.method5897()), 0.0f, 0.0f);
        class4222.field4729.method8285(this.field5029.method5895(), 0.0f, this.field5029.method5894());
        class4282.method8379(class4222);
        class4222.method8253();
        class426 class4262 = class4282.method8386(n -= this.method9287(), 0.0f, n2 -= this.method9287());
        class4282.method8373();
        return class4262;
    }

    @ObfuscatedName(value="mp")
    @ObfuscatedSignature(descriptor="(IIIIII)V", garbageValue="-2044167266")
    @Export(value="drawScrollBar")
    static final void drawScrollBar(int n, int n2, int n3, int n4, int n5) {
        WorldMapSection2.scrollBarSprites[0].drawAt(n, n2);
        WorldMapSection2.scrollBarSprites[1].drawAt(n, n4 + n2 - 16);
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2 + 16, 16, n4 - 32, Client.field582);
        int n6 = n4 * (n4 - 32) / n5;
        if (n6 < 8) {
            n6 = 8;
        }
        int n7 = (n4 - 32 - n6) * n3 / (n5 - n4);
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n7 + n2 + 16, 16, n6, Client.field583);
        Rasterizer2D.method10621(n, n7 + n2 + 16, n6, Client.field550);
        Rasterizer2D.method10621(n + 1, n7 + n2 + 16, n6, Client.field550);
        Rasterizer2D.method10619(n, n7 + n2 + 16, 16, Client.field550);
        Rasterizer2D.method10619(n, n7 + n2 + 17, 16, Client.field550);
        Rasterizer2D.method10621(n + 15, n7 + n2 + 16, n6, Client.field584);
        Rasterizer2D.method10621(n + 14, n7 + n2 + 17, n6 - 1, Client.field584);
        Rasterizer2D.method10619(n, n6 + n7 + n2 + 15, 16, Client.field584);
        Rasterizer2D.method10619(n + 1, n7 + n6 + n2 + 14, 15, Client.field584);
    }
}

