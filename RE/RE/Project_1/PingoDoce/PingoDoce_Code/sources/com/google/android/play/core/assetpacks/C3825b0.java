package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.b0 */
/* loaded from: classes.dex */
final class C3825b0 extends InputStream {

    /* renamed from: w */
    private final InputStream f10886w;

    /* renamed from: x */
    private long f10887x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3825b0(InputStream inputStream, long j) {
        this.f10886w = inputStream;
        this.f10887x = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f10886w.close();
        this.f10887x = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.f10887x;
        if (j <= 0) {
            return -1;
        }
        this.f10887x = j - 1;
        return this.f10886w.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f10887x;
        if (j <= 0) {
            return -1;
        }
        int read = this.f10886w.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f10887x -= read;
        }
        return read;
    }
}
