package td;

import kotlinx.coroutines.internal.C6851a;
import kotlinx.coroutines.internal.C6893q;

/* compiled from: EventLoop.common.kt */
/* renamed from: td.c1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10491c1 extends AbstractC10505e0 {

    /* renamed from: A */
    private C6851a<AbstractC10579u0<?>> f27216A;

    /* renamed from: y */
    private long f27217y;

    /* renamed from: z */
    private boolean f27218z;

    /* renamed from: I0 */
    public static /* synthetic */ void m7841I0(AbstractC10491c1 abstractC10491c1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC10491c1.m7842H0(z);
    }

    /* renamed from: J0 */
    private final long m7840J0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m7836N0(AbstractC10491c1 abstractC10491c1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC10491c1.m7837M0(z);
    }

    @Override // td.AbstractC10505e0
    /* renamed from: G0 */
    public final AbstractC10505e0 mo7626G0(int i) {
        C6893q.m19888a(i);
        return this;
    }

    /* renamed from: H0 */
    public final void m7842H0(boolean z) {
        long m7840J0 = this.f27217y - m7840J0(z);
        this.f27217y = m7840J0;
        if (m7840J0 > 0) {
            return;
        }
        if (C10539l0.m7720a()) {
            if (!(this.f27217y == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f27218z) {
            mo7708T0();
        }
    }

    /* renamed from: K0 */
    public final void m7839K0(AbstractC10579u0<?> abstractC10579u0) {
        C6851a<AbstractC10579u0<?>> c6851a = this.f27216A;
        if (c6851a == null) {
            c6851a = new C6851a<>();
            this.f27216A = c6851a;
        }
        c6851a.m20014a(abstractC10579u0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L0 */
    public long mo7838L0() {
        C6851a<AbstractC10579u0<?>> c6851a = this.f27216A;
        return (c6851a == null || c6851a.m20012c()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: M0 */
    public final void m7837M0(boolean z) {
        this.f27217y += m7840J0(z);
        if (z) {
            return;
        }
        this.f27218z = true;
    }

    /* renamed from: O0 */
    public final boolean m7835O0() {
        return this.f27217y >= m7840J0(true);
    }

    /* renamed from: P0 */
    public final boolean m7834P0() {
        C6851a<AbstractC10579u0<?>> c6851a = this.f27216A;
        if (c6851a != null) {
            return c6851a.m20012c();
        }
        return true;
    }

    /* renamed from: Q0 */
    public long mo7833Q0() {
        return !m7832R0() ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: R0 */
    public final boolean m7832R0() {
        AbstractC10579u0<?> m20011d;
        C6851a<AbstractC10579u0<?>> c6851a = this.f27216A;
        if (c6851a == null || (m20011d = c6851a.m20011d()) == null) {
            return false;
        }
        m20011d.run();
        return true;
    }

    /* renamed from: S0 */
    public boolean m7831S0() {
        return false;
    }

    /* renamed from: T0 */
    public void mo7708T0() {
    }
}
