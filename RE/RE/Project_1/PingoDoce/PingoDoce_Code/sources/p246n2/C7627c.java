package p246n2;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: n2.c */
/* loaded from: classes.dex */
public class C7627c {
    /* renamed from: a */
    public static void m17894a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: b */
    public static void m17893b(ImageView imageView, String str) {
        if (str == null) {
            imageView.setImageURI(null);
        } else {
            imageView.setImageURI(Uri.parse(str));
        }
    }
}
