package pt.pingodoce.app.data.remote.models.request;

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
import pt.pingodoce.app.data.local.models.egoi.EgoiEvent;

/* compiled from: DeviceTokenRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class DeviceTokenRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22854a;

    /* renamed from: b */
    private final AbstractC4470f f22855b;

    /* renamed from: c */
    private final AbstractC4470f f22856c;

    /* renamed from: d */
    private volatile Constructor f22857d;

    public DeviceTokenRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("platform", "handle", "egoiEvents");
        Intrinsics.checkIfNull(m27461a, "of(\"platform\", \"handle\",\n      \"egoiEvents\")");
        this.f22854a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "platform");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…ySet(),\n      \"platform\")");
        this.f22855b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, EgoiEvent.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "egoiEvents");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…et(),\n      \"egoiEvents\")");
        this.f22856c = m27366f2;
    }

    /* renamed from: k */
    public DeviceTokenRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        List list = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22854a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22855b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("platform", "platform", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"platform…      \"platform\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f22855b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("token", "handle", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"token\", …dle\",\n            reader)");
                    throw m10121v2;
                }
            } else if (mo27436d0 == 2) {
                list = (List) this.f22856c.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("egoiEvents", "egoiEvents", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"egoiEvents\", \"egoiEvents\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -5) {
            if (str == null) {
                JsonDataException m10129n = C9712b.m10129n("platform", "platform", abstractC4476h);
                Intrinsics.checkIfNull(m10129n, "missingProperty(\"platform\", \"platform\", reader)");
                throw m10129n;
            } else if (str2 != null) {
                Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.egoi.EgoiEvent>");
                return new DeviceTokenRequest(str, str2, list);
            } else {
                JsonDataException m10129n2 = C9712b.m10129n("token", "handle", abstractC4476h);
                Intrinsics.checkIfNull(m10129n2, "missingProperty(\"token\", \"handle\", reader)");
                throw m10129n2;
            }
        }
        Constructor constructor = this.f22857d;
        if (constructor == null) {
            constructor = DeviceTokenRequest.class.getDeclaredConstructor(String.class, String.class, List.class, Integer.TYPE, C9712b.f25570c);
            this.f22857d = constructor;
            Intrinsics.checkIfNull(constructor, "DeviceTokenRequest::clas…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        if (str == null) {
            JsonDataException m10129n3 = C9712b.m10129n("platform", "platform", abstractC4476h);
            Intrinsics.checkIfNull(m10129n3, "missingProperty(\"platform\", \"platform\", reader)");
            throw m10129n3;
        }
        objArr[0] = str;
        if (str2 == null) {
            JsonDataException m10129n4 = C9712b.m10129n("token", "handle", abstractC4476h);
            Intrinsics.checkIfNull(m10129n4, "missingProperty(\"token\", \"handle\", reader)");
            throw m10129n4;
        }
        objArr[1] = str2;
        objArr[2] = list;
        objArr[3] = Integer.valueOf(i);
        objArr[4] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (DeviceTokenRequest) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, DeviceTokenRequest deviceTokenRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(deviceTokenRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("platform");
        this.f22855b.mo10143i(abstractC4483m, deviceTokenRequest.m14166b());
        abstractC4483m.mo27417F("handle");
        this.f22855b.mo10143i(abstractC4483m, deviceTokenRequest.m14165c());
        abstractC4483m.mo27417F("egoiEvents");
        this.f22856c.mo10143i(abstractC4483m, deviceTokenRequest.m14167a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("DeviceTokenRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
