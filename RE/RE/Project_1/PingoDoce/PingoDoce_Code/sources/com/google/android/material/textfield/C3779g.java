package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C1112b0;
import androidx.core.widget.C1240i;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import p100f8.C5421d;
import p100f8.C5423f;
import p120g8.C5616a;
import p120g8.C5617b;
import p354s8.C10086c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.g */
/* loaded from: classes.dex */
public final class C3779g {

    /* renamed from: a */
    private final Context f10737a;

    /* renamed from: b */
    private final TextInputLayout f10738b;

    /* renamed from: c */
    private LinearLayout f10739c;

    /* renamed from: d */
    private int f10740d;

    /* renamed from: e */
    private FrameLayout f10741e;

    /* renamed from: f */
    private Animator f10742f;

    /* renamed from: g */
    private final float f10743g;

    /* renamed from: h */
    private int f10744h;

    /* renamed from: i */
    private int f10745i;

    /* renamed from: j */
    private CharSequence f10746j;

    /* renamed from: k */
    private boolean f10747k;

    /* renamed from: l */
    private TextView f10748l;

    /* renamed from: m */
    private CharSequence f10749m;

    /* renamed from: n */
    private int f10750n;

    /* renamed from: o */
    private ColorStateList f10751o;

    /* renamed from: p */
    private CharSequence f10752p;

    /* renamed from: q */
    private boolean f10753q;

    /* renamed from: r */
    private TextView f10754r;

    /* renamed from: s */
    private int f10755s;

    /* renamed from: t */
    private ColorStateList f10756t;

    /* renamed from: u */
    private Typeface f10757u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* renamed from: com.google.android.material.textfield.g$a */
    /* loaded from: classes.dex */
    public class C3780a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f10758a;

        /* renamed from: b */
        final /* synthetic */ TextView f10759b;

        /* renamed from: c */
        final /* synthetic */ int f10760c;

        /* renamed from: d */
        final /* synthetic */ TextView f10761d;

        C3780a(int i, TextView textView, int i2, TextView textView2) {
            this.f10758a = i;
            this.f10759b = textView;
            this.f10760c = i2;
            this.f10761d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3779g.this.f10744h = this.f10758a;
            C3779g.this.f10742f = null;
            TextView textView = this.f10759b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f10760c == 1 && C3779g.this.f10748l != null) {
                    C3779g.this.f10748l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f10761d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f10761d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f10761d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* renamed from: com.google.android.material.textfield.g$b */
    /* loaded from: classes.dex */
    public class C3781b extends View.AccessibilityDelegate {
        C3781b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C3779g.this.f10738b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C3779g(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f10737a = context;
        this.f10738b = textInputLayout;
        this.f10743g = context.getResources().getDimensionPixelSize(C5421d.design_textinput_caption_translate_y);
    }

    /* renamed from: C */
    private void m28943C(int i, int i2) {
        TextView m28916m;
        TextView m28916m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m28916m2 = m28916m(i2)) != null) {
            m28916m2.setVisibility(0);
            m28916m2.setAlpha(1.0f);
        }
        if (i != 0 && (m28916m = m28916m(i)) != null) {
            m28916m.setVisibility(4);
            if (i == 1) {
                m28916m.setText((CharSequence) null);
            }
        }
        this.f10744h = i2;
    }

    /* renamed from: K */
    private void m28935K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: M */
    private void m28933M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: N */
    private boolean m28932N(TextView textView, CharSequence charSequence) {
        return C1112b0.m38446W(this.f10738b) && this.f10738b.isEnabled() && !(this.f10745i == this.f10744h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: Q */
    private void m28929Q(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10742f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m28920i(arrayList, this.f10753q, this.f10754r, 2, i, i2);
            m28920i(arrayList, this.f10747k, this.f10748l, 1, i, i2);
            C5617b.m23562a(animatorSet, arrayList);
            animatorSet.addListener(new C3780a(i2, m28916m(i), i, m28916m(i2)));
            animatorSet.start();
        } else {
            m28943C(i, i2);
        }
        this.f10738b.m29021r0();
        this.f10738b.m29011w0(z);
        this.f10738b.m29078E0();
    }

    /* renamed from: g */
    private boolean m28922g() {
        return (this.f10739c == null || this.f10738b.getEditText() == null) ? false : true;
    }

    /* renamed from: i */
    private void m28920i(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(m28919j(textView, i3 == i));
            if (i3 == i) {
                list.add(m28918k(textView));
            }
        }
    }

    /* renamed from: j */
    private ObjectAnimator m28919j(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C5616a.f15853a);
        return ofFloat;
    }

    /* renamed from: k */
    private ObjectAnimator m28918k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f10743g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C5616a.f15856d);
        return ofFloat;
    }

    /* renamed from: m */
    private TextView m28916m(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f10754r;
        }
        return this.f10748l;
    }

    /* renamed from: u */
    private int m28908u(boolean z, int i, int i2) {
        return z ? this.f10737a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: x */
    private boolean m28905x(int i) {
        return (i != 1 || this.f10748l == null || TextUtils.isEmpty(this.f10746j)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m28945A() {
        return this.f10753q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m28944B(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f10739c == null) {
            return;
        }
        if (m28904y(i) && (frameLayout = this.f10741e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f10739c.removeView(textView);
        }
        int i2 = this.f10740d - 1;
        this.f10740d = i2;
        m28933M(this.f10739c, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m28942D(CharSequence charSequence) {
        this.f10749m = charSequence;
        TextView textView = this.f10748l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m28941E(boolean z) {
        if (this.f10747k == z) {
            return;
        }
        m28921h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f10737a);
            this.f10748l = appCompatTextView;
            appCompatTextView.setId(C5423f.textinput_error);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f10748l.setTextAlignment(5);
            }
            Typeface typeface = this.f10757u;
            if (typeface != null) {
                this.f10748l.setTypeface(typeface);
            }
            m28940F(this.f10750n);
            m28939G(this.f10751o);
            m28942D(this.f10749m);
            this.f10748l.setVisibility(4);
            C1112b0.m38401u0(this.f10748l, 1);
            m28924e(this.f10748l, 0);
        } else {
            m28907v();
            m28944B(this.f10748l, 0);
            this.f10748l = null;
            this.f10738b.m29021r0();
            this.f10738b.m29078E0();
        }
        this.f10747k = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m28940F(int i) {
        this.f10750n = i;
        TextView textView = this.f10748l;
        if (textView != null) {
            this.f10738b.m29049d0(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m28939G(ColorStateList colorStateList) {
        this.f10751o = colorStateList;
        TextView textView = this.f10748l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m28938H(int i) {
        this.f10755s = i;
        TextView textView = this.f10754r;
        if (textView != null) {
            C1240i.m37872q(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m28937I(boolean z) {
        if (this.f10753q == z) {
            return;
        }
        m28921h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f10737a);
            this.f10754r = appCompatTextView;
            appCompatTextView.setId(C5423f.textinput_helper_text);
            int i = Build.VERSION.SDK_INT;
            if (i >= 17) {
                this.f10754r.setTextAlignment(5);
            }
            Typeface typeface = this.f10757u;
            if (typeface != null) {
                this.f10754r.setTypeface(typeface);
            }
            this.f10754r.setVisibility(4);
            C1112b0.m38401u0(this.f10754r, 1);
            m28938H(this.f10755s);
            m28936J(this.f10756t);
            m28924e(this.f10754r, 1);
            if (i >= 17) {
                this.f10754r.setAccessibilityDelegate(new C3781b());
            }
        } else {
            m28906w();
            m28944B(this.f10754r, 1);
            this.f10754r = null;
            this.f10738b.m29021r0();
            this.f10738b.m29078E0();
        }
        this.f10753q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m28936J(ColorStateList colorStateList) {
        this.f10756t = colorStateList;
        TextView textView = this.f10754r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m28934L(Typeface typeface) {
        if (typeface != this.f10757u) {
            this.f10757u = typeface;
            m28935K(this.f10748l, typeface);
            m28935K(this.f10754r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m28931O(CharSequence charSequence) {
        m28921h();
        this.f10746j = charSequence;
        this.f10748l.setText(charSequence);
        int i = this.f10744h;
        if (i != 1) {
            this.f10745i = 1;
        }
        m28929Q(i, this.f10745i, m28932N(this.f10748l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m28930P(CharSequence charSequence) {
        m28921h();
        this.f10752p = charSequence;
        this.f10754r.setText(charSequence);
        int i = this.f10744h;
        if (i != 2) {
            this.f10745i = 2;
        }
        m28929Q(i, this.f10745i, m28932N(this.f10754r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m28924e(TextView textView, int i) {
        if (this.f10739c == null && this.f10741e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f10737a);
            this.f10739c = linearLayout;
            linearLayout.setOrientation(0);
            this.f10738b.addView(this.f10739c, -1, -2);
            this.f10741e = new FrameLayout(this.f10737a);
            this.f10739c.addView(this.f10741e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f10738b.getEditText() != null) {
                m28923f();
            }
        }
        if (m28904y(i)) {
            this.f10741e.setVisibility(0);
            this.f10741e.addView(textView);
        } else {
            this.f10739c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f10739c.setVisibility(0);
        this.f10740d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m28923f() {
        if (m28922g()) {
            EditText editText = this.f10738b.getEditText();
            boolean m9221i = C10086c.m9221i(this.f10737a);
            LinearLayout linearLayout = this.f10739c;
            int i = C5421d.material_helper_text_font_1_3_padding_horizontal;
            C1112b0.m38473F0(linearLayout, m28908u(m9221i, i, C1112b0.m38466J(editText)), m28908u(m9221i, C5421d.material_helper_text_font_1_3_padding_top, this.f10737a.getResources().getDimensionPixelSize(C5421d.material_helper_text_default_padding_top)), m28908u(m9221i, i, C1112b0.m38468I(editText)), 0);
        }
    }

    /* renamed from: h */
    void m28921h() {
        Animator animator = this.f10742f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m28917l() {
        return m28905x(this.f10745i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence m28915n() {
        return this.f10749m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public CharSequence m28914o() {
        return this.f10746j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m28913p() {
        TextView textView = this.f10748l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList m28912q() {
        TextView textView = this.f10748l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public CharSequence m28911r() {
        return this.f10752p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public View m28910s() {
        return this.f10754r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public int m28909t() {
        TextView textView = this.f10754r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m28907v() {
        this.f10746j = null;
        m28921h();
        if (this.f10744h == 1) {
            if (this.f10753q && !TextUtils.isEmpty(this.f10752p)) {
                this.f10745i = 2;
            } else {
                this.f10745i = 0;
            }
        }
        m28929Q(this.f10744h, this.f10745i, m28932N(this.f10748l, BuildConfig.VERSION_NAME));
    }

    /* renamed from: w */
    void m28906w() {
        m28921h();
        int i = this.f10744h;
        if (i == 2) {
            this.f10745i = 0;
        }
        m28929Q(i, this.f10745i, m28932N(this.f10754r, BuildConfig.VERSION_NAME));
    }

    /* renamed from: y */
    boolean m28904y(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m28903z() {
        return this.f10747k;
    }
}
