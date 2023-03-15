package pt.pingodoce.app.presentation.account.loggedAccount;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0928a;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ch.LoyaltyActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import fm.C5578b;
import gh.LoyaltyIntroActivity;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import il.PurchaseListActivity;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p050d.C4519c;
import p086ei.BenefitsActivity;
import p143hh.LoyaltyPendingActivity;
import p144hi.ClubActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p184jh.ProfileActivity;
import p207kl.ShoppingListActivity;
import p221le.UiEventsLiveData;
import p256nh.SettingsActivity;
import p314qd.InterfaceC9717b;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p407vj.DefaultStoreActivity;
import p426wg.AbstractC11843k0;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13807a0;
import p494zh.C13824d2;
import p494zh.C13853j2;
import p494zh.C13890q;
import p494zh.C13895r0;
import p494zh.C13907u0;
import p494zh.C13908u1;
import p494zh.C13911v0;
import p494zh.C13920x1;
import pt.pingodoce.app.data.remote.models.response.BenefitsExpirationColors;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel;

/* compiled from: LoggedAccountActivity.kt */
/* loaded from: classes2.dex */
public final class LoggedAccountActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23319f0;

    /* renamed from: g0 */
    private boolean f23320g0;

    /* renamed from: h0 */
    private final AbstractC0304b f23321h0;

    /* renamed from: i0 */
    private final AbstractC0304b f23322i0;

    /* compiled from: LoggedAccountActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountActivity$a */
    /* loaded from: classes2.dex */
    static final class C8807a extends AbstractC6438m implements InterfaceC6097a {
        C8807a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(LoggedAccountActivity.this.m13612s1(), LoggedAccountActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoggedAccountActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8808b extends AbstractC6438m implements InterfaceC6108l {
        C8808b() {
            super(1);
        }

        /* renamed from: a */
        public final void m13601a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            LoggedAccountActivity.this.m13615p1(c13182l);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13601a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    public LoggedAccountActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: bh.b
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LoggedAccountActivity.m13614q1(LoggedAccountActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…)\n            }\n        }");
        this.f23321h0 = m41364M;
        AbstractC0304b m41364M2 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: bh.c
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LoggedAccountActivity.m13603z1(LoggedAccountActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M2, "registerForActivityResul…ESULT_OK)\n        }\n    }");
        this.f23322i0 = m41364M2;
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m13623i1(LoggedAccountActivity loggedAccountActivity, ActivityResult activityResult) {
        m13614q1(loggedAccountActivity, activityResult);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m13622j1(AbstractC11843k0 abstractC11843k0, Boolean bool) {
        m13606x1(abstractC11843k0, bool);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m13621k1(LoggedAccountActivity loggedAccountActivity, ActivityResult activityResult) {
        m13603z1(loggedAccountActivity, activityResult);
    }

    /* renamed from: l1 */
    public static /* synthetic */ boolean m13620l1(LoggedAccountActivity loggedAccountActivity, MenuItem menuItem) {
        return m13611t1(loggedAccountActivity, menuItem);
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m13619m1(LoggedAccountViewModel loggedAccountViewModel) {
        m13608w1(loggedAccountViewModel);
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m13617n1(LoggedAccountActivity loggedAccountActivity, View view) {
        m13609v1(loggedAccountActivity, view);
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m13616o1(AbstractC11843k0 abstractC11843k0, LoggedAccountActivity loggedAccountActivity, LoggedAccountViewModel loggedAccountViewModel, LoyaltyCard loyaltyCard) {
        m13605y1(abstractC11843k0, loggedAccountActivity, loggedAccountViewModel, loyaltyCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m13614q1(LoggedAccountActivity loggedAccountActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(loggedAccountActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            ShoppingListActivity.m20275a(loggedAccountActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public static final boolean m13611t1(LoggedAccountActivity loggedAccountActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(loggedAccountActivity, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_settings) {
            SettingsActivity.m17626a(loggedAccountActivity);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m13609v1(LoggedAccountActivity loggedAccountActivity, View view) {
        Intrinsics.isThisObjectNull(loggedAccountActivity, "this$0");
        Uri parse = Uri.parse("https://www.poupamais.pt/pt/welcome/info_points_aquire/");
        Intrinsics.checkIfNull(parse, "parse(this)");
        loggedAccountActivity.startActivity(new Intent("android.intent.action.VIEW", parse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m13608w1(LoggedAccountViewModel loggedAccountViewModel) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "$viewModel");
        loggedAccountViewModel.m13563w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m13606x1(AbstractC11843k0 abstractC11843k0, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11843k0, "$binding");
        SwipeRefreshLayout swipeRefreshLayout = abstractC11843k0.f30724I;
        Intrinsics.checkIfNull(bool, "it");
        swipeRefreshLayout.setRefreshing(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m13605y1(AbstractC11843k0 abstractC11843k0, LoggedAccountActivity loggedAccountActivity, LoggedAccountViewModel loggedAccountViewModel, LoyaltyCard loyaltyCard) {
        Intrinsics.isThisObjectNull(abstractC11843k0, "$binding");
        Intrinsics.isThisObjectNull(loggedAccountActivity, "this$0");
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "$viewModel");
        if (!loyaltyCard.m13815O()) {
            TextView textView = abstractC11843k0.f30723H.f31056x;
            ResourcesProvider m6898a = C10841b.m6898a(loggedAccountActivity);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), 2131951665).getTheme().resolveAttribute(C2336R.attr.colorPrimaryVariant, typedValue, true);
            ColorStateList valueOf = ColorStateList.valueOf(C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(valueOf, "ColorStateList.valueOf(c…r(attrResId, themeResId))");
            textView.setTextColor(valueOf);
        }
        if (!loyaltyCard.m13818L()) {
            TextView textView2 = abstractC11843k0.f30728x.f29941x;
            ResourcesProvider m6898a2 = C10841b.m6898a(loggedAccountActivity);
            TypedValue typedValue2 = new TypedValue();
            new ContextThemeWrapper(m6898a2.m6899a(), 2131951665).getTheme().resolveAttribute(C2336R.attr.colorPrimaryVariant, typedValue2, true);
            ColorStateList valueOf2 = ColorStateList.valueOf(C0928a.m39113d(m6898a2.m6899a(), typedValue2.resourceId));
            Intrinsics.checkIfNull(valueOf2, "ColorStateList.valueOf(c…r(attrResId, themeResId))");
            textView2.setTextColor(valueOf2);
        }
        if (!loyaltyCard.m13817M()) {
            TextView textView3 = abstractC11843k0.f30730z.f30456x;
            ResourcesProvider m6898a3 = C10841b.m6898a(loggedAccountActivity);
            TypedValue typedValue3 = new TypedValue();
            new ContextThemeWrapper(m6898a3.m6899a(), 2131951665).getTheme().resolveAttribute(C2336R.attr.colorPrimaryVariant, typedValue3, true);
            ColorStateList valueOf3 = ColorStateList.valueOf(C0928a.m39113d(m6898a3.m6899a(), typedValue3.resourceId));
            Intrinsics.checkIfNull(valueOf3, "ColorStateList.valueOf(c…r(attrResId, themeResId))");
            textView3.setTextColor(valueOf3);
        }
        LoyaltyCard loyaltyCard2 = (LoyaltyCard) loggedAccountViewModel.m13571o0().mo172f();
        BenefitsExpirationColors m13792y = loyaltyCard2 != null ? loyaltyCard2.m13792y() : null;
        abstractC11843k0.f30730z.f30457y.setTextColor(Color.parseColor(m13792y != null ? m13792y.m13917b() : null));
        abstractC11843k0.f30730z.f30457y.setBackgroundColor(Color.parseColor(m13792y != null ? m13792y.m13918a() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m13603z1(LoggedAccountActivity loggedAccountActivity, ActivityResult activityResult) {
        Bundle extras;
        Intrinsics.isThisObjectNull(loggedAccountActivity, "this$0");
        Intent m41352a = activityResult.m41352a();
        if (m41352a == null || (extras = m41352a.getExtras()) == null || ((Store) extras.getParcelable("EXTRA_FOR_STORE")) == null) {
            return;
        }
        loggedAccountActivity.setResult(-1);
    }

    /* renamed from: A0 */
    protected int m13628A0() {
        return 0;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13627J0() {
        return C6450z.m20906b(LoggedAccountViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13626K0() {
        return new C8807a();
    }

    /* renamed from: S0 */
    protected boolean m13624S0() {
        return true;
    }

    /* renamed from: n */
    public boolean m13618n() {
        return true;
    }

    protected void onResume() {
        super.onResume();
        if (this.f23320g0) {
            ((LoggedAccountViewModel) m22758I0()).m13563w0();
        }
        this.f23320g0 = false;
    }

    /* renamed from: p1 */
    public final void m13615p1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
        if (interfaceC7186c instanceof C13890q) {
            BenefitsActivity.m25726a(this);
        } else if (interfaceC7186c instanceof C13807a0) {
            ClubActivity.m22636a(this);
        } else {
            if (interfaceC7186c instanceof C13920x1) {
                AbstractC0304b abstractC0304b = this.f23321h0;
                Object m1459d = c13182l.m1459d();
                Boolean bool = m1459d instanceof Boolean ? (Boolean) m1459d : null;
                PurchaseListActivity.m21957c(abstractC0304b, this, false, bool != null ? bool.booleanValue() : false, 2, null);
            } else if (interfaceC7186c instanceof C13853j2) {
                DefaultStoreActivity.m5308a(this.f23322i0, this);
            } else if (interfaceC7186c instanceof C13908u1) {
                ProfileActivity.m20847a(this);
            } else if (interfaceC7186c instanceof C13824d2) {
                SettingsActivity.m17626a(this);
            } else if (interfaceC7186c instanceof C13907u0) {
                LoyaltyIntroActivity.m23345a(this);
            } else if (interfaceC7186c instanceof C13895r0) {
                LoyaltyActivity.m34603b(this, false, 1, null);
            } else if (interfaceC7186c instanceof C13911v0) {
                LoyaltyPendingActivity.m22645a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C5578b mo42216v0() {
        return new C5578b();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m13612s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23319f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"DirectColorInSource"})
    /* renamed from: u1 */
    public void m13625P0(final AbstractC11843k0 abstractC11843k0, final LoggedAccountViewModel loggedAccountViewModel) {
        Intrinsics.isThisObjectNull(abstractC11843k0, "binding");
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "viewModel");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8808b()));
        abstractC11843k0.f30716A.setOnClickListener(new View.OnClickListener() { // from class: bh.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountActivity.m13609v1(LoggedAccountActivity.this, view);
            }
        });
        abstractC11843k0.f30724I.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC1685j() { // from class: bh.g
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1685j
            /* renamed from: a */
            public final void mo6745a() {
                LoggedAccountActivity.m13608w1(LoggedAccountViewModel.this);
            }
        });
        loggedAccountViewModel.m13566t0().mo171i(this, new InterfaceC1440f0() { // from class: bh.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LoggedAccountActivity.m13606x1(AbstractC11843k0.this, (Boolean) obj);
            }
        });
        loggedAccountViewModel.m13571o0().mo171i(this, new InterfaceC1440f0() { // from class: bh.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LoggedAccountActivity.m13605y1(AbstractC11843k0.this, this, loggedAccountViewModel, (LoyaltyCard) obj);
            }
        });
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_logged_account;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m13604z0() {
        return new Toolbar.InterfaceC0450f() { // from class: bh.d
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m12229t1;
                m12229t1 = LoggedAccountActivity.m13611t1(LoggedAccountActivity.this, menuItem);
                return m12229t1;
            }
        };
    }
}
