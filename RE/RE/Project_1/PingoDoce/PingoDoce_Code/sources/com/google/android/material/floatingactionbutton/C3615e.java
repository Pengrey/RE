package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.core.util.C1076h;
import java.util.ArrayList;
import p100f8.C5420c;
import p366t8.C10399b;
import p381u8.InterfaceC10851b;
import p401v8.C11141g;
import p401v8.C11148k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.e */
/* loaded from: classes.dex */
public class C3615e extends C3601d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* renamed from: com.google.android.material.floatingactionbutton.e$a */
    /* loaded from: classes.dex */
    public static class C3616a extends C11141g {
        C3616a(C11148k c11148k) {
            super(c11148k);
        }

        @Override // p401v8.C11141g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3615e(FloatingActionButton floatingActionButton, InterfaceC10851b interfaceC10851b) {
        super(floatingActionButton, interfaceC10851b);
    }

    /* renamed from: j0 */
    private Animator m29683j0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f10054w, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f10054w, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C3601d.f10022D);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: A */
    public void mo29692A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: C */
    public void mo29691C() {
        m29717f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: E */
    public void mo29690E(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f10054w.isEnabled()) {
                this.f10054w.setElevation(this.f10039h);
                if (this.f10054w.isPressed()) {
                    this.f10054w.setTranslationZ(this.f10041j);
                    return;
                } else if (!this.f10054w.isFocused() && !this.f10054w.isHovered()) {
                    this.f10054w.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f10054w.setTranslationZ(this.f10040i);
                    return;
                }
            }
            this.f10054w.setElevation(0.0f);
            this.f10054w.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: F */
    void mo29689F(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f10054w.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C3601d.f10023E, m29683j0(f, f3));
            stateListAnimator.addState(C3601d.f10024F, m29683j0(f, f2));
            stateListAnimator.addState(C3601d.f10025G, m29683j0(f, f2));
            stateListAnimator.addState(C3601d.f10026H, m29683j0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f10054w, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f10054w;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f10054w, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C3601d.f10022D);
            stateListAnimator.addState(C3601d.f10027I, animatorSet);
            stateListAnimator.addState(C3601d.f10028J, m29683j0(0.0f, 0.0f));
            this.f10054w.setStateListAnimator(stateListAnimator);
        }
        if (mo29686Z()) {
            m29717f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: K */
    boolean mo29688K() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: V */
    public void mo29687V(ColorStateList colorStateList) {
        Drawable drawable = this.f10034c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C10399b.m8071d(colorStateList));
        } else {
            super.mo29687V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: Z */
    boolean mo29686Z() {
        return this.f10055x.mo6878c() || !m29724b0();
    }

    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: d0 */
    void mo29685d0() {
    }

    /* renamed from: i0 */
    C3598c m29684i0(int i, ColorStateList colorStateList) {
        Context context = this.f10054w.getContext();
        C3598c c3598c = new C3598c((C11148k) C1076h.m38619f(this.f10032a));
        c3598c.m29748e(C0928a.m39113d(context, C5420c.design_fab_stroke_top_outer_color), C0928a.m39113d(context, C5420c.design_fab_stroke_top_inner_color), C0928a.m39113d(context, C5420c.design_fab_stroke_end_inner_color), C0928a.m39113d(context, C5420c.design_fab_stroke_end_outer_color));
        c3598c.m29749d(i);
        c3598c.m29750c(colorStateList);
        return c3598c;
    }

    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: l */
    C11141g mo29682l() {
        return new C3616a((C11148k) C1076h.m38619f(this.f10032a));
    }

    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: n */
    public float mo29681n() {
        return this.f10054w.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: s */
    public void mo29680s(Rect rect) {
        if (this.f10055x.mo6878c()) {
            super.mo29680s(rect);
        } else if (!m29724b0()) {
            int sizeDimension = (this.f10042k - this.f10054w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3601d
    /* renamed from: x */
    public void mo29679x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C11141g mo29682l = mo29682l();
        this.f10033b = mo29682l;
        mo29682l.setTintList(colorStateList);
        if (mode != null) {
            this.f10033b.setTintMode(mode);
        }
        this.f10033b.m6015O(this.f10054w.getContext());
        if (i > 0) {
            this.f10035d = m29684i0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) C1076h.m38619f(this.f10035d), (Drawable) C1076h.m38619f(this.f10033b)});
        } else {
            this.f10035d = null;
            drawable = this.f10033b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C10399b.m8071d(colorStateList2), drawable, null);
        this.f10034c = rippleDrawable;
        this.f10036e = rippleDrawable;
    }
}
