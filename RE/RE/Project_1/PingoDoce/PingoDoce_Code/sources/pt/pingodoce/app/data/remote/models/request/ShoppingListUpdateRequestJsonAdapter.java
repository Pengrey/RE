package pt.pingodoce.app.data.remote.models.request;

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
import pt.pingodoce.app.data.remote.models.response.ShoppingList;

/* compiled from: ShoppingListUpdateRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ShoppingListUpdateRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22949a;

    /* renamed from: b */
    private final AbstractC4470f f22950b;

    /* renamed from: c */
    private final AbstractC4470f f22951c;

    /* renamed from: d */
    private volatile Constructor f22952d;

    public ShoppingListUpdateRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("fullResponse", "shoppinglist");
        Intrinsics.checkIfNull(m27461a, "of(\"fullResponse\", \"shoppinglist\")");
        this.f22949a = m27461a;
        Class cls = Boolean.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "fullResponse");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Boolean::c…(),\n      \"fullResponse\")");
        this.f22950b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(ShoppingList.class, m208b2, "shoppingList");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(ShoppingLi…ptySet(), \"shoppingList\")");
        this.f22951c = m27366f2;
    }

    /* renamed from: k */
    public ShoppingListUpdateRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        ShoppingList shoppingList = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22949a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                bool = (Boolean) this.f22950b.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v = C9712b.m10121v("fullResponse", "fullResponse", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"fullResp…, \"fullResponse\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1 && (shoppingList = (ShoppingList) this.f22951c.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v2 = C9712b.m10121v("shoppingList", "shoppinglist", abstractC4476h);
                Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"shopping…, \"shoppinglist\", reader)");
                throw m10121v2;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -2) {
            boolean booleanValue = bool.booleanValue();
            if (shoppingList != null) {
                return new ShoppingListUpdateRequest(booleanValue, shoppingList);
            }
            JsonDataException m10129n = C9712b.m10129n("shoppingList", "shoppinglist", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"shoppin…t\",\n              reader)");
            throw m10129n;
        }
        Constructor constructor = this.f22952d;
        if (constructor == null) {
            constructor = ShoppingListUpdateRequest.class.getDeclaredConstructor(Boolean.TYPE, ShoppingList.class, Integer.TYPE, C9712b.f25570c);
            this.f22952d = constructor;
            Intrinsics.checkIfNull(constructor, "ShoppingListUpdateReques…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        objArr[0] = bool;
        if (shoppingList == null) {
            JsonDataException m10129n2 = C9712b.m10129n("shoppingList", "shoppinglist", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"shoppin…, \"shoppinglist\", reader)");
            throw m10129n2;
        }
        objArr[1] = shoppingList;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ShoppingListUpdateRequest) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ShoppingListUpdateRequest shoppingListUpdateRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(shoppingListUpdateRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("fullResponse");
        this.f22950b.mo10143i(abstractC4483m, Boolean.valueOf(shoppingListUpdateRequest.m14055a()));
        abstractC4483m.mo27417F("shoppinglist");
        this.f22951c.mo10143i(abstractC4483m, shoppingListUpdateRequest.m14054b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ShoppingListUpdateRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
