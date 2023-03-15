package bf;

import com.squareup.moshi.InterfaceC4469e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: bf.a */
/* loaded from: classes2.dex */
public final class TokenRequest {
    @InterfaceC4469e(name = "client_id")

    /* renamed from: a */
    private final String f5641a;
    @InterfaceC4469e(name = "grant_type")

    /* renamed from: b */
    private final String f5642b;
    @InterfaceC4469e(name = "refresh_token")

    /* renamed from: c */
    private final String f5643c;

    public TokenRequest(String str, String str2, String str3) {
        Intrinsics.isThisObjectNull(str, "clientId");
        Intrinsics.isThisObjectNull(str2, "grantType");
        Intrinsics.isThisObjectNull(str3, "refreshToken");
        this.f5641a = str;
        this.f5642b = str2;
        this.f5643c = str3;
    }

    /* renamed from: a */
    public final String m35162a() {
        return this.f5641a;
    }

    /* renamed from: b */
    public final String m35161b() {
        return this.f5642b;
    }

    /* renamed from: c */
    public final String m35160c() {
        return this.f5643c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenRequest) {
            TokenRequest tokenRequest = (TokenRequest) obj;
            return Intrinsics.equals(this.f5641a, tokenRequest.f5641a) && Intrinsics.equals(this.f5642b, tokenRequest.f5642b) && Intrinsics.equals(this.f5643c, tokenRequest.f5643c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5641a.hashCode() * 31) + this.f5642b.hashCode()) * 31) + this.f5643c.hashCode();
    }

    public String toString() {
        String str = this.f5641a;
        String str2 = this.f5642b;
        String str3 = this.f5643c;
        return "TokenRequest(clientId=" + str + ", grantType=" + str2 + ", refreshToken=" + str3 + ")";
    }

    public /* synthetic */ TokenRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "pdappclient" : str, (i & 2) != 0 ? "refresh_token" : str2, str3);
    }
}
