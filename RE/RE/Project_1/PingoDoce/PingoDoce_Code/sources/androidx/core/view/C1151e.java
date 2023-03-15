package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.view.e */
/* loaded from: classes.dex */
public final class C1151e {

    /* renamed from: a */
    private final InterfaceC1152a f3491a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GestureDetectorCompat.java */
    /* renamed from: androidx.core.view.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1152a {
        /* renamed from: a */
        boolean mo38203a(MotionEvent motionEvent);
    }

    /* compiled from: GestureDetectorCompat.java */
    /* renamed from: androidx.core.view.e$b */
    /* loaded from: classes.dex */
    static class C1153b implements InterfaceC1152a {

        /* renamed from: v */
        private static final int f3492v = ViewConfiguration.getTapTimeout();

        /* renamed from: w */
        private static final int f3493w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        private int f3494a;

        /* renamed from: b */
        private int f3495b;

        /* renamed from: c */
        private int f3496c;

        /* renamed from: d */
        private int f3497d;

        /* renamed from: e */
        private final Handler f3498e;

        /* renamed from: f */
        final GestureDetector.OnGestureListener f3499f;

        /* renamed from: g */
        GestureDetector.OnDoubleTapListener f3500g;

        /* renamed from: h */
        boolean f3501h;

        /* renamed from: i */
        boolean f3502i;

        /* renamed from: j */
        private boolean f3503j;

        /* renamed from: k */
        private boolean f3504k;

        /* renamed from: l */
        private boolean f3505l;

        /* renamed from: m */
        MotionEvent f3506m;

        /* renamed from: n */
        private MotionEvent f3507n;

        /* renamed from: o */
        private boolean f3508o;

        /* renamed from: p */
        private float f3509p;

        /* renamed from: q */
        private float f3510q;

        /* renamed from: r */
        private float f3511r;

        /* renamed from: s */
        private float f3512s;

        /* renamed from: t */
        private boolean f3513t;

        /* renamed from: u */
        private VelocityTracker f3514u;

        C1153b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f3498e = new HandlerC1154a(handler);
            } else {
                this.f3498e = new HandlerC1154a();
            }
            this.f3499f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                m38204g((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m38206e(context);
        }

        /* renamed from: b */
        private void m38209b() {
            this.f3498e.removeMessages(1);
            this.f3498e.removeMessages(2);
            this.f3498e.removeMessages(3);
            this.f3514u.recycle();
            this.f3514u = null;
            this.f3508o = false;
            this.f3501h = false;
            this.f3504k = false;
            this.f3505l = false;
            this.f3502i = false;
            if (this.f3503j) {
                this.f3503j = false;
            }
        }

        /* renamed from: c */
        private void m38208c() {
            this.f3498e.removeMessages(1);
            this.f3498e.removeMessages(2);
            this.f3498e.removeMessages(3);
            this.f3508o = false;
            this.f3504k = false;
            this.f3505l = false;
            this.f3502i = false;
            if (this.f3503j) {
                this.f3503j = false;
            }
        }

        /* renamed from: e */
        private void m38206e(Context context) {
            if (context != null) {
                if (this.f3499f != null) {
                    this.f3513t = true;
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                    int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                    int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                    this.f3496c = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f3497d = viewConfiguration.getScaledMaximumFlingVelocity();
                    this.f3494a = scaledTouchSlop * scaledTouchSlop;
                    this.f3495b = scaledDoubleTapSlop * scaledDoubleTapSlop;
                    return;
                }
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        /* renamed from: f */
        private boolean m38205f(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (this.f3505l && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= f3493w) {
                int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                return (x * x) + (y * y) < this.f3495b;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
        @Override // androidx.core.view.C1151e.InterfaceC1152a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo38203a(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 589
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C1151e.C1153b.mo38203a(android.view.MotionEvent):boolean");
        }

        /* renamed from: d */
        void m38207d() {
            this.f3498e.removeMessages(3);
            this.f3502i = false;
            this.f3503j = true;
            this.f3499f.onLongPress(this.f3506m);
        }

        /* renamed from: g */
        public void m38204g(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f3500g = onDoubleTapListener;
        }

        /* compiled from: GestureDetectorCompat.java */
        /* renamed from: androidx.core.view.e$b$a */
        /* loaded from: classes.dex */
        private class HandlerC1154a extends Handler {
            HandlerC1154a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C1153b c1153b = C1153b.this;
                    c1153b.f3499f.onShowPress(c1153b.f3506m);
                } else if (i == 2) {
                    C1153b.this.m38207d();
                } else if (i == 3) {
                    C1153b c1153b2 = C1153b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = c1153b2.f3500g;
                    if (onDoubleTapListener != null) {
                        if (!c1153b2.f3501h) {
                            onDoubleTapListener.onSingleTapConfirmed(c1153b2.f3506m);
                        } else {
                            c1153b2.f3502i = true;
                        }
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }

            HandlerC1154a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* compiled from: GestureDetectorCompat.java */
    /* renamed from: androidx.core.view.e$c */
    /* loaded from: classes.dex */
    static class C1155c implements InterfaceC1152a {

        /* renamed from: a */
        private final GestureDetector f3516a;

        C1155c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3516a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.C1151e.InterfaceC1152a
        /* renamed from: a */
        public boolean mo38203a(MotionEvent motionEvent) {
            return this.f3516a.onTouchEvent(motionEvent);
        }
    }

    public C1151e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m38210a(MotionEvent motionEvent) {
        return this.f3491a.mo38203a(motionEvent);
    }

    public C1151e(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f3491a = new C1155c(context, onGestureListener, handler);
        } else {
            this.f3491a = new C1153b(context, onGestureListener, handler);
        }
    }
}
