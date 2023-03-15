package module.network.data.remote.models.user;

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

/* compiled from: UserJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class UserJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f19994a;

    /* renamed from: b */
    private final AbstractC4470f f19995b;

    /* renamed from: c */
    private final AbstractC4470f f19996c;

    /* renamed from: d */
    private final AbstractC4470f f19997d;

    /* renamed from: e */
    private volatile Constructor f19998e;

    public UserJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("email", "emailValidated", "firstName", "lastName", "image", "imageUrl", "isActive", "phone", "phoneNumber", "userId", "nif", "loyaltyId", "ompdCard", "householdId", "birthDate", "customerStatus");
        Intrinsics.checkIfNull(m27461a, "of(\"email\", \"emailValida…hDate\", \"customerStatus\")");
        this.f19994a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "email");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…mptySet(),\n      \"email\")");
        this.f19995b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "isEmailValidated");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…      \"isEmailValidated\")");
        this.f19996c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(String.class, m208b3, "loyaltyId");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(String::cl… emptySet(), \"loyaltyId\")");
        this.f19997d = m27366f3;
    }

    /* renamed from: k */
    public User mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        Boolean bool2 = bool;
        while (abstractC4476h.mo27427y()) {
            String str15 = str;
            switch (abstractC4476h.mo27436d0(this.f19994a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str4 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v = C9712b.m10121v("email", "email", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"email\", …l\",\n              reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    bool = (Boolean) this.f19996c.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("isEmailValidated", "emailValidated", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"isEmailV…\"emailValidated\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str6 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("firstName", "firstName", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"firstNam…     \"firstName\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str7 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("lastName", "lastName", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"lastName…      \"lastName\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str8 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str8 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("image", "image", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"image\", …e\",\n              reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str9 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str9 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("pictureUrl", "imageUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"pictureU…      \"imageUrl\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    bool2 = (Boolean) this.f19996c.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("isActive", "isActive", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"isActive…      \"isActive\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    str11 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str11 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("phone", "phone", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"phone\", …e\",\n              reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    str10 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str10 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("phoneNumber", "phoneNumber", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"phoneNum…   \"phoneNumber\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
                case 9:
                    str5 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("userId", "userId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"userId\",…d\",\n              reader)");
                        throw m10121v10;
                    }
                    i &= -513;
                    break;
                case 10:
                    str3 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("nif", "nif", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"nif\", \"nif\", reader)");
                        throw m10121v11;
                    }
                    i &= -1025;
                    break;
                case 11:
                    str12 = (String) this.f19997d.mo10144b(abstractC4476h);
                    i &= -2049;
                    break;
                case 12:
                    str2 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("ompdId", "ompdCard", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"ompdId\",…d\",\n              reader)");
                        throw m10121v12;
                    }
                    i &= -4097;
                    break;
                case 13:
                    str13 = (String) this.f19997d.mo10144b(abstractC4476h);
                    i &= -8193;
                    break;
                case 14:
                    str = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v13 = C9712b.m10121v("birthDate", "birthDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"birthDat…     \"birthDate\", reader)");
                        throw m10121v13;
                    }
                    i &= -16385;
                    continue;
                case 15:
                    str14 = (String) this.f19995b.mo10144b(abstractC4476h);
                    if (str14 == null) {
                        JsonDataException m10121v14 = C9712b.m10121v("customerStatus", "customerStatus", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v14, "unexpectedNull(\"customer…\"customerStatus\", reader)");
                        throw m10121v14;
                    }
                    i &= -32769;
                    break;
            }
            str = str15;
        }
        String str16 = str;
        abstractC4476h.mo27433h();
        if (i == -65536) {
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str8, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str9, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue2 = bool2.booleanValue();
            Objects.requireNonNull(str11, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str10, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str16, "null cannot be cast to non-null type kotlin.String");
            String str17 = str14;
            Objects.requireNonNull(str17, "null cannot be cast to non-null type kotlin.String");
            return new User(str4, booleanValue, str6, str7, str8, str9, booleanValue2, str11, str10, str5, str3, str12, str2, str13, str16, str17);
        }
        String str18 = str3;
        String str19 = str5;
        String str20 = str10;
        Constructor constructor = this.f19998e;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = User.class.getDeclaredConstructor(String.class, cls, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f19998e = constructor;
            C13195u c13195u = C13195u.f34156a;
            Intrinsics.checkIfNull(constructor, "User::class.java.getDecl…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str4, bool, str6, str7, str8, str9, bool2, str11, str20, str19, str18, str12, str2, str13, str16, str14, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (User) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, User user) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(user, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("email");
        this.f19995b.mo10143i(abstractC4483m, user.m18186f());
        abstractC4483m.mo27417F("emailValidated");
        this.f19996c.mo10143i(abstractC4483m, Boolean.valueOf(user.m18196I()));
        abstractC4483m.mo27417F("firstName");
        this.f19995b.mo10143i(abstractC4483m, user.m18184i());
        abstractC4483m.mo27417F("lastName");
        this.f19995b.mo10143i(abstractC4483m, user.m18181m());
        abstractC4483m.mo27417F("image");
        this.f19995b.mo10143i(abstractC4483m, user.m18182k());
        abstractC4483m.mo27417F("imageUrl");
        this.f19995b.mo10143i(abstractC4483m, user.m18175w());
        abstractC4483m.mo27417F("isActive");
        this.f19996c.mo10143i(abstractC4483m, Boolean.valueOf(user.m18198G()));
        abstractC4483m.mo27417F("phone");
        this.f19995b.mo10143i(abstractC4483m, user.m18177t());
        abstractC4483m.mo27417F("phoneNumber");
        this.f19995b.mo10143i(abstractC4483m, user.m18176v());
        abstractC4483m.mo27417F("userId");
        this.f19995b.mo10143i(abstractC4483m, user.m18174y());
        abstractC4483m.mo27417F("nif");
        this.f19995b.mo10143i(abstractC4483m, user.m18179r());
        abstractC4483m.mo27417F("loyaltyId");
        this.f19997d.mo10143i(abstractC4483m, user.m18180n());
        abstractC4483m.mo27417F("ompdCard");
        this.f19995b.mo10143i(abstractC4483m, user.m18178s());
        abstractC4483m.mo27417F("householdId");
        this.f19997d.mo10143i(abstractC4483m, user.m18183j());
        abstractC4483m.mo27417F("birthDate");
        this.f19995b.mo10143i(abstractC4483m, user.m18188d());
        abstractC4483m.mo27417F("customerStatus");
        this.f19995b.mo10143i(abstractC4483m, user.m18187e());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("User");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
