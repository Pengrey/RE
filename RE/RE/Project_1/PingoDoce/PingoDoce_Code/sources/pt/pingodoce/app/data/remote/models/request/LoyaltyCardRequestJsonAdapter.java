package pt.pingodoce.app.data.remote.models.request;

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

/* compiled from: LoyaltyCardRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class LoyaltyCardRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22883a;

    /* renamed from: b */
    private final AbstractC4470f f22884b;

    /* renamed from: c */
    private volatile Constructor f22885c;

    public LoyaltyCardRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "requesterName", "requesterPhoneNumber", "cardNumber");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"requesterName\"…oneNumber\", \"cardNumber\")");
        this.f22883a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22884b = m27366f;
    }

    /* renamed from: k */
    public LoyaltyCardRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22883a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22884b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f22884b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("requesterName", "requesterName", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"requeste… \"requesterName\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str3 = (String) this.f22884b.mo10144b(abstractC4476h);
                if (str3 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("requesterPhoneNumber", "requesterPhoneNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"requeste…sterPhoneNumber\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                str4 = (String) this.f22884b.mo10144b(abstractC4476h);
                if (str4 == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("cardNumber", "cardNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"cardNumb…    \"cardNumber\", reader)");
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
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            return new LoyaltyCardRequest(str, str2, str3, str4);
        }
        Constructor constructor = this.f22885c;
        if (constructor == null) {
            constructor = LoyaltyCardRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f22885c = constructor;
            Intrinsics.checkIfNull(constructor, "LoyaltyCardRequest::clas…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (LoyaltyCardRequest) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, LoyaltyCardRequest loyaltyCardRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(loyaltyCardRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f22884b.mo10143i(abstractC4483m, loyaltyCardRequest.m14134b());
        abstractC4483m.mo27417F("requesterName");
        this.f22884b.mo10143i(abstractC4483m, loyaltyCardRequest.m14133c());
        abstractC4483m.mo27417F("requesterPhoneNumber");
        this.f22884b.mo10143i(abstractC4483m, loyaltyCardRequest.m14132d());
        abstractC4483m.mo27417F("cardNumber");
        this.f22884b.mo10143i(abstractC4483m, loyaltyCardRequest.m14135a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LoyaltyCardRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
