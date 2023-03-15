package com.github.razir.progressbutton;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;
import kotlin.TypeCastException;
import p181jd.Intrinsics;

/* renamed from: com.github.razir.progressbutton.a */
/* loaded from: classes.dex */
public final class C2369a implements TransformationMethod {

    /* renamed from: w */
    private final Locale f6924w;

    public C2369a(Context context) {
        Intrinsics.m20926i(context, "context");
        Resources resources = context.getResources();
        Intrinsics.isNotNull(resources, "context.resources");
        this.f6924w = resources.getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        Intrinsics.m20926i(view, "view");
        if (charSequence == null) {
            return null;
        }
        String obj = charSequence.toString();
        Locale locale = this.f6924w;
        if (locale == null) {
            locale = Locale.getDefault();
            Intrinsics.isNotNull(locale, "Locale.getDefault()");
        }
        if (obj != null) {
            String upperCase = obj.toUpperCase(locale);
            Intrinsics.isNotNull(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            if (charSequence instanceof Spanned) {
                SpannableString spannableString = new SpannableString(upperCase);
                TextUtils.copySpansFrom((Spanned) charSequence, 0, charSequence.length(), null, spannableString, 0);
                return spannableString;
            }
            return upperCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        Intrinsics.m20926i(view, "view");
        Intrinsics.m20926i(charSequence, "sourceText");
    }
}
