package p077e6;

import p061da.InterfaceC4758c;
import p061da.InterfaceC4759d;

/* renamed from: e6.c */
/* loaded from: classes.dex */
public final class C4991c {

    /* renamed from: a */
    private final long f13925a;

    /* renamed from: b */
    private final EnumC4993b f13926b;

    /* compiled from: LogEventDropped.java */
    /* renamed from: e6.c$a */
    /* loaded from: classes.dex */
    public static final class C4992a {

        /* renamed from: a */
        private long f13927a = 0;

        /* renamed from: b */
        private EnumC4993b f13928b = EnumC4993b.REASON_UNKNOWN;

        C4992a() {
        }

        /* renamed from: a */
        public C4991c m25943a() {
            return new C4991c(this.f13927a, this.f13928b);
        }

        /* renamed from: b */
        public C4992a m25942b(long j) {
            this.f13927a = j;
            return this;
        }

        /* renamed from: c */
        public C4992a m25941c(EnumC4993b enumC4993b) {
            this.f13928b = enumC4993b;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    /* renamed from: e6.c$b */
    /* loaded from: classes.dex */
    public enum EnumC4993b implements InterfaceC4758c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        EnumC4993b(int i) {
            this.number_ = i;
        }

        @Override // p061da.InterfaceC4758c
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        new C4992a().m25943a();
    }

    C4991c(long j, EnumC4993b enumC4993b) {
        this.f13925a = j;
        this.f13926b = enumC4993b;
    }

    /* renamed from: c */
    public static C4992a m25944c() {
        return new C4992a();
    }

    @InterfaceC4759d(tag = 1)
    /* renamed from: a */
    public long m25946a() {
        return this.f13925a;
    }

    @InterfaceC4759d(tag = 3)
    /* renamed from: b */
    public EnumC4993b m25945b() {
        return this.f13926b;
    }
}
