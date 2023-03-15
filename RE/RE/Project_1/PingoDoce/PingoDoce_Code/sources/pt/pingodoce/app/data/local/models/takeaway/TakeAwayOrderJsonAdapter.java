package pt.pingodoce.app.data.local.models.takeaway;

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

/* compiled from: TakeAwayOrderJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class TakeAwayOrderJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22777a;

    /* renamed from: b */
    private final AbstractC4470f f22778b;

    /* renamed from: c */
    private final AbstractC4470f f22779c;

    /* renamed from: d */
    private final AbstractC4470f f22780d;

    /* renamed from: e */
    private final AbstractC4470f f22781e;

    /* renamed from: f */
    private volatile Constructor f22782f;

    public TakeAwayOrderJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("number", "products", "ownerName", "ownerPhone", "ownerEmail", "storeName", "storeAddress", "storeId", "pickupDate", "total", "disclaimer", "cancellable", "orderTypeCode", "orderTypeLabel");
        Intrinsics.checkIfNull(m27461a, "of(\"number\", \"products\",…eCode\", \"orderTypeLabel\")");
        this.f22777a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "number");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…ptySet(),\n      \"number\")");
        this.f22778b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, TakeAwayProduct.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "products");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…  emptySet(), \"products\")");
        this.f22779c = m27366f2;
        Class cls = Integer.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls, m208b3, "storeId");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Int::class…a, emptySet(), \"storeId\")");
        this.f22780d = m27366f3;
        Class cls2 = Boolean.TYPE;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(cls2, m208b4, "cancellable");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Boolean::c…t(),\n      \"cancellable\")");
        this.f22781e = m27366f4;
    }

    /* renamed from: k */
    public TakeAwayOrder mo10144b(AbstractC4476h abstractC4476h) {
        int i;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (abstractC4476h.mo27427y()) {
            String str12 = str;
            switch (abstractC4476h.mo27436d0(this.f22777a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str5 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v = C9712b.m10121v("number", "number", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"number\",…r\",\n              reader)");
                        throw m10121v;
                    }
                    i2 &= -2;
                    break;
                case 1:
                    list = (List) this.f22779c.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("products", "products", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"products\", \"products\", reader)");
                        throw m10121v2;
                    }
                    i2 &= -3;
                    break;
                case 2:
                    str6 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("ownerName", "ownerName", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"ownerNam…     \"ownerName\", reader)");
                        throw m10121v3;
                    }
                    i2 &= -5;
                    break;
                case 3:
                    str7 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("ownerPhone", "ownerPhone", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"ownerPho…    \"ownerPhone\", reader)");
                        throw m10121v4;
                    }
                    i2 &= -9;
                    break;
                case 4:
                    str8 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str8 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("ownerEmail", "ownerEmail", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"ownerEma…    \"ownerEmail\", reader)");
                        throw m10121v5;
                    }
                    i2 &= -17;
                    break;
                case 5:
                    str9 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str9 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("storeName", "storeName", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"storeNam…     \"storeName\", reader)");
                        throw m10121v6;
                    }
                    i2 &= -33;
                    break;
                case 6:
                    str10 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str10 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("storeAddress", "storeAddress", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"storeAdd…  \"storeAddress\", reader)");
                        throw m10121v7;
                    }
                    i2 &= -65;
                    break;
                case 7:
                    num = (Integer) this.f22780d.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("storeId", "storeId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"storeId\"…d\",\n              reader)");
                        throw m10121v8;
                    }
                    i2 &= -129;
                    break;
                case 8:
                    str4 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("pickupDate", "pickupDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"pickupDa…    \"pickupDate\", reader)");
                        throw m10121v9;
                    }
                    i2 &= -257;
                    break;
                case 9:
                    str3 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("total", "total", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"total\", …l\",\n              reader)");
                        throw m10121v10;
                    }
                    i2 &= -513;
                    break;
                case 10:
                    str2 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("disclaimer", "disclaimer", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"disclaim…    \"disclaimer\", reader)");
                        throw m10121v11;
                    }
                    i2 &= -1025;
                    break;
                case 11:
                    bool = (Boolean) this.f22781e.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("cancellable", "cancellable", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"cancella…   \"cancellable\", reader)");
                        throw m10121v12;
                    }
                    i2 &= -2049;
                    break;
                case 12:
                    str = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v13 = C9712b.m10121v("orderTypeCode", "orderTypeCode", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"orderTyp… \"orderTypeCode\", reader)");
                        throw m10121v13;
                    }
                    i2 &= -4097;
                    continue;
                case 13:
                    str11 = (String) this.f22778b.mo10144b(abstractC4476h);
                    if (str11 == null) {
                        JsonDataException m10121v14 = C9712b.m10121v("orderTypeLabel", "orderTypeLabel", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v14, "unexpectedNull(\"orderTyp…\"orderTypeLabel\", reader)");
                        throw m10121v14;
                    }
                    i2 &= -8193;
                    break;
            }
            str = str12;
        }
        String str13 = str;
        abstractC4476h.mo27433h();
        if (i2 == -16384) {
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct>");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str8, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str9, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str10, "null cannot be cast to non-null type kotlin.String");
            int intValue = num.intValue();
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(str13, "null cannot be cast to non-null type kotlin.String");
            String str14 = str11;
            Objects.requireNonNull(str14, "null cannot be cast to non-null type kotlin.String");
            return new TakeAwayOrder(str5, list, str6, str7, str8, str9, str10, intValue, str4, str3, str2, booleanValue, str13, str14);
        }
        String str15 = str4;
        Constructor constructor = this.f22782f;
        if (constructor == null) {
            i = i2;
            Class cls = Integer.TYPE;
            constructor = TakeAwayOrder.class.getDeclaredConstructor(String.class, List.class, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, cls, C9712b.f25570c);
            this.f22782f = constructor;
            Intrinsics.checkIfNull(constructor, "TakeAwayOrder::class.jav…his.constructorRef = it }");
        } else {
            i = i2;
        }
        Object newInstance = constructor.newInstance(str5, list, str6, str7, str8, str9, str10, num, str15, str3, str2, bool, str13, str11, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TakeAwayOrder) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, TakeAwayOrder takeAwayOrder) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(takeAwayOrder, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("number");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14283c());
        abstractC4483m.mo27417F("products");
        this.f22779c.mo10143i(abstractC4483m, takeAwayOrder.m14276k());
        abstractC4483m.mo27417F("ownerName");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14279h());
        abstractC4483m.mo27417F("ownerPhone");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14278i());
        abstractC4483m.mo27417F("ownerEmail");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14280f());
        abstractC4483m.mo27417F("storeName");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14273r());
        abstractC4483m.mo27417F("storeAddress");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14275m());
        abstractC4483m.mo27417F("storeId");
        this.f22780d.mo10143i(abstractC4483m, Integer.valueOf(takeAwayOrder.m14274n()));
        abstractC4483m.mo27417F("pickupDate");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14277j());
        abstractC4483m.mo27417F("total");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14272s());
        abstractC4483m.mo27417F("disclaimer");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14284b());
        abstractC4483m.mo27417F("cancellable");
        this.f22781e.mo10143i(abstractC4483m, Boolean.valueOf(takeAwayOrder.m14285a()));
        abstractC4483m.mo27417F("orderTypeCode");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14282d());
        abstractC4483m.mo27417F("orderTypeLabel");
        this.f22778b.mo10143i(abstractC4483m, takeAwayOrder.m14281e());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TakeAwayOrder");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
