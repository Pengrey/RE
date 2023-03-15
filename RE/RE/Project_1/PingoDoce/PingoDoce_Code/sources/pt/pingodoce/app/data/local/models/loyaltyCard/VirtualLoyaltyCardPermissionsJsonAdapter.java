package pt.pingodoce.app.data.local.models.loyaltyCard;

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

/* compiled from: VirtualLoyaltyCardPermissionsJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class VirtualLoyaltyCardPermissionsJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22552a;

    /* renamed from: b */
    private final AbstractC4470f f22553b;

    /* renamed from: c */
    private volatile Constructor f22554c;

    public VirtualLoyaltyCardPermissionsJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("communications", "geoLocation", "analytics");
        Intrinsics.checkIfNull(m27461a, "of(\"communications\", \"ge…tion\",\n      \"analytics\")");
        this.f22552a = m27461a;
        Class cls = Boolean.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "communications");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Boolean::c…,\n      \"communications\")");
        this.f22553b = m27366f;
    }

    /* renamed from: k */
    public VirtualLoyaltyCardPermissions mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        int i = -1;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22552a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                bool = (Boolean) this.f22553b.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v = C9712b.m10121v("communications", "communications", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"communic…\"communications\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                bool2 = (Boolean) this.f22553b.mo10144b(abstractC4476h);
                if (bool2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("geoLocation", "geoLocation", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"geoLocat…   \"geoLocation\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                bool3 = (Boolean) this.f22553b.mo10144b(abstractC4476h);
                if (bool3 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("analytics", "analytics", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"analytic…     \"analytics\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            return new VirtualLoyaltyCardPermissions(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
        }
        Constructor constructor = this.f22554c;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = VirtualLoyaltyCardPermissions.class.getDeclaredConstructor(cls, cls, cls, Integer.TYPE, C9712b.f25570c);
            this.f22554c = constructor;
            Intrinsics.checkIfNull(constructor, "VirtualLoyaltyCardPermis…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(bool, bool2, bool3, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (VirtualLoyaltyCardPermissions) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, VirtualLoyaltyCardPermissions virtualLoyaltyCardPermissions) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(virtualLoyaltyCardPermissions, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("communications");
        this.f22553b.mo10143i(abstractC4483m, Boolean.valueOf(virtualLoyaltyCardPermissions.m14548b()));
        abstractC4483m.mo27417F("geoLocation");
        this.f22553b.mo10143i(abstractC4483m, Boolean.valueOf(virtualLoyaltyCardPermissions.m14547c()));
        abstractC4483m.mo27417F("analytics");
        this.f22553b.mo10143i(abstractC4483m, Boolean.valueOf(virtualLoyaltyCardPermissions.m14549a()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(51);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VirtualLoyaltyCardPermissions");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
