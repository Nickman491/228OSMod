/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.rs.Reflection
 */
package old228.org.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.Reflection;

public class JSONObject {
    public static final Object NULL = new JSONObject$Null(null);
    @ObfuscatedName(value="map")
    Map field5653;

    public JSONObject() {
        this.field5653 = new HashMap();
    }

    public JSONObject(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() == '{') {
            block8: while (true) {
                char c = jSONTokener.nextClean();
                switch (c) {
                    default: {
                        jSONTokener.back();
                        String string = jSONTokener.nextValue().toString();
                        c = jSONTokener.nextClean();
                        if (c != '=') {
                            if (c != ':') {
                                throw jSONTokener.syntaxError("Expected a ':' after a key");
                            }
                        } else if (jSONTokener.next() != '>') {
                            jSONTokener.back();
                        }
                        this.putOnce(string, jSONTokener.nextValue());
                        switch (jSONTokener.nextClean()) {
                            default: {
                                throw jSONTokener.syntaxError("Expected a ',' or '}'");
                            }
                            case '}': {
                                return;
                            }
                            case ',': 
                            case ';': 
                        }
                        if (jSONTokener.nextClean() != '}') {
                            jSONTokener.back();
                            continue block8;
                        }
                        return;
                    }
                    case '}': {
                        return;
                    }
                    case '\u0000': 
                }
                break;
            }
            throw jSONTokener.syntaxError("A JSONObject text must end with '}'");
        }
        throw jSONTokener.syntaxError("A JSONObject text must begin with '{'");
    }

    public JSONObject(String string) throws JSONException {
        this(new JSONTokener(string));
    }

    public JSONObject(Object object, boolean bl) {
        this();
        this.populateInternalMap(object, bl);
    }

    public JSONObject(Map map) {
        this.field5653 = map == null ? new HashMap() : map;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JSONObject(Map map, boolean bl) {
        this.field5653 = new HashMap();
        if (map == null) return;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            this.field5653.put(entry.getKey(), new JSONObject(entry.getValue(), bl));
        }
        return;
    }

    @ObfuscatedName(value="opt")
    public Object method11024(String string) {
        return string == null ? null : this.field5653.get(string);
    }

    @ObfuscatedName(value="get")
    public Object method11017(String string) throws JSONException {
        Object object = this.method11024(string);
        if (object != null) {
            return object;
        }
        throw new JSONException("JSONObject[" + JSONObject.quote(string) + "] not found.");
    }

    @ObfuscatedName(value="put")
    public JSONObject method11016(String string, Object object) throws JSONException {
        if (string != null) {
            if (object == null) {
                this.remove(string);
            } else {
                JSONObject.testValidity(object);
                this.field5653.put(string, object);
            }
            return this;
        }
        throw new JSONException("Null key.");
    }

    public double optDouble(String string, double d) {
        try {
            Object object = this.method11024(string);
            return object instanceof Number ? ((Number)object).doubleValue() : new Double((String)object).doubleValue();
        }
        catch (Exception exception) {
            return d;
        }
    }

    public long optLong(String string, long l) {
        try {
            return this.getLong(string);
        }
        catch (Exception exception) {
            return l;
        }
    }

    public boolean optBoolean(String string, boolean bl) {
        try {
            return this.getBoolean(string);
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public int optInt(String string, int n) {
        try {
            return this.getInt(string);
        }
        catch (Exception exception) {
            return n;
        }
    }

    public boolean getBoolean(String string) throws JSONException {
        Object object = this.method11017(string);
        if (!(object.equals(Boolean.FALSE) || object instanceof String && ((String)object).equalsIgnoreCase("false"))) {
            if (!(object.equals(Boolean.TRUE) || object instanceof String && ((String)object).equalsIgnoreCase("true"))) {
                throw new JSONException("JSONObject[" + JSONObject.quote(string) + "] is not a Boolean.");
            }
            return true;
        }
        return false;
    }

    public long getLong(String string) throws JSONException {
        Object object = this.method11017(string);
        return object instanceof Number ? ((Number)object).longValue() : (long)this.getDouble(string);
    }

    public String optString(String string, String string2) {
        Object object = this.method11024(string);
        return object != null ? object.toString() : string2;
    }

    public Iterator keys() {
        return this.field5653.keySet().iterator();
    }

    /*
     * Enabled aggressive block sorting
     */
    String toString(int n, int n2) throws JSONException {
        StringBuffer stringBuffer;
        block5: {
            int n3;
            Iterator iterator;
            block4: {
                int n4 = this.length();
                if (n4 == 0) {
                    return "{}";
                }
                iterator = this.sortedKeys();
                stringBuffer = new StringBuffer("{");
                n3 = n2 + n;
                if (n4 != 1) break block4;
                Object e = iterator.next();
                stringBuffer.append(JSONObject.quote(e.toString()));
                stringBuffer.append(": ");
                stringBuffer.append(JSONObject.valueToString(this.field5653.get(e), n, n2));
                break block5;
            }
            while (true) {
                int n5;
                Object e;
                block9: {
                    block7: {
                        block8: {
                            block6: {
                                if (!iterator.hasNext()) break block6;
                                e = iterator.next();
                                if (stringBuffer.length() <= 1) break block7;
                                break block8;
                            }
                            if (stringBuffer.length() <= 1) break;
                            stringBuffer.append('\n');
                            for (n5 = 0; n5 < n2; ++n5) {
                                stringBuffer.append(' ');
                            }
                            break;
                        }
                        stringBuffer.append(",\n");
                        break block9;
                    }
                    stringBuffer.append('\n');
                }
                for (n5 = 0; n5 < n3; ++n5) {
                    stringBuffer.append(' ');
                }
                stringBuffer.append(JSONObject.quote(e.toString()));
                stringBuffer.append(": ");
                stringBuffer.append(JSONObject.valueToString(this.field5653.get(e), n, n3));
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public int getInt(String string) throws JSONException {
        Object object = this.method11017(string);
        return object instanceof Number ? ((Number)object).intValue() : (int)this.getDouble(string);
    }

    public int length() {
        return this.field5653.size();
    }

    public JSONArray getJSONArray(String string) throws JSONException {
        Object object = this.method11017(string);
        if (!(object instanceof JSONArray)) {
            throw new JSONException("JSONObject[" + JSONObject.quote(string) + "] is not a JSONArray.");
        }
        return (JSONArray)object;
    }

    public JSONObject getJSONObject(String string) throws JSONException {
        Object object = this.method11017(string);
        if (!(object instanceof JSONObject)) {
            throw new JSONException("JSONObject[" + JSONObject.quote(string) + "] is not a JSONObject.");
        }
        return (JSONObject)object;
    }

    void populateInternalMap(Object object, boolean bl) {
        Class<?> clazz = object.getClass();
        if (clazz.getClassLoader() == null) {
            bl = false;
        }
        Method[] methodArray = bl ? clazz.getMethods() : clazz.getDeclaredMethods();
        for (int i = 0; i < methodArray.length; ++i) {
            try {
                Method method = methodArray[i];
                String string = Reflection.getMethodName((Method)method);
                String string2 = "";
                if (string.startsWith("get")) {
                    string2 = string.substring(3);
                } else if (string.startsWith("is")) {
                    string2 = string.substring(2);
                }
                if (string2.length() <= 0 || !Character.isUpperCase(string2.charAt(0)) || Reflection.getParameterTypes((Method)method).length != 0) continue;
                if (string2.length() == 1) {
                    string2 = string2.toLowerCase();
                } else if (!Character.isUpperCase(string2.charAt(1))) {
                    string2 = string2.substring(0, 1).toLowerCase() + string2.substring(1);
                }
                Object object2 = Reflection.invoke((Method)method, (Object)object, null);
                if (object2 == null) {
                    this.field5653.put(string2, NULL);
                    continue;
                }
                if (object2.getClass().isArray()) {
                    this.field5653.put(string2, new JSONArray(object2, bl));
                    continue;
                }
                if (object2 instanceof Collection) {
                    this.field5653.put(string2, new JSONArray((Collection)object2, bl));
                    continue;
                }
                if (object2 instanceof Map) {
                    this.field5653.put(string2, new JSONObject((Map)object2, bl));
                    continue;
                }
                if (this.isStandardProperty(object2.getClass())) {
                    this.field5653.put(string2, object2);
                    continue;
                }
                if (object2.getClass().getPackage().getName().startsWith("java") || object2.getClass().getClassLoader() == null) {
                    this.field5653.put(string2, object2.toString());
                    continue;
                }
                this.field5653.put(string2, new JSONObject(object2, bl));
                continue;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
    }

    public String optString(String string) {
        return this.optString(string, "");
    }

    public Object remove(String string) {
        return this.field5653.remove(string);
    }

    public String getString(String string) throws JSONException {
        return this.method11017(string).toString();
    }

    public Iterator sortedKeys() {
        return new TreeSet(this.field5653.keySet()).iterator();
    }

    public double getDouble(String string) throws JSONException {
        Object object = this.method11017(string);
        try {
            return object instanceof Number ? ((Number)object).doubleValue() : Double.valueOf((String)object).doubleValue();
        }
        catch (Exception exception) {
            throw new JSONException("JSONObject[" + JSONObject.quote(string) + "] is not a number.");
        }
    }

    public int optInt(String string) {
        return this.optInt(string, 0);
    }

    public Writer write(Writer writer) throws JSONException {
        try {
            boolean bl = false;
            Iterator iterator = this.keys();
            writer.write(123);
            while (iterator.hasNext()) {
                if (bl) {
                    writer.write(44);
                }
                Object e = iterator.next();
                writer.write(JSONObject.quote(e.toString()));
                writer.write(58);
                Object v = this.field5653.get(e);
                if (v instanceof JSONObject) {
                    ((JSONObject)v).write(writer);
                } else if (v instanceof JSONArray) {
                    ((JSONArray)v).write(writer);
                } else {
                    writer.write(JSONObject.valueToString(v));
                }
                bl = true;
            }
            writer.write(125);
            return writer;
        }
        catch (IOException iOException) {
            throw new JSONException(iOException);
        }
    }

    public String toString() {
        try {
            Iterator iterator = this.keys();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (iterator.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object e = iterator.next();
                stringBuffer.append(JSONObject.quote(e.toString()));
                stringBuffer.append(':');
                stringBuffer.append(JSONObject.valueToString(this.field5653.get(e)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            return null;
        }
    }

    public JSONObject optJSONObject(String string) {
        Object object = this.method11024(string);
        return object instanceof JSONObject ? (JSONObject)object : null;
    }

    public JSONObject putOnce(String string, Object object) throws JSONException {
        if (string != null && object != null) {
            if (this.method11024(string) == null) {
                this.method11016(string, object);
            } else {
                throw new JSONException("Duplicate key \"" + string + "\"");
            }
        }
        return this;
    }

    boolean isStandardProperty(Class clazz) {
        return clazz.isPrimitive() || clazz.isAssignableFrom(Byte.class) || clazz.isAssignableFrom(Short.class) || clazz.isAssignableFrom(Integer.class) || clazz.isAssignableFrom(Long.class) || clazz.isAssignableFrom(Float.class) || clazz.isAssignableFrom(Double.class) || clazz.isAssignableFrom(Character.class) || clazz.isAssignableFrom(String.class) || clazz.isAssignableFrom(Boolean.class);
    }

    public JSONObject append(String string, Object object) throws JSONException {
        JSONObject.testValidity(object);
        Object object2 = this.method11024(string);
        if (object2 != null) {
            if (!(object2 instanceof JSONArray)) {
                throw new JSONException("JSONObject[" + string + "] is not a JSONArray.");
            }
            this.method11016(string, ((JSONArray)object2).method11034(object));
        } else {
            this.method11016(string, new JSONArray().method11034(object));
        }
        return this;
    }

    public JSONArray names() {
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = this.keys();
        while (iterator.hasNext()) {
            jSONArray.method11034(iterator.next());
        }
        return jSONArray.length() == 0 ? null : jSONArray;
    }

    public boolean optBoolean(String string) {
        return this.optBoolean(string, false);
    }

    public double optDouble(String string) {
        return this.optDouble(string, Double.NaN);
    }

    public JSONArray optJSONArray(String string) {
        Object object = this.method11024(string);
        return object instanceof JSONArray ? (JSONArray)object : null;
    }

    public long optLong(String string) {
        return this.optLong(string, 0L);
    }

    public JSONObject putOpt(String string, Object object) throws JSONException {
        if (string != null && object != null) {
            this.method11016(string, object);
        }
        return this;
    }

    public JSONArray toJSONArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            JSONArray jSONArray2 = new JSONArray();
            int n = 0;
            while (true) {
                if (n >= jSONArray.length()) {
                    return jSONArray2;
                }
                jSONArray2.method11034(this.method11024(jSONArray.getString(n)));
                ++n;
            }
        }
        return null;
    }

    public String toString(int n) throws JSONException {
        return this.toString(n, 0);
    }

    public boolean isNull(String string) {
        return NULL.equals(this.method11024(string));
    }

    public JSONObject accumulate(String string, Object object) throws JSONException {
        JSONObject.testValidity(object);
        Object object2 = this.method11024(string);
        if (object2 != null) {
            if (!(object2 instanceof JSONArray)) {
                this.method11016(string, new JSONArray().method11034(object2).method11034(object));
            } else {
                ((JSONArray)object2).method11034(object);
            }
        } else {
            this.method11016(string, object instanceof JSONArray ? new JSONArray().method11034(object) : object);
        }
        return this;
    }

    public static String[] getNames(JSONObject jSONObject) {
        int n = jSONObject.length();
        if (n != 0) {
            Iterator iterator = jSONObject.keys();
            String[] stringArray = new String[n];
            int n2 = 0;
            while (true) {
                if (!iterator.hasNext()) {
                    return stringArray;
                }
                stringArray[n2] = (String)iterator.next();
                ++n2;
            }
        }
        return null;
    }

    static void testValidity(Object object) throws JSONException {
        if (object != null && (!(object instanceof Double) ? object instanceof Float && (((Float)object).isInfinite() || ((Float)object).isNaN()) : ((Double)object).isInfinite() || ((Double)object).isNaN())) {
            throw new JSONException("JSON does not allow non-finite numbers.");
        }
    }

    public static String numberToString(Number number) throws JSONException {
        if (number != null) {
            JSONObject.testValidity(number);
            String string = number.toString();
            if (string.indexOf(46) > 0 && string.indexOf(101) < 0 && string.indexOf(69) < 0) {
                while (true) {
                    if (!string.endsWith("0")) {
                        if (!string.endsWith(".")) break;
                        string = string.substring(0, string.length() - 1);
                        break;
                    }
                    string = string.substring(0, string.length() - 1);
                }
            }
            return string;
        }
        throw new JSONException("Null pointer");
    }

    public static String quote(String string) {
        if (string != null && string.length() != 0) {
            char c = '\u0000';
            int n = string.length();
            StringBuffer stringBuffer = new StringBuffer(n + 4);
            stringBuffer.append('\"');
            int n2 = 0;
            while (true) {
                if (n2 >= n) {
                    stringBuffer.append('\"');
                    return stringBuffer.toString();
                }
                char c2 = c;
                c = string.charAt(n2);
                switch (c) {
                    default: {
                        if (!(c < ' ' || c >= '\u0080' && c < '\u00a0' || c >= '\u2000' && c < '\u2100')) {
                            stringBuffer.append(c);
                            break;
                        }
                        String string2 = "000" + Integer.toHexString(c);
                        stringBuffer.append("\\u" + string2.substring(string2.length() - 4));
                        break;
                    }
                    case '\r': {
                        stringBuffer.append("\\r");
                        break;
                    }
                    case '\f': {
                        stringBuffer.append("\\f");
                        break;
                    }
                    case '\n': {
                        stringBuffer.append("\\n");
                        break;
                    }
                    case '\t': {
                        stringBuffer.append("\\t");
                        break;
                    }
                    case '\b': {
                        stringBuffer.append("\\b");
                        break;
                    }
                    case '/': {
                        if (c2 == '<') {
                            stringBuffer.append('\\');
                        }
                        stringBuffer.append(c);
                        break;
                    }
                    case '\"': 
                    case '\\': {
                        stringBuffer.append('\\');
                        stringBuffer.append(c);
                    }
                }
                ++n2;
            }
        }
        return "\"\"";
    }

    static String valueToString(Object object) throws JSONException {
        if (object == null || object.equals(null)) {
            return "null";
        }
        if (object instanceof JSONString) {
            String string;
            try {
                string = ((JSONString)object).toJSONString();
            }
            catch (Exception exception) {
                throw new JSONException(exception);
            }
            if (string instanceof String) {
                return string;
            }
            throw new JSONException("Bad value from toJSONString: " + string);
        }
        if (object instanceof Number) {
            return JSONObject.numberToString((Number)object);
        }
        if (object instanceof Boolean || object instanceof JSONObject || object instanceof JSONArray) {
            return object.toString();
        }
        if (object instanceof Map) {
            return new JSONObject((Map)object).toString();
        }
        if (object instanceof Collection) {
            return new JSONArray((Collection)object).toString();
        }
        if (object.getClass().isArray()) {
            return new JSONArray(object).toString();
        }
        return JSONObject.quote(object.toString());
    }

    static String valueToString(Object object, int n, int n2) throws JSONException {
        if (object == null || object.equals(null)) {
            return "null";
        }
        try {
            String string;
            if (object instanceof JSONString && (string = ((JSONString)object).toJSONString()) instanceof String) {
                return string;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (object instanceof Number) {
            return JSONObject.numberToString((Number)object);
        }
        if (object instanceof Boolean) {
            return object.toString();
        }
        if (object instanceof JSONObject) {
            return ((JSONObject)object).toString(n, n2);
        }
        if (object instanceof JSONArray) {
            return ((JSONArray)object).toString(n, n2);
        }
        if (object instanceof Map) {
            return new JSONObject((Map)object).toString(n, n2);
        }
        if (object instanceof Collection) {
            return new JSONArray((Collection)object).toString(n, n2);
        }
        if (object.getClass().isArray()) {
            return new JSONArray(object).toString(n, n2);
        }
        return JSONObject.quote(object.toString());
    }

    public static Object stringToValue(String string) {
        if (string.equals("")) {
            return string;
        }
        if (string.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (string.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (string.equalsIgnoreCase("null")) {
            return NULL;
        }
        char c = string.charAt(0);
        if (c >= '0' && c <= '9' || c == '.' || c == '-' || c == '+') {
            if (c == '0') {
                if (string.length() > 2 && (string.charAt(1) == 'x' || string.charAt(1) == 'X')) {
                    try {
                        return new Integer(Integer.parseInt(string.substring(2), 16));
                    }
                    catch (Exception exception) {
                    }
                } else {
                    try {
                        return new Integer(Integer.parseInt(string, 8));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
            }
            try {
                return new Integer(string);
            }
            catch (Exception exception) {
                try {
                    return new Long(string);
                }
                catch (Exception exception2) {
                    try {
                        return new Double(string);
                    }
                    catch (Exception exception3) {
                        // empty catch block
                    }
                }
            }
        }
        return string;
    }

    public static String doubleToString(double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            String string = Double.toString(d);
            if (string.indexOf(46) > 0 && string.indexOf(101) < 0 && string.indexOf(69) < 0) {
                while (true) {
                    if (!string.endsWith("0")) {
                        if (!string.endsWith(".")) break;
                        string = string.substring(0, string.length() - 1);
                        break;
                    }
                    string = string.substring(0, string.length() - 1);
                }
            }
            return string;
        }
        return "null";
    }

    public static String[] getNames(Object object) {
        if (object != null) {
            Class<?> clazz = object.getClass();
            Field[] fieldArray = clazz.getFields();
            int n = fieldArray.length;
            if (n != 0) {
                String[] stringArray = new String[n];
                int n2 = 0;
                while (true) {
                    if (n2 >= n) {
                        return stringArray;
                    }
                    stringArray[n2] = fieldArray[n2].getName();
                    ++n2;
                }
            }
            return null;
        }
        return null;
    }
}

