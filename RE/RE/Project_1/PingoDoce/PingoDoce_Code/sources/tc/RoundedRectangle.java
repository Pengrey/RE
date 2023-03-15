package tc;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: tc.b */
/* loaded from: classes2.dex */
public final class RoundedRectangle implements InterfaceC10475c {

    /* renamed from: f */
    private static final long f27184f;

    /* renamed from: g */
    private static final DecelerateInterpolator f27185g;

    /* renamed from: a */
    private final float f27186a;

    /* renamed from: b */
    private final float f27187b;

    /* renamed from: c */
    private final float f27188c;

    /* renamed from: d */
    private final long f27189d;

    /* renamed from: e */
    private final TimeInterpolator f27190e;

    /* compiled from: RoundedRectangle.kt */
    /* renamed from: tc.b$a */
    /* loaded from: classes2.dex */
    public static final class C10474a {
        private C10474a() {
        }

        public /* synthetic */ C10474a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10474a(null);
        f27184f = TimeUnit.MILLISECONDS.toMillis(500L);
        f27185g = new DecelerateInterpolator(2.0f);
    }

    public RoundedRectangle(float f, float f2, float f3, long j, TimeInterpolator timeInterpolator) {
        Intrinsics.isThisObjectNull(timeInterpolator, "interpolator");
        this.f27186a = f;
        this.f27187b = f2;
        this.f27188c = f3;
        this.f27189d = j;
        this.f27190e = timeInterpolator;
    }

    /* renamed from: a */
    public long mo7933a() {
        return this.f27189d;
    }

    /* renamed from: b */
    public TimeInterpolator mo7932b() {
        return this.f27190e;
    }

    /* renamed from: c */
    public void mo7931c(Canvas canvas, PointF pointF, float f, Paint paint) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        Intrinsics.isThisObjectNull(pointF, "point");
        Intrinsics.isThisObjectNull(paint, "paint");
        float f2 = 2;
        float f3 = (this.f27187b / f2) * f;
        float f4 = (this.f27186a / f2) * f;
        float f5 = pointF.x;
        float f6 = pointF.y;
        RectF rectF = new RectF(f5 - f3, f6 - f4, f5 + f3, f6 + f4);
        float f7 = this.f27188c;
        canvas.drawRoundRect(rectF, f7, f7, paint);
    }

    public /* synthetic */ RoundedRectangle(float f, float f2, float f3, long j, TimeInterpolator timeInterpolator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, (i & 8) != 0 ? f27184f : j, (i & 16) != 0 ? f27185g : timeInterpolator);
    }
}
