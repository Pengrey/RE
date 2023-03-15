package p007a6;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Map;
import java.util.Objects;
import p007a6.AbstractC0046i;

/* renamed from: a6.b */
/* loaded from: classes.dex */
final class C0031b extends AbstractC0046i {

    /* renamed from: a */
    private final String f111a;

    /* renamed from: b */
    private final Integer f112b;

    /* renamed from: c */
    private final C0045h f113c;

    /* renamed from: d */
    private final long f114d;

    /* renamed from: e */
    private final long f115e;

    /* renamed from: f */
    private final Map<String, String> f116f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: a6.b$b */
    /* loaded from: classes.dex */
    public static final class C0033b extends AbstractC0046i.AbstractC0047a {

        /* renamed from: a */
        private String f117a;

        /* renamed from: b */
        private Integer f118b;

        /* renamed from: c */
        private C0045h f119c;

        /* renamed from: d */
        private Long f120d;

        /* renamed from: e */
        private Long f121e;

        /* renamed from: f */
        private Map<String, String> f122f;

        @Override // p007a6.AbstractC0046i.AbstractC0047a
        /* renamed from: d */
        public AbstractC0046i mo42073d() {
            String str = this.f117a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " transportName";
            }
            if (this.f119c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f120d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f121e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f122f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new C0031b(this.f117a, this.f118b, this.f119c, this.f120d.longValue(), this.f121e.longValue(), this.f122f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p007a6.AbstractC0046i.AbstractC0047a
        /* renamed from: e */
        protected Map<String, String> mo42072e() {
            Map<String, String> map = this.f122f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p007a6.AbstractC0046i.AbstractC0047a
        /* renamed from: f */
        public AbstractC0046i.AbstractC0047a mo42071f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f122f = map;
            return this;
        }

        @Override // p007a6.AbstractC0046i.AbstractC0047a
        /* renamed from: g */
        public AbstractC0046i.AbstractC0047a mo42070g(Integer num) {
            this.f118b = num;
            return this;
        }

        @Override // p007a6.AbstractC0046i.AbstractC0047a
        /* renamed from: h */
        public AbstractC0046i.AbstractC0047a mo42069h(C0045h c0045h) {
            Objects.requireNonNull(c0045h, "Null encodedPayload");
            this.f119c = c0045h;
            return this;
        }

        @Override // p007a6.AbstractC0046i.AbstractC0047a
        /* renamed from: i */
        public AbstractC0046i.AbstractC0047a mo42068i(long j) {
            this.f120d = Long.valueOf(j);
            return this;
        }

        @Override // p007a6.AbstractC0046i.AbstractC0047a
        /* renamed from: j */
        public AbstractC0046i.AbstractC0047a mo42067j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f117a = str;
            return this;
        }

        @Override // p007a6.AbstractC0046i.AbstractC0047a
        /* renamed from: k */
        public AbstractC0046i.AbstractC0047a mo42066k(long j) {
            this.f121e = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p007a6.AbstractC0046i
    /* renamed from: c */
    public Map<String, String> mo42086c() {
        return this.f116f;
    }

    @Override // p007a6.AbstractC0046i
    /* renamed from: d */
    public Integer mo42085d() {
        return this.f112b;
    }

    @Override // p007a6.AbstractC0046i
    /* renamed from: e */
    public C0045h mo42084e() {
        return this.f113c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0046i) {
            AbstractC0046i abstractC0046i = (AbstractC0046i) obj;
            return this.f111a.equals(abstractC0046i.mo42079j()) && ((num = this.f112b) != null ? num.equals(abstractC0046i.mo42085d()) : abstractC0046i.mo42085d() == null) && this.f113c.equals(abstractC0046i.mo42084e()) && this.f114d == abstractC0046i.mo42083f() && this.f115e == abstractC0046i.mo42078k() && this.f116f.equals(abstractC0046i.mo42086c());
        }
        return false;
    }

    @Override // p007a6.AbstractC0046i
    /* renamed from: f */
    public long mo42083f() {
        return this.f114d;
    }

    public int hashCode() {
        int hashCode = (this.f111a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f112b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f114d;
        long j2 = this.f115e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f113c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f116f.hashCode();
    }

    @Override // p007a6.AbstractC0046i
    /* renamed from: j */
    public String mo42079j() {
        return this.f111a;
    }

    @Override // p007a6.AbstractC0046i
    /* renamed from: k */
    public long mo42078k() {
        return this.f115e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f111a + ", code=" + this.f112b + ", encodedPayload=" + this.f113c + ", eventMillis=" + this.f114d + ", uptimeMillis=" + this.f115e + ", autoMetadata=" + this.f116f + "}";
    }

    private C0031b(String str, Integer num, C0045h c0045h, long j, long j2, Map<String, String> map) {
        this.f111a = str;
        this.f112b = num;
        this.f113c = c0045h;
        this.f114d = j;
        this.f115e = j2;
        this.f116f = map;
    }
}
