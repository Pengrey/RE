package p275of;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: of.e */
/* loaded from: classes2.dex */
public final class C8065e {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final int m16994b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
