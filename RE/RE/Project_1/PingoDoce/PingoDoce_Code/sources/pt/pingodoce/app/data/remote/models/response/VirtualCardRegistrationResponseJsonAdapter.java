package pt.pingodoce.app.data.remote.models.response;

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
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* compiled from: VirtualCardRegistrationResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class VirtualCardRegistrationResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23305a;

    /* renamed from: b */
    private final AbstractC4470f f23306b;

    /* renamed from: c */
    private final AbstractC4470f f23307c;

    /* renamed from: d */
    private final AbstractC4470f f23308d;

    /* renamed from: e */
    private final AbstractC4470f f23309e;

    /* renamed from: f */
    private final AbstractC4470f f23310f;

    /* renamed from: g */
    private final AbstractC4470f f23311g;

    /* renamed from: h */
    private volatile Constructor f23312h;

    public VirtualCardRegistrationResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Set<? extends Annotation> m208b6;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("cardNumber", "cardType", "status", "fuelBenefits", "benefitsBalance", "fuelBenefitsPts", "totalSaved", "poupaMaisStatus", "statusPayload");
        Intrinsics.checkIfNull(m27461a, "of(\"cardNumber\", \"cardTy…Status\", \"statusPayload\")");
        this.f23305a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "cardNumber");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…et(),\n      \"cardNumber\")");
        this.f23306b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(LoyaltyCard.Type.class, m208b2, "cardType");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(LoyaltyCar…, emptySet(), \"cardType\")");
        this.f23307c = m27366f2;
        Class cls = Float.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls, m208b3, "fuelBenefits");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Float::cla…(),\n      \"fuelBenefits\")");
        this.f23308d = m27366f3;
        Class cls2 = Integer.TYPE;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(cls2, m208b4, "fuelBenefitsPts");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Int::class…\n      \"fuelBenefitsPts\")");
        this.f23309e = m27366f4;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(LoyaltyCard.PoupaMaisStatus.class, m208b5, "poupaMaisStatus");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(LoyaltyCar…Set(), \"poupaMaisStatus\")");
        this.f23310f = m27366f5;
        m208b6 = C13778q0.m208b();
        AbstractC4470f m27366f6 = c4496p.m27366f(CardStatusPayload.class, m208b6, "statusPayload");
        Intrinsics.checkIfNull(m27366f6, "moshi.adapter(CardStatus…tySet(), \"statusPayload\")");
        this.f23311g = m27366f6;
    }

    /* renamed from: k */
    public VirtualCardRegistrationResponse mo10144b(AbstractC4476h abstractC4476h) {
        String str;
        Class<String> cls = String.class;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        Float f = null;
        String str2 = null;
        LoyaltyCard.Type type = null;
        String str3 = null;
        Float f2 = null;
        Integer num = null;
        Float f3 = null;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = null;
        CardStatusPayload cardStatusPayload = null;
        while (true) {
            Class<String> cls2 = cls;
            CardStatusPayload cardStatusPayload2 = cardStatusPayload;
            LoyaltyCard.PoupaMaisStatus poupaMaisStatus2 = poupaMaisStatus;
            Float f4 = f3;
            Integer num2 = num;
            Float f5 = f2;
            if (abstractC4476h.mo27427y()) {
                switch (abstractC4476h.mo27436d0(this.f23305a)) {
                    case -1:
                        abstractC4476h.mo27432l0();
                        abstractC4476h.mo27431o0();
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        num = num2;
                        break;
                    case 0:
                        str2 = (String) this.f23306b.mo10144b(abstractC4476h);
                        if (str2 == null) {
                            JsonDataException m10121v = C9712b.m10121v("cardNumber", "cardNumber", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"cardNumb…    \"cardNumber\", reader)");
                            throw m10121v;
                        }
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        num = num2;
                        break;
                    case 1:
                        type = (LoyaltyCard.Type) this.f23307c.mo10144b(abstractC4476h);
                        if (type == null) {
                            JsonDataException m10121v2 = C9712b.m10121v("cardType", "cardType", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"cardType…      \"cardType\", reader)");
                            throw m10121v2;
                        }
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        num = num2;
                        break;
                    case 2:
                        str3 = (String) this.f23306b.mo10144b(abstractC4476h);
                        if (str3 == null) {
                            JsonDataException m10121v3 = C9712b.m10121v("status", "status", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"status\",…        \"status\", reader)");
                            throw m10121v3;
                        }
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        num = num2;
                        break;
                    case 3:
                        f = (Float) this.f23308d.mo10144b(abstractC4476h);
                        if (f == null) {
                            JsonDataException m10121v4 = C9712b.m10121v("fuelBenefits", "fuelBenefits", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"fuelBene…, \"fuelBenefits\", reader)");
                            throw m10121v4;
                        }
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        num = num2;
                        break;
                    case 4:
                        f2 = (Float) this.f23308d.mo10144b(abstractC4476h);
                        if (f2 == null) {
                            JsonDataException m10121v5 = C9712b.m10121v("benefitsBalance", "benefitsBalance", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"benefits…benefitsBalance\", reader)");
                            throw m10121v5;
                        }
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        num = num2;
                        continue;
                    case 5:
                        num = (Integer) this.f23309e.mo10144b(abstractC4476h);
                        if (num == null) {
                            JsonDataException m10121v6 = C9712b.m10121v("fuelBenefitsPts", "fuelBenefitsPts", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"fuelBene…fuelBenefitsPts\", reader)");
                            throw m10121v6;
                        }
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        break;
                    case 6:
                        f3 = (Float) this.f23308d.mo10144b(abstractC4476h);
                        if (f3 == null) {
                            JsonDataException m10121v7 = C9712b.m10121v("totalSaved", "totalSaved", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"totalSav…    \"totalSaved\", reader)");
                            throw m10121v7;
                        }
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        num = num2;
                        break;
                    case 7:
                        poupaMaisStatus = (LoyaltyCard.PoupaMaisStatus) this.f23310f.mo10144b(abstractC4476h);
                        if (poupaMaisStatus == null) {
                            JsonDataException m10121v8 = C9712b.m10121v("poupaMaisStatus", "poupaMaisStatus", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"poupaMai…poupaMaisStatus\", reader)");
                            throw m10121v8;
                        }
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        f3 = f4;
                        num = num2;
                        break;
                    case 8:
                        cardStatusPayload = (CardStatusPayload) this.f23311g.mo10144b(abstractC4476h);
                        i &= -257;
                        cls = cls2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        num = num2;
                        break;
                    default:
                        cls = cls2;
                        cardStatusPayload = cardStatusPayload2;
                        poupaMaisStatus = poupaMaisStatus2;
                        f3 = f4;
                        num = num2;
                        break;
                }
                f2 = f5;
            } else {
                abstractC4476h.mo27433h();
                if (i == -257) {
                    if (str2 == null) {
                        JsonDataException m10129n = C9712b.m10129n("cardNumber", "cardNumber", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n, "missingProperty(\"cardNum…r\", \"cardNumber\", reader)");
                        throw m10129n;
                    } else if (type == null) {
                        JsonDataException m10129n2 = C9712b.m10129n("cardType", "cardType", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n2, "missingProperty(\"cardType\", \"cardType\", reader)");
                        throw m10129n2;
                    } else if (str3 == null) {
                        JsonDataException m10129n3 = C9712b.m10129n("status", "status", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n3, "missingProperty(\"status\", \"status\", reader)");
                        throw m10129n3;
                    } else if (f != null) {
                        float floatValue = f.floatValue();
                        if (f5 != null) {
                            float floatValue2 = f5.floatValue();
                            if (num2 != null) {
                                int intValue = num2.intValue();
                                if (f4 != null) {
                                    float floatValue3 = f4.floatValue();
                                    if (poupaMaisStatus2 != null) {
                                        return new VirtualCardRegistrationResponse(str2, type, str3, floatValue, floatValue2, intValue, floatValue3, poupaMaisStatus2, cardStatusPayload2);
                                    }
                                    JsonDataException m10129n4 = C9712b.m10129n("poupaMaisStatus", "poupaMaisStatus", abstractC4476h);
                                    Intrinsics.checkIfNull(m10129n4, "missingProperty(\"poupaMa…poupaMaisStatus\", reader)");
                                    throw m10129n4;
                                }
                                JsonDataException m10129n5 = C9712b.m10129n("totalSaved", "totalSaved", abstractC4476h);
                                Intrinsics.checkIfNull(m10129n5, "missingProperty(\"totalSa…d\", \"totalSaved\", reader)");
                                throw m10129n5;
                            }
                            JsonDataException m10129n6 = C9712b.m10129n("fuelBenefitsPts", "fuelBenefitsPts", abstractC4476h);
                            Intrinsics.checkIfNull(m10129n6, "missingProperty(\"fuelBen…fuelBenefitsPts\", reader)");
                            throw m10129n6;
                        }
                        JsonDataException m10129n7 = C9712b.m10129n("benefitsBalance", "benefitsBalance", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n7, "missingProperty(\"benefit…benefitsBalance\", reader)");
                        throw m10129n7;
                    } else {
                        JsonDataException m10129n8 = C9712b.m10129n("fuelBenefits", "fuelBenefits", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n8, "missingProperty(\"fuelBen…s\",\n              reader)");
                        throw m10129n8;
                    }
                }
                Constructor constructor = this.f23312h;
                if (constructor == null) {
                    str = "cardType";
                    Class cls3 = Float.TYPE;
                    Class cls4 = Integer.TYPE;
                    constructor = VirtualCardRegistrationResponse.class.getDeclaredConstructor(cls2, LoyaltyCard.Type.class, cls2, cls3, cls3, cls4, cls3, LoyaltyCard.PoupaMaisStatus.class, CardStatusPayload.class, cls4, C9712b.f25570c);
                    this.f23312h = constructor;
                    Intrinsics.checkIfNull(constructor, "VirtualCardRegistrationR…his.constructorRef = it }");
                } else {
                    str = "cardType";
                }
                Object[] objArr = new Object[11];
                if (str2 == null) {
                    JsonDataException m10129n9 = C9712b.m10129n("cardNumber", "cardNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n9, "missingProperty(\"cardNum…r\", \"cardNumber\", reader)");
                    throw m10129n9;
                }
                objArr[0] = str2;
                if (type == null) {
                    String str4 = str;
                    JsonDataException m10129n10 = C9712b.m10129n(str4, str4, abstractC4476h);
                    Intrinsics.checkIfNull(m10129n10, "missingProperty(\"cardType\", \"cardType\", reader)");
                    throw m10129n10;
                }
                objArr[1] = type;
                if (str3 == null) {
                    JsonDataException m10129n11 = C9712b.m10129n("status", "status", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n11, "missingProperty(\"status\", \"status\", reader)");
                    throw m10129n11;
                }
                objArr[2] = str3;
                if (f != null) {
                    objArr[3] = Float.valueOf(f.floatValue());
                    if (f5 != null) {
                        objArr[4] = Float.valueOf(f5.floatValue());
                        if (num2 != null) {
                            objArr[5] = Integer.valueOf(num2.intValue());
                            if (f4 != null) {
                                objArr[6] = Float.valueOf(f4.floatValue());
                                if (poupaMaisStatus2 == null) {
                                    JsonDataException m10129n12 = C9712b.m10129n("poupaMaisStatus", "poupaMaisStatus", abstractC4476h);
                                    Intrinsics.checkIfNull(m10129n12, "missingProperty(\"poupaMa…s\",\n              reader)");
                                    throw m10129n12;
                                }
                                objArr[7] = poupaMaisStatus2;
                                objArr[8] = cardStatusPayload2;
                                objArr[9] = Integer.valueOf(i);
                                objArr[10] = null;
                                Object newInstance = constructor.newInstance(objArr);
                                Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                return (VirtualCardRegistrationResponse) newInstance;
                            }
                            JsonDataException m10129n13 = C9712b.m10129n("totalSaved", "totalSaved", abstractC4476h);
                            Intrinsics.checkIfNull(m10129n13, "missingProperty(\"totalSa…d\", \"totalSaved\", reader)");
                            throw m10129n13;
                        }
                        JsonDataException m10129n14 = C9712b.m10129n("fuelBenefitsPts", "fuelBenefitsPts", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n14, "missingProperty(\"fuelBen…s\",\n              reader)");
                        throw m10129n14;
                    }
                    JsonDataException m10129n15 = C9712b.m10129n("benefitsBalance", "benefitsBalance", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n15, "missingProperty(\"benefit…e\",\n              reader)");
                    throw m10129n15;
                }
                JsonDataException m10129n16 = C9712b.m10129n("fuelBenefits", "fuelBenefits", abstractC4476h);
                Intrinsics.checkIfNull(m10129n16, "missingProperty(\"fuelBen…, \"fuelBenefits\", reader)");
                throw m10129n16;
            }
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, VirtualCardRegistrationResponse virtualCardRegistrationResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(virtualCardRegistrationResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("cardNumber");
        this.f23306b.mo10143i(abstractC4483m, virtualCardRegistrationResponse.m13660b());
        abstractC4483m.mo27417F("cardType");
        this.f23307c.mo10143i(abstractC4483m, virtualCardRegistrationResponse.m13659c());
        abstractC4483m.mo27417F("status");
        this.f23306b.mo10143i(abstractC4483m, virtualCardRegistrationResponse.m13655h());
        abstractC4483m.mo27417F("fuelBenefits");
        this.f23308d.mo10143i(abstractC4483m, Float.valueOf(virtualCardRegistrationResponse.m13658d()));
        abstractC4483m.mo27417F("benefitsBalance");
        this.f23308d.mo10143i(abstractC4483m, Float.valueOf(virtualCardRegistrationResponse.m13661a()));
        abstractC4483m.mo27417F("fuelBenefitsPts");
        this.f23309e.mo10143i(abstractC4483m, Integer.valueOf(virtualCardRegistrationResponse.m13657e()));
        abstractC4483m.mo27417F("totalSaved");
        this.f23308d.mo10143i(abstractC4483m, Float.valueOf(virtualCardRegistrationResponse.m13653j()));
        abstractC4483m.mo27417F("poupaMaisStatus");
        this.f23310f.mo10143i(abstractC4483m, virtualCardRegistrationResponse.m13656f());
        abstractC4483m.mo27417F("statusPayload");
        this.f23311g.mo10143i(abstractC4483m, virtualCardRegistrationResponse.m13654i());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VirtualCardRegistrationResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
