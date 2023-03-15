package com.github.florent37.expansionpanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.github.florent37.expansionpanel.ExpansionLayout;
import p329r5.C9815a;

/* loaded from: classes.dex */
public class ExpansionHeader extends FrameLayout {

    /* renamed from: A */
    ExpansionLayout f6822A;

    /* renamed from: B */
    Animator f6823B;

    /* renamed from: C */
    private int f6824C;

    /* renamed from: D */
    private int f6825D;

    /* renamed from: E */
    private boolean f6826E;

    /* renamed from: w */
    int f6827w;

    /* renamed from: x */
    int f6828x;

    /* renamed from: y */
    boolean f6829y;

    /* renamed from: z */
    View f6830z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.florent37.expansionpanel.ExpansionHeader$a */
    /* loaded from: classes.dex */
    public class C2340a implements ExpansionLayout.InterfaceC2350f {
        C2340a() {
        }

        @Override // com.github.florent37.expansionpanel.ExpansionLayout.InterfaceC2350f
        /* renamed from: a */
        public void mo33851a(ExpansionLayout expansionLayout, boolean z) {
            ExpansionHeader.this.m33870c(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.florent37.expansionpanel.ExpansionHeader$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2341b implements View.OnClickListener {
        View$OnClickListenerC2341b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExpansionHeader expansionHeader = ExpansionHeader.this;
            if (expansionHeader.f6829y) {
                expansionHeader.f6822A.m33853j0(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.florent37.expansionpanel.ExpansionHeader$c */
    /* loaded from: classes.dex */
    public class C2342c extends AnimatorListenerAdapter {
        C2342c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            ExpansionHeader.this.f6823B = null;
        }
    }

    public ExpansionHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6827w = 0;
        this.f6828x = 0;
        this.f6829y = true;
        this.f6824C = 270;
        this.f6825D = 90;
        this.f6826E = false;
        m33872a(context, attributeSet);
    }

    /* renamed from: a */
    private void m33872a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9815a.f25760a)) == null) {
            return;
        }
        setHeaderRotationExpanded(obtainStyledAttributes.getInt(C9815a.f25763d, this.f6824C));
        setHeaderRotationCollapsed(obtainStyledAttributes.getInt(C9815a.f25762c, this.f6825D));
        setHeaderIndicatorId(obtainStyledAttributes.getResourceId(C9815a.f25761b, this.f6827w));
        setExpansionLayoutId(obtainStyledAttributes.getResourceId(C9815a.f25764e, this.f6828x));
        setToggleOnClick(obtainStyledAttributes.getBoolean(C9815a.f25765f, this.f6829y));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m33869d() {
        ExpansionLayout expansionLayout = this.f6822A;
        if (expansionLayout == null || this.f6826E) {
            return;
        }
        expansionLayout.m33863Z(new C2340a());
        setOnClickListener(new View$OnClickListenerC2341b());
        m33871b(this.f6822A.m33857f0());
        this.f6826E = true;
    }

    /* renamed from: b */
    protected void m33871b(boolean z) {
        View view = this.f6830z;
        if (view != null) {
            view.setRotation(z ? this.f6824C : this.f6825D);
        }
    }

    /* renamed from: c */
    protected void m33870c(boolean z) {
        setSelected(z);
        if (this.f6830z != null) {
            Animator animator = this.f6823B;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                this.f6823B = ObjectAnimator.ofFloat(this.f6830z, View.ROTATION, this.f6824C);
            } else {
                this.f6823B = ObjectAnimator.ofFloat(this.f6830z, View.ROTATION, this.f6825D);
            }
            this.f6823B.addListener(new C2342c());
            Animator animator2 = this.f6823B;
            if (animator2 != null) {
                animator2.start();
            }
        }
    }

    public View getHeaderIndicator() {
        return this.f6830z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setHeaderIndicatorId(this.f6827w);
        setExpansionLayoutId(this.f6828x);
        m33869d();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f6827w = bundle.getInt("headerIndicatorId");
            this.f6828x = bundle.getInt("expansionLayoutId");
            setToggleOnClick(bundle.getBoolean("toggleOnClick"));
            setHeaderRotationExpanded(bundle.getInt("headerRotationExpanded"));
            setHeaderRotationCollapsed(bundle.getInt("headerRotationCollapsed"));
            this.f6826E = false;
            super.onRestoreInstanceState(bundle.getParcelable("super"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putInt("headerIndicatorId", this.f6827w);
        bundle.putInt("expansionLayoutId", this.f6828x);
        bundle.putBoolean("toggleOnClick", this.f6829y);
        bundle.putInt("headerRotationExpanded", this.f6824C);
        bundle.putInt("headerRotationCollapsed", this.f6825D);
        return bundle;
    }

    public void setExpansionHeaderIndicator(View view) {
        this.f6830z = view;
        if (view != null && Build.VERSION.SDK_INT >= 11) {
            view.setLayerType(1, null);
        }
        m33869d();
    }

    public void setExpansionLayout(ExpansionLayout expansionLayout) {
        this.f6822A = expansionLayout;
        m33869d();
    }

    public void setExpansionLayoutId(int i) {
        this.f6828x = i;
        if (i != 0) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                View findViewById = ((ViewGroup) parent).findViewById(i);
                if (findViewById instanceof ExpansionLayout) {
                    setExpansionLayout((ExpansionLayout) findViewById);
                }
            }
        }
    }

    public void setHeaderIndicatorId(int i) {
        this.f6827w = i;
        if (i != 0) {
            View findViewById = findViewById(i);
            this.f6830z = findViewById;
            setExpansionHeaderIndicator(findViewById);
        }
    }

    public void setHeaderRotationCollapsed(int i) {
        this.f6825D = i;
    }

    public void setHeaderRotationExpanded(int i) {
        this.f6824C = i;
    }

    public void setToggleOnClick(boolean z) {
        this.f6829y = z;
    }
}
