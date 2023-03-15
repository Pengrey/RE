package module.network.data.remote.models.response;

import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* compiled from: ApiErrorResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ApiErrorResponse {
    @InterfaceC4469e(name = "errors")

    /* renamed from: a */
    private final List f19927a;

    public ApiErrorResponse() {
        this(null, 1, null);
    }

    public ApiErrorResponse(List list) {
        Intrinsics.isThisObjectNull(list, "errors");
        this.f19927a = list;
    }

    /* renamed from: a */
    public final List m18248a() {
        return this.f19927a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiErrorResponse) && Intrinsics.equals(this.f19927a, ((ApiErrorResponse) obj).f19927a);
    }

    public int hashCode() {
        return this.f19927a.hashCode();
    }

    public String toString() {
        List list = this.f19927a;
        return "ApiErrorResponse(errors=" + list + ")";
    }

    public /* synthetic */ ApiErrorResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13780s.m197g() : list);
    }
}
