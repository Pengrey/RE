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

/* compiled from: CheckoutResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class CheckoutResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23109a;

    /* renamed from: b */
    private final AbstractC4470f f23110b;

    /* renamed from: c */
    private volatile Constructor f23111c;

    public CheckoutResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("redirectUrl");
        Intrinsics.checkIfNull(m27461a, "of(\"redirectUrl\")");
        this.f23109a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "url");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl… emptySet(),\n      \"url\")");
        this.f23110b = m27366f;
    }

    /* renamed from: k */
    public CheckoutResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23109a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f23110b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("url", "redirectUrl", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"url\", \"r…l\",\n              reader)");
                    throw m10121v;
                }
                i &= -2;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -2) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new CheckoutResponse(str);
        }
        Constructor constructor = this.f23111c;
        if (constructor == null) {
            constructor = CheckoutResponse.class.getDeclaredConstructor(String.class, Integer.TYPE, C9712b.f25570c);
            this.f23111c = constructor;
            Intrinsics.checkIfNull(constructor, "CheckoutResponse::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (CheckoutResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, CheckoutResponse checkoutResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(checkoutResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("redirectUrl");
        this.f23110b.mo10143i(abstractC4483m, checkoutResponse.m13878a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckoutResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
