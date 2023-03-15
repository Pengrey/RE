package p163ih;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.PurchasesManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p489zc._Collections;
import p494zh.BaseViewModel;
import p494zh.C13920x1;
import td.InterfaceC10524i0;

/* renamed from: ih.j */
/* loaded from: classes2.dex */
public final class PurchasesRecentViewModel extends BaseViewModel {

    /* renamed from: m */
    private final PurchasesManager f16883m;

    /* renamed from: n */
    private final InterfaceC6108l f16884n;

    /* renamed from: o */
    private final C1436e0 f16885o;

    /* renamed from: p */
    private final LiveData f16886p;

    /* renamed from: q */
    private int f16887q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchasesRecentViewModel.kt */
    /* renamed from: ih.j$a */
    /* loaded from: classes2.dex */
    public static final class C6153a extends AbstractC6438m implements InterfaceC6108l {
        C6153a() {
            super(1);
        }

        /* renamed from: a */
        public final void m22042a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(PurchasesRecentViewModel.this, C13920x1.f35041a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22042a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchasesRecentViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.pager.PurchasesRecentViewModel$getLastPurchases$1", m20196f = "PurchasesRecentViewModel.kt", m20195l = {40}, m20194m = "invokeSuspend")
    /* renamed from: ih.j$b */
    /* loaded from: classes2.dex */
    public static final class C6154b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f16889x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PurchasesRecentViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.pager.PurchasesRecentViewModel$getLastPurchases$1$1", m20196f = "PurchasesRecentViewModel.kt", m20195l = {43}, m20194m = "invokeSuspend")
        /* renamed from: ih.j$b$a */
        /* loaded from: classes2.dex */
        public static final class C6155a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f16891x;

            /* renamed from: y */
            final /* synthetic */ PurchasesRecentViewModel f16892y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6155a(PurchasesRecentViewModel purchasesRecentViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f16892y = purchasesRecentViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C6155a(this.f16892y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C6155a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m197g;
                List m460i0;
                m34636d = C2116d.m34636d();
                int i = this.f16891x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    PurchasesRecentViewModel.m22048P(this.f16892y, false);
                    C1436e0 m22050N = PurchasesRecentViewModel.m22050N(this.f16892y);
                    m197g = C13780s.m197g();
                    m22050N.mo166p(m197g);
                    PurchasesManager m22051M = PurchasesRecentViewModel.m22051M(this.f16892y);
                    this.f16891x = 1;
                    obj = m22051M.m18448e(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                PurchasesManager.AbstractC7449b abstractC7449b = (PurchasesManager.AbstractC7449b) obj;
                if (abstractC7449b instanceof PurchasesManager.AbstractC7449b.C7452c) {
                    C1436e0 m22050N2 = PurchasesRecentViewModel.m22050N(this.f16892y);
                    m460i0 = _Collections.m460i0(((PurchasesManager.AbstractC7449b.C7452c) abstractC7449b).m18440a(), 4);
                    m22050N2.mo166p(m460i0);
                    PurchasesRecentViewModel purchasesRecentViewModel = this.f16892y;
                    T mo172f = PurchasesRecentViewModel.m22050N(purchasesRecentViewModel).mo172f();
                    Intrinsics.ifNullDoSomething(mo172f);
                    PurchasesRecentViewModel.m22048P(purchasesRecentViewModel, ((List) mo172f).isEmpty());
                } else if (abstractC7449b instanceof PurchasesManager.AbstractC7449b.C7451b) {
                    PurchasesRecentViewModel.m22048P(this.f16892y, true);
                } else if (abstractC7449b instanceof PurchasesManager.AbstractC7449b.C7450a) {
                    PurchasesRecentViewModel.m22048P(this.f16892y, true);
                }
                return C13195u.f34156a;
            }
        }

        C6154b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C6154b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C6154b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f16889x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchasesRecentViewModel purchasesRecentViewModel = PurchasesRecentViewModel.this;
                C6155a c6155a = new C6155a(purchasesRecentViewModel, null);
                this.f16889x = 1;
                if (PurchasesRecentViewModel.m22049O(purchasesRecentViewModel, true, c6155a, this) == m34636d) {
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
    public PurchasesRecentViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PurchasesManager purchasesManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(purchasesManager, "purchasesManager");
        this.f16883m = purchasesManager;
        this.f16884n = BaseViewModel.m113I(this, 0L, new C6153a(), 1, null);
        C1436e0 c1436e0 = new C1436e0(new ArrayList());
        this.f16885o = c1436e0;
        this.f16886p = c1436e0;
        this.f16887q = 82;
        m22047Q();
    }

    /* renamed from: L */
    public static /* synthetic */ void m22052L(PurchasesRecentViewModel purchasesRecentViewModel, View view) {
        m22043U(purchasesRecentViewModel, view);
    }

    /* renamed from: M */
    public static final /* synthetic */ PurchasesManager m22051M(PurchasesRecentViewModel purchasesRecentViewModel) {
        return purchasesRecentViewModel.f16883m;
    }

    /* renamed from: N */
    public static final /* synthetic */ C1436e0 m22050N(PurchasesRecentViewModel purchasesRecentViewModel) {
        return purchasesRecentViewModel.f16885o;
    }

    /* renamed from: O */
    public static final /* synthetic */ Object m22049O(PurchasesRecentViewModel purchasesRecentViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return purchasesRecentViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: P */
    public static final /* synthetic */ void m22048P(PurchasesRecentViewModel purchasesRecentViewModel, boolean z) {
        purchasesRecentViewModel.m20381p(z);
    }

    /* renamed from: Q */
    private final void m22047Q() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C6154b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final void m22043U(PurchasesRecentViewModel purchasesRecentViewModel, View view) {
        Intrinsics.isThisObjectNull(purchasesRecentViewModel, "this$0");
        purchasesRecentViewModel.f16884n.mo9587d(C13195u.f34156a);
    }

    /* renamed from: R */
    public final LiveData m22046R() {
        return this.f16886p;
    }

    /* renamed from: S */
    public final int m22045S() {
        return this.f16887q;
    }

    /* renamed from: T */
    public final View.OnClickListener m22044T() {
        return new View.OnClickListener() { // from class: ih.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchasesRecentViewModel.m22043U(PurchasesRecentViewModel.this, view);
            }
        };
    }
}
