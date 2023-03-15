package p120g8;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: g8.f */
/* loaded from: classes.dex */
public class C5621f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f15862a;

    public C5621f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f15862a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f15862a.set(imageView.getImageMatrix());
        return this.f15862a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
