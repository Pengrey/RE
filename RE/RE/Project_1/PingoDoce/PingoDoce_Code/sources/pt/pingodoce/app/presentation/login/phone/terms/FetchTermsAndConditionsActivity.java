package pt.pingodoce.app.presentation.login.phone.terms;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import bg.FetchTermsAndConditionsViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p390uj.HomeActivity;
import p426wg.AbstractC11702c0;
import p494zh.BaseActivity;
import pe.C8618e;
import pt.pingodoce.app.presentation.login.phone.terms.FetchTermsAndConditionsActivity;

/* compiled from: FetchTermsAndConditionsActivity.kt */
/* loaded from: classes2.dex */
public final class FetchTermsAndConditionsActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24468f0;

    /* compiled from: FetchTermsAndConditionsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.terms.FetchTermsAndConditionsActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9296a {
        private C9296a() {
        }

        public /* synthetic */ C9296a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FetchTermsAndConditionsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.terms.FetchTermsAndConditionsActivity$b */
    /* loaded from: classes2.dex */
    static final class C9297b extends AbstractC6438m implements InterfaceC6097a {
        C9297b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11833j1 = FetchTermsAndConditionsActivity.this.m11833j1();
            FetchTermsAndConditionsActivity fetchTermsAndConditionsActivity = FetchTermsAndConditionsActivity.this;
            Intent intent = fetchTermsAndConditionsActivity.getIntent();
            return m11833j1.m20377b(fetchTermsAndConditionsActivity, intent != null ? intent.getExtras() : null);
        }
    }

    static {
        new C9296a(null);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m11834i1(FetchTermsAndConditionsActivity fetchTermsAndConditionsActivity, String str) {
        m11831l1(fetchTermsAndConditionsActivity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m11831l1(FetchTermsAndConditionsActivity fetchTermsAndConditionsActivity, String str) {
        Intrinsics.isThisObjectNull(fetchTermsAndConditionsActivity, "this$0");
        Bundle extras = fetchTermsAndConditionsActivity.getIntent().getExtras();
        Intrinsics.ifNullDoSomething(extras);
        if (extras.getBoolean("EXTRA_FOR_BACKGROUND")) {
            HomeActivity.m6743b(fetchTermsAndConditionsActivity);
        }
        String string = fetchTermsAndConditionsActivity.getString(C2336R.string.lbl_settings_terms);
        Intrinsics.checkIfNull(string, "getString(R.string.lbl_settings_terms)");
        p206kk.TermsAndConditionsActivity.m20276b(fetchTermsAndConditionsActivity, string, str, false, 4, null);
        fetchTermsAndConditionsActivity.finish();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11837J0() {
        return C6450z.m20906b(FetchTermsAndConditionsViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11836K0() {
        return new C9297b();
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m11833j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24468f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m11835P0(AbstractC11702c0 abstractC11702c0, FetchTermsAndConditionsViewModel fetchTermsAndConditionsViewModel) {
        Intrinsics.isThisObjectNull(abstractC11702c0, "binding");
        Intrinsics.isThisObjectNull(fetchTermsAndConditionsViewModel, "viewModel");
        fetchTermsAndConditionsViewModel.m35155P().mo171i(this, new InterfaceC1440f0() { // from class: kk.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                FetchTermsAndConditionsActivity.m11831l1(FetchTermsAndConditionsActivity.this, (String) obj);
            }
        });
        fetchTermsAndConditionsViewModel.m35156O();
    }

    /* renamed from: n */
    public boolean m11830n() {
        return false;
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        return new C8618e();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_full_screen_loading;
    }
}
