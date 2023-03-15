package org.joda.time.p282tz;

/* renamed from: org.joda.time.tz.ZoneInfoLogger */
/* loaded from: classes2.dex */
public class ZoneInfoLogger {
    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() { // from class: org.joda.time.tz.ZoneInfoLogger.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    public static void set(boolean z) {
        cVerbose.set(Boolean.valueOf(z));
    }

    public static boolean verbose() {
        return cVerbose.get().booleanValue();
    }
}
