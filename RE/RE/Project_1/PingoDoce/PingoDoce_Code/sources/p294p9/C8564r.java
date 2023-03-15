package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.r */
/* loaded from: classes.dex */
final class C8564r extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b {

    /* renamed from: a */
    private final long f22131a;

    /* renamed from: b */
    private final String f22132b;

    /* renamed from: c */
    private final String f22133c;

    /* renamed from: d */
    private final long f22134d;

    /* renamed from: e */
    private final int f22135e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    /* renamed from: p9.r$b */
    /* loaded from: classes.dex */
    public static final class C8566b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a {

        /* renamed from: a */
        private Long f22136a;

        /* renamed from: b */
        private String f22137b;

        /* renamed from: c */
        private String f22138c;

        /* renamed from: d */
        private Long f22139d;

        /* renamed from: e */
        private Integer f22140e;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b mo15147a() {
            Long l = this.f22136a;
            String str = BuildConfig.VERSION_NAME;
            if (l == null) {
                str = BuildConfig.VERSION_NAME + " pc";
            }
            if (this.f22137b == null) {
                str = str + " symbol";
            }
            if (this.f22139d == null) {
                str = str + " offset";
            }
            if (this.f22140e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C8564r(this.f22136a.longValue(), this.f22137b, this.f22138c, this.f22139d.longValue(), this.f22140e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a mo15146b(String str) {
            this.f22138c = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a mo15145c(int i) {
            this.f22140e = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a mo15144d(long j) {
            this.f22139d = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a mo15143e(long j) {
            this.f22136a = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a mo15142f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f22137b = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b
    /* renamed from: b */
    public String mo15152b() {
        return this.f22133c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b
    /* renamed from: c */
    public int mo15151c() {
        return this.f22135e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b
    /* renamed from: d */
    public long mo15150d() {
        return this.f22134d;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b
    /* renamed from: e */
    public long mo15149e() {
        return this.f22131a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b abstractC8502b = (AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b) obj;
            return this.f22131a == abstractC8502b.mo15149e() && this.f22132b.equals(abstractC8502b.mo15148f()) && ((str = this.f22133c) != null ? str.equals(abstractC8502b.mo15152b()) : abstractC8502b.mo15152b() == null) && this.f22134d == abstractC8502b.mo15150d() && this.f22135e == abstractC8502b.mo15151c();
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b
    /* renamed from: f */
    public String mo15148f() {
        return this.f22132b;
    }

    public int hashCode() {
        long j = this.f22131a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f22132b.hashCode()) * 1000003;
        String str = this.f22133c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f22134d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f22135e;
    }

    public String toString() {
        return "Frame{pc=" + this.f22131a + ", symbol=" + this.f22132b + ", file=" + this.f22133c + ", offset=" + this.f22134d + ", importance=" + this.f22135e + "}";
    }

    private C8564r(long j, String str, String str2, long j2, int i) {
        this.f22131a = j;
        this.f22132b = str;
        this.f22133c = str2;
        this.f22134d = j2;
        this.f22135e = i;
    }
}
