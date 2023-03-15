package p143hh;

import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.LoyaltyCardManager;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;

/* renamed from: hh.c */
/* loaded from: classes2.dex */
public final class LoyaltyPendingViewModel extends BaseViewModel {

    /* renamed from: m */
    private final LiveData f16426m;

    /* renamed from: n */
    private final LiveData f16427n;

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: hh.c$a */
    /* loaded from: classes2.dex */
    public static final class C5938a implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f16428w;

        /* compiled from: Emitters.kt */
        /* renamed from: hh.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C5939a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f16429w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.pending.LoyaltyPendingViewModel$special$$inlined$map$1$2", m20196f = "LoyaltyPendingViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: hh.c$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C5940a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f16430w;

                /* renamed from: x */
                int f16431x;

                public C5940a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f16430w = obj;
                    this.f16431x |= Integer.MIN_VALUE;
                    return C5939a.this.mo4529a(null, this);
                }
            }

            public C5939a(InterfaceC6787d interfaceC6787d) {
                this.f16429w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof p143hh.LoyaltyPendingViewModel.C5938a.C5939a.C5940a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hh.c$a$a$a r0 = (p143hh.LoyaltyPendingViewModel.C5938a.C5939a.C5940a) r0
                    int r1 = r0.f16431x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f16431x = r1
                    goto L18
                L13:
                    hh.c$a$a$a r0 = new hh.c$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f16430w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f16431x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f16429w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    java.lang.String r5 = r5.m13825E()
                    if (r5 != 0) goto L40
                    java.lang.String r5 = "Undefined"
                L40:
                    r0.f16431x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p143hh.LoyaltyPendingViewModel.C5938a.C5939a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C5938a(InterfaceC6785c interfaceC6785c) {
            this.f16428w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f16428w.mo20086d(new C5939a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: hh.c$b */
    /* loaded from: classes2.dex */
    public static final class C5941b<I, O> implements InterfaceC7946a {

        /* renamed from: a */
        final /* synthetic */ ResourcesProvider f16433a;

        /* renamed from: b */
        final /* synthetic */ LoyaltyPendingViewModel f16434b;

        public C5941b(ResourcesProvider resourcesProvider, LoyaltyPendingViewModel loyaltyPendingViewModel) {
            this.f16433a = resourcesProvider;
            this.f16434b = loyaltyPendingViewModel;
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            String str = (String) obj;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String string = this.f16433a.m6899a().getString(C2336R.string.lbl_card_registration_status_pending);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            String format = String.format(string, Arrays.copyOf(new Object[]{this.f16434b.m22643L().mo172f()}, 1));
            Intrinsics.checkIfNull(format, "format(format, *args)");
            return format;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyPendingViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        LiveData m106t = m106t(new C5938a(loyaltyCardManager.m18930p()));
        this.f16426m = m106t;
        LiveData m36993a = C1465n0.m36993a(m106t, new C5941b(resourcesProvider, this));
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f16427n = m36993a;
    }

    /* renamed from: L */
    public final LiveData m22643L() {
        return this.f16426m;
    }

    /* renamed from: M */
    public final LiveData m22642M() {
        return this.f16427n;
    }
}
