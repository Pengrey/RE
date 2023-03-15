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
import p489zc.C13778q0;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;

/* compiled from: LoyaltyCardListResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class LoyaltyCardListResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23202a;

    /* renamed from: b */
    private final AbstractC4470f f23203b;

    /* renamed from: c */
    private final AbstractC4470f f23204c;

    /* renamed from: d */
    private final AbstractC4470f f23205d;

    /* renamed from: e */
    private volatile Constructor f23206e;

    public LoyaltyCardListResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("firstName", "lastName", "pmCards", "userHasGuests");
        Intrinsics.checkIfNull(m27461a, "of(\"firstName\", \"lastNam…mCards\", \"userHasGuests\")");
        this.f23202a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "firstName");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…Set(),\n      \"firstName\")");
        this.f23203b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, LoyaltyCardProvisory.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "cards");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…     emptySet(), \"cards\")");
        this.f23204c = m27366f2;
        Class cls = Boolean.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls, m208b3, "userHasGuests");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Boolean::c…),\n      \"userHasGuests\")");
        this.f23205d = m27366f3;
    }

    /* renamed from: k */
    public LoyaltyCardListResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        List list = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23202a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f23203b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("firstName", "firstName", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"firstNam…     \"firstName\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f23203b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("lastName", "lastName", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"lastName…      \"lastName\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                list = (List) this.f23204c.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("cards", "pmCards", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"cards\", \"pmCards\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                bool = (Boolean) this.f23205d.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("userHasGuests", "userHasGuests", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"userHasG… \"userHasGuests\", reader)");
                    throw m10121v4;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -16) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory>");
            return new LoyaltyCardListResponse(str, str2, list, bool.booleanValue());
        }
        Constructor constructor = this.f23206e;
        if (constructor == null) {
            constructor = LoyaltyCardListResponse.class.getDeclaredConstructor(String.class, String.class, List.class, Boolean.TYPE, Integer.TYPE, C9712b.f25570c);
            this.f23206e = constructor;
            Intrinsics.checkIfNull(constructor, "LoyaltyCardListResponse:…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, list, bool, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (LoyaltyCardListResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, LoyaltyCardListResponse loyaltyCardListResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(loyaltyCardListResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("firstName");
        this.f23203b.mo10143i(abstractC4483m, loyaltyCardListResponse.m13773b());
        abstractC4483m.mo27417F("lastName");
        this.f23203b.mo10143i(abstractC4483m, loyaltyCardListResponse.m13772c());
        abstractC4483m.mo27417F("pmCards");
        this.f23204c.mo10143i(abstractC4483m, loyaltyCardListResponse.m13774a());
        abstractC4483m.mo27417F("userHasGuests");
        this.f23205d.mo10143i(abstractC4483m, Boolean.valueOf(loyaltyCardListResponse.m13771d()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LoyaltyCardListResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
