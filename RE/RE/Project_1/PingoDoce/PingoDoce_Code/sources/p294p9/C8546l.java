package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.l */
/* loaded from: classes.dex */
final class C8546l extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a {

    /* renamed from: a */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b f22081a;

    /* renamed from: b */
    private final C8516b0<AbstractC8472a0.AbstractC8476c> f22082b;

    /* renamed from: c */
    private final C8516b0<AbstractC8472a0.AbstractC8476c> f22083c;

    /* renamed from: d */
    private final Boolean f22084d;

    /* renamed from: e */
    private final int f22085e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    /* renamed from: p9.l$b */
    /* loaded from: classes.dex */
    public static final class C8548b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a {

        /* renamed from: a */
        private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b f22086a;

        /* renamed from: b */
        private C8516b0<AbstractC8472a0.AbstractC8476c> f22087b;

        /* renamed from: c */
        private C8516b0<AbstractC8472a0.AbstractC8476c> f22088c;

        /* renamed from: d */
        private Boolean f22089d;

        /* renamed from: e */
        private Integer f22090e;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a mo15203a() {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b abstractC8492b = this.f22086a;
            String str = BuildConfig.VERSION_NAME;
            if (abstractC8492b == null) {
                str = BuildConfig.VERSION_NAME + " execution";
            }
            if (this.f22090e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C8546l(this.f22086a, this.f22087b, this.f22088c, this.f22089d, this.f22090e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a mo15202b(Boolean bool) {
            this.f22089d = bool;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a mo15201c(C8516b0<AbstractC8472a0.AbstractC8476c> c8516b0) {
            this.f22087b = c8516b0;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a mo15200d(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b abstractC8492b) {
            Objects.requireNonNull(abstractC8492b, "Null execution");
            this.f22086a = abstractC8492b;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a mo15199e(C8516b0<AbstractC8472a0.AbstractC8476c> c8516b0) {
            this.f22088c = c8516b0;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a mo15198f(int i) {
            this.f22090e = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8548b() {
        }

        private C8548b(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a abstractC8490a) {
            this.f22086a = abstractC8490a.mo15207d();
            this.f22087b = abstractC8490a.mo15208c();
            this.f22088c = abstractC8490a.mo15206e();
            this.f22089d = abstractC8490a.mo15209b();
            this.f22090e = Integer.valueOf(abstractC8490a.mo15205f());
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a
    /* renamed from: b */
    public Boolean mo15209b() {
        return this.f22084d;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a
    /* renamed from: c */
    public C8516b0<AbstractC8472a0.AbstractC8476c> mo15208c() {
        return this.f22082b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a
    /* renamed from: d */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b mo15207d() {
        return this.f22081a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a
    /* renamed from: e */
    public C8516b0<AbstractC8472a0.AbstractC8476c> mo15206e() {
        return this.f22083c;
    }

    public boolean equals(Object obj) {
        C8516b0<AbstractC8472a0.AbstractC8476c> c8516b0;
        C8516b0<AbstractC8472a0.AbstractC8476c> c8516b02;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a abstractC8490a = (AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a) obj;
            return this.f22081a.equals(abstractC8490a.mo15207d()) && ((c8516b0 = this.f22082b) != null ? c8516b0.equals(abstractC8490a.mo15208c()) : abstractC8490a.mo15208c() == null) && ((c8516b02 = this.f22083c) != null ? c8516b02.equals(abstractC8490a.mo15206e()) : abstractC8490a.mo15206e() == null) && ((bool = this.f22084d) != null ? bool.equals(abstractC8490a.mo15209b()) : abstractC8490a.mo15209b() == null) && this.f22085e == abstractC8490a.mo15205f();
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a
    /* renamed from: f */
    public int mo15205f() {
        return this.f22085e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a
    /* renamed from: g */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a mo15204g() {
        return new C8548b(this);
    }

    public int hashCode() {
        int hashCode = (this.f22081a.hashCode() ^ 1000003) * 1000003;
        C8516b0<AbstractC8472a0.AbstractC8476c> c8516b0 = this.f22082b;
        int hashCode2 = (hashCode ^ (c8516b0 == null ? 0 : c8516b0.hashCode())) * 1000003;
        C8516b0<AbstractC8472a0.AbstractC8476c> c8516b02 = this.f22083c;
        int hashCode3 = (hashCode2 ^ (c8516b02 == null ? 0 : c8516b02.hashCode())) * 1000003;
        Boolean bool = this.f22084d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f22085e;
    }

    public String toString() {
        return "Application{execution=" + this.f22081a + ", customAttributes=" + this.f22082b + ", internalKeys=" + this.f22083c + ", background=" + this.f22084d + ", uiOrientation=" + this.f22085e + "}";
    }

    private C8546l(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b abstractC8492b, C8516b0<AbstractC8472a0.AbstractC8476c> c8516b0, C8516b0<AbstractC8472a0.AbstractC8476c> c8516b02, Boolean bool, int i) {
        this.f22081a = abstractC8492b;
        this.f22082b = c8516b0;
        this.f22083c = c8516b02;
        this.f22084d = bool;
        this.f22085e = i;
    }
}
