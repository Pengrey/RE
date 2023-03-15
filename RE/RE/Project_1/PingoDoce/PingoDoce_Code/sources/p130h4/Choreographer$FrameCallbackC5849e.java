package p130h4;

import android.view.Choreographer;
import com.airbnb.lottie.C2199c;
import com.airbnb.lottie.C2201d;

/* renamed from: h4.e */
/* loaded from: classes.dex */
public class Choreographer$FrameCallbackC5849e extends AbstractC5845a implements Choreographer.FrameCallback {

    /* renamed from: F */
    private C2201d f16263F;

    /* renamed from: y */
    private float f16265y = 1.0f;

    /* renamed from: z */
    private boolean f16266z = false;

    /* renamed from: A */
    private long f16258A = 0;

    /* renamed from: B */
    private float f16259B = 0.0f;

    /* renamed from: C */
    private int f16260C = 0;

    /* renamed from: D */
    private float f16261D = -2.14748365E9f;

    /* renamed from: E */
    private float f16262E = 2.14748365E9f;

    /* renamed from: G */
    protected boolean f16264G = false;

    /* renamed from: G */
    private void m22922G() {
        if (this.f16263F == null) {
            return;
        }
        float f = this.f16259B;
        if (f < this.f16261D || f > this.f16262E) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f16261D), Float.valueOf(this.f16262E), Float.valueOf(this.f16259B)));
        }
    }

    /* renamed from: k */
    private float m22917k() {
        C2201d c2201d = this.f16263F;
        if (c2201d == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c2201d.m34423i()) / Math.abs(this.f16265y);
    }

    /* renamed from: o */
    private boolean m22913o() {
        return m22914n() < 0.0f;
    }

    /* renamed from: A */
    public void m22927A(float f) {
        if (this.f16259B == f) {
            return;
        }
        this.f16259B = C5851g.m22901c(f, m22915m(), m22916l());
        this.f16258A = 0L;
        m22940e();
    }

    /* renamed from: B */
    public void m22926B(float f) {
        m22925C(this.f16261D, f);
    }

    /* renamed from: C */
    public void m22925C(float f, float f2) {
        if (f <= f2) {
            C2201d c2201d = this.f16263F;
            float m34416p = c2201d == null ? -3.4028235E38f : c2201d.m34416p();
            C2201d c2201d2 = this.f16263F;
            float m34426f = c2201d2 == null ? Float.MAX_VALUE : c2201d2.m34426f();
            float m22901c = C5851g.m22901c(f, m34416p, m34426f);
            float m22901c2 = C5851g.m22901c(f2, m34416p, m34426f);
            if (m22901c == this.f16261D && m22901c2 == this.f16262E) {
                return;
            }
            this.f16261D = m22901c;
            this.f16262E = m22901c2;
            m22927A((int) C5851g.m22901c(this.f16259B, m22901c, m22901c2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* renamed from: D */
    public void m22924D(int i) {
        m22925C(i, (int) this.f16262E);
    }

    /* renamed from: F */
    public void m22923F(float f) {
        this.f16265y = f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        m22944a();
        m22909s();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m22910r();
        if (this.f16263F == null || !isRunning()) {
            return;
        }
        C2199c.m34435a("LottieValueAnimator#doFrame");
        long j2 = this.f16258A;
        float m22917k = ((float) (j2 != 0 ? j - j2 : 0L)) / m22917k();
        float f = this.f16259B;
        if (m22913o()) {
            m22917k = -m22917k;
        }
        float f2 = f + m22917k;
        this.f16259B = f2;
        boolean z = !C5851g.m22899e(f2, m22915m(), m22916l());
        this.f16259B = C5851g.m22901c(this.f16259B, m22915m(), m22916l());
        this.f16258A = j;
        m22940e();
        if (z) {
            if (getRepeatCount() != -1 && this.f16260C >= getRepeatCount()) {
                this.f16259B = this.f16265y < 0.0f ? m22915m() : m22916l();
                m22909s();
                m22943b(m22913o());
            } else {
                m22942c();
                this.f16260C++;
                if (getRepeatMode() == 2) {
                    this.f16266z = !this.f16266z;
                    m22906x();
                } else {
                    this.f16259B = m22913o() ? m22916l() : m22915m();
                }
                this.f16258A = j;
            }
        }
        m22922G();
        C2199c.m34434b("LottieValueAnimator#doFrame");
    }

    /* renamed from: f */
    public void m22921f() {
        this.f16263F = null;
        this.f16261D = -2.14748365E9f;
        this.f16262E = 2.14748365E9f;
    }

    /* renamed from: g */
    public void m22920g() {
        m22909s();
        m22943b(m22913o());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float m22915m;
        float m22916l;
        float m22915m2;
        if (this.f16263F == null) {
            return 0.0f;
        }
        if (m22913o()) {
            m22915m = m22916l() - this.f16259B;
            m22916l = m22916l();
            m22915m2 = m22915m();
        } else {
            m22915m = this.f16259B - m22915m();
            m22916l = m22916l();
            m22915m2 = m22915m();
        }
        return m22915m / (m22916l - m22915m2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m22919i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C2201d c2201d = this.f16263F;
        if (c2201d == null) {
            return 0L;
        }
        return c2201d.m34428d();
    }

    /* renamed from: i */
    public float m22919i() {
        C2201d c2201d = this.f16263F;
        if (c2201d == null) {
            return 0.0f;
        }
        return (this.f16259B - c2201d.m34416p()) / (this.f16263F.m34426f() - this.f16263F.m34416p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f16264G;
    }

    /* renamed from: j */
    public float m22918j() {
        return this.f16259B;
    }

    /* renamed from: l */
    public float m22916l() {
        C2201d c2201d = this.f16263F;
        if (c2201d == null) {
            return 0.0f;
        }
        float f = this.f16262E;
        return f == 2.14748365E9f ? c2201d.m34426f() : f;
    }

    /* renamed from: m */
    public float m22915m() {
        C2201d c2201d = this.f16263F;
        if (c2201d == null) {
            return 0.0f;
        }
        float f = this.f16261D;
        return f == -2.14748365E9f ? c2201d.m34416p() : f;
    }

    /* renamed from: n */
    public float m22914n() {
        return this.f16265y;
    }

    /* renamed from: p */
    public void m22912p() {
        m22909s();
    }

    /* renamed from: q */
    public void m22911q() {
        this.f16264G = true;
        m22941d(m22913o());
        m22927A((int) (m22913o() ? m22916l() : m22915m()));
        this.f16258A = 0L;
        this.f16260C = 0;
        m22910r();
    }

    /* renamed from: r */
    protected void m22910r() {
        if (isRunning()) {
            m22908u(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: s */
    protected void m22909s() {
        m22908u(true);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f16266z) {
            return;
        }
        this.f16266z = false;
        m22906x();
    }

    /* renamed from: u */
    protected void m22908u(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f16264G = false;
        }
    }

    /* renamed from: w */
    public void m22907w() {
        this.f16264G = true;
        m22910r();
        this.f16258A = 0L;
        if (m22913o() && m22918j() == m22915m()) {
            this.f16259B = m22916l();
        } else if (m22913o() || m22918j() != m22916l()) {
        } else {
            this.f16259B = m22915m();
        }
    }

    /* renamed from: x */
    public void m22906x() {
        m22923F(-m22914n());
    }

    /* renamed from: z */
    public void m22905z(C2201d c2201d) {
        boolean z = this.f16263F == null;
        this.f16263F = c2201d;
        if (z) {
            m22925C((int) Math.max(this.f16261D, c2201d.m34416p()), (int) Math.min(this.f16262E, c2201d.m34426f()));
        } else {
            m22925C((int) c2201d.m34416p(), (int) c2201d.m34426f());
        }
        float f = this.f16259B;
        this.f16259B = 0.0f;
        m22927A((int) f);
        m22940e();
    }
}
