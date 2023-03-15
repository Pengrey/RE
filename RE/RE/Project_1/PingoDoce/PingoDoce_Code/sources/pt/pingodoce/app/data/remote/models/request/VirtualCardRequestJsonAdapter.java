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
import pt.pingodoce.app.data.local.models.loyaltyCard.VirtualLoyaltyCardAddress;
import pt.pingodoce.app.data.local.models.loyaltyCard.VirtualLoyaltyCardPermissions;

/* compiled from: VirtualCardRequestJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class VirtualCardRequestJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22980a;

    /* renamed from: b */
    private final AbstractC4470f f22981b;

    /* renamed from: c */
    private final AbstractC4470f f22982c;

    /* renamed from: d */
    private final AbstractC4470f f22983d;

    public VirtualCardRequestJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("firstName", "lastName", "address", "permissions");
        Intrinsics.checkIfNull(m27461a, "of(\"firstName\", \"lastNam…\"address\", \"permissions\")");
        this.f22980a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "firstName");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…Set(),\n      \"firstName\")");
        this.f22981b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(VirtualLoyaltyCardAddress.class, m208b2, "address");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(VirtualLoy…a, emptySet(), \"address\")");
        this.f22982c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(VirtualLoyaltyCardPermissions.class, m208b3, "permissions");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(VirtualLoy…mptySet(), \"permissions\")");
        this.f22983d = m27366f3;
    }

    /* renamed from: k */
    public VirtualCardRequest mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        String str = null;
        String str2 = null;
        VirtualLoyaltyCardAddress virtualLoyaltyCardAddress = null;
        VirtualLoyaltyCardPermissions virtualLoyaltyCardPermissions = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f22980a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f22981b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("firstName", "firstName", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"firstNam…     \"firstName\", reader)");
                    throw m10121v;
                }
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f22981b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("lastName", "lastName", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"lastName…      \"lastName\", reader)");
                    throw m10121v2;
                }
            } else if (mo27436d0 == 2) {
                virtualLoyaltyCardAddress = (VirtualLoyaltyCardAddress) this.f22982c.mo10144b(abstractC4476h);
                if (virtualLoyaltyCardAddress == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("address", "address", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"address\", \"address\", reader)");
                    throw m10121v3;
                }
            } else if (mo27436d0 == 3 && (virtualLoyaltyCardPermissions = (VirtualLoyaltyCardPermissions) this.f22983d.mo10144b(abstractC4476h)) == null) {
                JsonDataException m10121v4 = C9712b.m10121v("permissions", "permissions", abstractC4476h);
                Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"permissi…\", \"permissions\", reader)");
                throw m10121v4;
            }
        }
        abstractC4476h.mo27433h();
        if (str == null) {
            JsonDataException m10129n = C9712b.m10129n("firstName", "firstName", abstractC4476h);
            Intrinsics.checkIfNull(m10129n, "missingProperty(\"firstName\", \"firstName\", reader)");
            throw m10129n;
        } else if (str2 == null) {
            JsonDataException m10129n2 = C9712b.m10129n("lastName", "lastName", abstractC4476h);
            Intrinsics.checkIfNull(m10129n2, "missingProperty(\"lastName\", \"lastName\", reader)");
            throw m10129n2;
        } else if (virtualLoyaltyCardAddress == null) {
            JsonDataException m10129n3 = C9712b.m10129n("address", "address", abstractC4476h);
            Intrinsics.checkIfNull(m10129n3, "missingProperty(\"address\", \"address\", reader)");
            throw m10129n3;
        } else if (virtualLoyaltyCardPermissions != null) {
            return new VirtualCardRequest(str, str2, virtualLoyaltyCardAddress, virtualLoyaltyCardPermissions);
        } else {
            JsonDataException m10129n4 = C9712b.m10129n("permissions", "permissions", abstractC4476h);
            Intrinsics.checkIfNull(m10129n4, "missingProperty(\"permiss…ons\",\n            reader)");
            throw m10129n4;
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, VirtualCardRequest virtualCardRequest) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(virtualCardRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("firstName");
        this.f22981b.mo10143i(abstractC4483m, virtualCardRequest.m14013b());
        abstractC4483m.mo27417F("lastName");
        this.f22981b.mo10143i(abstractC4483m, virtualCardRequest.m14012c());
        abstractC4483m.mo27417F("address");
        this.f22982c.mo10143i(abstractC4483m, virtualCardRequest.m14014a());
        abstractC4483m.mo27417F("permissions");
        this.f22983d.mo10143i(abstractC4483m, virtualCardRequest.m14011d());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VirtualCardRequest");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
