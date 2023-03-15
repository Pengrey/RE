package pt.pingodoce.app.data.local.models.clubs;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.C4516s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: ClubDataJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ClubDataJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22483a;

    /* renamed from: b */
    private final AbstractC4470f f22484b;

    /* renamed from: c */
    private final AbstractC4470f f22485c;

    /* renamed from: d */
    private final AbstractC4470f f22486d;

    /* renamed from: e */
    private volatile Constructor f22487e;

    public ClubDataJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("baby", "birthdate", "region", "wineType");
        Intrinsics.checkIfNull(m27461a, "of(\"baby\", \"birthdate\", …egion\",\n      \"wineType\")");
        this.f22483a = m27461a;
        ParameterizedType m27327j = C4516s.m27327j(List.class, ClubBaby.class);
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(m27327j, m208b, "baby");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Types.newP…emptySet(),\n      \"baby\")");
        this.f22484b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "birthdate");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl… emptySet(), \"birthdate\")");
        this.f22485c = m27366f2;
        ParameterizedType m27327j2 = C4516s.m27327j(List.class, String.class);
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(m27327j2, m208b3, "region");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Types.newP…ptySet(),\n      \"region\")");
        this.f22486d = m27366f3;
    }

    /* renamed from: k */
    public ClubData mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        String str = null;
        List list2 = null;
        List list3 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22483a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                list = (List) this.f22484b.mo10144b(abstractC4476h);
                i &= -2;
            } else if (mo27436d0 == 1) {
                str = (String) this.f22485c.mo10144b(abstractC4476h);
                i &= -3;
            } else if (mo27436d0 == 2) {
                list2 = (List) this.f22486d.mo10144b(abstractC4476h);
                i &= -5;
            } else if (mo27436d0 == 3) {
                list3 = (List) this.f22486d.mo10144b(abstractC4476h);
                i &= -9;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -16) {
            return new ClubData(list, str, list2, list3);
        }
        Constructor constructor = this.f22487e;
        if (constructor == null) {
            constructor = ClubData.class.getDeclaredConstructor(List.class, String.class, List.class, List.class, Integer.TYPE, C9712b.f25570c);
            this.f22487e = constructor;
            Intrinsics.checkIfNull(constructor, "ClubData::class.java.get…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(list, str, list2, list3, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ClubData) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ClubData clubData) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(clubData, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("baby");
        this.f22484b.mo10143i(abstractC4483m, clubData.m14625a());
        abstractC4483m.mo27417F("birthdate");
        this.f22485c.mo10143i(abstractC4483m, clubData.m14624b());
        abstractC4483m.mo27417F("region");
        this.f22486d.mo10143i(abstractC4483m, clubData.m14623c());
        abstractC4483m.mo27417F("wineType");
        this.f22486d.mo10143i(abstractC4483m, clubData.m14622d());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClubData");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
