package pt.pingodoce.app.data.remote.models.response;

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
import pt.pingodoce.app.data.local.models.clubs.Club;

/* compiled from: ClubListResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ClubListResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23114a;

    /* renamed from: b */
    private final AbstractC4470f f23115b;

    /* renamed from: c */
    private final AbstractC4470f f23116c;

    /* renamed from: d */
    private volatile Constructor f23117d;

    public ClubListResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("total", "items");
        Intrinsics.checkIfNull(m27461a, "of(\"total\", \"items\")");
        this.f23114a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "total");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class…ava, emptySet(), \"total\")");
        this.f23115b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, Club.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "items");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…mptySet(),\n      \"items\")");
        this.f23116c = m27366f2;
    }

    /* renamed from: k */
    public ClubListResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23114a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                num = (Integer) this.f23115b.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v = C9712b.m10121v("total", "total", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"total\", \"total\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                list = (List) this.f23116c.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("items", "items", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"items\", …s\",\n              reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            int intValue = num.intValue();
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.clubs.Club>");
            return new ClubListResponse(intValue, list);
        }
        Constructor constructor = this.f23117d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = ClubListResponse.class.getDeclaredConstructor(cls, List.class, cls, C9712b.f25570c);
            this.f23117d = constructor;
            Intrinsics.checkIfNull(constructor, "ClubListResponse::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, list, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ClubListResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ClubListResponse clubListResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(clubListResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("total");
        this.f23115b.mo10143i(abstractC4483m, Integer.valueOf(clubListResponse.m13872b()));
        abstractC4483m.mo27417F("items");
        this.f23116c.mo10143i(abstractC4483m, clubListResponse.m13873a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClubListResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
