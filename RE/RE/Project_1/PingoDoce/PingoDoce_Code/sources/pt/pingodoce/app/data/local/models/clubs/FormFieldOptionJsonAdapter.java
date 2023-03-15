package pt.pingodoce.app.data.local.models.clubs;

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

/* compiled from: FormFieldOptionJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class FormFieldOptionJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22511a;

    /* renamed from: b */
    private final AbstractC4470f f22512b;

    /* renamed from: c */
    private volatile Constructor f22513c;

    public FormFieldOptionJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("key", "value");
        Intrinsics.checkIfNull(m27461a, "of(\"key\", \"value\")");
        this.f22511a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "key");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl… emptySet(),\n      \"key\")");
        this.f22512b = m27366f;
    }

    /* renamed from: k */
    public FormFieldOption mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22511a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22512b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("key", "key", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"key\", \"key\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f22512b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("value__", "value", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"value__\"…e\",\n              reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            return new FormFieldOption(str, str2);
        }
        Constructor constructor = this.f22513c;
        if (constructor == null) {
            constructor = FormFieldOption.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f22513c = constructor;
            Intrinsics.checkIfNull(constructor, "FormFieldOption::class.j…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (FormFieldOption) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, FormFieldOption formFieldOption) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(formFieldOption, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("key");
        this.f22512b.mo10143i(abstractC4483m, formFieldOption.m14602a());
        abstractC4483m.mo27417F("value");
        this.f22512b.mo10143i(abstractC4483m, formFieldOption.m14601b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FormFieldOption");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
