package p436x3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p005a4.C0018e;
import p040c4.C2077k;
import p055d4.AbstractC4724a;
import p130h4.C5851g;
import p152i4.C6015c;
import p459y3.AbstractC13078a;
import p459y3.C13098o;

/* renamed from: x3.p */
/* loaded from: classes.dex */
public class C12279p implements InterfaceC12266e, InterfaceC12275m, InterfaceC12271j, AbstractC13078a.InterfaceC13080b, InterfaceC12272k {

    /* renamed from: a */
    private final Matrix f32421a = new Matrix();

    /* renamed from: b */
    private final Path f32422b = new Path();

    /* renamed from: c */
    private final C2210f f32423c;

    /* renamed from: d */
    private final AbstractC4724a f32424d;

    /* renamed from: e */
    private final String f32425e;

    /* renamed from: f */
    private final boolean f32426f;

    /* renamed from: g */
    private final AbstractC13078a<Float, Float> f32427g;

    /* renamed from: h */
    private final AbstractC13078a<Float, Float> f32428h;

    /* renamed from: i */
    private final C13098o f32429i;

    /* renamed from: j */
    private C12265d f32430j;

    public C12279p(C2210f c2210f, AbstractC4724a abstractC4724a, C2077k c2077k) {
        this.f32423c = c2210f;
        this.f32424d = abstractC4724a;
        this.f32425e = c2077k.m34740c();
        this.f32426f = c2077k.m34737f();
        AbstractC13078a<Float, Float> mo35329a = c2077k.m34741b().mo35329a();
        this.f32427g = mo35329a;
        abstractC4724a.m26783k(mo35329a);
        mo35329a.m1687a(this);
        AbstractC13078a<Float, Float> mo35329a2 = c2077k.m34739d().mo35329a();
        this.f32428h = mo35329a2;
        abstractC4724a.m26783k(mo35329a2);
        mo35329a2.m1687a(this);
        C13098o m35339b = c2077k.m34738e().m35339b();
        this.f32429i = m35339b;
        m35339b.m1645a(abstractC4724a);
        m35339b.m1644b(this);
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32425e;
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        this.f32430j.mo3152b(rectF, matrix, z);
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        this.f32423c.invalidateSelf();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        this.f32430j.mo3144d(list, list2);
    }

    @Override // p436x3.InterfaceC12271j
    /* renamed from: e */
    public void mo3151e(ListIterator<InterfaceC12264c> listIterator) {
        if (this.f32430j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f32430j = new C12265d(this.f32423c, this.f32424d, "Repeater", this.f32426f, arrayList, null);
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: f */
    public void mo3146f(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f32427g.mo1634h().floatValue();
        float floatValue2 = this.f32428h.mo1634h().floatValue();
        float floatValue3 = this.f32429i.m1637i().mo1634h().floatValue() / 100.0f;
        float floatValue4 = this.f32429i.m1641e().mo1634h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f32421a.set(matrix);
            float f = i2;
            this.f32421a.preConcat(this.f32429i.m1639g(f + floatValue2));
            this.f32430j.mo3146f(canvas, this.f32421a, (int) (i * C5851g.m22893k(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // p436x3.InterfaceC12275m
    /* renamed from: g */
    public Path mo3148g() {
        Path mo3148g = this.f32430j.mo3148g();
        this.f32422b.reset();
        float floatValue = this.f32427g.mo1634h().floatValue();
        float floatValue2 = this.f32428h.mo1634h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f32421a.set(this.f32429i.m1639g(i + floatValue2));
            this.f32422b.addPath(mo3148g, this.f32421a);
        }
        return this.f32422b;
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        if (this.f32429i.m1643c(t, c6015c)) {
            return;
        }
        if (t == InterfaceC2230k.f6479s) {
            this.f32427g.m1680n(c6015c);
        } else if (t == InterfaceC2230k.f6480t) {
            this.f32428h.m1680n(c6015c);
        }
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        C5851g.m22891m(c0018e, i, list, c0018e2, this);
    }
}
