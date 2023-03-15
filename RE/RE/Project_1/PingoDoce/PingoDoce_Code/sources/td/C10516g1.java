package td;

import kotlinx.coroutines.internal.C6867h0;

/* compiled from: EventLoop.common.kt */
/* renamed from: td.g1 */
/* loaded from: classes2.dex */
public final class C10516g1 {

    /* renamed from: a */
    private static final C6867h0 f27239a = new C6867h0("REMOVED_TASK");

    /* renamed from: b */
    private static final C6867h0 f27240b = new C6867h0("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m7786c(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
