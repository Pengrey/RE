package pt.pingodoce.app.presentation.purchases.list;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import ci.C2141e;
import ci.FlowActivity;
import ci.InterfaceC2154o;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView;
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions;
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.tabs.TabLayout;
import ee.MarginItemDecoration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import il.PurchaseListAdapter;
import il.PurchaseListViewModel;
import java.util.List;
import java.util.Locale;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p039c3.C2046o;
import p086ei.BenefitsPlaceHolderAdapter;
import p146hl.PurchaseDetailActivity;
import p163ih.PurchasesChartViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p426wg.AbstractC12094x2;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.CollectionsJVM;
import p494zh.AbstractC13816c;
import p494zh.C13920x1;
import pe.C8617d;
import pe.C8618e;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity;
import sd.C10171u;
import sd.Indent;
import td.InterfaceC10524i0;

/* compiled from: PurchaseListActivity.kt */
/* loaded from: classes2.dex */
public final class PurchaseListActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24605g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f24606h0;

    /* renamed from: i0 */
    private final InterfaceC13178g f24607i0;

    /* renamed from: j0 */
    private final InterfaceC13178g f24608j0;

    /* renamed from: k0 */
    private final InterfaceC13178g f24609k0;

    /* renamed from: l0 */
    private final InterfaceC13178g f24610l0;

    /* renamed from: m0 */
    private final InterfaceC13178g f24611m0;

    /* renamed from: n0 */
    private final String f24612n0;

    /* renamed from: o0 */
    private final InterfaceC13178g f24613o0;

    /* renamed from: p0 */
    private final InterfaceC13178g f24614p0;

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$a */
    /* loaded from: classes2.dex */
    static final class C9362a extends AbstractC6438m implements InterfaceC6097a {
        C9362a() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            CharSequence m8890j0;
            ResourcesProvider m6898a = C10841b.m6898a(PurchaseListActivity.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), 2131951628).getTheme().resolveAttribute(C2336R.attr.chartBackgroundColor, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(resourcesPro…style.App_Account_Chart))");
            m8890j0 = C10171u.m8890j0(hexString, 0, 2);
            String obj = m8890j0.toString();
            return "#" + obj;
        }
    }

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$b */
    /* loaded from: classes2.dex */
    static final class C9363b extends AbstractC6438m implements InterfaceC6097a {
        C9363b() {
            super(0);
        }

        /* renamed from: a */
        public final AAOptions mo42214q() {
            AAOptions title = new AAOptions().chart(new AAChart().type(AAChartType.Column).backgroundColor(PurchaseListActivity.m11435v1(PurchaseListActivity.this))).tooltip(PurchaseListActivity.m11430z1(PurchaseListActivity.this)).title(new AATitle().text(BuildConfig.VERSION_NAME));
            AALegend aALegend = new AALegend();
            Boolean bool = Boolean.FALSE;
            return title.legend(aALegend.enabled(bool)).xAxis(new AAXAxis().labels(new AALabels().enabled(bool))).yAxis(new AAYAxis().visible(bool)).colors(new Object[]{PurchaseListActivity.m11432x1(PurchaseListActivity.this)});
        }
    }

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$c */
    /* loaded from: classes2.dex */
    static final class C9364c extends AbstractC6438m implements InterfaceC6097a {
        C9364c() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            CharSequence m8890j0;
            ResourcesProvider m6898a = C10841b.m6898a(PurchaseListActivity.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), 2131951628).getTheme().resolveAttribute(C2336R.attr.chartDataColor, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(resourcesPro…style.App_Account_Chart))");
            m8890j0 = C10171u.m8890j0(hexString, 0, 2);
            String obj = m8890j0.toString();
            return "#" + obj;
        }
    }

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$d */
    /* loaded from: classes2.dex */
    static final class C9365d extends AbstractC6438m implements InterfaceC6097a {
        C9365d() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(PurchaseListActivity.this.m11459G1(), PurchaseListActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$initViews$4$1", m20196f = "PurchaseListActivity.kt", m20195l = {143}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9366e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24619x;

        /* renamed from: y */
        final /* synthetic */ PurchaseListAdapter f24620y;

        /* renamed from: z */
        final /* synthetic */ List f24621z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9366e(PurchaseListAdapter purchaseListAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24620y = purchaseListAdapter;
            this.f24621z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9366e(this.f24620y, this.f24621z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9366e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24619x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchaseListAdapter purchaseListAdapter = this.f24620y;
                List list = this.f24621z;
                Intrinsics.checkIfNull(list, "it");
                this.f24619x = 1;
                if (purchaseListAdapter.m22148H(list, this) == m34636d) {
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

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$f */
    /* loaded from: classes2.dex */
    public static final class C9367f implements TabLayout.InterfaceC3724d {

        /* renamed from: a */
        final /* synthetic */ PurchaseListViewModel f24622a;

        C9367f(PurchaseListViewModel purchaseListViewModel) {
            this.f24622a = purchaseListViewModel;
        }

        /* renamed from: a */
        public void mo29092a(TabLayout.C3728f c3728f) {
        }

        /* renamed from: b */
        public void mo29091b(TabLayout.C3728f c3728f) {
        }

        /* renamed from: c */
        public void mo29090c(TabLayout.C3728f c3728f) {
            if (c3728f != null) {
                PurchaseListViewModel purchaseListViewModel = this.f24622a;
                int m29150g = c3728f.m29150g();
                if (m29150g == 0) {
                    purchaseListViewModel.m21932i0(PurchasesChartViewModel.EnumC6140a.FILTER_BY_30_DAYS);
                } else if (m29150g != 1) {
                    purchaseListViewModel.m21932i0(PurchasesChartViewModel.EnumC6140a.FILTER_BY_12_MONTHS);
                } else {
                    purchaseListViewModel.m21932i0(PurchasesChartViewModel.EnumC6140a.FILTER_BY_3_MONTHS);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$g */
    /* loaded from: classes2.dex */
    public static final class C9368g extends AbstractC6438m implements InterfaceC6108l {
        C9368g() {
            super(1);
        }

        /* renamed from: a */
        public final void m11421a(Purchase purchase) {
            Intrinsics.isThisObjectNull(purchase, "it");
            PurchaseDetailActivity.m22579b(PurchaseListActivity.this, purchase.m14434i(), purchase.m14424y(), purchase.m14428s(), purchase.m14435h(), false);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11421a((Purchase) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$h */
    /* loaded from: classes2.dex */
    static final class C9369h extends AbstractC6438m implements InterfaceC6097a {
        C9369h() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            String string = C10841b.m6898a(PurchaseListActivity.this).m6899a().getString(C2336R.string.lbl_saved_alt);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            return string;
        }
    }

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$i */
    /* loaded from: classes2.dex */
    static final class C9370i extends AbstractC6438m implements InterfaceC6097a {
        C9370i() {
            super(0);
        }

        /* renamed from: a */
        public final AATooltip mo42214q() {
            String m8959f;
            AATooltip useHTML = new AATooltip().useHTML(Boolean.TRUE);
            String m11431y1 = PurchaseListActivity.m11431y1(PurchaseListActivity.this);
            String m11434w1 = PurchaseListActivity.m11434w1(PurchaseListActivity.this);
            String m11465C1 = PurchaseListActivity.m11465C1(PurchaseListActivity.this);
            m8959f = Indent.m8959f("function () { return '" + m11431y1 + " '+ this.y.toLocaleString('" + m11434w1 + "', { minimumFractionDigits: 2 }) + '" + m11465C1 + "'; }");
            return useHTML.formatter(m8959f).valueDecimals(2).backgroundColor(PurchaseListActivity.m11467A1(PurchaseListActivity.this)).borderColor(PurchaseListActivity.m11467A1(PurchaseListActivity.this)).borderRadius(Float.valueOf(20.0f)).style(new AAStyle().color(PurchaseListActivity.m11466B1(PurchaseListActivity.this)).fontWeight(AAChartFontWeightType.Bold));
        }
    }

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$j */
    /* loaded from: classes2.dex */
    static final class C9371j extends AbstractC6438m implements InterfaceC6097a {
        C9371j() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            CharSequence m8890j0;
            ResourcesProvider m6898a = C10841b.m6898a(PurchaseListActivity.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), 2131951628).getTheme().resolveAttribute(C2336R.attr.chartTooltipBackgroundColor, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(resourcesPro…style.App_Account_Chart))");
            m8890j0 = C10171u.m8890j0(hexString, 0, 2);
            String obj = m8890j0.toString();
            return "#" + obj;
        }
    }

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$k */
    /* loaded from: classes2.dex */
    static final class C9372k extends AbstractC6438m implements InterfaceC6097a {
        C9372k() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            CharSequence m8890j0;
            ResourcesProvider m6898a = C10841b.m6898a(PurchaseListActivity.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), 2131951628).getTheme().resolveAttribute(C2336R.attr.chartTooltipTextColor, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(resourcesPro…style.App_Account_Chart))");
            m8890j0 = C10171u.m8890j0(hexString, 0, 2);
            String obj = m8890j0.toString();
            return "#" + obj;
        }
    }

    /* compiled from: PurchaseListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity$l */
    /* loaded from: classes2.dex */
    static final class C9373l extends AbstractC6438m implements InterfaceC6097a {
        C9373l() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            String string = C10841b.m6898a(PurchaseListActivity.this).m6899a().getString(C2336R.string.lbl_price_unit);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            return string;
        }
    }

    public PurchaseListActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        InterfaceC13178g m1464a4;
        InterfaceC13178g m1464a5;
        InterfaceC13178g m1464a6;
        InterfaceC13178g m1464a7;
        InterfaceC13178g m1464a8;
        m1464a = LazyJVM.m1464a(new C9362a());
        this.f24606h0 = m1464a;
        m1464a2 = LazyJVM.m1464a(new C9371j());
        this.f24607i0 = m1464a2;
        m1464a3 = LazyJVM.m1464a(new C9372k());
        this.f24608j0 = m1464a3;
        m1464a4 = LazyJVM.m1464a(new C9364c());
        this.f24609k0 = m1464a4;
        m1464a5 = LazyJVM.m1464a(new C9369h());
        this.f24610l0 = m1464a5;
        m1464a6 = LazyJVM.m1464a(new C9373l());
        this.f24611m0 = m1464a6;
        this.f24612n0 = Locale.getDefault().getCountry();
        m1464a7 = LazyJVM.m1464a(new C9370i());
        this.f24613o0 = m1464a7;
        m1464a8 = LazyJVM.m1464a(new C9363b());
        this.f24614p0 = m1464a8;
    }

    /* renamed from: A1 */
    public static final /* synthetic */ String m11467A1(PurchaseListActivity purchaseListActivity) {
        return purchaseListActivity.m11455J1();
    }

    /* renamed from: B1 */
    public static final /* synthetic */ String m11466B1(PurchaseListActivity purchaseListActivity) {
        return purchaseListActivity.m11453K1();
    }

    /* renamed from: C1 */
    public static final /* synthetic */ String m11465C1(PurchaseListActivity purchaseListActivity) {
        return purchaseListActivity.m11452L1();
    }

    /* renamed from: D1 */
    private final String m11463D1() {
        return (String) this.f24606h0.getValue();
    }

    /* renamed from: E1 */
    private final AAOptions m11462E1() {
        return (AAOptions) this.f24614p0.getValue();
    }

    /* renamed from: F1 */
    private final String m11461F1() {
        return (String) this.f24609k0.getValue();
    }

    /* renamed from: H1 */
    private final String m11458H1() {
        return (String) this.f24610l0.getValue();
    }

    /* renamed from: I1 */
    private final AATooltip m11457I1() {
        return (AATooltip) this.f24613o0.getValue();
    }

    /* renamed from: J1 */
    private final String m11455J1() {
        return (String) this.f24607i0.getValue();
    }

    /* renamed from: K1 */
    private final String m11453K1() {
        return (String) this.f24608j0.getValue();
    }

    /* renamed from: L1 */
    private final String m11452L1() {
        return (String) this.f24611m0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m11450N1(NestedScrollView nestedScrollView, PurchaseListViewModel purchaseListViewModel, View view, int i, int i2, int i3, int i4) {
        Intrinsics.isThisObjectNull(nestedScrollView, "$this_with");
        Intrinsics.isThisObjectNull(purchaseListViewModel, "$viewModel");
        if (nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1).getBottom() - (nestedScrollView.getHeight() + i2) == 0 && purchaseListViewModel.m21919v0()) {
            purchaseListViewModel.m21922s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m11449O1(AbstractC12094x2 abstractC12094x2, PurchaseListViewModel purchaseListViewModel, PurchaseListActivity purchaseListActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC12094x2, "$binding");
        Intrinsics.isThisObjectNull(purchaseListViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(purchaseListActivity, "this$0");
        C2046o.m34853a(abstractC12094x2.f31845F);
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC12094x2.f31845F;
        Intrinsics.checkIfNull(bool, "it");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
        if (Intrinsics.equals(bool, Boolean.FALSE)) {
            purchaseListViewModel.m102x().mo167o(purchaseListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m11447P1(PurchaseListActivity purchaseListActivity, PurchaseListAdapter purchaseListAdapter, List list) {
        Intrinsics.isThisObjectNull(purchaseListActivity, "this$0");
        Intrinsics.isThisObjectNull(purchaseListAdapter, "$purchaseAdapter");
        LifecycleOwner.m36965a(purchaseListActivity).m36984i(new C9366e(purchaseListAdapter, list, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m11446Q1(AbstractC12094x2 abstractC12094x2, PurchaseListActivity purchaseListActivity, List list) {
        Intrinsics.isThisObjectNull(abstractC12094x2, "$binding");
        Intrinsics.isThisObjectNull(purchaseListActivity, "this$0");
        AAChartView aAChartView = abstractC12094x2.f31844E;
        AAOptions m11462E1 = purchaseListActivity.m11462E1();
        AASeriesElement aASeriesElement = new AASeriesElement();
        Intrinsics.checkIfNull(list, "data");
        Object[] array = list.toArray(new Object[0]);
        Intrinsics.m20929f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        aAChartView.aa_drawChartWithChartOptions(m11462E1.series(new Object[]{aASeriesElement.data(array).borderWidth(Float.valueOf(0.0f))}));
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m11440r1(AbstractC12094x2 abstractC12094x2, PurchaseListViewModel purchaseListViewModel, PurchaseListActivity purchaseListActivity, Boolean bool) {
        m11449O1(abstractC12094x2, purchaseListViewModel, purchaseListActivity, bool);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m11439s1(NestedScrollView nestedScrollView, PurchaseListViewModel purchaseListViewModel, View view, int i, int i2, int i3, int i4) {
        m11450N1(nestedScrollView, purchaseListViewModel, view, i, i2, i3, i4);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m11438t1(PurchaseListActivity purchaseListActivity, PurchaseListAdapter purchaseListAdapter, List list) {
        m11447P1(purchaseListActivity, purchaseListAdapter, list);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m11437u1(AbstractC12094x2 abstractC12094x2, PurchaseListActivity purchaseListActivity, List list) {
        m11446Q1(abstractC12094x2, purchaseListActivity, list);
    }

    /* renamed from: v1 */
    public static final /* synthetic */ String m11435v1(PurchaseListActivity purchaseListActivity) {
        return purchaseListActivity.m11463D1();
    }

    /* renamed from: w1 */
    public static final /* synthetic */ String m11434w1(PurchaseListActivity purchaseListActivity) {
        return purchaseListActivity.f24612n0;
    }

    /* renamed from: x1 */
    public static final /* synthetic */ String m11432x1(PurchaseListActivity purchaseListActivity) {
        return purchaseListActivity.m11461F1();
    }

    /* renamed from: y1 */
    public static final /* synthetic */ String m11431y1(PurchaseListActivity purchaseListActivity) {
        return purchaseListActivity.m11458H1();
    }

    /* renamed from: z1 */
    public static final /* synthetic */ AATooltip m11430z1(PurchaseListActivity purchaseListActivity) {
        return purchaseListActivity.m11457I1();
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_SLIDE_ON_TOP")) {
            z = false;
        }
        return z ? C2336R.C2337drawable.ic_close : C2336R.C2337drawable.ic_arrow_back;
    }

    /* renamed from: G0 */
    protected int m11460G0() {
        Bundle extras;
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null && (extras = intent.getExtras()) != null && !extras.getBoolean("EXTRA_FROM_MOSAIC_CLICK")) {
            z = true;
        }
        return z ? C2336R.string.lbl_purchase_history_alt : C2336R.string.lbl_saved;
    }

    /* renamed from: G1 */
    public final ViewModelFactoryByInjection m11459G1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24605g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11456J0() {
        return C6450z.m20906b(PurchaseListViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11454K0() {
        return new C9365d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M1 */
    public void m11441n1(final AbstractC12094x2 abstractC12094x2, final PurchaseListViewModel purchaseListViewModel) {
        Bundle extras;
        Bundle extras2;
        Intrinsics.isThisObjectNull(abstractC12094x2, "binding");
        Intrinsics.isThisObjectNull(purchaseListViewModel, "viewModel");
        super.m34589n1(abstractC12094x2, purchaseListViewModel);
        Intent intent = getIntent();
        boolean z = true;
        if (intent == null || (extras2 = intent.getExtras()) == null || !extras2.getBoolean("EXTRA_FROM_MOSAIC_CLICK")) {
            z = false;
        }
        purchaseListViewModel.m21921t0(z);
        C9368g c9368g = new C9368g();
        Intent intent2 = getIntent();
        final PurchaseListAdapter purchaseListAdapter = new PurchaseListAdapter(c9368g, (intent2 == null || (extras = intent2.getExtras()) == null) ? false : extras.getBoolean("EXTRA_FROM_MOSAIC_CLICK"));
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC12094x2.f31845F;
        placeHolderRecyclerView.setAdapter(purchaseListAdapter);
        placeHolderRecyclerView.setHoldersAdapter(new BenefitsPlaceHolderAdapter());
        placeHolderRecyclerView.setHoldersItemDecoration(new MarginItemDecoration(UtilsExtensions.m35167e(16), 0, UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(10), false, false, 0, 112, null));
        placeHolderRecyclerView.setNestedScrollingEnabled(false);
        final NestedScrollView nestedScrollView = abstractC12094x2.f31846G;
        nestedScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: il.a
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                PurchaseListActivity.m11450N1(NestedScrollView.this, purchaseListViewModel, view, i, i2, i3, i4);
            }
        });
        purchaseListViewModel.m102x().mo171i(this, new InterfaceC1440f0() { // from class: il.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PurchaseListActivity.m11449O1(AbstractC12094x2.this, purchaseListViewModel, this, (Boolean) obj);
            }
        });
        purchaseListViewModel.m21927n0().mo171i(this, new InterfaceC1440f0() { // from class: il.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PurchaseListActivity.m11447P1(PurchaseListActivity.this, purchaseListAdapter, (List) obj);
            }
        });
        TabLayout tabLayout = abstractC12094x2.f31842C;
        TabLayout.C3728f m29209A = tabLayout.m29209A();
        Intrinsics.checkIfNull(tabLayout, BuildConfig.VERSION_NAME);
        String string = C10841b.m6897b(tabLayout).m6899a().getString(C2336R.string.btn_30_days);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkIfNull(locale, "getDefault()");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkIfNull(upperCase, "this as java.lang.String).toUpperCase(locale)");
        m29209A.m29139r(upperCase);
        tabLayout.m29189e(m29209A);
        TabLayout.C3728f m29209A2 = tabLayout.m29209A();
        String string2 = C10841b.m6897b(tabLayout).m6899a().getString(C2336R.string.btn_3_months);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkIfNull(locale2, "getDefault()");
        String upperCase2 = string2.toUpperCase(locale2);
        Intrinsics.checkIfNull(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        m29209A2.m29139r(upperCase2);
        tabLayout.m29189e(m29209A2);
        TabLayout.C3728f m29209A3 = tabLayout.m29209A();
        String string3 = C10841b.m6897b(tabLayout).m6899a().getString(C2336R.string.btn_12_months);
        Intrinsics.checkIfNull(string3, "ctx.getString(id)");
        Locale locale3 = Locale.getDefault();
        Intrinsics.checkIfNull(locale3, "getDefault()");
        String upperCase3 = string3.toUpperCase(locale3);
        Intrinsics.checkIfNull(upperCase3, "this as java.lang.String).toUpperCase(locale)");
        m29209A3.m29139r(upperCase3);
        tabLayout.m29189e(m29209A3);
        tabLayout.m29190d(new C9367f(purchaseListViewModel));
        purchaseListViewModel.m21933h0().mo171i(this, new InterfaceC1440f0() { // from class: il.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PurchaseListActivity.m11446Q1(AbstractC12094x2.this, this, (List) obj);
            }
        });
        purchaseListViewModel.m21922s0();
    }

    /* renamed from: k1 */
    protected List m11445k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2141e.f6176a);
        return m202b;
    }

    /* renamed from: l1 */
    protected void m11444l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        if (Intrinsics.equals(interfaceC2154o, C2141e.f6176a)) {
            setResult(-1);
        }
    }

    /* renamed from: m1 */
    public void m11443m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (((AbstractC13816c) c13182l.m1460c()) instanceof C13920x1) {
            il.PurchaseListActivity.m21956d(this, false, 1, null);
        }
    }

    /* renamed from: n */
    public boolean m11442n() {
        return true;
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_SLIDE_ON_TOP")) {
            z = false;
        }
        return z ? new C8618e() : new C8617d();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_purchase_list;
    }
}
