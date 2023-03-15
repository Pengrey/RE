package module.network.data.remote.models.response;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: ErrorResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ErrorResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f19944a;

    /* renamed from: b */
    private final AbstractC4470f f19945b;

    /* renamed from: c */
    private final AbstractC4470f f19946c;

    /* renamed from: d */
    private volatile Constructor f19947d;

    public ErrorResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("title", "detail", "code");
        Intrinsics.checkIfNull(m27461a, "of(\"title\", \"detail\", \"code\")");
        this.f19944a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "title");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…     emptySet(), \"title\")");
        this.f19945b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(Integer.class, m208b2, "statusCode");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Int::class…emptySet(), \"statusCode\")");
        this.f19946c = m27366f2;
    }

    /* renamed from: k */
    public ErrorResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        Integer num = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f19944a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f19945b.mo10144b(abstractC4476h);
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f19945b.mo10144b(abstractC4476h);
                i &= -3;
            } else if (mo27436d0 == 2) {
                num = (Integer) this.f19946c.mo10144b(abstractC4476h);
                i &= -5;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            return new ErrorResponse(str, str2, num);
        }
        Constructor constructor = this.f19947d;
        if (constructor == null) {
            constructor = ErrorResponse.class.getDeclaredConstructor(String.class, String.class, Integer.class, Integer.TYPE, C9712b.f25570c);
            this.f19947d = constructor;
            Intrinsics.checkIfNull(constructor, "ErrorResponse::class.jav…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, num, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ErrorResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ErrorResponse errorResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(errorResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("title");
        this.f19945b.mo10143i(abstractC4483m, errorResponse.m18233d());
        abstractC4483m.mo27417F("detail");
        this.f19945b.mo10143i(abstractC4483m, errorResponse.m18235b());
        abstractC4483m.mo27417F("code");
        this.f19946c.mo10143i(abstractC4483m, errorResponse.m18234c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ErrorResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
