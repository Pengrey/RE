package pt.pingodoce.app.presentation.home;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import dj.ProductListViewModel;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import id.InterfaceC6114r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.BannerManager;
import mg.C7256f1;
import mg.C7310l;
import mg.C7405s1;
import mg.ClubManager;
import mg.CoachMarkManager;
import mg.LoyaltyCardManager;
import mg.StoreManager;
import module.network.data.remote.models.user.User;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13777q;
import p494zh.BaseViewModel;
import p494zh.C13806a;
import p494zh.C13858k2;
import p494zh.C13871l2;
import p494zh.C13890q;
import p494zh.C13899s0;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.data.remote.models.response.Benefit;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.home.HomeViewModel;
import td.C10549n2;
import td.C10587w0;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.home.a */
/* loaded from: classes2.dex */
public final class HomeViewModel extends ProductListViewModel {

    /* renamed from: I */
    private final LoyaltyCardManager f24181I;

    /* renamed from: J */
    private final StoreManager f24182J;

    /* renamed from: K */
    private final BannerManager f24183K;

    /* renamed from: L */
    private final C7310l f24184L;

    /* renamed from: M */
    private final ClubManager f24185M;

    /* renamed from: N */
    private final CoachMarkManager f24186N;

    /* renamed from: O */
    private final C7405s1 f24187O;

    /* renamed from: P */
    private final C1436e0 f24188P;

    /* renamed from: Q */
    private final LiveData f24189Q;

    /* renamed from: R */
    private final InterfaceC6108l f24190R;

    /* renamed from: S */
    private final InterfaceC6108l f24191S;

    /* renamed from: T */
    private final InterfaceC6108l f24192T;

    /* renamed from: U */
    private final InterfaceC6108l f24193U;

    /* renamed from: V */
    private boolean f24194V;

    /* renamed from: W */
    private final LiveData f24195W;

    /* renamed from: X */
    private final LiveData f24196X;

    /* renamed from: Y */
    private final LiveData f24197Y;

    /* renamed from: Z */
    private final LiveData f24198Z;

    /* renamed from: a0 */
    private final LiveData f24199a0;

    /* renamed from: b0 */
    private final LiveData f24200b0;

    /* renamed from: c0 */
    private final LiveData f24201c0;

    /* renamed from: d0 */
    private final InterfaceC6785c f24202d0;

    /* renamed from: e0 */
    private final LiveData f24203e0;

    /* renamed from: f0 */
    private final LiveData f24204f0;

    /* renamed from: g0 */
    private final LiveData f24205g0;

    /* renamed from: h0 */
    private final LiveData f24206h0;

    /* renamed from: i0 */
    private final LiveData f24207i0;

    /* renamed from: j0 */
    private final LiveData f24208j0;

    /* renamed from: k0 */
    private final LiveData f24209k0;

    /* renamed from: l0 */
    private final LiveData f24210l0;

    /* renamed from: m0 */
    private final LiveData f24211m0;

    /* renamed from: n0 */
    private final LiveData f24212n0;

    /* renamed from: o0 */
    private final LiveData f24213o0;

    /* renamed from: p0 */
    private final LiveData f24214p0;

    /* renamed from: q0 */
    private final LiveData f24215q0;

    /* renamed from: r0 */
    private final LiveData f24216r0;

    /* renamed from: s0 */
    private final LiveData f24217s0;

    /* renamed from: t0 */
    private final InterfaceC6108l f24218t0;

    /* compiled from: HomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC9179a {
        DEFAULT_STORE,
        BENEFITS,
        LOYALTY,
        NONE
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$a0 */
    /* loaded from: classes2.dex */
    public static final class C9180a0<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(!((List) obj).isEmpty());
        }
    }

    /* compiled from: HomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$b */
    /* loaded from: classes2.dex */
    public enum EnumC9181b {
        FETCHING,
        VALID
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$b0 */
    /* loaded from: classes2.dex */
    public static final class C9182b0 implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24219w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.home.a$b0$a */
        /* loaded from: classes2.dex */
        public static final class C9183a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24220w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$special$$inlined$map$9$2", m20196f = "HomeViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.home.a$b0$a$a */
            /* loaded from: classes2.dex */
            public static final class C9184a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24221w;

                /* renamed from: x */
                int f24222x;

                public C9184a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24221w = obj;
                    this.f24222x |= Integer.MIN_VALUE;
                    return C9183a.this.mo4529a(null, this);
                }
            }

            public C9183a(InterfaceC6787d interfaceC6787d) {
                this.f24220w = interfaceC6787d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.home.HomeViewModel.C9182b0.C9183a.C9184a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.home.a$b0$a$a r0 = (pt.pingodoce.app.presentation.home.HomeViewModel.C9182b0.C9183a.C9184a) r0
                    int r1 = r0.f24222x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24222x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.home.a$b0$a$a r0 = new pt.pingodoce.app.presentation.home.a$b0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f24221w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f24222x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f24220w
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Object r5 = p489zc.C13777q.m254N(r5)
                    r0.f24222x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeViewModel.C9182b0.C9183a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9182b0(InterfaceC6785c interfaceC6785c) {
            this.f24219w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24219w.mo20086d(new C9183a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$c */
    /* loaded from: classes2.dex */
    public static final class C9185c extends AbstractC6438m implements InterfaceC6108l {
        C9185c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12110a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(HomeViewModel.this, C13806a.f34914a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12110a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$c0 */
    /* loaded from: classes2.dex */
    public static final class C9186c0 extends AbstractC6438m implements InterfaceC6108l {
        C9186c0() {
            super(1);
        }

        /* renamed from: a */
        public final void m12109a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(HomeViewModel.this, C13858k2.f34966a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12109a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$d */
    /* loaded from: classes2.dex */
    public static final class C9187d extends AbstractC6438m implements InterfaceC6108l {
        C9187d() {
            super(1);
        }

        /* renamed from: a */
        public final void m12108a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(HomeViewModel.this, C13890q.f35011a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12108a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$d0 */
    /* loaded from: classes2.dex */
    public static final class C9188d0 extends AbstractC6438m implements InterfaceC6108l {
        C9188d0() {
            super(1);
        }

        /* renamed from: a */
        public final void m12107a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(HomeViewModel.this, C13871l2.f34988a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12107a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$coachMarksFlow$1", m20196f = "HomeViewModel.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.a$e */
    /* loaded from: classes2.dex */
    public static final class C9189e extends AbstractC6764l implements InterfaceC6114r {

        /* renamed from: A */
        /* synthetic */ boolean f24228A;

        /* renamed from: x */
        int f24229x;

        /* renamed from: y */
        /* synthetic */ Object f24230y;

        /* renamed from: z */
        /* synthetic */ boolean f24231z;

        C9189e(InterfaceC1886d interfaceC1886d) {
            super(4, interfaceC1886d);
        }

        /* renamed from: a0 */
        public /* bridge */ /* synthetic */ Object mo22157a0(Object obj, Object obj2, Object obj3, Object obj4) {
            return m12105d((Store) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (InterfaceC1886d) obj4);
        }

        /* renamed from: d */
        public final Object m12105d(Store store, boolean z, boolean z2, InterfaceC1886d interfaceC1886d) {
            C9189e c9189e = new C9189e(interfaceC1886d);
            c9189e.f24230y = store;
            c9189e.f24231z = z;
            c9189e.f24228A = z2;
            return c9189e.invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24229x == 0) {
                C13186n.m1453b(obj);
                Store store = (Store) this.f24230y;
                boolean z = this.f24231z;
                boolean z2 = this.f24228A;
                if ((store != null ? store.m13711f() : -1) == -1) {
                    return EnumC9179a.DEFAULT_STORE;
                }
                if (z) {
                    return EnumC9179a.BENEFITS;
                }
                if (z2) {
                    return EnumC9179a.LOYALTY;
                }
                return EnumC9179a.NONE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$welcomeMessage$1", m20196f = "HomeViewModel.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.a$e0 */
    /* loaded from: classes2.dex */
    public static final class C9190e0 extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ ResourcesProvider f24232A;

        /* renamed from: x */
        int f24233x;

        /* renamed from: y */
        /* synthetic */ boolean f24234y;

        /* renamed from: z */
        /* synthetic */ Object f24235z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9190e0(ResourcesProvider resourcesProvider, InterfaceC1886d interfaceC1886d) {
            super(3, interfaceC1886d);
            this.f24232A = resourcesProvider;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m12104d(((Boolean) obj).booleanValue(), (User) obj2, (InterfaceC1886d) obj3);
        }

        /* renamed from: d */
        public final Object m12104d(boolean z, User user, InterfaceC1886d interfaceC1886d) {
            C9190e0 c9190e0 = new C9190e0(this.f24232A, interfaceC1886d);
            c9190e0.f24234y = z;
            c9190e0.f24235z = user;
            return c9190e0.invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24233x == 0) {
                C13186n.m1453b(obj);
                boolean z = this.f24234y;
                User user = (User) this.f24235z;
                if (z) {
                    String string = this.f24232A.m6899a().getString(C2336R.string.lbl_welcome_message_guest);
                    Intrinsics.checkIfNull(string, "ctx.getString(id)");
                    return string;
                }
                String string2 = this.f24232A.m6899a().getString(C2336R.string.lbl_welcome_message, Arrays.copyOf(new Object[]{user.m18184i()}, 1));
                Intrinsics.checkIfNull(string2, "ctx.getString(id, *formatArgs)");
                return string2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$deleteBanner$1", m20196f = "HomeViewModel.kt", m20195l = {192}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.a$f */
    /* loaded from: classes2.dex */
    public static final class C9191f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24236x;

        /* renamed from: z */
        final /* synthetic */ int f24238z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9191f(int i, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24238z = i;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9191f(this.f24238z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9191f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24236x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BannerManager m12168B0 = HomeViewModel.m12168B0(HomeViewModel.this);
                int i2 = this.f24238z;
                this.f24236x = 1;
                if (m12168B0.m18796e(i2, this) == m34636d) {
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
    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel", m20196f = "HomeViewModel.kt", m20195l = {188}, m20194m = "getDefaultStore")
    /* renamed from: pt.pingodoce.app.presentation.home.a$g */
    /* loaded from: classes2.dex */
    public static final class C9192g extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f24239w;

        /* renamed from: y */
        int f24241y;

        C9192g(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f24239w = obj;
            this.f24241y |= Integer.MIN_VALUE;
            return HomeViewModel.this.m12150S0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel", m20196f = "HomeViewModel.kt", m20195l = {182}, m20194m = "getLoyaltyCardStatus")
    /* renamed from: pt.pingodoce.app.presentation.home.a$h */
    /* loaded from: classes2.dex */
    public static final class C9193h extends AbstractC6757d {

        /* renamed from: w */
        Object f24242w;

        /* renamed from: x */
        /* synthetic */ Object f24243x;

        /* renamed from: z */
        int f24245z;

        C9193h(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f24243x = obj;
            this.f24245z |= Integer.MIN_VALUE;
            return HomeViewModel.this.m12139d1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$i */
    /* loaded from: classes2.dex */
    public static final class C9194i extends AbstractC6438m implements InterfaceC6108l {
        C9194i() {
            super(1);
        }

        /* renamed from: a */
        public final void m12102a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(HomeViewModel.this, C13899s0.f35020a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12102a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel", m20196f = "HomeViewModel.kt", m20195l = {244}, m20194m = "navigateToLoyaltyActivity")
    /* renamed from: pt.pingodoce.app.presentation.home.a$j */
    /* loaded from: classes2.dex */
    public static final class C9195j extends AbstractC6757d {

        /* renamed from: w */
        Object f24247w;

        /* renamed from: x */
        /* synthetic */ Object f24248x;

        /* renamed from: z */
        int f24250z;

        C9195j(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f24248x = obj;
            this.f24250z |= Integer.MIN_VALUE;
            return HomeViewModel.this.m12123s1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$onPullToRefresh$1", m20196f = "HomeViewModel.kt", m20195l = {68}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.a$k */
    /* loaded from: classes2.dex */
    public static final class C9196k extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24251x;

        C9196k(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9196k(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9196k) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24251x;
            if (i == 0) {
                C13186n.m1453b(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                this.f24251x = 1;
                if (HomeViewModel.m12160J0(homeViewModel, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            HomeViewModel.m12163G0(HomeViewModel.this).mo169m(C6755b.m20201a(false));
            return C13195u.f34156a;
        }
    }

    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$onTryAgainInNoConnectionScreen$1", m20196f = "HomeViewModel.kt", m20195l = {227}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.a$l */
    /* loaded from: classes2.dex */
    static final class C9197l extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24253x;

        C9197l(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9197l(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9197l) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24253x;
            if (i == 0) {
                C13186n.m1453b(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                this.f24253x = 1;
                if (HomeViewModel.m12160J0(homeViewModel, this) == m34636d) {
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
    /* compiled from: HomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$refreshAllScreenData$2", m20196f = "HomeViewModel.kt", m20195l = {209, 217, 218, 219, 221}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.home.a$m */
    /* loaded from: classes2.dex */
    public static final class C9198m extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        private /* synthetic */ Object f24255A;

        /* renamed from: x */
        Object f24257x;

        /* renamed from: y */
        Object f24258y;

        /* renamed from: z */
        int f24259z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$refreshAllScreenData$2$jobFetchBanner$1", m20196f = "HomeViewModel.kt", m20195l = {212}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.home.a$m$a */
        /* loaded from: classes2.dex */
        public static final class C9199a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24260x;

            /* renamed from: y */
            final /* synthetic */ HomeViewModel f24261y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9199a(HomeViewModel homeViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24261y = homeViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9199a(this.f24261y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9199a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24260x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    BannerManager m12168B0 = HomeViewModel.m12168B0(this.f24261y);
                    this.f24260x = 1;
                    if (m12168B0.m18795f(this) == m34636d) {
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
        /* compiled from: HomeViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$refreshAllScreenData$2$jobFetchCardStatus$1", m20196f = "HomeViewModel.kt", m20195l = {215}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.home.a$m$b */
        /* loaded from: classes2.dex */
        public static final class C9200b extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24262x;

            /* renamed from: y */
            final /* synthetic */ HomeViewModel f24263y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9200b(HomeViewModel homeViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24263y = homeViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9200b(this.f24263y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9200b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24262x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m12165E0 = HomeViewModel.m12165E0(this.f24263y);
                    this.f24262x = 1;
                    if (m12165E0.m18931o(this) == m34636d) {
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
        /* compiled from: HomeViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$refreshAllScreenData$2$jobFetchFlyers$1", m20196f = "HomeViewModel.kt", m20195l = {210}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.home.a$m$c */
        /* loaded from: classes2.dex */
        public static final class C9201c extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24264x;

            /* renamed from: y */
            final /* synthetic */ HomeViewModel f24265y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9201c(HomeViewModel homeViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24265y = homeViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9201c(this.f24265y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9201c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24264x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m12167C0 = HomeViewModel.m12167C0(this.f24265y);
                    this.f24264x = 1;
                    if (C7310l.m18728o(m12167C0, null, this, 1, null) == m34636d) {
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
        /* compiled from: HomeViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$refreshAllScreenData$2$jobFetchProducts$1", m20196f = "HomeViewModel.kt", m20195l = {213}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.home.a$m$d */
        /* loaded from: classes2.dex */
        public static final class C9202d extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24266x;

            /* renamed from: y */
            final /* synthetic */ HomeViewModel f24267y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9202d(HomeViewModel homeViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24267y = homeViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9202d(this.f24267y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9202d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24266x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m12167C0 = HomeViewModel.m12167C0(this.f24267y);
                    this.f24266x = 1;
                    if (m12167C0.m18731l(1, 10, this) == m34636d) {
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

        C9198m(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C9198m c9198m = new C9198m(interfaceC1886d);
            c9198m.f24255A = obj;
            return c9198m;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9198m) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00d6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f2 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeViewModel.C9198m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$n */
    /* loaded from: classes2.dex */
    public static final class C9203n<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard) obj).m13798n() == LoyaltyCard.Type.PoupaMais);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$o */
    /* loaded from: classes2.dex */
    public static final class C9204o<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return (Benefit) C13777q.m254N(((LoyaltyCard) obj).m13804f());
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$p */
    /* loaded from: classes2.dex */
    public static final class C9205p<I, O> implements InterfaceC7946a {
        public C9205p() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return HomeViewModel.m12162H0(HomeViewModel.this, (LoyaltyCard) obj);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$q */
    /* loaded from: classes2.dex */
    public static final class C9206q<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            String m13936d;
            Benefit benefit = (Benefit) obj;
            return (benefit == null || (m13936d = benefit.m13936d()) == null) ? BuildConfig.VERSION_NAME : m13936d;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$r */
    /* loaded from: classes2.dex */
    public static final class C9207r<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            List m13804f = ((LoyaltyCard) obj).m13804f();
            boolean z = false;
            if (!(m13804f instanceof Collection) || !m13804f.isEmpty()) {
                Iterator it = m13804f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Benefit) it.next()).m13925t()) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$s */
    /* loaded from: classes2.dex */
    public static final class C9208s<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(!((LoyaltyCard) obj).m13804f().isEmpty());
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$t */
    /* loaded from: classes2.dex */
    public static final class C9209t<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard) obj).m13814P());
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$u */
    /* loaded from: classes2.dex */
    public static final class C9210u<I, O> implements InterfaceC7946a {

        /* renamed from: a */
        final /* synthetic */ ResourcesProvider f24269a;

        public C9210u(ResourcesProvider resourcesProvider) {
            this.f24269a = resourcesProvider;
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            String m13710h;
            Store store = (Store) obj;
            if (store == null || (m13710h = store.m13710h()) == null) {
                String string = this.f24269a.m6899a().getString(C2336R.string.lbl_store_default_name);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                return string;
            }
            return m13710h;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$v */
    /* loaded from: classes2.dex */
    public static final class C9211v<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            if (((Store) obj) != null) {
                return EnumC9181b.VALID;
            }
            return EnumC9181b.FETCHING;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$w */
    /* loaded from: classes2.dex */
    public static final class C9212w implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24270w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.home.a$w$a */
        /* loaded from: classes2.dex */
        public static final class C9213a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24271w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$special$$inlined$map$4$2", m20196f = "HomeViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.home.a$w$a$a */
            /* loaded from: classes2.dex */
            public static final class C9214a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24272w;

                /* renamed from: x */
                int f24273x;

                public C9214a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24272w = obj;
                    this.f24273x |= Integer.MIN_VALUE;
                    return C9213a.this.mo4529a(null, this);
                }
            }

            public C9213a(InterfaceC6787d interfaceC6787d) {
                this.f24271w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.home.HomeViewModel.C9212w.C9213a.C9214a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.home.a$w$a$a r0 = (pt.pingodoce.app.presentation.home.HomeViewModel.C9212w.C9213a.C9214a) r0
                    int r1 = r0.f24273x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24273x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.home.a$w$a$a r0 = new pt.pingodoce.app.presentation.home.a$w$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f24272w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f24273x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f24271w
                    java.util.List r5 = (java.util.List) r5
                    boolean r5 = r5.isEmpty()
                    r5 = r5 ^ r3
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
                    r0.f24273x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeViewModel.C9212w.C9213a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9212w(InterfaceC6785c interfaceC6785c) {
            this.f24270w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24270w.mo20086d(new C9213a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$x */
    /* loaded from: classes2.dex */
    public static final class C9215x implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24275w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.home.a$x$a */
        /* loaded from: classes2.dex */
        public static final class C9216a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24276w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$special$$inlined$map$5$2", m20196f = "HomeViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.home.a$x$a$a */
            /* loaded from: classes2.dex */
            public static final class C9217a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24277w;

                /* renamed from: x */
                int f24278x;

                public C9217a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24277w = obj;
                    this.f24278x |= Integer.MIN_VALUE;
                    return C9216a.this.mo4529a(null, this);
                }
            }

            public C9216a(InterfaceC6787d interfaceC6787d) {
                this.f24276w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.home.HomeViewModel.C9215x.C9216a.C9217a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.home.a$x$a$a r0 = (pt.pingodoce.app.presentation.home.HomeViewModel.C9215x.C9216a.C9217a) r0
                    int r1 = r0.f24278x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24278x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.home.a$x$a$a r0 = new pt.pingodoce.app.presentation.home.a$x$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f24277w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f24278x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f24276w
                    java.util.List r5 = (java.util.List) r5
                    java.util.List r5 = p489zc.C13777q.m221p0(r5)
                    r0.f24278x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeViewModel.C9215x.C9216a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9215x(InterfaceC6785c interfaceC6785c) {
            this.f24275w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24275w.mo20086d(new C9216a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$y */
    /* loaded from: classes2.dex */
    public static final class C9218y implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f24280w;

        /* renamed from: x */
        final /* synthetic */ HomeViewModel f24281x;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.home.a$y$a */
        /* loaded from: classes2.dex */
        public static final class C9219a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f24282w;

            /* renamed from: x */
            final /* synthetic */ HomeViewModel f24283x;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeViewModel$special$$inlined$map$6$2", m20196f = "HomeViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.home.a$y$a$a */
            /* loaded from: classes2.dex */
            public static final class C9220a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f24284w;

                /* renamed from: x */
                int f24285x;

                public C9220a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24284w = obj;
                    this.f24285x |= Integer.MIN_VALUE;
                    return C9219a.this.mo4529a(null, this);
                }
            }

            public C9219a(InterfaceC6787d interfaceC6787d, HomeViewModel homeViewModel) {
                this.f24282w = interfaceC6787d;
                this.f24283x = homeViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.home.HomeViewModel.C9218y.C9219a.C9220a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.home.a$y$a$a r0 = (pt.pingodoce.app.presentation.home.HomeViewModel.C9218y.C9219a.C9220a) r0
                    int r1 = r0.f24285x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24285x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.home.a$y$a$a r0 = new pt.pingodoce.app.presentation.home.a$y$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f24284w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f24285x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f24282w
                    java.util.List r5 = (java.util.List) r5
                    pt.pingodoce.app.presentation.home.a r2 = r4.f24283x
                    pt.pingodoce.app.presentation.home.HomeViewModel.m12161I0(r2, r5)
                    r0.f24285x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeViewModel.C9218y.C9219a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9218y(InterfaceC6785c interfaceC6785c, HomeViewModel homeViewModel) {
            this.f24280w = interfaceC6785c;
            this.f24281x = homeViewModel;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f24280w.mo20086d(new C9219a(interfaceC6787d, this.f24281x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.a$z */
    /* loaded from: classes2.dex */
    public static final class C9221z<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(!((List) obj).isEmpty());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, LoyaltyCardManager loyaltyCardManager, StoreManager storeManager, BannerManager bannerManager, C7310l c7310l, ClubManager clubManager, CoachMarkManager coachMarkManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider, c7256f1, c7310l);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        Intrinsics.isThisObjectNull(bannerManager, "bannerManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        Intrinsics.isThisObjectNull(clubManager, "clubsManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f24181I = loyaltyCardManager;
        this.f24182J = storeManager;
        this.f24183K = bannerManager;
        this.f24184L = c7310l;
        this.f24185M = clubManager;
        this.f24186N = coachMarkManager;
        this.f24187O = c7405s1;
        Boolean bool = Boolean.FALSE;
        C1436e0 c1436e0 = new C1436e0(bool);
        this.f24188P = c1436e0;
        this.f24189Q = c1436e0;
        this.f24190R = BaseViewModel.m113I(this, 0L, new C9194i(), 1, null);
        this.f24191S = BaseViewModel.m113I(this, 0L, new C9187d(), 1, null);
        this.f24192T = BaseViewModel.m113I(this, 0L, new C9188d0(), 1, null);
        this.f24193U = BaseViewModel.m113I(this, 0L, new C9186c0(), 1, null);
        this.f24195W = m106t(c7405s1.m18497m());
        this.f24196X = m106t(c7405s1.m18494p());
        LiveData m106t = m106t(loyaltyCardManager.m18930p());
        this.f24197Y = m106t;
        LiveData m36993a = C1465n0.m36993a(m106t, new C9209t());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f24198Z = m36993a;
        LiveData m106t2 = m106t(storeManager.m18757j());
        this.f24199a0 = m106t2;
        LiveData m36993a2 = C1465n0.m36993a(m106t2, new C9210u(resourcesProvider));
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f24200b0 = m36993a2;
        LiveData m36993a3 = C1465n0.m36993a(m106t2, new C9211v());
        Intrinsics.checkIfNull(m36993a3, "Transformations.map(this) { transform(it) }");
        this.f24201c0 = m36993a3;
        InterfaceC6785c m18794g = bannerManager.m18794g();
        this.f24202d0 = m18794g;
        this.f24203e0 = m106t(new C9212w(m18794g));
        this.f24204f0 = new C1436e0(bool);
        this.f24205g0 = m106t(new C9218y(new C9215x(c7310l.m18723t(1, 10)), this));
        LiveData m36993a4 = C1465n0.m36993a(m12132k0(), new C9221z());
        Intrinsics.checkIfNull(m36993a4, "Transformations.map(this) { transform(it) }");
        this.f24206h0 = m36993a4;
        LiveData m106t3 = m106t(C7310l.m18724s(c7310l, null, 1, null));
        this.f24207i0 = m106t3;
        LiveData m36993a5 = C1465n0.m36993a(m106t3, new C9180a0());
        Intrinsics.checkIfNull(m36993a5, "Transformations.map(this) { transform(it) }");
        this.f24208j0 = m36993a5;
        this.f24209k0 = new C1436e0(bool);
        this.f24210l0 = m106t(new C9182b0(m18794g));
        LiveData m36993a6 = C1465n0.m36993a(m106t, new C9203n());
        Intrinsics.checkIfNull(m36993a6, "Transformations.map(this) { transform(it) }");
        this.f24211m0 = m36993a6;
        LiveData m36993a7 = C1465n0.m36993a(m106t, new C9204o());
        Intrinsics.checkIfNull(m36993a7, "Transformations.map(this) { transform(it) }");
        this.f24212n0 = m36993a7;
        LiveData m36993a8 = C1465n0.m36993a(m106t, new C9205p());
        Intrinsics.checkIfNull(m36993a8, "Transformations.map(this) { transform(it) }");
        this.f24213o0 = m36993a8;
        LiveData m36993a9 = C1465n0.m36993a(m36993a7, new C9206q());
        Intrinsics.checkIfNull(m36993a9, "Transformations.map(this) { transform(it) }");
        this.f24214p0 = m36993a9;
        LiveData m36993a10 = C1465n0.m36993a(m106t, new C9207r());
        Intrinsics.checkIfNull(m36993a10, "Transformations.map(this) { transform(it) }");
        this.f24215q0 = m36993a10;
        LiveData m36993a11 = C1465n0.m36993a(m106t, new C9208s());
        Intrinsics.checkIfNull(m36993a11, "Transformations.map(this) { transform(it) }");
        this.f24216r0 = m36993a11;
        this.f24217s0 = m106t(C6788e.m20127u(c7405s1.m18497m(), c7405s1.m18500j(), new C9190e0(resourcesProvider, null)));
        this.f24218t0 = BaseViewModel.m113I(this, 0L, new C9185c(), 1, null);
    }

    /* renamed from: A0 */
    public static /* synthetic */ void m12170A0(HomeViewModel homeViewModel, View view) {
        m12158L0(homeViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m12169A1(HomeViewModel homeViewModel, View view) {
        Intrinsics.isThisObjectNull(homeViewModel, "this$0");
        homeViewModel.f24192T.mo9587d(C13195u.f34156a);
    }

    /* renamed from: B0 */
    public static final /* synthetic */ BannerManager m12168B0(HomeViewModel homeViewModel) {
        return homeViewModel.f24183K;
    }

    /* renamed from: C0 */
    public static final /* synthetic */ C7310l m12167C0(HomeViewModel homeViewModel) {
        return homeViewModel.f24184L;
    }

    /* renamed from: D0 */
    public static final /* synthetic */ ClubManager m12166D0(HomeViewModel homeViewModel) {
        return homeViewModel.f24185M;
    }

    /* renamed from: E0 */
    public static final /* synthetic */ LoyaltyCardManager m12165E0(HomeViewModel homeViewModel) {
        return homeViewModel.f24181I;
    }

    /* renamed from: F0 */
    public static final /* synthetic */ C7405s1 m12164F0(HomeViewModel homeViewModel) {
        return homeViewModel.f24187O;
    }

    /* renamed from: G0 */
    public static final /* synthetic */ C1436e0 m12163G0(HomeViewModel homeViewModel) {
        return homeViewModel.f24188P;
    }

    /* renamed from: H0 */
    public static final /* synthetic */ String m12162H0(HomeViewModel homeViewModel, LoyaltyCard loyaltyCard) {
        return homeViewModel.m12128n1(loyaltyCard);
    }

    /* renamed from: I0 */
    public static final /* synthetic */ void m12161I0(HomeViewModel homeViewModel, List list) {
        homeViewModel.m12124r1(list);
    }

    /* renamed from: J0 */
    public static final /* synthetic */ Object m12160J0(HomeViewModel homeViewModel, InterfaceC1886d interfaceC1886d) {
        return homeViewModel.m12121u1(interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m12158L0(HomeViewModel homeViewModel, View view) {
        Intrinsics.isThisObjectNull(homeViewModel, "this$0");
        homeViewModel.f24218t0.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m12155N0(HomeViewModel homeViewModel, View view) {
        Intrinsics.isThisObjectNull(homeViewModel, "this$0");
        homeViewModel.f24191S.mo9587d(C13195u.f34156a);
    }

    /* renamed from: n1 */
    private final String m12128n1(LoyaltyCard loyaltyCard) {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String quantityString = m20390g().m6899a().getResources().getQuantityString(C2336R.plurals.lbl_active_benefits_amount, loyaltyCard.m13805e(), Arrays.copyOf(new Object[]{Integer.valueOf(loyaltyCard.m13805e())}, 1));
        Intrinsics.checkIfNull(quantityString, "ctx.resources.getQuantit…d, quantity, *formatArgs)");
        String format = String.format(quantityString, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m12125q1(HomeViewModel homeViewModel, View view) {
        Intrinsics.isThisObjectNull(homeViewModel, "this$0");
        Object mo172f = homeViewModel.f24195W.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        if (((Boolean) mo172f).booleanValue()) {
            homeViewModel.m115G();
        } else {
            homeViewModel.f24190R.mo9587d(C13195u.f34156a);
        }
    }

    /* renamed from: r1 */
    private final void m12124r1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CatalogProduct catalogProduct = (CatalogProduct) it.next();
            catalogProduct.m14521X(0);
            ShoppingListProduct m22607V = m22607V(catalogProduct.m14499y());
            if (m22607V != null) {
                catalogProduct.m14521X(m22607V.m14332j() ? catalogProduct.m14538G() : m22607V.m14327s());
            }
        }
    }

    /* renamed from: u1 */
    private final Object m12121u1(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m20164g = C6769b.m20164g(C10587w0.m7620b().mo4545f0(C10549n2.m7695b(null, 1, null)), new C9198m(null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20164g == m34636d ? m20164g : C13195u.f34156a;
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m12119w0(HomeViewModel homeViewModel, View view) {
        m12114y1(homeViewModel, view);
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m12117x0(HomeViewModel homeViewModel, View view) {
        m12155N0(homeViewModel, view);
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m12115y0(HomeViewModel homeViewModel, View view) {
        m12169A1(homeViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m12114y1(HomeViewModel homeViewModel, View view) {
        Intrinsics.isThisObjectNull(homeViewModel, "this$0");
        homeViewModel.f24193U.mo9587d(C13195u.f34156a);
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m12113z0(HomeViewModel homeViewModel, View view) {
        m12125q1(homeViewModel, view);
    }

    /* renamed from: K0 */
    public final View.OnClickListener m12159K0() {
        return new View.OnClickListener() { // from class: uj.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeViewModel.m12158L0(HomeViewModel.this, view);
            }
        };
    }

    /* renamed from: M0 */
    public final View.OnClickListener m12157M0() {
        return new View.OnClickListener() { // from class: uj.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeViewModel.m12155N0(HomeViewModel.this, view);
            }
        };
    }

    /* renamed from: N */
    protected void m12156N() {
        C6772d.m20158d(C1473p0.m36987a(this), C10549n2.m7695b(null, 1, null), null, new C9197l(null), 2, null);
    }

    /* renamed from: O0 */
    public final InterfaceC6785c m12154O0() {
        return C6788e.m20142f(this.f24182J.m18757j(), this.f24186N.m18611m(), this.f24186N.m18610n(), new C9189e(null));
    }

    /* renamed from: P0 */
    public final void m12153P0(int i) {
        C6772d.m20158d(C1473p0.m36987a(this), C10587w0.m7620b(), null, new C9191f(i, null), 2, null);
    }

    /* renamed from: Q0 */
    public final InterfaceC6785c m12152Q0() {
        return this.f24202d0;
    }

    /* renamed from: R0 */
    public final LiveData m12151R0() {
        return this.f24211m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m12150S0(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof pt.pingodoce.app.presentation.home.HomeViewModel.C9192g
            if (r0 == 0) goto L13
            r0 = r5
            pt.pingodoce.app.presentation.home.a$g r0 = (pt.pingodoce.app.presentation.home.HomeViewModel.C9192g) r0
            int r1 = r0.f24241y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24241y = r1
            goto L18
        L13:
            pt.pingodoce.app.presentation.home.a$g r0 = new pt.pingodoce.app.presentation.home.a$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f24239w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f24241y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            mg.j1 r5 = r4.f24182J
            r0.f24241y = r3
            java.lang.Object r5 = r5.m18760g(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            og.a r5 = (p276og.Result) r5
            java.lang.Object r5 = r5.m16966a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeViewModel.m12150S0(bd.d):java.lang.Object");
    }

    /* renamed from: T0 */
    public final LiveData m12149T0() {
        return this.f24210l0;
    }

    /* renamed from: U0 */
    public final LiveData m12148U0() {
        return this.f24207i0;
    }

    /* renamed from: V0 */
    public final LiveData m12147V0() {
        return this.f24195W;
    }

    /* renamed from: W0 */
    public final LiveData m12146W0() {
        return this.f24216r0;
    }

    /* renamed from: X0 */
    public final LiveData m12145X0() {
        return this.f24196X;
    }

    /* renamed from: Y0 */
    public final LiveData m12144Y0() {
        return this.f24215q0;
    }

    /* renamed from: Z0 */
    public final LiveData m12143Z0() {
        return this.f24213o0;
    }

    /* renamed from: a1 */
    public final LiveData m12142a1() {
        return this.f24212n0;
    }

    /* renamed from: b1 */
    public final LiveData m12141b1() {
        return this.f24214p0;
    }

    /* renamed from: c1 */
    public final LiveData m12140c1() {
        return this.f24197Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r6 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m12139d1(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pt.pingodoce.app.presentation.home.HomeViewModel.C9193h
            if (r0 == 0) goto L13
            r0 = r6
            pt.pingodoce.app.presentation.home.a$h r0 = (pt.pingodoce.app.presentation.home.HomeViewModel.C9193h) r0
            int r1 = r0.f24245z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24245z = r1
            goto L18
        L13:
            pt.pingodoce.app.presentation.home.a$h r0 = new pt.pingodoce.app.presentation.home.a$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24243x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f24245z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f24242w
            pt.pingodoce.app.presentation.home.a r0 = (pt.pingodoce.app.presentation.home.HomeViewModel) r0
            p468yc.C13186n.m1453b(r6)
            goto L81
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            p468yc.C13186n.m1453b(r6)
            mg.s1 r6 = r5.f24187O
            boolean r6 = r6.m18495o()
            if (r6 == 0) goto L83
            androidx.lifecycle.LiveData r6 = r5.f24189Q
            java.lang.Object r6 = r6.mo172f()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r4)
            boolean r6 = p181jd.Intrinsics.equals(r6, r2)
            if (r6 != 0) goto L74
            androidx.lifecycle.LiveData r6 = r5.f24197Y
            java.lang.Object r6 = r6.mo172f()
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard r6 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r6
            if (r6 == 0) goto L6e
            java.lang.String r6 = r6.m13799m()
            if (r6 == 0) goto L6e
            int r6 = r6.length()
            if (r6 != 0) goto L69
            r6 = r4
            goto L6a
        L69:
            r6 = r3
        L6a:
            if (r6 != r4) goto L6e
            r6 = r4
            goto L6f
        L6e:
            r6 = r3
        L6f:
            if (r6 == 0) goto L72
            goto L74
        L72:
            r0 = r5
            goto L81
        L74:
            mg.c0 r6 = r5.f24181I
            r0.f24242w = r5
            r0.f24245z = r4
            java.lang.Object r6 = r6.m18931o(r0)
            if (r6 != r1) goto L72
            return r1
        L81:
            r0.f24194V = r3
        L83:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeViewModel.m12139d1(bd.d):java.lang.Object");
    }

    /* renamed from: e1 */
    public final LiveData m12138e1() {
        return this.f24203e0;
    }

    /* renamed from: f1 */
    public final LiveData m12137f1() {
        return this.f24204f0;
    }

    /* renamed from: g1 */
    public final LiveData m12136g1() {
        return this.f24208j0;
    }

    /* renamed from: h1 */
    public final LiveData m12135h1() {
        return this.f24209k0;
    }

    /* renamed from: i1 */
    public final LiveData m12134i1() {
        return this.f24206h0;
    }

    /* renamed from: j1 */
    public final LiveData m12133j1() {
        return this.f24200b0;
    }

    /* renamed from: k0 */
    public LiveData m12132k0() {
        return this.f24205g0;
    }

    /* renamed from: k1 */
    public final LiveData m12131k1() {
        return this.f24201c0;
    }

    /* renamed from: l1 */
    public final LiveData m12130l1() {
        return this.f24189Q;
    }

    /* renamed from: m1 */
    public final LiveData m12129m1() {
        return this.f24217s0;
    }

    /* renamed from: o1 */
    public final LiveData m12127o1() {
        return this.f24198Z;
    }

    /* renamed from: p1 */
    public final View.OnClickListener m12126p1() {
        return new View.OnClickListener() { // from class: uj.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeViewModel.m12125q1(HomeViewModel.this, view);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m12123s1(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pt.pingodoce.app.presentation.home.HomeViewModel.C9195j
            if (r0 == 0) goto L13
            r0 = r6
            pt.pingodoce.app.presentation.home.a$j r0 = (pt.pingodoce.app.presentation.home.HomeViewModel.C9195j) r0
            int r1 = r0.f24250z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24250z = r1
            goto L18
        L13:
            pt.pingodoce.app.presentation.home.a$j r0 = new pt.pingodoce.app.presentation.home.a$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24248x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f24250z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f24247w
            pt.pingodoce.app.presentation.home.a r0 = (pt.pingodoce.app.presentation.home.HomeViewModel) r0
            p468yc.C13186n.m1453b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            p468yc.C13186n.m1453b(r6)
            mg.c0 r6 = r5.f24181I
            r0.f24247w = r5
            r0.f24250z = r3
            java.lang.Object r6 = r6.m18929q(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r5
        L46:
            og.a r6 = (p276og.Result) r6
            boolean r1 = r6 instanceof p276og.Result.C8078c
            if (r1 == 0) goto L8a
            og.a$c r6 = (p276og.Result.C8078c) r6
            java.lang.Object r6 = r6.m16962b()
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard r6 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r6
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard$Type r1 = r6.m13798n()
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard$Type r2 = pt.pingodoce.app.data.remote.models.response.LoyaltyCard.Type.PoupaMais
            r3 = 2
            r4 = 0
            if (r1 != r2) goto L74
            java.lang.String r1 = r6.m13823G()
            pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus r2 = pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus.APPROVED
            java.lang.String r2 = r2.name()
            boolean r1 = p181jd.Intrinsics.equals(r1, r2)
            if (r1 == 0) goto L74
            zh.r0 r6 = p494zh.C13895r0.f35016a
            p494zh.BaseViewModel.m119C(r0, r6, r4, r3, r4)
            goto L87
        L74:
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard$PoupaMaisStatus r6 = r6.m13824F()
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard$PoupaMaisStatus r1 = pt.pingodoce.app.data.remote.models.response.LoyaltyCard.PoupaMaisStatus.Pending
            if (r6 != r1) goto L82
            zh.v0 r6 = p494zh.C13911v0.f35032a
            p494zh.BaseViewModel.m119C(r0, r6, r4, r3, r4)
            goto L87
        L82:
            zh.u0 r6 = p494zh.C13907u0.f35028a
            p494zh.BaseViewModel.m119C(r0, r6, r4, r3, r4)
        L87:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L8a:
            boolean r6 = r6 instanceof p276og.Result.C8077b
            if (r6 == 0) goto L91
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L91:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.home.HomeViewModel.m12123s1(bd.d):java.lang.Object");
    }

    /* renamed from: t1 */
    public final void m12122t1() {
        this.f24188P.mo169m(Boolean.TRUE);
        C6772d.m20158d(C1473p0.m36987a(this), C10549n2.m7695b(null, 1, null), null, new C9196k(null), 2, null);
    }

    /* renamed from: v1 */
    public final void m12120v1() {
        this.f24186N.m18609o();
    }

    /* renamed from: w1 */
    public final void m12118w1() {
        this.f24186N.m18607q();
    }

    /* renamed from: x1 */
    public final View.OnClickListener m12116x1() {
        return new View.OnClickListener() { // from class: uj.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeViewModel.m12114y1(HomeViewModel.this, view);
            }
        };
    }

    /* renamed from: z1 */
    public final View.OnClickListener m12112z1() {
        return new View.OnClickListener() { // from class: uj.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeViewModel.m12169A1(HomeViewModel.this, view);
            }
        };
    }
}
