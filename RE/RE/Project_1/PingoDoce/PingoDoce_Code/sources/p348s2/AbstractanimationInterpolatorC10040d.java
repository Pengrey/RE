package p348s2;

import android.view.animation.Interpolator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s2.d  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
/* loaded from: classes.dex */
public abstract class AbstractanimationInterpolatorC10040d implements Interpolator {

    /* renamed from: a */
    private final float[] f26259a;

    /* renamed from: b */
    private final float f26260b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractanimationInterpolatorC10040d(float[] fArr) {
        this.f26259a = fArr;
        this.f26260b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f26259a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f26260b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f26259a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
