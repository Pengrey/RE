package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes.dex */
public class C0526u0 {
    /* renamed from: a */
    public static void m40411a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnLongClickListenerC0528v0.m40403f(view, charSequence);
        }
    }
}
