package module.network.data.remote.models.response.authenticationv2;

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
import module.network.data.remote.models.local.pmCards.LoyaltyCardProvisoryV2;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: PmCardsResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class PmCardsResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f19966a;

    /* renamed from: b */
    private final AbstractC4470f f19967b;

    /* renamed from: c */
    private final AbstractC4470f f19968c;

    /* renamed from: d */
    private volatile Constructor f19969d;

    public PmCardsResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("firstName", "lastName", "pmCards");
        Intrinsics.checkIfNull(m27461a, "of(\"firstName\", \"lastName\",\n      \"pmCards\")");
        this.f19966a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "firstName");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…Set(),\n      \"firstName\")");
        this.f19967b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, LoyaltyCardProvisoryV2.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "pmCards");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…), emptySet(), \"pmCards\")");
        this.f19968c = m27366f2;
    }

    /* renamed from: k */
    public PmCardsResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        List list = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f19966a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f19967b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("firstName", "firstName", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"firstNam…     \"firstName\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f19967b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("lastName", "lastName", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"lastName…      \"lastName\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                list = (List) this.f19968c.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("pmCards", "pmCards", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"pmCards\", \"pmCards\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<module.network.data.remote.models.local.pmCards.LoyaltyCardProvisoryV2>");
            return new PmCardsResponse(str, str2, list);
        }
        Constructor constructor = this.f19969d;
        if (constructor == null) {
            constructor = PmCardsResponse.class.getDeclaredConstructor(String.class, String.class, List.class, Integer.TYPE, C9712b.f25570c);
            this.f19969d = constructor;
            Intrinsics.checkIfNull(constructor, "PmCardsResponse::class.j…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, list, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (PmCardsResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, PmCardsResponse pmCardsResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(pmCardsResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("firstName");
        this.f19967b.mo10143i(abstractC4483m, pmCardsResponse.m18216a());
        abstractC4483m.mo27417F("lastName");
        this.f19967b.mo10143i(abstractC4483m, pmCardsResponse.m18215b());
        abstractC4483m.mo27417F("pmCards");
        this.f19968c.mo10143i(abstractC4483m, pmCardsResponse.m18214c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PmCardsResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
