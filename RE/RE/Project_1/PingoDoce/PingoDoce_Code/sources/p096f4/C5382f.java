package p096f4;

import android.graphics.Color;
import java.io.IOException;
import p116g4.AbstractC5604c;

/* renamed from: f4.f */
/* loaded from: classes.dex */
public class C5382f implements InterfaceC5391j0<Integer> {

    /* renamed from: a */
    public static final C5382f f14832a = new C5382f();

    private C5382f() {
    }

    @Override // p096f4.InterfaceC5391j0
    /* renamed from: b */
    public Integer mo24395a(AbstractC5604c abstractC5604c, float f) throws IOException {
        boolean z = abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_ARRAY;
        if (z) {
            abstractC5604c.mo23592c();
        }
        double mo23603F = abstractC5604c.mo23603F();
        double mo23603F2 = abstractC5604c.mo23603F();
        double mo23603F3 = abstractC5604c.mo23603F();
        double mo23603F4 = abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.NUMBER ? abstractC5604c.mo23603F() : 1.0d;
        if (z) {
            abstractC5604c.mo23589h();
        }
        if (mo23603F <= 1.0d && mo23603F2 <= 1.0d && mo23603F3 <= 1.0d) {
            mo23603F *= 255.0d;
            mo23603F2 *= 255.0d;
            mo23603F3 *= 255.0d;
            if (mo23603F4 <= 1.0d) {
                mo23603F4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) mo23603F4, (int) mo23603F, (int) mo23603F2, (int) mo23603F3));
    }
}
