package p063dc;

import java.lang.reflect.Array;

/* renamed from: dc.a */
/* loaded from: classes2.dex */
public final class C4775a {

    /* renamed from: a */
    private final C4776b[] f13076a;

    /* renamed from: b */
    private int f13077b;

    /* renamed from: c */
    private final int f13078c;

    /* renamed from: d */
    private final int f13079d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4775a(int i, int i2) {
        C4776b[] c4776bArr = new C4776b[i];
        this.f13076a = c4776bArr;
        int length = c4776bArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f13076a[i3] = new C4776b(((i2 + 4) * 17) + 1);
        }
        this.f13079d = i2 * 17;
        this.f13078c = i;
        this.f13077b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C4776b m26650a() {
        return this.f13076a[this.f13077b];
    }

    /* renamed from: b */
    public byte[][] m26649b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, this.f13078c * i2, this.f13079d * i);
        int i3 = this.f13078c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f13076a[i4 / i2].m26646b(i);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m26648c() {
        this.f13077b++;
    }
}
