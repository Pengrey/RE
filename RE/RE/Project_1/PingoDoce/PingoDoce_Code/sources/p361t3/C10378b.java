package p361t3;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import bd.InterfaceC1886d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p129h3.C5828f;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p327r3.AbstractC9797c;
import p327r3.C9796b;
import p327r3.C9805i;
import p327r3.EnumC9804h;
import p396v3.C11089a;
import p468yc.C13182l;
import p468yc.C13191r;

/* renamed from: t3.b */
/* loaded from: classes.dex */
public final class C10378b implements InterfaceC10379c {

    /* renamed from: a */
    private final float f26988a;

    /* renamed from: b */
    private final float f26989b;

    /* renamed from: c */
    private final float f26990c;

    /* renamed from: d */
    private final float f26991d;

    /* renamed from: e */
    private final String f26992e;

    public C10378b() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public C10378b(float f, float f2, float f3, float f4) {
        this.f26988a = f;
        this.f26989b = f2;
        this.f26990c = f3;
        this.f26991d = f4;
        if (f >= 0.0f && f2 >= 0.0f && f3 >= 0.0f && f4 >= 0.0f) {
            this.f26992e = C10378b.class.getName() + '-' + f + ',' + f2 + ',' + f3 + ',' + f4;
            return;
        }
        throw new IllegalArgumentException("All radii must be >= 0.".toString());
    }

    /* renamed from: c */
    private final C13182l m8091c(Bitmap bitmap, C9805i c9805i) {
        int m19531b;
        int m19531b2;
        if (C9796b.m9946a(c9805i)) {
            return C13191r.m1447a(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        }
        AbstractC9797c m9945a = c9805i.m9945a();
        AbstractC9797c m9944b = c9805i.m9944b();
        if ((m9945a instanceof AbstractC9797c.C9798a) && (m9944b instanceof AbstractC9797c.C9798a)) {
            return C13191r.m1447a(Integer.valueOf(((AbstractC9797c.C9798a) m9945a).f25738a), Integer.valueOf(((AbstractC9797c.C9798a) m9944b).f25738a));
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        AbstractC9797c m9942d = c9805i.m9942d();
        int i = m9942d instanceof AbstractC9797c.C9798a ? ((AbstractC9797c.C9798a) m9942d).f25738a : Integer.MIN_VALUE;
        AbstractC9797c m9943c = c9805i.m9943c();
        double m22969c = C5828f.m22969c(width, height, i, m9943c instanceof AbstractC9797c.C9798a ? ((AbstractC9797c.C9798a) m9943c).f25738a : Integer.MIN_VALUE, EnumC9804h.FILL);
        m19531b = C7037c.m19531b(bitmap.getWidth() * m22969c);
        m19531b2 = C7037c.m19531b(m22969c * bitmap.getHeight());
        return C13191r.m1447a(Integer.valueOf(m19531b), Integer.valueOf(m19531b2));
    }

    /* renamed from: a */
    public Object mo8090a(Bitmap bitmap, C9805i c9805i, InterfaceC1886d interfaceC1886d) {
        Paint paint = new Paint(3);
        C13182l m8091c = m8091c(bitmap, c9805i);
        int intValue = ((Number) m8091c.m1462a()).intValue();
        int intValue2 = ((Number) m8091c.m1461b()).intValue();
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, C11089a.m6174c(bitmap));
        Intrinsics.checkIfNull(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float m22969c = (float) C5828f.m22969c(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, EnumC9804h.FILL);
        float f = 2;
        matrix.setTranslate((intValue - (bitmap.getWidth() * m22969c)) / f, (intValue2 - (bitmap.getHeight() * m22969c)) / f);
        matrix.preScale(m22969c, m22969c);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f2 = this.f26988a;
        float f3 = this.f26989b;
        float f4 = this.f26991d;
        float f5 = this.f26990c;
        float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    /* renamed from: b */
    public String mo8089b() {
        return this.f26992e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10378b) {
            C10378b c10378b = (C10378b) obj;
            if (this.f26988a == c10378b.f26988a) {
                if (this.f26989b == c10378b.f26989b) {
                    if (this.f26990c == c10378b.f26990c) {
                        if (this.f26991d == c10378b.f26991d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f26988a) * 31) + Float.hashCode(this.f26989b)) * 31) + Float.hashCode(this.f26990c)) * 31) + Float.hashCode(this.f26991d);
    }

    public /* synthetic */ C10378b(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}
