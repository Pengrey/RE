package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import androidx.core.view.InterfaceC1211u;
import androidx.core.view.accessibility.C1085c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C3646n;
import com.google.android.material.internal.C3649p;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C3716b;
import java.util.List;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5425h;
import p100f8.C5429l;
import p120g8.C5616a;
import p198k8.C6608a;
import p354s8.C10086c;
import p419w8.C11602a;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: r */
    static final Handler f10409r;

    /* renamed from: s */
    private static final boolean f10410s;

    /* renamed from: t */
    private static final int[] f10411t;

    /* renamed from: u */
    private static final String f10412u;

    /* renamed from: a */
    private final ViewGroup f10413a;

    /* renamed from: b */
    private final Context f10414b;

    /* renamed from: c */
    protected final C3712s f10415c;

    /* renamed from: d */
    private final InterfaceC3715a f10416d;

    /* renamed from: e */
    private int f10417e;

    /* renamed from: f */
    private boolean f10418f;

    /* renamed from: h */
    private int f10420h;

    /* renamed from: i */
    private int f10421i;

    /* renamed from: j */
    private int f10422j;

    /* renamed from: k */
    private int f10423k;

    /* renamed from: l */
    private int f10424l;

    /* renamed from: m */
    private boolean f10425m;

    /* renamed from: n */
    private List<AbstractC3710q<B>> f10426n;

    /* renamed from: o */
    private Behavior f10427o;

    /* renamed from: p */
    private final AccessibilityManager f10428p;

    /* renamed from: g */
    private final Runnable f10419g = new RunnableC3702i();

    /* renamed from: q */
    C3716b.InterfaceC3718b f10429q = new C3705l();

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C3711r f10430k = new C3711r(this);

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P */
        public void m29261P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10430k.m29252c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: E */
        public boolean mo29263E(View view) {
            return this.f10430k.m29254a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: k */
        public boolean mo29260k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f10430k.m29253b(coordinatorLayout, view, motionEvent);
            return super.mo29260k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: classes.dex */
    public class C3694a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f10431a;

        C3694a(int i) {
            this.f10431a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m29302I(this.f10431a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: classes.dex */
    public class C3695b implements ValueAnimator.AnimatorUpdateListener {
        C3695b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f10415c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: classes.dex */
    public class C3696c implements ValueAnimator.AnimatorUpdateListener {
        C3696c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f10415c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f10415c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    /* loaded from: classes.dex */
    public class C3697d extends AnimatorListenerAdapter {
        C3697d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m29301J();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f10416d.mo29231a(70, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: classes.dex */
    public class C3698e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f10436a;

        /* renamed from: b */
        final /* synthetic */ int f10437b;

        C3698e(int i) {
            this.f10437b = i;
            this.f10436a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f10410s) {
                C1112b0.m38435d0(BaseTransientBottomBar.this.f10415c, intValue - this.f10436a);
            } else {
                BaseTransientBottomBar.this.f10415c.setTranslationY(intValue);
            }
            this.f10436a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    /* loaded from: classes.dex */
    public class C3699f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f10439a;

        C3699f(int i) {
            this.f10439a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m29302I(this.f10439a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f10416d.mo29230b(0, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    /* loaded from: classes.dex */
    public class C3700g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f10441a = 0;

        C3700g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f10410s) {
                C1112b0.m38435d0(BaseTransientBottomBar.this.f10415c, intValue - this.f10441a);
            } else {
                BaseTransientBottomBar.this.f10415c.setTranslationY(intValue);
            }
            this.f10441a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    /* loaded from: classes.dex */
    class C3701h implements Handler.Callback {
        C3701h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).m29294R();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).m29308C(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    /* loaded from: classes.dex */
    class RunnableC3702i implements Runnable {
        RunnableC3702i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int m29266x;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f10415c == null || baseTransientBottomBar.f10414b == null || (m29266x = (BaseTransientBottomBar.this.m29266x() - BaseTransientBottomBar.this.m29310A()) + ((int) BaseTransientBottomBar.this.f10415c.getTranslationY())) >= BaseTransientBottomBar.this.f10423k) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f10415c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f10412u, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f10423k - m29266x;
            BaseTransientBottomBar.this.f10415c.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    /* loaded from: classes.dex */
    class C3703j implements InterfaceC1211u {
        C3703j() {
        }

        @Override // androidx.core.view.InterfaceC1211u
        /* renamed from: a */
        public C1183m0 mo29259a(View view, C1183m0 c1183m0) {
            BaseTransientBottomBar.this.f10420h = c1183m0.m38106h();
            BaseTransientBottomBar.this.f10421i = c1183m0.m38105i();
            BaseTransientBottomBar.this.f10422j = c1183m0.m38104j();
            BaseTransientBottomBar.this.m29288X();
            return c1183m0;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    /* loaded from: classes.dex */
    class C3704k extends C1078a {
        C3704k() {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            c1085c.m38563a(1048576);
            c1085c.m38550g0(true);
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: j */
        public boolean mo28844j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.mo29236q();
                return true;
            }
            return super.mo28844j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    /* loaded from: classes.dex */
    class C3705l implements C3716b.InterfaceC3718b {
        C3705l() {
        }

        @Override // com.google.android.material.snackbar.C3716b.InterfaceC3718b
        /* renamed from: a */
        public void mo29215a() {
            Handler handler = BaseTransientBottomBar.f10409r;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C3716b.InterfaceC3718b
        /* renamed from: b */
        public void mo29214b(int i) {
            Handler handler = BaseTransientBottomBar.f10409r;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    /* loaded from: classes.dex */
    public class RunnableC3706m implements Runnable {
        RunnableC3706m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m29302I(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    /* loaded from: classes.dex */
    public class C3707n implements SwipeDismissBehavior.InterfaceC3475c {
        C3707n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC3475c
        /* renamed from: a */
        public void mo29258a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.m29271r(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC3475c
        /* renamed from: b */
        public void mo29257b(int i) {
            if (i == 0) {
                C3716b.m29227c().m29219k(BaseTransientBottomBar.this.f10429q);
            } else if (i == 1 || i == 2) {
                C3716b.m29227c().m29220j(BaseTransientBottomBar.this.f10429q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    /* loaded from: classes.dex */
    public class RunnableC3708o implements Runnable {
        RunnableC3708o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3712s c3712s = BaseTransientBottomBar.this.f10415c;
            if (c3712s == null) {
                return;
            }
            if (c3712s.getParent() != null) {
                BaseTransientBottomBar.this.f10415c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f10415c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m29292T();
            } else {
                BaseTransientBottomBar.this.m29290V();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    /* loaded from: classes.dex */
    public class C3709p extends AnimatorListenerAdapter {
        C3709p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m29301J();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3710q<B> {
        /* renamed from: a */
        public void m29256a(B b, int i) {
        }

        /* renamed from: b */
        public void m29255b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    /* loaded from: classes.dex */
    public static class C3711r {

        /* renamed from: a */
        private C3716b.InterfaceC3718b f10451a;

        public C3711r(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m30486L(0.1f);
            swipeDismissBehavior.m30488J(0.6f);
            swipeDismissBehavior.m30485M(0);
        }

        /* renamed from: a */
        public boolean m29254a(View view) {
            return view instanceof C3712s;
        }

        /* renamed from: b */
        public void m29253b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.m39361B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C3716b.m29227c().m29220j(this.f10451a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C3716b.m29227c().m29219k(this.f10451a);
            }
        }

        /* renamed from: c */
        public void m29252c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10451a = baseTransientBottomBar.f10429q;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    /* loaded from: classes.dex */
    public static class C3712s extends FrameLayout {

        /* renamed from: G */
        private static final View.OnTouchListener f10452G = new View$OnTouchListenerC3713a();

        /* renamed from: A */
        private final int f10453A;

        /* renamed from: B */
        private final int f10454B;

        /* renamed from: C */
        private ColorStateList f10455C;

        /* renamed from: D */
        private PorterDuff.Mode f10456D;

        /* renamed from: E */
        private Rect f10457E;

        /* renamed from: F */
        private boolean f10458F;

        /* renamed from: w */
        private BaseTransientBottomBar<?> f10459w;

        /* renamed from: x */
        private int f10460x;

        /* renamed from: y */
        private final float f10461y;

        /* renamed from: z */
        private final float f10462z;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s$a */
        /* loaded from: classes.dex */
        class View$OnTouchListenerC3713a implements View.OnTouchListener {
            View$OnTouchListenerC3713a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public C3712s(Context context, AttributeSet attributeSet) {
            super(C11602a.m4640c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C5429l.f15024Q4);
            int i = C5429l.f15080X4;
            if (obtainStyledAttributes.hasValue(i)) {
                C1112b0.m38391z0(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f10460x = obtainStyledAttributes.getInt(C5429l.f15048T4, 0);
            this.f10461y = obtainStyledAttributes.getFloat(C5429l.f15056U4, 1.0f);
            setBackgroundTintList(C10086c.m9229a(context2, obtainStyledAttributes, C5429l.f15064V4));
            setBackgroundTintMode(C3649p.m29487f(obtainStyledAttributes.getInt(C5429l.f15072W4, -1), PorterDuff.Mode.SRC_IN));
            this.f10462z = obtainStyledAttributes.getFloat(C5429l.f15040S4, 1.0f);
            this.f10453A = obtainStyledAttributes.getDimensionPixelSize(C5429l.f15032R4, -1);
            this.f10454B = obtainStyledAttributes.getDimensionPixelSize(C5429l.f15088Y4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f10452G);
            setFocusable(true);
            if (getBackground() == null) {
                C1112b0.m38399v0(this, m29248d());
            }
        }

        /* renamed from: d */
        private Drawable m29248d() {
            float dimension = getResources().getDimension(C5421d.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C6608a.m20499i(this, C5419b.colorSurface, C5419b.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f10455C != null) {
                Drawable m38859r = C0981a.m38859r(gradientDrawable);
                C0981a.m38862o(m38859r, this.f10455C);
                return m38859r;
            }
            return C0981a.m38859r(gradientDrawable);
        }

        /* renamed from: e */
        private void m29247e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f10457E = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10459w = baseTransientBottomBar;
        }

        /* renamed from: c */
        void m29249c(ViewGroup viewGroup) {
            this.f10458F = true;
            viewGroup.addView(this);
            this.f10458F = false;
        }

        float getActionTextColorAlpha() {
            return this.f10462z;
        }

        int getAnimationMode() {
            return this.f10460x;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f10461y;
        }

        int getMaxInlineActionWidth() {
            return this.f10454B;
        }

        int getMaxWidth() {
            return this.f10453A;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10459w;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m29305F();
            }
            C1112b0.m38411p0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10459w;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m29304G();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10459w;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m29303H();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f10453A > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f10453A;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        void setAnimationMode(int i) {
            this.f10460x = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f10455C != null) {
                drawable = C0981a.m38859r(drawable.mutate());
                C0981a.m38862o(drawable, this.f10455C);
                C0981a.m38861p(drawable, this.f10456D);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f10455C = colorStateList;
            if (getBackground() != null) {
                Drawable m38859r = C0981a.m38859r(getBackground().mutate());
                C0981a.m38862o(m38859r, colorStateList);
                C0981a.m38861p(m38859r, this.f10456D);
                if (m38859r != getBackground()) {
                    super.setBackgroundDrawable(m38859r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f10456D = mode;
            if (getBackground() != null) {
                Drawable m38859r = C0981a.m38859r(getBackground().mutate());
                C0981a.m38861p(m38859r, mode);
                if (m38859r != getBackground()) {
                    super.setBackgroundDrawable(m38859r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f10458F || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            m29247e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10459w;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m29288X();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f10452G);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f10410s = i >= 16 && i <= 19;
        f10411t = new int[]{C5419b.snackbarStyle};
        f10412u = BaseTransientBottomBar.class.getSimpleName();
        f10409r = new Handler(Looper.getMainLooper(), new C3701h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, InterfaceC3715a interfaceC3715a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC3715a != null) {
            this.f10413a = viewGroup;
            this.f10416d = interfaceC3715a;
            this.f10414b = context;
            C3646n.m29507a(context);
            C3712s c3712s = (C3712s) LayoutInflater.from(context).inflate(m29265y(), viewGroup, false);
            this.f10415c = c3712s;
            c3712s.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.m29234c(c3712s.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(c3712s.getMaxInlineActionWidth());
            }
            c3712s.addView(view);
            C1112b0.m38401u0(c3712s, 1);
            C1112b0.m38479C0(c3712s, 1);
            C1112b0.m38483A0(c3712s, true);
            C1112b0.m38475E0(c3712s, new C3703j());
            C1112b0.m38405s0(c3712s, new C3704k());
            this.f10428p = (AccessibilityManager) context.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public int m29310A() {
        int[] iArr = new int[2];
        this.f10415c.getLocationOnScreen(iArr);
        return iArr[1] + this.f10415c.getHeight();
    }

    /* renamed from: E */
    private boolean m29306E() {
        ViewGroup.LayoutParams layoutParams = this.f10415c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0876f) && (((CoordinatorLayout.C0876f) layoutParams).m39298f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: K */
    private void m29300K() {
        this.f10424l = m29272p();
        m29288X();
    }

    /* renamed from: N */
    private void m29297N(CoordinatorLayout.C0876f c0876f) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f10427o;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = m29268v();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m29261P(this);
        }
        swipeDismissBehavior.m30487K(new C3707n());
        c0876f.m39289o(swipeDismissBehavior);
        if (m29269t() == null) {
            c0876f.f3038g = 80;
        }
    }

    /* renamed from: P */
    private boolean m29295P() {
        return this.f10423k > 0 && !this.f10418f && m29306E();
    }

    /* renamed from: S */
    private void m29293S() {
        if (m29296O()) {
            m29274n();
            return;
        }
        if (this.f10415c.getParent() != null) {
            this.f10415c.setVisibility(0);
        }
        m29301J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m29292T() {
        ValueAnimator m29270s = m29270s(0.0f, 1.0f);
        ValueAnimator m29267w = m29267w(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m29270s, m29267w);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C3709p());
        animatorSet.start();
    }

    /* renamed from: U */
    private void m29291U(int i) {
        ValueAnimator m29270s = m29270s(1.0f, 0.0f);
        m29270s.setDuration(75L);
        m29270s.addListener(new C3694a(i));
        m29270s.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m29290V() {
        int m29264z = m29264z();
        if (f10410s) {
            C1112b0.m38435d0(this.f10415c, m29264z);
        } else {
            this.f10415c.setTranslationY(m29264z);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m29264z, 0);
        valueAnimator.setInterpolator(C5616a.f15854b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C3697d());
        valueAnimator.addUpdateListener(new C3698e(m29264z));
        valueAnimator.start();
    }

    /* renamed from: W */
    private void m29289W(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m29264z());
        valueAnimator.setInterpolator(C5616a.f15854b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C3699f(i));
        valueAnimator.addUpdateListener(new C3700g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m29288X() {
        ViewGroup.LayoutParams layoutParams = this.f10415c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f10415c.f10457E != null) {
            if (this.f10415c.getParent() == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f10415c.f10457E.bottom + (m29269t() != null ? this.f10424l : this.f10420h);
            marginLayoutParams.leftMargin = this.f10415c.f10457E.left + this.f10421i;
            marginLayoutParams.rightMargin = this.f10415c.f10457E.right + this.f10422j;
            marginLayoutParams.topMargin = this.f10415c.f10457E.top;
            this.f10415c.requestLayout();
            if (Build.VERSION.SDK_INT < 29 || !m29295P()) {
                return;
            }
            this.f10415c.removeCallbacks(this.f10419g);
            this.f10415c.post(this.f10419g);
            return;
        }
        Log.w(f10412u, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    /* renamed from: o */
    private void m29273o(int i) {
        if (this.f10415c.getAnimationMode() == 1) {
            m29291U(i);
        } else {
            m29289W(i);
        }
    }

    /* renamed from: p */
    private int m29272p() {
        if (m29269t() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        m29269t().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f10413a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f10413a.getHeight()) - i;
    }

    /* renamed from: s */
    private ValueAnimator m29270s(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5616a.f15853a);
        ofFloat.addUpdateListener(new C3695b());
        return ofFloat;
    }

    /* renamed from: w */
    private ValueAnimator m29267w(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5616a.f15856d);
        ofFloat.addUpdateListener(new C3696c());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public int m29266x() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f10414b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: z */
    private int m29264z() {
        int height = this.f10415c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f10415c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* renamed from: B */
    protected boolean m29309B() {
        TypedArray obtainStyledAttributes = this.f10414b.obtainStyledAttributes(f10411t);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: C */
    final void m29308C(int i) {
        if (m29296O() && this.f10415c.getVisibility() == 0) {
            m29273o(i);
        } else {
            m29302I(i);
        }
    }

    /* renamed from: D */
    public boolean m29307D() {
        return C3716b.m29227c().m29225e(this.f10429q);
    }

    /* renamed from: F */
    void m29305F() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f10415c.getRootWindowInsets()) == null) {
            return;
        }
        this.f10423k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        m29288X();
    }

    /* renamed from: G */
    void m29304G() {
        if (m29307D()) {
            f10409r.post(new RunnableC3706m());
        }
    }

    /* renamed from: H */
    void m29303H() {
        if (this.f10425m) {
            m29293S();
            this.f10425m = false;
        }
    }

    /* renamed from: I */
    void m29302I(int i) {
        C3716b.m29227c().m29222h(this.f10429q);
        List<AbstractC3710q<B>> list = this.f10426n;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f10426n.get(size).m29256a(this, i);
            }
        }
        ViewParent parent = this.f10415c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f10415c);
        }
    }

    /* renamed from: J */
    void m29301J() {
        C3716b.m29227c().m29221i(this.f10429q);
        List<AbstractC3710q<B>> list = this.f10426n;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f10426n.get(size).m29255b(this);
            }
        }
    }

    /* renamed from: L */
    public B m29299L(int i) {
        this.f10415c.setAnimationMode(i);
        return this;
    }

    /* renamed from: M */
    public B m29298M(int i) {
        this.f10417e = i;
        return this;
    }

    /* renamed from: O */
    boolean m29296O() {
        AccessibilityManager accessibilityManager = this.f10428p;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: Q */
    public void mo29246Q() {
        C3716b.m29227c().m29217m(mo29235u(), this.f10429q);
    }

    /* renamed from: R */
    final void m29294R() {
        if (this.f10415c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f10415c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0876f) {
                m29297N((CoordinatorLayout.C0876f) layoutParams);
            }
            this.f10415c.m29249c(this.f10413a);
            m29300K();
            this.f10415c.setVisibility(4);
        }
        if (C1112b0.m38446W(this.f10415c)) {
            m29293S();
        } else {
            this.f10425m = true;
        }
    }

    /* renamed from: n */
    void m29274n() {
        this.f10415c.post(new RunnableC3708o());
    }

    /* renamed from: q */
    public void mo29236q() {
        m29271r(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m29271r(int i) {
        C3716b.m29227c().m29228b(this.f10429q, i);
    }

    /* renamed from: t */
    public View m29269t() {
        return null;
    }

    /* renamed from: u */
    public int mo29235u() {
        return this.f10417e;
    }

    /* renamed from: v */
    protected SwipeDismissBehavior<? extends View> m29268v() {
        return new Behavior();
    }

    /* renamed from: y */
    protected int m29265y() {
        return m29309B() ? C5425h.mtrl_layout_snackbar : C5425h.design_layout_snackbar;
    }
}
