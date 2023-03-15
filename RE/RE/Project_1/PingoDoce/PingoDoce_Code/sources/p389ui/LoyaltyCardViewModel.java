package p389ui;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import fm.C5580d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import mg.LoyaltyCardManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13903t0;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* renamed from: ui.e */
/* loaded from: classes2.dex */
public final class LoyaltyCardViewModel extends BaseViewModel {

    /* renamed from: m */
    private final LoyaltyCardManager f28121m;

    /* renamed from: n */
    private final C1436e0 f28122n;

    /* renamed from: o */
    private final C1436e0 f28123o;

    /* renamed from: p */
    private final LiveData f28124p;

    /* renamed from: q */
    private final LiveData f28125q;

    /* renamed from: r */
    private final LiveData f28126r;

    /* renamed from: s */
    private final LiveData f28127s;

    /* renamed from: t */
    private final LiveData f28128t;

    /* renamed from: u */
    private final LiveData f28129u;

    /* renamed from: v */
    private final LiveData f28130v;

    /* renamed from: w */
    private final LiveData f28131w;

    /* renamed from: x */
    private final InterfaceC6108l f28132x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardViewModel$1", m20196f = "LoyaltyCardViewModel.kt", m20195l = {36, 39, 40}, m20194m = "invokeSuspend")
    /* renamed from: ui.e$a */
    /* loaded from: classes2.dex */
    public static final class C10901a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C5580d f28133A;

        /* renamed from: x */
        Object f28134x;

        /* renamed from: y */
        int f28135y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10901a(C5580d c5580d, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f28133A = c5580d;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10901a(this.f28133A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10901a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r6.f28135y
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r6.f28134x
                androidx.lifecycle.e0 r0 = (androidx.lifecycle.C1436e0) r0
                p468yc.C13186n.m1453b(r7)
                goto L8d
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                java.lang.Object r1 = r6.f28134x
                androidx.lifecycle.e0 r1 = (androidx.lifecycle.C1436e0) r1
                p468yc.C13186n.m1453b(r7)
                goto L72
            L2a:
                p468yc.C13186n.m1453b(r7)
                goto L40
            L2e:
                p468yc.C13186n.m1453b(r7)
                ui.e r7 = p389ui.LoyaltyCardViewModel.this
                mg.c0 r7 = p389ui.LoyaltyCardViewModel.m6778N(r7)
                r6.f28135y = r4
                java.lang.Object r7 = r7.m18928r(r6)
                if (r7 != r0) goto L40
                return r0
            L40:
                og.a r7 = (p276og.Result) r7
                boolean r1 = r7 instanceof p276og.Result.C8078c
                if (r1 == 0) goto L93
                og.a$c r7 = (p276og.Result.C8078c) r7
                java.lang.Object r7 = r7.m16962b()
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                int r7 = r7.length()
                if (r7 <= 0) goto L55
                goto L56
            L55:
                r4 = 0
            L56:
                if (r4 == 0) goto L95
                ui.e r7 = p389ui.LoyaltyCardViewModel.this
                androidx.lifecycle.e0 r7 = p389ui.LoyaltyCardViewModel.m6777O(r7)
                ui.e r1 = p389ui.LoyaltyCardViewModel.this
                mg.c0 r1 = p389ui.LoyaltyCardViewModel.m6778N(r1)
                r6.f28134x = r7
                r6.f28135y = r3
                java.lang.Object r1 = r1.m18928r(r6)
                if (r1 != r0) goto L6f
                return r0
            L6f:
                r5 = r1
                r1 = r7
                r7 = r5
            L72:
                fm.d r3 = r6.f28133A
                og.a r7 = (p276og.Result) r7
                java.lang.Object r7 = r7.m16966a()
                p181jd.Intrinsics.ifNullDoSomething(r7)
                java.lang.String r7 = (java.lang.String) r7
                r4 = 500(0x1f4, float:7.0E-43)
                r6.f28134x = r1
                r6.f28135y = r2
                java.lang.Object r7 = r3.m23708c(r7, r4, r6)
                if (r7 != r0) goto L8c
                return r0
            L8c:
                r0 = r1
            L8d:
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                r0.mo166p(r7)
                goto L95
            L93:
                boolean r7 = r7 instanceof p276og.Result.C8077b
            L95:
                yc.u r7 = p468yc.C13195u.f34156a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p389ui.LoyaltyCardViewModel.C10901a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LoyaltyCardViewModel.kt */
    /* renamed from: ui.e$b */
    /* loaded from: classes2.dex */
    public static final class C10902b {
        private C10902b() {
        }

        public /* synthetic */ C10902b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardViewModel$forceFetchCardStatus$2", m20196f = "LoyaltyCardViewModel.kt", m20195l = {70}, m20194m = "invokeSuspend")
    /* renamed from: ui.e$c */
    /* loaded from: classes2.dex */
    public static final class C10903c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f28137x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyCardViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardViewModel$forceFetchCardStatus$2$1", m20196f = "LoyaltyCardViewModel.kt", m20195l = {71}, m20194m = "invokeSuspend")
        /* renamed from: ui.e$c$a */
        /* loaded from: classes2.dex */
        public static final class C10904a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f28139x;

            /* renamed from: y */
            final /* synthetic */ LoyaltyCardViewModel f28140y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10904a(LoyaltyCardViewModel loyaltyCardViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f28140y = loyaltyCardViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C10904a(this.f28140y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C10904a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f28139x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m6778N = LoyaltyCardViewModel.m6778N(this.f28140y);
                    this.f28139x = 1;
                    obj = m6778N.m18931o(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                return C13195u.f34156a;
            }
        }

        C10903c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10903c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10903c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28137x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardViewModel loyaltyCardViewModel = LoyaltyCardViewModel.this;
                C10904a c10904a = new C10904a(loyaltyCardViewModel, null);
                this.f28137x = 1;
                if (LoyaltyCardViewModel.m6776P(loyaltyCardViewModel, true, c10904a, this) == m34636d) {
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
    /* compiled from: LoyaltyCardViewModel.kt */
    /* renamed from: ui.e$d */
    /* loaded from: classes2.dex */
    public static final class C10905d extends AbstractC6438m implements InterfaceC6108l {
        C10905d() {
            super(1);
        }

        /* renamed from: a */
        public final void m6762a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(LoyaltyCardViewModel.this, C13903t0.f35024a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m6762a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: ui.e$e */
    /* loaded from: classes2.dex */
    public static final class C10906e<I, O> implements InterfaceC7946a {
        public C10906e() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return LoyaltyCardViewModel.m6779M(LoyaltyCardViewModel.this, (LoyaltyCard) obj);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: ui.e$f */
    /* loaded from: classes2.dex */
    public static final class C10907f<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return ((LoyaltyCard) obj).m13799m();
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: ui.e$g */
    /* loaded from: classes2.dex */
    public static final class C10908g<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return ((LoyaltyCard) obj).m13798n();
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: ui.e$h */
    /* loaded from: classes2.dex */
    public static final class C10909h<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard.Type) obj) == LoyaltyCard.Type.LoyaltyCard);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: ui.e$i */
    /* loaded from: classes2.dex */
    public static final class C10910i<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard.Type) obj) == LoyaltyCard.Type.PoupaMais);
        }
    }

    static {
        new C10902b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyCardViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C5580d c5580d, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c5580d, "zxingHelper");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        this.f28121m = loyaltyCardManager;
        new C1436e0();
        C1436e0 m37003d = c1459l0.m37003d("_invitesVisibility", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…nvitesVisibility\", false)");
        this.f28122n = m37003d;
        C1436e0 c1436e0 = new C1436e0();
        this.f28123o = c1436e0;
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C10901a(c5580d, null), 3, null);
        LiveData m106t = m106t(loyaltyCardManager.m18930p());
        this.f28124p = m106t;
        LiveData m36993a = C1465n0.m36993a(m106t, new C10906e());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f28125q = m36993a;
        LiveData m36993a2 = C1465n0.m36993a(m106t, new C10907f());
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f28126r = m36993a2;
        this.f28127s = m37003d;
        this.f28128t = c1436e0;
        LiveData m36993a3 = C1465n0.m36993a(m106t, new C10908g());
        Intrinsics.checkIfNull(m36993a3, "Transformations.map(this) { transform(it) }");
        this.f28129u = m36993a3;
        LiveData m36993a4 = C1465n0.m36993a(m36993a3, new C10909h());
        Intrinsics.checkIfNull(m36993a4, "Transformations.map(this) { transform(it) }");
        this.f28130v = m36993a4;
        LiveData m36993a5 = C1465n0.m36993a(m36993a3, new C10910i());
        Intrinsics.checkIfNull(m36993a5, "Transformations.map(this) { transform(it) }");
        this.f28131w = m36993a5;
        this.f28132x = BaseViewModel.m113I(this, 0L, new C10905d(), 1, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m6780L(LoyaltyCardViewModel loyaltyCardViewModel, View view) {
        m6766Z(loyaltyCardViewModel, view);
    }

    /* renamed from: M */
    public static final /* synthetic */ BitmapDrawable m6779M(LoyaltyCardViewModel loyaltyCardViewModel, LoyaltyCard loyaltyCard) {
        return loyaltyCardViewModel.m6775Q(loyaltyCard);
    }

    /* renamed from: N */
    public static final /* synthetic */ LoyaltyCardManager m6778N(LoyaltyCardViewModel loyaltyCardViewModel) {
        return loyaltyCardViewModel.f28121m;
    }

    /* renamed from: O */
    public static final /* synthetic */ C1436e0 m6777O(LoyaltyCardViewModel loyaltyCardViewModel) {
        return loyaltyCardViewModel.f28123o;
    }

    /* renamed from: P */
    public static final /* synthetic */ Object m6776P(LoyaltyCardViewModel loyaltyCardViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return loyaltyCardViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: Q */
    private final BitmapDrawable m6775Q(LoyaltyCard loyaltyCard) {
        return new BitmapDrawable(m20390g().m6899a().getResources(), loyaltyCard.m13809a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m6766Z(LoyaltyCardViewModel loyaltyCardViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyCardViewModel, "this$0");
        loyaltyCardViewModel.f28132x.mo9587d(C13195u.f34156a);
    }

    /* renamed from: R */
    public final Object m6774R(InterfaceC1886d interfaceC1886d) {
        InterfaceC10574t1 m20158d;
        Object m34636d;
        m20158d = C6772d.m20158d(C1473p0.m36987a(this), null, null, new C10903c(null), 3, null);
        m34636d = C2116d.m34636d();
        return m20158d == m34636d ? m20158d : C13195u.f34156a;
    }

    /* renamed from: S */
    public final LiveData m6773S() {
        return this.f28130v;
    }

    /* renamed from: T */
    public final LiveData m6772T() {
        return this.f28131w;
    }

    /* renamed from: U */
    public final LiveData m6771U() {
        return this.f28125q;
    }

    /* renamed from: V */
    public final LiveData m6770V() {
        return this.f28126r;
    }

    /* renamed from: W */
    public final LiveData m6769W() {
        return this.f28127s;
    }

    /* renamed from: X */
    public final LiveData m6768X() {
        return this.f28128t;
    }

    /* renamed from: Y */
    public final View.OnClickListener m6767Y() {
        return new View.OnClickListener() { // from class: ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyCardViewModel.m6766Z(LoyaltyCardViewModel.this, view);
            }
        };
    }
}
