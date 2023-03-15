package p483z5;

import ba.InterfaceC1870a;
import ba.InterfaceC1871b;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import java.io.IOException;
import p011aa.C0095a;

/* renamed from: z5.b */
/* loaded from: classes.dex */
public final class C13659b implements InterfaceC1870a {

    /* renamed from: a */
    public static final InterfaceC1870a f34711a = new C13659b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: z5.b$a */
    /* loaded from: classes.dex */
    private static final class C13660a implements InterfaceC4247b<AbstractC13657a> {

        /* renamed from: a */
        static final C13660a f34712a = new C13660a();

        /* renamed from: b */
        private static final C0095a f34713b = C0095a.m41960d("sdkVersion");

        /* renamed from: c */
        private static final C0095a f34714c = C0095a.m41960d("model");

        /* renamed from: d */
        private static final C0095a f34715d = C0095a.m41960d("hardware");

        /* renamed from: e */
        private static final C0095a f34716e = C0095a.m41960d("device");

        /* renamed from: f */
        private static final C0095a f34717f = C0095a.m41960d("product");

        /* renamed from: g */
        private static final C0095a f34718g = C0095a.m41960d("osBuild");

        /* renamed from: h */
        private static final C0095a f34719h = C0095a.m41960d("manufacturer");

        /* renamed from: i */
        private static final C0095a f34720i = C0095a.m41960d("fingerprint");

        /* renamed from: j */
        private static final C0095a f34721j = C0095a.m41960d("locale");

        /* renamed from: k */
        private static final C0095a f34722k = C0095a.m41960d("country");

        /* renamed from: l */
        private static final C0095a f34723l = C0095a.m41960d("mccMnc");

        /* renamed from: m */
        private static final C0095a f34724m = C0095a.m41960d("applicationBuild");

        private C13660a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC13657a abstractC13657a, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f34713b, abstractC13657a.mo648m());
            interfaceC4248c.mo10212f(f34714c, abstractC13657a.mo651j());
            interfaceC4248c.mo10212f(f34715d, abstractC13657a.mo655f());
            interfaceC4248c.mo10212f(f34716e, abstractC13657a.mo657d());
            interfaceC4248c.mo10212f(f34717f, abstractC13657a.mo649l());
            interfaceC4248c.mo10212f(f34718g, abstractC13657a.mo650k());
            interfaceC4248c.mo10212f(f34719h, abstractC13657a.mo653h());
            interfaceC4248c.mo10212f(f34720i, abstractC13657a.mo656e());
            interfaceC4248c.mo10212f(f34721j, abstractC13657a.mo654g());
            interfaceC4248c.mo10212f(f34722k, abstractC13657a.mo658c());
            interfaceC4248c.mo10212f(f34723l, abstractC13657a.mo652i());
            interfaceC4248c.mo10212f(f34724m, abstractC13657a.mo659b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: z5.b$b */
    /* loaded from: classes.dex */
    private static final class C13661b implements InterfaceC4247b<AbstractC13683j> {

        /* renamed from: a */
        static final C13661b f34725a = new C13661b();

        /* renamed from: b */
        private static final C0095a f34726b = C0095a.m41960d("logRequest");

        private C13661b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC13683j abstractC13683j, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f34726b, abstractC13683j.mo632c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: z5.b$c */
    /* loaded from: classes.dex */
    private static final class C13662c implements InterfaceC4247b<AbstractC13684k> {

        /* renamed from: a */
        static final C13662c f34727a = new C13662c();

        /* renamed from: b */
        private static final C0095a f34728b = C0095a.m41960d("clientType");

        /* renamed from: c */
        private static final C0095a f34729c = C0095a.m41960d("androidClientInfo");

        private C13662c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC13684k abstractC13684k, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f34728b, abstractC13684k.mo629c());
            interfaceC4248c.mo10212f(f34729c, abstractC13684k.mo630b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: z5.b$d */
    /* loaded from: classes.dex */
    private static final class C13663d implements InterfaceC4247b<AbstractC13687l> {

        /* renamed from: a */
        static final C13663d f34730a = new C13663d();

        /* renamed from: b */
        private static final C0095a f34731b = C0095a.m41960d("eventTimeMs");

        /* renamed from: c */
        private static final C0095a f34732c = C0095a.m41960d("eventCode");

        /* renamed from: d */
        private static final C0095a f34733d = C0095a.m41960d("eventUptimeMs");

        /* renamed from: e */
        private static final C0095a f34734e = C0095a.m41960d("sourceExtension");

        /* renamed from: f */
        private static final C0095a f34735f = C0095a.m41960d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C0095a f34736g = C0095a.m41960d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C0095a f34737h = C0095a.m41960d("networkConnectionInfo");

        private C13663d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC13687l abstractC13687l, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10215c(f34731b, abstractC13687l.mo623c());
            interfaceC4248c.mo10212f(f34732c, abstractC13687l.mo624b());
            interfaceC4248c.mo10215c(f34733d, abstractC13687l.mo622d());
            interfaceC4248c.mo10212f(f34734e, abstractC13687l.mo620f());
            interfaceC4248c.mo10212f(f34735f, abstractC13687l.mo619g());
            interfaceC4248c.mo10215c(f34736g, abstractC13687l.mo618h());
            interfaceC4248c.mo10212f(f34737h, abstractC13687l.mo621e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: z5.b$e */
    /* loaded from: classes.dex */
    private static final class C13664e implements InterfaceC4247b<AbstractC13689m> {

        /* renamed from: a */
        static final C13664e f34738a = new C13664e();

        /* renamed from: b */
        private static final C0095a f34739b = C0095a.m41960d("requestTimeMs");

        /* renamed from: c */
        private static final C0095a f34740c = C0095a.m41960d("requestUptimeMs");

        /* renamed from: d */
        private static final C0095a f34741d = C0095a.m41960d("clientInfo");

        /* renamed from: e */
        private static final C0095a f34742e = C0095a.m41960d("logSource");

        /* renamed from: f */
        private static final C0095a f34743f = C0095a.m41960d("logSourceName");

        /* renamed from: g */
        private static final C0095a f34744g = C0095a.m41960d("logEvent");

        /* renamed from: h */
        private static final C0095a f34745h = C0095a.m41960d("qosTier");

        private C13664e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC13689m abstractC13689m, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10215c(f34739b, abstractC13689m.mo601g());
            interfaceC4248c.mo10215c(f34740c, abstractC13689m.mo600h());
            interfaceC4248c.mo10212f(f34741d, abstractC13689m.mo606b());
            interfaceC4248c.mo10212f(f34742e, abstractC13689m.mo604d());
            interfaceC4248c.mo10212f(f34743f, abstractC13689m.mo603e());
            interfaceC4248c.mo10212f(f34744g, abstractC13689m.mo605c());
            interfaceC4248c.mo10212f(f34745h, abstractC13689m.mo602f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: z5.b$f */
    /* loaded from: classes.dex */
    private static final class C13665f implements InterfaceC4247b<AbstractC13692o> {

        /* renamed from: a */
        static final C13665f f34746a = new C13665f();

        /* renamed from: b */
        private static final C0095a f34747b = C0095a.m41960d("networkType");

        /* renamed from: c */
        private static final C0095a f34748c = C0095a.m41960d("mobileSubtype");

        private C13665f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC13692o abstractC13692o, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f34747b, abstractC13692o.mo584c());
            interfaceC4248c.mo10212f(f34748c, abstractC13692o.mo585b());
        }
    }

    private C13659b() {
    }

    @Override // ba.InterfaceC1870a
    /* renamed from: a */
    public void mo667a(InterfaceC1871b<?> interfaceC1871b) {
        C13661b c13661b = C13661b.f34725a;
        interfaceC1871b.mo10198a(AbstractC13683j.class, c13661b);
        interfaceC1871b.mo10198a(C13669d.class, c13661b);
        C13664e c13664e = C13664e.f34738a;
        interfaceC1871b.mo10198a(AbstractC13689m.class, c13664e);
        interfaceC1871b.mo10198a(C13676g.class, c13664e);
        C13662c c13662c = C13662c.f34727a;
        interfaceC1871b.mo10198a(AbstractC13684k.class, c13662c);
        interfaceC1871b.mo10198a(C13670e.class, c13662c);
        C13660a c13660a = C13660a.f34712a;
        interfaceC1871b.mo10198a(AbstractC13657a.class, c13660a);
        interfaceC1871b.mo10198a(C13666c.class, c13660a);
        C13663d c13663d = C13663d.f34730a;
        interfaceC1871b.mo10198a(AbstractC13687l.class, c13663d);
        interfaceC1871b.mo10198a(C13673f.class, c13663d);
        C13665f c13665f = C13665f.f34746a;
        interfaceC1871b.mo10198a(AbstractC13692o.class, c13665f);
        interfaceC1871b.mo10198a(C13680i.class, c13665f);
    }
}
