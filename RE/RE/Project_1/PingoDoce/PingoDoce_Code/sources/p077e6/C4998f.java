package p077e6;

import p061da.InterfaceC4759d;

/* renamed from: e6.f */
/* loaded from: classes.dex */
public final class C4998f {

    /* renamed from: a */
    private final long f13937a;

    /* renamed from: b */
    private final long f13938b;

    /* compiled from: TimeWindow.java */
    /* renamed from: e6.f$a */
    /* loaded from: classes.dex */
    public static final class C4999a {

        /* renamed from: a */
        private long f13939a = 0;

        /* renamed from: b */
        private long f13940b = 0;

        C4999a() {
        }

        /* renamed from: a */
        public C4998f m25925a() {
            return new C4998f(this.f13939a, this.f13940b);
        }

        /* renamed from: b */
        public C4999a m25924b(long j) {
            this.f13940b = j;
            return this;
        }

        /* renamed from: c */
        public C4999a m25923c(long j) {
            this.f13939a = j;
            return this;
        }
    }

    static {
        new C4999a().m25925a();
    }

    C4998f(long j, long j2) {
        this.f13937a = j;
        this.f13938b = j2;
    }

    /* renamed from: c */
    public static C4999a m25926c() {
        return new C4999a();
    }

    @InterfaceC4759d(tag = 2)
    /* renamed from: a */
    public long m25928a() {
        return this.f13938b;
    }

    @InterfaceC4759d(tag = 1)
    /* renamed from: b */
    public long m25927b() {
        return this.f13937a;
    }
}
