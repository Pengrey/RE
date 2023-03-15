package p181jd;

/* renamed from: jd.q */
/* loaded from: classes2.dex */
public final class PackageReference implements InterfaceC6428c {

    /* renamed from: a */
    private final Class f17528a;

    public PackageReference(Class cls, String str) {
        Intrinsics.isThisObjectNull(cls, "jClass");
        Intrinsics.isThisObjectNull(str, "moduleName");
        this.f17528a = cls;
    }

    /* renamed from: b */
    public Class mo20958b() {
        return this.f17528a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof PackageReference) && Intrinsics.equals(mo20958b(), ((PackageReference) obj).mo20958b());
    }

    public int hashCode() {
        return mo20958b().hashCode();
    }

    public String toString() {
        return mo20958b().toString() + " (Kotlin reflection is not available)";
    }
}
