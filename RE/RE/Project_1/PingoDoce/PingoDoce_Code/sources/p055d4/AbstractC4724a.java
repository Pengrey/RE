package p055d4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C2199c;
import com.airbnb.lottie.C2201d;
import com.airbnb.lottie.C2210f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005a4.C0018e;
import p005a4.InterfaceC0019f;
import p040c4.C2070g;
import p040c4.C2078l;
import p055d4.C4730d;
import p130h4.C5848d;
import p130h4.C5852h;
import p152i4.C6015c;
import p414w3.C11563a;
import p436x3.InterfaceC12264c;
import p436x3.InterfaceC12266e;
import p459y3.AbstractC13078a;
import p459y3.C13086c;
import p459y3.C13090g;
import p459y3.C13098o;

/* renamed from: d4.a */
/* loaded from: classes.dex */
public abstract class AbstractC4724a implements InterfaceC12266e, AbstractC13078a.InterfaceC13080b, InterfaceC0019f {

    /* renamed from: a */
    private final Path f12921a = new Path();

    /* renamed from: b */
    private final Matrix f12922b = new Matrix();

    /* renamed from: c */
    private final Paint f12923c = new C11563a(1);

    /* renamed from: d */
    private final Paint f12924d = new C11563a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    private final Paint f12925e = new C11563a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    private final Paint f12926f;

    /* renamed from: g */
    private final Paint f12927g;

    /* renamed from: h */
    private final RectF f12928h;

    /* renamed from: i */
    private final RectF f12929i;

    /* renamed from: j */
    private final RectF f12930j;

    /* renamed from: k */
    private final RectF f12931k;

    /* renamed from: l */
    private final String f12932l;

    /* renamed from: m */
    final Matrix f12933m;

    /* renamed from: n */
    final C2210f f12934n;

    /* renamed from: o */
    final C4730d f12935o;

    /* renamed from: p */
    private C13090g f12936p;

    /* renamed from: q */
    private C13086c f12937q;

    /* renamed from: r */
    private AbstractC4724a f12938r;

    /* renamed from: s */
    private AbstractC4724a f12939s;

    /* renamed from: t */
    private List<AbstractC4724a> f12940t;

    /* renamed from: u */
    private final List<AbstractC13078a<?, ?>> f12941u;

    /* renamed from: v */
    final C13098o f12942v;

    /* renamed from: w */
    private boolean f12943w;

    /* renamed from: x */
    private boolean f12944x;

    /* renamed from: y */
    private Paint f12945y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseLayer.java */
    /* renamed from: d4.a$a */
    /* loaded from: classes.dex */
    public class C4725a implements AbstractC13078a.InterfaceC13080b {
        C4725a() {
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13080b
        /* renamed from: c */
        public void mo1678c() {
            AbstractC4724a abstractC4724a = AbstractC4724a.this;
            abstractC4724a.m26787K(abstractC4724a.f12937q.m1668p() == 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseLayer.java */
    /* renamed from: d4.a$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4726b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12947a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12948b;

        static {
            int[] iArr = new int[C2070g.EnumC2071a.values().length];
            f12948b = iArr;
            try {
                iArr[C2070g.EnumC2071a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12948b[C2070g.EnumC2071a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12948b[C2070g.EnumC2071a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12948b[C2070g.EnumC2071a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C4730d.EnumC4731a.values().length];
            f12947a = iArr2;
            try {
                iArr2[C4730d.EnumC4731a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12947a[C4730d.EnumC4731a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12947a[C4730d.EnumC4731a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12947a[C4730d.EnumC4731a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12947a[C4730d.EnumC4731a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12947a[C4730d.EnumC4731a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12947a[C4730d.EnumC4731a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4724a(C2210f c2210f, C4730d c4730d) {
        C11563a c11563a = new C11563a(1);
        this.f12926f = c11563a;
        this.f12927g = new C11563a(PorterDuff.Mode.CLEAR);
        this.f12928h = new RectF();
        this.f12929i = new RectF();
        this.f12930j = new RectF();
        this.f12931k = new RectF();
        this.f12933m = new Matrix();
        this.f12941u = new ArrayList();
        this.f12943w = true;
        this.f12934n = c2210f;
        this.f12935o = c4730d;
        this.f12932l = c4730d.m26759g() + "#draw";
        if (c4730d.m26760f() == C4730d.EnumC4732b.INVERT) {
            c11563a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            c11563a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C13098o m35339b = c4730d.m26745u().m35339b();
        this.f12942v = m35339b;
        m35339b.m1644b(this);
        if (c4730d.m26761e() != null && !c4730d.m26761e().isEmpty()) {
            C13090g c13090g = new C13090g(c4730d.m26761e());
            this.f12936p = c13090g;
            for (AbstractC13078a<C2078l, Path> abstractC13078a : c13090g.m1661a()) {
                abstractC13078a.m1687a(this);
            }
            for (AbstractC13078a<Integer, Integer> abstractC13078a2 : this.f12936p.m1659c()) {
                m26783k(abstractC13078a2);
                abstractC13078a2.m1687a(this);
            }
        }
        m26786L();
    }

    /* renamed from: A */
    private void m26794A(RectF rectF, Matrix matrix) {
        this.f12929i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m26770y()) {
            int size = this.f12936p.m1660b().size();
            for (int i = 0; i < size; i++) {
                C2070g c2070g = this.f12936p.m1660b().get(i);
                this.f12921a.set(this.f12936p.m1661a().get(i).mo1634h());
                this.f12921a.transform(matrix);
                int i2 = C4726b.f12948b[c2070g.m34763a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return;
                }
                if ((i2 == 3 || i2 == 4) && c2070g.m34760d()) {
                    return;
                }
                this.f12921a.computeBounds(this.f12931k, false);
                if (i == 0) {
                    this.f12929i.set(this.f12931k);
                } else {
                    RectF rectF2 = this.f12929i;
                    rectF2.set(Math.min(rectF2.left, this.f12931k.left), Math.min(this.f12929i.top, this.f12931k.top), Math.max(this.f12929i.right, this.f12931k.right), Math.max(this.f12929i.bottom, this.f12931k.bottom));
                }
            }
            if (rectF.intersect(this.f12929i)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: B */
    private void m26793B(RectF rectF, Matrix matrix) {
        if (m26769z() && this.f12935o.m26760f() != C4730d.EnumC4732b.INVERT) {
            this.f12930j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f12938r.mo3152b(this.f12930j, matrix, true);
            if (rectF.intersect(this.f12930j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: C */
    private void m26792C() {
        this.f12934n.invalidateSelf();
    }

    /* renamed from: D */
    private void m26791D(float f) {
        this.f12934n.m34325p().m34418n().m34291a(this.f12935o.m26759g(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m26787K(boolean z) {
        if (z != this.f12943w) {
            this.f12943w = z;
            m26792C();
        }
    }

    /* renamed from: L */
    private void m26786L() {
        if (!this.f12935o.m26763c().isEmpty()) {
            C13086c c13086c = new C13086c(this.f12935o.m26763c());
            this.f12937q = c13086c;
            c13086c.m1681l();
            this.f12937q.m1687a(new C4725a());
            m26787K(this.f12937q.mo1634h().floatValue() == 1.0f);
            m26783k(this.f12937q);
            return;
        }
        m26787K(true);
    }

    /* renamed from: l */
    private void m26782l(Canvas canvas, Matrix matrix, C2070g c2070g, AbstractC13078a<C2078l, Path> abstractC13078a, AbstractC13078a<Integer, Integer> abstractC13078a2) {
        this.f12921a.set(abstractC13078a.mo1634h());
        this.f12921a.transform(matrix);
        this.f12923c.setAlpha((int) (abstractC13078a2.mo1634h().intValue() * 2.55f));
        canvas.drawPath(this.f12921a, this.f12923c);
    }

    /* renamed from: m */
    private void m26781m(Canvas canvas, Matrix matrix, C2070g c2070g, AbstractC13078a<C2078l, Path> abstractC13078a, AbstractC13078a<Integer, Integer> abstractC13078a2) {
        C5852h.m22878m(canvas, this.f12928h, this.f12924d);
        this.f12921a.set(abstractC13078a.mo1634h());
        this.f12921a.transform(matrix);
        this.f12923c.setAlpha((int) (abstractC13078a2.mo1634h().intValue() * 2.55f));
        canvas.drawPath(this.f12921a, this.f12923c);
        canvas.restore();
    }

    /* renamed from: n */
    private void m26780n(Canvas canvas, Matrix matrix, C2070g c2070g, AbstractC13078a<C2078l, Path> abstractC13078a, AbstractC13078a<Integer, Integer> abstractC13078a2) {
        C5852h.m22878m(canvas, this.f12928h, this.f12923c);
        canvas.drawRect(this.f12928h, this.f12923c);
        this.f12921a.set(abstractC13078a.mo1634h());
        this.f12921a.transform(matrix);
        this.f12923c.setAlpha((int) (abstractC13078a2.mo1634h().intValue() * 2.55f));
        canvas.drawPath(this.f12921a, this.f12925e);
        canvas.restore();
    }

    /* renamed from: o */
    private void m26779o(Canvas canvas, Matrix matrix, C2070g c2070g, AbstractC13078a<C2078l, Path> abstractC13078a, AbstractC13078a<Integer, Integer> abstractC13078a2) {
        C5852h.m22878m(canvas, this.f12928h, this.f12924d);
        canvas.drawRect(this.f12928h, this.f12923c);
        this.f12925e.setAlpha((int) (abstractC13078a2.mo1634h().intValue() * 2.55f));
        this.f12921a.set(abstractC13078a.mo1634h());
        this.f12921a.transform(matrix);
        canvas.drawPath(this.f12921a, this.f12925e);
        canvas.restore();
    }

    /* renamed from: p */
    private void m26778p(Canvas canvas, Matrix matrix, C2070g c2070g, AbstractC13078a<C2078l, Path> abstractC13078a, AbstractC13078a<Integer, Integer> abstractC13078a2) {
        C5852h.m22878m(canvas, this.f12928h, this.f12925e);
        canvas.drawRect(this.f12928h, this.f12923c);
        this.f12925e.setAlpha((int) (abstractC13078a2.mo1634h().intValue() * 2.55f));
        this.f12921a.set(abstractC13078a.mo1634h());
        this.f12921a.transform(matrix);
        canvas.drawPath(this.f12921a, this.f12925e);
        canvas.restore();
    }

    /* renamed from: q */
    private void m26777q(Canvas canvas, Matrix matrix) {
        C2199c.m34435a("Layer#saveLayer");
        C5852h.m22877n(canvas, this.f12928h, this.f12924d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m26773u(canvas);
        }
        C2199c.m34434b("Layer#saveLayer");
        for (int i = 0; i < this.f12936p.m1660b().size(); i++) {
            C2070g c2070g = this.f12936p.m1660b().get(i);
            AbstractC13078a<C2078l, Path> abstractC13078a = this.f12936p.m1661a().get(i);
            AbstractC13078a<Integer, Integer> abstractC13078a2 = this.f12936p.m1659c().get(i);
            int i2 = C4726b.f12948b[c2070g.m34763a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f12923c.setColor(-16777216);
                        this.f12923c.setAlpha(255);
                        canvas.drawRect(this.f12928h, this.f12923c);
                    }
                    if (c2070g.m34760d()) {
                        m26778p(canvas, matrix, c2070g, abstractC13078a, abstractC13078a2);
                    } else {
                        m26776r(canvas, matrix, c2070g, abstractC13078a, abstractC13078a2);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (c2070g.m34760d()) {
                            m26780n(canvas, matrix, c2070g, abstractC13078a, abstractC13078a2);
                        } else {
                            m26782l(canvas, matrix, c2070g, abstractC13078a, abstractC13078a2);
                        }
                    }
                } else if (c2070g.m34760d()) {
                    m26779o(canvas, matrix, c2070g, abstractC13078a, abstractC13078a2);
                } else {
                    m26781m(canvas, matrix, c2070g, abstractC13078a, abstractC13078a2);
                }
            } else if (m26775s()) {
                this.f12923c.setAlpha(255);
                canvas.drawRect(this.f12928h, this.f12923c);
            }
        }
        C2199c.m34435a("Layer#restoreLayer");
        canvas.restore();
        C2199c.m34434b("Layer#restoreLayer");
    }

    /* renamed from: r */
    private void m26776r(Canvas canvas, Matrix matrix, C2070g c2070g, AbstractC13078a<C2078l, Path> abstractC13078a, AbstractC13078a<Integer, Integer> abstractC13078a2) {
        this.f12921a.set(abstractC13078a.mo1634h());
        this.f12921a.transform(matrix);
        canvas.drawPath(this.f12921a, this.f12925e);
    }

    /* renamed from: s */
    private boolean m26775s() {
        if (this.f12936p.m1661a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f12936p.m1660b().size(); i++) {
            if (this.f12936p.m1660b().get(i).m34763a() != C2070g.EnumC2071a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    private void m26774t() {
        if (this.f12940t != null) {
            return;
        }
        if (this.f12939s == null) {
            this.f12940t = Collections.emptyList();
            return;
        }
        this.f12940t = new ArrayList();
        for (AbstractC4724a abstractC4724a = this.f12939s; abstractC4724a != null; abstractC4724a = abstractC4724a.f12939s) {
            this.f12940t.add(abstractC4724a);
        }
    }

    /* renamed from: u */
    private void m26773u(Canvas canvas) {
        C2199c.m34435a("Layer#clearLayer");
        RectF rectF = this.f12928h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f12927g);
        C2199c.m34434b("Layer#clearLayer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static AbstractC4724a m26772w(C4730d c4730d, C2210f c2210f, C2201d c2201d) {
        switch (C4726b.f12947a[c4730d.m26762d().ordinal()]) {
            case 1:
                return new C4734f(c2210f, c4730d);
            case 2:
                return new C4727b(c2210f, c4730d, c2201d.m34417o(c4730d.m26755k()), c2201d);
            case 3:
                return new C4735g(c2210f, c4730d);
            case 4:
                return new C4729c(c2210f, c4730d);
            case 5:
                return new C4733e(c2210f, c4730d);
            case 6:
                return new C4736h(c2210f, c4730d);
            default:
                C5848d.m22929c("Unknown layer type " + c4730d.m26762d());
                return null;
        }
    }

    /* renamed from: E */
    public void m26790E(AbstractC13078a<?, ?> abstractC13078a) {
        this.f12941u.remove(abstractC13078a);
    }

    /* renamed from: F */
    void mo26742F(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m26789G(AbstractC4724a abstractC4724a) {
        this.f12938r = abstractC4724a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo26768H(boolean z) {
        if (z && this.f12945y == null) {
            this.f12945y = new C11563a();
        }
        this.f12944x = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m26788I(AbstractC4724a abstractC4724a) {
        this.f12939s = abstractC4724a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo26767J(float f) {
        this.f12942v.m1636j(f);
        if (this.f12936p != null) {
            for (int i = 0; i < this.f12936p.m1661a().size(); i++) {
                this.f12936p.m1661a().get(i).mo1631m(f);
            }
        }
        C13086c c13086c = this.f12937q;
        if (c13086c != null) {
            c13086c.mo1631m(f);
        }
        AbstractC4724a abstractC4724a = this.f12938r;
        if (abstractC4724a != null) {
            abstractC4724a.mo26767J(f);
        }
        for (int i2 = 0; i2 < this.f12941u.size(); i2++) {
            this.f12941u.get(i2).mo1631m(f);
        }
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: a */
    public String mo3147a() {
        return this.f12935o.m26759g();
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        this.f12928h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m26774t();
        this.f12933m.set(matrix);
        if (z) {
            List<AbstractC4724a> list = this.f12940t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f12933m.preConcat(this.f12940t.get(size).f12942v.m1640f());
                }
            } else {
                AbstractC4724a abstractC4724a = this.f12939s;
                if (abstractC4724a != null) {
                    this.f12933m.preConcat(abstractC4724a.f12942v.m1640f());
                }
            }
        }
        this.f12933m.preConcat(this.f12942v.m1640f());
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        m26792C();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
    }

    @Override // p436x3.InterfaceC12266e
    /* renamed from: f */
    public void mo3146f(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        C2199c.m34435a(this.f12932l);
        if (this.f12943w && !this.f12935o.m26744v()) {
            m26774t();
            C2199c.m34435a("Layer#parentMatrix");
            this.f12922b.reset();
            this.f12922b.set(matrix);
            for (int size = this.f12940t.size() - 1; size >= 0; size--) {
                this.f12922b.preConcat(this.f12940t.get(size).f12942v.m1640f());
            }
            C2199c.m34434b("Layer#parentMatrix");
            int intValue = (int) ((((i / 255.0f) * (this.f12942v.m1638h() == null ? 100 : this.f12942v.m1638h().mo1634h().intValue())) / 100.0f) * 255.0f);
            if (!m26769z() && !m26770y()) {
                this.f12922b.preConcat(this.f12942v.m1640f());
                C2199c.m34435a("Layer#drawLayer");
                mo26726v(canvas, this.f12922b, intValue);
                C2199c.m34434b("Layer#drawLayer");
                m26791D(C2199c.m34434b(this.f12932l));
                return;
            }
            C2199c.m34435a("Layer#computeBounds");
            mo3152b(this.f12928h, this.f12922b, false);
            m26793B(this.f12928h, matrix);
            this.f12922b.preConcat(this.f12942v.m1640f());
            m26794A(this.f12928h, this.f12922b);
            if (!this.f12928h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
                this.f12928h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C2199c.m34434b("Layer#computeBounds");
            if (this.f12928h.width() >= 1.0f && this.f12928h.height() >= 1.0f) {
                C2199c.m34435a("Layer#saveLayer");
                this.f12923c.setAlpha(255);
                C5852h.m22878m(canvas, this.f12928h, this.f12923c);
                C2199c.m34434b("Layer#saveLayer");
                m26773u(canvas);
                C2199c.m34435a("Layer#drawLayer");
                mo26726v(canvas, this.f12922b, intValue);
                C2199c.m34434b("Layer#drawLayer");
                if (m26770y()) {
                    m26777q(canvas, this.f12922b);
                }
                if (m26769z()) {
                    C2199c.m34435a("Layer#drawMatte");
                    C2199c.m34435a("Layer#saveLayer");
                    C5852h.m22877n(canvas, this.f12928h, this.f12926f, 19);
                    C2199c.m34434b("Layer#saveLayer");
                    m26773u(canvas);
                    this.f12938r.mo3146f(canvas, matrix, intValue);
                    C2199c.m34435a("Layer#restoreLayer");
                    canvas.restore();
                    C2199c.m34434b("Layer#restoreLayer");
                    C2199c.m34434b("Layer#drawMatte");
                }
                C2199c.m34435a("Layer#restoreLayer");
                canvas.restore();
                C2199c.m34434b("Layer#restoreLayer");
            }
            if (this.f12944x && (paint = this.f12945y) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f12945y.setColor(-251901);
                this.f12945y.setStrokeWidth(4.0f);
                canvas.drawRect(this.f12928h, this.f12945y);
                this.f12945y.setStyle(Paint.Style.FILL);
                this.f12945y.setColor(1357638635);
                canvas.drawRect(this.f12928h, this.f12945y);
            }
            m26791D(C2199c.m34434b(this.f12932l));
            return;
        }
        C2199c.m34434b(this.f12932l);
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        this.f12942v.m1643c(t, c6015c);
    }

    @Override // p005a4.InterfaceC0019f
    /* renamed from: i */
    public void mo3150i(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        AbstractC4724a abstractC4724a = this.f12938r;
        if (abstractC4724a != null) {
            C0018e m42119a = c0018e2.m42119a(abstractC4724a.mo3147a());
            if (c0018e.m42117c(this.f12938r.mo3147a(), i)) {
                list.add(m42119a.m42111i(this.f12938r));
            }
            if (c0018e.m42112h(mo3147a(), i)) {
                this.f12938r.mo26742F(c0018e, c0018e.m42115e(this.f12938r.mo3147a(), i) + i, list, m42119a);
            }
        }
        if (c0018e.m42113g(mo3147a(), i)) {
            if (!"__container".equals(mo3147a())) {
                c0018e2 = c0018e2.m42119a(mo3147a());
                if (c0018e.m42117c(mo3147a(), i)) {
                    list.add(c0018e2.m42111i(this));
                }
            }
            if (c0018e.m42112h(mo3147a(), i)) {
                mo26742F(c0018e, i + c0018e.m42115e(mo3147a(), i), list, c0018e2);
            }
        }
    }

    /* renamed from: k */
    public void m26783k(AbstractC13078a<?, ?> abstractC13078a) {
        if (abstractC13078a == null) {
            return;
        }
        this.f12941u.add(abstractC13078a);
    }

    /* renamed from: v */
    abstract void mo26726v(Canvas canvas, Matrix matrix, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public C4730d m26771x() {
        return this.f12935o;
    }

    /* renamed from: y */
    boolean m26770y() {
        C13090g c13090g = this.f12936p;
        return (c13090g == null || c13090g.m1661a().isEmpty()) ? false : true;
    }

    /* renamed from: z */
    boolean m26769z() {
        return this.f12938r != null;
    }
}
