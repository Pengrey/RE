package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* loaded from: classes.dex */
final class C2401b extends AbstractC2404c.AbstractC2406b {

    /* renamed from: a */
    private final long f6991a;

    /* renamed from: b */
    private final long f6992b;

    /* renamed from: c */
    private final Set<AbstractC2404c.EnumC2408c> f6993c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b */
    /* loaded from: classes.dex */
    static final class C2403b extends AbstractC2404c.AbstractC2406b.AbstractC2407a {

        /* renamed from: a */
        private Long f6994a;

        /* renamed from: b */
        private Long f6995b;

        /* renamed from: c */
        private Set<AbstractC2404c.EnumC2408c> f6996c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c.AbstractC2406b.AbstractC2407a
        /* renamed from: a */
        public AbstractC2404c.AbstractC2406b mo33658a() {
            Long l = this.f6994a;
            String str = BuildConfig.VERSION_NAME;
            if (l == null) {
                str = BuildConfig.VERSION_NAME + " delta";
            }
            if (this.f6995b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f6996c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C2401b(this.f6994a.longValue(), this.f6995b.longValue(), this.f6996c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c.AbstractC2406b.AbstractC2407a
        /* renamed from: b */
        public AbstractC2404c.AbstractC2406b.AbstractC2407a mo33657b(long j) {
            this.f6994a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c.AbstractC2406b.AbstractC2407a
        /* renamed from: c */
        public AbstractC2404c.AbstractC2406b.AbstractC2407a mo33656c(Set<AbstractC2404c.EnumC2408c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f6996c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c.AbstractC2406b.AbstractC2407a
        /* renamed from: d */
        public AbstractC2404c.AbstractC2406b.AbstractC2407a mo33655d(long j) {
            this.f6995b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c.AbstractC2406b
    /* renamed from: b */
    long mo33661b() {
        return this.f6991a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c.AbstractC2406b
    /* renamed from: c */
    Set<AbstractC2404c.EnumC2408c> mo33660c() {
        return this.f6993c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c.AbstractC2406b
    /* renamed from: d */
    long mo33659d() {
        return this.f6992b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2404c.AbstractC2406b) {
            AbstractC2404c.AbstractC2406b abstractC2406b = (AbstractC2404c.AbstractC2406b) obj;
            return this.f6991a == abstractC2406b.mo33661b() && this.f6992b == abstractC2406b.mo33659d() && this.f6993c.equals(abstractC2406b.mo33660c());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f6991a;
        long j2 = this.f6992b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f6993c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f6991a + ", maxAllowedDelay=" + this.f6992b + ", flags=" + this.f6993c + "}";
    }

    private C2401b(long j, long j2, Set<AbstractC2404c.EnumC2408c> set) {
        this.f6991a = j;
        this.f6992b = j2;
        this.f6993c = set;
    }
}
