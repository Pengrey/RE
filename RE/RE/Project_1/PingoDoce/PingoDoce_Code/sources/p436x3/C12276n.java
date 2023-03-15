package p436x3;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.List;
import p005a4.C0018e;
import p040c4.C2074i;
import p040c4.C2086q;
import p055d4.AbstractC4724a;
import p130h4.C5851g;
import p152i4.C6015c;
import p459y3.AbstractC13078a;

/* renamed from: x3.n */
/* loaded from: classes.dex */
public class C12276n implements InterfaceC12275m, AbstractC13078a.InterfaceC13080b, InterfaceC12272k {

    /* renamed from: b */
    private final String f32397b;

    /* renamed from: c */
    private final C2210f f32398c;

    /* renamed from: d */
    private final C2074i.EnumC2075a f32399d;

    /* renamed from: e */
    private final boolean f32400e;

    /* renamed from: f */
    private final AbstractC13078a<?, Float> f32401f;

    /* renamed from: g */
    private final AbstractC13078a<?, PointF> f32402g;

    /* renamed from: h */
    private final AbstractC13078a<?, Float> f32403h;

    /* renamed from: i */
    private final AbstractC13078a<?, Float> f32404i;

    /* renamed from: j */
    private final AbstractC13078a<?, Float> f32405j;

    /* renamed from: k */
    private final AbstractC13078a<?, Float> f32406k;

    /* renamed from: l */
    private final AbstractC13078a<?, Float> f32407l;

    /* renamed from: n */
    private boolean f32409n;

    /* renamed from: a */
    private final Path f32396a = new Path();

    /* renamed from: m */
    private C12263b f32408m = new C12263b();

    /* compiled from: PolystarContent.java */
    /* renamed from: x3.n$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C12277a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32410a;

        static {
            int[] iArr = new int[C2074i.EnumC2075a.values().length];
            f32410a = iArr;
            try {
                iArr[C2074i.EnumC2075a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32410a[C2074i.EnumC2075a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C12276n(C2210f c2210f, AbstractC4724a abstractC4724a, C2074i c2074i) {
        this.f32398c = c2210f;
        this.f32397b = c2074i.m34754d();
        C2074i.EnumC2075a m34748j = c2074i.m34748j();
        this.f32399d = m34748j;
        this.f32400e = c2074i.m34747k();
        AbstractC13078a<Float, Float> mo35329a = c2074i.m34751g().mo35329a();
        this.f32401f = mo35329a;
        AbstractC13078a<PointF, PointF> mo35329a2 = c2074i.m34750h().mo35329a();
        this.f32402g = mo35329a2;
        AbstractC13078a<Float, Float> mo35329a3 = c2074i.m34749i().mo35329a();
        this.f32403h = mo35329a3;
        AbstractC13078a<Float, Float> mo35329a4 = c2074i.m34753e().mo35329a();
        this.f32405j = mo35329a4;
        AbstractC13078a<Float, Float> mo35329a5 = c2074i.m34752f().mo35329a();
        this.f32407l = mo35329a5;
        C2074i.EnumC2075a enumC2075a = C2074i.EnumC2075a.STAR;
        if (m34748j == enumC2075a) {
            this.f32404i = c2074i.m34756b().mo35329a();
            this.f32406k = c2074i.m34755c().mo35329a();
        } else {
            this.f32404i = null;
            this.f32406k = null;
        }
        abstractC4724a.m26783k(mo35329a);
        abstractC4724a.m26783k(mo35329a2);
        abstractC4724a.m26783k(mo35329a3);
        abstractC4724a.m26783k(mo35329a4);
        abstractC4724a.m26783k(mo35329a5);
        if (m34748j == enumC2075a) {
            abstractC4724a.m26783k(this.f32404i);
            abstractC4724a.m26783k(this.f32406k);
        }
        mo35329a.m1687a(this);
        mo35329a2.m1687a(this);
        mo35329a3.m1687a(this);
        mo35329a4.m1687a(this);
        mo35329a5.m1687a(this);
        if (m34748j == enumC2075a) {
            this.f32404i.m1687a(this);
            this.f32406k.m1687a(this);
        }
    }

    /* renamed from: e */
    private void m3156e() {
        AbstractC13078a<?, Float> abstractC13078a;
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor(this.f32401f.mo1634h().floatValue());
        double radians = Math.toRadians((this.f32403h == null ? 0.0d : abstractC13078a.mo1634h().floatValue()) - 90.0d);
        double d4 = floor;
        float floatValue = this.f32407l.mo1634h().floatValue() / 100.0f;
        float floatValue2 = this.f32405j.mo1634h().floatValue();
        double d5 = floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f32396a.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.f32396a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d = d7;
                d2 = d5;
                d3 = d6;
                i = i2;
                this.f32396a.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF mo1634h = this.f32402g.mo1634h();
        this.f32396a.offset(mo1634h.x, mo1634h.y);
        this.f32396a.close();
    }

    /* renamed from: j */
    private void m3155j() {
        AbstractC13078a<?, Float> abstractC13078a;
        double d;
        int i;
        double d2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        double d3;
        float f7;
        float f8;
        float f9;
        float floatValue = this.f32401f.mo1634h().floatValue();
        double radians = Math.toRadians((this.f32403h == null ? 0.0d : abstractC13078a.mo1634h().floatValue()) - 90.0d);
        double d4 = floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((int) floatValue);
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f12) * f11;
        }
        float floatValue2 = this.f32405j.mo1634h().floatValue();
        float floatValue3 = this.f32404i.mo1634h().floatValue();
        AbstractC13078a<?, Float> abstractC13078a2 = this.f32406k;
        float floatValue4 = abstractC13078a2 != null ? abstractC13078a2.mo1634h().floatValue() / 100.0f : 0.0f;
        AbstractC13078a<?, Float> abstractC13078a3 = this.f32407l;
        float floatValue5 = abstractC13078a3 != null ? abstractC13078a3.mo1634h().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f3 = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = f3;
            d = d4;
            f = (float) (d5 * Math.cos(radians));
            f2 = (float) (d5 * Math.sin(radians));
            this.f32396a.moveTo(f, f2);
            d2 = radians + ((f10 * f12) / 2.0f);
        } else {
            d = d4;
            i = i2;
            double d6 = floatValue2;
            float cos = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f32396a.moveTo(cos, sin);
            d2 = radians + f11;
            f = cos;
            f2 = sin;
            f3 = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                float f13 = z ? floatValue2 : floatValue3;
                int i4 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f4 = f10;
                    f5 = f11;
                } else {
                    f4 = f10;
                    f5 = (f10 * f12) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f6 = f11;
                    d3 = d7;
                    f7 = f13;
                } else {
                    f6 = f11;
                    d3 = d7;
                    f7 = f3;
                }
                double d8 = f7;
                double d9 = ceil;
                float cos2 = (float) (d8 * Math.cos(d2));
                float sin2 = (float) (d8 * Math.sin(d2));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f32396a.lineTo(cos2, sin2);
                    f8 = floatValue4;
                    f9 = f3;
                } else {
                    f8 = floatValue4;
                    f9 = f3;
                    double atan2 = (float) (Math.atan2(f2, f) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f14 = z ? f8 : floatValue5;
                    float f15 = z ? floatValue5 : f8;
                    float f16 = (z ? floatValue3 : floatValue2) * f14 * 0.47829f;
                    float f17 = cos3 * f16;
                    float f18 = f16 * sin3;
                    float f19 = (z ? floatValue2 : floatValue3) * f15 * 0.47829f;
                    float f20 = cos4 * f19;
                    float f21 = f19 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f17 *= f12;
                            f18 *= f12;
                        } else if (d3 == d9 - 1.0d) {
                            f20 *= f12;
                            f21 *= f12;
                        }
                    }
                    this.f32396a.cubicTo(f - f17, f2 - f18, cos2 + f20, sin2 + f21, cos2, sin2);
                }
                d2 += f5;
                z = !z;
                i3++;
                f = cos2;
                f2 = sin2;
                floatValue4 = f8;
                f3 = f9;
                f11 = f6;
                f10 = f4;
                ceil = d9;
            } else {
                PointF mo1634h = this.f32402g.mo1634h();
                this.f32396a.offset(mo1634h.x, mo1634h.y);
                this.f32396a.close();
                return;
            }
        }
    }

    /* renamed from: k */
    private void m3154k() {
        this.f32409n = false;
        this.f32398c.invalidateSelf();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32397b;
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        m3154k();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC12264c interfaceC12264c = list.get(i);
            if (interfaceC12264c instanceof C12282s) {
                C12282s c12282s = (C12282s) interfaceC12264c;
                if (c12282s.m3139k() == C2086q.EnumC2087a.SIMULTANEOUSLY) {
                    this.f32408m.m3174a(c12282s);
                    c12282s.m3143e(this);
                }
            }
        }
    }

    @Override // p436x3.InterfaceC12275m
    /* renamed from: g */
    public Path mo3148g() {
        if (this.f32409n) {
            return this.f32396a;
        }
        this.f32396a.reset();
        if (this.f32400e) {
            this.f32409n = true;
            return this.f32396a;
        }
        int i = C12277a.f32410a[this.f32399d.ordinal()];
        if (i == 1) {
            m3155j();
        } else if (i == 2) {
            m3156e();
        }
        this.f32396a.close();
        this.f32408m.m3173b(this.f32396a);
        this.f32409n = true;
        return this.f32396a;
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        AbstractC13078a<?, Float> abstractC13078a;
        AbstractC13078a<?, Float> abstractC13078a2;
        if (t == InterfaceC2230k.f6481u) {
            this.f32401f.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6482v) {
            this.f32403h.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6472l) {
            this.f32402g.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6483w && (abstractC13078a2 = this.f32404i) != null) {
            abstractC13078a2.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6484x) {
            this.f32405j.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6485y && (abstractC13078a = this.f32406k) != null) {
            abstractC13078a.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6486z) {
            this.f32407l.m1680n(c6015c);
        }
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        C5851g.m22891m(c0018e, i, list, c0018e2, this);
    }
}
