package pa;

import java.util.Objects;
import javax.annotation.Nonnull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pa.a */
/* loaded from: classes.dex */
public final class C8583a extends AbstractC8588f {

    /* renamed from: a */
    private final String f22186a;

    /* renamed from: b */
    private final String f22187b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8583a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f22186a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f22187b = str2;
    }

    @Override // pa.AbstractC8588f
    @Nonnull
    /* renamed from: b */
    public String mo15084b() {
        return this.f22186a;
    }

    @Override // pa.AbstractC8588f
    @Nonnull
    /* renamed from: c */
    public String mo15083c() {
        return this.f22187b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8588f) {
            AbstractC8588f abstractC8588f = (AbstractC8588f) obj;
            return this.f22186a.equals(abstractC8588f.mo15084b()) && this.f22187b.equals(abstractC8588f.mo15083c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22186a.hashCode() ^ 1000003) * 1000003) ^ this.f22187b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f22186a + ", version=" + this.f22187b + "}";
    }
}
