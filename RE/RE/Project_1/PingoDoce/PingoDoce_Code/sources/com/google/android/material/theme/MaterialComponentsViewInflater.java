package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0354f;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0459c;
import androidx.appcompat.widget.C0466e;
import androidx.appcompat.widget.C0470f;
import androidx.appcompat.widget.C0513q;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.C3782h;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0354f {
    @Override // androidx.appcompat.app.C0354f
    /* renamed from: b */
    protected C0459c mo28861b(Context context, AttributeSet attributeSet) {
        return new C3782h(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0354f
    /* renamed from: c */
    protected C0466e mo28860c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0354f
    /* renamed from: d */
    protected C0470f mo28859d(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0354f
    /* renamed from: j */
    protected C0513q mo28858j(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0354f
    /* renamed from: n */
    protected AppCompatTextView mo28857n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
