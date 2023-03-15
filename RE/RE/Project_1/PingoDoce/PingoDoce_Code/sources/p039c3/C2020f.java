package p039c3;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: c3.f */
/* loaded from: classes.dex */
class C2020f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> ObjectAnimator m34916a(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new C2024h(property, path), 0.0f, 1.0f);
    }
}
