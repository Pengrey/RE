package module.network.data.remote.models.response;

import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: IdentityErrorResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class IdentityErrorResponse {
    @InterfaceC4469e(name = "error")

    /* renamed from: a */
    private final String f19948a;
    @InterfaceC4469e(name = "error_description")

    /* renamed from: b */
    private final String f19949b;

    public IdentityErrorResponse() {
        this(null, null, 3, null);
    }

    public IdentityErrorResponse(String str, String str2) {
        this.f19948a = str;
        this.f19949b = str2;
    }

    /* renamed from: a */
    public final String m18230a() {
        return this.f19948a;
    }

    /* renamed from: b */
    public final String m18229b() {
        return this.f19949b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentityErrorResponse) {
            IdentityErrorResponse identityErrorResponse = (IdentityErrorResponse) obj;
            return Intrinsics.equals(this.f19948a, identityErrorResponse.f19948a) && Intrinsics.equals(this.f19949b, identityErrorResponse.f19949b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f19948a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19949b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f19948a;
        String str2 = this.f19949b;
        return "IdentityErrorResponse(error=" + str + ", errorDescription=" + str2 + ")";
    }

    public /* synthetic */ IdentityErrorResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
