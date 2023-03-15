package p096f4;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p026b4.C1798b;
import p026b4.C1806j;
import p026b4.C1807k;
import p026b4.C1808l;
import p040c4.InterfaceC2065b;
import p055d4.C4730d;
import p116g4.AbstractC5604c;
import p130h4.C5852h;
import p152i4.C6013a;

/* renamed from: f4.s */
/* loaded from: classes.dex */
public class C5401s {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14859a = AbstractC5604c.C5605a.m23609a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final AbstractC5604c.C5605a f14860b = AbstractC5604c.C5605a.m23609a("d", "a");

    /* renamed from: c */
    private static final AbstractC5604c.C5605a f14861c = AbstractC5604c.C5605a.m23609a("nm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayerParser.java */
    /* renamed from: f4.s$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5402a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14862a;

        static {
            int[] iArr = new int[C4730d.EnumC4732b.values().length];
            f14862a = iArr;
            try {
                iArr[C4730d.EnumC4732b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14862a[C4730d.EnumC4732b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static C4730d m24407a(C2201d c2201d) {
        Rect m34430b = c2201d.m34430b();
        return new C4730d(Collections.emptyList(), c2201d, "__container", -1L, C4730d.EnumC4731a.PRE_COMP, -1L, null, Collections.emptyList(), new C1808l(), 0, 0, 0, 0.0f, 0.0f, m34430b.width(), m34430b.height(), null, null, Collections.emptyList(), C4730d.EnumC4732b.NONE, null, false);
    }

    /* renamed from: b */
    public static C4730d m24406b(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        C4730d.EnumC4732b enumC4732b = C4730d.EnumC4732b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        abstractC5604c.mo23591e();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        C4730d.EnumC4732b enumC4732b2 = enumC4732b;
        float f2 = 1.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        C4730d.EnumC4731a enumC4731a = null;
        String str = null;
        C1808l c1808l = null;
        C1806j c1806j = null;
        C1807k c1807k = null;
        C1798b c1798b = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        long j = -1;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14859a)) {
                case 0:
                    str3 = abstractC5604c.mo23597M();
                    break;
                case 1:
                    j2 = abstractC5604c.mo23600H();
                    break;
                case 2:
                    str = abstractC5604c.mo23597M();
                    break;
                case 3:
                    int mo23600H = abstractC5604c.mo23600H();
                    enumC4731a = C4730d.EnumC4731a.UNKNOWN;
                    if (mo23600H >= enumC4731a.ordinal()) {
                        break;
                    } else {
                        enumC4731a = C4730d.EnumC4731a.values()[mo23600H];
                        break;
                    }
                case 4:
                    j = abstractC5604c.mo23600H();
                    break;
                case 5:
                    i = (int) (abstractC5604c.mo23600H() * C5852h.m22886e());
                    break;
                case 6:
                    i2 = (int) (abstractC5604c.mo23600H() * C5852h.m22886e());
                    break;
                case 7:
                    i3 = Color.parseColor(abstractC5604c.mo23597M());
                    break;
                case 8:
                    c1808l = C5376c.m24456g(abstractC5604c, c2201d);
                    break;
                case 9:
                    int mo23600H2 = abstractC5604c.mo23600H();
                    if (mo23600H2 >= C4730d.EnumC4732b.values().length) {
                        c2201d.m34431a("Unsupported matte type: " + mo23600H2);
                        break;
                    } else {
                        enumC4732b2 = C4730d.EnumC4732b.values()[mo23600H2];
                        int i6 = C5402a.f14862a[enumC4732b2.ordinal()];
                        if (i6 == 1) {
                            c2201d.m34431a("Unsupported matte type: Luma");
                        } else if (i6 == 2) {
                            c2201d.m34431a("Unsupported matte type: Luma Inverted");
                        }
                        c2201d.m34414r(1);
                        break;
                    }
                case 10:
                    abstractC5604c.mo23592c();
                    while (abstractC5604c.mo23580y()) {
                        arrayList3.add(C5404u.m24399a(abstractC5604c, c2201d));
                    }
                    c2201d.m34414r(arrayList3.size());
                    abstractC5604c.mo23589h();
                    break;
                case 11:
                    abstractC5604c.mo23592c();
                    while (abstractC5604c.mo23580y()) {
                        InterfaceC2065b m24438a = C5384g.m24438a(abstractC5604c, c2201d);
                        if (m24438a != null) {
                            arrayList4.add(m24438a);
                        }
                    }
                    abstractC5604c.mo23589h();
                    break;
                case 12:
                    abstractC5604c.mo23591e();
                    while (abstractC5604c.mo23580y()) {
                        int mo23595X = abstractC5604c.mo23595X(f14860b);
                        if (mo23595X == 0) {
                            c1806j = C5378d.m24451d(abstractC5604c, c2201d);
                        } else if (mo23595X != 1) {
                            abstractC5604c.mo23594a0();
                            abstractC5604c.mo23593b0();
                        } else {
                            abstractC5604c.mo23592c();
                            if (abstractC5604c.mo23580y()) {
                                c1807k = C5374b.m24465a(abstractC5604c, c2201d);
                            }
                            while (abstractC5604c.mo23580y()) {
                                abstractC5604c.mo23593b0();
                            }
                            abstractC5604c.mo23589h();
                        }
                    }
                    abstractC5604c.mo23584t();
                    break;
                case 13:
                    abstractC5604c.mo23592c();
                    ArrayList arrayList5 = new ArrayList();
                    while (abstractC5604c.mo23580y()) {
                        abstractC5604c.mo23591e();
                        while (abstractC5604c.mo23580y()) {
                            if (abstractC5604c.mo23595X(f14861c) != 0) {
                                abstractC5604c.mo23594a0();
                                abstractC5604c.mo23593b0();
                            } else {
                                arrayList5.add(abstractC5604c.mo23597M());
                            }
                        }
                        abstractC5604c.mo23584t();
                    }
                    abstractC5604c.mo23589h();
                    c2201d.m34431a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f2 = (float) abstractC5604c.mo23603F();
                    break;
                case 15:
                    f4 = (float) abstractC5604c.mo23603F();
                    break;
                case 16:
                    i4 = (int) (abstractC5604c.mo23600H() * C5852h.m22886e());
                    break;
                case 17:
                    i5 = (int) (abstractC5604c.mo23600H() * C5852h.m22886e());
                    break;
                case 18:
                    f3 = (float) abstractC5604c.mo23603F();
                    break;
                case 19:
                    f5 = (float) abstractC5604c.mo23603F();
                    break;
                case 20:
                    c1798b = C5378d.m24449f(abstractC5604c, c2201d, false);
                    break;
                case 21:
                    str2 = abstractC5604c.mo23597M();
                    break;
                case 22:
                    z = abstractC5604c.mo23605E();
                    break;
                default:
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                    break;
            }
        }
        abstractC5604c.mo23584t();
        ArrayList arrayList6 = new ArrayList();
        if (f3 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C6013a(c2201d, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f3)));
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (f5 <= f) {
            f5 = c2201d.m34426f();
        }
        arrayList2.add(new C6013a(c2201d, valueOf, valueOf, null, f3, Float.valueOf(f5)));
        arrayList2.add(new C6013a(c2201d, valueOf2, valueOf2, null, f5, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            c2201d.m34431a("Convert your Illustrator layers to shape layers.");
        }
        return new C4730d(arrayList4, c2201d, str3, j2, enumC4731a, j, str, arrayList, c1808l, i, i2, i3, f2, f4, i4, i5, c1806j, c1807k, arrayList2, enumC4732b2, c1798b, z);
    }
}
