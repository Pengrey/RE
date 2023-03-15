package p130h4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import com.airbnb.lottie.C2199c;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p436x3.C12282s;
import p459y3.C13086c;

/* renamed from: h4.h */
/* loaded from: classes.dex */
public final class C5852h {

    /* renamed from: a */
    private static final ThreadLocal<PathMeasure> f16270a = new C5853a();

    /* renamed from: b */
    private static final ThreadLocal<Path> f16271b = new C5854b();

    /* renamed from: c */
    private static final ThreadLocal<Path> f16272c = new C5855c();

    /* renamed from: d */
    private static final ThreadLocal<float[]> f16273d = new C5856d();

    /* renamed from: e */
    private static final float f16274e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f */
    private static float f16275f = -1.0f;

    /* compiled from: Utils.java */
    /* renamed from: h4.h$a */
    /* loaded from: classes.dex */
    class C5853a extends ThreadLocal<PathMeasure> {
        C5853a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: h4.h$b */
    /* loaded from: classes.dex */
    class C5854b extends ThreadLocal<Path> {
        C5854b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: h4.h$c */
    /* loaded from: classes.dex */
    class C5855c extends ThreadLocal<Path> {
        C5855c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: h4.h$d */
    /* loaded from: classes.dex */
    class C5856d extends ThreadLocal<float[]> {
        C5856d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m22890a(Path path, float f, float f2, float f3) {
        C2199c.m34435a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f16270a.get();
        Path path2 = f16271b.get();
        Path path3 = f16272c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C2199c.m34434b("applyTrimPathIfNeeded");
        } else if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = C5851g.m22897g(min, length);
                max = C5851g.m22897g(max, length);
            }
            if (min < 0.0f) {
                min = C5851g.m22897g(min, length);
            }
            if (max < 0.0f) {
                max = C5851g.m22897g(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C2199c.m34434b("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C2199c.m34434b("applyTrimPathIfNeeded");
        } else {
            C2199c.m34434b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m22889b(Path path, C12282s c12282s) {
        if (c12282s == null || c12282s.m3138l()) {
            return;
        }
        m22890a(path, ((C13086c) c12282s.m3140j()).m1668p() / 100.0f, ((C13086c) c12282s.m3142h()).m1668p() / 100.0f, ((C13086c) c12282s.m3141i()).m1668p() / 360.0f);
    }

    /* renamed from: c */
    public static void m22888c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m22887d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: e */
    public static float m22886e() {
        if (f16275f == -1.0f) {
            f16275f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f16275f;
    }

    /* renamed from: f */
    public static float m22885f(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m22884g(Matrix matrix) {
        float[] fArr = f16273d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f16274e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* renamed from: h */
    public static boolean m22883h(Matrix matrix) {
        float[] fArr = f16273d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    /* renamed from: i */
    public static int m22882i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* renamed from: j */
    public static boolean m22881j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m22880k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m22879l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m22878m(Canvas canvas, RectF rectF, Paint paint) {
        m22877n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m22877n(Canvas canvas, RectF rectF, Paint paint, int i) {
        C2199c.m34435a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C2199c.m34434b("Utils#saveLayer");
    }
}
