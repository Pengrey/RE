package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C3645m;
import com.google.android.material.internal.C3649p;
import com.google.android.material.textfield.TextInputLayout;
import p100f8.C5423f;
import p100f8.C5425h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: w */
    private final Chip f10786w;

    /* renamed from: x */
    private final TextInputLayout f10787x;

    /* renamed from: y */
    private final EditText f10788y;

    /* renamed from: z */
    private TextWatcher f10789z;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes.dex */
    private class C3793b extends C3645m {
        private C3793b() {
        }

        @Override // com.google.android.material.internal.C3645m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f10786w.setText(ChipTextInputComboView.this.m28854c("00"));
            } else {
                ChipTextInputComboView.this.f10786w.setText(ChipTextInputComboView.this.m28854c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m28854c(CharSequence charSequence) {
        return TimeModel.m28828a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m28853d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f10788y.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10786w.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m28853d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f10786w.setChecked(z);
        this.f10788y.setVisibility(z ? 0 : 4);
        this.f10786w.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            C3649p.m29485h(this.f10788y);
            if (TextUtils.isEmpty(this.f10788y.getText())) {
                return;
            }
            EditText editText = this.f10788y;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10786w.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f10786w.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f10786w.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C5425h.material_time_chip, (ViewGroup) this, false);
        this.f10786w = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C5425h.material_time_input, (ViewGroup) this, false);
        this.f10787x = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f10788y = editText;
        editText.setVisibility(4);
        C3793b c3793b = new C3793b();
        this.f10789z = c3793b;
        editText.addTextChangedListener(c3793b);
        m28853d();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(C5423f.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
