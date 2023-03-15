package pt.pingodoce.app.presentation.account.loggedAccount.settings.pin;

import androidx.lifecycle.AbstractC1423a;
import bj.ValidatePinActivity;
import ci.InterfaceC2154o;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p014aj.EnumC0170a;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p406vh.ChangePinViewModel;
import pt.pingodoce.app.data.local.flows.ValidatePinFlowData;

/* compiled from: ChangePinActivity.kt */
/* loaded from: classes2.dex */
public final class ChangePinActivity extends ValidatePinActivity {

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f23616j0;

    /* compiled from: ChangePinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ChangePinActivity$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8932a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23617a;

        static {
            int[] iArr = new int[EnumC0170a.values().length];
            iArr[EnumC0170a.InvalidAuthentication.ordinal()] = 1;
            iArr[EnumC0170a.Authenticated.ordinal()] = 2;
            iArr[EnumC0170a.Undefined.ordinal()] = 3;
            f23617a = iArr;
        }
    }

    /* compiled from: ChangePinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ChangePinActivity$b */
    /* loaded from: classes2.dex */
    static final class C8933b extends AbstractC6438m implements InterfaceC6097a {
        C8933b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ChangePinActivity.this.m13092K1(), ChangePinActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13094J0() {
        return C6450z.m20906b(ChangePinViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13093K0() {
        return new C8933b();
    }

    /* renamed from: K1 */
    public final ViewModelFactoryByInjection m13092K1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23616j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: l1 */
    protected void m13091l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        setResult(-1);
    }

    /* renamed from: z1 */
    protected void m13090z1(EnumC0170a enumC0170a) {
        Intrinsics.isThisObjectNull(enumC0170a, "state");
        int i = C8932a.f23617a[enumC0170a.ordinal()];
        if (i == 1) {
            m41677I1();
        } else if (i != 2) {
        } else {
            p406vh.ReplacePinActivity.m5350a(this, ((ValidatePinFlowData) ((ChangePinViewModel) m22758I0()).m34578S()).m14681a());
        }
    }
}
