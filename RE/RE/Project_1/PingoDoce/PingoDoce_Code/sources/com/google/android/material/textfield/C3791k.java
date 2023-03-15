package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0520s0;
import androidx.core.view.C1112b0;
import androidx.core.view.C1170i;
import androidx.core.view.accessibility.C1085c;
import androidx.core.widget.C1240i;
import com.google.android.material.internal.C3649p;
import com.google.android.material.internal.CheckableImageButton;
import p100f8.C5421d;
import p100f8.C5423f;
import p100f8.C5425h;
import p100f8.C5429l;
import p354s8.C10086c;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.k */
/* loaded from: classes.dex */
public class C3791k extends LinearLayout {

    /* renamed from: A */
    private ColorStateList f10778A;

    /* renamed from: B */
    private PorterDuff.Mode f10779B;

    /* renamed from: C */
    private View.OnLongClickListener f10780C;

    /* renamed from: D */
    private boolean f10781D;

    /* renamed from: w */
    private final TextInputLayout f10782w;

    /* renamed from: x */
    private final TextView f10783x;

    /* renamed from: y */
    private CharSequence f10784y;

    /* renamed from: z */
    private final CheckableImageButton f10785z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3791k(TextInputLayout textInputLayout, C0520s0 c0520s0) {
        super(textInputLayout.getContext());
        this.f10782w = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C5425h.design_text_input_start_icon, (ViewGroup) this, false);
        this.f10785z = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f10783x = appCompatTextView;
        m28884g(c0520s0);
        m28885f(c0520s0);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: f */
    private void m28885f(C0520s0 c0520s0) {
        this.f10783x.setVisibility(8);
        this.f10783x.setId(C5423f.textinput_prefix_text);
        this.f10783x.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C1112b0.m38401u0(this.f10783x, 1);
        m28879l(c0520s0.m40461n(C5429l.f15074W6, 0));
        int i = C5429l.f15082X6;
        if (c0520s0.m40456s(i)) {
            m28878m(c0520s0.m40472c(i));
        }
        m28880k(c0520s0.m40459p(C5429l.f15066V6));
    }

    /* renamed from: g */
    private void m28884g(C0520s0 c0520s0) {
        if (C10086c.m9221i(getContext())) {
            C1170i.m38155c((ViewGroup.MarginLayoutParams) this.f10785z.getLayoutParams(), 0);
        }
        m28874q(null);
        m28873r(null);
        int i = C5429l.f15116b7;
        if (c0520s0.m40456s(i)) {
            this.f10778A = C10086c.m9228b(getContext(), c0520s0, i);
        }
        int i2 = C5429l.f15125c7;
        if (c0520s0.m40456s(i2)) {
            this.f10779B = C3649p.m29487f(c0520s0.m40464k(i2, -1), null);
        }
        int i3 = C5429l.f15107a7;
        if (c0520s0.m40456s(i3)) {
            m28875p(c0520s0.m40468g(i3));
            int i4 = C5429l.f15098Z6;
            if (c0520s0.m40456s(i4)) {
                m28876o(c0520s0.m40459p(i4));
            }
            m28877n(c0520s0.m40474a(C5429l.f15090Y6, true));
        }
    }

    /* renamed from: x */
    private void m28867x() {
        int i = (this.f10784y == null || this.f10781D) ? 8 : 0;
        setVisibility(this.f10785z.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.f10783x.setVisibility(i);
        this.f10782w.m29023q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence m28890a() {
        return this.f10784y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m28889b() {
        return this.f10783x.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public TextView m28888c() {
        return this.f10783x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence m28887d() {
        return this.f10785z.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Drawable m28886e() {
        return this.f10785z.getDrawable();
    }

    /* renamed from: h */
    boolean m28883h() {
        return this.f10785z.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m28882i(boolean z) {
        this.f10781D = z;
        m28867x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m28881j() {
        C3778f.m28949c(this.f10782w, this.f10785z, this.f10778A);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m28880k(CharSequence charSequence) {
        this.f10784y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f10783x.setText(charSequence);
        m28867x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m28879l(int i) {
        C1240i.m37872q(this.f10783x, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m28878m(ColorStateList colorStateList) {
        this.f10783x.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m28877n(boolean z) {
        this.f10785z.setCheckable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m28876o(CharSequence charSequence) {
        if (m28887d() != charSequence) {
            this.f10785z.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m28868w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m28875p(Drawable drawable) {
        this.f10785z.setImageDrawable(drawable);
        if (drawable != null) {
            C3778f.m28951a(this.f10782w, this.f10785z, this.f10778A, this.f10779B);
            m28870u(true);
            m28881j();
            return;
        }
        m28870u(false);
        m28874q(null);
        m28873r(null);
        m28876o(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m28874q(View.OnClickListener onClickListener) {
        C3778f.m28947e(this.f10785z, onClickListener, this.f10780C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m28873r(View.OnLongClickListener onLongClickListener) {
        this.f10780C = onLongClickListener;
        C3778f.m28946f(this.f10785z, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m28872s(ColorStateList colorStateList) {
        if (this.f10778A != colorStateList) {
            this.f10778A = colorStateList;
            C3778f.m28951a(this.f10782w, this.f10785z, colorStateList, this.f10779B);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m28871t(PorterDuff.Mode mode) {
        if (this.f10779B != mode) {
            this.f10779B = mode;
            C3778f.m28951a(this.f10782w, this.f10785z, this.f10778A, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m28870u(boolean z) {
        if (m28883h() != z) {
            this.f10785z.setVisibility(z ? 0 : 8);
            m28868w();
            m28867x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m28869v(C1085c c1085c) {
        if (this.f10783x.getVisibility() == 0) {
            c1085c.m38534o0(this.f10783x);
            c1085c.m38584I0(this.f10783x);
            return;
        }
        c1085c.m38584I0(this.f10785z);
    }

    /* renamed from: w */
    void m28868w() {
        EditText editText = this.f10782w.f10591A;
        if (editText == null) {
            return;
        }
        C1112b0.m38473F0(this.f10783x, m28883h() ? 0 : C1112b0.m38466J(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C5421d.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
