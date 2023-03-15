package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C1076h;
import p348s2.C10038b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* loaded from: classes.dex */
public class C1688b extends Drawable implements Animatable {

    /* renamed from: C */
    private static final Interpolator f5115C = new LinearInterpolator();

    /* renamed from: D */
    private static final Interpolator f5116D = new C10038b();

    /* renamed from: E */
    private static final int[] f5117E = {-16777216};

    /* renamed from: A */
    float f5118A;

    /* renamed from: B */
    boolean f5119B;

    /* renamed from: w */
    private final C1691c f5120w;

    /* renamed from: x */
    private float f5121x;

    /* renamed from: y */
    private Resources f5122y;

    /* renamed from: z */
    private Animator f5123z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* loaded from: classes.dex */
    public class C1689a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1691c f5124a;

        C1689a(C1691c c1691c) {
            this.f5124a = c1691c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1688b.this.m35719q(floatValue, this.f5124a);
            C1688b.this.m35734b(floatValue, this.f5124a, false);
            C1688b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* loaded from: classes.dex */
    public class C1690b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C1691c f5126a;

        C1690b(C1691c c1691c) {
            this.f5126a = c1691c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C1688b.this.m35734b(1.0f, this.f5126a, true);
            this.f5126a.m35716C();
            this.f5126a.m35702n();
            C1688b c1688b = C1688b.this;
            if (c1688b.f5119B) {
                c1688b.f5119B = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f5126a.m35690z(false);
                return;
            }
            c1688b.f5118A += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1688b.this.f5118A = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* loaded from: classes.dex */
    public static class C1691c {

        /* renamed from: a */
        final RectF f5128a = new RectF();

        /* renamed from: b */
        final Paint f5129b;

        /* renamed from: c */
        final Paint f5130c;

        /* renamed from: d */
        final Paint f5131d;

        /* renamed from: e */
        float f5132e;

        /* renamed from: f */
        float f5133f;

        /* renamed from: g */
        float f5134g;

        /* renamed from: h */
        float f5135h;

        /* renamed from: i */
        int[] f5136i;

        /* renamed from: j */
        int f5137j;

        /* renamed from: k */
        float f5138k;

        /* renamed from: l */
        float f5139l;

        /* renamed from: m */
        float f5140m;

        /* renamed from: n */
        boolean f5141n;

        /* renamed from: o */
        Path f5142o;

        /* renamed from: p */
        float f5143p;

        /* renamed from: q */
        float f5144q;

        /* renamed from: r */
        int f5145r;

        /* renamed from: s */
        int f5146s;

        /* renamed from: t */
        int f5147t;

        /* renamed from: u */
        int f5148u;

        C1691c() {
            Paint paint = new Paint();
            this.f5129b = paint;
            Paint paint2 = new Paint();
            this.f5130c = paint2;
            Paint paint3 = new Paint();
            this.f5131d = paint3;
            this.f5132e = 0.0f;
            this.f5133f = 0.0f;
            this.f5134g = 0.0f;
            this.f5135h = 5.0f;
            this.f5143p = 1.0f;
            this.f5147t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m35718A(float f) {
            this.f5132e = f;
        }

        /* renamed from: B */
        void m35717B(float f) {
            this.f5135h = f;
            this.f5129b.setStrokeWidth(f);
        }

        /* renamed from: C */
        void m35716C() {
            this.f5138k = this.f5132e;
            this.f5139l = this.f5133f;
            this.f5140m = this.f5134g;
        }

        /* renamed from: a */
        void m35715a(Canvas canvas, Rect rect) {
            RectF rectF = this.f5128a;
            float f = this.f5144q;
            float f2 = (this.f5135h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f5145r * this.f5143p) / 2.0f, this.f5135h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f5132e;
            float f4 = this.f5134g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f5133f + f4) * 360.0f) - f5;
            this.f5129b.setColor(this.f5148u);
            this.f5129b.setAlpha(this.f5147t);
            float f7 = this.f5135h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5131d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f5129b);
            m35714b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        void m35714b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f5141n) {
                Path path = this.f5142o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f5142o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f5142o.moveTo(0.0f, 0.0f);
                this.f5142o.lineTo(this.f5145r * this.f5143p, 0.0f);
                Path path3 = this.f5142o;
                float f3 = this.f5143p;
                path3.lineTo((this.f5145r * f3) / 2.0f, this.f5146s * f3);
                this.f5142o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f5145r * this.f5143p) / 2.0f), rectF.centerY() + (this.f5135h / 2.0f));
                this.f5142o.close();
                this.f5130c.setColor(this.f5148u);
                this.f5130c.setAlpha(this.f5147t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f5142o, this.f5130c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m35713c() {
            return this.f5147t;
        }

        /* renamed from: d */
        float m35712d() {
            return this.f5144q;
        }

        /* renamed from: e */
        float m35711e() {
            return this.f5133f;
        }

        /* renamed from: f */
        int m35710f() {
            return this.f5136i[m35709g()];
        }

        /* renamed from: g */
        int m35709g() {
            return (this.f5137j + 1) % this.f5136i.length;
        }

        /* renamed from: h */
        float m35708h() {
            return this.f5132e;
        }

        /* renamed from: i */
        int m35707i() {
            return this.f5136i[this.f5137j];
        }

        /* renamed from: j */
        float m35706j() {
            return this.f5139l;
        }

        /* renamed from: k */
        float m35705k() {
            return this.f5140m;
        }

        /* renamed from: l */
        float m35704l() {
            return this.f5138k;
        }

        /* renamed from: m */
        float m35703m() {
            return this.f5135h;
        }

        /* renamed from: n */
        void m35702n() {
            m35694v(m35709g());
        }

        /* renamed from: o */
        void m35701o() {
            this.f5138k = 0.0f;
            this.f5139l = 0.0f;
            this.f5140m = 0.0f;
            m35718A(0.0f);
            m35692x(0.0f);
            m35691y(0.0f);
        }

        /* renamed from: p */
        void m35700p(int i) {
            this.f5147t = i;
        }

        /* renamed from: q */
        void m35699q(float f, float f2) {
            this.f5145r = (int) f;
            this.f5146s = (int) f2;
        }

        /* renamed from: r */
        void m35698r(float f) {
            if (f != this.f5143p) {
                this.f5143p = f;
            }
        }

        /* renamed from: s */
        void m35697s(float f) {
            this.f5144q = f;
        }

        /* renamed from: t */
        void m35696t(int i) {
            this.f5148u = i;
        }

        /* renamed from: u */
        void m35695u(ColorFilter colorFilter) {
            this.f5129b.setColorFilter(colorFilter);
        }

        /* renamed from: v */
        void m35694v(int i) {
            this.f5137j = i;
            this.f5148u = this.f5136i[i];
        }

        /* renamed from: w */
        void m35693w(int[] iArr) {
            this.f5136i = iArr;
            m35694v(0);
        }

        /* renamed from: x */
        void m35692x(float f) {
            this.f5133f = f;
        }

        /* renamed from: y */
        void m35691y(float f) {
            this.f5134g = f;
        }

        /* renamed from: z */
        void m35690z(boolean z) {
            if (this.f5141n != z) {
                this.f5141n = z;
            }
        }
    }

    public C1688b(Context context) {
        this.f5122y = ((Context) C1076h.m38619f(context)).getResources();
        C1691c c1691c = new C1691c();
        this.f5120w = c1691c;
        c1691c.m35693w(f5117E);
        m35722n(2.5f);
        m35720p();
    }

    /* renamed from: a */
    private void m35735a(float f, C1691c c1691c) {
        m35719q(f, c1691c);
        c1691c.m35718A(c1691c.m35704l() + (((c1691c.m35706j() - 0.01f) - c1691c.m35704l()) * f));
        c1691c.m35692x(c1691c.m35706j());
        c1691c.m35691y(c1691c.m35705k() + ((((float) (Math.floor(c1691c.m35705k() / 0.8f) + 1.0d)) - c1691c.m35705k()) * f));
    }

    /* renamed from: c */
    private int m35733c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* renamed from: k */
    private void m35725k(float f) {
        this.f5121x = f;
    }

    /* renamed from: l */
    private void m35724l(float f, float f2, float f3, float f4) {
        C1691c c1691c = this.f5120w;
        float f5 = this.f5122y.getDisplayMetrics().density;
        c1691c.m35717B(f2 * f5);
        c1691c.m35697s(f * f5);
        c1691c.m35694v(0);
        c1691c.m35699q(f3 * f5, f4 * f5);
    }

    /* renamed from: p */
    private void m35720p() {
        C1691c c1691c = this.f5120w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C1689a(c1691c));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5115C);
        ofFloat.addListener(new C1690b(c1691c));
        this.f5123z = ofFloat;
    }

    /* renamed from: b */
    void m35734b(float f, C1691c c1691c, boolean z) {
        float interpolation;
        float f2;
        if (this.f5119B) {
            m35735a(f, c1691c);
        } else if (f != 1.0f || z) {
            float m35705k = c1691c.m35705k();
            if (f < 0.5f) {
                interpolation = c1691c.m35704l();
                f2 = (f5116D.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m35704l = c1691c.m35704l() + 0.79f;
                interpolation = m35704l - (((1.0f - f5116D.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = m35704l;
            }
            c1691c.m35718A(interpolation);
            c1691c.m35692x(f2);
            c1691c.m35691y(m35705k + (0.20999998f * f));
            m35725k((f + this.f5118A) * 216.0f);
        }
    }

    /* renamed from: d */
    public float m35732d() {
        return this.f5120w.m35712d();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5121x, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5120w.m35715a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public float m35731e() {
        return this.f5120w.m35703m();
    }

    /* renamed from: f */
    public void m35730f(boolean z) {
        this.f5120w.m35690z(z);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m35729g(float f) {
        this.f5120w.m35698r(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5120w.m35713c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m35728h(float f) {
        this.f5120w.m35697s(f);
        invalidateSelf();
    }

    /* renamed from: i */
    public void m35727i(int... iArr) {
        this.f5120w.m35693w(iArr);
        this.f5120w.m35694v(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5123z.isRunning();
    }

    /* renamed from: j */
    public void m35726j(float f) {
        this.f5120w.m35691y(f);
        invalidateSelf();
    }

    /* renamed from: m */
    public void m35723m(float f, float f2) {
        this.f5120w.m35718A(f);
        this.f5120w.m35692x(f2);
        invalidateSelf();
    }

    /* renamed from: n */
    public void m35722n(float f) {
        this.f5120w.m35717B(f);
        invalidateSelf();
    }

    /* renamed from: o */
    public void m35721o(int i) {
        if (i == 0) {
            m35724l(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m35724l(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: q */
    void m35719q(float f, C1691c c1691c) {
        if (f > 0.75f) {
            c1691c.m35696t(m35733c((f - 0.75f) / 0.25f, c1691c.m35707i(), c1691c.m35710f()));
        } else {
            c1691c.m35696t(c1691c.m35707i());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5120w.m35700p(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5120w.m35695u(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5123z.cancel();
        this.f5120w.m35716C();
        if (this.f5120w.m35711e() != this.f5120w.m35708h()) {
            this.f5119B = true;
            this.f5123z.setDuration(666L);
            this.f5123z.start();
            return;
        }
        this.f5120w.m35694v(0);
        this.f5120w.m35701o();
        this.f5123z.setDuration(1332L);
        this.f5123z.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5123z.cancel();
        m35725k(0.0f);
        this.f5120w.m35690z(false);
        this.f5120w.m35694v(0);
        this.f5120w.m35701o();
        invalidateSelf();
    }
}
