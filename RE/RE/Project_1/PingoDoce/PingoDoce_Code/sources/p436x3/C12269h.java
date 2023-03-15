package p436x3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C2199c;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0018e;
import p040c4.C2066c;
import p040c4.C2067d;
import p040c4.EnumC2069f;
import p055d4.AbstractC4724a;
import p130h4.C5851g;
import p152i4.C6015c;
import p301q.C9556e;
import p414w3.C11563a;
import p459y3.AbstractC13078a;
import p459y3.C13099p;

/* renamed from: x3.h */
/* loaded from: classes.dex */
public class C12269h implements InterfaceC12266e, AbstractC13078a.InterfaceC13080b, InterfaceC12272k {

    /* renamed from: a */
    private final String f32361a;

    /* renamed from: b */
    private final boolean f32362b;

    /* renamed from: c */
    private final AbstractC4724a f32363c;

    /* renamed from: d */
    private final C9556e<LinearGradient> f32364d = new C9556e<>();

    /* renamed from: e */
    private final C9556e<RadialGradient> f32365e = new C9556e<>();

    /* renamed from: f */
    private final Path f32366f;

    /* renamed from: g */
    private final Paint f32367g;

    /* renamed from: h */
    private final RectF f32368h;

    /* renamed from: i */
    private final List<InterfaceC12275m> f32369i;

    /* renamed from: j */
    private final EnumC2069f f32370j;

    /* renamed from: k */
    private final AbstractC13078a<C2066c, C2066c> f32371k;

    /* renamed from: l */
    private final AbstractC13078a<Integer, Integer> f32372l;

    /* renamed from: m */
    private final AbstractC13078a<PointF, PointF> f32373m;

    /* renamed from: n */
    private final AbstractC13078a<PointF, PointF> f32374n;

    /* renamed from: o */
    private AbstractC13078a<ColorFilter, ColorFilter> f32375o;

    /* renamed from: p */
    private C13099p f32376p;

    /* renamed from: q */
    private final C2210f f32377q;

    /* renamed from: r */
    private final int f32378r;

    public C12269h(C2210f c2210f, AbstractC4724a abstractC4724a, C2067d c2067d) {
        Path path = new Path();
        this.f32366f = path;
        this.f32367g = new C11563a(1);
        this.f32368h = new RectF();
        this.f32369i = new ArrayList();
        this.f32363c = abstractC4724a;
        this.f32361a = c2067d.m34780f();
        this.f32362b = c2067d.m34777i();
        this.f32377q = c2210f;
        this.f32370j = c2067d.m34781e();
        path.setFillType(c2067d.m34783c());
        this.f32378r = (int) (c2210f.m34325p().m34428d() / 32.0f);
        AbstractC13078a<C2066c, C2066c> mo35329a = c2067d.m34782d().mo35329a();
        this.f32371k = mo35329a;
        mo35329a.m1687a(this);
        abstractC4724a.m26783k(mo35329a);
        AbstractC13078a<Integer, Integer> mo35329a2 = c2067d.m34779g().mo35329a();
        this.f32372l = mo35329a2;
        mo35329a2.m1687a(this);
        abstractC4724a.m26783k(mo35329a2);
        AbstractC13078a<PointF, PointF> mo35329a3 = c2067d.m34778h().mo35329a();
        this.f32373m = mo35329a3;
        mo35329a3.m1687a(this);
        abstractC4724a.m26783k(mo35329a3);
        AbstractC13078a<PointF, PointF> mo35329a4 = c2067d.m34784b().mo35329a();
        this.f32374n = mo35329a4;
        mo35329a4.m1687a(this);
        abstractC4724a.m26783k(mo35329a4);
    }

    /* renamed from: e */
    private int[] m3166e(int[] iArr) {
        C13099p c13099p = this.f32376p;
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

    /* renamed from: j */
    private int m3165j() {
        int round = Math.round(this.f32373m.m1683f() * this.f32378r);
        int round2 = Math.round(this.f32374n.m1683f() * this.f32378r);
        int round3 = Math.round(this.f32371k.m1683f() * this.f32378r);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: k */
    private LinearGradient m3164k() {
        long m3165j = m3165j();
        LinearGradient m10644f = this.f32364d.m10644f(m3165j);
        if (m10644f != null) {
            return m10644f;
        }
        PointF mo1634h = this.f32373m.mo1634h();
        PointF mo1634h2 = this.f32374n.mo1634h();
        C2066c mo1634h3 = this.f32371k.mo1634h();
        LinearGradient linearGradient = new LinearGradient(mo1634h.x, mo1634h.y, mo1634h2.x, mo1634h2.y, m3166e(mo1634h3.m34788a()), mo1634h3.m34787b(), Shader.TileMode.CLAMP);
        this.f32364d.m10639l(m3165j, linearGradient);
        return linearGradient;
    }

    /* renamed from: l */
    private RadialGradient m3163l() {
        long m3165j = m3165j();
        RadialGradient m10644f = this.f32365e.m10644f(m3165j);
        if (m10644f != null) {
            return m10644f;
        }
        PointF mo1634h = this.f32373m.mo1634h();
        PointF mo1634h2 = this.f32374n.mo1634h();
        C2066c mo1634h3 = this.f32371k.mo1634h();
        int[] m3166e = m3166e(mo1634h3.m34788a());
        float[] m34787b = mo1634h3.m34787b();
        float f = mo1634h.x;
        float f2 = mo1634h.y;
        float hypot = (float) Math.hypot(mo1634h2.x - f, mo1634h2.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot, m3166e, m34787b, Shader.TileMode.CLAMP);
        this.f32365e.m10639l(m3165j, radialGradient);
        return radialGradient;
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32361a;
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        this.f32366f.reset();
        for (int i = 0; i < this.f32369i.size(); i++) {
            this.f32366f.addPath(this.f32369i.get(i).mo3148g(), matrix);
        }
        this.f32366f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        this.f32377q.invalidateSelf();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC12264c interfaceC12264c = list2.get(i);
            if (interfaceC12264c instanceof InterfaceC12275m) {
                this.f32369i.add((InterfaceC12275m) interfaceC12264c);
            }
        }
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: f */
    public void mo3146f(Canvas canvas, Matrix matrix, int i) {
        Shader m3163l;
        if (this.f32362b) {
            return;
        }
        C2199c.m34435a("GradientFillContent#draw");
        this.f32366f.reset();
        for (int i2 = 0; i2 < this.f32369i.size(); i2++) {
            this.f32366f.addPath(this.f32369i.get(i2).mo3148g(), matrix);
        }
        this.f32366f.computeBounds(this.f32368h, false);
        if (this.f32370j == EnumC2069f.LINEAR) {
            m3163l = m3164k();
        } else {
            m3163l = m3163l();
        }
        m3163l.setLocalMatrix(matrix);
        this.f32367g.setShader(m3163l);
        AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f32375o;
        if (abstractC13078a != null) {
            this.f32367g.setColorFilter(abstractC13078a.mo1634h());
        }
        this.f32367g.setAlpha(C5851g.m22900d((int) ((((i / 255.0f) * this.f32372l.mo1634h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f32366f, this.f32367g);
        C2199c.m34434b("GradientFillContent#draw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        if (t == InterfaceC2230k.f6464d) {
            this.f32372l.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6457E) {
            AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f32375o;
            if (abstractC13078a != null) {
                this.f32363c.m26790E(abstractC13078a);
            }
            if (c6015c == null) {
                this.f32375o = null;
                return;
            }
            C13099p c13099p = new C13099p(c6015c);
            this.f32375o = c13099p;
            c13099p.m1687a(this);
            this.f32363c.m26783k(this.f32375o);
        } else if (t == InterfaceC2230k.f6458F) {
            C13099p c13099p2 = this.f32376p;
            if (c13099p2 != null) {
                this.f32363c.m26790E(c13099p2);
            }
            if (c6015c == null) {
                this.f32376p = null;
                return;
            }
            this.f32364d.m10648b();
            this.f32365e.m10648b();
            C13099p c13099p3 = new C13099p(c6015c);
            this.f32376p = c13099p3;
            c13099p3.m1687a(this);
            this.f32363c.m26783k(this.f32376p);
        }
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        C5851g.m22891m(c0018e, i, list, c0018e2, this);
    }
}
