package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p100f8.C5422e;
import p100f8.C5427j;
import p120g8.C5616a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
public class C3750a extends AbstractC3777e {

    /* renamed from: e */
    private final TextWatcher f10684e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f10685f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC3748f f10686g;

    /* renamed from: h */
    private final TextInputLayout.InterfaceC3749g f10687h;

    /* renamed from: i */
    private AnimatorSet f10688i;

    /* renamed from: j */
    private ValueAnimator f10689j;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    class C3751a implements TextWatcher {
        C3751a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C3750a.this.f10733a.getSuffixText() != null) {
                return;
            }
            C3750a c3750a = C3750a.this;
            c3750a.m28997i(c3750a.m28993m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes.dex */
    class View$OnFocusChangeListenerC3752b implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC3752b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C3750a c3750a = C3750a.this;
            c3750a.m28997i(c3750a.m28993m());
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes.dex */
    class C3753c implements TextInputLayout.InterfaceC3748f {
        C3753c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC3748f
        /* renamed from: a */
        public void mo28892a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C3750a.this.m28993m());
            editText.setOnFocusChangeListener(C3750a.this.f10685f);
            C3750a c3750a = C3750a.this;
            c3750a.f10735c.setOnFocusChangeListener(c3750a.f10685f);
            editText.removeTextChangedListener(C3750a.this.f10684e);
            editText.addTextChangedListener(C3750a.this.f10684e);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes.dex */
    class C3754d implements TextInputLayout.InterfaceC3749g {

        /* compiled from: ClearTextEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes.dex */
        class RunnableC3755a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ EditText f10694w;

            RunnableC3755a(EditText editText) {
                this.f10694w = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f10694w.removeTextChangedListener(C3750a.this.f10684e);
                C3750a.this.m28997i(true);
            }
        }

        C3754d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC3749g
        /* renamed from: a */
        public void mo28891a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC3755a(editText));
            if (editText.getOnFocusChangeListener() == C3750a.this.f10685f) {
                editText.setOnFocusChangeListener(null);
            }
            if (C3750a.this.f10735c.getOnFocusChangeListener() == C3750a.this.f10685f) {
                C3750a.this.f10735c.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: classes.dex */
    class View$OnClickListenerC3756e implements View.OnClickListener {
        View$OnClickListenerC3756e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C3750a.this.f10733a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C3750a.this.f10733a.m29062U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: classes.dex */
    public class C3757f extends AnimatorListenerAdapter {
        C3757f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C3750a.this.f10733a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: classes.dex */
    public class C3758g extends AnimatorListenerAdapter {
        C3758g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3750a.this.f10733a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$h */
    /* loaded from: classes.dex */
    public class C3759h implements ValueAnimator.AnimatorUpdateListener {
        C3759h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3750a.this.f10735c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$i */
    /* loaded from: classes.dex */
    public class C3760i implements ValueAnimator.AnimatorUpdateListener {
        C3760i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3750a.this.f10735c.setScaleX(floatValue);
            C3750a.this.f10735c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3750a(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.f10684e = new C3751a();
        this.f10685f = new View$OnFocusChangeListenerC3752b();
        this.f10686g = new C3753c();
        this.f10687h = new C3754d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m28997i(boolean z) {
        boolean z2 = this.f10733a.m29072K() == z;
        if (z && !this.f10688i.isRunning()) {
            this.f10689j.cancel();
            this.f10688i.start();
            if (z2) {
                this.f10688i.end();
            }
        } else if (z) {
        } else {
            this.f10688i.cancel();
            this.f10689j.start();
            if (z2) {
                this.f10689j.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m28996j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5616a.f15853a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C3759h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m28995k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C5616a.f15856d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C3760i());
        return ofFloat;
    }

    /* renamed from: l */
    private void m28994l() {
        ValueAnimator m28995k = m28995k();
        ValueAnimator m28996j = m28996j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10688i = animatorSet;
        animatorSet.playTogether(m28995k, m28996j);
        this.f10688i.addListener(new C3757f());
        ValueAnimator m28996j2 = m28996j(1.0f, 0.0f);
        this.f10689j = m28996j2;
        m28996j2.addListener(new C3758g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m28993m() {
        EditText editText = this.f10733a.getEditText();
        return editText != null && (editText.hasFocus() || this.f10735c.hasFocus()) && editText.getText().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3777e
    /* renamed from: a */
    public void mo28897a() {
        TextInputLayout textInputLayout = this.f10733a;
        int i = this.f10736d;
        if (i == 0) {
            i = C5422e.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f10733a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C5427j.clear_text_end_icon_content_description));
        this.f10733a.setEndIconCheckable(false);
        this.f10733a.setEndIconOnClickListener(new View$OnClickListenerC3756e());
        this.f10733a.m29044g(this.f10686g);
        this.f10733a.m29042h(this.f10687h);
        m28994l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3777e
    /* renamed from: c */
    public void mo28953c(boolean z) {
        if (this.f10733a.getSuffixText() == null) {
            return;
        }
        m28997i(z);
    }
}
