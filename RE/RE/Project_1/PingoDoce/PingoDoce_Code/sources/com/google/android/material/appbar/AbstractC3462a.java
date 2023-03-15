package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1112b0;
import com.google.crypto.tink.shaded.protobuf.Reader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
public abstract class AbstractC3462a<V extends View> extends C3465c<V> {

    /* renamed from: d */
    private Runnable f9375d;

    /* renamed from: e */
    OverScroller f9376e;

    /* renamed from: f */
    private boolean f9377f;

    /* renamed from: g */
    private int f9378g;

    /* renamed from: h */
    private int f9379h;

    /* renamed from: i */
    private int f9380i;

    /* renamed from: j */
    private VelocityTracker f9381j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeaderBehavior.java */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes.dex */
    public class RunnableC3463a implements Runnable {

        /* renamed from: w */
        private final CoordinatorLayout f9382w;

        /* renamed from: x */
        private final V f9383x;

        RunnableC3463a(CoordinatorLayout coordinatorLayout, V v) {
            this.f9382w = coordinatorLayout;
            this.f9383x = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f9383x == null || (overScroller = AbstractC3462a.this.f9376e) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                AbstractC3462a abstractC3462a = AbstractC3462a.this;
                abstractC3462a.m30623P(this.f9382w, this.f9383x, abstractC3462a.f9376e.getCurrY());
                C1112b0.m38421k0(this.f9383x, this);
                return;
            }
            AbstractC3462a.this.mo30697g0(this.f9382w, this.f9383x);
        }
    }

    public AbstractC3462a() {
        this.f9378g = -1;
        this.f9380i = -1;
    }

    /* renamed from: I */
    private void m30630I() {
        if (this.f9381j == null) {
            this.f9381j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo28779D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f9378g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f9379h = r12
            goto L4c
        L2d:
            int r0 = r11.f9378g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f9379h
            int r7 = r1 - r0
            r11.f9379h = r0
            int r8 = r11.mo30700d0(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m30624O(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f9381j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f9381j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f9381j
            int r4 = r11.f9378g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo30699e0(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m30629J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f9377f = r3
            r11.f9378g = r1
            android.view.VelocityTracker r13 = r11.f9381j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f9381j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f9381j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f9377f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC3462a.mo28779D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    abstract boolean mo30706X(V v);

    /* renamed from: J */
    final boolean m30629J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f9375d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f9375d = null;
        }
        if (this.f9376e == null) {
            this.f9376e = new OverScroller(v.getContext());
        }
        this.f9376e.fling(0, m30612E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f9376e.computeScrollOffset()) {
            RunnableC3463a runnableC3463a = new RunnableC3463a(coordinatorLayout, v);
            this.f9375d = runnableC3463a;
            C1112b0.m38421k0(v, runnableC3463a);
            return true;
        }
        mo30697g0(coordinatorLayout, v);
        return false;
    }

    /* renamed from: K */
    abstract int mo30700d0(V v);

    /* renamed from: L */
    abstract int mo30699e0(V v);

    /* renamed from: M */
    abstract int mo30626M();

    /* renamed from: N */
    abstract void mo30697g0(CoordinatorLayout coordinatorLayout, V v);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final int m30624O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo30686r0(coordinatorLayout, v, mo30626M() - i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public int m30623P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo30686r0(coordinatorLayout, v, i, Integer.MIN_VALUE, Reader.READ_DONE);
    }

    /* renamed from: Q */
    abstract int mo30686r0(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: k */
    public boolean mo29260k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f9380i < 0) {
            this.f9380i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f9377f) {
            int i = this.f9378g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f9379h) > this.f9380i) {
                this.f9379h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f9378g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo30706X(v) && coordinatorLayout.m39361B(v, x, y2);
            this.f9377f = z;
            if (z) {
                this.f9379h = y2;
                this.f9378g = motionEvent.getPointerId(0);
                m30630I();
                OverScroller overScroller = this.f9376e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f9376e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f9381j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC3462a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9378g = -1;
        this.f9380i = -1;
    }
}
