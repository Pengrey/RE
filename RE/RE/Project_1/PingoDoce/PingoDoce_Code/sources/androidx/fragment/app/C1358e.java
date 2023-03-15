package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.p020os.C1008b;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1214x;
import androidx.fragment.app.C1384s;
import p326r2.C9792a;
import p326r2.C9793b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public class C1358e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes.dex */
    public class C1359a implements C1008b.InterfaceC1010b {

        /* renamed from: a */
        final /* synthetic */ Fragment f4049a;

        C1359a(Fragment fragment) {
            this.f4049a = fragment;
        }

        @Override // androidx.core.p020os.C1008b.InterfaceC1010b
        /* renamed from: a */
        public void mo37090a() {
            if (this.f4049a.m37665C() != null) {
                View m37665C = this.f4049a.m37665C();
                this.f4049a.m37639M1(null);
                m37665C.clearAnimation();
            }
            this.f4049a.m37633O1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$b  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC1360b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4050a;

        /* renamed from: b */
        final /* synthetic */ Fragment f4051b;

        /* renamed from: c */
        final /* synthetic */ C1384s.InterfaceC1391g f4052c;

        /* renamed from: d */
        final /* synthetic */ C1008b f4053d;

        /* compiled from: FragmentAnim.java */
        /* renamed from: androidx.fragment.app.e$b$a */
        /* loaded from: classes.dex */
        class RunnableC1361a implements Runnable {
            RunnableC1361a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (animationAnimation$AnimationListenerC1360b.this.f4051b.m37665C() != null) {
                    animationAnimation$AnimationListenerC1360b.this.f4051b.m37639M1(null);
                    animationAnimation$AnimationListenerC1360b animationanimation_animationlistenerc1360b = animationAnimation$AnimationListenerC1360b.this;
                    animationanimation_animationlistenerc1360b.f4052c.mo37144a(animationanimation_animationlistenerc1360b.f4051b, animationanimation_animationlistenerc1360b.f4053d);
                }
            }
        }

        animationAnimation$AnimationListenerC1360b(ViewGroup viewGroup, Fragment fragment, C1384s.InterfaceC1391g interfaceC1391g, C1008b c1008b) {
            this.f4050a = viewGroup;
            this.f4051b = fragment;
            this.f4052c = interfaceC1391g;
            this.f4053d = c1008b;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4050a.post(new RunnableC1361a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$c */
    /* loaded from: classes.dex */
    public class C1362c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4055a;

        /* renamed from: b */
        final /* synthetic */ View f4056b;

        /* renamed from: c */
        final /* synthetic */ Fragment f4057c;

        /* renamed from: d */
        final /* synthetic */ C1384s.InterfaceC1391g f4058d;

        /* renamed from: e */
        final /* synthetic */ C1008b f4059e;

        C1362c(ViewGroup viewGroup, View view, Fragment fragment, C1384s.InterfaceC1391g interfaceC1391g, C1008b c1008b) {
            this.f4055a = viewGroup;
            this.f4056b = view;
            this.f4057c = fragment;
            this.f4058d = interfaceC1391g;
            this.f4059e = c1008b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4055a.endViewTransition(this.f4056b);
            Animator m37662D = this.f4057c.m37662D();
            this.f4057c.m37633O1(null);
            if (m37662D == null || this.f4055a.indexOfChild(this.f4056b) >= 0) {
                return;
            }
            this.f4058d.mo37144a(this.f4057c, this.f4059e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m37310a(Fragment fragment, C1363d c1363d, C1384s.InterfaceC1391g interfaceC1391g) {
        View view = fragment.f3826d0;
        ViewGroup viewGroup = fragment.f3825c0;
        viewGroup.startViewTransition(view);
        C1008b c1008b = new C1008b();
        c1008b.m38757d(new C1359a(fragment));
        interfaceC1391g.mo37143b(fragment, c1008b);
        if (c1363d.f4060a != null) {
            RunnableC1364e runnableC1364e = new RunnableC1364e(c1363d.f4060a, viewGroup, view);
            fragment.m37639M1(fragment.f3826d0);
            runnableC1364e.setAnimationListener(new animationAnimation$AnimationListenerC1360b(viewGroup, fragment, interfaceC1391g, c1008b));
            fragment.f3826d0.startAnimation(runnableC1364e);
            return;
        }
        Animator animator = c1363d.f4061b;
        fragment.m37633O1(animator);
        animator.addListener(new C1362c(viewGroup, view, fragment, interfaceC1391g, c1008b));
        animator.setTarget(fragment.f3826d0);
        animator.start();
    }

    /* renamed from: b */
    private static int m37309b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.m37614V();
            }
            return fragment.m37611W();
        } else if (z) {
            return fragment.m37651H();
        } else {
            return fragment.m37644K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1363d m37308c(Context context, Fragment fragment, boolean z, boolean z2) {
        int m37626R = fragment.m37626R();
        int m37309b = m37309b(fragment, z, z2);
        boolean z3 = false;
        fragment.m37636N1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f3825c0;
        if (viewGroup != null) {
            int i = C9793b.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.f3825c0.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f3825c0;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation m37659E0 = fragment.m37659E0(m37626R, z, m37309b);
            if (m37659E0 != null) {
                return new C1363d(m37659E0);
            }
            Animator m37656F0 = fragment.m37656F0(m37626R, z, m37309b);
            if (m37656F0 != null) {
                return new C1363d(m37656F0);
            }
            if (m37309b == 0 && m37626R != 0) {
                m37309b = m37307d(m37626R, z);
            }
            if (m37309b != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(m37309b));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, m37309b);
                        if (loadAnimation != null) {
                            return new C1363d(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, m37309b);
                        if (loadAnimator != null) {
                            return new C1363d(loadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m37309b);
                            if (loadAnimation2 != null) {
                                return new C1363d(loadAnimation2);
                            }
                        } else {
                            throw e2;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    private static int m37307d(int i, boolean z) {
        if (i == 4097) {
            return z ? C9792a.fragment_open_enter : C9792a.fragment_open_exit;
        } else if (i == 4099) {
            return z ? C9792a.fragment_fade_enter : C9792a.fragment_fade_exit;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? C9792a.fragment_close_enter : C9792a.fragment_close_exit;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$d */
    /* loaded from: classes.dex */
    public static class C1363d {

        /* renamed from: a */
        public final Animation f4060a;

        /* renamed from: b */
        public final Animator f4061b;

        C1363d(Animation animation) {
            this.f4060a = animation;
            this.f4061b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C1363d(Animator animator) {
            this.f4060a = null;
            this.f4061b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$e */
    /* loaded from: classes.dex */
    public static class RunnableC1364e extends AnimationSet implements Runnable {

        /* renamed from: A */
        private boolean f4062A;

        /* renamed from: w */
        private final ViewGroup f4063w;

        /* renamed from: x */
        private final View f4064x;

        /* renamed from: y */
        private boolean f4065y;

        /* renamed from: z */
        private boolean f4066z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RunnableC1364e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4062A = true;
            this.f4063w = viewGroup;
            this.f4064x = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f4062A = true;
            if (this.f4065y) {
                return !this.f4066z;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f4065y = true;
                ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(this.f4063w, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f4065y && this.f4062A) {
                this.f4062A = false;
                this.f4063w.post(this);
                return;
            }
            this.f4063w.endViewTransition(this.f4064x);
            this.f4066z = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f4062A = true;
            if (this.f4065y) {
                return !this.f4066z;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f4065y = true;
                ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(this.f4063w, this);
            }
            return true;
        }
    }
}
