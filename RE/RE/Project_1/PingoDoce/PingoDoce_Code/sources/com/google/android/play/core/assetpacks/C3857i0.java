package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.i0 */
/* loaded from: classes.dex */
final class C3857i0 extends FilterInputStream {

    /* renamed from: A */
    private boolean f10985A;

    /* renamed from: w */
    private final C3910v1 f10986w;

    /* renamed from: x */
    private byte[] f10987x;

    /* renamed from: y */
    private long f10988y;

    /* renamed from: z */
    private boolean f10989z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3857i0(InputStream inputStream) {
        super(inputStream);
        this.f10986w = new C3910v1();
        this.f10987x = new byte[4096];
        this.f10989z = false;
        this.f10985A = false;
    }

    /* renamed from: a */
    private final int m28744a(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* renamed from: e */
    private final boolean m28742e(int i) throws IOException {
        int m28744a = m28744a(this.f10987x, 0, i);
        if (m28744a != i) {
            int i2 = i - m28744a;
            if (m28744a(this.f10987x, m28744a, i2) != i2) {
                this.f10986w.m28620b(this.f10987x, 0, m28744a);
                return false;
            }
        }
        this.f10986w.m28620b(this.f10987x, 0, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3887p2 m28743c() throws IOException {
        byte[] bArr;
        if (this.f10988y <= 0) {
            if (this.f10989z) {
            }
            return new C3887p2(null, -1L, -1, false, false, null);
        }
        do {
            bArr = this.f10987x;
        } while (read(bArr, 0, bArr.length) != -1);
        if (!this.f10989z || this.f10985A) {
            return new C3887p2(null, -1L, -1, false, false, null);
        }
        if (!m28742e(30)) {
            this.f10989z = true;
            return this.f10986w.m28619c();
        }
        C3887p2 m28619c = this.f10986w.m28619c();
        if (m28619c.m28659h()) {
            this.f10985A = true;
            return m28619c;
        } else if (m28619c.m28662e() != 4294967295L) {
            int m28618d = this.f10986w.m28618d() - 30;
            long j = m28618d;
            int length = this.f10987x.length;
            if (j > length) {
                do {
                    length += length;
                } while (length < j);
                this.f10987x = Arrays.copyOf(this.f10987x, length);
            }
            if (!m28742e(m28618d)) {
                this.f10989z = true;
                return this.f10986w.m28619c();
            }
            C3887p2 m28619c2 = this.f10986w.m28619c();
            this.f10988y = m28619c2.m28662e();
            return m28619c2;
        } else {
            throw new C3893r0("Files bigger than 4GiB are not supported.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean m28741h() {
        return this.f10989z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f10988y;
        if (j <= 0 || this.f10989z) {
            return -1;
        }
        int m28744a = m28744a(bArr, i, (int) Math.min(j, i2));
        this.f10988y -= m28744a;
        if (m28744a == 0) {
            this.f10989z = true;
            return 0;
        }
        return m28744a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m28740t() {
        return this.f10985A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final long m28739v() {
        return this.f10988y;
    }
}
