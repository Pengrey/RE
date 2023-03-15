package pt.pingodoce.app.data.remote.models.request.parameters;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: SearchCategoriesParametersJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class SearchCategoriesParametersJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23023a;

    /* renamed from: b */
    private final AbstractC4470f f23024b;

    /* renamed from: c */
    private final AbstractC4470f f23025c;

    public SearchCategoriesParametersJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("storeId", "hasPromo");
        Intrinsics.checkIfNull(m27461a, "of(\"storeId\", \"hasPromo\")");
        this.f23023a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "storeId");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class…a, emptySet(), \"storeId\")");
        this.f23024b = m27366f;
        Class cls2 = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls2, m208b2, "hasPromo");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…ySet(),\n      \"hasPromo\")");
        this.f23025c = m27366f2;
    }

    /* renamed from: k */
    public SearchCategoriesParameters mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        Integer num = null;
        Boolean bool = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23023a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                num = (Integer) this.f23024b.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v = C9712b.m10121v("storeId", "storeId", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"storeId\"…       \"storeId\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1 && (bool = (Boolean) this.f23025c.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v2 = C9712b.m10121v("hasPromo", "hasPromo", abstractC4476h);
                Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"hasPromo…      \"hasPromo\", reader)");
                throw m10121v2;
            }
        }
        abstractC4476h.mo27433h();
        if (num != null) {
            int intValue = num.intValue();
            if (bool != null) {
                return new SearchCategoriesParameters(intValue, bool.booleanValue());
            }
            JsonDataException m10129n = C9712b.m10129n("hasPromo", "hasPromo", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"hasPromo\", \"hasPromo\", reader)");
            throw m10129n;
        }
        JsonDataException m10129n2 = C9712b.m10129n("storeId", "storeId", abstractC4476h);
        Intrinsics.checkIfNull(m10129n2, "missingProperty(\"storeId\", \"storeId\", reader)");
        throw m10129n2;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, SearchCategoriesParameters searchCategoriesParameters) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(searchCategoriesParameters, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("storeId");
        this.f23024b.mo10143i(abstractC4483m, Integer.valueOf(searchCategoriesParameters.m13972b()));
        abstractC4483m.mo27417F("hasPromo");
        this.f23025c.mo10143i(abstractC4483m, Boolean.valueOf(searchCategoriesParameters.m13973a()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SearchCategoriesParameters");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
