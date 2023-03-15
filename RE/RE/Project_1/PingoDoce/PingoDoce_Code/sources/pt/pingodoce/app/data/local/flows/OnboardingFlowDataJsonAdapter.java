package pt.pingodoce.app.data.local.flows;

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
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.models.request.AppNotifications;
import pt.pingodoce.app.data.remote.models.response.Consent;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* compiled from: OnboardingFlowDataJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class OnboardingFlowDataJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22416a;

    /* renamed from: b */
    private final AbstractC4470f f22417b;

    /* renamed from: c */
    private final AbstractC4470f f22418c;

    /* renamed from: d */
    private final AbstractC4470f f22419d;

    /* renamed from: e */
    private final AbstractC4470f f22420e;

    /* renamed from: f */
    private final AbstractC4470f f22421f;

    /* renamed from: g */
    private final AbstractC4470f f22422g;

    /* renamed from: h */
    private final AbstractC4470f f22423h;

    /* renamed from: i */
    private final AbstractC4470f f22424i;

    /* renamed from: j */
    private final AbstractC4470f f22425j;

    /* renamed from: k */
    private volatile Constructor f22426k;

    public OnboardingFlowDataJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Set<? extends Annotation> m208b6;
        Set<? extends Annotation> m208b7;
        Set<? extends Annotation> m208b8;
        Set<? extends Annotation> m208b9;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("phoneNumber", "password", "maskedPhoneNumber", "firstName", "lastName", "smsCode", "nif", "email", "hasGuests", "delegateInvite", "isOwner", "onboardingType", "consents", "preferences", "selectedCard", "cards", "isUpgradeFromV2", "cardResumeRow", "poupaMaisStatus");
        Intrinsics.checkIfNull(m27461a, "of(\"phoneNumber\", \"passw…eRow\", \"poupaMaisStatus\")");
        this.f22416a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "phoneNumber");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…t(),\n      \"phoneNumber\")");
        this.f22417b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "hasGuests");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…Set(),\n      \"hasGuests\")");
        this.f22418c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(EnumC8682a.class, m208b3, "onboardingType");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Onboarding…ySet(), \"onboardingType\")");
        this.f22419d = m27366f3;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(Consent.class, m208b4, "consents");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Consent::c…  emptySet(), \"consents\")");
        this.f22420e = m27366f4;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(AppNotifications.class, m208b5, "preferences");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(AppNotific…mptySet(), \"preferences\")");
        this.f22421f = m27366f5;
        m208b6 = C13778q0.m208b();
        AbstractC4470f m27366f6 = c4496p.m27366f(LoyaltyCardProvisory.class, m208b6, "selectedCard");
        Intrinsics.checkIfNull(m27366f6, "moshi.adapter(LoyaltyCar…ptySet(), \"selectedCard\")");
        this.f22422g = m27366f6;
        ParameterizedType m27327j = C4516s.m27327j(List.class, LoyaltyCardProvisory.class);
        m208b7 = C13778q0.m208b();
        AbstractC4470f m27366f7 = c4496p.m27366f(m27327j, m208b7, "cards");
        Intrinsics.checkIfNull(m27366f7, "moshi.adapter(Types.newP…     emptySet(), \"cards\")");
        this.f22423h = m27366f7;
        m208b8 = C13778q0.m208b();
        AbstractC4470f m27366f8 = c4496p.m27366f(LoyaltyCardResumeViewModel.class, m208b8, "cardResumeRow");
        Intrinsics.checkIfNull(m27366f8, "moshi.adapter(Onboarding…tySet(), \"cardResumeRow\")");
        this.f22424i = m27366f8;
        m208b9 = C13778q0.m208b();
        AbstractC4470f m27366f9 = c4496p.m27366f(LoyaltyCard.PoupaMaisStatus.class, m208b9, "poupaMaisStatus");
        Intrinsics.checkIfNull(m27366f9, "moshi.adapter(LoyaltyCar…Set(), \"poupaMaisStatus\")");
        this.f22425j = m27366f9;
    }

    /* renamed from: k */
    public OnboardingFlowData mo10144b(AbstractC4476h abstractC4476h) {
        int i;
        int i2;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        int i3 = -1;
        EnumC8682a enumC8682a = null;
        String str = null;
        LoyaltyCardProvisory loyaltyCardProvisory = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Consent consent = null;
        AppNotifications appNotifications = null;
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel = null;
        List list = null;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = null;
        Boolean bool4 = bool3;
        while (abstractC4476h.mo27427y()) {
            LoyaltyCardProvisory loyaltyCardProvisory2 = loyaltyCardProvisory;
            switch (abstractC4476h.mo27436d0(this.f22416a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str3 = (String) this.f22417b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v = C9712b.m10121v("phoneNumber", "phoneNumber", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"phoneNum…   \"phoneNumber\", reader)");
                        throw m10121v;
                    }
                    i3 &= -2;
                    break;
                case 1:
                    str4 = (String) this.f22417b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("password", "password", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"password…      \"password\", reader)");
                        throw m10121v2;
                    }
                    i3 &= -3;
                    break;
                case 2:
                    str5 = (String) this.f22417b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("maskedPhoneNumber", "maskedPhoneNumber", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"maskedPh…skedPhoneNumber\", reader)");
                        throw m10121v3;
                    }
                    i3 &= -5;
                    break;
                case 3:
                    str6 = (String) this.f22417b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("firstName", "firstName", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"firstNam…     \"firstName\", reader)");
                        throw m10121v4;
                    }
                    i3 &= -9;
                    break;
                case 4:
                    str7 = (String) this.f22417b.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("lastName", "lastName", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"lastName…      \"lastName\", reader)");
                        throw m10121v5;
                    }
                    i3 &= -17;
                    break;
                case 5:
                    str8 = (String) this.f22417b.mo10144b(abstractC4476h);
                    if (str8 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("smsCode", "smsCode", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"smsCode\"…       \"smsCode\", reader)");
                        throw m10121v6;
                    }
                    i3 &= -33;
                    break;
                case 6:
                    str2 = (String) this.f22417b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("nif", "nif", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"nif\", \"nif\", reader)");
                        throw m10121v7;
                    }
                    i3 &= -65;
                    break;
                case 7:
                    str = (String) this.f22417b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("email", "email", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"email\", …l\",\n              reader)");
                        throw m10121v8;
                    }
                    i3 &= -129;
                    break;
                case 8:
                    bool = (Boolean) this.f22418c.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("hasGuests", "hasGuests", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"hasGuest…     \"hasGuests\", reader)");
                        throw m10121v9;
                    }
                    i3 &= -257;
                    break;
                case 9:
                    bool4 = (Boolean) this.f22418c.mo10144b(abstractC4476h);
                    if (bool4 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("delegateInvite", "delegateInvite", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"delegate…\"delegateInvite\", reader)");
                        throw m10121v10;
                    }
                    i3 &= -513;
                    break;
                case 10:
                    bool2 = (Boolean) this.f22418c.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("isOwner", "isOwner", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"isOwner\"…       \"isOwner\", reader)");
                        throw m10121v11;
                    }
                    i3 &= -1025;
                    break;
                case 11:
                    enumC8682a = (EnumC8682a) this.f22419d.mo10144b(abstractC4476h);
                    if (enumC8682a == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("onboardingType", "onboardingType", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"onboardi…\"onboardingType\", reader)");
                        throw m10121v12;
                    }
                    i3 &= -2049;
                    break;
                case 12:
                    consent = (Consent) this.f22420e.mo10144b(abstractC4476h);
                    i3 &= -4097;
                    break;
                case 13:
                    appNotifications = (AppNotifications) this.f22421f.mo10144b(abstractC4476h);
                    i3 &= -8193;
                    break;
                case 14:
                    loyaltyCardProvisory = (LoyaltyCardProvisory) this.f22422g.mo10144b(abstractC4476h);
                    if (loyaltyCardProvisory == null) {
                        JsonDataException m10121v13 = C9712b.m10121v("selectedCard", "selectedCard", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"selected…, \"selectedCard\", reader)");
                        throw m10121v13;
                    }
                    i3 &= -16385;
                    continue;
                case 15:
                    list = (List) this.f22423h.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v14 = C9712b.m10121v("cards", "cards", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v14, "unexpectedNull(\"cards\", \"cards\", reader)");
                        throw m10121v14;
                    }
                    i2 = -32769;
                    i3 &= i2;
                    break;
                case 16:
                    bool3 = (Boolean) this.f22418c.mo10144b(abstractC4476h);
                    if (bool3 == null) {
                        JsonDataException m10121v15 = C9712b.m10121v("isUpgradeFromV2", "isUpgradeFromV2", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v15, "unexpectedNull(\"isUpgrad…isUpgradeFromV2\", reader)");
                        throw m10121v15;
                    }
                    i2 = -65537;
                    i3 &= i2;
                    break;
                case 17:
                    loyaltyCardResumeViewModel = (LoyaltyCardResumeViewModel) this.f22424i.mo10144b(abstractC4476h);
                    i2 = -131073;
                    i3 &= i2;
                    break;
                case 18:
                    poupaMaisStatus = (LoyaltyCard.PoupaMaisStatus) this.f22425j.mo10144b(abstractC4476h);
                    if (poupaMaisStatus == null) {
                        JsonDataException m10121v16 = C9712b.m10121v("poupaMaisStatus", "poupaMaisStatus", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v16, "unexpectedNull(\"poupaMai…poupaMaisStatus\", reader)");
                        throw m10121v16;
                    }
                    i2 = -262145;
                    i3 &= i2;
                    break;
            }
            loyaltyCardProvisory = loyaltyCardProvisory2;
        }
        LoyaltyCardProvisory loyaltyCardProvisory3 = loyaltyCardProvisory;
        abstractC4476h.mo27433h();
        if (i3 == -524288) {
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str8, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool4.booleanValue();
            boolean booleanValue3 = bool2.booleanValue();
            Objects.requireNonNull(enumC8682a, "null cannot be cast to non-null type pt.pingodoce.app.data.local.flows.OnboardingType");
            Objects.requireNonNull(loyaltyCardProvisory3, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory");
            List list2 = list;
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory>");
            boolean booleanValue4 = bool3.booleanValue();
            LoyaltyCard.PoupaMaisStatus poupaMaisStatus2 = poupaMaisStatus;
            Objects.requireNonNull(poupaMaisStatus2, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.LoyaltyCard.PoupaMaisStatus");
            return new OnboardingFlowData(str3, str4, str5, str6, str7, str8, str2, str, booleanValue, booleanValue2, booleanValue3, enumC8682a, consent, appNotifications, loyaltyCardProvisory3, list2, booleanValue4, loyaltyCardResumeViewModel, poupaMaisStatus2);
        }
        String str9 = str2;
        Constructor constructor = this.f22426k;
        if (constructor == null) {
            i = i3;
            Class cls = Boolean.TYPE;
            constructor = OnboardingFlowData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, cls, EnumC8682a.class, Consent.class, AppNotifications.class, LoyaltyCardProvisory.class, List.class, cls, LoyaltyCardResumeViewModel.class, LoyaltyCard.PoupaMaisStatus.class, Integer.TYPE, C9712b.f25570c);
            this.f22426k = constructor;
            C13195u c13195u = C13195u.f34156a;
            Intrinsics.checkIfNull(constructor, "OnboardingFlowData::clas…his.constructorRef = it }");
        } else {
            i = i3;
        }
        Object newInstance = constructor.newInstance(str3, str4, str5, str6, str7, str8, str9, str, bool, bool4, bool2, enumC8682a, consent, appNotifications, loyaltyCardProvisory3, list, bool3, loyaltyCardResumeViewModel, poupaMaisStatus, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (OnboardingFlowData) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, OnboardingFlowData onboardingFlowData) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(onboardingFlowData, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("phoneNumber");
        this.f22417b.mo10143i(abstractC4483m, onboardingFlowData.m14723b());
        abstractC4483m.mo27417F("password");
        this.f22417b.mo10143i(abstractC4483m, onboardingFlowData.m14709w());
        abstractC4483m.mo27417F("maskedPhoneNumber");
        this.f22417b.mo10143i(abstractC4483m, onboardingFlowData.m14712s());
        abstractC4483m.mo27417F("firstName");
        this.f22417b.mo10143i(abstractC4483m, onboardingFlowData.m14715m());
        abstractC4483m.mo27417F("lastName");
        this.f22417b.mo10143i(abstractC4483m, onboardingFlowData.m14713r());
        abstractC4483m.mo27417F("smsCode");
        this.f22417b.mo10143i(abstractC4483m, onboardingFlowData.m14736D());
        abstractC4483m.mo27417F("nif");
        this.f22417b.mo10143i(abstractC4483m, onboardingFlowData.m14711t());
        abstractC4483m.mo27417F("email");
        this.f22417b.mo10143i(abstractC4483m, onboardingFlowData.m14716k());
        abstractC4483m.mo27417F("hasGuests");
        this.f22418c.mo10143i(abstractC4483m, Boolean.valueOf(onboardingFlowData.m14714n()));
        abstractC4483m.mo27417F("delegateInvite");
        this.f22418c.mo10143i(abstractC4483m, Boolean.valueOf(onboardingFlowData.m14717j()));
        abstractC4483m.mo27417F("isOwner");
        this.f22418c.mo10143i(abstractC4483m, Boolean.valueOf(onboardingFlowData.m14735E()));
        abstractC4483m.mo27417F("onboardingType");
        this.f22419d.mo10143i(abstractC4483m, onboardingFlowData.m14710v());
        abstractC4483m.mo27417F("consents");
        this.f22420e.mo10143i(abstractC4483m, onboardingFlowData.m14724a());
        abstractC4483m.mo27417F("preferences");
        this.f22421f.mo10143i(abstractC4483m, onboardingFlowData.m14707z());
        abstractC4483m.mo27417F("selectedCard");
        this.f22422g.mo10143i(abstractC4483m, onboardingFlowData.m14737A());
        abstractC4483m.mo27417F("cards");
        this.f22423h.mo10143i(abstractC4483m, onboardingFlowData.m14718i());
        abstractC4483m.mo27417F("isUpgradeFromV2");
        this.f22418c.mo10143i(abstractC4483m, Boolean.valueOf(onboardingFlowData.m14734F()));
        abstractC4483m.mo27417F("cardResumeRow");
        this.f22424i.mo10143i(abstractC4483m, onboardingFlowData.m14719h());
        abstractC4483m.mo27417F("poupaMaisStatus");
        this.f22425j.mo10143i(abstractC4483m, onboardingFlowData.m14708y());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OnboardingFlowData");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
