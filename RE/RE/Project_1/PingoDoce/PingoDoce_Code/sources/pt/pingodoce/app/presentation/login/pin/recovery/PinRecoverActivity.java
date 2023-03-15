package pt.pingodoce.app.presentation.login.pin.recovery;

import android.content.Intent;
import android.text.Html;
import androidx.lifecycle.AbstractC1423a;
import ci.C2146h;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p088ek.IntroActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11904n2;
import p468yc.C13182l;
import p489zc.CollectionsJVM;
import p494zh.AbstractC13816c;
import p494zh.C13877n0;
import pe.C8617d;

/* compiled from: PinRecoverActivity.kt */
/* loaded from: classes2.dex */
public final class PinRecoverActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24498g0;

    /* compiled from: PinRecoverActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverActivity$a */
    /* loaded from: classes2.dex */
    static final class C9314a extends AbstractC6438m implements InterfaceC6097a {
        C9314a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11732s1 = PinRecoverActivity.this.m11732s1();
            PinRecoverActivity pinRecoverActivity = PinRecoverActivity.this;
            Intent intent = pinRecoverActivity.getIntent();
            return m11732s1.m20377b(pinRecoverActivity, intent != null ? intent.getExtras() : null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11739J0() {
        return C6450z.m20906b(PinRecoverViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11738K0() {
        return new C9314a();
    }

    /* renamed from: k1 */
    protected List m11736k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2146h.f6181a);
        return m202b;
    }

    /* renamed from: m1 */
    public void m11735m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13877n0.f34992a)) {
            IntroActivity.m25612a(this);
            finish();
        }
    }

    public void onBackPressed() {
        IntroActivity.m25612a(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m11732s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24498g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t1 */
    public void m11734n1(AbstractC11904n2 abstractC11904n2, PinRecoverViewModel pinRecoverViewModel) {
        Intrinsics.isThisObjectNull(abstractC11904n2, "binding");
        Intrinsics.isThisObjectNull(pinRecoverViewModel, "viewModel");
        super.m34589n1(abstractC11904n2, pinRecoverViewModel);
        abstractC11904n2.f31014C.setText(Html.fromHtml((String) pinRecoverViewModel.m11727A0().mo172f(), 0));
        abstractC11904n2.f31013B.setText(Html.fromHtml(getString(C2336R.string.lbl_recover_pin_code_contact), 0));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_pin_recover;
    }
}
