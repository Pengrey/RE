package p321qk;

import androidx.lifecycle.C1459l0;
import mg.AuthManager;
import mg.C7405s1;
import mg.EmailManager;
import mg.PinRecoveryManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel;

/* renamed from: qk.d */
/* loaded from: classes2.dex */
public final class C9759d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f25677a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f25678b;

    /* renamed from: c */
    private final InterfaceC12341a<PinRecoveryManager> f25679c;

    /* renamed from: d */
    private final InterfaceC12341a<EmailManager> f25680d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f25681e;

    /* renamed from: f */
    private final InterfaceC12341a<C7405s1> f25682f;

    public C9759d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<PinRecoveryManager> interfaceC12341a3, InterfaceC12341a<EmailManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5, InterfaceC12341a<C7405s1> interfaceC12341a6) {
        this.f25677a = interfaceC12341a;
        this.f25678b = interfaceC12341a2;
        this.f25679c = interfaceC12341a3;
        this.f25680d = interfaceC12341a4;
        this.f25681e = interfaceC12341a5;
        this.f25682f = interfaceC12341a6;
    }

    /* renamed from: a */
    public static C9759d m10007a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<PinRecoveryManager> interfaceC12341a3, InterfaceC12341a<EmailManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5, InterfaceC12341a<C7405s1> interfaceC12341a6) {
        return new C9759d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6);
    }

    /* renamed from: c */
    public static PinRecoverViewModel m10005c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, PinRecoveryManager pinRecoveryManager, EmailManager emailManager, C7405s1 c7405s1) {
        return new PinRecoverViewModel(c1459l0, resourcesProvider, authManager, pinRecoveryManager, emailManager, c7405s1);
    }

    /* renamed from: b */
    public PinRecoverViewModel m10006b(C1459l0 c1459l0) {
        PinRecoverViewModel m10005c = m10005c(c1459l0, this.f25677a.mo42226get(), this.f25678b.mo42226get(), this.f25679c.mo42226get(), this.f25680d.mo42226get(), this.f25681e.mo42226get());
        C13886p.m94a(m10005c, this.f25682f.mo42226get());
        return m10005c;
    }
}
