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
import pt.pingodoce.app.data.local.models.stores.Coordinates;
import pt.pingodoce.app.data.local.models.stores.StoreSchedule;

/* compiled from: StoreJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class StoreJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23260a;

    /* renamed from: b */
    private final AbstractC4470f f23261b;

    /* renamed from: c */
    private final AbstractC4470f f23262c;

    /* renamed from: d */
    private final AbstractC4470f f23263d;

    /* renamed from: e */
    private final AbstractC4470f f23264e;

    /* renamed from: f */
    private final AbstractC4470f f23265f;

    /* renamed from: g */
    private final AbstractC4470f f23266g;

    /* renamed from: h */
    private volatile Constructor f23267h;

    public StoreJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Set<? extends Annotation> m208b6;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "isDefault", "searchEnabled", "name", "address", "phone", "coordinates", "schedules", "takeAwaySchedules");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"isDefault\",\n  …es\", \"takeAwaySchedules\")");
        this.f23260a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class.java, emptySet(), \"id\")");
        this.f23261b = m27366f;
        Class cls2 = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls2, m208b2, "isDefault");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…Set(),\n      \"isDefault\")");
        this.f23262c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(String.class, m208b3, "name");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.f23263d = m27366f3;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(Coordinates.class, m208b4, "coordinates");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Coordinate…mptySet(), \"coordinates\")");
        this.f23264e = m27366f4;
        ParameterizedType m27327j = C4516s.m27327j(List.class, StoreSchedule.class);
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(m27327j, m208b5, "schedules");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(Types.newP… emptySet(), \"schedules\")");
        this.f23265f = m27366f5;
        ParameterizedType m27327j2 = C4516s.m27327j(List.class, String.class);
        m208b6 = C13778q0.m208b();
        AbstractC4470f m27366f6 = c4496p.m27366f(m27327j2, m208b6, "takeAwaySchedules");
        Intrinsics.checkIfNull(m27366f6, "moshi.adapter(Types.newP…     \"takeAwaySchedules\")");
        this.f23266g = m27366f6;
    }

    /* renamed from: k */
    public Store mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        List list2 = null;
        Coordinates coordinates = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = bool;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f23260a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    num = (Integer) this.f23261b.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    bool = (Boolean) this.f23262c.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("isDefault", "isDefault", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"isDefaul…     \"isDefault\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    bool2 = (Boolean) this.f23262c.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("searchEnabled", "searchEnabled", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"searchEn… \"searchEnabled\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str = (String) this.f23263d.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("name", "name", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"name\", \"name\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str2 = (String) this.f23263d.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("address", "address", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"address\"…       \"address\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str3 = (String) this.f23263d.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("phone", "phone", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"phone\", …e\",\n              reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    coordinates = (Coordinates) this.f23264e.mo10144b(abstractC4476h);
                    if (coordinates == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("coordinates", "coordinates", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"coordina…\", \"coordinates\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    list2 = (List) this.f23265f.mo10144b(abstractC4476h);
                    if (list2 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("schedules", "schedules", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"schedules\", \"schedules\", reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    list = (List) this.f23266g.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("takeAwaySchedules", "takeAwaySchedules", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"takeAway…keAwaySchedules\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -512) {
            int intValue = num.intValue();
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(coordinates, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.stores.Coordinates");
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.stores.StoreSchedule>");
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new Store(intValue, booleanValue, booleanValue2, str, str2, str3, coordinates, list2, list);
        }
        List list3 = list;
        List list4 = list2;
        Coordinates coordinates2 = coordinates;
        Constructor constructor = this.f23267h;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            constructor = Store.class.getDeclaredConstructor(cls, cls2, cls2, String.class, String.class, String.class, Coordinates.class, List.class, List.class, cls, C9712b.f25570c);
            this.f23267h = constructor;
            Intrinsics.checkIfNull(constructor, "Store::class.java.getDec…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, bool, bool2, str, str2, str3, coordinates2, list4, list3, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Store) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Store store) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(store, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f23261b.mo10143i(abstractC4483m, Integer.valueOf(store.m13711f()));
        abstractC4483m.mo27417F("isDefault");
        this.f23262c.mo10143i(abstractC4483m, Boolean.valueOf(store.m13702t()));
        abstractC4483m.mo27417F("searchEnabled");
        this.f23262c.mo10143i(abstractC4483m, Boolean.valueOf(store.m13707k()));
        abstractC4483m.mo27417F("name");
        this.f23263d.mo10143i(abstractC4483m, store.m13710h());
        abstractC4483m.mo27417F("address");
        this.f23263d.mo10143i(abstractC4483m, store.m13713d());
        abstractC4483m.mo27417F("phone");
        this.f23263d.mo10143i(abstractC4483m, store.m13709i());
        abstractC4483m.mo27417F("coordinates");
        this.f23264e.mo10143i(abstractC4483m, store.m13712e());
        abstractC4483m.mo27417F("schedules");
        this.f23265f.mo10143i(abstractC4483m, store.m13708j());
        abstractC4483m.mo27417F("takeAwaySchedules");
        this.f23266g.mo10143i(abstractC4483m, store.m13705n());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(27);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Store");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
