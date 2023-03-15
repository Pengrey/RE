package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.p */
/* loaded from: classes.dex */
final class C8558p extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d {

    /* renamed from: a */
    private final String f22119a;

    /* renamed from: b */
    private final String f22120b;

    /* renamed from: c */
    private final long f22121c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    /* renamed from: p9.p$b */
    /* loaded from: classes.dex */
    public static final class C8560b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a {

        /* renamed from: a */
        private String f22122a;

        /* renamed from: b */
        private String f22123b;

        /* renamed from: c */
        private Long f22124c;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d mo15163a() {
            String str = this.f22122a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " name";
            }
            if (this.f22123b == null) {
                str2 = str2 + " code";
            }
            if (this.f22124c == null) {
                str2 = str2 + " address";
            }
            if (str2.isEmpty()) {
                return new C8558p(this.f22122a, this.f22123b, this.f22124c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a mo15162b(long j) {
            this.f22124c = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a mo15161c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f22123b = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a mo15160d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f22122a = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d
    /* renamed from: b */
    public long mo15166b() {
        return this.f22121c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d
    /* renamed from: c */
    public String mo15165c() {
        return this.f22120b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d
    /* renamed from: d */
    public String mo15164d() {
        return this.f22119a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d abstractC8498d = (AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d) obj;
            return this.f22119a.equals(abstractC8498d.mo15164d()) && this.f22120b.equals(abstractC8498d.mo15165c()) && this.f22121c == abstractC8498d.mo15166b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f22121c;
        return ((((this.f22119a.hashCode() ^ 1000003) * 1000003) ^ this.f22120b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f22119a + ", code=" + this.f22120b + ", address=" + this.f22121c + "}";
    }

    private C8558p(String str, String str2, long j) {
        this.f22119a = str;
        this.f22120b = str2;
        this.f22121c = j;
    }
}
