package mg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import p066dg.ConsentsAgent;
import p181jd.Intrinsics;
import p276og.C8079b;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13777q;
import pt.pingodoce.app.data.remote.models.response.Consent;
import vg.ConsentsService;

/* renamed from: mg.s */
/* loaded from: classes2.dex */
public final class ConsentsManager {

    /* renamed from: a */
    private final ConsentsService f19628a;

    /* renamed from: b */
    private final ConsentsAgent f19629b;

    /* renamed from: c */
    private final EncryptedPrefsManager f19630c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsentsManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ConsentsManager$clubConsents$2", m20196f = "ConsentsManager.kt", m20195l = {28}, m20194m = "invokeSuspend")
    /* renamed from: mg.s$a */
    /* loaded from: classes2.dex */
    public static final class C7400a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19631x;

        /* renamed from: z */
        final /* synthetic */ String f19633z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7400a(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19633z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7400a(this.f19633z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7400a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19631x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ConsentsService m18569b = ConsentsManager.m18569b(ConsentsManager.this);
                String str = this.f19633z;
                this.f19631x = 1;
                obj = m18569b.m5481m(str, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13777q.m256L((List) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsentsManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ConsentsManager$consents$2", m20196f = "ConsentsManager.kt", m20195l = {32}, m20194m = "invokeSuspend")
    /* renamed from: mg.s$b */
    /* loaded from: classes2.dex */
    public static final class C7401b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19634x;

        C7401b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7401b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7401b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19634x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ConsentsAgent m18570a = ConsentsManager.m18570a(ConsentsManager.this);
                this.f19634x = 1;
                obj = m18570a.m25742C(this);
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
    /* compiled from: ConsentsManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ConsentsManager$latestConsent$2", m20196f = "ConsentsManager.kt", m20195l = {20}, m20194m = "invokeSuspend")
    /* renamed from: mg.s$c */
    /* loaded from: classes2.dex */
    public static final class C7402c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19636x;

        C7402c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7402c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7402c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19636x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ConsentsService m18569b = ConsentsManager.m18569b(ConsentsManager.this);
                this.f19636x = 1;
                obj = m18569b.m5479o(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13777q.m256L((List) obj);
        }
    }

    public ConsentsManager(ConsentsService consentsService, ConsentsAgent consentsAgent, EncryptedPrefsManager encryptedPrefsManager) {
        Intrinsics.isThisObjectNull(consentsService, "service");
        Intrinsics.isThisObjectNull(consentsAgent, "consentsAgent");
        Intrinsics.isThisObjectNull(encryptedPrefsManager, "encryptedPrefsManager");
        this.f19628a = consentsService;
        this.f19629b = consentsAgent;
        this.f19630c = encryptedPrefsManager;
    }

    /* renamed from: a */
    public static final /* synthetic */ ConsentsAgent m18570a(ConsentsManager consentsManager) {
        return consentsManager.f19629b;
    }

    /* renamed from: b */
    public static final /* synthetic */ ConsentsService m18569b(ConsentsManager consentsManager) {
        return consentsManager.f19628a;
    }

    /* renamed from: c */
    public final Object m18568c(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7400a(str, null), interfaceC1886d);
    }

    /* renamed from: d */
    public final Object m18567d(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7401b(null), interfaceC1886d);
    }

    /* renamed from: e */
    public final Consent m18566e() {
        return this.f19630c.m18422d();
    }

    /* renamed from: f */
    public final Object m18565f(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7402c(null), interfaceC1886d);
    }

    /* renamed from: g */
    public final InterfaceC6785c m18564g() {
        return this.f19629b.m25740E();
    }

    /* renamed from: h */
    public final boolean m18563h(Consent consent) {
        Intrinsics.isThisObjectNull(consent, "consents");
        return this.f19630c.m18415k(consent);
    }
}
