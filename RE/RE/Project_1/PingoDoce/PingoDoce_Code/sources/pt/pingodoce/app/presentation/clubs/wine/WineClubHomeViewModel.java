package pt.pingodoce.app.presentation.clubs.wine;

import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.ClubManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p185ji.View$OnClickListenerC6488i;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.AppNavigationTypes;
import p494zh.BaseViewModel;
import p494zh.C13825d3;
import p494zh.C13887p0;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.local.models.clubs.EnumC8691a;
import pt.pingodoce.app.presentation.clubs.wine.WineClubHomeViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.clubs.wine.a */
/* loaded from: classes2.dex */
public final class WineClubHomeViewModel extends WineClubViewModel {

    /* renamed from: d0 */
    private final ClubManager f23775d0;

    /* renamed from: e0 */
    private final AnalyticsManager f23776e0;

    /* renamed from: f0 */
    private final C1436e0 f23777f0;

    /* renamed from: g0 */
    private final LiveData f23778g0;

    /* renamed from: h0 */
    private final InterfaceC6108l f23779h0;

    /* renamed from: i0 */
    private final InterfaceC6108l f23780i0;

    /* renamed from: j0 */
    private final C1436e0 f23781j0;

    /* renamed from: k0 */
    private C1436e0 f23782k0;

    /* renamed from: l0 */
    private final C1436e0 f23783l0;

    /* renamed from: m0 */
    private C1436e0 f23784m0;

    /* renamed from: n0 */
    private final C1436e0 f23785n0;

    /* renamed from: o0 */
    private final LiveData f23786o0;

    /* renamed from: p0 */
    private final InterfaceC6108l f23787p0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubHomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.a$a */
    /* loaded from: classes2.dex */
    public static final class C9026a extends AbstractC6438m implements InterfaceC6108l {
        C9026a() {
            super(1);
        }

        /* renamed from: a */
        public final void m12786a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(WineClubHomeViewModel.this, C13887p0.f35008a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12786a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubHomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.a$b */
    /* loaded from: classes2.dex */
    public static final class C9027b extends AbstractC6438m implements InterfaceC6108l {
        C9027b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12785a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            InterfaceC7886d.C7887a.m17629a(WineClubHomeViewModel.m12804j1(WineClubHomeViewModel.this), AnalyticEvents.AbstractC7859g.C7871l.f20494b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            BaseViewModel.m119C(WineClubHomeViewModel.this, C13825d3.f34932a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12785a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubHomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.a$c */
    /* loaded from: classes2.dex */
    public static final class C9028c extends AbstractC6438m implements InterfaceC6108l {
        C9028c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12784a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            InterfaceC7886d.C7887a.m17629a(WineClubHomeViewModel.m12804j1(WineClubHomeViewModel.this), AnalyticEvents.AbstractC7859g.C7872m.f20495b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            BaseViewModel.m119C(WineClubHomeViewModel.this, AppNavigationTypes.f34937a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12784a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubHomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubHomeViewModel$unsubClick$1$1", m20196f = "WineClubHomeViewModel.kt", m20195l = {C0868i.f2758E0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.a$d */
    /* loaded from: classes2.dex */
    public static final class C9029d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23791x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WineClubHomeViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubHomeViewModel$unsubClick$1$1$1", m20196f = "WineClubHomeViewModel.kt", m20195l = {C0868i.f2768G0}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.a$d$a */
        /* loaded from: classes2.dex */
        public static final class C9030a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23793x;

            /* renamed from: y */
            final /* synthetic */ WineClubHomeViewModel f23794y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9030a(WineClubHomeViewModel wineClubHomeViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23794y = wineClubHomeViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9030a(this.f23794y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9030a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                Object obj2;
                boolean z;
                m34636d = C2116d.m34636d();
                int i = this.f23793x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    Iterator it = WineClubHomeViewModel.m12803k1(this.f23794y).m18644j().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
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
                    Club club = (Club) obj2;
                    ClubManager m12803k1 = WineClubHomeViewModel.m12803k1(this.f23794y);
                    Intrinsics.ifNullDoSomething(club);
                    this.f23793x = 1;
                    obj = m12803k1.m18642l(club, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return (Result) obj;
            }
        }

        C9029d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9029d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9029d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23791x;
            if (i == 0) {
                C13186n.m1453b(obj);
                WineClubHomeViewModel wineClubHomeViewModel = WineClubHomeViewModel.this;
                C9030a c9030a = new C9030a(wineClubHomeViewModel, null);
                this.f23791x = 1;
                if (WineClubHomeViewModel.m12802l1(wineClubHomeViewModel, true, c9030a, this) == m34636d) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WineClubHomeViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, clubManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f23775d0 = clubManager;
        this.f23776e0 = analyticsManager;
        C1436e0 c1436e0 = new C1436e0();
        this.f23777f0 = c1436e0;
        this.f23778g0 = c1436e0;
        this.f23779h0 = BaseViewModel.m113I(this, 0L, new C9028c(), 1, null);
        this.f23780i0 = BaseViewModel.m113I(this, 0L, new C9027b(), 1, null);
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d = c1459l0.m37003d("_hasTypeList", bool);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…n>(\"_hasTypeList\", false)");
        this.f23781j0 = m37003d;
        this.f23782k0 = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_hasRegionList", bool);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<…(\"_hasRegionList\", false)");
        this.f23783l0 = m37003d2;
        this.f23784m0 = m37003d2;
        C1436e0 c1436e02 = new C1436e0();
        this.f23785n0 = c1436e02;
        this.f23786o0 = c1436e02;
        AnalyticEvents.AbstractC7859g.C7869j c7869j = AnalyticEvents.AbstractC7859g.C7869j.f20492b;
        EnumC7885c enumC7885c = EnumC7885c.Screen;
        EnumC7884b enumC7884b = EnumC7884b.View;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, c7869j, enumC7885c, enumC7884b, null, 8, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7859g.C7870k.f20493b, enumC7885c, enumC7884b, null, 8, null);
        this.f23787p0 = BaseViewModel.m113I(this, 0L, new C9026a(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m12811B1(WineClubHomeViewModel wineClubHomeViewModel, View view) {
        Intrinsics.isThisObjectNull(wineClubHomeViewModel, "this$0");
        C6772d.m20158d(C1473p0.m36987a(wineClubHomeViewModel), null, null, new C9029d(null), 3, null);
    }

    /* renamed from: e1 */
    public static /* synthetic */ void m12809e1(WineClubHomeViewModel wineClubHomeViewModel, View view) {
        m12811B1(wineClubHomeViewModel, view);
    }

    /* renamed from: f1 */
    public static /* synthetic */ void m12808f1(WineClubHomeViewModel wineClubHomeViewModel, View view) {
        m12795r1(wineClubHomeViewModel, view);
    }

    /* renamed from: g1 */
    public static /* synthetic */ void m12807g1(WineClubHomeViewModel wineClubHomeViewModel, View view) {
        m12790w1(wineClubHomeViewModel, view);
    }

    /* renamed from: h1 */
    public static /* synthetic */ void m12806h1(WineClubHomeViewModel wineClubHomeViewModel, View view) {
        m12792u1(wineClubHomeViewModel, view);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12805i1(View view) {
        m12787z1(view);
    }

    /* renamed from: j1 */
    public static final /* synthetic */ AnalyticsManager m12804j1(WineClubHomeViewModel wineClubHomeViewModel) {
        return wineClubHomeViewModel.f23776e0;
    }

    /* renamed from: k1 */
    public static final /* synthetic */ ClubManager m12803k1(WineClubHomeViewModel wineClubHomeViewModel) {
        return wineClubHomeViewModel.f23775d0;
    }

    /* renamed from: l1 */
    public static final /* synthetic */ Object m12802l1(WineClubHomeViewModel wineClubHomeViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return wineClubHomeViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m12795r1(WineClubHomeViewModel wineClubHomeViewModel, View view) {
        Intrinsics.isThisObjectNull(wineClubHomeViewModel, "this$0");
        InterfaceC7886d.C7887a.m17629a(wineClubHomeViewModel.f23776e0, AnalyticEvents.AbstractC7859g.C7863d.f20486b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        wineClubHomeViewModel.f23787p0.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m12792u1(WineClubHomeViewModel wineClubHomeViewModel, View view) {
        Intrinsics.isThisObjectNull(wineClubHomeViewModel, "this$0");
        wineClubHomeViewModel.f23780i0.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m12790w1(WineClubHomeViewModel wineClubHomeViewModel, View view) {
        Intrinsics.isThisObjectNull(wineClubHomeViewModel, "this$0");
        wineClubHomeViewModel.f23779h0.mo9587d(C13195u.f34156a);
    }

    /* renamed from: z1 */
    private static final void m12787z1(View view) {
    }

    /* renamed from: A1 */
    public final View.OnClickListener m12812A1() {
        return new View.OnClickListener() { // from class: ji.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubHomeViewModel.m12811B1(WineClubHomeViewModel.this, view);
            }
        };
    }

    /* renamed from: Y0 */
    public View.OnClickListener m12810Y0() {
        return View$OnClickListenerC6488i.f17601w;
    }

    /* renamed from: m1 */
    public final C1436e0 m12801m1() {
        return this.f23784m0;
    }

    /* renamed from: n0 */
    protected Object m12800n0(InterfaceC1886d interfaceC1886d) {
        return C13195u.f34156a;
    }

    /* renamed from: n1 */
    public final C1436e0 m12799n1() {
        return this.f23782k0;
    }

    /* renamed from: o1 */
    public final LiveData m12798o1() {
        return this.f23778g0;
    }

    /* renamed from: p1 */
    public final LiveData m12797p1() {
        return this.f23786o0;
    }

    /* renamed from: q1 */
    public final View.OnClickListener m12796q1() {
        return new View.OnClickListener() { // from class: ji.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubHomeViewModel.m12795r1(WineClubHomeViewModel.this, view);
            }
        };
    }

    /* renamed from: s1 */
    public final void m12794s1() {
        InterfaceC7886d.C7887a.m17629a(this.f23776e0, AnalyticEvents.AbstractC7859g.C7862c.f20485b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: t1 */
    public final View.OnClickListener m12793t1() {
        return new View.OnClickListener() { // from class: ji.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubHomeViewModel.m12792u1(WineClubHomeViewModel.this, view);
            }
        };
    }

    /* renamed from: v1 */
    public final View.OnClickListener m12791v1() {
        return new View.OnClickListener() { // from class: ji.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubHomeViewModel.m12790w1(WineClubHomeViewModel.this, view);
            }
        };
    }

    /* renamed from: x1 */
    public final void m12789x1(boolean z) {
        this.f23785n0.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: y1 */
    public final void m12788y1(List list) {
        Object obj;
        boolean z;
        Intrinsics.isThisObjectNull(list, "clubList");
        Iterator it = list.iterator();
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
        if (club != null) {
            this.f23777f0.mo166p(club.m14645n());
        }
    }
}
