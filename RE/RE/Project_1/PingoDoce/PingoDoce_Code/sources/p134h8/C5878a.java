package p134h8;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: h8.a */
/* loaded from: classes.dex */
public class C5878a {
    /* renamed from: a */
    public static int m22831a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
