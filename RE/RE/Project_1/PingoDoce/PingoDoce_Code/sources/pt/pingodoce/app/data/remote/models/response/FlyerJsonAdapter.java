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
import pt.pingodoce.app.data.local.models.products.Category;

/* compiled from: FlyerJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class FlyerJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23149a;

    /* renamed from: b */
    private final AbstractC4470f f23150b;

    /* renamed from: c */
    private final AbstractC4470f f23151c;

    /* renamed from: d */
    private final AbstractC4470f f23152d;

    /* renamed from: e */
    private final AbstractC4470f f23153e;

    /* renamed from: f */
    private volatile Constructor f23154f;

    public FlyerJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "title", "image", "pdfUrl", "dateStart", "dateEnd", "description", "promotionId", "storeGroupId", "categories");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"title\", \"image…reGroupId\", \"categories\")");
        this.f23149a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class.java, emptySet(), \"id\")");
        this.f23150b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "title");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.f23151c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(String.class, m208b3, "image");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(String::cl…     emptySet(), \"image\")");
        this.f23152d = m27366f3;
        ParameterizedType m27327j = C4516s.m27327j(List.class, Category.class);
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(m27327j, m208b4, "categories");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Types.newP…et(),\n      \"categories\")");
        this.f23153e = m27366f4;
    }

    /* renamed from: k */
    public Flyer mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        abstractC4476h.mo27437c();
        Integer num2 = num;
        int i = -1;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num3 = num2;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f23149a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    num = (Integer) this.f23150b.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.f23151c.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("title", "title", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"title\", …e\",\n              reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f23152d.mo10144b(abstractC4476h);
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.f23151c.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("pdfUrl", "pdfUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"pdfUrl\",…l\",\n              reader)");
                        throw m10121v3;
                    }
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.f23151c.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("dateStart", "dateStart", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"dateStar…     \"dateStart\", reader)");
                        throw m10121v4;
                    }
                    i &= -17;
                    break;
                case 5:
                    str6 = (String) this.f23151c.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("dateEnd", "dateEnd", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"dateEnd\"…       \"dateEnd\", reader)");
                        throw m10121v5;
                    }
                    i &= -33;
                    break;
                case 6:
                    str = (String) this.f23151c.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("description", "description", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"descript…   \"description\", reader)");
                        throw m10121v6;
                    }
                    i &= -65;
                    break;
                case 7:
                    num3 = (Integer) this.f23150b.mo10144b(abstractC4476h);
                    if (num3 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("promotionId", "promotionId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"promotio…   \"promotionId\", reader)");
                        throw m10121v7;
                    }
                    i &= -129;
                    break;
                case 8:
                    num2 = (Integer) this.f23150b.mo10144b(abstractC4476h);
                    if (num2 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("storeGroupId", "storeGroupId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"storeGro…  \"storeGroupId\", reader)");
                        throw m10121v8;
                    }
                    i &= -257;
                    break;
                case 9:
                    list = (List) this.f23153e.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("categories", "categories", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"categories\", \"categories\", reader)");
                        throw m10121v9;
                    }
                    i &= -513;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -1024) {
            int intValue = num.intValue();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            int intValue2 = num3.intValue();
            int intValue3 = num2.intValue();
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.products.Category>");
            return new Flyer(intValue, str2, str3, str4, str5, str6, str, intValue2, intValue3, list);
        }
        List list2 = list;
        String str7 = str;
        Constructor constructor = this.f23154f;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Flyer.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, List.class, cls, C9712b.f25570c);
            this.f23154f = constructor;
            Intrinsics.checkIfNull(constructor, "Flyer::class.java.getDec…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, str2, str3, str4, str5, str6, str7, num3, num2, list2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Flyer) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Flyer flyer) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(flyer, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f23150b.mo10143i(abstractC4483m, Integer.valueOf(flyer.m13838e()));
        abstractC4483m.mo27417F("title");
        this.f23151c.mo10143i(abstractC4483m, flyer.m13833k());
        abstractC4483m.mo27417F("image");
        this.f23152d.mo10143i(abstractC4483m, flyer.m13837f());
        abstractC4483m.mo27417F("pdfUrl");
        this.f23151c.mo10143i(abstractC4483m, flyer.m13836h());
        abstractC4483m.mo27417F("dateStart");
        this.f23151c.mo10143i(abstractC4483m, flyer.m13840c());
        abstractC4483m.mo27417F("dateEnd");
        this.f23151c.mo10143i(abstractC4483m, flyer.m13841b());
        abstractC4483m.mo27417F("description");
        this.f23151c.mo10143i(abstractC4483m, flyer.m13839d());
        abstractC4483m.mo27417F("promotionId");
        this.f23150b.mo10143i(abstractC4483m, Integer.valueOf(flyer.m13835i()));
        abstractC4483m.mo27417F("storeGroupId");
        this.f23150b.mo10143i(abstractC4483m, Integer.valueOf(flyer.m13834j()));
        abstractC4483m.mo27417F("categories");
        this.f23153e.mo10143i(abstractC4483m, flyer.m13842a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(27);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Flyer");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
