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
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="en")
@Implements(value="UrlRequest")
public class UrlRequest {
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1203782425)
    static int field1471 = -1;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-757318905)
    static int field1474 = -2;
    @ObfuscatedName(value="ay")
    final URL field1473;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-81627907)
    volatile int field1476 = field1471;
    @ObfuscatedName(value="ad")
    @Export(value="response0")
    volatile byte[] response0;

    UrlRequest(URL uRL) {
        this.field1473 = uRL;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="2064838121")
    @Export(value="isDone")
    public boolean isDone() {
        return this.field1476 != field1471;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)[B", garbageValue="98")
    @Export(value="getResponse")
    public byte[] getResponse() {
        return this.response0;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="2")
    public String method3308() {
        return this.field1473.toString();
    }
}

