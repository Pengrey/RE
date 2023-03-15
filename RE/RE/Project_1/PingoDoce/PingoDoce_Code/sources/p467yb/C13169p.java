package p467yb;

import com.google.zxing.FormatException;

/* renamed from: yb.p */
/* loaded from: classes2.dex */
final class C13169p extends AbstractC13170q {

    /* renamed from: b */
    private final int f34123b;

    /* renamed from: c */
    private final int f34124c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13169p(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 >= 0 && i2 <= 10 && i3 >= 0 && i3 <= 10) {
            this.f34123b = i2;
            this.f34124c = i3;
            return;
        }
        throw FormatException.m27702a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1496b() {
        return this.f34123b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1495c() {
        return this.f34124c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1494d() {
        return this.f34123b == 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m1493e() {
        return this.f34124c == 10;
    }
}
