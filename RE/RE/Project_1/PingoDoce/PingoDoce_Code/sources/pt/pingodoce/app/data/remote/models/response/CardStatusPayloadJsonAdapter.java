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

/* compiled from: CardStatusPayloadJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class CardStatusPayloadJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23096a;

    /* renamed from: b */
    private final AbstractC4470f f23097b;

    /* renamed from: c */
    private final AbstractC4470f f23098c;

    /* renamed from: d */
    private volatile Constructor f23099d;

    public CardStatusPayloadJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("delegateInvite", "maskedPhoneNumber", "isOwner");
        Intrinsics.checkIfNull(m27461a, "of(\"delegateInvite\",\n   …dPhoneNumber\", \"isOwner\")");
        this.f23096a = m27461a;
        Class cls = Boolean.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "delegateInvite");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Boolean::c…,\n      \"delegateInvite\")");
        this.f23097b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "maskedPhoneNumber");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…     \"maskedPhoneNumber\")");
        this.f23098c = m27366f2;
    }

    /* renamed from: k */
    public CardStatusPayload mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        Boolean bool2 = bool;
        int i = -1;
        String str = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23096a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                bool = (Boolean) this.f23097b.mo10144b(abstractC4476h);
                if (bool == null) {
                    JsonDataException m10121v = C9712b.m10121v("delegateInvite", "delegateInvite", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"delegate…\"delegateInvite\", reader)");
                    throw m10121v;
                }
                i &= -2;
            } else if (mo27436d0 == 1) {
                str = (String) this.f23098c.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v2 = C9712b.m10121v("maskedPhoneNumber", "maskedPhoneNumber", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"maskedPh…skedPhoneNumber\", reader)");
                    throw m10121v2;
                }
                i &= -3;
            } else if (mo27436d0 == 2) {
                bool2 = (Boolean) this.f23097b.mo10144b(abstractC4476h);
                if (bool2 == null) {
                    JsonDataException m10121v3 = C9712b.m10121v("isOwner", "isOwner", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"isOwner\"…       \"isOwner\", reader)");
                    throw m10121v3;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -8) {
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new CardStatusPayload(booleanValue, str, bool2.booleanValue());
        }
        Constructor constructor = this.f23099d;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = CardStatusPayload.class.getDeclaredConstructor(cls, String.class, cls, Integer.TYPE, C9712b.f25570c);
            this.f23099d = constructor;
            Intrinsics.checkIfNull(constructor, "CardStatusPayload::class…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(bool, str, bool2, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (CardStatusPayload) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, CardStatusPayload cardStatusPayload) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(cardStatusPayload, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("delegateInvite");
        this.f23097b.mo10143i(abstractC4483m, Boolean.valueOf(cardStatusPayload.m13892a()));
        abstractC4483m.mo27417F("maskedPhoneNumber");
        this.f23098c.mo10143i(abstractC4483m, cardStatusPayload.m13891b());
        abstractC4483m.mo27417F("isOwner");
        this.f23097b.mo10143i(abstractC4483m, Boolean.valueOf(cardStatusPayload.m13890c()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CardStatusPayload");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
