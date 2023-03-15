package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.c */
/* loaded from: classes.dex */
final class C8517c extends AbstractC8472a0.AbstractC8473a {

    /* renamed from: a */
    private final int f21988a;

    /* renamed from: b */
    private final String f21989b;

    /* renamed from: c */
    private final int f21990c;

    /* renamed from: d */
    private final int f21991d;

    /* renamed from: e */
    private final long f21992e;

    /* renamed from: f */
    private final long f21993f;

    /* renamed from: g */
    private final long f21994g;

    /* renamed from: h */
    private final String f21995h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* renamed from: p9.c$b */
    /* loaded from: classes.dex */
    public static final class C8519b extends AbstractC8472a0.AbstractC8473a.AbstractC8474a {

        /* renamed from: a */
        private Integer f21996a;

        /* renamed from: b */
        private String f21997b;

        /* renamed from: c */
        private Integer f21998c;

        /* renamed from: d */
        private Integer f21999d;

        /* renamed from: e */
        private Long f22000e;

        /* renamed from: f */
        private Long f22001f;

        /* renamed from: g */
        private Long f22002g;

        /* renamed from: h */
        private String f22003h;

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8473a mo15307a() {
            Integer num = this.f21996a;
            String str = BuildConfig.VERSION_NAME;
            if (num == null) {
                str = BuildConfig.VERSION_NAME + " pid";
            }
            if (this.f21997b == null) {
                str = str + " processName";
            }
            if (this.f21998c == null) {
                str = str + " reasonCode";
            }
            if (this.f21999d == null) {
                str = str + " importance";
            }
            if (this.f22000e == null) {
                str = str + " pss";
            }
            if (this.f22001f == null) {
                str = str + " rss";
            }
            if (this.f22002g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C8517c(this.f21996a.intValue(), this.f21997b, this.f21998c.intValue(), this.f21999d.intValue(), this.f22000e.longValue(), this.f22001f.longValue(), this.f22002g.longValue(), this.f22003h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8473a.AbstractC8474a mo15306b(int i) {
            this.f21999d = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8473a.AbstractC8474a mo15305c(int i) {
            this.f21996a = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8473a.AbstractC8474a mo15304d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f21997b = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8473a.AbstractC8474a mo15303e(long j) {
            this.f22000e = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8473a.AbstractC8474a mo15302f(int i) {
            this.f21998c = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: g */
        public AbstractC8472a0.AbstractC8473a.AbstractC8474a mo15301g(long j) {
            this.f22001f = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: h */
        public AbstractC8472a0.AbstractC8473a.AbstractC8474a mo15300h(long j) {
            this.f22002g = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8473a.AbstractC8474a
        /* renamed from: i */
        public AbstractC8472a0.AbstractC8473a.AbstractC8474a mo15299i(String str) {
            this.f22003h = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8473a
    /* renamed from: b */
    public int mo15315b() {
        return this.f21991d;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8473a
    /* renamed from: c */
    public int mo15314c() {
        return this.f21988a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8473a
    /* renamed from: d */
    public String mo15313d() {
        return this.f21989b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8473a
    /* renamed from: e */
    public long mo15312e() {
        return this.f21992e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8473a) {
            AbstractC8472a0.AbstractC8473a abstractC8473a = (AbstractC8472a0.AbstractC8473a) obj;
            if (this.f21988a == abstractC8473a.mo15314c() && this.f21989b.equals(abstractC8473a.mo15313d()) && this.f21990c == abstractC8473a.mo15311f() && this.f21991d == abstractC8473a.mo15315b() && this.f21992e == abstractC8473a.mo15312e() && this.f21993f == abstractC8473a.mo15310g() && this.f21994g == abstractC8473a.mo15309h()) {
                String str = this.f21995h;
                if (str == null) {
                    if (abstractC8473a.mo15308i() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC8473a.mo15308i())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8473a
    /* renamed from: f */
    public int mo15311f() {
        return this.f21990c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8473a
    /* renamed from: g */
    public long mo15310g() {
        return this.f21993f;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8473a
    /* renamed from: h */
    public long mo15309h() {
        return this.f21994g;
    }

    public int hashCode() {
        long j = this.f21992e;
        long j2 = this.f21993f;
        long j3 = this.f21994g;
        int hashCode = (((((((((((((this.f21988a ^ 1000003) * 1000003) ^ this.f21989b.hashCode()) * 1000003) ^ this.f21990c) * 1000003) ^ this.f21991d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f21995h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8473a
    /* renamed from: i */
    public String mo15308i() {
        return this.f21995h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f21988a + ", processName=" + this.f21989b + ", reasonCode=" + this.f21990c + ", importance=" + this.f21991d + ", pss=" + this.f21992e + ", rss=" + this.f21993f + ", timestamp=" + this.f21994g + ", traceFile=" + this.f21995h + "}";
    }

    private C8517c(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.f21988a = i;
        this.f21989b = str;
        this.f21990c = i2;
        this.f21991d = i3;
        this.f21992e = j;
        this.f21993f = j2;
        this.f21994g = j3;
        this.f21995h = str2;
    }
}
