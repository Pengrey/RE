package p200ka;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p200ka.AbstractC6621d;
import p200ka.C6619c;

/* renamed from: ka.a */
/* loaded from: classes.dex */
final class C6615a extends AbstractC6621d {

    /* renamed from: a */
    private final String f17857a;

    /* renamed from: b */
    private final C6619c.EnumC6620a f17858b;

    /* renamed from: c */
    private final String f17859c;

    /* renamed from: d */
    private final String f17860d;

    /* renamed from: e */
    private final long f17861e;

    /* renamed from: f */
    private final long f17862f;

    /* renamed from: g */
    private final String f17863g;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: ka.a$b */
    /* loaded from: classes.dex */
    static final class C6617b extends AbstractC6621d.AbstractC6622a {

        /* renamed from: a */
        private String f17864a;

        /* renamed from: b */
        private C6619c.EnumC6620a f17865b;

        /* renamed from: c */
        private String f17866c;

        /* renamed from: d */
        private String f17867d;

        /* renamed from: e */
        private Long f17868e;

        /* renamed from: f */
        private Long f17869f;

        /* renamed from: g */
        private String f17870g;

        @Override // p200ka.AbstractC6621d.AbstractC6622a
        /* renamed from: a */
        public AbstractC6621d mo20451a() {
            C6619c.EnumC6620a enumC6620a = this.f17865b;
            String str = BuildConfig.VERSION_NAME;
            if (enumC6620a == null) {
                str = BuildConfig.VERSION_NAME + " registrationStatus";
            }
            if (this.f17868e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f17869f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C6615a(this.f17864a, this.f17865b, this.f17866c, this.f17867d, this.f17868e.longValue(), this.f17869f.longValue(), this.f17870g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p200ka.AbstractC6621d.AbstractC6622a
        /* renamed from: b */
        public AbstractC6621d.AbstractC6622a mo20450b(String str) {
            this.f17866c = str;
            return this;
        }

        @Override // p200ka.AbstractC6621d.AbstractC6622a
        /* renamed from: c */
        public AbstractC6621d.AbstractC6622a mo20449c(long j) {
            this.f17868e = Long.valueOf(j);
            return this;
        }

        @Override // p200ka.AbstractC6621d.AbstractC6622a
        /* renamed from: d */
        public AbstractC6621d.AbstractC6622a mo20448d(String str) {
            this.f17864a = str;
            return this;
        }

        @Override // p200ka.AbstractC6621d.AbstractC6622a
        /* renamed from: e */
        public AbstractC6621d.AbstractC6622a mo20447e(String str) {
            this.f17870g = str;
            return this;
        }

        @Override // p200ka.AbstractC6621d.AbstractC6622a
        /* renamed from: f */
        public AbstractC6621d.AbstractC6622a mo20446f(String str) {
            this.f17867d = str;
            return this;
        }

        @Override // p200ka.AbstractC6621d.AbstractC6622a
        /* renamed from: g */
        public AbstractC6621d.AbstractC6622a mo20445g(C6619c.EnumC6620a enumC6620a) {
            Objects.requireNonNull(enumC6620a, "Null registrationStatus");
            this.f17865b = enumC6620a;
            return this;
        }

        @Override // p200ka.AbstractC6621d.AbstractC6622a
        /* renamed from: h */
        public AbstractC6621d.AbstractC6622a mo20444h(long j) {
            this.f17869f = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C6617b() {
        }

        private C6617b(AbstractC6621d abstractC6621d) {
            this.f17864a = abstractC6621d.mo20468d();
            this.f17865b = abstractC6621d.mo20465g();
            this.f17866c = abstractC6621d.mo20470b();
            this.f17867d = abstractC6621d.mo20466f();
            this.f17868e = Long.valueOf(abstractC6621d.mo20469c());
            this.f17869f = Long.valueOf(abstractC6621d.mo20464h());
            this.f17870g = abstractC6621d.mo20467e();
        }
    }

    @Override // p200ka.AbstractC6621d
    /* renamed from: b */
    public String mo20470b() {
        return this.f17859c;
    }

    @Override // p200ka.AbstractC6621d
    /* renamed from: c */
    public long mo20469c() {
        return this.f17861e;
    }

    @Override // p200ka.AbstractC6621d
    /* renamed from: d */
    public String mo20468d() {
        return this.f17857a;
    }

    @Override // p200ka.AbstractC6621d
    /* renamed from: e */
    public String mo20467e() {
        return this.f17863g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6621d) {
            AbstractC6621d abstractC6621d = (AbstractC6621d) obj;
            String str3 = this.f17857a;
            if (str3 != null ? str3.equals(abstractC6621d.mo20468d()) : abstractC6621d.mo20468d() == null) {
                if (this.f17858b.equals(abstractC6621d.mo20465g()) && ((str = this.f17859c) != null ? str.equals(abstractC6621d.mo20470b()) : abstractC6621d.mo20470b() == null) && ((str2 = this.f17860d) != null ? str2.equals(abstractC6621d.mo20466f()) : abstractC6621d.mo20466f() == null) && this.f17861e == abstractC6621d.mo20469c() && this.f17862f == abstractC6621d.mo20464h()) {
                    String str4 = this.f17863g;
                    if (str4 == null) {
                        if (abstractC6621d.mo20467e() == null) {
                            return true;
                        }
                    } else if (str4.equals(abstractC6621d.mo20467e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // p200ka.AbstractC6621d
    /* renamed from: f */
    public String mo20466f() {
        return this.f17860d;
    }

    @Override // p200ka.AbstractC6621d
    /* renamed from: g */
    public C6619c.EnumC6620a mo20465g() {
        return this.f17858b;
    }

    @Override // p200ka.AbstractC6621d
    /* renamed from: h */
    public long mo20464h() {
        return this.f17862f;
    }

    public int hashCode() {
        String str = this.f17857a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f17858b.hashCode()) * 1000003;
        String str2 = this.f17859c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f17860d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f17861e;
        long j2 = this.f17862f;
        int i = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f17863g;
        return i ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p200ka.AbstractC6621d
    /* renamed from: n */
    public AbstractC6621d.AbstractC6622a mo20458n() {
        return new C6617b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f17857a + ", registrationStatus=" + this.f17858b + ", authToken=" + this.f17859c + ", refreshToken=" + this.f17860d + ", expiresInSecs=" + this.f17861e + ", tokenCreationEpochInSecs=" + this.f17862f + ", fisError=" + this.f17863g + "}";
    }

    private C6615a(String str, C6619c.EnumC6620a enumC6620a, String str2, String str3, long j, long j2, String str4) {
        this.f17857a = str;
        this.f17858b = enumC6620a;
        this.f17859c = str2;
        this.f17860d = str3;
        this.f17861e = j;
        this.f17862f = j2;
        this.f17863g = str4;
    }
}
