package p032bc;

/* renamed from: bc.b */
/* loaded from: classes2.dex */
public final class C1878b {

    /* renamed from: f */
    public static final C1878b f5601f = new C1878b(929, 3);

    /* renamed from: a */
    private final int[] f5602a;

    /* renamed from: b */
    private final int[] f5603b;

    /* renamed from: c */
    private final C1879c f5604c;

    /* renamed from: d */
    private final C1879c f5605d;

    /* renamed from: e */
    private final int f5606e;

    private C1878b(int i, int i2) {
        this.f5606e = i;
        this.f5602a = new int[i];
        this.f5603b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f5602a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f5603b[this.f5602a[i5]] = i5;
        }
        this.f5604c = new C1879c(this, new int[]{0});
        this.f5605d = new C1879c(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m35218a(int i, int i2) {
        return (i + i2) % this.f5606e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C1879c m35217b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f5604c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C1879c(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m35216c(int i) {
        return this.f5602a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C1879c m35215d() {
        return this.f5605d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m35214e() {
        return this.f5606e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C1879c m35213f() {
        return this.f5604c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m35212g(int i) {
        if (i != 0) {
            return this.f5602a[(this.f5606e - this.f5603b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m35211h(int i) {
        if (i != 0) {
            return this.f5603b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m35210i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f5602a;
        int[] iArr2 = this.f5603b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f5606e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m35209j(int i, int i2) {
        int i3 = this.f5606e;
        return ((i + i3) - i2) % i3;
    }
}
