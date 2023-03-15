package p039c3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: c3.h */
/* loaded from: classes.dex */
class C2024h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f5866a;

    /* renamed from: b */
    private final PathMeasure f5867b;

    /* renamed from: c */
    private final float f5868c;

    /* renamed from: d */
    private final float[] f5869d;

    /* renamed from: e */
    private final PointF f5870e;

    /* renamed from: f */
    private float f5871f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2024h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f5869d = new float[2];
        this.f5870e = new PointF();
        this.f5866a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f5867b = pathMeasure;
        this.f5868c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f5871f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(T t, Float f) {
        this.f5871f = f.floatValue();
        this.f5867b.getPosTan(this.f5868c * f.floatValue(), this.f5869d, null);
        PointF pointF = this.f5870e;
        float[] fArr = this.f5869d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f5866a.set(t, pointF);
    }
}
