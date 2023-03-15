package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC1693b;
import java.util.ArrayList;
import java.util.List;
import p120g8.C5616a;
import p332r8.C9826a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.d */
/* loaded from: classes.dex */
public abstract class AbstractC3678d extends Drawable implements Animatable {

    /* renamed from: K */
    private static final Property<AbstractC3678d, Float> f10354K = new C3681c(Float.class, "growFraction");

    /* renamed from: A */
    private ValueAnimator f10355A;

    /* renamed from: B */
    private boolean f10356B;

    /* renamed from: C */
    private boolean f10357C;

    /* renamed from: D */
    private float f10358D;

    /* renamed from: E */
    private List<AbstractC1693b> f10359E;

    /* renamed from: F */
    private AbstractC1693b f10360F;

    /* renamed from: G */
    private boolean f10361G;

    /* renamed from: H */
    private float f10362H;

    /* renamed from: J */
    private int f10364J;

    /* renamed from: w */
    final Context f10365w;

    /* renamed from: x */
    final AbstractC3675b f10366x;

    /* renamed from: z */
    private ValueAnimator f10368z;

    /* renamed from: I */
    final Paint f10363I = new Paint();

    /* renamed from: y */
    C9826a f10367y = new C9826a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* renamed from: com.google.android.material.progressindicator.d$a */
    /* loaded from: classes.dex */
    public class C3679a extends AnimatorListenerAdapter {
        C3679a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC3678d.this.m29373e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* renamed from: com.google.android.material.progressindicator.d$b */
    /* loaded from: classes.dex */
    public class C3680b extends AnimatorListenerAdapter {
        C3680b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC3678d.super.setVisible(false, false);
            AbstractC3678d.this.m29374d();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* renamed from: com.google.android.material.progressindicator.d$c */
    /* loaded from: classes.dex */
    class C3681c extends Property<AbstractC3678d, Float> {
        C3681c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(AbstractC3678d abstractC3678d) {
            return Float.valueOf(abstractC3678d.m29371g());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(AbstractC3678d abstractC3678d, Float f) {
            abstractC3678d.m29365m(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3678d(Context context, AbstractC3675b abstractC3675b) {
        this.f10365w = context;
        this.f10366x = abstractC3675b;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m29374d() {
        AbstractC1693b abstractC1693b = this.f10360F;
        if (abstractC1693b != null) {
            abstractC1693b.mo29392a(this);
        }
        List<AbstractC1693b> list = this.f10359E;
        if (list == null || this.f10361G) {
            return;
        }
        for (AbstractC1693b abstractC1693b2 : list) {
            abstractC1693b2.mo29392a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m29373e() {
        AbstractC1693b abstractC1693b = this.f10360F;
        if (abstractC1693b != null) {
            abstractC1693b.m35689b(this);
        }
        List<AbstractC1693b> list = this.f10359E;
        if (list == null || this.f10361G) {
            return;
        }
        for (AbstractC1693b abstractC1693b2 : list) {
            abstractC1693b2.m35689b(this);
        }
    }

    /* renamed from: f */
    private void m29372f(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f10361G;
        this.f10361G = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f10361G = z;
    }

    /* renamed from: k */
    private void m29367k() {
        if (this.f10368z == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10354K, 0.0f, 1.0f);
            this.f10368z = ofFloat;
            ofFloat.setDuration(500L);
            this.f10368z.setInterpolator(C5616a.f15854b);
            m29363o(this.f10368z);
        }
        if (this.f10355A == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f10354K, 1.0f, 0.0f);
            this.f10355A = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f10355A.setInterpolator(C5616a.f15854b);
            m29364n(this.f10355A);
        }
    }

    /* renamed from: n */
    private void m29364n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f10355A;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f10355A = valueAnimator;
        valueAnimator.addListener(new C3680b());
    }

    /* renamed from: o */
    private void m29363o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f10368z;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f10368z = valueAnimator;
        valueAnimator.addListener(new C3679a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m29371g() {
        if (this.f10366x.m29390b() || this.f10366x.m29391a()) {
            if (!this.f10357C && !this.f10356B) {
                return this.f10362H;
            }
            return this.f10358D;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10364J;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean m29370h() {
        return m29362p(false, false, false);
    }

    /* renamed from: i */
    public boolean m29369i() {
        ValueAnimator valueAnimator = this.f10355A;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f10357C;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m29368j() || m29369i();
    }

    /* renamed from: j */
    public boolean m29368j() {
        ValueAnimator valueAnimator = this.f10368z;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f10356B;
    }

    /* renamed from: l */
    public void m29366l(AbstractC1693b abstractC1693b) {
        if (this.f10359E == null) {
            this.f10359E = new ArrayList();
        }
        if (this.f10359E.contains(abstractC1693b)) {
            return;
        }
        this.f10359E.add(abstractC1693b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m29365m(float f) {
        if (this.f10362H != f) {
            this.f10362H = f;
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public boolean m29362p(boolean z, boolean z2, boolean z3) {
        return mo29354q(z, z2, z3 && this.f10367y.m9912a(this.f10365w.getContentResolver()) > 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo29354q(boolean z, boolean z2, boolean z3) {
        m29367k();
        if (isVisible() || z) {
            ValueAnimator valueAnimator = z ? this.f10368z : this.f10355A;
            if (!z3) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.end();
                } else {
                    m29372f(valueAnimator);
                }
                return super.setVisible(z, false);
            } else if (z3 && valueAnimator.isRunning()) {
                return false;
            } else {
                boolean z4 = !z || super.setVisible(z, false);
                if (!(z ? this.f10366x.m29390b() : this.f10366x.m29391a())) {
                    m29372f(valueAnimator);
                    return z4;
                }
                if (!z2 && Build.VERSION.SDK_INT >= 19 && valueAnimator.isPaused()) {
                    valueAnimator.resume();
                } else {
                    valueAnimator.start();
                }
                return z4;
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean m29361r(AbstractC1693b abstractC1693b) {
        List<AbstractC1693b> list = this.f10359E;
        if (list == null || !list.contains(abstractC1693b)) {
            return false;
        }
        this.f10359E.remove(abstractC1693b);
        if (this.f10359E.isEmpty()) {
            this.f10359E = null;
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f10364J = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10363I.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return m29362p(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        mo29354q(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        mo29354q(false, true, false);
    }
}
