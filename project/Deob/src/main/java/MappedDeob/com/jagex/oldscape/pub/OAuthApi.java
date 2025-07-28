/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.oldscape.pub;

import com.jagex.oldscape.pub.OtlTokenRequester;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="OAuthApi")
public interface OAuthApi {
    public boolean isOnLoginScreen();

    public void setClient(int var1);

    @ObfuscatedSignature(descriptor="(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
    public void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

    public void setOtlTokenRequester(OtlTokenRequester var1);

    public long getAccountHash();
}

