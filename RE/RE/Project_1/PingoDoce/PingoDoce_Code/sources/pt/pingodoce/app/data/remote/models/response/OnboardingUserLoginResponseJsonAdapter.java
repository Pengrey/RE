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
import module.network.data.remote.models.response.authenticationv2.AuthenticationResponseToken;
import module.network.data.remote.models.user.User;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: OnboardingUserLoginResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class OnboardingUserLoginResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23209a;

    /* renamed from: b */
    private final AbstractC4470f f23210b;

    /* renamed from: c */
    private final AbstractC4470f f23211c;

    /* renamed from: d */
    private volatile Constructor f23212d;

    public OnboardingUserLoginResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("profile", "token");
        Intrinsics.checkIfNull(m27461a, "of(\"profile\", \"token\")");
        this.f23209a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(User.class, m208b, "profile");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(User::clas…tySet(),\n      \"profile\")");
        this.f23210b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(AuthenticationResponseToken.class, m208b2, "token");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Authentica…ava, emptySet(), \"token\")");
        this.f23211c = m27366f2;
    }

    /* renamed from: k */
    public OnboardingUserLoginResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        User user = null;
        AuthenticationResponseToken authenticationResponseToken = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23209a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                user = (User) this.f23210b.mo10144b(abstractC4476h);
                if (user == null) {
                    JsonDataException m10121v = C9712b.m10121v("profile", "profile", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"profile\"…e\",\n              reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                authenticationResponseToken = (AuthenticationResponseToken) this.f23211c.mo10144b(abstractC4476h);
                if (authenticationResponseToken == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("token", "token", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"token\", \"token\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            Objects.requireNonNull(user, "null cannot be cast to non-null type module.network.data.remote.models.user.User");
            Objects.requireNonNull(authenticationResponseToken, "null cannot be cast to non-null type module.network.data.remote.models.response.authenticationv2.AuthenticationResponseToken");
            return new OnboardingUserLoginResponse(user, authenticationResponseToken);
        }
        Constructor constructor = this.f23212d;
        if (constructor == null) {
            constructor = OnboardingUserLoginResponse.class.getDeclaredConstructor(User.class, AuthenticationResponseToken.class, Integer.TYPE, C9712b.f25570c);
            this.f23212d = constructor;
            Intrinsics.checkIfNull(constructor, "OnboardingUserLoginRespo…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(user, authenticationResponseToken, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (OnboardingUserLoginResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, OnboardingUserLoginResponse onboardingUserLoginResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(onboardingUserLoginResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("profile");
        this.f23210b.mo10143i(abstractC4483m, onboardingUserLoginResponse.m13766a());
        abstractC4483m.mo27417F("token");
        this.f23211c.mo10143i(abstractC4483m, onboardingUserLoginResponse.m13765b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OnboardingUserLoginResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
