package pt.pingodoce.app.data.remote.models.request.parameters;

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

/* compiled from: RecommendationsParametersJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class RecommendationsParametersJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22988a;

    /* renamed from: b */
    private final AbstractC4470f f22989b;

    /* renamed from: c */
    private final AbstractC4470f f22990c;

    /* renamed from: d */
    private final AbstractC4470f f22991d;

    /* renamed from: e */
    private volatile Constructor f22992e;

    public RecommendationsParametersJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("page", "pageSize", "userHasLoyaltyCardApproved", "ompdCard");
        Intrinsics.checkIfNull(m27461a, "of(\"page\", \"pageSize\",\n …ardApproved\", \"ompdCard\")");
        this.f22988a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "page");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class.java, emptySet(), \"page\")");
        this.f22989b = m27366f;
        Class cls2 = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls2, m208b2, "userHasLoyaltyCardApproved");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…rHasLoyaltyCardApproved\")");
        this.f22990c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(String.class, m208b3, "ompdCard");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(String::cl…  emptySet(), \"ompdCard\")");
        this.f22991d = m27366f3;
    }

    /* renamed from: k */
    public RecommendationsParameters mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        int i = -1;
        String str = null;
        Integer num2 = num;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22988a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                num = (Integer) this.f22989b.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v = C9712b.m10121v("page", "page", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"page\", \"page\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                num2 = (Integer) this.f22989b.mo10144b(abstractC4476h);
                if (num2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("pageSize", "pageSize", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"pageSize…      \"pageSize\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                bool2 = (Boolean) this.f22990c.mo10144b(abstractC4476h);
                if (bool2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("userHasLoyaltyCardApproved", "userHasLoyaltyCardApproved", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"userHasL…d\",\n              reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                str = (String) this.f22991d.mo10144b(abstractC4476h);
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            return new RecommendationsParameters(num.intValue(), num2.intValue(), bool2.booleanValue(), str);
        }
        Constructor constructor = this.f22992e;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = RecommendationsParameters.class.getDeclaredConstructor(cls, cls, Boolean.TYPE, String.class, cls, C9712b.f25570c);
            this.f22992e = constructor;
            Intrinsics.checkIfNull(constructor, "RecommendationsParameter…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, num2, bool2, str, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (RecommendationsParameters) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, RecommendationsParameters recommendationsParameters) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(recommendationsParameters, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("page");
        this.f22989b.mo10143i(abstractC4483m, Integer.valueOf(recommendationsParameters.m14005b()));
        abstractC4483m.mo27417F("pageSize");
        this.f22989b.mo10143i(abstractC4483m, Integer.valueOf(recommendationsParameters.m14004c()));
        abstractC4483m.mo27417F("userHasLoyaltyCardApproved");
        this.f22990c.mo10143i(abstractC4483m, Boolean.valueOf(recommendationsParameters.m14003d()));
        abstractC4483m.mo27417F("ompdCard");
        this.f22991d.mo10143i(abstractC4483m, recommendationsParameters.m14006a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RecommendationsParameters");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
