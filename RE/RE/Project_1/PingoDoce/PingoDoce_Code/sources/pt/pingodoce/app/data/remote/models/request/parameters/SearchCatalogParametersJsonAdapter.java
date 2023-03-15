package pt.pingodoce.app.data.remote.models.request.parameters;

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

/* compiled from: SearchCatalogParametersJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class SearchCatalogParametersJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23011a;

    /* renamed from: b */
    private final AbstractC4470f f23012b;

    /* renamed from: c */
    private final AbstractC4470f f23013c;

    /* renamed from: d */
    private final AbstractC4470f f23014d;

    /* renamed from: e */
    private final AbstractC4470f f23015e;

    /* renamed from: f */
    private final AbstractC4470f f23016f;

    /* renamed from: g */
    private final AbstractC4470f f23017g;

    /* renamed from: h */
    private final AbstractC4470f f23018h;

    /* renamed from: i */
    private final AbstractC4470f f23019i;

    /* renamed from: j */
    private volatile Constructor f23020j;

    public SearchCatalogParametersJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Set<? extends Annotation> m208b6;
        Set<? extends Annotation> m208b7;
        Set<? extends Annotation> m208b8;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("storeId", "barcode", "ownBrand", "promoGroupClass", "promoGroupLxPy", "hasPromo", "categoryId", "includeCategories", "flyerId", "text", "tagIds", "brandIds", "sortCriteria", "excludeIds", "productKeys", "page", "pageSize", "userHasLoyaltyCardApproved");
        Intrinsics.checkIfNull(m27461a, "of(\"storeId\", \"barcode\",…rHasLoyaltyCardApproved\")");
        this.f23011a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "storeId");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class…a, emptySet(), \"storeId\")");
        this.f23012b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(Long.class, m208b2, "barcode");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Long::clas…   emptySet(), \"barcode\")");
        this.f23013c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(Boolean.class, m208b3, "ownBrand");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Boolean::c…, emptySet(), \"ownBrand\")");
        this.f23014d = m27366f3;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(String.class, m208b4, "promoGroupClass");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(String::cl…Set(), \"promoGroupClass\")");
        this.f23015e = m27366f4;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(Integer.class, m208b5, "categoryId");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(Int::class…emptySet(), \"categoryId\")");
        this.f23016f = m27366f5;
        Class cls2 = Boolean.TYPE;
        m208b6 = C13778q0.m208b();
        AbstractC4470f m27366f6 = c4496p.m27366f(cls2, m208b6, "includeCategories");
        Intrinsics.checkIfNull(m27366f6, "moshi.adapter(Boolean::c…     \"includeCategories\")");
        this.f23017g = m27366f6;
        ParameterizedType m27327j = C4516s.m27327j(List.class, Integer.class);
        m208b7 = C13778q0.m208b();
        AbstractC4470f m27366f7 = c4496p.m27366f(m27327j, m208b7, "tagIds");
        Intrinsics.checkIfNull(m27366f7, "moshi.adapter(Types.newP…    emptySet(), \"tagIds\")");
        this.f23018h = m27366f7;
        ParameterizedType m27327j2 = C4516s.m27327j(List.class, String.class);
        m208b8 = C13778q0.m208b();
        AbstractC4470f m27366f8 = c4496p.m27366f(m27327j2, m208b8, "excludeIds");
        Intrinsics.checkIfNull(m27366f8, "moshi.adapter(Types.newP…et(),\n      \"excludeIds\")");
        this.f23019i = m27366f8;
    }

    /* renamed from: k */
    public SearchCatalogParameters mo10144b(AbstractC4476h abstractC4476h) {
        int i;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        int i2 = -1;
        List list = null;
        List list2 = null;
        Long l = null;
        Boolean bool4 = null;
        String str = null;
        String str2 = null;
        Boolean bool5 = null;
        Integer num2 = null;
        Integer num3 = null;
        String str3 = null;
        List list3 = null;
        List list4 = null;
        String str4 = null;
        Integer num4 = num;
        Integer num5 = num4;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f23011a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    continue;
                case 0:
                    num = (Integer) this.f23012b.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v = C9712b.m10121v("storeId", "storeId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"storeId\"…d\",\n              reader)");
                        throw m10121v;
                    }
                    i2 &= -2;
                    continue;
                case 1:
                    l = (Long) this.f23013c.mo10144b(abstractC4476h);
                    i2 &= -3;
                    continue;
                case 2:
                    bool4 = (Boolean) this.f23014d.mo10144b(abstractC4476h);
                    i2 &= -5;
                    continue;
                case 3:
                    str = (String) this.f23015e.mo10144b(abstractC4476h);
                    i2 &= -9;
                    continue;
                case 4:
                    str2 = (String) this.f23015e.mo10144b(abstractC4476h);
                    i2 &= -17;
                    continue;
                case 5:
                    bool5 = (Boolean) this.f23014d.mo10144b(abstractC4476h);
                    i2 &= -33;
                    continue;
                case 6:
                    num2 = (Integer) this.f23016f.mo10144b(abstractC4476h);
                    i2 &= -65;
                    continue;
                case 7:
                    bool2 = (Boolean) this.f23017g.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("includeCategories", "includeCategories", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"includeC…cludeCategories\", reader)");
                        throw m10121v2;
                    }
                    i2 &= -129;
                    continue;
                case 8:
                    num3 = (Integer) this.f23016f.mo10144b(abstractC4476h);
                    i2 &= -257;
                    continue;
                case 9:
                    str3 = (String) this.f23015e.mo10144b(abstractC4476h);
                    i2 &= -513;
                    continue;
                case 10:
                    list3 = (List) this.f23018h.mo10144b(abstractC4476h);
                    i2 &= -1025;
                    continue;
                case 11:
                    list4 = (List) this.f23018h.mo10144b(abstractC4476h);
                    i2 &= -2049;
                    continue;
                case 12:
                    str4 = (String) this.f23015e.mo10144b(abstractC4476h);
                    i2 &= -4097;
                    continue;
                case 13:
                    list2 = (List) this.f23019i.mo10144b(abstractC4476h);
                    if (list2 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("excludeIds", "excludeIds", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"excludeIds\", \"excludeIds\", reader)");
                        throw m10121v3;
                    }
                    i2 &= -8193;
                    continue;
                case 14:
                    list = (List) this.f23019i.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("productKeys", "productKeys", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"productK…\", \"productKeys\", reader)");
                        throw m10121v4;
                    }
                    i2 &= -16385;
                    continue;
                case 15:
                    num4 = (Integer) this.f23012b.mo10144b(abstractC4476h);
                    if (num4 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("page", "page", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"page\", \"page\", reader)");
                        throw m10121v5;
                    }
                    i = -32769;
                    break;
                case 16:
                    num5 = (Integer) this.f23012b.mo10144b(abstractC4476h);
                    if (num5 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("pageSize", "pageSize", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"pageSize…      \"pageSize\", reader)");
                        throw m10121v6;
                    }
                    i = -65537;
                    break;
                case 17:
                    bool3 = (Boolean) this.f23017g.mo10144b(abstractC4476h);
                    if (bool3 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("userHasLoyaltyCardApproved", "userHasLoyaltyCardApproved", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"userHasL…d\",\n              reader)");
                        throw m10121v7;
                    }
                    i = -131073;
                    break;
            }
            i2 &= i;
        }
        abstractC4476h.mo27433h();
        if (i2 == -262144) {
            int intValue = num.intValue();
            boolean booleanValue = bool2.booleanValue();
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new SearchCatalogParameters(intValue, l, bool4, str, str2, bool5, num2, booleanValue, num3, str3, list3, list4, str4, list2, list, num4.intValue(), num5.intValue(), bool3.booleanValue());
        }
        List list5 = list;
        List list6 = list2;
        Constructor constructor = this.f23020j;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            constructor = SearchCatalogParameters.class.getDeclaredConstructor(cls, Long.class, Boolean.class, String.class, String.class, Boolean.class, Integer.class, cls2, Integer.class, String.class, List.class, List.class, String.class, List.class, List.class, cls, cls, cls2, cls, C9712b.f25570c);
            this.f23020j = constructor;
            Intrinsics.checkIfNull(constructor, "SearchCatalogParameters:…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, l, bool4, str, str2, bool5, num2, bool2, num3, str3, list3, list4, str4, list6, list5, num4, num5, bool3, Integer.valueOf(i2), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (SearchCatalogParameters) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, SearchCatalogParameters searchCatalogParameters) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(searchCatalogParameters, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("storeId");
        this.f23012b.mo10143i(abstractC4483m, Integer.valueOf(searchCatalogParameters.m13980w()));
        abstractC4483m.mo27417F("barcode");
        this.f23013c.mo10143i(abstractC4483m, searchCatalogParameters.m13994c());
        abstractC4483m.mo27417F("ownBrand");
        this.f23014d.mo10143i(abstractC4483m, searchCatalogParameters.m13987k());
        abstractC4483m.mo27417F("promoGroupClass");
        this.f23015e.mo10143i(abstractC4483m, searchCatalogParameters.m13983s());
        abstractC4483m.mo27417F("promoGroupLxPy");
        this.f23015e.mo10143i(abstractC4483m, searchCatalogParameters.m13982t());
        abstractC4483m.mo27417F("hasPromo");
        this.f23014d.mo10143i(abstractC4483m, searchCatalogParameters.m13989i());
        abstractC4483m.mo27417F("categoryId");
        this.f23016f.mo10143i(abstractC4483m, searchCatalogParameters.m13992e());
        abstractC4483m.mo27417F("includeCategories");
        this.f23017g.mo10143i(abstractC4483m, Boolean.valueOf(searchCatalogParameters.m13988j()));
        abstractC4483m.mo27417F("flyerId");
        this.f23016f.mo10143i(abstractC4483m, searchCatalogParameters.m13990h());
        abstractC4483m.mo27417F("text");
        this.f23015e.mo10143i(abstractC4483m, searchCatalogParameters.m13978z());
        abstractC4483m.mo27417F("tagIds");
        this.f23018h.mo10143i(abstractC4483m, searchCatalogParameters.m13979y());
        abstractC4483m.mo27417F("brandIds");
        this.f23018h.mo10143i(abstractC4483m, searchCatalogParameters.m13993d());
        abstractC4483m.mo27417F("sortCriteria");
        this.f23015e.mo10143i(abstractC4483m, searchCatalogParameters.m13981v());
        abstractC4483m.mo27417F("excludeIds");
        this.f23019i.mo10143i(abstractC4483m, searchCatalogParameters.m13991f());
        abstractC4483m.mo27417F("productKeys");
        this.f23019i.mo10143i(abstractC4483m, searchCatalogParameters.m13984r());
        abstractC4483m.mo27417F("page");
        this.f23012b.mo10143i(abstractC4483m, Integer.valueOf(searchCatalogParameters.m13986m()));
        abstractC4483m.mo27417F("pageSize");
        this.f23012b.mo10143i(abstractC4483m, Integer.valueOf(searchCatalogParameters.m13985n()));
        abstractC4483m.mo27417F("userHasLoyaltyCardApproved");
        this.f23017g.mo10143i(abstractC4483m, Boolean.valueOf(searchCatalogParameters.m13998A()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SearchCatalogParameters");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
