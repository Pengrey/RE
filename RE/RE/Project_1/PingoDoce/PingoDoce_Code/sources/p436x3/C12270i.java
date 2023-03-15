package p436x3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import p040c4.C2066c;
import p040c4.C2068e;
import p040c4.EnumC2069f;
import p055d4.AbstractC4724a;
import p152i4.C6015c;
import p301q.C9556e;
import p459y3.AbstractC13078a;
import p459y3.C13099p;

/* renamed from: x3.i */
/* loaded from: classes.dex */
public class C12270i extends AbstractC12260a {

    /* renamed from: o */
    private final String f32379o;

    /* renamed from: p */
    private final boolean f32380p;

    /* renamed from: q */
    private final C9556e<LinearGradient> f32381q;

    /* renamed from: r */
    private final C9556e<RadialGradient> f32382r;

    /* renamed from: s */
    private final RectF f32383s;

    /* renamed from: t */
    private final EnumC2069f f32384t;

    /* renamed from: u */
    private final int f32385u;

    /* renamed from: v */
    private final AbstractC13078a<C2066c, C2066c> f32386v;

    /* renamed from: w */
    private final AbstractC13078a<PointF, PointF> f32387w;

    /* renamed from: x */
    private final AbstractC13078a<PointF, PointF> f32388x;

    /* renamed from: y */
    private C13099p f32389y;

    public C12270i(C2210f c2210f, AbstractC4724a abstractC4724a, C2068e c2068e) {
        super(c2210f, abstractC4724a, c2068e.m34776b().toPaintCap(), c2068e.m34771g().toPaintJoin(), c2068e.m34769i(), c2068e.m34767k(), c2068e.m34765m(), c2068e.m34770h(), c2068e.m34775c());
        this.f32381q = new C9556e<>();
        this.f32382r = new C9556e<>();
        this.f32383s = new RectF();
        this.f32379o = c2068e.m34768j();
        this.f32384t = c2068e.m34772f();
        this.f32380p = c2068e.m34764n();
        this.f32385u = (int) (c2210f.m34325p().m34428d() / 32.0f);
        AbstractC13078a<C2066c, C2066c> mo35329a = c2068e.m34773e().mo35329a();
        this.f32386v = mo35329a;
        mo35329a.m1687a(this);
        abstractC4724a.m26783k(mo35329a);
        AbstractC13078a<PointF, PointF> mo35329a2 = c2068e.m34766l().mo35329a();
        this.f32387w = mo35329a2;
        mo35329a2.m1687a(this);
        abstractC4724a.m26783k(mo35329a2);
        AbstractC13078a<PointF, PointF> mo35329a3 = c2068e.m34774d().mo35329a();
        this.f32388x = mo35329a3;
        mo35329a3.m1687a(this);
        abstractC4724a.m26783k(mo35329a3);
    }

    /* renamed from: k */
    private int[] m3162k(int[] iArr) {
        C13099p c13099p = this.f32389y;
        if (c13099p != null) {
            Integer[] numArr = (Integer[]) c13099p.mo1634h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: l */
    private int m3161l() {
        int round = Math.round(this.f32387w.m1683f() * this.f32385u);
        int round2 = Math.round(this.f32388x.m1683f() * this.f32385u);
        int round3 = Math.round(this.f32386v.m1683f() * this.f32385u);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: m */
    private LinearGradient m3160m() {
        long m3161l = m3161l();
        LinearGradient m10644f = this.f32381q.m10644f(m3161l);
        if (m10644f != null) {
            return m10644f;
        }
        PointF mo1634h = this.f32387w.mo1634h();
        PointF mo1634h2 = this.f32388x.mo1634h();
        C2066c mo1634h3 = this.f32386v.mo1634h();
        LinearGradient linearGradient = new LinearGradient(mo1634h.x, mo1634h.y, mo1634h2.x, mo1634h2.y, m3162k(mo1634h3.m34788a()), mo1634h3.m34787b(), Shader.TileMode.CLAMP);
        this.f32381q.m10639l(m3161l, linearGradient);
        return linearGradient;
    }

    /* renamed from: n */
    private RadialGradient m3159n() {
        float f;
        float f2;
        long m3161l = m3161l();
        RadialGradient m10644f = this.f32382r.m10644f(m3161l);
        if (m10644f != null) {
            return m10644f;
        }
        PointF mo1634h = this.f32387w.mo1634h();
        PointF mo1634h2 = this.f32388x.mo1634h();
        C2066c mo1634h3 = this.f32386v.mo1634h();
        int[] m3162k = m3162k(mo1634h3.m34788a());
        float[] m34787b = mo1634h3.m34787b();
        RadialGradient radialGradient = new RadialGradient(mo1634h.x, mo1634h.y, (float) Math.hypot(mo1634h2.x - f, mo1634h2.y - f2), m3162k, m34787b, Shader.TileMode.CLAMP);
        this.f32382r.m10639l(m3161l, radialGradient);
        return radialGradient;
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32379o;
    }

    @Override // p436x3.AbstractC12260a, p436x3.InterfaceC12266e
    /* renamed from: f */
    public void mo3146f(Canvas canvas, Matrix matrix, int i) {
        Shader m3159n;
        if (this.f32380p) {
            return;
        }
        mo3152b(this.f32383s, matrix, false);
        if (this.f32384t == EnumC2069f.LINEAR) {
            m3159n = m3160m();
        } else {
            m3159n = m3159n();
        }
        m3159n.setLocalMatrix(matrix);
        this.f32323i.setShader(m3159n);
        super.mo3146f(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p436x3.AbstractC12260a, p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        super.mo3145h(t, c6015c);
        if (t == InterfaceC2230k.f6458F) {
            C13099p c13099p = this.f32389y;
            if (c13099p != null) {
                this.f32320f.m26790E(c13099p);
            }
            if (c6015c == null) {
                this.f32389y = null;
                return;
            }
            C13099p c13099p2 = new C13099p(c6015c);
            this.f32389y = c13099p2;
            c13099p2.m1687a(this);
            this.f32320f.m26783k(this.f32389y);
        }
    }
}
