package mg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p276og.C8079b;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.ChangePinSmsRequest;
import pt.pingodoce.app.data.remote.models.request.RecoveryPinRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateSmsCodeRequest;
import vg.PinRecoveryService;

/* renamed from: mg.q0 */
/* loaded from: classes2.dex */
public final class PinRecoveryManager {

    /* renamed from: a */
    private final PinRecoveryService f19612a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinRecoveryManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PinRecoveryManager$changePin$2", m20196f = "PinRecoveryManager.kt", m20195l = {23}, m20194m = "invokeSuspend")
    /* renamed from: mg.q0$a */
    /* loaded from: classes2.dex */
    public static final class C7393a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19613x;

        /* renamed from: z */
        final /* synthetic */ String f19615z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7393a(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19615z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7393a(this.f19615z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7393a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19613x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PinRecoveryService m18596a = PinRecoveryManager.m18596a(PinRecoveryManager.this);
                ChangePinSmsRequest changePinSmsRequest = new ChangePinSmsRequest(this.f19615z);
                this.f19613x = 1;
                if (m18596a.m5366n(changePinSmsRequest, this) == m34636d) {
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
    /* compiled from: PinRecoveryManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PinRecoveryManager$sendPinRecovery$2", m20196f = "PinRecoveryManager.kt", m20195l = {19}, m20194m = "invokeSuspend")
    /* renamed from: mg.q0$b */
    /* loaded from: classes2.dex */
    public static final class C7394b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19616x;

        /* renamed from: z */
        final /* synthetic */ String f19618z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7394b(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19618z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7394b(this.f19618z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7394b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19616x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PinRecoveryService m18596a = PinRecoveryManager.m18596a(PinRecoveryManager.this);
                RecoveryPinRequest recoveryPinRequest = new RecoveryPinRequest(this.f19618z);
                this.f19616x = 1;
                obj = m18596a.m5365o(recoveryPinRequest, this);
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
    /* compiled from: PinRecoveryManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PinRecoveryManager$validateSmsCode$2", m20196f = "PinRecoveryManager.kt", m20195l = {27}, m20194m = "invokeSuspend")
    /* renamed from: mg.q0$c */
    /* loaded from: classes2.dex */
    public static final class C7395c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19619x;

        /* renamed from: z */
        final /* synthetic */ String f19621z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7395c(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19621z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7395c(this.f19621z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7395c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19619x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PinRecoveryService m18596a = PinRecoveryManager.m18596a(PinRecoveryManager.this);
                ValidateSmsCodeRequest validateSmsCodeRequest = new ValidateSmsCodeRequest(this.f19621z);
                this.f19619x = 1;
                obj = m18596a.m5364p(validateSmsCodeRequest, this);
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

    public PinRecoveryManager(PinRecoveryService pinRecoveryService) {
        Intrinsics.isThisObjectNull(pinRecoveryService, "service");
        this.f19612a = pinRecoveryService;
    }

    /* renamed from: a */
    public static final /* synthetic */ PinRecoveryService m18596a(PinRecoveryManager pinRecoveryManager) {
        return pinRecoveryManager.f19612a;
    }

    /* renamed from: b */
    public final Object m18595b(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7393a(str, null), interfaceC1886d);
    }

    /* renamed from: c */
    public final Object m18594c(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7394b(str, null), interfaceC1886d);
    }

    /* renamed from: d */
    public final Object m18593d(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7395c(str, null), interfaceC1886d);
    }
}
