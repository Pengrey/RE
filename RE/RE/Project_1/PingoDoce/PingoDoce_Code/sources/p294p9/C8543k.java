package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.k */
/* loaded from: classes.dex */
final class C8543k extends AbstractC8472a0.AbstractC8482e.AbstractC8489d {

    /* renamed from: a */
    private final long f22071a;

    /* renamed from: b */
    private final String f22072b;

    /* renamed from: c */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a f22073c;

    /* renamed from: d */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c f22074d;

    /* renamed from: e */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d f22075e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    /* renamed from: p9.k$b */
    /* loaded from: classes.dex */
    public static final class C8545b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b {

        /* renamed from: a */
        private Long f22076a;

        /* renamed from: b */
        private String f22077b;

        /* renamed from: c */
        private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a f22078c;

        /* renamed from: d */
        private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c f22079d;

        /* renamed from: e */
        private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d f22080e;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d mo15215a() {
            Long l = this.f22076a;
            String str = BuildConfig.VERSION_NAME;
            if (l == null) {
                str = BuildConfig.VERSION_NAME + " timestamp";
            }
            if (this.f22077b == null) {
                str = str + " type";
            }
            if (this.f22078c == null) {
                str = str + " app";
            }
            if (this.f22079d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C8543k(this.f22076a.longValue(), this.f22077b, this.f22078c, this.f22079d, this.f22080e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b mo15214b(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a abstractC8490a) {
            Objects.requireNonNull(abstractC8490a, "Null app");
            this.f22078c = abstractC8490a;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b mo15213c(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c abstractC8505c) {
            Objects.requireNonNull(abstractC8505c, "Null device");
            this.f22079d = abstractC8505c;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b mo15212d(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d abstractC8507d) {
            this.f22080e = abstractC8507d;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b mo15211e(long j) {
            this.f22076a = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b mo15210f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f22077b = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8545b() {
        }

        private C8545b(AbstractC8472a0.AbstractC8482e.AbstractC8489d abstractC8489d) {
            this.f22076a = Long.valueOf(abstractC8489d.mo15218e());
            this.f22077b = abstractC8489d.mo15217f();
            this.f22078c = abstractC8489d.mo15221b();
            this.f22079d = abstractC8489d.mo15220c();
            this.f22080e = abstractC8489d.mo15219d();
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d
    /* renamed from: b */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a mo15221b() {
        return this.f22073c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d
    /* renamed from: c */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c mo15220c() {
        return this.f22074d;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d
    /* renamed from: d */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d mo15219d() {
        return this.f22075e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d
    /* renamed from: e */
    public long mo15218e() {
        return this.f22071a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d abstractC8489d = (AbstractC8472a0.AbstractC8482e.AbstractC8489d) obj;
            if (this.f22071a == abstractC8489d.mo15218e() && this.f22072b.equals(abstractC8489d.mo15217f()) && this.f22073c.equals(abstractC8489d.mo15221b()) && this.f22074d.equals(abstractC8489d.mo15220c())) {
                AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d abstractC8507d = this.f22075e;
                if (abstractC8507d == null) {
                    if (abstractC8489d.mo15219d() == null) {
                        return true;
                    }
                } else if (abstractC8507d.equals(abstractC8489d.mo15219d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d
    /* renamed from: f */
    public String mo15217f() {
        return this.f22072b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d
    /* renamed from: g */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b mo15216g() {
        return new C8545b(this);
    }

    public int hashCode() {
        long j = this.f22071a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f22072b.hashCode()) * 1000003) ^ this.f22073c.hashCode()) * 1000003) ^ this.f22074d.hashCode()) * 1000003;
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d abstractC8507d = this.f22075e;
        return hashCode ^ (abstractC8507d == null ? 0 : abstractC8507d.hashCode());
    }

    public String toString() {
        return "Event{timestamp=" + this.f22071a + ", type=" + this.f22072b + ", app=" + this.f22073c + ", device=" + this.f22074d + ", log=" + this.f22075e + "}";
    }

    private C8543k(long j, String str, AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a abstractC8490a, AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c abstractC8505c, AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d abstractC8507d) {
        this.f22071a = j;
        this.f22072b = str;
        this.f22073c = abstractC8490a;
        this.f22074d = abstractC8505c;
        this.f22075e = abstractC8507d;
    }
}
