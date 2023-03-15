package p127h1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;

/* renamed from: h1.h0 */
/* loaded from: classes.dex */
public final class C5772h0 {

    /* renamed from: a */
    private static final long f16081a;

    /* compiled from: ScaleFactor.kt */
    /* renamed from: h1.h0$a */
    /* loaded from: classes.dex */
    public static final class C5773a {
        private C5773a() {
        }

        public /* synthetic */ C5773a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5773a(null);
        f16081a = C5775i0.m23111a(Float.NaN, Float.NaN);
    }

    /* renamed from: a */
    public static long m23119a(long j) {
        return j;
    }

    /* renamed from: b */
    public static final float m23118b(long j) {
        if (j != f16081a) {
            C6432f c6432f = C6432f.f17524a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: c */
    public static final float m23117c(long j) {
        if (j != f16081a) {
            C6432f c6432f = C6432f.f17524a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}
