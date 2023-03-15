package ni;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.InterfaceC1440f0;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.badge.C3469a;
import gl.PromotionActivity;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.InterfaceC7186c;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p207kl.ShoppingListActivity;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p241mi.BottomNavigationViewModel;
import p241mi.C7485d;
import p322ql.Launchers;
import p390uj.HomeActivity;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p493zg.AccountActivityLauncher;
import p494zh.BaseActivity;
import p494zh.BaseViewModel;
import p494zh.C13806a;
import p494zh.C13833f2;
import p494zh.C13869l0;
import p494zh.C13875m2;
import p494zh.C13916w1;
import pe.C8614a;

/* renamed from: ni.b */
/* loaded from: classes2.dex */
public abstract class BottomNavigationActivity<ViewBinding extends ViewDataBinding, ViewModel extends BaseViewModel> extends BaseActivity implements InterfaceC7910d {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f20532f0;

    /* renamed from: g0 */
    private final InterfaceC13178g f20533g0;

    /* compiled from: BottomNavigationActivity.kt */
    /* renamed from: ni.b$a */
    /* loaded from: classes2.dex */
    public static final class C7904a {
        private C7904a() {
        }

        public /* synthetic */ C7904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomNavigationActivity.kt */
    /* renamed from: ni.b$b */
    /* loaded from: classes2.dex */
    public static final class C7905b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ BaseViewModel f20535x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7905b(BaseViewModel baseViewModel) {
            super(1);
            this.f20535x = baseViewModel;
        }

        /* renamed from: a */
        public final void m17608a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            if (BottomNavigationActivity.this.mo17603s().getSelectedItemId() != BottomNavigationActivity.this.mo17602w()) {
                BottomNavigationActivity.this.mo17603s().setSelectedItemId(BottomNavigationActivity.this.mo17602w());
                InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
                if (Intrinsics.equals(interfaceC7186c, C13869l0.f34986a)) {
                    HomeActivity.m6743b(BottomNavigationActivity.this);
                    BottomNavigationActivity.this.finish();
                    return;
                } else if (Intrinsics.equals(interfaceC7186c, C13916w1.f35037a)) {
                    PromotionActivity.m23290a(BottomNavigationActivity.this);
                    BottomNavigationActivity.this.finish();
                    return;
                } else if (Intrinsics.equals(interfaceC7186c, C13833f2.f34941a)) {
                    ShoppingListActivity.m20275a(BottomNavigationActivity.this);
                    return;
                } else if (Intrinsics.equals(interfaceC7186c, C13875m2.f34991a)) {
                    Launchers.m9999c(BottomNavigationActivity.this, this.f20535x.m121A());
                    BottomNavigationActivity.this.finish();
                    return;
                } else if (Intrinsics.equals(interfaceC7186c, C13806a.f34914a)) {
                    AccountActivityLauncher.m156b(BottomNavigationActivity.this, this.f20535x.m121A());
                    BottomNavigationActivity.this.finish();
                    return;
                } else {
                    BottomNavigationActivity.this.m17616k1(c13182l);
                    return;
                }
            }
            BottomNavigationActivity.this.m17616k1(c13182l);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17608a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomNavigationActivity.kt */
    /* renamed from: ni.b$c */
    /* loaded from: classes2.dex */
    public static final class C7906c extends AbstractC6438m implements InterfaceC6108l {
        C7906c() {
            super(1);
        }

        /* renamed from: a */
        public final void m17607a(int i) {
            BottomNavigationActivity.this.m17609q1(C2336R.C2338id.navigation_shoplist, i);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17607a(((Number) obj).intValue());
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomNavigationActivity.kt */
    /* renamed from: ni.b$d */
    /* loaded from: classes2.dex */
    public static final class C7907d extends AbstractC6438m implements InterfaceC6097a {
        C7907d() {
            super(0);
        }

        /* renamed from: a */
        public final BottomNavigationViewModel mo42214q() {
            BottomNavigationActivity bottomNavigationActivity = BottomNavigationActivity.this;
            return (BottomNavigationViewModel) new C1479r0(bottomNavigationActivity, ViewModelFactoryByInjection.m20376c(bottomNavigationActivity.m17614m1(), BottomNavigationActivity.this, null, 2, null)).m36981a(BottomNavigationViewModel.class);
        }
    }

    /* compiled from: BottomNavigationActivity.kt */
    /* renamed from: ni.b$e */
    /* loaded from: classes2.dex */
    public static final class C7908e implements UiWidgets.InterfaceC7044a {
        C7908e() {
        }

        /* renamed from: a */
        public void m17605a(boolean z) {
            if (z) {
                BottomNavigationActivity.m17617j1(BottomNavigationActivity.this);
            }
        }
    }

    static {
        new C7904a(null);
    }

    public BottomNavigationActivity() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C7907d());
        this.f20533g0 = m1464a;
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m17618i1(BottomNavigationActivity bottomNavigationActivity, Integer num) {
        m17610p1(bottomNavigationActivity, num);
    }

    /* renamed from: j1 */
    public static final /* synthetic */ void m17617j1(BottomNavigationActivity bottomNavigationActivity) {
        bottomNavigationActivity.m150W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m17610p1(BottomNavigationActivity bottomNavigationActivity, Integer num) {
        Intrinsics.isThisObjectNull(bottomNavigationActivity, "this$0");
        Intrinsics.checkIfNull(num, "it");
        bottomNavigationActivity.m17609q1(C2336R.C2338id.navigation_takeaway, num.intValue());
    }

    /* renamed from: k1 */
    protected abstract void m17616k1(C13182l c13182l);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public C8614a mo42216v0() {
        return new C8614a();
    }

    /* renamed from: m1 */
    public final ViewModelFactoryByInjection m17614m1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f20532f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("navigationFactory");
        return null;
    }

    /* renamed from: n */
    public boolean m17613n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public final BottomNavigationViewModel m17612n1() {
        return (BottomNavigationViewModel) this.f20533g0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o1 */
    public void m17619P0(ViewDataBinding viewDataBinding, BaseViewModel baseViewModel) {
        Intrinsics.isThisObjectNull(viewDataBinding, "binding");
        Intrinsics.isThisObjectNull(baseViewModel, "viewModel");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C7905b(baseViewModel)));
        C7485d.f19794a.m18383a().mo171i(this, new EventObserver(new C7906c()));
        m17612n1().m18393M().mo171i(this, new InterfaceC1440f0() { // from class: ni.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BottomNavigationActivity.m17610p1(BottomNavigationActivity.this, (Integer) obj);
            }
        });
    }

    public void onBackPressed() {
        UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
        String string = getString(C2336R.string.dialog_caution_title);
        Intrinsics.checkIfNull(string, "getString(R.string.dialog_caution_title)");
        String string2 = getString(C2336R.string.dialog_close_app);
        Intrinsics.checkIfNull(string2, "getString(R.string.dialog_close_app)");
        UiEventsLiveData.m19519k(uiEventsLiveData, string, string2, null, null, new C7908e(), 12, null);
    }

    protected void onDestroy() {
        C7485d.f19794a.m18383a().mo167o(this);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (mo17603s().getSelectedItemId() != mo17602w()) {
            mo17603s().setSelectedItemId(mo17602w());
        }
        m17612n1().m18390P();
    }

    /* renamed from: q1 */
    public void m17609q1(int i, int i2) {
        C3469a m29463e = mo17603s().m29463e(i);
        m29463e.m30510x(i2 <= 99 ? i2 : 99);
        m29463e.m30538A(i2 > 0);
        if (i == C2336R.C2338id.navigation_shoplist) {
            m17612n1().m18392N(i2);
        }
    }
}
