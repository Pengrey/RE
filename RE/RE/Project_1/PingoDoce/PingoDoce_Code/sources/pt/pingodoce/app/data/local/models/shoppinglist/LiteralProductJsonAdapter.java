package pt.pingodoce.app.data.local.models.shoppinglist;

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

/* compiled from: LiteralProductJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class LiteralProductJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22691a;

    /* renamed from: b */
    private final AbstractC4470f f22692b;

    /* renamed from: c */
    private final AbstractC4470f f22693c;

    /* renamed from: d */
    private final AbstractC4470f f22694d;

    /* renamed from: e */
    private final AbstractC4470f f22695e;

    /* renamed from: f */
    private final AbstractC4470f f22696f;

    /* renamed from: g */
    private volatile Constructor f22697g;

    public LiteralProductJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "timeStamp", "category", "name", "quantity", "checked", "dateUpdated", "sortOrder", "manualOrder", "deleted", "priceLabel");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"timeStamp\", \"c…ted\",\n      \"priceLabel\")");
        this.f22691a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22692b = m27366f;
        Class cls = Long.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "timeStamp");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Long::clas…Set(),\n      \"timeStamp\")");
        this.f22693c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(ShoppingListCategory.class, m208b3, "category");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(ShoppingLi…, emptySet(), \"category\")");
        this.f22694d = m27366f3;
        Class cls2 = Integer.TYPE;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(cls2, m208b4, "quantity");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Int::class…, emptySet(), \"quantity\")");
        this.f22695e = m27366f4;
        Class cls3 = Boolean.TYPE;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(cls3, m208b5, "checked");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(Boolean::c…tySet(),\n      \"checked\")");
        this.f22696f = m27366f5;
    }

    /* renamed from: k */
    public LiteralProduct mo10144b(AbstractC4476h abstractC4476h) {
        LiteralProduct literalProduct;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Long l = 0L;
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        ShoppingListCategory shoppingListCategory = null;
        String str4 = null;
        Integer num2 = num;
        Integer num3 = num2;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f22691a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str = (String) this.f22692b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    l = (Long) this.f22693c.mo10144b(abstractC4476h);
                    if (l == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("timeStamp", "timeStamp", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"timeStam…     \"timeStamp\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    shoppingListCategory = (ShoppingListCategory) this.f22694d.mo10144b(abstractC4476h);
                    if (shoppingListCategory == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("category", "category", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"category\", \"category\", reader)");
                        throw m10121v3;
                    }
                    break;
                case 3:
                    str2 = (String) this.f22692b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("name", "name", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"name\", \"name\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    num = (Integer) this.f22695e.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("quantity", "quantity", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"quantity…      \"quantity\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    bool2 = (Boolean) this.f22696f.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("checked", "checked", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"checked\"…       \"checked\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    str3 = (String) this.f22692b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("dateUpdated", "dateUpdated", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"dateUpda…   \"dateUpdated\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    num2 = (Integer) this.f22695e.mo10144b(abstractC4476h);
                    if (num2 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("sortOrder", "sortOrder", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"sortOrde…     \"sortOrder\", reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    num3 = (Integer) this.f22695e.mo10144b(abstractC4476h);
                    if (num3 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("manualOrder", "manualOrder", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"manualOr…   \"manualOrder\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
                case 9:
                    bool3 = (Boolean) this.f22696f.mo10144b(abstractC4476h);
                    if (bool3 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("deleted", "deleted", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"deleted\"…       \"deleted\", reader)");
                        throw m10121v10;
                    }
                    i &= -513;
                    break;
                case 10:
                    str4 = (String) this.f22692b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("priceLabel", "priceLabel", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"priceLab…    \"priceLabel\", reader)");
                        throw m10121v11;
                    }
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -1020) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            long longValue = l.longValue();
            if (shoppingListCategory != null) {
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
                int intValue = num.intValue();
                boolean booleanValue = bool2.booleanValue();
                Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
                literalProduct = new LiteralProduct(str, longValue, shoppingListCategory, str2, intValue, booleanValue, str3, num2.intValue(), num3.intValue(), bool3.booleanValue());
            } else {
                JsonDataException m10129n = C9712b.m10129n("category", "category", abstractC4476h);
                Intrinsics.checkIfNull(m10129n, "missingProperty(\"category\", \"category\", reader)");
                throw m10129n;
            }
        } else {
            String str5 = str2;
            String str6 = str3;
            Constructor constructor = this.f22697g;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                constructor = LiteralProduct.class.getDeclaredConstructor(String.class, Long.TYPE, ShoppingListCategory.class, String.class, cls, cls2, String.class, cls, cls, cls2, cls, C9712b.f25570c);
                this.f22697g = constructor;
                Intrinsics.checkIfNull(constructor, "LiteralProduct::class.ja…his.constructorRef = it }");
            }
            Object[] objArr = new Object[12];
            objArr[0] = str;
            objArr[1] = l;
            if (shoppingListCategory != null) {
                objArr[2] = shoppingListCategory;
                objArr[3] = str5;
                objArr[4] = num;
                objArr[5] = bool2;
                objArr[6] = str6;
                objArr[7] = num2;
                objArr[8] = num3;
                objArr[9] = bool3;
                objArr[10] = Integer.valueOf(i);
                objArr[11] = null;
                Object newInstance = constructor.newInstance(objArr);
                Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                literalProduct = (LiteralProduct) newInstance;
            } else {
                JsonDataException m10129n2 = C9712b.m10129n("category", "category", abstractC4476h);
                Intrinsics.checkIfNull(m10129n2, "missingProperty(\"category\", \"category\", reader)");
                throw m10129n2;
            }
        }
        if (str4 == null) {
            str4 = literalProduct.m14328r();
        }
        literalProduct.m14342L(str4);
        return literalProduct;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, LiteralProduct literalProduct) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(literalProduct, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f22692b.mo10143i(abstractC4483m, literalProduct.m14370k());
        abstractC4483m.mo27417F("timeStamp");
        this.f22693c.mo10143i(abstractC4483m, Long.valueOf(literalProduct.m14365w()));
        abstractC4483m.mo27417F("category");
        this.f22694d.mo10143i(abstractC4483m, literalProduct.m14374f());
        abstractC4483m.mo27417F("name");
        this.f22692b.mo10143i(abstractC4483m, literalProduct.m14368n());
        abstractC4483m.mo27417F("quantity");
        this.f22695e.mo10143i(abstractC4483m, Integer.valueOf(literalProduct.m14367s()));
        abstractC4483m.mo27417F("checked");
        this.f22696f.mo10143i(abstractC4483m, Boolean.valueOf(literalProduct.m14373h()));
        abstractC4483m.mo27417F("dateUpdated");
        this.f22692b.mo10143i(abstractC4483m, literalProduct.m14372i());
        abstractC4483m.mo27417F("sortOrder");
        this.f22695e.mo10143i(abstractC4483m, Integer.valueOf(literalProduct.m14366v()));
        abstractC4483m.mo27417F("manualOrder");
        this.f22695e.mo10143i(abstractC4483m, Integer.valueOf(literalProduct.m14369m()));
        abstractC4483m.mo27417F("deleted");
        this.f22696f.mo10143i(abstractC4483m, Boolean.valueOf(literalProduct.m14371j()));
        abstractC4483m.mo27417F("priceLabel");
        this.f22692b.mo10143i(abstractC4483m, literalProduct.m14328r());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LiteralProduct");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
