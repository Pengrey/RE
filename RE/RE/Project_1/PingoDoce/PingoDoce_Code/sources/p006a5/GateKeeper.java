package p006a5;

import p181jd.Intrinsics;

/* renamed from: a5.a */
/* loaded from: classes.dex */
public final class GateKeeper {

    /* renamed from: a */
    private final String f86a;

    /* renamed from: b */
    private final boolean f87b;

    public GateKeeper(String str, boolean z) {
        Intrinsics.isThisObjectNull(str, "name");
        this.f86a = str;
        this.f87b = z;
    }

    /* renamed from: a */
    public final String m42104a() {
        return this.f86a;
    }

    /* renamed from: b */
    public final boolean m42103b() {
        return this.f87b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GateKeeper) {
                GateKeeper gateKeeper = (GateKeeper) obj;
                return Intrinsics.equals(this.f86a, gateKeeper.f86a) && this.f87b == gateKeeper.f87b;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f86a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f87b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f86a + ", value=" + this.f87b + ")";
    }
}
