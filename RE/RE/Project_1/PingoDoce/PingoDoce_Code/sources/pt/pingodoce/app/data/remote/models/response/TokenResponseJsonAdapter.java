package pt.pingodoce.app.data.remote.models.response;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import module.network.data.remote.models.response.AuthenticationResponse;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: TokenResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class TokenResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23284a;

    /* renamed from: b */
    private final AbstractC4470f f23285b;

    /* renamed from: c */
    private volatile Constructor f23286c;

    public TokenResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("token");
        Intrinsics.checkIfNull(m27461a, "of(\"token\")");
        this.f23284a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(AuthenticationResponse.class, m208b, "token");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Authentica…ava, emptySet(), \"token\")");
        this.f23285b = m27366f;
    }

    /* renamed from: k */
    public TokenResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        AuthenticationResponse authenticationResponse = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23284a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                authenticationResponse = (AuthenticationResponse) this.f23285b.mo10144b(abstractC4476h);
                i &= -2;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -2) {
            return new TokenResponse(authenticationResponse);
        }
        Constructor constructor = this.f23286c;
        if (constructor == null) {
            constructor = TokenResponse.class.getDeclaredConstructor(AuthenticationResponse.class, Integer.TYPE, C9712b.f25570c);
            this.f23286c = constructor;
            Intrinsics.checkIfNull(constructor, "TokenResponse::class.jav…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(authenticationResponse, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TokenResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, TokenResponse tokenResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(tokenResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("token");
        this.f23285b.mo10143i(abstractC4483m, tokenResponse.m13675a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TokenResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
