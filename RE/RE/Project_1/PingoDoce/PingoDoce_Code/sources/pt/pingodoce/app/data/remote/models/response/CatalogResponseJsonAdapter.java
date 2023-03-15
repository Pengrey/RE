package pt.pingodoce.app.data.remote.models.response;

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
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Category;

/* compiled from: CatalogResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class CatalogResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23103a;

    /* renamed from: b */
    private final AbstractC4470f f23104b;

    /* renamed from: c */
    private final AbstractC4470f f23105c;

    /* renamed from: d */
    private final AbstractC4470f f23106d;

    /* renamed from: e */
    private volatile Constructor f23107e;

    public CatalogResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("totalHits", "documents", "categories");
        Intrinsics.checkIfNull(m27461a, "of(\"totalHits\", \"documents\",\n      \"categories\")");
        this.f23103a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "totalHits");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class… emptySet(), \"totalHits\")");
        this.f23104b = m27366f;
        ParameterizedType m27327j = C4516s.m27327j(List.class, CatalogProduct.class);
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(m27327j, m208b2, "products");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Types.newP…  emptySet(), \"products\")");
        this.f23105c = m27366f2;
        ParameterizedType m27327j2 = C4516s.m27327j(List.class, Category.class);
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(m27327j2, m208b3, "categories");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Types.newP…et(),\n      \"categories\")");
        this.f23106d = m27366f3;
    }

    /* renamed from: k */
    public CatalogResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        List list2 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23103a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                num = (Integer) this.f23104b.mo10144b(abstractC4476h);
                if (num == null) {
                    JsonDataException m10121v = C9712b.m10121v("totalHits", "totalHits", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"totalHit…     \"totalHits\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                list = (List) this.f23105c.mo10144b(abstractC4476h);
                if (list == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("products", "documents", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"products\", \"documents\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                list2 = (List) this.f23106d.mo10144b(abstractC4476h);
                if (list2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("categories", "categories", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"categories\", \"categories\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            int intValue = num.intValue();
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.products.CatalogProduct>");
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<pt.pingodoce.app.data.local.models.products.Category>");
            return new CatalogResponse(intValue, list, list2);
        }
        Constructor constructor = this.f23107e;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = CatalogResponse.class.getDeclaredConstructor(cls, List.class, List.class, cls, C9712b.f25570c);
            this.f23107e = constructor;
            Intrinsics.checkIfNull(constructor, "CatalogResponse::class.j…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, list, list2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (CatalogResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, CatalogResponse catalogResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(catalogResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("totalHits");
        this.f23104b.mo10143i(abstractC4483m, Integer.valueOf(catalogResponse.m13883c()));
        abstractC4483m.mo27417F("documents");
        this.f23105c.mo10143i(abstractC4483m, catalogResponse.m13884b());
        abstractC4483m.mo27417F("categories");
        this.f23106d.mo10143i(abstractC4483m, catalogResponse.m13885a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CatalogResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
