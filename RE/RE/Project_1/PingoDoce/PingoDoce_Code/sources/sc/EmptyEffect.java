package sc;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: sc.b */
/* loaded from: classes2.dex */
public final class EmptyEffect implements InterfaceC10145a {

    /* renamed from: d */
    private static final long f26458d;

    /* renamed from: e */
    private static final LinearInterpolator f26459e;

    /* renamed from: a */
    private final long f26460a;

    /* renamed from: b */
    private final TimeInterpolator f26461b;

    /* renamed from: c */
    private final int f26462c;

    /* compiled from: EmptyEffect.kt */
    /* renamed from: sc.b$a */
    /* loaded from: classes2.dex */
    public static final class C10146a {
        private C10146a() {
        }

        public /* synthetic */ C10146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10146a(null);
        f26458d = TimeUnit.MILLISECONDS.toMillis(0L);
        f26459e = new LinearInterpolator();
    }

    public EmptyEffect(long j, TimeInterpolator timeInterpolator, int i) {
        Intrinsics.isThisObjectNull(timeInterpolator, "interpolator");
        this.f26460a = j;
        this.f26461b = timeInterpolator;
        this.f26462c = i;
    }

    /* renamed from: a */
    public long mo9058a() {
        return this.f26460a;
    }

    /* renamed from: b */
    public TimeInterpolator mo9057b() {
        return this.f26461b;
    }

    /* renamed from: c */
    public void mo9056c(Canvas canvas, PointF pointF, float f, Paint paint) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        Intrinsics.isThisObjectNull(pointF, "point");
        Intrinsics.isThisObjectNull(paint, "paint");
    }

    /* renamed from: d */
    public int mo9055d() {
        return this.f26462c;
    }

    public /* synthetic */ EmptyEffect(long j, TimeInterpolator timeInterpolator, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? f26458d : j, (i2 & 2) != 0 ? f26459e : timeInterpolator, (i2 & 4) != 0 ? 2 : i);
    }
}
