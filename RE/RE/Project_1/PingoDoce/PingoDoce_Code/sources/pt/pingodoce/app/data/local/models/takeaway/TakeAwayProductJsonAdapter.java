package pt.pingodoce.app.data.local.models.takeaway;

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
import p468yc.C13195u;
import p489zc.C13778q0;
import pt.pingodoce.app.data.local.models.products.Promotion;

/* compiled from: TakeAwayProductJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class TakeAwayProductJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22801a;

    /* renamed from: b */
    private final AbstractC4470f f22802b;

    /* renamed from: c */
    private final AbstractC4470f f22803c;

    /* renamed from: d */
    private final AbstractC4470f f22804d;

    /* renamed from: e */
    private final AbstractC4470f f22805e;

    /* renamed from: f */
    private final AbstractC4470f f22806f;

    /* renamed from: g */
    private volatile Constructor f22807g;

    public TakeAwayProductJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "categoryId", "thumbUrl", "imageUrl", "name", "description", "nutritionalInfo", "price", "measureUnitCode", "promotion", "isNew", "isMeal", "isCeramic", "numberOfPeople", "grossWeight", "quantity", "productCartRemainingQuantity", "quantityAux");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"categoryId\", \"…Quantity\", \"quantityAux\")");
        this.f22801a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class.java, emptySet(), \"id\")");
        this.f22802b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "thumbUrl");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…ySet(),\n      \"thumbUrl\")");
        this.f22803c = m27366f2;
        Class cls2 = Float.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls2, m208b3, "price");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Float::cla…mptySet(),\n      \"price\")");
        this.f22804d = m27366f3;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(Promotion.class, m208b4, "promotion");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Promotion:… emptySet(), \"promotion\")");
        this.f22805e = m27366f4;
        Class cls3 = Boolean.TYPE;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(cls3, m208b5, "isNew");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(Boolean::c…mptySet(),\n      \"isNew\")");
        this.f22806f = m27366f5;
    }

    /* renamed from: k */
    public TakeAwayProduct mo10144b(AbstractC4476h abstractC4476h) {
        String str;
        int i;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Float valueOf = Float.valueOf(0.0f);
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Float f = valueOf;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        int i2 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Promotion promotion = null;
        String str8 = null;
        Integer num5 = num4;
        Integer num6 = num5;
        while (abstractC4476h.mo27427y()) {
            Integer num7 = num6;
            switch (abstractC4476h.mo27436d0(this.f22801a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    num = (Integer) this.f22802b.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i2 &= -2;
                    break;
                case 1:
                    num5 = (Integer) this.f22802b.mo10144b(abstractC4476h);
                    if (num5 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("categoryId", "categoryId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"category…    \"categoryId\", reader)");
                        throw m10121v2;
                    }
                    i2 &= -3;
                    break;
                case 2:
                    str4 = (String) this.f22803c.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("thumbUrl", "thumbUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"thumbUrl…      \"thumbUrl\", reader)");
                        throw m10121v3;
                    }
                    i2 &= -5;
                    break;
                case 3:
                    str3 = (String) this.f22803c.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("imageUrl", "imageUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"imageUrl…      \"imageUrl\", reader)");
                        throw m10121v4;
                    }
                    i2 &= -9;
                    break;
                case 4:
                    str2 = (String) this.f22803c.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("name", "name", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"name\", \"name\", reader)");
                        throw m10121v5;
                    }
                    i2 &= -17;
                    break;
                case 5:
                    str7 = (String) this.f22803c.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("description", "description", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"descript…   \"description\", reader)");
                        throw m10121v6;
                    }
                    i2 &= -33;
                    break;
                case 6:
                    str6 = (String) this.f22803c.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("nutritionalInfo", "nutritionalInfo", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"nutritio…nutritionalInfo\", reader)");
                        throw m10121v7;
                    }
                    i2 &= -65;
                    break;
                case 7:
                    f = (Float) this.f22804d.mo10144b(abstractC4476h);
                    if (f == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("price", "price", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"price\", …e\",\n              reader)");
                        throw m10121v8;
                    }
                    i2 &= -129;
                    break;
                case 8:
                    str5 = (String) this.f22803c.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("measureUnitCode", "measureUnitCode", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"measureU…measureUnitCode\", reader)");
                        throw m10121v9;
                    }
                    i2 &= -257;
                    break;
                case 9:
                    promotion = (Promotion) this.f22805e.mo10144b(abstractC4476h);
                    i2 &= -513;
                    break;
                case 10:
                    bool2 = (Boolean) this.f22806f.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("isNew", "isNew", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"isNew\", …w\",\n              reader)");
                        throw m10121v10;
                    }
                    i2 &= -1025;
                    break;
                case 11:
                    bool3 = (Boolean) this.f22806f.mo10144b(abstractC4476h);
                    if (bool3 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("isMeal", "isMeal", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"isMeal\",…l\",\n              reader)");
                        throw m10121v11;
                    }
                    i2 &= -2049;
                    break;
                case 12:
                    bool4 = (Boolean) this.f22806f.mo10144b(abstractC4476h);
                    if (bool4 == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("isCeramic", "isCeramic", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"isCerami…     \"isCeramic\", reader)");
                        throw m10121v12;
                    }
                    i2 &= -4097;
                    break;
                case 13:
                    num6 = (Integer) this.f22802b.mo10144b(abstractC4476h);
                    if (num6 == null) {
                        JsonDataException m10121v13 = C9712b.m10121v("numberOfPeople", "numberOfPeople", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"numberOf…\"numberOfPeople\", reader)");
                        throw m10121v13;
                    }
                    i2 &= -8193;
                    continue;
                case 14:
                    str8 = (String) this.f22803c.mo10144b(abstractC4476h);
                    if (str8 == null) {
                        JsonDataException m10121v14 = C9712b.m10121v("grossWeight", "grossWeight", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v14, "unexpectedNull(\"grossWei…   \"grossWeight\", reader)");
                        throw m10121v14;
                    }
                    i2 &= -16385;
                    break;
                case 15:
                    num4 = (Integer) this.f22802b.mo10144b(abstractC4476h);
                    if (num4 == null) {
                        JsonDataException m10121v15 = C9712b.m10121v("quantity", "quantity", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v15, "unexpectedNull(\"quantity…      \"quantity\", reader)");
                        throw m10121v15;
                    }
                    i = -32769;
                    i2 &= i;
                    break;
                case 16:
                    num3 = (Integer) this.f22802b.mo10144b(abstractC4476h);
                    if (num3 == null) {
                        JsonDataException m10121v16 = C9712b.m10121v("productCartRemainingQuantity", "productCartRemainingQuantity", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v16, "unexpectedNull(\"productC…mainingQuantity\", reader)");
                        throw m10121v16;
                    }
                    i = -65537;
                    i2 &= i;
                    break;
                case 17:
                    num2 = (Integer) this.f22802b.mo10144b(abstractC4476h);
                    if (num2 == null) {
                        JsonDataException m10121v17 = C9712b.m10121v("quantityAux", "quantityAux", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v17, "unexpectedNull(\"quantity…   \"quantityAux\", reader)");
                        throw m10121v17;
                    }
                    i = -131073;
                    i2 &= i;
                    break;
            }
            num6 = num7;
        }
        Integer num8 = num6;
        abstractC4476h.mo27433h();
        if (i2 == -262144) {
            int intValue = num.intValue();
            int intValue2 = num5.intValue();
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            float floatValue = f.floatValue();
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool3.booleanValue();
            boolean booleanValue3 = bool4.booleanValue();
            int intValue3 = num8.intValue();
            String str9 = str8;
            Objects.requireNonNull(str9, "null cannot be cast to non-null type kotlin.String");
            return new TakeAwayProduct(intValue, intValue2, str4, str3, str2, str7, str6, floatValue, str5, promotion, booleanValue, booleanValue2, booleanValue3, intValue3, str9, num4.intValue(), num3.intValue(), num2.intValue());
        }
        String str10 = str8;
        Constructor constructor = this.f22807g;
        int i3 = i2;
        if (constructor == null) {
            str = str10;
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            constructor = TakeAwayProduct.class.getDeclaredConstructor(cls, cls, String.class, String.class, String.class, String.class, String.class, Float.TYPE, String.class, Promotion.class, cls2, cls2, cls2, cls, String.class, cls, cls, cls, cls, C9712b.f25570c);
            this.f22807g = constructor;
            C13195u c13195u = C13195u.f34156a;
            Intrinsics.checkIfNull(constructor, "TakeAwayProduct::class.j…his.constructorRef = it }");
        } else {
            str = str10;
        }
        Object newInstance = constructor.newInstance(num, num5, str4, str3, str2, str7, str6, f, str5, promotion, bool2, bool3, bool4, num8, str, num4, num3, num2, Integer.valueOf(i3), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TakeAwayProduct) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, TakeAwayProduct takeAwayProduct) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(takeAwayProduct, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f22802b.mo10143i(abstractC4483m, Integer.valueOf(takeAwayProduct.m14244i()));
        abstractC4483m.mo27417F("categoryId");
        this.f22802b.mo10143i(abstractC4483m, Integer.valueOf(takeAwayProduct.m14247e()));
        abstractC4483m.mo27417F("thumbUrl");
        this.f22803c.mo10143i(abstractC4483m, takeAwayProduct.m14233z());
        abstractC4483m.mo27417F("imageUrl");
        this.f22803c.mo10143i(abstractC4483m, takeAwayProduct.m14243j());
        abstractC4483m.mo27417F("name");
        this.f22803c.mo10143i(abstractC4483m, takeAwayProduct.m14241m());
        abstractC4483m.mo27417F("description");
        this.f22803c.mo10143i(abstractC4483m, takeAwayProduct.m14246f());
        abstractC4483m.mo27417F("nutritionalInfo");
        this.f22803c.mo10143i(abstractC4483m, takeAwayProduct.m14239r());
        abstractC4483m.mo27417F("price");
        this.f22804d.mo10143i(abstractC4483m, Float.valueOf(takeAwayProduct.m14238s()));
        abstractC4483m.mo27417F("measureUnitCode");
        this.f22803c.mo10143i(abstractC4483m, takeAwayProduct.m14242k());
        abstractC4483m.mo27417F("promotion");
        this.f22805e.mo10143i(abstractC4483m, takeAwayProduct.m14236v());
        abstractC4483m.mo27417F("isNew");
        this.f22806f.mo10143i(abstractC4483m, Boolean.valueOf(takeAwayProduct.m14261F()));
        abstractC4483m.mo27417F("isMeal");
        this.f22806f.mo10143i(abstractC4483m, Boolean.valueOf(takeAwayProduct.m14262E()));
        abstractC4483m.mo27417F("isCeramic");
        this.f22806f.mo10143i(abstractC4483m, Boolean.valueOf(takeAwayProduct.m14263D()));
        abstractC4483m.mo27417F("numberOfPeople");
        this.f22802b.mo10143i(abstractC4483m, Integer.valueOf(takeAwayProduct.m14240n()));
        abstractC4483m.mo27417F("grossWeight");
        this.f22803c.mo10143i(abstractC4483m, takeAwayProduct.m14245h());
        abstractC4483m.mo27417F("quantity");
        this.f22802b.mo10143i(abstractC4483m, Integer.valueOf(takeAwayProduct.m14235w()));
        abstractC4483m.mo27417F("productCartRemainingQuantity");
        this.f22802b.mo10143i(abstractC4483m, Integer.valueOf(takeAwayProduct.m14237t()));
        abstractC4483m.mo27417F("quantityAux");
        this.f22802b.mo10143i(abstractC4483m, Integer.valueOf(takeAwayProduct.m14234y()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TakeAwayProduct");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
