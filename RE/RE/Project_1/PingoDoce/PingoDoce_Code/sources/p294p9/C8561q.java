package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.q */
/* loaded from: classes.dex */
final class C8561q extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e {

    /* renamed from: a */
    private final String f22125a;

    /* renamed from: b */
    private final int f22126b;

    /* renamed from: c */
    private final C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> f22127c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    /* renamed from: p9.q$b */
    /* loaded from: classes.dex */
    public static final class C8563b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a {

        /* renamed from: a */
        private String f22128a;

        /* renamed from: b */
        private Integer f22129b;

        /* renamed from: c */
        private C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> f22130c;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e mo15156a() {
            String str = this.f22128a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " name";
            }
            if (this.f22129b == null) {
                str2 = str2 + " importance";
            }
            if (this.f22130c == null) {
                str2 = str2 + " frames";
            }
            if (str2.isEmpty()) {
                return new C8561q(this.f22128a, this.f22129b.intValue(), this.f22130c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a mo15155b(C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> c8516b0) {
            Objects.requireNonNull(c8516b0, "Null frames");
            this.f22130c = c8516b0;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a mo15154c(int i) {
            this.f22129b = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a mo15153d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f22128a = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e
    /* renamed from: b */
    public C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> mo15159b() {
        return this.f22127c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e
    /* renamed from: c */
    public int mo15158c() {
        return this.f22126b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e
    /* renamed from: d */
    public String mo15157d() {
        return this.f22125a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e abstractC8500e = (AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e) obj;
            return this.f22125a.equals(abstractC8500e.mo15157d()) && this.f22126b == abstractC8500e.mo15158c() && this.f22127c.equals(abstractC8500e.mo15159b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22125a.hashCode() ^ 1000003) * 1000003) ^ this.f22126b) * 1000003) ^ this.f22127c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f22125a + ", importance=" + this.f22126b + ", frames=" + this.f22127c + "}";
    }

    private C8561q(String str, int i, C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> c8516b0) {
        this.f22125a = str;
        this.f22126b = i;
        this.f22127c = c8516b0;
    }
}
