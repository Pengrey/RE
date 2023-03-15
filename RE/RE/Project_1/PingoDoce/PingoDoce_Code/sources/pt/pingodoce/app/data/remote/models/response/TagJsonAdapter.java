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

/* compiled from: TagJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class TagJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23273a;

    /* renamed from: b */
    private final AbstractC4470f f23274b;

    /* renamed from: c */
    private final AbstractC4470f f23275c;

    /* renamed from: d */
    private volatile Constructor f23276d;

    public TagJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("elasticID", "id", "name", "primaryColor", "secondaryColor");
        Intrinsics.checkIfNull(m27461a, "of(\"elasticID\", \"id\", \"n…Color\", \"secondaryColor\")");
        this.f23273a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "elasticId");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…Set(),\n      \"elasticId\")");
        this.f23274b = m27366f;
        Class cls = Integer.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "id");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Int::class.java, emptySet(), \"id\")");
        this.f23275c = m27366f2;
    }

    /* renamed from: k */
    public Tag mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23273a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f23274b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("elasticId", "elasticID", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"elasticI…     \"elasticID\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                num = (Integer) this.f23275c.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("id", "id", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"id\", \"id\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str2 = (String) this.f23274b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("name", "name", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"name\", \"name\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                str3 = (String) this.f23274b.mo10144b(abstractC4476h);
                if (str3 == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("primaryColor", "primaryColor", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"primaryC…  \"primaryColor\", reader)");
                    throw m10121v4;
                }
                i &= -9;
            } else if (mo27436d0 == 4) {
                str4 = (String) this.f23274b.mo10144b(abstractC4476h);
                if (str4 == null) {
                    JsonDataException m10121v5 = C9712b.m10121v("secondaryColor", "secondaryColor", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"secondar…\"secondaryColor\", reader)");
                    throw m10121v5;
                }
                i &= -17;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -32) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            int intValue = num.intValue();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            return new Tag(str, intValue, str2, str3, str4);
        }
        Constructor constructor = this.f23276d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Tag.class.getDeclaredConstructor(String.class, cls, String.class, String.class, String.class, cls, C9712b.f25570c);
            this.f23276d = constructor;
            Intrinsics.checkIfNull(constructor, "Tag::class.java.getDecla…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, num, str2, str3, str4, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Tag) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Tag tag) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(tag, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("elasticID");
        this.f23274b.mo10143i(abstractC4483m, tag.m13692a());
        abstractC4483m.mo27417F("id");
        this.f23275c.mo10143i(abstractC4483m, Integer.valueOf(tag.m13691b()));
        abstractC4483m.mo27417F("name");
        this.f23274b.mo10143i(abstractC4483m, tag.m13690c());
        abstractC4483m.mo27417F("primaryColor");
        this.f23274b.mo10143i(abstractC4483m, tag.m13689d());
        abstractC4483m.mo27417F("secondaryColor");
        this.f23274b.mo10143i(abstractC4483m, tag.m13687f());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Tag");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
