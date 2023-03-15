package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.v1 */
/* loaded from: classes.dex */
public final class C3910v1 {

    /* renamed from: a */
    private byte[] f11192a = new byte[4096];

    /* renamed from: b */
    private int f11193b;

    /* renamed from: c */
    private long f11194c;

    /* renamed from: d */
    private long f11195d;

    /* renamed from: e */
    private int f11196e;

    /* renamed from: f */
    private int f11197f;

    /* renamed from: g */
    private int f11198g;

    /* renamed from: h */
    private boolean f11199h;

    /* renamed from: i */
    private String f11200i;

    public C3910v1() {
        m28617e();
    }

    /* renamed from: a */
    private final int m28621a(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f11193b;
        if (i4 < i) {
            int min = Math.min(i3, i - i4);
            System.arraycopy(bArr, i2, this.f11192a, this.f11193b, min);
            int i5 = this.f11193b + min;
            this.f11193b = i5;
            if (i5 < i) {
                return -1;
            }
            return min;
        }
        return 0;
    }

    /* renamed from: b */
    public final int m28620b(byte[] bArr, int i, int i2) {
        int m28621a = m28621a(30, bArr, i, i2);
        if (m28621a != -1) {
            if (this.f11194c == -1) {
                long m28633e = C3902t1.m28633e(this.f11192a, 0);
                this.f11194c = m28633e;
                if (m28633e == 67324752) {
                    this.f11199h = false;
                    this.f11195d = C3902t1.m28633e(this.f11192a, 18);
                    this.f11198g = C3902t1.m28631g(this.f11192a, 8);
                    this.f11196e = C3902t1.m28631g(this.f11192a, 26);
                    int m28631g = this.f11196e + 30 + C3902t1.m28631g(this.f11192a, 28);
                    this.f11197f = m28631g;
                    int length = this.f11192a.length;
                    if (length < m28631g) {
                        do {
                            length += length;
                        } while (length < m28631g);
                        this.f11192a = Arrays.copyOf(this.f11192a, length);
                    }
                } else {
                    this.f11199h = true;
                }
            }
            int m28621a2 = m28621a(this.f11197f, bArr, i + m28621a, i2 - m28621a);
            if (m28621a2 == -1) {
                return -1;
            }
            int i3 = m28621a + m28621a2;
            if (!this.f11199h && this.f11200i == null) {
                this.f11200i = new String(this.f11192a, 30, this.f11196e);
            }
            return i3;
        }
        return -1;
    }

    /* renamed from: c */
    public final C3887p2 m28619c() {
        int i = this.f11193b;
        int i2 = this.f11197f;
        if (i < i2) {
            return C3887p2.m28666a(this.f11200i, this.f11195d, this.f11198g, true, Arrays.copyOf(this.f11192a, i), this.f11199h);
        }
        C3887p2 m28666a = C3887p2.m28666a(this.f11200i, this.f11195d, this.f11198g, false, Arrays.copyOf(this.f11192a, i2), this.f11199h);
        m28617e();
        return m28666a;
    }

    /* renamed from: d */
    public final int m28618d() {
        return this.f11197f;
    }

    /* renamed from: e */
    public final void m28617e() {
        this.f11193b = 0;
        this.f11196e = -1;
        this.f11194c = -1L;
        this.f11199h = false;
        this.f11197f = 30;
        this.f11195d = -1L;
        this.f11198g = -1;
        this.f11200i = null;
    }
}
