package p096f4;

import android.graphics.PointF;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import p026b4.C1798b;
import p026b4.InterfaceC1809m;
import p040c4.C2074i;
import p116g4.AbstractC5604c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.z */
/* loaded from: classes.dex */
public class C5409z {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14870a = AbstractC5604c.C5605a.m23609a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2074i m24393a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        boolean z = false;
        String str = null;
        C2074i.EnumC2075a enumC2075a = null;
        C1798b c1798b = null;
        InterfaceC1809m<PointF, PointF> interfaceC1809m = null;
        C1798b c1798b2 = null;
        C1798b c1798b3 = null;
        C1798b c1798b4 = null;
        C1798b c1798b5 = null;
        C1798b c1798b6 = null;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14870a)) {
                case 0:
                    str = abstractC5604c.mo23597M();
                    break;
                case 1:
                    enumC2075a = C2074i.EnumC2075a.forValue(abstractC5604c.mo23600H());
                    break;
                case 2:
                    c1798b = C5378d.m24449f(abstractC5604c, c2201d, false);
                    break;
                case 3:
                    interfaceC1809m = C5372a.m24467b(abstractC5604c, c2201d);
                    break;
                case 4:
                    c1798b2 = C5378d.m24449f(abstractC5604c, c2201d, false);
                    break;
                case 5:
                    c1798b4 = C5378d.m24450e(abstractC5604c, c2201d);
                    break;
                case 6:
                    c1798b6 = C5378d.m24449f(abstractC5604c, c2201d, false);
                    break;
                case 7:
                    c1798b3 = C5378d.m24450e(abstractC5604c, c2201d);
                    break;
                case 8:
                    c1798b5 = C5378d.m24449f(abstractC5604c, c2201d, false);
                    break;
                case 9:
                    z = abstractC5604c.mo23605E();
                    break;
                default:
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                    break;
            }
        }
        return new C2074i(str, enumC2075a, c1798b, interfaceC1809m, c1798b2, c1798b3, c1798b4, c1798b5, c1798b6, z);
    }
}
