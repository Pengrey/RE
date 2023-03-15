package p269o9;

import java.io.File;
import p355s9.C10098f;

/* renamed from: o9.c */
/* loaded from: classes.dex */
public class C8037c {

    /* renamed from: c */
    private static final C8039b f20779c = new C8039b();

    /* renamed from: a */
    private final C10098f f20780a;

    /* renamed from: b */
    private InterfaceC8035a f20781b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LogFileManager.java */
    /* renamed from: o9.c$b */
    /* loaded from: classes.dex */
    public static final class C8039b implements InterfaceC8035a {
        private C8039b() {
        }

        @Override // p269o9.InterfaceC8035a
        /* renamed from: a */
        public void mo17073a() {
        }

        @Override // p269o9.InterfaceC8035a
        /* renamed from: b */
        public String mo17072b() {
            return null;
        }

        @Override // p269o9.InterfaceC8035a
        /* renamed from: c */
        public byte[] mo17071c() {
            return null;
        }

        @Override // p269o9.InterfaceC8035a
        /* renamed from: d */
        public void mo17070d() {
        }

        @Override // p269o9.InterfaceC8035a
        /* renamed from: e */
        public void mo17069e(long j, String str) {
        }
    }

    public C8037c(C10098f c10098f) {
        this.f20780a = c10098f;
        this.f20781b = f20779c;
    }

    /* renamed from: d */
    private File m17111d(String str) {
        return this.f20780a.m9150n(str, "userlog");
    }

    /* renamed from: a */
    public void m17114a() {
        this.f20781b.mo17070d();
    }

    /* renamed from: b */
    public byte[] m17113b() {
        return this.f20781b.mo17071c();
    }

    /* renamed from: c */
    public String m17112c() {
        return this.f20781b.mo17072b();
    }

    /* renamed from: e */
    public final void m17110e(String str) {
        this.f20781b.mo17073a();
        this.f20781b = f20779c;
        if (str == null) {
            return;
        }
        m17109f(m17111d(str), 65536);
    }

    /* renamed from: f */
    void m17109f(File file, int i) {
        this.f20781b = new C8046f(file, i);
    }

    /* renamed from: g */
    public void m17108g(long j, String str) {
        this.f20781b.mo17069e(j, str);
    }

    public C8037c(C10098f c10098f, String str) {
        this(c10098f);
        m17110e(str);
    }
}
