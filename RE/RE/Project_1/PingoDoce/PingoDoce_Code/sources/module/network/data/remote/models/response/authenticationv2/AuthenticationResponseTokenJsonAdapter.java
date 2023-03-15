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
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: AuthenticationResponseTokenJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class AuthenticationResponseTokenJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f19959a;

    /* renamed from: b */
    private final AbstractC4470f f19960b;

    /* renamed from: c */
    private final AbstractC4470f f19961c;

    /* renamed from: d */
    private volatile Constructor f19962d;

    public AuthenticationResponseTokenJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("access_token", "expires_in", "identity_token", "refresh_token", "token_type", "scope");
        Intrinsics.checkIfNull(m27461a, "of(\"access_token\", \"expi…\", \"token_type\", \"scope\")");
        this.f19959a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "accessToken");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…t(),\n      \"accessToken\")");
        this.f19960b = m27366f;
        Class cls = Long.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "expiresIn");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Long::clas…Set(),\n      \"expiresIn\")");
        this.f19961c = m27366f2;
    }

    /* renamed from: k */
    public AuthenticationResponseToken mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Long l = 0L;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f19959a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str = (String) this.f19960b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v = C9712b.m10121v("accessToken", "access_token", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"accessTo…  \"access_token\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    l = (Long) this.f19961c.mo10144b(abstractC4476h);
                    if (l == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("expiresIn", "expires_in", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"expiresI…    \"expires_in\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.f19960b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("identityToken", "identity_token", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"identity…\"identity_token\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str3 = (String) this.f19960b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("refreshToken", "refresh_token", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"refreshT… \"refresh_token\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str4 = (String) this.f19960b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("tokenType", "token_type", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"tokenTyp…    \"token_type\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str5 = (String) this.f19960b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("scope", "scope", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"scope\", …e\",\n              reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -64) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            long longValue = l.longValue();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            return new AuthenticationResponseToken(str, longValue, str2, str3, str4, str5);
        }
        Constructor constructor = this.f19962d;
        if (constructor == null) {
            constructor = AuthenticationResponseToken.class.getDeclaredConstructor(String.class, Long.TYPE, String.class, String.class, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f19962d = constructor;
            Intrinsics.checkIfNull(constructor, "AuthenticationResponseTo…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, l, str2, str3, str4, str5, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (AuthenticationResponseToken) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, AuthenticationResponseToken authenticationResponseToken) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(authenticationResponseToken, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("access_token");
        this.f19960b.mo10143i(abstractC4483m, authenticationResponseToken.m18226a());
        abstractC4483m.mo27417F("expires_in");
        this.f19961c.mo10143i(abstractC4483m, Long.valueOf(authenticationResponseToken.m18225b()));
        abstractC4483m.mo27417F("identity_token");
        this.f19960b.mo10143i(abstractC4483m, authenticationResponseToken.m18224c());
        abstractC4483m.mo27417F("refresh_token");
        this.f19960b.mo10143i(abstractC4483m, authenticationResponseToken.m18223d());
        abstractC4483m.mo27417F("token_type");
        this.f19960b.mo10143i(abstractC4483m, authenticationResponseToken.m18221f());
        abstractC4483m.mo27417F("scope");
        this.f19960b.mo10143i(abstractC4483m, authenticationResponseToken.m18222e());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AuthenticationResponseToken");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
