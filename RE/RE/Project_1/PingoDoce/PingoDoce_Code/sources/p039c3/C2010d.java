package p039c3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1112b0;

/* renamed from: c3.d */
/* loaded from: classes.dex */
public class C2010d extends AbstractC2029j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Fade.java */
    /* renamed from: c3.d$a */
    /* loaded from: classes.dex */
    public class C2011a extends C2045n {

        /* renamed from: a */
        final /* synthetic */ View f5849a;

        C2011a(C2010d c2010d, View view) {
            this.f5849a = view;
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: e */
        public void mo34816e(AbstractC2037m abstractC2037m) {
            C2007c0.m34943g(this.f5849a, 1.0f);
            C2007c0.m34949a(this.f5849a);
            abstractC2037m.mo34846T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Fade.java */
    /* renamed from: c3.d$b */
    /* loaded from: classes.dex */
    public static class C2012b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f5850a;

        /* renamed from: b */
        private boolean f5851b = false;

        C2012b(View view) {
            this.f5850a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2007c0.m34943g(this.f5850a, 1.0f);
            if (this.f5851b) {
                this.f5850a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C1112b0.m38450S(this.f5850a) && this.f5850a.getLayerType() == 0) {
                this.f5851b = true;
                this.f5850a.setLayerType(2, null);
            }
        }
    }

    public C2010d(int i) {
        m34897m0(i);
    }

    /* renamed from: n0 */
    private Animator m34935n0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C2007c0.m34943g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C2007c0.f5848b, f2);
        ofFloat.addListener(new C2012b(view));
        mo34840a(new C2011a(this, view));
        return ofFloat;
    }

    /* renamed from: o0 */
    private static float m34934o0(C2054s c2054s, float f) {
        Float f2;
        return (c2054s == null || (f2 = (Float) c2054s.f5959a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p039c3.AbstractC2029j0
    /* renamed from: i0 */
    public Animator mo34901i0(ViewGroup viewGroup, View view, C2054s c2054s, C2054s c2054s2) {
        float m34934o0 = m34934o0(c2054s, 0.0f);
        return m34935n0(view, m34934o0 != 1.0f ? m34934o0 : 0.0f, 1.0f);
    }

    @Override // p039c3.AbstractC2029j0, p039c3.AbstractC2037m
    /* renamed from: j */
    public void mo29509j(C2054s c2054s) {
        super.mo29509j(c2054s);
        c2054s.f5959a.put("android:fade:transitionAlpha", Float.valueOf(C2007c0.m34947c(c2054s.f5960b)));
    }

    @Override // p039c3.AbstractC2029j0
    /* renamed from: k0 */
    public Animator mo34899k0(ViewGroup viewGroup, View view, C2054s c2054s, C2054s c2054s2) {
        C2007c0.m34945e(view);
        return m34935n0(view, m34934o0(c2054s, 1.0f), 0.0f);
    }

    public C2010d() {
    }
}
