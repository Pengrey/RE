package pt.pingodoce.app.presentation.shoppinglist.shared;

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
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import nl.ListItemSmallPlaceHolderAdapter;
import nl.SharedWithAdapter;
import nl.SharedWithViewModel;
import p039c3.C2046o;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11794h3;
import p426wg.AbstractC11986r5;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseActivity;
import pe.C8617d;
import pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity;
import td.InterfaceC10524i0;

/* compiled from: SharedWithActivity.kt */
/* loaded from: classes2.dex */
public final class SharedWithActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24942f0;

    /* renamed from: g0 */
    private final InterfaceC13178g f24943g0;

    /* renamed from: h0 */
    private final SharedWithAdapter f24944h0;

    /* compiled from: SharedWithActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity$a */
    /* loaded from: classes2.dex */
    static final class C9489a extends AbstractC6438m implements InterfaceC6097a {
        C9489a() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m10973a(DialogC3502a dialogC3502a, View view) {
            m10971c(dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m10971c(DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            dialogC3502a.dismiss();
        }

        /* renamed from: b */
        public final DialogC3502a mo42214q() {
            AbstractC11986r5 m3829Q = AbstractC11986r5.m3829Q(SharedWithActivity.this.getLayoutInflater());
            Intrinsics.checkIfNull(m3829Q, "inflate(layoutInflater)");
            final DialogC3502a dialogC3502a = new DialogC3502a(SharedWithActivity.this);
            SharedWithActivity sharedWithActivity = SharedWithActivity.this;
            dialogC3502a.setContentView(m3829Q.m37802s());
            dialogC3502a.setCancelable(false);
            m3829Q.f31371z.setText(sharedWithActivity.getString(C2336R.string.lbl_shopping_list_share_title));
            m3829Q.f31369x.setText(sharedWithActivity.getString(C2336R.string.lbl_shopping_list_share_disclaimer));
            m3829Q.f31370y.setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.shoppinglist.shared.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedWithActivity.C9489a.m10971c(DialogC3502a.this, view);
                }
            });
            return dialogC3502a;
        }
    }

    /* compiled from: SharedWithActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity$b */
    /* loaded from: classes2.dex */
    static final class C9490b extends AbstractC6438m implements InterfaceC6097a {
        C9490b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(SharedWithActivity.this.m10981o1(), SharedWithActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedWithActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity$initViews$2$1", m20196f = "SharedWithActivity.kt", m20195l = {64}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9491c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24947x;

        /* renamed from: z */
        final /* synthetic */ List f24949z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9491c(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24949z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9491c(this.f24949z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9491c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24947x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SharedWithAdapter m10985l1 = SharedWithActivity.m10985l1(SharedWithActivity.this);
                List list = this.f24949z;
                Intrinsics.checkIfNull(list, "it");
                this.f24947x = 1;
                if (m10985l1.m22148H(list, this) == m34636d) {
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
    /* compiled from: SharedWithActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity$initViews$4", m20196f = "SharedWithActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9492d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24950x;

        /* renamed from: y */
        final /* synthetic */ SharedWithViewModel f24951y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9492d(SharedWithViewModel sharedWithViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24951y = sharedWithViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9492d(this.f24951y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9492d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24950x == 0) {
                C13186n.m1453b(obj);
                this.f24951y.m17504X();
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SharedWithActivity() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C9489a());
        this.f24943g0 = m1464a;
        this.f24944h0 = new SharedWithAdapter();
    }

    /* renamed from: i1 */
    public static /* synthetic */ boolean m10988i1(SharedWithActivity sharedWithActivity, MenuItem menuItem) {
        return m10980p1(sharedWithActivity, menuItem);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m10987j1(AbstractC11794h3 abstractC11794h3, Boolean bool) {
        m10977s1(abstractC11794h3, bool);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m10986k1(SharedWithActivity sharedWithActivity, List list) {
        m10978r1(sharedWithActivity, list);
    }

    /* renamed from: l1 */
    public static final /* synthetic */ SharedWithAdapter m10985l1(SharedWithActivity sharedWithActivity) {
        return sharedWithActivity.f24944h0;
    }

    /* renamed from: n1 */
    private final DialogC3502a m10982n1() {
        return (DialogC3502a) this.f24943g0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public static final boolean m10980p1(SharedWithActivity sharedWithActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(sharedWithActivity, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_info) {
            sharedWithActivity.m10982n1().show();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m10978r1(SharedWithActivity sharedWithActivity, List list) {
        Intrinsics.isThisObjectNull(sharedWithActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(sharedWithActivity), null, null, new C9491c(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m10977s1(AbstractC11794h3 abstractC11794h3, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11794h3, "$binding");
        C2046o.m34853a(abstractC11794h3.f30448x);
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11794h3.f30448x;
        Intrinsics.checkIfNull(bool, "it");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* renamed from: A0 */
    protected int m10993A0() {
        return C2336R.C2339menu.menu_info;
    }

    /* renamed from: G0 */
    protected int m10992G0() {
        return C2336R.string.btn_shared;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10991J0() {
        return C6450z.m20906b(SharedWithViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10990K0() {
        return new C9490b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: n */
    public boolean m10983n() {
        return true;
    }

    /* renamed from: o1 */
    public final ViewModelFactoryByInjection m10981o1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24942f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q1 */
    public void m10989P0(final AbstractC11794h3 abstractC11794h3, SharedWithViewModel sharedWithViewModel) {
        Intrinsics.isThisObjectNull(abstractC11794h3, "binding");
        Intrinsics.isThisObjectNull(sharedWithViewModel, "viewModel");
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11794h3.f30448x;
        placeHolderRecyclerView.setAdapter(this.f24944h0);
        placeHolderRecyclerView.setHoldersAdapter(new ListItemSmallPlaceHolderAdapter());
        sharedWithViewModel.m17505W().mo171i(this, new InterfaceC1440f0() { // from class: nl.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SharedWithActivity.m10978r1(SharedWithActivity.this, (List) obj);
            }
        });
        sharedWithViewModel.m102x().mo171i(this, new InterfaceC1440f0() { // from class: nl.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SharedWithActivity.m10977s1(AbstractC11794h3.this, (Boolean) obj);
            }
        });
        LifecycleOwner.m36965a(this).m36984i(new C9492d(sharedWithViewModel, null));
        if (sharedWithViewModel.m17503Y()) {
            return;
        }
        m10982n1().show();
        sharedWithViewModel.m17506V();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_shared_with;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m10974z0() {
        return new Toolbar.InterfaceC0450f() { // from class: nl.b
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m10215p1;
                m10215p1 = SharedWithActivity.m10980p1(SharedWithActivity.this, menuItem);
                return m10215p1;
            }
        };
    }
}
