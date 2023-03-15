package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C1112b0;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC1222a implements View.OnTouchListener {

    /* renamed from: N */
    private static final int f3613N = ViewConfiguration.getTapTimeout();

    /* renamed from: C */
    private int f3616C;

    /* renamed from: D */
    private int f3617D;

    /* renamed from: H */
    private boolean f3621H;

    /* renamed from: I */
    boolean f3622I;

    /* renamed from: J */
    boolean f3623J;

    /* renamed from: K */
    boolean f3624K;

    /* renamed from: L */
    private boolean f3625L;

    /* renamed from: M */
    private boolean f3626M;

    /* renamed from: y */
    final View f3629y;

    /* renamed from: z */
    private Runnable f3630z;

    /* renamed from: w */
    final C1223a f3627w = new C1223a();

    /* renamed from: x */
    private final Interpolator f3628x = new AccelerateInterpolator();

    /* renamed from: A */
    private float[] f3614A = {0.0f, 0.0f};

    /* renamed from: B */
    private float[] f3615B = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: E */
    private float[] f3618E = {0.0f, 0.0f};

    /* renamed from: F */
    private float[] f3619F = {0.0f, 0.0f};

    /* renamed from: G */
    private float[] f3620G = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class C1223a {

        /* renamed from: a */
        private int f3631a;

        /* renamed from: b */
        private int f3632b;

        /* renamed from: c */
        private float f3633c;

        /* renamed from: d */
        private float f3634d;

        /* renamed from: j */
        private float f3640j;

        /* renamed from: k */
        private int f3641k;

        /* renamed from: e */
        private long f3635e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f3639i = -1;

        /* renamed from: f */
        private long f3636f = 0;

        /* renamed from: g */
        private int f3637g = 0;

        /* renamed from: h */
        private int f3638h = 0;

        C1223a() {
        }

        /* renamed from: e */
        private float m37937e(long j) {
            long j2 = this.f3635e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f3639i;
            if (j3 >= 0 && j >= j3) {
                float f = this.f3640j;
                return (1.0f - f) + (f * AbstractView$OnTouchListenerC1222a.m37958e(((float) (j - j3)) / this.f3641k, 0.0f, 1.0f));
            }
            return AbstractView$OnTouchListenerC1222a.m37958e(((float) (j - j2)) / this.f3631a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: g */
        private float m37935g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void m37941a() {
            if (this.f3636f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m37935g = m37935g(m37937e(currentAnimationTimeMillis));
                this.f3636f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f3636f)) * m37935g;
                this.f3637g = (int) (this.f3633c * f);
                this.f3638h = (int) (f * this.f3634d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m37940b() {
            return this.f3637g;
        }

        /* renamed from: c */
        public int m37939c() {
            return this.f3638h;
        }

        /* renamed from: d */
        public int m37938d() {
            float f = this.f3633c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int m37936f() {
            float f = this.f3634d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean m37934h() {
            return this.f3639i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3639i + ((long) this.f3641k);
        }

        /* renamed from: i */
        public void m37933i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3641k = AbstractView$OnTouchListenerC1222a.m37957f((int) (currentAnimationTimeMillis - this.f3635e), 0, this.f3632b);
            this.f3640j = m37937e(currentAnimationTimeMillis);
            this.f3639i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m37932j(int i) {
            this.f3632b = i;
        }

        /* renamed from: k */
        public void m37931k(int i) {
            this.f3631a = i;
        }

        /* renamed from: l */
        public void m37930l(float f, float f2) {
            this.f3633c = f;
            this.f3634d = f2;
        }

        /* renamed from: m */
        public void m37929m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3635e = currentAnimationTimeMillis;
            this.f3639i = -1L;
            this.f3636f = currentAnimationTimeMillis;
            this.f3640j = 0.5f;
            this.f3637g = 0;
            this.f3638h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class RunnableC1224b implements Runnable {
        RunnableC1224b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC1222a abstractView$OnTouchListenerC1222a = AbstractView$OnTouchListenerC1222a.this;
            if (abstractView$OnTouchListenerC1222a.f3624K) {
                if (abstractView$OnTouchListenerC1222a.f3622I) {
                    abstractView$OnTouchListenerC1222a.f3622I = false;
                    abstractView$OnTouchListenerC1222a.f3627w.m37929m();
                }
                C1223a c1223a = AbstractView$OnTouchListenerC1222a.this.f3627w;
                if (!c1223a.m37934h() && AbstractView$OnTouchListenerC1222a.this.m37943u()) {
                    AbstractView$OnTouchListenerC1222a abstractView$OnTouchListenerC1222a2 = AbstractView$OnTouchListenerC1222a.this;
                    if (abstractView$OnTouchListenerC1222a2.f3623J) {
                        abstractView$OnTouchListenerC1222a2.f3623J = false;
                        abstractView$OnTouchListenerC1222a2.m37960c();
                    }
                    c1223a.m37941a();
                    AbstractView$OnTouchListenerC1222a.this.mo37901j(c1223a.m37940b(), c1223a.m37939c());
                    C1112b0.m38421k0(AbstractView$OnTouchListenerC1222a.this.f3629y, this);
                    return;
                }
                AbstractView$OnTouchListenerC1222a.this.f3624K = false;
            }
        }
    }

    public AbstractView$OnTouchListenerC1222a(View view) {
        this.f3629y = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m37949o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m37948p(f3, f3);
        m37952l(1);
        m37950n(Float.MAX_VALUE, Float.MAX_VALUE);
        m37945s(0.2f, 0.2f);
        m37944t(1.0f, 1.0f);
        m37953k(f3613N);
        m37946r(500);
        m37947q(500);
    }

    /* renamed from: d */
    private float m37959d(int i, float f, float f2, float f3) {
        float m37955h = m37955h(this.f3614A[i], f2, this.f3615B[i], f);
        int i2 = (m37955h > 0.0f ? 1 : (m37955h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f3618E[i];
        float f5 = this.f3619F[i];
        float f6 = this.f3620G[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m37958e(m37955h * f7, f5, f6);
        }
        return -m37958e((-m37955h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m37958e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m37957f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m37956g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f3616C;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f3624K && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m37955h(float f, float f2, float f3, float f4) {
        float interpolation;
        float m37958e = m37958e(f * f2, 0.0f, f3);
        float m37956g = m37956g(f2 - f4, m37958e) - m37956g(f4, m37958e);
        if (m37956g < 0.0f) {
            interpolation = -this.f3628x.getInterpolation(-m37956g);
        } else if (m37956g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f3628x.getInterpolation(m37956g);
        }
        return m37958e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m37954i() {
        if (this.f3622I) {
            this.f3624K = false;
        } else {
            this.f3627w.m37933i();
        }
    }

    /* renamed from: v */
    private void m37942v() {
        int i;
        if (this.f3630z == null) {
            this.f3630z = new RunnableC1224b();
        }
        this.f3624K = true;
        this.f3622I = true;
        if (!this.f3621H && (i = this.f3617D) > 0) {
            C1112b0.m38419l0(this.f3629y, this.f3630z, i);
        } else {
            this.f3630z.run();
        }
        this.f3621H = true;
    }

    /* renamed from: a */
    public abstract boolean mo37903a(int i);

    /* renamed from: b */
    public abstract boolean mo37902b(int i);

    /* renamed from: c */
    void m37960c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3629y.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo37901j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC1222a m37953k(int i) {
        this.f3617D = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC1222a m37952l(int i) {
        this.f3616C = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC1222a m37951m(boolean z) {
        if (this.f3625L && !z) {
            m37954i();
        }
        this.f3625L = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC1222a m37950n(float f, float f2) {
        float[] fArr = this.f3615B;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC1222a m37949o(float f, float f2) {
        float[] fArr = this.f3620G;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3625L
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m37954i()
            goto L58
        L1a:
            r5.f3623J = r2
            r5.f3621H = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3629y
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m37959d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3629y
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m37959d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3627w
            r7.m37930l(r0, r6)
            boolean r6 = r5.f3624K
            if (r6 != 0) goto L58
            boolean r6 = r5.m37943u()
            if (r6 == 0) goto L58
            r5.m37942v()
        L58:
            boolean r6 = r5.f3626M
            if (r6 == 0) goto L61
            boolean r6 = r5.f3624K
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC1222a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC1222a m37948p(float f, float f2) {
        float[] fArr = this.f3619F;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC1222a m37947q(int i) {
        this.f3627w.m37932j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC1222a m37946r(int i) {
        this.f3627w.m37931k(i);
        return this;
    }

    /* renamed from: s */
    public AbstractView$OnTouchListenerC1222a m37945s(float f, float f2) {
        float[] fArr = this.f3614A;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC1222a m37944t(float f, float f2) {
        float[] fArr = this.f3618E;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m37943u() {
        C1223a c1223a = this.f3627w;
        int m37936f = c1223a.m37936f();
        int m37938d = c1223a.m37938d();
        return (m37936f != 0 && mo37902b(m37936f)) || (m37938d != 0 && mo37903a(m37938d));
    }
}
