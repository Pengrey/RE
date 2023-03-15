package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: v0.b0 */
/* loaded from: classes.dex */
public final class ColorFilter {

    /* renamed from: b */
    public static final C11000a f28316b = new C11000a(null);

    /* renamed from: a */
    private final android.graphics.ColorFilter f28317a;

    /* compiled from: ColorFilter.kt */
    /* renamed from: v0.b0$a */
    /* loaded from: classes.dex */
    public static final class C11000a {
        private C11000a() {
        }

        public /* synthetic */ C11000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ ColorFilter m6600b(C11000a c11000a, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = C11047p.f28401a.m6324z();
            }
            return c11000a.m6601a(j, i);
        }

        /* renamed from: a */
        public final ColorFilter m6601a(long j, int i) {
            return C11006d.m6564a(j, i);
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        Intrinsics.isThisObjectNull(colorFilter, "nativeColorFilter");
        this.f28317a = colorFilter;
    }

    /* renamed from: a */
    public final android.graphics.ColorFilter m6602a() {
        return this.f28317a;
    }
}
