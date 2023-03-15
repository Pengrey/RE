package p422wb;

import com.google.zxing.C4411o;

/* renamed from: wb.c */
/* loaded from: classes2.dex */
public final class C11608c {

    /* renamed from: a */
    private final int f29686a;

    /* renamed from: b */
    private final int[] f29687b;

    /* renamed from: c */
    private final C4411o[] f29688c;

    public C11608c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f29686a = i;
        this.f29687b = iArr;
        float f = i4;
        this.f29688c = new C4411o[]{new C4411o(i2, f), new C4411o(i3, f)};
    }

    /* renamed from: a */
    public C4411o[] m4614a() {
        return this.f29688c;
    }

    /* renamed from: b */
    public int[] m4613b() {
        return this.f29687b;
    }

    /* renamed from: c */
    public int m4612c() {
        return this.f29686a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11608c) && this.f29686a == ((C11608c) obj).f29686a;
    }

    public int hashCode() {
        return this.f29686a;
    }
}
