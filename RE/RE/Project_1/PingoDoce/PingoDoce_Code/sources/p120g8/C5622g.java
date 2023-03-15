package p120g8;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: g8.g */
/* loaded from: classes.dex */
public class C5622g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f15863a = new float[9];

    /* renamed from: b */
    private final float[] f15864b = new float[9];

    /* renamed from: c */
    private final Matrix f15865c = new Matrix();

    /* renamed from: a */
    public Matrix mo23553a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f15863a);
        matrix2.getValues(this.f15864b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f15864b;
            float f2 = fArr[i];
            float[] fArr2 = this.f15863a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f15865c.setValues(this.f15864b);
        return this.f15865c;
    }
}
