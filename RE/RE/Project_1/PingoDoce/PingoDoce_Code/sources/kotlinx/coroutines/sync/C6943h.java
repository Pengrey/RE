package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6869i0;

/* renamed from: kotlinx.coroutines.sync.h */
/* loaded from: classes2.dex */
public final class C6943h {

    /* renamed from: a */
    private static final int f18450a = C6869i0.m19960f("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b */
    private static final C6867h0 f18451b = new C6867h0("PERMIT");

    /* renamed from: c */
    private static final C6867h0 f18452c = new C6867h0("TAKEN");

    /* renamed from: d */
    private static final C6867h0 f18453d = new C6867h0("BROKEN");

    /* renamed from: e */
    private static final C6867h0 f18454e = new C6867h0("CANCELLED");

    /* renamed from: f */
    private static final int f18455f = C6869i0.m19960f("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* renamed from: a */
    public static final InterfaceC6940f m19745a(int i, int i2) {
        return new C6941g(i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC6940f m19744b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m19745a(i, i2);
    }

    /* renamed from: j */
    public static final C6944i m19736j(long j, C6944i c6944i) {
        return new C6944i(j, c6944i, 0);
    }
}
