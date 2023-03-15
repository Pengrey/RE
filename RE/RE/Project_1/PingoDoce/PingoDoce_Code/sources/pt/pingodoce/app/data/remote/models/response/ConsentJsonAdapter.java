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

/* compiled from: ConsentJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ConsentJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23123a;

    /* renamed from: b */
    private final AbstractC4470f f23124b;

    /* renamed from: c */
    private volatile Constructor f23125c;

    public ConsentJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("version", "type", "privacyUrl", "termsOfUseUrl", "title");
        Intrinsics.checkIfNull(m27461a, "of(\"version\", \"type\", \"p…\"termsOfUseUrl\", \"title\")");
        this.f23123a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "version");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…tySet(),\n      \"version\")");
        this.f23124b = m27366f;
    }

    /* renamed from: k */
    public Consent mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23123a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f23124b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("version", "version", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"version\"…       \"version\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f23124b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("type", "type", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"type\", \"type\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str3 = (String) this.f23124b.mo10144b(abstractC4476h);
                if (str3 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("privacyUrl", "privacyUrl", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"privacyU…    \"privacyUrl\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                str4 = (String) this.f23124b.mo10144b(abstractC4476h);
                if (str4 == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("termsOfUseUrl", "termsOfUseUrl", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"termsOfU… \"termsOfUseUrl\", reader)");
                    throw m10121v4;
                }
                i &= -9;
            } else if (mo27436d0 == 4) {
                str5 = (String) this.f23124b.mo10144b(abstractC4476h);
                if (str5 == null) {
                    JsonDataException m10121v5 = C9712b.m10121v("title", "title", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"title\", …e\",\n              reader)");
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
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            return new Consent(str, str2, str3, str4, str5);
        }
        Constructor constructor = this.f23125c;
        if (constructor == null) {
            constructor = Consent.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f23125c = constructor;
            Intrinsics.checkIfNull(constructor, "Consent::class.java.getD…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, str5, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Consent) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Consent consent) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(consent, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("version");
        this.f23124b.mo10143i(abstractC4483m, consent.m13863e());
        abstractC4483m.mo27417F("type");
        this.f23124b.mo10143i(abstractC4483m, consent.m13864d());
        abstractC4483m.mo27417F("privacyUrl");
        this.f23124b.mo10143i(abstractC4483m, consent.m13867a());
        abstractC4483m.mo27417F("termsOfUseUrl");
        this.f23124b.mo10143i(abstractC4483m, consent.m13866b());
        abstractC4483m.mo27417F("title");
        this.f23124b.mo10143i(abstractC4483m, consent.m13865c());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Consent");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
