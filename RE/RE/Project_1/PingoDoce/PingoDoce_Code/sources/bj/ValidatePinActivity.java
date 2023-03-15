package bj;

import bj.ValidatePinViewModel;
import ci.C2137b;
import ci.C2138c;
import java.util.List;
import p014aj.PinActivity;
import p181jd.Intrinsics;
import p468yc.C13182l;
import p489zc.C13780s;
import pe.C8617d;

/* renamed from: bj.a */
/* loaded from: classes2.dex */
public abstract class ValidatePinActivity<ViewModel extends ValidatePinViewModel> extends PinActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: k1 */
    protected List m35136k1() {
        List m194j;
        m194j = C13780s.m194j(C2137b.f6172a, C2138c.f6173a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m35135m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }
}
