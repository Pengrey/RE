package pt.pingodoce.app.data.local.models.takeaway;

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
import pt.pingodoce.app.data.remote.models.response.Store;

/* compiled from: TakeAwayStatusJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class TakeAwayStatusJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22811a;

    /* renamed from: b */
    private final AbstractC4470f f22812b;

    /* renamed from: c */
    private final AbstractC4470f f22813c;

    /* renamed from: d */
    private final AbstractC4470f f22814d;

    /* renamed from: e */
    private volatile Constructor f22815e;

    public TakeAwayStatusJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("orders", "notification", "stores");
        Intrinsics.checkIfNull(m27461a, "of(\"orders\", \"notification\",\n      \"stores\")");
        this.f22811a = m27461a;
        ParameterizedType m27327j = C4516s.m27327j(List.class, TakeAwayOrder.class);
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(m27327j, m208b, "orders");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Types.newP…    emptySet(), \"orders\")");
        this.f22812b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "notification");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…(),\n      \"notification\")");
        this.f22813c = m27366f2;
        ParameterizedType m27327j2 = C4516s.m27327j(List.class, Store.class);
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(m27327j2, m208b3, "stores");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Types.newP…ptySet(),\n      \"stores\")");
        this.f22814d = m27366f3;
    }

    /* renamed from: k */
    public TakeAwayStatus mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        String str = null;
        List list2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22811a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                list = (List) this.f22812b.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v = C9712b.m10121v("orders", "orders", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"orders\", \"orders\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str = (String) this.f22813c.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("notification", "notification", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"notifica…  \"notification\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                list2 = (List) this.f22814d.mo10144b(abstractC4476h);
                if (list2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("stores", "stores", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"stores\",…        \"stores\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder>");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.remote.models.response.Store>");
            return new TakeAwayStatus(list, str, list2);
        }
        Constructor constructor = this.f22815e;
        if (constructor == null) {
            constructor = TakeAwayStatus.class.getDeclaredConstructor(List.class, String.class, List.class, Integer.TYPE, C9712b.f25570c);
            this.f22815e = constructor;
            Intrinsics.checkIfNull(constructor, "TakeAwayStatus::class.ja…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(list, str, list2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TakeAwayStatus) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, TakeAwayStatus takeAwayStatus) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(takeAwayStatus, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("orders");
        this.f22812b.mo10143i(abstractC4483m, takeAwayStatus.m14227b());
        abstractC4483m.mo27417F("notification");
        this.f22813c.mo10143i(abstractC4483m, takeAwayStatus.m14228a());
        abstractC4483m.mo27417F("stores");
        this.f22814d.mo10143i(abstractC4483m, takeAwayStatus.m14226c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TakeAwayStatus");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
