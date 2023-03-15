package pt.pingodoce.app.data.local.models.products;

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
import pt.pingodoce.app.data.remote.models.response.BrandResponse;
import pt.pingodoce.app.data.remote.models.response.CriteriaResponse;

/* compiled from: FilterCriteriaJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class FilterCriteriaJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22595a;

    /* renamed from: b */
    private final AbstractC4470f f22596b;

    /* renamed from: c */
    private final AbstractC4470f f22597c;

    /* renamed from: d */
    private volatile Constructor f22598d;

    public FilterCriteriaJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("sortCriteria", "brands");
        Intrinsics.checkIfNull(m27461a, "of(\"sortCriteria\", \"brands\")");
        this.f22595a = m27461a;
        ParameterizedType m27327j = C4516s.m27327j(List.class, CriteriaResponse.class);
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(m27327j, m208b, "sortCriteria");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Types.newP…ptySet(), \"sortCriteria\")");
        this.f22596b = m27366f;
        ParameterizedType m27327j2 = C4516s.m27327j(List.class, BrandResponse.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j2, m208b2, "brands");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…    emptySet(), \"brands\")");
        this.f22597c = m27366f2;
    }

    /* renamed from: k */
    public FilterCriteria mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        List list2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22595a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                list = (List) this.f22596b.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v = C9712b.m10121v("sortCriteria", "sortCriteria", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"sortCrit…, \"sortCriteria\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                list2 = (List) this.f22597c.mo10144b(abstractC4476h);
                if (list2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("brands", "brands", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"brands\", \"brands\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.remote.models.response.CriteriaResponse>");
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.remote.models.response.BrandResponse>");
            return new FilterCriteria(list, list2);
        }
        Constructor constructor = this.f22598d;
        if (constructor == null) {
            constructor = FilterCriteria.class.getDeclaredConstructor(List.class, List.class, Integer.TYPE, C9712b.f25570c);
            this.f22598d = constructor;
            Intrinsics.checkIfNull(constructor, "FilterCriteria::class.ja…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(list, list2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (FilterCriteria) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, FilterCriteria filterCriteria) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(filterCriteria, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("sortCriteria");
        this.f22596b.mo10143i(abstractC4483m, filterCriteria.m14480b());
        abstractC4483m.mo27417F("brands");
        this.f22597c.mo10143i(abstractC4483m, filterCriteria.m14481a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FilterCriteria");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
