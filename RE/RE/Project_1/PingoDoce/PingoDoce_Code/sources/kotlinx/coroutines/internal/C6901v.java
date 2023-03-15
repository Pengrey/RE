package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.internal.v */
/* loaded from: classes2.dex */
public final class C6901v<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f18360a;

    /* renamed from: b */
    private final boolean f18361b;

    /* renamed from: c */
    private final int f18362c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f18363d;

    /* renamed from: e */
    public static final C6902a f18364e = new C6902a(null);

    /* renamed from: h */
    public static final C6867h0 f18365h = new C6867h0("REMOVE_FROZEN");

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18366f = AtomicReferenceFieldUpdater.newUpdater(C6901v.class, Object.class, "_next");

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f18367g = AtomicLongFieldUpdater.newUpdater(C6901v.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    /* renamed from: kotlinx.coroutines.internal.v$a */
    /* loaded from: classes2.dex */
    public static final class C6902a {
        private C6902a() {
        }

        public /* synthetic */ C6902a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m19849a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m19848b(long j, int i) {
            return m19846d(j, 1073741823L) | (i << 0);
        }

        /* renamed from: c */
        public final long m19847c(long j, int i) {
            return m19846d(j, 1152921503533105152L) | (i << 30);
        }

        /* renamed from: d */
        public final long m19846d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    /* renamed from: kotlinx.coroutines.internal.v$b */
    /* loaded from: classes2.dex */
    public static final class C6903b {

        /* renamed from: a */
        public final int f18368a;

        public C6903b(int i) {
            this.f18368a = i;
        }
    }

    public C6901v(int i, boolean z) {
        this.f18360a = i;
        this.f18361b = z;
        int i2 = i - 1;
        this.f18362c = i2;
        this.f18363d = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final C6901v<E> m19859b(long j) {
        C6901v<E> c6901v = new C6901v<>(this.f18360a * 2, this.f18361b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f18362c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f18363d.get(i3 & i);
                if (obj == null) {
                    obj = new C6903b(i);
                }
                c6901v.f18363d.set(c6901v.f18362c & i, obj);
                i++;
            } else {
                c6901v._state = f18364e.m19846d(j, 1152921504606846976L);
                return c6901v;
            }
        }
    }

    /* renamed from: c */
    private final C6901v<E> m19858c(long j) {
        while (true) {
            C6901v<E> c6901v = (C6901v) this._next;
            if (c6901v != null) {
                return c6901v;
            }
            f18366f.compareAndSet(this, null, m19859b(j));
        }
    }

    /* renamed from: e */
    private final C6901v<E> m19856e(int i, E e) {
        Object obj = this.f18363d.get(this.f18362c & i);
        if ((obj instanceof C6903b) && ((C6903b) obj).f18368a == i) {
            this.f18363d.set(i & this.f18362c, e);
            return this;
        }
        return null;
    }

    /* renamed from: h */
    private final long m19853h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f18367g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C6901v<E> m19850k(int i, int i2) {
        long j;
        C6902a c6902a;
        int i3;
        do {
            j = this._state;
            c6902a = f18364e;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C10539l0.m7720a()) {
                if (!(i3 == i)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return m19852i();
            }
        } while (!f18367g.compareAndSet(this, j, c6902a.m19848b(j, i2)));
        this.f18363d.set(this.f18362c & i3, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m19860a(E r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.v$a r14 = kotlinx.coroutines.internal.C6901v.f18364e
            int r14 = r14.m19849a(r2)
            return r14
        L12:
            kotlinx.coroutines.internal.v$a r0 = kotlinx.coroutines.internal.C6901v.f18364e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f18362c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.f18361b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f18363d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.f18360a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.C6901v.f18367g
            long r11 = r0.m19847c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f18363d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L69:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L7c
            kotlinx.coroutines.internal.v r0 = r0.m19852i()
            kotlinx.coroutines.internal.v r0 = r0.m19856e(r9, r14)
            if (r0 != 0) goto L69
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6901v.m19860a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean m19857d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f18367g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m19855f() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean m19854g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C6901v<E> m19852i() {
        return m19858c(m19853h());
    }

    /* renamed from: j */
    public final Object m19851j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f18365h;
            }
            C6902a c6902a = f18364e;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f18362c;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f18363d.get(i3 & i);
            if (obj == null) {
                if (this.f18361b) {
                    return null;
                }
            } else if (obj instanceof C6903b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f18367g.compareAndSet(this, j, c6902a.m19848b(j, i4))) {
                    this.f18363d.set(this.f18362c & i, null);
                    return obj;
                } else if (this.f18361b) {
                    C6901v<E> c6901v = this;
                    do {
                        c6901v = c6901v.m19850k(i, i4);
                    } while (c6901v != null);
                    return obj;
                }
            }
        }
    }
}
