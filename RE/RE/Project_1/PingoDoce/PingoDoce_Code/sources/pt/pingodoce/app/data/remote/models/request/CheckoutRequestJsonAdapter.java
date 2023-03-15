package pt.pingodoce.app.data.remote.models.request;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;

/* compiled from: CheckoutRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class CheckoutRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22843a;

    /* renamed from: b */
    private final AbstractC4470f f22844b;

    public CheckoutRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("shoppingList");
        Intrinsics.checkIfNull(m27461a, "of(\"shoppingList\")");
        this.f22843a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(ShoppingList.class, m208b, "shoppingList");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(ShoppingLi…ptySet(), \"shoppingList\")");
        this.f22844b = m27366f;
    }

    /* renamed from: k */
    public CheckoutRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        ShoppingList shoppingList = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22843a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0 && (shoppingList = (ShoppingList) this.f22844b.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v = C9712b.m10121v("shoppingList", "shoppingList", abstractC4476h);
                Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"shopping…, \"shoppingList\", reader)");
                throw m10121v;
            }
        }
        abstractC4476h.mo27433h();
        if (shoppingList != null) {
            return new CheckoutRequest(shoppingList);
        }
        JsonDataException m10129n = C9712b.m10129n("shoppingList", "shoppingList", abstractC4476h);
        Intrinsics.checkIfNull(m10129n, "missingProperty(\"shoppin…ist\",\n            reader)");
        throw m10129n;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, CheckoutRequest checkoutRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(checkoutRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("shoppingList");
        this.f22844b.mo10143i(abstractC4483m, checkoutRequest.m14182a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckoutRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
