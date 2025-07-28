/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="OtlTokenResponse")
@ObfuscatedName(value="com/jagex/oldscape/pub/OtlTokenResponse")
public interface OtlTokenResponse {
    public boolean isSuccess();

    public String getToken();
}

