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

/* compiled from: ElectronicInvoiceJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23135a;

    /* renamed from: b */
    private final AbstractC4470f f23136b;

    /* renamed from: c */
    private final AbstractC4470f f23137c;

    /* renamed from: d */
    private volatile Constructor f23138d;

    public ElectronicInvoiceJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("email", "phoneNumber", "cardNumber", "registered");
        Intrinsics.checkIfNull(m27461a, "of(\"email\", \"phoneNumber…ardNumber\", \"registered\")");
        this.f23135a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(String.class, m208b, "email");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(String::cl…mptySet(),\n      \"email\")");
        this.f23136b = m27366f;
        Class cls = Boolean.TYPE;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(cls, m208b2, "registered");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(Boolean::c…et(),\n      \"registered\")");
        this.f23137c = m27366f2;
    }

    /* renamed from: k */
    public ElectronicInvoice mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23135a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                str = (String) this.f23136b.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("email", "email", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"email\", …l\",\n              reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str2 = (String) this.f23136b.mo10144b(abstractC4476h);
                if (str2 == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("phoneNumber", "phoneNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"phoneNum…   \"phoneNumber\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                str3 = (String) this.f23136b.mo10144b(abstractC4476h);
                if (str3 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("cardNumber", "cardNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"cardNumb…    \"cardNumber\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else if (mo27436d0 == 3) {
                bool = (Boolean) this.f23137c.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v4 = C9712b.m10121v("registered", "registered", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"register…    \"registered\", reader)");
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
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            return new ElectronicInvoice(str, str2, str3, bool.booleanValue());
        }
        Constructor constructor = this.f23138d;
        if (constructor == null) {
            constructor = ElectronicInvoice.class.getDeclaredConstructor(String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, C9712b.f25570c);
            this.f23138d = constructor;
            Intrinsics.checkIfNull(constructor, "ElectronicInvoice::class…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, bool, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ElectronicInvoice) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, ElectronicInvoice electronicInvoice) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(electronicInvoice, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("email");
        this.f23136b.mo10143i(abstractC4483m, electronicInvoice.m13849b());
        abstractC4483m.mo27417F("phoneNumber");
        this.f23136b.mo10143i(abstractC4483m, electronicInvoice.m13848c());
        abstractC4483m.mo27417F("cardNumber");
        this.f23136b.mo10143i(abstractC4483m, electronicInvoice.m13850a());
        abstractC4483m.mo27417F("registered");
        this.f23137c.mo10143i(abstractC4483m, Boolean.valueOf(electronicInvoice.m13847d()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ElectronicInvoice");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
