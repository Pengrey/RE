package pt.pingodoce.app.data.remote.models.request;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: OnboardingUserRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class OnboardingUserRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22911a;

    /* renamed from: b */
    private final AbstractC4470f f22912b;

    /* renamed from: c */
    private final AbstractC4470f f22913c;

    /* renamed from: d */
    private final AbstractC4470f f22914d;

    /* renamed from: e */
    private final AbstractC4470f f22915e;

    /* renamed from: f */
    private final AbstractC4470f f22916f;

    /* renamed from: g */
    private final AbstractC4470f f22917g;

    public OnboardingUserRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Set<? extends Annotation> m208b6;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("firstName", "lastName", "phoneNumber", "password", "code", "isOwner", "delegateInvite", "pmCard", "email", "nif", "consents", "preferences", "deviceTokenPayload");
        Intrinsics.checkIfNull(m27461a, "of(\"firstName\", \"lastNam…s\", \"deviceTokenPayload\")");
        this.f22911a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "firstName");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…Set(),\n      \"firstName\")");
        this.f22912b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "isOwner");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…tySet(),\n      \"isOwner\")");
        this.f22913c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(LoyaltyCardProvisory.class, m208b3, "loyaltyCard");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(LoyaltyCar…mptySet(), \"loyaltyCard\")");
        this.f22914d = m27366f3;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(Consent.class, m208b4, "consents");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Consent::c…  emptySet(), \"consents\")");
        this.f22915e = m27366f4;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(AppNotifications.class, m208b5, "preferences");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(AppNotific…mptySet(), \"preferences\")");
        this.f22916f = m27366f5;
        m208b6 = C13778q0.m208b();
        AbstractC4470f m27366f6 = c4496p.m27366f(DeviceTokenRequest.class, m208b6, "deviceTokenPayload");
        Intrinsics.checkIfNull(m27366f6, "moshi.adapter(DeviceToke…(), \"deviceTokenPayload\")");
        this.f22917g = m27366f6;
    }

    /* renamed from: k */
    public OnboardingUserRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        LoyaltyCardProvisory loyaltyCardProvisory = null;
        String str6 = null;
        String str7 = null;
        Consent consent = null;
        AppNotifications appNotifications = null;
        DeviceTokenRequest deviceTokenRequest = null;
        while (true) {
            Consent consent2 = consent;
            LoyaltyCardProvisory loyaltyCardProvisory2 = loyaltyCardProvisory;
            AppNotifications appNotifications2 = appNotifications;
            String str8 = str7;
            String str9 = str6;
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            String str10 = str5;
            String str11 = str4;
            String str12 = str3;
            if (abstractC4476h.mo27427y()) {
                switch (abstractC4476h.mo27436d0(this.f22911a)) {
                    case -1:
                        abstractC4476h.mo27432l0();
                        abstractC4476h.mo27431o0();
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 0:
                        str = (String) this.f22912b.mo10144b(abstractC4476h);
                        if (str == null) {
                            JsonDataException m10121v = C9712b.m10121v("firstName", "firstName", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"firstNam…     \"firstName\", reader)");
                            throw m10121v;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 1:
                        str2 = (String) this.f22912b.mo10144b(abstractC4476h);
                        if (str2 == null) {
                            JsonDataException m10121v2 = C9712b.m10121v("lastName", "lastName", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"lastName…      \"lastName\", reader)");
                            throw m10121v2;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 2:
                        str3 = (String) this.f22912b.mo10144b(abstractC4476h);
                        if (str3 == null) {
                            JsonDataException m10121v3 = C9712b.m10121v("phoneNumber", "phoneNumber", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"phoneNum…\", \"phoneNumber\", reader)");
                            throw m10121v3;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        continue;
                    case 3:
                        str4 = (String) this.f22912b.mo10144b(abstractC4476h);
                        if (str4 == null) {
                            JsonDataException m10121v4 = C9712b.m10121v("password", "password", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"password…      \"password\", reader)");
                            throw m10121v4;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        break;
                    case 4:
                        str5 = (String) this.f22912b.mo10144b(abstractC4476h);
                        if (str5 == null) {
                            JsonDataException m10121v5 = C9712b.m10121v("code", "code", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"code\", \"code\",\n            reader)");
                            throw m10121v5;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str4 = str11;
                        break;
                    case 5:
                        bool = (Boolean) this.f22913c.mo10144b(abstractC4476h);
                        if (bool == null) {
                            JsonDataException m10121v6 = C9712b.m10121v("isOwner", "isOwner", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"isOwner\"…       \"isOwner\", reader)");
                            throw m10121v6;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 6:
                        bool2 = (Boolean) this.f22913c.mo10144b(abstractC4476h);
                        if (bool2 == null) {
                            JsonDataException m10121v7 = C9712b.m10121v("delegateInvite", "delegateInvite", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"delegate…\"delegateInvite\", reader)");
                            throw m10121v7;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 7:
                        loyaltyCardProvisory = (LoyaltyCardProvisory) this.f22914d.mo10144b(abstractC4476h);
                        consent = consent2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 8:
                        str6 = (String) this.f22912b.mo10144b(abstractC4476h);
                        if (str6 == null) {
                            JsonDataException m10121v8 = C9712b.m10121v("email", "email", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"email\", …ail\",\n            reader)");
                            throw m10121v8;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 9:
                        str7 = (String) this.f22912b.mo10144b(abstractC4476h);
                        if (str7 == null) {
                            JsonDataException m10121v9 = C9712b.m10121v("nif", "nif", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"nif\", \"nif\", reader)");
                            throw m10121v9;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 10:
                        consent = (Consent) this.f22915e.mo10144b(abstractC4476h);
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 11:
                        appNotifications = (AppNotifications) this.f22916f.mo10144b(abstractC4476h);
                        if (appNotifications == null) {
                            JsonDataException m10121v10 = C9712b.m10121v("preferences", "preferences", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"preferen…\", \"preferences\", reader)");
                            throw m10121v10;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    case 12:
                        deviceTokenRequest = (DeviceTokenRequest) this.f22917g.mo10144b(abstractC4476h);
                        if (deviceTokenRequest == null) {
                            JsonDataException m10121v11 = C9712b.m10121v("deviceTokenPayload", "deviceTokenPayload", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"deviceTo…iceTokenPayload\", reader)");
                            throw m10121v11;
                        }
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                    default:
                        consent = consent2;
                        loyaltyCardProvisory = loyaltyCardProvisory2;
                        appNotifications = appNotifications2;
                        str7 = str8;
                        str6 = str9;
                        bool2 = bool3;
                        bool = bool4;
                        str5 = str10;
                        str4 = str11;
                        break;
                }
                str3 = str12;
            } else {
                abstractC4476h.mo27433h();
                if (str == null) {
                    JsonDataException m10129n = C9712b.m10129n("firstName", "firstName", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n, "missingProperty(\"firstName\", \"firstName\", reader)");
                    throw m10129n;
                } else if (str2 == null) {
                    JsonDataException m10129n2 = C9712b.m10129n("lastName", "lastName", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n2, "missingProperty(\"lastName\", \"lastName\", reader)");
                    throw m10129n2;
                } else if (str12 == null) {
                    JsonDataException m10129n3 = C9712b.m10129n("phoneNumber", "phoneNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n3, "missingProperty(\"phoneNu…ber\",\n            reader)");
                    throw m10129n3;
                } else if (str11 == null) {
                    JsonDataException m10129n4 = C9712b.m10129n("password", "password", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n4, "missingProperty(\"password\", \"password\", reader)");
                    throw m10129n4;
                } else if (str10 == null) {
                    JsonDataException m10129n5 = C9712b.m10129n("code", "code", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n5, "missingProperty(\"code\", \"code\", reader)");
                    throw m10129n5;
                } else if (bool4 != null) {
                    boolean booleanValue = bool4.booleanValue();
                    if (bool3 != null) {
                        boolean booleanValue2 = bool3.booleanValue();
                        if (str9 == null) {
                            JsonDataException m10129n6 = C9712b.m10129n("email", "email", abstractC4476h);
                            Intrinsics.checkIfNull(m10129n6, "missingProperty(\"email\", \"email\", reader)");
                            throw m10129n6;
                        } else if (str8 == null) {
                            JsonDataException m10129n7 = C9712b.m10129n("nif", "nif", abstractC4476h);
                            Intrinsics.checkIfNull(m10129n7, "missingProperty(\"nif\", \"nif\", reader)");
                            throw m10129n7;
                        } else if (appNotifications2 == null) {
                            JsonDataException m10129n8 = C9712b.m10129n("preferences", "preferences", abstractC4476h);
                            Intrinsics.checkIfNull(m10129n8, "missingProperty(\"prefere…ces\",\n            reader)");
                            throw m10129n8;
                        } else if (deviceTokenRequest != null) {
                            return new OnboardingUserRequest(str, str2, str12, str11, str10, booleanValue, booleanValue2, loyaltyCardProvisory2, str9, str8, consent2, appNotifications2, deviceTokenRequest);
                        } else {
                            JsonDataException m10129n9 = C9712b.m10129n("deviceTokenPayload", "deviceTokenPayload", abstractC4476h);
                            Intrinsics.checkIfNull(m10129n9, "missingProperty(\"deviceT…iceTokenPayload\", reader)");
                            throw m10129n9;
                        }
                    }
                    JsonDataException m10129n10 = C9712b.m10129n("delegateInvite", "delegateInvite", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n10, "missingProperty(\"delegat…\"delegateInvite\", reader)");
                    throw m10129n10;
                } else {
                    JsonDataException m10129n11 = C9712b.m10129n("isOwner", "isOwner", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n11, "missingProperty(\"isOwner\", \"isOwner\", reader)");
                    throw m10129n11;
                }
            }
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, OnboardingUserRequest onboardingUserRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(onboardingUserRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("firstName");
        this.f22912b.mo10143i(abstractC4483m, onboardingUserRequest.m14105f());
        abstractC4483m.mo27417F("lastName");
        this.f22912b.mo10143i(abstractC4483m, onboardingUserRequest.m14104h());
        abstractC4483m.mo27417F("phoneNumber");
        this.f22912b.mo10143i(abstractC4483m, onboardingUserRequest.m14100m());
        abstractC4483m.mo27417F("password");
        this.f22912b.mo10143i(abstractC4483m, onboardingUserRequest.m14101k());
        abstractC4483m.mo27417F("code");
        this.f22912b.mo10143i(abstractC4483m, onboardingUserRequest.m14110a());
        abstractC4483m.mo27417F("isOwner");
        this.f22913c.mo10143i(abstractC4483m, Boolean.valueOf(onboardingUserRequest.m14098r()));
        abstractC4483m.mo27417F("delegateInvite");
        this.f22913c.mo10143i(abstractC4483m, Boolean.valueOf(onboardingUserRequest.m14108c()));
        abstractC4483m.mo27417F("pmCard");
        this.f22914d.mo10143i(abstractC4483m, onboardingUserRequest.m14103i());
        abstractC4483m.mo27417F("email");
        this.f22912b.mo10143i(abstractC4483m, onboardingUserRequest.m14106e());
        abstractC4483m.mo27417F("nif");
        this.f22912b.mo10143i(abstractC4483m, onboardingUserRequest.m14102j());
        abstractC4483m.mo27417F("consents");
        this.f22915e.mo10143i(abstractC4483m, onboardingUserRequest.m14109b());
        abstractC4483m.mo27417F("preferences");
        this.f22916f.mo10143i(abstractC4483m, onboardingUserRequest.m14099n());
        abstractC4483m.mo27417F("deviceTokenPayload");
        this.f22917g.mo10143i(abstractC4483m, onboardingUserRequest.m14107d());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OnboardingUserRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
