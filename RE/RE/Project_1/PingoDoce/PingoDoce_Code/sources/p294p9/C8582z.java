package p294p9;

import java.util.Objects;
import p294p9.AbstractC8520c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p9.z */
/* loaded from: classes.dex */
public final class C8582z extends AbstractC8520c0.AbstractC8523c {

    /* renamed from: a */
    private final String f22183a;

    /* renamed from: b */
    private final String f22184b;

    /* renamed from: c */
    private final boolean f22185c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8582z(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f22183a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f22184b = str2;
        this.f22185c = z;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8523c
    /* renamed from: b */
    public boolean mo15095b() {
        return this.f22185c;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8523c
    /* renamed from: c */
    public String mo15094c() {
        return this.f22184b;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8523c
    /* renamed from: d */
    public String mo15093d() {
        return this.f22183a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8520c0.AbstractC8523c) {
            AbstractC8520c0.AbstractC8523c abstractC8523c = (AbstractC8520c0.AbstractC8523c) obj;
            return this.f22183a.equals(abstractC8523c.mo15093d()) && this.f22184b.equals(abstractC8523c.mo15094c()) && this.f22185c == abstractC8523c.mo15095b();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22183a.hashCode() ^ 1000003) * 1000003) ^ this.f22184b.hashCode()) * 1000003) ^ (this.f22185c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f22183a + ", osCodeName=" + this.f22184b + ", isRooted=" + this.f22185c + "}";
    }
}
