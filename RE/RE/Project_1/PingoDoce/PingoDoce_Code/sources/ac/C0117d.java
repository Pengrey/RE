package ac;

/* renamed from: ac.d */
/* loaded from: classes2.dex */
final class C0117d {

    /* renamed from: a */
    private final int f279a;

    /* renamed from: b */
    private final int f280b;

    /* renamed from: c */
    private final int f281c;

    /* renamed from: d */
    private final int f282d;

    /* renamed from: e */
    private int f283e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0117d(int i, int i2, int i3, int i4) {
        this.f279a = i;
        this.f280b = i2;
        this.f281c = i3;
        this.f282d = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m41872a() {
        return this.f281c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m41871b() {
        return this.f280b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m41870c() {
        return this.f283e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m41869d() {
        return this.f279a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m41868e() {
        return this.f282d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m41867f() {
        return this.f280b - this.f279a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m41866g() {
        return m41865h(this.f283e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m41865h(int i) {
        return i != -1 && this.f281c == (i % 3) * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m41864i(int i) {
        this.f283e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m41863j() {
        this.f283e = ((this.f282d / 30) * 3) + (this.f281c / 3);
    }

    public String toString() {
        return this.f283e + "|" + this.f282d;
    }
}
