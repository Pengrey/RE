package pt.pingodoce.app.data.local.models.clubs;

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

/* compiled from: ClubJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ClubJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22488a;

    /* renamed from: b */
    private final AbstractC4470f f22489b;

    /* renamed from: c */
    private final AbstractC4470f f22490c;

    /* renamed from: d */
    private final AbstractC4470f f22491d;

    /* renamed from: e */
    private final AbstractC4470f f22492e;

    /* renamed from: f */
    private final AbstractC4470f f22493f;

    /* renamed from: g */
    private volatile Constructor f22494g;

    public ClubJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("clubType", "id", "code", "title", "name", "description", "imageUrl", "startDate", "endDate", "requestDate", "latestTerms", "termsUrl", "subscribed", "formFields", "data", "agreedTermsVersion");
        Intrinsics.checkIfNull(m27461a, "of(\"clubType\", \"id\", \"co…a\", \"agreedTermsVersion\")");
        this.f22488a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(EnumC8691a.class, m208b, "clubType");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(ClubDataTy…, emptySet(), \"clubType\")");
        this.f22489b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "id");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22490c = m27366f2;
        Class cls = Boolean.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls, m208b3, "subscribed");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Boolean::c…et(),\n      \"subscribed\")");
        this.f22491d = m27366f3;
        ParameterizedType m27327j = C4516s.m27327j(List.class, FormField.class);
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(m27327j, m208b4, "formFields");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Types.newP…et(),\n      \"formFields\")");
        this.f22492e = m27366f4;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(ClubData.class, m208b5, "data");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(ClubData::…      emptySet(), \"data\")");
        this.f22493f = m27366f5;
    }

    /* renamed from: k */
    public Club mo10144b(AbstractC4476h abstractC4476h) {
        ClubData clubData;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        EnumC8691a enumC8691a = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        List list = null;
        ClubData clubData2 = null;
        String str12 = null;
        while (abstractC4476h.mo27427y()) {
            Boolean bool2 = bool;
            switch (abstractC4476h.mo27436d0(this.f22488a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    enumC8691a = (EnumC8691a) this.f22489b.mo10144b(abstractC4476h);
                    if (enumC8691a == null) {
                        JsonDataException m10121v = C9712b.m10121v("clubType", "clubType", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"clubType…      \"clubType\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str4 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str5 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("code", "code", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"code\", \"code\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str6 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("title", "title", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"title\", …e\",\n              reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str7 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("name", "name", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"name\", \"name\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str8 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str8 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("description", "description", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"descript…   \"description\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    str9 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str9 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("imageUrl", "imageUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"imageUrl…      \"imageUrl\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    str10 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str10 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("startDate", "startDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"startDat…     \"startDate\", reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    str11 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str11 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("endDate", "endDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"endDate\"…       \"endDate\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
                case 9:
                    str3 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("requestDate", "requestDate", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"requestD…   \"requestDate\", reader)");
                        throw m10121v10;
                    }
                    i &= -513;
                    break;
                case 10:
                    str2 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v11 = C9712b.m10121v("latestTerms", "latestTerms", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"latestTe…   \"latestTerms\", reader)");
                        throw m10121v11;
                    }
                    i &= -1025;
                    break;
                case 11:
                    str = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v12 = C9712b.m10121v("termsUrl", "termsUrl", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v12, "unexpectedNull(\"termsUrl…      \"termsUrl\", reader)");
                        throw m10121v12;
                    }
                    i &= -2049;
                    break;
                case 12:
                    bool = (Boolean) this.f22491d.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v13 = C9712b.m10121v("subscribed", "subscribed", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v13, "unexpectedNull(\"subscrib…    \"subscribed\", reader)");
                        throw m10121v13;
                    }
                    i &= -4097;
                    continue;
                case 13:
                    list = (List) this.f22492e.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v14 = C9712b.m10121v("formFields", "formFields", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v14, "unexpectedNull(\"formFields\", \"formFields\", reader)");
                        throw m10121v14;
                    }
                    i &= -8193;
                    break;
                case 14:
                    clubData2 = (ClubData) this.f22493f.mo10144b(abstractC4476h);
                    if (clubData2 == null) {
                        JsonDataException m10121v15 = C9712b.m10121v("data_", "data", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v15, "unexpectedNull(\"data_\", …a\",\n              reader)");
                        throw m10121v15;
                    }
                    i &= -16385;
                    break;
                case 15:
                    str12 = (String) this.f22490c.mo10144b(abstractC4476h);
                    if (str12 == null) {
                        JsonDataException m10121v16 = C9712b.m10121v("agreedTermsVersion", "agreedTermsVersion", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v16, "unexpectedNull(\"agreedTe…eedTermsVersion\", reader)");
                        throw m10121v16;
                    }
                    i &= -32769;
                    break;
            }
            bool = bool2;
        }
        Boolean bool3 = bool;
        abstractC4476h.mo27433h();
        if (i == -65536) {
            Objects.requireNonNull(enumC8691a, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.clubs.ClubDataType");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str8, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str9, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str10, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str11, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool3.booleanValue();
            List list2 = list;
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.clubs.FormField>");
            ClubData clubData3 = clubData2;
            Objects.requireNonNull(clubData3, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.clubs.ClubData");
            String str13 = str12;
            Objects.requireNonNull(str13, "null cannot be cast to non-null type kotlin.String");
            return new Club(enumC8691a, str4, str5, str6, str7, str8, str9, str10, str11, str3, str2, str, booleanValue, list2, clubData3, str13);
        }
        String str14 = str3;
        ClubData clubData4 = clubData2;
        Constructor constructor = this.f22494g;
        int i2 = i;
        if (constructor == null) {
            clubData = clubData4;
            constructor = Club.class.getDeclaredConstructor(EnumC8691a.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, List.class, ClubData.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f22494g = constructor;
            C13195u c13195u = C13195u.f34156a;
            Intrinsics.checkIfNull(constructor, "Club::class.java.getDecl…his.constructorRef = it }");
        } else {
            clubData = clubData4;
        }
        Object newInstance = constructor.newInstance(enumC8691a, str4, str5, str6, str7, str8, str9, str10, str11, str14, str2, str, bool3, list, clubData, str12, Integer.valueOf(i2), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Club) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Club club) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(club, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("clubType");
        this.f22489b.mo10143i(abstractC4483m, club.m14653d());
        abstractC4483m.mo27417F("id");
        this.f22490c.mo10143i(abstractC4483m, club.m14646m());
        abstractC4483m.mo27417F("code");
        this.f22490c.mo10143i(abstractC4483m, club.m14652e());
        abstractC4483m.mo27417F("title");
        this.f22490c.mo10143i(abstractC4483m, club.m14638z());
        abstractC4483m.mo27417F("name");
        this.f22490c.mo10143i(abstractC4483m, club.m14643s());
        abstractC4483m.mo27417F("description");
        this.f22490c.mo10143i(abstractC4483m, club.m14650h());
        abstractC4483m.mo27417F("imageUrl");
        this.f22490c.mo10143i(abstractC4483m, club.m14645n());
        abstractC4483m.mo27417F("startDate");
        this.f22490c.mo10143i(abstractC4483m, club.m14641v());
        abstractC4483m.mo27417F("endDate");
        this.f22490c.mo10143i(abstractC4483m, club.m14649i());
        abstractC4483m.mo27417F("requestDate");
        this.f22490c.mo10143i(abstractC4483m, club.m14642t());
        abstractC4483m.mo27417F("latestTerms");
        this.f22490c.mo10143i(abstractC4483m, club.m14644r());
        abstractC4483m.mo27417F("termsUrl");
        this.f22490c.mo10143i(abstractC4483m, club.m14639y());
        abstractC4483m.mo27417F("subscribed");
        this.f22491d.mo10143i(abstractC4483m, Boolean.valueOf(club.m14640w()));
        abstractC4483m.mo27417F("formFields");
        this.f22492e.mo10143i(abstractC4483m, club.m14648j());
        abstractC4483m.mo27417F("data");
        this.f22493f.mo10143i(abstractC4483m, club.m14651f());
        abstractC4483m.mo27417F("agreedTermsVersion");
        this.f22490c.mo10143i(abstractC4483m, club.m14654c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Club");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
