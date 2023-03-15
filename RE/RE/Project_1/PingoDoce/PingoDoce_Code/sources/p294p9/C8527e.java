package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.e */
/* loaded from: classes.dex */
final class C8527e extends AbstractC8472a0.AbstractC8478d {

    /* renamed from: a */
    private final C8516b0<AbstractC8472a0.AbstractC8478d.AbstractC8480b> f22008a;

    /* renamed from: b */
    private final String f22009b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    /* renamed from: p9.e$b */
    /* loaded from: classes.dex */
    public static final class C8529b extends AbstractC8472a0.AbstractC8478d.AbstractC8479a {

        /* renamed from: a */
        private C8516b0<AbstractC8472a0.AbstractC8478d.AbstractC8480b> f22010a;

        /* renamed from: b */
        private String f22011b;

        @Override // p294p9.AbstractC8472a0.AbstractC8478d.AbstractC8479a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8478d mo15287a() {
            C8516b0<AbstractC8472a0.AbstractC8478d.AbstractC8480b> c8516b0 = this.f22010a;
            String str = BuildConfig.VERSION_NAME;
            if (c8516b0 == null) {
                str = BuildConfig.VERSION_NAME + " files";
            }
            if (str.isEmpty()) {
                return new C8527e(this.f22010a, this.f22011b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8478d.AbstractC8479a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8478d.AbstractC8479a mo15286b(C8516b0<AbstractC8472a0.AbstractC8478d.AbstractC8480b> c8516b0) {
            Objects.requireNonNull(c8516b0, "Null files");
            this.f22010a = c8516b0;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8478d.AbstractC8479a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8478d.AbstractC8479a mo15285c(String str) {
            this.f22011b = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8478d
    /* renamed from: b */
    public C8516b0<AbstractC8472a0.AbstractC8478d.AbstractC8480b> mo15289b() {
        return this.f22008a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8478d
    /* renamed from: c */
    public String mo15288c() {
        return this.f22009b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8478d) {
            AbstractC8472a0.AbstractC8478d abstractC8478d = (AbstractC8472a0.AbstractC8478d) obj;
            if (this.f22008a.equals(abstractC8478d.mo15289b())) {
                String str = this.f22009b;
                if (str == null) {
                    if (abstractC8478d.mo15288c() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC8478d.mo15288c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f22008a.hashCode() ^ 1000003) * 1000003;
        String str = this.f22009b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f22008a + ", orgId=" + this.f22009b + "}";
    }

    private C8527e(C8516b0<AbstractC8472a0.AbstractC8478d.AbstractC8480b> c8516b0, String str) {
        this.f22008a = c8516b0;
        this.f22009b = str;
    }
}
