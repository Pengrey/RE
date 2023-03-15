package p436x3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C2199c;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0018e;
import p026b4.C1798b;
import p026b4.C1800d;
import p040c4.C2086q;
import p055d4.AbstractC4724a;
import p130h4.C5851g;
import p130h4.C5852h;
import p152i4.C6015c;
import p414w3.C11563a;
import p459y3.AbstractC13078a;
import p459y3.C13086c;
import p459y3.C13088e;
import p459y3.C13099p;

/* renamed from: x3.a */
/* loaded from: classes.dex */
public abstract class AbstractC12260a implements AbstractC13078a.InterfaceC13080b, InterfaceC12272k, InterfaceC12266e {

    /* renamed from: e */
    private final C2210f f32319e;

    /* renamed from: f */
    protected final AbstractC4724a f32320f;

    /* renamed from: h */
    private final float[] f32322h;

    /* renamed from: i */
    final Paint f32323i;

    /* renamed from: j */
    private final AbstractC13078a<?, Float> f32324j;

    /* renamed from: k */
    private final AbstractC13078a<?, Integer> f32325k;

    /* renamed from: l */
    private final List<AbstractC13078a<?, Float>> f32326l;

    /* renamed from: m */
    private final AbstractC13078a<?, Float> f32327m;

    /* renamed from: n */
    private AbstractC13078a<ColorFilter, ColorFilter> f32328n;

    /* renamed from: a */
    private final PathMeasure f32315a = new PathMeasure();

    /* renamed from: b */
    private final Path f32316b = new Path();

    /* renamed from: c */
    private final Path f32317c = new Path();

    /* renamed from: d */
    private final RectF f32318d = new RectF();

    /* renamed from: g */
    private final List<C12262b> f32321g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseStrokeContent.java */
    /* renamed from: x3.a$b */
    /* loaded from: classes.dex */
    public static final class C12262b {

        /* renamed from: a */
        private final List<InterfaceC12275m> f32329a;

        /* renamed from: b */
        private final C12282s f32330b;

        private C12262b(C12282s c12282s) {
            this.f32329a = new ArrayList();
            this.f32330b = c12282s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12260a(C2210f c2210f, AbstractC4724a abstractC4724a, Paint.Cap cap, Paint.Join join, float f, C1800d c1800d, C1798b c1798b, List<C1798b> list, C1798b c1798b2) {
        C11563a c11563a = new C11563a(1);
        this.f32323i = c11563a;
        this.f32319e = c2210f;
        this.f32320f = abstractC4724a;
        c11563a.setStyle(Paint.Style.STROKE);
        c11563a.setStrokeCap(cap);
        c11563a.setStrokeJoin(join);
        c11563a.setStrokeMiter(f);
        this.f32325k = c1800d.mo35329a();
        this.f32324j = c1798b.mo35329a();
        if (c1798b2 == null) {
            this.f32327m = null;
        } else {
            this.f32327m = c1798b2.mo35329a();
        }
        this.f32326l = new ArrayList(list.size());
        this.f32322h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f32326l.add(list.get(i).mo35329a());
        }
        abstractC4724a.m26783k(this.f32325k);
        abstractC4724a.m26783k(this.f32324j);
        for (int i2 = 0; i2 < this.f32326l.size(); i2++) {
            abstractC4724a.m26783k(this.f32326l.get(i2));
        }
        AbstractC13078a<?, Float> abstractC13078a = this.f32327m;
        if (abstractC13078a != null) {
            abstractC4724a.m26783k(abstractC13078a);
        }
        this.f32325k.m1687a(this);
        this.f32324j.m1687a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f32326l.get(i3).m1687a(this);
        }
        AbstractC13078a<?, Float> abstractC13078a2 = this.f32327m;
        if (abstractC13078a2 != null) {
            abstractC13078a2.m1687a(this);
        }
    }

    /* renamed from: e */
    private void m3178e(Matrix matrix) {
        C2199c.m34435a("StrokeContent#applyDashPattern");
        if (this.f32326l.isEmpty()) {
            C2199c.m34434b("StrokeContent#applyDashPattern");
            return;
        }
        float m22884g = C5852h.m22884g(matrix);
        for (int i = 0; i < this.f32326l.size(); i++) {
            this.f32322h[i] = this.f32326l.get(i).mo1634h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f32322h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f32322h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f32322h;
            fArr3[i] = fArr3[i] * m22884g;
        }
        AbstractC13078a<?, Float> abstractC13078a = this.f32327m;
        this.f32323i.setPathEffect(new DashPathEffect(this.f32322h, abstractC13078a == null ? 0.0f : m22884g * abstractC13078a.mo1634h().floatValue()));
        C2199c.m34434b("StrokeContent#applyDashPattern");
    }

    /* renamed from: j */
    private void m3177j(Canvas canvas, C12262b c12262b, Matrix matrix) {
        C2199c.m34435a("StrokeContent#applyTrimPath");
        if (c12262b.f32330b == null) {
            C2199c.m34434b("StrokeContent#applyTrimPath");
            return;
        }
        this.f32316b.reset();
        for (int size = c12262b.f32329a.size() - 1; size >= 0; size--) {
            this.f32316b.addPath(((InterfaceC12275m) c12262b.f32329a.get(size)).mo3148g(), matrix);
        }
        this.f32315a.setPath(this.f32316b, false);
        float length = this.f32315a.getLength();
        while (this.f32315a.nextContour()) {
            length += this.f32315a.getLength();
        }
        float floatValue = (c12262b.f32330b.m3141i().mo1634h().floatValue() * length) / 360.0f;
        float floatValue2 = ((c12262b.f32330b.m3140j().mo1634h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((c12262b.f32330b.m3142h().mo1634h().floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = c12262b.f32329a.size() - 1; size2 >= 0; size2--) {
            this.f32317c.set(((InterfaceC12275m) c12262b.f32329a.get(size2)).mo3148g());
            this.f32317c.transform(matrix);
            this.f32315a.setPath(this.f32317c, false);
            float length2 = this.f32315a.getLength();
            if (floatValue3 > length) {
                float f2 = floatValue3 - length;
                if (f2 < f + length2 && f < f2) {
                    C5852h.m22890a(this.f32317c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f2 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f32317c, this.f32323i);
                    f += length2;
                }
            }
            float f3 = f + length2;
            if (f3 >= floatValue2 && f <= floatValue3) {
                if (f3 <= floatValue3 && floatValue2 < f) {
                    canvas.drawPath(this.f32317c, this.f32323i);
                } else {
                    C5852h.m22890a(this.f32317c, floatValue2 < f ? 0.0f : (floatValue2 - f) / length2, floatValue3 <= f3 ? (floatValue3 - f) / length2 : 1.0f, 0.0f);
                    canvas.drawPath(this.f32317c, this.f32323i);
                }
            }
            f += length2;
        }
        C2199c.m34434b("StrokeContent#applyTrimPath");
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        C2199c.m34435a("StrokeContent#getBounds");
        this.f32316b.reset();
        for (int i = 0; i < this.f32321g.size(); i++) {
            C12262b c12262b = this.f32321g.get(i);
            for (int i2 = 0; i2 < c12262b.f32329a.size(); i2++) {
                this.f32316b.addPath(((InterfaceC12275m) c12262b.f32329a.get(i2)).mo3148g(), matrix);
            }
        }
        this.f32316b.computeBounds(this.f32318d, false);
        float m1668p = ((C13086c) this.f32324j).m1668p();
        RectF rectF2 = this.f32318d;
        float f = m1668p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f32318d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C2199c.m34434b("StrokeContent#getBounds");
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        this.f32319e.invalidateSelf();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        C12282s c12282s = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC12264c interfaceC12264c = list.get(size);
            if (interfaceC12264c instanceof C12282s) {
                C12282s c12282s2 = (C12282s) interfaceC12264c;
                if (c12282s2.m3139k() == C2086q.EnumC2087a.INDIVIDUALLY) {
                    c12282s = c12282s2;
                }
            }
        }
        if (c12282s != null) {
            c12282s.m3143e(this);
        }
        C12262b c12262b = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC12264c interfaceC12264c2 = list2.get(size2);
            if (interfaceC12264c2 instanceof C12282s) {
                C12282s c12282s3 = (C12282s) interfaceC12264c2;
                if (c12282s3.m3139k() == C2086q.EnumC2087a.INDIVIDUALLY) {
                    if (c12262b != null) {
                        this.f32321g.add(c12262b);
                    }
                    c12262b = new C12262b(c12282s3);
                    c12282s3.m3143e(this);
                }
            }
            if (interfaceC12264c2 instanceof InterfaceC12275m) {
                if (c12262b == null) {
                    c12262b = new C12262b(c12282s);
                }
                c12262b.f32329a.add((InterfaceC12275m) interfaceC12264c2);
            }
        }
        if (c12262b != null) {
            this.f32321g.add(c12262b);
        }
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: f */
    public void mo3146f(Canvas canvas, Matrix matrix, int i) {
        C2199c.m34435a("StrokeContent#draw");
        if (C5852h.m22883h(matrix)) {
            C2199c.m34434b("StrokeContent#draw");
            return;
        }
        this.f32323i.setAlpha(C5851g.m22900d((int) ((((i / 255.0f) * ((C13088e) this.f32325k).m1664p()) / 100.0f) * 255.0f), 0, 255));
        this.f32323i.setStrokeWidth(((C13086c) this.f32324j).m1668p() * C5852h.m22884g(matrix));
        if (this.f32323i.getStrokeWidth() <= 0.0f) {
            C2199c.m34434b("StrokeContent#draw");
            return;
        }
        m3178e(matrix);
        AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f32328n;
        if (abstractC13078a != null) {
            this.f32323i.setColorFilter(abstractC13078a.mo1634h());
        }
        for (int i2 = 0; i2 < this.f32321g.size(); i2++) {
            C12262b c12262b = this.f32321g.get(i2);
            if (c12262b.f32330b != null) {
                m3177j(canvas, c12262b, matrix);
            } else {
                C2199c.m34435a("StrokeContent#buildPath");
                this.f32316b.reset();
                for (int size = c12262b.f32329a.size() - 1; size >= 0; size--) {
                    this.f32316b.addPath(((InterfaceC12275m) c12262b.f32329a.get(size)).mo3148g(), matrix);
                }
                C2199c.m34434b("StrokeContent#buildPath");
                C2199c.m34435a("StrokeContent#drawPath");
                canvas.drawPath(this.f32316b, this.f32323i);
                C2199c.m34434b("StrokeContent#drawPath");
            }
        }
        C2199c.m34434b("StrokeContent#draw");
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        if (t == InterfaceC2230k.f6464d) {
            this.f32325k.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6477q) {
            this.f32324j.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6457E) {
            AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f32328n;
            if (abstractC13078a != null) {
                this.f32320f.m26790E(abstractC13078a);
            }
            if (c6015c == null) {
                this.f32328n = null;
                return;
            }
            C13099p c13099p = new C13099p(c6015c);
            this.f32328n = c13099p;
            c13099p.m1687a(this);
            this.f32320f.m26783k(this.f32328n);
        }
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        C5851g.m22891m(c0018e, i, list, c0018e2, this);
    }
}
