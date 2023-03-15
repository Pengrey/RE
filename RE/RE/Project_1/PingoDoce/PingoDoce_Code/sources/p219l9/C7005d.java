package p219l9;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p136ha.InterfaceC5880a;
import p136ha.InterfaceC5882b;
import p294p9.AbstractC8520c0;

/* renamed from: l9.d */
/* loaded from: classes.dex */
public final class C7005d implements InterfaceC7002a {

    /* renamed from: c */
    private static final InterfaceC7012g f18618c = new C7007b();

    /* renamed from: a */
    private final InterfaceC5880a<InterfaceC7002a> f18619a;

    /* renamed from: b */
    private final AtomicReference<InterfaceC7002a> f18620b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* renamed from: l9.d$b */
    /* loaded from: classes.dex */
    private static final class C7007b implements InterfaceC7012g {
        private C7007b() {
        }

        @Override // p219l9.InterfaceC7012g
        /* renamed from: a */
        public File mo19604a() {
            return null;
        }

        @Override // p219l9.InterfaceC7012g
        /* renamed from: b */
        public File mo19603b() {
            return null;
        }

        @Override // p219l9.InterfaceC7012g
        /* renamed from: c */
        public File mo19602c() {
            return null;
        }

        @Override // p219l9.InterfaceC7012g
        /* renamed from: d */
        public File mo19601d() {
            return null;
        }

        @Override // p219l9.InterfaceC7012g
        /* renamed from: e */
        public File mo19600e() {
            return null;
        }

        @Override // p219l9.InterfaceC7012g
        /* renamed from: f */
        public File mo19599f() {
            return null;
        }
    }

    public C7005d(InterfaceC5880a<InterfaceC7002a> interfaceC5880a) {
        this.f18619a = interfaceC5880a;
        interfaceC5880a.mo21029a(new InterfaceC5880a.InterfaceC5881a() { // from class: l9.c
            @Override // p136ha.InterfaceC5880a.InterfaceC5881a
            /* renamed from: a */
            public final void mo19633a(InterfaceC5882b interfaceC5882b) {
                C7005d.this.m19626g(interfaceC5882b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m19626g(InterfaceC5882b interfaceC5882b) {
        C7011f.m19611f().m19615b("Crashlytics native component now available.");
        this.f18620b.set((InterfaceC7002a) interfaceC5882b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m19625h(String str, String str2, long j, AbstractC8520c0 abstractC8520c0, InterfaceC5882b interfaceC5882b) {
        ((InterfaceC7002a) interfaceC5882b.get()).mo19630c(str, str2, j, abstractC8520c0);
    }

    @Override // p219l9.InterfaceC7002a
    /* renamed from: a */
    public InterfaceC7012g mo19632a(String str) {
        InterfaceC7002a interfaceC7002a = this.f18620b.get();
        if (interfaceC7002a == null) {
            return f18618c;
        }
        return interfaceC7002a.mo19632a(str);
    }

    @Override // p219l9.InterfaceC7002a
    /* renamed from: b */
    public boolean mo19631b() {
        InterfaceC7002a interfaceC7002a = this.f18620b.get();
        return interfaceC7002a != null && interfaceC7002a.mo19631b();
    }

    @Override // p219l9.InterfaceC7002a
    /* renamed from: c */
    public void mo19630c(final String str, final String str2, final long j, final AbstractC8520c0 abstractC8520c0) {
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19608i("Deferring native open session: " + str);
        this.f18619a.mo21029a(new InterfaceC5880a.InterfaceC5881a() { // from class: l9.b
            @Override // p136ha.InterfaceC5880a.InterfaceC5881a
            /* renamed from: a */
            public final void mo19633a(InterfaceC5882b interfaceC5882b) {
                C7005d.m19625h(str, str2, j, abstractC8520c0, interfaceC5882b);
            }
        });
    }

    @Override // p219l9.InterfaceC7002a
    /* renamed from: d */
    public boolean mo19629d(String str) {
        InterfaceC7002a interfaceC7002a = this.f18620b.get();
        return interfaceC7002a != null && interfaceC7002a.mo19629d(str);
    }
}
