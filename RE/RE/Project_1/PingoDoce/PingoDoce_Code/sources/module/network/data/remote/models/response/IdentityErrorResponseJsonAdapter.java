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

/* compiled from: IdentityErrorResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class IdentityErrorResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f19950a;

    /* renamed from: b */
    private final AbstractC4470f f19951b;

    /* renamed from: c */
    private volatile Constructor f19952c;

    public IdentityErrorResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("error", "error_description");
        Intrinsics.checkIfNull(m27461a, "of(\"error\", \"error_description\")");
        this.f19950a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "error");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…     emptySet(), \"error\")");
        this.f19951b = m27366f;
    }

    /* renamed from: k */
    public IdentityErrorResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f19950a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f19951b.mo10144b(abstractC4476h);
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f19951b.mo10144b(abstractC4476h);
                i &= -3;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            return new IdentityErrorResponse(str, str2);
        }
        Constructor constructor = this.f19952c;
        if (constructor == null) {
            constructor = IdentityErrorResponse.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f19952c = constructor;
            Intrinsics.checkIfNull(constructor, "IdentityErrorResponse::c…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (IdentityErrorResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, IdentityErrorResponse identityErrorResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(identityErrorResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("error");
        this.f19951b.mo10143i(abstractC4483m, identityErrorResponse.m18230a());
        abstractC4483m.mo27417F("error_description");
        this.f19951b.mo10143i(abstractC4483m, identityErrorResponse.m18229b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("IdentityErrorResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
