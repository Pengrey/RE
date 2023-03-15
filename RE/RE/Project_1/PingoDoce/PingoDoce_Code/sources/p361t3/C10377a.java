package p361t3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import bd.InterfaceC1886d;
import p181jd.Intrinsics;
import p327r3.C9805i;
import p396v3.C11089a;

/* renamed from: t3.a */
/* loaded from: classes.dex */
public final class C10377a implements InterfaceC10379c {

    /* renamed from: a */
    private final String f26987a = C10377a.class.getName();

    /* renamed from: a */
    public Object mo8090a(Bitmap bitmap, C9805i c9805i, InterfaceC1886d interfaceC1886d) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = min / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(min, min, C11089a.m6174c(bitmap));
        Intrinsics.checkIfNull(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2.0f), f - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }

    /* renamed from: b */
    public String mo8089b() {
        return this.f26987a;
    }

    public boolean equals(Object obj) {
        return obj instanceof C10377a;
    }

    public int hashCode() {
        return C10377a.class.hashCode();
    }
}
