package p174j6;

import com.github.aachartmodel.aainfographics.BuildConfig;
import p174j6.AbstractC6315e;

/* renamed from: j6.a */
/* loaded from: classes.dex */
final class C6305a extends AbstractC6315e {

    /* renamed from: b */
    private final long f17313b;

    /* renamed from: c */
    private final int f17314c;

    /* renamed from: d */
    private final int f17315d;

    /* renamed from: e */
    private final long f17316e;

    /* renamed from: f */
    private final int f17317f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventStoreConfig.java */
    /* renamed from: j6.a$b */
    /* loaded from: classes.dex */
    public static final class C6307b extends AbstractC6315e.AbstractC6316a {

        /* renamed from: a */
        private Long f17318a;

        /* renamed from: b */
        private Integer f17319b;

        /* renamed from: c */
        private Integer f17320c;

        /* renamed from: d */
        private Long f17321d;

        /* renamed from: e */
        private Integer f17322e;

        @Override // p174j6.AbstractC6315e.AbstractC6316a
        /* renamed from: a */
        AbstractC6315e mo21267a() {
            Long l = this.f17318a;
            String str = BuildConfig.VERSION_NAME;
            if (l == null) {
                str = BuildConfig.VERSION_NAME + " maxStorageSizeInBytes";
            }
            if (this.f17319b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f17320c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f17321d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f17322e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C6305a(this.f17318a.longValue(), this.f17319b.intValue(), this.f17320c.intValue(), this.f17321d.longValue(), this.f17322e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p174j6.AbstractC6315e.AbstractC6316a
        /* renamed from: b */
        AbstractC6315e.AbstractC6316a mo21266b(int i) {
            this.f17320c = Integer.valueOf(i);
            return this;
        }

        @Override // p174j6.AbstractC6315e.AbstractC6316a
        /* renamed from: c */
        AbstractC6315e.AbstractC6316a mo21265c(long j) {
            this.f17321d = Long.valueOf(j);
            return this;
        }

        @Override // p174j6.AbstractC6315e.AbstractC6316a
        /* renamed from: d */
        AbstractC6315e.AbstractC6316a mo21264d(int i) {
            this.f17319b = Integer.valueOf(i);
            return this;
        }

        @Override // p174j6.AbstractC6315e.AbstractC6316a
        /* renamed from: e */
        AbstractC6315e.AbstractC6316a mo21263e(int i) {
            this.f17322e = Integer.valueOf(i);
            return this;
        }

        @Override // p174j6.AbstractC6315e.AbstractC6316a
        /* renamed from: f */
        AbstractC6315e.AbstractC6316a mo21262f(long j) {
            this.f17318a = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p174j6.AbstractC6315e
    /* renamed from: b */
    public int mo21272b() {
        return this.f17315d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p174j6.AbstractC6315e
    /* renamed from: c */
    public long mo21271c() {
        return this.f17316e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p174j6.AbstractC6315e
    /* renamed from: d */
    public int mo21270d() {
        return this.f17314c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p174j6.AbstractC6315e
    /* renamed from: e */
    public int mo21269e() {
        return this.f17317f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6315e) {
            AbstractC6315e abstractC6315e = (AbstractC6315e) obj;
            return this.f17313b == abstractC6315e.mo21268f() && this.f17314c == abstractC6315e.mo21270d() && this.f17315d == abstractC6315e.mo21272b() && this.f17316e == abstractC6315e.mo21271c() && this.f17317f == abstractC6315e.mo21269e();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p174j6.AbstractC6315e
    /* renamed from: f */
    public long mo21268f() {
        return this.f17313b;
    }

    public int hashCode() {
        long j = this.f17313b;
        long j2 = this.f17316e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17314c) * 1000003) ^ this.f17315d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f17317f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f17313b + ", loadBatchSize=" + this.f17314c + ", criticalSectionEnterTimeoutMs=" + this.f17315d + ", eventCleanUpAge=" + this.f17316e + ", maxBlobByteSizePerRow=" + this.f17317f + "}";
    }

    private C6305a(long j, int i, int i2, long j2, int i3) {
        this.f17313b = j;
        this.f17314c = i;
        this.f17315d = i2;
        this.f17316e = j2;
        this.f17317f = i3;
    }
}
