/*
 * Decompiled with CFR 0.152.
 */
package old228.com.jagex.oldscape.pub;

public interface OAuthApi {
    public boolean isOnLoginScreen();

    public void setClient(int var1);

    public void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

    public void setOtlTokenRequester(OtlTokenRequester var1);

    public long getAccountHash();
}

