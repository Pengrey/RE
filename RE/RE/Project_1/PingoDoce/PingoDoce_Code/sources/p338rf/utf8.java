package p338rf;

import java.io.EOFException;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p356sf.Buffer;

/* renamed from: rf.b */
/* loaded from: classes2.dex */
public final class utf8 {
    /* renamed from: a */
    public static final boolean m9738a(Buffer buffer) {
        long m14999j;
        Intrinsics.isThisObjectNull(buffer, "$this$isProbablyUtf8");
        try {
            Buffer buffer2 = new Buffer();
            m14999j = _Ranges.m14999j(buffer.size(), 64L);
            buffer.m8816H(buffer2, 0L, m14999j);
            for (int i = 0; i < 16; i++) {
                if (buffer2.mo8762Q()) {
                    return true;
                }
                int m8799e0 = buffer2.m8799e0();
                if (Character.isISOControl(m8799e0) && !Character.isWhitespace(m8799e0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
