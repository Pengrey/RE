package pt.pingodoce.app.data.local.models.egoi;

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

/* compiled from: EgoiPushDataJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class EgoiPushDataJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22534a;

    /* renamed from: b */
    private final AbstractC4470f f22535b;

    /* renamed from: c */
    private final AbstractC4470f f22536c;

    /* renamed from: d */
    private volatile Constructor f22537d;

    public EgoiPushDataJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("title", "body", "contactId", "messageHash", "deviceId", "actions");
        Intrinsics.checkIfNull(m27461a, "of(\"title\", \"body\", \"con…\", \"deviceId\", \"actions\")");
        this.f22534a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "title");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.f22535b = m27366f;
        Class cls = Integer.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "deviceId");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Int::class…, emptySet(), \"deviceId\")");
        this.f22536c = m27366f2;
    }

    /* renamed from: k */
    public EgoiPushData mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f22534a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str = (String) this.f22535b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v = C9712b.m10121v("title", "title", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"title\", …e\",\n              reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.f22535b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("body", "body", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"body\", \"body\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f22535b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("contactId", "contactId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"contactI…     \"contactId\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.f22535b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("messageHash", "messageHash", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"messageH…   \"messageHash\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    num = (Integer) this.f22536c.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("deviceId", "deviceId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"deviceId…      \"deviceId\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str5 = (String) this.f22535b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("actions", "actions", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"actions\"…       \"actions\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -64) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            int intValue = num.intValue();
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            return new EgoiPushData(str, str2, str3, str4, intValue, str5);
        }
        Constructor constructor = this.f22537d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = EgoiPushData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls, String.class, cls, C9712b.f25570c);
            this.f22537d = constructor;
            Intrinsics.checkIfNull(constructor, "EgoiPushData::class.java…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, num, str5, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (EgoiPushData) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, EgoiPushData egoiPushData) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(egoiPushData, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("title");
        this.f22535b.mo10143i(abstractC4483m, egoiPushData.m14578f());
        abstractC4483m.mo27417F("body");
        this.f22535b.mo10143i(abstractC4483m, egoiPushData.m14582b());
        abstractC4483m.mo27417F("contactId");
        this.f22535b.mo10143i(abstractC4483m, egoiPushData.m14581c());
        abstractC4483m.mo27417F("messageHash");
        this.f22535b.mo10143i(abstractC4483m, egoiPushData.m14579e());
        abstractC4483m.mo27417F("deviceId");
        this.f22536c.mo10143i(abstractC4483m, Integer.valueOf(egoiPushData.m14580d()));
        abstractC4483m.mo27417F("actions");
        this.f22535b.mo10143i(abstractC4483m, egoiPushData.m14583a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("EgoiPushData");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
