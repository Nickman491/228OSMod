package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fx")
class class139
implements Callable {
    @ObfuscatedSignature(descriptor="Lfl;")
    final /* synthetic */ class144 this$0;
    final /* synthetic */ int val$workStart;
    final /* synthetic */ int val$workEnd;
    @ObfuscatedSignature(descriptor="[Lfg;")
    final /* synthetic */ class135[] val$curveLoadJobs;

    @ObfuscatedSignature(descriptor="(Lfl;II[Lfg;)V")
    class139(class144 class1442, int n, int n2, class135[] class135Array) {
        this.this$0 = class1442;
        this.val$workStart = n;
        this.val$workEnd = n2;
        this.val$curveLoadJobs = class135Array;
    }

    public Object call() {
        int n = this.val$workStart;
        while (n < this.val$workEnd) {
            this.val$curveLoadJobs[n].call();
            ++n;
        }
        return null;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Ljava/util/Date;I)Z", garbageValue="-1573591192")
    static boolean method3500(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1) - 13);
        calendar.set(5, calendar.get(5) + 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date date2 = calendar.getTime();
        return date.before(date2);
    }
}

