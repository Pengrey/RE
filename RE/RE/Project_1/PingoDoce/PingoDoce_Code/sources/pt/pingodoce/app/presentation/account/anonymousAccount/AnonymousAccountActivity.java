package pt.pingodoce.app.presentation.account.anonymousAccount;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import fm.C5578b;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p256nh.SettingsActivity;
import p258nk.LoginPhoneActivity;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11666a;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13824d2;
import p494zh.C13888p1;
import pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountActivity;

/* compiled from: AnonymousAccountActivity.kt */
/* loaded from: classes2.dex */
public final class AnonymousAccountActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23313f0;

    /* compiled from: AnonymousAccountActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountActivity$a */
    /* loaded from: classes2.dex */
    static final class C8802a extends AbstractC6438m implements InterfaceC6097a {
        C8802a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(AnonymousAccountActivity.this.m13640l1(), AnonymousAccountActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnonymousAccountActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8803b extends AbstractC6438m implements InterfaceC6108l {
        C8803b() {
            super(1);
        }

        /* renamed from: a */
        public final void m13633a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            AnonymousAccountActivity.this.m13642j1(c13182l);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13633a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ boolean m13643i1(AnonymousAccountActivity anonymousAccountActivity, MenuItem menuItem) {
        return m13639m1(anonymousAccountActivity, menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public static final boolean m13639m1(AnonymousAccountActivity anonymousAccountActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(anonymousAccountActivity, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_settings) {
            SettingsActivity.m17626a(anonymousAccountActivity);
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    protected int m13648A0() {
        return C2336R.C2339menu.menu_settings;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13647J0() {
        return C6450z.m20906b(AnonymousAccountViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13646K0() {
        return new C8802a();
    }

    /* renamed from: S0 */
    protected boolean m13644S0() {
        return true;
    }

    /* renamed from: j1 */
    public final void m13642j1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
        if (interfaceC7186c instanceof C13888p1) {
            LoginPhoneActivity.m17547a(this);
        } else if (interfaceC7186c instanceof C13824d2) {
            SettingsActivity.m17626a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public C5578b mo42216v0() {
        return new C5578b();
    }

    /* renamed from: l1 */
    public final ViewModelFactoryByInjection m13640l1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23313f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: n */
    public boolean m13638n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public void m13645P0(AbstractC11666a abstractC11666a, AnonymousAccountViewModel anonymousAccountViewModel) {
        Intrinsics.isThisObjectNull(abstractC11666a, "binding");
        Intrinsics.isThisObjectNull(anonymousAccountViewModel, "viewModel");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8803b()));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_anonymous_account;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m13635z0() {
        return new Toolbar.InterfaceC0450f() { // from class: ah.a
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m12620m1;
                m12620m1 = AnonymousAccountActivity.m13639m1(AnonymousAccountActivity.this, menuItem);
                return m12620m1;
            }
        };
    }
}
