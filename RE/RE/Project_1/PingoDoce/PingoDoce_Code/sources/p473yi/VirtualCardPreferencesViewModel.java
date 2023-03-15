package p473yi;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2148j;
import ci.FlowViewModel;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import lk.EnumC7070a;
import me.C7185b;
import mg.LoyaltyCardManager;
import p162ig.Term;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13921x2;
import p494zh.C13929z2;
import pt.pingodoce.app.data.local.flows.VirtualCardFlowData;
import pt.pingodoce.app.data.remote.models.response.Consent;
import td.InterfaceC10524i0;

/* renamed from: yi.k */
/* loaded from: classes2.dex */
public final class VirtualCardPreferencesViewModel extends FlowViewModel {

    /* renamed from: q */
    private final LoyaltyCardManager f34208q;

    /* renamed from: r */
    private final C1436e0 f34209r;

    /* renamed from: s */
    private final C1436e0 f34210s;

    /* renamed from: t */
    private final C1436e0 f34211t;

    /* renamed from: u */
    private final C1436e0 f34212u;

    /* renamed from: v */
    private final LiveData f34213v;

    /* renamed from: w */
    private final InterfaceC6108l f34214w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VirtualCardPreferencesViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesViewModel$fetchConsentsUrl$1", m20196f = "VirtualCardPreferencesViewModel.kt", m20195l = {77}, m20194m = "invokeSuspend")
    /* renamed from: yi.k$a */
    /* loaded from: classes2.dex */
    public static final class C13453a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ EnumC7070a f34215A;

        /* renamed from: x */
        int f34216x;

        /* renamed from: z */
        final /* synthetic */ String f34218z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VirtualCardPreferencesViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesViewModel$fetchConsentsUrl$1$1", m20196f = "VirtualCardPreferencesViewModel.kt", m20195l = {78}, m20194m = "invokeSuspend")
        /* renamed from: yi.k$a$a */
        /* loaded from: classes2.dex */
        public static final class C13454a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ EnumC7070a f34219A;

            /* renamed from: x */
            int f34220x;

            /* renamed from: y */
            final /* synthetic */ VirtualCardPreferencesViewModel f34221y;

            /* renamed from: z */
            final /* synthetic */ String f34222z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13454a(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel, String str, EnumC7070a enumC7070a, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f34221y = virtualCardPreferencesViewModel;
                this.f34222z = str;
                this.f34219A = enumC7070a;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C13454a(this.f34221y, this.f34222z, this.f34219A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C13454a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f34220x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m1373W = VirtualCardPreferencesViewModel.m1373W(this.f34221y);
                    this.f34220x = 1;
                    obj = m1373W.m18924v(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    Object m16962b = ((Result.C8078c) result).m16962b();
                    Consent consent = (Consent) m16962b;
                    VirtualCardPreferencesViewModel.m1372X(this.f34221y).mo166p(new C7185b(new Term(this.f34222z, this.f34219A == EnumC7070a.TERM_OF_USE ? consent.m13866b() : consent.m13867a())));
                } else if (result instanceof Result.C8077b) {
                    VirtualCardPreferencesViewModel.m1371Y(this.f34221y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13453a(String str, EnumC7070a enumC7070a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f34218z = str;
            this.f34215A = enumC7070a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13453a(this.f34218z, this.f34215A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13453a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f34216x;
            if (i == 0) {
                C13186n.m1453b(obj);
                VirtualCardPreferencesViewModel virtualCardPreferencesViewModel = VirtualCardPreferencesViewModel.this;
                C13454a c13454a = new C13454a(virtualCardPreferencesViewModel, this.f34218z, this.f34215A, null);
                this.f34216x = 1;
                if (VirtualCardPreferencesViewModel.m1370Z(virtualCardPreferencesViewModel, true, c13454a, this) == m34636d) {
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
    /* compiled from: VirtualCardPreferencesViewModel.kt */
    /* renamed from: yi.k$b */
    /* loaded from: classes2.dex */
    public static final class C13455b extends AbstractC6438m implements InterfaceC6108l {
        C13455b() {
            super(1);
        }

        /* renamed from: a */
        public final void m1358a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            VirtualCardPreferencesViewModel virtualCardPreferencesViewModel = VirtualCardPreferencesViewModel.this;
            C13921x2 c13921x2 = C13921x2.f35042a;
            VirtualCardFlowData virtualCardFlowData = (VirtualCardFlowData) virtualCardPreferencesViewModel.m34578S();
            T mo172f = VirtualCardPreferencesViewModel.this.m1367c0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            boolean booleanValue = ((Boolean) mo172f).booleanValue();
            T mo172f2 = VirtualCardPreferencesViewModel.this.m1366d0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f2);
            boolean booleanValue2 = ((Boolean) mo172f2).booleanValue();
            T mo172f3 = VirtualCardPreferencesViewModel.this.m1368b0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f3);
            virtualCardPreferencesViewModel.m34576U(VirtualCardFlowData.m14677b(virtualCardFlowData, null, null, null, null, booleanValue, booleanValue2, ((Boolean) mo172f3).booleanValue(), null, 143, null));
            virtualCardPreferencesViewModel.m120B(c13921x2, C13195u.f34156a);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1358a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VirtualCardPreferencesViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesViewModel$registerVirtualCard$1", m20196f = "VirtualCardPreferencesViewModel.kt", m20195l = {54}, m20194m = "invokeSuspend")
    /* renamed from: yi.k$c */
    /* loaded from: classes2.dex */
    public static final class C13456c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f34224x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VirtualCardPreferencesViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesViewModel$registerVirtualCard$1$1", m20196f = "VirtualCardPreferencesViewModel.kt", m20195l = {55}, m20194m = "invokeSuspend")
        /* renamed from: yi.k$c$a */
        /* loaded from: classes2.dex */
        public static final class C13457a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f34226x;

            /* renamed from: y */
            final /* synthetic */ VirtualCardPreferencesViewModel f34227y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13457a(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f34227y = virtualCardPreferencesViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C13457a(this.f34227y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C13457a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f34226x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m1373W = VirtualCardPreferencesViewModel.m1373W(this.f34227y);
                    String m14673f = ((VirtualCardFlowData) this.f34227y.m34578S()).m14673f();
                    String m14671i = ((VirtualCardFlowData) this.f34227y.m34578S()).m14671i();
                    String m14674e = ((VirtualCardFlowData) this.f34227y.m34578S()).m14674e();
                    String m14670j = ((VirtualCardFlowData) this.f34227y.m34578S()).m14670j();
                    boolean m14675d = ((VirtualCardFlowData) this.f34227y.m34578S()).m14675d();
                    boolean m14672h = ((VirtualCardFlowData) this.f34227y.m34578S()).m14672h();
                    boolean m14676c = ((VirtualCardFlowData) this.f34227y.m34578S()).m14676c();
                    this.f34226x = 1;
                    obj = m1373W.m18923w(m14673f, m14671i, m14674e, m14670j, m14675d, m14672h, m14676c, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    this.f34227y.m104v(C2148j.f6183a);
                    BaseViewModel.m119C(this.f34227y, C13929z2.f35050a, null, 2, null);
                } else if (result instanceof Result.C8077b) {
                    VirtualCardPreferencesViewModel.m1371Y(this.f34227y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        C13456c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13456c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13456c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f34224x;
            if (i == 0) {
                C13186n.m1453b(obj);
                VirtualCardPreferencesViewModel virtualCardPreferencesViewModel = VirtualCardPreferencesViewModel.this;
                C13457a c13457a = new C13457a(virtualCardPreferencesViewModel, null);
                this.f34224x = 1;
                if (VirtualCardPreferencesViewModel.m1370Z(virtualCardPreferencesViewModel, true, c13457a, this) == m34636d) {
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
    public VirtualCardPreferencesViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        this.f34208q = loyaltyCardManager;
        Boolean bool = Boolean.FALSE;
        this.f34209r = new C1436e0(bool);
        this.f34210s = new C1436e0(bool);
        this.f34211t = new C1436e0(bool);
        C1436e0 c1436e0 = new C1436e0();
        this.f34212u = c1436e0;
        this.f34213v = c1436e0;
        this.f34214w = BaseViewModel.m113I(this, 0L, new C13455b(), 1, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m1374V(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel, View view) {
        m1363g0(virtualCardPreferencesViewModel, view);
    }

    /* renamed from: W */
    public static final /* synthetic */ LoyaltyCardManager m1373W(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel) {
        return virtualCardPreferencesViewModel.f34208q;
    }

    /* renamed from: X */
    public static final /* synthetic */ C1436e0 m1372X(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel) {
        return virtualCardPreferencesViewModel.f34212u;
    }

    /* renamed from: Y */
    public static final /* synthetic */ void m1371Y(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel, Throwable th2) {
        virtualCardPreferencesViewModel.m109l(th2);
    }

    /* renamed from: Z */
    public static final /* synthetic */ Object m1370Z(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return virtualCardPreferencesViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m1363g0(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel, View view) {
        Intrinsics.isThisObjectNull(virtualCardPreferencesViewModel, "this$0");
        virtualCardPreferencesViewModel.f34214w.mo9587d(C13195u.f34156a);
    }

    /* renamed from: a0 */
    public final void m1369a0(String str, EnumC7070a enumC7070a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(enumC7070a, "type");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C13453a(str, enumC7070a, null), 3, null);
    }

    /* renamed from: b0 */
    public final C1436e0 m1368b0() {
        return this.f34211t;
    }

    /* renamed from: c0 */
    public final C1436e0 m1367c0() {
        return this.f34209r;
    }

    /* renamed from: d0 */
    public final C1436e0 m1366d0() {
        return this.f34210s;
    }

    /* renamed from: e0 */
    public final LiveData m1365e0() {
        return this.f34213v;
    }

    /* renamed from: f0 */
    public final View.OnClickListener m1364f0() {
        return new View.OnClickListener() { // from class: yi.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualCardPreferencesViewModel.m1363g0(VirtualCardPreferencesViewModel.this, view);
            }
        };
    }

    /* renamed from: h0 */
    public final void m1362h0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C13456c(null), 3, null);
    }
}
