package pt.pingodoce.app.data.local.models.stores;

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

/* compiled from: StoreScheduleJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class StoreScheduleJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22741a;

    /* renamed from: b */
    private final AbstractC4470f f22742b;

    /* renamed from: c */
    private final AbstractC4470f f22743c;

    /* renamed from: d */
    private final AbstractC4470f f22744d;

    /* renamed from: e */
    private volatile Constructor f22745e;

    public StoreScheduleJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("dayOfWeek", "openingTime", "closingTime", "isOnMaintenance");
        Intrinsics.checkIfNull(m27461a, "of(\"dayOfWeek\", \"opening…Time\", \"isOnMaintenance\")");
        this.f22741a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "dayOfWeek");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class… emptySet(), \"dayOfWeek\")");
        this.f22742b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "openingTime");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…t(),\n      \"openingTime\")");
        this.f22743c = m27366f2;
        Class cls2 = Boolean.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls2, m208b3, "isOnMaintenance");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Boolean::c…\n      \"isOnMaintenance\")");
        this.f22744d = m27366f3;
    }

    /* renamed from: k */
    public StoreSchedule mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22741a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                num = (Integer) this.f22742b.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v = C9712b.m10121v("dayOfWeek", "dayOfWeek", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"dayOfWee…     \"dayOfWeek\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str = (String) this.f22743c.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("openingTime", "openingTime", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"openingT…   \"openingTime\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str2 = (String) this.f22743c.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("closingTime", "closingTime", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"closingT…   \"closingTime\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                bool = (Boolean) this.f22744d.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("isOnMaintenance", "isOnMaintenance", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"isOnMain…isOnMaintenance\", reader)");
                    throw m10121v4;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -16) {
            int intValue = num.intValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            return new StoreSchedule(intValue, str, str2, bool.booleanValue());
        }
        Constructor constructor = this.f22745e;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = StoreSchedule.class.getDeclaredConstructor(cls, String.class, String.class, Boolean.TYPE, cls, C9712b.f25570c);
            this.f22745e = constructor;
            Intrinsics.checkIfNull(constructor, "StoreSchedule::class.jav…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, str, str2, bool, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (StoreSchedule) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, StoreSchedule storeSchedule) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(storeSchedule, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("dayOfWeek");
        this.f22742b.mo10143i(abstractC4483m, Integer.valueOf(storeSchedule.m14309c()));
        abstractC4483m.mo27417F("openingTime");
        this.f22743c.mo10143i(abstractC4483m, storeSchedule.m14307e());
        abstractC4483m.mo27417F("closingTime");
        this.f22743c.mo10143i(abstractC4483m, storeSchedule.m14310b());
        abstractC4483m.mo27417F("isOnMaintenance");
        this.f22744d.mo10143i(abstractC4483m, Boolean.valueOf(storeSchedule.m14306f()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("StoreSchedule");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
