package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.n */
/* loaded from: classes.dex */
final class C8552n extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a {

    /* renamed from: a */
    private final long f22101a;

    /* renamed from: b */
    private final long f22102b;

    /* renamed from: c */
    private final String f22103c;

    /* renamed from: d */
    private final String f22104d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    /* renamed from: p9.n$b */
    /* loaded from: classes.dex */
    public static final class C8554b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a {

        /* renamed from: a */
        private Long f22105a;

        /* renamed from: b */
        private Long f22106b;

        /* renamed from: c */
        private String f22107c;

        /* renamed from: d */
        private String f22108d;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a mo15182a() {
            Long l = this.f22105a;
            String str = BuildConfig.VERSION_NAME;
            if (l == null) {
                str = BuildConfig.VERSION_NAME + " baseAddress";
            }
            if (this.f22106b == null) {
                str = str + " size";
            }
            if (this.f22107c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C8552n(this.f22105a.longValue(), this.f22106b.longValue(), this.f22107c, this.f22108d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a mo15181b(long j) {
            this.f22105a = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a mo15180c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f22107c = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a mo15179d(long j) {
            this.f22106b = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a mo15178e(String str) {
            this.f22108d = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a
    /* renamed from: b */
    public long mo15186b() {
        return this.f22101a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a
    /* renamed from: c */
    public String mo15185c() {
        return this.f22103c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a
    /* renamed from: d */
    public long mo15184d() {
        return this.f22102b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a
    /* renamed from: e */
    public String mo15183e() {
        return this.f22104d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a abstractC8493a = (AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a) obj;
            if (this.f22101a == abstractC8493a.mo15186b() && this.f22102b == abstractC8493a.mo15184d() && this.f22103c.equals(abstractC8493a.mo15185c())) {
                String str = this.f22104d;
                if (str == null) {
                    if (abstractC8493a.mo15183e() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC8493a.mo15183e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f22101a;
        long j2 = this.f22102b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f22103c.hashCode()) * 1000003;
        String str = this.f22104d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f22101a + ", size=" + this.f22102b + ", name=" + this.f22103c + ", uuid=" + this.f22104d + "}";
    }

    private C8552n(long j, long j2, String str, String str2) {
        this.f22101a = j;
        this.f22102b = j2;
        this.f22103c = str;
        this.f22104d = str2;
    }
}
