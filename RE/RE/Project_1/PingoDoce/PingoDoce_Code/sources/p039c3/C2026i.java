package p039c3;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: c3.i */
/* loaded from: classes.dex */
class C2026i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static PropertyValuesHolder m34913a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new C2024h(property, path), 0.0f, 1.0f);
    }
}
