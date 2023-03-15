package p393v0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import p181jd.Intrinsics;
import p393v0.C11012e1;
import p393v0.C11018f1;

/* compiled from: AndroidPaint.android.kt */
/* renamed from: v0.i */
/* loaded from: classes.dex */
public final class C11028i {

    /* compiled from: AndroidPaint.android.kt */
    /* renamed from: v0.i$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11029a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28381a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28382b;

        static {
            new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
            int[] iArr = new int[Paint.Cap.values().length];
            iArr[Paint.Cap.BUTT.ordinal()] = 1;
            iArr[Paint.Cap.ROUND.ordinal()] = 2;
            iArr[Paint.Cap.SQUARE.ordinal()] = 3;
            f28381a = iArr;
            int[] iArr2 = new int[Paint.Join.values().length];
            iArr2[Paint.Join.MITER.ordinal()] = 1;
            iArr2[Paint.Join.BEVEL.ordinal()] = 2;
            iArr2[Paint.Join.ROUND.ordinal()] = 3;
            f28382b = iArr2;
        }
    }

    /* renamed from: a */
    public static final InterfaceC11046o0 m6475a() {
        return new C11024h();
    }

    /* renamed from: b */
    public static final float m6474b(Paint paint) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    /* renamed from: c */
    public static final long m6473c(Paint paint) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        return C11003c0.m6594b(paint.getColor());
    }

    /* renamed from: d */
    public static final int m6472d(Paint paint) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return C11007d0.f28337a.m6555b();
        }
        return C11007d0.f28337a.m6556a();
    }

    /* renamed from: e */
    public static final int m6471e(Paint paint) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : C11029a.f28381a[strokeCap.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return C11012e1.f28346b.m6537a();
                }
                return C11012e1.f28346b.m6535c();
            }
            return C11012e1.f28346b.m6536b();
        }
        return C11012e1.f28346b.m6537a();
    }

    /* renamed from: f */
    public static final int m6470f(Paint paint) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : C11029a.f28382b[strokeJoin.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return C11018f1.f28366b.m6513b();
                }
                return C11018f1.f28366b.m6512c();
            }
            return C11018f1.f28366b.m6514a();
        }
        return C11018f1.f28366b.m6513b();
    }

    /* renamed from: g */
    public static final float m6469g(Paint paint) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        return paint.getStrokeMiter();
    }

    /* renamed from: h */
    public static final float m6468h(Paint paint) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        return paint.getStrokeWidth();
    }

    /* renamed from: i */
    public static final Paint m6467i() {
        return new Paint(7);
    }

    /* renamed from: j */
    public static final void m6466j(Paint paint, float f) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    /* renamed from: k */
    public static final void m6465k(Paint paint, int i) {
        Intrinsics.isThisObjectNull(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            C11032i1.f28389a.m6442a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C10993a.m6660b(i)));
        }
    }

    /* renamed from: l */
    public static final void m6464l(Paint paint, long j) {
        Intrinsics.isThisObjectNull(paint, "$this$setNativeColor");
        paint.setColor(C11003c0.m6587i(j));
    }

    /* renamed from: m */
    public static final void m6463m(Paint paint, ColorFilter colorFilter) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        paint.setColorFilter(colorFilter == null ? null : C11006d.m6563b(colorFilter));
    }

    /* renamed from: n */
    public static final void m6462n(Paint paint, int i) {
        Intrinsics.isThisObjectNull(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!C11007d0.m6559d(i, C11007d0.f28337a.m6555b()));
    }

    /* renamed from: o */
    public static final void m6461o(Paint paint, InterfaceC11056r0 interfaceC11056r0) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        C11034k c11034k = (C11034k) interfaceC11056r0;
        paint.setPathEffect(c11034k == null ? null : c11034k.m6437a());
    }

    /* renamed from: p */
    public static final void m6460p(Paint paint, Shader shader) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: q */
    public static final void m6459q(Paint paint, int i) {
        Paint.Cap cap;
        Intrinsics.isThisObjectNull(paint, "$this$setNativeStrokeCap");
        C11012e1.C11013a c11013a = C11012e1.f28346b;
        if (C11012e1.m6541g(i, c11013a.m6535c())) {
            cap = Paint.Cap.SQUARE;
        } else if (C11012e1.m6541g(i, c11013a.m6536b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = C11012e1.m6541g(i, c11013a.m6537a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: r */
    public static final void m6458r(Paint paint, int i) {
        Paint.Join join;
        Intrinsics.isThisObjectNull(paint, "$this$setNativeStrokeJoin");
        C11018f1.C11019a c11019a = C11018f1.f28366b;
        if (C11018f1.m6518g(i, c11019a.m6513b())) {
            join = Paint.Join.MITER;
        } else if (C11018f1.m6518g(i, c11019a.m6514a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = C11018f1.m6518g(i, c11019a.m6512c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    /* renamed from: s */
    public static final void m6457s(Paint paint, float f) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    /* renamed from: t */
    public static final void m6456t(Paint paint, float f) {
        Intrinsics.isThisObjectNull(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: u */
    public static final void m6455u(Paint paint, int i) {
        Intrinsics.isThisObjectNull(paint, "$this$setNativeStyle");
        paint.setStyle(C11049p0.m6320d(i, C11049p0.f28431a.m6318b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
