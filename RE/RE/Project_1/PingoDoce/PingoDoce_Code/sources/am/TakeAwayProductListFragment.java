package am;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.UtilsExtensions;
import bm.TakeAwayProductListAdapter;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import de.EndlessRecyclerOnScrollListener;
import ee.MarginItemDecoration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import java.util.Objects;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p039c3.C2046o;
import p050d.C4519c;
import p087ej.ItemSmallPlaceHolderAdapter;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p223lg.InterfaceC7054a;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC12133z6;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.AbstractC13876n;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: am.e */
/* loaded from: classes2.dex */
public final class TakeAwayProductListFragment extends AbstractC13876n {

    /* renamed from: I0 */
    public static final C0209a f466I0 = new C0209a(null);

    /* renamed from: A0 */
    public ViewModelFactoryByInjection f467A0;

    /* renamed from: B0 */
    private final AbstractC0304b f468B0;

    /* renamed from: C0 */
    private final InterfaceC13178g f469C0;

    /* renamed from: D0 */
    private final InterfaceC13178g f470D0;

    /* renamed from: E0 */
    private final InterfaceC13178g f471E0;

    /* renamed from: F0 */
    private final InterfaceC13178g f472F0;

    /* renamed from: G0 */
    private final InterfaceC13178g f473G0;

    /* renamed from: H0 */
    private final InterfaceC13178g f474H0;

    /* renamed from: z0 */
    private final InterfaceC6108l f475z0;

    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$a */
    /* loaded from: classes2.dex */
    public static final class C0209a {
        private C0209a() {
        }

        public /* synthetic */ C0209a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TakeAwayProductListFragment m41550a(TakeAwayFlowData takeAwayFlowData, String str, int i, String str2, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
            Intrinsics.isThisObjectNull(str, "categoryId");
            Intrinsics.isThisObjectNull(str2, "pickupDate");
            TakeAwayProductListFragment takeAwayProductListFragment = new TakeAwayProductListFragment(interfaceC6108l, interfaceC6108l2);
            Bundle bundle = new Bundle();
            if (takeAwayFlowData != null) {
                bundle.putParcelable("EXTRA_FOR_FLOW_DATA", takeAwayFlowData);
            }
            bundle.putString("EXTRA_FOR_CATEGORY_ID", str);
            bundle.putInt("EXTRA_FOR_STORE_ID", i);
            bundle.putString("EXTRA_FOR_PICKUP_DATE", str2);
            bundle.putBoolean("EXTRA_FOR_IS_FEATURED", z);
            takeAwayProductListFragment.m37630P1(bundle);
            return takeAwayProductListFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$b */
    /* loaded from: classes2.dex */
    public static final class C0210b extends AbstractC6438m implements InterfaceC6097a {
        C0210b() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            Bundle m37660E = TakeAwayProductListFragment.this.m37660E();
            String string = m37660E != null ? m37660E.getString("EXTRA_FOR_CATEGORY_ID", BuildConfig.VERSION_NAME) : null;
            return string == null ? BuildConfig.VERSION_NAME : string;
        }
    }

    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$c */
    /* loaded from: classes2.dex */
    static final class C0211c extends AbstractC6438m implements InterfaceC6097a {
        C0211c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(TakeAwayProductListFragment.this.m41572B2(), TakeAwayProductListFragment.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$d */
    /* loaded from: classes2.dex */
    public static final class C0212d extends AbstractC6438m implements InterfaceC6097a {
        C0212d() {
            super(0);
        }

        /* renamed from: a */
        public final TakeAwayFlowData mo42214q() {
            Bundle m37660E = TakeAwayProductListFragment.this.m37660E();
            if (m37660E != null) {
                return (TakeAwayFlowData) m37660E.getParcelable("EXTRA_FOR_FLOW_DATA");
            }
            return null;
        }
    }

    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$e */
    /* loaded from: classes2.dex */
    public static final class C0213e extends EndlessRecyclerOnScrollListener {

        /* renamed from: c */
        final /* synthetic */ TakeAwayProductListFragmentViewModel f479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0213e(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel, RecyclerView.AbstractC1546o abstractC1546o) {
            super((LinearLayoutManager) abstractC1546o, 0, 2, null);
            this.f479c = takeAwayProductListFragmentViewModel;
            Objects.requireNonNull(abstractC1546o, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        /* renamed from: c */
        public void m41546c(int i) {
            this.f479c.m41527b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$f */
    /* loaded from: classes2.dex */
    public static final class C0214f extends AbstractC6438m implements InterfaceC6097a {
        C0214f() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            Bundle m37660E = TakeAwayProductListFragment.this.m37660E();
            return Boolean.valueOf(m37660E != null ? m37660E.getBoolean("EXTRA_FOR_IS_FEATURED") : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$g */
    /* loaded from: classes2.dex */
    public static final class C0215g extends AbstractC6438m implements InterfaceC6097a {
        C0215g() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            Bundle m37660E = TakeAwayProductListFragment.this.m37660E();
            String string = m37660E != null ? m37660E.getString("EXTRA_FOR_PICKUP_DATE", BuildConfig.VERSION_NAME) : null;
            return string == null ? BuildConfig.VERSION_NAME : string;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$h */
    /* loaded from: classes2.dex */
    public static final class C0216h extends AbstractC6438m implements InterfaceC6097a {
        C0216h() {
            super(0);
        }

        /* renamed from: a */
        public final Integer mo42214q() {
            Bundle m37660E = TakeAwayProductListFragment.this.m37660E();
            return Integer.valueOf(m37660E != null ? m37660E.getInt("EXTRA_FOR_STORE_ID", -1) : -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListFragment.kt */
    /* renamed from: am.e$i */
    /* loaded from: classes2.dex */
    public static final class C0217i extends AbstractC6438m implements InterfaceC6097a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayProductListFragment.kt */
        /* renamed from: am.e$i$a */
        /* loaded from: classes2.dex */
        public static final class C0218a extends AbstractC6438m implements InterfaceC6113q {

            /* renamed from: w */
            final /* synthetic */ TakeAwayProductListFragment f484w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0218a(TakeAwayProductListFragment takeAwayProductListFragment) {
                super(3);
                this.f484w = takeAwayProductListFragment;
            }

            /* renamed from: C */
            public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
                m41541a(((Number) obj).intValue(), (InterfaceC7054a) obj2, (View) obj3);
                return C13195u.f34156a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
                if (r7 <= ((androidx.recyclerview.widget.LinearLayoutManager) r4).m36770c2()) goto L12;
             */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m41541a(int r7, p223lg.InterfaceC7054a r8, android.view.View r9) {
                /*
                    r6 = this;
                    java.lang.String r0 = "item"
                    p181jd.Intrinsics.isThisObjectNull(r8, r0)
                    boolean r0 = r8 instanceof pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct
                    if (r0 == 0) goto L9f
                    pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct r8 = (pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct) r8
                    boolean r0 = r8.m14262E()
                    java.lang.String r1 = "requireActivity()"
                    r2 = 0
                    if (r0 == 0) goto L73
                    am.e r0 = r6.f484w
                    androidx.activity.result.b r0 = am.TakeAwayProductListFragment.m41553x2(r0)
                    am.e r3 = r6.f484w
                    androidx.fragment.app.d r3 = r3.m37652G1()
                    p181jd.Intrinsics.checkIfNull(r3, r1)
                    am.e r1 = r6.f484w
                    am.f r1 = am.TakeAwayProductListFragment.m41552y2(r1)
                    boolean r1 = r1.m34577T()
                    if (r1 == 0) goto L3c
                    am.e r1 = r6.f484w
                    am.f r1 = am.TakeAwayProductListFragment.m41552y2(r1)
                    pt.pingodoce.app.data.local.flows.FlowData r1 = r1.m34578S()
                    pt.pingodoce.app.data.local.flows.TakeAwayFlowData r1 = (pt.pingodoce.app.data.local.flows.TakeAwayFlowData) r1
                    goto L3d
                L3c:
                    r1 = r2
                L3d:
                    am.e r4 = r6.f484w
                    wg.z6 r4 = am.TakeAwayProductListFragment.m41555v2(r4)
                    com.github.guilhe.views.PlaceHolderRecyclerView r4 = r4.f32043x
                    androidx.recyclerview.widget.RecyclerView$o r4 = r4.getLayoutManager()
                    java.lang.String r5 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                    java.util.Objects.requireNonNull(r4, r5)
                    androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
                    int r4 = r4.m36776W1()
                    if (r7 < r4) goto L6e
                    am.e r4 = r6.f484w
                    wg.z6 r4 = am.TakeAwayProductListFragment.m41555v2(r4)
                    com.github.guilhe.views.PlaceHolderRecyclerView r4 = r4.f32043x
                    androidx.recyclerview.widget.RecyclerView$o r4 = r4.getLayoutManager()
                    java.util.Objects.requireNonNull(r4, r5)
                    androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
                    int r4 = r4.m36770c2()
                    if (r7 > r4) goto L6e
                    goto L6f
                L6e:
                    r9 = r2
                L6f:
                    cm.TakeAwayMealDetailActivity.m34500a(r0, r3, r1, r8, r9)
                    goto Lae
                L73:
                    am.e r7 = r6.f484w
                    androidx.activity.result.b r7 = am.TakeAwayProductListFragment.m41553x2(r7)
                    am.e r9 = r6.f484w
                    androidx.fragment.app.d r9 = r9.m37652G1()
                    p181jd.Intrinsics.checkIfNull(r9, r1)
                    am.e r0 = r6.f484w
                    am.f r0 = am.TakeAwayProductListFragment.m41552y2(r0)
                    boolean r0 = r0.m34577T()
                    if (r0 == 0) goto L9b
                    am.e r0 = r6.f484w
                    am.f r0 = am.TakeAwayProductListFragment.m41552y2(r0)
                    pt.pingodoce.app.data.local.flows.FlowData r0 = r0.m34578S()
                    r2 = r0
                    pt.pingodoce.app.data.local.flows.TakeAwayFlowData r2 = (pt.pingodoce.app.data.local.flows.TakeAwayFlowData) r2
                L9b:
                    cm.TakeAwayMenuDetailActivity.m34498a(r7, r9, r2, r8)
                    goto Lae
                L9f:
                    boolean r7 = r8 instanceof pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory
                    if (r7 == 0) goto Lae
                    am.e r7 = r6.f484w
                    id.l r7 = am.TakeAwayProductListFragment.m41554w2(r7)
                    if (r7 == 0) goto Lae
                    r7.mo9587d(r8)
                Lae:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: am.TakeAwayProductListFragment.C0217i.C0218a.m41541a(int, lg.a, android.view.View):void");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayProductListFragment.kt */
        /* renamed from: am.e$i$b */
        /* loaded from: classes2.dex */
        public static final class C0219b extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ TakeAwayProductListFragment f485w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0219b(TakeAwayProductListFragment takeAwayProductListFragment) {
                super(2);
                this.f485w = takeAwayProductListFragment;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m41540a((TakeAwayProduct) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m41540a(TakeAwayProduct takeAwayProduct, int i) {
                Intrinsics.isThisObjectNull(takeAwayProduct, "product");
                TakeAwayProductListFragment.m41552y2(this.f485w).m41529Z0(takeAwayProduct, i);
            }
        }

        C0217i() {
            super(0);
        }

        /* renamed from: a */
        public final TakeAwayProductListAdapter mo42214q() {
            InterfaceC1491v m37582i0 = TakeAwayProductListFragment.this.m37582i0();
            Intrinsics.checkIfNull(m37582i0, "viewLifecycleOwner");
            return new TakeAwayProductListAdapter(LifecycleOwner.m36965a(m37582i0), new C0218a(TakeAwayProductListFragment.this), new C0219b(TakeAwayProductListFragment.this));
        }
    }

    public TakeAwayProductListFragment() {
        this(null, null, 3, null);
    }

    public /* synthetic */ TakeAwayProductListFragment(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC6108l, (i & 2) != 0 ? null : interfaceC6108l2);
    }

    /* renamed from: A2 */
    private final String m41573A2() {
        return (String) this.f471E0.getValue();
    }

    /* renamed from: C2 */
    private final TakeAwayFlowData m41571C2() {
        return (TakeAwayFlowData) this.f470D0.getValue();
    }

    /* renamed from: D2 */
    private final String m41570D2() {
        return (String) this.f473G0.getValue();
    }

    /* renamed from: E2 */
    private final int m41569E2() {
        return ((Number) this.f472F0.getValue()).intValue();
    }

    /* renamed from: F2 */
    private final TakeAwayProductListAdapter m41568F2() {
        return (TakeAwayProductListAdapter) this.f469C0.getValue();
    }

    /* renamed from: H2 */
    private final boolean m41566H2() {
        return ((Boolean) this.f474H0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m41565I2(TakeAwayProductListFragment takeAwayProductListFragment, List list) {
        Intrinsics.isThisObjectNull(takeAwayProductListFragment, "this$0");
        TakeAwayProductListAdapter m41568F2 = takeAwayProductListFragment.m41568F2();
        Intrinsics.checkIfNull(list, "it");
        m41568F2.m22153F(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m41564J2(TakeAwayProductListFragment takeAwayProductListFragment, Boolean bool) {
        Intrinsics.isThisObjectNull(takeAwayProductListFragment, "this$0");
        C2046o.m34853a(((AbstractC12133z6) takeAwayProductListFragment.m22723h2()).f32043x);
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC12133z6) takeAwayProductListFragment.m22723h2()).f32043x;
        Intrinsics.checkIfNull(bool, "isLoading");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* renamed from: s2 */
    public static /* synthetic */ void m41558s2(TakeAwayProductListFragment takeAwayProductListFragment, Boolean bool) {
        m41564J2(takeAwayProductListFragment, bool);
    }

    /* renamed from: t2 */
    public static /* synthetic */ void m41557t2(TakeAwayProductListFragment takeAwayProductListFragment, InterfaceC6108l interfaceC6108l, ActivityResult activityResult) {
        m41551z2(takeAwayProductListFragment, interfaceC6108l, activityResult);
    }

    /* renamed from: u2 */
    public static /* synthetic */ void m41556u2(TakeAwayProductListFragment takeAwayProductListFragment, List list) {
        m41565I2(takeAwayProductListFragment, list);
    }

    /* renamed from: v2 */
    public static final /* synthetic */ AbstractC12133z6 m41555v2(TakeAwayProductListFragment takeAwayProductListFragment) {
        return (AbstractC12133z6) takeAwayProductListFragment.m22723h2();
    }

    /* renamed from: w2 */
    public static final /* synthetic */ InterfaceC6108l m41554w2(TakeAwayProductListFragment takeAwayProductListFragment) {
        return takeAwayProductListFragment.f475z0;
    }

    /* renamed from: x2 */
    public static final /* synthetic */ AbstractC0304b m41553x2(TakeAwayProductListFragment takeAwayProductListFragment) {
        return takeAwayProductListFragment.f468B0;
    }

    /* renamed from: y2 */
    public static final /* synthetic */ TakeAwayProductListFragmentViewModel m41552y2(TakeAwayProductListFragment takeAwayProductListFragment) {
        return (TakeAwayProductListFragmentViewModel) takeAwayProductListFragment.m22721j2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m41551z2(TakeAwayProductListFragment takeAwayProductListFragment, InterfaceC6108l interfaceC6108l, ActivityResult activityResult) {
        Bundle extras;
        String string;
        Intrinsics.isThisObjectNull(takeAwayProductListFragment, "this$0");
        Intent m41352a = activityResult.m41352a();
        if (m41352a == null || (extras = m41352a.getExtras()) == null || (string = extras.getString("EXTRA_FOR_EMAIL")) == null) {
            return;
        }
        ((TakeAwayProductListFragmentViewModel) takeAwayProductListFragment.m22721j2()).m14851I0(string);
        if (interfaceC6108l != null) {
            interfaceC6108l.mo9587d(((TakeAwayProductListFragmentViewModel) takeAwayProductListFragment.m22721j2()).m34578S());
        }
    }

    /* renamed from: B2 */
    public final ViewModelFactoryByInjection m41572B2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f467A0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G2 */
    public void m41559p2(AbstractC12133z6 abstractC12133z6, TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        Intrinsics.isThisObjectNull(abstractC12133z6, "binding");
        Intrinsics.isThisObjectNull(takeAwayProductListFragmentViewModel, "viewModel");
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC12133z6.f32043x;
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(16), 0, 0, false, false, 0, 76, null));
        placeHolderRecyclerView.m36645l(new C0213e(takeAwayProductListFragmentViewModel, placeHolderRecyclerView.getLayoutManager()));
        placeHolderRecyclerView.setAdapter(m41568F2());
        placeHolderRecyclerView.setHoldersAdapter(new ItemSmallPlaceHolderAdapter());
    }

    /* renamed from: K2 */
    public final void m41563K2(TakeAwayFlowData takeAwayFlowData) {
        Intrinsics.isThisObjectNull(takeAwayFlowData, "data");
        ((TakeAwayProductListFragmentViewModel) m22721j2()).m34576U(takeAwayFlowData);
    }

    /* renamed from: Y0 */
    public void mo33458Y0() {
        super.mo33458Y0();
        ((TakeAwayProductListFragmentViewModel) m22721j2()).m41526c1(m41573A2());
    }

    /* renamed from: c1 */
    public void mo37596c1(View view, Bundle bundle) {
        Intrinsics.isThisObjectNull(view, "view");
        super.mo37596c1(view, bundle);
        ((TakeAwayProductListFragmentViewModel) m22721j2()).m41528a1().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: am.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayProductListFragment.m41565I2(TakeAwayProductListFragment.this, (List) obj);
            }
        });
        ((TakeAwayProductListFragmentViewModel) m22721j2()).m102x().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: am.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayProductListFragment.m41564J2(TakeAwayProductListFragment.this, (Boolean) obj);
            }
        });
        if ((m41573A2().length() > 0) && m41569E2() != -1) {
            if (m41570D2().length() > 0) {
                ((TakeAwayProductListFragmentViewModel) m22721j2()).m41525d1(m41573A2(), m41569E2(), m41570D2(), m41566H2(), true);
            }
        }
        TakeAwayFlowData m41571C2 = m41571C2();
        if (m41571C2 != null) {
            m41563K2(m41571C2);
        }
    }

    /* renamed from: i2 */
    protected int m41562i2() {
        return C2336R.layout.fragment_take_away_product_list;
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m41561k2() {
        return C6450z.m20906b(TakeAwayProductListFragmentViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m41560l2() {
        return new C0211c();
    }

    public TakeAwayProductListFragment(InterfaceC6108l interfaceC6108l, final InterfaceC6108l interfaceC6108l2) {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        InterfaceC13178g m1464a4;
        InterfaceC13178g m1464a5;
        InterfaceC13178g m1464a6;
        this.f475z0 = interfaceC6108l;
        AbstractC0304b m37661D1 = m37661D1(new C4519c(), new InterfaceC0303a() { // from class: am.b
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                TakeAwayProductListFragment.m41551z2(TakeAwayProductListFragment.this, interfaceC6108l2, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m37661D1, "registerForActivityResul…owData())\n        }\n    }");
        this.f468B0 = m37661D1;
        m1464a = LazyJVM.m1464a(new C0217i());
        this.f469C0 = m1464a;
        m1464a2 = LazyJVM.m1464a(new C0212d());
        this.f470D0 = m1464a2;
        m1464a3 = LazyJVM.m1464a(new C0210b());
        this.f471E0 = m1464a3;
        m1464a4 = LazyJVM.m1464a(new C0216h());
        this.f472F0 = m1464a4;
        m1464a5 = LazyJVM.m1464a(new C0215g());
        this.f473G0 = m1464a5;
        m1464a6 = LazyJVM.m1464a(new C0214f());
        this.f474H0 = m1464a6;
    }
}
