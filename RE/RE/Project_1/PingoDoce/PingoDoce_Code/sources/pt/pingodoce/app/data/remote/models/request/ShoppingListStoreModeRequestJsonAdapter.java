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
import pt.pingodoce.app.data.local.models.stores.Coordinates;

/* compiled from: ShoppingListStoreModeRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ShoppingListStoreModeRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22943a;

    /* renamed from: b */
    private final AbstractC4470f f22944b;

    /* renamed from: c */
    private final AbstractC4470f f22945c;

    /* renamed from: d */
    private volatile Constructor f22946d;

    public ShoppingListStoreModeRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("listId", "coordinates");
        Intrinsics.checkIfNull(m27461a, "of(\"listId\", \"coordinates\")");
        this.f22943a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "listId");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…ptySet(),\n      \"listId\")");
        this.f22944b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(Coordinates.class, m208b2, "coordinates");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Coordinate…mptySet(), \"coordinates\")");
        this.f22945c = m27366f2;
    }

    /* renamed from: k */
    public ShoppingListStoreModeRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        Coordinates coordinates = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22943a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22944b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("listId", "listId", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"listId\",…        \"listId\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                coordinates = (Coordinates) this.f22945c.mo10144b(abstractC4476h);
                i &= -3;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -3) {
            if (str != null) {
                return new ShoppingListStoreModeRequest(str, coordinates);
            }
            JsonDataException m10129n = C9712b.m10129n("listId", "listId", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"listId\", \"listId\", reader)");
            throw m10129n;
        }
        Constructor constructor = this.f22946d;
        if (constructor == null) {
            constructor = ShoppingListStoreModeRequest.class.getDeclaredConstructor(String.class, Coordinates.class, Integer.TYPE, C9712b.f25570c);
            this.f22946d = constructor;
            Intrinsics.checkIfNull(constructor, "ShoppingListStoreModeReq…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (str == null) {
            JsonDataException m10129n2 = C9712b.m10129n("listId", "listId", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"listId\", \"listId\", reader)");
            throw m10129n2;
        }
        objArr[0] = str;
        objArr[1] = coordinates;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ShoppingListStoreModeRequest) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ShoppingListStoreModeRequest shoppingListStoreModeRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(shoppingListStoreModeRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("listId");
        this.f22944b.mo10143i(abstractC4483m, shoppingListStoreModeRequest.m14060b());
        abstractC4483m.mo27417F("coordinates");
        this.f22945c.mo10143i(abstractC4483m, shoppingListStoreModeRequest.m14061a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ShoppingListStoreModeRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
