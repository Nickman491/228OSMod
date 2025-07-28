/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="RefreshAccessTokenRequester")
@ObfuscatedName(value="com/jagex/oldscape/pub/RefreshAccessTokenRequester")
public interface RefreshAccessTokenRequester {
    public Future request(String var1, URL var2, Map var3, String var4);
}

