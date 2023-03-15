package p436x3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import p040c4.C2082p;
import p055d4.AbstractC4724a;
import p152i4.C6015c;
import p459y3.AbstractC13078a;
import p459y3.C13085b;
import p459y3.C13099p;

/* renamed from: x3.r */
/* loaded from: classes.dex */
public class C12281r extends AbstractC12260a {

    /* renamed from: o */
    private final AbstractC4724a f32437o;

    /* renamed from: p */
    private final String f32438p;

    /* renamed from: q */
    private final boolean f32439q;

    /* renamed from: r */
    private final AbstractC13078a<Integer, Integer> f32440r;

    /* renamed from: s */
    private AbstractC13078a<ColorFilter, ColorFilter> f32441s;

    public C12281r(C2210f c2210f, AbstractC4724a abstractC4724a, C2082p c2082p) {
        super(c2210f, abstractC4724a, c2082p.m34720b().toPaintCap(), c2082p.m34717e().toPaintJoin(), c2082p.m34715g(), c2082p.m34713i(), c2082p.m34712j(), c2082p.m34716f(), c2082p.m34718d());
        this.f32437o = abstractC4724a;
        this.f32438p = c2082p.m34714h();
        this.f32439q = c2082p.m34711k();
        AbstractC13078a<Integer, Integer> mo35329a = c2082p.m34719c().mo35329a();
        this.f32440r = mo35329a;
        mo35329a.m1687a(this);
        abstractC4724a.m26783k(mo35329a);
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32438p;
    }

    @Override // p436x3.AbstractC12260a, p436x3.InterfaceC12266e
    /* renamed from: f */
    public void mo3146f(Canvas canvas, Matrix matrix, int i) {
        if (this.f32439q) {
            return;
        }
        this.f32323i.setColor(((C13085b) this.f32440r).m1671p());
        AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f32441s;
        if (abstractC13078a != null) {
            this.f32323i.setColorFilter(abstractC13078a.mo1634h());
        }
        super.mo3146f(canvas, matrix, i);
    }

    @Override // p436x3.AbstractC12260a, p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        super.mo3145h(t, c6015c);
        if (t == InterfaceC2230k.f6462b) {
            this.f32440r.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6457E) {
            AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f32441s;
            if (abstractC13078a != null) {
                this.f32437o.m26790E(abstractC13078a);
            }
            if (c6015c == null) {
                this.f32441s = null;
                return;
            }
            C13099p c13099p = new C13099p(c6015c);
            this.f32441s = c13099p;
            c13099p.m1687a(this);
            this.f32437o.m26783k(this.f32440r);
        }
    }
}
