package mg;

import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.EmailService;

/* renamed from: mg.w */
/* loaded from: classes2.dex */
public final class C7466w implements InterfaceC11614c<EmailManager> {

    /* renamed from: a */
    private final InterfaceC12341a<EmailService> f19753a;

    public C7466w(InterfaceC12341a<EmailService> interfaceC12341a) {
        this.f19753a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C7466w m18436a(InterfaceC12341a<EmailService> interfaceC12341a) {
        return new C7466w(interfaceC12341a);
    }

    /* renamed from: c */
    public static EmailManager m18434c(EmailService emailService) {
        return new EmailManager(emailService);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public EmailManager mo42226get() {
        return m18434c(this.f19753a.mo42226get());
    }
}
