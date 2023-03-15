package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.t */
/* loaded from: classes.dex */
final class C8570t extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d {

    /* renamed from: a */
    private final String f22153a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    /* renamed from: p9.t$b */
    /* loaded from: classes.dex */
    public static final class C8572b extends AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d.AbstractC8508a {

        /* renamed from: a */
        private String f22154a;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d.AbstractC8508a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d mo15127a() {
            String str = this.f22154a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " content";
            }
            if (str2.isEmpty()) {
                return new C8570t(this.f22154a);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d.AbstractC8508a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d.AbstractC8508a mo15126b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f22154a = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d
    /* renamed from: b */
    public String mo15128b() {
        return this.f22153a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d) {
            return this.f22153a.equals(((AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d) obj).mo15128b());
        }
        return false;
    }

    public int hashCode() {
        return this.f22153a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f22153a + "}";
    }

    private C8570t(String str) {
        this.f22153a = str;
    }
}
