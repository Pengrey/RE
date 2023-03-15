package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.h0 */
/* loaded from: classes.dex */
public final class C1166h0 {

    /* renamed from: a */
    private final WeakReference<View> f3525a;

    /* renamed from: b */
    Runnable f3526b = null;

    /* renamed from: c */
    Runnable f3527c = null;

    /* renamed from: d */
    int f3528d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: androidx.core.view.h0$a */
    /* loaded from: classes.dex */
    public class C1167a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1172i0 f3529a;

        /* renamed from: b */
        final /* synthetic */ View f3530b;

        C1167a(C1166h0 c1166h0, InterfaceC1172i0 interfaceC1172i0, View view) {
            this.f3529a = interfaceC1172i0;
            this.f3530b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3529a.mo38143a(this.f3530b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3529a.mo20606b(this.f3530b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3529a.mo20605c(this.f3530b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: androidx.core.view.h0$b */
    /* loaded from: classes.dex */
    static class C1168b {
        /* renamed from: a */
        static ViewPropertyAnimator m38158a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: androidx.core.view.h0$c */
    /* loaded from: classes.dex */
    static class C1169c implements InterfaceC1172i0 {

        /* renamed from: a */
        C1166h0 f3531a;

        /* renamed from: b */
        boolean f3532b;

        C1169c(C1166h0 c1166h0) {
            this.f3531a = c1166h0;
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: a */
        public void mo38143a(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC1172i0 interfaceC1172i0 = tag instanceof InterfaceC1172i0 ? (InterfaceC1172i0) tag : null;
            if (interfaceC1172i0 != null) {
                interfaceC1172i0.mo38143a(view);
            }
        }

        @Override // androidx.core.view.InterfaceC1172i0
        @SuppressLint({"WrongConstant"})
        /* renamed from: b */
        public void mo20606b(View view) {
            int i = this.f3531a.f3528d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f3531a.f3528d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f3532b) {
                C1166h0 c1166h0 = this.f3531a;
                Runnable runnable = c1166h0.f3527c;
                if (runnable != null) {
                    c1166h0.f3527c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC1172i0 interfaceC1172i0 = tag instanceof InterfaceC1172i0 ? (InterfaceC1172i0) tag : null;
                if (interfaceC1172i0 != null) {
                    interfaceC1172i0.mo20606b(view);
                }
                this.f3532b = true;
            }
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: c */
        public void mo20605c(View view) {
            this.f3532b = false;
            if (this.f3531a.f3528d > -1) {
                view.setLayerType(2, null);
            }
            C1166h0 c1166h0 = this.f3531a;
            Runnable runnable = c1166h0.f3526b;
            if (runnable != null) {
                c1166h0.f3526b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC1172i0 interfaceC1172i0 = tag instanceof InterfaceC1172i0 ? (InterfaceC1172i0) tag : null;
            if (interfaceC1172i0 != null) {
                interfaceC1172i0.mo20605c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1166h0(View view) {
        this.f3525a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m38163i(View view, InterfaceC1172i0 interfaceC1172i0) {
        if (interfaceC1172i0 != null) {
            view.animate().setListener(new C1167a(this, interfaceC1172i0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: b */
    public C1166h0 m38170b(float f) {
        View view = this.f3525a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void m38169c() {
        View view = this.f3525a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m38168d() {
        View view = this.f3525a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public C1166h0 m38166f(long j) {
        View view = this.f3525a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public C1166h0 m38165g(Interpolator interpolator) {
        View view = this.f3525a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C1166h0 m38164h(InterfaceC1172i0 interfaceC1172i0) {
        View view = this.f3525a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m38163i(view, interfaceC1172i0);
            } else {
                view.setTag(2113929216, interfaceC1172i0);
                m38163i(view, new C1169c(this));
            }
        }
        return this;
    }

    /* renamed from: j */
    public C1166h0 m38162j(long j) {
        View view = this.f3525a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public C1166h0 m38161k(final InterfaceC1177k0 interfaceC1177k0) {
        final View view = this.f3525a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C1168b.m38158a(view.animate(), interfaceC1177k0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.g0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC1177k0.this.mo38122a(view);
                }
            } : null);
        }
        return this;
    }

    /* renamed from: l */
    public void m38160l() {
        View view = this.f3525a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C1166h0 m38159m(float f) {
        View view = this.f3525a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
