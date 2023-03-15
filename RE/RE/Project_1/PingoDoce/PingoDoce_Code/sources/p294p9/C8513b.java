package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.b */
/* loaded from: classes.dex */
final class C8513b extends AbstractC8472a0 {

    /* renamed from: b */
    private final String f21971b;

    /* renamed from: c */
    private final String f21972c;

    /* renamed from: d */
    private final int f21973d;

    /* renamed from: e */
    private final String f21974e;

    /* renamed from: f */
    private final String f21975f;

    /* renamed from: g */
    private final String f21976g;

    /* renamed from: h */
    private final AbstractC8472a0.AbstractC8482e f21977h;

    /* renamed from: i */
    private final AbstractC8472a0.AbstractC8478d f21978i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: p9.b$b */
    /* loaded from: classes.dex */
    public static final class C8515b extends AbstractC8472a0.AbstractC8475b {

        /* renamed from: a */
        private String f21979a;

        /* renamed from: b */
        private String f21980b;

        /* renamed from: c */
        private Integer f21981c;

        /* renamed from: d */
        private String f21982d;

        /* renamed from: e */
        private String f21983e;

        /* renamed from: f */
        private String f21984f;

        /* renamed from: g */
        private AbstractC8472a0.AbstractC8482e f21985g;

        /* renamed from: h */
        private AbstractC8472a0.AbstractC8478d f21986h;

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: a */
        public AbstractC8472a0 mo15326a() {
            String str = this.f21979a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " sdkVersion";
            }
            if (this.f21980b == null) {
                str2 = str2 + " gmpAppId";
            }
            if (this.f21981c == null) {
                str2 = str2 + " platform";
            }
            if (this.f21982d == null) {
                str2 = str2 + " installationUuid";
            }
            if (this.f21983e == null) {
                str2 = str2 + " buildVersion";
            }
            if (this.f21984f == null) {
                str2 = str2 + " displayVersion";
            }
            if (str2.isEmpty()) {
                return new C8513b(this.f21979a, this.f21980b, this.f21981c.intValue(), this.f21982d, this.f21983e, this.f21984f, this.f21985g, this.f21986h);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8475b mo15325b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f21983e = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8475b mo15324c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f21984f = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8475b mo15323d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f21980b = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8475b mo15322e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f21982d = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8475b mo15321f(AbstractC8472a0.AbstractC8478d abstractC8478d) {
            this.f21986h = abstractC8478d;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: g */
        public AbstractC8472a0.AbstractC8475b mo15320g(int i) {
            this.f21981c = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: h */
        public AbstractC8472a0.AbstractC8475b mo15319h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f21979a = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8475b
        /* renamed from: i */
        public AbstractC8472a0.AbstractC8475b mo15318i(AbstractC8472a0.AbstractC8482e abstractC8482e) {
            this.f21985g = abstractC8482e;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8515b() {
        }

        private C8515b(AbstractC8472a0 abstractC8472a0) {
            this.f21979a = abstractC8472a0.mo15329i();
            this.f21980b = abstractC8472a0.mo15333e();
            this.f21981c = Integer.valueOf(abstractC8472a0.mo15330h());
            this.f21982d = abstractC8472a0.mo15332f();
            this.f21983e = abstractC8472a0.mo15335c();
            this.f21984f = abstractC8472a0.mo15334d();
            this.f21985g = abstractC8472a0.mo15328j();
            this.f21986h = abstractC8472a0.mo15331g();
        }
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: c */
    public String mo15335c() {
        return this.f21975f;
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: d */
    public String mo15334d() {
        return this.f21976g;
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: e */
    public String mo15333e() {
        return this.f21972c;
    }

    public boolean equals(Object obj) {
        AbstractC8472a0.AbstractC8482e abstractC8482e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0) {
            AbstractC8472a0 abstractC8472a0 = (AbstractC8472a0) obj;
            if (this.f21971b.equals(abstractC8472a0.mo15329i()) && this.f21972c.equals(abstractC8472a0.mo15333e()) && this.f21973d == abstractC8472a0.mo15330h() && this.f21974e.equals(abstractC8472a0.mo15332f()) && this.f21975f.equals(abstractC8472a0.mo15335c()) && this.f21976g.equals(abstractC8472a0.mo15334d()) && ((abstractC8482e = this.f21977h) != null ? abstractC8482e.equals(abstractC8472a0.mo15328j()) : abstractC8472a0.mo15328j() == null)) {
                AbstractC8472a0.AbstractC8478d abstractC8478d = this.f21978i;
                if (abstractC8478d == null) {
                    if (abstractC8472a0.mo15331g() == null) {
                        return true;
                    }
                } else if (abstractC8478d.equals(abstractC8472a0.mo15331g())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: f */
    public String mo15332f() {
        return this.f21974e;
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: g */
    public AbstractC8472a0.AbstractC8478d mo15331g() {
        return this.f21978i;
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: h */
    public int mo15330h() {
        return this.f21973d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f21971b.hashCode() ^ 1000003) * 1000003) ^ this.f21972c.hashCode()) * 1000003) ^ this.f21973d) * 1000003) ^ this.f21974e.hashCode()) * 1000003) ^ this.f21975f.hashCode()) * 1000003) ^ this.f21976g.hashCode()) * 1000003;
        AbstractC8472a0.AbstractC8482e abstractC8482e = this.f21977h;
        int hashCode2 = (hashCode ^ (abstractC8482e == null ? 0 : abstractC8482e.hashCode())) * 1000003;
        AbstractC8472a0.AbstractC8478d abstractC8478d = this.f21978i;
        return hashCode2 ^ (abstractC8478d != null ? abstractC8478d.hashCode() : 0);
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: i */
    public String mo15329i() {
        return this.f21971b;
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: j */
    public AbstractC8472a0.AbstractC8482e mo15328j() {
        return this.f21977h;
    }

    @Override // p294p9.AbstractC8472a0
    /* renamed from: k */
    protected AbstractC8472a0.AbstractC8475b mo15327k() {
        return new C8515b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f21971b + ", gmpAppId=" + this.f21972c + ", platform=" + this.f21973d + ", installationUuid=" + this.f21974e + ", buildVersion=" + this.f21975f + ", displayVersion=" + this.f21976g + ", session=" + this.f21977h + ", ndkPayload=" + this.f21978i + "}";
    }

    private C8513b(String str, String str2, int i, String str3, String str4, String str5, AbstractC8472a0.AbstractC8482e abstractC8482e, AbstractC8472a0.AbstractC8478d abstractC8478d) {
        this.f21971b = str;
        this.f21972c = str2;
        this.f21973d = i;
        this.f21974e = str3;
        this.f21975f = str4;
        this.f21976g = str5;
        this.f21977h = abstractC8482e;
        this.f21978i = abstractC8478d;
    }
}
