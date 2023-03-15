package pt.pingodoce.app.data.remote.models.request;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.C4516s;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;
import pt.pingodoce.app.data.local.models.shoppinglist.FriendLight;

/* compiled from: SharedWithUpdateRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class SharedWithUpdateRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22938a;

    /* renamed from: b */
    private final AbstractC4470f f22939b;

    /* renamed from: c */
    private final AbstractC4470f f22940c;

    public SharedWithUpdateRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("listId", "sharedWith");
        Intrinsics.checkIfNull(m27461a, "of(\"listId\", \"sharedWith\")");
        this.f22938a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22939b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, FriendLight.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "users");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…     emptySet(), \"users\")");
        this.f22940c = m27366f2;
    }

    /* renamed from: k */
    public SharedWithUpdateRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        String str = null;
        List list = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22938a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22939b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("id", "listId", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"listId\",\n            reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1 && (list = (List) this.f22940c.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v2 = C9712b.m10121v("users", "sharedWith", abstractC4476h);
                Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"users\",\n…    \"sharedWith\", reader)");
                throw m10121v2;
            }
        }
        abstractC4476h.mo27433h();
        if (str == null) {
            JsonDataException m10129n = C9712b.m10129n("id", "listId", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"id\", \"listId\", reader)");
            throw m10129n;
        } else if (list != null) {
            return new SharedWithUpdateRequest(str, list);
        } else {
            JsonDataException m10129n2 = C9712b.m10129n("users", "sharedWith", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"users\", \"sharedWith\", reader)");
            throw m10129n2;
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, SharedWithUpdateRequest sharedWithUpdateRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(sharedWithUpdateRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("listId");
        this.f22939b.mo10143i(abstractC4483m, sharedWithUpdateRequest.m14067a());
        abstractC4483m.mo27417F("sharedWith");
        this.f22940c.mo10143i(abstractC4483m, sharedWithUpdateRequest.m14066b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SharedWithUpdateRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
