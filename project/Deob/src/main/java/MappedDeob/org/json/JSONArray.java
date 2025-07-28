/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
package org.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Implements(value="JSONArray")
public class JSONArray {
    ArrayList myArrayList;

    public JSONArray() {
        this.myArrayList = new ArrayList();
    }

    public JSONArray(JSONTokener jSONTokener) throws JSONException {
        this();
        char c;
        char c2 = jSONTokener.nextClean();
        if (c2 != '[') {
            if (c2 != '(') {
                throw jSONTokener.syntaxError("A JSONArray text must start with '['");
            }
            c = ')';
        } else {
            c = ']';
        }
        if (jSONTokener.nextClean() != ']') {
            jSONTokener.back();
            while (true) {
                if (jSONTokener.nextClean() != ',') {
                    jSONTokener.back();
                    this.myArrayList.add(jSONTokener.nextValue());
                } else {
                    jSONTokener.back();
                    this.myArrayList.add(null);
                }
                c2 = jSONTokener.nextClean();
                switch (c2) {
                    default: {
                        throw jSONTokener.syntaxError("Expected a ',' or ']'");
                    }
                    case ')': 
                    case ']': {
                        if (c == c2) {
                            return;
                        }
                        throw jSONTokener.syntaxError("Expected a '" + new Character(c) + "'");
                    }
                    case ',': 
                    case ';': 
                }
                if (jSONTokener.nextClean() == ']') break;
                jSONTokener.back();
            }
            return;
        }
    }

    public JSONArray(String string) throws JSONException {
        this(new JSONTokener(string));
    }

    public JSONArray(Collection collection) {
        this.myArrayList = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public JSONArray(Object object) throws JSONException {
        this();
        if (!object.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int n = Array.getLength(object);
        int n2 = 0;
        while (n2 < n) {
            this.method11034(Array.get(object, n2));
            ++n2;
        }
        return;
    }

    public JSONArray(Object object, boolean bl) throws JSONException {
        this();
        if (!object.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int n = Array.getLength(object);
        int n2 = 0;
        while (n2 < n) {
            this.method11034(new JSONObject(Array.get(object, n2), bl));
            ++n2;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JSONArray(Collection collection, boolean bl) {
        this.myArrayList = new ArrayList();
        if (collection == null) return;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.myArrayList.add(new JSONObject(iterator.next(), bl));
        }
        return;
    }

    @ObfuscatedName(value="opt")
    public Object method11031(int n) {
        return n >= 0 && n < this.length() ? this.myArrayList.get(n) : null;
    }

    @ObfuscatedName(value="get")
    public Object method11028(int n) throws JSONException {
        Object object = this.method11031(n);
        if (object != null) {
            return object;
        }
        throw new JSONException("JSONArray[" + n + "] not found.");
    }

    @ObfuscatedName(value="put")
    public JSONArray method11034(Object object) {
        this.myArrayList.add(object);
        return this;
    }

    public boolean optBoolean(int n, boolean bl) {
        try {
            return this.getBoolean(n);
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public String optString(int n, String string) {
        Object object = this.method11031(n);
        return object != null ? object.toString() : string;
    }

    public long optLong(int n, long l) {
        try {
            return this.getLong(n);
        }
        catch (Exception exception) {
            return l;
        }
    }

    public int optInt(int n, int n2) {
        try {
            return this.getInt(n);
        }
        catch (Exception exception) {
            return n2;
        }
    }

    public long getLong(int n) throws JSONException {
        Object object = this.method11028(n);
        return object instanceof Number ? ((Number)object).longValue() : (long)this.getDouble(n);
    }

    public boolean getBoolean(int n) throws JSONException {
        Object object = this.method11028(n);
        if (!(object.equals(Boolean.FALSE) || object instanceof String && ((String)object).equalsIgnoreCase("false"))) {
            if (!(object.equals(Boolean.TRUE) || object instanceof String && ((String)object).equalsIgnoreCase("true"))) {
                throw new JSONException("JSONArray[" + n + "] is not a Boolean.");
            }
            return true;
        }
        return false;
    }

    public int getInt(int n) throws JSONException {
        Object object = this.method11028(n);
        return object instanceof Number ? ((Number)object).intValue() : (int)this.getDouble(n);
    }

    public double getDouble(int n) throws JSONException {
        Object object = this.method11028(n);
        try {
            return object instanceof Number ? ((Number)object).doubleValue() : Double.valueOf((String)object).doubleValue();
        }
        catch (Exception exception) {
            throw new JSONException("JSONArray[" + n + "] is not a number.");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    String toString(int n, int n2) throws JSONException {
        StringBuffer stringBuffer;
        block5: {
            int n3;
            block4: {
                n3 = this.length();
                if (n3 == 0) {
                    return "[]";
                }
                stringBuffer = new StringBuffer("[");
                if (n3 != 1) break block4;
                stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(0), n, n2));
                break block5;
            }
            int n4 = n2 + n;
            stringBuffer.append('\n');
            int n5 = 0;
            while (true) {
                block7: {
                    block8: {
                        block6: {
                            if (n5 >= n3) break block6;
                            if (n5 <= 0) break block7;
                            break block8;
                        }
                        stringBuffer.append('\n');
                        for (n5 = 0; n5 < n2; ++n5) {
                            stringBuffer.append(' ');
                        }
                        break;
                    }
                    stringBuffer.append(",\n");
                }
                for (int i = 0; i < n4; ++i) {
                    stringBuffer.append(' ');
                }
                stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(n5), n, n4));
                ++n5;
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public double optDouble(int n, double d) {
        try {
            return this.getDouble(n);
        }
        catch (Exception exception) {
            return d;
        }
    }

    public int length() {
        return this.myArrayList.size();
    }

    public String join(String string) throws JSONException {
        int n = this.length();
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = 0;
        while (n2 < n) {
            if (n2 > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(n2)));
            ++n2;
        }
        return stringBuffer.toString();
    }

    public JSONObject getJSONObject(int n) throws JSONException {
        Object object = this.method11028(n);
        if (!(object instanceof JSONObject)) {
            throw new JSONException("JSONArray[" + n + "] is not a JSONObject.");
        }
        return (JSONObject)object;
    }

    public String getString(int n) throws JSONException {
        return this.method11028(n).toString();
    }

    public Writer write(Writer writer) throws JSONException {
        try {
            boolean bl = false;
            int n = this.length();
            writer.write(91);
            for (int i = 0; i < n; ++i) {
                Object e;
                if (bl) {
                    writer.write(44);
                }
                if ((e = this.myArrayList.get(i)) instanceof JSONObject) {
                    ((JSONObject)e).write(writer);
                } else if (e instanceof JSONArray) {
                    ((JSONArray)e).write(writer);
                } else {
                    writer.write(JSONObject.valueToString(e));
                }
                bl = true;
            }
            writer.write(93);
            return writer;
        }
        catch (IOException iOException) {
            throw new JSONException(iOException);
        }
    }

    public String toString() {
        try {
            return '[' + this.join(",") + ']';
        }
        catch (Exception exception) {
            return null;
        }
    }

    public JSONArray getJSONArray(int n) throws JSONException {
        Object object = this.method11028(n);
        if (!(object instanceof JSONArray)) {
            throw new JSONException("JSONArray[" + n + "] is not a JSONArray.");
        }
        return (JSONArray)object;
    }

    public boolean isNull(int n) {
        return JSONObject.NULL.equals(this.method11031(n));
    }

    public double optDouble(int n) {
        return this.optDouble(n, Double.NaN);
    }

    public int optInt(int n) {
        return this.optInt(n, 0);
    }

    public JSONArray optJSONArray(int n) {
        Object object = this.method11031(n);
        return object instanceof JSONArray ? (JSONArray)object : null;
    }

    public JSONObject optJSONObject(int n) {
        Object object = this.method11031(n);
        return object instanceof JSONObject ? (JSONObject)object : null;
    }

    public long optLong(int n) {
        return this.optLong(n, 0L);
    }

    public String optString(int n) {
        return this.optString(n, "");
    }

    public boolean optBoolean(int n) {
        return this.optBoolean(n, false);
    }

    public String toString(int n) throws JSONException {
        return this.toString(n, 0);
    }

    public JSONObject toJSONObject(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0 && this.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            int n = 0;
            while (true) {
                if (n >= jSONArray.length()) {
                    return jSONObject;
                }
                jSONObject.method11016(jSONArray.getString(n), this.method11031(n));
                ++n;
            }
        }
        return null;
    }
}

