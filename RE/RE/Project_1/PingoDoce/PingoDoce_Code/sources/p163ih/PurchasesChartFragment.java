package p163ih;

import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.core.content.C0928a;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
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
import com.google.android.material.tabs.TabLayout;
import id.InterfaceC6097a;
import java.util.List;
import java.util.Locale;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163ih.PurchasesChartViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p426wg.AbstractC11987r6;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.AbstractC13876n;
import sd.C10171u;
import sd.Indent;

/* renamed from: ih.b */
/* loaded from: classes2.dex */
public final class PurchasesChartFragment extends AbstractC13876n {

    /* renamed from: A0 */
    private final InterfaceC13178g f16832A0;

    /* renamed from: B0 */
    private final InterfaceC13178g f16833B0;

    /* renamed from: C0 */
    private final InterfaceC13178g f16834C0;

    /* renamed from: D0 */
    private final InterfaceC13178g f16835D0;

    /* renamed from: E0 */
    private final InterfaceC13178g f16836E0;

    /* renamed from: F0 */
    private final InterfaceC13178g f16837F0;

    /* renamed from: G0 */
    private final String f16838G0;

    /* renamed from: H0 */
    private final InterfaceC13178g f16839H0;

    /* renamed from: I0 */
    private final InterfaceC13178g f16840I0;

    /* renamed from: z0 */
    public ViewModelFactoryByInjection f16841z0;

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$a */
    /* loaded from: classes2.dex */
    public static final class C6128a {
        private C6128a() {
        }

        public /* synthetic */ C6128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$b */
    /* loaded from: classes2.dex */
    static final class C6129b extends AbstractC6438m implements InterfaceC6097a {
        C6129b() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            CharSequence m8890j0;
            ResourcesProvider m6896c = C10841b.m6896c(PurchasesChartFragment.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6896c.m6899a(), 2131951628).getTheme().resolveAttribute(C2336R.attr.chartBackgroundColor, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(m6896c.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(resourcesPro…style.App_Account_Chart))");
            m8890j0 = C10171u.m8890j0(hexString, 0, 2);
            String obj = m8890j0.toString();
            return "#" + obj;
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$c */
    /* loaded from: classes2.dex */
    static final class C6130c extends AbstractC6438m implements InterfaceC6097a {
        C6130c() {
            super(0);
        }

        /* renamed from: a */
        public final AAOptions mo42214q() {
            AAOptions title = new AAOptions().chart(new AAChart().type(AAChartType.Column).backgroundColor(PurchasesChartFragment.m22105t2(PurchasesChartFragment.this))).tooltip(PurchasesChartFragment.m22101x2(PurchasesChartFragment.this)).title(new AATitle().text(BuildConfig.VERSION_NAME));
            AALegend aALegend = new AALegend();
            Boolean bool = Boolean.FALSE;
            return title.legend(aALegend.enabled(bool)).xAxis(new AAXAxis().labels(new AALabels().enabled(bool))).yAxis(new AAYAxis().visible(bool)).colors(new Object[]{PurchasesChartFragment.m22103v2(PurchasesChartFragment.this)});
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$d */
    /* loaded from: classes2.dex */
    static final class C6131d extends AbstractC6438m implements InterfaceC6097a {
        C6131d() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            CharSequence m8890j0;
            ResourcesProvider m6896c = C10841b.m6896c(PurchasesChartFragment.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6896c.m6899a(), 2131951628).getTheme().resolveAttribute(C2336R.attr.chartDataColor, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(m6896c.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(resourcesPro…style.App_Account_Chart))");
            m8890j0 = C10171u.m8890j0(hexString, 0, 2);
            String obj = m8890j0.toString();
            return "#" + obj;
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$e */
    /* loaded from: classes2.dex */
    static final class C6132e extends AbstractC6438m implements InterfaceC6097a {
        C6132e() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(PurchasesChartFragment.this.m22118E2(), PurchasesChartFragment.this, null, 2, null);
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$f */
    /* loaded from: classes2.dex */
    public static final class C6133f implements TabLayout.InterfaceC3724d {

        /* renamed from: a */
        final /* synthetic */ PurchasesChartViewModel f16846a;

        C6133f(PurchasesChartViewModel purchasesChartViewModel) {
            this.f16846a = purchasesChartViewModel;
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
                PurchasesChartViewModel purchasesChartViewModel = this.f16846a;
                int m29150g = c3728f.m29150g();
                if (m29150g == 0) {
                    purchasesChartViewModel.m22076U(PurchasesChartViewModel.EnumC6140a.FILTER_BY_30_DAYS);
                } else if (m29150g != 1) {
                    purchasesChartViewModel.m22076U(PurchasesChartViewModel.EnumC6140a.FILTER_BY_12_MONTHS);
                } else {
                    purchasesChartViewModel.m22076U(PurchasesChartViewModel.EnumC6140a.FILTER_BY_3_MONTHS);
                }
            }
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$g */
    /* loaded from: classes2.dex */
    static final class C6134g extends AbstractC6438m implements InterfaceC6097a {
        C6134g() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            String string = C10841b.m6896c(PurchasesChartFragment.this).m6899a().getString(C2336R.string.lbl_saved_alt);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            return string;
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$h */
    /* loaded from: classes2.dex */
    static final class C6135h extends AbstractC6438m implements InterfaceC6097a {
        C6135h() {
            super(0);
        }

        /* renamed from: a */
        public final AATooltip mo42214q() {
            String m8959f;
            AATooltip useHTML = new AATooltip().useHTML(Boolean.TRUE);
            String m22102w2 = PurchasesChartFragment.m22102w2(PurchasesChartFragment.this);
            String m22104u2 = PurchasesChartFragment.m22104u2(PurchasesChartFragment.this);
            String m22122A2 = PurchasesChartFragment.m22122A2(PurchasesChartFragment.this);
            m8959f = Indent.m8959f("function () { return '" + m22102w2 + " '+ this.y.toLocaleString('" + m22104u2 + "', { minimumFractionDigits: 2 }) + '" + m22122A2 + "'; }");
            return useHTML.formatter(m8959f).valueDecimals(2).backgroundColor(PurchasesChartFragment.m22100y2(PurchasesChartFragment.this)).borderColor(PurchasesChartFragment.m22100y2(PurchasesChartFragment.this)).borderRadius(Float.valueOf(20.0f)).style(new AAStyle().color(PurchasesChartFragment.m22099z2(PurchasesChartFragment.this)).fontWeight(AAChartFontWeightType.Bold));
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$i */
    /* loaded from: classes2.dex */
    static final class C6136i extends AbstractC6438m implements InterfaceC6097a {
        C6136i() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            CharSequence m8890j0;
            ResourcesProvider m6896c = C10841b.m6896c(PurchasesChartFragment.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6896c.m6899a(), 2131951628).getTheme().resolveAttribute(C2336R.attr.chartTooltipBackgroundColor, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(m6896c.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(resourcesPro…style.App_Account_Chart))");
            m8890j0 = C10171u.m8890j0(hexString, 0, 2);
            String obj = m8890j0.toString();
            return "#" + obj;
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$j */
    /* loaded from: classes2.dex */
    static final class C6137j extends AbstractC6438m implements InterfaceC6097a {
        C6137j() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            CharSequence m8890j0;
            ResourcesProvider m6896c = C10841b.m6896c(PurchasesChartFragment.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6896c.m6899a(), 2131951628).getTheme().resolveAttribute(C2336R.attr.chartTooltipTextColor, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(m6896c.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(resourcesPro…style.App_Account_Chart))");
            m8890j0 = C10171u.m8890j0(hexString, 0, 2);
            String obj = m8890j0.toString();
            return "#" + obj;
        }
    }

    /* compiled from: PurchasesChartFragment.kt */
    /* renamed from: ih.b$k */
    /* loaded from: classes2.dex */
    static final class C6138k extends AbstractC6438m implements InterfaceC6097a {
        C6138k() {
            super(0);
        }

        /* renamed from: a */
        public final String mo42214q() {
            String string = C10841b.m6896c(PurchasesChartFragment.this).m6899a().getString(C2336R.string.lbl_price_unit);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            return string;
        }
    }

    static {
        new C6128a(null);
    }

    public PurchasesChartFragment() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        InterfaceC13178g m1464a4;
        InterfaceC13178g m1464a5;
        InterfaceC13178g m1464a6;
        InterfaceC13178g m1464a7;
        InterfaceC13178g m1464a8;
        m1464a = LazyJVM.m1464a(new C6129b());
        this.f16832A0 = m1464a;
        m1464a2 = LazyJVM.m1464a(new C6136i());
        this.f16833B0 = m1464a2;
        m1464a3 = LazyJVM.m1464a(new C6137j());
        this.f16834C0 = m1464a3;
        m1464a4 = LazyJVM.m1464a(new C6131d());
        this.f16835D0 = m1464a4;
        m1464a5 = LazyJVM.m1464a(new C6134g());
        this.f16836E0 = m1464a5;
        m1464a6 = LazyJVM.m1464a(new C6138k());
        this.f16837F0 = m1464a6;
        this.f16838G0 = Locale.getDefault().getCountry();
        m1464a7 = LazyJVM.m1464a(new C6135h());
        this.f16839H0 = m1464a7;
        m1464a8 = LazyJVM.m1464a(new C6130c());
        this.f16840I0 = m1464a8;
    }

    /* renamed from: A2 */
    public static final /* synthetic */ String m22122A2(PurchasesChartFragment purchasesChartFragment) {
        return purchasesChartFragment.m22113J2();
    }

    /* renamed from: B2 */
    private final String m22121B2() {
        return (String) this.f16832A0.getValue();
    }

    /* renamed from: C2 */
    private final AAOptions m22120C2() {
        return (AAOptions) this.f16840I0.getValue();
    }

    /* renamed from: D2 */
    private final String m22119D2() {
        return (String) this.f16835D0.getValue();
    }

    /* renamed from: F2 */
    private final String m22117F2() {
        return (String) this.f16836E0.getValue();
    }

    /* renamed from: G2 */
    private final AATooltip m22116G2() {
        return (AATooltip) this.f16839H0.getValue();
    }

    /* renamed from: H2 */
    private final String m22115H2() {
        return (String) this.f16833B0.getValue();
    }

    /* renamed from: I2 */
    private final String m22114I2() {
        return (String) this.f16834C0.getValue();
    }

    /* renamed from: J2 */
    private final String m22113J2() {
        return (String) this.f16837F0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m22111L2(AbstractC11987r6 abstractC11987r6, PurchasesChartFragment purchasesChartFragment, List list) {
        Intrinsics.isThisObjectNull(abstractC11987r6, "$binding");
        Intrinsics.isThisObjectNull(purchasesChartFragment, "this$0");
        AAChartView aAChartView = abstractC11987r6.f31375D;
        AAOptions m22120C2 = purchasesChartFragment.m22120C2();
        AASeriesElement aASeriesElement = new AASeriesElement();
        Intrinsics.checkIfNull(list, "data");
        Object[] array = list.toArray(new Object[0]);
        Intrinsics.m20929f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        aAChartView.aa_drawChartWithChartOptions(m22120C2.series(new Object[]{aASeriesElement.data(array).borderWidth(Float.valueOf(0.0f))}));
    }

    /* renamed from: s2 */
    public static /* synthetic */ void m22106s2(AbstractC11987r6 abstractC11987r6, PurchasesChartFragment purchasesChartFragment, List list) {
        m22111L2(abstractC11987r6, purchasesChartFragment, list);
    }

    /* renamed from: t2 */
    public static final /* synthetic */ String m22105t2(PurchasesChartFragment purchasesChartFragment) {
        return purchasesChartFragment.m22121B2();
    }

    /* renamed from: u2 */
    public static final /* synthetic */ String m22104u2(PurchasesChartFragment purchasesChartFragment) {
        return purchasesChartFragment.f16838G0;
    }

    /* renamed from: v2 */
    public static final /* synthetic */ String m22103v2(PurchasesChartFragment purchasesChartFragment) {
        return purchasesChartFragment.m22119D2();
    }

    /* renamed from: w2 */
    public static final /* synthetic */ String m22102w2(PurchasesChartFragment purchasesChartFragment) {
        return purchasesChartFragment.m22117F2();
    }

    /* renamed from: x2 */
    public static final /* synthetic */ AATooltip m22101x2(PurchasesChartFragment purchasesChartFragment) {
        return purchasesChartFragment.m22116G2();
    }

    /* renamed from: y2 */
    public static final /* synthetic */ String m22100y2(PurchasesChartFragment purchasesChartFragment) {
        return purchasesChartFragment.m22115H2();
    }

    /* renamed from: z2 */
    public static final /* synthetic */ String m22099z2(PurchasesChartFragment purchasesChartFragment) {
        return purchasesChartFragment.m22114I2();
    }

    /* renamed from: E2 */
    public final ViewModelFactoryByInjection m22118E2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f16841z0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K2 */
    public void m22107p2(final AbstractC11987r6 abstractC11987r6, PurchasesChartViewModel purchasesChartViewModel) {
        Intrinsics.isThisObjectNull(abstractC11987r6, "binding");
        Intrinsics.isThisObjectNull(purchasesChartViewModel, "viewModel");
        TabLayout tabLayout = abstractC11987r6.f31373B;
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
        tabLayout.m29190d(new C6133f(purchasesChartViewModel));
        purchasesChartViewModel.m22077T().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: ih.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PurchasesChartFragment.m22111L2(AbstractC11987r6.this, this, (List) obj);
            }
        });
    }

    /* renamed from: i2 */
    protected int m22110i2() {
        return C2336R.layout.fragment_purchases_chart;
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m22109k2() {
        return C6450z.m20906b(PurchasesChartViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m22108l2() {
        return new C6132e();
    }
}
