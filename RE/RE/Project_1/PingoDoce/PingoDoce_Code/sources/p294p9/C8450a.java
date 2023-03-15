package p294p9;

import ba.InterfaceC1870a;
import ba.InterfaceC1871b;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import java.io.IOException;
import p011aa.C0095a;
import p294p9.AbstractC8472a0;

/* renamed from: p9.a */
/* loaded from: classes.dex */
public final class C8450a implements InterfaceC1870a {

    /* renamed from: a */
    public static final InterfaceC1870a f21851a = new C8450a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$a */
    /* loaded from: classes.dex */
    private static final class C8451a implements InterfaceC4247b<AbstractC8472a0.AbstractC8473a> {

        /* renamed from: a */
        static final C8451a f21852a = new C8451a();

        /* renamed from: b */
        private static final C0095a f21853b = C0095a.m41960d("pid");

        /* renamed from: c */
        private static final C0095a f21854c = C0095a.m41960d("processName");

        /* renamed from: d */
        private static final C0095a f21855d = C0095a.m41960d("reasonCode");

        /* renamed from: e */
        private static final C0095a f21856e = C0095a.m41960d("importance");

        /* renamed from: f */
        private static final C0095a f21857f = C0095a.m41960d("pss");

        /* renamed from: g */
        private static final C0095a f21858g = C0095a.m41960d("rss");

        /* renamed from: h */
        private static final C0095a f21859h = C0095a.m41960d("timestamp");

        /* renamed from: i */
        private static final C0095a f21860i = C0095a.m41960d("traceFile");

        private C8451a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8473a abstractC8473a, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10216b(f21853b, abstractC8473a.mo15314c());
            interfaceC4248c.mo10212f(f21854c, abstractC8473a.mo15313d());
            interfaceC4248c.mo10216b(f21855d, abstractC8473a.mo15311f());
            interfaceC4248c.mo10216b(f21856e, abstractC8473a.mo15315b());
            interfaceC4248c.mo10215c(f21857f, abstractC8473a.mo15312e());
            interfaceC4248c.mo10215c(f21858g, abstractC8473a.mo15310g());
            interfaceC4248c.mo10215c(f21859h, abstractC8473a.mo15309h());
            interfaceC4248c.mo10212f(f21860i, abstractC8473a.mo15308i());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$b */
    /* loaded from: classes.dex */
    private static final class C8452b implements InterfaceC4247b<AbstractC8472a0.AbstractC8476c> {

        /* renamed from: a */
        static final C8452b f21861a = new C8452b();

        /* renamed from: b */
        private static final C0095a f21862b = C0095a.m41960d("key");

        /* renamed from: c */
        private static final C0095a f21863c = C0095a.m41960d("value");

        private C8452b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8476c abstractC8476c, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21862b, abstractC8476c.mo15294b());
            interfaceC4248c.mo10212f(f21863c, abstractC8476c.mo15293c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$c */
    /* loaded from: classes.dex */
    private static final class C8453c implements InterfaceC4247b<AbstractC8472a0> {

        /* renamed from: a */
        static final C8453c f21864a = new C8453c();

        /* renamed from: b */
        private static final C0095a f21865b = C0095a.m41960d("sdkVersion");

        /* renamed from: c */
        private static final C0095a f21866c = C0095a.m41960d("gmpAppId");

        /* renamed from: d */
        private static final C0095a f21867d = C0095a.m41960d("platform");

        /* renamed from: e */
        private static final C0095a f21868e = C0095a.m41960d("installationUuid");

        /* renamed from: f */
        private static final C0095a f21869f = C0095a.m41960d("buildVersion");

        /* renamed from: g */
        private static final C0095a f21870g = C0095a.m41960d("displayVersion");

        /* renamed from: h */
        private static final C0095a f21871h = C0095a.m41960d("session");

        /* renamed from: i */
        private static final C0095a f21872i = C0095a.m41960d("ndkPayload");

        private C8453c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0 abstractC8472a0, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21865b, abstractC8472a0.mo15329i());
            interfaceC4248c.mo10212f(f21866c, abstractC8472a0.mo15333e());
            interfaceC4248c.mo10216b(f21867d, abstractC8472a0.mo15330h());
            interfaceC4248c.mo10212f(f21868e, abstractC8472a0.mo15332f());
            interfaceC4248c.mo10212f(f21869f, abstractC8472a0.mo15335c());
            interfaceC4248c.mo10212f(f21870g, abstractC8472a0.mo15334d());
            interfaceC4248c.mo10212f(f21871h, abstractC8472a0.mo15328j());
            interfaceC4248c.mo10212f(f21872i, abstractC8472a0.mo15331g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$d */
    /* loaded from: classes.dex */
    private static final class C8454d implements InterfaceC4247b<AbstractC8472a0.AbstractC8478d> {

        /* renamed from: a */
        static final C8454d f21873a = new C8454d();

        /* renamed from: b */
        private static final C0095a f21874b = C0095a.m41960d("files");

        /* renamed from: c */
        private static final C0095a f21875c = C0095a.m41960d("orgId");

        private C8454d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8478d abstractC8478d, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21874b, abstractC8478d.mo15289b());
            interfaceC4248c.mo10212f(f21875c, abstractC8478d.mo15288c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$e */
    /* loaded from: classes.dex */
    private static final class C8455e implements InterfaceC4247b<AbstractC8472a0.AbstractC8478d.AbstractC8480b> {

        /* renamed from: a */
        static final C8455e f21876a = new C8455e();

        /* renamed from: b */
        private static final C0095a f21877b = C0095a.m41960d("filename");

        /* renamed from: c */
        private static final C0095a f21878c = C0095a.m41960d("contents");

        private C8455e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8478d.AbstractC8480b abstractC8480b, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21877b, abstractC8480b.mo15283c());
            interfaceC4248c.mo10212f(f21878c, abstractC8480b.mo15284b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$f */
    /* loaded from: classes.dex */
    private static final class C8456f implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8483a> {

        /* renamed from: a */
        static final C8456f f21879a = new C8456f();

        /* renamed from: b */
        private static final C0095a f21880b = C0095a.m41960d("identifier");

        /* renamed from: c */
        private static final C0095a f21881c = C0095a.m41960d("version");

        /* renamed from: d */
        private static final C0095a f21882d = C0095a.m41960d("displayVersion");

        /* renamed from: e */
        private static final C0095a f21883e = C0095a.m41960d("organization");

        /* renamed from: f */
        private static final C0095a f21884f = C0095a.m41960d("installationUuid");

        /* renamed from: g */
        private static final C0095a f21885g = C0095a.m41960d("developmentPlatform");

        /* renamed from: h */
        private static final C0095a f21886h = C0095a.m41960d("developmentPlatformVersion");

        private C8456f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8483a abstractC8483a, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21880b, abstractC8483a.mo15252e());
            interfaceC4248c.mo10212f(f21881c, abstractC8483a.mo15249h());
            interfaceC4248c.mo10212f(f21882d, abstractC8483a.mo15253d());
            interfaceC4248c.mo10212f(f21883e, abstractC8483a.mo15250g());
            interfaceC4248c.mo10212f(f21884f, abstractC8483a.mo15251f());
            interfaceC4248c.mo10212f(f21885g, abstractC8483a.mo15255b());
            interfaceC4248c.mo10212f(f21886h, abstractC8483a.mo15254c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$g */
    /* loaded from: classes.dex */
    private static final class C8457g implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b> {

        /* renamed from: a */
        static final C8457g f21887a = new C8457g();

        /* renamed from: b */
        private static final C0095a f21888b = C0095a.m41960d("clsId");

        private C8457g() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b abstractC8485b, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21888b, abstractC8485b.mo15241a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$h */
    /* loaded from: classes.dex */
    private static final class C8458h implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8487c> {

        /* renamed from: a */
        static final C8458h f21889a = new C8458h();

        /* renamed from: b */
        private static final C0095a f21890b = C0095a.m41960d("arch");

        /* renamed from: c */
        private static final C0095a f21891c = C0095a.m41960d("model");

        /* renamed from: d */
        private static final C0095a f21892d = C0095a.m41960d("cores");

        /* renamed from: e */
        private static final C0095a f21893e = C0095a.m41960d("ram");

        /* renamed from: f */
        private static final C0095a f21894f = C0095a.m41960d("diskSpace");

        /* renamed from: g */
        private static final C0095a f21895g = C0095a.m41960d("simulator");

        /* renamed from: h */
        private static final C0095a f21896h = C0095a.m41960d("state");

        /* renamed from: i */
        private static final C0095a f21897i = C0095a.m41960d("manufacturer");

        /* renamed from: j */
        private static final C0095a f21898j = C0095a.m41960d("modelClass");

        private C8458h() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8487c abstractC8487c, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10216b(f21890b, abstractC8487c.mo15240b());
            interfaceC4248c.mo10212f(f21891c, abstractC8487c.mo15236f());
            interfaceC4248c.mo10216b(f21892d, abstractC8487c.mo15239c());
            interfaceC4248c.mo10215c(f21893e, abstractC8487c.mo15234h());
            interfaceC4248c.mo10215c(f21894f, abstractC8487c.mo15238d());
            interfaceC4248c.mo10217a(f21895g, abstractC8487c.mo15232j());
            interfaceC4248c.mo10216b(f21896h, abstractC8487c.mo15233i());
            interfaceC4248c.mo10212f(f21897i, abstractC8487c.mo15237e());
            interfaceC4248c.mo10212f(f21898j, abstractC8487c.mo15235g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$i */
    /* loaded from: classes.dex */
    private static final class C8459i implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e> {

        /* renamed from: a */
        static final C8459i f21899a = new C8459i();

        /* renamed from: b */
        private static final C0095a f21900b = C0095a.m41960d("generator");

        /* renamed from: c */
        private static final C0095a f21901c = C0095a.m41960d("identifier");

        /* renamed from: d */
        private static final C0095a f21902d = C0095a.m41960d("startedAt");

        /* renamed from: e */
        private static final C0095a f21903e = C0095a.m41960d("endedAt");

        /* renamed from: f */
        private static final C0095a f21904f = C0095a.m41960d("crashed");

        /* renamed from: g */
        private static final C0095a f21905g = C0095a.m41960d("app");

        /* renamed from: h */
        private static final C0095a f21906h = C0095a.m41960d("user");

        /* renamed from: i */
        private static final C0095a f21907i = C0095a.m41960d("os");

        /* renamed from: j */
        private static final C0095a f21908j = C0095a.m41960d("device");

        /* renamed from: k */
        private static final C0095a f21909k = C0095a.m41960d("events");

        /* renamed from: l */
        private static final C0095a f21910l = C0095a.m41960d("generatorType");

        private C8459i() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e abstractC8482e, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21900b, abstractC8482e.mo15275f());
            interfaceC4248c.mo10212f(f21901c, abstractC8482e.m15355i());
            interfaceC4248c.mo10215c(f21902d, abstractC8482e.mo15271k());
            interfaceC4248c.mo10212f(f21903e, abstractC8482e.mo15277d());
            interfaceC4248c.mo10217a(f21904f, abstractC8482e.mo15269m());
            interfaceC4248c.mo10212f(f21905g, abstractC8482e.mo15279b());
            interfaceC4248c.mo10212f(f21906h, abstractC8482e.mo15270l());
            interfaceC4248c.mo10212f(f21907i, abstractC8482e.mo15272j());
            interfaceC4248c.mo10212f(f21908j, abstractC8482e.mo15278c());
            interfaceC4248c.mo10212f(f21909k, abstractC8482e.mo15276e());
            interfaceC4248c.mo10216b(f21910l, abstractC8482e.mo15274g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$j */
    /* loaded from: classes.dex */
    private static final class C8460j implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a> {

        /* renamed from: a */
        static final C8460j f21911a = new C8460j();

        /* renamed from: b */
        private static final C0095a f21912b = C0095a.m41960d("execution");

        /* renamed from: c */
        private static final C0095a f21913c = C0095a.m41960d("customAttributes");

        /* renamed from: d */
        private static final C0095a f21914d = C0095a.m41960d("internalKeys");

        /* renamed from: e */
        private static final C0095a f21915e = C0095a.m41960d("background");

        /* renamed from: f */
        private static final C0095a f21916f = C0095a.m41960d("uiOrientation");

        private C8460j() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a abstractC8490a, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21912b, abstractC8490a.mo15207d());
            interfaceC4248c.mo10212f(f21913c, abstractC8490a.mo15208c());
            interfaceC4248c.mo10212f(f21914d, abstractC8490a.mo15206e());
            interfaceC4248c.mo10212f(f21915e, abstractC8490a.mo15209b());
            interfaceC4248c.mo10216b(f21916f, abstractC8490a.mo15205f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$k */
    /* loaded from: classes.dex */
    private static final class C8461k implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a> {

        /* renamed from: a */
        static final C8461k f21917a = new C8461k();

        /* renamed from: b */
        private static final C0095a f21918b = C0095a.m41960d("baseAddress");

        /* renamed from: c */
        private static final C0095a f21919c = C0095a.m41960d("size");

        /* renamed from: d */
        private static final C0095a f21920d = C0095a.m41960d("name");

        /* renamed from: e */
        private static final C0095a f21921e = C0095a.m41960d("uuid");

        private C8461k() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a abstractC8493a, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10215c(f21918b, abstractC8493a.mo15186b());
            interfaceC4248c.mo10215c(f21919c, abstractC8493a.mo15184d());
            interfaceC4248c.mo10212f(f21920d, abstractC8493a.mo15185c());
            interfaceC4248c.mo10212f(f21921e, abstractC8493a.m15345f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$l */
    /* loaded from: classes.dex */
    private static final class C8462l implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b> {

        /* renamed from: a */
        static final C8462l f21922a = new C8462l();

        /* renamed from: b */
        private static final C0095a f21923b = C0095a.m41960d("threads");

        /* renamed from: c */
        private static final C0095a f21924c = C0095a.m41960d("exception");

        /* renamed from: d */
        private static final C0095a f21925d = C0095a.m41960d("appExitInfo");

        /* renamed from: e */
        private static final C0095a f21926e = C0095a.m41960d("signal");

        /* renamed from: f */
        private static final C0095a f21927f = C0095a.m41960d("binaries");

        private C8462l() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b abstractC8492b, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21923b, abstractC8492b.mo15193f());
            interfaceC4248c.mo10212f(f21924c, abstractC8492b.mo15195d());
            interfaceC4248c.mo10212f(f21925d, abstractC8492b.mo15197b());
            interfaceC4248c.mo10212f(f21926e, abstractC8492b.mo15194e());
            interfaceC4248c.mo10212f(f21927f, abstractC8492b.mo15196c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$m */
    /* loaded from: classes.dex */
    private static final class C8463m implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c> {

        /* renamed from: a */
        static final C8463m f21928a = new C8463m();

        /* renamed from: b */
        private static final C0095a f21929b = C0095a.m41960d("type");

        /* renamed from: c */
        private static final C0095a f21930c = C0095a.m41960d("reason");

        /* renamed from: d */
        private static final C0095a f21931d = C0095a.m41960d("frames");

        /* renamed from: e */
        private static final C0095a f21932e = C0095a.m41960d("causedBy");

        /* renamed from: f */
        private static final C0095a f21933f = C0095a.m41960d("overflowCount");

        private C8463m() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21929b, abstractC8496c.mo15173f());
            interfaceC4248c.mo10212f(f21930c, abstractC8496c.mo15174e());
            interfaceC4248c.mo10212f(f21931d, abstractC8496c.mo15176c());
            interfaceC4248c.mo10212f(f21932e, abstractC8496c.mo15177b());
            interfaceC4248c.mo10216b(f21933f, abstractC8496c.mo15175d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$n */
    /* loaded from: classes.dex */
    private static final class C8464n implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d> {

        /* renamed from: a */
        static final C8464n f21934a = new C8464n();

        /* renamed from: b */
        private static final C0095a f21935b = C0095a.m41960d("name");

        /* renamed from: c */
        private static final C0095a f21936c = C0095a.m41960d("code");

        /* renamed from: d */
        private static final C0095a f21937d = C0095a.m41960d("address");

        private C8464n() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d abstractC8498d, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21935b, abstractC8498d.mo15164d());
            interfaceC4248c.mo10212f(f21936c, abstractC8498d.mo15165c());
            interfaceC4248c.mo10215c(f21937d, abstractC8498d.mo15166b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$o */
    /* loaded from: classes.dex */
    private static final class C8465o implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> {

        /* renamed from: a */
        static final C8465o f21938a = new C8465o();

        /* renamed from: b */
        private static final C0095a f21939b = C0095a.m41960d("name");

        /* renamed from: c */
        private static final C0095a f21940c = C0095a.m41960d("importance");

        /* renamed from: d */
        private static final C0095a f21941d = C0095a.m41960d("frames");

        private C8465o() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e abstractC8500e, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21939b, abstractC8500e.mo15157d());
            interfaceC4248c.mo10216b(f21940c, abstractC8500e.mo15158c());
            interfaceC4248c.mo10212f(f21941d, abstractC8500e.mo15159b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$p */
    /* loaded from: classes.dex */
    private static final class C8466p implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> {

        /* renamed from: a */
        static final C8466p f21942a = new C8466p();

        /* renamed from: b */
        private static final C0095a f21943b = C0095a.m41960d("pc");

        /* renamed from: c */
        private static final C0095a f21944c = C0095a.m41960d("symbol");

        /* renamed from: d */
        private static final C0095a f21945d = C0095a.m41960d("file");

        /* renamed from: e */
        private static final C0095a f21946e = C0095a.m41960d("offset");

        /* renamed from: f */
        private static final C0095a f21947f = C0095a.m41960d("importance");

        private C8466p() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b abstractC8502b, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10215c(f21943b, abstractC8502b.mo15149e());
            interfaceC4248c.mo10212f(f21944c, abstractC8502b.mo15148f());
            interfaceC4248c.mo10212f(f21945d, abstractC8502b.mo15152b());
            interfaceC4248c.mo10215c(f21946e, abstractC8502b.mo15150d());
            interfaceC4248c.mo10216b(f21947f, abstractC8502b.mo15151c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$q */
    /* loaded from: classes.dex */
    private static final class C8467q implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c> {

        /* renamed from: a */
        static final C8467q f21948a = new C8467q();

        /* renamed from: b */
        private static final C0095a f21949b = C0095a.m41960d("batteryLevel");

        /* renamed from: c */
        private static final C0095a f21950c = C0095a.m41960d("batteryVelocity");

        /* renamed from: d */
        private static final C0095a f21951d = C0095a.m41960d("proximityOn");

        /* renamed from: e */
        private static final C0095a f21952e = C0095a.m41960d("orientation");

        /* renamed from: f */
        private static final C0095a f21953f = C0095a.m41960d("ramUsed");

        /* renamed from: g */
        private static final C0095a f21954g = C0095a.m41960d("diskUsed");

        private C8467q() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c abstractC8505c, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21949b, abstractC8505c.mo15141b());
            interfaceC4248c.mo10216b(f21950c, abstractC8505c.mo15140c());
            interfaceC4248c.mo10217a(f21951d, abstractC8505c.mo15136g());
            interfaceC4248c.mo10216b(f21952e, abstractC8505c.mo15138e());
            interfaceC4248c.mo10215c(f21953f, abstractC8505c.mo15137f());
            interfaceC4248c.mo10215c(f21954g, abstractC8505c.mo15139d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$r */
    /* loaded from: classes.dex */
    private static final class C8468r implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d> {

        /* renamed from: a */
        static final C8468r f21955a = new C8468r();

        /* renamed from: b */
        private static final C0095a f21956b = C0095a.m41960d("timestamp");

        /* renamed from: c */
        private static final C0095a f21957c = C0095a.m41960d("type");

        /* renamed from: d */
        private static final C0095a f21958d = C0095a.m41960d("app");

        /* renamed from: e */
        private static final C0095a f21959e = C0095a.m41960d("device");

        /* renamed from: f */
        private static final C0095a f21960f = C0095a.m41960d("log");

        private C8468r() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d abstractC8489d, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10215c(f21956b, abstractC8489d.mo15218e());
            interfaceC4248c.mo10212f(f21957c, abstractC8489d.mo15217f());
            interfaceC4248c.mo10212f(f21958d, abstractC8489d.mo15221b());
            interfaceC4248c.mo10212f(f21959e, abstractC8489d.mo15220c());
            interfaceC4248c.mo10212f(f21960f, abstractC8489d.mo15219d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$s */
    /* loaded from: classes.dex */
    private static final class C8469s implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d> {

        /* renamed from: a */
        static final C8469s f21961a = new C8469s();

        /* renamed from: b */
        private static final C0095a f21962b = C0095a.m41960d("content");

        private C8469s() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d abstractC8507d, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21962b, abstractC8507d.mo15128b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$t */
    /* loaded from: classes.dex */
    private static final class C8470t implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8509e> {

        /* renamed from: a */
        static final C8470t f21963a = new C8470t();

        /* renamed from: b */
        private static final C0095a f21964b = C0095a.m41960d("platform");

        /* renamed from: c */
        private static final C0095a f21965c = C0095a.m41960d("version");

        /* renamed from: d */
        private static final C0095a f21966d = C0095a.m41960d("buildVersion");

        /* renamed from: e */
        private static final C0095a f21967e = C0095a.m41960d("jailbroken");

        private C8470t() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8509e abstractC8509e, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10216b(f21964b, abstractC8509e.mo15124c());
            interfaceC4248c.mo10212f(f21965c, abstractC8509e.mo15123d());
            interfaceC4248c.mo10212f(f21966d, abstractC8509e.mo15125b());
            interfaceC4248c.mo10217a(f21967e, abstractC8509e.mo15122e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: p9.a$u */
    /* loaded from: classes.dex */
    private static final class C8471u implements InterfaceC4247b<AbstractC8472a0.AbstractC8482e.AbstractC8511f> {

        /* renamed from: a */
        static final C8471u f21968a = new C8471u();

        /* renamed from: b */
        private static final C0095a f21969b = C0095a.m41960d("identifier");

        private C8471u() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4247b
        /* renamed from: b */
        public void mo661a(AbstractC8472a0.AbstractC8482e.AbstractC8511f abstractC8511f, InterfaceC4248c interfaceC4248c) throws IOException {
            interfaceC4248c.mo10212f(f21969b, abstractC8511f.mo15116b());
        }
    }

    private C8450a() {
    }

    @Override // ba.InterfaceC1870a
    /* renamed from: a */
    public void mo667a(InterfaceC1871b<?> interfaceC1871b) {
        C8453c c8453c = C8453c.f21864a;
        interfaceC1871b.mo10198a(AbstractC8472a0.class, c8453c);
        interfaceC1871b.mo10198a(C8513b.class, c8453c);
        C8459i c8459i = C8459i.f21899a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.class, c8459i);
        interfaceC1871b.mo10198a(C8533g.class, c8459i);
        C8456f c8456f = C8456f.f21879a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8483a.class, c8456f);
        interfaceC1871b.mo10198a(C8536h.class, c8456f);
        C8457g c8457g = C8457g.f21887a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b.class, c8457g);
        interfaceC1871b.mo10198a(C8539i.class, c8457g);
        C8471u c8471u = C8471u.f21968a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8511f.class, c8471u);
        interfaceC1871b.mo10198a(C8576v.class, c8471u);
        C8470t c8470t = C8470t.f21963a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8509e.class, c8470t);
        interfaceC1871b.mo10198a(C8573u.class, c8470t);
        C8458h c8458h = C8458h.f21889a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8487c.class, c8458h);
        interfaceC1871b.mo10198a(C8540j.class, c8458h);
        C8468r c8468r = C8468r.f21955a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.class, c8468r);
        interfaceC1871b.mo10198a(C8543k.class, c8468r);
        C8460j c8460j = C8460j.f21911a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.class, c8460j);
        interfaceC1871b.mo10198a(C8546l.class, c8460j);
        C8462l c8462l = C8462l.f21922a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.class, c8462l);
        interfaceC1871b.mo10198a(C8549m.class, c8462l);
        C8465o c8465o = C8465o.f21938a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.class, c8465o);
        interfaceC1871b.mo10198a(C8561q.class, c8465o);
        C8466p c8466p = C8466p.f21942a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.class, c8466p);
        interfaceC1871b.mo10198a(C8564r.class, c8466p);
        C8463m c8463m = C8463m.f21928a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.class, c8463m);
        interfaceC1871b.mo10198a(C8555o.class, c8463m);
        C8451a c8451a = C8451a.f21852a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8473a.class, c8451a);
        interfaceC1871b.mo10198a(C8517c.class, c8451a);
        C8464n c8464n = C8464n.f21934a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.class, c8464n);
        interfaceC1871b.mo10198a(C8558p.class, c8464n);
        C8461k c8461k = C8461k.f21917a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.class, c8461k);
        interfaceC1871b.mo10198a(C8552n.class, c8461k);
        C8452b c8452b = C8452b.f21861a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8476c.class, c8452b);
        interfaceC1871b.mo10198a(C8524d.class, c8452b);
        C8467q c8467q = C8467q.f21948a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.class, c8467q);
        interfaceC1871b.mo10198a(C8567s.class, c8467q);
        C8469s c8469s = C8469s.f21961a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d.class, c8469s);
        interfaceC1871b.mo10198a(C8570t.class, c8469s);
        C8454d c8454d = C8454d.f21873a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8478d.class, c8454d);
        interfaceC1871b.mo10198a(C8527e.class, c8454d);
        C8455e c8455e = C8455e.f21876a;
        interfaceC1871b.mo10198a(AbstractC8472a0.AbstractC8478d.AbstractC8480b.class, c8455e);
        interfaceC1871b.mo10198a(C8530f.class, c8455e);
    }
}
