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
import module.network.data.remote.models.response.AuthenticationResponse;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: PinRecoveryResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class PinRecoveryResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23220a;

    /* renamed from: b */
    private final AbstractC4470f f23221b;

    /* renamed from: c */
    private final AbstractC4470f f23222c;

    /* renamed from: d */
    private final AbstractC4470f f23223d;

    /* renamed from: e */
    private volatile Constructor f23224e;

    public PinRecoveryResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("flow", "maskedEmail", "token");
        Intrinsics.checkIfNull(m27461a, "of(\"flow\", \"maskedEmail\", \"token\")");
        this.f23220a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(EnumC8801a.class, m208b, "flow");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(FlowType::…      emptySet(), \"flow\")");
        this.f23221b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "maskedEmail");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…t(),\n      \"maskedEmail\")");
        this.f23222c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(AuthenticationResponse.class, m208b3, "token");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Authentica…ava, emptySet(), \"token\")");
        this.f23223d = m27366f3;
    }

    /* renamed from: k */
    public PinRecoveryResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        EnumC8801a enumC8801a = null;
        String str = null;
        AuthenticationResponse authenticationResponse = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23220a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                enumC8801a = (EnumC8801a) this.f23221b.mo10144b(abstractC4476h);
                if (enumC8801a == null) {
                    JsonDataException m10121v = C9712b.m10121v("flow", "flow", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"flow\", \"…w\",\n              reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str = (String) this.f23222c.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("maskedEmail", "maskedEmail", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"maskedEm…   \"maskedEmail\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                authenticationResponse = (AuthenticationResponse) this.f23223d.mo10144b(abstractC4476h);
                i &= -5;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            Objects.requireNonNull(enumC8801a, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.FlowType");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new PinRecoveryResponse(enumC8801a, str, authenticationResponse);
        }
        Constructor constructor = this.f23224e;
        if (constructor == null) {
            constructor = PinRecoveryResponse.class.getDeclaredConstructor(EnumC8801a.class, String.class, AuthenticationResponse.class, Integer.TYPE, C9712b.f25570c);
            this.f23224e = constructor;
            Intrinsics.checkIfNull(constructor, "PinRecoveryResponse::cla…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(enumC8801a, str, authenticationResponse, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (PinRecoveryResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, PinRecoveryResponse pinRecoveryResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(pinRecoveryResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("flow");
        this.f23221b.mo10143i(abstractC4483m, pinRecoveryResponse.m13755a());
        abstractC4483m.mo27417F("maskedEmail");
        this.f23222c.mo10143i(abstractC4483m, pinRecoveryResponse.m13754b());
        abstractC4483m.mo27417F("token");
        this.f23223d.mo10143i(abstractC4483m, pinRecoveryResponse.m13753c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PinRecoveryResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
