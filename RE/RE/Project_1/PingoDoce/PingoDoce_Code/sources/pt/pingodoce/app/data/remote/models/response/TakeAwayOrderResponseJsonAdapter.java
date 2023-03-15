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
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;

/* compiled from: TakeAwayOrderResponseJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class TakeAwayOrderResponseJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23279a;

    /* renamed from: b */
    private final AbstractC4470f f23280b;

    /* renamed from: c */
    private final AbstractC4470f f23281c;

    /* renamed from: d */
    private volatile Constructor f23282d;

    public TakeAwayOrderResponseJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("order", "message");
        Intrinsics.checkIfNull(m27461a, "of(\"order\", \"message\")");
        this.f23279a = m27461a;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(TakeAwayOrder.class, m208b, "order");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(TakeAwayOr…ava, emptySet(), \"order\")");
        this.f23280b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "message");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…tySet(),\n      \"message\")");
        this.f23281c = m27366f2;
    }

    /* renamed from: k */
    public TakeAwayOrderResponse mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        int i = -1;
        TakeAwayOrder takeAwayOrder = null;
        String str = null;
        while (abstractC4476h.mo27427y()) {
            int mo27436d0 = abstractC4476h.mo27436d0(this.f23279a);
            if (mo27436d0 == -1) {
                abstractC4476h.mo27432l0();
                abstractC4476h.mo27431o0();
            } else if (mo27436d0 == 0) {
                takeAwayOrder = (TakeAwayOrder) this.f23280b.mo10144b(abstractC4476h);
                i &= -2;
            } else if (mo27436d0 == 1) {
                str = (String) this.f23281c.mo10144b(abstractC4476h);
                if (str == null) {
                    JsonDataException m10121v = C9712b.m10121v("message", "message", abstractC4476h);
                    Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"message\"…       \"message\", reader)");
                    throw m10121v;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -4) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new TakeAwayOrderResponse(takeAwayOrder, str);
        }
        Constructor constructor = this.f23282d;
        if (constructor == null) {
            constructor = TakeAwayOrderResponse.class.getDeclaredConstructor(TakeAwayOrder.class, String.class, Integer.TYPE, C9712b.f25570c);
            this.f23282d = constructor;
            Intrinsics.checkIfNull(constructor, "TakeAwayOrderResponse::c…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(takeAwayOrder, str, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (TakeAwayOrderResponse) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, TakeAwayOrderResponse takeAwayOrderResponse) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(takeAwayOrderResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("order");
        this.f23280b.mo10143i(abstractC4483m, takeAwayOrderResponse.m13680b());
        abstractC4483m.mo27417F("message");
        this.f23281c.mo10143i(abstractC4483m, takeAwayOrderResponse.m13681a());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TakeAwayOrderResponse");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
