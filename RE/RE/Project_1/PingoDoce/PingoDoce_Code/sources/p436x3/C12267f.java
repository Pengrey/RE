package p436x3;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.List;
import p005a4.C0018e;
import p040c4.C2064a;
import p040c4.C2086q;
import p055d4.AbstractC4724a;
import p130h4.C5851g;
import p152i4.C6015c;
import p459y3.AbstractC13078a;

/* renamed from: x3.f */
/* loaded from: classes.dex */
public class C12267f implements InterfaceC12275m, AbstractC13078a.InterfaceC13080b, InterfaceC12272k {

    /* renamed from: b */
    private final String f32344b;

    /* renamed from: c */
    private final C2210f f32345c;

    /* renamed from: d */
    private final AbstractC13078a<?, PointF> f32346d;

    /* renamed from: e */
    private final AbstractC13078a<?, PointF> f32347e;

    /* renamed from: f */
    private final C2064a f32348f;

    /* renamed from: h */
    private boolean f32350h;

    /* renamed from: a */
    private final Path f32343a = new Path();

    /* renamed from: g */
    private C12263b f32349g = new C12263b();

    public C12267f(C2210f c2210f, AbstractC4724a abstractC4724a, C2064a c2064a) {
        this.f32344b = c2064a.m34793b();
        this.f32345c = c2210f;
        AbstractC13078a<PointF, PointF> mo35329a = c2064a.m34791d().mo35329a();
        this.f32346d = mo35329a;
        AbstractC13078a<PointF, PointF> mo35329a2 = c2064a.m34792c().mo35329a();
        this.f32347e = mo35329a2;
        this.f32348f = c2064a;
        abstractC4724a.m26783k(mo35329a);
        abstractC4724a.m26783k(mo35329a2);
        mo35329a.m1687a(this);
        mo35329a2.m1687a(this);
    }

    /* renamed from: e */
    private void m3167e() {
        this.f32350h = false;
        this.f32345c.invalidateSelf();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32344b;
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        m3167e();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC12264c interfaceC12264c = list.get(i);
            if (interfaceC12264c instanceof C12282s) {
                C12282s c12282s = (C12282s) interfaceC12264c;
                if (c12282s.m3139k() == C2086q.EnumC2087a.SIMULTANEOUSLY) {
                    this.f32349g.m3174a(c12282s);
                    c12282s.m3143e(this);
                }
            }
        }
    }

    @Override // p436x3.InterfaceC12275m
    /* renamed from: g */
    public Path mo3148g() {
        if (this.f32350h) {
            return this.f32343a;
        }
        this.f32343a.reset();
        if (this.f32348f.m34790e()) {
            this.f32350h = true;
            return this.f32343a;
        }
        PointF mo1634h = this.f32346d.mo1634h();
        float f = mo1634h.x / 2.0f;
        float f2 = mo1634h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f32343a.reset();
        if (this.f32348f.m34789f()) {
            float f5 = -f2;
            this.f32343a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f32343a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f32343a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f32343a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f32343a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f32343a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f32343a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f32343a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f32343a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f32343a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF mo1634h2 = this.f32347e.mo1634h();
        this.f32343a.offset(mo1634h2.x, mo1634h2.y);
        this.f32343a.close();
        this.f32349g.m3173b(this.f32343a);
        this.f32350h = true;
        return this.f32343a;
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        if (t == InterfaceC2230k.f6469i) {
            this.f32346d.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6472l) {
            this.f32347e.m1680n(c6015c);
        }
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        C5851g.m22891m(c0018e, i, list, c0018e2, this);
    }
}
