package p336rc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import id.InterfaceC6097a;
import java.util.Objects;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import sc.InterfaceC10145a;
import tc.InterfaceC10475c;

/* renamed from: rc.d */
/* loaded from: classes2.dex */
public final class SpotlightView extends FrameLayout {

    /* renamed from: A */
    private ValueAnimator f25824A;

    /* renamed from: B */
    private ValueAnimator f25825B;

    /* renamed from: C */
    private Target f25826C;

    /* renamed from: w */
    private final InterfaceC13178g f25827w;

    /* renamed from: x */
    private final InterfaceC13178g f25828x;

    /* renamed from: y */
    private final InterfaceC13178g f25829y;

    /* renamed from: z */
    private final ValueAnimator.AnimatorUpdateListener f25830z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpotlightView.kt */
    /* renamed from: rc.d$a */
    /* loaded from: classes2.dex */
    public static final class C9857a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ int f25831w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9857a(int i) {
            super(0);
            this.f25831w = i;
        }

        /* renamed from: a */
        public final Paint mo42214q() {
            Paint paint = new Paint();
            paint.setColor(this.f25831w);
            return paint;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpotlightView.kt */
    /* renamed from: rc.d$b */
    /* loaded from: classes2.dex */
    public static final class C9858b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C9858b f25832w = new C9858b();

        C9858b() {
            super(0);
        }

        /* renamed from: a */
        public final Paint mo42214q() {
            return new Paint();
        }
    }

    /* compiled from: SpotlightView.kt */
    /* renamed from: rc.d$c */
    /* loaded from: classes2.dex */
    public static final class C9859c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f25833a;

        C9859c(ValueAnimator valueAnimator) {
            this.f25833a = valueAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            this.f25833a.removeAllListeners();
            this.f25833a.removeAllUpdateListeners();
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            this.f25833a.removeAllListeners();
            this.f25833a.removeAllUpdateListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpotlightView.kt */
    /* renamed from: rc.d$d */
    /* loaded from: classes2.dex */
    public static final class C9860d implements ValueAnimator.AnimatorUpdateListener {
        C9860d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SpotlightView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpotlightView.kt */
    /* renamed from: rc.d$e */
    /* loaded from: classes2.dex */
    public static final class C9861e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C9861e f25835w = new C9861e();

        C9861e() {
            super(0);
        }

        /* renamed from: a */
        public final Paint mo42214q() {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            return paint;
        }
    }

    /* compiled from: SpotlightView.kt */
    /* renamed from: rc.d$f */
    /* loaded from: classes2.dex */
    public static final class C9862f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f25836a;

        C9862f(ValueAnimator valueAnimator) {
            this.f25836a = valueAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            this.f25836a.removeAllListeners();
            this.f25836a.removeAllUpdateListeners();
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            this.f25836a.removeAllListeners();
            this.f25836a.removeAllUpdateListeners();
        }
    }

    /* compiled from: SpotlightView.kt */
    /* renamed from: rc.d$g */
    /* loaded from: classes2.dex */
    public static final class C9863g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f25837a;

        C9863g(ValueAnimator valueAnimator) {
            this.f25837a = valueAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            this.f25837a.removeAllListeners();
            this.f25837a.removeAllUpdateListeners();
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            this.f25837a.removeAllListeners();
            this.f25837a.removeAllUpdateListeners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        Intrinsics.isThisObjectNull(context, "context");
        m1464a = LazyJVM.m1464a(new C9857a(i2));
        this.f25827w = m1464a;
        m1464a2 = LazyJVM.m1464a(C9861e.f25835w);
        this.f25828x = m1464a2;
        m1464a3 = LazyJVM.m1464a(C9858b.f25832w);
        this.f25829y = m1464a3;
        this.f25830z = new C9860d();
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    private final Paint getBackgroundPaint() {
        return (Paint) this.f25827w.getValue();
    }

    private final Paint getEffectPaint() {
        return (Paint) this.f25829y.getValue();
    }

    private final Paint getShapePaint() {
        return (Paint) this.f25828x.getValue();
    }

    /* renamed from: a */
    public final void m9803a() {
        ValueAnimator valueAnimator = this.f25825B;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f25825B;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.f25825B;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f25825B = null;
        ValueAnimator valueAnimator4 = this.f25824A;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator valueAnimator5 = this.f25824A;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator6 = this.f25824A;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        this.f25824A = null;
        removeAllViews();
    }

    /* renamed from: b */
    public final void m9802b(long j, TimeInterpolator timeInterpolator, Animator.AnimatorListener animatorListener) {
        Intrinsics.isThisObjectNull(timeInterpolator, "interpolator");
        Intrinsics.isThisObjectNull(animatorListener, "listener");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addListener(animatorListener);
        ofFloat.start();
    }

    /* renamed from: c */
    public final void m9801c(Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator;
        Object animatedValue;
        Intrinsics.isThisObjectNull(animatorListener, "listener");
        Target target = this.f25826C;
        if (target == null || (valueAnimator = this.f25824A) == null || (animatedValue = valueAnimator.getAnimatedValue()) == null) {
            return;
        }
        ValueAnimator valueAnimator2 = this.f25824A;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f25824A;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.f25824A;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) animatedValue).floatValue(), 0.0f);
        ofFloat.setDuration(target.m9791e().mo7933a());
        ofFloat.setInterpolator(target.m9791e().mo7932b());
        ofFloat.addUpdateListener(this.f25830z);
        ofFloat.addListener(animatorListener);
        ofFloat.addListener(new C9859c(ofFloat));
        C13195u c13195u = C13195u.f34156a;
        this.f25824A = ofFloat;
        ValueAnimator valueAnimator5 = this.f25825B;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllListeners();
        }
        ValueAnimator valueAnimator6 = this.f25825B;
        if (valueAnimator6 != null) {
            valueAnimator6.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator7 = this.f25825B;
        if (valueAnimator7 != null) {
            valueAnimator7.cancel();
        }
        this.f25825B = null;
        ValueAnimator valueAnimator8 = this.f25824A;
        if (valueAnimator8 != null) {
            valueAnimator8.start();
        }
    }

    /* renamed from: d */
    public final void m9800d(long j, TimeInterpolator timeInterpolator, Animator.AnimatorListener animatorListener) {
        Intrinsics.isThisObjectNull(timeInterpolator, "interpolator");
        Intrinsics.isThisObjectNull(animatorListener, "listener");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addListener(animatorListener);
        ofFloat.start();
    }

    /* renamed from: e */
    public final void m9799e(Target target) {
        Intrinsics.isThisObjectNull(target, "target");
        removeAllViews();
        addView(target.m9792d(), -1, -1);
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        PointF pointF = new PointF(iArr[0], iArr[1]);
        target.m9795a().offset(-pointF.x, -pointF.y);
        C13195u c13195u = C13195u.f34156a;
        this.f25826C = target;
        ValueAnimator valueAnimator = this.f25824A;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f25824A;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.f25824A;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(target.m9791e().mo7933a());
        ofFloat.setInterpolator(target.m9791e().mo7932b());
        ofFloat.addUpdateListener(this.f25830z);
        ofFloat.addListener(new C9862f(ofFloat));
        this.f25824A = ofFloat;
        ValueAnimator valueAnimator4 = this.f25825B;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator valueAnimator5 = this.f25825B;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator6 = this.f25825B;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setStartDelay(target.m9791e().mo7933a());
        ofFloat2.setDuration(target.m9794b().mo9058a());
        ofFloat2.setInterpolator(target.m9794b().mo9057b());
        ofFloat2.setRepeatMode(target.m9794b().mo9055d());
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(this.f25830z);
        ofFloat2.addListener(new C9863g(ofFloat2));
        this.f25825B = ofFloat2;
        ValueAnimator valueAnimator7 = this.f25824A;
        if (valueAnimator7 != null) {
            valueAnimator7.start();
        }
        ValueAnimator valueAnimator8 = this.f25825B;
        if (valueAnimator8 != null) {
            valueAnimator8.start();
        }
    }

    protected void onDraw(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), getBackgroundPaint());
        Target target = this.f25826C;
        ValueAnimator valueAnimator = this.f25824A;
        ValueAnimator valueAnimator2 = this.f25825B;
        if (target != null && valueAnimator2 != null && valueAnimator != null && !valueAnimator.isRunning()) {
            InterfaceC10145a m9794b = target.m9794b();
            PointF m9795a = target.m9795a();
            Object animatedValue = valueAnimator2.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            m9794b.mo9056c(canvas, m9795a, ((Float) animatedValue).floatValue(), getEffectPaint());
        }
        if (target == null || valueAnimator == null) {
            return;
        }
        InterfaceC10475c m9791e = target.m9791e();
        PointF m9795a2 = target.m9795a();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        m9791e.mo7931c(canvas, m9795a2, ((Float) animatedValue2).floatValue(), getShapePaint());
    }
}
