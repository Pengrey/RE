package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.e */
/* loaded from: classes.dex */
public class C1232e {

    /* compiled from: ImageViewCompat.java */
    /* renamed from: androidx.core.widget.e$a */
    /* loaded from: classes.dex */
    static class C1233a {
        /* renamed from: a */
        static ColorStateList m37907a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m37906b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m37905c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m37904d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m37911a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1233a.m37907a(imageView);
        }
        if (imageView instanceof InterfaceC1252m) {
            return ((InterfaceC1252m) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m37910b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1233a.m37906b(imageView);
        }
        if (imageView instanceof InterfaceC1252m) {
            return ((InterfaceC1252m) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m37909c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C1233a.m37905c(imageView, colorStateList);
            if (i != 21 || (drawable = imageView.getDrawable()) == null || C1233a.m37907a(imageView) == null) {
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        } else if (imageView instanceof InterfaceC1252m) {
            ((InterfaceC1252m) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m37908d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C1233a.m37904d(imageView, mode);
            if (i != 21 || (drawable = imageView.getDrawable()) == null || C1233a.m37907a(imageView) == null) {
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        } else if (imageView instanceof InterfaceC1252m) {
            ((InterfaceC1252m) imageView).setSupportImageTintMode(mode);
        }
    }
}
