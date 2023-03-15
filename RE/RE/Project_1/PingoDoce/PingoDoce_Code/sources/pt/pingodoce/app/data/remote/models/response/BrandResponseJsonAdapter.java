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

/* compiled from: BrandResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class BrandResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23078a;

    /* renamed from: b */
    private final AbstractC4470f f23079b;

    /* renamed from: c */
    private final AbstractC4470f f23080c;

    /* renamed from: d */
    private volatile Constructor f23081d;

    public BrandResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "ownBrand", "name", "logo");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"ownBrand\", \"name\", \"logo\")");
        this.f23078a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f23079b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "ownBrand");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…ySet(),\n      \"ownBrand\")");
        this.f23080c = m27366f2;
    }

    /* renamed from: k */
    public BrandResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23078a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f23079b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                bool = (Boolean) this.f23080c.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("ownBrand", "ownBrand", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"ownBrand…      \"ownBrand\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str2 = (String) this.f23079b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("name", "name", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"name\", \"name\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                str3 = (String) this.f23079b.mo10144b(abstractC4476h);
                if (str3 == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("logo", "logo", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"logo\", \"logo\", reader)");
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
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            return new BrandResponse(str, booleanValue, str2, str3);
        }
        Constructor constructor = this.f23081d;
        if (constructor == null) {
            constructor = BrandResponse.class.getDeclaredConstructor(String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f23081d = constructor;
            Intrinsics.checkIfNull(constructor, "BrandResponse::class.jav…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, bool, str2, str3, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (BrandResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, BrandResponse brandResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(brandResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f23079b.mo10143i(abstractC4483m, brandResponse.m13912a());
        abstractC4483m.mo27417F("ownBrand");
        this.f23080c.mo10143i(abstractC4483m, Boolean.valueOf(brandResponse.m13909d()));
        abstractC4483m.mo27417F("name");
        this.f23079b.mo10143i(abstractC4483m, brandResponse.m13910c());
        abstractC4483m.mo27417F("logo");
        this.f23079b.mo10143i(abstractC4483m, brandResponse.m13911b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("BrandResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
