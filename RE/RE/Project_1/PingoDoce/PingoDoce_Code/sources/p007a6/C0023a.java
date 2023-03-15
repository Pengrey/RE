package p007a6;

import ba.InterfaceC1870a;
import ba.InterfaceC1871b;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import java.io.IOException;
import p011aa.C0095a;
import p061da.C4755a;
import p077e6.C4987a;
import p077e6.C4989b;
import p077e6.C4991c;
import p077e6.C4994d;
import p077e6.C4996e;
import p077e6.C4998f;

/* renamed from: a6.a */
/* loaded from: classes.dex */
public final class C0023a implements InterfaceC1870a {

    /* renamed from: a */
    public static final InterfaceC1870a f89a = new C0023a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: a6.a$a */
    /* loaded from: classes.dex */
    private static final class C0024a implements InterfaceC4247b<C4987a> {

        /* renamed from: a */
        static final C0024a f90a = new C0024a();

        /* renamed from: b */
        private static final C0095a f91b = C0095a.m41963a("window").m41958b(C4755a.m26692b().m26691c(1).m26693a()).m41959a();

        /* renamed from: c */
        private static final C0095a f92c = C0095a.m41963a("logSourceMetrics").m41958b(C4755a.m26692b().m26691c(2).m26693a()).m41959a();

        /* renamed from: d */
        private static final C0095a f93d = C0095a.m41963a("globalMetrics").m41958b(C4755a.m26692b().m26691c(3).m26693a()).m41959a();

        /* renamed from: e */
        private static final C0095a f94e = C0095a.m41963a("appNamespace").m41958b(C4755a.m26692b().m26691c(4).m26693a()).m41959a();

        private C0024a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(C4987a c4987a, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f91b, c4987a.m25958d());
            interfaceC4248c.mo10212f(f92c, c4987a.m25959c());
            interfaceC4248c.mo10212f(f93d, c4987a.m25960b());
            interfaceC4248c.mo10212f(f94e, c4987a.m25961a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: a6.a$b */
    /* loaded from: classes.dex */
    private static final class C0025b implements InterfaceC4247b<C4989b> {

        /* renamed from: a */
        static final C0025b f95a = new C0025b();

        /* renamed from: b */
        private static final C0095a f96b = C0095a.m41963a("storageMetrics").m41958b(C4755a.m26692b().m26691c(1).m26693a()).m41959a();

        private C0025b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(C4989b c4989b, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f96b, c4989b.m25950a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: a6.a$c */
    /* loaded from: classes.dex */
    private static final class C0026c implements InterfaceC4247b<C4991c> {

        /* renamed from: a */
        static final C0026c f97a = new C0026c();

        /* renamed from: b */
        private static final C0095a f98b = C0095a.m41963a("eventsDroppedCount").m41958b(C4755a.m26692b().m26691c(1).m26693a()).m41959a();

        /* renamed from: c */
        private static final C0095a f99c = C0095a.m41963a("reason").m41958b(C4755a.m26692b().m26691c(3).m26693a()).m41959a();

        private C0026c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(C4991c c4991c, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10215c(f98b, c4991c.m25946a());
            interfaceC4248c.mo10212f(f99c, c4991c.m25945b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: a6.a$d */
    /* loaded from: classes.dex */
    private static final class C0027d implements InterfaceC4247b<C4994d> {

        /* renamed from: a */
        static final C0027d f100a = new C0027d();

        /* renamed from: b */
        private static final C0095a f101b = C0095a.m41963a("logSource").m41958b(C4755a.m26692b().m26691c(1).m26693a()).m41959a();

        /* renamed from: c */
        private static final C0095a f102c = C0095a.m41963a("logEventDropped").m41958b(C4755a.m26692b().m26691c(2).m26693a()).m41959a();

        private C0027d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(C4994d c4994d, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f101b, c4994d.m25939b());
            interfaceC4248c.mo10212f(f102c, c4994d.m25940a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: a6.a$e */
    /* loaded from: classes.dex */
    private static final class C0028e implements InterfaceC4247b<AbstractC0051l> {

        /* renamed from: a */
        static final C0028e f103a = new C0028e();

        /* renamed from: b */
        private static final C0095a f104b = C0095a.m41960d("clientMetrics");

        private C0028e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC0051l abstractC0051l, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f104b, abstractC0051l.m42059b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: a6.a$f */
    /* loaded from: classes.dex */
    private static final class C0029f implements InterfaceC4247b<C4996e> {

        /* renamed from: a */
        static final C0029f f105a = new C0029f();

        /* renamed from: b */
        private static final C0095a f106b = C0095a.m41963a("currentCacheSizeBytes").m41958b(C4755a.m26692b().m26691c(1).m26693a()).m41959a();

        /* renamed from: c */
        private static final C0095a f107c = C0095a.m41963a("maxCacheSizeBytes").m41958b(C4755a.m26692b().m26691c(2).m26693a()).m41959a();

        private C0029f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(C4996e c4996e, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10215c(f106b, c4996e.m25934a());
            interfaceC4248c.mo10215c(f107c, c4996e.m25933b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: a6.a$g */
    /* loaded from: classes.dex */
    private static final class C0030g implements InterfaceC4247b<C4998f> {

        /* renamed from: a */
        static final C0030g f108a = new C0030g();

        /* renamed from: b */
        private static final C0095a f109b = C0095a.m41963a("startMs").m41958b(C4755a.m26692b().m26691c(1).m26693a()).m41959a();

        /* renamed from: c */
        private static final C0095a f110c = C0095a.m41963a("endMs").m41958b(C4755a.m26692b().m26691c(2).m26693a()).m41959a();

        private C0030g() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(C4998f c4998f, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10215c(f109b, c4998f.m25927b());
            interfaceC4248c.mo10215c(f110c, c4998f.m25928a());
        }
    }

    private C0023a() {
    }

    @Override // ba.InterfaceC1870a
    /* renamed from: a */
    public void mo667a(InterfaceC1871b<?> interfaceC1871b) {
        interfaceC1871b.mo10198a(AbstractC0051l.class, C0028e.f103a);
        interfaceC1871b.mo10198a(C4987a.class, C0024a.f90a);
        interfaceC1871b.mo10198a(C4998f.class, C0030g.f108a);
        interfaceC1871b.mo10198a(C4994d.class, C0027d.f100a);
        interfaceC1871b.mo10198a(C4991c.class, C0026c.f97a);
        interfaceC1871b.mo10198a(C4989b.class, C0025b.f95a);
        interfaceC1871b.mo10198a(C4996e.class, C0029f.f105a);
    }
}
