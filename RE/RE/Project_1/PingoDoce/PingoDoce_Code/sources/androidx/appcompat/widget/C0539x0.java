package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.x0 */
/* loaded from: classes.dex */
public class C0539x0 extends C0495j0 {

    /* renamed from: c */
    private static boolean f1818c = false;

    /* renamed from: b */
    private final WeakReference<Context> f1819b;

    public C0539x0(Context context, Resources resources) {
        super(resources);
        this.f1819b = new WeakReference<>(context);
    }

    /* renamed from: b */
    public static boolean m40333b() {
        return f1818c;
    }

    /* renamed from: c */
    public static boolean m40332c() {
        return m40333b() && Build.VERSION.SDK_INT <= 20;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.f1819b.get();
        if (context != null) {
            return C0486i0.m40567h().m40555t(context, this, i);
        }
        return m40541a(i);
    }
}
