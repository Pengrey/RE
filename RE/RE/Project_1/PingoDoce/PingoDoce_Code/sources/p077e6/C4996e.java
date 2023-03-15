package p077e6;

import p061da.InterfaceC4759d;

/* renamed from: e6.e */
/* loaded from: classes.dex */
public final class C4996e {

    /* renamed from: a */
    private final long f13933a;

    /* renamed from: b */
    private final long f13934b;

    /* compiled from: StorageMetrics.java */
    /* renamed from: e6.e$a */
    /* loaded from: classes.dex */
    public static final class C4997a {

        /* renamed from: a */
        private long f13935a = 0;

        /* renamed from: b */
        private long f13936b = 0;

        C4997a() {
        }

        /* renamed from: a */
        public C4996e m25931a() {
            return new C4996e(this.f13935a, this.f13936b);
        }

        /* renamed from: b */
        public C4997a m25930b(long j) {
            this.f13935a = j;
            return this;
        }

        /* renamed from: c */
        public C4997a m25929c(long j) {
            this.f13936b = j;
            return this;
        }
    }

    static {
        new C4997a().m25931a();
    }

    C4996e(long j, long j2) {
        this.f13933a = j;
        this.f13934b = j2;
    }

    /* renamed from: c */
    public static C4997a m25932c() {
        return new C4997a();
    }

    @InterfaceC4759d(tag = 1)
    /* renamed from: a */
    public long m25934a() {
        return this.f13933a;
    }

    @InterfaceC4759d(tag = 2)
    /* renamed from: b */
    public long m25933b() {
        return this.f13934b;
    }
}
