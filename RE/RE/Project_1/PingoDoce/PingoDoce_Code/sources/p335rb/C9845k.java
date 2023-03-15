package p335rb;

import androidx.constraintlayout.widget.C0868i;
import com.google.zxing.C4400e;

/* renamed from: rb.k */
/* loaded from: classes2.dex */
public class C9845k {

    /* renamed from: i */
    private static C9845k[] f25794i = {new C9845k(false, 3, 5, 8, 8, 1), new C9845k(false, 5, 7, 10, 10, 1), new C9845k(true, 5, 7, 16, 6, 1), new C9845k(false, 8, 10, 12, 12, 1), new C9845k(true, 10, 11, 14, 6, 2), new C9845k(false, 12, 12, 14, 14, 1), new C9845k(true, 16, 14, 24, 10, 1), new C9845k(false, 18, 14, 16, 16, 1), new C9845k(false, 22, 18, 18, 18, 1), new C9845k(true, 22, 18, 16, 10, 2), new C9845k(false, 30, 20, 20, 20, 1), new C9845k(true, 32, 24, 16, 14, 2), new C9845k(false, 36, 24, 22, 22, 1), new C9845k(false, 44, 28, 24, 24, 1), new C9845k(true, 49, 28, 22, 14, 2), new C9845k(false, 62, 36, 14, 14, 4), new C9845k(false, 86, 42, 16, 16, 4), new C9845k(false, 114, 48, 18, 18, 4), new C9845k(false, 144, 56, 20, 20, 4), new C9845k(false, 174, 68, 22, 22, 4), new C9845k(false, 204, 84, 24, 24, 4, C0868i.f2748C0, 42), new C9845k(false, 280, 112, 14, 14, 16, 140, 56), new C9845k(false, 368, 144, 16, 16, 16, 92, 36), new C9845k(false, 456, 192, 18, 18, 16, 114, 48), new C9845k(false, 576, 224, 20, 20, 16, 144, 56), new C9845k(false, 696, 272, 22, 22, 16, 174, 68), new C9845k(false, 816, 336, 24, 24, 16, 136, 56), new C9845k(false, 1050, 408, 18, 18, 36, 175, 68), new C9845k(false, 1304, 496, 20, 20, 36, 163, 62), new C9838d()};

    /* renamed from: a */
    private final boolean f25795a;

    /* renamed from: b */
    private final int f25796b;

    /* renamed from: c */
    private final int f25797c;

    /* renamed from: d */
    public final int f25798d;

    /* renamed from: e */
    public final int f25799e;

    /* renamed from: f */
    private final int f25800f;

    /* renamed from: g */
    private final int f25801g;

    /* renamed from: h */
    private final int f25802h;

    public C9845k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: e */
    private int m9841e() {
        int i = this.f25800f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i != 16) {
                    if (i == 36) {
                        return 6;
                    }
                    throw new IllegalStateException("Cannot handle this number of data regions");
                }
                return 4;
            }
        }
        return i2;
    }

    /* renamed from: k */
    private int m9835k() {
        int i = this.f25800f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i != 4) {
            if (i != 16) {
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
            return 4;
        }
        return 2;
    }

    /* renamed from: l */
    public static C9845k m9834l(int i, EnumC9846l enumC9846l, C4400e c4400e, C4400e c4400e2, boolean z) {
        C9845k[] c9845kArr;
        for (C9845k c9845k : f25794i) {
            if (!(enumC9846l == EnumC9846l.FORCE_SQUARE && c9845k.f25795a) && ((enumC9846l != EnumC9846l.FORCE_RECTANGLE || c9845k.f25795a) && ((c4400e == null || (c9845k.m9836j() >= c4400e.m27663b() && c9845k.m9837i() >= c4400e.m27664a())) && ((c4400e2 == null || (c9845k.m9836j() <= c4400e2.m27663b() && c9845k.m9837i() <= c4400e2.m27664a())) && i <= c9845k.f25796b)))) {
                return c9845k;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
        }
        return null;
    }

    /* renamed from: a */
    public final int m9845a() {
        return this.f25796b;
    }

    /* renamed from: b */
    public int mo9844b(int i) {
        return this.f25801g;
    }

    /* renamed from: c */
    public final int m9843c() {
        return this.f25797c;
    }

    /* renamed from: d */
    public final int m9842d(int i) {
        return this.f25802h;
    }

    /* renamed from: f */
    public int mo9840f() {
        return this.f25796b / this.f25801g;
    }

    /* renamed from: g */
    public final int m9839g() {
        return m9835k() * this.f25799e;
    }

    /* renamed from: h */
    public final int m9838h() {
        return m9841e() * this.f25798d;
    }

    /* renamed from: i */
    public final int m9837i() {
        return m9839g() + (m9835k() << 1);
    }

    /* renamed from: j */
    public final int m9836j() {
        return m9838h() + (m9841e() << 1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25795a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f25798d);
        sb2.append('x');
        sb2.append(this.f25799e);
        sb2.append(", symbol size ");
        sb2.append(m9836j());
        sb2.append('x');
        sb2.append(m9837i());
        sb2.append(", symbol data size ");
        sb2.append(m9838h());
        sb2.append('x');
        sb2.append(m9839g());
        sb2.append(", codewords ");
        sb2.append(this.f25796b);
        sb2.append('+');
        sb2.append(this.f25797c);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9845k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f25795a = z;
        this.f25796b = i;
        this.f25797c = i2;
        this.f25798d = i3;
        this.f25799e = i4;
        this.f25800f = i5;
        this.f25801g = i6;
        this.f25802h = i7;
    }
}
