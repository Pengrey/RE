package p483z5;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Arrays;
import p483z5.AbstractC13687l;

/* renamed from: z5.f */
/* loaded from: classes.dex */
final class C13673f extends AbstractC13687l {

    /* renamed from: a */
    private final long f34778a;

    /* renamed from: b */
    private final Integer f34779b;

    /* renamed from: c */
    private final long f34780c;

    /* renamed from: d */
    private final byte[] f34781d;

    /* renamed from: e */
    private final String f34782e;

    /* renamed from: f */
    private final long f34783f;

    /* renamed from: g */
    private final AbstractC13692o f34784g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_LogEvent.java */
    /* renamed from: z5.f$b */
    /* loaded from: classes.dex */
    public static final class C13675b extends AbstractC13687l.AbstractC13688a {

        /* renamed from: a */
        private Long f34785a;

        /* renamed from: b */
        private Integer f34786b;

        /* renamed from: c */
        private Long f34787c;

        /* renamed from: d */
        private byte[] f34788d;

        /* renamed from: e */
        private String f34789e;

        /* renamed from: f */
        private Long f34790f;

        /* renamed from: g */
        private AbstractC13692o f34791g;

        @Override // p483z5.AbstractC13687l.AbstractC13688a
        /* renamed from: a */
        public AbstractC13687l mo615a() {
            Long l = this.f34785a;
            String str = BuildConfig.VERSION_NAME;
            if (l == null) {
                str = BuildConfig.VERSION_NAME + " eventTimeMs";
            }
            if (this.f34787c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f34790f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C13673f(this.f34785a.longValue(), this.f34786b, this.f34787c.longValue(), this.f34788d, this.f34789e, this.f34790f.longValue(), this.f34791g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p483z5.AbstractC13687l.AbstractC13688a
        /* renamed from: b */
        public AbstractC13687l.AbstractC13688a mo614b(Integer num) {
            this.f34786b = num;
            return this;
        }

        @Override // p483z5.AbstractC13687l.AbstractC13688a
        /* renamed from: c */
        public AbstractC13687l.AbstractC13688a mo613c(long j) {
            this.f34785a = Long.valueOf(j);
            return this;
        }

        @Override // p483z5.AbstractC13687l.AbstractC13688a
        /* renamed from: d */
        public AbstractC13687l.AbstractC13688a mo612d(long j) {
            this.f34787c = Long.valueOf(j);
            return this;
        }

        @Override // p483z5.AbstractC13687l.AbstractC13688a
        /* renamed from: e */
        public AbstractC13687l.AbstractC13688a mo611e(AbstractC13692o abstractC13692o) {
            this.f34791g = abstractC13692o;
            return this;
        }

        @Override // p483z5.AbstractC13687l.AbstractC13688a
        /* renamed from: f */
        AbstractC13687l.AbstractC13688a mo610f(byte[] bArr) {
            this.f34788d = bArr;
            return this;
        }

        @Override // p483z5.AbstractC13687l.AbstractC13688a
        /* renamed from: g */
        AbstractC13687l.AbstractC13688a mo609g(String str) {
            this.f34789e = str;
            return this;
        }

        @Override // p483z5.AbstractC13687l.AbstractC13688a
        /* renamed from: h */
        public AbstractC13687l.AbstractC13688a mo608h(long j) {
            this.f34790f = Long.valueOf(j);
            return this;
        }
    }

    @Override // p483z5.AbstractC13687l
    /* renamed from: b */
    public Integer mo624b() {
        return this.f34779b;
    }

    @Override // p483z5.AbstractC13687l
    /* renamed from: c */
    public long mo623c() {
        return this.f34778a;
    }

    @Override // p483z5.AbstractC13687l
    /* renamed from: d */
    public long mo622d() {
        return this.f34780c;
    }

    @Override // p483z5.AbstractC13687l
    /* renamed from: e */
    public AbstractC13692o mo621e() {
        return this.f34784g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13687l) {
            AbstractC13687l abstractC13687l = (AbstractC13687l) obj;
            if (this.f34778a == abstractC13687l.mo623c() && ((num = this.f34779b) != null ? num.equals(abstractC13687l.mo624b()) : abstractC13687l.mo624b() == null) && this.f34780c == abstractC13687l.mo622d()) {
                if (Arrays.equals(this.f34781d, abstractC13687l instanceof C13673f ? ((C13673f) abstractC13687l).f34781d : abstractC13687l.mo620f()) && ((str = this.f34782e) != null ? str.equals(abstractC13687l.mo619g()) : abstractC13687l.mo619g() == null) && this.f34783f == abstractC13687l.mo618h()) {
                    AbstractC13692o abstractC13692o = this.f34784g;
                    if (abstractC13692o == null) {
                        if (abstractC13687l.mo621e() == null) {
                            return true;
                        }
                    } else if (abstractC13692o.equals(abstractC13687l.mo621e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // p483z5.AbstractC13687l
    /* renamed from: f */
    public byte[] mo620f() {
        return this.f34781d;
    }

    @Override // p483z5.AbstractC13687l
    /* renamed from: g */
    public String mo619g() {
        return this.f34782e;
    }

    @Override // p483z5.AbstractC13687l
    /* renamed from: h */
    public long mo618h() {
        return this.f34783f;
    }

    public int hashCode() {
        long j = this.f34778a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f34779b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f34780c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f34781d)) * 1000003;
        String str = this.f34782e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f34783f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC13692o abstractC13692o = this.f34784g;
        return i2 ^ (abstractC13692o != null ? abstractC13692o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f34778a + ", eventCode=" + this.f34779b + ", eventUptimeMs=" + this.f34780c + ", sourceExtension=" + Arrays.toString(this.f34781d) + ", sourceExtensionJsonProto3=" + this.f34782e + ", timezoneOffsetSeconds=" + this.f34783f + ", networkConnectionInfo=" + this.f34784g + "}";
    }

    private C13673f(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC13692o abstractC13692o) {
        this.f34778a = j;
        this.f34779b = num;
        this.f34780c = j2;
        this.f34781d = bArr;
        this.f34782e = str;
        this.f34783f = j3;
        this.f34784g = abstractC13692o;
    }
}
