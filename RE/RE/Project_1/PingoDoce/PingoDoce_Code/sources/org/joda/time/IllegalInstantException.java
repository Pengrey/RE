package org.joda.time;

import com.github.aachartmodel.aainfographics.BuildConfig;
import org.joda.time.format.DateTimeFormat;

/* loaded from: classes2.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j, String str) {
        String str2;
        String print = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j));
        if (str != null) {
            str2 = " (" + str + ")";
        } else {
            str2 = BuildConfig.VERSION_NAME;
        }
        return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + print + str2;
    }

    public static boolean isIllegalInstant(Throwable th2) {
        if (th2 instanceof IllegalInstantException) {
            return true;
        }
        if (th2.getCause() == null || th2.getCause() == th2) {
            return false;
        }
        return isIllegalInstant(th2.getCause());
    }

    public IllegalInstantException(long j, String str) {
        super(createMessage(j, str));
    }
}
