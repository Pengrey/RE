package p122gc;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: gc.b */
/* loaded from: classes2.dex */
public final class C5634b {

    /* renamed from: a */
    private final byte[][] f15882a;

    /* renamed from: b */
    private final int f15883b;

    /* renamed from: c */
    private final int f15884c;

    public C5634b(int i, int i2) {
        this.f15882a = (byte[][]) Array.newInstance(byte.class, i2, i);
        this.f15883b = i;
        this.f15884c = i2;
    }

    /* renamed from: a */
    public void m23519a(byte b) {
        for (byte[] bArr : this.f15882a) {
            Arrays.fill(bArr, b);
        }
    }

    /* renamed from: b */
    public byte m23518b(int i, int i2) {
        return this.f15882a[i2][i];
    }

    /* renamed from: c */
    public byte[][] m23517c() {
        return this.f15882a;
    }

    /* renamed from: d */
    public int m23516d() {
        return this.f15884c;
    }

    /* renamed from: e */
    public int m23515e() {
        return this.f15883b;
    }

    /* renamed from: f */
    public void m23514f(int i, int i2, int i3) {
        this.f15882a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public void m23513g(int i, int i2, boolean z) {
        this.f15882a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f15883b * 2 * this.f15884c) + 2);
        for (int i = 0; i < this.f15884c; i++) {
            byte[] bArr = this.f15882a[i];
            for (int i2 = 0; i2 < this.f15883b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb2.append(" 0");
                } else if (b != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
