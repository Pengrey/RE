package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import p294p9.AbstractC8472a0;

/* renamed from: p9.s */
/* loaded from: classes.dex */
final class C8567s extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c {

    /* renamed from: a */
    private final Double f22141a;

    /* renamed from: b */
    private final int f22142b;

    /* renamed from: c */
    private final boolean f22143c;

    /* renamed from: d */
    private final int f22144d;

    /* renamed from: e */
    private final long f22145e;

    /* renamed from: f */
    private final long f22146f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    /* renamed from: p9.s$b */
    /* loaded from: classes.dex */
    public static final class C8569b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a {

        /* renamed from: a */
        private Double f22147a;

        /* renamed from: b */
        private Integer f22148b;

        /* renamed from: c */
        private Boolean f22149c;

        /* renamed from: d */
        private Integer f22150d;

        /* renamed from: e */
        private Long f22151e;

        /* renamed from: f */
        private Long f22152f;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c mo15135a() {
            Integer num = this.f22148b;
            String str = BuildConfig.VERSION_NAME;
            if (num == null) {
                str = BuildConfig.VERSION_NAME + " batteryVelocity";
            }
            if (this.f22149c == null) {
                str = str + " proximityOn";
            }
            if (this.f22150d == null) {
                str = str + " orientation";
            }
            if (this.f22151e == null) {
                str = str + " ramUsed";
            }
            if (this.f22152f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C8567s(this.f22147a, this.f22148b.intValue(), this.f22149c.booleanValue(), this.f22150d.intValue(), this.f22151e.longValue(), this.f22152f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a mo15134b(Double d) {
            this.f22147a = d;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a mo15133c(int i) {
            this.f22148b = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a mo15132d(long j) {
            this.f22152f = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a mo15131e(int i) {
            this.f22150d = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a mo15130f(boolean z) {
            this.f22149c = Boolean.valueOf(z);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a
        /* renamed from: g */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a mo15129g(long j) {
            this.f22151e = Long.valueOf(j);
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c
    /* renamed from: b */
    public Double mo15141b() {
        return this.f22141a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c
    /* renamed from: c */
    public int mo15140c() {
        return this.f22142b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c
    /* renamed from: d */
    public long mo15139d() {
        return this.f22146f;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c
    /* renamed from: e */
    public int mo15138e() {
        return this.f22144d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c abstractC8505c = (AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c) obj;
            Double d = this.f22141a;
            if (d != null ? d.equals(abstractC8505c.mo15141b()) : abstractC8505c.mo15141b() == null) {
                if (this.f22142b == abstractC8505c.mo15140c() && this.f22143c == abstractC8505c.mo15136g() && this.f22144d == abstractC8505c.mo15138e() && this.f22145e == abstractC8505c.mo15137f() && this.f22146f == abstractC8505c.mo15139d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c
    /* renamed from: f */
    public long mo15137f() {
        return this.f22145e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c
    /* renamed from: g */
    public boolean mo15136g() {
        return this.f22143c;
    }

    public int hashCode() {
        Double d = this.f22141a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f22142b) * 1000003;
        int i = this.f22143c ? 1231 : 1237;
        long j = this.f22145e;
        long j2 = this.f22146f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f22144d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f22141a + ", batteryVelocity=" + this.f22142b + ", proximityOn=" + this.f22143c + ", orientation=" + this.f22144d + ", ramUsed=" + this.f22145e + ", diskUsed=" + this.f22146f + "}";
    }

    private C8567s(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f22141a = d;
        this.f22142b = i;
        this.f22143c = z;
        this.f22144d = i2;
        this.f22145e = j;
        this.f22146f = j2;
    }
}
