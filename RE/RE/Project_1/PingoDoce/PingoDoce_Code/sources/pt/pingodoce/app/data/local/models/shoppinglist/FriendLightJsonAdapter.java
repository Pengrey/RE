package pt.pingodoce.app.data.local.models.shoppinglist;

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

/* compiled from: FriendLightJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class FriendLightJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22678a;

    /* renamed from: b */
    private final AbstractC4470f f22679b;

    /* renamed from: c */
    private final AbstractC4470f f22680c;

    public FriendLightJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "canWrite");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"canWrite\")");
        this.f22678a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22679b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "canWrite");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…ySet(),\n      \"canWrite\")");
        this.f22680c = m27366f2;
    }

    /* renamed from: k */
    public FriendLight mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        String str = null;
        Boolean bool = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22678a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22679b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1 && (bool = (Boolean) this.f22680c.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v2 = C9712b.m10121v("canWrite", "canWrite", abstractC4476h);
                Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"canWrite…      \"canWrite\", reader)");
                throw m10121v2;
            }
        }
        abstractC4476h.mo27433h();
        if (str == null) {
            JsonDataException m10129n = C9712b.m10129n("id", "id", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"id\", \"id\", reader)");
            throw m10129n;
        } else if (bool != null) {
            return new FriendLight(str, bool.booleanValue());
        } else {
            JsonDataException m10129n2 = C9712b.m10129n("canWrite", "canWrite", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"canWrite\", \"canWrite\", reader)");
            throw m10129n2;
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, FriendLight friendLight) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(friendLight, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f22679b.mo10143i(abstractC4483m, friendLight.m14387b());
        abstractC4483m.mo27417F("canWrite");
        this.f22680c.mo10143i(abstractC4483m, Boolean.valueOf(friendLight.m14388a()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FriendLight");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
