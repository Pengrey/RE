package com.google.zxing.common.reedsolomon;

/* renamed from: com.google.zxing.common.reedsolomon.a */
/* loaded from: classes2.dex */
public final class C4395a {

    /* renamed from: h */
    public static final C4395a f11894h = new C4395a(4201, 4096, 1);

    /* renamed from: i */
    public static final C4395a f11895i = new C4395a(1033, 1024, 1);

    /* renamed from: j */
    public static final C4395a f11896j;

    /* renamed from: k */
    public static final C4395a f11897k;

    /* renamed from: l */
    public static final C4395a f11898l;

    /* renamed from: m */
    public static final C4395a f11899m;

    /* renamed from: n */
    public static final C4395a f11900n;

    /* renamed from: o */
    public static final C4395a f11901o;

    /* renamed from: a */
    private final int[] f11902a;

    /* renamed from: b */
    private final int[] f11903b;

    /* renamed from: c */
    private final C4396b f11904c;

    /* renamed from: d */
    private final C4396b f11905d;

    /* renamed from: e */
    private final int f11906e;

    /* renamed from: f */
    private final int f11907f;

    /* renamed from: g */
    private final int f11908g;

    static {
        C4395a c4395a = new C4395a(67, 64, 1);
        f11896j = c4395a;
        f11897k = new C4395a(19, 16, 1);
        f11898l = new C4395a(285, 256, 0);
        C4395a c4395a2 = new C4395a(301, 256, 1);
        f11899m = c4395a2;
        f11900n = c4395a2;
        f11901o = c4395a;
    }

    public C4395a(int i, int i2, int i3) {
        this.f11907f = i;
        this.f11906e = i2;
        this.f11908g = i3;
        this.f11902a = new int[i2];
        this.f11903b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f11902a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f11903b[this.f11902a[i6]] = i6;
        }
        this.f11904c = new C4396b(this, new int[]{0});
        this.f11905d = new C4396b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m27690a(int i, int i2) {
        return i ^ i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C4396b m27689b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f11904c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C4396b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m27688c(int i) {
        return this.f11902a[i];
    }

    /* renamed from: d */
    public int m27687d() {
        return this.f11908g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C4396b m27686e() {
        return this.f11905d;
    }

    /* renamed from: f */
    public int m27685f() {
        return this.f11906e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C4396b m27684g() {
        return this.f11904c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m27683h(int i) {
        if (i != 0) {
            return this.f11902a[(this.f11906e - this.f11903b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m27682i(int i) {
        if (i != 0) {
            return this.f11903b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m27681j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f11902a;
        int[] iArr2 = this.f11903b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f11906e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f11907f) + ',' + this.f11906e + ')';
    }
}
