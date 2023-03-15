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

/* compiled from: MadeForYouJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class MadeForYouJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22887a;

    /* renamed from: b */
    private final AbstractC4470f f22888b;

    public MadeForYouJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("history");
        Intrinsics.checkIfNull(m27461a, "of(\"history\")");
        this.f22887a = m27461a;
        Class cls = Boolean.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "history");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Boolean::c…tySet(),\n      \"history\")");
        this.f22888b = m27366f;
    }

    /* renamed from: k */
    public MadeForYou mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        Boolean bool = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22887a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0 && (bool = (Boolean) this.f22888b.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v = C9712b.m10121v("history", "history", abstractC4476h);
                Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"history\"…       \"history\", reader)");
                throw m10121v;
            }
        }
        abstractC4476h.mo27433h();
        if (bool != null) {
            return new MadeForYou(bool.booleanValue());
        }
        JsonDataException m10129n = C9712b.m10129n("history", "history", abstractC4476h);
        Intrinsics.checkIfNull(m10129n, "missingProperty(\"history\", \"history\", reader)");
        throw m10129n;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, MadeForYou madeForYou) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(madeForYou, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("history");
        this.f22888b.mo10143i(abstractC4483m, Boolean.valueOf(madeForYou.m14127a()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("MadeForYou");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
