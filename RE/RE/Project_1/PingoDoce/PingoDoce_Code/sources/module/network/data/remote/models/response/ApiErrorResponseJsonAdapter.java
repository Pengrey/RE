package module.network.data.remote.models.response;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.C4516s;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: ApiErrorResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ApiErrorResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f19928a;

    /* renamed from: b */
    private final AbstractC4470f f19929b;

    /* renamed from: c */
    private volatile Constructor f19930c;

    public ApiErrorResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("errors");
        Intrinsics.checkIfNull(m27461a, "of(\"errors\")");
        this.f19928a = m27461a;
        ParameterizedType m27327j = C4516s.m27327j(List.class, ErrorResponse.class);
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(m27327j, m208b, "errors");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Types.newP…    emptySet(), \"errors\")");
        this.f19929b = m27366f;
    }

    /* renamed from: k */
    public ApiErrorResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f19928a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                list = (List) this.f19929b.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v = C9712b.m10121v("errors", "errors", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"errors\", \"errors\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -2) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<module.network.data.remote.models.response.ErrorResponse>");
            return new ApiErrorResponse(list);
        }
        Constructor constructor = this.f19930c;
        if (constructor == null) {
            constructor = ApiErrorResponse.class.getDeclaredConstructor(List.class, Integer.TYPE, C9712b.f25570c);
            this.f19930c = constructor;
            Intrinsics.checkIfNull(constructor, "ApiErrorResponse::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(list, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ApiErrorResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ApiErrorResponse apiErrorResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(apiErrorResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("errors");
        this.f19929b.mo10143i(abstractC4483m, apiErrorResponse.m18248a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ApiErrorResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
