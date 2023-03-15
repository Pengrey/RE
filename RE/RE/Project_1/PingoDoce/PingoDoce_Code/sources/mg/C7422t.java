package mg;

import p066dg.ConsentsAgent;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.ConsentsService;

/* renamed from: mg.t */
/* loaded from: classes2.dex */
public final class C7422t implements InterfaceC11614c<ConsentsManager> {

    /* renamed from: a */
    private final InterfaceC12341a<ConsentsService> f19695a;

    /* renamed from: b */
    private final InterfaceC12341a<ConsentsAgent> f19696b;

    /* renamed from: c */
    private final InterfaceC12341a<EncryptedPrefsManager> f19697c;

    public C7422t(InterfaceC12341a<ConsentsService> interfaceC12341a, InterfaceC12341a<ConsentsAgent> interfaceC12341a2, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a3) {
        this.f19695a = interfaceC12341a;
        this.f19696b = interfaceC12341a2;
        this.f19697c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C7422t m18472a(InterfaceC12341a<ConsentsService> interfaceC12341a, InterfaceC12341a<ConsentsAgent> interfaceC12341a2, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a3) {
        return new C7422t(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static ConsentsManager m18470c(ConsentsService consentsService, ConsentsAgent consentsAgent, EncryptedPrefsManager encryptedPrefsManager) {
        return new ConsentsManager(consentsService, consentsAgent, encryptedPrefsManager);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ConsentsManager mo42226get() {
        return m18470c(this.f19695a.mo42226get(), this.f19696b.mo42226get(), this.f19697c.mo42226get());
    }
}
