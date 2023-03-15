package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.v */
/* loaded from: classes.dex */
final class C8576v extends AbstractC8472a0.AbstractC8482e.AbstractC8511f {

    /* renamed from: a */
    private final String f22163a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    /* renamed from: p9.v$b */
    /* loaded from: classes.dex */
    public static final class C8578b extends AbstractC8472a0.AbstractC8482e.AbstractC8511f.AbstractC8512a {

        /* renamed from: a */
        private String f22164a;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8511f.AbstractC8512a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8511f mo15115a() {
            String str = this.f22164a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " identifier";
            }
            if (str2.isEmpty()) {
                return new C8576v(this.f22164a);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8511f.AbstractC8512a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8511f.AbstractC8512a mo15114b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f22164a = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8511f
    /* renamed from: b */
    public String mo15116b() {
        return this.f22163a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8511f) {
            return this.f22163a.equals(((AbstractC8472a0.AbstractC8482e.AbstractC8511f) obj).mo15116b());
        }
        return false;
    }

    public int hashCode() {
        return this.f22163a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f22163a + "}";
    }

    private C8576v(String str) {
        this.f22163a = str;
    }
}
