package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C3649p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p100f8.C5418a;
import p100f8.C5421d;
import p120g8.InterfaceC5626k;
import p401v8.C11141g;
import p401v8.C11145h;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0872b {

    /* renamed from: A0 */
    private boolean f9464A0;

    /* renamed from: B0 */
    private Behavior f9465B0;

    /* renamed from: C0 */
    private int f9466C0;

    /* renamed from: D0 */
    private int f9467D0;

    /* renamed from: E0 */
    private int f9468E0;

    /* renamed from: F0 */
    AnimatorListenerAdapter f9469F0;

    /* renamed from: G0 */
    InterfaceC5626k<FloatingActionButton> f9470G0;

    /* renamed from: o0 */
    private Integer f9471o0;

    /* renamed from: p0 */
    private final int f9472p0;

    /* renamed from: q0 */
    private final C11141g f9473q0;

    /* renamed from: r0 */
    private Animator f9474r0;

    /* renamed from: s0 */
    private Animator f9475s0;

    /* renamed from: t0 */
    private int f9476t0;

    /* renamed from: u0 */
    private int f9477u0;

    /* renamed from: v0 */
    private boolean f9478v0;

    /* renamed from: w0 */
    private int f9479w0;

    /* renamed from: x0 */
    private ArrayList<InterfaceC3486g> f9480x0;

    /* renamed from: y0 */
    private int f9481y0;

    /* renamed from: z0 */
    private boolean f9482z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3478a();

        /* renamed from: y */
        int f9488y;

        /* renamed from: z */
        boolean f9489z;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        /* loaded from: classes.dex */
        class C3478a implements Parcelable.ClassLoaderCreator<SavedState> {
            C3478a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9488y);
            parcel.writeInt(this.f9489z ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9488y = parcel.readInt();
            this.f9489z = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes.dex */
    public class C3479a extends AnimatorListenerAdapter {
        C3479a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m30459k0();
            BottomAppBar.this.f9474r0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m30458l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes.dex */
    public class C3480b extends FloatingActionButton.AbstractC3592b {

        /* renamed from: a */
        final /* synthetic */ int f9491a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        /* loaded from: classes.dex */
        class C3481a extends FloatingActionButton.AbstractC3592b {
            C3481a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC3592b
            /* renamed from: b */
            public void mo29761b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m30459k0();
            }
        }

        C3480b(int i) {
            this.f9491a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC3592b
        /* renamed from: a */
        public void mo29762a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m30454p0(this.f9491a));
            floatingActionButton.m29774s(new C3481a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes.dex */
    public class C3482c extends AnimatorListenerAdapter {
        C3482c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m30459k0();
            BottomAppBar.this.f9482z0 = false;
            BottomAppBar.this.f9475s0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m30458l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes.dex */
    public class C3483d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f9495a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f9496b;

        /* renamed from: c */
        final /* synthetic */ int f9497c;

        /* renamed from: d */
        final /* synthetic */ boolean f9498d;

        C3483d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f9496b = actionMenuView;
            this.f9497c = i;
            this.f9498d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9495a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f9495a) {
                return;
            }
            boolean z = BottomAppBar.this.f9481y0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m30449u0(bottomAppBar.f9481y0);
            BottomAppBar.this.m30482A0(this.f9496b, this.f9497c, this.f9498d, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes.dex */
    public class RunnableC3484e implements Runnable {

        /* renamed from: w */
        final /* synthetic */ ActionMenuView f9500w;

        /* renamed from: x */
        final /* synthetic */ int f9501x;

        /* renamed from: y */
        final /* synthetic */ boolean f9502y;

        RunnableC3484e(ActionMenuView actionMenuView, int i, boolean z) {
            this.f9500w = actionMenuView;
            this.f9501x = i;
            this.f9502y = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f9500w;
            actionMenuView.setTranslationX(BottomAppBar.this.m30455o0(actionMenuView, this.f9501x, this.f9502y));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes.dex */
    public class C3485f extends AnimatorListenerAdapter {
        C3485f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f9469F0.onAnimationStart(animator);
            FloatingActionButton m30457m0 = BottomAppBar.this.m30457m0();
            if (m30457m0 != null) {
                m30457m0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes.dex */
    public interface InterfaceC3486g {
        /* renamed from: a */
        void m30435a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m30434b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public void m30482A0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC3484e runnableC3484e = new RunnableC3484e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC3484e);
        } else {
            runnableC3484e.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m30464f0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m29788e(this.f9469F0);
        floatingActionButton.m29787f(new C3485f());
        floatingActionButton.m29786g(this.f9470G0);
    }

    /* renamed from: g0 */
    private void m30463g0() {
        Animator animator = this.f9475s0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f9474r0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f9466C0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m30454p0(this.f9476t0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m30433c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f9468E0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f9467D0;
    }

    private C3487a getTopEdgeTreatment() {
        return (C3487a) this.f9473q0.m6025E().m5942p();
    }

    /* renamed from: i0 */
    private void m30461i0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m30457m0(), "translationX", m30454p0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: j0 */
    private void m30460j0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m30455o0(actionMenuView, i, z)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new C3483d(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public void m30459k0() {
        ArrayList<InterfaceC3486g> arrayList;
        int i = this.f9479w0 - 1;
        this.f9479w0 = i;
        if (i != 0 || (arrayList = this.f9480x0) == null) {
            return;
        }
        Iterator<InterfaceC3486g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m30435a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m30458l0() {
        ArrayList<InterfaceC3486g> arrayList;
        int i = this.f9479w0;
        this.f9479w0 = i + 1;
        if (i != 0 || (arrayList = this.f9480x0) == null) {
            return;
        }
        Iterator<InterfaceC3486g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m30434b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public FloatingActionButton m30457m0() {
        View m30456n0 = m30456n0();
        if (m30456n0 instanceof FloatingActionButton) {
            return (FloatingActionButton) m30456n0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m30456n0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m39326s(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m30456n0():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public float m30454p0(int i) {
        boolean m29488e = C3649p.m29488e(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.f9472p0 + (m29488e ? this.f9468E0 : this.f9467D0))) * (m29488e ? -1 : 1);
        }
        return 0.0f;
    }

    /* renamed from: q0 */
    private boolean m30453q0() {
        FloatingActionButton m30457m0 = m30457m0();
        return m30457m0 != null && m30457m0.m29778o();
    }

    /* renamed from: r0 */
    private void m30452r0(int i, boolean z) {
        if (!C1112b0.m38446W(this)) {
            m30449u0(this.f9481y0);
            return;
        }
        Animator animator = this.f9475s0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m30453q0()) {
            i = 0;
            z = false;
        }
        m30460j0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f9475s0 = animatorSet;
        animatorSet.addListener(new C3482c());
        this.f9475s0.start();
    }

    /* renamed from: s0 */
    private void m30451s0(int i) {
        if (this.f9476t0 == i || !C1112b0.m38446W(this)) {
            return;
        }
        Animator animator = this.f9474r0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f9477u0 == 1) {
            m30461i0(i, arrayList);
        } else {
            m30462h0(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f9474r0 = animatorSet;
        animatorSet.addListener(new C3479a());
        this.f9474r0.start();
    }

    /* renamed from: t0 */
    private Drawable m30450t0(Drawable drawable) {
        if (drawable == null || this.f9471o0 == null) {
            return drawable;
        }
        Drawable m38859r = C0981a.m38859r(drawable.mutate());
        C0981a.m38863n(m38859r, this.f9471o0.intValue());
        return m38859r;
    }

    /* renamed from: v0 */
    private void m30448v0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f9475s0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!m30453q0()) {
            m30444z0(actionMenuView, 0, false);
        } else {
            m30444z0(actionMenuView, this.f9476t0, this.f9464A0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public void m30447w0() {
        getTopEdgeTreatment().m30423n(getFabTranslationX());
        View m30456n0 = m30456n0();
        this.f9473q0.m6003a0((this.f9464A0 && m30453q0()) ? 1.0f : 0.0f);
        if (m30456n0 != null) {
            m30456n0.setTranslationY(getFabTranslationY());
            m30456n0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: z0 */
    private void m30444z0(ActionMenuView actionMenuView, int i, boolean z) {
        m30482A0(actionMenuView, i, z, false);
    }

    public ColorStateList getBackgroundTint() {
        return this.f9473q0.m6023G();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m30433c();
    }

    public int getFabAlignmentMode() {
        return this.f9476t0;
    }

    public int getFabAnimationMode() {
        return this.f9477u0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m30431e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m30430f();
    }

    public boolean getHideOnScroll() {
        return this.f9478v0;
    }

    /* renamed from: h0 */
    protected void m30462h0(int i, List<Animator> list) {
        FloatingActionButton m30457m0 = m30457m0();
        if (m30457m0 == null || m30457m0.m29779n()) {
            return;
        }
        m30458l0();
        m30457m0.m29781l(new C3480b(i));
    }

    /* renamed from: o0 */
    protected int m30455o0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i == 1 && z) {
            boolean m29488e = C3649p.m29488e(this);
            int measuredWidth = m29488e ? getMeasuredWidth() : 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof Toolbar.C0449e) && (((Toolbar.C0449e) childAt.getLayoutParams()).f795a & 8388615) == 8388611) {
                    if (m29488e) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((m29488e ? actionMenuView.getRight() : actionMenuView.getLeft()) + (m29488e ? this.f9467D0 : -this.f9468E0));
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11145h.m5960f(this, this.f9473q0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m30463g0();
            m30447w0();
        }
        m30448v0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        this.f9476t0 = savedState.f9488y;
        this.f9464A0 = savedState.f9489z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9488y = this.f9476t0;
        savedState.f9489z = this.f9464A0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0981a.m38862o(this.f9473q0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m30428i(f);
            this.f9473q0.invalidateSelf();
            m30447w0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f9473q0.m6005Y(f);
        getBehavior().m30497I(this, this.f9473q0.m6026D() - this.f9473q0.m6027C());
    }

    public void setFabAlignmentMode(int i) {
        m30446x0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f9477u0 = i;
    }

    void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().m30432d()) {
            getTopEdgeTreatment().m30427j(f);
            this.f9473q0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m30426k(f);
            this.f9473q0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m30425l(f);
            this.f9473q0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f9478v0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m30450t0(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f9471o0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: u0 */
    public void m30449u0(int i) {
        if (i != 0) {
            this.f9481y0 = 0;
            getMenu().clear();
            m40698x(i);
        }
    }

    /* renamed from: x0 */
    public void m30446x0(int i, int i2) {
        this.f9481y0 = i2;
        m30452r0(i, this.f9464A0);
        m30451s0(i);
        this.f9476t0 = i;
    }

    /* renamed from: y0 */
    boolean m30445y0(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().m30429g()) {
            getTopEdgeTreatment().m30424m(f);
            this.f9473q0.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0872b
    public Behavior getBehavior() {
        if (this.f9465B0 == null) {
            this.f9465B0 = new Behavior();
        }
        return this.f9465B0;
    }

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f9483e;

        /* renamed from: f */
        private WeakReference<BottomAppBar> f9484f;

        /* renamed from: g */
        private int f9485g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f9486h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes.dex */
        class View$OnLayoutChangeListenerC3477a implements View.OnLayoutChangeListener {
            View$OnLayoutChangeListenerC3477a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f9484f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.m29783j(Behavior.this.f9483e);
                    int height = Behavior.this.f9483e.height();
                    bottomAppBar.m30445y0(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().m5940r().mo5959a(new RectF(Behavior.this.f9483e)));
                    CoordinatorLayout.C0876f c0876f = (CoordinatorLayout.C0876f) view.getLayoutParams();
                    if (Behavior.this.f9485g == 0) {
                        ((ViewGroup.MarginLayoutParams) c0876f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C5421d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) c0876f).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) c0876f).rightMargin = bottomAppBar.getRightInset();
                        if (C3649p.m29488e(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) c0876f).leftMargin += bottomAppBar.f9472p0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0876f).rightMargin += bottomAppBar.f9472p0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f9486h = new View$OnLayoutChangeListenerC3477a();
            this.f9483e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: Q */
        public boolean mo30696h0(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f9484f = new WeakReference<>(bottomAppBar);
            View m30456n0 = bottomAppBar.m30456n0();
            if (m30456n0 != null && !C1112b0.m38446W(m30456n0)) {
                CoordinatorLayout.C0876f c0876f = (CoordinatorLayout.C0876f) m30456n0.getLayoutParams();
                c0876f.f3035d = 49;
                this.f9485g = ((ViewGroup.MarginLayoutParams) c0876f).bottomMargin;
                if (m30456n0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m30456n0;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C5418a.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C5418a.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f9486h);
                    bottomAppBar.m30464f0(floatingActionButton);
                }
                bottomAppBar.m30447w0();
            }
            coordinatorLayout.m39354I(bottomAppBar, i);
            return super.mo30696h0(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: R */
        public boolean mo30690n0(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo30690n0(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9486h = new View$OnLayoutChangeListenerC3477a();
            this.f9483e = new Rect();
        }
    }
}
