package pt.pingodoce.app.data.remote.models.response;

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
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* compiled from: LoyaltyCardJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class LoyaltyCardJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23186a;

    /* renamed from: b */
    private final AbstractC4470f f23187b;

    /* renamed from: c */
    private final AbstractC4470f f23188c;

    /* renamed from: d */
    private final AbstractC4470f f23189d;

    /* renamed from: e */
    private final AbstractC4470f f23190e;

    /* renamed from: f */
    private final AbstractC4470f f23191f;

    /* renamed from: g */
    private final AbstractC4470f f23192g;

    /* renamed from: h */
    private final AbstractC4470f f23193h;

    /* renamed from: i */
    private final AbstractC4470f f23194i;

    /* renamed from: j */
    private final AbstractC4470f f23195j;

    /* renamed from: k */
    private final AbstractC4470f f23196k;

    /* renamed from: l */
    private volatile Constructor f23197l;

    public LoyaltyCardJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Set<? extends Annotation> m208b6;
        Set<? extends Annotation> m208b7;
        Set<? extends Annotation> m208b8;
        Set<? extends Annotation> m208b9;
        Set<? extends Annotation> m208b10;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("cardNumber", "isDefault", "isOwner", "status", "statusPayload", "hasRequests", "benefits", "activeBenefits", "benefitsToBeExpired", "benefitsBalance", "benefitsToBeExpiredColors", "fuelBenefitsToBeExpiredColors", "fuelBenefits", "fuelBenefitsToBeExpired", "fuelBenefitsPts", "totalSaved", "dateCreated", "dateUpdated", "cardType", "poupaMaisStatus", "pendingPoupaMaisNumber");
        Intrinsics.checkIfNull(m27461a, "of(\"cardNumber\", \"isDefa…\"pendingPoupaMaisNumber\")");
        this.f23186a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "typeCardNumber");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…,\n      \"typeCardNumber\")");
        this.f23187b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "isDefault");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…Set(),\n      \"isDefault\")");
        this.f23188c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(CardStatusPayload.class, m208b3, "statusPayload");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(CardStatus…tySet(), \"statusPayload\")");
        this.f23189d = m27366f3;
        ParameterizedType m27327j = C4516s.m27327j(List.class, Benefit.class);
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(m27327j, m208b4, "benefitList");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Types.newP…t(),\n      \"benefitList\")");
        this.f23190e = m27366f4;
        Class cls2 = Integer.TYPE;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(cls2, m208b5, "activeBenefits");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(Int::class…,\n      \"activeBenefits\")");
        this.f23191f = m27366f5;
        Class cls3 = Float.TYPE;
        m208b6 = C13778q0.m208b();
        AbstractC4470f m27366f6 = c4496p.m27366f(cls3, m208b6, "benefitsBalance");
        Intrinsics.checkIfNull(m27366f6, "moshi.adapter(Float::cla…\n      \"benefitsBalance\")");
        this.f23192g = m27366f6;
        m208b7 = C13778q0.m208b();
        AbstractC4470f m27366f7 = c4496p.m27366f(BenefitsExpirationColors.class, m208b7, "benefitsToBeExpiredColors");
        Intrinsics.checkIfNull(m27366f7, "moshi.adapter(BenefitsEx…nefitsToBeExpiredColors\")");
        this.f23193h = m27366f7;
        m208b8 = C13778q0.m208b();
        AbstractC4470f m27366f8 = c4496p.m27366f(LoyaltyCard.Type.class, m208b8, "cardType");
        Intrinsics.checkIfNull(m27366f8, "moshi.adapter(LoyaltyCar…, emptySet(), \"cardType\")");
        this.f23194i = m27366f8;
        m208b9 = C13778q0.m208b();
        AbstractC4470f m27366f9 = c4496p.m27366f(LoyaltyCard.PoupaMaisStatus.class, m208b9, "poupaMaisStatus");
        Intrinsics.checkIfNull(m27366f9, "moshi.adapter(LoyaltyCar…Set(), \"poupaMaisStatus\")");
        this.f23195j = m27366f9;
        m208b10 = C13778q0.m208b();
        AbstractC4470f m27366f10 = c4496p.m27366f(String.class, m208b10, "pendingPoupaMaisNumber");
        Intrinsics.checkIfNull(m27366f10, "moshi.adapter(String::cl…\"pendingPoupaMaisNumber\")");
        this.f23196k = m27366f10;
    }

    /* renamed from: k */
    public LoyaltyCard mo10144b(AbstractC4476h abstractC4476h) {
        int i;
        int i2;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        Float valueOf = Float.valueOf(0.0f);
        abstractC4476h.mo27437c();
        Integer num = 0;
        Float f = valueOf;
        Float f2 = f;
        Float f3 = f2;
        int i3 = -1;
        BenefitsExpirationColors benefitsExpirationColors = null;
        String str = null;
        List list = null;
        String str2 = null;
        BenefitsExpirationColors benefitsExpirationColors2 = null;
        String str3 = null;
        String str4 = null;
        CardStatusPayload cardStatusPayload = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        LoyaltyCard.Type type = null;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = null;
        Boolean bool2 = bool;
        Integer num2 = null;
        Boolean bool3 = bool2;
        while (abstractC4476h.mo27427y()) {
            String str8 = str2;
            switch (abstractC4476h.mo27436d0(this.f23186a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str4 = (String) this.f23187b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v = C9712b.m10121v("typeCardNumber", "cardNumber", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"typeCard…r\", \"cardNumber\", reader)");
                        throw m10121v;
                    }
                    i3 &= -2;
                    break;
                case 1:
                    bool = (Boolean) this.f23188c.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("isDefault", "isDefault", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"isDefaul…     \"isDefault\", reader)");
                        throw m10121v2;
                    }
                    i3 &= -3;
                    break;
                case 2:
                    bool3 = (Boolean) this.f23188c.mo10144b(abstractC4476h);
                    if (bool3 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("isOwner", "isOwner", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"isOwner\"…       \"isOwner\", reader)");
                        throw m10121v3;
                    }
                    i3 &= -5;
                    break;
                case 3:
                    str3 = (String) this.f23187b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("status", "status", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"status\",…s\",\n              reader)");
                        throw m10121v4;
                    }
                    i3 &= -9;
                    break;
                case 4:
                    cardStatusPayload = (CardStatusPayload) this.f23189d.mo10144b(abstractC4476h);
                    i3 &= -17;
                    break;
                case 5:
                    bool2 = (Boolean) this.f23188c.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("hasRequests", "hasRequests", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"hasReque…   \"hasRequests\", reader)");
                        throw m10121v5;
                    }
                    i3 &= -33;
                    break;
                case 6:
                    list = (List) this.f23190e.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("benefitList", "benefits", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"benefitList\", \"benefits\", reader)");
                        throw m10121v6;
                    }
                    i3 &= -65;
                    break;
                case 7:
                    num2 = (Integer) this.f23191f.mo10144b(abstractC4476h);
                    if (num2 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("activeBenefits", "activeBenefits", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"activeBe…\"activeBenefits\", reader)");
                        throw m10121v7;
                    }
                    i3 &= -129;
                    break;
                case 8:
                    str = (String) this.f23187b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("benefitsToBeExpired", "benefitsToBeExpired", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"benefits…fitsToBeExpired\", reader)");
                        throw m10121v8;
                    }
                    i3 &= -257;
                    break;
                case 9:
                    f = (Float) this.f23192g.mo10144b(abstractC4476h);
                    if (f == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("benefitsBalance", "benefitsBalance", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"benefits…benefitsBalance\", reader)");
                        throw m10121v9;
                    }
                    i3 &= -513;
                    break;
                case 10:
                    benefitsExpirationColors = (BenefitsExpirationColors) this.f23193h.mo10144b(abstractC4476h);
                    if (benefitsExpirationColors == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("benefitsToBeExpiredColors", "benefitsToBeExpiredColors", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"benefits…s\",\n              reader)");
                        throw m10121v10;
                    }
                    i3 &= -1025;
                    break;
                case 11:
                    benefitsExpirationColors2 = (BenefitsExpirationColors) this.f23193h.mo10144b(abstractC4476h);
                    if (benefitsExpirationColors2 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("fuelBenefitsToBeExpiredColors", "fuelBenefitsToBeExpiredColors", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"fuelBene…BeExpiredColors\", reader)");
                        throw m10121v11;
                    }
                    i3 &= -2049;
                    break;
                case 12:
                    f2 = (Float) this.f23192g.mo10144b(abstractC4476h);
                    if (f2 == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("fuelBenefits", "fuelBenefits", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"fuelBene…  \"fuelBenefits\", reader)");
                        throw m10121v12;
                    }
                    i3 &= -4097;
                    break;
                case 13:
                    str2 = (String) this.f23187b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v13 = C9712b.m10121v("fuelBenefitsToBeExpired", "fuelBenefitsToBeExpired", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"fuelBene…d\",\n              reader)");
                        throw m10121v13;
                    }
                    i3 &= -8193;
                    continue;
                case 14:
                    num = (Integer) this.f23191f.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v14 = C9712b.m10121v("fuelBenefitsPts", "fuelBenefitsPts", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v14, "unexpectedNull(\"fuelBene…fuelBenefitsPts\", reader)");
                        throw m10121v14;
                    }
                    i3 &= -16385;
                    break;
                case 15:
                    f3 = (Float) this.f23192g.mo10144b(abstractC4476h);
                    if (f3 == null) {
                        JsonDataException m10121v15 = C9712b.m10121v("totalSaved", "totalSaved", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v15, "unexpectedNull(\"totalSav…    \"totalSaved\", reader)");
                        throw m10121v15;
                    }
                    i2 = -32769;
                    i3 &= i2;
                    break;
                case 16:
                    str6 = (String) this.f23187b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v16 = C9712b.m10121v("dateCreated", "dateCreated", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v16, "unexpectedNull(\"dateCrea…   \"dateCreated\", reader)");
                        throw m10121v16;
                    }
                    i2 = -65537;
                    i3 &= i2;
                    break;
                case 17:
                    str7 = (String) this.f23187b.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v17 = C9712b.m10121v("dateUpdated", "dateUpdated", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v17, "unexpectedNull(\"dateUpda…   \"dateUpdated\", reader)");
                        throw m10121v17;
                    }
                    i2 = -131073;
                    i3 &= i2;
                    break;
                case 18:
                    type = (LoyaltyCard.Type) this.f23194i.mo10144b(abstractC4476h);
                    if (type == null) {
                        JsonDataException m10121v18 = C9712b.m10121v("cardType", "cardType", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v18, "unexpectedNull(\"cardType…      \"cardType\", reader)");
                        throw m10121v18;
                    }
                    i2 = -262145;
                    i3 &= i2;
                    break;
                case 19:
                    poupaMaisStatus = (LoyaltyCard.PoupaMaisStatus) this.f23195j.mo10144b(abstractC4476h);
                    if (poupaMaisStatus == null) {
                        JsonDataException m10121v19 = C9712b.m10121v("poupaMaisStatus", "poupaMaisStatus", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v19, "unexpectedNull(\"poupaMai…poupaMaisStatus\", reader)");
                        throw m10121v19;
                    }
                    i2 = -524289;
                    i3 &= i2;
                    break;
                case 20:
                    str5 = (String) this.f23196k.mo10144b(abstractC4476h);
                    i2 = -1048577;
                    i3 &= i2;
                    break;
            }
            str2 = str8;
        }
        String str9 = str2;
        abstractC4476h.mo27433h();
        if (i3 == -2097152) {
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool3.booleanValue();
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue3 = bool2.booleanValue();
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.remote.models.response.Benefit>");
            int intValue = num2.intValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            float floatValue = f.floatValue();
            Objects.requireNonNull(benefitsExpirationColors, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.BenefitsExpirationColors");
            Objects.requireNonNull(benefitsExpirationColors2, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.BenefitsExpirationColors");
            float floatValue2 = f2.floatValue();
            Objects.requireNonNull(str9, "null cannot be cast to non-null type kotlin.String");
            int intValue2 = num.intValue();
            float floatValue3 = f3.floatValue();
            String str10 = str6;
            Objects.requireNonNull(str10, "null cannot be cast to non-null type kotlin.String");
            String str11 = str7;
            Objects.requireNonNull(str11, "null cannot be cast to non-null type kotlin.String");
            LoyaltyCard.Type type2 = type;
            Objects.requireNonNull(type2, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.LoyaltyCard.Type");
            LoyaltyCard.PoupaMaisStatus poupaMaisStatus2 = poupaMaisStatus;
            Objects.requireNonNull(poupaMaisStatus2, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.LoyaltyCard.PoupaMaisStatus");
            return new LoyaltyCard(str4, booleanValue, booleanValue2, str3, cardStatusPayload, booleanValue3, list, intValue, str, floatValue, benefitsExpirationColors, benefitsExpirationColors2, floatValue2, str9, intValue2, floatValue3, str10, str11, type2, poupaMaisStatus2, str5);
        }
        String str12 = str3;
        Constructor constructor = this.f23197l;
        if (constructor == null) {
            i = i3;
            Class cls = Boolean.TYPE;
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            constructor = LoyaltyCard.class.getDeclaredConstructor(String.class, cls, cls, String.class, CardStatusPayload.class, cls, List.class, cls2, String.class, cls3, BenefitsExpirationColors.class, BenefitsExpirationColors.class, cls3, String.class, cls2, cls3, String.class, String.class, LoyaltyCard.Type.class, LoyaltyCard.PoupaMaisStatus.class, String.class, cls2, C9712b.f25570c);
            this.f23197l = constructor;
            C13195u c13195u = C13195u.f34156a;
            Intrinsics.checkIfNull(constructor, "LoyaltyCard::class.java.…his.constructorRef = it }");
        } else {
            i = i3;
        }
        Object newInstance = constructor.newInstance(str4, bool, bool3, str12, cardStatusPayload, bool2, list, num2, str, f, benefitsExpirationColors, benefitsExpirationColors2, f2, str9, num, f3, str6, str7, type, poupaMaisStatus, str5, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (LoyaltyCard) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, LoyaltyCard loyaltyCard) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(loyaltyCard, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("cardNumber");
        this.f23187b.mo10143i(abstractC4483m, loyaltyCard.m13819K());
        abstractC4483m.mo27417F("isDefault");
        this.f23188c.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCard.m13813Q()));
        abstractC4483m.mo27417F("isOwner");
        this.f23188c.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCard.m13812R()));
        abstractC4483m.mo27417F("status");
        this.f23187b.mo10143i(abstractC4483m, loyaltyCard.m13823G());
        abstractC4483m.mo27417F("statusPayload");
        this.f23189d.mo10143i(abstractC4483m, loyaltyCard.m13822H());
        abstractC4483m.mo27417F("hasRequests");
        this.f23188c.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCard.m13826D()));
        abstractC4483m.mo27417F("benefits");
        this.f23190e.mo10143i(abstractC4483m, loyaltyCard.m13804f());
        abstractC4483m.mo27417F("activeBenefits");
        this.f23191f.mo10143i(abstractC4483m, Integer.valueOf(loyaltyCard.m13805e()));
        abstractC4483m.mo27417F("benefitsToBeExpired");
        this.f23187b.mo10143i(abstractC4483m, loyaltyCard.m13801j());
        abstractC4483m.mo27417F("benefitsBalance");
        this.f23192g.mo10143i(abstractC4483m, Float.valueOf(loyaltyCard.m13803h()));
        abstractC4483m.mo27417F("benefitsToBeExpiredColors");
        this.f23193h.mo10143i(abstractC4483m, loyaltyCard.m13800k());
        abstractC4483m.mo27417F("fuelBenefitsToBeExpiredColors");
        this.f23193h.mo10143i(abstractC4483m, loyaltyCard.m13792y());
        abstractC4483m.mo27417F("fuelBenefits");
        this.f23192g.mo10143i(abstractC4483m, Float.valueOf(loyaltyCard.m13795t()));
        abstractC4483m.mo27417F("fuelBenefitsToBeExpired");
        this.f23187b.mo10143i(abstractC4483m, loyaltyCard.m13793w());
        abstractC4483m.mo27417F("fuelBenefitsPts");
        this.f23191f.mo10143i(abstractC4483m, Integer.valueOf(loyaltyCard.m13794v()));
        abstractC4483m.mo27417F("totalSaved");
        this.f23192g.mo10143i(abstractC4483m, Float.valueOf(loyaltyCard.m13821I()));
        abstractC4483m.mo27417F("dateCreated");
        this.f23187b.mo10143i(abstractC4483m, loyaltyCard.m13797r());
        abstractC4483m.mo27417F("dateUpdated");
        this.f23187b.mo10143i(abstractC4483m, loyaltyCard.m13796s());
        abstractC4483m.mo27417F("cardType");
        this.f23194i.mo10143i(abstractC4483m, loyaltyCard.m13798n());
        abstractC4483m.mo27417F("poupaMaisStatus");
        this.f23195j.mo10143i(abstractC4483m, loyaltyCard.m13824F());
        abstractC4483m.mo27417F("pendingPoupaMaisNumber");
        this.f23196k.mo10143i(abstractC4483m, loyaltyCard.m13825E());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LoyaltyCard");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
