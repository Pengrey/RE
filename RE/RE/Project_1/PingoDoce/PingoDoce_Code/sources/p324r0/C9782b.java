package p324r0;

import java.util.HashMap;
import p181jd.Intrinsics;
import p468yc.C13191r;
import p489zc.C13769l0;

/* compiled from: AndroidAutofillType.android.kt */
/* renamed from: r0.b */
/* loaded from: classes.dex */
public final class C9782b {

    /* renamed from: a */
    private static final HashMap f25721a;

    static {
        HashMap m332g;
        m332g = C13769l0.m332g(C13191r.m1447a(EnumC9790j.EmailAddress, "emailAddress"), C13191r.m1447a(EnumC9790j.Username, "username"), C13191r.m1447a(EnumC9790j.Password, "password"), C13191r.m1447a(EnumC9790j.NewUsername, "newUsername"), C13191r.m1447a(EnumC9790j.NewPassword, "newPassword"), C13191r.m1447a(EnumC9790j.PostalAddress, "postalAddress"), C13191r.m1447a(EnumC9790j.PostalCode, "postalCode"), C13191r.m1447a(EnumC9790j.CreditCardNumber, "creditCardNumber"), C13191r.m1447a(EnumC9790j.CreditCardSecurityCode, "creditCardSecurityCode"), C13191r.m1447a(EnumC9790j.CreditCardExpirationDate, "creditCardExpirationDate"), C13191r.m1447a(EnumC9790j.CreditCardExpirationMonth, "creditCardExpirationMonth"), C13191r.m1447a(EnumC9790j.CreditCardExpirationYear, "creditCardExpirationYear"), C13191r.m1447a(EnumC9790j.CreditCardExpirationDay, "creditCardExpirationDay"), C13191r.m1447a(EnumC9790j.AddressCountry, "addressCountry"), C13191r.m1447a(EnumC9790j.AddressRegion, "addressRegion"), C13191r.m1447a(EnumC9790j.AddressLocality, "addressLocality"), C13191r.m1447a(EnumC9790j.AddressStreet, "streetAddress"), C13191r.m1447a(EnumC9790j.AddressAuxiliaryDetails, "extendedAddress"), C13191r.m1447a(EnumC9790j.PostalCodeExtended, "extendedPostalCode"), C13191r.m1447a(EnumC9790j.PersonFullName, "personName"), C13191r.m1447a(EnumC9790j.PersonFirstName, "personGivenName"), C13191r.m1447a(EnumC9790j.PersonLastName, "personFamilyName"), C13191r.m1447a(EnumC9790j.PersonMiddleName, "personMiddleName"), C13191r.m1447a(EnumC9790j.PersonMiddleInitial, "personMiddleInitial"), C13191r.m1447a(EnumC9790j.PersonNamePrefix, "personNamePrefix"), C13191r.m1447a(EnumC9790j.PersonNameSuffix, "personNameSuffix"), C13191r.m1447a(EnumC9790j.PhoneNumber, "phoneNumber"), C13191r.m1447a(EnumC9790j.PhoneNumberDevice, "phoneNumberDevice"), C13191r.m1447a(EnumC9790j.PhoneCountryCode, "phoneCountryCode"), C13191r.m1447a(EnumC9790j.PhoneNumberNational, "phoneNational"), C13191r.m1447a(EnumC9790j.Gender, "gender"), C13191r.m1447a(EnumC9790j.BirthDateFull, "birthDateFull"), C13191r.m1447a(EnumC9790j.BirthDateDay, "birthDateDay"), C13191r.m1447a(EnumC9790j.BirthDateMonth, "birthDateMonth"), C13191r.m1447a(EnumC9790j.BirthDateYear, "birthDateYear"), C13191r.m1447a(EnumC9790j.SmsOtpCode, "smsOTPCode"));
        f25721a = m332g;
    }

    /* renamed from: a */
    public static final String m9970a(EnumC9790j enumC9790j) {
        Intrinsics.isThisObjectNull(enumC9790j, "<this>");
        String str = (String) f25721a.get(enumC9790j);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}
