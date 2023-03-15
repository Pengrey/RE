package p483z5;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import p483z5.AbstractC13689m;

/* renamed from: z5.g */
/* loaded from: classes.dex */
final class C13676g extends AbstractC13689m {

    /* renamed from: a */
    private final long f34792a;

    /* renamed from: b */
    private final long f34793b;

    /* renamed from: c */
    private final AbstractC13684k f34794c;

    /* renamed from: d */
    private final Integer f34795d;

    /* renamed from: e */
    private final String f34796e;

    /* renamed from: f */
    private final List<AbstractC13687l> f34797f;

    /* renamed from: g */
    private final EnumC13696p f34798g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_LogRequest.java */
    /* renamed from: z5.g$b */
    /* loaded from: classes.dex */
    public static final class C13678b extends AbstractC13689m.AbstractC13690a {

        /* renamed from: a */
        private Long f34799a;

        /* renamed from: b */
        private Long f34800b;

        /* renamed from: c */
        private AbstractC13684k f34801c;

        /* renamed from: d */
        private Integer f34802d;

        /* renamed from: e */
        private String f34803e;

        /* renamed from: f */
        private List<AbstractC13687l> f34804f;

        /* renamed from: g */
        private EnumC13696p f34805g;

        @Override // p483z5.AbstractC13689m.AbstractC13690a
        /* renamed from: a */
        public AbstractC13689m mo599a() {
            Long l = this.f34799a;
            String str = BuildConfig.VERSION_NAME;
            if (l == null) {
                str = BuildConfig.VERSION_NAME + " requestTimeMs";
            }
            if (this.f34800b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C13676g(this.f34799a.longValue(), this.f34800b.longValue(), this.f34801c, this.f34802d, this.f34803e, this.f34804f, this.f34805g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p483z5.AbstractC13689m.AbstractC13690a
        /* renamed from: b */
        public AbstractC13689m.AbstractC13690a mo598b(AbstractC13684k abstractC13684k) {
            this.f34801c = abstractC13684k;
            return this;
        }

        @Override // p483z5.AbstractC13689m.AbstractC13690a
        /* renamed from: c */
        public AbstractC13689m.AbstractC13690a mo597c(List<AbstractC13687l> list) {
            this.f34804f = list;
            return this;
        }

        @Override // p483z5.AbstractC13689m.AbstractC13690a
        /* renamed from: d */
        AbstractC13689m.AbstractC13690a mo596d(Integer num) {
            this.f34802d = num;
            return this;
        }

        @Override // p483z5.AbstractC13689m.AbstractC13690a
        /* renamed from: e */
        AbstractC13689m.AbstractC13690a mo595e(String str) {
            this.f34803e = str;
            return this;
        }

        @Override // p483z5.AbstractC13689m.AbstractC13690a
        /* renamed from: f */
        public AbstractC13689m.AbstractC13690a mo594f(EnumC13696p enumC13696p) {
            this.f34805g = enumC13696p;
            return this;
        }

        @Override // p483z5.AbstractC13689m.AbstractC13690a
        /* renamed from: g */
        public AbstractC13689m.AbstractC13690a mo593g(long j) {
            this.f34799a = Long.valueOf(j);
            return this;
        }

        @Override // p483z5.AbstractC13689m.AbstractC13690a
        /* renamed from: h */
        public AbstractC13689m.AbstractC13690a mo592h(long j) {
            this.f34800b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p483z5.AbstractC13689m
    /* renamed from: b */
    public AbstractC13684k mo606b() {
        return this.f34794c;
    }

    @Override // p483z5.AbstractC13689m
    /* renamed from: c */
    public List<AbstractC13687l> mo605c() {
        return this.f34797f;
    }

    @Override // p483z5.AbstractC13689m
    /* renamed from: d */
    public Integer mo604d() {
        return this.f34795d;
    }

    @Override // p483z5.AbstractC13689m
    /* renamed from: e */
    public String mo603e() {
        return this.f34796e;
    }

    public boolean equals(Object obj) {
        AbstractC13684k abstractC13684k;
        Integer num;
        String str;
        List<AbstractC13687l> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13689m) {
            AbstractC13689m abstractC13689m = (AbstractC13689m) obj;
            if (this.f34792a == abstractC13689m.mo601g() && this.f34793b == abstractC13689m.mo600h() && ((abstractC13684k = this.f34794c) != null ? abstractC13684k.equals(abstractC13689m.mo606b()) : abstractC13689m.mo606b() == null) && ((num = this.f34795d) != null ? num.equals(abstractC13689m.mo604d()) : abstractC13689m.mo604d() == null) && ((str = this.f34796e) != null ? str.equals(abstractC13689m.mo603e()) : abstractC13689m.mo603e() == null) && ((list = this.f34797f) != null ? list.equals(abstractC13689m.mo605c()) : abstractC13689m.mo605c() == null)) {
                EnumC13696p enumC13696p = this.f34798g;
                if (enumC13696p == null) {
                    if (abstractC13689m.mo602f() == null) {
                        return true;
                    }
                } else if (enumC13696p.equals(abstractC13689m.mo602f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // p483z5.AbstractC13689m
    /* renamed from: f */
    public EnumC13696p mo602f() {
        return this.f34798g;
    }

    @Override // p483z5.AbstractC13689m
    /* renamed from: g */
    public long mo601g() {
        return this.f34792a;
    }

    @Override // p483z5.AbstractC13689m
    /* renamed from: h */
    public long mo600h() {
        return this.f34793b;
    }

    public int hashCode() {
        long j = this.f34792a;
        long j2 = this.f34793b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC13684k abstractC13684k = this.f34794c;
        int hashCode = (i ^ (abstractC13684k == null ? 0 : abstractC13684k.hashCode())) * 1000003;
        Integer num = this.f34795d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f34796e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC13687l> list = this.f34797f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC13696p enumC13696p = this.f34798g;
        return hashCode4 ^ (enumC13696p != null ? enumC13696p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f34792a + ", requestUptimeMs=" + this.f34793b + ", clientInfo=" + this.f34794c + ", logSource=" + this.f34795d + ", logSourceName=" + this.f34796e + ", logEvents=" + this.f34797f + ", qosTier=" + this.f34798g + "}";
    }

    private C13676g(long j, long j2, AbstractC13684k abstractC13684k, Integer num, String str, List<AbstractC13687l> list, EnumC13696p enumC13696p) {
        this.f34792a = j;
        this.f34793b = j2;
        this.f34794c = abstractC13684k;
        this.f34795d = num;
        this.f34796e = str;
        this.f34797f = list;
        this.f34798g = enumC13696p;
    }
}
