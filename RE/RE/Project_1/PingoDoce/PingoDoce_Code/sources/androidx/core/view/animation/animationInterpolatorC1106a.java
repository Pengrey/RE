package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: androidx.core.view.animation.a  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
/* loaded from: classes.dex */
class animationInterpolatorC1106a implements Interpolator {

    /* renamed from: a */
    private final float[] f3446a;

    /* renamed from: b */
    private final float[] f3447b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public animationInterpolatorC1106a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f3446a = new float[i];
        this.f3447b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.f3446a[i2] = fArr[0];
            this.f3447b[i2] = fArr[1];
        }
    }

    /* renamed from: a */
    private static Path m38492a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f3446a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f3446a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f3446a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f3447b[i];
        }
        float[] fArr2 = this.f3447b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public animationInterpolatorC1106a(float f, float f2, float f3, float f4) {
        this(m38492a(f, f2, f3, f4));
    }
}
