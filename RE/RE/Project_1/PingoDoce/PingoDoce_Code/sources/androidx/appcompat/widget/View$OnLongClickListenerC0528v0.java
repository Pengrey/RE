package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1112b0;
import androidx.core.view.C1148d0;
import com.google.crypto.tink.shaded.protobuf.Reader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: classes.dex */
public class View$OnLongClickListenerC0528v0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: F */
    private static View$OnLongClickListenerC0528v0 f1764F;

    /* renamed from: G */
    private static View$OnLongClickListenerC0528v0 f1765G;

    /* renamed from: B */
    private int f1767B;

    /* renamed from: C */
    private int f1768C;

    /* renamed from: D */
    private C0534w0 f1769D;

    /* renamed from: E */
    private boolean f1770E;

    /* renamed from: w */
    private final View f1771w;

    /* renamed from: x */
    private final CharSequence f1772x;

    /* renamed from: y */
    private final int f1773y;

    /* renamed from: z */
    private final Runnable f1774z = new RunnableC0529a();

    /* renamed from: A */
    private final Runnable f1766A = new RunnableC0530b();

    /* compiled from: TooltipCompatHandler.java */
    /* renamed from: androidx.appcompat.widget.v0$a */
    /* loaded from: classes.dex */
    class RunnableC0529a implements Runnable {
        RunnableC0529a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC0528v0.this.m40402g(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    /* renamed from: androidx.appcompat.widget.v0$b */
    /* loaded from: classes.dex */
    class RunnableC0530b implements Runnable {
        RunnableC0530b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC0528v0.this.m40406c();
        }
    }

    private View$OnLongClickListenerC0528v0(View view, CharSequence charSequence) {
        this.f1771w = view;
        this.f1772x = charSequence;
        this.f1773y = C1148d0.m38217c(ViewConfiguration.get(view.getContext()));
        m40407b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m40408a() {
        this.f1771w.removeCallbacks(this.f1774z);
    }

    /* renamed from: b */
    private void m40407b() {
        this.f1767B = Reader.READ_DONE;
        this.f1768C = Reader.READ_DONE;
    }

    /* renamed from: d */
    private void m40405d() {
        this.f1771w.postDelayed(this.f1774z, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m40404e(View$OnLongClickListenerC0528v0 view$OnLongClickListenerC0528v0) {
        View$OnLongClickListenerC0528v0 view$OnLongClickListenerC0528v02 = f1764F;
        if (view$OnLongClickListenerC0528v02 != null) {
            view$OnLongClickListenerC0528v02.m40408a();
        }
        f1764F = view$OnLongClickListenerC0528v0;
        if (view$OnLongClickListenerC0528v0 != null) {
            view$OnLongClickListenerC0528v0.m40405d();
        }
    }

    /* renamed from: f */
    public static void m40403f(View view, CharSequence charSequence) {
        View$OnLongClickListenerC0528v0 view$OnLongClickListenerC0528v0 = f1764F;
        if (view$OnLongClickListenerC0528v0 != null && view$OnLongClickListenerC0528v0.f1771w == view) {
            m40404e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC0528v0 view$OnLongClickListenerC0528v02 = f1765G;
            if (view$OnLongClickListenerC0528v02 != null && view$OnLongClickListenerC0528v02.f1771w == view) {
                view$OnLongClickListenerC0528v02.m40406c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC0528v0(view, charSequence);
    }

    /* renamed from: h */
    private boolean m40401h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1767B) > this.f1773y || Math.abs(y - this.f1768C) > this.f1773y) {
            this.f1767B = x;
            this.f1768C = y;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    void m40406c() {
        if (f1765G == this) {
            f1765G = null;
            C0534w0 c0534w0 = this.f1769D;
            if (c0534w0 != null) {
                c0534w0.m40369c();
                this.f1769D = null;
                m40407b();
                this.f1771w.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1764F == this) {
            m40404e(null);
        }
        this.f1771w.removeCallbacks(this.f1766A);
    }

    /* renamed from: g */
    void m40402g(boolean z) {
        long j;
        int longPressTimeout;
        long j2;
        if (C1112b0.m38447V(this.f1771w)) {
            m40404e(null);
            View$OnLongClickListenerC0528v0 view$OnLongClickListenerC0528v0 = f1765G;
            if (view$OnLongClickListenerC0528v0 != null) {
                view$OnLongClickListenerC0528v0.m40406c();
            }
            f1765G = this;
            this.f1770E = z;
            C0534w0 c0534w0 = new C0534w0(this.f1771w.getContext());
            this.f1769D = c0534w0;
            c0534w0.m40367e(this.f1771w, this.f1767B, this.f1768C, this.f1770E, this.f1772x);
            this.f1771w.addOnAttachStateChangeListener(this);
            if (this.f1770E) {
                j2 = 2500;
            } else {
                if ((C1112b0.m38454P(this.f1771w) & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - longPressTimeout;
            }
            this.f1771w.removeCallbacks(this.f1766A);
            this.f1771w.postDelayed(this.f1766A, j2);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1769D == null || !this.f1770E) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1771w.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    m40407b();
                    m40406c();
                }
            } else if (this.f1771w.isEnabled() && this.f1769D == null && m40401h(motionEvent)) {
                m40404e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1767B = view.getWidth() / 2;
        this.f1768C = view.getHeight() / 2;
        m40402g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m40406c();
    }
}
