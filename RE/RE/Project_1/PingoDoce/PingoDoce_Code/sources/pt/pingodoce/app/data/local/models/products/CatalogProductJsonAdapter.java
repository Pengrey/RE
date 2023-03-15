package pt.pingodoce.app.data.local.models.products;

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
import p468yc.C13195u;
import p489zc.C13778q0;
import pt.pingodoce.app.data.remote.models.response.BrandResponse;

/* compiled from: CatalogProductJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class CatalogProductJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22573a;

    /* renamed from: b */
    private final AbstractC4470f f22574b;

    /* renamed from: c */
    private final AbstractC4470f f22575c;

    /* renamed from: d */
    private final AbstractC4470f f22576d;

    /* renamed from: e */
    private final AbstractC4470f f22577e;

    /* renamed from: f */
    private final AbstractC4470f f22578f;

    /* renamed from: g */
    private final AbstractC4470f f22579g;

    /* renamed from: h */
    private final AbstractC4470f f22580h;

    /* renamed from: i */
    private volatile Constructor f22581i;

    public CatalogProductJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Set<? extends Annotation> m208b6;
        Set<? extends Annotation> m208b7;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("productInternalCode", "categoryId", "name", "image", "description", "thumb", "brand", "storePrice", "measureUnitCode", "hasLowerPrice", "bestPromotion", "tags", "discountSortOrder", "quantity", "overrideWithDiscountPrice", "betterPriceAvailableMessage");
        Intrinsics.checkIfNull(m27461a, "of(\"productInternalCode\"…erPriceAvailableMessage\")");
        this.f22573a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22574b = m27366f;
        Class cls = Integer.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "categoryId");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Int::class…et(),\n      \"categoryId\")");
        this.f22575c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(BrandResponse.class, m208b3, "brand");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(BrandRespo…ava, emptySet(), \"brand\")");
        this.f22576d = m27366f3;
        Class cls2 = Boolean.TYPE;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(cls2, m208b4, "hasLowerPrice");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Boolean::c…),\n      \"hasLowerPrice\")");
        this.f22577e = m27366f4;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(Promotion.class, m208b5, "bestPromotion");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(Promotion:…tySet(), \"bestPromotion\")");
        this.f22578f = m27366f5;
        ParameterizedType m27327j = C4516s.m27327j(List.class, Integer.class);
        m208b6 = C13778q0.m208b();
        AbstractC4470f m27366f6 = c4496p.m27366f(m27327j, m208b6, "tags");
        Intrinsics.checkIfNull(m27366f6, "moshi.adapter(Types.newP…      emptySet(), \"tags\")");
        this.f22579g = m27366f6;
        m208b7 = C13778q0.m208b();
        AbstractC4470f m27366f7 = c4496p.m27366f(String.class, m208b7, "betterPriceAvailableMessage");
        Intrinsics.checkIfNull(m27366f7, "moshi.adapter(String::cl…erPriceAvailableMessage\")");
        this.f22580h = m27366f7;
    }

    /* renamed from: k */
    public CatalogProduct mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        int i = -1;
        String str = null;
        String str2 = null;
        BrandResponse brandResponse = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Promotion promotion = null;
        String str8 = null;
        Integer num2 = num;
        Integer num3 = num2;
        while (abstractC4476h.mo27427y()) {
            Integer num4 = num3;
            switch (abstractC4476h.mo27436d0(this.f22573a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str4 = (String) this.f22574b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "productInternalCode", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\",\n   …uctInternalCode\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    num = (Integer) this.f22575c.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("categoryId", "categoryId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"category…    \"categoryId\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str6 = (String) this.f22574b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("name", "name", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"name\", \"name\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str7 = (String) this.f22574b.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("image", "image", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"image\", …e\",\n              reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.f22574b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("description", "description", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"descript…   \"description\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str3 = (String) this.f22574b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("thumb", "thumb", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"thumb\", …b\",\n              reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    brandResponse = (BrandResponse) this.f22576d.mo10144b(abstractC4476h);
                    if (brandResponse == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("brand", "brand", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"brand\",\n…         \"brand\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    str2 = (String) this.f22574b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("storePrice", "storePrice", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"storePri…    \"storePrice\", reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    str = (String) this.f22574b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("measureUnitCode", "measureUnitCode", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"measureU…measureUnitCode\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
                case 9:
                    bool2 = (Boolean) this.f22577e.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("hasLowerPrice", "hasLowerPrice", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"hasLower… \"hasLowerPrice\", reader)");
                        throw m10121v10;
                    }
                    i &= -513;
                    break;
                case 10:
                    promotion = (Promotion) this.f22578f.mo10144b(abstractC4476h);
                    i &= -1025;
                    break;
                case 11:
                    list = (List) this.f22579g.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("tags", "tags", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"tags\", \"…s\",\n              reader)");
                        throw m10121v11;
                    }
                    i &= -2049;
                    break;
                case 12:
                    num2 = (Integer) this.f22575c.mo10144b(abstractC4476h);
                    if (num2 == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("sortOrder", "discountSortOrder", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"sortOrde…scountSortOrder\", reader)");
                        throw m10121v12;
                    }
                    i &= -4097;
                    break;
                case 13:
                    num3 = (Integer) this.f22575c.mo10144b(abstractC4476h);
                    if (num3 == null) {
                        JsonDataException m10121v13 = C9712b.m10121v("quantity", "quantity", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"quantity…      \"quantity\", reader)");
                        throw m10121v13;
                    }
                    i &= -8193;
                    continue;
                case 14:
                    bool3 = (Boolean) this.f22577e.mo10144b(abstractC4476h);
                    if (bool3 == null) {
                        JsonDataException m10121v14 = C9712b.m10121v("overrideWithDiscountPrice", "overrideWithDiscountPrice", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v14, "unexpectedNull(\"override…e\",\n              reader)");
                        throw m10121v14;
                    }
                    i &= -16385;
                    break;
                case 15:
                    str8 = (String) this.f22580h.mo10144b(abstractC4476h);
                    i &= -32769;
                    break;
            }
            num3 = num4;
        }
        Integer num5 = num3;
        abstractC4476h.mo27433h();
        if (i == -65536) {
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            int intValue = num.intValue();
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(brandResponse, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.BrandResponse");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool2.booleanValue();
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            return new CatalogProduct(str4, intValue, str6, str7, str5, str3, brandResponse, str2, str, booleanValue, promotion, list, num2.intValue(), num5.intValue(), bool3.booleanValue(), str8);
        }
        String str9 = str3;
        String str10 = str5;
        Constructor constructor = this.f22581i;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            constructor = CatalogProduct.class.getDeclaredConstructor(String.class, cls, String.class, String.class, String.class, String.class, BrandResponse.class, String.class, String.class, cls2, Promotion.class, List.class, cls, cls, cls2, String.class, cls, C9712b.f25570c);
            this.f22581i = constructor;
            C13195u c13195u = C13195u.f34156a;
            Intrinsics.checkIfNull(constructor, "CatalogProduct::class.ja…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str4, num, str6, str7, str10, str9, brandResponse, str2, str, bool2, promotion, list, num2, num5, bool3, str8, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (CatalogProduct) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, CatalogProduct catalogProduct) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(catalogProduct, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("productInternalCode");
        this.f22574b.mo10143i(abstractC4483m, catalogProduct.m14499y());
        abstractC4483m.mo27417F("categoryId");
        this.f22575c.mo10143i(abstractC4483m, Integer.valueOf(catalogProduct.m14502t()));
        abstractC4483m.mo27417F("name");
        this.f22574b.mo10143i(abstractC4483m, catalogProduct.m14540E());
        abstractC4483m.mo27417F("image");
        this.f22574b.mo10143i(abstractC4483m, catalogProduct.m14498z());
        abstractC4483m.mo27417F("description");
        this.f22574b.mo10143i(abstractC4483m, catalogProduct.m14501v());
        abstractC4483m.mo27417F("thumb");
        this.f22574b.mo10143i(abstractC4483m, catalogProduct.m14534K());
        abstractC4483m.mo27417F("brand");
        this.f22576d.mo10143i(abstractC4483m, catalogProduct.m14503s());
        abstractC4483m.mo27417F("storePrice");
        this.f22574b.mo10143i(abstractC4483m, catalogProduct.m14536I());
        abstractC4483m.mo27417F("measureUnitCode");
        this.f22574b.mo10143i(abstractC4483m, catalogProduct.m14541D());
        abstractC4483m.mo27417F("hasLowerPrice");
        this.f22577e.mo10143i(abstractC4483m, Boolean.valueOf(catalogProduct.m14500w()));
        abstractC4483m.mo27417F("bestPromotion");
        this.f22578f.mo10143i(abstractC4483m, catalogProduct.m14505n());
        abstractC4483m.mo27417F("tags");
        this.f22579g.mo10143i(abstractC4483m, catalogProduct.m14535J());
        abstractC4483m.mo27417F("discountSortOrder");
        this.f22575c.mo10143i(abstractC4483m, Integer.valueOf(catalogProduct.m14537H()));
        abstractC4483m.mo27417F("quantity");
        this.f22575c.mo10143i(abstractC4483m, Integer.valueOf(catalogProduct.m14538G()));
        abstractC4483m.mo27417F("overrideWithDiscountPrice");
        this.f22577e.mo10143i(abstractC4483m, Boolean.valueOf(catalogProduct.m14539F()));
        abstractC4483m.mo27417F("betterPriceAvailableMessage");
        this.f22580h.mo10143i(abstractC4483m, catalogProduct.m14504r());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CatalogProduct");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
