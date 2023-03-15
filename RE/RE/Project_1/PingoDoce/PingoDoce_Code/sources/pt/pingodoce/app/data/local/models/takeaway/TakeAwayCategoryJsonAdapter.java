package pt.pingodoce.app.data.local.models.takeaway;

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

/* compiled from: TakeAwayCategoryJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class TakeAwayCategoryJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22756a;

    /* renamed from: b */
    private final AbstractC4470f f22757b;

    /* renamed from: c */
    private final AbstractC4470f f22758c;

    /* renamed from: d */
    private volatile Constructor f22759d;

    public TakeAwayCategoryJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("code", "name", "imageUrl", "isHighlight");
        Intrinsics.checkIfNull(m27461a, "of(\"code\", \"name\", \"imag…rl\",\n      \"isHighlight\")");
        this.f22756a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22757b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "isHighlight");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…t(),\n      \"isHighlight\")");
        this.f22758c = m27366f2;
    }

    /* renamed from: k */
    public TakeAwayCategory mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22756a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22757b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("id", "code", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"code\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f22757b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("name", "name", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"name\", \"name\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str3 = (String) this.f22757b.mo10144b(abstractC4476h);
                if (str3 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("imageUrl", "imageUrl", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"imageUrl…      \"imageUrl\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                bool = (Boolean) this.f22758c.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("isHighlight", "isHighlight", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"isHighli…   \"isHighlight\", reader)");
                    throw m10121v4;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -16) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            return new TakeAwayCategory(str, str2, str3, bool.booleanValue());
        }
        Constructor constructor = this.f22759d;
        if (constructor == null) {
            constructor = TakeAwayCategory.class.getDeclaredConstructor(String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, C9712b.f25570c);
            this.f22759d = constructor;
            Intrinsics.checkIfNull(constructor, "TakeAwayCategory::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, bool, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TakeAwayCategory) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, TakeAwayCategory takeAwayCategory) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(takeAwayCategory, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("code");
        this.f22757b.mo10143i(abstractC4483m, takeAwayCategory.m14293a());
        abstractC4483m.mo27417F("name");
        this.f22757b.mo10143i(abstractC4483m, takeAwayCategory.m14291c());
        abstractC4483m.mo27417F("imageUrl");
        this.f22757b.mo10143i(abstractC4483m, takeAwayCategory.m14292b());
        abstractC4483m.mo27417F("isHighlight");
        this.f22758c.mo10143i(abstractC4483m, Boolean.valueOf(takeAwayCategory.m14290d()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TakeAwayCategory");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
