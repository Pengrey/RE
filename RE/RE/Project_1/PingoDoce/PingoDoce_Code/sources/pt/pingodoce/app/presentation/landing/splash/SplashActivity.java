package pt.pingodoce.app.presentation.landing.splash;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import ch.LoyaltyActivity;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import dk.TailoredForYouActivity;
import fj.SearchActivity;
import fk.LockActivity;
import gl.PromotionActivity;
import hk.AppWalkThroughActivity;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.InterfaceC7186c;
import mg.AnalyticsManager;
import ml.ShoppingListsActivity;
import ne.EventObserver;
import ng.AnalyticEvents;
import ng.InterfaceC7886d;
import p088ek.IntroActivity;
import p090em.NotificationLandingActivity;
import p090em.PushNotificationDispatcherActivity;
import p124gk.SplashViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p184jh.ProfileActivity;
import p206kk.FetchTermsAndConditionsActivity;
import p207kl.ShoppingListActivity;
import p221le.UiEventsLiveData;
import p256nh.SettingsActivity;
import p314qd.InterfaceC9717b;
import p322ql.Launchers;
import p371ti.LoyaltyRemovedActivity;
import p390uj.HomeActivity;
import p409vl.TakeAwayOrderListActivity;
import p426wg.AbstractC11984r3;
import p468yc.C13182l;
import p468yc.C13195u;
import p493zg.AccountActivityLauncher;
import p494zh.BaseActivity;
import p494zh.C13869l0;
import p494zh.C13877n0;
import pe.C8614a;
import pt.pingodoce.app.data.local.models.p300goto.PushActionGotoType;

/* compiled from: SplashActivity.kt */
/* loaded from: classes2.dex */
public final class SplashActivity extends BaseActivity<AbstractC11984r3, SplashViewModel> {

    /* renamed from: f0 */
    public AnalyticsManager f24456f0;

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24457g0;

    /* renamed from: i0 */
    private boolean f24458i0;

    /* renamed from: h0 */
    private PushActionGotoType f24459h0 = PushActionGotoType.UNKNOWN;

    /* renamed from: j0 */
    private String buildVersionName = BuildConfig.VERSION_NAME;

    /* compiled from: SplashActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.splash.SplashActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9290a {
        private C9290a() {
        }

        public /* synthetic */ C9290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SplashActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.splash.SplashActivity$b */
    /* loaded from: classes2.dex */
    static final class C9291b extends AbstractC6438m implements InterfaceC6097a<AbstractC1423a> {
        C9291b() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11852o1 = SplashActivity.this.m11852o1();
            SplashActivity splashActivity = SplashActivity.this;
            return m11852o1.m20377b(splashActivity, splashActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.splash.SplashActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9292c extends AbstractC6438m implements InterfaceC6108l<C13182l<? extends InterfaceC7186c, ? extends Object>, C13195u> {

        /* renamed from: x */
        final /* synthetic */ SplashViewModel f24463x;

        /* compiled from: SplashActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.landing.splash.SplashActivity$c$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9293a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24464a;

            static {
                int[] iArr = new int[PushActionGotoType.values().length];
                iArr[PushActionGotoType.HOME.ordinal()] = 1;
                iArr[PushActionGotoType.PROMOTIONS.ordinal()] = 2;
                iArr[PushActionGotoType.SHOPPING_LIST.ordinal()] = 3;
                iArr[PushActionGotoType.TAKE_AWAY.ordinal()] = 4;
                iArr[PushActionGotoType.ACCOUNT.ordinal()] = 5;
                iArr[PushActionGotoType.LOYALTY_CARD_REQUESTS.ordinal()] = 6;
                iArr[PushActionGotoType.SHOPPING_LISTS.ordinal()] = 7;
                iArr[PushActionGotoType.TAKE_AWAY_ORDER_LIST.ordinal()] = 8;
                iArr[PushActionGotoType.BENEFIT.ordinal()] = 9;
                iArr[PushActionGotoType.DETAIL.ordinal()] = 10;
                iArr[PushActionGotoType.SEARCH.ordinal()] = 11;
                iArr[PushActionGotoType.PROFILE.ordinal()] = 12;
                iArr[PushActionGotoType.DEFINITION.ordinal()] = 13;
                iArr[PushActionGotoType.TERMS_OF_SERVICE.ordinal()] = 14;
                iArr[PushActionGotoType.DATA_PROTECTION.ordinal()] = 15;
                iArr[PushActionGotoType.PRODUCT_DETAIL.ordinal()] = 16;
                iArr[PushActionGotoType.BANNER_DETAIL.ordinal()] = 17;
                iArr[PushActionGotoType.HOUSE_HOLD_REMOVED.ordinal()] = 18;
                f24464a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9292c(SplashViewModel splashViewModel) {
            super(1);
            this.f24463x = splashViewModel;
        }

        /* renamed from: a */
        public final void m11848a(C13182l<? extends InterfaceC7186c, ? extends Object> c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13869l0) {
                if (SplashActivity.this.f24458i0) {
                    switch (C9293a.f24464a[SplashActivity.this.f24459h0.ordinal()]) {
                        case 1:
                            HomeActivity.m6743b(SplashActivity.this);
                            break;
                        case 2:
                            PromotionActivity.m23290a(SplashActivity.this);
                            break;
                        case 3:
                            ShoppingListActivity.m20275a(SplashActivity.this);
                            break;
                        case 4:
                            Launchers.m9999c(SplashActivity.this, this.f24463x.m121A());
                            break;
                        case 5:
                            AccountActivityLauncher.m156b(SplashActivity.this, this.f24463x.m121A());
                            break;
                        case 6:
                            HomeActivity.m6743b(SplashActivity.this);
                            if (!this.f24463x.m100z()) {
                                LoyaltyActivity.m34604a(SplashActivity.this, true);
                                break;
                            }
                            break;
                        case 7:
                            HomeActivity.m6743b(SplashActivity.this);
                            if (!this.f24463x.m100z()) {
                                ShoppingListsActivity.m18325b(SplashActivity.this);
                                break;
                            }
                            break;
                        case 8:
                            HomeActivity.m6743b(SplashActivity.this);
                            if (!this.f24463x.m100z()) {
                                TakeAwayOrderListActivity.m5240a(SplashActivity.this);
                                break;
                            }
                            break;
                        case 9:
                            HomeActivity.m6743b(SplashActivity.this);
                            if (!this.f24463x.m100z()) {
                                HomeActivity.m6744a(SplashActivity.this);
                                break;
                            }
                            break;
                        case 10:
                            TailoredForYouActivity.m26361a(SplashActivity.this);
                            break;
                        case 11:
                            SearchActivity.m23750b(SplashActivity.this);
                            break;
                        case 12:
                            ProfileActivity.m20847a(SplashActivity.this);
                            break;
                        case 13:
                            SettingsActivity.m17626a(SplashActivity.this);
                            break;
                        case 14:
                            SettingsActivity.m17626a(SplashActivity.this);
                            break;
                        case 15:
                            FetchTermsAndConditionsActivity.m20280a(SplashActivity.this, true);
                            break;
                        case 16:
                            SplashActivity splashActivity = SplashActivity.this;
                            PushNotificationDispatcherActivity.m25577a(splashActivity, splashActivity.buildVersionName);
                            break;
                        case 17:
                            SplashActivity splashActivity2 = SplashActivity.this;
                            HomeActivity.m6742c(splashActivity2, splashActivity2.buildVersionName);
                            break;
                        case 18:
                            HomeActivity.m6743b(SplashActivity.this);
                            LoyaltyRemovedActivity.m7465a(SplashActivity.this);
                            break;
                    }
                } else {
                    HomeActivity.m6743b(SplashActivity.this);
                }
                if (!SplashActivity.this.m139h1()) {
                    LockActivity.m23738b(SplashActivity.this, null, 1, null);
                }
                if (Intrinsics.equals(c13182l.m1459d(), Boolean.TRUE)) {
                    AppWalkThroughActivity.m22601a(SplashActivity.this);
                }
            } else if (interfaceC7186c instanceof C13877n0) {
                IntroActivity.m25612a(SplashActivity.this);
                if (this.f24463x.m23299O()) {
                    AppWalkThroughActivity.m22601a(SplashActivity.this);
                }
            }
            SplashActivity.this.finish();
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C13195u mo9587d(C13182l<? extends InterfaceC7186c, ? extends Object> c13182l) {
            m11848a(c13182l);
            return C13195u.f34156a;
        }
    }

    static {
        new C9290a(null);
    }

    @Override // p140he.CoreBaseActivity
    /* renamed from: J0 */
    protected InterfaceC9717b<SplashViewModel> mo11861J0() {
        return C6450z.m20906b(SplashViewModel.class);
    }

    @Override // p140he.CoreBaseActivity
    /* renamed from: K0 */
    protected InterfaceC6097a<AbstractC1423a> mo11860K0() {
        return new C9291b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p140he.CoreBaseActivity
    /* renamed from: m1 */
    public C8614a mo42216v0() {
        return new C8614a();
    }

    @Override // ai.InterfaceC0162o
    /* renamed from: n */
    public boolean returnFalse() {
        return false;
    }

    /* renamed from: n1 */
    public final AnalyticsManager m11853n1() {
        AnalyticsManager analyticsManager = this.f24456f0;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.throwUninitPropException("analyticsManager");
        return null;
    }

    /* renamed from: o1 */
    public final ViewModelFactoryByInjection m11852o1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24457g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p494zh.BaseActivity, p140he.CoreBaseActivity, vc.AbstractActivityC11204b, androidx.fragment.app.ActivityC1354d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0904g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("E-GOI_PUSH")) {
            Intent intent = getIntent();
            Intrinsics.checkIfNull(intent, "intent");
            NotificationLandingActivity.startActivityWithIntentIfNotNull(this, intent);
            return;
        }
        Intent intent2 = getIntent();
        Bundle extras = intent2 != null ? intent2.getExtras() : null;
        String str = BuildConfig.VERSION_NAME;
        if (extras != null) {
            if (extras.containsKey("goto")) {
                PushActionGotoType.C8696a c8696a = PushActionGotoType.Companion;
                String string = extras.getString("goto", BuildConfig.VERSION_NAME);
                if (string == null) {
                    string = BuildConfig.VERSION_NAME;
                }
                PushActionGotoType m14573a = c8696a.m14573a(string);
                this.f24459h0 = m14573a;
                PushActionGotoType pushActionGotoType = PushActionGotoType.UNKNOWN;
                if (m14573a == pushActionGotoType) {
                    PushActionGotoType pushActionGotoType2 = (PushActionGotoType) extras.getParcelable("goto");
                    if (pushActionGotoType2 != null) {
                        pushActionGotoType = pushActionGotoType2;
                    }
                    this.f24459h0 = pushActionGotoType;
                }
            }
            if (extras.containsKey("notificationId")) {
                String string2 = extras.getString("notificationId", BuildConfig.VERSION_NAME);
                Intrinsics.checkIfNull(string2, "extras.getString(PushNot….NOTIFICATION_ID_KEY, \"\")");
                if (string2.length() > 0) {
                    InterfaceC7886d.C7887a.m17629a(m11853n1(), new AnalyticEvents.AbstractC7743d.C7749f(string2), null, null, null, 14, null);
                }
            }
        }
        this.f24458i0 = this.f24459h0 != PushActionGotoType.UNKNOWN;
        String string3 = extras != null ? extras.getString("gotoPayload") : null;
        if (string3 != null) {
            str = string3;
        }
        this.buildVersionName = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p140he.CoreBaseActivity
    /* renamed from: p1 */
    public void mo11851p1(AbstractC11984r3 abstractC11984r3, SplashViewModel splashViewModel) {
        Intrinsics.isThisObjectNull(abstractC11984r3, "binding");
        Intrinsics.isThisObjectNull(splashViewModel, "viewModel");
        if (splashViewModel.m23300N()) {
            abstractC11984r3.f31364x.m34448r();
        }
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9292c(splashViewModel)));
    }

    @Override // p140he.CoreBaseActivity
    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_splash;
    }
}
