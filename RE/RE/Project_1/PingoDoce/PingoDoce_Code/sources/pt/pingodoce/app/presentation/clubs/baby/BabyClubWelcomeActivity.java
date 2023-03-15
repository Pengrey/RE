package pt.pingodoce.app.presentation.clubs.baby;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p164ii.BabyClubWelcomeViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p390uj.HomeActivity;
import p426wg.AbstractC11770g;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13850j;
import p494zh.C13869l0;
import pe.C8617d;

/* compiled from: BabyClubWelcomeActivity.kt */
/* loaded from: classes2.dex */
public final class BabyClubWelcomeActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23696f0;

    /* compiled from: BabyClubWelcomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubWelcomeActivity$a */
    /* loaded from: classes2.dex */
    static final class C8982a extends AbstractC6438m implements InterfaceC6097a {
        C8982a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(BabyClubWelcomeActivity.this.m12912j1(), BabyClubWelcomeActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubWelcomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubWelcomeActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8983b extends AbstractC6438m implements InterfaceC6108l {
        C8983b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12907a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13869l0) {
                HomeActivity.m6743b(BabyClubWelcomeActivity.this);
                BabyClubWelcomeActivity.this.finish();
            } else if (interfaceC7186c instanceof C13850j) {
                p164ii.BabyClubUpdateActivity.m22018a(BabyClubWelcomeActivity.this, true);
                BabyClubWelcomeActivity.this.finish();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12907a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12916J0() {
        return C6450z.m20906b(BabyClubWelcomeViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12915K0() {
        return new C8982a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m12912j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23696f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m12914P0(AbstractC11770g abstractC11770g, BabyClubWelcomeViewModel babyClubWelcomeViewModel) {
        Intrinsics.isThisObjectNull(abstractC11770g, "binding");
        Intrinsics.isThisObjectNull(babyClubWelcomeViewModel, "viewModel");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8983b()));
        TextView textView = abstractC11770g.f30346A;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(getColor(C2336R.color.black));
    }

    /* renamed from: n */
    public boolean m12910n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_baby_welcome;
    }
}
