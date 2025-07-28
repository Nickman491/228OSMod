/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package org.json;

import net.runelite.mapping.Implements;

@Implements(value="JSONObject$Null")
final class JSONObject$Null {
    JSONObject$Null() {
    }

    public final Object clone() {
        return this;
    }

    public boolean equals(Object object) {
        return object == null || this == object;
    }

    public String toString() {
        return "null";
    }
}

