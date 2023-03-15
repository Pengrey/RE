package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.m */
/* loaded from: classes.dex */
final class C8549m extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b {

    /* renamed from: a */
    private final C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> f22091a;

    /* renamed from: b */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c f22092b;

    /* renamed from: c */
    private final AbstractC8472a0.AbstractC8473a f22093c;

    /* renamed from: d */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d f22094d;

    /* renamed from: e */
    private final C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a> f22095e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    /* renamed from: p9.m$b */
    /* loaded from: classes.dex */
    public static final class C8551b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b {

        /* renamed from: a */
        private C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> f22096a;

        /* renamed from: b */
        private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c f22097b;

        /* renamed from: c */
        private AbstractC8472a0.AbstractC8473a f22098c;

        /* renamed from: d */
        private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d f22099d;

        /* renamed from: e */
        private C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a> f22100e;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b mo15192a() {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d abstractC8498d = this.f22099d;
            String str = BuildConfig.VERSION_NAME;
            if (abstractC8498d == null) {
                str = BuildConfig.VERSION_NAME + " signal";
            }
            if (this.f22100e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C8549m(this.f22096a, this.f22097b, this.f22098c, this.f22099d, this.f22100e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b mo15191b(AbstractC8472a0.AbstractC8473a abstractC8473a) {
            this.f22098c = abstractC8473a;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b mo15190c(C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a> c8516b0) {
            Objects.requireNonNull(c8516b0, "Null binaries");
            this.f22100e = c8516b0;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b mo15189d(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c) {
            this.f22097b = abstractC8496c;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b mo15188e(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d abstractC8498d) {
            Objects.requireNonNull(abstractC8498d, "Null signal");
            this.f22099d = abstractC8498d;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b mo15187f(C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> c8516b0) {
            this.f22096a = c8516b0;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b
    /* renamed from: b */
    public AbstractC8472a0.AbstractC8473a mo15197b() {
        return this.f22093c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b
    /* renamed from: c */
    public C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a> mo15196c() {
        return this.f22095e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b
    /* renamed from: d */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c mo15195d() {
        return this.f22092b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b
    /* renamed from: e */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d mo15194e() {
        return this.f22094d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b abstractC8492b = (AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b) obj;
            C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> c8516b0 = this.f22091a;
            if (c8516b0 != null ? c8516b0.equals(abstractC8492b.mo15193f()) : abstractC8492b.mo15193f() == null) {
                AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c = this.f22092b;
                if (abstractC8496c != null ? abstractC8496c.equals(abstractC8492b.mo15195d()) : abstractC8492b.mo15195d() == null) {
                    AbstractC8472a0.AbstractC8473a abstractC8473a = this.f22093c;
                    if (abstractC8473a != null ? abstractC8473a.equals(abstractC8492b.mo15197b()) : abstractC8492b.mo15197b() == null) {
                        if (this.f22094d.equals(abstractC8492b.mo15194e()) && this.f22095e.equals(abstractC8492b.mo15196c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b
    /* renamed from: f */
    public C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> mo15193f() {
        return this.f22091a;
    }

    public int hashCode() {
        C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> c8516b0 = this.f22091a;
        int hashCode = ((c8516b0 == null ? 0 : c8516b0.hashCode()) ^ 1000003) * 1000003;
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c = this.f22092b;
        int hashCode2 = (hashCode ^ (abstractC8496c == null ? 0 : abstractC8496c.hashCode())) * 1000003;
        AbstractC8472a0.AbstractC8473a abstractC8473a = this.f22093c;
        return ((((hashCode2 ^ (abstractC8473a != null ? abstractC8473a.hashCode() : 0)) * 1000003) ^ this.f22094d.hashCode()) * 1000003) ^ this.f22095e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f22091a + ", exception=" + this.f22092b + ", appExitInfo=" + this.f22093c + ", signal=" + this.f22094d + ", binaries=" + this.f22095e + "}";
    }

    private C8549m(C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> c8516b0, AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c, AbstractC8472a0.AbstractC8473a abstractC8473a, AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d abstractC8498d, C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a> c8516b02) {
        this.f22091a = c8516b0;
        this.f22092b = abstractC8496c;
        this.f22093c = abstractC8473a;
        this.f22094d = abstractC8498d;
        this.f22095e = c8516b02;
    }
}
