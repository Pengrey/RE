package pt.pingodoce.app.data.local.models.clubs;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.C4516s;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: FormFieldJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class FormFieldJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22504a;

    /* renamed from: b */
    private final AbstractC4470f f22505b;

    /* renamed from: c */
    private final AbstractC4470f f22506c;

    /* renamed from: d */
    private final AbstractC4470f f22507d;

    /* renamed from: e */
    private volatile Constructor f22508e;

    public FormFieldJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("field", "label", "type", "options", "regex", "required", "isUnique", "group", "fieldGroup");
        Intrinsics.checkIfNull(m27461a, "of(\"field\", \"label\", \"ty…\", \"group\", \"fieldGroup\")");
        this.f22504a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "field");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…mptySet(),\n      \"field\")");
        this.f22505b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, FormFieldOption.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "options");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…   emptySet(), \"options\")");
        this.f22506c = m27366f2;
        Class cls = Boolean.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls, m208b3, "required");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Boolean::c…ySet(),\n      \"required\")");
        this.f22507d = m27366f3;
    }

    /* renamed from: k */
    public FormField mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool2 = bool;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f22504a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str = (String) this.f22505b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v = C9712b.m10121v("field_", "field", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"field_\",…d\",\n              reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.f22505b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("label", "label", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"label\", …l\",\n              reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f22505b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("type", "type", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"type\", \"type\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    list = (List) this.f22506c.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("options_", "options", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"options_\", \"options\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str4 = (String) this.f22505b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("regex", "regex", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"regex\", …x\",\n              reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    bool = (Boolean) this.f22507d.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("required", "required", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"required…      \"required\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    bool2 = (Boolean) this.f22507d.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("isUnique", "isUnique", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"isUnique…      \"isUnique\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    str6 = (String) this.f22505b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("group", "group", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"group\", …p\",\n              reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    str5 = (String) this.f22505b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("fieldGroup", "fieldGroup", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"fieldGro…    \"fieldGroup\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -512) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.clubs.FormFieldOption>");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            return new FormField(str, str2, str3, list, str4, booleanValue, booleanValue2, str6, str5);
        }
        String str7 = str5;
        Constructor constructor = this.f22508e;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = FormField.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, String.class, cls, cls, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f22508e = constructor;
            Intrinsics.checkIfNull(constructor, "FormField::class.java.ge…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, list, str4, bool, bool2, str6, str7, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (FormField) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, FormField formField) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(formField, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("field");
        this.f22505b.mo10143i(abstractC4483m, formField.m14615a());
        abstractC4483m.mo27417F("label");
        this.f22505b.mo10143i(abstractC4483m, formField.m14612d());
        abstractC4483m.mo27417F("type");
        this.f22505b.mo10143i(abstractC4483m, formField.m14608i());
        abstractC4483m.mo27417F("options");
        this.f22506c.mo10143i(abstractC4483m, formField.m14611e());
        abstractC4483m.mo27417F("regex");
        this.f22505b.mo10143i(abstractC4483m, formField.m14610f());
        abstractC4483m.mo27417F("required");
        this.f22507d.mo10143i(abstractC4483m, Boolean.valueOf(formField.m14609h()));
        abstractC4483m.mo27417F("isUnique");
        this.f22507d.mo10143i(abstractC4483m, Boolean.valueOf(formField.m14607j()));
        abstractC4483m.mo27417F("group");
        this.f22505b.mo10143i(abstractC4483m, formField.m14613c());
        abstractC4483m.mo27417F("fieldGroup");
        this.f22505b.mo10143i(abstractC4483m, formField.m14614b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FormField");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
