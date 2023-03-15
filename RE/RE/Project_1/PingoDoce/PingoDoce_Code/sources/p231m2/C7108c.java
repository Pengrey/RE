package p231m2;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C1112b0;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;

/* renamed from: m2.c */
/* loaded from: classes.dex */
public class C7108c {

    /* renamed from: x */
    private static final Interpolator f18854x = new animationInterpolatorC7109a();

    /* renamed from: a */
    private int f18855a;

    /* renamed from: b */
    private int f18856b;

    /* renamed from: d */
    private float[] f18858d;

    /* renamed from: e */
    private float[] f18859e;

    /* renamed from: f */
    private float[] f18860f;

    /* renamed from: g */
    private float[] f18861g;

    /* renamed from: h */
    private int[] f18862h;

    /* renamed from: i */
    private int[] f18863i;

    /* renamed from: j */
    private int[] f18864j;

    /* renamed from: k */
    private int f18865k;

    /* renamed from: l */
    private VelocityTracker f18866l;

    /* renamed from: m */
    private float f18867m;

    /* renamed from: n */
    private float f18868n;

    /* renamed from: o */
    private int f18869o;

    /* renamed from: p */
    private final int f18870p;

    /* renamed from: q */
    private int f18871q;

    /* renamed from: r */
    private OverScroller f18872r;

    /* renamed from: s */
    private final AbstractC7111c f18873s;

    /* renamed from: t */
    private View f18874t;

    /* renamed from: u */
    private boolean f18875u;

    /* renamed from: v */
    private final ViewGroup f18876v;

    /* renamed from: c */
    private int f18857c = -1;

    /* renamed from: w */
    private final Runnable f18877w = new RunnableC7110b();

    /* compiled from: ViewDragHelper.java */
    /* renamed from: m2.c$a  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
    /* loaded from: classes.dex */
    class animationInterpolatorC7109a implements Interpolator {
        animationInterpolatorC7109a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: m2.c$b */
    /* loaded from: classes.dex */
    class RunnableC7110b implements Runnable {
        RunnableC7110b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7108c.this.m19238E(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: m2.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC7111c {
        /* renamed from: a */
        public abstract int mo19207a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo19206b(View view, int i, int i2);

        /* renamed from: c */
        public int m19205c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo19204d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo19203e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void m19202f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean m19201g(int i) {
            return false;
        }

        /* renamed from: h */
        public void m19200h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo19199i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo19198j(int i);

        /* renamed from: k */
        public abstract void mo19197k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo19196l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo19195m(View view, int i);
    }

    private C7108c(Context context, ViewGroup viewGroup, AbstractC7111c abstractC7111c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC7111c != null) {
            this.f18876v = viewGroup;
            this.f18873s = abstractC7111c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f18870p = i;
            this.f18869o = i;
            this.f18856b = viewConfiguration.getScaledTouchSlop();
            this.f18867m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f18868n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f18872r = new OverScroller(context, f18854x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    /* renamed from: A */
    private void m19242A() {
        this.f18866l.computeCurrentVelocity(DateTimeConstants.MILLIS_PER_SECOND, this.f18867m);
        m19220n(m19229e(this.f18866l.getXVelocity(this.f18857c), this.f18868n, this.f18867m), m19229e(this.f18866l.getYVelocity(this.f18857c), this.f18868n, this.f18867m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [m2.c$c] */
    /* renamed from: B */
    private void m19241B(float f, float f2, int i) {
        boolean m19231c = m19231c(f, f2, i, 1);
        boolean z = m19231c;
        if (m19231c(f2, f, i, 4)) {
            z = m19231c | true;
        }
        boolean z2 = z;
        if (m19231c(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (m19231c(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.f18863i;
            iArr[i] = iArr[i] | r0;
            this.f18873s.m19202f(r0, i);
        }
    }

    /* renamed from: C */
    private void m19240C(float f, float f2, int i) {
        m19217q(i);
        float[] fArr = this.f18858d;
        this.f18860f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f18859e;
        this.f18861g[i] = f2;
        fArr2[i] = f2;
        this.f18862h[i] = m19214t((int) f, (int) f2);
        this.f18865k |= 1 << i;
    }

    /* renamed from: D */
    private void m19239D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m19210x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f18860f[pointerId] = x;
                this.f18861g[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m19231c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f18862h[i] & i2) != i2 || (this.f18871q & i2) == 0 || (this.f18864j[i] & i2) == i2 || (this.f18863i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f18856b;
        if (abs > i3 || abs2 > i3) {
            if (abs >= abs2 * 0.5f || !this.f18873s.m19201g(i2)) {
                return (this.f18863i[i] & i2) == 0 && abs > ((float) this.f18856b);
            }
            int[] iArr = this.f18864j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m19230d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f18873s.mo19204d(view) > 0;
        boolean z2 = this.f18873s.mo19203e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f18856b) : z2 && Math.abs(f2) > ((float) this.f18856b);
        }
        int i = this.f18856b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: e */
    private float m19229e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: f */
    private int m19228f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: g */
    private void m19227g() {
        float[] fArr = this.f18858d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f18859e, 0.0f);
        Arrays.fill(this.f18860f, 0.0f);
        Arrays.fill(this.f18861g, 0.0f);
        Arrays.fill(this.f18862h, 0);
        Arrays.fill(this.f18863i, 0);
        Arrays.fill(this.f18864j, 0);
        this.f18865k = 0;
    }

    /* renamed from: h */
    private void m19226h(int i) {
        if (this.f18858d == null || !m19211w(i)) {
            return;
        }
        this.f18858d[i] = 0.0f;
        this.f18859e[i] = 0.0f;
        this.f18860f[i] = 0.0f;
        this.f18861g[i] = 0.0f;
        this.f18862h[i] = 0;
        this.f18863i[i] = 0;
        this.f18864j[i] = 0;
        this.f18865k = (~(1 << i)) & this.f18865k;
    }

    /* renamed from: i */
    private int m19225i(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f18876v.getWidth();
        float f = width / 2;
        float m19219o = f + (m19219o(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m19219o / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: j */
    private int m19224j(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m19228f = m19228f(i3, (int) this.f18868n, (int) this.f18867m);
        int m19228f2 = m19228f(i4, (int) this.f18868n, (int) this.f18867m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m19228f);
        int abs4 = Math.abs(m19228f2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m19228f != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m19228f2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m19225i(i, m19228f, this.f18873s.mo19204d(view)) * f5) + (m19225i(i2, m19228f2, this.f18873s.mo19203e(view)) * (f3 / f4)));
    }

    /* renamed from: l */
    public static C7108c m19222l(ViewGroup viewGroup, float f, AbstractC7111c abstractC7111c) {
        C7108c m19221m = m19221m(viewGroup, abstractC7111c);
        m19221m.f18856b = (int) (m19221m.f18856b * (1.0f / f));
        return m19221m;
    }

    /* renamed from: m */
    public static C7108c m19221m(ViewGroup viewGroup, AbstractC7111c abstractC7111c) {
        return new C7108c(viewGroup.getContext(), viewGroup, abstractC7111c);
    }

    /* renamed from: n */
    private void m19220n(float f, float f2) {
        this.f18875u = true;
        this.f18873s.mo19196l(this.f18874t, f, f2);
        this.f18875u = false;
        if (this.f18855a == 1) {
            m19238E(0);
        }
    }

    /* renamed from: o */
    private float m19219o(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: p */
    private void m19218p(int i, int i2, int i3, int i4) {
        int left = this.f18874t.getLeft();
        int top = this.f18874t.getTop();
        if (i3 != 0) {
            i = this.f18873s.mo19207a(this.f18874t, i, i3);
            C1112b0.m38437c0(this.f18874t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f18873s.mo19206b(this.f18874t, i2, i4);
            C1112b0.m38435d0(this.f18874t, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f18873s.mo19197k(this.f18874t, i5, i6, i5 - left, i6 - top);
    }

    /* renamed from: q */
    private void m19217q(int i) {
        float[] fArr = this.f18858d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f18859e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f18860f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f18861g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f18862h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f18863i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f18864j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f18858d = fArr2;
            this.f18859e = fArr3;
            this.f18860f = fArr4;
            this.f18861g = fArr5;
            this.f18862h = iArr;
            this.f18863i = iArr2;
            this.f18864j = iArr3;
        }
    }

    /* renamed from: s */
    private boolean m19215s(int i, int i2, int i3, int i4) {
        int left = this.f18874t.getLeft();
        int top = this.f18874t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f18872r.abortAnimation();
            m19238E(0);
            return false;
        }
        this.f18872r.startScroll(left, top, i5, i6, m19224j(this.f18874t, i5, i6, i3, i4));
        m19238E(2);
        return true;
    }

    /* renamed from: t */
    private int m19214t(int i, int i2) {
        int i3 = i < this.f18876v.getLeft() + this.f18869o ? 1 : 0;
        if (i2 < this.f18876v.getTop() + this.f18869o) {
            i3 |= 4;
        }
        if (i > this.f18876v.getRight() - this.f18869o) {
            i3 |= 2;
        }
        return i2 > this.f18876v.getBottom() - this.f18869o ? i3 | 8 : i3;
    }

    /* renamed from: x */
    private boolean m19210x(int i) {
        if (m19211w(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: E */
    void m19238E(int i) {
        this.f18876v.removeCallbacks(this.f18877w);
        if (this.f18855a != i) {
            this.f18855a = i;
            this.f18873s.mo19198j(i);
            if (this.f18855a == 0) {
                this.f18874t = null;
            }
        }
    }

    /* renamed from: F */
    public boolean m19237F(int i, int i2) {
        if (this.f18875u) {
            return m19215s(i, i2, (int) this.f18866l.getXVelocity(this.f18857c), (int) this.f18866l.getYVelocity(this.f18857c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m19236G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p231m2.C7108c.m19236G(android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean m19235H(View view, int i, int i2) {
        this.f18874t = view;
        this.f18857c = -1;
        boolean m19215s = m19215s(i, i2, 0, 0);
        if (!m19215s && this.f18855a == 0 && this.f18874t != null) {
            this.f18874t = null;
        }
        return m19215s;
    }

    /* renamed from: I */
    boolean m19234I(View view, int i) {
        if (view == this.f18874t && this.f18857c == i) {
            return true;
        }
        if (view == null || !this.f18873s.mo19195m(view, i)) {
            return false;
        }
        this.f18857c = i;
        m19232b(view, i);
        return true;
    }

    /* renamed from: a */
    public void m19233a() {
        this.f18857c = -1;
        m19227g();
        VelocityTracker velocityTracker = this.f18866l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18866l = null;
        }
    }

    /* renamed from: b */
    public void m19232b(View view, int i) {
        if (view.getParent() == this.f18876v) {
            this.f18874t = view;
            this.f18857c = i;
            this.f18873s.mo19199i(view, i);
            m19238E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f18876v + ")");
    }

    /* renamed from: k */
    public boolean m19223k(boolean z) {
        if (this.f18855a == 2) {
            boolean computeScrollOffset = this.f18872r.computeScrollOffset();
            int currX = this.f18872r.getCurrX();
            int currY = this.f18872r.getCurrY();
            int left = currX - this.f18874t.getLeft();
            int top = currY - this.f18874t.getTop();
            if (left != 0) {
                C1112b0.m38437c0(this.f18874t, left);
            }
            if (top != 0) {
                C1112b0.m38435d0(this.f18874t, top);
            }
            if (left != 0 || top != 0) {
                this.f18873s.mo19197k(this.f18874t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f18872r.getFinalX() && currY == this.f18872r.getFinalY()) {
                this.f18872r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f18876v.post(this.f18877w);
                } else {
                    m19238E(0);
                }
            }
        }
        return this.f18855a == 2;
    }

    /* renamed from: r */
    public View m19216r(int i, int i2) {
        for (int childCount = this.f18876v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f18876v.getChildAt(this.f18873s.m19205c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public int m19213u() {
        return this.f18856b;
    }

    /* renamed from: v */
    public boolean m19212v(int i, int i2) {
        return m19209y(this.f18874t, i, i2);
    }

    /* renamed from: w */
    public boolean m19211w(int i) {
        return ((1 << i) & this.f18865k) != 0;
    }

    /* renamed from: y */
    public boolean m19209y(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: z */
    public void m19208z(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m19233a();
        }
        if (this.f18866l == null) {
            this.f18866l = VelocityTracker.obtain();
        }
        this.f18866l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m19216r = m19216r((int) x, (int) y);
            m19240C(x, y, pointerId);
            m19234I(m19216r, pointerId);
            int i3 = this.f18862h[pointerId];
            int i4 = this.f18871q;
            if ((i3 & i4) != 0) {
                this.f18873s.m19200h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f18855a == 1) {
                m19242A();
            }
            m19233a();
        } else if (actionMasked == 2) {
            if (this.f18855a == 1) {
                if (m19210x(this.f18857c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f18857c);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f18860f;
                    int i5 = this.f18857c;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.f18861g[i5]);
                    m19218p(this.f18874t.getLeft() + i6, this.f18874t.getTop() + i7, i6, i7);
                    m19239D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (m19210x(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f18858d[pointerId2];
                    float f2 = y3 - this.f18859e[pointerId2];
                    m19241B(f, f2, pointerId2);
                    if (this.f18855a != 1) {
                        View m19216r2 = m19216r((int) x3, (int) y3);
                        if (m19230d(m19216r2, f, f2) && m19234I(m19216r2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m19239D(motionEvent);
        } else if (actionMasked == 3) {
            if (this.f18855a == 1) {
                m19220n(0.0f, 0.0f);
            }
            m19233a();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m19240C(x4, y4, pointerId3);
            if (this.f18855a == 0) {
                m19234I(m19216r((int) x4, (int) y4), pointerId3);
                int i8 = this.f18862h[pointerId3];
                int i9 = this.f18871q;
                if ((i8 & i9) != 0) {
                    this.f18873s.m19200h(i8 & i9, pointerId3);
                }
            } else if (m19212v((int) x4, (int) y4)) {
                m19234I(this.f18874t, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.f18855a == 1 && pointerId4 == this.f18857c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i2);
                    if (pointerId5 != this.f18857c) {
                        View m19216r3 = m19216r((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.f18874t;
                        if (m19216r3 == view && m19234I(view, pointerId5)) {
                            i = this.f18857c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m19242A();
                }
            }
            m19226h(pointerId4);
        }
    }
}
