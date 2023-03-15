package mg;

import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.C6847z;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import module.network.data.remote.models.response.authenticationv2.PmCardsResponse;
import org.threeten.p283bp.format.C8223b;
import p066dg.ClubsCodesAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.UserProfileAgent;
import p070e.C4906j;
import p181jd.Intrinsics;
import p276og.C8079b;
import p276og.Result;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.LoyaltyCardInviteResponseRequest;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import vg.LoyaltyCardService;

/* renamed from: mg.c0 */
/* loaded from: classes2.dex */
public final class LoyaltyCardManager {

    /* renamed from: a */
    private final LoyaltyCardService f19048a;

    /* renamed from: b */
    private final LoyaltyCardAgent f19049b;

    /* renamed from: c */
    private final PrefsManager f19050c;

    /* renamed from: d */
    private final C8223b f19051d;

    /* renamed from: e */
    private final UserProfileAgent f19052e;

    /* renamed from: f */
    private final ClubsCodesAgent f19053f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager", m20196f = "LoyaltyCardManager.kt", m20195l = {218}, m20194m = "activateElectronicInvoice")
    /* renamed from: mg.c0$a */
    /* loaded from: classes2.dex */
    public static final class C7210a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19054w;

        /* renamed from: y */
        int f19056y;

        C7210a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19054w = obj;
            this.f19056y |= Integer.MIN_VALUE;
            return LoyaltyCardManager.this.m18939g(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager", m20196f = "LoyaltyCardManager.kt", m20195l = {C4906j.f13390C0, C4906j.f13400E0}, m20194m = "delete")
    /* renamed from: mg.c0$b */
    /* loaded from: classes2.dex */
    public static final class C7211b extends AbstractC6757d {

        /* renamed from: w */
        Object f19057w;

        /* renamed from: x */
        /* synthetic */ Object f19058x;

        /* renamed from: z */
        int f19060z;

        C7211b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19058x = obj;
            this.f19060z |= Integer.MIN_VALUE;
            return LoyaltyCardManager.this.m18934l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager", m20196f = "LoyaltyCardManager.kt", m20195l = {183, 185}, m20194m = "deleteCardAssociations")
    /* renamed from: mg.c0$c */
    /* loaded from: classes2.dex */
    public static final class C7212c extends AbstractC6757d {

        /* renamed from: w */
        Object f19061w;

        /* renamed from: x */
        /* synthetic */ Object f19062x;

        /* renamed from: z */
        int f19064z;

        C7212c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19062x = obj;
            this.f19064z |= Integer.MIN_VALUE;
            return LoyaltyCardManager.this.m18933m(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager", m20196f = "LoyaltyCardManager.kt", m20195l = {205}, m20194m = "electronicInvoiceStatus")
    /* renamed from: mg.c0$d */
    /* loaded from: classes2.dex */
    public static final class C7213d extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19065w;

        /* renamed from: y */
        int f19067y;

        C7213d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19065w = obj;
            this.f19067y |= Integer.MIN_VALUE;
            return LoyaltyCardManager.this.m18932n(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$forceFetchCardStatus$2", m20196f = "LoyaltyCardManager.kt", m20195l = {132}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$e */
    /* loaded from: classes2.dex */
    public static final class C7214e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19068x;

        C7214e(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7214e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7214e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19068x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardAgent m18943c = LoyaltyCardManager.m18943c(LoyaltyCardManager.this);
                this.f19068x = 1;
                if (m18943c.m25743B(this) == m34636d) {
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
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$getCardFlow$1", m20196f = "LoyaltyCardManager.kt", m20195l = {147, 147}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$f */
    /* loaded from: classes2.dex */
    public static final class C7215f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19070x;

        /* renamed from: y */
        private /* synthetic */ Object f19071y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyCardManager.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$getCardFlow$1$1", m20196f = "LoyaltyCardManager.kt", m20195l = {147}, m20194m = "invokeSuspend")
        /* renamed from: mg.c0$f$a */
        /* loaded from: classes2.dex */
        public static final class C7216a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f19073x;

            /* renamed from: y */
            final /* synthetic */ LoyaltyCardManager f19074y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7216a(LoyaltyCardManager loyaltyCardManager, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f19074y = loyaltyCardManager;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C7216a(this.f19074y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C7216a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f19073x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ClubsCodesAgent m18945a = LoyaltyCardManager.m18945a(this.f19074y);
                    this.f19073x = 1;
                    obj = m18945a.m25742C(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return obj;
            }
        }

        C7215f(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C7215f c7215f = new C7215f(interfaceC1886d);
            c7215f.f19071y = obj;
            return c7215f;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            return ((C7215f) create(interfaceC6787d, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC6787d interfaceC6787d;
            m34636d = C2116d.m34636d();
            int i = this.f19070x;
            if (i == 0) {
                C13186n.m1453b(obj);
                interfaceC6787d = (InterfaceC6787d) this.f19071y;
                C7216a c7216a = new C7216a(LoyaltyCardManager.this, null);
                this.f19071y = interfaceC6787d;
                this.f19070x = 1;
                obj = C8079b.m16960b(c7216a, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i == 2) {
                    C13186n.m1453b(obj);
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                interfaceC6787d = (InterfaceC6787d) this.f19071y;
                C13186n.m1453b(obj);
            }
            this.f19071y = null;
            this.f19070x = 2;
            if (interfaceC6787d.mo4529a(obj, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$getCardFlow$2", m20196f = "LoyaltyCardManager.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$g */
    /* loaded from: classes2.dex */
    public static final class C7217g extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19075x;

        C7217g(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7217g(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(Result result, InterfaceC1886d interfaceC1886d) {
            return ((C7217g) create(result, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f19075x == 0) {
                C13186n.m1453b(obj);
                return LoyaltyCardManager.m18943c(LoyaltyCardManager.this).m25740E();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$getCardStatus$2", m20196f = "LoyaltyCardManager.kt", m20195l = {138}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$h */
    /* loaded from: classes2.dex */
    public static final class C7218h extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19077x;

        C7218h(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7218h(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7218h) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            Object m26484C;
            m34636d = C2116d.m34636d();
            int i = this.f19077x;
            if (i == 0) {
                C13186n.m1453b(obj);
                if (LoyaltyCardManager.m18940f(LoyaltyCardManager.this).m26569R()) {
                    LoyaltyCardAgent m18943c = LoyaltyCardManager.m18943c(LoyaltyCardManager.this);
                    this.f19077x = 1;
                    m26484C = m18943c.m26484C(this);
                    if (m26484C == m34636d) {
                        return m34636d;
                    }
                } else {
                    return new LoyaltyCard(null, false, false, null, null, false, null, 0, null, 0.0f, null, null, 0.0f, null, 0, 0.0f, null, null, null, null, null, 2097151, null);
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
                m26484C = obj;
            }
            return (LoyaltyCard) m26484C;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$getCardTypeNumber$2", m20196f = "LoyaltyCardManager.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$i */
    /* loaded from: classes2.dex */
    public static final class C7219i extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19079x;

        C7219i(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7219i(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7219i) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f19079x == 0) {
                C13186n.m1453b(obj);
                return BuildConfig.VERSION_NAME;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$getCardTypeNumber$3", m20196f = "LoyaltyCardManager.kt", m20195l = {243}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$j */
    /* loaded from: classes2.dex */
    public static final class C7220j extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19080x;

        C7220j(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7220j(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7220j) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19080x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardAgent m18943c = LoyaltyCardManager.m18943c(LoyaltyCardManager.this);
                this.f19080x = 1;
                obj = m18943c.m26484C(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return ((LoyaltyCard) obj).m13819K();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: mg.c0$k */
    /* loaded from: classes2.dex */
    public static final class C7221k implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f19082w;

        /* renamed from: x */
        final /* synthetic */ LoyaltyCardManager f19083x;

        /* compiled from: Emitters.kt */
        /* renamed from: mg.c0$k$a */
        /* loaded from: classes2.dex */
        public static final class C7222a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f19084w;

            /* renamed from: x */
            final /* synthetic */ LoyaltyCardManager f19085x;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$getLastSyncDateFlow$$inlined$map$1$2", m20196f = "LoyaltyCardManager.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: mg.c0$k$a$a */
            /* loaded from: classes2.dex */
            public static final class C7223a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f19086w;

                /* renamed from: x */
                int f19087x;

                public C7223a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f19086w = obj;
                    this.f19087x |= Integer.MIN_VALUE;
                    return C7222a.this.mo4529a(null, this);
                }
            }

            public C7222a(InterfaceC6787d interfaceC6787d, LoyaltyCardManager loyaltyCardManager) {
                this.f19084w = interfaceC6787d;
                this.f19085x = loyaltyCardManager;
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
                    boolean r0 = r6 instanceof mg.LoyaltyCardManager.C7221k.C7222a.C7223a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mg.c0$k$a$a r0 = (mg.LoyaltyCardManager.C7221k.C7222a.C7223a) r0
                    int r1 = r0.f19087x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19087x = r1
                    goto L18
                L13:
                    mg.c0$k$a$a r0 = new mg.c0$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19086w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f19087x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L60
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f19084w
                    org.threeten.bp.e r5 = (org.threeten.p283bp.C8216e) r5
                    org.threeten.bp.e r2 = org.threeten.p283bp.C8216e.f21368y
                    boolean r2 = p181jd.Intrinsics.equals(r5, r2)
                    if (r2 != 0) goto L55
                    org.threeten.bp.e r2 = org.threeten.p283bp.C8216e.m16153G()
                    int r2 = r5.mo16136i(r2)
                    if (r2 > 0) goto L55
                    mg.c0 r2 = r4.f19085x
                    org.threeten.bp.format.b r2 = mg.LoyaltyCardManager.m18944b(r2)
                    java.lang.String r5 = r2.m16091a(r5)
                    goto L57
                L55:
                    java.lang.String r5 = ""
                L57:
                    r0.f19087x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L60
                    return r1
                L60:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mg.LoyaltyCardManager.C7221k.C7222a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C7221k(InterfaceC6785c interfaceC6785c, LoyaltyCardManager loyaltyCardManager) {
            this.f19082w = interfaceC6785c;
            this.f19083x = loyaltyCardManager;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f19082w.mo20086d(new C7222a(interfaceC6787d, this.f19083x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$getVirtualCardConsents$2", m20196f = "LoyaltyCardManager.kt", m20195l = {C0868i.f2978v0}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$l */
    /* loaded from: classes2.dex */
    public static final class C7224l extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19089x;

        C7224l(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7224l(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7224l) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19089x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardService m18941e = LoyaltyCardManager.m18941e(LoyaltyCardManager.this);
                this.f19089x = 1;
                obj = m18941e.m5422r(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$registerAndCacheVirtualCard$2", m20196f = "LoyaltyCardManager.kt", m20195l = {62, 70, 72}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$m */
    /* loaded from: classes2.dex */
    public static final class C7225m extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f19091A;

        /* renamed from: B */
        final /* synthetic */ String f19092B;

        /* renamed from: C */
        final /* synthetic */ String f19093C;

        /* renamed from: D */
        final /* synthetic */ String f19094D;

        /* renamed from: E */
        final /* synthetic */ boolean f19095E;

        /* renamed from: F */
        final /* synthetic */ boolean f19096F;

        /* renamed from: G */
        final /* synthetic */ boolean f19097G;

        /* renamed from: x */
        Object f19098x;

        /* renamed from: y */
        int f19099y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7225m(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19091A = str;
            this.f19092B = str2;
            this.f19093C = str3;
            this.f19094D = str4;
            this.f19095E = z;
            this.f19096F = z2;
            this.f19097G = z3;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7225m(this.f19091A, this.f19092B, this.f19093C, this.f19094D, this.f19095E, this.f19096F, this.f19097G, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7225m) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.LoyaltyCardManager.C7225m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$registerCard$2", m20196f = "LoyaltyCardManager.kt", m20195l = {C0868i.f2748C0, 110, C0868i.f2778I0}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$n */
    /* loaded from: classes2.dex */
    public static final class C7226n extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: B */
        final /* synthetic */ String f19102B;

        /* renamed from: C */
        final /* synthetic */ String f19103C;

        /* renamed from: x */
        Object f19104x;

        /* renamed from: y */
        Object f19105y;

        /* renamed from: z */
        int f19106z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7226n(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19102B = str;
            this.f19103C = str2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7226n(this.f19102B, this.f19103C, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7226n) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                r30 = this;
                r0 = r30
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f19106z
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3a
                if (r2 == r5) goto L34
                if (r2 == r4) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r1 = r0.f19104x
                pt.pingodoce.app.data.remote.models.response.CardOwnerResponse r1 = (pt.pingodoce.app.data.remote.models.response.CardOwnerResponse) r1
                p468yc.C13186n.m1453b(r31)
                goto Lc1
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L24:
                java.lang.Object r2 = r0.f19105y
                dg.s r2 = (p066dg.LoyaltyCardAgent) r2
                java.lang.Object r4 = r0.f19104x
                pt.pingodoce.app.data.remote.models.response.CardOwnerResponse r4 = (pt.pingodoce.app.data.remote.models.response.CardOwnerResponse) r4
                p468yc.C13186n.m1453b(r31)
                r5 = r2
                r2 = r4
                r4 = r31
                goto L81
            L34:
                p468yc.C13186n.m1453b(r31)
                r2 = r31
                goto L5d
            L3a:
                p468yc.C13186n.m1453b(r31)
                mg.c0 r2 = mg.LoyaltyCardManager.this
                vg.q r2 = mg.LoyaltyCardManager.m18941e(r2)
                java.lang.String r6 = r0.f19102B
                java.lang.String r10 = be.UtilsExtensions.m35165g(r6)
                pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory r6 = new pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory
                r8 = 0
                java.lang.String r9 = r0.f19103C
                r11 = 1
                r12 = 0
                r7 = r6
                r7.<init>(r8, r9, r10, r11, r12)
                r0.f19106z = r5
                java.lang.Object r2 = r2.m5421s(r6, r0)
                if (r2 != r1) goto L5d
                return r1
            L5d:
                pt.pingodoce.app.data.remote.models.response.CardOwnerResponse r2 = (pt.pingodoce.app.data.remote.models.response.CardOwnerResponse) r2
                mg.c0 r5 = mg.LoyaltyCardManager.this
                mg.s0 r5 = mg.LoyaltyCardManager.m18942d(r5)
                r5.m18559A()
                mg.c0 r5 = mg.LoyaltyCardManager.this
                dg.s r5 = mg.LoyaltyCardManager.m18943c(r5)
                mg.c0 r6 = mg.LoyaltyCardManager.this
                dg.s r6 = mg.LoyaltyCardManager.m18943c(r6)
                r0.f19104x = r2
                r0.f19105y = r5
                r0.f19106z = r4
                java.lang.Object r4 = r6.m26484C(r0)
                if (r4 != r1) goto L81
                return r1
            L81:
                r6 = r4
                pt.pingodoce.app.data.remote.models.response.LoyaltyCard r6 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r6
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                pt.pingodoce.app.data.remote.models.response.LoyaltyCard$PoupaMaisStatus r26 = r2.m13900d()
                java.lang.String r27 = r2.m13901c()
                r28 = 524287(0x7ffff, float:7.34683E-40)
                r29 = 0
                pt.pingodoce.app.data.remote.models.response.LoyaltyCard r4 = pt.pingodoce.app.data.remote.models.response.LoyaltyCard.m13806d(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                r0.f19104x = r2
                r6 = 0
                r0.f19105y = r6
                r0.f19106z = r3
                java.lang.Object r3 = r5.m25783y(r4, r0)
                if (r3 != r1) goto Lc0
                return r1
            Lc0:
                r1 = r2
            Lc1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.LoyaltyCardManager.C7226n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager", m20196f = "LoyaltyCardManager.kt", m20195l = {173}, m20194m = "requests")
    /* renamed from: mg.c0$o */
    /* loaded from: classes2.dex */
    public static final class C7227o extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19107w;

        /* renamed from: y */
        int f19109y;

        C7227o(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19107w = obj;
            this.f19109y |= Integer.MIN_VALUE;
            return LoyaltyCardManager.this.m18921y(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.LoyaltyCardManager$updateInvite$2", m20196f = "LoyaltyCardManager.kt", m20195l = {199}, m20194m = "invokeSuspend")
    /* renamed from: mg.c0$p */
    /* loaded from: classes2.dex */
    public static final class C7228p extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ boolean f19110A;

        /* renamed from: x */
        int f19111x;

        /* renamed from: z */
        final /* synthetic */ String f19113z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7228p(String str, boolean z, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19113z = str;
            this.f19110A = z;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7228p(this.f19113z, this.f19110A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7228p) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19111x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardService m18941e = LoyaltyCardManager.m18941e(LoyaltyCardManager.this);
                LoyaltyCardInviteResponseRequest loyaltyCardInviteResponseRequest = new LoyaltyCardInviteResponseRequest(this.f19113z, this.f19110A);
                this.f19111x = 1;
                obj = m18941e.m5419u(loyaltyCardInviteResponseRequest, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    public LoyaltyCardManager(LoyaltyCardService loyaltyCardService, LoyaltyCardAgent loyaltyCardAgent, PrefsManager prefsManager, C8223b c8223b, UserProfileAgent userProfileAgent, ClubsCodesAgent clubsCodesAgent) {
        Intrinsics.isThisObjectNull(loyaltyCardService, "service");
        Intrinsics.isThisObjectNull(loyaltyCardAgent, "loyaltyCardAgent");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        Intrinsics.isThisObjectNull(c8223b, "formatter");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        Intrinsics.isThisObjectNull(clubsCodesAgent, "clubsCodesAgent");
        this.f19048a = loyaltyCardService;
        this.f19049b = loyaltyCardAgent;
        this.f19050c = prefsManager;
        this.f19051d = c8223b;
        this.f19052e = userProfileAgent;
        this.f19053f = clubsCodesAgent;
    }

    /* renamed from: a */
    public static final /* synthetic */ ClubsCodesAgent m18945a(LoyaltyCardManager loyaltyCardManager) {
        return loyaltyCardManager.f19053f;
    }

    /* renamed from: b */
    public static final /* synthetic */ C8223b m18944b(LoyaltyCardManager loyaltyCardManager) {
        return loyaltyCardManager.f19051d;
    }

    /* renamed from: c */
    public static final /* synthetic */ LoyaltyCardAgent m18943c(LoyaltyCardManager loyaltyCardManager) {
        return loyaltyCardManager.f19049b;
    }

    /* renamed from: d */
    public static final /* synthetic */ PrefsManager m18942d(LoyaltyCardManager loyaltyCardManager) {
        return loyaltyCardManager.f19050c;
    }

    /* renamed from: e */
    public static final /* synthetic */ LoyaltyCardService m18941e(LoyaltyCardManager loyaltyCardManager) {
        return loyaltyCardManager.f19048a;
    }

    /* renamed from: f */
    public static final /* synthetic */ UserProfileAgent m18940f(LoyaltyCardManager loyaltyCardManager) {
        return loyaltyCardManager.f19052e;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m18938h(LoyaltyCardManager loyaltyCardManager, String str, String str2, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = BuildConfig.VERSION_NAME;
        }
        return loyaltyCardManager.m18939g(str, str2, interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18939g(java.lang.String r5, java.lang.String r6, bd.InterfaceC1886d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof mg.LoyaltyCardManager.C7210a
            if (r0 == 0) goto L13
            r0 = r7
            mg.c0$a r0 = (mg.LoyaltyCardManager.C7210a) r0
            int r1 = r0.f19056y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19056y = r1
            goto L18
        L13:
            mg.c0$a r0 = new mg.c0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19054w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19056y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r7)
            vg.q r7 = r4.f19048a
            pt.pingodoce.app.data.remote.models.request.ElectronicInvoiceRequest r2 = new pt.pingodoce.app.data.remote.models.request.ElectronicInvoiceRequest
            java.lang.String r5 = be.UtilsExtensions.m35165g(r5)
            r2.<init>(r5, r6)
            r0.f19056y = r3
            java.lang.Object r7 = r7.m5424p(r2, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r5 = r7 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L5c
            mg.u$b r5 = new mg.u$b
            df.d$b r7 = (p065df.NetworkResult.C4792b) r7
            java.lang.Object r6 = r7.m26590a()
            pt.pingodoce.app.data.remote.models.response.ElectronicInvoice r6 = (pt.pingodoce.app.data.remote.models.response.ElectronicInvoice) r6
            r5.<init>(r6)
            goto L6b
        L5c:
            boolean r5 = r7 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L6c
            mg.u$a$a r5 = new mg.u$a$a
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r6 = r7.m26591a()
            r5.<init>(r6)
        L6b:
            return r5
        L6c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.LoyaltyCardManager.m18939g(java.lang.String, java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: i */
    public final void m18937i(List list) {
        Intrinsics.isThisObjectNull(list, "response");
        this.f19050c.m18544P(list);
    }

    /* renamed from: j */
    public final void m18936j(PmCardsResponse pmCardsResponse) {
        Intrinsics.isThisObjectNull(pmCardsResponse, "pmCards");
        this.f19050c.m18543Q(pmCardsResponse);
    }

    /* renamed from: k */
    public final Object m18935k(String str, InterfaceC1886d interfaceC1886d) {
        return m18938h(this, UtilsExtensions.m35165g(str), null, interfaceC1886d, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18934l(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mg.LoyaltyCardManager.C7211b
            if (r0 == 0) goto L13
            r0 = r7
            mg.c0$b r0 = (mg.LoyaltyCardManager.C7211b) r0
            int r1 = r0.f19060z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19060z = r1
            goto L18
        L13:
            mg.c0$b r0 = new mg.c0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19058x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19060z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f19057w
            mg.c0 r0 = (mg.LoyaltyCardManager) r0
            p468yc.C13186n.m1453b(r7)
            goto L63
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f19057w
            mg.c0 r2 = (mg.LoyaltyCardManager) r2
            p468yc.C13186n.m1453b(r7)
            goto L51
        L40:
            p468yc.C13186n.m1453b(r7)
            vg.q r7 = r6.f19048a
            r0.f19057w = r6
            r0.f19060z = r4
            java.lang.Object r7 = r7.m5426n(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r6
        L51:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r5 = r7 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L6d
            r0.f19057w = r2
            r0.f19060z = r3
            java.lang.Object r7 = r2.m18931o(r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            r0 = r2
        L63:
            mg.s0 r7 = r0.f19050c
            r7.m18559A()
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r4)
            return r7
        L6d:
            boolean r0 = r7 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L78
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r7 = r7.m26591a()
            throw r7
        L78:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.LoyaltyCardManager.m18934l(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18933m(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mg.LoyaltyCardManager.C7212c
            if (r0 == 0) goto L13
            r0 = r7
            mg.c0$c r0 = (mg.LoyaltyCardManager.C7212c) r0
            int r1 = r0.f19064z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19064z = r1
            goto L18
        L13:
            mg.c0$c r0 = new mg.c0$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19062x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19064z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f19061w
            mg.c0 r0 = (mg.LoyaltyCardManager) r0
            p468yc.C13186n.m1453b(r7)
            goto L63
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f19061w
            mg.c0 r2 = (mg.LoyaltyCardManager) r2
            p468yc.C13186n.m1453b(r7)
            goto L51
        L40:
            p468yc.C13186n.m1453b(r7)
            vg.q r7 = r6.f19048a
            r0.f19061w = r6
            r0.f19064z = r4
            java.lang.Object r7 = r7.m5425o(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r6
        L51:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r5 = r7 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L6d
            r0.f19061w = r2
            r0.f19064z = r3
            java.lang.Object r7 = r2.m18931o(r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            r0 = r2
        L63:
            mg.s0 r7 = r0.f19050c
            r7.m18559A()
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r4)
            return r7
        L6d:
            boolean r0 = r7 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L78
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r7 = r7.m26591a()
            throw r7
        L78:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.LoyaltyCardManager.m18933m(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18932n(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.LoyaltyCardManager.C7213d
            if (r0 == 0) goto L13
            r0 = r6
            mg.c0$d r0 = (mg.LoyaltyCardManager.C7213d) r0
            int r1 = r0.f19067y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19067y = r1
            goto L18
        L13:
            mg.c0$d r0 = new mg.c0$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19065w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19067y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.q r6 = r4.f19048a
            pt.pingodoce.app.data.remote.models.request.PhoneRequest r2 = new pt.pingodoce.app.data.remote.models.request.PhoneRequest
            java.lang.String r5 = be.UtilsExtensions.m35165g(r5)
            r2.<init>(r5)
            r0.f19067y = r3
            java.lang.Object r6 = r6.m5423q(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L5c
            mg.u$b r5 = new mg.u$b
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r6 = r6.m26590a()
            pt.pingodoce.app.data.remote.models.response.ElectronicInvoice r6 = (pt.pingodoce.app.data.remote.models.response.ElectronicInvoice) r6
            r5.<init>(r6)
            goto L6b
        L5c:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L6c
            mg.u$a$a r5 = new mg.u$a$a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L6b:
            return r5
        L6c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.LoyaltyCardManager.m18932n(java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: o */
    public final Object m18931o(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7214e(null), interfaceC1886d);
    }

    /* renamed from: p */
    public final InterfaceC6785c m18930p() {
        if (this.f19052e.m26569R()) {
            return C6788e.m20133o(C6788e.m20128t(new C7215f(null)), new C7217g(null));
        }
        return C6847z.m20023a(new LoyaltyCard(null, false, false, null, null, false, null, 0, null, 0.0f, null, null, 0.0f, null, 0, 0.0f, null, null, null, null, null, 2097151, null));
    }

    /* renamed from: q */
    public final Object m18929q(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7218h(null), interfaceC1886d);
    }

    /* renamed from: r */
    public final Object m18928r(InterfaceC1886d interfaceC1886d) {
        if (this.f19052e.m26572O()) {
            return C8079b.m16960b(new C7219i(null), interfaceC1886d);
        }
        return C8079b.m16960b(new C7220j(null), interfaceC1886d);
    }

    /* renamed from: s */
    public final InterfaceC6785c m18927s() {
        return new C7221k(this.f19049b.m25738G(), this);
    }

    /* renamed from: t */
    public final List m18926t() {
        return this.f19050c.m18521p();
    }

    /* renamed from: u */
    public final PmCardsResponse m18925u() {
        return this.f19050c.m18520q();
    }

    /* renamed from: v */
    public final Object m18924v(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7224l(null), interfaceC1886d);
    }

    /* renamed from: w */
    public final Object m18923w(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7225m(str, str2, str3, str4, z, z2, z3, null), interfaceC1886d);
    }

    /* renamed from: x */
    public final Object m18922x(String str, String str2, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7226n(str, str2, null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18921y(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.LoyaltyCardManager.C7227o
            if (r0 == 0) goto L13
            r0 = r5
            mg.c0$o r0 = (mg.LoyaltyCardManager.C7227o) r0
            int r1 = r0.f19109y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19109y = r1
            goto L18
        L13:
            mg.c0$o r0 = new mg.c0$o
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19107w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19109y
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
            vg.q r5 = r4.f19048a
            r0.f19109y = r3
            java.lang.Object r5 = r5.m5418v(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r0 = r5 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto L53
            mg.c1$b r0 = new mg.c1$b
            df.d$b r5 = (p065df.NetworkResult.C4792b) r5
            java.lang.Object r5 = r5.m26590a()
            java.util.List r5 = (java.util.List) r5
            r0.<init>(r5)
            goto L6a
        L53:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L70
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r0 = r5.m26591a()
            boolean r0 = r0 instanceof p447xe.NoConnectionException
            if (r0 == 0) goto L6b
            mg.c1$a$a r0 = new mg.c1$a$a
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
        L6a:
            return r0
        L6b:
            we.b r5 = r5.m26591a()
            throw r5
        L70:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.LoyaltyCardManager.m18921y(bd.d):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m18920z(String str, boolean z, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7228p(str, z, null), interfaceC1886d);
    }
}
