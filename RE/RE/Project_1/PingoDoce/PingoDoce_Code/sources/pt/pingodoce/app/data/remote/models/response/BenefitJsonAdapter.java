package pt.pingodoce.app.data.remote.models.response;

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

/* compiled from: BenefitJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class BenefitJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23065a;

    /* renamed from: b */
    private final AbstractC4470f f23066b;

    /* renamed from: c */
    private final AbstractC4470f f23067c;

    /* renamed from: d */
    private volatile Constructor f23068d;

    public BenefitJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "imageUrl", "title", "description", "isNew", "isExpiring", "startDate", "endDate", "clubCode", "clubType", "ean", "moreInfo");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"imageUrl\", \"ti… \"ean\",\n      \"moreInfo\")");
        this.f23065a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f23066b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "isNew");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…mptySet(),\n      \"isNew\")");
        this.f23067c = m27366f2;
    }

    /* renamed from: k */
    public Benefit mo10144b(AbstractC4476h abstractC4476h) {
        Class<String> cls = String.class;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool2 = bool;
        while (abstractC4476h.mo27427y()) {
            Class<String> cls2 = cls;
            switch (abstractC4476h.mo27436d0(this.f23065a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str3 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str4 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("imageUrl", "imageUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"imageUrl…      \"imageUrl\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str5 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("title", "title", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"title\", …e\",\n              reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str6 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("description", "description", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"descript…   \"description\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    bool = (Boolean) this.f23067c.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("isNew", "isNew", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"isNew\", …w\",\n              reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    bool2 = (Boolean) this.f23067c.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("isExpiring", "isExpiring", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"isExpiri…    \"isExpiring\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    str9 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str9 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("startDate", "startDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"startDat…     \"startDate\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    str10 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str10 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("endDate", "endDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"endDate\"…       \"endDate\", reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    str8 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str8 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("clubCode", "clubCode", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"clubCode…      \"clubCode\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
                case 9:
                    str7 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("clubType", "clubType", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"clubType…      \"clubType\", reader)");
                        throw m10121v10;
                    }
                    i &= -513;
                    break;
                case 10:
                    str2 = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("ean", "ean", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"ean\", \"ean\", reader)");
                        throw m10121v11;
                    }
                    i &= -1025;
                    break;
                case 11:
                    str = (String) this.f23066b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("moreInfo", "moreInfo", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"moreInfo…      \"moreInfo\", reader)");
                        throw m10121v12;
                    }
                    i &= -2049;
                    break;
            }
            cls = cls2;
        }
        Class<String> cls3 = cls;
        abstractC4476h.mo27433h();
        if (i == -4096) {
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            Objects.requireNonNull(str9, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str10, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str8, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new Benefit(str3, str4, str5, str6, booleanValue, booleanValue2, str9, str10, str8, str7, str2, str);
        }
        String str11 = str2;
        String str12 = str7;
        String str13 = str8;
        Constructor constructor = this.f23068d;
        if (constructor == null) {
            Class cls4 = Boolean.TYPE;
            constructor = Benefit.class.getDeclaredConstructor(cls3, cls3, cls3, cls3, cls4, cls4, cls3, cls3, cls3, cls3, cls3, cls3, Integer.TYPE, C9712b.f25570c);
            this.f23068d = constructor;
            Intrinsics.checkIfNull(constructor, "Benefit::class.java.getD…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str3, str4, str5, str6, bool, bool2, str9, str10, str13, str12, str11, str, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Benefit) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Benefit benefit) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(benefit, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13932i());
        abstractC4483m.mo27417F("imageUrl");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13931j());
        abstractC4483m.mo27417F("title");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13928n());
        abstractC4483m.mo27417F("description");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13935e());
        abstractC4483m.mo27417F("isNew");
        this.f23067c.mo10143i(abstractC4483m, Boolean.valueOf(benefit.m13925t()));
        abstractC4483m.mo27417F("isExpiring");
        this.f23067c.mo10143i(abstractC4483m, Boolean.valueOf(benefit.m13926s()));
        abstractC4483m.mo27417F("startDate");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13929m());
        abstractC4483m.mo27417F("endDate");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13933h());
        abstractC4483m.mo27417F("clubCode");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13939a());
        abstractC4483m.mo27417F("clubType");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13938b());
        abstractC4483m.mo27417F("ean");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13934f());
        abstractC4483m.mo27417F("moreInfo");
        this.f23066b.mo10143i(abstractC4483m, benefit.m13930k());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Benefit");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
