package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.util.C1076h;
import androidx.core.view.C1112b0;
import com.google.android.material.internal.C3635i;
import java.util.ArrayList;
import java.util.Iterator;
import p100f8.C5419b;
import p100f8.C5424g;
import p120g8.C5616a;
import p120g8.C5617b;
import p120g8.C5621f;
import p120g8.C5622g;
import p120g8.C5623h;
import p310q8.C9698a;
import p366t8.C10396a;
import p366t8.C10399b;
import p381u8.InterfaceC10851b;
import p401v8.C11141g;
import p401v8.C11145h;
import p401v8.C11148k;
import p401v8.InterfaceC11164n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.d */
/* loaded from: classes.dex */
public class C3601d {

    /* renamed from: D */
    static final TimeInterpolator f10022D = C5616a.f15855c;

    /* renamed from: E */
    static final int[] f10023E = {16842919, 16842910};

    /* renamed from: F */
    static final int[] f10024F = {16843623, 16842908, 16842910};

    /* renamed from: G */
    static final int[] f10025G = {16842908, 16842910};

    /* renamed from: H */
    static final int[] f10026H = {16843623, 16842910};

    /* renamed from: I */
    static final int[] f10027I = {16842910};

    /* renamed from: J */
    static final int[] f10028J = new int[0];

    /* renamed from: C */
    private ViewTreeObserver.OnPreDrawListener f10031C;

    /* renamed from: a */
    C11148k f10032a;

    /* renamed from: b */
    C11141g f10033b;

    /* renamed from: c */
    Drawable f10034c;

    /* renamed from: d */
    C3598c f10035d;

    /* renamed from: e */
    Drawable f10036e;

    /* renamed from: f */
    boolean f10037f;

    /* renamed from: h */
    float f10039h;

    /* renamed from: i */
    float f10040i;

    /* renamed from: j */
    float f10041j;

    /* renamed from: k */
    int f10042k;

    /* renamed from: l */
    private final C3635i f10043l;

    /* renamed from: m */
    private Animator f10044m;

    /* renamed from: n */
    private C5623h f10045n;

    /* renamed from: o */
    private C5623h f10046o;

    /* renamed from: p */
    private float f10047p;

    /* renamed from: r */
    private int f10049r;

    /* renamed from: t */
    private ArrayList<Animator.AnimatorListener> f10051t;

    /* renamed from: u */
    private ArrayList<Animator.AnimatorListener> f10052u;

    /* renamed from: v */
    private ArrayList<InterfaceC3611j> f10053v;

    /* renamed from: w */
    final FloatingActionButton f10054w;

    /* renamed from: x */
    final InterfaceC10851b f10055x;

    /* renamed from: g */
    boolean f10038g = true;

    /* renamed from: q */
    private float f10048q = 1.0f;

    /* renamed from: s */
    private int f10050s = 0;

    /* renamed from: y */
    private final Rect f10056y = new Rect();

    /* renamed from: z */
    private final RectF f10057z = new RectF();

    /* renamed from: A */
    private final RectF f10029A = new RectF();

    /* renamed from: B */
    private final Matrix f10030B = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    /* loaded from: classes.dex */
    public class C3602a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f10058a;

        /* renamed from: b */
        final /* synthetic */ boolean f10059b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3612k f10060c;

        C3602a(boolean z, InterfaceC3612k interfaceC3612k) {
            this.f10059b = z;
            this.f10060c = interfaceC3612k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10058a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3601d.this.f10050s = 0;
            C3601d.this.f10044m = null;
            if (this.f10058a) {
                return;
            }
            FloatingActionButton floatingActionButton = C3601d.this.f10054w;
            boolean z = this.f10059b;
            floatingActionButton.m29482b(z ? 8 : 4, z);
            InterfaceC3612k interfaceC3612k = this.f10060c;
            if (interfaceC3612k != null) {
                interfaceC3612k.mo29694b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C3601d.this.f10054w.m29482b(0, this.f10059b);
            C3601d.this.f10050s = 1;
            C3601d.this.f10044m = animator;
            this.f10058a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    /* loaded from: classes.dex */
    public class C3603b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f10062a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3612k f10063b;

        C3603b(boolean z, InterfaceC3612k interfaceC3612k) {
            this.f10062a = z;
            this.f10063b = interfaceC3612k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3601d.this.f10050s = 0;
            C3601d.this.f10044m = null;
            InterfaceC3612k interfaceC3612k = this.f10063b;
            if (interfaceC3612k != null) {
                interfaceC3612k.mo29695a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C3601d.this.f10054w.m29482b(0, this.f10062a);
            C3601d.this.f10050s = 2;
            C3601d.this.f10044m = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    /* loaded from: classes.dex */
    public class C3604c extends C5622g {
        C3604c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C3601d.this.f10048q = f;
            return super.mo23553a(f, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    /* loaded from: classes.dex */
    public class C3605d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f10066a;

        /* renamed from: b */
        final /* synthetic */ float f10067b;

        /* renamed from: c */
        final /* synthetic */ float f10068c;

        /* renamed from: d */
        final /* synthetic */ float f10069d;

        /* renamed from: e */
        final /* synthetic */ float f10070e;

        /* renamed from: f */
        final /* synthetic */ float f10071f;

        /* renamed from: g */
        final /* synthetic */ float f10072g;

        /* renamed from: h */
        final /* synthetic */ Matrix f10073h;

        C3605d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f10066a = f;
            this.f10067b = f2;
            this.f10068c = f3;
            this.f10069d = f4;
            this.f10070e = f5;
            this.f10071f = f6;
            this.f10072g = f7;
            this.f10073h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3601d.this.f10054w.setAlpha(C5616a.m23564b(this.f10066a, this.f10067b, 0.0f, 0.2f, floatValue));
            C3601d.this.f10054w.setScaleX(C5616a.m23565a(this.f10068c, this.f10069d, floatValue));
            C3601d.this.f10054w.setScaleY(C5616a.m23565a(this.f10070e, this.f10069d, floatValue));
            C3601d.this.f10048q = C5616a.m23565a(this.f10071f, this.f10072g, floatValue);
            C3601d.this.m29714h(C5616a.m23565a(this.f10071f, this.f10072g, floatValue), this.f10073h);
            C3601d.this.f10054w.setImageMatrix(this.f10073h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    /* loaded from: classes.dex */
    public class C3606e implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f10075a = new FloatEvaluator();

        C3606e(C3601d c3601d) {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f10075a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC3607f implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC3607f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C3601d.this.m29743H();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    /* loaded from: classes.dex */
    private class C3608g extends AbstractC3614m {
        C3608g(C3601d c3601d) {
            super(c3601d, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C3601d.AbstractC3614m
        /* renamed from: a */
        protected float mo29693a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    /* loaded from: classes.dex */
    private class C3609h extends AbstractC3614m {
        C3609h() {
            super(C3601d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C3601d.AbstractC3614m
        /* renamed from: a */
        protected float mo29693a() {
            C3601d c3601d = C3601d.this;
            return c3601d.f10039h + c3601d.f10040i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    /* loaded from: classes.dex */
    private class C3610i extends AbstractC3614m {
        C3610i() {
            super(C3601d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C3601d.AbstractC3614m
        /* renamed from: a */
        protected float mo29693a() {
            C3601d c3601d = C3601d.this;
            return c3601d.f10039h + c3601d.f10041j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$j */
    /* loaded from: classes.dex */
    public interface InterfaceC3611j {
        /* renamed from: a */
        void mo29697a();

        /* renamed from: b */
        void mo29696b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$k */
    /* loaded from: classes.dex */
    public interface InterfaceC3612k {
        /* renamed from: a */
        void mo29695a();

        /* renamed from: b */
        void mo29694b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$l */
    /* loaded from: classes.dex */
    private class C3613l extends AbstractC3614m {
        C3613l() {
            super(C3601d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C3601d.AbstractC3614m
        /* renamed from: a */
        protected float mo29693a() {
            return C3601d.this.f10039h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$m */
    /* loaded from: classes.dex */
    private abstract class AbstractC3614m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f10080a;

        /* renamed from: b */
        private float f10081b;

        /* renamed from: c */
        private float f10082c;

        private AbstractC3614m() {
        }

        /* renamed from: a */
        protected abstract float mo29693a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3601d.this.m29715g0((int) this.f10082c);
            this.f10080a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f10080a) {
                C11141g c11141g = C3601d.this.f10033b;
                this.f10081b = c11141g == null ? 0.0f : c11141g.m5969w();
                this.f10082c = mo29693a();
                this.f10080a = true;
            }
            C3601d c3601d = C3601d.this;
            float f = this.f10081b;
            c3601d.m29715g0((int) (f + ((this.f10082c - f) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ AbstractC3614m(C3601d c3601d, C3602a c3602a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3601d(FloatingActionButton floatingActionButton, InterfaceC10851b interfaceC10851b) {
        this.f10054w = floatingActionButton;
        this.f10055x = interfaceC10851b;
        C3635i c3635i = new C3635i();
        this.f10043l = c3635i;
        c3635i.m29537a(f10023E, m29710k(new C3610i()));
        c3635i.m29537a(f10024F, m29710k(new C3609h()));
        c3635i.m29537a(f10025G, m29710k(new C3609h()));
        c3635i.m29537a(f10026H, m29710k(new C3609h()));
        c3635i.m29537a(f10027I, m29710k(new C3613l()));
        c3635i.m29537a(f10028J, m29710k(new C3608g(this)));
        this.f10047p = floatingActionButton.getRotation();
    }

    /* renamed from: a0 */
    private boolean m29726a0() {
        return C1112b0.m38446W(this.f10054w) && !this.f10054w.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m29714h(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f10054w.getDrawable();
        if (drawable == null || this.f10049r == 0) {
            return;
        }
        RectF rectF = this.f10057z;
        RectF rectF2 = this.f10029A;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f10049r;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f10049r;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    /* renamed from: h0 */
    private void m29713h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C3606e(this));
    }

    /* renamed from: i */
    private AnimatorSet m29712i(C5623h c5623h, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10054w, View.ALPHA, f);
        c5623h.m23545h("opacity").m23539a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f10054w, View.SCALE_X, f2);
        c5623h.m23545h("scale").m23539a(ofFloat2);
        m29713h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f10054w, View.SCALE_Y, f2);
        c5623h.m23545h("scale").m23539a(ofFloat3);
        m29713h0(ofFloat3);
        arrayList.add(ofFloat3);
        m29714h(f3, this.f10030B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f10054w, new C5621f(), new C3604c(), new Matrix(this.f10030B));
        c5623h.m23545h("iconScale").m23539a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C5617b.m23562a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: j */
    private AnimatorSet m29711j(float f, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C3605d(this.f10054w.getAlpha(), f, this.f10054w.getScaleX(), f2, this.f10054w.getScaleY(), this.f10048q, f3, new Matrix(this.f10030B)));
        arrayList.add(ofFloat);
        C5617b.m23562a(animatorSet, arrayList);
        animatorSet.setDuration(C9698a.m10188d(this.f10054w.getContext(), C5419b.motionDurationLong1, this.f10054w.getContext().getResources().getInteger(C5424g.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C9698a.m10187e(this.f10054w.getContext(), C5419b.motionEasingStandard, C5616a.f15854b));
        return animatorSet;
    }

    /* renamed from: k */
    private ValueAnimator m29710k(AbstractC3614m abstractC3614m) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f10022D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC3614m);
        valueAnimator.addUpdateListener(abstractC3614m);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: r */
    private ViewTreeObserver.OnPreDrawListener m29705r() {
        if (this.f10031C == null) {
            this.f10031C = new ViewTreeObserver$OnPreDrawListenerC3607f();
        }
        return this.f10031C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo29692A() {
        this.f10043l.m29535c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m29746B() {
        C11141g c11141g = this.f10033b;
        if (c11141g != null) {
            C11145h.m5960f(this.f10054w, c11141g);
        }
        if (mo29688K()) {
            this.f10054w.getViewTreeObserver().addOnPreDrawListener(m29705r());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo29691C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m29745D() {
        ViewTreeObserver viewTreeObserver = this.f10054w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f10031C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f10031C = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo29690E(int[] iArr) {
        this.f10043l.m29534d(iArr);
    }

    /* renamed from: F */
    void mo29689F(float f, float f2, float f3) {
        m29717f0();
        m29715g0(f);
    }

    /* renamed from: G */
    void m29744G(Rect rect) {
        C1076h.m38618g(this.f10036e, "Didn't initialize content background");
        if (mo29686Z()) {
            this.f10055x.mo6879b(new InsetDrawable(this.f10036e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f10055x.mo6879b(this.f10036e);
    }

    /* renamed from: H */
    void m29743H() {
        float rotation = this.f10054w.getRotation();
        if (this.f10047p != rotation) {
            this.f10047p = rotation;
            mo29685d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m29742I() {
        ArrayList<InterfaceC3611j> arrayList = this.f10053v;
        if (arrayList != null) {
            Iterator<InterfaceC3611j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo29696b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m29741J() {
        ArrayList<InterfaceC3611j> arrayList = this.f10053v;
        if (arrayList != null) {
            Iterator<InterfaceC3611j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo29697a();
            }
        }
    }

    /* renamed from: K */
    boolean mo29688K() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m29740L(ColorStateList colorStateList) {
        C11141g c11141g = this.f10033b;
        if (c11141g != null) {
            c11141g.setTintList(colorStateList);
        }
        C3598c c3598c = this.f10035d;
        if (c3598c != null) {
            c3598c.m29750c(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m29739M(PorterDuff.Mode mode) {
        C11141g c11141g = this.f10033b;
        if (c11141g != null) {
            c11141g.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m29738N(float f) {
        if (this.f10039h != f) {
            this.f10039h = f;
            mo29689F(f, this.f10040i, this.f10041j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m29737O(boolean z) {
        this.f10037f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m29736P(C5623h c5623h) {
        this.f10046o = c5623h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void m29735Q(float f) {
        if (this.f10040i != f) {
            this.f10040i = f;
            mo29689F(this.f10039h, f, this.f10041j);
        }
    }

    /* renamed from: R */
    final void m29734R(float f) {
        this.f10048q = f;
        Matrix matrix = this.f10030B;
        m29714h(f, matrix);
        this.f10054w.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public final void m29733S(int i) {
        if (this.f10049r != i) {
            this.f10049r = i;
            m29719e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m29732T(int i) {
        this.f10042k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final void m29731U(float f) {
        if (this.f10041j != f) {
            this.f10041j = f;
            mo29689F(this.f10039h, this.f10040i, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo29687V(ColorStateList colorStateList) {
        Drawable drawable = this.f10034c;
        if (drawable != null) {
            C0981a.m38862o(drawable, C10399b.m8071d(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m29730W(boolean z) {
        this.f10038g = z;
        m29717f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public final void m29729X(C11148k c11148k) {
        this.f10032a = c11148k;
        C11141g c11141g = this.f10033b;
        if (c11141g != null) {
            c11141g.setShapeAppearanceModel(c11148k);
        }
        Drawable drawable = this.f10034c;
        if (drawable instanceof InterfaceC11164n) {
            ((InterfaceC11164n) drawable).setShapeAppearanceModel(c11148k);
        }
        C3598c c3598c = this.f10035d;
        if (c3598c != null) {
            c3598c.m29747f(c11148k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public final void m29728Y(C5623h c5623h) {
        this.f10045n = c5623h;
    }

    /* renamed from: Z */
    boolean mo29686Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean m29724b0() {
        return !this.f10037f || this.f10054w.getSizeDimension() >= this.f10042k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m29722c0(InterfaceC3612k interfaceC3612k, boolean z) {
        AnimatorSet m29711j;
        if (m29699z()) {
            return;
        }
        Animator animator = this.f10044m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.f10045n == null;
        if (m29726a0()) {
            if (this.f10054w.getVisibility() != 0) {
                this.f10054w.setAlpha(0.0f);
                this.f10054w.setScaleY(z2 ? 0.4f : 0.0f);
                this.f10054w.setScaleX(z2 ? 0.4f : 0.0f);
                m29734R(z2 ? 0.4f : 0.0f);
            }
            C5623h c5623h = this.f10045n;
            if (c5623h != null) {
                m29711j = m29712i(c5623h, 1.0f, 1.0f, 1.0f);
            } else {
                m29711j = m29711j(1.0f, 1.0f, 1.0f);
            }
            m29711j.addListener(new C3603b(z, interfaceC3612k));
            ArrayList<Animator.AnimatorListener> arrayList = this.f10051t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m29711j.addListener(it.next());
                }
            }
            m29711j.start();
            return;
        }
        this.f10054w.m29482b(0, z);
        this.f10054w.setAlpha(1.0f);
        this.f10054w.setScaleY(1.0f);
        this.f10054w.setScaleX(1.0f);
        m29734R(1.0f);
        if (interfaceC3612k != null) {
            interfaceC3612k.mo29695a();
        }
    }

    /* renamed from: d0 */
    void mo29685d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f10047p % 90.0f != 0.0f) {
                if (this.f10054w.getLayerType() != 1) {
                    this.f10054w.setLayerType(1, null);
                }
            } else if (this.f10054w.getLayerType() != 0) {
                this.f10054w.setLayerType(0, null);
            }
        }
        C11141g c11141g = this.f10033b;
        if (c11141g != null) {
            c11141g.m5993f0((int) this.f10047p);
        }
    }

    /* renamed from: e */
    public void m29720e(Animator.AnimatorListener animatorListener) {
        if (this.f10052u == null) {
            this.f10052u = new ArrayList<>();
        }
        this.f10052u.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void m29719e0() {
        m29734R(this.f10048q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m29718f(Animator.AnimatorListener animatorListener) {
        if (this.f10051t == null) {
            this.f10051t = new ArrayList<>();
        }
        this.f10051t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final void m29717f0() {
        Rect rect = this.f10056y;
        mo29680s(rect);
        m29744G(rect);
        this.f10055x.mo6880a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m29716g(InterfaceC3611j interfaceC3611j) {
        if (this.f10053v == null) {
            this.f10053v = new ArrayList<>();
        }
        this.f10053v.add(interfaceC3611j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void m29715g0(float f) {
        C11141g c11141g = this.f10033b;
        if (c11141g != null) {
            c11141g.m6005Y(f);
        }
    }

    /* renamed from: l */
    C11141g mo29682l() {
        return new C11141g((C11148k) C1076h.m38619f(this.f10032a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final Drawable m29709m() {
        return this.f10036e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo29681n() {
        return this.f10039h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m29708o() {
        return this.f10037f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final C5623h m29707p() {
        return this.f10046o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public float m29706q() {
        return this.f10040i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo29680s(Rect rect) {
        int sizeDimension = this.f10037f ? (this.f10042k - this.f10054w.getSizeDimension()) / 2 : 0;
        float mo29681n = this.f10038g ? mo29681n() + this.f10041j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(mo29681n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(mo29681n * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public float m29704t() {
        return this.f10041j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final C11148k m29703u() {
        return this.f10032a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final C5623h m29702v() {
        return this.f10045n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m29701w(InterfaceC3612k interfaceC3612k, boolean z) {
        AnimatorSet m29711j;
        if (m29700y()) {
            return;
        }
        Animator animator = this.f10044m;
        if (animator != null) {
            animator.cancel();
        }
        if (m29726a0()) {
            C5623h c5623h = this.f10046o;
            if (c5623h != null) {
                m29711j = m29712i(c5623h, 0.0f, 0.0f, 0.0f);
            } else {
                m29711j = m29711j(0.0f, 0.4f, 0.4f);
            }
            m29711j.addListener(new C3602a(z, interfaceC3612k));
            ArrayList<Animator.AnimatorListener> arrayList = this.f10052u;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m29711j.addListener(it.next());
                }
            }
            m29711j.start();
            return;
        }
        this.f10054w.m29482b(z ? 8 : 4, z);
        if (interfaceC3612k != null) {
            interfaceC3612k.mo29694b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo29679x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C11141g mo29682l = mo29682l();
        this.f10033b = mo29682l;
        mo29682l.setTintList(colorStateList);
        if (mode != null) {
            this.f10033b.setTintMode(mode);
        }
        this.f10033b.m5995e0(-12303292);
        this.f10033b.m6015O(this.f10054w.getContext());
        C10396a c10396a = new C10396a(this.f10033b.m6025E());
        c10396a.setTintList(C10399b.m8071d(colorStateList2));
        this.f10034c = c10396a;
        this.f10036e = new LayerDrawable(new Drawable[]{(Drawable) C1076h.m38619f(this.f10033b), c10396a});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m29700y() {
        return this.f10054w.getVisibility() == 0 ? this.f10050s == 1 : this.f10050s != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m29699z() {
        return this.f10054w.getVisibility() != 0 ? this.f10050s == 2 : this.f10050s != 1;
    }
}
