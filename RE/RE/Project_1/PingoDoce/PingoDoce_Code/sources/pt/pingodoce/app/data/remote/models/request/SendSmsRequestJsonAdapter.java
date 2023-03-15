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
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: SendSmsRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class SendSmsRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22932a;

    /* renamed from: b */
    private final AbstractC4470f f22933b;

    /* renamed from: c */
    private final AbstractC4470f f22934c;

    /* renamed from: d */
    private volatile Constructor f22935d;

    public SendSmsRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("phoneNumber", "consents");
        Intrinsics.checkIfNull(m27461a, "of(\"phoneNumber\", \"consents\")");
        this.f22932a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "phoneNumber");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…t(),\n      \"phoneNumber\")");
        this.f22933b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(Consent.class, m208b2, "consent");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Consent::c…   emptySet(), \"consent\")");
        this.f22934c = m27366f2;
    }

    /* renamed from: k */
    public SendSmsRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        Consent consent = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22932a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22933b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("phoneNumber", "phoneNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"phoneNum…\", \"phoneNumber\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                consent = (Consent) this.f22934c.mo10144b(abstractC4476h);
                i &= -3;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -3) {
            if (str != null) {
                return new SendSmsRequest(str, consent);
            }
            JsonDataException m10129n = C9712b.m10129n("phoneNumber", "phoneNumber", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"phoneNu…r\",\n              reader)");
            throw m10129n;
        }
        Constructor constructor = this.f22935d;
        if (constructor == null) {
            constructor = SendSmsRequest.class.getDeclaredConstructor(String.class, Consent.class, Integer.TYPE, C9712b.f25570c);
            this.f22935d = constructor;
            Intrinsics.checkIfNull(constructor, "SendSmsRequest::class.ja…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (str == null) {
            JsonDataException m10129n2 = C9712b.m10129n("phoneNumber", "phoneNumber", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"phoneNu…\", \"phoneNumber\", reader)");
            throw m10129n2;
        }
        objArr[0] = str;
        objArr[1] = consent;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (SendSmsRequest) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, SendSmsRequest sendSmsRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(sendSmsRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("phoneNumber");
        this.f22933b.mo10143i(abstractC4483m, sendSmsRequest.m14072b());
        abstractC4483m.mo27417F("consents");
        this.f22934c.mo10143i(abstractC4483m, sendSmsRequest.m14073a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SendSmsRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
