package af;

import p181jd.Intrinsics;

/* renamed from: af.a */
/* loaded from: classes2.dex */
public final class ApiError {

    /* renamed from: a */
    private final String f307a;

    public ApiError(String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f307a = str;
    }

    /* renamed from: a */
    public final String m41777a() {
        return this.f307a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiError) && Intrinsics.equals(this.f307a, ((ApiError) obj).f307a);
    }

    public int hashCode() {
        return this.f307a.hashCode();
    }

    public String toString() {
        String str = this.f307a;
        return "ApiError(message=" + str + ")";
    }
}
