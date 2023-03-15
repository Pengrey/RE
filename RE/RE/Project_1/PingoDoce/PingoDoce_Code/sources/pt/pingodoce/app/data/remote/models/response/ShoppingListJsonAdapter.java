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
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;

/* compiled from: ShoppingListJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ShoppingListJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23235a;

    /* renamed from: b */
    private final AbstractC4470f f23236b;

    /* renamed from: c */
    private final AbstractC4470f f23237c;

    /* renamed from: d */
    private final AbstractC4470f f23238d;

    /* renamed from: e */
    private final AbstractC4470f f23239e;

    /* renamed from: f */
    private volatile Constructor f23240f;

    public ShoppingListJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "clientId", "userId", "name", "description", "isActive", "products", "sharedWith", "dateCreated", "dateUpdated");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"clientId\", \"us…eCreated\", \"dateUpdated\")");
        this.f23235a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f23236b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "isActive");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…ySet(),\n      \"isActive\")");
        this.f23237c = m27366f2;
        ParameterizedType m27327j = C4516s.m27327j(List.class, ShoppingListProduct.class);
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(m27327j, m208b3, "products");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Types.newP…, emptySet(), \"products\")");
        this.f23238d = m27366f3;
        ParameterizedType m27327j2 = C4516s.m27327j(List.class, Friend.class);
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(m27327j2, m208b4, "users");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Types.newP…     emptySet(), \"users\")");
        this.f23239e = m27366f4;
    }

    /* renamed from: k */
    public ShoppingList mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list2 = null;
        String str6 = null;
        String str7 = null;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f23235a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str = (String) this.f23236b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.f23236b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("clientId", "clientId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"clientId…      \"clientId\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f23236b.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("userId", "userId", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"userId\",…d\",\n              reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.f23236b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("name", "name", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"name\", \"name\", reader)");
                        throw m10121v4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.f23236b.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("description", "description", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"descript…   \"description\", reader)");
                        throw m10121v5;
                    }
                    i &= -17;
                    break;
                case 5:
                    bool = (Boolean) this.f23237c.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("isActive", "isActive", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"isActive…      \"isActive\", reader)");
                        throw m10121v6;
                    }
                    i &= -33;
                    break;
                case 6:
                    list = (List) this.f23238d.mo10144b(abstractC4476h);
                    if (list == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("products", "products", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"products\", \"products\", reader)");
                        throw m10121v7;
                    }
                    i &= -65;
                    break;
                case 7:
                    list2 = (List) this.f23239e.mo10144b(abstractC4476h);
                    if (list2 == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("users", "sharedWith", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"users\",\n…    \"sharedWith\", reader)");
                        throw m10121v8;
                    }
                    i &= -129;
                    break;
                case 8:
                    str7 = (String) this.f23236b.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("dateCreated", "dateCreated", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"dateCrea…   \"dateCreated\", reader)");
                        throw m10121v9;
                    }
                    i &= -257;
                    break;
                case 9:
                    str6 = (String) this.f23236b.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v10 = C9712b.m10121v("dateUpdated", "dateUpdated", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v10, "unexpectedNull(\"dateUpda…   \"dateUpdated\", reader)");
                        throw m10121v10;
                    }
                    i &= -513;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -1024) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct>");
            List m20953b = C6431d0.m20953b(list);
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<pt.pingodoce.app.data.local.models.shoppinglist.Friend>");
            List m20953b2 = C6431d0.m20953b(list2);
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            return new ShoppingList(str, str2, str3, str4, str5, booleanValue, m20953b, m20953b2, str7, str6);
        }
        String str8 = str6;
        Constructor constructor = this.f23240f;
        if (constructor == null) {
            constructor = ShoppingList.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, List.class, List.class, String.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f23240f = constructor;
            Intrinsics.checkIfNull(constructor, "ShoppingList::class.java…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, str5, bool, list, list2, str7, str8, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ShoppingList) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ShoppingList shoppingList) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(shoppingList, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f23236b.mo10143i(abstractC4483m, shoppingList.m13737j());
        abstractC4483m.mo27417F("clientId");
        this.f23236b.mo10143i(abstractC4483m, shoppingList.m13741e());
        abstractC4483m.mo27417F("userId");
        this.f23236b.mo10143i(abstractC4483m, shoppingList.m13734n());
        abstractC4483m.mo27417F("name");
        this.f23236b.mo10143i(abstractC4483m, shoppingList.m13736k());
        abstractC4483m.mo27417F("description");
        this.f23236b.mo10143i(abstractC4483m, shoppingList.m13738i());
        abstractC4483m.mo27417F("isActive");
        this.f23237c.mo10143i(abstractC4483m, Boolean.valueOf(shoppingList.m13732s()));
        abstractC4483m.mo27417F("products");
        this.f23238d.mo10143i(abstractC4483m, shoppingList.m13735m());
        abstractC4483m.mo27417F("sharedWith");
        this.f23239e.mo10143i(abstractC4483m, shoppingList.m13733r());
        abstractC4483m.mo27417F("dateCreated");
        this.f23236b.mo10143i(abstractC4483m, shoppingList.m13740f());
        abstractC4483m.mo27417F("dateUpdated");
        this.f23236b.mo10143i(abstractC4483m, shoppingList.m13739h());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ShoppingList");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
