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

/* compiled from: PriceCalculationJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class PriceCalculationJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22604a;

    /* renamed from: b */
    private final AbstractC4470f f22605b;

    /* renamed from: c */
    private final AbstractC4470f f22606c;

    /* renamed from: d */
    private volatile Constructor f22607d;

    public PriceCalculationJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "quantity", "priceLabel", "unitPriceLabel", "promotionCode");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"quantity\", \"pr…eLabel\", \"promotionCode\")");
        this.f22604a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "productId");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…Set(),\n      \"productId\")");
        this.f22605b = m27366f;
        Class cls = Integer.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "quantity");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Int::class…, emptySet(), \"quantity\")");
        this.f22606c = m27366f2;
    }

    /* renamed from: k */
    public PriceCalculation mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22604a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22605b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("productId", "id", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"productI…d\",\n              reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                num = (Integer) this.f22606c.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("quantity", "quantity", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"quantity…      \"quantity\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str2 = (String) this.f22605b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("priceLabel", "priceLabel", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"priceLab…    \"priceLabel\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                str3 = (String) this.f22605b.mo10144b(abstractC4476h);
                if (str3 == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("unitPriceLabel", "unitPriceLabel", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"unitPric…\"unitPriceLabel\", reader)");
                    throw m10121v4;
                }
                i &= -9;
            } else if (mo27436d0 == 4) {
                str4 = (String) this.f22605b.mo10144b(abstractC4476h);
                if (str4 == null) {
                    JsonDataException m10121v5 = C9712b.m10121v("promotionCode", "promotionCode", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"promotio… \"promotionCode\", reader)");
                    throw m10121v5;
                }
                i &= -17;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -32) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            int intValue = num.intValue();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            return new PriceCalculation(str, intValue, str2, str3, str4);
        }
        Constructor constructor = this.f22607d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = PriceCalculation.class.getDeclaredConstructor(String.class, cls, String.class, String.class, String.class, cls, C9712b.f25570c);
            this.f22607d = constructor;
            Intrinsics.checkIfNull(constructor, "PriceCalculation::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, num, str2, str3, str4, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (PriceCalculation) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, PriceCalculation priceCalculation) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(priceCalculation, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f22605b.mo10143i(abstractC4483m, priceCalculation.m14474b());
        abstractC4483m.mo27417F("quantity");
        this.f22606c.mo10143i(abstractC4483m, Integer.valueOf(priceCalculation.m14472d()));
        abstractC4483m.mo27417F("priceLabel");
        this.f22605b.mo10143i(abstractC4483m, priceCalculation.m14475a());
        abstractC4483m.mo27417F("unitPriceLabel");
        this.f22605b.mo10143i(abstractC4483m, priceCalculation.m14471e());
        abstractC4483m.mo27417F("promotionCode");
        this.f22605b.mo10143i(abstractC4483m, priceCalculation.m14473c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PriceCalculation");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
