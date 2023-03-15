package pt.pingodoce.app.presentation.account.loggedAccount.loyalty.associations;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1469p;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import java.util.Locale;
import ke.ViewModelFactoryByInjection;
import p067dh.AssociationsViewModel;
import p067dh.LoyaltyAssociationsPageAdapter;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p319qi.ManageAssociationsActivity;
import p489zc.C13780s;
import pe.C8618e;

/* compiled from: AssociationsActivity.kt */
/* loaded from: classes2.dex */
public final class AssociationsActivity extends ManageAssociationsActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23388f0;

    /* compiled from: AssociationsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.associations.AssociationsActivity$a */
    /* loaded from: classes2.dex */
    static final class C8839a extends AbstractC6438m implements InterfaceC6097a {
        C8839a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(AssociationsActivity.this.m13501o1(), AssociationsActivity.this, null, 2, null);
        }
    }

    /* renamed from: E0 */
    protected Integer m13509E0() {
        return Integer.valueOf((int) C2336R.C2338id.toolbar);
    }

    /* renamed from: G0 */
    protected int m13508G0() {
        return C2336R.string.lbl_account_loyalty;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13507J0() {
        return C6450z.m20906b(AssociationsViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13506K0() {
        return new C8839a();
    }

    /* renamed from: S0 */
    protected boolean m13505S0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: n1 */
    public LoyaltyAssociationsPageAdapter m13504j1() {
        List m194j;
        FragmentManager m37323P = m37323P();
        Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
        AbstractC1469p mo137b = mo137b();
        Intrinsics.checkIfNull(mo137b, "lifecycle");
        String string = getString(C2336R.string.lbl_loyalty_association_pending);
        Intrinsics.checkIfNull(string, "getString(R.string.lbl_l…alty_association_pending)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkIfNull(locale, "getDefault()");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkIfNull(upperCase, "this as java.lang.String).toUpperCase(locale)");
        String string2 = getString(C2336R.string.lbl_loyalty_association_approved);
        Intrinsics.checkIfNull(string2, "getString(R.string.lbl_l…lty_association_approved)");
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkIfNull(locale2, "getDefault()");
        String upperCase2 = string2.toUpperCase(locale2);
        Intrinsics.checkIfNull(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        m194j = C13780s.m194j(upperCase, upperCase2);
        return new LoyaltyAssociationsPageAdapter(m37323P, mo137b, m194j);
    }

    /* renamed from: o1 */
    public final ViewModelFactoryByInjection m13501o1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23388f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    protected void onResume() {
        super.onResume();
        ((AssociationsViewModel) m22758I0()).m10051a0();
    }
}
