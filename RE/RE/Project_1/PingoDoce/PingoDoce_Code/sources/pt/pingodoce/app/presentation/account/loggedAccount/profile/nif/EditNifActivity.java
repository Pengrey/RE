package pt.pingodoce.app.presentation.account.loggedAccount.profile.nif;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import mh.EditNifViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import p495zi.NifActivity;

/* compiled from: EditNifActivity.kt */
/* loaded from: classes2.dex */
public final class EditNifActivity extends NifActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23464g0;

    /* compiled from: EditNifActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.nif.EditNifActivity$a */
    /* loaded from: classes2.dex */
    static final class C8872a extends AbstractC6438m implements InterfaceC6097a {
        C8872a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13368t1 = EditNifActivity.this.m13368t1();
            EditNifActivity editNifActivity = EditNifActivity.this;
            return m13368t1.m20377b(editNifActivity, editNifActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13372J0() {
        return C6450z.m20906b(EditNifViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13371K0() {
        return new C8872a();
    }

    /* renamed from: m1 */
    public void m13370m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: n */
    public boolean m13369n() {
        return true;
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m13368t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23464g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
