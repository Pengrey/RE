package module.network.data.remote.models.response;

import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ErrorResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ErrorResponse {
    @InterfaceC4469e(name = "title")

    /* renamed from: a */
    private final String f19940a;
    @InterfaceC4469e(name = "detail")

    /* renamed from: b */
    private final String f19941b;
    @InterfaceC4469e(name = "code")

    /* renamed from: c */
    private final Integer f19942c;

    /* renamed from: d */
    private final String f19943d;

    public ErrorResponse() {
        this(null, null, null, 7, null);
    }

    public ErrorResponse(String str, String str2, Integer num) {
        this.f19940a = str;
        this.f19941b = str2;
        this.f19942c = num;
        this.f19943d = str2 != null ? str2 : str;
    }

    /* renamed from: a */
    public final String m18236a() {
        return this.f19943d;
    }

    /* renamed from: b */
    public final String m18235b() {
        return this.f19941b;
    }

    /* renamed from: c */
    public final Integer m18234c() {
        return this.f19942c;
    }

    /* renamed from: d */
    public final String m18233d() {
        return this.f19940a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorResponse) {
            ErrorResponse errorResponse = (ErrorResponse) obj;
            return Intrinsics.equals(this.f19940a, errorResponse.f19940a) && Intrinsics.equals(this.f19941b, errorResponse.f19941b) && Intrinsics.equals(this.f19942c, errorResponse.f19942c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f19940a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19941b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f19942c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.f19940a;
        String str2 = this.f19941b;
        Integer num = this.f19942c;
        return "ErrorResponse(title=" + str + ", detail=" + str2 + ", statusCode=" + num + ")";
    }

    public /* synthetic */ ErrorResponse(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
