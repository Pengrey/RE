package p436x3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2210f;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0018e;
import p005a4.InterfaceC0019f;
import p026b4.C1808l;
import p040c4.C2080n;
import p040c4.InterfaceC2065b;
import p055d4.AbstractC4724a;
import p130h4.C5852h;
import p152i4.C6015c;
import p414w3.C11563a;
import p459y3.AbstractC13078a;
import p459y3.C13098o;

/* renamed from: x3.d */
/* loaded from: classes.dex */
public class C12265d implements InterfaceC12266e, InterfaceC12275m, AbstractC13078a.InterfaceC13080b, InterfaceC0019f {

    /* renamed from: a */
    private Paint f32332a;

    /* renamed from: b */
    private RectF f32333b;

    /* renamed from: c */
    private final Matrix f32334c;

    /* renamed from: d */
    private final Path f32335d;

    /* renamed from: e */
    private final RectF f32336e;

    /* renamed from: f */
    private final String f32337f;

    /* renamed from: g */
    private final boolean f32338g;

    /* renamed from: h */
    private final List<InterfaceC12264c> f32339h;

    /* renamed from: i */
    private final C2210f f32340i;

    /* renamed from: j */
    private List<InterfaceC12275m> f32341j;

    /* renamed from: k */
    private C13098o f32342k;

    public C12265d(C2210f c2210f, AbstractC4724a abstractC4724a, C2080n c2080n) {
        this(c2210f, abstractC4724a, c2080n.m34725c(), c2080n.m34724d(), m3172e(c2210f, abstractC4724a, c2080n.m34726b()), m3171j(c2080n.m34726b()));
    }

    /* renamed from: e */
    private static List<InterfaceC12264c> m3172e(C2210f c2210f, AbstractC4724a abstractC4724a, List<InterfaceC2065b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC12264c mo34710a = list.get(i).mo34710a(c2210f, abstractC4724a);
            if (mo34710a != null) {
                arrayList.add(mo34710a);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    static C1808l m3171j(List<InterfaceC2065b> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2065b interfaceC2065b = list.get(i);
            if (interfaceC2065b instanceof C1808l) {
                return (C1808l) interfaceC2065b;
            }
        }
        return null;
    }

    /* renamed from: m */
    private boolean m3168m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f32339h.size(); i2++) {
            if ((this.f32339h.get(i2) instanceof InterfaceC12266e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f32337f;
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        this.f32334c.set(matrix);
        C13098o c13098o = this.f32342k;
        if (c13098o != null) {
            this.f32334c.preConcat(c13098o.m1640f());
        }
        this.f32336e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f32339h.size() - 1; size >= 0; size--) {
            InterfaceC12264c interfaceC12264c = this.f32339h.get(size);
            if (interfaceC12264c instanceof InterfaceC12266e) {
                ((InterfaceC12266e) interfaceC12264c).mo3152b(this.f32336e, this.f32334c, z);
                rectF.union(this.f32336e);
            }
        }
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        this.f32340i.invalidateSelf();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f32339h.size());
        arrayList.addAll(list);
        for (int size = this.f32339h.size() - 1; size >= 0; size--) {
            InterfaceC12264c interfaceC12264c = this.f32339h.get(size);
            interfaceC12264c.mo3144d(arrayList, this.f32339h.subList(0, size));
            arrayList.add(interfaceC12264c);
        }
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: f */
    public void mo3146f(Canvas canvas, Matrix matrix, int i) {
        if (this.f32338g) {
            return;
        }
        this.f32334c.set(matrix);
        C13098o c13098o = this.f32342k;
        if (c13098o != null) {
            this.f32334c.preConcat(c13098o.m1640f());
            i = (int) (((((this.f32342k.m1638h() == null ? 100 : this.f32342k.m1638h().mo1634h().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.f32340i.m34371I() && m3168m() && i != 255;
        if (z) {
            this.f32333b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo3152b(this.f32333b, this.f32334c, true);
            this.f32332a.setAlpha(i);
            C5852h.m22878m(canvas, this.f32333b, this.f32332a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f32339h.size() - 1; size >= 0; size--) {
            InterfaceC12264c interfaceC12264c = this.f32339h.get(size);
            if (interfaceC12264c instanceof InterfaceC12266e) {
                ((InterfaceC12266e) interfaceC12264c).mo3146f(canvas, this.f32334c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // p436x3.InterfaceC12275m
    /* renamed from: g */
    public Path mo3148g() {
        this.f32334c.reset();
        C13098o c13098o = this.f32342k;
        if (c13098o != null) {
            this.f32334c.set(c13098o.m1640f());
        }
        this.f32335d.reset();
        if (this.f32338g) {
            return this.f32335d;
        }
        for (int size = this.f32339h.size() - 1; size >= 0; size--) {
            InterfaceC12264c interfaceC12264c = this.f32339h.get(size);
            if (interfaceC12264c instanceof InterfaceC12275m) {
                this.f32335d.addPath(((InterfaceC12275m) interfaceC12264c).mo3148g(), this.f32334c);
            }
        }
        return this.f32335d;
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        C13098o c13098o = this.f32342k;
        if (c13098o != null) {
            c13098o.m1643c(t, c6015c);
        }
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        if (c0018e.m42113g(mo3147a(), i) || "__container".equals(mo3147a())) {
            if (!"__container".equals(mo3147a())) {
                c0018e2 = c0018e2.m42119a(mo3147a());
                if (c0018e.m42117c(mo3147a(), i)) {
                    list.add(c0018e2.m42111i(this));
                }
            }
            if (c0018e.m42112h(mo3147a(), i)) {
                int m42115e = i + c0018e.m42115e(mo3147a(), i);
                for (int i2 = 0; i2 < this.f32339h.size(); i2++) {
                    InterfaceC12264c interfaceC12264c = this.f32339h.get(i2);
                    if (interfaceC12264c instanceof InterfaceC0019f) {
                        ((InterfaceC0019f) interfaceC12264c).mo3150i(c0018e, m42115e, list, c0018e2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<InterfaceC12275m> m3170k() {
        if (this.f32341j == null) {
            this.f32341j = new ArrayList();
            for (int i = 0; i < this.f32339h.size(); i++) {
                InterfaceC12264c interfaceC12264c = this.f32339h.get(i);
                if (interfaceC12264c instanceof InterfaceC12275m) {
                    this.f32341j.add((InterfaceC12275m) interfaceC12264c);
                }
            }
        }
        return this.f32341j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Matrix m3169l() {
        C13098o c13098o = this.f32342k;
        if (c13098o != null) {
            return c13098o.m1640f();
        }
        this.f32334c.reset();
        return this.f32334c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12265d(C2210f c2210f, AbstractC4724a abstractC4724a, String str, boolean z, List<InterfaceC12264c> list, C1808l c1808l) {
        this.f32332a = new C11563a();
        this.f32333b = new RectF();
        this.f32334c = new Matrix();
        this.f32335d = new Path();
        this.f32336e = new RectF();
        this.f32337f = str;
        this.f32340i = c2210f;
        this.f32338g = z;
        this.f32339h = list;
        if (c1808l != null) {
            C13098o m35339b = c1808l.m35339b();
            this.f32342k = m35339b;
            m35339b.m1645a(abstractC4724a);
            this.f32342k.m1644b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC12264c interfaceC12264c = list.get(size);
            if (interfaceC12264c instanceof InterfaceC12271j) {
                arrayList.add((InterfaceC12271j) interfaceC12264c);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC12271j) arrayList.get(size2)).mo3151e(list.listIterator(list.size()));
        }
    }
}
