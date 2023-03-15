package la;

import com.github.aachartmodel.aainfographics.BuildConfig;
import la.AbstractC7024f;

/* renamed from: la.b */
/* loaded from: classes.dex */
final class C7016b extends AbstractC7024f {

    /* renamed from: a */
    private final String f18638a;

    /* renamed from: b */
    private final long f18639b;

    /* renamed from: c */
    private final AbstractC7024f.EnumC7026b f18640c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: la.b$b */
    /* loaded from: classes.dex */
    public static final class C7018b extends AbstractC7024f.AbstractC7025a {

        /* renamed from: a */
        private String f18641a;

        /* renamed from: b */
        private Long f18642b;

        /* renamed from: c */
        private AbstractC7024f.EnumC7026b f18643c;

        @Override // la.AbstractC7024f.AbstractC7025a
        /* renamed from: a */
        public AbstractC7024f mo19557a() {
            Long l = this.f18642b;
            String str = BuildConfig.VERSION_NAME;
            if (l == null) {
                str = BuildConfig.VERSION_NAME + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C7016b(this.f18641a, this.f18642b.longValue(), this.f18643c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // la.AbstractC7024f.AbstractC7025a
        /* renamed from: b */
        public AbstractC7024f.AbstractC7025a mo19556b(AbstractC7024f.EnumC7026b enumC7026b) {
            this.f18643c = enumC7026b;
            return this;
        }

        @Override // la.AbstractC7024f.AbstractC7025a
        /* renamed from: c */
        public AbstractC7024f.AbstractC7025a mo19555c(String str) {
            this.f18641a = str;
            return this;
        }

        @Override // la.AbstractC7024f.AbstractC7025a
        /* renamed from: d */
        public AbstractC7024f.AbstractC7025a mo19554d(long j) {
            this.f18642b = Long.valueOf(j);
            return this;
        }
    }

    @Override // la.AbstractC7024f
    /* renamed from: b */
    public AbstractC7024f.EnumC7026b mo19560b() {
        return this.f18640c;
    }

    @Override // la.AbstractC7024f
    /* renamed from: c */
    public String mo19559c() {
        return this.f18638a;
    }

    @Override // la.AbstractC7024f
    /* renamed from: d */
    public long mo19558d() {
        return this.f18639b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7024f) {
            AbstractC7024f abstractC7024f = (AbstractC7024f) obj;
            String str = this.f18638a;
            if (str != null ? str.equals(abstractC7024f.mo19559c()) : abstractC7024f.mo19559c() == null) {
                if (this.f18639b == abstractC7024f.mo19558d()) {
                    AbstractC7024f.EnumC7026b enumC7026b = this.f18640c;
                    if (enumC7026b == null) {
                        if (abstractC7024f.mo19560b() == null) {
                            return true;
                        }
                    } else if (enumC7026b.equals(abstractC7024f.mo19560b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f18638a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f18639b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC7024f.EnumC7026b enumC7026b = this.f18640c;
        return i ^ (enumC7026b != null ? enumC7026b.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f18638a + ", tokenExpirationTimestamp=" + this.f18639b + ", responseCode=" + this.f18640c + "}";
    }

    private C7016b(String str, long j, AbstractC7024f.EnumC7026b enumC7026b) {
        this.f18638a = str;
        this.f18639b = j;
        this.f18640c = enumC7026b;
    }
}
