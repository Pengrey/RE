package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.AbstractC6864g;
import p181jd.Intrinsics;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.internal.g */
/* loaded from: classes2.dex */
public abstract class AbstractC6864g<N extends AbstractC6864g<N>> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18310a = AtomicReferenceFieldUpdater.newUpdater(AbstractC6864g.class, Object.class, "_next");

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18311b = AtomicReferenceFieldUpdater.newUpdater(AbstractC6864g.class, Object.class, "_prev");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    public AbstractC6864g(AbstractC6864g abstractC6864g) {
        this._prev = abstractC6864g;
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m19990a(AbstractC6864g abstractC6864g) {
        return abstractC6864g.m19986e();
    }

    /* renamed from: c */
    private final AbstractC6864g m19988c() {
        AbstractC6864g m19985f = m19985f();
        while (m19985f != null && m19985f.mo19999g()) {
            m19985f = (AbstractC6864g) m19985f._prev;
        }
        return m19985f;
    }

    /* renamed from: e */
    private final Object m19986e() {
        return this._next;
    }

    /* renamed from: h */
    private final AbstractC6864g m19983h() {
        if (!C10539l0.m7720a() || (!m19982i())) {
            AbstractC6864g m19987d = m19987d();
            Intrinsics.ifNullDoSomething(m19987d);
            while (m19987d.mo19999g()) {
                m19987d = m19987d.m19987d();
                Intrinsics.ifNullDoSomething(m19987d);
            }
            return m19987d;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void m19989b() {
        f18311b.lazySet(this, null);
    }

    /* renamed from: d */
    public final AbstractC6864g m19987d() {
        C6867h0 c6867h0;
        Object m19990a = m19990a(this);
        c6867h0 = C6862f.f18309a;
        if (m19990a == c6867h0) {
            return null;
        }
        return (AbstractC6864g) m19990a;
    }

    /* renamed from: f */
    public final AbstractC6864g m19985f() {
        return (AbstractC6864g) this._prev;
    }

    /* renamed from: g */
    public abstract boolean mo19999g();

    /* renamed from: i */
    public final boolean m19982i() {
        return m19987d() == null;
    }

    /* renamed from: j */
    public final void m19981j() {
        if (C10539l0.m7720a() && !mo19999g()) {
            throw new AssertionError();
        }
        if (C10539l0.m7720a() && !(!m19982i())) {
            throw new AssertionError();
        }
        while (true) {
            AbstractC6864g m19988c = m19988c();
            AbstractC6864g m19983h = m19983h();
            m19983h._prev = m19988c;
            if (m19988c != null) {
                m19988c._next = m19983h;
            }
            if (!m19983h.mo19999g() && (m19988c == null || !m19988c.mo19999g())) {
                return;
            }
        }
    }

    /* renamed from: k */
    public final boolean m19980k(AbstractC6864g abstractC6864g) {
        return f18310a.compareAndSet(this, null, abstractC6864g);
    }
}
