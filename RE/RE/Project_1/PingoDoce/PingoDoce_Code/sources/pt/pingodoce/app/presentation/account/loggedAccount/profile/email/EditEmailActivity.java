package pt.pingodoce.app.presentation.account.loggedAccount.profile.email;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p224lh.EditEmailViewModel;
import p278oi.EmailActivity;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;

/* compiled from: EditEmailActivity.kt */
/* loaded from: classes2.dex */
public final class EditEmailActivity extends EmailActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23462g0;

    /* compiled from: EditEmailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.email.EditEmailActivity$a */
    /* loaded from: classes2.dex */
    static final class C8871a extends AbstractC6438m implements InterfaceC6097a {
        C8871a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13374t1 = EditEmailActivity.this.m13374t1();
            EditEmailActivity editEmailActivity = EditEmailActivity.this;
            return m13374t1.m20377b(editEmailActivity, editEmailActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13378J0() {
        return C6450z.m20906b(EditEmailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13377K0() {
        return new C8871a();
    }

    /* renamed from: m1 */
    public void m13376m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: n */
    public boolean m13375n() {
        return true;
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m13374t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23462g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
