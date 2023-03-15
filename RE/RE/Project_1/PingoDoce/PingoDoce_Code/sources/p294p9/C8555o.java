package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.o */
/* loaded from: classes.dex */
final class C8555o extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c {

    /* renamed from: a */
    private final String f22109a;

    /* renamed from: b */
    private final String f22110b;

    /* renamed from: c */
    private final C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> f22111c;

    /* renamed from: d */
    private final AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c f22112d;

    /* renamed from: e */
    private final int f22113e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    /* renamed from: p9.o$b */
    /* loaded from: classes.dex */
    public static final class C8557b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a {

        /* renamed from: a */
        private String f22114a;

        /* renamed from: b */
        private String f22115b;

        /* renamed from: c */
        private C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> f22116c;

        /* renamed from: d */
        private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c f22117d;

        /* renamed from: e */
        private Integer f22118e;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c mo15172a() {
            String str = this.f22114a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " type";
            }
            if (this.f22116c == null) {
                str2 = str2 + " frames";
            }
            if (this.f22118e == null) {
                str2 = str2 + " overflowCount";
            }
            if (str2.isEmpty()) {
                return new C8555o(this.f22114a, this.f22115b, this.f22116c, this.f22117d, this.f22118e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a mo15171b(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c) {
            this.f22117d = abstractC8496c;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a mo15170c(C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> c8516b0) {
            Objects.requireNonNull(c8516b0, "Null frames");
            this.f22116c = c8516b0;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a mo15169d(int i) {
            this.f22118e = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a mo15168e(String str) {
            this.f22115b = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a mo15167f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f22114a = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c
    /* renamed from: b */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c mo15177b() {
        return this.f22112d;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c
    /* renamed from: c */
    public C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> mo15176c() {
        return this.f22111c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c
    /* renamed from: d */
    public int mo15175d() {
        return this.f22113e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c
    /* renamed from: e */
    public String mo15174e() {
        return this.f22110b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c) {
            AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c2 = (AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c) obj;
            return this.f22109a.equals(abstractC8496c2.mo15173f()) && ((str = this.f22110b) != null ? str.equals(abstractC8496c2.mo15174e()) : abstractC8496c2.mo15174e() == null) && this.f22111c.equals(abstractC8496c2.mo15176c()) && ((abstractC8496c = this.f22112d) != null ? abstractC8496c.equals(abstractC8496c2.mo15177b()) : abstractC8496c2.mo15177b() == null) && this.f22113e == abstractC8496c2.mo15175d();
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c
    /* renamed from: f */
    public String mo15173f() {
        return this.f22109a;
    }

    public int hashCode() {
        int hashCode = (this.f22109a.hashCode() ^ 1000003) * 1000003;
        String str = this.f22110b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f22111c.hashCode()) * 1000003;
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c = this.f22112d;
        return ((hashCode2 ^ (abstractC8496c != null ? abstractC8496c.hashCode() : 0)) * 1000003) ^ this.f22113e;
    }

    public String toString() {
        return "Exception{type=" + this.f22109a + ", reason=" + this.f22110b + ", frames=" + this.f22111c + ", causedBy=" + this.f22112d + ", overflowCount=" + this.f22113e + "}";
    }

    private C8555o(String str, String str2, C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> c8516b0, AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c abstractC8496c, int i) {
        this.f22109a = str;
        this.f22110b = str2;
        this.f22111c = c8516b0;
        this.f22112d = abstractC8496c;
        this.f22113e = i;
    }
}
