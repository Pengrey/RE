package pt.pingodoce.app.data.local.models.purchases;

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

/* compiled from: PurchaseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class PurchaseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22645a;

    /* renamed from: b */
    private final AbstractC4470f f22646b;

    /* renamed from: c */
    private final AbstractC4470f f22647c;

    /* renamed from: d */
    private final AbstractC4470f f22648d;

    /* renamed from: e */
    private final AbstractC4470f f22649e;

    /* renamed from: f */
    private final AbstractC4470f f22650f;

    /* renamed from: g */
    private volatile Constructor f22651g;

    public PurchaseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("transactionId", "idOperator", "idPos", "storeId", "transactionDate", "storeName", "total", "totalDiscount", "totalItems", "products", "benefitsLabel");
        Intrinsics.checkIfNull(m27461a, "of(\"transactionId\", \"idO…oducts\", \"benefitsLabel\")");
        this.f22645a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22646b = m27366f;
        Class cls = Float.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "total");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Float::cla…mptySet(),\n      \"total\")");
        this.f22647c = m27366f2;
        Class cls2 = Integer.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls2, m208b3, "productCount");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Int::class…(),\n      \"productCount\")");
        this.f22648d = m27366f3;
        ParameterizedType m27327j = C4516s.m27327j(List.class, PurchaseProduct.class);
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(m27327j, m208b4, "products");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Types.newP…  emptySet(), \"products\")");
        this.f22649e = m27366f4;
        ParameterizedType m27327j2 = C4516s.m27327j(List.class, String.class);
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(m27327j2, m208b5, "benefitsLabelList");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(Types.newP…     \"benefitsLabelList\")");
        this.f22650f = m27366f5;
    }

    /* renamed from: k */
    public Purchase mo10144b(AbstractC4476h abstractC4476h) {
        int i;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Float valueOf = Float.valueOf(0.0f);
        abstractC4476h.mo27437c();
        int i2 = -1;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num = 0;
        Float f = valueOf;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f22645a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str = (String) this.f22646b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "transactionId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"tr…d\",\n              reader)");
                        throw m10121v;
                    }
                    i2 &= -2;
                    break;
                case 1:
                    str2 = (String) this.f22646b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("idOperator", "idOperator", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"idOperat…    \"idOperator\", reader)");
                        throw m10121v2;
                    }
                    i2 &= -3;
                    break;
                case 2:
                    str3 = (String) this.f22646b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("idPos", "idPos", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"idPos\", …s\",\n              reader)");
                        throw m10121v3;
                    }
                    i2 &= -5;
                    break;
                case 3:
                    str4 = (String) this.f22646b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("storeId", "storeId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"storeId\"…       \"storeId\", reader)");
                        throw m10121v4;
                    }
                    i2 &= -9;
                    break;
                case 4:
                    str5 = (String) this.f22646b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("date", "transactionDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"date\",\n …transactionDate\", reader)");
                        throw m10121v5;
                    }
                    i2 &= -17;
                    break;
                case 5:
                    str6 = (String) this.f22646b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("storeName", "storeName", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"storeNam…     \"storeName\", reader)");
                        throw m10121v6;
                    }
                    i2 &= -33;
                    break;
                case 6:
                    valueOf = (Float) this.f22647c.mo10144b(abstractC4476h);
                    if (valueOf == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("total", "total", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"total\", …l\",\n              reader)");
                        throw m10121v7;
                    }
                    i2 &= -65;
                    break;
                case 7:
                    f = (Float) this.f22647c.mo10144b(abstractC4476h);
                    if (f == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("discount", "totalDiscount", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"discount… \"totalDiscount\", reader)");
                        throw m10121v8;
                    }
                    i2 &= -129;
                    break;
                case 8:
                    num = (Integer) this.f22648d.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("productCount", "totalItems", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"productC…    \"totalItems\", reader)");
                        throw m10121v9;
                    }
                    i2 &= -257;
                    break;
                case 9:
                    list2 = (List) this.f22649e.mo10144b(abstractC4476h);
                    if (list2 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("products", "products", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"products\", \"products\", reader)");
                        throw m10121v10;
                    }
                    i2 &= -513;
                    break;
                case 10:
                    list = (List) this.f22650f.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("benefitsLabelList", "benefitsLabel", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"benefits… \"benefitsLabel\", reader)");
                        throw m10121v11;
                    }
                    i2 &= -1025;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i2 == -2048) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            float floatValue = valueOf.floatValue();
            float floatValue2 = f.floatValue();
            int intValue = num.intValue();
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.purchases.PurchaseProduct>");
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new Purchase(str, str2, str3, str4, str5, str6, floatValue, floatValue2, intValue, list2, list);
        }
        List list3 = list2;
        Constructor constructor = this.f22651g;
        if (constructor == null) {
            i = i2;
            Class cls = Float.TYPE;
            Class cls2 = Integer.TYPE;
            constructor = Purchase.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, cls2, List.class, List.class, cls2, C9712b.f25570c);
            this.f22651g = constructor;
            Intrinsics.checkIfNull(constructor, "Purchase::class.java.get…his.constructorRef = it }");
        } else {
            i = i2;
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, str5, str6, valueOf, f, num, list3, list, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Purchase) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Purchase purchase) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(purchase, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("transactionId");
        this.f22646b.mo10143i(abstractC4483m, purchase.m14434i());
        abstractC4483m.mo27417F("idOperator");
        this.f22646b.mo10143i(abstractC4483m, purchase.m14433j());
        abstractC4483m.mo27417F("idPos");
        this.f22646b.mo10143i(abstractC4483m, purchase.m14432k());
        abstractC4483m.mo27417F("storeId");
        this.f22646b.mo10143i(abstractC4483m, purchase.m14425w());
        abstractC4483m.mo27417F("transactionDate");
        this.f22646b.mo10143i(abstractC4483m, purchase.m14438d());
        abstractC4483m.mo27417F("storeName");
        this.f22646b.mo10143i(abstractC4483m, purchase.m14424y());
        abstractC4483m.mo27417F("total");
        this.f22647c.mo10143i(abstractC4483m, Float.valueOf(purchase.m14423z()));
        abstractC4483m.mo27417F("totalDiscount");
        this.f22647c.mo10143i(abstractC4483m, Float.valueOf(purchase.m14437e()));
        abstractC4483m.mo27417F("totalItems");
        this.f22648d.mo10143i(abstractC4483m, Integer.valueOf(purchase.m14428s()));
        abstractC4483m.mo27417F("products");
        this.f22649e.mo10143i(abstractC4483m, purchase.m14427t());
        abstractC4483m.mo27417F("benefitsLabel");
        this.f22650f.mo10143i(abstractC4483m, purchase.m14439c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Purchase");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
