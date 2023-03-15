package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p181jd.Intrinsics;

/* compiled from: ImageViewTarget.kt */
/* loaded from: classes.dex */
public class ImageViewTarget extends GenericViewTarget {

    /* renamed from: x */
    private final ImageView f6313x;

    public ImageViewTarget(ImageView imageView) {
        this.f6313x = imageView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && Intrinsics.equals(mo9340j(), ((ImageViewTarget) obj).mo9340j());
    }

    public int hashCode() {
        return mo9340j().hashCode();
    }

    /* renamed from: i */
    public Drawable mo6973i() {
        return mo9340j().getDrawable();
    }

    /* renamed from: l */
    public void mo34471l(Drawable drawable) {
        mo9340j().setImageDrawable(drawable);
    }

    /* renamed from: p */
    public ImageView mo9340j() {
        return this.f6313x;
    }
}
