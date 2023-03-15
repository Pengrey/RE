package p096f4;

import android.graphics.Rect;
import com.airbnb.lottie.C2201d;
import com.airbnb.lottie.C2226g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005a4.C0016c;
import p005a4.C0017d;
import p005a4.C0021h;
import p055d4.C4730d;
import p116g4.AbstractC5604c;
import p130h4.C5848d;
import p130h4.C5852h;
import p301q.C9556e;
import p301q.C9559h;

/* renamed from: f4.t */
/* loaded from: classes.dex */
public class C5403t {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14863a = AbstractC5604c.C5605a.m23609a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static AbstractC5604c.C5605a f14864b = AbstractC5604c.C5605a.m23609a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final AbstractC5604c.C5605a f14865c = AbstractC5604c.C5605a.m23609a("list");

    /* renamed from: d */
    private static final AbstractC5604c.C5605a f14866d = AbstractC5604c.C5605a.m23609a("cm", "tm", "dr");

    /* renamed from: a */
    public static C2201d m24405a(AbstractC5604c abstractC5604c) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        AbstractC5604c abstractC5604c2 = abstractC5604c;
        float m22886e = C5852h.m22886e();
        C9556e<C4730d> c9556e = new C9556e<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C9559h<C0017d> c9559h = new C9559h<>();
        C2201d c2201d = new C2201d();
        abstractC5604c.mo23591e();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c2.mo23595X(f14863a)) {
                case 0:
                    i = abstractC5604c.mo23600H();
                    continue;
                    abstractC5604c2 = abstractC5604c;
                case 1:
                    i2 = abstractC5604c.mo23600H();
                    continue;
                    abstractC5604c2 = abstractC5604c;
                case 2:
                    f = (float) abstractC5604c.mo23603F();
                    continue;
                    abstractC5604c2 = abstractC5604c;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) abstractC5604c.mo23603F()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) abstractC5604c.mo23603F();
                    break;
                case 5:
                    String[] split = abstractC5604c.mo23597M().split("\\.");
                    if (!C5852h.m22881j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        c2201d.m34431a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    m24401e(abstractC5604c2, c2201d, arrayList2, c9556e);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    m24404b(abstractC5604c2, c2201d, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    m24402d(abstractC5604c2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    m24403c(abstractC5604c2, c2201d, c9559h);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    m24400f(abstractC5604c2, c2201d, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            abstractC5604c2 = abstractC5604c;
        }
        c2201d.m34413s(new Rect(0, 0, (int) (i * m22886e), (int) (i2 * m22886e)), f, f2, f3, arrayList2, c9556e, hashMap2, hashMap3, c9559h, hashMap4, arrayList3);
        return c2201d;
    }

    /* renamed from: b */
    private static void m24404b(AbstractC5604c abstractC5604c, C2201d c2201d, Map<String, List<C4730d>> map, Map<String, C2226g> map2) throws IOException {
        abstractC5604c.mo23592c();
        while (abstractC5604c.mo23580y()) {
            ArrayList arrayList = new ArrayList();
            C9556e c9556e = new C9556e();
            abstractC5604c.mo23591e();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (abstractC5604c.mo23580y()) {
                int mo23595X = abstractC5604c.mo23595X(f14864b);
                if (mo23595X == 0) {
                    str = abstractC5604c.mo23597M();
                } else if (mo23595X == 1) {
                    abstractC5604c.mo23592c();
                    while (abstractC5604c.mo23580y()) {
                        C4730d m24406b = C5401s.m24406b(abstractC5604c, c2201d);
                        c9556e.m10639l(m24406b.m26764b(), m24406b);
                        arrayList.add(m24406b);
                    }
                    abstractC5604c.mo23589h();
                } else if (mo23595X == 2) {
                    i = abstractC5604c.mo23600H();
                } else if (mo23595X == 3) {
                    i2 = abstractC5604c.mo23600H();
                } else if (mo23595X == 4) {
                    str2 = abstractC5604c.mo23597M();
                } else if (mo23595X != 5) {
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                } else {
                    str3 = abstractC5604c.mo23597M();
                }
            }
            abstractC5604c.mo23584t();
            if (str2 != null) {
                C2226g c2226g = new C2226g(i, i2, str, str2, str3);
                map2.put(c2226g.m34310d(), c2226g);
            } else {
                map.put(str, arrayList);
            }
        }
        abstractC5604c.mo23589h();
    }

    /* renamed from: c */
    private static void m24403c(AbstractC5604c abstractC5604c, C2201d c2201d, C9559h<C0017d> c9559h) throws IOException {
        abstractC5604c.mo23592c();
        while (abstractC5604c.mo23580y()) {
            C0017d m24432a = C5390j.m24432a(abstractC5604c, c2201d);
            c9559h.m10599l(m24432a.hashCode(), m24432a);
        }
        abstractC5604c.mo23589h();
    }

    /* renamed from: d */
    private static void m24402d(AbstractC5604c abstractC5604c, Map<String, C0016c> map) throws IOException {
        abstractC5604c.mo23591e();
        while (abstractC5604c.mo23580y()) {
            if (abstractC5604c.mo23595X(f14865c) != 0) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                abstractC5604c.mo23592c();
                while (abstractC5604c.mo23580y()) {
                    C0016c m24431a = C5392k.m24431a(abstractC5604c);
                    map.put(m24431a.m42125b(), m24431a);
                }
                abstractC5604c.mo23589h();
            }
        }
        abstractC5604c.mo23584t();
    }

    /* renamed from: e */
    private static void m24401e(AbstractC5604c abstractC5604c, C2201d c2201d, List<C4730d> list, C9556e<C4730d> c9556e) throws IOException {
        abstractC5604c.mo23592c();
        int i = 0;
        while (abstractC5604c.mo23580y()) {
            C4730d m24406b = C5401s.m24406b(abstractC5604c, c2201d);
            if (m24406b.m26762d() == C4730d.EnumC4731a.IMAGE) {
                i++;
            }
            list.add(m24406b);
            c9556e.m10639l(m24406b.m26764b(), m24406b);
            if (i > 4) {
                C5848d.m22929c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC5604c.mo23589h();
    }

    /* renamed from: f */
    private static void m24400f(AbstractC5604c abstractC5604c, C2201d c2201d, List<C0021h> list) throws IOException {
        abstractC5604c.mo23592c();
        while (abstractC5604c.mo23580y()) {
            String str = null;
            abstractC5604c.mo23591e();
            float f = 0.0f;
            float f2 = 0.0f;
            while (abstractC5604c.mo23580y()) {
                int mo23595X = abstractC5604c.mo23595X(f14866d);
                if (mo23595X == 0) {
                    str = abstractC5604c.mo23597M();
                } else if (mo23595X == 1) {
                    f = (float) abstractC5604c.mo23603F();
                } else if (mo23595X != 2) {
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                } else {
                    f2 = (float) abstractC5604c.mo23603F();
                }
            }
            abstractC5604c.mo23584t();
            list.add(new C0021h(str, f, f2));
        }
        abstractC5604c.mo23589h();
    }
}
