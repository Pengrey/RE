package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.d */
/* loaded from: classes.dex */
final class C8524d extends AbstractC8472a0.AbstractC8476c {

    /* renamed from: a */
    private final String f22004a;

    /* renamed from: b */
    private final String f22005b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    /* renamed from: p9.d$b */
    /* loaded from: classes.dex */
    public static final class C8526b extends AbstractC8472a0.AbstractC8476c.AbstractC8477a {

        /* renamed from: a */
        private String f22006a;

        /* renamed from: b */
        private String f22007b;

        @Override // p294p9.AbstractC8472a0.AbstractC8476c.AbstractC8477a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8476c mo15292a() {
            String str = this.f22006a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " key";
            }
            if (this.f22007b == null) {
                str2 = str2 + " value";
            }
            if (str2.isEmpty()) {
                return new C8524d(this.f22006a, this.f22007b);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8476c.AbstractC8477a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8476c.AbstractC8477a mo15291b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f22006a = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8476c.AbstractC8477a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8476c.AbstractC8477a mo15290c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f22007b = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8476c
    /* renamed from: b */
    public String mo15294b() {
        return this.f22004a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8476c
    /* renamed from: c */
    public String mo15293c() {
        return this.f22005b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8476c) {
            AbstractC8472a0.AbstractC8476c abstractC8476c = (AbstractC8472a0.AbstractC8476c) obj;
            return this.f22004a.equals(abstractC8476c.mo15294b()) && this.f22005b.equals(abstractC8476c.mo15293c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22004a.hashCode() ^ 1000003) * 1000003) ^ this.f22005b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f22004a + ", value=" + this.f22005b + "}";
    }

    private C8524d(String str, String str2) {
        this.f22004a = str;
        this.f22005b = str2;
    }
}
