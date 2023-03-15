package pt.pingodoce.app.data.local.models.products;

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

/* compiled from: PromotionJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class PromotionJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22621a;

    /* renamed from: b */
    private final AbstractC4470f f22622b;

    /* renamed from: c */
    private final AbstractC4470f f22623c;

    /* renamed from: d */
    private volatile Constructor f22624d;

    public PromotionJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("title", "description", "disclaimer", "disclaimerTitle", "showDisclaimer", "price", "badgeUrl", "shortBadgeUrl", "groupClass", "groupLxPy", "lxPySpecial", "endDate", "terms");
        Intrinsics.checkIfNull(m27461a, "of(\"title\", \"description…ial\", \"endDate\", \"terms\")");
        this.f22621a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "title");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.f22622b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "showDisclaimer");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…,\n      \"showDisclaimer\")");
        this.f22623c = m27366f2;
    }

    /* renamed from: k */
    public Promotion mo10144b(AbstractC4476h abstractC4476h) {
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
        String str11 = null;
        Boolean bool2 = bool;
        while (abstractC4476h.mo27427y()) {
            String str12 = str;
            switch (abstractC4476h.mo27436d0(this.f22621a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str4 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v = C9712b.m10121v("title", "title", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"title\", …e\",\n              reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str5 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("description", "description", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"descript…   \"description\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str6 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("disclaimer", "disclaimer", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"disclaim…    \"disclaimer\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str7 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("disclaimerTitle", "disclaimerTitle", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"disclaim…disclaimerTitle\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    bool = (Boolean) this.f22623c.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("showDisclaimer", "showDisclaimer", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"showDisc…\"showDisclaimer\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str9 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str9 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("price", "price", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"price\", …e\",\n              reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    str10 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str10 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("badgeUrl", "badgeUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"badgeUrl…      \"badgeUrl\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    str11 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str11 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("shortBadgeUrl", "shortBadgeUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"shortBad… \"shortBadgeUrl\", reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    str8 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str8 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("groupClass", "groupClass", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"groupCla…    \"groupClass\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
                case 9:
                    str3 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("groupLxPy", "groupLxPy", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"groupLxP…     \"groupLxPy\", reader)");
                        throw m10121v10;
                    }
                    i &= -513;
                    break;
                case 10:
                    bool2 = (Boolean) this.f22623c.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("lxPySpecial", "lxPySpecial", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"lxPySpec…   \"lxPySpecial\", reader)");
                        throw m10121v11;
                    }
                    i &= -1025;
                    break;
                case 11:
                    str2 = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("endDate", "endDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"endDate\"…       \"endDate\", reader)");
                        throw m10121v12;
                    }
                    i &= -2049;
                    break;
                case 12:
                    str = (String) this.f22622b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v13 = C9712b.m10121v("code", "terms", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"code\", \"…s\",\n              reader)");
                        throw m10121v13;
                    }
                    i &= -4097;
                    continue;
            }
            str = str12;
        }
        String str13 = str;
        abstractC4476h.mo27433h();
        if (i == -8192) {
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(str9, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str10, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str11, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str8, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue2 = bool2.booleanValue();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str13, "null cannot be cast to non-null type kotlin.String");
            return new Promotion(str4, str5, str6, str7, booleanValue, str9, str10, str11, str8, str3, booleanValue2, str2, str13);
        }
        String str14 = str3;
        String str15 = str8;
        Constructor constructor = this.f22624d;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = Promotion.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f22624d = constructor;
            Intrinsics.checkIfNull(constructor, "Promotion::class.java.ge…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str4, str5, str6, str7, bool, str9, str10, str11, str15, str14, bool2, str2, str13, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Promotion) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Promotion promotion) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(promotion, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("title");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14454r());
        abstractC4483m.mo27417F("description");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14464c());
        abstractC4483m.mo27417F("disclaimer");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14463d());
        abstractC4483m.mo27417F("disclaimerTitle");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14462e());
        abstractC4483m.mo27417F("showDisclaimer");
        this.f22623c.mo10143i(abstractC4483m, Boolean.valueOf(promotion.m14455n()));
        abstractC4483m.mo27417F("price");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14457k());
        abstractC4483m.mo27417F("badgeUrl");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14466a());
        abstractC4483m.mo27417F("shortBadgeUrl");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14456m());
        abstractC4483m.mo27417F("groupClass");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14460h());
        abstractC4483m.mo27417F("groupLxPy");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14459i());
        abstractC4483m.mo27417F("lxPySpecial");
        this.f22623c.mo10143i(abstractC4483m, Boolean.valueOf(promotion.m14458j()));
        abstractC4483m.mo27417F("endDate");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14461f());
        abstractC4483m.mo27417F("terms");
        this.f22622b.mo10143i(abstractC4483m, promotion.m14465b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Promotion");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
