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

/* compiled from: CoordinatesJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class CoordinatesJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22732a;

    /* renamed from: b */
    private final AbstractC4470f f22733b;

    /* renamed from: c */
    private volatile Constructor f22734c;

    public CoordinatesJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("latitude", "longitude");
        Intrinsics.checkIfNull(m27461a, "of(\"latitude\", \"longitude\")");
        this.f22732a = m27461a;
        Class cls = Double.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "lat");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Double::cl… emptySet(),\n      \"lat\")");
        this.f22733b = m27366f;
    }

    /* renamed from: k */
    public Coordinates mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Double valueOf = Double.valueOf(0.0d);
        abstractC4476h.mo27437c();
        Double d = valueOf;
        int i = -1;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22732a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                valueOf = (Double) this.f22733b.mo10144b(abstractC4476h);
                if (valueOf == null) {
                    JsonDataException m10121v = C9712b.m10121v("lat", "latitude", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"lat\", \"l…e\",\n              reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                d = (Double) this.f22733b.mo10144b(abstractC4476h);
                if (d == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("lng", "longitude", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"lng\", \"l…e\",\n              reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            return new Coordinates(valueOf.doubleValue(), d.doubleValue());
        }
        Constructor constructor = this.f22734c;
        if (constructor == null) {
            Class cls = Double.TYPE;
            constructor = Coordinates.class.getDeclaredConstructor(cls, cls, Integer.TYPE, C9712b.f25570c);
            this.f22734c = constructor;
            Intrinsics.checkIfNull(constructor, "Coordinates::class.java.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(valueOf, d, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Coordinates) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Coordinates coordinates) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(coordinates, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("latitude");
        this.f22733b.mo10143i(abstractC4483m, Double.valueOf(coordinates.m14317a()));
        abstractC4483m.mo27417F("longitude");
        this.f22733b.mo10143i(abstractC4483m, Double.valueOf(coordinates.m14316b()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Coordinates");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
