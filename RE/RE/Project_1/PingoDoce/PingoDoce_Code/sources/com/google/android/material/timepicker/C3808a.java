package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import com.github.aachartmodel.aainfographics.BuildConfig;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
class C3808a implements InputFilter {

    /* renamed from: a */
    private int f10840a;

    public C3808a(int i) {
        this.f10840a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f10840a) {
                return null;
            }
            return BuildConfig.VERSION_NAME;
        } catch (NumberFormatException unused) {
            return BuildConfig.VERSION_NAME;
        }
    }
}
