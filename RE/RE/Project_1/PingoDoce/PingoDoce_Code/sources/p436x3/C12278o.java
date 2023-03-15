package p436x3;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.List;
import p005a4.C0018e;
import p040c4.C2076j;
import p040c4.C2086q;
import p055d4.AbstractC4724a;
import p130h4.C5851g;
import p152i4.C6015c;
import p459y3.AbstractC13078a;
import p459y3.C13086c;

/* renamed from: x3.o */
/* loaded from: classes.dex */
public class C12278o implements AbstractC13078a.InterfaceC13080b, InterfaceC12272k, InterfaceC12275m {

    /* renamed from: c */
    private final String f32413c;

    /* renamed from: d */
    private final boolean f32414d;

    /* renamed from: e */
    private final C2210f f32415e;

    /* renamed from: f */
    private final AbstractC13078a<?, PointF> f32416f;

    /* renamed from: g */
    private final AbstractC13078a<?, PointF> f32417g;

    /* renamed from: h */
    private final AbstractC13078a<?, Float> f32418h;

    /* renamed from: j */
    private boolean f32420j;

    /* renamed from: a */
    private final Path f32411a = new Path();

    /* renamed from: b */
    private final RectF f32412b = new RectF();

    /* renamed from: i */
    private C12263b f32419i = new C12263b();

    public C12278o(C2210f c2210f, AbstractC4724a abstractC4724a, C2076j c2076j) {
        this.f32413c = c2076j.m34745c();
        this.f32414d = c2076j.m34742f();
        this.f32415e = c2210f;
        AbstractC13078a<PointF, PointF> mo35329a = c2076j.m34744d().mo35329a();
        this.f32416f = mo35329a;
        AbstractC13078a<PointF, PointF> mo35329a2 = c2076j.m34743e().mo35329a();
        this.f32417g = mo35329a2;
        AbstractC13078a<Float, Float> mo35329a3 = c2076j.m34746b().mo35329a();
        this.f32418h = mo35329a3;
        abstractC4724a.m26783k(mo35329a);
        abstractC4724a.m26783k(mo35329a2);
        abstractC4724a.m26783k(mo35329a3);
        mo35329a.m1687a(this);
        mo35329a2.m1687a(this);
        mo35329a3.m1687a(this);
    }

    /* renamed from: e */
    private void m3153e() {
        this.f32420j = false;
        this.f32415e.invalidateSelf();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32413c;
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        m3153e();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC12264c interfaceC12264c = list.get(i);
            if (interfaceC12264c instanceof C12282s) {
                C12282s c12282s = (C12282s) interfaceC12264c;
                if (c12282s.m3139k() == C2086q.EnumC2087a.SIMULTANEOUSLY) {
                    this.f32419i.m3174a(c12282s);
                    c12282s.m3143e(this);
                }
            }
        }
    }

    @Override // p436x3.InterfaceC12275m
    /* renamed from: g */
    public Path mo3148g() {
        if (this.f32420j) {
            return this.f32411a;
        }
        this.f32411a.reset();
        if (this.f32414d) {
            this.f32420j = true;
            return this.f32411a;
        }
        PointF mo1634h = this.f32417g.mo1634h();
        float f = mo1634h.x / 2.0f;
        float f2 = mo1634h.y / 2.0f;
        AbstractC13078a<?, Float> abstractC13078a = this.f32418h;
        float m1668p = abstractC13078a == null ? 0.0f : ((C13086c) abstractC13078a).m1668p();
        float min = Math.min(f, f2);
        if (m1668p > min) {
            m1668p = min;
        }
        PointF mo1634h2 = this.f32416f.mo1634h();
        this.f32411a.moveTo(mo1634h2.x + f, (mo1634h2.y - f2) + m1668p);
        this.f32411a.lineTo(mo1634h2.x + f, (mo1634h2.y + f2) - m1668p);
        int i = (m1668p > 0.0f ? 1 : (m1668p == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f32412b;
            float f3 = mo1634h2.x;
            float f4 = m1668p * 2.0f;
            float f5 = mo1634h2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f32411a.arcTo(this.f32412b, 0.0f, 90.0f, false);
        }
        this.f32411a.lineTo((mo1634h2.x - f) + m1668p, mo1634h2.y + f2);
        if (i > 0) {
            RectF rectF2 = this.f32412b;
            float f6 = mo1634h2.x;
            float f7 = mo1634h2.y;
            float f8 = m1668p * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f32411a.arcTo(this.f32412b, 90.0f, 90.0f, false);
        }
        this.f32411a.lineTo(mo1634h2.x - f, (mo1634h2.y - f2) + m1668p);
        if (i > 0) {
            RectF rectF3 = this.f32412b;
            float f9 = mo1634h2.x;
            float f10 = mo1634h2.y;
            float f11 = m1668p * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f32411a.arcTo(this.f32412b, 180.0f, 90.0f, false);
        }
        this.f32411a.lineTo((mo1634h2.x + f) - m1668p, mo1634h2.y - f2);
        if (i > 0) {
            RectF rectF4 = this.f32412b;
            float f12 = mo1634h2.x;
            float f13 = m1668p * 2.0f;
            float f14 = mo1634h2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f32411a.arcTo(this.f32412b, 270.0f, 90.0f, false);
        }
        this.f32411a.close();
        this.f32419i.m3173b(this.f32411a);
        this.f32420j = true;
        return this.f32411a;
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        if (t == InterfaceC2230k.f6470j) {
            this.f32417g.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6472l) {
            this.f32416f.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6471k) {
            this.f32418h.m1680n(c6015c);
        }
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        C5851g.m22891m(c0018e, i, list, c0018e2, this);
    }
}
