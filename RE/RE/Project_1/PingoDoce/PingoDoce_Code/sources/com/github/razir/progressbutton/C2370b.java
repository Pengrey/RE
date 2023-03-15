package com.github.razir.progressbutton;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.widget.TextView;
import androidx.core.graphics.C0969a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* renamed from: com.github.razir.progressbutton.b */
/* loaded from: classes.dex */
public final class C2370b {

    /* compiled from: ButtonTextAnimatorExtensions.kt */
    /* renamed from: com.github.razir.progressbutton.b$a */
    /* loaded from: classes.dex */
    public static final class C2371a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TextView f6925a;

        C2371a(TextView textView, C2382i c2382i) {
            this.f6925a = textView;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.m20926i(animator, "animation");
            C2370b.m33780c(this.f6925a);
            C2370b.m33781b(this.f6925a, animator);
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.m20926i(animator, "animation");
            C2370b.m33781b(this.f6925a, animator);
            C2370b.m33780c(this.f6925a);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.m20926i(animator, "animation");
            C2370b.m33782a(this.f6925a, animator);
        }
    }

    /* compiled from: ButtonTextAnimatorExtensions.kt */
    /* renamed from: com.github.razir.progressbutton.b$b */
    /* loaded from: classes.dex */
    public static final class C2372b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TextView f6926a;

        /* renamed from: b */
        final /* synthetic */ SpannableString f6927b;

        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f6928c;

        C2372b(TextView textView, C2382i c2382i, SpannableString spannableString, ObjectAnimator objectAnimator) {
            this.f6926a = textView;
            this.f6927b = spannableString;
            this.f6928c = objectAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.m20926i(animator, "animation");
            this.f6926a.setText(this.f6927b);
            C2370b.m33780c(this.f6926a);
            C2370b.m33781b(this.f6926a, animator);
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.m20926i(animator, "animation");
            this.f6926a.setText(this.f6927b);
            this.f6928c.start();
            C2370b.m33781b(this.f6926a, animator);
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.m20926i(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.m20926i(animator, "animation");
            C2370b.m33782a(this.f6926a, animator);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m33782a(TextView textView, Animator animator) {
        m33779d(textView, animator);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m33781b(TextView textView, Animator animator) {
        m33775h(textView, animator);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m33780c(TextView textView) {
        m33772k(textView);
    }

    /* renamed from: d */
    private static final void m33779d(TextView textView, Animator animator) {
        List<Animator> m191m;
        if (C2378g.m33742e().containsKey(textView)) {
            List<Animator> list = C2378g.m33742e().get(textView);
            if (list != null) {
                list.add(animator);
                return;
            }
            return;
        }
        WeakHashMap<TextView, List<Animator>> m33742e = C2378g.m33742e();
        m191m = C13780s.m191m(animator);
        m33742e.put(textView, m191m);
    }

    /* renamed from: e */
    public static final void m33778e(TextView textView, SpannableString spannableString) {
        Intrinsics.m20926i(textView, "$this$animateTextChange");
        m33776g(textView);
        C2382i c2382i = C2378g.m33740g().get(textView);
        if (c2382i == null) {
            Intrinsics.m20916s();
        }
        Intrinsics.isNotNull(c2382i, "attachedViews[this]!!");
        C2382i c2382i2 = c2382i;
        int m33774i = m33774i(textView);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(textView, "textColor", C0969a.m38939j(m33774i, 0), m33774i);
        ofInt.setDuration(c2382i2.m33723a());
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.addListener(new C2371a(textView, c2382i2));
        ofInt.start();
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(textView, "textColor", m33774i, C0969a.m38939j(m33774i, 0));
        ofInt2.setDuration(c2382i2.m33722b());
        ofInt2.setEvaluator(new ArgbEvaluator());
        ofInt2.addListener(new C2372b(textView, c2382i2, spannableString, ofInt));
        ofInt2.start();
    }

    /* renamed from: f */
    public static final void m33777f(TextView textView, String str) {
        Intrinsics.m20926i(textView, "$this$animateTextChange");
        m33778e(textView, str != null ? new SpannableString(str) : null);
    }

    /* renamed from: g */
    public static final void m33776g(TextView textView) {
        Intrinsics.m20926i(textView, "$this$cancelAnimations");
        if (C2378g.m33742e().containsKey(textView)) {
            List<Animator> list = C2378g.m33742e().get(textView);
            if (list == null) {
                Intrinsics.m20916s();
            }
            Intrinsics.isNotNull(list, "activeAnimations[this]!!");
            for (Animator animator : new ArrayList(list)) {
                animator.cancel();
            }
            C2378g.m33742e().remove(textView);
        }
    }

    /* renamed from: h */
    private static final void m33775h(TextView textView, Animator animator) {
        if (C2378g.m33742e().containsKey(textView)) {
            List<Animator> list = C2378g.m33742e().get(textView);
            if (list == null) {
                Intrinsics.m20916s();
            }
            Intrinsics.isNotNull(list, "activeAnimations[this]!!");
            List<Animator> list2 = list;
            list2.remove(animator);
            if (list2.isEmpty()) {
                C2378g.m33742e().remove(textView);
            }
        }
    }

    /* renamed from: i */
    private static final int m33774i(TextView textView) {
        C2382i c2382i = C2378g.m33740g().get(textView);
        if (c2382i == null) {
            Intrinsics.m20916s();
        }
        Intrinsics.isNotNull(c2382i, "attachedViews[this]!!");
        C2382i c2382i2 = c2382i;
        if (c2382i2.m33720d() != null) {
            int[] drawableState = textView.getDrawableState();
            ColorStateList m33720d = c2382i2.m33720d();
            if (m33720d == null) {
                Intrinsics.m20916s();
            }
            return m33720d.getColorForState(drawableState, -16777216);
        }
        return c2382i2.m33721c();
    }

    /* renamed from: j */
    public static final boolean m33773j(TextView textView) {
        Intrinsics.m20926i(textView, "$this$isAnimatorAttached");
        return C2378g.m33740g().containsKey(textView);
    }

    /* renamed from: k */
    private static final void m33772k(TextView textView) {
        if (m33773j(textView)) {
            C2382i c2382i = C2378g.m33740g().get(textView);
            if (c2382i == null) {
                Intrinsics.m20916s();
            }
            Intrinsics.isNotNull(c2382i, "attachedViews[this]!!");
            C2382i c2382i2 = c2382i;
            ColorStateList m33720d = c2382i2.m33720d();
            if (m33720d != null) {
                textView.setTextColor(m33720d);
            } else {
                textView.setTextColor(c2382i2.m33721c());
            }
        }
    }
}
