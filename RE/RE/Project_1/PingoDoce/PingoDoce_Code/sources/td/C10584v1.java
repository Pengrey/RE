package td;

/* renamed from: td.v1 */
/* loaded from: classes2.dex */
public class C10584v1 extends C10479a2 implements InterfaceC10582v {

    /* renamed from: x */
    private final boolean f27292x;

    public C10584v1(InterfaceC10574t1 interfaceC10574t1) {
        super(true);
        m7882n0(interfaceC10574t1);
        this.f27292x = m7631W0();
    }

    /* renamed from: W0 */
    private final boolean m7631W0() {
        C10479a2 m7586B;
        InterfaceC10554p m7888h0 = m7888h0();
        C10559q c10559q = m7888h0 instanceof C10559q ? (C10559q) m7888h0 : null;
        if (c10559q != null && (m7586B = c10559q.m7586B()) != null) {
            while (!m7586B.mo7630Z()) {
                InterfaceC10554p m7888h02 = m7586B.m7888h0();
                C10559q c10559q2 = m7888h02 instanceof C10559q ? (C10559q) m7888h02 : null;
                if (c10559q2 != null) {
                    m7586B = c10559q2.m7586B();
                    if (m7586B == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // td.InterfaceC10582v
    /* renamed from: L */
    public boolean mo7632L(Throwable th2) {
        return m7873w0(new C10590x(th2, false, 2, null));
    }

    @Override // td.C10479a2
    /* renamed from: Z */
    public boolean mo7630Z() {
        return this.f27292x;
    }

    @Override // td.C10479a2
    /* renamed from: c0 */
    public boolean mo7629c0() {
        return true;
    }
}
