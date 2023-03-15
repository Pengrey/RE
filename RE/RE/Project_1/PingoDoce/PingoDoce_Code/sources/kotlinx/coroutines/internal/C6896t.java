package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p181jd.C6443s;
import p181jd.Intrinsics;
import td.C10543m0;

/* renamed from: kotlinx.coroutines.internal.t */
/* loaded from: classes2.dex */
public class C6896t {

    /* renamed from: w */
    static final /* synthetic */ AtomicReferenceFieldUpdater f18354w = AtomicReferenceFieldUpdater.newUpdater(C6896t.class, Object.class, "_next");

    /* renamed from: x */
    static final /* synthetic */ AtomicReferenceFieldUpdater f18355x = AtomicReferenceFieldUpdater.newUpdater(C6896t.class, Object.class, "_prev");

    /* renamed from: y */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18356y = AtomicReferenceFieldUpdater.newUpdater(C6896t.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.internal.t$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6897a extends AbstractC6855c {

        /* renamed from: b */
        public final C6896t f18357b;

        /* renamed from: c */
        public C6896t f18358c;

        public AbstractC6897a(C6896t c6896t) {
            this.f18357b = c6896t;
        }

        /* renamed from: h */
        public void mo19763d(C6896t c6896t, Object obj) {
            boolean z = obj == null;
            C6896t c6896t2 = z ? this.f18357b : this.f18358c;
            if (c6896t2 != null && C6896t.f18354w.compareAndSet(c6896t, this, c6896t2) && z) {
                C6896t c6896t3 = this.f18357b;
                C6896t c6896t4 = this.f18358c;
                Intrinsics.ifNullDoSomething(c6896t4);
                C6896t.m19882h(c6896t3, c6896t4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.internal.t$b */
    /* loaded from: classes2.dex */
    public static final class C6898b extends AbstractC6852a0 {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.internal.t$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6899c extends C6443s {
        C6899c(Object obj) {
            super(obj, C10543m0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return C10543m0.m7712a(this.f18132x);
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ void m19882h(C6896t c6896t, C6896t c6896t2) {
        c6896t.m19876n(c6896t2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (kotlinx.coroutines.internal.LockFreeLinkedList.f18354w.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.C7221b0) r4).f18301a) != false) goto L23;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlinx.coroutines.internal.C6896t m19878l(kotlinx.coroutines.internal.AbstractC6852a0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.t r0 = (kotlinx.coroutines.internal.C6896t) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C6896t.f18355x
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.mo19885u()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.AbstractC6852a0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.AbstractC6852a0) r0
            boolean r0 = r8.m20010b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.a0 r4 = (kotlinx.coroutines.internal.AbstractC6852a0) r4
            r4.mo20008c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C6854b0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C6896t.f18354w
            kotlinx.coroutines.internal.b0 r4 = (kotlinx.coroutines.internal.C6854b0) r4
            kotlinx.coroutines.internal.t r4 = r4.f18301a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.t r2 = (kotlinx.coroutines.internal.C6896t) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.t r3 = (kotlinx.coroutines.internal.C6896t) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6896t.m19878l(kotlinx.coroutines.internal.a0):kotlinx.coroutines.internal.t");
    }

    /* renamed from: m */
    private final C6896t m19877m(C6896t c6896t) {
        while (c6896t.mo19885u()) {
            c6896t = (C6896t) c6896t._prev;
        }
        return c6896t;
    }

    /* renamed from: n */
    private final void m19876n(C6896t c6896t) {
        C6896t c6896t2;
        do {
            c6896t2 = (C6896t) c6896t._prev;
            if (m19875o() != c6896t) {
                return;
            }
        } while (!f18355x.compareAndSet(c6896t, c6896t2, this));
        if (mo19885u()) {
            c6896t.m19878l(null);
        }
    }

    /* renamed from: y */
    private final C6854b0 m19867y() {
        C6854b0 c6854b0 = (C6854b0) this._removedRef;
        if (c6854b0 == null) {
            C6854b0 c6854b02 = new C6854b0(this);
            f18356y.lazySet(this, c6854b02);
            return c6854b02;
        }
        return c6854b0;
    }

    /* renamed from: i */
    public final void m19881i(C6896t c6896t) {
        do {
        } while (!m19873r().m19880j(c6896t, this));
    }

    /* renamed from: j */
    public final boolean m19880j(C6896t c6896t, C6896t c6896t2) {
        f18355x.lazySet(c6896t, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18354w;
        atomicReferenceFieldUpdater.lazySet(c6896t, c6896t2);
        if (atomicReferenceFieldUpdater.compareAndSet(this, c6896t2, c6896t)) {
            c6896t.m19876n(c6896t2);
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m19879k(C6896t c6896t) {
        f18355x.lazySet(c6896t, this);
        f18354w.lazySet(c6896t, this);
        while (m19875o() == this) {
            if (f18354w.compareAndSet(this, this, c6896t)) {
                c6896t.m19876n(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final Object m19875o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC6852a0)) {
                return obj;
            }
            ((AbstractC6852a0) obj).mo20008c(this);
        }
    }

    /* renamed from: p */
    public final C6896t m19874p() {
        return C6895s.m19883b(m19875o());
    }

    /* renamed from: r */
    public final C6896t m19873r() {
        C6896t m19878l = m19878l(null);
        return m19878l == null ? m19877m((C6896t) this._prev) : m19878l;
    }

    /* renamed from: s */
    public final void m19872s() {
        ((C6854b0) m19875o()).f18301a.m19871t();
    }

    /* renamed from: t */
    public final void m19871t() {
        C6896t c6896t = this;
        while (true) {
            Object m19875o = c6896t.m19875o();
            if (m19875o instanceof C6854b0) {
                c6896t = ((C6854b0) m19875o).f18301a;
            } else {
                c6896t.m19878l(null);
                return;
            }
        }
    }

    public String toString() {
        return new C6899c(this) + '@' + C10543m0.m7711b(this);
    }

    /* renamed from: u */
    public boolean mo19885u() {
        return m19875o() instanceof C6854b0;
    }

    /* renamed from: v */
    public boolean mo5634v() {
        return m19868x() == null;
    }

    /* renamed from: w */
    public final C6896t m19869w() {
        while (true) {
            C6896t c6896t = (C6896t) m19875o();
            if (c6896t == this) {
                return null;
            }
            if (c6896t.mo5634v()) {
                return c6896t;
            }
            c6896t.m19872s();
        }
    }

    /* renamed from: x */
    public final C6896t m19868x() {
        Object m19875o;
        C6896t c6896t;
        do {
            m19875o = m19875o();
            if (m19875o instanceof C6854b0) {
                return ((C6854b0) m19875o).f18301a;
            }
            if (m19875o == this) {
                return (C6896t) m19875o;
            }
            c6896t = (C6896t) m19875o;
        } while (!f18354w.compareAndSet(this, m19875o, c6896t.m19867y()));
        c6896t.m19878l(null);
        return null;
    }

    /* renamed from: z */
    public final int m19866z(C6896t c6896t, C6896t c6896t2, AbstractC6897a abstractC6897a) {
        f18355x.lazySet(c6896t, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18354w;
        atomicReferenceFieldUpdater.lazySet(c6896t, c6896t2);
        abstractC6897a.f18358c = c6896t2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, c6896t2, abstractC6897a)) {
            return abstractC6897a.mo20008c(this) == null ? 1 : 2;
        }
        return 0;
    }
}
