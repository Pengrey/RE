package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p209l.InterfaceC6954e;

/* renamed from: androidx.appcompat.widget.e0 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0467e0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: A */
    private Runnable f1556A;

    /* renamed from: B */
    private Runnable f1557B;

    /* renamed from: C */
    private boolean f1558C;

    /* renamed from: D */
    private int f1559D;

    /* renamed from: E */
    private final int[] f1560E = new int[2];

    /* renamed from: w */
    private final float f1561w;

    /* renamed from: x */
    private final int f1562x;

    /* renamed from: y */
    private final int f1563y;

    /* renamed from: z */
    final View f1564z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* renamed from: androidx.appcompat.widget.e0$a */
    /* loaded from: classes.dex */
    public class RunnableC0468a implements Runnable {
        RunnableC0468a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC0467e0.this.f1564z.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* renamed from: androidx.appcompat.widget.e0$b */
    /* loaded from: classes.dex */
    public class RunnableC0469b implements Runnable {
        RunnableC0469b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC0467e0.this.m40645e();
        }
    }

    public AbstractView$OnTouchListenerC0467e0(View view) {
        this.f1564z = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1561w = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1562x = tapTimeout;
        this.f1563y = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m40649a() {
        Runnable runnable = this.f1557B;
        if (runnable != null) {
            this.f1564z.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1556A;
        if (runnable2 != null) {
            this.f1564z.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m40644f(MotionEvent motionEvent) {
        C0460c0 c0460c0;
        View view = this.f1564z;
        InterfaceC6954e mo40648b = mo40648b();
        if (mo40648b == null || !mo40648b.mo19709c() || (c0460c0 = (C0460c0) mo40648b.mo19708h()) == null || !c0460c0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m40641i(view, obtainNoHistory);
        m40640j(c0460c0, obtainNoHistory);
        boolean m40671e = c0460c0.m40671e(obtainNoHistory, this.f1559D);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return m40671e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m40643g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1564z
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1559D
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1561w
            boolean r6 = m40642h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m40649a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m40649a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1559D = r6
            java.lang.Runnable r6 = r5.f1556A
            if (r6 != 0) goto L52
            androidx.appcompat.widget.e0$a r6 = new androidx.appcompat.widget.e0$a
            r6.<init>()
            r5.f1556A = r6
        L52:
            java.lang.Runnable r6 = r5.f1556A
            int r1 = r5.f1562x
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1557B
            if (r6 != 0) goto L65
            androidx.appcompat.widget.e0$b r6 = new androidx.appcompat.widget.e0$b
            r6.<init>()
            r5.f1557B = r6
        L65:
            java.lang.Runnable r6 = r5.f1557B
            int r1 = r5.f1563y
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0.m40643g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m40642h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m40641i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1560E;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m40640j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1560E;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC6954e mo40648b();

    /* renamed from: c */
    protected abstract boolean mo40647c();

    /* renamed from: d */
    protected boolean mo40646d() {
        InterfaceC6954e mo40648b = mo40648b();
        if (mo40648b == null || !mo40648b.mo19709c()) {
            return true;
        }
        mo40648b.dismiss();
        return true;
    }

    /* renamed from: e */
    void m40645e() {
        m40649a();
        View view = this.f1564z;
        if (view.isEnabled() && !view.isLongClickable() && mo40647c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1558C = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1558C;
        if (z2) {
            z = m40644f(motionEvent) || !mo40646d();
        } else {
            z = m40643g(motionEvent) && mo40647c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1564z.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1558C = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1558C = false;
        this.f1559D = -1;
        Runnable runnable = this.f1556A;
        if (runnable != null) {
            this.f1564z.removeCallbacks(runnable);
        }
    }
}
