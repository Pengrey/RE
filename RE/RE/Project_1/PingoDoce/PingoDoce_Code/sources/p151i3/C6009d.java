package p151i3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p151i3.C6000b;
import p151i3.InterfaceC5996a;
import p356sf.ByteString;
import p356sf.FileSystem;
import p356sf.Path;
import td.AbstractC10505e0;

/* renamed from: i3.d */
/* loaded from: classes.dex */
public final class C6009d implements InterfaceC5996a {

    /* renamed from: a */
    private final long f16596a;

    /* renamed from: b */
    private final Path f16597b;

    /* renamed from: c */
    private final FileSystem f16598c;

    /* renamed from: d */
    private final C6000b f16599d;

    /* compiled from: RealDiskCache.kt */
    /* renamed from: i3.d$a */
    /* loaded from: classes.dex */
    public static final class C6010a {
        private C6010a() {
        }

        public /* synthetic */ C6010a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealDiskCache.kt */
    /* renamed from: i3.d$b */
    /* loaded from: classes.dex */
    public static final class C6011b implements InterfaceC5996a.InterfaceC5998b {

        /* renamed from: a */
        private final C6000b.C6002b f16600a;

        public C6011b(C6000b.C6002b c6002b) {
            this.f16600a = c6002b;
        }

        @Override // p151i3.InterfaceC5996a.InterfaceC5998b
        /* renamed from: a */
        public C6012c mo22371g() {
            C6000b.C6004d m22406c = this.f16600a.m22406c();
            if (m22406c != null) {
                return new C6012c(m22406c);
            }
            return null;
        }

        @Override // p151i3.InterfaceC5996a.InterfaceC5998b
        /* renamed from: d */
        public Path mo22373d() {
            return this.f16600a.m22403f(0);
        }

        @Override // p151i3.InterfaceC5996a.InterfaceC5998b
        /* renamed from: f */
        public Path mo22372f() {
            return this.f16600a.m22403f(1);
        }

        @Override // p151i3.InterfaceC5996a.InterfaceC5998b
        /* renamed from: h */
        public void mo22370h() {
            this.f16600a.m22408a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealDiskCache.kt */
    /* renamed from: i3.d$c */
    /* loaded from: classes.dex */
    public static final class C6012c implements InterfaceC5996a.InterfaceC5999c {

        /* renamed from: w */
        private final C6000b.C6004d f16601w;

        public C6012c(C6000b.C6004d c6004d) {
            this.f16601w = c6004d;
        }

        @Override // p151i3.InterfaceC5996a.InterfaceC5999c
        /* renamed from: a */
        public C6011b mo22366k() {
            C6000b.C6002b m22385a = this.f16601w.m22385a();
            if (m22385a != null) {
                return new C6011b(m22385a);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f16601w.close();
        }

        @Override // p151i3.InterfaceC5996a.InterfaceC5999c
        /* renamed from: d */
        public Path mo22368d() {
            return this.f16601w.m22384c(0);
        }

        @Override // p151i3.InterfaceC5996a.InterfaceC5999c
        /* renamed from: f */
        public Path mo22367f() {
            return this.f16601w.m22384c(1);
        }
    }

    static {
        new C6010a(null);
    }

    public C6009d(long j, Path path, FileSystem fileSystem, AbstractC10505e0 abstractC10505e0) {
        this.f16596a = j;
        this.f16597b = path;
        this.f16598c = fileSystem;
        this.f16599d = new C6000b(mo22379b(), m22377d(), abstractC10505e0, m22376e(), 1, 2);
    }

    /* renamed from: f */
    private final String m22375f(String str) {
        return ByteString.f26546z.m8692d(str).m8727A().m8709m();
    }

    @Override // p151i3.InterfaceC5996a
    /* renamed from: a */
    public InterfaceC5996a.InterfaceC5999c mo22380a(String str) {
        C6000b.C6004d m22423d0 = this.f16599d.m22423d0(m22375f(str));
        if (m22423d0 != null) {
            return new C6012c(m22423d0);
        }
        return null;
    }

    @Override // p151i3.InterfaceC5996a
    /* renamed from: b */
    public FileSystem mo22379b() {
        return this.f16598c;
    }

    @Override // p151i3.InterfaceC5996a
    /* renamed from: c */
    public InterfaceC5996a.InterfaceC5998b mo22378c(String str) {
        C6000b.C6002b m22425b0 = this.f16599d.m22425b0(m22375f(str));
        if (m22425b0 != null) {
            return new C6011b(m22425b0);
        }
        return null;
    }

    /* renamed from: d */
    public Path m22377d() {
        return this.f16597b;
    }

    /* renamed from: e */
    public long m22376e() {
        return this.f16596a;
    }
}
