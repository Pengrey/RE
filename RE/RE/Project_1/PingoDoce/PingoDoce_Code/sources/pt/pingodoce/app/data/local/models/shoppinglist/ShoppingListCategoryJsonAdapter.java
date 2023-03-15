package pt.pingodoce.app.data.local.models.shoppinglist;

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

/* compiled from: ShoppingListCategoryJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ShoppingListCategoryJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22701a;

    /* renamed from: b */
    private final AbstractC4470f f22702b;

    /* renamed from: c */
    private final AbstractC4470f f22703c;

    /* renamed from: d */
    private volatile Constructor f22704d;

    public ShoppingListCategoryJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("name", "primaryColor", "sortOrder");
        Intrinsics.checkIfNull(m27461a, "of(\"name\", \"primaryColor\",\n      \"sortOrder\")");
        this.f22701a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "name");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.f22702b = m27366f;
        Class cls = Integer.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "sortOrder");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Int::class… emptySet(), \"sortOrder\")");
        this.f22703c = m27366f2;
    }

    /* renamed from: k */
    public ShoppingListCategory mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22701a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22702b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("name", "name", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"name\", \"name\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f22702b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("color", "primaryColor", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"color\",\n…  \"primaryColor\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                num = (Integer) this.f22703c.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("sortOrder", "sortOrder", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"sortOrde…     \"sortOrder\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            return new ShoppingListCategory(str, str2, num.intValue());
        }
        Constructor constructor = this.f22704d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = ShoppingListCategory.class.getDeclaredConstructor(String.class, String.class, cls, cls, C9712b.f25570c);
            this.f22704d = constructor;
            Intrinsics.checkIfNull(constructor, "ShoppingListCategory::cl…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, num, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ShoppingListCategory) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ShoppingListCategory shoppingListCategory) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(shoppingListCategory, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("name");
        this.f22702b.mo10143i(abstractC4483m, shoppingListCategory.m14357e());
        abstractC4483m.mo27417F("primaryColor");
        this.f22702b.mo10143i(abstractC4483m, shoppingListCategory.m14359c());
        abstractC4483m.mo27417F("sortOrder");
        this.f22703c.mo10143i(abstractC4483m, Integer.valueOf(shoppingListCategory.m14356f()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ShoppingListCategory");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
