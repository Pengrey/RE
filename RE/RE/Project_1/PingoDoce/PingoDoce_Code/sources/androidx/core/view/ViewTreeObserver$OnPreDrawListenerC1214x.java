package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: androidx.core.view.x */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC1214x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: w */
    private final View f3580w;

    /* renamed from: x */
    private ViewTreeObserver f3581x;

    /* renamed from: y */
    private final Runnable f3582y;

    private ViewTreeObserver$OnPreDrawListenerC1214x(View view, Runnable runnable) {
        this.f3580w = view;
        this.f3581x = view.getViewTreeObserver();
        this.f3582y = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC1214x m38016a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        ViewTreeObserver$OnPreDrawListenerC1214x viewTreeObserver$OnPreDrawListenerC1214x = new ViewTreeObserver$OnPreDrawListenerC1214x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1214x);
        view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC1214x);
        return viewTreeObserver$OnPreDrawListenerC1214x;
    }

    /* renamed from: b */
    public void m38015b() {
        if (this.f3581x.isAlive()) {
            this.f3581x.removeOnPreDrawListener(this);
        } else {
            this.f3580w.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3580w.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m38015b();
        this.f3582y.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3581x = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m38015b();
    }
}
