/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package org.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import net.runelite.mapping.Implements;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Implements(value="JSONTokener")
public class JSONTokener {
    boolean useLastChar;
    int index;
    Reader reader;
    char lastChar;

    public JSONTokener(String string) {
        this(new StringReader(string));
    }

    public JSONTokener(Reader reader) {
        this.reader = reader.markSupported() ? reader : new BufferedReader(reader);
        this.useLastChar = false;
        this.index = 0;
    }

    public char nextClean() throws JSONException {
        char c;
        while ((c = this.next()) != '\u0000' && c <= ' ') {
        }
        return c;
    }

    public char next() throws JSONException {
        int n;
        if (this.useLastChar) {
            this.useLastChar = false;
            if (this.lastChar != '\u0000') {
                ++this.index;
            }
            return this.lastChar;
        }
        try {
            n = this.reader.read();
        }
        catch (IOException iOException) {
            throw new JSONException(iOException);
        }
        if (n <= 0) {
            this.lastChar = '\u0000';
            return '\u0000';
        }
        ++this.index;
        this.lastChar = (char)n;
        return this.lastChar;
    }

    public String nextString(char c) throws JSONException {
        StringBuffer stringBuffer = new StringBuffer();
        block13: while (true) {
            char c2 = this.next();
            switch (c2) {
                default: {
                    if (c2 != c) {
                        stringBuffer.append(c2);
                        continue block13;
                    }
                    return stringBuffer.toString();
                }
                case '\\': {
                    c2 = this.next();
                    switch (c2) {
                        default: {
                            stringBuffer.append(c2);
                            continue block13;
                        }
                        case 'x': {
                            stringBuffer.append((char)Integer.parseInt(this.next(2), 16));
                            continue block13;
                        }
                        case 'u': {
                            stringBuffer.append((char)Integer.parseInt(this.next(4), 16));
                            continue block13;
                        }
                        case 'r': {
                            stringBuffer.append('\r');
                            continue block13;
                        }
                        case 'f': {
                            stringBuffer.append('\f');
                            continue block13;
                        }
                        case 'n': {
                            stringBuffer.append('\n');
                            continue block13;
                        }
                        case 't': {
                            stringBuffer.append('\t');
                            continue block13;
                        }
                        case 'b': 
                    }
                    stringBuffer.append('\b');
                    continue block13;
                }
                case '\u0000': 
                case '\n': 
                case '\r': 
            }
            break;
        }
        throw this.syntaxError("Unterminated string");
    }

    public String toString() {
        return " at character " + this.index;
    }

    public void back() throws JSONException {
        if (!this.useLastChar && this.index > 0) {
            --this.index;
            this.useLastChar = true;
            return;
        }
        throw new JSONException("Stepping back two steps is not supported");
    }

    public JSONException syntaxError(String string) {
        return new JSONException(string + this.toString());
    }

    public String next(int n) throws JSONException {
        if (n == 0) {
            return "";
        }
        char[] cArray = new char[n];
        int n2 = 0;
        if (this.useLastChar) {
            this.useLastChar = false;
            cArray[0] = this.lastChar;
            n2 = 1;
        }
        try {
            int n3;
            while (n2 < n && (n3 = this.reader.read(cArray, n2, n - n2)) != -1) {
                n2 += n3;
            }
        }
        catch (IOException iOException) {
            throw new JSONException(iOException);
        }
        this.index += n2;
        if (n2 < n) {
            throw this.syntaxError("Substring bounds error");
        }
        this.lastChar = cArray[n - 1];
        return new String(cArray);
    }

    public Object nextValue() throws JSONException {
        char c = this.nextClean();
        switch (c) {
            default: {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    if (c < ' ' || ",:]}/\\\"[{;=#".indexOf(c) >= 0) {
                        this.back();
                        String string = stringBuffer.toString().trim();
                        if (!string.equals("")) {
                            return JSONObject.stringToValue(string);
                        }
                        throw this.syntaxError("Missing value");
                    }
                    stringBuffer.append(c);
                    c = this.next();
                }
            }
            case '(': 
            case '[': {
                this.back();
                return new JSONArray(this);
            }
            case '{': {
                this.back();
                return new JSONObject(this);
            }
            case '\"': 
            case '\'': 
        }
        return this.nextString(c);
    }

    public String nextTo(String string) throws JSONException {
        char c;
        StringBuffer stringBuffer = new StringBuffer();
        while (string.indexOf(c = this.next()) < 0 && c != '\u0000' && c != '\n' && c != '\r') {
            stringBuffer.append(c);
        }
        if (c != '\u0000') {
            this.back();
        }
        return stringBuffer.toString().trim();
    }

    public boolean more() throws JSONException {
        char c = this.next();
        if (c != '\u0000') {
            this.back();
            return true;
        }
        return false;
    }

    public char next(char c) throws JSONException {
        char c2 = this.next();
        if (c2 == c) {
            return c2;
        }
        throw this.syntaxError("Expected '" + c + "' and instead saw '" + c2 + "'");
    }

    public String nextTo(char c) throws JSONException {
        char c2;
        StringBuffer stringBuffer = new StringBuffer();
        while ((c2 = this.next()) != c && c2 != '\u0000' && c2 != '\n' && c2 != '\r') {
            stringBuffer.append(c2);
        }
        if (c2 != '\u0000') {
            this.back();
        }
        return stringBuffer.toString().trim();
    }

    public char skipTo(char c) throws JSONException {
        char c2;
        try {
            int n = this.index;
            this.reader.mark(Integer.MAX_VALUE);
            do {
                if ((c2 = this.next()) != '\u0000') continue;
                this.reader.reset();
                this.index = n;
                return c2;
            } while (c2 != c);
        }
        catch (IOException iOException) {
            throw new JSONException(iOException);
        }
        this.back();
        return c2;
    }

    public static int dehexchar(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 55;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 87;
        }
        return -1;
    }
}

