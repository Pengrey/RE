package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1112b0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p100f8.C5423f;
import p120g8.C5616a;
import p120g8.C5617b;
import p120g8.C5618c;
import p120g8.C5619d;
import p120g8.C5620e;
import p120g8.C5623h;
import p120g8.C5624i;
import p120g8.C5625j;
import p156i8.C6046a;
import p156i8.C6049c;
import p156i8.InterfaceC6050d;
import p293p8.C8449a;
import p441x8.C12324a;
import p441x8.C12325b;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f10852c;

    /* renamed from: d */
    private final RectF f10853d;

    /* renamed from: e */
    private final RectF f10854e;

    /* renamed from: f */
    private final int[] f10855f;

    /* renamed from: g */
    private float f10856g;

    /* renamed from: h */
    private float f10857h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C3813a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f10858a;

        /* renamed from: b */
        final /* synthetic */ View f10859b;

        /* renamed from: c */
        final /* synthetic */ View f10860c;

        C3813a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f10858a = z;
            this.f10859b = view;
            this.f10860c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10858a) {
                return;
            }
            this.f10859b.setVisibility(4);
            this.f10860c.setAlpha(1.0f);
            this.f10860c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10858a) {
                this.f10859b.setVisibility(0);
                this.f10860c.setAlpha(0.0f);
                this.f10860c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes.dex */
    public class C3814b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10861a;

        C3814b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f10861a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10861a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes.dex */
    public class C3815c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6050d f10862a;

        /* renamed from: b */
        final /* synthetic */ Drawable f10863b;

        C3815c(FabTransformationBehavior fabTransformationBehavior, InterfaceC6050d interfaceC6050d, Drawable drawable) {
            this.f10862a = interfaceC6050d;
            this.f10863b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10862a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f10862a.setCircularRevealOverlayDrawable(this.f10863b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes.dex */
    public class C3816d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6050d f10864a;

        C3816d(FabTransformationBehavior fabTransformationBehavior, InterfaceC6050d interfaceC6050d) {
            this.f10864a = interfaceC6050d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC6050d.C6055e revealInfo = this.f10864a.getRevealInfo();
            revealInfo.f16700c = Float.MAX_VALUE;
            this.f10864a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes.dex */
    public static class C3817e {

        /* renamed from: a */
        public C5623h f10865a;

        /* renamed from: b */
        public C5625j f10866b;
    }

    public FabTransformationBehavior() {
        this.f10852c = new Rect();
        this.f10853d = new RectF();
        this.f10854e = new RectF();
        this.f10855f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m28801K(View view) {
        View findViewById = view.findViewById(C5423f.mtrl_child_content_container);
        if (findViewById != null) {
            return m28781f0(findViewById);
        }
        if (!(view instanceof C12325b) && !(view instanceof C12324a)) {
            return m28781f0(view);
        }
        return m28781f0(((ViewGroup) view).getChildAt(0));
    }

    /* renamed from: L */
    private void m28800L(View view, C3817e c3817e, C5624i c5624i, C5624i c5624i2, float f, float f2, float f3, float f4, RectF rectF) {
        float m28793S = m28793S(c3817e, c5624i, f, f3);
        float m28793S2 = m28793S(c3817e, c5624i2, f2, f4);
        Rect rect = this.f10852c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f10853d;
        rectF2.set(rect);
        RectF rectF3 = this.f10854e;
        m28792T(view, rectF3);
        rectF3.offset(m28793S, m28793S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m28799M(View view, RectF rectF) {
        m28792T(view, rectF);
        rectF.offset(this.f10856g, this.f10857h);
    }

    /* renamed from: N */
    private Pair<C5624i, C5624i> m28798N(float f, float f2, boolean z, C3817e c3817e) {
        C5624i m23545h;
        C5624i m23545h2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            m23545h = c3817e.f10865a.m23545h("translationXLinear");
            m23545h2 = c3817e.f10865a.m23545h("translationYLinear");
        } else if ((z && f2 < 0.0f) || (!z && i > 0)) {
            m23545h = c3817e.f10865a.m23545h("translationXCurveUpwards");
            m23545h2 = c3817e.f10865a.m23545h("translationYCurveUpwards");
        } else {
            m23545h = c3817e.f10865a.m23545h("translationXCurveDownwards");
            m23545h2 = c3817e.f10865a.m23545h("translationYCurveDownwards");
        }
        return new Pair<>(m23545h, m23545h2);
    }

    /* renamed from: O */
    private float m28797O(View view, View view2, C5625j c5625j) {
        RectF rectF = this.f10853d;
        RectF rectF2 = this.f10854e;
        m28799M(view, rectF);
        m28792T(view2, rectF2);
        rectF2.offset(-m28795Q(view, view2, c5625j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m28796P(View view, View view2, C5625j c5625j) {
        RectF rectF = this.f10853d;
        RectF rectF2 = this.f10854e;
        m28799M(view, rectF);
        m28792T(view2, rectF2);
        rectF2.offset(0.0f, -m28794R(view, view2, c5625j));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m28795Q(View view, View view2, C5625j c5625j) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.f10853d;
        RectF rectF2 = this.f10854e;
        m28799M(view, rectF);
        m28792T(view2, rectF2);
        int i = c5625j.f15873a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i == 5) {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        } else {
            f = 0.0f;
            return f + c5625j.f15874b;
        }
        f = centerX - centerX2;
        return f + c5625j.f15874b;
    }

    /* renamed from: R */
    private float m28794R(View view, View view2, C5625j c5625j) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.f10853d;
        RectF rectF2 = this.f10854e;
        m28799M(view, rectF);
        m28792T(view2, rectF2);
        int i = c5625j.f15873a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i == 80) {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        } else {
            f = 0.0f;
            return f + c5625j.f15875c;
        }
        f = centerY - centerY2;
        return f + c5625j.f15875c;
    }

    /* renamed from: S */
    private float m28793S(C3817e c3817e, C5624i c5624i, float f, float f2) {
        long m23537c = c5624i.m23537c();
        long m23536d = c5624i.m23536d();
        C5624i m23545h = c3817e.f10865a.m23545h("expansion");
        return C5616a.m23565a(f, f2, c5624i.m23535e().getInterpolation(((float) (((m23545h.m23537c() + m23545h.m23536d()) + 17) - m23537c)) / ((float) m23536d)));
    }

    /* renamed from: T */
    private void m28792T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f10855f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m28791U(View view, View view2, boolean z, boolean z2, C3817e c3817e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m28801K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC6050d) && C6049c.f16693a == 0) || (m28801K = m28801K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C5619d.f15859a.set(m28801K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m28801K, C5619d.f15859a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m28801K, C5619d.f15859a, 0.0f);
            }
            c3817e.f10865a.m23545h("contentFade").m23539a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* renamed from: V */
    private void m28790V(View view, View view2, boolean z, boolean z2, C3817e c3817e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof InterfaceC6050d) {
            InterfaceC6050d interfaceC6050d = (InterfaceC6050d) view2;
            int m28782d0 = m28782d0(view);
            int i = 16777215 & m28782d0;
            if (z) {
                if (!z2) {
                    interfaceC6050d.setCircularRevealScrimColor(m28782d0);
                }
                ofInt = ObjectAnimator.ofInt(interfaceC6050d, InterfaceC6050d.C6054d.f16697a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(interfaceC6050d, InterfaceC6050d.C6054d.f16697a, m28782d0);
            }
            ofInt.setEvaluator(C5618c.m23560b());
            c3817e.f10865a.m23545h("color").m23539a(ofInt);
            list.add(ofInt);
        }
    }

    /* renamed from: W */
    private void m28789W(View view, View view2, boolean z, C3817e c3817e, List<Animator> list) {
        float m28795Q = m28795Q(view, view2, c3817e.f10866b);
        float m28794R = m28794R(view, view2, c3817e.f10866b);
        Pair<C5624i, C5624i> m28798N = m28798N(m28795Q, m28794R, z, c3817e);
        C5624i c5624i = (C5624i) m28798N.first;
        C5624i c5624i2 = (C5624i) m28798N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m28795Q = this.f10856g;
        }
        fArr[0] = m28795Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m28794R = this.f10857h;
        }
        fArr2[0] = m28794R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        c5624i.m23539a(ofFloat);
        c5624i2.m23539a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m28788X(View view, View view2, boolean z, boolean z2, C3817e c3817e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m38394y = C1112b0.m38394y(view2) - C1112b0.m38394y(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m38394y);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m38394y);
        }
        c3817e.f10865a.m23545h("elevation").m23539a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: Y */
    private void m28787Y(View view, View view2, boolean z, boolean z2, C3817e c3817e, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof InterfaceC6050d) {
            InterfaceC6050d interfaceC6050d = (InterfaceC6050d) view2;
            float m28797O = m28797O(view, view2, c3817e.f10866b);
            float m28796P = m28796P(view, view2, c3817e.f10866b);
            ((FloatingActionButton) view).m29784i(this.f10852c);
            float width = this.f10852c.width() / 2.0f;
            C5624i m23545h = c3817e.f10865a.m23545h("expansion");
            if (z) {
                if (!z2) {
                    interfaceC6050d.setRevealInfo(new InterfaceC6050d.C6055e(m28797O, m28796P, width));
                }
                if (z2) {
                    width = interfaceC6050d.getRevealInfo().f16700c;
                }
                animator = C6046a.m22305a(interfaceC6050d, m28797O, m28796P, C8449a.m15389b(m28797O, m28796P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C3816d(this, interfaceC6050d));
                m28784b0(view2, m23545h.m23537c(), (int) m28797O, (int) m28796P, width, list);
            } else {
                float f3 = interfaceC6050d.getRevealInfo().f16700c;
                Animator m22305a = C6046a.m22305a(interfaceC6050d, m28797O, m28796P, width);
                int i = (int) m28797O;
                int i2 = (int) m28796P;
                m28784b0(view2, m23545h.m23537c(), i, i2, f3, list);
                m28785a0(view2, m23545h.m23537c(), m23545h.m23536d(), c3817e.f10865a.m23544i(), i, i2, width, list);
                animator = m22305a;
            }
            m23545h.m23539a(animator);
            list.add(animator);
            list2.add(C6046a.m22304b(interfaceC6050d));
        }
    }

    /* renamed from: Z */
    private void m28786Z(View view, View view2, boolean z, boolean z2, C3817e c3817e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC6050d) && (view instanceof ImageView)) {
            InterfaceC6050d interfaceC6050d = (InterfaceC6050d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, C5620e.f15860b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, C5620e.f15860b, 255);
            }
            ofInt.addUpdateListener(new C3814b(this, view2));
            c3817e.f10865a.m23545h("iconFade").m23539a(ofInt);
            list.add(ofInt);
            list2.add(new C3815c(this, interfaceC6050d, drawable));
        }
    }

    /* renamed from: a0 */
    private void m28785a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m28784b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    /* renamed from: c0 */
    private void m28783c0(View view, View view2, boolean z, boolean z2, C3817e c3817e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m28795Q = m28795Q(view, view2, c3817e.f10866b);
        float m28794R = m28794R(view, view2, c3817e.f10866b);
        Pair<C5624i, C5624i> m28798N = m28798N(m28795Q, m28794R, z, c3817e);
        C5624i c5624i = (C5624i) m28798N.first;
        C5624i c5624i2 = (C5624i) m28798N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m28795Q);
                view2.setTranslationY(-m28794R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m28800L(view2, c3817e, c5624i, c5624i2, -m28795Q, -m28794R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m28795Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -m28794R);
        }
        c5624i.m23539a(ofFloat);
        c5624i2.m23539a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d0 */
    private int m28782d0(View view) {
        ColorStateList m38402u = C1112b0.m38402u(view);
        if (m38402u != null) {
            return m38402u.getColorForState(view.getDrawableState(), m38402u.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m28781f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo28778J(View view, View view2, boolean z, boolean z2) {
        C3817e mo28774e0 = mo28774e0(view2.getContext(), z);
        if (z) {
            this.f10856g = view.getTranslationX();
            this.f10857h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m28788X(view, view2, z, z2, mo28774e0, arrayList, arrayList2);
        }
        RectF rectF = this.f10853d;
        m28783c0(view, view2, z, z2, mo28774e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m28789W(view, view2, z, mo28774e0, arrayList);
        m28786Z(view, view2, z, z2, mo28774e0, arrayList, arrayList2);
        m28787Y(view, view2, z, z2, mo28774e0, width, height, arrayList, arrayList2);
        m28790V(view, view2, z, z2, mo28774e0, arrayList, arrayList2);
        m28791U(view, view2, z, z2, mo28774e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C5617b.m23562a(animatorSet, arrayList);
        animatorSet.addListener(new C3813a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: e */
    public boolean mo28776e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: e0 */
    protected abstract C3817e mo28774e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: g */
    public void mo28780g(CoordinatorLayout.C0876f c0876f) {
        if (c0876f.f3039h == 0) {
            c0876f.f3039h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10852c = new Rect();
        this.f10853d = new RectF();
        this.f10854e = new RectF();
        this.f10855f = new int[2];
    }
}
