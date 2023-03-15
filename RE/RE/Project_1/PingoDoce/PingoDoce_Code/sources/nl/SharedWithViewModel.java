package nl;

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
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7256f1;
import mg.CoachMarkManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;
import td.InterfaceC10524i0;

/* renamed from: nl.i */
/* loaded from: classes2.dex */
public final class SharedWithViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final C7256f1 f20601p;

    /* renamed from: q */
    private final CoachMarkManager f20602q;

    /* renamed from: r */
    private final List f20603r;

    /* renamed from: s */
    private final InterfaceC6108l f20604s;

    /* renamed from: t */
    private final C1436e0 f20605t;

    /* renamed from: u */
    private final LiveData f20606u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedWithViewModel.kt */
    /* renamed from: nl.i$a */
    /* loaded from: classes2.dex */
    public static final class C7941a extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SharedWithViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithViewModel$updateThrottleClick$1$1", m20196f = "SharedWithViewModel.kt", m20195l = {34}, m20194m = "invokeSuspend")
        /* renamed from: nl.i$a$a */
        /* loaded from: classes2.dex */
        public static final class C7942a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f20608x;

            /* renamed from: y */
            final /* synthetic */ SharedWithViewModel f20609y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SharedWithViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithViewModel$updateThrottleClick$1$1$1", m20196f = "SharedWithViewModel.kt", m20195l = {35}, m20194m = "invokeSuspend")
            /* renamed from: nl.i$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C7943a extends AbstractC6764l implements InterfaceC6108l {

                /* renamed from: x */
                int f20610x;

                /* renamed from: y */
                final /* synthetic */ SharedWithViewModel f20611y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C7943a(SharedWithViewModel sharedWithViewModel, InterfaceC1886d interfaceC1886d) {
                    super(1, interfaceC1886d);
                    this.f20611y = sharedWithViewModel;
                }

                public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                    return new C7943a(this.f20611y, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                    return ((C7943a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f20610x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        C7256f1 m17508T = SharedWithViewModel.m17508T(this.f20611y);
                        List m17509S = SharedWithViewModel.m17509S(this.f20611y);
                        this.f20610x = 1;
                        if (m17508T.m18839V(m17509S, this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7942a(SharedWithViewModel sharedWithViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f20609y = sharedWithViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C7942a(this.f20609y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C7942a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f20608x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    SharedWithViewModel sharedWithViewModel = this.f20609y;
                    C7943a c7943a = new C7943a(sharedWithViewModel, null);
                    this.f20608x = 1;
                    if (SharedWithViewModel.m17507U(sharedWithViewModel, true, c7943a, this) == m34636d) {
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

        C7941a() {
            super(1);
        }

        /* renamed from: a */
        public final void m17500a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            C6772d.m20158d(C1473p0.m36987a(SharedWithViewModel.this), null, null, new C7942a(SharedWithViewModel.this, null), 3, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17500a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedWithViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, CoachMarkManager coachMarkManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        this.f20601p = c7256f1;
        this.f20602q = coachMarkManager;
        this.f20603r = new ArrayList();
        this.f20604s = BaseViewModel.m113I(this, 0L, new C7941a(), 1, null);
        C1436e0 c1436e0 = new C1436e0();
        this.f20605t = c1436e0;
        this.f20606u = c1436e0;
        for (Friend friend : c7256f1.m18817v()) {
            this.f20603r.add(Friend.m14401b(friend, null, null, null, null, false, false, false, 127, null));
        }
    }

    /* renamed from: R */
    public static /* synthetic */ void m17510R(SharedWithViewModel sharedWithViewModel, View view) {
        m17501a0(sharedWithViewModel, view);
    }

    /* renamed from: S */
    public static final /* synthetic */ List m17509S(SharedWithViewModel sharedWithViewModel) {
        return sharedWithViewModel.f20603r;
    }

    /* renamed from: T */
    public static final /* synthetic */ C7256f1 m17508T(SharedWithViewModel sharedWithViewModel) {
        return sharedWithViewModel.f20601p;
    }

    /* renamed from: U */
    public static final /* synthetic */ Object m17507U(SharedWithViewModel sharedWithViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return sharedWithViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m17501a0(SharedWithViewModel sharedWithViewModel, View view) {
        Intrinsics.isThisObjectNull(sharedWithViewModel, "this$0");
        sharedWithViewModel.f20604s.mo9587d(C13195u.f34156a);
    }

    /* renamed from: N */
    protected void m17511N() {
        m17504X();
    }

    /* renamed from: V */
    public final void m17506V() {
        this.f20602q.m18605s();
    }

    /* renamed from: W */
    public final LiveData m17505W() {
        return this.f20606u;
    }

    /* renamed from: X */
    public final void m17504X() {
        this.f20605t.mo166p(this.f20603r);
    }

    /* renamed from: Y */
    public final boolean m17503Y() {
        return this.f20602q.m18617g();
    }

    /* renamed from: Z */
    public final View.OnClickListener m17502Z() {
        return new View.OnClickListener() { // from class: nl.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharedWithViewModel.m17501a0(SharedWithViewModel.this, view);
            }
        };
    }
}
