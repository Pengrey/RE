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

/* compiled from: ShoppingListUpdateResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ShoppingListUpdateResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23243a;

    /* renamed from: b */
    private final AbstractC4470f f23244b;

    /* renamed from: c */
    private final AbstractC4470f f23245c;

    /* renamed from: d */
    private volatile Constructor f23246d;

    public ShoppingListUpdateResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "shoppingList");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"shoppingList\")");
        this.f23243a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f23244b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(ShoppingList.class, m208b2, "shoppingList");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(ShoppingLi…ptySet(), \"shoppingList\")");
        this.f23245c = m27366f2;
    }

    /* renamed from: k */
    public ShoppingListUpdateResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        ShoppingList shoppingList = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23243a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f23244b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                shoppingList = (ShoppingList) this.f23245c.mo10144b(abstractC4476h);
                i &= -3;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new ShoppingListUpdateResponse(str, shoppingList);
        }
        Constructor constructor = this.f23246d;
        if (constructor == null) {
            constructor = ShoppingListUpdateResponse.class.getDeclaredConstructor(String.class, ShoppingList.class, Integer.TYPE, C9712b.f25570c);
            this.f23246d = constructor;
            Intrinsics.checkIfNull(constructor, "ShoppingListUpdateRespon…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, shoppingList, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ShoppingListUpdateResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ShoppingListUpdateResponse shoppingListUpdateResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(shoppingListUpdateResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f23244b.mo10143i(abstractC4483m, shoppingListUpdateResponse.m13722a());
        abstractC4483m.mo27417F("shoppingList");
        this.f23245c.mo10143i(abstractC4483m, shoppingListUpdateResponse.m13721b());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ShoppingListUpdateResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
