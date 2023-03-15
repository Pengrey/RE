package p022b0;

import java.util.List;
import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p286p1.TextStyle;
import p359t1.InterfaceC10362d;
import p457y1.C13070h;
import p468yc.C13182l;
import p479z1.Density;
import p489zc.C13780s;

/* renamed from: b0.b */
/* loaded from: classes.dex */
public final class CoreText {
    static {
        List m197g;
        List m197g2;
        m197g = C13780s.m197g();
        m197g2 = C13780s.m197g();
        new C13182l(m197g, m197g2);
    }

    /* renamed from: a */
    public static final TextDelegate m35412a(TextDelegate textDelegate, String str, TextStyle textStyle, Density density, InterfaceC10362d.InterfaceC10363a interfaceC10363a, boolean z, int i, int i2) {
        Intrinsics.isThisObjectNull(textDelegate, "current");
        Intrinsics.isThisObjectNull(str, "text");
        Intrinsics.isThisObjectNull(textStyle, "style");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(interfaceC10363a, "resourceLoader");
        if (Intrinsics.equals(textDelegate.m35375g().m15771f(), str) && Intrinsics.equals(textDelegate.m35376f(), textStyle)) {
            if (textDelegate.m35377e() == z) {
                if (C13070h.m1692d(textDelegate.m35378d(), i)) {
                    if (textDelegate.m35380b() == i2 && Intrinsics.equals(textDelegate.m35381a(), density)) {
                        return textDelegate;
                    }
                    return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i2, z, i, density, interfaceC10363a, null, 128, null);
                }
                return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i2, z, i, density, interfaceC10363a, null, 128, null);
            }
        }
        return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i2, z, i, density, interfaceC10363a, null, 128, null);
    }
}
