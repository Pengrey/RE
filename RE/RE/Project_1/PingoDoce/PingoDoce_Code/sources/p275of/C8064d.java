package p275of;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import p181jd.Intrinsics;

/* compiled from: AndroidLog.kt */
/* renamed from: of.d */
/* loaded from: classes2.dex */
public final class C8064d extends Handler {

    /* renamed from: a */
    public static final C8064d f20857a = new C8064d();

    private C8064d() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        int m16994b;
        Intrinsics.isThisObjectNull(logRecord, "record");
        AndroidLog androidLog = AndroidLog.f20854a;
        String loggerName = logRecord.getLoggerName();
        Intrinsics.checkIfNull(loggerName, "record.loggerName");
        m16994b = C8065e.m16994b(logRecord);
        String message = logRecord.getMessage();
        Intrinsics.checkIfNull(message, "record.message");
        androidLog.m16999a(loggerName, m16994b, message, logRecord.getThrown());
    }
}
