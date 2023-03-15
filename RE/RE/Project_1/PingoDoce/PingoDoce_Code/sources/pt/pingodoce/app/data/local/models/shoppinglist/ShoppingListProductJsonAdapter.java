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
import p468yc.C13195u;
import p489zc.C13778q0;

/* compiled from: ShoppingListProductJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ShoppingListProductJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22723a;

    /* renamed from: b */
    private final AbstractC4470f f22724b;

    /* renamed from: c */
    private final AbstractC4470f f22725c;

    /* renamed from: d */
    private final AbstractC4470f f22726d;

    /* renamed from: e */
    private final AbstractC4470f f22727e;

    /* renamed from: f */
    private final AbstractC4470f f22728f;

    /* renamed from: g */
    private volatile Constructor f22729g;

    public ShoppingListProductJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "timeStamp", "category", "name", "quantity", "checked", "unitLabel", "badgeUrl", "badgeDisclaimer", "badgeDisclaimerTitle", "showBadgeDisclaimer", "promotionCode", "priceLabel", "unitPriceLabel", "dateUpdated", "sortOrder", "manualOrder", "deleted");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"timeStamp\", \"c…\"manualOrder\", \"deleted\")");
        this.f22723a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22724b = m27366f;
        Class cls = Long.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "timeStamp");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Long::clas…Set(),\n      \"timeStamp\")");
        this.f22725c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(ShoppingListCategory.class, m208b3, "category");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(ShoppingLi…, emptySet(), \"category\")");
        this.f22726d = m27366f3;
        Class cls2 = Integer.TYPE;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(cls2, m208b4, "quantity");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Int::class…, emptySet(), \"quantity\")");
        this.f22727e = m27366f4;
        Class cls3 = Boolean.TYPE;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(cls3, m208b5, "checked");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(Boolean::c…tySet(),\n      \"checked\")");
        this.f22728f = m27366f5;
    }

    /* renamed from: k */
    public ShoppingListProduct mo10144b(AbstractC4476h abstractC4476h) {
        int i;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Long l = 0L;
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Integer num2 = num;
        Integer num3 = num2;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        ShoppingListCategory shoppingListCategory = null;
        String str10 = null;
        while (true) {
            String str11 = str3;
            if (abstractC4476h.mo27427y()) {
                String str12 = str5;
                switch (abstractC4476h.mo27436d0(this.f22723a)) {
                    case -1:
                        abstractC4476h.mo27432l0();
                        abstractC4476h.mo27431o0();
                        str5 = str12;
                        break;
                    case 0:
                        str8 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str8 == null) {
                            JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                            throw m10121v;
                        }
                        i2 &= -2;
                        str5 = str12;
                        break;
                    case 1:
                        l = (Long) this.f22725c.mo10144b(abstractC4476h);
                        if (l == null) {
                            JsonDataException m10121v2 = C9712b.m10121v("timeStamp", "timeStamp", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"timeStam…     \"timeStamp\", reader)");
                            throw m10121v2;
                        }
                        i2 &= -3;
                        str5 = str12;
                        break;
                    case 2:
                        shoppingListCategory = (ShoppingListCategory) this.f22726d.mo10144b(abstractC4476h);
                        if (shoppingListCategory == null) {
                            JsonDataException m10121v3 = C9712b.m10121v("category", "category", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"category\", \"category\", reader)");
                            throw m10121v3;
                        }
                        str5 = str12;
                        break;
                    case 3:
                        str9 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str9 == null) {
                            JsonDataException m10121v4 = C9712b.m10121v("name", "name", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"name\", \"name\", reader)");
                            throw m10121v4;
                        }
                        i2 &= -9;
                        str5 = str12;
                        break;
                    case 4:
                        num = (Integer) this.f22727e.mo10144b(abstractC4476h);
                        if (num == null) {
                            JsonDataException m10121v5 = C9712b.m10121v("quantity", "quantity", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"quantity…      \"quantity\", reader)");
                            throw m10121v5;
                        }
                        i2 &= -17;
                        str5 = str12;
                        break;
                    case 5:
                        bool2 = (Boolean) this.f22728f.mo10144b(abstractC4476h);
                        if (bool2 == null) {
                            JsonDataException m10121v6 = C9712b.m10121v("checked", "checked", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"checked\"…       \"checked\", reader)");
                            throw m10121v6;
                        }
                        i2 &= -33;
                        str5 = str12;
                        break;
                    case 6:
                        str7 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str7 == null) {
                            JsonDataException m10121v7 = C9712b.m10121v("unitLabel", "unitLabel", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"unitLabe…     \"unitLabel\", reader)");
                            throw m10121v7;
                        }
                        i2 &= -65;
                        str5 = str12;
                        break;
                    case 7:
                        str4 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str4 == null) {
                            JsonDataException m10121v8 = C9712b.m10121v("badgeUrl", "badgeUrl", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"badgeUrl…      \"badgeUrl\", reader)");
                            throw m10121v8;
                        }
                        i2 &= -129;
                        str5 = str12;
                        break;
                    case 8:
                        str2 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str2 == null) {
                            JsonDataException m10121v9 = C9712b.m10121v("badgeDisclaimer", "badgeDisclaimer", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"badgeDis…badgeDisclaimer\", reader)");
                            throw m10121v9;
                        }
                        i2 &= -257;
                        str5 = str12;
                        break;
                    case 9:
                        str = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str == null) {
                            JsonDataException m10121v10 = C9712b.m10121v("badgeDisclaimerTitle", "badgeDisclaimerTitle", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"badgeDis…DisclaimerTitle\", reader)");
                            throw m10121v10;
                        }
                        i2 &= -513;
                        str5 = str12;
                        break;
                    case 10:
                        bool3 = (Boolean) this.f22728f.mo10144b(abstractC4476h);
                        if (bool3 == null) {
                            JsonDataException m10121v11 = C9712b.m10121v("showBadgeDisclaimer", "showBadgeDisclaimer", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"showBadg…BadgeDisclaimer\", reader)");
                            throw m10121v11;
                        }
                        i2 &= -1025;
                        str5 = str12;
                        break;
                    case 11:
                        str6 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str6 == null) {
                            JsonDataException m10121v12 = C9712b.m10121v("badgeCode", "promotionCode", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"badgeCod… \"promotionCode\", reader)");
                            throw m10121v12;
                        }
                        i2 &= -2049;
                        str5 = str12;
                        break;
                    case 12:
                        str5 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str5 == null) {
                            JsonDataException m10121v13 = C9712b.m10121v("priceLabel", "priceLabel", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"priceLab…    \"priceLabel\", reader)");
                            throw m10121v13;
                        }
                        i2 &= -4097;
                        break;
                    case 13:
                        str3 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str3 == null) {
                            JsonDataException m10121v14 = C9712b.m10121v("unitPriceLabel", "unitPriceLabel", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v14, "unexpectedNull(\"unitPric…\"unitPriceLabel\", reader)");
                            throw m10121v14;
                        }
                        i2 &= -8193;
                        str5 = str12;
                        continue;
                    case 14:
                        str10 = (String) this.f22724b.mo10144b(abstractC4476h);
                        if (str10 == null) {
                            JsonDataException m10121v15 = C9712b.m10121v("dateUpdated", "dateUpdated", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v15, "unexpectedNull(\"dateUpda…   \"dateUpdated\", reader)");
                            throw m10121v15;
                        }
                        i2 &= -16385;
                        str5 = str12;
                        break;
                    case 15:
                        num3 = (Integer) this.f22727e.mo10144b(abstractC4476h);
                        if (num3 == null) {
                            JsonDataException m10121v16 = C9712b.m10121v("sortOrder", "sortOrder", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v16, "unexpectedNull(\"sortOrde…     \"sortOrder\", reader)");
                            throw m10121v16;
                        }
                        i = -32769;
                        i2 &= i;
                        str5 = str12;
                        break;
                    case 16:
                        num2 = (Integer) this.f22727e.mo10144b(abstractC4476h);
                        if (num2 == null) {
                            JsonDataException m10121v17 = C9712b.m10121v("manualOrder", "manualOrder", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v17, "unexpectedNull(\"manualOr…   \"manualOrder\", reader)");
                            throw m10121v17;
                        }
                        i = -65537;
                        i2 &= i;
                        str5 = str12;
                        break;
                    case 17:
                        bool4 = (Boolean) this.f22728f.mo10144b(abstractC4476h);
                        if (bool4 == null) {
                            JsonDataException m10121v18 = C9712b.m10121v("deleted", "deleted", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v18, "unexpectedNull(\"deleted\"…       \"deleted\", reader)");
                            throw m10121v18;
                        }
                        i = -131073;
                        i2 &= i;
                        str5 = str12;
                        break;
                    default:
                        str5 = str12;
                        break;
                }
                str3 = str11;
            } else {
                String str13 = str5;
                abstractC4476h.mo27433h();
                if (i2 == -262140) {
                    Objects.requireNonNull(str8, "null cannot be cast to non-null type kotlin.String");
                    long longValue = l.longValue();
                    if (shoppingListCategory != null) {
                        Objects.requireNonNull(str9, "null cannot be cast to non-null type kotlin.String");
                        int intValue = num.intValue();
                        boolean booleanValue = bool2.booleanValue();
                        Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                        boolean booleanValue2 = bool3.booleanValue();
                        Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str13, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str11, "null cannot be cast to non-null type kotlin.String");
                        String str14 = str10;
                        Objects.requireNonNull(str14, "null cannot be cast to non-null type kotlin.String");
                        return new ShoppingListProduct(str8, longValue, shoppingListCategory, str9, intValue, booleanValue, str7, str4, str2, str, booleanValue2, str6, str13, str11, str14, num3.intValue(), num2.intValue(), bool4.booleanValue());
                    }
                    JsonDataException m10129n = C9712b.m10129n("category", "category", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n, "missingProperty(\"category\", \"category\", reader)");
                    throw m10129n;
                }
                String str15 = str7;
                String str16 = str9;
                Constructor constructor = this.f22729g;
                if (constructor == null) {
                    Class cls = Integer.TYPE;
                    Class cls2 = Boolean.TYPE;
                    constructor = ShoppingListProduct.class.getDeclaredConstructor(String.class, Long.TYPE, ShoppingListCategory.class, String.class, cls, cls2, String.class, String.class, String.class, String.class, cls2, String.class, String.class, String.class, String.class, cls, cls, cls2, cls, C9712b.f25570c);
                    this.f22729g = constructor;
                    C13195u c13195u = C13195u.f34156a;
                    Intrinsics.checkIfNull(constructor, "ShoppingListProduct::cla…his.constructorRef = it }");
                }
                Object[] objArr = new Object[20];
                objArr[0] = str8;
                objArr[1] = l;
                if (shoppingListCategory == null) {
                    JsonDataException m10129n2 = C9712b.m10129n("category", "category", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n2, "missingProperty(\"category\", \"category\", reader)");
                    throw m10129n2;
                }
                objArr[2] = shoppingListCategory;
                objArr[3] = str16;
                objArr[4] = num;
                objArr[5] = bool2;
                objArr[6] = str15;
                objArr[7] = str4;
                objArr[8] = str2;
                objArr[9] = str;
                objArr[10] = bool3;
                objArr[11] = str6;
                objArr[12] = str13;
                objArr[13] = str11;
                objArr[14] = str10;
                objArr[15] = num3;
                objArr[16] = num2;
                objArr[17] = bool4;
                objArr[18] = Integer.valueOf(i2);
                objArr[19] = null;
                Object newInstance = constructor.newInstance(objArr);
                Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return (ShoppingListProduct) newInstance;
            }
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ShoppingListProduct shoppingListProduct) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(shoppingListProduct, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14331k());
        abstractC4483m.mo27417F("timeStamp");
        this.f22725c.mo10143i(abstractC4483m, Long.valueOf(shoppingListProduct.m14324w()));
        abstractC4483m.mo27417F("category");
        this.f22726d.mo10143i(abstractC4483m, shoppingListProduct.m14335f());
        abstractC4483m.mo27417F("name");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14329n());
        abstractC4483m.mo27417F("quantity");
        this.f22727e.mo10143i(abstractC4483m, Integer.valueOf(shoppingListProduct.m14327s()));
        abstractC4483m.mo27417F("checked");
        this.f22728f.mo10143i(abstractC4483m, Boolean.valueOf(shoppingListProduct.m14334h()));
        abstractC4483m.mo27417F("unitLabel");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14323y());
        abstractC4483m.mo27417F("badgeUrl");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14336e());
        abstractC4483m.mo27417F("badgeDisclaimer");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14338c());
        abstractC4483m.mo27417F("badgeDisclaimerTitle");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14337d());
        abstractC4483m.mo27417F("showBadgeDisclaimer");
        this.f22728f.mo10143i(abstractC4483m, Boolean.valueOf(shoppingListProduct.m14326t()));
        abstractC4483m.mo27417F("promotionCode");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14339b());
        abstractC4483m.mo27417F("priceLabel");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14328r());
        abstractC4483m.mo27417F("unitPriceLabel");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14322z());
        abstractC4483m.mo27417F("dateUpdated");
        this.f22724b.mo10143i(abstractC4483m, shoppingListProduct.m14333i());
        abstractC4483m.mo27417F("sortOrder");
        this.f22727e.mo10143i(abstractC4483m, Integer.valueOf(shoppingListProduct.m14325v()));
        abstractC4483m.mo27417F("manualOrder");
        this.f22727e.mo10143i(abstractC4483m, Integer.valueOf(shoppingListProduct.m14330m()));
        abstractC4483m.mo27417F("deleted");
        this.f22728f.mo10143i(abstractC4483m, Boolean.valueOf(shoppingListProduct.m14332j()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ShoppingListProduct");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
