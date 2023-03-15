package pt.pingodoce.app.presentation.common.loyaltycard.resume;

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

/* compiled from: OnboardingResumeInfoRowItemJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class OnboardingResumeInfoRowItemJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23916a;

    /* renamed from: b */
    private final AbstractC4470f f23917b;

    /* renamed from: c */
    private final AbstractC4470f f23918c;

    /* renamed from: d */
    private volatile Constructor f23919d;

    public OnboardingResumeInfoRowItemJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("label", "selected");
        Intrinsics.checkIfNull(m27461a, "of(\"label\", \"selected\")");
        this.f23916a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "label");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…mptySet(),\n      \"label\")");
        this.f23917b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "selected");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…ySet(),\n      \"selected\")");
        this.f23918c = m27366f2;
    }

    /* renamed from: k */
    public C14956OnboardingResumeInfoRowItem mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23916a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f23917b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("label", "label", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"label\", …bel\",\n            reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                bool = (Boolean) this.f23918c.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("selected", "selected", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"selected…      \"selected\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -3) {
            if (str != null) {
                return new C14956OnboardingResumeInfoRowItem(str, bool.booleanValue());
            }
            JsonDataException m10129n = C9712b.m10129n("label", "label", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"label\", \"label\", reader)");
            throw m10129n;
        }
        Constructor constructor = this.f23919d;
        if (constructor == null) {
            constructor = C14956OnboardingResumeInfoRowItem.class.getDeclaredConstructor(String.class, Boolean.TYPE, Integer.TYPE, C9712b.f25570c);
            this.f23919d = constructor;
            Intrinsics.checkIfNull(constructor, "OnboardingResumeInfoRowI…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (str == null) {
            JsonDataException m10129n2 = C9712b.m10129n("label", "label", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"label\", \"label\", reader)");
            throw m10129n2;
        }
        objArr[0] = str;
        objArr[1] = bool;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (C14956OnboardingResumeInfoRowItem) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, C14956OnboardingResumeInfoRowItem c14956OnboardingResumeInfoRowItem) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(c14956OnboardingResumeInfoRowItem, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("label");
        this.f23917b.mo10143i(abstractC4483m, c14956OnboardingResumeInfoRowItem.m12638a());
        abstractC4483m.mo27417F("selected");
        this.f23918c.mo10143i(abstractC4483m, Boolean.valueOf(c14956OnboardingResumeInfoRowItem.m12637b()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OnboardingResumeInfoRowItem");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
