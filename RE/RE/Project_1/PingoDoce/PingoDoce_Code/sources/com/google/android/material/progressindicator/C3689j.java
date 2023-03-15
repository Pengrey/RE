package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.AbstractC1693b;
import androidx.vectordrawable.graphics.drawable.C1698d;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;
import p100f8.C5418a;
import p198k8.C6608a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.j */
/* loaded from: classes.dex */
public final class C3689j extends AbstractC3683f<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f10389l = {533, 567, 850, 750};

    /* renamed from: m */
    private static final int[] f10390m = {1267, DateTimeConstants.MILLIS_PER_SECOND, 333, 0};

    /* renamed from: n */
    private static final Property<C3689j, Float> f10391n = new C3692c(Float.class, "animationFraction");

    /* renamed from: d */
    private ObjectAnimator f10392d;

    /* renamed from: e */
    private ObjectAnimator f10393e;

    /* renamed from: f */
    private final Interpolator[] f10394f;

    /* renamed from: g */
    private final AbstractC3675b f10395g;

    /* renamed from: h */
    private int f10396h;

    /* renamed from: i */
    private boolean f10397i;

    /* renamed from: j */
    private float f10398j;

    /* renamed from: k */
    AbstractC1693b f10399k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* renamed from: com.google.android.material.progressindicator.j$a */
    /* loaded from: classes.dex */
    public class C3690a extends AnimatorListenerAdapter {
        C3690a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C3689j c3689j = C3689j.this;
            c3689j.f10396h = (c3689j.f10396h + 1) % C3689j.this.f10395g.f10344c.length;
            C3689j.this.f10397i = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* renamed from: com.google.android.material.progressindicator.j$b */
    /* loaded from: classes.dex */
    public class C3691b extends AnimatorListenerAdapter {
        C3691b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C3689j.this.mo29330a();
            C3689j c3689j = C3689j.this;
            AbstractC1693b abstractC1693b = c3689j.f10399k;
            if (abstractC1693b != null) {
                abstractC1693b.mo29392a(c3689j.f10373a);
            }
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* renamed from: com.google.android.material.progressindicator.j$c */
    /* loaded from: classes.dex */
    class C3692c extends Property<C3689j, Float> {
        C3692c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C3689j c3689j) {
            return Float.valueOf(c3689j.m29319n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C3689j c3689j, Float f) {
            c3689j.m29315r(f.floatValue());
        }
    }

    public C3689j(Context context, C3693k c3693k) {
        super(2);
        this.f10396h = 0;
        this.f10399k = null;
        this.f10395g = c3693k;
        this.f10394f = new Interpolator[]{C1698d.m35683b(context, C5418a.linear_indeterminate_line1_head_interpolator), C1698d.m35683b(context, C5418a.linear_indeterminate_line1_tail_interpolator), C1698d.m35683b(context, C5418a.linear_indeterminate_line2_head_interpolator), C1698d.m35683b(context, C5418a.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public float m29319n() {
        return this.f10398j;
    }

    /* renamed from: o */
    private void m29318o() {
        if (this.f10392d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10391n, 0.0f, 1.0f);
            this.f10392d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f10392d.setInterpolator(null);
            this.f10392d.setRepeatCount(-1);
            this.f10392d.addListener(new C3690a());
        }
        if (this.f10393e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f10391n, 1.0f);
            this.f10393e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f10393e.setInterpolator(null);
            this.f10393e.addListener(new C3691b());
        }
    }

    /* renamed from: p */
    private void m29317p() {
        if (this.f10397i) {
            Arrays.fill(this.f10375c, C6608a.m20507a(this.f10395g.f10344c[this.f10396h], this.f10373a.getAlpha()));
            this.f10397i = false;
        }
    }

    /* renamed from: s */
    private void m29314s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f10374b[i2] = Math.max(0.0f, Math.min(1.0f, this.f10394f[i2].getInterpolation(m29356b(i, f10390m[i2], f10389l[i2]))));
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: a */
    public void mo29330a() {
        ObjectAnimator objectAnimator = this.f10392d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: c */
    public void mo29329c() {
        m29316q();
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: d */
    public void mo29328d(AbstractC1693b abstractC1693b) {
        this.f10399k = abstractC1693b;
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: f */
    public void mo29327f() {
        ObjectAnimator objectAnimator = this.f10393e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo29330a();
        if (this.f10373a.isVisible()) {
            this.f10393e.setFloatValues(this.f10398j, 1.0f);
            this.f10393e.setDuration((1.0f - this.f10398j) * 1800.0f);
            this.f10393e.start();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: g */
    public void mo29326g() {
        m29318o();
        m29316q();
        this.f10392d.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: h */
    public void mo29325h() {
        this.f10399k = null;
    }

    /* renamed from: q */
    void m29316q() {
        this.f10396h = 0;
        int m20507a = C6608a.m20507a(this.f10395g.f10344c[0], this.f10373a.getAlpha());
        int[] iArr = this.f10375c;
        iArr[0] = m20507a;
        iArr[1] = m20507a;
    }

    /* renamed from: r */
    void m29315r(float f) {
        this.f10398j = f;
        m29314s((int) (f * 1800.0f));
        m29317p();
        this.f10373a.invalidateSelf();
    }
}
