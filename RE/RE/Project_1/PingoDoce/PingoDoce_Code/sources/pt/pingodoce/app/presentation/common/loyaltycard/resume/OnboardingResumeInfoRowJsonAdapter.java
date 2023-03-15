package pt.pingodoce.app.presentation.common.loyaltycard.resume;

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

/* compiled from: OnboardingResumeInfoRowJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class OnboardingResumeInfoRowJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23920a;

    /* renamed from: b */
    private final AbstractC4470f f23921b;

    /* renamed from: c */
    private final AbstractC4470f f23922c;

    /* renamed from: d */
    private final AbstractC4470f f23923d;

    /* renamed from: e */
    private final AbstractC4470f f23924e;

    /* renamed from: f */
    private final AbstractC4470f f23925f;

    /* renamed from: g */
    private volatile Constructor f23926g;

    public OnboardingResumeInfoRowJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("title", "subTitle", "items", "hasGuests", "message", "showWarningIcon", "showActionButton", "showEditButton", "rowItemId", "showAlertContainer", "alertMessage", "isCardOwner");
        Intrinsics.checkIfNull(m27461a, "of(\"title\", \"subTitle\", …tMessage\", \"isCardOwner\")");
        this.f23920a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "title");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.f23921b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, C14956OnboardingResumeInfoRowItem.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "items");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…va), emptySet(), \"items\")");
        this.f23922c = m27366f2;
        Class cls = Boolean.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls, m208b3, "hasGuests");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Boolean::c…Set(),\n      \"hasGuests\")");
        this.f23923d = m27366f3;
        Class cls2 = Integer.TYPE;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(cls2, m208b4, "rowItemId");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Int::class… emptySet(), \"rowItemId\")");
        this.f23924e = m27366f4;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(String.class, m208b5, "alertMessage");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(String::cl…ptySet(), \"alertMessage\")");
        this.f23925f = m27366f5;
    }

    /* renamed from: k */
    public LoyaltyCardResumeViewModel mo10144b(AbstractC4476h abstractC4476h) {
        String str;
        Class<String> cls = String.class;
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Integer num = 0;
        int i = -1;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool5 = bool4;
        Boolean bool6 = bool5;
        while (true) {
            Class<String> cls2 = cls;
            if (abstractC4476h.mo27427y()) {
                Boolean bool7 = bool4;
                switch (abstractC4476h.mo27436d0(this.f23920a)) {
                    case -1:
                        abstractC4476h.mo27432l0();
                        abstractC4476h.mo27431o0();
                        break;
                    case 0:
                        str3 = (String) this.f23921b.mo10144b(abstractC4476h);
                        if (str3 == null) {
                            JsonDataException m10121v = C9712b.m10121v("title", "title", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"title\", …tle\",\n            reader)");
                            throw m10121v;
                        }
                        break;
                    case 1:
                        str4 = (String) this.f23921b.mo10144b(abstractC4476h);
                        if (str4 == null) {
                            JsonDataException m10121v2 = C9712b.m10121v("subTitle", "subTitle", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"subTitle…      \"subTitle\", reader)");
                            throw m10121v2;
                        }
                        break;
                    case 2:
                        list = (List) this.f23922c.mo10144b(abstractC4476h);
                        if (list == null) {
                            JsonDataException m10121v3 = C9712b.m10121v("items", "items", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"items\", \"items\", reader)");
                            throw m10121v3;
                        }
                        i &= -5;
                        break;
                    case 3:
                        bool = (Boolean) this.f23923d.mo10144b(abstractC4476h);
                        if (bool == null) {
                            JsonDataException m10121v4 = C9712b.m10121v("hasGuests", "hasGuests", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"hasGuest…     \"hasGuests\", reader)");
                            throw m10121v4;
                        }
                        i &= -9;
                        break;
                    case 4:
                        str2 = (String) this.f23921b.mo10144b(abstractC4476h);
                        if (str2 == null) {
                            JsonDataException m10121v5 = C9712b.m10121v("message", "message", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"message\"…       \"message\", reader)");
                            throw m10121v5;
                        }
                        i &= -17;
                        break;
                    case 5:
                        bool5 = (Boolean) this.f23923d.mo10144b(abstractC4476h);
                        if (bool5 == null) {
                            JsonDataException m10121v6 = C9712b.m10121v("showWarningIcon", "showWarningIcon", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"showWarn…showWarningIcon\", reader)");
                            throw m10121v6;
                        }
                        i &= -33;
                        break;
                    case 6:
                        bool6 = (Boolean) this.f23923d.mo10144b(abstractC4476h);
                        if (bool6 == null) {
                            JsonDataException m10121v7 = C9712b.m10121v("showActionButton", "showActionButton", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"showActi…howActionButton\", reader)");
                            throw m10121v7;
                        }
                        i &= -65;
                        break;
                    case 7:
                        bool2 = (Boolean) this.f23923d.mo10144b(abstractC4476h);
                        if (bool2 == null) {
                            JsonDataException m10121v8 = C9712b.m10121v("showEditButton", "showEditButton", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"showEdit…\"showEditButton\", reader)");
                            throw m10121v8;
                        }
                        i &= -129;
                        break;
                    case 8:
                        num = (Integer) this.f23924e.mo10144b(abstractC4476h);
                        if (num == null) {
                            JsonDataException m10121v9 = C9712b.m10121v("rowItemId", "rowItemId", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"rowItemI…     \"rowItemId\", reader)");
                            throw m10121v9;
                        }
                        i &= -257;
                        break;
                    case 9:
                        bool3 = (Boolean) this.f23923d.mo10144b(abstractC4476h);
                        if (bool3 == null) {
                            JsonDataException m10121v10 = C9712b.m10121v("showAlertContainer", "showAlertContainer", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"showAler…wAlertContainer\", reader)");
                            throw m10121v10;
                        }
                        i &= -513;
                        break;
                    case 10:
                        str5 = (String) this.f23925f.mo10144b(abstractC4476h);
                        i &= -1025;
                        break;
                    case 11:
                        bool4 = (Boolean) this.f23923d.mo10144b(abstractC4476h);
                        if (bool4 == null) {
                            JsonDataException m10121v11 = C9712b.m10121v("isCardOwner", "isCardOwner", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v11, "unexpectedNull(\"isCardOw…   \"isCardOwner\", reader)");
                            throw m10121v11;
                        }
                        i &= -2049;
                        continue;
                        cls = cls2;
                }
                bool4 = bool7;
                cls = cls2;
            } else {
                Boolean bool8 = bool4;
                abstractC4476h.mo27433h();
                if (i == -4093) {
                    if (str3 == null) {
                        JsonDataException m10129n = C9712b.m10129n("title", "title", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n, "missingProperty(\"title\", \"title\", reader)");
                        throw m10129n;
                    } else if (str4 != null) {
                        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.presentation.common.loyaltycard.resume.OnboardingResumeInfoRowItem>");
                        boolean booleanValue = bool.booleanValue();
                        Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
                        return new LoyaltyCardResumeViewModel(str3, str4, list, booleanValue, str2, bool5.booleanValue(), bool6.booleanValue(), bool2.booleanValue(), num.intValue(), bool3.booleanValue(), str5, bool8.booleanValue());
                    } else {
                        JsonDataException m10129n2 = C9712b.m10129n("subTitle", "subTitle", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n2, "missingProperty(\"subTitle\", \"subTitle\", reader)");
                        throw m10129n2;
                    }
                }
                List list2 = list;
                Constructor constructor = this.f23926g;
                if (constructor == null) {
                    str = "title";
                    Class cls3 = Boolean.TYPE;
                    Class cls4 = Integer.TYPE;
                    constructor = LoyaltyCardResumeViewModel.class.getDeclaredConstructor(cls2, cls2, List.class, cls3, cls2, cls3, cls3, cls3, cls4, cls3, cls2, cls3, cls4, C9712b.f25570c);
                    this.f23926g = constructor;
                    Intrinsics.checkIfNull(constructor, "OnboardingResumeInfoRow:…his.constructorRef = it }");
                } else {
                    str = "title";
                }
                Object[] objArr = new Object[14];
                if (str3 == null) {
                    String str6 = str;
                    JsonDataException m10129n3 = C9712b.m10129n(str6, str6, abstractC4476h);
                    Intrinsics.checkIfNull(m10129n3, "missingProperty(\"title\", \"title\", reader)");
                    throw m10129n3;
                }
                objArr[0] = str3;
                if (str4 == null) {
                    JsonDataException m10129n4 = C9712b.m10129n("subTitle", "subTitle", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n4, "missingProperty(\"subTitle\", \"subTitle\", reader)");
                    throw m10129n4;
                }
                objArr[1] = str4;
                objArr[2] = list2;
                objArr[3] = bool;
                objArr[4] = str2;
                objArr[5] = bool5;
                objArr[6] = bool6;
                objArr[7] = bool2;
                objArr[8] = num;
                objArr[9] = bool3;
                objArr[10] = str5;
                objArr[11] = bool8;
                objArr[12] = Integer.valueOf(i);
                objArr[13] = null;
                Object newInstance = constructor.newInstance(objArr);
                Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return (LoyaltyCardResumeViewModel) newInstance;
            }
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, LoyaltyCardResumeViewModel loyaltyCardResumeViewModel) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(loyaltyCardResumeViewModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("title");
        this.f23921b.mo10143i(abstractC4483m, loyaltyCardResumeViewModel.m12645m());
        abstractC4483m.mo27417F("subTitle");
        this.f23921b.mo10143i(abstractC4483m, loyaltyCardResumeViewModel.m12646k());
        abstractC4483m.mo27417F("items");
        this.f23922c.mo10143i(abstractC4483m, loyaltyCardResumeViewModel.m12653c());
        abstractC4483m.mo27417F("hasGuests");
        this.f23923d.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCardResumeViewModel.m12654b()));
        abstractC4483m.mo27417F("message");
        this.f23921b.mo10143i(abstractC4483m, loyaltyCardResumeViewModel.m12652d());
        abstractC4483m.mo27417F("showWarningIcon");
        this.f23923d.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCardResumeViewModel.m12647j()));
        abstractC4483m.mo27417F("showActionButton");
        this.f23923d.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCardResumeViewModel.m12650f()));
        abstractC4483m.mo27417F("showEditButton");
        this.f23923d.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCardResumeViewModel.m12648i()));
        abstractC4483m.mo27417F("rowItemId");
        this.f23924e.mo10143i(abstractC4483m, Integer.valueOf(loyaltyCardResumeViewModel.m12651e()));
        abstractC4483m.mo27417F("showAlertContainer");
        this.f23923d.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCardResumeViewModel.m12649h()));
        abstractC4483m.mo27417F("alertMessage");
        this.f23925f.mo10143i(abstractC4483m, loyaltyCardResumeViewModel.m12655a());
        abstractC4483m.mo27417F("isCardOwner");
        this.f23923d.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCardResumeViewModel.m12644n()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OnboardingResumeInfoRow");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
