package pt.pingodoce.app.data.remote.models.request.parameters;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: SearchFlyersParametersJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class SearchFlyersParametersJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23028a;

    /* renamed from: b */
    private final AbstractC4470f f23029b;

    /* renamed from: c */
    private final AbstractC4470f f23030c;

    /* renamed from: d */
    private volatile Constructor f23031d;

    public SearchFlyersParametersJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("storeId", "flyerId");
        Intrinsics.checkIfNull(m27461a, "of(\"storeId\", \"flyerId\")");
        this.f23028a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "storeId");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class…a, emptySet(), \"storeId\")");
        this.f23029b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(Integer.class, m208b2, "flyerId");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Int::class…   emptySet(), \"flyerId\")");
        this.f23030c = m27366f2;
    }

    /* renamed from: k */
    public SearchFlyersParameters mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        Integer num = null;
        Integer num2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23028a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                num = (Integer) this.f23029b.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v = C9712b.m10121v("storeId", "storeId", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"storeId\"…       \"storeId\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                num2 = (Integer) this.f23030c.mo10144b(abstractC4476h);
                i &= -3;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -3) {
            if (num != null) {
                return new SearchFlyersParameters(num.intValue(), num2);
            }
            JsonDataException m10129n = C9712b.m10129n("storeId", "storeId", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"storeId\", \"storeId\", reader)");
            throw m10129n;
        }
        Constructor constructor = this.f23031d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = SearchFlyersParameters.class.getDeclaredConstructor(cls, Integer.class, cls, C9712b.f25570c);
            this.f23031d = constructor;
            Intrinsics.checkIfNull(constructor, "SearchFlyersParameters::…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (num == null) {
            JsonDataException m10129n2 = C9712b.m10129n("storeId", "storeId", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"storeId\", \"storeId\", reader)");
            throw m10129n2;
        }
        objArr[0] = Integer.valueOf(num.intValue());
        objArr[1] = num2;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (SearchFlyersParameters) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, SearchFlyersParameters searchFlyersParameters) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(searchFlyersParameters, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("storeId");
        this.f23029b.mo10143i(abstractC4483m, Integer.valueOf(searchFlyersParameters.m13966b()));
        abstractC4483m.mo27417F("flyerId");
        this.f23030c.mo10143i(abstractC4483m, searchFlyersParameters.m13967a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SearchFlyersParameters");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
