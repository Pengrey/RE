package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlinx.coroutines.internal.C6867h0;
import p181jd.Intrinsics;
import p424wd.AbstractC11620c;
import p424wd.C11619b;
import p468yc.C13183m;
import p468yc.C13195u;
import td.C10534k;
import td.C10539l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.a0 */
/* loaded from: classes2.dex */
public final class C6779a0 extends AbstractC11620c {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f18149a = AtomicReferenceFieldUpdater.newUpdater(C6779a0.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean mo20033c(C6845y c6845y) {
        C6867h0 c6867h0;
        if (this._state != null) {
            return false;
        }
        c6867h0 = C6847z.f18293a;
        this._state = c6867h0;
        return true;
    }

    /* renamed from: d */
    public final Object m20152d(InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        C6867h0 c6867h0;
        Object m34636d;
        Object m34636d2;
        C6867h0 c6867h02;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        if (!C10539l0.m7720a() || (!(this._state instanceof C10534k))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18149a;
            c6867h0 = C6847z.f18293a;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c6867h0, c10534k)) {
                if (C10539l0.m7720a()) {
                    Object obj = this._state;
                    c6867h02 = C6847z.f18294b;
                    if (!(obj == c6867h02)) {
                        throw new AssertionError();
                    }
                }
                C13183m.C13184a c13184a = C13183m.f34143w;
                c10534k.resumeWith(C13183m.m1458a(C13195u.f34156a));
            }
            Object m7728t = c10534k.m7728t();
            m34636d = C2116d.m34636d();
            if (m7728t == m34636d) {
                DebugProbes.m20186c(interfaceC1886d);
            }
            m34636d2 = C2116d.m34636d();
            return m7728t == m34636d2 ? m7728t : C13195u.f34156a;
        }
        throw new AssertionError();
    }

    /* renamed from: e */
    public InterfaceC1886d[] mo20032d(C6845y c6845y) {
        this._state = null;
        return C11619b.f29708a;
    }

    /* renamed from: f */
    public final void m20150f() {
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        C6867h0 c6867h03;
        C6867h0 c6867h04;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            c6867h0 = C6847z.f18294b;
            if (obj == c6867h0) {
                return;
            }
            c6867h02 = C6847z.f18293a;
            if (obj == c6867h02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18149a;
                c6867h03 = C6847z.f18294b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c6867h03)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18149a;
                c6867h04 = C6847z.f18293a;
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c6867h04)) {
                    C13183m.C13184a c13184a = C13183m.f34143w;
                    ((C10534k) obj).resumeWith(C13183m.m1458a(C13195u.f34156a));
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean m20149g() {
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18149a;
        c6867h0 = C6847z.f18293a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, c6867h0);
        Intrinsics.ifNullDoSomething(andSet);
        if (!C10539l0.m7720a() || (!(andSet instanceof C10534k))) {
            c6867h02 = C6847z.f18294b;
            return andSet == c6867h02;
        }
        throw new AssertionError();
    }
}
