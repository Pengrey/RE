package sc;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: sc.c */
/* loaded from: classes2.dex */
public final class RippleEffect implements InterfaceC10145a {

    /* renamed from: g */
    private static final long f26463g;

    /* renamed from: h */
    private static final DecelerateInterpolator f26464h;

    /* renamed from: a */
    private final float f26465a;

    /* renamed from: b */
    private final float f26466b;

    /* renamed from: c */
    private final int f26467c;

    /* renamed from: d */
    private final long f26468d;

    /* renamed from: e */
    private final TimeInterpolator f26469e;

    /* renamed from: f */
    private final int f26470f;

    /* compiled from: RippleEffect.kt */
    /* renamed from: sc.c$a */
    /* loaded from: classes2.dex */
    public static final class C10147a {
        private C10147a() {
        }

        public /* synthetic */ C10147a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10147a(null);
        f26463g = TimeUnit.MILLISECONDS.toMillis(1000L);
        f26464h = new DecelerateInterpolator(1.0f);
    }

    public RippleEffect(float f, float f2, int i, long j, TimeInterpolator timeInterpolator, int i2) {
        Intrinsics.isThisObjectNull(timeInterpolator, "interpolator");
        this.f26465a = f;
        this.f26466b = f2;
        this.f26467c = i;
        this.f26468d = j;
        this.f26469e = timeInterpolator;
        this.f26470f = i2;
        if (!(f < f2)) {
            throw new IllegalArgumentException("holeRadius should be bigger than rippleRadius.".toString());
        }
    }

    /* renamed from: a */
    public long mo9058a() {
        return this.f26468d;
    }

    /* renamed from: b */
    public TimeInterpolator mo9057b() {
        return this.f26469e;
    }

    /* renamed from: c */
    public void mo9056c(Canvas canvas, PointF pointF, float f, Paint paint) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        Intrinsics.isThisObjectNull(pointF, "point");
        Intrinsics.isThisObjectNull(paint, "paint");
        float f2 = this.f26465a;
        float f3 = f2 + ((this.f26466b - f2) * f);
        float f4 = 255;
        paint.setColor(this.f26467c);
        paint.setAlpha((int) (f4 - (f * f4)));
        canvas.drawCircle(pointF.x, pointF.y, f3, paint);
    }

    /* renamed from: d */
    public int mo9055d() {
        return this.f26470f;
    }

    public /* synthetic */ RippleEffect(float f, float f2, int i, long j, TimeInterpolator timeInterpolator, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, (i3 & 8) != 0 ? f26463g : j, (i3 & 16) != 0 ? f26464h : timeInterpolator, (i3 & 32) != 0 ? 2 : i2);
    }
}
