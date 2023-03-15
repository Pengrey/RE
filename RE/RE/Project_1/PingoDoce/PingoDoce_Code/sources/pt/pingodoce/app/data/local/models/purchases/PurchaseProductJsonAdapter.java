package pt.pingodoce.app.data.local.models.purchases;

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

/* compiled from: PurchaseProductJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class PurchaseProductJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22659a;

    /* renamed from: b */
    private final AbstractC4470f f22660b;

    /* renamed from: c */
    private final AbstractC4470f f22661c;

    /* renamed from: d */
    private final AbstractC4470f f22662d;

    /* renamed from: e */
    private volatile Constructor f22663e;

    public PurchaseProductJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("purchasePrice", "purchaseQuantity", "elasticID", "name", "storePrice", "measureUnitCode", "isSelected", "overrideWithDiscountPrice", "quantity");
        Intrinsics.checkIfNull(m27461a, "of(\"purchasePrice\",\n    …scountPrice\", \"quantity\")");
        this.f22659a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "purchasePrice");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…),\n      \"purchasePrice\")");
        this.f22660b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "isSelected");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…et(),\n      \"isSelected\")");
        this.f22661c = m27366f2;
        Class cls2 = Integer.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls2, m208b3, "quantity");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Int::class…, emptySet(), \"quantity\")");
        this.f22662d = m27366f3;
    }

    /* renamed from: k */
    public PurchaseProduct mo10144b(AbstractC4476h abstractC4476h) {
        PurchaseProduct purchaseProduct;
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
        Boolean bool2 = null;
        Integer num = null;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f22659a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str = (String) this.f22660b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v = C9712b.m10121v("purchasePrice", "purchasePrice", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"purchase… \"purchasePrice\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.f22660b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("purchaseQuantity", "purchaseQuantity", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"purchase…urchaseQuantity\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f22660b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("id", "elasticID", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"id\", \"el…D\",\n              reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.f22660b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("name", "name", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"name\", \"name\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.f22660b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("storePrice", "storePrice", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"storePri…    \"storePrice\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str6 = (String) this.f22660b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("measureUnitCode", "measureUnitCode", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"measureU…measureUnitCode\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    bool = (Boolean) this.f22661c.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("isSelected", "isSelected", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"isSelect…    \"isSelected\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    bool2 = (Boolean) this.f22661c.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("overrideWithDiscountPrice", "overrideWithDiscountPrice", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"override…ice\",\n            reader)");
                        throw m10121v8;
                    }
                    break;
                case 8:
                    num = (Integer) this.f22662d.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("quantity", "quantity", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"quantity…      \"quantity\", reader)");
                        throw m10121v9;
                    }
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -128) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            purchaseProduct = new PurchaseProduct(str, str2, str3, str4, str5, str6, bool.booleanValue());
        } else {
            Constructor constructor = this.f22663e;
            if (constructor == null) {
                constructor = PurchaseProduct.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, C9712b.f25570c);
                this.f22663e = constructor;
                Intrinsics.checkIfNull(constructor, "PurchaseProduct::class.j…his.constructorRef = it }");
            }
            Object newInstance = constructor.newInstance(str, str2, str3, str4, str5, str6, bool, Integer.valueOf(i), null);
            Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            purchaseProduct = (PurchaseProduct) newInstance;
        }
        purchaseProduct.m14522W(bool2 != null ? bool2.booleanValue() : purchaseProduct.m14539F());
        purchaseProduct.m14521X(num != null ? num.intValue() : purchaseProduct.m14538G());
        return purchaseProduct;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, PurchaseProduct purchaseProduct) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(purchaseProduct, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("purchasePrice");
        this.f22660b.mo10143i(abstractC4483m, purchaseProduct.m14414c0());
        abstractC4483m.mo27417F("purchaseQuantity");
        this.f22660b.mo10143i(abstractC4483m, purchaseProduct.m14412e0());
        abstractC4483m.mo27417F("elasticID");
        this.f22660b.mo10143i(abstractC4483m, purchaseProduct.m14407y());
        abstractC4483m.mo27417F("name");
        this.f22660b.mo10143i(abstractC4483m, purchaseProduct.m14416E());
        abstractC4483m.mo27417F("storePrice");
        this.f22660b.mo10143i(abstractC4483m, purchaseProduct.m14415I());
        abstractC4483m.mo27417F("measureUnitCode");
        this.f22660b.mo10143i(abstractC4483m, purchaseProduct.m14417D());
        abstractC4483m.mo27417F("isSelected");
        this.f22661c.mo10143i(abstractC4483m, Boolean.valueOf(purchaseProduct.m14409h0()));
        abstractC4483m.mo27417F("overrideWithDiscountPrice");
        this.f22661c.mo10143i(abstractC4483m, Boolean.valueOf(purchaseProduct.m14539F()));
        abstractC4483m.mo27417F("quantity");
        this.f22662d.mo10143i(abstractC4483m, Integer.valueOf(purchaseProduct.m14538G()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PurchaseProduct");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
