package tc;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: tc.a */
/* loaded from: classes2.dex */
public final class Circle implements InterfaceC10475c {

    /* renamed from: d */
    private static final long f27179d;

    /* renamed from: e */
    private static final DecelerateInterpolator f27180e;

    /* renamed from: a */
    private final float f27181a;

    /* renamed from: b */
    private final long f27182b;

    /* renamed from: c */
    private final TimeInterpolator f27183c;

    /* compiled from: Circle.kt */
    /* renamed from: tc.a$a */
    /* loaded from: classes2.dex */
    public static final class C10473a {
        private C10473a() {
        }

        public /* synthetic */ C10473a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10473a(null);
        f27179d = TimeUnit.MILLISECONDS.toMillis(500L);
        f27180e = new DecelerateInterpolator(2.0f);
    }

    public Circle(float f, long j, TimeInterpolator timeInterpolator) {
        Intrinsics.isThisObjectNull(timeInterpolator, "interpolator");
        this.f27181a = f;
        this.f27182b = j;
        this.f27183c = timeInterpolator;
    }

    /* renamed from: a */
    public long mo7933a() {
        return this.f27182b;
    }

    /* renamed from: b */
    public TimeInterpolator mo7932b() {
        return this.f27183c;
    }

    /* renamed from: c */
    public void mo7931c(Canvas canvas, PointF pointF, float f, Paint paint) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        Intrinsics.isThisObjectNull(pointF, "point");
        Intrinsics.isThisObjectNull(paint, "paint");
        canvas.drawCircle(pointF.x, pointF.y, f * this.f27181a, paint);
    }

    public /* synthetic */ Circle(float f, long j, TimeInterpolator timeInterpolator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? f27179d : j, (i & 4) != 0 ? f27180e : timeInterpolator);
    }
}
