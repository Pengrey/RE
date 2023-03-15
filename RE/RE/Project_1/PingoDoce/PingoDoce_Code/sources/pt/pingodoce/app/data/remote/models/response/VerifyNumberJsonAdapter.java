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

/* compiled from: VerifyNumberJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class VerifyNumberJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23291a;

    /* renamed from: b */
    private final AbstractC4470f f23292b;

    /* renamed from: c */
    private final AbstractC4470f f23293c;

    /* renamed from: d */
    private final AbstractC4470f f23294d;

    /* renamed from: e */
    private volatile Constructor f23295e;

    public VerifyNumberJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("status", "message", "consents");
        Intrinsics.checkIfNull(m27461a, "of(\"status\", \"message\", \"consents\")");
        this.f23291a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "statusId");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class…, emptySet(), \"statusId\")");
        this.f23292b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "message");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…tySet(),\n      \"message\")");
        this.f23293c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(Consent.class, m208b3, "consents");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Consent::c…ySet(),\n      \"consents\")");
        this.f23294d = m27366f3;
    }

    /* renamed from: k */
    public VerifyNumber mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        Integer num = null;
        String str = null;
        Consent consent = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23291a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                num = (Integer) this.f23292b.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v = C9712b.m10121v("statusId", "status", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"statusId…        \"status\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                str = (String) this.f23293c.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("message", "message", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"message\"…       \"message\", reader)");
                    throw m10121v2;
                }
            } else if (mo27436d0 == 2) {
                consent = (Consent) this.f23294d.mo10144b(abstractC4476h);
                if (consent == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("consents", "consents", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"consents…      \"consents\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -5) {
            if (num != null) {
                int intValue = num.intValue();
                if (str != null) {
                    Objects.requireNonNull(consent, "null cannot be cast to non-null type pt.pingodoce.app.data.remote.models.response.Consent");
                    return new VerifyNumber(intValue, str, consent);
                }
                JsonDataException m10129n = C9712b.m10129n("message", "message", abstractC4476h);
                Intrinsics.checkIfNull(m10129n, "missingProperty(\"message\", \"message\", reader)");
                throw m10129n;
            }
            JsonDataException m10129n2 = C9712b.m10129n("statusId", "status", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"statusId\", \"status\", reader)");
            throw m10129n2;
        }
        Constructor constructor = this.f23295e;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = VerifyNumber.class.getDeclaredConstructor(cls, String.class, Consent.class, cls, C9712b.f25570c);
            this.f23295e = constructor;
            Intrinsics.checkIfNull(constructor, "VerifyNumber::class.java…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        if (num != null) {
            objArr[0] = Integer.valueOf(num.intValue());
            if (str == null) {
                JsonDataException m10129n3 = C9712b.m10129n("message", "message", abstractC4476h);
                Intrinsics.checkIfNull(m10129n3, "missingProperty(\"message\", \"message\", reader)");
                throw m10129n3;
            }
            objArr[1] = str;
            objArr[2] = consent;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = null;
            Object newInstance = constructor.newInstance(objArr);
            Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return (VerifyNumber) newInstance;
        }
        JsonDataException m10129n4 = C9712b.m10129n("statusId", "status", abstractC4476h);
        Intrinsics.checkIfNull(m10129n4, "missingProperty(\"statusId\", \"status\", reader)");
        throw m10129n4;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, VerifyNumber verifyNumber) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(verifyNumber, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("status");
        this.f23292b.mo10143i(abstractC4483m, Integer.valueOf(verifyNumber.m13667d()));
        abstractC4483m.mo27417F("message");
        this.f23293c.mo10143i(abstractC4483m, verifyNumber.m13669b());
        abstractC4483m.mo27417F("consents");
        this.f23294d.mo10143i(abstractC4483m, verifyNumber.m13670a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VerifyNumber");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
