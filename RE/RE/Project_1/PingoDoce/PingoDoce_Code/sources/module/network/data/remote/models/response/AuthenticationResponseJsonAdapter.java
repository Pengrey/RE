package module.network.data.remote.models.response;

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

/* compiled from: AuthenticationResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class AuthenticationResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f19936a;

    /* renamed from: b */
    private final AbstractC4470f f19937b;

    /* renamed from: c */
    private final AbstractC4470f f19938c;

    /* renamed from: d */
    private volatile Constructor f19939d;

    public AuthenticationResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("access_token", "refresh_token", "expires_in", "token_type", "scope");
        Intrinsics.checkIfNull(m27461a, "of(\"access_token\", \"refr…\", \"token_type\", \"scope\")");
        this.f19936a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "accessToken");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…t(),\n      \"accessToken\")");
        this.f19937b = m27366f;
        Class cls = Long.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "expiresIn");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Long::clas…Set(),\n      \"expiresIn\")");
        this.f19938c = m27366f2;
    }

    /* renamed from: k */
    public AuthenticationResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Long l = 0L;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f19936a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f19937b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("accessToken", "access_token", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"accessTo…  \"access_token\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f19937b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("refreshToken", "refresh_token", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"refreshT… \"refresh_token\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                l = (Long) this.f19938c.mo10144b(abstractC4476h);
                if (l == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("expiresIn", "expires_in", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"expiresI…    \"expires_in\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                str3 = (String) this.f19937b.mo10144b(abstractC4476h);
                if (str3 == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("tokenType", "token_type", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"tokenTyp…    \"token_type\", reader)");
                    throw m10121v4;
                }
                i &= -9;
            } else if (mo27436d0 == 4) {
                str4 = (String) this.f19937b.mo10144b(abstractC4476h);
                if (str4 == null) {
                    JsonDataException m10121v5 = C9712b.m10121v("scope", "scope", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"scope\", …e\",\n              reader)");
                    throw m10121v5;
                }
                i &= -17;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -32) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            long longValue = l.longValue();
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            return new AuthenticationResponse(str, str2, longValue, str3, str4);
        }
        Constructor constructor = this.f19939d;
        if (constructor == null) {
            constructor = AuthenticationResponse.class.getDeclaredConstructor(String.class, String.class, Long.TYPE, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f19939d = constructor;
            Intrinsics.checkIfNull(constructor, "AuthenticationResponse::…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, l, str3, str4, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (AuthenticationResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, AuthenticationResponse authenticationResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(authenticationResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("access_token");
        this.f19937b.mo10143i(abstractC4483m, authenticationResponse.m18245a());
        abstractC4483m.mo27417F("refresh_token");
        this.f19937b.mo10143i(abstractC4483m, authenticationResponse.m18243c());
        abstractC4483m.mo27417F("expires_in");
        this.f19938c.mo10143i(abstractC4483m, Long.valueOf(authenticationResponse.m18244b()));
        abstractC4483m.mo27417F("token_type");
        this.f19937b.mo10143i(abstractC4483m, authenticationResponse.m18241e());
        abstractC4483m.mo27417F("scope");
        this.f19937b.mo10143i(abstractC4483m, authenticationResponse.m18242d());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AuthenticationResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
