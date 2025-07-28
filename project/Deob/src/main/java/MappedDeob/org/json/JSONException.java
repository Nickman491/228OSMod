/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package org.json;

import net.runelite.mapping.Implements;

@Implements(value="JSONException")
public class JSONException
extends Exception {
    Throwable cause;

    public JSONException(Throwable throwable) {
        super(throwable.getMessage());
        this.cause = throwable;
    }

    public JSONException(String string) {
        super(string);
    }

    @Override
    public Throwable getCause() {
        return this.cause;
    }
}

