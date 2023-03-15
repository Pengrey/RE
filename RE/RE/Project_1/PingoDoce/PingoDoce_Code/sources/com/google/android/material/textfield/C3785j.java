package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C3645m;
import com.google.android.material.textfield.TextInputLayout;
import p100f8.C5422e;
import p100f8.C5427j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.j */
/* loaded from: classes.dex */
public class C3785j extends AbstractC3777e {

    /* renamed from: e */
    private final TextWatcher f10769e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC3748f f10770f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC3749g f10771g;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.j$a */
    /* loaded from: classes.dex */
    class C3786a extends C3645m {
        C3786a() {
        }

        @Override // com.google.android.material.internal.C3645m, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C3785j c3785j = C3785j.this;
            c3785j.f10735c.setChecked(!c3785j.m28894g());
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.j$b */
    /* loaded from: classes.dex */
    class C3787b implements TextInputLayout.InterfaceC3748f {
        C3787b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC3748f
        /* renamed from: a */
        public void mo28892a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            C3785j c3785j = C3785j.this;
            c3785j.f10735c.setChecked(!c3785j.m28894g());
            editText.removeTextChangedListener(C3785j.this.f10769e);
            editText.addTextChangedListener(C3785j.this.f10769e);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.j$c */
    /* loaded from: classes.dex */
    class C3788c implements TextInputLayout.InterfaceC3749g {

        /* compiled from: PasswordToggleEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.j$c$a */
        /* loaded from: classes.dex */
        class RunnableC3789a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ EditText f10775w;

            RunnableC3789a(EditText editText) {
                this.f10775w = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f10775w.removeTextChangedListener(C3785j.this.f10769e);
            }
        }

        C3788c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC3749g
        /* renamed from: a */
        public void mo28891a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new RunnableC3789a(editText));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.j$d */
    /* loaded from: classes.dex */
    class View$OnClickListenerC3790d implements View.OnClickListener {
        View$OnClickListenerC3790d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C3785j.this.f10733a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (C3785j.this.m28894g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            C3785j.this.f10733a.m29062U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3785j(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.f10769e = new C3786a();
        this.f10770f = new C3787b();
        this.f10771g = new C3788c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m28894g() {
        EditText editText = this.f10733a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m28893h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3777e
    /* renamed from: a */
    public void mo28897a() {
        TextInputLayout textInputLayout = this.f10733a;
        int i = this.f10736d;
        if (i == 0) {
            i = C5422e.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f10733a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C5427j.password_toggle_content_description));
        this.f10733a.setEndIconVisible(true);
        this.f10733a.setEndIconCheckable(true);
        this.f10733a.setEndIconOnClickListener(new View$OnClickListenerC3790d());
        this.f10733a.m29044g(this.f10770f);
        this.f10733a.m29042h(this.f10771g);
        EditText editText = this.f10733a.getEditText();
        if (m28893h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
