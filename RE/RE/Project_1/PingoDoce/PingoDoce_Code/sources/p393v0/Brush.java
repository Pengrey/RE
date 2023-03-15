package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: v0.d1 */
/* loaded from: classes.dex */
public final class Brush extends AbstractC11057s {

    /* renamed from: a */
    private final long f28342a;

    private Brush(long j) {
        super(null);
        this.f28342a = j;
    }

    public /* synthetic */ Brush(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: a */
    public void mo6293a(long j, InterfaceC11046o0 interfaceC11046o0, float f) {
        long m6554b;
        Intrinsics.isThisObjectNull(interfaceC11046o0, "p");
        interfaceC11046o0.mo6406c(1.0f);
        if (!(f == 1.0f)) {
            m6554b = Color.m6648l(m6554b(), Color.m6645o(m6554b()) * f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            m6554b = m6554b();
        }
        interfaceC11046o0.mo6394o(m6554b);
        if (interfaceC11046o0.mo6389t() != null) {
            interfaceC11046o0.mo6390s(null);
        }
    }

    /* renamed from: b */
    public final long m6554b() {
        return this.f28342a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Brush) && Color.m6646n(m6554b(), ((Brush) obj).m6554b());
    }

    public int hashCode() {
        return Color.m6640t(m6554b());
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m6639u(m6554b())) + ')';
    }
}
