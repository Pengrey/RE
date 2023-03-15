package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: androidx.core.view.y */
/* loaded from: classes.dex */
public final class C1215y {

    /* renamed from: a */
    private final PointerIcon f3583a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PointerIconCompat.java */
    /* renamed from: androidx.core.view.y$a */
    /* loaded from: classes.dex */
    public static class C1216a {
        /* renamed from: a */
        static PointerIcon m38012a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        /* renamed from: b */
        static PointerIcon m38011b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        /* renamed from: c */
        static PointerIcon m38010c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    private C1215y(PointerIcon pointerIcon) {
        this.f3583a = pointerIcon;
    }

    /* renamed from: b */
    public static C1215y m38013b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1215y(C1216a.m38011b(context, i));
        }
        return new C1215y(null);
    }

    /* renamed from: a */
    public Object m38014a() {
        return this.f3583a;
    }
}
