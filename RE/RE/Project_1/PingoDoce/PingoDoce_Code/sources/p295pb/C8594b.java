package p295pb;

import p295pb.C8599e;

/* renamed from: pb.b */
/* loaded from: classes2.dex */
final class C8594b {

    /* renamed from: a */
    private final int f22198a;

    /* renamed from: b */
    private final byte[] f22199b;

    private C8594b(int i, byte[] bArr) {
        this.f22198a = i;
        this.f22199b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C8594b[] m15065b(byte[] bArr, C8599e c8599e) {
        C8599e.C8602c m15049d = c8599e.m15049d();
        C8599e.C8601b[] m15041a = m15049d.m15041a();
        int i = 0;
        for (C8599e.C8601b c8601b : m15041a) {
            i += c8601b.m15043a();
        }
        C8594b[] c8594bArr = new C8594b[i];
        int i2 = 0;
        for (C8599e.C8601b c8601b2 : m15041a) {
            int i3 = 0;
            while (i3 < c8601b2.m15043a()) {
                int m15042b = c8601b2.m15042b();
                c8594bArr[i2] = new C8594b(m15042b, new byte[m15049d.m15040b() + m15042b]);
                i3++;
                i2++;
            }
        }
        int length = c8594bArr[0].f22199b.length - m15049d.m15040b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                c8594bArr[i7].f22199b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = c8599e.m15044i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            c8594bArr[i9].f22199b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = c8594bArr[0].f22199b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                c8594bArr[i11].f22199b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return c8594bArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m15066a() {
        return this.f22199b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m15064c() {
        return this.f22198a;
    }
}
