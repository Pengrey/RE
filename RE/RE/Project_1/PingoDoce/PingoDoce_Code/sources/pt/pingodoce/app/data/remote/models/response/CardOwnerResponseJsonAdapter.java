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

/* compiled from: CardOwnerResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class CardOwnerResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23088a;

    /* renamed from: b */
    private final AbstractC4470f f23089b;

    /* renamed from: c */
    private final AbstractC4470f f23090c;

    /* renamed from: d */
    private final AbstractC4470f f23091d;

    /* renamed from: e */
    private volatile Constructor f23092e;

    public CardOwnerResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("delegateInvite", "status", "maskedPhoneNumber", "pendingPoupaMaisNumber", "poupaMaisStatus", "userHasGuests");
        Intrinsics.checkIfNull(m27461a, "of(\"delegateInvite\", \"st…Status\", \"userHasGuests\")");
        this.f23088a = m27461a;
        Class cls = Boolean.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "delegateInvite");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Boolean::c…,\n      \"delegateInvite\")");
        this.f23089b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "status");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…ptySet(),\n      \"status\")");
        this.f23090c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(LoyaltyCard.PoupaMaisStatus.class, m208b3, "poupaMaisStatus");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(LoyaltyCar…Set(), \"poupaMaisStatus\")");
        this.f23091d = m27366f3;
    }

    /* renamed from: k */
    public CardOwnerResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = null;
        Boolean bool2 = bool;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f23088a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    bool = (Boolean) this.f23089b.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v = C9712b.m10121v("delegateInvite", "delegateInvite", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"delegate…\"delegateInvite\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str = (String) this.f23090c.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("status", "status", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"status\",…s\",\n              reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.f23090c.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("maskedPhoneNumber", "maskedPhoneNumber", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"maskedPh…skedPhoneNumber\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str3 = (String) this.f23090c.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("pendingPoupaMaisNumber", "pendingPoupaMaisNumber", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"pendingP…PoupaMaisNumber\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    poupaMaisStatus = (LoyaltyCard.PoupaMaisStatus) this.f23091d.mo10144b(abstractC4476h);
                    if (poupaMaisStatus == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("poupaMaisStatus", "poupaMaisStatus", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"poupaMai…poupaMaisStatus\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    bool2 = (Boolean) this.f23089b.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("userHasGuests", "userHasGuests", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"userHasG… \"userHasGuests\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -64) {
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(poupaMaisStatus, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.LoyaltyCard.PoupaMaisStatus");
            return new CardOwnerResponse(booleanValue, str, str2, str3, poupaMaisStatus, bool2.booleanValue());
        }
        Constructor constructor = this.f23092e;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = CardOwnerResponse.class.getDeclaredConstructor(cls, String.class, String.class, String.class, LoyaltyCard.PoupaMaisStatus.class, cls, Integer.TYPE, C9712b.f25570c);
            this.f23092e = constructor;
            Intrinsics.checkIfNull(constructor, "CardOwnerResponse::class…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(bool, str, str2, str3, poupaMaisStatus, bool2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (CardOwnerResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, CardOwnerResponse cardOwnerResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(cardOwnerResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("delegateInvite");
        this.f23089b.mo10143i(abstractC4483m, Boolean.valueOf(cardOwnerResponse.m13903a()));
        abstractC4483m.mo27417F("status");
        this.f23090c.mo10143i(abstractC4483m, cardOwnerResponse.m13899e());
        abstractC4483m.mo27417F("maskedPhoneNumber");
        this.f23090c.mo10143i(abstractC4483m, cardOwnerResponse.m13902b());
        abstractC4483m.mo27417F("pendingPoupaMaisNumber");
        this.f23090c.mo10143i(abstractC4483m, cardOwnerResponse.m13901c());
        abstractC4483m.mo27417F("poupaMaisStatus");
        this.f23091d.mo10143i(abstractC4483m, cardOwnerResponse.m13900d());
        abstractC4483m.mo27417F("userHasGuests");
        this.f23089b.mo10143i(abstractC4483m, Boolean.valueOf(cardOwnerResponse.m13898f()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CardOwnerResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
