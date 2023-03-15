package p275of;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import nf.C7705b;
import p107ff.OkHttpClient;
import p181jd.Intrinsics;
import p182jf.TaskRunner;
import p489zc.C13769l0;
import sd.C10171u;
import sd._Strings;

/* renamed from: of.c */
/* loaded from: classes2.dex */
public final class AndroidLog {

    /* renamed from: a */
    public static final AndroidLog f20854a = new AndroidLog();

    /* renamed from: b */
    private static final CopyOnWriteArraySet f20855b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private static final Map f20856c;

    static {
        Map m324o;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = OkHttpClient.class.getPackage();
        String name = r1 == null ? null : r1.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        Intrinsics.checkIfNull(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C7705b.class.getName();
        Intrinsics.checkIfNull(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        Intrinsics.checkIfNull(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        m324o = C13769l0.m324o(linkedHashMap);
        f20856c = m324o;
    }

    private AndroidLog() {
    }

    /* renamed from: c */
    private final void m16997c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f20855b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C8064d.f20857a);
        }
    }

    /* renamed from: d */
    private final String m16996d(String str) {
        String m8865Q0;
        String str2 = (String) f20856c.get(str);
        if (str2 == null) {
            m8865Q0 = _Strings.m8865Q0(str, 23);
            return m8865Q0;
        }
        return str2;
    }

    /* renamed from: a */
    public final void m16999a(String str, int i, String str2, Throwable th2) {
        int m8906T;
        int min;
        Intrinsics.isThisObjectNull(str, "loggerName");
        Intrinsics.isThisObjectNull(str2, "message");
        String m16996d = m16996d(str);
        if (Log.isLoggable(m16996d, i)) {
            if (th2 != null) {
                str2 = str2 + '\n' + ((Object) Log.getStackTraceString(th2));
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                m8906T = C10171u.m8906T(str2, '\n', i2, false, 4, null);
                if (m8906T == -1) {
                    m8906T = length;
                }
                while (true) {
                    min = Math.min(m8906T, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, m16996d, substring);
                    if (min >= m8906T) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m16998b() {
        for (Map.Entry entry : f20856c.entrySet()) {
            m16997c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
