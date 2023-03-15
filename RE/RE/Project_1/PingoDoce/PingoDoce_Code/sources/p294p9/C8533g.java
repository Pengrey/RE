package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.g */
/* loaded from: classes.dex */
final class C8533g extends AbstractC8472a0.AbstractC8482e {

    /* renamed from: a */
    private final String f22016a;

    /* renamed from: b */
    private final String f22017b;

    /* renamed from: c */
    private final long f22018c;

    /* renamed from: d */
    private final Long f22019d;

    /* renamed from: e */
    private final boolean f22020e;

    /* renamed from: f */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8483a f22021f;

    /* renamed from: g */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8511f f22022g;

    /* renamed from: h */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8509e f22023h;

    /* renamed from: i */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8487c f22024i;

    /* renamed from: j */
    private final C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d> f22025j;

    /* renamed from: k */
    private final int f22026k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    /* renamed from: p9.g$b */
    /* loaded from: classes.dex */
    public static final class C8535b extends AbstractC8472a0.AbstractC8482e.AbstractC8486b {

        /* renamed from: a */
        private String f22027a;

        /* renamed from: b */
        private String f22028b;

        /* renamed from: c */
        private Long f22029c;

        /* renamed from: d */
        private Long f22030d;

        /* renamed from: e */
        private Boolean f22031e;

        /* renamed from: f */
        private AbstractC8472a0.AbstractC8482e.AbstractC8483a f22032f;

        /* renamed from: g */
        private AbstractC8472a0.AbstractC8482e.AbstractC8511f f22033g;

        /* renamed from: h */
        private AbstractC8472a0.AbstractC8482e.AbstractC8509e f22034h;

        /* renamed from: i */
        private AbstractC8472a0.AbstractC8482e.AbstractC8487c f22035i;

        /* renamed from: j */
        private C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d> f22036j;

        /* renamed from: k */
        private Integer f22037k;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e mo15267a() {
            String str = this.f22027a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " generator";
            }
            if (this.f22028b == null) {
                str2 = str2 + " identifier";
            }
            if (this.f22029c == null) {
                str2 = str2 + " startedAt";
            }
            if (this.f22031e == null) {
                str2 = str2 + " crashed";
            }
            if (this.f22032f == null) {
                str2 = str2 + " app";
            }
            if (this.f22037k == null) {
                str2 = str2 + " generatorType";
            }
            if (str2.isEmpty()) {
                return new C8533g(this.f22027a, this.f22028b, this.f22029c.longValue(), this.f22030d, this.f22031e.booleanValue(), this.f22032f, this.f22033g, this.f22034h, this.f22035i, this.f22036j, this.f22037k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15266b(AbstractC8472a0.AbstractC8482e.AbstractC8483a abstractC8483a) {
            Objects.requireNonNull(abstractC8483a, "Null app");
            this.f22032f = abstractC8483a;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15265c(boolean z) {
            this.f22031e = Boolean.valueOf(z);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15264d(AbstractC8472a0.AbstractC8482e.AbstractC8487c abstractC8487c) {
            this.f22035i = abstractC8487c;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15263e(Long l) {
            this.f22030d = l;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15262f(C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d> c8516b0) {
            this.f22036j = c8516b0;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: g */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15261g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f22027a = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: h */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15260h(int i) {
            this.f22037k = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: i */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15259i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f22028b = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: k */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15258k(AbstractC8472a0.AbstractC8482e.AbstractC8509e abstractC8509e) {
            this.f22034h = abstractC8509e;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: l */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15257l(long j) {
            this.f22029c = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8486b
        /* renamed from: m */
        public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15256m(AbstractC8472a0.AbstractC8482e.AbstractC8511f abstractC8511f) {
            this.f22033g = abstractC8511f;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8535b() {
        }

        private C8535b(AbstractC8472a0.AbstractC8482e abstractC8482e) {
            this.f22027a = abstractC8482e.mo15275f();
            this.f22028b = abstractC8482e.mo15273h();
            this.f22029c = Long.valueOf(abstractC8482e.mo15271k());
            this.f22030d = abstractC8482e.mo15277d();
            this.f22031e = Boolean.valueOf(abstractC8482e.mo15269m());
            this.f22032f = abstractC8482e.mo15279b();
            this.f22033g = abstractC8482e.mo15270l();
            this.f22034h = abstractC8482e.mo15272j();
            this.f22035i = abstractC8482e.mo15278c();
            this.f22036j = abstractC8482e.mo15276e();
            this.f22037k = Integer.valueOf(abstractC8482e.mo15274g());
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: b */
    public AbstractC8472a0.AbstractC8482e.AbstractC8483a mo15279b() {
        return this.f22021f;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: c */
    public AbstractC8472a0.AbstractC8482e.AbstractC8487c mo15278c() {
        return this.f22024i;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: d */
    public Long mo15277d() {
        return this.f22019d;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: e */
    public C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d> mo15276e() {
        return this.f22025j;
    }

    public boolean equals(Object obj) {
        Long l;
        AbstractC8472a0.AbstractC8482e.AbstractC8511f abstractC8511f;
        AbstractC8472a0.AbstractC8482e.AbstractC8509e abstractC8509e;
        AbstractC8472a0.AbstractC8482e.AbstractC8487c abstractC8487c;
        C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d> c8516b0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e) {
            AbstractC8472a0.AbstractC8482e abstractC8482e = (AbstractC8472a0.AbstractC8482e) obj;
            return this.f22016a.equals(abstractC8482e.mo15275f()) && this.f22017b.equals(abstractC8482e.mo15273h()) && this.f22018c == abstractC8482e.mo15271k() && ((l = this.f22019d) != null ? l.equals(abstractC8482e.mo15277d()) : abstractC8482e.mo15277d() == null) && this.f22020e == abstractC8482e.mo15269m() && this.f22021f.equals(abstractC8482e.mo15279b()) && ((abstractC8511f = this.f22022g) != null ? abstractC8511f.equals(abstractC8482e.mo15270l()) : abstractC8482e.mo15270l() == null) && ((abstractC8509e = this.f22023h) != null ? abstractC8509e.equals(abstractC8482e.mo15272j()) : abstractC8482e.mo15272j() == null) && ((abstractC8487c = this.f22024i) != null ? abstractC8487c.equals(abstractC8482e.mo15278c()) : abstractC8482e.mo15278c() == null) && ((c8516b0 = this.f22025j) != null ? c8516b0.equals(abstractC8482e.mo15276e()) : abstractC8482e.mo15276e() == null) && this.f22026k == abstractC8482e.mo15274g();
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: f */
    public String mo15275f() {
        return this.f22016a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: g */
    public int mo15274g() {
        return this.f22026k;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: h */
    public String mo15273h() {
        return this.f22017b;
    }

    public int hashCode() {
        long j = this.f22018c;
        int hashCode = (((((this.f22016a.hashCode() ^ 1000003) * 1000003) ^ this.f22017b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f22019d;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f22020e ? 1231 : 1237)) * 1000003) ^ this.f22021f.hashCode()) * 1000003;
        AbstractC8472a0.AbstractC8482e.AbstractC8511f abstractC8511f = this.f22022g;
        int hashCode3 = (hashCode2 ^ (abstractC8511f == null ? 0 : abstractC8511f.hashCode())) * 1000003;
        AbstractC8472a0.AbstractC8482e.AbstractC8509e abstractC8509e = this.f22023h;
        int hashCode4 = (hashCode3 ^ (abstractC8509e == null ? 0 : abstractC8509e.hashCode())) * 1000003;
        AbstractC8472a0.AbstractC8482e.AbstractC8487c abstractC8487c = this.f22024i;
        int hashCode5 = (hashCode4 ^ (abstractC8487c == null ? 0 : abstractC8487c.hashCode())) * 1000003;
        C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d> c8516b0 = this.f22025j;
        return ((hashCode5 ^ (c8516b0 != null ? c8516b0.hashCode() : 0)) * 1000003) ^ this.f22026k;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: j */
    public AbstractC8472a0.AbstractC8482e.AbstractC8509e mo15272j() {
        return this.f22023h;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: k */
    public long mo15271k() {
        return this.f22018c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: l */
    public AbstractC8472a0.AbstractC8482e.AbstractC8511f mo15270l() {
        return this.f22022g;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: m */
    public boolean mo15269m() {
        return this.f22020e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e
    /* renamed from: n */
    public AbstractC8472a0.AbstractC8482e.AbstractC8486b mo15268n() {
        return new C8535b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f22016a + ", identifier=" + this.f22017b + ", startedAt=" + this.f22018c + ", endedAt=" + this.f22019d + ", crashed=" + this.f22020e + ", app=" + this.f22021f + ", user=" + this.f22022g + ", os=" + this.f22023h + ", device=" + this.f22024i + ", events=" + this.f22025j + ", generatorType=" + this.f22026k + "}";
    }

    private C8533g(String str, String str2, long j, Long l, boolean z, AbstractC8472a0.AbstractC8482e.AbstractC8483a abstractC8483a, AbstractC8472a0.AbstractC8482e.AbstractC8511f abstractC8511f, AbstractC8472a0.AbstractC8482e.AbstractC8509e abstractC8509e, AbstractC8472a0.AbstractC8482e.AbstractC8487c abstractC8487c, C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d> c8516b0, int i) {
        this.f22016a = str;
        this.f22017b = str2;
        this.f22018c = j;
        this.f22019d = l;
        this.f22020e = z;
        this.f22021f = abstractC8483a;
        this.f22022g = abstractC8511f;
        this.f22023h = abstractC8509e;
        this.f22024i = abstractC8487c;
        this.f22025j = c8516b0;
        this.f22026k = i;
    }
}
