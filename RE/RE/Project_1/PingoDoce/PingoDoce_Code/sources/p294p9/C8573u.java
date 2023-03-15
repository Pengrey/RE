package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.u */
/* loaded from: classes.dex */
final class C8573u extends AbstractC8472a0.AbstractC8482e.AbstractC8509e {

    /* renamed from: a */
    private final int f22155a;

    /* renamed from: b */
    private final String f22156b;

    /* renamed from: c */
    private final String f22157c;

    /* renamed from: d */
    private final boolean f22158d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    /* renamed from: p9.u$b */
    /* loaded from: classes.dex */
    public static final class C8575b extends AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a {

        /* renamed from: a */
        private Integer f22159a;

        /* renamed from: b */
        private String f22160b;

        /* renamed from: c */
        private String f22161c;

        /* renamed from: d */
        private Boolean f22162d;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8509e mo15121a() {
            Integer num = this.f22159a;
            String str = BuildConfig.VERSION_NAME;
            if (num == null) {
                str = BuildConfig.VERSION_NAME + " platform";
            }
            if (this.f22160b == null) {
                str = str + " version";
            }
            if (this.f22161c == null) {
                str = str + " buildVersion";
            }
            if (this.f22162d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C8573u(this.f22159a.intValue(), this.f22160b, this.f22161c, this.f22162d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a mo15120b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f22161c = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a mo15119c(boolean z) {
            this.f22162d = Boolean.valueOf(z);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a mo15118d(int i) {
            this.f22159a = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a mo15117e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f22160b = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e
    /* renamed from: b */
    public String mo15125b() {
        return this.f22157c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e
    /* renamed from: c */
    public int mo15124c() {
        return this.f22155a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e
    /* renamed from: d */
    public String mo15123d() {
        return this.f22156b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8509e
    /* renamed from: e */
    public boolean mo15122e() {
        return this.f22158d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8509e) {
            AbstractC8472a0.AbstractC8482e.AbstractC8509e abstractC8509e = (AbstractC8472a0.AbstractC8482e.AbstractC8509e) obj;
            return this.f22155a == abstractC8509e.mo15124c() && this.f22156b.equals(abstractC8509e.mo15123d()) && this.f22157c.equals(abstractC8509e.mo15125b()) && this.f22158d == abstractC8509e.mo15122e();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f22155a ^ 1000003) * 1000003) ^ this.f22156b.hashCode()) * 1000003) ^ this.f22157c.hashCode()) * 1000003) ^ (this.f22158d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f22155a + ", version=" + this.f22156b + ", buildVersion=" + this.f22157c + ", jailbroken=" + this.f22158d + "}";
    }

    private C8573u(int i, String str, String str2, boolean z) {
        this.f22155a = i;
        this.f22156b = str;
        this.f22157c = str2;
        this.f22158d = z;
    }
}
