package p138hc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.google.zxing.C4407k;
import com.google.zxing.C4411o;
import java.io.ByteArrayOutputStream;

/* renamed from: hc.r */
/* loaded from: classes2.dex */
public class C5906r {

    /* renamed from: a */
    private C5901n f16354a;

    /* renamed from: b */
    private int f16355b;

    /* renamed from: c */
    private int f16356c;

    /* renamed from: d */
    private Rect f16357d;

    /* renamed from: e */
    private int f16358e = 1;

    /* renamed from: f */
    private boolean f16359f;

    public C5906r(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f16354a = new C5901n(bArr, i, i2);
        this.f16356c = i4;
        this.f16355b = i3;
        if (i * i2 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i + "x" + i2 + " > " + bArr.length);
    }

    /* renamed from: a */
    public C4407k m22774a() {
        C5901n m22793a = this.f16354a.m22786h(this.f16356c).m22793a(this.f16357d, this.f16358e);
        return new C4407k(m22793a.m22792b(), m22793a.m22790d(), m22793a.m22791c(), 0, 0, m22793a.m22790d(), m22793a.m22791c(), false);
    }

    /* renamed from: b */
    public Bitmap m22773b(Rect rect, int i) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f16354a.m22790d(), this.f16354a.m22791c());
        } else if (m22772c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f16354a.m22792b(), this.f16355b, this.f16354a.m22790d(), this.f16354a.m22791c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f16356c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.f16356c);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        }
        return decodeByteArray;
    }

    /* renamed from: c */
    public boolean m22772c() {
        return this.f16356c % 180 != 0;
    }

    /* renamed from: d */
    public void m22771d(Rect rect) {
        this.f16357d = rect;
    }

    /* renamed from: e */
    public void m22770e(boolean z) {
        this.f16359f = z;
    }

    /* renamed from: f */
    public C4411o m22769f(C4411o c4411o) {
        float m27640c = (c4411o.m27640c() * this.f16358e) + this.f16357d.left;
        float m27639d = (c4411o.m27639d() * this.f16358e) + this.f16357d.top;
        if (this.f16359f) {
            m27640c = this.f16354a.m22790d() - m27640c;
        }
        return new C4411o(m27640c, m27639d);
    }
}
