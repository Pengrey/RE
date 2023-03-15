package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.h */
/* loaded from: classes.dex */
final class C8536h extends AbstractC8472a0.AbstractC8482e.AbstractC8483a {

    /* renamed from: a */
    private final String f22038a;

    /* renamed from: b */
    private final String f22039b;

    /* renamed from: c */
    private final String f22040c;

    /* renamed from: d */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b f22041d;

    /* renamed from: e */
    private final String f22042e;

    /* renamed from: f */
    private final String f22043f;

    /* renamed from: g */
    private final String f22044g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    /* renamed from: p9.h$b */
    /* loaded from: classes.dex */
    public static final class C8538b extends AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a {

        /* renamed from: a */
        private String f22045a;

        /* renamed from: b */
        private String f22046b;

        /* renamed from: c */
        private String f22047c;

        /* renamed from: d */
        private AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b f22048d;

        /* renamed from: e */
        private String f22049e;

        /* renamed from: f */
        private String f22050f;

        /* renamed from: g */
        private String f22051g;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8483a mo15248a() {
            String str = this.f22045a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " identifier";
            }
            if (this.f22046b == null) {
                str2 = str2 + " version";
            }
            if (str2.isEmpty()) {
                return new C8536h(this.f22045a, this.f22046b, this.f22047c, this.f22048d, this.f22049e, this.f22050f, this.f22051g);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a mo15247b(String str) {
            this.f22050f = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a mo15246c(String str) {
            this.f22051g = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a mo15245d(String str) {
            this.f22047c = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a mo15244e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f22045a = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a mo15243f(String str) {
            this.f22049e = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a
        /* renamed from: g */
        public AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a mo15242g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f22046b = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a
    /* renamed from: b */
    public String mo15255b() {
        return this.f22043f;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a
    /* renamed from: c */
    public String mo15254c() {
        return this.f22044g;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a
    /* renamed from: d */
    public String mo15253d() {
        return this.f22040c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a
    /* renamed from: e */
    public String mo15252e() {
        return this.f22038a;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b abstractC8485b;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8483a) {
            AbstractC8472a0.AbstractC8482e.AbstractC8483a abstractC8483a = (AbstractC8472a0.AbstractC8482e.AbstractC8483a) obj;
            if (this.f22038a.equals(abstractC8483a.mo15252e()) && this.f22039b.equals(abstractC8483a.mo15249h()) && ((str = this.f22040c) != null ? str.equals(abstractC8483a.mo15253d()) : abstractC8483a.mo15253d() == null) && ((abstractC8485b = this.f22041d) != null ? abstractC8485b.equals(abstractC8483a.mo15250g()) : abstractC8483a.mo15250g() == null) && ((str2 = this.f22042e) != null ? str2.equals(abstractC8483a.mo15251f()) : abstractC8483a.mo15251f() == null) && ((str3 = this.f22043f) != null ? str3.equals(abstractC8483a.mo15255b()) : abstractC8483a.mo15255b() == null)) {
                String str4 = this.f22044g;
                if (str4 == null) {
                    if (abstractC8483a.mo15254c() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC8483a.mo15254c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a
    /* renamed from: f */
    public String mo15251f() {
        return this.f22042e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a
    /* renamed from: g */
    public AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b mo15250g() {
        return this.f22041d;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a
    /* renamed from: h */
    public String mo15249h() {
        return this.f22039b;
    }

    public int hashCode() {
        int hashCode = (((this.f22038a.hashCode() ^ 1000003) * 1000003) ^ this.f22039b.hashCode()) * 1000003;
        String str = this.f22040c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b abstractC8485b = this.f22041d;
        int hashCode3 = (hashCode2 ^ (abstractC8485b == null ? 0 : abstractC8485b.hashCode())) * 1000003;
        String str2 = this.f22042e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22043f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f22044g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f22038a + ", version=" + this.f22039b + ", displayVersion=" + this.f22040c + ", organization=" + this.f22041d + ", installationUuid=" + this.f22042e + ", developmentPlatform=" + this.f22043f + ", developmentPlatformVersion=" + this.f22044g + "}";
    }

    private C8536h(String str, String str2, String str3, AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b abstractC8485b, String str4, String str5, String str6) {
        this.f22038a = str;
        this.f22039b = str2;
        this.f22040c = str3;
        this.f22041d = abstractC8485b;
        this.f22042e = str4;
        this.f22043f = str5;
        this.f22044g = str6;
    }
}
