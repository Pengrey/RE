package p096f4;

import android.graphics.PointF;
import java.io.IOException;
import p116g4.AbstractC5604c;

/* renamed from: f4.y */
/* loaded from: classes.dex */
public class C5408y implements InterfaceC5391j0<PointF> {

    /* renamed from: a */
    public static final C5408y f14869a = new C5408y();

    private C5408y() {
    }

    @Override // p096f4.InterfaceC5391j0
    /* renamed from: b */
    public PointF mo24395a(AbstractC5604c abstractC5604c, float f) throws IOException {
        AbstractC5604c.EnumC5606b mo23596R = abstractC5604c.mo23596R();
        if (mo23596R == AbstractC5604c.EnumC5606b.BEGIN_ARRAY) {
            return C5397p.m24420e(abstractC5604c, f);
        }
        if (mo23596R == AbstractC5604c.EnumC5606b.BEGIN_OBJECT) {
            return C5397p.m24420e(abstractC5604c, f);
        }
        if (mo23596R == AbstractC5604c.EnumC5606b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC5604c.mo23603F()) * f, ((float) abstractC5604c.mo23603F()) * f);
            while (abstractC5604c.mo23580y()) {
                abstractC5604c.mo23593b0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + mo23596R);
    }
}
