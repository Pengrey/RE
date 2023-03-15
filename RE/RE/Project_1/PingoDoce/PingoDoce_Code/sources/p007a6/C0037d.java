package p007a6;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import p007a6.AbstractC0056o;
import p461y5.EnumC13113d;

/* renamed from: a6.d */
/* loaded from: classes.dex */
final class C0037d extends AbstractC0056o {

    /* renamed from: a */
    private final String f133a;

    /* renamed from: b */
    private final byte[] f134b;

    /* renamed from: c */
    private final EnumC13113d f135c;

    /* compiled from: AutoValue_TransportContext.java */
    /* renamed from: a6.d$b */
    /* loaded from: classes.dex */
    static final class C0039b extends AbstractC0056o.AbstractC0057a {

        /* renamed from: a */
        private String f136a;

        /* renamed from: b */
        private byte[] f137b;

        /* renamed from: c */
        private EnumC13113d f138c;

        @Override // p007a6.AbstractC0056o.AbstractC0057a
        /* renamed from: a */
        public AbstractC0056o mo42039a() {
            String str = this.f136a;
            String str2 = BuildConfig.VERSION_NAME;
            if (str == null) {
                str2 = BuildConfig.VERSION_NAME + " backendName";
            }
            if (this.f138c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new C0037d(this.f136a, this.f137b, this.f138c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p007a6.AbstractC0056o.AbstractC0057a
        /* renamed from: b */
        public AbstractC0056o.AbstractC0057a mo42038b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f136a = str;
            return this;
        }

        @Override // p007a6.AbstractC0056o.AbstractC0057a
        /* renamed from: c */
        public AbstractC0056o.AbstractC0057a mo42037c(byte[] bArr) {
            this.f137b = bArr;
            return this;
        }

        @Override // p007a6.AbstractC0056o.AbstractC0057a
        /* renamed from: d */
        public AbstractC0056o.AbstractC0057a mo42036d(EnumC13113d enumC13113d) {
            Objects.requireNonNull(enumC13113d, "Null priority");
            this.f138c = enumC13113d;
            return this;
        }
    }

    @Override // p007a6.AbstractC0056o
    /* renamed from: b */
    public String mo42044b() {
        return this.f133a;
    }

    @Override // p007a6.AbstractC0056o
    /* renamed from: c */
    public byte[] mo42043c() {
        return this.f134b;
    }

    @Override // p007a6.AbstractC0056o
    /* renamed from: d */
    public EnumC13113d mo42042d() {
        return this.f135c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0056o) {
            AbstractC0056o abstractC0056o = (AbstractC0056o) obj;
            if (this.f133a.equals(abstractC0056o.mo42044b())) {
                if (Arrays.equals(this.f134b, abstractC0056o instanceof C0037d ? ((C0037d) abstractC0056o).f134b : abstractC0056o.mo42043c()) && this.f135c.equals(abstractC0056o.mo42042d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f133a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f134b)) * 1000003) ^ this.f135c.hashCode();
    }

    private C0037d(String str, byte[] bArr, EnumC13113d enumC13113d) {
        this.f133a = str;
        this.f134b = bArr;
        this.f135c = enumC13113d;
    }
}
