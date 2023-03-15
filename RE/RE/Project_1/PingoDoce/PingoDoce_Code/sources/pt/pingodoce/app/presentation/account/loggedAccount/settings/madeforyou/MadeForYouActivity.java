package pt.pingodoce.app.presentation.account.loggedAccount.settings.madeforyou;

import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11792h1;
import p494zh.BaseActivity;
import pe.C8617d;
import th.MadeForYouViewModel;

/* compiled from: MadeForYouActivity.kt */
/* loaded from: classes2.dex */
public final class MadeForYouActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23527f0;

    /* compiled from: MadeForYouActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.madeforyou.MadeForYouActivity$a */
    /* loaded from: classes2.dex */
    static final class C8898a extends AbstractC6438m implements InterfaceC6097a {
        C8898a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(MadeForYouActivity.this.m13235j1(), MadeForYouActivity.this, null, 2, null);
        }
    }

    /* renamed from: G0 */
    protected int m13240G0() {
        return C2336R.string.lbl_settings_madeForYou;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13239J0() {
        return C6450z.m20906b(MadeForYouViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13238K0() {
        return new C8898a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m13235j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23527f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m13237P0(AbstractC11792h1 abstractC11792h1, MadeForYouViewModel madeForYouViewModel) {
        Intrinsics.isThisObjectNull(abstractC11792h1, "binding");
        Intrinsics.isThisObjectNull(madeForYouViewModel, "viewModel");
    }

    /* renamed from: n */
    public boolean m13233n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_made_for_you;
    }
}
