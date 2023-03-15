package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.f */
/* loaded from: classes.dex */
final class C8530f extends AbstractC8472a0.AbstractC8478d.AbstractC8480b {

    /* renamed from: a */
    private final String f22012a;

    /* renamed from: b */
    private final byte[] f22013b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    /* renamed from: p9.f$b */
    /* loaded from: classes.dex */
    public static final class C8532b extends AbstractC8472a0.AbstractC8478d.AbstractC8480b.AbstractC8481a {

        /* renamed from: a */
        private String f22014a;

        /* renamed from: b */
        private byte[] f22015b;

        @Override // p294p9.AbstractC8472a0.AbstractC8478d.AbstractC8480b.AbstractC8481a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8478d.AbstractC8480b mo15282a() {
            String str = this.f22014a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " filename";
            }
            if (this.f22015b == null) {
                str2 = str2 + " contents";
            }
            if (str2.isEmpty()) {
                return new C8530f(this.f22014a, this.f22015b);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8478d.AbstractC8480b.AbstractC8481a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8478d.AbstractC8480b.AbstractC8481a mo15281b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f22015b = bArr;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8478d.AbstractC8480b.AbstractC8481a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8478d.AbstractC8480b.AbstractC8481a mo15280c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f22014a = str;
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8478d.AbstractC8480b
    /* renamed from: b */
    public byte[] mo15284b() {
        return this.f22013b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8478d.AbstractC8480b
    /* renamed from: c */
    public String mo15283c() {
        return this.f22012a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8478d.AbstractC8480b) {
            AbstractC8472a0.AbstractC8478d.AbstractC8480b abstractC8480b = (AbstractC8472a0.AbstractC8478d.AbstractC8480b) obj;
            if (this.f22012a.equals(abstractC8480b.mo15283c())) {
                if (Arrays.equals(this.f22013b, abstractC8480b instanceof C8530f ? ((C8530f) abstractC8480b).f22013b : abstractC8480b.mo15284b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22012a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22013b);
    }

    public String toString() {
        return "File{filename=" + this.f22012a + ", contents=" + Arrays.toString(this.f22013b) + "}";
    }

    private C8530f(String str, byte[] bArr) {
        this.f22012a = str;
        this.f22013b = bArr;
    }
}
