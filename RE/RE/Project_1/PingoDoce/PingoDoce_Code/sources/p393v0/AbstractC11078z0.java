package p393v0;

import android.graphics.Shader;
import p181jd.Intrinsics;
import p373u0.C10781l;
import p393v0.Color;

/* compiled from: Brush.kt */
/* renamed from: v0.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC11078z0 extends AbstractC11057s {

    /* renamed from: a */
    private Shader f28473a;

    /* renamed from: b */
    private long f28474b;

    public AbstractC11078z0() {
        super(null);
        this.f28474b = C10781l.f27885b.m7087a();
    }

    /* renamed from: a */
    public final void mo6293a(long j, InterfaceC11046o0 interfaceC11046o0, float f) {
        Intrinsics.isThisObjectNull(interfaceC11046o0, "p");
        Shader shader = this.f28473a;
        if (shader == null || !C10781l.m7094f(this.f28474b, j)) {
            shader = m6192b(j);
            this.f28473a = shader;
            this.f28474b = j;
        }
        long mo6408a = interfaceC11046o0.mo6408a();
        Color.C10994a c10994a = Color.f28297b;
        if (!Color.m6646n(mo6408a, c10994a.m6637a())) {
            interfaceC11046o0.mo6394o(c10994a.m6637a());
        }
        if (!Intrinsics.equals(interfaceC11046o0.mo6389t(), shader)) {
            interfaceC11046o0.mo6390s(shader);
        }
        if (interfaceC11046o0.mo6398k() == f) {
            return;
        }
        interfaceC11046o0.mo6406c(f);
    }

    /* renamed from: b */
    public abstract Shader m6192b(long j);
}
