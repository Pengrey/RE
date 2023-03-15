package p428wi;

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
import ke.CoreBaseViewModel;
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7229c1;
import mg.CoachMarkManager;
import mg.LoyaltyCardManager;
import mg.PrefsManager;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p489zc._Collections;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.remote.models.request.LoyaltyCardRequest;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;
import td.InterfaceC10524i0;

/* renamed from: wi.f */
/* loaded from: classes2.dex */
public final class LoyaltyCardInvitesViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final LoyaltyCardManager f32100p;

    /* renamed from: q */
    private final CoachMarkManager f32101q;

    /* renamed from: r */
    private final C1436e0 f32102r;

    /* renamed from: s */
    private final LiveData f32103s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardInvitesViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesViewModel$getInvites$1", m20196f = "LoyaltyCardInvitesViewModel.kt", m20195l = {40}, m20194m = "invokeSuspend")
    /* renamed from: wi.f$a */
    /* loaded from: classes2.dex */
    public static final class C12159a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f32104x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyCardInvitesViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesViewModel$getInvites$1$1", m20196f = "LoyaltyCardInvitesViewModel.kt", m20195l = {41}, m20194m = "invokeSuspend")
        /* renamed from: wi.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C12160a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f32106x;

            /* renamed from: y */
            final /* synthetic */ LoyaltyCardInvitesViewModel f32107y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12160a(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f32107y = loyaltyCardInvitesViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C12160a(this.f32107y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C12160a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m197g;
                m34636d = C2116d.m34636d();
                int i = this.f32106x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m3523S = LoyaltyCardInvitesViewModel.m3523S(this.f32107y);
                    this.f32106x = 1;
                    obj = m3523S.m18921y(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7229c1 abstractC7229c1 = (AbstractC7229c1) obj;
                if (abstractC7229c1 instanceof AbstractC7229c1.C7232b) {
                    LoyaltyCardInvitesViewModel.m3519W(this.f32107y, false);
                    AbstractC7229c1.C7232b c7232b = (AbstractC7229c1.C7232b) abstractC7229c1;
                    LoyaltyCardInvitesViewModel.m3520V(this.f32107y, c7232b.m18907a().isEmpty());
                    ArrayList arrayList = new ArrayList();
                    for (LoyaltyCardAssociation loyaltyCardAssociation : c7232b.m18907a()) {
                        arrayList.add(new LoyaltyCardRequest(loyaltyCardAssociation.m13784a(), loyaltyCardAssociation.m13782c(), loyaltyCardAssociation.m13781d(), null, 8, null));
                    }
                    LoyaltyCardInvitesViewModel.m3522T(this.f32107y).mo166p(arrayList);
                } else if (abstractC7229c1 instanceof AbstractC7229c1.AbstractC7230a.C7231a) {
                    C1436e0 m3522T = LoyaltyCardInvitesViewModel.m3522T(this.f32107y);
                    m197g = C13780s.m197g();
                    m3522T.mo166p(m197g);
                    LoyaltyCardInvitesViewModel.m3519W(this.f32107y, true);
                }
                return C13195u.f34156a;
            }
        }

        C12159a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12159a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12159a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f32104x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BaseViewModel.m111K(LoyaltyCardInvitesViewModel.this, true, false, 2, null);
                LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel = LoyaltyCardInvitesViewModel.this;
                C12160a c12160a = new C12160a(loyaltyCardInvitesViewModel, null);
                this.f32104x = 1;
                if (CoreBaseViewModel.m20383n(loyaltyCardInvitesViewModel, false, c12160a, this, 1, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            BaseViewModel.m111K(LoyaltyCardInvitesViewModel.this, false, false, 2, null);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardInvitesViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesViewModel$updateInvite$1", m20196f = "LoyaltyCardInvitesViewModel.kt", m20195l = {75}, m20194m = "invokeSuspend")
    /* renamed from: wi.f$b */
    /* loaded from: classes2.dex */
    public static final class C12161b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ boolean f32108A;

        /* renamed from: x */
        int f32109x;

        /* renamed from: z */
        final /* synthetic */ String f32111z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyCardInvitesViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesViewModel$updateInvite$1$1", m20196f = "LoyaltyCardInvitesViewModel.kt", m20195l = {76}, m20194m = "invokeSuspend")
        /* renamed from: wi.f$b$a */
        /* loaded from: classes2.dex */
        public static final class C12162a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ boolean f32112A;

            /* renamed from: x */
            int f32113x;

            /* renamed from: y */
            final /* synthetic */ LoyaltyCardInvitesViewModel f32114y;

            /* renamed from: z */
            final /* synthetic */ String f32115z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12162a(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel, String str, boolean z, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f32114y = loyaltyCardInvitesViewModel;
                this.f32115z = str;
                this.f32112A = z;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C12162a(this.f32114y, this.f32115z, this.f32112A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C12162a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m455n0;
                m34636d = C2116d.m34636d();
                int i = this.f32113x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m3523S = LoyaltyCardInvitesViewModel.m3523S(this.f32114y);
                    String str = this.f32115z;
                    boolean z = this.f32112A;
                    this.f32113x = 1;
                    if (m3523S.m18920z(str, z, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                T mo172f = LoyaltyCardInvitesViewModel.m3522T(this.f32114y).mo172f();
                Intrinsics.ifNullDoSomething(mo172f);
                String str2 = this.f32115z;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) mo172f) {
                    if (!Intrinsics.equals(((LoyaltyCardRequest) obj2).m14134b(), str2)) {
                        arrayList.add(obj2);
                    }
                }
                m455n0 = _Collections.m455n0(arrayList);
                LoyaltyCardInvitesViewModel.m3522T(this.f32114y).mo166p(m455n0);
                if (m455n0.isEmpty()) {
                    UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12161b(String str, boolean z, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f32111z = str;
            this.f32108A = z;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12161b(this.f32111z, this.f32108A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12161b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f32109x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel = LoyaltyCardInvitesViewModel.this;
                C12162a c12162a = new C12162a(loyaltyCardInvitesViewModel, this.f32111z, this.f32108A, null);
                this.f32109x = 1;
                if (LoyaltyCardInvitesViewModel.m3521U(loyaltyCardInvitesViewModel, true, c12162a, this) == m34636d) {
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
    public LoyaltyCardInvitesViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, PrefsManager prefsManager, CoachMarkManager coachMarkManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        this.f32100p = loyaltyCardManager;
        this.f32101q = coachMarkManager;
        C1436e0 c1436e0 = new C1436e0();
        this.f32102r = c1436e0;
        this.f32103s = c1436e0;
    }

    /* renamed from: S */
    public static final /* synthetic */ LoyaltyCardManager m3523S(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel) {
        return loyaltyCardInvitesViewModel.f32100p;
    }

    /* renamed from: T */
    public static final /* synthetic */ C1436e0 m3522T(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel) {
        return loyaltyCardInvitesViewModel.f32102r;
    }

    /* renamed from: U */
    public static final /* synthetic */ Object m3521U(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return loyaltyCardInvitesViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: V */
    public static final /* synthetic */ void m3520V(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel, boolean z) {
        loyaltyCardInvitesViewModel.m20381p(z);
    }

    /* renamed from: W */
    public static final /* synthetic */ void m3519W(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel, boolean z) {
        loyaltyCardInvitesViewModel.m20350O(z);
    }

    /* renamed from: c0 */
    private final void m3513c0(String str, boolean z) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12161b(str, z, null), 3, null);
    }

    /* renamed from: N */
    protected void m3525N() {
        m3515a0();
    }

    /* renamed from: R */
    public final void m3524R(String str) {
        Intrinsics.isThisObjectNull(str, "id");
        m3513c0(str, true);
    }

    /* renamed from: X */
    public final void m3518X() {
        this.f32101q.m18606r();
    }

    /* renamed from: Y */
    public final void m3517Y(String str) {
        Intrinsics.isThisObjectNull(str, "id");
        m3513c0(str, false);
    }

    /* renamed from: Z */
    public final LiveData m3516Z() {
        return this.f32103s;
    }

    /* renamed from: a0 */
    public final void m3515a0() {
        m20381p(false);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12159a(null), 3, null);
    }

    /* renamed from: b0 */
    public final boolean m3514b0() {
        return this.f32101q.m18618f();
    }
}
