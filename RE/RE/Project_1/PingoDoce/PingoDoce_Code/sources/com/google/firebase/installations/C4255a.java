package com.google.firebase.installations;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.firebase.installations.AbstractC4264f;
import java.util.Objects;

/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes.dex */
final class C4255a extends AbstractC4264f {

    /* renamed from: a */
    private final String f11572a;

    /* renamed from: b */
    private final long f11573b;

    /* renamed from: c */
    private final long f11574c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_InstallationTokenResult.java */
    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: classes.dex */
    public static final class C4257b extends AbstractC4264f.AbstractC4265a {

        /* renamed from: a */
        private String f11575a;

        /* renamed from: b */
        private Long f11576b;

        /* renamed from: c */
        private Long f11577c;

        @Override // com.google.firebase.installations.AbstractC4264f.AbstractC4265a
        /* renamed from: a */
        public AbstractC4264f mo28143a() {
            String str = this.f11575a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " token";
            }
            if (this.f11576b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f11577c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new C4255a(this.f11575a, this.f11576b.longValue(), this.f11577c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.installations.AbstractC4264f.AbstractC4265a
        /* renamed from: b */
        public AbstractC4264f.AbstractC4265a mo28142b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f11575a = str;
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC4264f.AbstractC4265a
        /* renamed from: c */
        public AbstractC4264f.AbstractC4265a mo28141c(long j) {
            this.f11577c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC4264f.AbstractC4265a
        /* renamed from: d */
        public AbstractC4264f.AbstractC4265a mo28140d(long j) {
            this.f11576b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC4264f
    /* renamed from: b */
    public String mo28146b() {
        return this.f11572a;
    }

    @Override // com.google.firebase.installations.AbstractC4264f
    /* renamed from: c */
    public long mo28145c() {
        return this.f11574c;
    }

    @Override // com.google.firebase.installations.AbstractC4264f
    /* renamed from: d */
    public long mo28144d() {
        return this.f11573b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4264f) {
            AbstractC4264f abstractC4264f = (AbstractC4264f) obj;
            return this.f11572a.equals(abstractC4264f.mo28146b()) && this.f11573b == abstractC4264f.mo28144d() && this.f11574c == abstractC4264f.mo28145c();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f11573b;
        long j2 = this.f11574c;
        return ((((this.f11572a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f11572a + ", tokenExpirationTimestamp=" + this.f11573b + ", tokenCreationTimestamp=" + this.f11574c + "}";
    }

    private C4255a(String str, long j, long j2) {
        this.f11572a = str;
        this.f11573b = j;
        this.f11574c = j2;
    }
}
