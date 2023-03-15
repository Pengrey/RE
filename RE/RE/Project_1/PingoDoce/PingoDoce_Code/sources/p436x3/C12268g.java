package p436x3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2199c;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0018e;
import p040c4.C2079m;
import p055d4.AbstractC4724a;
import p130h4.C5851g;
import p152i4.C6015c;
import p414w3.C11563a;
import p459y3.AbstractC13078a;
import p459y3.C13085b;
import p459y3.C13099p;

/* renamed from: x3.g */
/* loaded from: classes.dex */
public class C12268g implements InterfaceC12266e, AbstractC13078a.InterfaceC13080b, InterfaceC12272k {

    /* renamed from: a */
    private final Path f32351a;

    /* renamed from: b */
    private final Paint f32352b;

    /* renamed from: c */
    private final AbstractC4724a f32353c;

    /* renamed from: d */
    private final String f32354d;

    /* renamed from: e */
    private final boolean f32355e;

    /* renamed from: f */
    private final List<InterfaceC12275m> f32356f;

    /* renamed from: g */
    private final AbstractC13078a<Integer, Integer> f32357g;

    /* renamed from: h */
    private final AbstractC13078a<Integer, Integer> f32358h;

    /* renamed from: i */
    private AbstractC13078a<ColorFilter, ColorFilter> f32359i;

    /* renamed from: j */
    private final C2210f f32360j;

    public C12268g(C2210f c2210f, AbstractC4724a abstractC4724a, C2079m c2079m) {
        Path path = new Path();
        this.f32351a = path;
        this.f32352b = new C11563a(1);
        this.f32356f = new ArrayList();
        this.f32353c = abstractC4724a;
        this.f32354d = c2079m.m34729d();
        this.f32355e = c2079m.m34727f();
        this.f32360j = c2210f;
        if (c2079m.m34731b() != null && c2079m.m34728e() != null) {
            path.setFillType(c2079m.m34730c());
            AbstractC13078a<Integer, Integer> mo35329a = c2079m.m34731b().mo35329a();
            this.f32357g = mo35329a;
            mo35329a.m1687a(this);
            abstractC4724a.m26783k(mo35329a);
            AbstractC13078a<Integer, Integer> mo35329a2 = c2079m.m34728e().mo35329a();
            this.f32358h = mo35329a2;
            mo35329a2.m1687a(this);
            abstractC4724a.m26783k(mo35329a2);
            return;
        }
        this.f32357g = null;
        this.f32358h = null;
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32354d;
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        this.f32351a.reset();
        for (int i = 0; i < this.f32356f.size(); i++) {
            this.f32351a.addPath(this.f32356f.get(i).mo3148g(), matrix);
        }
        this.f32351a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        this.f32360j.invalidateSelf();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC12264c interfaceC12264c = list2.get(i);
            if (interfaceC12264c instanceof InterfaceC12275m) {
                this.f32356f.add((InterfaceC12275m) interfaceC12264c);
            }
        }
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: f */
    public void mo3146f(Canvas canvas, Matrix matrix, int i) {
        if (this.f32355e) {
            return;
        }
        C2199c.m34435a("FillContent#draw");
        this.f32352b.setColor(((C13085b) this.f32357g).m1671p());
        this.f32352b.setAlpha(C5851g.m22900d((int) ((((i / 255.0f) * this.f32358h.mo1634h().intValue()) / 100.0f) * 255.0f), 0, 255));
        AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f32359i;
        if (abstractC13078a != null) {
            this.f32352b.setColorFilter(abstractC13078a.mo1634h());
        }
        this.f32351a.reset();
        for (int i2 = 0; i2 < this.f32356f.size(); i2++) {
            this.f32351a.addPath(this.f32356f.get(i2).mo3148g(), matrix);
        }
        canvas.drawPath(this.f32351a, this.f32352b);
        C2199c.m34434b("FillContent#draw");
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        if (t == InterfaceC2230k.f6461a) {
            this.f32357g.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6464d) {
            this.f32358h.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6457E) {
            AbstractC13078a<ColorFilter, ColorFilter> abstractC13078a = this.f32359i;
            if (abstractC13078a != null) {
                this.f32353c.m26790E(abstractC13078a);
            }
            if (c6015c == null) {
                this.f32359i = null;
                return;
            }
            C13099p c13099p = new C13099p(c6015c);
            this.f32359i = c13099p;
            c13099p.m1687a(this);
            this.f32353c.m26783k(this.f32359i);
        }
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        C5851g.m22891m(c0018e, i, list, c0018e2, this);
    }
}
