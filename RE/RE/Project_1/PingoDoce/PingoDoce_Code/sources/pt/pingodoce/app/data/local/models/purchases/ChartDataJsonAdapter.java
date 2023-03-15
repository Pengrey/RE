package pt.pingodoce.app.data.local.models.purchases;

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

/* compiled from: ChartDataJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ChartDataJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22628a;

    /* renamed from: b */
    private final AbstractC4470f f22629b;

    /* renamed from: c */
    private final AbstractC4470f f22630c;

    /* renamed from: d */
    private volatile Constructor f22631d;

    public ChartDataJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("data", "minDateLabel", "maxDateLabel");
        Intrinsics.checkIfNull(m27461a, "of(\"data\", \"minDateLabel\",\n      \"maxDateLabel\")");
        this.f22628a = m27461a;
        ParameterizedType m27327j = C4516s.m27327j(List.class, Float.class);
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(m27327j, m208b, "data");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Types.newP…      emptySet(), \"data\")");
        this.f22629b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "minDateLabel");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…(),\n      \"minDateLabel\")");
        this.f22630c = m27366f2;
    }

    /* renamed from: k */
    public ChartData mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        String str = null;
        String str2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22628a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                list = (List) this.f22629b.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v = C9712b.m10121v("data_", "data", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"data_\", …a\",\n              reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str = (String) this.f22630c.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("minDateLabel", "minDateLabel", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"minDateL…  \"minDateLabel\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str2 = (String) this.f22630c.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("maxDateLabel", "maxDateLabel", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"maxDateL…  \"maxDateLabel\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            return new ChartData(list, str, str2);
        }
        Constructor constructor = this.f22631d;
        if (constructor == null) {
            constructor = ChartData.class.getDeclaredConstructor(List.class, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f22631d = constructor;
            Intrinsics.checkIfNull(constructor, "ChartData::class.java.ge…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(list, str, str2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ChartData) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ChartData chartData) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(chartData, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("data");
        this.f22629b.mo10143i(abstractC4483m, chartData.m14449a());
        abstractC4483m.mo27417F("minDateLabel");
        this.f22630c.mo10143i(abstractC4483m, chartData.m14447c());
        abstractC4483m.mo27417F("maxDateLabel");
        this.f22630c.mo10143i(abstractC4483m, chartData.m14448b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ChartData");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
