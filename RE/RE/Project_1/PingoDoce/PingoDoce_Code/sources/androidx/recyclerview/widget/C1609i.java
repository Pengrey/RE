package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C1112b0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public class C1609i extends RecyclerView.AbstractC1545n implements RecyclerView.InterfaceC1554s {

    /* renamed from: D */
    private static final int[] f4868D = {16842919};

    /* renamed from: E */
    private static final int[] f4869E = new int[0];

    /* renamed from: A */
    int f4870A;

    /* renamed from: B */
    private final Runnable f4871B;

    /* renamed from: C */
    private final RecyclerView.AbstractC1555t f4872C;

    /* renamed from: a */
    private final int f4873a;

    /* renamed from: b */
    private final int f4874b;

    /* renamed from: c */
    final StateListDrawable f4875c;

    /* renamed from: d */
    final Drawable f4876d;

    /* renamed from: e */
    private final int f4877e;

    /* renamed from: f */
    private final int f4878f;

    /* renamed from: g */
    private final StateListDrawable f4879g;

    /* renamed from: h */
    private final Drawable f4880h;

    /* renamed from: i */
    private final int f4881i;

    /* renamed from: j */
    private final int f4882j;

    /* renamed from: k */
    int f4883k;

    /* renamed from: l */
    int f4884l;

    /* renamed from: m */
    float f4885m;

    /* renamed from: n */
    int f4886n;

    /* renamed from: o */
    int f4887o;

    /* renamed from: p */
    float f4888p;

    /* renamed from: s */
    private RecyclerView f4891s;

    /* renamed from: z */
    final ValueAnimator f4898z;

    /* renamed from: q */
    private int f4889q = 0;

    /* renamed from: r */
    private int f4890r = 0;

    /* renamed from: t */
    private boolean f4892t = false;

    /* renamed from: u */
    private boolean f4893u = false;

    /* renamed from: v */
    private int f4894v = 0;

    /* renamed from: w */
    private int f4895w = 0;

    /* renamed from: x */
    private final int[] f4896x = new int[2];

    /* renamed from: y */
    private final int[] f4897y = new int[2];

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    class RunnableC1610a implements Runnable {
        RunnableC1610a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1609i.this.m36020s(500);
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.i$b */
    /* loaded from: classes.dex */
    class C1611b extends RecyclerView.AbstractC1555t {
        C1611b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1555t
        /* renamed from: b */
        public void mo29913b(RecyclerView recyclerView, int i, int i2) {
            C1609i.this.m36029D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.i$c */
    /* loaded from: classes.dex */
    private class C1612c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4901a = false;

        C1612c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4901a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4901a) {
                this.f4901a = false;
            } else if (((Float) C1609i.this.f4898z.getAnimatedValue()).floatValue() == 0.0f) {
                C1609i c1609i = C1609i.this;
                c1609i.f4870A = 0;
                c1609i.m36032A(0);
            } else {
                C1609i c1609i2 = C1609i.this;
                c1609i2.f4870A = 2;
                c1609i2.m36015x();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.i$d */
    /* loaded from: classes.dex */
    private class C1613d implements ValueAnimator.AnimatorUpdateListener {
        C1613d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1609i.this.f4875c.setAlpha(floatValue);
            C1609i.this.f4876d.setAlpha(floatValue);
            C1609i.this.m36015x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1609i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4898z = ofFloat;
        this.f4870A = 0;
        this.f4871B = new RunnableC1610a();
        this.f4872C = new C1611b();
        this.f4875c = stateListDrawable;
        this.f4876d = drawable;
        this.f4879g = stateListDrawable2;
        this.f4880h = drawable2;
        this.f4877e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4878f = Math.max(i, drawable.getIntrinsicWidth());
        this.f4881i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4882j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4873a = i2;
        this.f4874b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1612c());
        ofFloat.addUpdateListener(new C1613d());
        m36027l(recyclerView);
    }

    /* renamed from: B */
    private void m36031B() {
        this.f4891s.m36657h(this);
        this.f4891s.m36648k(this);
        this.f4891s.m36645l(this.f4872C);
    }

    /* renamed from: E */
    private void m36028E(float f) {
        int[] m36021r = m36021r();
        float max = Math.max(m36021r[0], Math.min(m36021r[1], f));
        if (Math.abs(this.f4884l - max) < 2.0f) {
            return;
        }
        int m36013z = m36013z(this.f4885m, max, m36021r, this.f4891s.computeVerticalScrollRange(), this.f4891s.computeVerticalScrollOffset(), this.f4890r);
        if (m36013z != 0) {
            this.f4891s.scrollBy(0, m36013z);
        }
        this.f4885m = max;
    }

    /* renamed from: m */
    private void m36026m() {
        this.f4891s.removeCallbacks(this.f4871B);
    }

    /* renamed from: n */
    private void m36025n() {
        this.f4891s.m36678Z0(this);
        this.f4891s.m36673b1(this);
        this.f4891s.m36670c1(this.f4872C);
        m36026m();
    }

    /* renamed from: o */
    private void m36024o(Canvas canvas) {
        int i = this.f4890r;
        int i2 = this.f4881i;
        int i3 = i - i2;
        int i4 = this.f4887o;
        int i5 = this.f4886n;
        int i6 = i4 - (i5 / 2);
        this.f4879g.setBounds(0, 0, i5, i2);
        this.f4880h.setBounds(0, 0, this.f4889q, this.f4882j);
        canvas.translate(0.0f, i3);
        this.f4880h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f4879g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: p */
    private void m36023p(Canvas canvas) {
        int i = this.f4889q;
        int i2 = this.f4877e;
        int i3 = i - i2;
        int i4 = this.f4884l;
        int i5 = this.f4883k;
        int i6 = i4 - (i5 / 2);
        this.f4875c.setBounds(0, 0, i2, i5);
        this.f4876d.setBounds(0, 0, this.f4878f, this.f4890r);
        if (m36018u()) {
            this.f4876d.draw(canvas);
            canvas.translate(this.f4877e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4875c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate(-this.f4877e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.f4876d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.f4875c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    /* renamed from: q */
    private int[] m36022q() {
        int[] iArr = this.f4897y;
        int i = this.f4874b;
        iArr[0] = i;
        iArr[1] = this.f4889q - i;
        return iArr;
    }

    /* renamed from: r */
    private int[] m36021r() {
        int[] iArr = this.f4896x;
        int i = this.f4874b;
        iArr[0] = i;
        iArr[1] = this.f4890r - i;
        return iArr;
    }

    /* renamed from: t */
    private void m36019t(float f) {
        int[] m36022q = m36022q();
        float max = Math.max(m36022q[0], Math.min(m36022q[1], f));
        if (Math.abs(this.f4887o - max) < 2.0f) {
            return;
        }
        int m36013z = m36013z(this.f4888p, max, m36022q, this.f4891s.computeHorizontalScrollRange(), this.f4891s.computeHorizontalScrollOffset(), this.f4889q);
        if (m36013z != 0) {
            this.f4891s.scrollBy(m36013z, 0);
        }
        this.f4888p = max;
    }

    /* renamed from: u */
    private boolean m36018u() {
        return C1112b0.m38476E(this.f4891s) == 1;
    }

    /* renamed from: y */
    private void m36014y(int i) {
        m36026m();
        this.f4891s.postDelayed(this.f4871B, i);
    }

    /* renamed from: z */
    private int m36013z(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: A */
    void m36032A(int i) {
        if (i == 2 && this.f4894v != 2) {
            this.f4875c.setState(f4868D);
            m36026m();
        }
        if (i == 0) {
            m36015x();
        } else {
            m36030C();
        }
        if (this.f4894v == 2 && i != 2) {
            this.f4875c.setState(f4869E);
            m36014y(1200);
        } else if (i == 1) {
            m36014y(1500);
        }
        this.f4894v = i;
    }

    /* renamed from: C */
    public void m36030C() {
        int i = this.f4870A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.f4898z.cancel();
        }
        this.f4870A = 1;
        ValueAnimator valueAnimator = this.f4898z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4898z.setDuration(500L);
        this.f4898z.setStartDelay(0L);
        this.f4898z.start();
    }

    /* renamed from: D */
    void m36029D(int i, int i2) {
        int computeVerticalScrollRange = this.f4891s.computeVerticalScrollRange();
        int i3 = this.f4890r;
        this.f4892t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f4873a;
        int computeHorizontalScrollRange = this.f4891s.computeHorizontalScrollRange();
        int i4 = this.f4889q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f4873a;
        this.f4893u = z;
        boolean z2 = this.f4892t;
        if (!z2 && !z) {
            if (this.f4894v != 0) {
                m36032A(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f4884l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f4883k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f4893u) {
            float f2 = i4;
            this.f4887o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f4886n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f4894v;
        if (i5 == 0 || i5 == 1) {
            m36032A(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1554s
    /* renamed from: a */
    public boolean mo35967a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4894v;
        if (i == 1) {
            boolean m36016w = m36016w(motionEvent.getX(), motionEvent.getY());
            boolean m36017v = m36017v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m36016w && !m36017v) {
                return false;
            }
            if (m36017v) {
                this.f4895w = 1;
                this.f4888p = (int) motionEvent.getX();
            } else if (m36016w) {
                this.f4895w = 2;
                this.f4885m = (int) motionEvent.getY();
            }
            m36032A(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1554s
    /* renamed from: c */
    public void mo35966c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4894v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m36016w = m36016w(motionEvent.getX(), motionEvent.getY());
            boolean m36017v = m36017v(motionEvent.getX(), motionEvent.getY());
            if (m36016w || m36017v) {
                if (m36017v) {
                    this.f4895w = 1;
                    this.f4888p = (int) motionEvent.getX();
                } else if (m36016w) {
                    this.f4895w = 2;
                    this.f4885m = (int) motionEvent.getY();
                }
                m36032A(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f4894v == 2) {
            this.f4885m = 0.0f;
            this.f4888p = 0.0f;
            m36032A(1);
            this.f4895w = 0;
        } else if (motionEvent.getAction() == 2 && this.f4894v == 2) {
            m36030C();
            if (this.f4895w == 1) {
                m36019t(motionEvent.getX());
            }
            if (this.f4895w == 2) {
                m36028E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1554s
    /* renamed from: e */
    public void mo35965e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1545n
    /* renamed from: k */
    public void mo35983k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
        if (this.f4889q == this.f4891s.getWidth() && this.f4890r == this.f4891s.getHeight()) {
            if (this.f4870A != 0) {
                if (this.f4892t) {
                    m36023p(canvas);
                }
                if (this.f4893u) {
                    m36024o(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f4889q = this.f4891s.getWidth();
        this.f4890r = this.f4891s.getHeight();
        m36032A(0);
    }

    /* renamed from: l */
    public void m36027l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4891s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m36025n();
        }
        this.f4891s = recyclerView;
        if (recyclerView != null) {
            m36031B();
        }
    }

    /* renamed from: s */
    void m36020s(int i) {
        int i2 = this.f4870A;
        if (i2 == 1) {
            this.f4898z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f4870A = 3;
        ValueAnimator valueAnimator = this.f4898z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4898z.setDuration(i);
        this.f4898z.start();
    }

    /* renamed from: v */
    boolean m36017v(float f, float f2) {
        if (f2 >= this.f4890r - this.f4881i) {
            int i = this.f4887o;
            int i2 = this.f4886n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    boolean m36016w(float f, float f2) {
        if (!m36018u() ? f >= this.f4889q - this.f4877e : f <= this.f4877e / 2) {
            int i = this.f4884l;
            int i2 = this.f4883k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    void m36015x() {
        this.f4891s.invalidate();
    }
}
