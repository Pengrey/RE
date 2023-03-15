package p092f0;

import java.util.Arrays;
import p181jd.Intrinsics;

/* renamed from: f0.d0 */
/* loaded from: classes.dex */
public final class C5160d0 {

    /* renamed from: a */
    private int[] f14251a = new int[10];

    /* renamed from: b */
    private int f14252b;

    /* renamed from: a */
    public final void m25506a() {
        this.f14252b = 0;
    }

    /* renamed from: b */
    public final int m25505b() {
        return this.f14252b;
    }

    /* renamed from: c */
    public final boolean m25504c() {
        return this.f14252b == 0;
    }

    /* renamed from: d */
    public final int m25503d() {
        return this.f14251a[this.f14252b - 1];
    }

    /* renamed from: e */
    public final int m25502e(int i) {
        return this.f14252b > 0 ? m25503d() : i;
    }

    /* renamed from: f */
    public final int m25501f() {
        int[] iArr = this.f14251a;
        int i = this.f14252b - 1;
        this.f14252b = i;
        return iArr[i];
    }

    /* renamed from: g */
    public final void m25500g(int i) {
        int i2 = this.f14252b;
        int[] iArr = this.f14251a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            this.f14251a = copyOf;
        }
        int[] iArr2 = this.f14251a;
        int i3 = this.f14252b;
        this.f14252b = i3 + 1;
        iArr2[i3] = i;
    }
}
