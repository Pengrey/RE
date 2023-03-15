package pt.pingodoce.app.data.local.models.stores;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.C4516s;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: TakeAwayScheduleJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class TakeAwayScheduleJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22748a;

    /* renamed from: b */
    private final AbstractC4470f f22749b;

    /* renamed from: c */
    private final AbstractC4470f f22750c;

    /* renamed from: d */
    private volatile Constructor f22751d;

    public TakeAwayScheduleJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("dayLabel", "hourLabels");
        Intrinsics.checkIfNull(m27461a, "of(\"dayLabel\", \"hourLabels\")");
        this.f22748a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "dayLabel");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…ySet(),\n      \"dayLabel\")");
        this.f22749b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(Map.class, String.class, String.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "hourLabel");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP… emptySet(), \"hourLabel\")");
        this.f22750c = m27366f2;
    }

    /* renamed from: k */
    public TakeAwaySchedule mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        Map map = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22748a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22749b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("dayLabel", "dayLabel", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"dayLabel…      \"dayLabel\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                map = (Map) this.f22750c.mo10144b(abstractC4476h);
                if (map == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("hourLabel", "hourLabels", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"hourLabel\", \"hourLabels\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
            return new TakeAwaySchedule(str, C6431d0.m20952c(map));
        }
        Constructor constructor = this.f22751d;
        if (constructor == null) {
            constructor = TakeAwaySchedule.class.getDeclaredConstructor(String.class, Map.class, Integer.TYPE, C9712b.f25570c);
            this.f22751d = constructor;
            Intrinsics.checkIfNull(constructor, "TakeAwaySchedule::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, map, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TakeAwaySchedule) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, TakeAwaySchedule takeAwaySchedule) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(takeAwaySchedule, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("dayLabel");
        this.f22749b.mo10143i(abstractC4483m, takeAwaySchedule.m14299a());
        abstractC4483m.mo27417F("hourLabels");
        this.f22750c.mo10143i(abstractC4483m, takeAwaySchedule.m14298b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TakeAwaySchedule");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
