package th;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7249e0;
import mg.C7405s1;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* renamed from: th.b */
/* loaded from: classes2.dex */
public final class MadeForYouViewModel extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final C7405s1 f27362C;

    /* renamed from: D */
    private C2381h f27363D;

    /* renamed from: E */
    private final Void f27364E;

    /* renamed from: F */
    private final C1436e0 f27365F;

    /* renamed from: G */
    private final C1436e0 f27366G;

    /* renamed from: H */
    private final C1436e0 f27367H;

    /* renamed from: I */
    private final LiveData f27368I;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MadeForYouViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.madeforyou.MadeForYouViewModel$1", m20196f = "MadeForYouViewModel.kt", m20195l = {55}, m20194m = "invokeSuspend")
    /* renamed from: th.b$a */
    /* loaded from: classes2.dex */
    public static final class C10622a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f27369x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MadeForYouViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.madeforyou.MadeForYouViewModel$1$1", m20196f = "MadeForYouViewModel.kt", m20195l = {56}, m20194m = "invokeSuspend")
        /* renamed from: th.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C10623a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f27371x;

            /* renamed from: y */
            final /* synthetic */ MadeForYouViewModel f27372y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10623a(MadeForYouViewModel madeForYouViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f27372y = madeForYouViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C10623a(this.f27372y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C10623a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27371x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7405s1 m7478u0 = MadeForYouViewModel.m7478u0(this.f27372y);
                    this.f27371x = 1;
                    obj = m7478u0.m18504f(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7249e0 abstractC7249e0 = (AbstractC7249e0) obj;
                if (abstractC7249e0 instanceof AbstractC7249e0.C7251b) {
                    this.f27372y.m7474y0().mo166p(C6755b.m20201a(((AbstractC7249e0.C7251b) abstractC7249e0).m18864a().m14127a()));
                } else if (abstractC7249e0 instanceof AbstractC7249e0.C7250a) {
                    MadeForYouViewModel.m7477v0(this.f27372y, ((AbstractC7249e0.C7250a) abstractC7249e0).m18865a());
                }
                return C13195u.f34156a;
            }
        }

        C10622a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10622a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10622a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27369x;
            if (i == 0) {
                C13186n.m1453b(obj);
                MadeForYouViewModel madeForYouViewModel = MadeForYouViewModel.this;
                C10623a c10623a = new C10623a(madeForYouViewModel, null);
                this.f27369x = 1;
                if (MadeForYouViewModel.m7476w0(madeForYouViewModel, true, c10623a, this) == m34636d) {
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
    /* compiled from: MadeForYouViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.madeforyou.MadeForYouViewModel", m20196f = "MadeForYouViewModel.kt", m20195l = {42}, m20194m = "onSubmit")
    /* renamed from: th.b$b */
    /* loaded from: classes2.dex */
    public static final class C10624b extends AbstractC6757d {

        /* renamed from: w */
        Object f27373w;

        /* renamed from: x */
        /* synthetic */ Object f27374x;

        /* renamed from: z */
        int f27376z;

        C10624b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27374x = obj;
            this.f27376z |= Integer.MIN_VALUE;
            return MadeForYouViewModel.this.m7479n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MadeForYouViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f27362C = c7405s1;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_confirm));
        this.f27363D = c2381h;
        C1436e0 c1436e0 = new C1436e0(Boolean.TRUE);
        this.f27365F = c1436e0;
        this.f27366G = new C1436e0(Boolean.valueOf(c7405s1.m18498l()));
        this.f27367H = new C1436e0(Boolean.FALSE);
        this.f27368I = c1436e0;
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C10622a(null), 3, null);
    }

    /* renamed from: u0 */
    public static final /* synthetic */ C7405s1 m7478u0(MadeForYouViewModel madeForYouViewModel) {
        return madeForYouViewModel.f27362C;
    }

    /* renamed from: v0 */
    public static final /* synthetic */ void m7477v0(MadeForYouViewModel madeForYouViewModel, Throwable th2) {
        madeForYouViewModel.m109l(th2);
    }

    /* renamed from: w0 */
    public static final /* synthetic */ Object m7476w0(MadeForYouViewModel madeForYouViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return madeForYouViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: A0 */
    public final C1436e0 m7482A0() {
        return this.f27366G;
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m7481f0() {
        return (Drawable) m7473z0();
    }

    /* renamed from: g0 */
    protected C2381h m7480g0() {
        return this.f27363D;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m7479n0(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof th.MadeForYouViewModel.C10624b
            if (r0 == 0) goto L13
            r0 = r5
            th.b$b r0 = (th.MadeForYouViewModel.C10624b) r0
            int r1 = r0.f27376z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27376z = r1
            goto L18
        L13:
            th.b$b r0 = new th.b$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27374x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27376z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f27373w
            th.b r0 = (th.MadeForYouViewModel) r0
            p468yc.C13186n.m1453b(r5)
            goto L59
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r5)
            mg.s1 r5 = r4.f27362C
            androidx.lifecycle.e0 r2 = r4.f27367H
            java.lang.Object r2 = r2.mo172f()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L49
            r2 = 0
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r2)
        L49:
            boolean r2 = r2.booleanValue()
            r0.f27373w = r4
            r0.f27376z = r3
            java.lang.Object r5 = r5.m18486x(r2, r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            r0 = r4
        L59:
            mg.e0 r5 = (mg.AbstractC7249e0) r5
            boolean r1 = r5 instanceof mg.AbstractC7249e0.C7252c
            if (r1 == 0) goto L77
            u5.a r5 = r0.m20390g()
            r1 = 2131886483(0x7f120193, float:1.9407546E38)
            android.content.Context r5 = r5.m6899a()
            java.lang.String r5 = r5.getString(r1)
            java.lang.String r1 = "ctx.getString(id)"
            p181jd.Intrinsics.checkIfNull(r5, r1)
            r0.m110k(r5)
            goto L84
        L77:
            boolean r1 = r5 instanceof mg.AbstractC7249e0.C7250a
            if (r1 == 0) goto L84
            mg.e0$a r5 = (mg.AbstractC7249e0.C7250a) r5
            we.b r5 = r5.m18865a()
            r0.m109l(r5)
        L84:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: th.MadeForYouViewModel.m7479n0(bd.d):java.lang.Object");
    }

    /* renamed from: x0 */
    public final LiveData m7475x0() {
        return this.f27368I;
    }

    /* renamed from: y0 */
    public final C1436e0 m7474y0() {
        return this.f27367H;
    }

    /* renamed from: z0 */
    protected Void m7473z0() {
        return this.f27364E;
    }
}
