package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.r0 */
/* loaded from: classes.dex */
class C0516r0 extends C0495j0 {

    /* renamed from: b */
    private final WeakReference<Context> f1728b;

    public C0516r0(Context context, Resources resources) {
        super(resources);
        this.f1728b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable m40541a = m40541a(i);
        Context context = this.f1728b.get();
        if (m40541a != null && context != null) {
            C0486i0.m40567h().m40551x(context, i, m40541a);
        }
        return m40541a;
    }
}
