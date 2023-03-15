package pt.pingodoce.app.presentation.clubs.wine;

import android.view.View;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.ClubManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p489zc._Collections;
import p494zh.AppNavigationTypes;
import p494zh.BaseViewModel;
import p494zh.C13820c3;
import p494zh.C13825d3;
import p494zh.C13839g3;
import p494zh.C13844h3;
import p494zh.C13849i3;
import p494zh.C13854j3;
import p494zh.C13859k3;
import pt.pingodoce.app.data.local.flows.FlowData;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.local.models.clubs.ClubData;
import pt.pingodoce.app.data.local.models.clubs.EnumC8691a;
import pt.pingodoce.app.data.local.models.clubs.FormField;
import pt.pingodoce.app.data.local.models.clubs.FormFieldOption;
import pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.clubs.wine.g */
/* loaded from: classes2.dex */
public abstract class WineClubViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final ClubManager f23841C;

    /* renamed from: D */
    private final AnalyticsManager f23842D;

    /* renamed from: E */
    private final C1430c0 f23843E;

    /* renamed from: F */
    private C1430c0 f23844F;

    /* renamed from: G */
    private final C1430c0 f23845G;

    /* renamed from: H */
    private final C1436e0 f23846H;

    /* renamed from: I */
    private final LiveData f23847I;

    /* renamed from: J */
    private final C1436e0 f23848J;

    /* renamed from: K */
    private final LiveData f23849K;

    /* renamed from: L */
    private final C1436e0 f23850L;

    /* renamed from: M */
    private final C1436e0 f23851M;

    /* renamed from: N */
    private final C1436e0 f23852N;

    /* renamed from: O */
    private final C1436e0 f23853O;

    /* renamed from: P */
    private LiveData f23854P;

    /* renamed from: Q */
    private final C1436e0 f23855Q;

    /* renamed from: R */
    private LiveData f23856R;

    /* renamed from: S */
    private Set f23857S;

    /* renamed from: T */
    private Set f23858T;

    /* renamed from: U */
    private final C1436e0 f23859U;

    /* renamed from: V */
    private final LiveData f23860V;

    /* renamed from: W */
    private final C1436e0 f23861W;

    /* renamed from: X */
    private final LiveData f23862X;

    /* renamed from: Y */
    private final C1436e0 f23863Y;

    /* renamed from: Z */
    private final LiveData f23864Z;

    /* renamed from: a0 */
    private final InterfaceC6108l f23865a0;

    /* renamed from: b0 */
    private int f23866b0;

    /* renamed from: c0 */
    private final ArrayList f23867c0;

    /* compiled from: WineClubViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9047a {

        /* compiled from: WineClubViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C9048a extends AbstractC9047a {

            /* renamed from: a */
            public static final C9048a f23868a = new C9048a();

            private C9048a() {
                super(null);
            }
        }

        /* compiled from: WineClubViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$a$b */
        /* loaded from: classes2.dex */
        public static final class C9049b extends AbstractC9047a {

            /* renamed from: a */
            public static final C9049b f23869a = new C9049b();

            private C9049b() {
                super(null);
            }
        }

        private AbstractC9047a() {
        }

        public /* synthetic */ AbstractC9047a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: WineClubViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9050b {

        /* compiled from: WineClubViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$b$a */
        /* loaded from: classes2.dex */
        public static final class C9051a extends AbstractC9050b {

            /* renamed from: a */
            public static final C9051a f23870a = new C9051a();

            private C9051a() {
                super(null);
            }
        }

        /* compiled from: WineClubViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$b$b */
        /* loaded from: classes2.dex */
        public static final class C9052b extends AbstractC9050b {

            /* renamed from: a */
            public static final C9052b f23871a = new C9052b();

            private C9052b() {
                super(null);
            }
        }

        /* compiled from: WineClubViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$b$c */
        /* loaded from: classes2.dex */
        public static final class C9053c extends AbstractC9050b {

            /* renamed from: a */
            public static final C9053c f23872a = new C9053c();

            private C9053c() {
                super(null);
            }
        }

        private AbstractC9050b() {
        }

        public /* synthetic */ AbstractC9050b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel$skipClickButton$1$1", m20196f = "WineClubViewModel.kt", m20195l = {211}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$c */
    /* loaded from: classes2.dex */
    public static final class C9054c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23873x;

        C9054c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9054c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9054c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23873x;
            if (i == 0) {
                C13186n.m1453b(obj);
                WineClubViewModel wineClubViewModel = WineClubViewModel.this;
                this.f23873x = 1;
                if (WineClubViewModel.m12719z0(wineClubViewModel, this) == m34636d) {
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
    /* compiled from: WineClubViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.g$d */
    /* loaded from: classes2.dex */
    public static final class C9055d extends AbstractC6438m implements InterfaceC6108l {
        C9055d() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
            if (r8 == true) goto L7;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m12717a(p468yc.C13195u r8) {
            /*
                r7 = this;
                java.lang.String r0 = "it"
                p181jd.Intrinsics.isThisObjectNull(r8, r0)
                pt.pingodoce.app.presentation.clubs.wine.g r8 = pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel.this
                androidx.lifecycle.LiveData r8 = r8.m12748G0()
                java.lang.Object r8 = r8.mo172f()
                java.util.List r8 = (java.util.List) r8
                r0 = 1
                r1 = 0
                if (r8 == 0) goto L44
                boolean r2 = r8.isEmpty()
                if (r2 == 0) goto L1d
            L1b:
                r8 = r1
                goto L41
            L1d:
                java.util.Iterator r8 = r8.iterator()
            L21:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L1b
                java.lang.Object r2 = r8.next()
                pt.pingodoce.app.data.local.models.clubs.Club r2 = (pt.pingodoce.app.data.local.models.clubs.Club) r2
                pt.pingodoce.app.data.local.models.clubs.a r3 = r2.m14653d()
                pt.pingodoce.app.data.local.models.clubs.a r4 = pt.pingodoce.app.data.local.models.clubs.EnumC8691a.Wine
                if (r3 != r4) goto L3d
                boolean r2 = r2.m14640w()
                if (r2 == 0) goto L3d
                r2 = r0
                goto L3e
            L3d:
                r2 = r1
            L3e:
                if (r2 == 0) goto L21
                r8 = r0
            L41:
                if (r8 != r0) goto L44
                goto L45
            L44:
                r0 = r1
            L45:
                if (r0 == 0) goto L5b
                pt.pingodoce.app.presentation.clubs.wine.g r8 = pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel.this
                mg.a r0 = pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel.m12720y0(r8)
                ng.a$g$n r1 = ng.AnalyticEvents.AbstractC7859g.C7873n.f20496b
                ng.c r2 = ng.EnumC7885c.Button
                ng.b r3 = ng.EnumC7884b.Click
                r4 = 0
                r5 = 8
                r6 = 0
                ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
                goto L6e
            L5b:
                pt.pingodoce.app.presentation.clubs.wine.g r8 = pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel.this
                mg.a r0 = pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel.m12720y0(r8)
                ng.a$g$e r1 = ng.AnalyticEvents.AbstractC7859g.C7864e.f20487b
                ng.c r2 = ng.EnumC7885c.Button
                ng.b r3 = ng.EnumC7884b.Click
                r4 = 0
                r5 = 8
                r6 = 0
                ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
            L6e:
                pt.pingodoce.app.presentation.clubs.wine.g r8 = pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel.this
                zh.a3 r0 = p494zh.C13810a3.f34918a
                r1 = 2
                r2 = 0
                p494zh.BaseViewModel.m119C(r8, r0, r2, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel.C9055d.m12717a(yc.u):void");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12717a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WineClubViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        List m197g;
        List m197g2;
        ArrayList m201c;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f23841C = clubManager;
        this.f23842D = analyticsManager;
        C1430c0 c1430c0 = new C1430c0();
        this.f23843E = c1430c0;
        this.f23844F = c1430c0;
        this.f23845G = new C1430c0();
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d = c1459l0.m37003d("_isErrorEnabled", bool);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…\"_isErrorEnabled\", false)");
        this.f23846H = m37003d;
        this.f23847I = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_errorLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_errorLabel\", \"\")");
        this.f23848J = m37003d2;
        this.f23849K = m37003d2;
        C1436e0 m37003d3 = c1459l0.m37003d("isNameVisible", Boolean.TRUE);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<…n>(\"isNameVisible\", true)");
        this.f23850L = m37003d3;
        C1436e0 m37003d4 = c1459l0.m37003d("isBirthdateVisible", bool);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData<…BirthdateVisible\", false)");
        this.f23851M = m37003d4;
        C1436e0 m37003d5 = c1459l0.m37003d("_showSkipButton", bool);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData<…\"_showSkipButton\", false)");
        this.f23852N = m37003d5;
        m197g = C13780s.m197g();
        C1436e0 m37003d6 = c1459l0.m37003d("_homeTypeList", m197g);
        Intrinsics.checkIfNull(m37003d6, "stateHandle.getLiveData<…meTypeList\", emptyList())");
        this.f23853O = m37003d6;
        this.f23854P = m37003d6;
        m197g2 = C13780s.m197g();
        C1436e0 m37003d7 = c1459l0.m37003d("_homeRegionList", m197g2);
        Intrinsics.checkIfNull(m37003d7, "stateHandle.getLiveData<…RegionList\", emptyList())");
        this.f23855Q = m37003d7;
        this.f23856R = m37003d7;
        this.f23857S = new LinkedHashSet();
        this.f23858T = new LinkedHashSet();
        C1436e0 m37004c = c1459l0.m37004c("_availableTypeList");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<…n>>(\"_availableTypeList\")");
        this.f23859U = m37004c;
        this.f23860V = m37004c;
        C1436e0 m37004c2 = c1459l0.m37004c("_availableRegionList");
        Intrinsics.checkIfNull(m37004c2, "stateHandle.getLiveData<…>(\"_availableRegionList\")");
        this.f23861W = m37004c2;
        this.f23862X = m37004c2;
        C1436e0 m37004c3 = c1459l0.m37004c("birthdate");
        Intrinsics.checkIfNull(m37004c3, "stateHandle.getLiveData<String>(\"birthdate\")");
        this.f23863Y = m37004c3;
        this.f23864Z = m106t(clubManager.m18645i());
        Intrinsics.checkIfNull(c1459l0.m37004c("day"), "stateHandle.getLiveData<Int>(\"day\")");
        Intrinsics.checkIfNull(c1459l0.m37004c("month"), "stateHandle.getLiveData<Int>(\"month\")");
        Intrinsics.checkIfNull(c1459l0.m37004c("year"), "stateHandle.getLiveData<Int>(\"year\")");
        AbstractC9047a.C9048a c9048a = AbstractC9047a.C9048a.f23868a;
        c1430c0.m37055q(m37004c3, new InterfaceC1440f0() { // from class: ji.e0
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                WineClubViewModel.m12721x0(WineClubViewModel.this, (String) obj);
            }
        });
        this.f23865a0 = BaseViewModel.m113I(this, 0L, new C9055d(), 1, null);
        m201c = C13780s.m201c(C13839g3.f34947a, C13820c3.f34927a, C13854j3.f34962a, C13849i3.f34957a, C13844h3.f34952a, C13859k3.f34967a, C13825d3.f34932a, AppNavigationTypes.f34937a);
        this.f23867c0 = m201c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public static final void m12729Z0(WineClubViewModel wineClubViewModel, View view) {
        Intrinsics.isThisObjectNull(wineClubViewModel, "this$0");
        C6772d.m20158d(C1473p0.m36987a(wineClubViewModel), null, null, new C9054c(null), 3, null);
    }

    /* renamed from: a1 */
    private final void m12728a1() {
        CharSequence charSequence = (CharSequence) this.f23863Y.mo172f();
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        this.f23846H.mo166p(Boolean.FALSE);
        this.f23843E.mo166p(Boolean.TRUE);
    }

    /* renamed from: b1 */
    private final void m12727b1() {
        m20319p0();
        m12728a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static final void m12725d1(WineClubViewModel wineClubViewModel, View view) {
        Intrinsics.isThisObjectNull(wineClubViewModel, "this$0");
        wineClubViewModel.f23865a0.mo9587d(C13195u.f34156a);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m12724u0(WineClubViewModel wineClubViewModel, View view) {
        m12725d1(wineClubViewModel, view);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m12723v0(WineClubViewModel wineClubViewModel, String str) {
        m12721x0(wineClubViewModel, str);
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m12722w0(WineClubViewModel wineClubViewModel, View view) {
        m12729Z0(wineClubViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m12721x0(WineClubViewModel wineClubViewModel, String str) {
        Intrinsics.isThisObjectNull(wineClubViewModel, "this$0");
        wineClubViewModel.m12727b1();
    }

    /* renamed from: y0 */
    public static final /* synthetic */ AnalyticsManager m12720y0(WineClubViewModel wineClubViewModel) {
        return wineClubViewModel.f23842D;
    }

    /* renamed from: z0 */
    public static final /* synthetic */ Object m12719z0(WineClubViewModel wineClubViewModel, InterfaceC1886d interfaceC1886d) {
        return wineClubViewModel.m20321n0(interfaceC1886d);
    }

    /* renamed from: A0 */
    public final LiveData m12754A0() {
        return this.f23862X;
    }

    /* renamed from: B0 */
    public final LiveData m12753B0() {
        return this.f23860V;
    }

    /* renamed from: C0 */
    public final C1436e0 m12752C0() {
        return this.f23863Y;
    }

    /* renamed from: D0 */
    public final C1430c0 m12751D0() {
        return this.f23844F;
    }

    /* renamed from: E0 */
    public final List m12750E0() {
        Object obj;
        ClubData m14651f;
        boolean z;
        Iterator it = this.f23841C.m18644j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Club) obj).m14653d() == EnumC8691a.Wine) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Club club = (Club) obj;
        if (club == null || (m14651f = club.m14651f()) == null) {
            return null;
        }
        return m14651f.m14623c();
    }

    /* renamed from: F0 */
    public final List m12749F0() {
        Object obj;
        ClubData m14651f;
        boolean z;
        Iterator it = this.f23841C.m18644j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Club) obj).m14653d() == EnumC8691a.Wine) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Club club = (Club) obj;
        if (club == null || (m14651f = club.m14651f()) == null) {
            return null;
        }
        return m14651f.m14622d();
    }

    /* renamed from: G0 */
    public final LiveData m12748G0() {
        return this.f23864Z;
    }

    /* renamed from: H0 */
    public final int m12747H0() {
        return this.f23866b0;
    }

    /* renamed from: I0 */
    public final LiveData m12746I0() {
        return this.f23849K;
    }

    /* renamed from: J0 */
    public final LiveData m12745J0() {
        return this.f23856R;
    }

    /* renamed from: K0 */
    public final LiveData m12744K0() {
        return this.f23854P;
    }

    /* renamed from: L0 */
    public final ArrayList m12743L0() {
        return this.f23867c0;
    }

    /* renamed from: M0 */
    public final List m12742M0() {
        Object obj;
        Object obj2;
        List m455n0;
        Object obj3;
        boolean z;
        boolean z2;
        List m18644j = this.f23841C.m18644j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m18644j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Club) obj).m14653d() == EnumC8691a.Wine) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        Club club = (Club) obj;
        Intrinsics.ifNullDoSomething(club);
        List<String> m14623c = club.m14651f().m14623c();
        Intrinsics.ifNullDoSomething(m14623c);
        Iterator it2 = m18644j.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((Club) obj2).m14653d() == EnumC8691a.Wine) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Club club2 = (Club) obj2;
        Intrinsics.ifNullDoSomething(club2);
        for (FormField formField : club2.m14648j()) {
            for (String str : m14623c) {
                Iterator it3 = formField.m14611e().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (Intrinsics.equals(((FormFieldOption) obj3).m14602a(), str)) {
                        break;
                    }
                }
                FormFieldOption formFieldOption = (FormFieldOption) obj3;
                if (formFieldOption != null) {
                    linkedHashSet.add(formFieldOption);
                }
            }
        }
        m455n0 = _Collections.m455n0(linkedHashSet);
        return m455n0;
    }

    /* renamed from: N0 */
    public final List m12741N0() {
        Object obj;
        Object obj2;
        List m455n0;
        Object obj3;
        boolean z;
        boolean z2;
        List m18644j = this.f23841C.m18644j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m18644j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Club) obj).m14653d() == EnumC8691a.Wine) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        Club club = (Club) obj;
        Intrinsics.ifNullDoSomething(club);
        List<String> m14622d = club.m14651f().m14622d();
        Intrinsics.ifNullDoSomething(m14622d);
        Iterator it2 = m18644j.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((Club) obj2).m14653d() == EnumC8691a.Wine) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Club club2 = (Club) obj2;
        Intrinsics.ifNullDoSomething(club2);
        for (FormField formField : club2.m14648j()) {
            for (String str : m14622d) {
                Iterator it3 = formField.m14611e().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (Intrinsics.equals(((FormFieldOption) obj3).m14602a(), str)) {
                        break;
                    }
                }
                FormFieldOption formFieldOption = (FormFieldOption) obj3;
                if (formFieldOption != null) {
                    linkedHashSet.add(formFieldOption);
                }
            }
        }
        m455n0 = _Collections.m455n0(linkedHashSet);
        return m455n0;
    }

    /* renamed from: O0 */
    public final Set m12740O0() {
        return this.f23857S;
    }

    /* renamed from: P0 */
    public final Set m12739P0() {
        return this.f23858T;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q0 */
    public final C1436e0 m12738Q0() {
        return this.f23861W;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R0 */
    public final C1436e0 m12737R0() {
        return this.f23859U;
    }

    /* renamed from: S0 */
    public final LiveData m12736S0() {
        return this.f23847I;
    }

    /* renamed from: T0 */
    public final void m12735T0() {
        this.f23853O.mo166p(m12741N0());
        this.f23855Q.mo166p(m12742M0());
    }

    /* renamed from: U0 */
    public final void m12734U0(AbstractC9047a abstractC9047a) {
        Intrinsics.isThisObjectNull(abstractC9047a, "<set-?>");
    }

    /* renamed from: V0 */
    public final void m12733V0(int i) {
        this.f23866b0 = i;
    }

    /* renamed from: W0 */
    public final void m12732W0(Set set) {
        Intrinsics.isThisObjectNull(set, "<set-?>");
        this.f23857S = set;
    }

    /* renamed from: X0 */
    public final void m12731X0(Set set) {
        Intrinsics.isThisObjectNull(set, "<set-?>");
        this.f23858T = set;
    }

    /* renamed from: Y0 */
    public View.OnClickListener m12730Y0() {
        return new View.OnClickListener() { // from class: ji.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubViewModel.m12729Z0(WineClubViewModel.this, view);
            }
        };
    }

    /* renamed from: c1 */
    public final View.OnClickListener m12726c1() {
        return new View.OnClickListener() { // from class: ji.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubViewModel.m12725d1(WineClubViewModel.this, view);
            }
        };
    }
}
