package pt.pingodoce.app.data.local.models.shoppinglist;

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

/* compiled from: FriendJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class FriendJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22671a;

    /* renamed from: b */
    private final AbstractC4470f f22672b;

    /* renamed from: c */
    private final AbstractC4470f f22673c;

    /* renamed from: d */
    private final AbstractC4470f f22674d;

    /* renamed from: e */
    private volatile Constructor f22675e;

    public FriendJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "name", "imageUrl", "number", "isOwner", "canWrite", "isActive");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"name\", \"imageU…, \"canWrite\", \"isActive\")");
        this.f22671a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22672b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "imageUrl");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…  emptySet(), \"imageUrl\")");
        this.f22673c = m27366f2;
        Class cls = Boolean.TYPE;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(cls, m208b3, "isOwner");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(Boolean::c…tySet(),\n      \"isOwner\")");
        this.f22674d = m27366f3;
    }

    /* renamed from: k */
    public Friend mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool3 = bool2;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f22671a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    str = (String) this.f22672b.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.f22672b.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("name", "name", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"name\", \"name\", reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f22673c.mo10144b(abstractC4476h);
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.f22672b.mo10144b(abstractC4476h);
                    if (str4 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("number", "number", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"number\",…r\",\n              reader)");
                        throw m10121v3;
                    }
                    i &= -9;
                    break;
                case 4:
                    bool = (Boolean) this.f22674d.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("isOwner", "isOwner", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"isOwner\"…       \"isOwner\", reader)");
                        throw m10121v4;
                    }
                    i &= -17;
                    break;
                case 5:
                    bool3 = (Boolean) this.f22674d.mo10144b(abstractC4476h);
                    if (bool3 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("canWrite", "canWrite", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"canWrite…      \"canWrite\", reader)");
                        throw m10121v5;
                    }
                    i &= -33;
                    break;
                case 6:
                    bool2 = (Boolean) this.f22674d.mo10144b(abstractC4476h);
                    if (bool2 == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("isActive", "isActive", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"isActive…      \"isActive\", reader)");
                        throw m10121v6;
                    }
                    i &= -65;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -128) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
            return new Friend(str, str2, str3, str4, bool.booleanValue(), bool3.booleanValue(), bool2.booleanValue());
        }
        Constructor constructor = this.f22675e;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = Friend.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls, cls, cls, Integer.TYPE, C9712b.f25570c);
            this.f22675e = constructor;
            Intrinsics.checkIfNull(constructor, "Friend::class.java.getDe…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, bool, bool3, bool2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Friend) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Friend friend) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(friend, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f22672b.mo10143i(abstractC4483m, friend.m14399d());
        abstractC4483m.mo27417F("name");
        this.f22672b.mo10143i(abstractC4483m, friend.m14397f());
        abstractC4483m.mo27417F("imageUrl");
        this.f22673c.mo10143i(abstractC4483m, friend.m14398e());
        abstractC4483m.mo27417F("number");
        this.f22672b.mo10143i(abstractC4483m, friend.m14396h());
        abstractC4483m.mo27417F("isOwner");
        this.f22674d.mo10143i(abstractC4483m, Boolean.valueOf(friend.m14394j()));
        abstractC4483m.mo27417F("canWrite");
        this.f22674d.mo10143i(abstractC4483m, Boolean.valueOf(friend.m14400c()));
        abstractC4483m.mo27417F("isActive");
        this.f22674d.mo10143i(abstractC4483m, Boolean.valueOf(friend.m14395i()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Friend");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
