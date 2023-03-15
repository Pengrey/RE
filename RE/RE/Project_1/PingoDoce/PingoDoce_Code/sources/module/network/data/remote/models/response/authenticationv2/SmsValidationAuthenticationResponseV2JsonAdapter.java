package module.network.data.remote.models.response.authenticationv2;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import module.network.data.remote.models.user.User;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: SmsValidationAuthenticationResponseV2JsonAdapter.kt */
/* loaded from: classes2.dex */
public final class SmsValidationAuthenticationResponseV2JsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f19973a;

    /* renamed from: b */
    private final AbstractC4470f f19974b;

    /* renamed from: c */
    private final AbstractC4470f f19975c;

    /* renamed from: d */
    private final AbstractC4470f f19976d;

    /* renamed from: e */
    private volatile Constructor f19977e;

    public SmsValidationAuthenticationResponseV2JsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("token", "pmCardsResponse", "profile");
        Intrinsics.checkIfNull(m27461a, "of(\"token\", \"pmCardsResponse\",\n      \"profile\")");
        this.f19973a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(AuthenticationResponseToken.class, m208b, "token");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Authentica…ava, emptySet(), \"token\")");
        this.f19974b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(PmCardsResponse.class, m208b2, "pmCardsResponse");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(PmCardsRes…Set(), \"pmCardsResponse\")");
        this.f19975c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(User.class, m208b3, "user");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(User::clas…java, emptySet(), \"user\")");
        this.f19976d = m27366f3;
    }

    /* renamed from: k */
    public SmsValidationAuthenticationResponseV2 mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        AuthenticationResponseToken authenticationResponseToken = null;
        PmCardsResponse pmCardsResponse = null;
        User user = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f19973a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                authenticationResponseToken = (AuthenticationResponseToken) this.f19974b.mo10144b(abstractC4476h);
                if (authenticationResponseToken == null) {
                    JsonDataException m10121v = C9712b.m10121v("token", "token", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"token\", \"token\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                pmCardsResponse = (PmCardsResponse) this.f19975c.mo10144b(abstractC4476h);
                if (pmCardsResponse == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("pmCardsResponse", "pmCardsResponse", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"pmCardsR…pmCardsResponse\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                user = (User) this.f19976d.mo10144b(abstractC4476h);
                if (user == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("user", "profile", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"user\", \"…e\",\n              reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            Objects.requireNonNull(authenticationResponseToken, "null cannot be cast to non-null type module.network.data.remote.models.response.authenticationv2.AuthenticationResponseToken");
            Objects.requireNonNull(pmCardsResponse, "null cannot be cast to non-null type module.network.data.remote.models.response.authenticationv2.PmCardsResponse");
            Objects.requireNonNull(user, "null cannot be cast to non-null type module.network.data.remote.models.user.User");
            return new SmsValidationAuthenticationResponseV2(authenticationResponseToken, pmCardsResponse, user);
        }
        Constructor constructor = this.f19977e;
        if (constructor == null) {
            constructor = SmsValidationAuthenticationResponseV2.class.getDeclaredConstructor(AuthenticationResponseToken.class, PmCardsResponse.class, User.class, Integer.TYPE, C9712b.f25570c);
            this.f19977e = constructor;
            Intrinsics.checkIfNull(constructor, "SmsValidationAuthenticat…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(authenticationResponseToken, pmCardsResponse, user, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (SmsValidationAuthenticationResponseV2) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, SmsValidationAuthenticationResponseV2 smsValidationAuthenticationResponseV2) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(smsValidationAuthenticationResponseV2, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("token");
        this.f19974b.mo10143i(abstractC4483m, smsValidationAuthenticationResponseV2.m18208b());
        abstractC4483m.mo27417F("pmCardsResponse");
        this.f19975c.mo10143i(abstractC4483m, smsValidationAuthenticationResponseV2.m18209a());
        abstractC4483m.mo27417F("profile");
        this.f19976d.mo10143i(abstractC4483m, smsValidationAuthenticationResponseV2.m18207c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SmsValidationAuthenticationResponseV2");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
