package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.material.internal.o */
/* loaded from: classes.dex */
public class C3647o {

    /* renamed from: a */
    private static final Comparator<View> f10230a = new C3648a();

    /* compiled from: ToolbarUtils.java */
    /* renamed from: com.google.android.material.internal.o$a */
    /* loaded from: classes.dex */
    class C3648a implements Comparator<View> {
        C3648a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    /* renamed from: a */
    private static ImageView m29498a(Toolbar toolbar, Drawable drawable) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (drawable != null && imageView.getDrawable().getConstantState().equals(drawable.getConstantState())) {
                    return imageView;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ImageView m29497b(Toolbar toolbar) {
        return m29498a(toolbar, toolbar.getLogo());
    }

    /* renamed from: c */
    public static TextView m29496c(Toolbar toolbar) {
        List<TextView> m29495d = m29495d(toolbar, toolbar.getSubtitle());
        if (m29495d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(m29495d, f10230a);
    }

    /* renamed from: d */
    private static List<TextView> m29495d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static TextView m29494e(Toolbar toolbar) {
        List<TextView> m29495d = m29495d(toolbar, toolbar.getTitle());
        if (m29495d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(m29495d, f10230a);
    }
}
