package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.C6867h0;

/* renamed from: kotlinx.coroutines.sync.e */
/* loaded from: classes2.dex */
public final class C6939e {

    /* renamed from: a */
    private static final C6867h0 f18437a;

    /* renamed from: b */
    private static final C6867h0 f18438b;

    /* renamed from: c */
    private static final C6867h0 f18439c;

    /* renamed from: d */
    private static final C6929b f18440d;

    /* renamed from: e */
    private static final C6929b f18441e;

    static {
        new C6867h0("LOCK_FAIL");
        f18437a = new C6867h0("UNLOCK_FAIL");
        C6867h0 c6867h0 = new C6867h0("LOCKED");
        f18438b = c6867h0;
        C6867h0 c6867h02 = new C6867h0("UNLOCKED");
        f18439c = c6867h02;
        f18440d = new C6929b(c6867h0);
        f18441e = new C6929b(c6867h02);
    }

    /* renamed from: a */
    public static final InterfaceC6930c m19760a(boolean z) {
        return new C6932d(z);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC6930c m19759b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m19760a(z);
    }
}
