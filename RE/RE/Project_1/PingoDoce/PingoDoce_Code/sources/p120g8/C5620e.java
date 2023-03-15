package p120g8;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: g8.e */
/* loaded from: classes.dex */
public class C5620e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f15860b = new C5620e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f15861a;

    private C5620e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f15861a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f15861a.containsKey(drawable)) {
            return this.f15861a.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f15861a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
