package p246n2;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: n2.f */
/* loaded from: classes.dex */
public class C7634f {
    /* renamed from: a */
    private static int m17883a(float f) {
        int i = (int) (0.5f + f);
        if (i != 0) {
            return i;
        }
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        return i2 > 0 ? 1 : -1;
    }

    /* renamed from: b */
    public static void m17882b(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: c */
    public static void m17881c(View view, View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    /* renamed from: d */
    public static void m17880d(View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), m17883a(f));
    }

    /* renamed from: e */
    public static void m17879e(View view, float f) {
        int m17883a = m17883a(f);
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(m17883a, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        } else {
            view.setPadding(m17883a, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* renamed from: f */
    public static void m17878f(View view, float f) {
        view.setPadding(view.getPaddingLeft(), m17883a(f), view.getPaddingRight(), view.getPaddingBottom());
    }
}
