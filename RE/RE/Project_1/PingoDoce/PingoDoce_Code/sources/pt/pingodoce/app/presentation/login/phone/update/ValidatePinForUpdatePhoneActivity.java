package pt.pingodoce.app.presentation.login.phone.update;

import androidx.lifecycle.AbstractC1423a;
import ci.C2136a;
import ci.C2146h;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import mk.ValidatePinForUpdatePhoneViewModel;
import p014aj.EnumC0170a;
import p014aj.PinActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import p489zc.C13780s;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData;

/* compiled from: ValidatePinForUpdatePhoneActivity.kt */
/* loaded from: classes2.dex */
public final class ValidatePinForUpdatePhoneActivity extends PinActivity {

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f24474j0;

    /* compiled from: ValidatePinForUpdatePhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.update.ValidatePinForUpdatePhoneActivity$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9300a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24475a;

        static {
            int[] iArr = new int[EnumC0170a.values().length];
            iArr[EnumC0170a.InvalidAuthentication.ordinal()] = 1;
            iArr[EnumC0170a.Authenticated.ordinal()] = 2;
            iArr[EnumC0170a.Undefined.ordinal()] = 3;
            f24475a = iArr;
        }
    }

    /* compiled from: ValidatePinForUpdatePhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.update.ValidatePinForUpdatePhoneActivity$b */
    /* loaded from: classes2.dex */
    static final class C9301b extends AbstractC6438m implements InterfaceC6097a {
        C9301b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ValidatePinForUpdatePhoneActivity.this.m11804K1(), ValidatePinForUpdatePhoneActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11807J0() {
        return C6450z.m20906b(ValidatePinForUpdatePhoneViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11805K0() {
        return new C9301b();
    }

    /* renamed from: K1 */
    public final ViewModelFactoryByInjection m11804K1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24474j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k1 */
    protected List m11803k1() {
        List m194j;
        m194j = C13780s.m194j(C2136a.f6171a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11802m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: z1 */
    protected void m11800z1(EnumC0170a enumC0170a) {
        Intrinsics.isThisObjectNull(enumC0170a, "state");
        int i = C9300a.f24475a[enumC0170a.ordinal()];
        if (i == 1) {
            m41677I1();
        } else if (i != 2) {
        } else {
            mk.CreatePhoneActivity.m18365a(this, (UpdatePhoneFlowData) ((ValidatePinForUpdatePhoneViewModel) m22758I0()).m34578S());
        }
    }
}
