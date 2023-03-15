package pt.pingodoce.app.data.remote.models.request;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: ValidateSmsRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ValidateSmsRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22974a;

    /* renamed from: b */
    private final AbstractC4470f f22975b;

    public ValidateSmsRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("phoneNumber", "code");
        Intrinsics.checkIfNull(m27461a, "of(\"phoneNumber\", \"code\")");
        this.f22974a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "phoneNumber");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…t(),\n      \"phoneNumber\")");
        this.f22975b = m27366f;
    }

    /* renamed from: k */
    public ValidateSmsRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        String str = null;
        String str2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22974a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22975b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("phoneNumber", "phoneNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"phoneNum…\", \"phoneNumber\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1 && (str2 = (String) this.f22975b.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v2 = C9712b.m10121v("code", "code", abstractC4476h);
                Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"code\", \"code\",\n            reader)");
                throw m10121v2;
            }
        }
        abstractC4476h.mo27433h();
        if (str == null) {
            JsonDataException m10129n = C9712b.m10129n("phoneNumber", "phoneNumber", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"phoneNu…ber\",\n            reader)");
            throw m10129n;
        } else if (str2 != null) {
            return new ValidateSmsRequest(str, str2);
        } else {
            JsonDataException m10129n2 = C9712b.m10129n("code", "code", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"code\", \"code\", reader)");
            throw m10129n2;
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ValidateSmsRequest validateSmsRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(validateSmsRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("phoneNumber");
        this.f22975b.mo10143i(abstractC4483m, validateSmsRequest.m14019b());
        abstractC4483m.mo27417F("code");
        this.f22975b.mo10143i(abstractC4483m, validateSmsRequest.m14020a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ValidateSmsRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
