package la;

import la.AbstractC7020d;

/* renamed from: la.a */
/* loaded from: classes.dex */
final class C7013a extends AbstractC7020d {

    /* renamed from: a */
    private final String f18628a;

    /* renamed from: b */
    private final String f18629b;

    /* renamed from: c */
    private final String f18630c;

    /* renamed from: d */
    private final AbstractC7024f f18631d;

    /* renamed from: e */
    private final AbstractC7020d.EnumC7022b f18632e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_InstallationResponse.java */
    /* renamed from: la.a$b */
    /* loaded from: classes.dex */
    public static final class C7015b extends AbstractC7020d.AbstractC7021a {

        /* renamed from: a */
        private String f18633a;

        /* renamed from: b */
        private String f18634b;

        /* renamed from: c */
        private String f18635c;

        /* renamed from: d */
        private AbstractC7024f f18636d;

        /* renamed from: e */
        private AbstractC7020d.EnumC7022b f18637e;

        @Override // la.AbstractC7020d.AbstractC7021a
        /* renamed from: a */
        public AbstractC7020d mo19573a() {
            return new C7013a(this.f18633a, this.f18634b, this.f18635c, this.f18636d, this.f18637e);
        }

        @Override // la.AbstractC7020d.AbstractC7021a
        /* renamed from: b */
        public AbstractC7020d.AbstractC7021a mo19572b(AbstractC7024f abstractC7024f) {
            this.f18636d = abstractC7024f;
            return this;
        }

        @Override // la.AbstractC7020d.AbstractC7021a
        /* renamed from: c */
        public AbstractC7020d.AbstractC7021a mo19571c(String str) {
            this.f18634b = str;
            return this;
        }

        @Override // la.AbstractC7020d.AbstractC7021a
        /* renamed from: d */
        public AbstractC7020d.AbstractC7021a mo19570d(String str) {
            this.f18635c = str;
            return this;
        }

        @Override // la.AbstractC7020d.AbstractC7021a
        /* renamed from: e */
        public AbstractC7020d.AbstractC7021a mo19569e(AbstractC7020d.EnumC7022b enumC7022b) {
            this.f18637e = enumC7022b;
            return this;
        }

        @Override // la.AbstractC7020d.AbstractC7021a
        /* renamed from: f */
        public AbstractC7020d.AbstractC7021a mo19568f(String str) {
            this.f18633a = str;
            return this;
        }
    }

    @Override // la.AbstractC7020d
    /* renamed from: b */
    public AbstractC7024f mo19578b() {
        return this.f18631d;
    }

    @Override // la.AbstractC7020d
    /* renamed from: c */
    public String mo19577c() {
        return this.f18629b;
    }

    @Override // la.AbstractC7020d
    /* renamed from: d */
    public String mo19576d() {
        return this.f18630c;
    }

    @Override // la.AbstractC7020d
    /* renamed from: e */
    public AbstractC7020d.EnumC7022b mo19575e() {
        return this.f18632e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7020d) {
            AbstractC7020d abstractC7020d = (AbstractC7020d) obj;
            String str = this.f18628a;
            if (str != null ? str.equals(abstractC7020d.mo19574f()) : abstractC7020d.mo19574f() == null) {
                String str2 = this.f18629b;
                if (str2 != null ? str2.equals(abstractC7020d.mo19577c()) : abstractC7020d.mo19577c() == null) {
                    String str3 = this.f18630c;
                    if (str3 != null ? str3.equals(abstractC7020d.mo19576d()) : abstractC7020d.mo19576d() == null) {
                        AbstractC7024f abstractC7024f = this.f18631d;
                        if (abstractC7024f != null ? abstractC7024f.equals(abstractC7020d.mo19578b()) : abstractC7020d.mo19578b() == null) {
                            AbstractC7020d.EnumC7022b enumC7022b = this.f18632e;
                            if (enumC7022b == null) {
                                if (abstractC7020d.mo19575e() == null) {
                                    return true;
                                }
                            } else if (enumC7022b.equals(abstractC7020d.mo19575e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // la.AbstractC7020d
    /* renamed from: f */
    public String mo19574f() {
        return this.f18628a;
    }

    public int hashCode() {
        String str = this.f18628a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f18629b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18630c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC7024f abstractC7024f = this.f18631d;
        int hashCode4 = (hashCode3 ^ (abstractC7024f == null ? 0 : abstractC7024f.hashCode())) * 1000003;
        AbstractC7020d.EnumC7022b enumC7022b = this.f18632e;
        return hashCode4 ^ (enumC7022b != null ? enumC7022b.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f18628a + ", fid=" + this.f18629b + ", refreshToken=" + this.f18630c + ", authToken=" + this.f18631d + ", responseCode=" + this.f18632e + "}";
    }

    private C7013a(String str, String str2, String str3, AbstractC7024f abstractC7024f, AbstractC7020d.EnumC7022b enumC7022b) {
        this.f18628a = str;
        this.f18629b = str2;
        this.f18630c = str3;
        this.f18631d = abstractC7024f;
        this.f18632e = enumC7022b;
    }
}
