package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.assetpacks.u0 */
/* loaded from: classes.dex */
final class C3905u0 extends OutputStream {

    /* renamed from: A */
    private long f11173A;

    /* renamed from: B */
    private FileOutputStream f11174B;

    /* renamed from: C */
    private C3887p2 f11175C;

    /* renamed from: w */
    private final C3910v1 f11176w = new C3910v1();

    /* renamed from: x */
    private final File f11177x;

    /* renamed from: y */
    private final C3863j2 f11178y;

    /* renamed from: z */
    private long f11179z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3905u0(File file, C3863j2 c3863j2) {
        this.f11177x = file;
        this.f11178y = c3863j2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int min;
        while (i2 > 0) {
            if (this.f11179z == 0 && this.f11173A == 0) {
                int m28620b = this.f11176w.m28620b(bArr, i, i2);
                if (m28620b == -1) {
                    return;
                }
                i += m28620b;
                i2 -= m28620b;
                C3887p2 m28619c = this.f11176w.m28619c();
                this.f11175C = m28619c;
                if (m28619c.m28659h()) {
                    this.f11179z = 0L;
                    this.f11178y.m28703k(this.f11175C.m28658i(), this.f11175C.m28658i().length);
                    this.f11173A = this.f11175C.m28658i().length;
                } else if (!this.f11175C.m28664c() || this.f11175C.m28665b()) {
                    byte[] m28658i = this.f11175C.m28658i();
                    this.f11178y.m28703k(m28658i, m28658i.length);
                    this.f11179z = this.f11175C.m28662e();
                } else {
                    this.f11178y.m28708f(this.f11175C.m28658i());
                    File file = new File(this.f11177x, this.f11175C.m28663d());
                    file.getParentFile().mkdirs();
                    this.f11179z = this.f11175C.m28662e();
                    this.f11174B = new FileOutputStream(file);
                }
            }
            if (!this.f11175C.m28665b()) {
                if (this.f11175C.m28659h()) {
                    this.f11178y.m28711c(this.f11173A, bArr, i, i2);
                    this.f11173A += i2;
                    min = i2;
                } else if (this.f11175C.m28664c()) {
                    min = (int) Math.min(i2, this.f11179z);
                    this.f11174B.write(bArr, i, min);
                    long j = this.f11179z - min;
                    this.f11179z = j;
                    if (j == 0) {
                        this.f11174B.close();
                    }
                } else {
                    min = (int) Math.min(i2, this.f11179z);
                    this.f11178y.m28711c((this.f11175C.m28658i().length + this.f11175C.m28662e()) - this.f11179z, bArr, i, min);
                    this.f11179z -= min;
                }
                i += min;
                i2 -= min;
            }
        }
    }
}
