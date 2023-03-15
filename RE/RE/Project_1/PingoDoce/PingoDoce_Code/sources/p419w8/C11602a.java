package p419w8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p100f8.C5419b;
import p189k.C6544d;

/* renamed from: w8.a */
/* loaded from: classes.dex */
public class C11602a {

    /* renamed from: a */
    private static final int[] f29670a = {16842752, C5419b.theme};

    /* renamed from: b */
    private static final int[] f29671b = {C5419b.materialThemeOverlay};

    /* renamed from: a */
    private static int m4642a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29670a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m4641b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29671b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m4640c(Context context, AttributeSet attributeSet, int i, int i2) {
        int m4641b = m4641b(context, attributeSet, i, i2);
        boolean z = (context instanceof C6544d) && ((C6544d) context).m20651c() == m4641b;
        if (m4641b == 0 || z) {
            return context;
        }
        C6544d c6544d = new C6544d(context, m4641b);
        int m4642a = m4642a(context, attributeSet);
        if (m4642a != 0) {
            c6544d.getTheme().applyStyle(m4642a, true);
        }
        return c6544d;
    }
}
