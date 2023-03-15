package p092f0;

import p181jd.Intrinsics;

/* renamed from: f0.o0 */
/* loaded from: classes.dex */
public final class OpaqueKey {

    /* renamed from: a */
    private final String f14486a;

    public OpaqueKey(String str) {
        Intrinsics.isThisObjectNull(str, "key");
        this.f14486a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && Intrinsics.equals(this.f14486a, ((OpaqueKey) obj).f14486a);
    }

    public int hashCode() {
        return this.f14486a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f14486a + ')';
    }
}
