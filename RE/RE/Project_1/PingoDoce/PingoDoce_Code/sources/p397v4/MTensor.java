package p397v4;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc._Arrays;

/* renamed from: v4.a */
/* loaded from: classes.dex */
public final class MTensor {

    /* renamed from: d */
    public static final C11114a f28516d = new C11114a(null);

    /* renamed from: a */
    private int f28517a;

    /* renamed from: b */
    private float[] f28518b;

    /* renamed from: c */
    private int[] f28519c;

    /* compiled from: MTensor.kt */
    /* renamed from: v4.a$a */
    /* loaded from: classes.dex */
    public static final class C11114a {
        private C11114a() {
        }

        /* renamed from: a */
        public static final /* synthetic */ int m6103a(C11114a c11114a, int[] iArr) {
            return c11114a.m6102b(iArr);
        }

        /* renamed from: b */
        private final int m6102b(int[] iArr) {
            int m290D;
            int i = 1;
            if (!(iArr.length == 0)) {
                int i2 = iArr[0];
                m290D = _Arrays.m290D(iArr);
                if (1 <= m290D) {
                    while (true) {
                        i2 *= iArr[i];
                        if (i == m290D) {
                            break;
                        }
                        i++;
                    }
                }
                return i2;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }

        public /* synthetic */ C11114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MTensor(int[] iArr) {
        Intrinsics.isThisObjectNull(iArr, "shape");
        this.f28519c = iArr;
        int m6103a = C11114a.m6103a(f28516d, iArr);
        this.f28517a = m6103a;
        this.f28518b = new float[m6103a];
    }

    /* renamed from: a */
    public final float[] m6107a() {
        return this.f28518b;
    }

    /* renamed from: b */
    public final int m6106b(int i) {
        return this.f28519c[i];
    }

    /* renamed from: c */
    public final int m6105c() {
        return this.f28519c.length;
    }

    /* renamed from: d */
    public final void m6104d(int[] iArr) {
        Intrinsics.isThisObjectNull(iArr, "shape");
        this.f28519c = iArr;
        int m6103a = C11114a.m6103a(f28516d, iArr);
        float[] fArr = new float[m6103a];
        System.arraycopy(this.f28518b, 0, fArr, 0, Math.min(this.f28517a, m6103a));
        this.f28518b = fArr;
        this.f28517a = m6103a;
    }
}
