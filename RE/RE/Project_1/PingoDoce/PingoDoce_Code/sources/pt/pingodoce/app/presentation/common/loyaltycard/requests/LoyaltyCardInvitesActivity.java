package pt.pingodoce.app.presentation.common.loyaltycard.requests;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.bottomsheet.DialogC3502a;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import nl.ListItemSmallPlaceHolderAdapter;
import p039c3.C2046o;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11986r5;
import p426wg.AbstractC12017t0;
import p428wi.LoyaltyCardInvitesViewModel;
import p428wi.LoyaltyCardRequestsAdapter;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseActivity;
import pe.C8617d;
import pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity;
import td.InterfaceC10524i0;

/* compiled from: LoyaltyCardInvitesActivity.kt */
/* loaded from: classes2.dex */
public final class LoyaltyCardInvitesActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23888f0;

    /* renamed from: g0 */
    private final InterfaceC13178g f23889g0;

    /* renamed from: h0 */
    private final LoyaltyCardRequestsAdapter f23890h0;

    /* compiled from: LoyaltyCardInvitesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity$a */
    /* loaded from: classes2.dex */
    static final class C9067a extends AbstractC6438m implements InterfaceC6097a {
        C9067a() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m12663a(DialogC3502a dialogC3502a, View view) {
            m12661c(dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m12661c(DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            dialogC3502a.dismiss();
        }

        /* renamed from: b */
        public final DialogC3502a mo42214q() {
            AbstractC11986r5 m3829Q = AbstractC11986r5.m3829Q(LoyaltyCardInvitesActivity.this.getLayoutInflater());
            Intrinsics.checkIfNull(m3829Q, "inflate(layoutInflater)");
            final DialogC3502a dialogC3502a = new DialogC3502a(LoyaltyCardInvitesActivity.this);
            LoyaltyCardInvitesActivity loyaltyCardInvitesActivity = LoyaltyCardInvitesActivity.this;
            dialogC3502a.setContentView(m3829Q.m37802s());
            dialogC3502a.setCancelable(false);
            m3829Q.f31371z.setText(loyaltyCardInvitesActivity.getString(C2336R.string.lbl_loyalty_card_requests));
            m3829Q.f31369x.setText(loyaltyCardInvitesActivity.getString(C2336R.string.lbl_loyalty_card_requests_disclaimer));
            m3829Q.f31370y.setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.common.loyaltycard.requests.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoyaltyCardInvitesActivity.C9067a.m12661c(DialogC3502a.this, view);
                }
            });
            return dialogC3502a;
        }
    }

    /* compiled from: LoyaltyCardInvitesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity$b */
    /* loaded from: classes2.dex */
    static final class C9068b extends AbstractC6438m implements InterfaceC6097a {
        C9068b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(LoyaltyCardInvitesActivity.this.m12670p1(), LoyaltyCardInvitesActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardInvitesActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity$initViews$2$1", m20196f = "LoyaltyCardInvitesActivity.kt", m20195l = {70}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9069c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23893x;

        /* renamed from: z */
        final /* synthetic */ List f23895z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9069c(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23895z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9069c(this.f23895z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9069c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23893x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardRequestsAdapter m12675l1 = LoyaltyCardInvitesActivity.m12675l1(LoyaltyCardInvitesActivity.this);
                List list = this.f23895z;
                Intrinsics.checkIfNull(list, "it");
                this.f23893x = 1;
                if (m12675l1.m22148H(list, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardInvitesActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity$initViews$4", m20196f = "LoyaltyCardInvitesActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9070d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23896x;

        /* renamed from: y */
        final /* synthetic */ LoyaltyCardInvitesViewModel f23897y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9070d(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23897y = loyaltyCardInvitesViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9070d(this.f23897y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9070d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f23896x == 0) {
                C13186n.m1453b(obj);
                this.f23897y.m3515a0();
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyCardInvitesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity$e */
    /* loaded from: classes2.dex */
    static final class C9071e extends AbstractC6438m implements InterfaceC6108l {
        C9071e() {
            super(1);
        }

        /* renamed from: a */
        public final void m12657a(String str) {
            Intrinsics.isThisObjectNull(str, "it");
            LoyaltyCardInvitesActivity.m12674m1(LoyaltyCardInvitesActivity.this).m3524R(str);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12657a((String) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: LoyaltyCardInvitesActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity$f */
    /* loaded from: classes2.dex */
    static final class C9072f extends AbstractC6438m implements InterfaceC6108l {
        C9072f() {
            super(1);
        }

        /* renamed from: a */
        public final void m12656a(String str) {
            Intrinsics.isThisObjectNull(str, "it");
            LoyaltyCardInvitesActivity.m12674m1(LoyaltyCardInvitesActivity.this).m3517Y(str);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12656a((String) obj);
            return C13195u.f34156a;
        }
    }

    public LoyaltyCardInvitesActivity() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C9067a());
        this.f23889g0 = m1464a;
        this.f23890h0 = new LoyaltyCardRequestsAdapter(new C9071e(), new C9072f());
    }

    /* renamed from: i1 */
    public static /* synthetic */ boolean m12678i1(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity, MenuItem menuItem) {
        return m12669q1(loyaltyCardInvitesActivity, menuItem);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12677j1(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity, List list) {
        m12667s1(loyaltyCardInvitesActivity, list);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m12676k1(AbstractC12017t0 abstractC12017t0, Boolean bool) {
        m12666t1(abstractC12017t0, bool);
    }

    /* renamed from: l1 */
    public static final /* synthetic */ LoyaltyCardRequestsAdapter m12675l1(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity) {
        return loyaltyCardInvitesActivity.f23890h0;
    }

    /* renamed from: m1 */
    public static final /* synthetic */ LoyaltyCardInvitesViewModel m12674m1(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity) {
        return (LoyaltyCardInvitesViewModel) loyaltyCardInvitesActivity.m22758I0();
    }

    /* renamed from: o1 */
    private final DialogC3502a m12671o1() {
        return (DialogC3502a) this.f23889g0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final boolean m12669q1(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(loyaltyCardInvitesActivity, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_info) {
            loyaltyCardInvitesActivity.m12671o1().show();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m12667s1(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity, List list) {
        Intrinsics.isThisObjectNull(loyaltyCardInvitesActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(loyaltyCardInvitesActivity), null, null, new C9069c(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m12666t1(AbstractC12017t0 abstractC12017t0, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC12017t0, "$binding");
        C2046o.m34853a(abstractC12017t0.f31501x);
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC12017t0.f31501x;
        Intrinsics.checkIfNull(bool, "it");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* renamed from: A0 */
    protected int m12683A0() {
        return C2336R.C2339menu.menu_info;
    }

    /* renamed from: G0 */
    protected int m12682G0() {
        return C2336R.string.lbl_loyalty_card_requests;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12681J0() {
        return C6450z.m20906b(LoyaltyCardInvitesViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12680K0() {
        return new C9068b();
    }

    /* renamed from: n */
    public boolean m12673n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: p1 */
    public final ViewModelFactoryByInjection m12670p1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23888f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public void m12679P0(final AbstractC12017t0 abstractC12017t0, LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel) {
        Intrinsics.isThisObjectNull(abstractC12017t0, "binding");
        Intrinsics.isThisObjectNull(loyaltyCardInvitesViewModel, "viewModel");
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC12017t0.f31501x;
        placeHolderRecyclerView.setAdapter(this.f23890h0);
        placeHolderRecyclerView.setHoldersAdapter(new ListItemSmallPlaceHolderAdapter());
        loyaltyCardInvitesViewModel.m3516Z().mo171i(this, new InterfaceC1440f0() { // from class: wi.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LoyaltyCardInvitesActivity.m12667s1(LoyaltyCardInvitesActivity.this, (List) obj);
            }
        });
        loyaltyCardInvitesViewModel.m102x().mo171i(this, new InterfaceC1440f0() { // from class: wi.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LoyaltyCardInvitesActivity.m12666t1(AbstractC12017t0.this, (Boolean) obj);
            }
        });
        LifecycleOwner.m36965a(this).m36984i(new C9070d(loyaltyCardInvitesViewModel, null));
        if (loyaltyCardInvitesViewModel.m3514b0()) {
            return;
        }
        m12671o1().show();
        loyaltyCardInvitesViewModel.m3518X();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_card_invites;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m12664z0() {
        return new Toolbar.InterfaceC0450f() { // from class: wi.a
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m11490q1;
                m11490q1 = LoyaltyCardInvitesActivity.m12669q1(LoyaltyCardInvitesActivity.this, menuItem);
                return m11490q1;
            }
        };
    }
}
