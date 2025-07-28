/*
 * Decompiled with CFR 0.152.
 */
package old228.org.json;

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

