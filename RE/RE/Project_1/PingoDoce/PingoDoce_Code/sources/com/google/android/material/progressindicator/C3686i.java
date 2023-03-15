package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC1693b;
import java.util.Arrays;
import p198k8.C6608a;
import p348s2.C10038b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.i */
/* loaded from: classes.dex */
public final class C3686i extends AbstractC3683f<ObjectAnimator> {

    /* renamed from: j */
    private static final Property<C3686i, Float> f10381j = new C3688b(Float.class, "animationFraction");

    /* renamed from: d */
    private ObjectAnimator f10382d;

    /* renamed from: e */
    private C10038b f10383e;

    /* renamed from: f */
    private final AbstractC3675b f10384f;

    /* renamed from: g */
    private int f10385g;

    /* renamed from: h */
    private boolean f10386h;

    /* renamed from: i */
    private float f10387i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* renamed from: com.google.android.material.progressindicator.i$a */
    /* loaded from: classes.dex */
    public class C3687a extends AnimatorListenerAdapter {
        C3687a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C3686i c3686i = C3686i.this;
            c3686i.f10385g = (c3686i.f10385g + 1) % C3686i.this.f10384f.f10344c.length;
            C3686i.this.f10386h = true;
        }
    }

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* renamed from: com.google.android.material.progressindicator.i$b */
    /* loaded from: classes.dex */
    class C3688b extends Property<C3686i, Float> {
        C3688b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C3686i c3686i) {
            return Float.valueOf(c3686i.m29338n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C3686i c3686i, Float f) {
            c3686i.m29334r(f.floatValue());
        }
    }

    public C3686i(C3693k c3693k) {
        super(3);
        this.f10385g = 1;
        this.f10384f = c3693k;
        this.f10383e = new C10038b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public float m29338n() {
        return this.f10387i;
    }

    /* renamed from: o */
    private void m29337o() {
        if (this.f10382d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10381j, 0.0f, 1.0f);
            this.f10382d = ofFloat;
            ofFloat.setDuration(333L);
            this.f10382d.setInterpolator(null);
            this.f10382d.setRepeatCount(-1);
            this.f10382d.addListener(new C3687a());
        }
    }

    /* renamed from: p */
    private void m29336p() {
        if (!this.f10386h || this.f10374b[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.f10375c;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = C6608a.m20507a(this.f10384f.f10344c[this.f10385g], this.f10373a.getAlpha());
        this.f10386h = false;
    }

    /* renamed from: s */
    private void m29333s(int i) {
        this.f10374b[0] = 0.0f;
        float m29356b = m29356b(i, 0, 667);
        float[] fArr = this.f10374b;
        float interpolation = this.f10383e.getInterpolation(m29356b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f10374b;
        float interpolation2 = this.f10383e.getInterpolation(m29356b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f10374b[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: a */
    public void mo29330a() {
        ObjectAnimator objectAnimator = this.f10382d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: c */
    public void mo29329c() {
        m29335q();
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: d */
    public void mo29328d(AbstractC1693b abstractC1693b) {
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: f */
    public void mo29327f() {
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: g */
    public void mo29326g() {
        m29337o();
        m29335q();
        this.f10382d.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC3683f
    /* renamed from: h */
    public void mo29325h() {
    }

    /* renamed from: q */
    void m29335q() {
        this.f10386h = true;
        this.f10385g = 1;
        Arrays.fill(this.f10375c, C6608a.m20507a(this.f10384f.f10344c[0], this.f10373a.getAlpha()));
    }

    /* renamed from: r */
    void m29334r(float f) {
        this.f10387i = f;
        m29333s((int) (f * 333.0f));
        m29336p();
        this.f10373a.invalidateSelf();
    }
}
