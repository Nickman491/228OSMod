/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.oldscape.pub;

import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;
import net.runelite.mapping.Implements;

@Implements(value="OtlTokenRequester")
public interface OtlTokenRequester {
    public Future request(String var1, URL var2, Map var3, String var4);
}

