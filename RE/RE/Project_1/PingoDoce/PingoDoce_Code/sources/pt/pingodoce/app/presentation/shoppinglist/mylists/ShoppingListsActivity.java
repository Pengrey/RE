package pt.pingodoce.app.presentation.shoppinglist.mylists;

import android.animation.ValueAnimator;
import android.view.MenuItem;
import android.view.animation.OvershootInterpolator;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.C1618k;
import androidx.recyclerview.widget.RecyclerView;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import ee.MarginItemDecoration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import java.util.Objects;
import je.RecyclerViewItemTouchHelper;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.EncryptedPrefsManager;
import ml.C7517n;
import ml.ShoppingListPlaceHolderAdapter;
import ml.ShoppingListsAdapter;
import p070e.C4906j;
import p106fe.CommonUtils;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11905n3;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseActivity;
import pe.C8617d;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;
import pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity;
import td.InterfaceC10524i0;

/* compiled from: ShoppingListsActivity.kt */
/* loaded from: classes2.dex */
public final class ShoppingListsActivity extends BaseActivity {

    /* renamed from: f0 */
    protected EncryptedPrefsManager f24921f0;

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24922g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f24923h0;

    /* renamed from: i0 */
    private final C1618k f24924i0;

    /* renamed from: j0 */
    private final InterfaceC13178g f24925j0;

    /* renamed from: k0 */
    private final InterfaceC13178g f24926k0;

    /* compiled from: ShoppingListsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$a */
    /* loaded from: classes2.dex */
    static final class C9479a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C9479a f24927w = new C9479a();

        C9479a() {
            super(0);
        }

        /* renamed from: a */
        public final Float mo42214q() {
            return Float.valueOf(CommonUtils.f15361a.m24296f(UtilsExtensions.m35167e(15), 0.0f, UtilsExtensions.m35167e(15), 0.0f, 1.0f));
        }
    }

    /* compiled from: ShoppingListsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$b */
    /* loaded from: classes2.dex */
    static final class C9480b extends AbstractC6438m implements InterfaceC6097a {
        C9480b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ShoppingListsActivity.this.m11016r1(), ShoppingListsActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$initViews$2$1", m20196f = "ShoppingListsActivity.kt", m20195l = {112}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9481c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24929x;

        /* renamed from: z */
        final /* synthetic */ List f24931z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9481c(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24931z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9481c(this.f24931z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9481c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24929x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListsAdapter m11020n1 = ShoppingListsActivity.m11020n1(ShoppingListsActivity.this);
                List list = this.f24931z;
                Intrinsics.checkIfNull(list, "it");
                this.f24929x = 1;
                if (m11020n1.m22148H(list, this) == m34636d) {
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
    /* compiled from: ShoppingListsActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$initViews$5", m20196f = "ShoppingListsActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9482d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24932x;

        /* renamed from: z */
        final /* synthetic */ C7517n f24934z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9482d(C7517n c7517n, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24934z = c7517n;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9482d(this.f24934z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9482d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24932x == 0) {
                C13186n.m1453b(obj);
                ShoppingListsActivity.m11018p1(ShoppingListsActivity.this, false, false);
                this.f24934z.m18284s0();
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingListsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$e */
    /* loaded from: classes2.dex */
    static final class C9483e extends AbstractC6438m implements InterfaceC6113q {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListsActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$itemTouchHelper$1$1", m20196f = "ShoppingListsActivity.kt", m20195l = {73}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$e$a */
        /* loaded from: classes2.dex */
        public static final class C9484a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24936x;

            /* renamed from: y */
            final /* synthetic */ ShoppingListsActivity f24937y;

            /* renamed from: z */
            final /* synthetic */ int f24938z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9484a(ShoppingListsActivity shoppingListsActivity, int i, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24937y = shoppingListsActivity;
                this.f24938z = i;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9484a(this.f24937y, this.f24938z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9484a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24936x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7517n m11019o1 = ShoppingListsActivity.m11019o1(this.f24937y);
                    int i2 = this.f24938z;
                    this.f24936x = 1;
                    if (m11019o1.m18291l0(i2, this) == m34636d) {
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

        C9483e() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m11000a((RecyclerView.AbstractC1531c0) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m11000a(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2) {
            Intrinsics.isThisObjectNull(abstractC1531c0, "<anonymous parameter 0>");
            LifecycleOwner.m36965a(ShoppingListsActivity.this).m36984i(new C9484a(ShoppingListsActivity.this, i2, null));
        }
    }

    /* compiled from: ShoppingListsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$f */
    /* loaded from: classes2.dex */
    static final class C9485f extends AbstractC6438m implements InterfaceC6097a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$f$a */
        /* loaded from: classes2.dex */
        public static final class C9486a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ ShoppingListsActivity f24940w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9486a(ShoppingListsActivity shoppingListsActivity) {
                super(1);
                this.f24940w = shoppingListsActivity;
            }

            /* renamed from: a */
            public final void m10997a(ShoppingList shoppingList) {
                Intrinsics.isThisObjectNull(shoppingList, "list");
                ShoppingListsActivity.m11019o1(this.f24940w).m18279x0(shoppingList.m13737j());
                this.f24940w.setResult(-1);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m10997a((ShoppingList) obj);
                return C13195u.f34156a;
            }
        }

        C9485f() {
            super(0);
        }

        /* renamed from: a */
        public final ShoppingListsAdapter mo42214q() {
            return new ShoppingListsAdapter(ShoppingListsActivity.m11019o1(ShoppingListsActivity.this).m18277z0(), new C9486a(ShoppingListsActivity.this));
        }
    }

    /* compiled from: ShoppingListsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity$g */
    /* loaded from: classes2.dex */
    static final class C9487g extends AbstractC6438m implements InterfaceC6097a {
        C9487g() {
            super(0);
        }

        /* renamed from: a */
        public final Float mo42214q() {
            return Float.valueOf(CommonUtils.f15361a.m24296f(UtilsExtensions.m35168d(ShoppingListsActivity.this.getResources().getBoolean(C2336R.bool.min_height_screen_dim) ? 13.2f : 13.5f), 0.0f, UtilsExtensions.m35167e(15), 0.0f, 1.0f));
        }
    }

    public ShoppingListsActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        m1464a = LazyJVM.m1464a(new C9485f());
        this.f24923h0 = m1464a;
        this.f24924i0 = new C1618k(new RecyclerViewItemTouchHelper(0, 0, new C9483e(), null, 11, null));
        m1464a2 = LazyJVM.m1464a(C9479a.f24927w);
        this.f24925j0 = m1464a2;
        m1464a3 = LazyJVM.m1464a(new C9487g());
        this.f24926k0 = m1464a3;
    }

    /* renamed from: A1 */
    private final void m11033A1(boolean z, boolean z2) {
        ValueAnimator m24300b = CommonUtils.f15361a.m24300b(z ? m11015s1() : m11013u1(), z ? m11013u1() : m11015s1(), z2 ? 500L : 0L, new OvershootInterpolator());
        m24300b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ml.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShoppingListsActivity.m11031C1(ShoppingListsActivity.this, valueAnimator);
            }
        });
        m24300b.start();
    }

    /* renamed from: B1 */
    static /* synthetic */ void m11032B1(ShoppingListsActivity shoppingListsActivity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        shoppingListsActivity.m11033A1(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m11031C1(ShoppingListsActivity shoppingListsActivity, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(shoppingListsActivity, "this$0");
        Intrinsics.isThisObjectNull(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((AbstractC11905n3) shoppingListsActivity.m22738w0()).mo3947Q(Float.valueOf(((Float) animatedValue).floatValue()));
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m11026i1(ShoppingListsActivity shoppingListsActivity, ValueAnimator valueAnimator) {
        m11031C1(shoppingListsActivity, valueAnimator);
    }

    /* renamed from: j1 */
    public static /* synthetic */ boolean m11025j1(ShoppingListsActivity shoppingListsActivity, MenuItem menuItem) {
        return m11011v1(shoppingListsActivity, menuItem);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m11024k1(AbstractC11905n3 abstractC11905n3, Boolean bool) {
        m11007y1(abstractC11905n3, bool);
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m11023l1(ShoppingListsActivity shoppingListsActivity, List list) {
        m11008x1(shoppingListsActivity, list);
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m11022m1(ShoppingListsActivity shoppingListsActivity, C13195u c13195u) {
        m11005z1(shoppingListsActivity, c13195u);
    }

    /* renamed from: n1 */
    public static final /* synthetic */ ShoppingListsAdapter m11020n1(ShoppingListsActivity shoppingListsActivity) {
        return shoppingListsActivity.m11014t1();
    }

    /* renamed from: o1 */
    public static final /* synthetic */ C7517n m11019o1(ShoppingListsActivity shoppingListsActivity) {
        return (C7517n) shoppingListsActivity.m22758I0();
    }

    /* renamed from: p1 */
    public static final /* synthetic */ void m11018p1(ShoppingListsActivity shoppingListsActivity, boolean z, boolean z2) {
        shoppingListsActivity.m11033A1(z, z2);
    }

    /* renamed from: s1 */
    private final float m11015s1() {
        return ((Number) this.f24925j0.getValue()).floatValue();
    }

    /* renamed from: t1 */
    private final ShoppingListsAdapter m11014t1() {
        return (ShoppingListsAdapter) this.f24923h0.getValue();
    }

    /* renamed from: u1 */
    private final float m11013u1() {
        return ((Number) this.f24926k0.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static final boolean m11011v1(ShoppingListsActivity shoppingListsActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(shoppingListsActivity, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_add) {
            ((C7517n) shoppingListsActivity.m22758I0()).m18292k0();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m11008x1(ShoppingListsActivity shoppingListsActivity, List list) {
        Intrinsics.isThisObjectNull(shoppingListsActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(shoppingListsActivity), null, null, new C9481c(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m11007y1(AbstractC11905n3 abstractC11905n3, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11905n3, "$binding");
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11905n3.f31024z;
        Intrinsics.checkIfNull(bool, "it");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m11005z1(ShoppingListsActivity shoppingListsActivity, C13195u c13195u) {
        Intrinsics.isThisObjectNull(shoppingListsActivity, "this$0");
        m11032B1(shoppingListsActivity, true, false, 2, null);
    }

    /* renamed from: A0 */
    protected int m11034A0() {
        return C2336R.C2339menu.menu_shopping_lists;
    }

    /* renamed from: G0 */
    protected int m11030G0() {
        return C2336R.string.lbl_shopping_lists;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11029J0() {
        return C6450z.m20906b(C7517n.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11028K0() {
        return new C9480b();
    }

    /* renamed from: n */
    public boolean m11021n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: r1 */
    public final ViewModelFactoryByInjection m11016r1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24922g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public void m11027P0(final AbstractC11905n3 abstractC11905n3, C7517n c7517n) {
        Intrinsics.isThisObjectNull(abstractC11905n3, "binding");
        Intrinsics.isThisObjectNull(c7517n, "viewModel");
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11905n3.f31024z;
        placeHolderRecyclerView.setAdapter(m11014t1());
        placeHolderRecyclerView.setHoldersAdapter(new ShoppingListPlaceHolderAdapter());
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(UtilsExtensions.m35167e(10), UtilsExtensions.m35167e(10), 0, 0, false, false, 0, C4906j.f13410G0, null));
        this.f24924i0.m35981m(placeHolderRecyclerView);
        c7517n.m18285r0().mo171i(this, new InterfaceC1440f0() { // from class: ml.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListsActivity.m11008x1(ShoppingListsActivity.this, (List) obj);
            }
        });
        c7517n.m102x().mo171i(this, new InterfaceC1440f0() { // from class: ml.g
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListsActivity.m11007y1(AbstractC11905n3.this, (Boolean) obj);
            }
        });
        c7517n.m18288o0().mo171i(this, new InterfaceC1440f0() { // from class: ml.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListsActivity.m11005z1(ShoppingListsActivity.this, (C13195u) obj);
            }
        });
        LifecycleOwner.m36965a(this).m36984i(new C9482d(c7517n, null));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_shopping_lists;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m11006z0() {
        return new Toolbar.InterfaceC0450f() { // from class: ml.d
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m10239v1;
                m10239v1 = ShoppingListsActivity.m11011v1(ShoppingListsActivity.this, menuItem);
                return m10239v1;
            }
        };
    }
}
