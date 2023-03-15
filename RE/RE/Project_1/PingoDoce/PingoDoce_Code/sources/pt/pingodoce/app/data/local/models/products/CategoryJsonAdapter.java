package pt.pingodoce.app.data.local.models.products;

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

/* compiled from: CategoryJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class CategoryJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22588a;

    /* renamed from: b */
    private final AbstractC4470f f22589b;

    /* renamed from: c */
    private final AbstractC4470f f22590c;

    /* renamed from: d */
    private final AbstractC4470f f22591d;

    /* renamed from: e */
    private volatile Constructor f22592e;

    public CategoryJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "title", "primaryColor", "secondaryColor", "count", "isTailoredForYou");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"title\", \"prima…unt\", \"isTailoredForYou\")");
        this.f22588a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class.java, emptySet(), \"id\")");
        this.f22589b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "title");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.f22590c = m27366f2;
        Class cls2 = Boolean.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls2, m208b3, "isTailoredForYou");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Boolean::c…      \"isTailoredForYou\")");
        this.f22591d = m27366f3;
    }

    /* renamed from: k */
    public Category mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f22588a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    num = (Integer) this.f22589b.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str = (String) this.f22590c.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("title", "title", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"title\", …e\",\n              reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.f22590c.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("primaryColor", "primaryColor", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"primaryC…  \"primaryColor\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str3 = (String) this.f22590c.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("secondaryColor", "secondaryColor", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"secondar…\"secondaryColor\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str4 = (String) this.f22590c.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("count", "count", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"count\", …t\",\n              reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    bool = (Boolean) this.f22591d.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("isTailoredForYou", "isTailoredForYou", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"isTailor…sTailoredForYou\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -64) {
            int intValue = num.intValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            return new Category(intValue, str, str2, str3, str4, bool.booleanValue());
        }
        Constructor constructor = this.f22592e;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Category.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, Boolean.TYPE, cls, C9712b.f25570c);
            this.f22592e = constructor;
            Intrinsics.checkIfNull(constructor, "Category::class.java.get…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, str, str2, str3, str4, bool, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Category) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Category category) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(category, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f22589b.mo10143i(abstractC4483m, Integer.valueOf(category.m14491b()));
        abstractC4483m.mo27417F("title");
        this.f22590c.mo10143i(abstractC4483m, category.m14487f());
        abstractC4483m.mo27417F("primaryColor");
        this.f22590c.mo10143i(abstractC4483m, category.m14490c());
        abstractC4483m.mo27417F("secondaryColor");
        this.f22590c.mo10143i(abstractC4483m, category.m14489d());
        abstractC4483m.mo27417F("count");
        this.f22590c.mo10143i(abstractC4483m, category.m14492a());
        abstractC4483m.mo27417F("isTailoredForYou");
        this.f22591d.mo10143i(abstractC4483m, Boolean.valueOf(category.m14486h()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Category");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
