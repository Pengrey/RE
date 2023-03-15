package pt.pingodoce.app.presentation.takeaway.landing;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7373o1;
import mg.AnalyticsManager;
import mg.C7347m1;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.StoreManager;
import mg.TakeAwayManager;
import ng.AnalyticEvents;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p281ol.TakeAwayViewModel;
import p351s5.RecyclerPickerDialogFragment;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13889p2;
import p494zh.C13893q2;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a */
/* loaded from: classes2.dex */
public final class TakeAwayLandingViewModel extends TakeAwayViewModel {

    /* renamed from: A0 */
    private final C1436e0 f24958A0;

    /* renamed from: B0 */
    private final C1436e0 f24959B0;

    /* renamed from: C0 */
    private final C1430c0 f24960C0;

    /* renamed from: D0 */
    private final LiveData f24961D0;

    /* renamed from: E0 */
    private final LiveData f24962E0;

    /* renamed from: F0 */
    private final InterfaceC6108l f24963F0;

    /* renamed from: j0 */
    private final AnalyticsManager f24964j0;

    /* renamed from: k0 */
    private final C7347m1 f24965k0;

    /* renamed from: l0 */
    private final C7405s1 f24966l0;

    /* renamed from: m0 */
    private final StoreManager f24967m0;

    /* renamed from: n0 */
    private final CoachMarkManager f24968n0;

    /* renamed from: o0 */
    private C2381h f24969o0;

    /* renamed from: p0 */
    private final Void f24970p0;

    /* renamed from: q0 */
    private final C1436e0 f24971q0;

    /* renamed from: r0 */
    private final C1436e0 f24972r0;

    /* renamed from: s0 */
    private final C1436e0 f24973s0;

    /* renamed from: t0 */
    private final C1436e0 f24974t0;

    /* renamed from: u0 */
    private final C1436e0 f24975u0;

    /* renamed from: v0 */
    private final C1436e0 f24976v0;

    /* renamed from: w0 */
    private final C1430c0 f24977w0;

    /* renamed from: x0 */
    private final LiveData f24978x0;

    /* renamed from: y0 */
    private final LiveData f24979y0;

    /* renamed from: z0 */
    private final C1436e0 f24980z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TakeAwayLandingViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC9497a {
        STORE,
        ORDER_LIST
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayLandingViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel$getStatus$1", m20196f = "TakeAwayLandingViewModel.kt", m20195l = {142}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$b */
    /* loaded from: classes2.dex */
    public static final class C9498b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24981x;

        /* renamed from: z */
        final /* synthetic */ boolean f24983z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayLandingViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel$getStatus$1$1", m20196f = "TakeAwayLandingViewModel.kt", m20195l = {143, 153, 159}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C9499a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ boolean f24984A;

            /* renamed from: x */
            Object f24985x;

            /* renamed from: y */
            int f24986y;

            /* renamed from: z */
            final /* synthetic */ TakeAwayLandingViewModel f24987z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9499a(TakeAwayLandingViewModel takeAwayLandingViewModel, boolean z, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24987z = takeAwayLandingViewModel;
                this.f24984A = z;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9499a(this.f24987z, this.f24984A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9499a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    Method dump skipped, instructions count: 359
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel.C9498b.C9499a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9498b(boolean z, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24983z = z;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9498b(this.f24983z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9498b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24981x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayLandingViewModel.m10939C1(TakeAwayLandingViewModel.this).mo166p(C6755b.m20201a(false));
                TakeAwayLandingViewModel takeAwayLandingViewModel = TakeAwayLandingViewModel.this;
                C9499a c9499a = new C9499a(takeAwayLandingViewModel, this.f24983z, null);
                this.f24981x = 1;
                if (TakeAwayLandingViewModel.m10935G1(takeAwayLandingViewModel, true, c9499a, this) == m34636d) {
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
    /* compiled from: TakeAwayLandingViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel", m20196f = "TakeAwayLandingViewModel.kt", m20195l = {106, C0868i.f2773H0}, m20194m = "onSubmit")
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$c */
    /* loaded from: classes2.dex */
    public static final class C9500c extends AbstractC6757d {

        /* renamed from: B */
        int f24989B;

        /* renamed from: w */
        Object f24990w;

        /* renamed from: x */
        Object f24991x;

        /* renamed from: y */
        Object f24992y;

        /* renamed from: z */
        /* synthetic */ Object f24993z;

        C9500c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f24993z = obj;
            this.f24989B |= Integer.MIN_VALUE;
            return TakeAwayLandingViewModel.this.m10908n0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayLandingViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel$setPickupStore$1", m20196f = "TakeAwayLandingViewModel.kt", m20195l = {201}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$d */
    /* loaded from: classes2.dex */
    public static final class C9501d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24994x;

        /* renamed from: z */
        final /* synthetic */ Store f24996z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayLandingViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel$setPickupStore$1$1", m20196f = "TakeAwayLandingViewModel.kt", m20195l = {202}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$d$a */
        /* loaded from: classes2.dex */
        public static final class C9502a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24997x;

            /* renamed from: y */
            final /* synthetic */ TakeAwayLandingViewModel f24998y;

            /* renamed from: z */
            final /* synthetic */ Store f24999z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9502a(TakeAwayLandingViewModel takeAwayLandingViewModel, Store store, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24998y = takeAwayLandingViewModel;
                this.f24999z = store;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9502a(this.f24998y, this.f24999z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9502a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24997x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7347m1 m10896y1 = TakeAwayLandingViewModel.m10896y1(this.f24998y);
                    int m13711f = this.f24999z.m13711f();
                    this.f24997x = 1;
                    obj = m10896y1.m18672t(m13711f, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7373o1 abstractC7373o1 = (AbstractC7373o1) obj;
                if (abstractC7373o1 instanceof AbstractC7373o1.C7375b) {
                    AbstractC7373o1.C7375b c7375b = (AbstractC7373o1.C7375b) abstractC7373o1;
                    TakeAwayLandingViewModel.m10934H1(this.f24998y, c7375b.m18630a());
                    TakeAwayLandingViewModel.m10899v1(this.f24998y, c7375b);
                } else if (abstractC7373o1 instanceof AbstractC7373o1.C7374a) {
                    TakeAwayLandingViewModel takeAwayLandingViewModel = this.f24998y;
                    String string = TakeAwayLandingViewModel.m10898w1(takeAwayLandingViewModel).m6899a().getString(C2336R.string.lbl_take_away_unavailable);
                    Intrinsics.checkIfNull(string, "ctx.getString(id)");
                    TakeAwayLandingViewModel.m10938D1(takeAwayLandingViewModel, string);
                }
                TakeAwayLandingViewModel.m10939C1(this.f24998y).mo166p(C6755b.m20201a(true));
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9501d(Store store, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24996z = store;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9501d(this.f24996z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9501d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24994x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayLandingViewModel takeAwayLandingViewModel = TakeAwayLandingViewModel.this;
                C9502a c9502a = new C9502a(takeAwayLandingViewModel, this.f24996z, null);
                this.f24994x = 1;
                if (TakeAwayLandingViewModel.m10935G1(takeAwayLandingViewModel, true, c9502a, this) == m34636d) {
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
    /* compiled from: TakeAwayLandingViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$e */
    /* loaded from: classes2.dex */
    public static final class C9503e extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: TakeAwayLandingViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$e$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9504a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f25001a;

            static {
                int[] iArr = new int[EnumC9497a.values().length];
                iArr[EnumC9497a.STORE.ordinal()] = 1;
                iArr[EnumC9497a.ORDER_LIST.ordinal()] = 2;
                f25001a = iArr;
            }
        }

        C9503e() {
            super(1);
        }

        /* renamed from: a */
        public final void m10890a(EnumC9497a enumC9497a) {
            Intrinsics.isThisObjectNull(enumC9497a, "type");
            int i = C9504a.f25001a[enumC9497a.ordinal()];
            if (i == 1) {
                BaseViewModel.m119C(TakeAwayLandingViewModel.this, C13893q2.f35014a, null, 2, null);
            } else if (i != 2) {
            } else {
                BaseViewModel.m119C(TakeAwayLandingViewModel.this, C13889p2.f35010a, null, 2, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10890a((EnumC9497a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayLandingViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel$updateOrdersIfPossible$1", m20196f = "TakeAwayLandingViewModel.kt", m20195l = {258}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$f */
    /* loaded from: classes2.dex */
    public static final class C9505f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25002x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayLandingViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel$updateOrdersIfPossible$1$1", m20196f = "TakeAwayLandingViewModel.kt", m20195l = {259}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.a$f$a */
        /* loaded from: classes2.dex */
        public static final class C9506a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f25004x;

            /* renamed from: y */
            final /* synthetic */ TakeAwayLandingViewModel f25005y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9506a(TakeAwayLandingViewModel takeAwayLandingViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f25005y = takeAwayLandingViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9506a(this.f25005y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9506a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f25004x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7347m1 m10896y1 = TakeAwayLandingViewModel.m10896y1(this.f25005y);
                    this.f25004x = 1;
                    obj = C7347m1.m18670v(m10896y1, false, this, 1, null);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                TakeAwayManager takeAwayManager = (TakeAwayManager) obj;
                if (takeAwayManager instanceof TakeAwayManager.C7336b) {
                    TakeAwayLandingViewModel.m10941A1(this.f25005y).mo166p(C6755b.m20199c(((TakeAwayManager.C7336b) takeAwayManager).m18702a().size()));
                } else if (takeAwayManager instanceof TakeAwayManager.C7335a) {
                    TakeAwayLandingViewModel.m10937E1(this.f25005y, ((TakeAwayManager.C7335a) takeAwayManager).m18703a());
                }
                return C13195u.f34156a;
            }
        }

        C9505f(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9505f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9505f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f25002x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayLandingViewModel takeAwayLandingViewModel = TakeAwayLandingViewModel.this;
                C9506a c9506a = new C9506a(takeAwayLandingViewModel, null);
                this.f25002x = 1;
                if (CoreBaseViewModel.m20383n(takeAwayLandingViewModel, false, c9506a, this, 1, null) == m34636d) {
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
    public TakeAwayLandingViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1, C7405s1 c7405s1, StoreManager storeManager, CoachMarkManager coachMarkManager) {
        super(c1459l0, resourcesProvider, analyticsManager, c7347m1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7347m1, "takeAwayManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(storeManager, "storesManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        this.f24964j0 = analyticsManager;
        this.f24965k0 = c7347m1;
        this.f24966l0 = c7405s1;
        this.f24967m0 = storeManager;
        this.f24968n0 = coachMarkManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_take_away_search));
        this.f24969o0 = c2381h;
        C1436e0 c1436e0 = new C1436e0(0);
        this.f24971q0 = c1436e0;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_takeaway_store);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 c1436e02 = new C1436e0(string);
        this.f24972r0 = c1436e02;
        C1436e0 c1436e03 = new C1436e0(Boolean.valueOf(!c7347m1.m18687e().isEmpty()));
        this.f24973s0 = c1436e03;
        Boolean bool = Boolean.FALSE;
        C1436e0 c1436e04 = new C1436e0(bool);
        this.f24974t0 = c1436e04;
        C1436e0 c1436e05 = new C1436e0(bool);
        this.f24975u0 = c1436e05;
        C1436e0 c1436e06 = new C1436e0();
        this.f24976v0 = c1436e06;
        C1430c0 c1430c0 = new C1430c0();
        this.f24977w0 = c1430c0;
        this.f24978x0 = m106t(c7405s1.m18497m());
        m106t(c7405s1.m18500j());
        this.f24979y0 = c1436e02;
        this.f24980z0 = c1436e03;
        this.f24958A0 = c1436e04;
        this.f24959B0 = c1436e05;
        this.f24960C0 = c1430c0;
        this.f24961D0 = c1436e0;
        this.f24962E0 = c1436e06;
        this.f24963F0 = OperatorExtensions.m35176e(0L, null, new C9503e(), 3, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7812k0.f20436b, null, null, null, 14, null);
        c7347m1.m18688d();
        c1430c0.m37055q(c1436e02, new InterfaceC1440f0() { // from class: ql.j
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayLandingViewModel.m10902s1(TakeAwayLandingViewModel.this, (String) obj);
            }
        });
        c1430c0.m37055q(m16440O0(), new InterfaceC1440f0() { // from class: ql.l
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayLandingViewModel.m10901t1(TakeAwayLandingViewModel.this, (String) obj);
            }
        });
        c1430c0.m37055q(m16439P0(), new InterfaceC1440f0() { // from class: ql.k
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayLandingViewModel.m10900u1(TakeAwayLandingViewModel.this, (String) obj);
            }
        });
        c1436e04.mo166p(Boolean.valueOf(m16438Q0().mo172f() != null));
        m10922S1(this, false, 1, null);
    }

    /* renamed from: A1 */
    public static final /* synthetic */ C1436e0 m10941A1(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        return takeAwayLandingViewModel.f24971q0;
    }

    /* renamed from: B1 */
    public static final /* synthetic */ C1436e0 m10940B1(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        return takeAwayLandingViewModel.f24972r0;
    }

    /* renamed from: C1 */
    public static final /* synthetic */ C1436e0 m10939C1(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        return takeAwayLandingViewModel.f24973s0;
    }

    /* renamed from: D1 */
    public static final /* synthetic */ void m10938D1(TakeAwayLandingViewModel takeAwayLandingViewModel, String str) {
        takeAwayLandingViewModel.m110k(str);
    }

    /* renamed from: E1 */
    public static final /* synthetic */ void m10937E1(TakeAwayLandingViewModel takeAwayLandingViewModel, Throwable th2) {
        takeAwayLandingViewModel.m109l(th2);
    }

    /* renamed from: F1 */
    public static final /* synthetic */ void m10936F1(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        takeAwayLandingViewModel.m16427b1();
    }

    /* renamed from: G1 */
    public static final /* synthetic */ Object m10935G1(TakeAwayLandingViewModel takeAwayLandingViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return takeAwayLandingViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: H1 */
    public static final /* synthetic */ void m10934H1(TakeAwayLandingViewModel takeAwayLandingViewModel, Store store) {
        super.m16421h1(store);
    }

    /* renamed from: I1 */
    private final void m10933I1(AbstractC7373o1.C7375b c7375b) {
        if (c7375b.m18630a().m13700w()) {
            ArrayList arrayList = new ArrayList();
            for (String str : c7375b.m18630a().m13715D()) {
                arrayList.add(new RecyclerPickerDialogFragment(str));
            }
            m16423f1(arrayList);
            this.f24974t0.mo166p(Boolean.TRUE);
        } else {
            String string = m20390g().m6899a().getString(C2336R.string.lbl_take_away_unavailable);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            m110k(string);
        }
        InterfaceC7886d.C7887a.m17629a(this.f24964j0, AnalyticEvents.AbstractC7780f.C7815l0.f20439b, null, null, null, 14, null);
    }

    /* renamed from: J1 */
    private final void m10932J1() {
        C1436e0 c1436e0 = this.f24974t0;
        Boolean bool = Boolean.FALSE;
        c1436e0.mo166p(bool);
        this.f24975u0.mo166p(bool);
    }

    /* renamed from: R1 */
    private final void m10923R1(boolean z) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9498b(z, null), 3, null);
    }

    /* renamed from: S1 */
    static /* synthetic */ void m10922S1(TakeAwayLandingViewModel takeAwayLandingViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        takeAwayLandingViewModel.m10923R1(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m10918W1(TakeAwayLandingViewModel takeAwayLandingViewModel, View view) {
        Intrinsics.isThisObjectNull(takeAwayLandingViewModel, "this$0");
        takeAwayLandingViewModel.f24963F0.mo9587d(EnumC9497a.ORDER_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m10916Y1(TakeAwayLandingViewModel takeAwayLandingViewModel, View view) {
        Intrinsics.isThisObjectNull(takeAwayLandingViewModel, "this$0");
        takeAwayLandingViewModel.f24963F0.mo9587d(EnumC9497a.STORE);
    }

    /* renamed from: a2 */
    private final void m10914a2() {
        boolean z;
        C1430c0 c1430c0 = this.f24977w0;
        Object mo172f = this.f24979y0.mo172f();
        String string = m20390g().m6899a().getString(C2336R.string.lbl_takeaway_store);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        if (!Intrinsics.equals(mo172f, string)) {
            Object mo172f2 = m16440O0().mo172f();
            String string2 = m20390g().m6899a().getString(C2336R.string.lbl_takeaway_date);
            Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            if (!Intrinsics.equals(mo172f2, string2)) {
                Object mo172f3 = m16439P0().mo172f();
                String string3 = m20390g().m6899a().getString(C2336R.string.lbl_takeaway_hour);
                Intrinsics.checkIfNull(string3, "ctx.getString(id)");
                if (!Intrinsics.equals(mo172f3, string3)) {
                    z = true;
                    c1430c0.mo166p(Boolean.valueOf(z));
                }
            }
        }
        z = false;
        c1430c0.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m10907n1(TakeAwayLandingViewModel takeAwayLandingViewModel, View view) {
        m10918W1(takeAwayLandingViewModel, view);
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m10906o1(TakeAwayLandingViewModel takeAwayLandingViewModel, View view) {
        m10916Y1(takeAwayLandingViewModel, view);
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m10905p1(TakeAwayLandingViewModel takeAwayLandingViewModel, String str) {
        m10902s1(takeAwayLandingViewModel, str);
    }

    /* renamed from: q1 */
    public static /* synthetic */ void m10904q1(TakeAwayLandingViewModel takeAwayLandingViewModel, String str) {
        m10900u1(takeAwayLandingViewModel, str);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m10903r1(TakeAwayLandingViewModel takeAwayLandingViewModel, String str) {
        m10901t1(takeAwayLandingViewModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m10902s1(TakeAwayLandingViewModel takeAwayLandingViewModel, String str) {
        Intrinsics.isThisObjectNull(takeAwayLandingViewModel, "this$0");
        takeAwayLandingViewModel.m10914a2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m10901t1(TakeAwayLandingViewModel takeAwayLandingViewModel, String str) {
        Intrinsics.isThisObjectNull(takeAwayLandingViewModel, "this$0");
        takeAwayLandingViewModel.m10914a2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m10900u1(TakeAwayLandingViewModel takeAwayLandingViewModel, String str) {
        Intrinsics.isThisObjectNull(takeAwayLandingViewModel, "this$0");
        takeAwayLandingViewModel.m10914a2();
    }

    /* renamed from: v1 */
    public static final /* synthetic */ void m10899v1(TakeAwayLandingViewModel takeAwayLandingViewModel, AbstractC7373o1.C7375b c7375b) {
        takeAwayLandingViewModel.m10933I1(c7375b);
    }

    /* renamed from: w1 */
    public static final /* synthetic */ ResourcesProvider m10898w1(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        return takeAwayLandingViewModel.m20390g();
    }

    /* renamed from: x1 */
    public static final /* synthetic */ StoreManager m10897x1(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        return takeAwayLandingViewModel.f24967m0;
    }

    /* renamed from: y1 */
    public static final /* synthetic */ C7347m1 m10896y1(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        return takeAwayLandingViewModel.f24965k0;
    }

    /* renamed from: z1 */
    public static final /* synthetic */ C1436e0 m10895z1(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        return takeAwayLandingViewModel.f24976v0;
    }

    /* renamed from: A0 */
    protected Void m10942A0() {
        return this.f24970p0;
    }

    /* renamed from: K1 */
    public final C1436e0 m10931K1() {
        return this.f24958A0;
    }

    /* renamed from: L1 */
    public final LiveData m10930L1() {
        return this.f24978x0;
    }

    /* renamed from: M1 */
    public final C1436e0 m10929M1() {
        return this.f24959B0;
    }

    /* renamed from: N */
    protected void m10928N() {
        m10922S1(this, false, 1, null);
    }

    /* renamed from: N1 */
    public final C1430c0 m10927N1() {
        return this.f24960C0;
    }

    /* renamed from: O1 */
    public final LiveData m10926O1() {
        return this.f24962E0;
    }

    /* renamed from: P1 */
    public final LiveData m10925P1() {
        return this.f24961D0;
    }

    /* renamed from: Q1 */
    public final LiveData m10924Q1() {
        return this.f24979y0;
    }

    /* renamed from: T1 */
    public final C1436e0 m10921T1() {
        return this.f24980z0;
    }

    /* renamed from: U1 */
    public final boolean m10920U1() {
        return !this.f24968n0.m18614j();
    }

    /* renamed from: V1 */
    public final View.OnClickListener m10919V1() {
        return new View.OnClickListener() { // from class: ql.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeAwayLandingViewModel.m10918W1(TakeAwayLandingViewModel.this, view);
            }
        };
    }

    /* renamed from: X1 */
    public final View.OnClickListener m10917X1() {
        return new View.OnClickListener() { // from class: ql.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeAwayLandingViewModel.m10916Y1(TakeAwayLandingViewModel.this, view);
            }
        };
    }

    /* renamed from: Z1 */
    public final void m10915Z1() {
        if (this.f24966l0.m18502h() != null) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9505f(null), 3, null);
        }
    }

    /* renamed from: d1 */
    public void m10913d1(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        super.m16425d1(str);
        ArrayList arrayList = new ArrayList();
        Store store = (Store) m16438Q0().mo172f();
        List<String> m13706m = store != null ? store.m13706m(str) : null;
        Intrinsics.ifNullDoSomething(m13706m);
        for (String str2 : m13706m) {
            arrayList.add(new RecyclerPickerDialogFragment(str2));
        }
        m16422g1(arrayList);
        m16426c1();
        this.f24975u0.mo166p(Boolean.TRUE);
        InterfaceC7886d.C7887a.m17629a(this.f24964j0, AnalyticEvents.AbstractC7780f.C7818m0.f20442b, null, null, null, 14, null);
    }

    /* renamed from: e1 */
    public void m10912e1(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        super.m16424e1(str);
        InterfaceC7886d.C7887a.m17629a(this.f24964j0, AnalyticEvents.AbstractC7780f.C7821n0.f20445b, null, null, null, 14, null);
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m10911f0() {
        return (Drawable) m10942A0();
    }

    /* renamed from: g0 */
    protected C2381h m10910g0() {
        return this.f24969o0;
    }

    /* renamed from: h1 */
    public void m10909h1(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        m16427b1();
        m10932J1();
        this.f24972r0.mo166p(store.m13710h());
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9501d(store, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m10908n0(bd.InterfaceC1886d r31) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel.m10908n0(bd.d):java.lang.Object");
    }
}
