package p156i8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p156i8.InterfaceC6050d;

/* renamed from: i8.a */
/* loaded from: classes.dex */
public final class C6046a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: i8.a$a */
    /* loaded from: classes.dex */
    class C6047a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6050d f16692a;

        C6047a(InterfaceC6050d interfaceC6050d) {
            this.f16692a = interfaceC6050d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16692a.mo21123a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f16692a.mo21122b();
        }
    }

    /* renamed from: a */
    public static Animator m22305a(InterfaceC6050d interfaceC6050d, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC6050d, (Property<InterfaceC6050d, V>) InterfaceC6050d.C6053c.f16696a, (TypeEvaluator) InterfaceC6050d.C6052b.f16694b, (Object[]) new InterfaceC6050d.C6055e[]{new InterfaceC6050d.C6055e(f, f2, f3)});
        if (Build.VERSION.SDK_INT >= 21) {
            InterfaceC6050d.C6055e revealInfo = interfaceC6050d.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC6050d, (int) f, (int) f2, revealInfo.f16700c, f3);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        return ofObject;
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m22304b(InterfaceC6050d interfaceC6050d) {
        return new C6047a(interfaceC6050d);
    }
}
