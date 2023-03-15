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
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: GuestAccessRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class GuestAccessRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22869a;

    /* renamed from: b */
    private final AbstractC4470f f22870b;

    /* renamed from: c */
    private final AbstractC4470f f22871c;

    /* renamed from: d */
    private final AbstractC4470f f22872d;

    /* renamed from: e */
    private final AbstractC4470f f22873e;

    public GuestAccessRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("installationId", "consent", "deviceTokenPayload", "preferences");
        Intrinsics.checkIfNull(m27461a, "of(\"installationId\", \"co…nPayload\", \"preferences\")");
        this.f22869a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "installationId");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…,\n      \"installationId\")");
        this.f22870b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(Consent.class, m208b2, "consent");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Consent::c…tySet(),\n      \"consent\")");
        this.f22871c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(DeviceTokenRequest.class, m208b3, "deviceTokenPayload");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(DeviceToke…(), \"deviceTokenPayload\")");
        this.f22872d = m27366f3;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(AppNotifications.class, m208b4, "preferences");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(AppNotific…mptySet(), \"preferences\")");
        this.f22873e = m27366f4;
    }

    /* renamed from: k */
    public GuestAccessRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        String str = null;
        Consent consent = null;
        DeviceTokenRequest deviceTokenRequest = null;
        AppNotifications appNotifications = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22869a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22870b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("installationId", "installationId", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"installa…\"installationId\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                consent = (Consent) this.f22871c.mo10144b(abstractC4476h);
                if (consent == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("consent", "consent", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"consent\"…       \"consent\", reader)");
                    throw m10121v2;
                }
            } else if (mo27436d0 == 2) {
                deviceTokenRequest = (DeviceTokenRequest) this.f22872d.mo10144b(abstractC4476h);
                if (deviceTokenRequest == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("deviceTokenPayload", "deviceTokenPayload", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"deviceTo…iceTokenPayload\", reader)");
                    throw m10121v3;
                }
            } else if (mo27436d0 == 3 && (appNotifications = (AppNotifications) this.f22873e.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v4 = C9712b.m10121v("preferences", "preferences", abstractC4476h);
                Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"preferen…\", \"preferences\", reader)");
                throw m10121v4;
            }
        }
        abstractC4476h.mo27433h();
        if (str == null) {
            JsonDataException m10129n = C9712b.m10129n("installationId", "installationId", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"install…\"installationId\", reader)");
            throw m10129n;
        } else if (consent == null) {
            JsonDataException m10129n2 = C9712b.m10129n("consent", "consent", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"consent\", \"consent\", reader)");
            throw m10129n2;
        } else if (deviceTokenRequest == null) {
            JsonDataException m10129n3 = C9712b.m10129n("deviceTokenPayload", "deviceTokenPayload", abstractC4476h);
            Intrinsics.checkIfNull(m10129n3, "missingProperty(\"deviceT…iceTokenPayload\", reader)");
            throw m10129n3;
        } else if (appNotifications != null) {
            return new GuestAccessRequest(str, consent, deviceTokenRequest, appNotifications);
        } else {
            JsonDataException m10129n4 = C9712b.m10129n("preferences", "preferences", abstractC4476h);
            Intrinsics.checkIfNull(m10129n4, "missingProperty(\"prefere…ces\",\n            reader)");
            throw m10129n4;
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, GuestAccessRequest guestAccessRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(guestAccessRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("installationId");
        this.f22870b.mo10143i(abstractC4483m, guestAccessRequest.m14147c());
        abstractC4483m.mo27417F("consent");
        this.f22871c.mo10143i(abstractC4483m, guestAccessRequest.m14149a());
        abstractC4483m.mo27417F("deviceTokenPayload");
        this.f22872d.mo10143i(abstractC4483m, guestAccessRequest.m14148b());
        abstractC4483m.mo27417F("preferences");
        this.f22873e.mo10143i(abstractC4483m, guestAccessRequest.m14146d());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GuestAccessRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
