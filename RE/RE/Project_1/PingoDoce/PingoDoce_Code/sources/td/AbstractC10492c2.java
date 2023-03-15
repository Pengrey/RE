package td;

import kotlinx.coroutines.internal.C6893q;

/* renamed from: td.c2 */
/* loaded from: classes2.dex */
public abstract class AbstractC10492c2 extends AbstractC10505e0 {
    @Override // td.AbstractC10505e0
    /* renamed from: G0 */
    public AbstractC10505e0 mo7626G0(int i) {
        C6893q.m19888a(i);
        return this;
    }

    /* renamed from: H0 */
    public abstract AbstractC10492c2 mo7830H0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I0 */
    public final String m7829I0() {
        AbstractC10492c2 abstractC10492c2;
        AbstractC10492c2 m7619c = C10587w0.m7619c();
        if (this == m7619c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC10492c2 = m7619c.mo7830H0();
        } catch (UnsupportedOperationException unused) {
            abstractC10492c2 = null;
        }
        if (this == abstractC10492c2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // td.AbstractC10505e0
    public String toString() {
        String m7829I0 = m7829I0();
        if (m7829I0 == null) {
            return C10543m0.m7712a(this) + '@' + C10543m0.m7711b(this);
        }
        return m7829I0;
    }
}
