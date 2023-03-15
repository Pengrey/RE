package p055d4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.C2199c;
import com.airbnb.lottie.C2201d;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0018e;
import p026b4.C1798b;
import p055d4.C4730d;
import p130h4.C5852h;
import p152i4.C6015c;
import p301q.C9556e;
import p459y3.AbstractC13078a;
import p459y3.C13099p;

/* renamed from: d4.b */
/* loaded from: classes.dex */
public class C4727b extends AbstractC4724a {

    /* renamed from: A */
    private final List<AbstractC4724a> f12949A;

    /* renamed from: B */
    private final RectF f12950B;

    /* renamed from: C */
    private final RectF f12951C;

    /* renamed from: D */
    private Paint f12952D;

    /* renamed from: z */
    private AbstractC13078a<Float, Float> f12953z;

    /* compiled from: CompositionLayer.java */
    /* renamed from: d4.b$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C4728a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12954a;

        static {
            int[] iArr = new int[C4730d.EnumC4732b.values().length];
            f12954a = iArr;
            try {
                iArr[C4730d.EnumC4732b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12954a[C4730d.EnumC4732b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C4727b(C2210f c2210f, C4730d c4730d, List<C4730d> list, C2201d c2201d) {
        super(c2210f, c4730d);
        int i;
        AbstractC4724a abstractC4724a;
        this.f12949A = new ArrayList();
        this.f12950B = new RectF();
        this.f12951C = new RectF();
        this.f12952D = new Paint();
        C1798b m26747s = c4730d.m26747s();
        if (m26747s != null) {
            AbstractC13078a<Float, Float> mo35329a = m26747s.mo35329a();
            this.f12953z = mo35329a;
            m26783k(mo35329a);
            this.f12953z.m1687a(this);
        } else {
            this.f12953z = null;
        }
        C9556e c9556e = new C9556e(c2201d.m34421k().size());
        int size = list.size() - 1;
        AbstractC4724a abstractC4724a2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C4730d c4730d2 = list.get(size);
            AbstractC4724a m26772w = AbstractC4724a.m26772w(c4730d2, c2210f, c2201d);
            if (m26772w != null) {
                c9556e.m10639l(m26772w.m26771x().m26764b(), m26772w);
                if (abstractC4724a2 != null) {
                    abstractC4724a2.m26789G(m26772w);
                    abstractC4724a2 = null;
                } else {
                    this.f12949A.add(0, m26772w);
                    int i2 = C4728a.f12954a[c4730d2.m26760f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        abstractC4724a2 = m26772w;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < c9556e.m10636o(); i++) {
            AbstractC4724a abstractC4724a3 = (AbstractC4724a) c9556e.m10644f(c9556e.m10640k(i));
            if (abstractC4724a3 != null && (abstractC4724a = (AbstractC4724a) c9556e.m10644f(abstractC4724a3.m26771x().m26758h())) != null) {
                abstractC4724a3.m26788I(abstractC4724a);
            }
        }
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: F */
    protected void mo26742F(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        for (int i2 = 0; i2 < this.f12949A.size(); i2++) {
            this.f12949A.get(i2).mo3150i(c0018e, i, list, c0018e2);
        }
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: H */
    public void mo26768H(boolean z) {
        super.mo26768H(z);
        for (AbstractC4724a abstractC4724a : this.f12949A) {
            abstractC4724a.mo26768H(z);
        }
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: J */
    public void mo26767J(float f) {
        super.mo26767J(f);
        if (this.f12953z != null) {
            f = ((this.f12953z.mo1634h().floatValue() * this.f12935o.m26765a().m34423i()) - this.f12935o.m26765a().m34416p()) / (this.f12934n.m34325p().m34427e() + 0.01f);
        }
        if (this.f12953z == null) {
            f -= this.f12935o.m26750p();
        }
        if (this.f12935o.m26746t() != 0.0f && !"__container".equals(this.f12935o.m26759g())) {
            f /= this.f12935o.m26746t();
        }
        for (int size = this.f12949A.size() - 1; size >= 0; size--) {
            this.f12949A.get(size).mo26767J(f);
        }
    }

    @Override // p055d4.AbstractC4724a, p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        super.mo3152b(rectF, matrix, z);
        for (int size = this.f12949A.size() - 1; size >= 0; size--) {
            this.f12950B.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f12949A.get(size).mo3152b(this.f12950B, this.f12933m, true);
            rectF.union(this.f12950B);
        }
    }

    @Override // p055d4.AbstractC4724a, p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        super.mo3145h(t, c6015c);
        if (t == InterfaceC2230k.f6455C) {
            if (c6015c == null) {
                AbstractC13078a<Float, Float> abstractC13078a = this.f12953z;
                if (abstractC13078a != null) {
                    abstractC13078a.m1680n(null);
                    return;
                }
                return;
            }
            C13099p c13099p = new C13099p(c6015c);
            this.f12953z = c13099p;
            c13099p.m1687a(this);
            m26783k(this.f12953z);
        }
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: v */
    void mo26726v(Canvas canvas, Matrix matrix, int i) {
        C2199c.m34435a("CompositionLayer#draw");
        this.f12951C.set(0.0f, 0.0f, this.f12935o.m26756j(), this.f12935o.m26757i());
        matrix.mapRect(this.f12951C);
        boolean z = this.f12934n.m34371I() && this.f12949A.size() > 1 && i != 255;
        if (z) {
            this.f12952D.setAlpha(i);
            C5852h.m22878m(canvas, this.f12951C, this.f12952D);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f12949A.size() - 1; size >= 0; size--) {
            if (!this.f12951C.isEmpty() ? canvas.clipRect(this.f12951C) : true) {
                this.f12949A.get(size).mo3146f(canvas, matrix, i);
            }
        }
        canvas.restore();
        C2199c.m34434b("CompositionLayer#draw");
    }
}
