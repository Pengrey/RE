package td;

import p181jd.Intrinsics;

/* renamed from: td.z1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10601z1 extends AbstractC10599z implements InterfaceC10595y0, InterfaceC10548n1 {

    /* renamed from: z */
    public C10479a2 f27311z;

    /* renamed from: B */
    public final C10479a2 m7586B() {
        C10479a2 c10479a2 = this.f27311z;
        if (c10479a2 != null) {
            return c10479a2;
        }
        Intrinsics.throwUninitPropException("job");
        return null;
    }

    /* renamed from: D */
    public final void m7585D(C10479a2 c10479a2) {
        this.f27311z = c10479a2;
    }

    /* renamed from: a */
    public boolean mo7698a() {
        return true;
    }

    /* renamed from: b */
    public void mo6823b() {
        m7586B().m7907K0(this);
    }

    /* renamed from: g */
    public C10503d2 mo7697g() {
        return null;
    }

    public String toString() {
        return C10543m0.m7712a(this) + '@' + C10543m0.m7711b(this) + "[job@" + C10543m0.m7711b(m7586B()) + ']';
    }
}
