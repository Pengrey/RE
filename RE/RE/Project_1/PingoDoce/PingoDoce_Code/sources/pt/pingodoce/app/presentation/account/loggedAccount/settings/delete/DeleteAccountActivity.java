package pt.pingodoce.app.presentation.account.loggedAccount.settings.delete;

import androidx.lifecycle.AbstractC1423a;
import bj.ValidatePinActivity;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p014aj.EnumC0170a;
import p124gk.SplashActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p277oh.DeleteAccountViewModel;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import p494zh.AbstractC13816c;
import p494zh.C13877n0;

/* compiled from: DeleteAccountActivity.kt */
/* loaded from: classes2.dex */
public final class DeleteAccountActivity extends ValidatePinActivity {

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f23508j0;

    /* compiled from: DeleteAccountActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.delete.DeleteAccountActivity$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8889a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23509a;

        static {
            int[] iArr = new int[EnumC0170a.values().length];
            iArr[EnumC0170a.InvalidAuthentication.ordinal()] = 1;
            iArr[EnumC0170a.Authenticated.ordinal()] = 2;
            iArr[EnumC0170a.Undefined.ordinal()] = 3;
            f23509a = iArr;
        }
    }

    /* compiled from: DeleteAccountActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.delete.DeleteAccountActivity$b */
    /* loaded from: classes2.dex */
    static final class C8890b extends AbstractC6438m implements InterfaceC6097a {
        C8890b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(DeleteAccountActivity.this.m13291K1(), DeleteAccountActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13293J0() {
        return C6450z.m20906b(DeleteAccountViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13292K0() {
        return new C8890b();
    }

    /* renamed from: K1 */
    public final ViewModelFactoryByInjection m13291K1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23508j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: m1 */
    public void m13290m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        super.m35135m1(c13182l);
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13877n0.f34992a)) {
            SplashActivity.m23306c(this);
        }
    }

    /* renamed from: z1 */
    protected void m13289z1(EnumC0170a enumC0170a) {
        Intrinsics.isThisObjectNull(enumC0170a, "state");
        int i = C8889a.f23509a[enumC0170a.ordinal()];
        if (i == 1) {
            m41677I1();
        } else if (i != 2) {
        } else {
            ((DeleteAccountViewModel) m22758I0()).m16952d1();
        }
    }
}
