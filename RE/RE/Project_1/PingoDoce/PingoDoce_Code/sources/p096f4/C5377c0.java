package p096f4;

import java.io.IOException;
import p116g4.AbstractC5604c;
import p152i4.C6016d;

/* renamed from: f4.c0 */
/* loaded from: classes.dex */
public class C5377c0 implements InterfaceC5391j0<C6016d> {

    /* renamed from: a */
    public static final C5377c0 f14827a = new C5377c0();

    private C5377c0() {
    }

    @Override // p096f4.InterfaceC5391j0
    /* renamed from: b */
    public C6016d mo24395a(AbstractC5604c abstractC5604c, float f) throws IOException {
        boolean z = abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_ARRAY;
        if (z) {
            abstractC5604c.mo23592c();
        }
        float mo23603F = (float) abstractC5604c.mo23603F();
        float mo23603F2 = (float) abstractC5604c.mo23603F();
        while (abstractC5604c.mo23580y()) {
            abstractC5604c.mo23593b0();
        }
        if (z) {
            abstractC5604c.mo23589h();
        }
        return new C6016d((mo23603F / 100.0f) * f, (mo23603F2 / 100.0f) * f);
    }
}
