package p230m1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.p018ui.platform.C0824y;
import p002a1.C0009c;
import p092f0.InterfaceC5179i;
import p181jd.Intrinsics;
import p230m1.C7094b;
import p393v0.InterfaceC11025h0;
import p478z0.ImageVector;

/* compiled from: PainterResources.android.kt */
/* renamed from: m1.c */
/* loaded from: classes.dex */
public final class C7097c {
    /* renamed from: a */
    private static final InterfaceC11025h0 m19310a(Resources resources, int i) {
        return C7093a.m19317a(InterfaceC11025h0.f28379a, resources, i);
    }

    /* renamed from: b */
    private static final ImageVector m19309b(Resources.Theme theme, Resources resources, int i, InterfaceC5179i interfaceC5179i, int i2) {
        interfaceC5179i.mo25263g(-995791636);
        C7094b c7094b = (C7094b) interfaceC5179i.mo25256n(C0824y.m39470h());
        C7094b.C7096b c7096b = new C7094b.C7096b(theme, i);
        C7094b.C7095a m19315b = c7094b.m19315b(c7096b);
        if (m19315b == null) {
            XmlResourceParser xml = resources.getXml(i);
            Intrinsics.checkIfNull(xml, "res.getXml(id)");
            if (Intrinsics.equals(C0009c.m42134j(xml).getName(), "vector")) {
                m19315b = C7099e.m19305a(theme, resources, xml);
                c7094b.m19313d(c7096b, m19315b);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
        }
        ImageVector m19311b = m19315b.m19311b();
        interfaceC5179i.mo25282C();
        return m19311b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r6 == true) goto L7;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p456y0.Painter m19308c(int r9, p092f0.InterfaceC5179i r10, int r11) {
        /*
            r0 = -738265664(0xffffffffd3fef5c0, float:-2.19008939E12)
            r10.mo25263g(r0)
            f0.t0 r0 = androidx.compose.p018ui.platform.C0824y.m39471g()
            java.lang.Object r0 = r10.mo25256n(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r10.mo25263g(r2)
            java.lang.Object r2 = r10.mo25262h()
            f0.i$a r3 = p092f0.InterfaceC5179i.f14328a
            java.lang.Object r4 = r3.m25243a()
            if (r2 != r4) goto L2e
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r10.mo25247w(r2)
        L2e:
            r10.mo25282C()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r4 = 1
            r1.getValue(r9, r2, r4)
            java.lang.CharSequence r2 = r2.string
            r5 = 0
            if (r2 != 0) goto L3e
        L3c:
            r4 = r5
            goto L48
        L3e:
            r6 = 2
            r7 = 0
            java.lang.String r8 = ".xml"
            boolean r6 = sd.C10163k.m8997L(r2, r8, r5, r6, r7)
            if (r6 != r4) goto L3c
        L48:
            java.lang.String r6 = "res"
            if (r4 == 0) goto L70
            r2 = -738265321(0xffffffffd3fef717, float:-2.19013435E12)
            r10.mo25263g(r2)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            java.lang.String r2 = "context.theme"
            p181jd.Intrinsics.checkIfNull(r0, r2)
            p181jd.Intrinsics.checkIfNull(r1, r6)
            int r11 = r11 << 6
            r11 = r11 & 896(0x380, float:1.256E-42)
            r11 = r11 | 72
            z0.c r9 = m19309b(r0, r1, r9, r10, r11)
            z0.q r9 = p478z0.C13573r.m955b(r9, r10, r5)
            r10.mo25282C()
            goto Lb4
        L70:
            r11 = -738265196(0xffffffffd3fef794, float:-2.19015073E12)
            r10.mo25263g(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r0 = -3686552(0xffffffffffc7bf68, float:NaN)
            r10.mo25263g(r0)
            boolean r0 = r10.mo25276I(r2)
            boolean r11 = r10.mo25276I(r11)
            r11 = r11 | r0
            java.lang.Object r0 = r10.mo25262h()
            if (r11 != 0) goto L95
            java.lang.Object r11 = r3.m25243a()
            if (r0 != r11) goto L9f
        L95:
            p181jd.Intrinsics.checkIfNull(r1, r6)
            v0.h0 r0 = m19310a(r1, r9)
            r10.mo25247w(r0)
        L9f:
            r10.mo25282C()
            r2 = r0
            v0.h0 r2 = (p393v0.InterfaceC11025h0) r2
            y0.a r9 = new y0.a
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r9
            r1.<init>(r2, r3, r5, r7, r8)
            r10.mo25282C()
        Lb4:
            r10.mo25282C()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p230m1.C7097c.m19308c(int, f0.i, int):y0.b");
    }
}
